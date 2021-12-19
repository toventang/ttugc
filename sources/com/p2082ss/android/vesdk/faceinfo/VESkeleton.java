package com.p2082ss.android.vesdk.faceinfo;

import android.graphics.PointF;
import android.graphics.RectF;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.vesdk.faceinfo.VESkeleton */
public class VESkeleton {

    /* renamed from: ID */
    private int f191403ID;
    private PointF[] points;
    private RectF rect;

    static {
        Covode.recordClassIndex(99591);
    }

    public int getID() {
        return this.f191403ID;
    }

    public PointF[] getPoints() {
        return this.points;
    }

    public RectF getRect() {
        return this.rect;
    }

    public void setID(int i) {
        this.f191403ID = i;
    }

    public void setPoints(PointF[] pointFArr) {
        this.points = pointFArr;
    }

    public void setRect(RectF rectF) {
        this.rect = rectF;
    }
}
