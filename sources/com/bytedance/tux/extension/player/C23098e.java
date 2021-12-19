package com.bytedance.tux.extension.player;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.tux.extension.player.e */
public final class C23098e {

    /* renamed from: a */
    public static EnumC23097d f54671a = EnumC23097d.PLAYER_IDLE;

    /* renamed from: b */
    public static EnumC23096c f54672b = EnumC23096c.PREVIEW;

    /* renamed from: c */
    public static final C23098e f54673c = new C23098e();

    private C23098e() {
    }

    static {
        Covode.recordClassIndex(27022);
    }

    /* renamed from: a */
    public static void m43538a(EnumC23096c cVar) {
        C89219l.m154719c(cVar, "");
        f54672b = cVar;
    }

    /* renamed from: a */
    public static void m43539a(EnumC23097d dVar) {
        C89219l.m154719c(dVar, "");
        f54671a = dVar;
    }
}
