package com.bytedance.push.settings;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.push.settings.storage.C21911h;

/* renamed from: com.bytedance.push.settings.h */
public final class C21895h {

    /* renamed from: a */
    public static final C21911h f51860a;

    /* renamed from: b */
    private static final C21893f f51861b;

    /* renamed from: c */
    private static final C21894g f51862c = new C21894g();

    static {
        Covode.recordClassIndex(25558);
        C21911h hVar = new C21911h();
        f51860a = hVar;
        f51861b = new C21893f(hVar);
    }

    /* renamed from: a */
    public static <T> T m41120a(Context context, Class<T> cls) {
        if (ISettings.class.isAssignableFrom(cls)) {
            return (T) f51862c.mo35619a(context, cls);
        }
        if (ILocalSettings.class.isAssignableFrom(cls)) {
            return (T) f51861b.mo35618a(context, cls);
        }
        throw new IllegalArgumentException("tClass must be child of ISettings or ILocalSettings");
    }
}
