package com.p2082ss.android.ugc.aweme.p2929fe.method.upload.config;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.AbstractC34479a;
import com.p2082ss.android.ugc.aweme.base.api.AbstractC34486b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.fe.method.upload.config.UploadConfig */
public final class UploadConfig extends AbstractC34479a {
    @AbstractC34486b
    @AbstractC27891c(mo46611a = "appKey")
    private String appKey = "";
    @AbstractC34486b
    @AbstractC27891c(mo46611a = "authorization")
    private String authKey = "";
    @AbstractC27891c(mo46611a = "enableHttps")
    private int enableHttps;
    @AbstractC27891c(mo46611a = "fileRetryCount")
    private int fileRetryCount;
    @AbstractC34486b
    @AbstractC27891c(mo46611a = "imageHostName")
    private String imageHostName = "";
    @AbstractC27891c(mo46611a = "maxFailTime")
    private int maxFailTime;
    @AbstractC27891c(mo46611a = "maxFileSize")
    private int maxFileSize;
    @AbstractC27891c(mo46611a = "sliceRetryCount")
    private int sliceRetryCount;
    @AbstractC27891c(mo46611a = "sliceSize")
    private int sliceSize;
    @AbstractC27891c(mo46611a = "sliceTimeout")
    private int sliceTimeout;
    @AbstractC27891c(mo46611a = "socketNumber")
    private int socketNumber;
    @AbstractC34486b
    @AbstractC27891c(mo46611a = "videoHostName")
    private String videoHostName = "";

    static {
        Covode.recordClassIndex(56702);
    }

    public final String getAppKey() {
        return this.appKey;
    }

    public final String getAuthKey() {
        return this.authKey;
    }

    public final int getEnableHttps() {
        return this.enableHttps;
    }

    public final int getFileRetryCount() {
        return this.fileRetryCount;
    }

    public final String getImageHostName() {
        return this.imageHostName;
    }

    public final int getMaxFailTime() {
        return this.maxFailTime;
    }

    public final int getMaxFileSize() {
        return this.maxFileSize;
    }

    public final int getSliceRetryCount() {
        return this.sliceRetryCount;
    }

    public final int getSliceSize() {
        return this.sliceSize;
    }

    public final int getSliceTimeout() {
        return this.sliceTimeout;
    }

    public final int getSocketNumber() {
        return this.socketNumber;
    }

    public final String getVideoHostName() {
        return this.videoHostName;
    }

    public final void setEnableHttps(int i) {
        this.enableHttps = i;
    }

    public final void setFileRetryCount(int i) {
        this.fileRetryCount = i;
    }

    public final void setImageHostName(String str) {
        this.imageHostName = str;
    }

    public final void setMaxFailTime(int i) {
        this.maxFailTime = i;
    }

    public final void setMaxFileSize(int i) {
        this.maxFileSize = i;
    }

    public final void setSliceRetryCount(int i) {
        this.sliceRetryCount = i;
    }

    public final void setSliceSize(int i) {
        this.sliceSize = i;
    }

    public final void setSliceTimeout(int i) {
        this.sliceTimeout = i;
    }

    public final void setSocketNumber(int i) {
        this.socketNumber = i;
    }

    public final void setVideoHostName(String str) {
        this.videoHostName = str;
    }

    public final void setAppKey(String str) {
        C89219l.m154721d(str, "");
        this.appKey = str;
    }

    public final void setAuthKey(String str) {
        C89219l.m154721d(str, "");
        this.authKey = str;
    }
}
