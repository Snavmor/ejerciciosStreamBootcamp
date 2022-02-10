package vehiculo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Principal {

	public static void main(String[] args) {
	    List<Vehiculo> vehiculos = new ArrayList<>();
        vehiculos.add(new Vehiculo("1111AAA", Modelo.BMW, 10000));
        vehiculos.add(new Vehiculo("2222BBB", Modelo.AUDI, 20000));
        vehiculos.add(new Vehiculo("3333CCC", Modelo.OPEL, 30000));
        vehiculos.add(new Vehiculo("4444DDD", Modelo.BMW, 100000));
        vehiculos.add(new Vehiculo("5555EEE", Modelo.AUDI, 200000));
        vehiculos.add(new Vehiculo("6666FFF", Modelo.OPEL, 300000));
        vehiculos.add(new Vehiculo("7777GGG", Modelo.CITROEN, 0));
        
        List<Integer> result = vehiculos.stream()
                .map(v -> v.getKilometros()*2)
                .collect(Collectors.toList());
        
        List<Integer> result2 = vehiculos.stream()
                .map(Vehiculo::getKilometros)
                .collect(Collectors.toList());
        
        List<Vehiculo> result3 = vehiculos.stream()
                .filter(v -> v.getModelo().equals(Modelo.AUDI))
                .collect(Collectors.toList());
        
        vehiculos.parallelStream()
        .limit(5)
        .forEach(System.out::println);
 

	}

}
