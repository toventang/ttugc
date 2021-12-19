package com.p2082ss.mediakit.net;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.mediakit.net.AVMDLCustomHTTPDNSParserResult */
public class AVMDLCustomHTTPDNSParserResult {
    public String mHostName;
    public String mIPList;
    public long mTTL;

    static {
        Covode.recordClassIndex(101218);
    }

    public AVMDLCustomHTTPDNSParserResult(String str, String str2, int i) {
        this.mHostName = str;
        this.mIPList = str2;
        this.mTTL = (long) i;
    }
}
