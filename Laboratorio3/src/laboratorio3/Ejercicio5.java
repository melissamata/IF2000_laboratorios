/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio3;

/**
 *
 * @author melis
 */
public class Ejercicio5 {
    
    float celsius;
    float fahrenheit;
    
    public float fahrenheitACelsius(double temperatura){
        
    celsius = (float) ((5*(temperatura-32))/9);
    
    System.out.println("La temperatura fahrenheit de "+temperatura+"º a celsius es de "+celsius+"º");
    
    return celsius;
    }
    
    public float celsiusAFahrenheit(double temperatura){
        
    fahrenheit = (float) (((9*temperatura)/5)+32);
    
    System.out.println("La temperatura celsius de "+temperatura+"º a celsius es de "+fahrenheit+"º");
    
    return fahrenheit;
    }
    
    
    
    
}
