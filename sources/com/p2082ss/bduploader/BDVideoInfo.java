package com.p2082ss.bduploader;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* renamed from: com.ss.bduploader.BDVideoInfo */
public class BDVideoInfo {
    public String mCoverUri;
    public String mEncryptionMeta;
    public long mErrorCode;
    public String mErrorMsg;
    public JSONObject mLog;
    public long mProgress;
    public String mTosKey;
    public String mVideoId;
    public String mVideoMediaInfo;

    static {
        Covode.recordClassIndex(100804);
    }

    public BDVideoInfo(String str, String str2, long j, String str3, String str4, String str5, String str6) {
        this.mVideoId = str;
        this.mCoverUri = str2;
        this.mProgress = j;
        this.mErrorCode = j;
        this.mErrorMsg = str3;
        this.mTosKey = str4;
        this.mVideoMediaInfo = str5;
        this.mEncryptionMeta = str6;
    }
}
