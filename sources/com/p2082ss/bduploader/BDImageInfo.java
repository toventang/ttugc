package com.p2082ss.bduploader;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.bduploader.BDImageInfo */
public class BDImageInfo {
    public String mEncryptionMeta;
    public long mErrorCode;
    public String mErrorMsg;
    public int mFileIndex = -1;
    public String mImageTosKey;
    public String mMetaInfo;
    public long mProgress;

    static {
        Covode.recordClassIndex(100777);
    }

    public BDImageInfo(String str, long j, String str2, int i, String str3, String str4) {
        this.mImageTosKey = str;
        this.mProgress = j;
        this.mErrorCode = j;
        this.mErrorMsg = str2;
        this.mFileIndex = i;
        this.mMetaInfo = str3;
        this.mEncryptionMeta = str4;
    }
}
