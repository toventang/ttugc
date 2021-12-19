package com.bytedance.android.live.liveinteract.match.p295b.p297b;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.liveinteract.match.b.b.a */
public final class C4947a {

    /* renamed from: a */
    public static C4948b f12909a = new C4948b("data_battle_state");

    /* renamed from: b */
    public static C4948b f12910b = new C4948b("data_battle_rematch_state");

    /* renamed from: c */
    public static final C4947a f12911c = new C4947a();

    private C4947a() {
    }

    static {
        Covode.recordClassIndex(5530);
    }

    /* renamed from: a */
    public static final boolean m11149a() {
        EnumC4949c a = f12909a.mo10672a();
        if (EnumC4949c.START.compareTo((Enum) a) > 0 || a.compareTo((Enum) EnumC4949c.END) >= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m11148a(String str, int i) {
        C89219l.m154721d(str, "");
        if (i == 1) {
            f12909a.mo10678b(false, str);
        } else if (i != 2) {
            f12909a.mo10678b(false, str);
            f12910b.mo10678b(true, str);
        } else {
            f12910b.mo10678b(true, str);
        }
    }
}
