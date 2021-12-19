package com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.bytedance.ies.bullet.service.f.a.b.s */
public enum EnumC16744s {
    IMMERSIVE(1),
    GRADUAL_CHANGE(2),
    NORMAL(3);
    
    public static final C16745a Companion = new C16745a((byte) 0);

    /* renamed from: b */
    private final int f39988b;

    /* renamed from: com.bytedance.ies.bullet.service.f.a.b.s$a */
    public static final class C16745a {
        static {
            Covode.recordClassIndex(19185);
        }

        private C16745a() {
        }

        public /* synthetic */ C16745a(byte b) {
            this();
        }

        /* renamed from: a */
        public static EnumC16744s m31067a(int i) {
            EnumC16744s[] values = EnumC16744s.values();
            for (EnumC16744s sVar : values) {
                if (i == sVar.getVALUE()) {
                    return sVar;
                }
            }
            return null;
        }

        /* renamed from: a */
        public static EnumC16744s m31068a(String str) {
            C89219l.m154719c(str, "");
            Integer e = C89361p.m154863e(str);
            if (e != null) {
                return m31067a(e.intValue());
            }
            return null;
        }
    }

    public final int getVALUE() {
        return this.f39988b;
    }

    static {
        Covode.recordClassIndex(19184);
    }

    private EnumC16744s(int i) {
        this.f39988b = i;
    }
}
