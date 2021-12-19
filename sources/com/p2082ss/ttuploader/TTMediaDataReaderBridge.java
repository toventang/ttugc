package com.p2082ss.ttuploader;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.ttuploader.TTMediaDataReaderBridge */
public class TTMediaDataReaderBridge {
    static {
        Covode.recordClassIndex(101483);
    }

    /* renamed from: com_ss_ttuploader_TTMediaDataReaderBridge_com_ss_android_ugc_aweme_lancet_LogLancet_e */
    public static int m148559xfcb96f9f(String str, String str2) {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public int close(Object obj, int i) {
        if (obj != null && i >= 0) {
            return ((TTMediaDataReader) obj).close(i);
        }
        m148559xfcb96f9f("ttmn", "try to close fail");
        return 0;
    }

    /* access modifiers changed from: package-private */
    public int open(Object obj, int i) {
        if (obj != null) {
            return ((TTMediaDataReader) obj).open(i);
        }
        m148559xfcb96f9f("ttmn", "try to open failed");
        return 0;
    }

    /* access modifiers changed from: package-private */
    public long getValue(Object obj, int i, int i2) {
        if (obj != null) {
            return ((TTMediaDataReader) obj).getValue(i, i2);
        }
        m148559xfcb96f9f("ttmn", "try to get value fail");
        return -1;
    }

    /* access modifiers changed from: package-private */
    public int read(Object obj, int i, long j, byte[] bArr, int i2) {
        if (obj != null && bArr != null && i2 != 0) {
            return ((TTMediaDataReader) obj).read(i, j, bArr, i2);
        }
        m148559xfcb96f9f("ttmn", "try to read end fail");
        return 0;
    }
}
