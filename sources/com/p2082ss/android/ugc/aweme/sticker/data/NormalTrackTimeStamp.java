package com.p2082ss.android.ugc.aweme.sticker.data;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp */
public class NormalTrackTimeStamp extends BaseTrackTimeStamp {
    @AbstractC27891c(mo46611a = "end_time")
    private float endTime = -1.0f;
    @AbstractC27891c(mo46611a = "h")
    private float height;
    @AbstractC27891c(mo46611a = "r")
    private float rotation;
    private Float scale;
    @AbstractC27891c(mo46611a = "s")
    private Float scaleForIos;
    @AbstractC27891c(mo46611a = "start_time")
    private float startTime = -1.0f;
    @AbstractC27891c(mo46611a = "w")
    private float width;

    /* renamed from: x */
    private float f169299x;

    /* renamed from: y */
    private float f169300y;

    static {
        Covode.recordClassIndex(88216);
    }

    public float getEndTime() {
        return this.endTime;
    }

    public float getHeight() {
        return this.height;
    }

    public float getRotation() {
        return this.rotation;
    }

    public Float getScaleForIos() {
        return this.scaleForIos;
    }

    public float getStartTime() {
        return this.startTime;
    }

    public float getWidth() {
        return this.width;
    }

    public float getX() {
        return this.f169299x;
    }

    public float getY() {
        return this.f169300y;
    }

    public NormalTrackTimeStamp() {
    }

    public boolean isWholeDuration() {
        if (!timeIsValid()) {
            return true;
        }
        return false;
    }

    public Float getScale() {
        Float f = this.scale;
        if (f != null) {
            return f;
        }
        Float f2 = this.scaleForIos;
        if (f2 != null) {
            return f2;
        }
        return Float.valueOf(1.0f);
    }

    public boolean timeIsValid() {
        float f = this.startTime;
        if (f < 0.0f) {
            return false;
        }
        float f2 = this.endTime;
        if (f2 <= 0.0f || f > f2) {
            return false;
        }
        return true;
    }

    public void setEndTime(float f) {
        this.endTime = f;
    }

    public void setHeight(float f) {
        this.height = f;
    }

    public void setRotation(float f) {
        this.rotation = f;
    }

    public void setScale(Float f) {
        this.scaleForIos = f;
    }

    public void setScaleForIos(Float f) {
        this.scaleForIos = f;
    }

    public void setStartTime(float f) {
        this.startTime = f;
    }

    public void setWidth(float f) {
        this.width = f;
    }

    public void setX(float f) {
        this.f169299x = f;
    }

    public void setY(float f) {
        this.f169300y = f;
    }

    public NormalTrackTimeStamp(int i) {
        super(i);
    }
}
