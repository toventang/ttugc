package com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.p3984a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.C73754h;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.C72847c;
import com.p2082ss.android.ugc.aweme.sticker.p3970p.C75462e;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.repository.a.a.a */
public final class C75688a {
    static {
        Covode.recordClassIndex(88619);
    }

    /* renamed from: a */
    private static String m132803a(Effect effect) {
        List<String> music;
        String str;
        if (effect == null || (music = effect.getMusic()) == null || (str = (String) C89070n.m154583g((List) music)) == null) {
            return null;
        }
        return C75462e.m132331a(str);
    }

    /* renamed from: a */
    public static final boolean m132804a(AbstractC84398d dVar, Effect effect) {
        C89219l.m154721d(dVar, "");
        if (effect == null) {
            return false;
        }
        if (effect.getEffectType() != 0 || dVar.mo78918c(effect)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static final boolean m132805b(AbstractC84398d dVar, Effect effect) {
        C89219l.m154721d(dVar, "");
        if (!m132804a(dVar, effect)) {
            return false;
        }
        if (!C72847c.m128627a(effect) || C73754h.m129795d(effect.getEffectId()) || m132803a(effect) != null) {
            return true;
        }
        return false;
    }
}
