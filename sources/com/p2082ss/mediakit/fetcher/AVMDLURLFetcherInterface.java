package com.p2082ss.mediakit.fetcher;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.mediakit.fetcher.AVMDLURLFetcherInterface */
public interface AVMDLURLFetcherInterface {
    static {
        Covode.recordClassIndex(101200);
    }

    void close();

    String[] getURLs();

    int start(String str, String str2, String str3, AVMDLURLFetcherListener aVMDLURLFetcherListener);
}
