package com.p2082ss.android.medialib.model;

import android.graphics.PointF;
import android.graphics.Rect;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.medialib.model.FaceDetect */
public class FaceDetect {
    private int action;
    private float eyeDistance;
    private FaceExtInfo faceExtInfo;
    private int faceID;
    private float pitch;
    private float[] pointVisibility;
    private PointF[] points;
    private Rect rect;
    private float roll;
    private float score;
    private int trackCount;
    private float yaw;

    /* renamed from: com.ss.android.medialib.model.FaceDetect$FaceExtInfo */
    public static class FaceExtInfo {
        public PointF[] eyeBrowLeftPoints;
        public PointF[] eyeBrowRightPoints;
        public int eyeCount;
        public PointF[] eyeLeftPoints;
        public PointF[] eyeRightPoints;
        public int eyebrowCount;
        public int irisCount;
        public PointF[] irisLeftPoints;
        public PointF[] irisRightPoints;
        public int lipCount;
        public PointF[] lipPoints;

        static {
            Covode.recordClassIndex(36485);
        }
    }

    static {
        Covode.recordClassIndex(36484);
    }

    public int getAction() {
        return this.action;
    }

    public float getEyeDistance() {
        return this.eyeDistance;
    }

    public FaceExtInfo getFaceExtInfo() {
        return this.faceExtInfo;
    }

    public int getFaceID() {
        return this.faceID;
    }

    public float getPitch() {
        return this.pitch;
    }

    public float[] getPointVisibility() {
        return this.pointVisibility;
    }

    public PointF[] getPoints() {
        return this.points;
    }

    public Rect getRect() {
        return this.rect;
    }

    public float getRoll() {
        return this.roll;
    }

    public float getScore() {
        return this.score;
    }

    public int getTrackCount() {
        return this.trackCount;
    }

    public float getYaw() {
        return this.yaw;
    }

    public void setAction(int i) {
        this.action = i;
    }

    public void setEyeDistance(float f) {
        this.eyeDistance = f;
    }

    public void setFaceExtInfo(FaceExtInfo faceExtInfo2) {
        this.faceExtInfo = faceExtInfo2;
    }

    public void setFaceID(int i) {
        this.faceID = i;
    }

    public void setPitch(float f) {
        this.pitch = f;
    }

    public void setPointVisibility(float[] fArr) {
        this.pointVisibility = fArr;
    }

    public void setPoints(PointF[] pointFArr) {
        this.points = pointFArr;
    }

    public void setRect(Rect rect2) {
        this.rect = rect2;
    }

    public void setRoll(float f) {
        this.roll = f;
    }

    public void setScore(float f) {
        this.score = f;
    }

    public void setTrackCount(int i) {
        this.trackCount = i;
    }

    public void setYaw(float f) {
        this.yaw = f;
    }
}
