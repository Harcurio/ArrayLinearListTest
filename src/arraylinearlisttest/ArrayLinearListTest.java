/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylinearlisttest;

/**
 *
 * @author johor
 */
public class ArrayLinearListTest {

    Object[] array;
    int size =5;
    
    public ArrayLinearListTest(){
    //inicializar el arreglo de objetos
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    public void compress(){
        //complegidad de la funcion O(s) | s es el size de los datos en el arreglo
        
        if(this.size >1){
        int aux=1;
        //inserte su algoritmo de compresion que regrese un valor a buscar 
        //en el arreglo, dado que no tenemos ese algoritmo optamos por 
        //tomar los valores pares de el arreglo
        for(int i=0; i< this.size;i++){
            
            if(2*i+2<this.size){
                this.array[i+1] = this.array[2*i+2];
                aux++;
            }
            //valida que 
            if(2*i+2>this.size && i<this.size-1)
                this.array[i+1]=null;
        }
        this.size = aux;
        
        
        }else{
            //la lista es de 1 elemento
         throw new IllegalArgumentException("the list can't be more compress!");
        }
    
    }
    
}
