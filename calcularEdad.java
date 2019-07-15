import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Calendar;


 
public class calcularEdad {
 
	public static void main(String[] args) throws IOException {
		FileWriter flwriter = null;
                int miaño;
                int mimes;
                int midia;
                int edad;
                Scanner teclado = new Scanner(System.in);
                System.out.print("Introduzca su año de nacimiento: ");
                miaño = teclado.nextInt();
                System.out.print("Introduzca su mes de nacimiento: ");
                mimes = teclado.nextInt();
                System.out.print("Introduzca su día de nacimiento: ");
                midia = teclado.nextInt();
		edad = calcularEdad(miaño,mimes,midia);
                flwriter = new FileWriter("C:\\Cursos\\archivo.txt");
                flwriter.write("Tu edad es: " + Integer.toString(edad));
                flwriter.close();
                        
	}
 
    public static int calcularEdad(int a, int m, int d) {
        Calendar fechaActual = Calendar.getInstance();
        int años = fechaActual.get(Calendar.YEAR) - a;
        int meses = fechaActual.get(Calendar.MONTH) - m;
        int dias = fechaActual.get(Calendar.DAY_OF_MONTH) - d;
 
        
        if(meses < 0 // Aún no es el mes de su cumpleaños
           || (meses==0 && dias < 0)) { // o es el mes pero no ha llegado el día.
            años--;
        }
        return años;
    }
}
