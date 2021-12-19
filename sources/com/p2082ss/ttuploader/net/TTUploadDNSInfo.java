package com.p2082ss.ttuploader.net;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.ttuploader.net.TTUploadDNSInfo */
public class TTUploadDNSInfo {
    public Error mErr;
    public String mErrorStr;
    public long mExpiredTime;
    public String mExtraInfo;
    public String mHost;
    public String mId;
    public String mIpList;
    public int mType;

    static {
        Covode.recordClassIndex(101516);
    }

    public TTUploadDNSInfo(int i, String str, String str2, long j, String str3) {
        this.mType = i;
        this.mHost = str;
        this.mIpList = str2;
        this.mExpiredTime = j;
        this.mId = str3;
    }

    public TTUploadDNSInfo(int i, String str, String str2, long j, String str3, String str4) {
        this.mType = i;
        this.mHost = str;
        this.mIpList = str2;
        this.mExpiredTime = j;
        this.mId = str3;
        this.mErrorStr = str4;
    }
}
