package com.example.my4application;

public class MyFirst {
    private int limit;

    public MyFirst(int limit) {
        setLimit(limit);
    }

    public void setLimit(int limit) {
        this.limit = limit >= 0 ? limit : -limit;
    }

    public String getNumbers() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < limit; i++) {
            sb.append(i);
            if (i < limit - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }
}
