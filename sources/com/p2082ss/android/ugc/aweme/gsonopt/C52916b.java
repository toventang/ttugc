package com.p2082ss.android.ugc.aweme.gsonopt;

import com.bytedance.covode.number.Covode;
import com.google.gson.AbstractC28031v;
import java.lang.reflect.Field;

/* renamed from: com.ss.android.ugc.aweme.gsonopt.b */
public final class C52916b {

    /* renamed from: a */
    final String f121698a;

    /* renamed from: b */
    final boolean f121699b = true;

    /* renamed from: c */
    final boolean f121700c = true;

    /* renamed from: d */
    AbstractC28031v f121701d;

    /* renamed from: e */
    boolean f121702e;

    static {
        Covode.recordClassIndex(62436);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Field mo89310a(Object obj) {
        for (Class<?> cls = obj.getClass(); cls != Object.class; cls = cls.getSuperclass()) {
            try {
                Field declaredField = cls.getDeclaredField(this.f121698a);
                if (declaredField != null) {
                    return declaredField;
                }
            } catch (NoSuchFieldException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public C52916b(String str, AbstractC28031v vVar, boolean z) {
        this.f121698a = str;
        this.f121701d = vVar;
        this.f121702e = z;
    }
}
