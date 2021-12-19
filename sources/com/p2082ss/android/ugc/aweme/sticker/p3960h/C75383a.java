package com.p2082ss.android.ugc.aweme.sticker.p3960h;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.C72847c;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3987d.p3988a.AbstractC75730a;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.h.a */
public final class C75383a extends AbstractC75730a {

    /* renamed from: a */
    public static final C75383a f169426a = new C75383a();

    private C75383a() {
    }

    static {
        Covode.recordClassIndex(88302);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.repository.p3987d.p3988a.AbstractC75730a
    /* renamed from: a */
    public final boolean mo109792a(String str, Effect effect) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(effect, "");
        if (!C72847c.m128632b(effect)) {
            return false;
        }
        if (!C63244g.m114602a().mo73255A().mo93903b() || C63244g.m114602a().mo73255A().mo93901a()) {
            return true;
        }
        return false;
    }
}
