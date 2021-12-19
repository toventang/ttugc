package com.p114bd.p115cu.p116fp;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.librarian.Librarian;
import com.p2082ss.android.ugc.aweme.lancet.C58032m;

/* renamed from: com.bd.cu.fp.NativeUtils */
public class NativeUtils {
    public static native byte[] crypt(long j, byte[] bArr);

    public static native long nativeInit(String str);

    public static native void release(long j);

    static {
        Covode.recordClassIndex(2656);
        m7223x8012610c("fileprotect");
    }

    /* renamed from: com_bd_cu_fp_NativeUtils_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary */
    public static void m7223x8012610c(String str) {
        long uptimeMillis = SystemClock.uptimeMillis();
        Librarian.m38964a(str, false, (Context) null);
        C58032m.m104852a(uptimeMillis, str);
    }
}
