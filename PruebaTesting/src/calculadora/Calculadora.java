/**
 * 
 */
package calculadora;

import java.util.Iterator;

/**
 * @author David
 *
 */
public class Calculadora {

	float suma (float a, float b) {
		return a+b;
	}
	
	float divide (int a , int b) {
		//if (b==0) return 0;
		return a/b;
	}
	
	boolean esPar(int num) {
		if (num%3 ==0) {
			return true;
		} else {
			return false;
		}
	}
	
	String getEstadoIMC(float imc) {
		String diagnostico;
		if (imc < 18.5) {
			diagnostico = "Bajo peso";
		} else if (imc>=18.5 && imc <=24.9) {
			diagnostico= "Peso normal (saludable)";
		} else if (imc>=25 && imc <=29.9) {
			diagnostico= "Sobrepeso";
		} else if (imc>=30 && imc <=40) {
			diagnostico= "Obesidad premórbida";
		} else {
			diagnostico="Obesidad mórbida";
		}
		return diagnostico;
	}
	
	boolean esPrimo(int num) {
		for (int i=2; i<num;i++) {
			if (num%i==0) return false;
		}
		return true;
	}
	
	public long factorial(int n) {
        long producto=1;
        int i;
        for (i = 2; i <= n; i++) {
        	producto =producto* i;
        }
        return producto;
    }
	
	public void rotarDerecha(int v[]) {
		int aux = v[v.length-1];
		for (int i = v.length-1; i >=1; i--) {
			v[i]=v[i-1];
		}
		v[0]=aux;
	}
}
