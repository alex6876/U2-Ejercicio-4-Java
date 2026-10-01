public class Main {
    public static void main(String[] args) {
        Libro libro = new Libro("El Principito", "Antoine de Saint-Exupery",
                true);
        Libro libro2 = new Libro("Don Quijote", "Miguel de Cervantes",
                false);
        Socio socio = new Socio("Alex", 001);

        Biblioteca biblioteca = new Biblioteca();

        System.out.println("=============== Prestamo 1 ===============");

        ComprobantePestamo comprobante1 = biblioteca.prestarLibro(libro,socio);

        if(comprobante1 != null){
            comprobante1.mostrar();
        }

        System.out.println("=============== Prestamo 2 ===============");
        ComprobantePestamo comprobante2 = biblioteca.prestarLibro(libro2, socio);
        if(comprobante2 == null){
            System.out.println("No se pudo realizar el comprobante pestamo");
        }
    }
}