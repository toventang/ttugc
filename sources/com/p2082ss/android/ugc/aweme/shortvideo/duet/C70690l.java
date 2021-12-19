package com.p2082ss.android.ugc.aweme.shortvideo.duet;

import com.bytedance.covode.number.Covode;
import com.google.gson.C27910f;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.duet.l */
public final class C70690l {

    /* renamed from: a */
    public static final C70690l f158227a = new C70690l();

    private C70690l() {
    }

    static {
        Covode.recordClassIndex(83161);
    }

    /* renamed from: b */
    public static String m124931b(Effect effect) {
        String str;
        C89219l.m154721d(effect, "");
        C70669e a = m124930a(effect);
        if (a == null || (str = a.f158178a) == null) {
            return "";
        }
        return str;
    }

    /* renamed from: c */
    public static String m124932c(Effect effect) {
        String str;
        C89219l.m154721d(effect, "");
        C70669e a = m124930a(effect);
        if (a == null || (str = a.f158178a) == null) {
            return "";
        }
        return str;
    }

    /* renamed from: a */
    public static C70669e m124930a(Effect effect) {
        C89219l.m154721d(effect, "");
        try {
            return (C70669e) new C27910f().mo46670a(new JSONObject(effect.getExtra()).getString("duet_layout_mode"), C70669e.class);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
