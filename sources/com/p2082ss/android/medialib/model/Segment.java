package com.p2082ss.android.medialib.model;

import com.bytedance.covode.number.Covode;
import java.util.List;

/* renamed from: com.ss.android.medialib.model.Segment */
public class Segment {
    String path;
    List<Point> points;
    int rotateAngle;
    float speed;

    static {
        Covode.recordClassIndex(36490);
    }

    public Segment() {
    }

    public String getPath() {
        return this.path;
    }

    public List<Point> getPoints() {
        return this.points;
    }

    public int getRotateAngle() {
        return this.rotateAngle;
    }

    public float getSpeed() {
        return this.speed;
    }

    public Point[] getPointsArray() {
        List<Point> list = this.points;
        if (list == null || list.isEmpty()) {
            return null;
        }
        Point[] pointArr = new Point[this.points.size()];
        this.points.toArray(pointArr);
        return pointArr;
    }

    public void setPath(String str) {
        this.path = str;
    }

    public void setPoints(List<Point> list) {
        this.points = list;
    }

    public void setRotateAngle(int i) {
        this.rotateAngle = i;
    }

    public void setSpeed(float f) {
        this.speed = f;
    }

    public Segment(String str, float f, List<Point> list, int i) {
        this.path = str;
        this.speed = f;
        this.points = list;
        this.rotateAngle = i;
    }
}
