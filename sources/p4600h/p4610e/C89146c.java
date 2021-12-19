package p4600h.p4610e;

import com.bytedance.covode.number.Covode;
import java.io.Closeable;
import p4600h.C89032a;

/* renamed from: h.e.c */
public final class C89146c {
    static {
        Covode.recordClassIndex(105230);
    }

    /* renamed from: a */
    public static final void m154636a(Closeable closeable, Throwable th) {
        if (closeable == null) {
            return;
        }
        if (th == null) {
            closeable.close();
            return;
        }
        try {
            closeable.close();
        } catch (Throwable th2) {
            C89032a.m154603a(th, th2);
        }
    }
}
