import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido(a) a Mayeral Play");
        System.out.println("Pelicula: Matrix");

        boolean validacion = false;

        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = validacion;

        if (incluidoEnElPlan == true){
            System.out.println("Esta incluida en el plan");
        } else {
            System.out.println("No esta incluida en el plan");
        }
        int nota1DeLaPelicula = (9) + (3) + (4);
        double nota1Pelicula = nota1DeLaPelicula;
        int nota2DeLaPelicula = 5 + 7 + 9 ;
        double nota2Pelicula = nota2DeLaPelicula;
        int nota3DeLaPelicula = 7;
        double nota3Pelicula = nota3DeLaPelicula;
        int nota4DeLaPelicula = 1;
        double nota4Pelicula = nota4DeLaPelicula;
        double media = (nota1Pelicula + nota2Pelicula + nota3Pelicula + nota4Pelicula) / 4;
        System.out.println("Calificacion media " + media);

        String sinopsis = """
                Matrix es una paradoja
                La mejor pelicula del fin del milenio
                Fue lanzada en:
                """ + fechaDeLanzamiento ;
        System.out.println(sinopsis);

        String saludo = "Hola, esta pelicula es ";
        String pelicula = "Matrix, ";
        String textoPrecio = "para compra tiene un costo de ";
        String precio = "10$, ";
        String alquiler = "para alquiler un costo de ";
        String precioAlquiler = "3$ ";
        String textoDuracion = "y su duracion es de ";
        String duracion = "2 horas y 10 minutos ";
        String mensaje = saludo + pelicula + textoPrecio + precio + alquiler + precioAlquiler + textoDuracion + duracion + "¿desea comprar?";

        System.out.println(mensaje);

        String contraseña= "123456";
        if (contraseña.equals("123456")){
            System.out.println("Acceso autorizado!");
        } else {
            System.out.println("Contraseña incorrecta.");
        }
    }
}