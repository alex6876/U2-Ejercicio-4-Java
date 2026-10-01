public class ComprobantePestamo {
   Libro libro;
   Socio socio;

   public ComprobantePestamo(Libro libro, Socio socio){
       this.libro = libro;
       this.socio = socio;
   }

   public void mostrar(){
       System.out.println("Prestamo exitoso");
       System.out.println("Socio: "+socio.nombre);
       System.out.println("Número de socio: "+socio.numeroSocio);
       System.out.println("Libro: "+libro.titulo);
       System.out.println("Autor: "+libro.autor);
   }
}
