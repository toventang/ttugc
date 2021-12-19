package com.p2082ss.mediakit.fetcher;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.mediakit.fetcher.AVMDLFetcherMakerInterface */
public interface AVMDLFetcherMakerInterface {
    static {
        Covode.recordClassIndex(101197);
    }

    AVMDLURLFetcherInterface getFetcher(String str, String str2, String str3);
}
