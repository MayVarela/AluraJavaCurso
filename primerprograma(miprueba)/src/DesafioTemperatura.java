public class DesafioTemperatura {
    public static void main(String[] args) {
        double temperaturaEnCelsius= 25.6;
        double temperaturaEnFahrenheit = (temperaturaEnCelsius * 1.8) + 32;

        int temperaturaEnFahrenheitEntero = (int) temperaturaEnFahrenheit;

        String mensaje = String.format("La temperatura de %f Celsius es equivalente a %f Fahrenheit, que en numero entero es :" + temperaturaEnFahrenheitEntero, temperaturaEnCelsius, temperaturaEnFahrenheit);

        System.out.println(mensaje);
    }
}
