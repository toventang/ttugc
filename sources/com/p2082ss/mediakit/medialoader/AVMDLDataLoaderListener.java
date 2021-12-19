package com.p2082ss.mediakit.medialoader;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.mediakit.medialoader.AVMDLDataLoaderListener */
public interface AVMDLDataLoaderListener {
    static {
        Covode.recordClassIndex(101209);
    }

    String getCheckSumInfo(String str);

    long getInt64Value(int i, long j);

    String getStringValue(int i, long j, String str);

    void onNotify(AVMDLDataLoaderNotifyInfo aVMDLDataLoaderNotifyInfo);
}
