/**
 * 
 */
package programacionFuncinalMayor10;

import java.util.List;

/**
 * @author Sergio
 *
 */
public class Numeros {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List<Integer> numeros = List.of(22,7,9,20,70,5,99);

		Long orden = numeros.stream().filter(num->num>10).count();
		System.out.println(orden);

	}

}
