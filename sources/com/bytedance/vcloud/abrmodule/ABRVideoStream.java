package com.bytedance.vcloud.abrmodule;

import com.bytedance.covode.number.Covode;

public class ABRVideoStream implements IVideoStream {
    public int mBandWidth;
    private String mCodec;
    private int mFrameRate;
    private int mHeight;
    private int mResolution;
    private int mSegmentDuration;
    private String mStreamId = "";
    private int mSupportSR;
    private int mWidth;

    static {
        Covode.recordClassIndex(27585);
    }

    @Override // com.bytedance.vcloud.abrmodule.IVideoStream
    public float getFrameRate() {
        return (float) this.mFrameRate;
    }

    @Override // com.bytedance.vcloud.abrmodule.IStream
    public int getBandwidth() {
        return this.mBandWidth;
    }

    @Override // com.bytedance.vcloud.abrmodule.IStream
    public String getCodec() {
        return this.mCodec;
    }

    @Override // com.bytedance.vcloud.abrmodule.IVideoStream
    public int getHeight() {
        return this.mHeight;
    }

    @Override // com.bytedance.vcloud.abrmodule.IVideoStream
    public int getResolution() {
        return this.mResolution;
    }

    @Override // com.bytedance.vcloud.abrmodule.IStream
    public int getSegmentDuration() {
        return this.mSegmentDuration;
    }

    @Override // com.bytedance.vcloud.abrmodule.IStream
    public String getStreamId() {
        return this.mStreamId;
    }

    @Override // com.bytedance.vcloud.abrmodule.IVideoStream
    public int getSupportSR() {
        return this.mSupportSR;
    }

    @Override // com.bytedance.vcloud.abrmodule.IVideoStream
    public int getWidth() {
        return this.mWidth;
    }

    public void setBandWidth(int i) {
        this.mBandWidth = i;
    }

    public void setCodec(String str) {
        this.mCodec = str;
    }

    public void setFrameRate(int i) {
        this.mFrameRate = i;
    }

    public void setHeight(int i) {
        this.mHeight = i;
    }

    public void setResolution(int i) {
        this.mResolution = i;
    }

    public void setSegmentDuration(int i) {
        this.mSegmentDuration = i;
    }

    public void setStreamId(String str) {
        this.mStreamId = str;
    }

    public void setSupportSR(int i) {
        this.mSupportSR = i;
    }

    public void setWidth(int i) {
        this.mWidth = i;
    }
}
