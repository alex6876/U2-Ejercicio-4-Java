public class Biblioteca {
    Libro libro;

    public ComprobantePestamo prestarLibro(Libro libro, Socio socio){

        if(libro.disponibilidad){
            libro.disponibilidad = false;

            return new ComprobantePestamo(libro, socio);

        }else{
            System.out.println("Prestamo no disponible");
            return null;
        }

    }
}