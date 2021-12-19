package com.p2082ss.bduploader;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.bduploader.BDMediaDataReaderBridge */
public class BDMediaDataReaderBridge {
    static {
        Covode.recordClassIndex(100787);
    }

    /* renamed from: com_ss_bduploader_BDMediaDataReaderBridge_com_ss_android_ugc_aweme_lancet_LogLancet_e */
    public static int m147830x172694df(String str, String str2) {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public int close(Object obj, int i) {
        if (obj != null && i >= 0) {
            return ((BDMediaDataReader) obj).close(i);
        }
        m147830x172694df("ttmn", "try to close fail");
        return 0;
    }

    /* access modifiers changed from: package-private */
    public int open(Object obj, int i) {
        if (obj != null) {
            return ((BDMediaDataReader) obj).open(i);
        }
        m147830x172694df("ttmn", "try to open failed");
        return 0;
    }

    /* access modifiers changed from: package-private */
    public long getValue(Object obj, int i, int i2) {
        if (obj != null) {
            return ((BDMediaDataReader) obj).getValue(i, i2);
        }
        m147830x172694df("ttmn", "try to get value fail");
        return -1;
    }

    /* access modifiers changed from: package-private */
    public int read(Object obj, int i, long j, byte[] bArr, int i2) {
        if (obj != null && bArr != null && i2 != 0) {
            return ((BDMediaDataReader) obj).read(i, j, bArr, i2);
        }
        m147830x172694df("ttmn", "try to read end fail");
        return 0;
    }
}
