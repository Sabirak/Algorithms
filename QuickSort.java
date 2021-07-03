import java.util.*;


class QuickSort{

    public void swap(int numArray[],int i,int j){

       int temp;
       temp=numArray[i];
       numArray[i]=numArray[j];
       numArray[j]=temp;
    }

    public int partitioning(int numArray[], int start,int end){

        QuickSort p = new QuickSort();
        int pivot = numArray[end];
        int i=start-1;
        for(int j=start;j<=end-1;j++){
            if(numArray[j]<pivot){
                i++;
                p.swap(numArray,i,j);
            }
        }

        swap(numArray,i+1,end);
        return i+1;
    }

    public void quickSort(int numArray[], int start, int end){

        if(start >= end){
            return;
        }
    
        int pivot;
        
        pivot=partitioning(numArray,start,end);
        quickSort(numArray,start,pivot-1);
        quickSort(numArray,pivot+1,end);
    }

    public static void main(String args[]){
        
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int [] numArray = new int[size];

    for(int i =0; i<size ; i++){
        numArray[i] = sc.nextInt();
    }

    QuickSort p = new QuickSort();
    p.quickSort(numArray,0,size-1);
    System.out.println("Array  :  ");
    for(int i =0; i<size ; i++){
        System.out.println(numArray[i]);
     }

     sc.close();
    }
    

}