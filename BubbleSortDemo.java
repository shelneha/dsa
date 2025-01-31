public class BubbleSortDemo {
	
    public static void display(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        
        System.out.println(); 
    }

   
    public static void bubbleSort(int a[]) {
        for (int i = 0; i < a.length - 1; i++) { 
            for (int j = 0; j < a.length - i - 1; j++) { 
                if (a[j] > a[j + 1]) { 
                   
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }

   
	

	public static void main(String[] args) {
		int a[] = {64, 34, 25, 12, 22, 11, 90}; 

        System.out.println("Array before sorting:");
        display(a); 

        bubbleSort(a); 

        System.out.println("Array after sorting:");
        display(a); 
		

	}

}
