package generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CustomArrayList<T extends Number> {
    
        private Object[] data;
        private static int DEFAULT_SIZE = 10;
        private int size = 0;

        public CustomArrayList()
        {
            this.data = new Object[DEFAULT_SIZE];
        }

        public void getList(List< ? extends Number> list)
        {

        }

        public void add(T num)
        {
            if(isFull())
            {
                resize();
            }

            data[size++] = num;
        }

        private void resize()
        {
            Object[] temp = new Object[data.length * 2];
            //copy
            for(int i = 0 ; i < data.length ; i++)
            {
                temp[i] = data[i];
            }
            data = temp;
        }

        private boolean isFull()
        {
            return size == data.length;
        }

        public T remove()
        {
            T removed_item = (T)(data[--size]);
            return removed_item;
        }

        public T get(int index)
        {
            return (T)data[index];
        }

        public int size()
        {
            return size;
        }

        public void set(int index , T value)
        {
            data[index] = value;
        }

    @Override
        public String toString() {
            return "CustomArrayList [data=" + Arrays.toString(data) + ", size=" + size + "]";
        }

    public static void main(String[] args) {
        
        CustomArrayList<Integer> list = new CustomArrayList();
        list.add(2);

        System.out.println(list);
        

    }
}
