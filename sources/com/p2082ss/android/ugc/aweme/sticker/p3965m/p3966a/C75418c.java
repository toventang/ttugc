package com.p2082ss.android.ugc.aweme.sticker.p3965m.p3966a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.sticker.p3965m.C75434l;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3979b.AbstractC75615a;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.m.a.c */
public final class C75418c implements AbstractC75615a {

    /* renamed from: a */
    private final ShortVideoContext f169499a;

    static {
        Covode.recordClassIndex(88337);
    }

    public C75418c(ShortVideoContext shortVideoContext) {
        C89219l.m154721d(shortVideoContext, "");
        this.f169499a = shortVideoContext;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3979b.AbstractC75615a
    /* renamed from: a */
    public final void mo118957a(Effect effect, String str, String str2, String str3) {
        C89219l.m154721d(effect, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str3, "");
        ShortVideoContext shortVideoContext = this.f169499a;
        C89378p[] pVarArr = new C89378p[4];
        pVarArr[0] = C89387v.m154943a("picture_source", str);
        if (str2 == null) {
            str2 = "";
        }
        pVarArr[1] = C89387v.m154943a("tab_name", str2);
        pVarArr[2] = C89387v.m154943a("prop_id", effect.getEffectId());
        pVarArr[3] = C89387v.m154943a("click_content", str3);
        C75434l.m132305a("prop_customized_click", C75434l.m132304a(shortVideoContext, pVarArr));
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3979b.AbstractC75615a
    /* renamed from: b */
    public final void mo118958b(Effect effect, String str, String str2, String str3) {
        C89219l.m154721d(effect, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str3, "");
        ShortVideoContext shortVideoContext = this.f169499a;
        C89378p[] pVarArr = new C89378p[4];
        pVarArr[0] = C89387v.m154943a("picture_source", str);
        if (str2 == null) {
            str2 = "";
        }
        pVarArr[1] = C89387v.m154943a("tab_name", str2);
        pVarArr[2] = C89387v.m154943a("prop_id", effect.getEffectId());
        pVarArr[3] = C89387v.m154943a("click_content", str3);
        C75434l.m132305a("prop_customized_complete", C75434l.m132304a(shortVideoContext, pVarArr));
    }
}
