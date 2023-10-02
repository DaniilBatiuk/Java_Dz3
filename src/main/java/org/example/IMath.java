package org.example;

interface IMath {
    int Max();
    int Min();
    float Avg();
}

class Array implements IMath {
    private int[] elements;

    public Array(int[] elements) {
        this.elements = elements;
    }

    @Override
    public int Max() {
        int max = elements[0];
        for (int element : elements) {
            if (element > max) {
                max = element;
            }
        }
        return max;
    }

    @Override
    public int Min() {
        int min = elements[0];
        for (int element : elements) {
            if (element < min) {
                min = element;
            }
        }
        return min;
    }

    @Override
    public float Avg() {
        int sum = 0;
        for (int element : elements) {
            sum += element;
        }
        return (float) sum / elements.length;
    }
}
