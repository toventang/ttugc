package com.bytedance.android.live.liveinteract.platform.common.p377h;

import android.util.Base64;
import com.bytedance.android.live.network.C5809h;
import com.bytedance.android.livesdk.model.message.C9606aj;
import com.bytedance.android.livesdk.model.message.p580d.p583c.C9754d;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2726d;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.liveinteract.platform.common.h.b */
public final class C5743b {

    /* renamed from: a */
    public static final C5743b f14569a = new C5743b();

    private C5743b() {
    }

    static {
        Covode.recordClassIndex(6341);
    }

    /* renamed from: a */
    public static final C9754d m12613a(C9606aj ajVar) {
        C89219l.m154721d(ajVar, "");
        if (ajVar.f23336v != null) {
            return ajVar.f23336v;
        }
        if (ajVar.f23333s == null) {
            return null;
        }
        try {
            AbstractC2724b a = C5809h.m12739a().mo11582a(C9754d.class);
            byte[] decode = Base64.decode(ajVar.f23333s, 0);
            C89219l.m154716b(decode, "");
            if (a == null) {
                C89219l.m154715b();
            }
            ajVar.f23336v = (C9754d) a.mo7304a(new C2730f().mo7308a(C2726d.m7876a(decode)));
            return ajVar.f23336v;
        } catch (Exception unused) {
            return null;
        }
    }
}
