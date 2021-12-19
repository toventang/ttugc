package com.facebook.common.p1832d;

import com.bytedance.covode.number.Covode;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.facebook.common.d.b */
public final class C24083b {

    /* renamed from: a */
    static final Logger f57013a = Logger.getLogger(C24083b.class.getName());

    private C24083b() {
    }

    static {
        Covode.recordClassIndex(28210);
    }

    /* renamed from: a */
    public static void m45600a(InputStream inputStream) {
        try {
            m45599a((Closeable) inputStream);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: a */
    public static void m45599a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                f57013a.log(Level.WARNING, "IOException thrown while closing Closeable.", (Throwable) e);
            }
        }
    }
}
