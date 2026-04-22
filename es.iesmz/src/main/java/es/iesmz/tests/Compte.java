package es.iesmz.tests;

public class Compte {

    private String numeroCuenta;
    private String titular;

    public Compte(String numeroCuenta, String titular) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
    }

    // Método para comprobar IBAN
    public boolean compruebaIBAN(String iban) {
        if (iban == null || !iban.matches("[A-Z]{2}[0-9]{22}")) {
            return false;
        }

        String reformulado = iban.substring(4) + iban.substring(0, 4);

        StringBuilder numero = new StringBuilder();
        for (char c : reformulado.toCharArray()) {
            if (Character.isLetter(c)) {
                numero.append((int) c - 55);
            } else {
                numero.append(c);
            }
        }

        try {
            java.math.BigInteger bigInt = new java.math.BigInteger(numero.toString());
            return bigInt.mod(java.math.BigInteger.valueOf(97)).intValue() == 1;
        } catch (Exception e) {
            return false;
        }
    }

    // Método para generar IBAN
    public String generaIBAN(String entidad, String oficina, String dc, String cuenta) {

        // Validaciones
        if (!entidad.matches("\\d{4}") ||
                !oficina.matches("\\d{4}") ||
                !dc.matches("\\d{2}") ||
                !cuenta.matches("\\d{10}")) {
            return null;
        }

        String ccc = entidad + oficina + dc + cuenta;

        // añadir ES00 al final
        String base = ccc + "142800"; // E=14, S=28

        try {
            java.math.BigInteger numero = new java.math.BigInteger(base);
            int resto = numero.mod(java.math.BigInteger.valueOf(97)).intValue();

            int control = 98 - resto;

            String dcIBAN = (control < 10) ? "0" + control : String.valueOf(control);

            return "ES" + dcIBAN + ccc;

        } catch (Exception e) {
            return null;
        }
    }

}
