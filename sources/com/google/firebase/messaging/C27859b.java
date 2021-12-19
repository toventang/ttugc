package com.google.firebase.messaging;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.firebase.messaging.b */
public final class C27859b {

    /* renamed from: a */
    public static final long f65439a = TimeUnit.MINUTES.toMillis(3);

    static {
        Covode.recordClassIndex(33452);
    }

    /* renamed from: com.google.firebase.messaging.b$a */
    public static final class C27860a {
        static {
            Covode.recordClassIndex(33453);
        }

        /* renamed from: a */
        public static Object m55774a(Bundle bundle, String str) {
            try {
                return bundle.get(str);
            } catch (Exception | OutOfMemoryError unused) {
                return null;
            }
        }
    }
}
