package com.p2082ss.android.ugc.aweme.editSticker.p2878b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.editSticker.b.a */
public class C45850a {

    /* renamed from: a */
    public boolean f106809a;

    /* renamed from: b */
    public final Effect f106810b;

    static {
        Covode.recordClassIndex(54373);
    }

    /* renamed from: b */
    public final boolean mo77204b() {
        if (mo77203a() || this.f106809a) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo77203a() {
        if (m88474a(this.f106810b.getEffectId()) < 0) {
            return true;
        }
        return false;
    }

    public C45850a(Effect effect) {
        C89219l.m154721d(effect, "");
        this.f106810b = effect;
    }

    /* renamed from: a */
    private static int m88474a(String str) {
        if (str == null) {
            return -1;
        }
        try {
            return Integer.parseInt(str);
        } catch (Throwable unused) {
            return -1;
        }
    }
}
