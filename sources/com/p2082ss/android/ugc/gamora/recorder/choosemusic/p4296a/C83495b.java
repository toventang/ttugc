package com.p2082ss.android.ugc.gamora.recorder.choosemusic.p4296a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.property.C65473f;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.C72847c;
import com.p2082ss.android.ugc.aweme.sticker.p3970p.C75466g;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.a.b */
public final class C83495b {

    /* renamed from: a */
    public static final C83495b f186460a = new C83495b();

    private C83495b() {
    }

    static {
        Covode.recordClassIndex(97381);
    }

    /* renamed from: a */
    public static boolean m143877a(Effect effect) {
        C89219l.m154721d(effect, "");
        if (C72847c.m128642h(effect) || C75466g.m132368t(effect)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m143876a(ShortVideoContext shortVideoContext, Effect effect) {
        C89219l.m154721d(shortVideoContext, "");
        if (C65473f.m117200b() && !shortVideoContext.f155817b.mo109889b() && !shortVideoContext.f155817b.mo109890c() && !shortVideoContext.mo110022c() && !shortVideoContext.f155817b.f155653i && !C63244g.m114602a().mo73255A().mo93901a() && shortVideoContext.f155817b.mo109896h() <= 0 && !C72847c.m128642h(effect) && !C75466g.m132368t(effect)) {
            return true;
        }
        return false;
    }
}
