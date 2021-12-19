package com.p2082ss.ttuploader;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.ttuploader.TTExternFileReaderBridge */
public class TTExternFileReaderBridge {
    static {
        Covode.recordClassIndex(101468);
    }

    /* renamed from: com_ss_ttuploader_TTExternFileReaderBridge_com_ss_android_ugc_aweme_lancet_LogLancet_e */
    public static int m148556x55f8710d(String str, String str2) {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public void cancel(Object obj) {
        m148556x55f8710d("ttmn", "try to cancel");
        if (obj == null) {
            m148556x55f8710d("ttmn", "try to cancel end fail");
            return;
        }
        ((TTExternFileReader) obj).cancel();
        m148556x55f8710d("ttmn", "try to cancel end");
    }

    /* access modifiers changed from: package-private */
    public long getValue(Object obj, int i) {
        m148556x55f8710d("ttmn", "try to get value");
        if (obj == null) {
            m148556x55f8710d("ttmn", "try to get value fail");
            return -1;
        }
        long value = ((TTExternFileReader) obj).getValue(i);
        m148556x55f8710d("ttmn", "try to get value end");
        return value;
    }

    /* access modifiers changed from: package-private */
    public long getCrc32ByOffset(Object obj, long j, int i) {
        m148556x55f8710d("ttmn", "try to read end");
        if (obj == null) {
            m148556x55f8710d("ttmn", "try to read end fail");
            return 0;
        }
        long crc32ByOffset = ((TTExternFileReader) obj).getCrc32ByOffset(j, i);
        m148556x55f8710d("ttmn", "try to read end");
        return crc32ByOffset;
    }

    /* access modifiers changed from: package-private */
    public int readSlice(Object obj, int i, byte[] bArr, int i2) {
        m148556x55f8710d("ttmn", "try to read end");
        if (obj == null || bArr == null || i2 == 0) {
            m148556x55f8710d("ttmn", "try to read end fail");
            return 0;
        }
        int readSlice = ((TTExternFileReader) obj).readSlice(i, bArr, i2);
        m148556x55f8710d("ttmn", "try to read end");
        return readSlice;
    }

    /* access modifiers changed from: package-private */
    public int readSliceByOffset(Object obj, long j, byte[] bArr, int i, int i2) {
        m148556x55f8710d("ttmn", "try to read end");
        if (obj == null || bArr == null || i == 0) {
            m148556x55f8710d("ttmn", "try to read end fail");
            return 0;
        }
        int readSliceByOffset = ((TTExternFileReader) obj).readSliceByOffset(j, bArr, i, i2);
        m148556x55f8710d("ttmn", "try to read end");
        return readSliceByOffset;
    }
}
