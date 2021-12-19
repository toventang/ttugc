package com.p2082ss.android.medialib.model;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.medialib.model.Point */
public class Point {
    long left;
    long right;

    static {
        Covode.recordClassIndex(36487);
    }

    public long getLeft() {
        return this.left;
    }

    public long getRight() {
        return this.right;
    }

    public void setLeft(long j) {
        this.left = j;
    }

    public void setRight(long j) {
        this.right = j;
    }

    public Point(long j, long j2) {
        this.left = j;
        this.right = j2;
    }
}
