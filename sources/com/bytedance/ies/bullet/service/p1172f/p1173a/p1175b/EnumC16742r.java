package com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.bullet.service.f.a.b.r */
public enum EnumC16742r {
    AUTO("auto"),
    LIGHT("light"),
    DARK("dark");
    
    public static final C16743a Companion = new C16743a((byte) 0);

    /* renamed from: b */
    private final String f39986b;

    /* renamed from: com.bytedance.ies.bullet.service.f.a.b.r$a */
    public static final class C16743a {
        static {
            Covode.recordClassIndex(19183);
        }

        private C16743a() {
        }

        public /* synthetic */ C16743a(byte b) {
            this();
        }

        /* renamed from: a */
        public static EnumC16742r m31066a(String str) {
            C89219l.m154719c(str, "");
            EnumC16742r[] values = EnumC16742r.values();
            for (EnumC16742r rVar : values) {
                if (C89219l.m154714a((Object) str, (Object) rVar.getVALUE())) {
                    return rVar;
                }
            }
            return EnumC16742r.AUTO;
        }
    }

    public final String getVALUE() {
        return this.f39986b;
    }

    static {
        Covode.recordClassIndex(19182);
    }

    private EnumC16742r(String str) {
        this.f39986b = str;
    }
}
