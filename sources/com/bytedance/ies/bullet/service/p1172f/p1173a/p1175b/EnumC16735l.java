package com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.bytedance.ies.bullet.service.f.a.b.l */
public enum EnumC16735l {
    AUTO("auto", 0),
    BOTTOM("bottom", 1),
    RIGHT("right", 2);
    
    public static final C16736a Companion = new C16736a((byte) 0);

    /* renamed from: b */
    private final String f39962b;

    /* renamed from: c */
    private final int f39963c;

    /* renamed from: com.bytedance.ies.bullet.service.f.a.b.l$a */
    public static final class C16736a {
        static {
            Covode.recordClassIndex(19176);
        }

        private C16736a() {
        }

        public /* synthetic */ C16736a(byte b) {
            this();
        }

        /* renamed from: a */
        public static EnumC16735l m31048a(String str) {
            C89219l.m154719c(str, "");
            EnumC16735l[] values = EnumC16735l.values();
            for (EnumC16735l lVar : values) {
                if (C89219l.m154714a((Object) str, (Object) lVar.getVALUE())) {
                    return lVar;
                }
            }
            Integer e = C89361p.m154863e(str);
            if (e != null) {
                int intValue = e.intValue();
                EnumC16735l[] values2 = EnumC16735l.values();
                for (EnumC16735l lVar2 : values2) {
                    if (intValue == lVar2.getVALUE_INT()) {
                        return lVar2;
                    }
                }
            }
            return null;
        }
    }

    public final String getVALUE() {
        return this.f39962b;
    }

    public final int getVALUE_INT() {
        return this.f39963c;
    }

    static {
        Covode.recordClassIndex(19175);
    }

    private EnumC16735l(String str, int i) {
        this.f39962b = str;
        this.f39963c = i;
    }
}
