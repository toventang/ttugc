package com.p2082ss.mediakit.fetcher;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.mediakit.fetcher.AVMDLURLFetcherListener */
public interface AVMDLURLFetcherListener {
    static {
        Covode.recordClassIndex(101201);
    }

    void onCompletion(int i, String str, String str2, String[] strArr);
}
