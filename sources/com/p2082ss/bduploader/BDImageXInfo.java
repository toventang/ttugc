package com.p2082ss.bduploader;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.bduploader.BDImageXInfo */
public class BDImageXInfo {
    public String mEncryptionMeta;
    public long mErrorCode;
    public int mFileIndex = -1;
    public String mImageTosKey;
    public String mMetaInfo;
    public long mProgress;

    static {
        Covode.recordClassIndex(100781);
    }

    public BDImageXInfo(String str, long j, int i, String str2, String str3) {
        this.mImageTosKey = str;
        this.mProgress = j;
        this.mErrorCode = j;
        this.mFileIndex = i;
        this.mMetaInfo = str2;
        this.mEncryptionMeta = str3;
    }
}
