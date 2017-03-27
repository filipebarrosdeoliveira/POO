/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package somamatriz;
import javax.swing.JOptionPane; 
/**
 *
 * @author FilipeBarros
 */
public class SomaMatriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
            
        int matrizA [][] = new int[5][3];    
        int matrizB [][] = new int [5][3];  
        int matrizC [][] = new int [5][3];  
          
        int soma = 0;    
    
          
            for (int i = 0; i < matrizA.length; i++)  {    
                for (int j = 0; j < matrizA.length; j++) {  
    }  
}     
                    for (int i = 0; i < matrizB.length; i++)  {    
                        for (int j = 0; j < matrizB.length; j++) {                 
        matrizC<i>[j]=Integer.parseInt(JOptionPane.showInputDialog("Digite os numeros da "+(i+1)+"ª linha e da "+(j+1)+"ª coluna "<img src="http://javafree.uol.com.br/forum/images/smiles/icon_wink.gif">;    
            matrizC<i>[j] = matrizA<i>[j] +matrizB<i>[j];  
    }    
}    
           
            for (i = 0; i < matrizC.length; i ++) {    
                for (j = 0; j < matrizC.length; j++) {    
                    soma += matrizC<i>[j];    
    }    
}    
  JOptionPane.showMessageDialog(null,"A soma da matriz A mais Matriz B é: " + soma);    
    }  
}  
       
    }
    
}
 
  
}
}
