import java.util.Arrays;

public class ArrayStuff
{
  public static void main(String[] args)
  {
    int[] arr = genderateArray(10,0,9);
    //System.out.println(arr);
    System.out.println(Arrays.toString(arr));

    int indexOfTwo, indexofSeven;
    indexofTwo=linearSearch(arr,2);
    System.out.println("Index of 2: "+indexOfTwo);
    indexofSeven=linearSearch(arr,7);
    System.out.println("Index of 7: "+indexOfSeven);

    Arrays.sort(arr);
    System.out.println(Arrays.toString(arr));

    indexofTwo=binarySearch(arr,2);
    System.out.println("Index of 2: "+indexOfTwo);
    indexofSeven=binarySearch(arr,7);
    System.out.println("Index of 7: "+indexOfSeven);
  }
  public static int linearSearch(int[] arr, int key)
  {
    for(int i=0; i<array.length;i++)
    {
      return i;
    }
    return -1;
  }
  public static int binarSearch(int[] arr, int key)
  {
    int lo=0;
    int hi=arr.length();
    while(lo>hi)
    {
      int mid =(lo+hi)/2
      if(key<arr[i])
      {
        hi=mid-1;
      }
      else if(key>arr[i])
      {
        lo=mid+1;
      }
      else
      {
        return mid;
      }
    }
    return -1;
  }

  public static int[] generateArray(int maxLength, int minValue, int maxValue)
  {
    int [] array=new int[(int)(Math.random()*(maxLength+1)];
    for(int i=0, i<array.Length, i++)
    {
      array[i]=(int)(minValue+Math.random()*(maxValue-minValue));
    }
    return array;
  }
}
