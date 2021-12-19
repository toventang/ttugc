package com.facebook.imageutils;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.facebook.soloader.SoLoader;

/* renamed from: com.facebook.imageutils.b */
public final class C24658b {

    /* renamed from: a */
    public static AbstractC24659a f58579a;

    /* renamed from: com.facebook.imageutils.b$a */
    public interface AbstractC24659a {
        static {
            Covode.recordClassIndex(28811);
        }

        /* renamed from: a */
        void mo34256a(String str);
    }

    static {
        Covode.recordClassIndex(28810);
    }

    /* renamed from: a */
    public static void m47174a(Context context) {
        if (f58579a == null) {
            SoLoader.m47929a(context);
        }
    }

    /* renamed from: a */
    public static void m47175a(String str) {
        AbstractC24659a aVar = f58579a;
        if (aVar != null) {
            aVar.mo34256a(str);
        } else {
            SoLoader.m47932a(str);
        }
    }
}
