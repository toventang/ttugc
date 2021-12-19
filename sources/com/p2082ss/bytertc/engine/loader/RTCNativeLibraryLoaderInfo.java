package com.p2082ss.bytertc.engine.loader;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.bytertc.engine.loader.RTCNativeLibraryLoaderInfo */
public class RTCNativeLibraryLoaderInfo {
    private boolean mIsLoadSuccess = false;
    private Long mLoadTimeStamp = 0L;
    private int mLoadTimes = 0;
    private String mLoaderClassName = "";
    private String mSdkVersion = "";

    static {
        Covode.recordClassIndex(101108);
    }

    public String getLoaderClassName() {
        return this.mLoaderClassName;
    }

    public String getSdkVersion() {
        return this.mSdkVersion;
    }

    public boolean isLoadSuccess() {
        return this.mIsLoadSuccess;
    }

    public long getLoadTimeStamp() {
        return this.mLoadTimeStamp.longValue();
    }

    public void loadLibrary() {
        this.mLoadTimes++;
    }

    public String toString() {
        return "RTCNativeLibraryLoaderInfo{SdkVersion='" + this.mSdkVersion + '\'' + ", LoadTimeStamp=" + this.mLoadTimeStamp + ", LoaderClassName='" + this.mLoaderClassName + '\'' + ", LoadTimes=" + this.mLoadTimes + ", IsLoadSuccess=" + this.mIsLoadSuccess + '}';
    }

    public void setLoadResult(boolean z) {
        this.mIsLoadSuccess = z;
    }

    public void setLoaderClassName(String str) {
        this.mLoaderClassName = str;
    }

    public void setSdkVersion(String str) {
        this.mSdkVersion = str;
    }

    public void setLoadTimeStamp(long j) {
        this.mLoadTimeStamp = Long.valueOf(j);
    }
}
