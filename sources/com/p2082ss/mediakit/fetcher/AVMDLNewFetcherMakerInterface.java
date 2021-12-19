package com.p2082ss.mediakit.fetcher;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.mediakit.fetcher.AVMDLNewFetcherMakerInterface */
public interface AVMDLNewFetcherMakerInterface {
    static {
        Covode.recordClassIndex(101198);
    }

    AVMDLURLFetcherInterface getFetcher(String str, String str2, String str3, String str4);
}
