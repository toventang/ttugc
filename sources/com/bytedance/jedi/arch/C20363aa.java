package com.bytedance.jedi.arch;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.jedi.arch.aa */
public final class C20363aa implements AbstractC20551z {

    /* renamed from: a */
    private boolean f48247a = true;

    static {
        Covode.recordClassIndex(23875);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20551z
    /* renamed from: a */
    public final <S extends AbstractC20368af, VM extends JediViewModel<S>, T extends AbstractC20550y<S, VM>> T mo33696a(Class<VM> cls) {
        C89219l.m154719c(cls, "");
        String str = cls.getName() + "_MiddlewareBinding";
        try {
            if (!this.f48247a) {
                return null;
            }
            Class<?> cls2 = C20364ab.f48248a.get(str);
            if (cls2 != null || !C20364ab.f48248a.containsKey(str)) {
                Class<?> cls3 = cls2;
                if (cls3 == null) {
                    cls3 = Class.forName(str);
                    C20364ab.f48248a.put(str, cls3);
                }
                Object newInstance = cls3.newInstance();
                if (!(newInstance instanceof AbstractC20550y)) {
                    newInstance = null;
                }
                T t = (T) ((AbstractC20550y) newInstance);
                if (t == null) {
                    return null;
                }
                this.f48247a = false;
                return t;
            }
            this.f48247a = false;
            return null;
        } catch (Exception unused) {
            C20364ab.f48248a.put(str, null);
            this.f48247a = false;
            return null;
        }
    }
}
