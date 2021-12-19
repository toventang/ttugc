package com.p2082ss.bduploader;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.bduploader.BDExternalFileReaderBridge */
public class BDExternalFileReaderBridge {
    static {
        Covode.recordClassIndex(100776);
    }

    /* renamed from: com_ss_bduploader_BDExternalFileReaderBridge_com_ss_android_ugc_aweme_lancet_LogLancet_e */
    public static int m147827x994ee178(String str, String str2) {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public void cancel(Object obj) {
        m147827x994ee178("ttmn", "try to cancel");
        if (obj == null) {
            m147827x994ee178("ttmn", "try to cancel end fail");
            return;
        }
        ((BDExternalFileReader) obj).cancel();
        m147827x994ee178("ttmn", "try to cancel end");
    }

    /* access modifiers changed from: package-private */
    public long getValue(Object obj, int i) {
        m147827x994ee178("ttmn", "try to get value");
        if (obj == null) {
            m147827x994ee178("ttmn", "try to get value fail");
            return -1;
        }
        long value = ((BDExternalFileReader) obj).getValue(i);
        m147827x994ee178("ttmn", "try to get value end");
        return value;
    }

    /* access modifiers changed from: package-private */
    public long getCrc32ByOffset(Object obj, long j, int i) {
        m147827x994ee178("ttmn", "try to read end");
        if (obj == null) {
            m147827x994ee178("ttmn", "try to read end fail");
            return 0;
        }
        long crc32ByOffset = ((BDExternalFileReader) obj).getCrc32ByOffset(j, i);
        m147827x994ee178("ttmn", "try to read end");
        return crc32ByOffset;
    }

    /* access modifiers changed from: package-private */
    public int readSlice(Object obj, int i, byte[] bArr, int i2) {
        m147827x994ee178("ttmn", "try to read end");
        if (obj == null || bArr == null || i2 == 0) {
            m147827x994ee178("ttmn", "try to read end fail");
            return 0;
        }
        int readSlice = ((BDExternalFileReader) obj).readSlice(i, bArr, i2);
        m147827x994ee178("ttmn", "try to read end");
        return readSlice;
    }

    /* access modifiers changed from: package-private */
    public int readSliceByOffset(Object obj, long j, byte[] bArr, int i, int i2) {
        m147827x994ee178("ttmn", "try to read end");
        if (obj == null || bArr == null || i == 0) {
            m147827x994ee178("ttmn", "try to read end fail");
            return 0;
        }
        int readSliceByOffset = ((BDExternalFileReader) obj).readSliceByOffset(j, bArr, i, i2);
        m147827x994ee178("ttmn", "try to read end");
        return readSliceByOffset;
    }
}
