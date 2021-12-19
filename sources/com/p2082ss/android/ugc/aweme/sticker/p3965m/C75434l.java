package com.p2082ss.android.ugc.aweme.sticker.p3965m;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.utils.C80322d;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import java.util.HashMap;
import java.util.Map;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.m.l */
public final class C75434l {
    static {
        Covode.recordClassIndex(88353);
    }

    /* renamed from: a */
    public static final void m132305a(String str, Map<String, String> map) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(map, "");
        C84425b bVar = new C84425b();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            bVar.mo129406a(entry.getKey(), entry.getValue());
        }
        C80322d.m139251a(str, bVar.f188764a);
    }

    /* renamed from: a */
    public static final HashMap<String, String> m132304a(ShortVideoContext shortVideoContext, C89378p<String, String>... pVarArr) {
        C89219l.m154721d(shortVideoContext, "");
        C89219l.m154721d(pVarArr, "");
        HashMap<String, String> c = C89041ag.m154428c(C89387v.m154943a("enter_from", "video_shoot_page"), C89387v.m154943a("creation_id", shortVideoContext.f155830o), C89387v.m154943a("shoot_way", shortVideoContext.f155831p));
        if (shortVideoContext.f155740A != 0) {
            c.put("draft_id", String.valueOf(shortVideoContext.f155740A));
        }
        String str = shortVideoContext.f155741B;
        C89219l.m154716b(str, "");
        if (str.length() > 0) {
            c.put("new_draft_id", shortVideoContext.f155741B);
        }
        for (C89378p<String, String> pVar : pVarArr) {
            c.put(pVar.component1(), pVar.component2());
        }
        return c;
    }
}
