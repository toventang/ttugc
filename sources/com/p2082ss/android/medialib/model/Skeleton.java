package com.p2082ss.android.medialib.model;

import android.graphics.PointF;
import android.graphics.RectF;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.medialib.model.Skeleton */
public class Skeleton {

    /* renamed from: ID */
    private int f71629ID;
    private PointF[] points;
    private RectF rect;

    static {
        Covode.recordClassIndex(36491);
    }

    public int getID() {
        return this.f71629ID;
    }

    public PointF[] getPoints() {
        return this.points;
    }

    public RectF getRect() {
        return this.rect;
    }

    public void setID(int i) {
        this.f71629ID = i;
    }

    public void setPoints(PointF[] pointFArr) {
        this.points = pointFArr;
    }

    public void setRect(RectF rectF) {
        this.rect = rectF;
    }
}
