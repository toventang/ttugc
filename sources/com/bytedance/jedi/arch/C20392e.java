package com.bytedance.jedi.arch;

import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1175ad;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.jedi.arch.e */
public final class C20392e {

    /* renamed from: a */
    public static final C1175ad.AbstractC1177b f48284a = new C20393a();

    /* renamed from: com.bytedance.jedi.arch.e$a */
    public static final class C20393a implements C1175ad.AbstractC1177b {
        static {
            Covode.recordClassIndex(23905);
        }

        C20393a() {
        }

        @Override // androidx.lifecycle.C1175ad.AbstractC1177b
        /* renamed from: a */
        public final <T extends AbstractC1174ac> T mo3261a(Class<T> cls) {
            C89219l.m154719c(cls, "");
            throw new C20381as(cls.getSimpleName() + " should be created in the host before being used.");
        }
    }

    static {
        Covode.recordClassIndex(23904);
    }
}
