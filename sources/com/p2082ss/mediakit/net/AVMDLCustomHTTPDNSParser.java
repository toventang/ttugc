package com.p2082ss.mediakit.net;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.mediakit.net.AVMDLCustomHTTPDNSParser */
public interface AVMDLCustomHTTPDNSParser {
    static {
        Covode.recordClassIndex(101217);
    }

    AVMDLCustomHTTPDNSParserResult parseHost(String str);
}
