package com.p2082ss.android.ugc.aweme.playerkit.configpickerimpl.p3559c;

import com.bytedance.covode.number.Covode;
import com.google.gson.AbstractC28019l;
import com.google.gson.C27910f;
import java.lang.reflect.Type;

/* renamed from: com.ss.android.ugc.aweme.playerkit.configpickerimpl.c.b */
public final class C63122b {

    /* renamed from: a */
    private static final C27910f f143452a = new C27910f();

    static {
        Covode.recordClassIndex(73964);
    }

    /* renamed from: a */
    public static <T> T m114064a(AbstractC28019l lVar, Type type) {
        try {
            return (T) f143452a.mo46668a(lVar, type);
        } catch (Exception unused) {
            C63120a.m114061a("JSON parse error! check your config: " + lVar.toString());
            return null;
        }
    }
}
