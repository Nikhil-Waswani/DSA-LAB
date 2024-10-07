class lab7Ex2{

    void merge(int[] arr, int left, int mid, int right){
        int l[] = new int[mid-left+1];
        int r[] = new int[right-mid];

        for(int i=0; i<l.length; i++){
            l[i] = arr[left+i];
        }
        for(int i=0; i<r.length; i++){
            r[i] = arr[mid+1+i];
        }

        int a=0,b=0,c=left;

        while(a < l.length && b < r.length){
            if(l[a] < r[b]){
                arr[c] = l[a];
                a++;
            }
            else{
                arr[c] = r[b];
                b++;
            }
            c++;
        }

        while(a < l.length){
            arr[c] = l[a];
            c++;
            a++;
        }

        while(b < r.length){
            arr[c] = r[b];
            c++;
            b++;
        }
    }

    void mergeSort(int arr[], int left, int right){
        if(left < right){
            int mid = (left+right)/2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid+1, right);
            merge(arr, left,mid, right);
        }
    }
    public static void main(String[] args){
        lab7Ex2 lab = new lab7Ex2();
        int arr[] = {38,27,43,3,9,82,10};

        lab.mergeSort(arr, 0 , arr.length-1);

        for(int i : arr){
            System.out.print(i + " ");
        }   
    }    
}
