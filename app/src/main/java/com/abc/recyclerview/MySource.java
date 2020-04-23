package com.abc.recyclerview;

public class MySource extends Source {
    public MySource(String title, int image) {
        super(title, image);
    }

    @Override
    public String getTitle() {
        return super.getTitle() + " Diana";
    }
}
