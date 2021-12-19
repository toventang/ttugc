package com.bytedance.bpea.entry.common;

import com.bytedance.bpea.basics.AbstractC13343d;
import com.bytedance.bpea.basics.AbstractC13344e;
import com.bytedance.bpea.basics.C13345f;
import com.bytedance.bpea.basics.C13347h;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Field;
import p4600h.C89388w;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.bpea.entry.common.b */
public final class C13399b {

    /* renamed from: a */
    public static final C13399b f32688a = new C13399b();

    /* renamed from: b */
    private static AbstractC13344e f32689b;

    private C13399b() {
    }

    static {
        Covode.recordClassIndex(15398);
        try {
            Class<?> cls = Class.forName("com.bytedance.bpea.core.checker.CertCheckerProvider");
            Field declaredField = cls.getDeclaredField("INSTANCE");
            C89219l.m154709a((Object) declaredField, "");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(null);
            Field declaredField2 = cls.getDeclaredField("CHECKER");
            C89219l.m154709a((Object) declaredField2, "");
            declaredField2.setAccessible(true);
            Object obj2 = declaredField2.get(obj);
            if (obj2 != null) {
                f32689b = (AbstractC13344e) obj2;
                if (f32689b != null) {
                    C89219l.m154719c("checker working", "");
                } else {
                    C89219l.m154719c("checker not work", "");
                }
            } else {
                throw new C89388w("null cannot be cast to non-null type");
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static C13347h m24087a(AbstractC13343d dVar, C13345f fVar) {
        C89219l.m154719c(fVar, "");
        AbstractC13344e eVar = f32689b;
        if (eVar != null) {
            return eVar.mo21567a(dVar, fVar);
        }
        return null;
    }
}
