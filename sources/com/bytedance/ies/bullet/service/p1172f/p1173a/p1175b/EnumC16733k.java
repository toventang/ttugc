package com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.bytedance.ies.bullet.service.f.a.b.k */
public enum EnumC16733k {
    NONE("none", 0),
    REPORT("report", 1),
    SHARE("share", 2);
    
    public static final C16734a Companion = new C16734a((byte) 0);

    /* renamed from: b */
    private final String f39959b;

    /* renamed from: c */
    private final int f39960c;

    /* renamed from: com.bytedance.ies.bullet.service.f.a.b.k$a */
    public static final class C16734a {
        static {
            Covode.recordClassIndex(19174);
        }

        private C16734a() {
        }

        public /* synthetic */ C16734a(byte b) {
            this();
        }

        /* renamed from: a */
        public static EnumC16733k m31047a(String str) {
            C89219l.m154719c(str, "");
            EnumC16733k[] values = EnumC16733k.values();
            for (EnumC16733k kVar : values) {
                if (C89219l.m154714a((Object) str, (Object) kVar.getVALUE())) {
                    return kVar;
                }
            }
            Integer e = C89361p.m154863e(str);
            if (e != null) {
                int intValue = e.intValue();
                EnumC16733k[] values2 = EnumC16733k.values();
                for (EnumC16733k kVar2 : values2) {
                    if (intValue == kVar2.getVALUE_INT()) {
                        return kVar2;
                    }
                }
            }
            return null;
        }
    }

    public final String getVALUE() {
        return this.f39959b;
    }

    public final int getVALUE_INT() {
        return this.f39960c;
    }

    static {
        Covode.recordClassIndex(19173);
    }

    private EnumC16733k(String str, int i) {
        this.f39959b = str;
        this.f39960c = i;
    }
}
