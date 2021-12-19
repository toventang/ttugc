package kotlinx.coroutines.internal;

import com.bytedance.covode.number.Covode;

/* renamed from: kotlinx.coroutines.internal.x */
public final /* synthetic */ class C89661x {

    /* renamed from: a */
    public static final int f203410a = Runtime.getRuntime().availableProcessors();

    static {
        Covode.recordClassIndex(105754);
    }

    /* renamed from: a */
    public static final String m155638a(String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }
}
