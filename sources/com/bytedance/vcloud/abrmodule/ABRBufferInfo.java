package com.bytedance.vcloud.abrmodule;

import com.bytedance.covode.number.Covode;

public class ABRBufferInfo implements IBufferInfo {
    private long mFileAvailSize = -1;
    private long mHeadSize = -1;
    private float mPlayerAvailDuration = -1.0f;
    private String mStreamId = "";

    static {
        Covode.recordClassIndex(27577);
    }

    @Override // com.bytedance.vcloud.abrmodule.IBufferInfo
    public long getFileAvailSize() {
        return this.mFileAvailSize;
    }

    @Override // com.bytedance.vcloud.abrmodule.IBufferInfo
    public long getHeadSize() {
        return this.mHeadSize;
    }

    @Override // com.bytedance.vcloud.abrmodule.IBufferInfo
    public float getPlayerAvailDuration() {
        return this.mPlayerAvailDuration;
    }

    @Override // com.bytedance.vcloud.abrmodule.IBufferInfo
    public String getStreamId() {
        return this.mStreamId;
    }

    public void setFileAvailSize(long j) {
        this.mFileAvailSize = j;
    }

    public void setHeadSize(long j) {
        this.mHeadSize = j;
    }

    public void setPlayerAvailDuration(float f) {
        this.mPlayerAvailDuration = f;
    }

    public void setStreamId(String str) {
        this.mStreamId = str;
    }
}
