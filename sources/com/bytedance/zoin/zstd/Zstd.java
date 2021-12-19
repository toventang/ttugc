package com.bytedance.zoin.zstd;

import com.bytedance.covode.number.Covode;
import com.bytedance.zoin.zstd.p1792a.C23756a;

public class Zstd {
    public static native long getErrorCode(long j);

    public static native String getErrorName(long j);

    public static native boolean isError(long j);

    public static native int loadDictDecompress(long j, byte[] bArr, int i);

    public static native int loadFastDictDecompress(long j, ZstdDictDecompress zstdDictDecompress);

    static {
        Covode.recordClassIndex(27860);
        C23756a.m44905a();
    }
}
