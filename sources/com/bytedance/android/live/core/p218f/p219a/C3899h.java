package com.bytedance.android.live.core.p218f.p219a;

import android.view.View;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;

/* renamed from: com.bytedance.android.live.core.f.a.h */
public final class C3899h {
    static {
        Covode.recordClassIndex(4428);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.core.f.a.h$a */
    public static class C3900a extends HashMap<String, Object> {
        static {
            Covode.recordClassIndex(4429);
        }

        private C3900a(String str, Object obj) {
            put(str, obj);
        }

        /* synthetic */ C3900a(String str, Object obj, byte b) {
            this(str, obj);
        }
    }

    /* renamed from: a */
    public static void m9528a(View view, Object obj) {
        m9529a(view, "DraweeHolder", obj);
    }

    /* renamed from: a */
    public static Object m9527a(View view, String str) {
        Object obj;
        if (view == null) {
            return null;
        }
        Object tag = view.getTag();
        if (!(tag instanceof C3900a) || (obj = ((C3900a) tag).get(str)) == null) {
            return null;
        }
        return obj;
    }

    /* renamed from: a */
    public static boolean m9529a(View view, String str, Object obj) {
        if (view == null) {
            return false;
        }
        Object tag = view.getTag();
        if (tag instanceof C3900a) {
            ((C3900a) tag).put(str, obj);
            return true;
        }
        view.setTag(new C3900a(str, obj, (byte) 0));
        return true;
    }
}
