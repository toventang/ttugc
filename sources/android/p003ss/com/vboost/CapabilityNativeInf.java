package android.p003ss.com.vboost;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.librarian.Librarian;
import com.p2082ss.android.ugc.aweme.lancet.C58032m;

/* renamed from: android.ss.com.vboost.CapabilityNativeInf */
class CapabilityNativeInf {
    private static native boolean nativeIsSupportCapability(CapabilityType capabilityType);

    private static native void nativeLoadMethod();

    private static native void nativeRegisterApplication(Context context);

    private static native void nativeRequestVibrateCapability(int i, float f, float f2, float f3, String str);

    CapabilityNativeInf() {
    }

    static {
        Covode.recordClassIndex(3);
        try {
            long uptimeMillis = SystemClock.uptimeMillis();
            Librarian.m38965b("vboost", false, null);
            C58032m.m104852a(uptimeMillis, "vboost");
        } catch (UnsatisfiedLinkError e) {
            e.printStackTrace();
        }
    }
}
