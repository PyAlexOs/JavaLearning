package practice_17_24.practice_21.task_2;

import java.util.Arrays;

public class universalArray<T>{
    private int filled;
    private T[] array;

    universalArray(int size){
        if (size <= 0){
            throw new IllegalArgumentException("Array size must be greater than zero.");
        }
        this.filled = 0;
        this.array = (T[]) new Object[size];
        for (T element : this.array){
            element = null;
        }
    }

    universalArray(int size, T initialValue){
        if (size <= 0){
            throw new IllegalArgumentException("Array size must be greater than zero.");
        }
        this.filled = size;
        this.array = (T[]) new Object[size];
        for (int i = 0; i < size; ++i){
            array[i] = initialValue;
        }
    }

    universalArray(T[] initialArray){
        this.filled = initialArray.length;
        this.array = Arrays.copyOf(initialArray, initialArray.length);
    }

    public int size(){
        return this.array.length;
    }

    public void add(T element){
        if (this.filled == array.length){
            this.array = Arrays.copyOf(this.array, this.array.length + 1);
        }
        this.array[filled++] = element;
    }

    public T At(int index){
        if (filled <= index || index < -filled){
            throw new ArrayIndexOutOfBoundsException("Index out of bounds. Array size: " + this.filled);
        }

        if (index < 0){
            index = this.filled + index;
        }

        return this.array[index];
    }

    @Override
    public String toString(){
        return Arrays.toString(array);
    }
}
