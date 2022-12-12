/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numerosprimos;

/**
 *
 * @author LuisD
 */
public class NumerosPrimos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int primos = 0;
        int num= 2; //PRIMER NUMERO PRIMO
        while (primos < 9) {
            int div = 1; //ES DIVISIBLE ENTRE 1
            for (int i = 2; i <= num; i++) { //INICIA EN EL PRIMER NUMERO PRIMO
                if(num%i == 0)
                    div++; 
            }
            if (div == 2) { //SOLO ES DIVISIBLE ENTRE 2 NUMEROS
                System.out.println(num);
                primos++;
            }
            num++;
        }
    }
    
}
