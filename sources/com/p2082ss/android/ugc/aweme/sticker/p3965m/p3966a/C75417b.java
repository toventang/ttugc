package com.p2082ss.android.ugc.aweme.sticker.p3965m.p3966a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.C70005cr;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.sticker.p3965m.C75434l;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3979b.AbstractC75616b;
import p4600h.C89387v;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.m.a.b */
public final class C75417b implements AbstractC75616b {

    /* renamed from: a */
    private final ShortVideoContext f169498a;

    static {
        Covode.recordClassIndex(88336);
    }

    public C75417b(ShortVideoContext shortVideoContext) {
        C89219l.m154721d(shortVideoContext, "");
        this.f169498a = shortVideoContext;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3979b.AbstractC75616b
    /* renamed from: a */
    public final void mo118959a(String str) {
        C89219l.m154721d(str, "");
        C75434l.m132305a("show_toast", C89041ag.m154428c(C89387v.m154943a("toast_type", "prop"), C89387v.m154943a("prop_id", str), C89387v.m154943a("enter_from", "video_shoot_page")));
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3979b.AbstractC75616b
    /* renamed from: b */
    public final void mo118961b(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C75434l.m132305a("click_transform_link", C89041ag.m154428c(C89387v.m154943a("prop_id", str), C89387v.m154943a("shoot_way", this.f169498a.f155831p), C89387v.m154943a("carrier_type", str2)));
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3979b.AbstractC75616b
    /* renamed from: a */
    public final void mo118960a(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C70005cr a = C70005cr.m123611a();
        C89219l.m154716b(a, "");
        Boolean bool = a.f156490i;
        C89219l.m154716b(bool, "");
        if (bool.booleanValue()) {
            C70005cr a2 = C70005cr.m123611a();
            C89219l.m154716b(a2, "");
            a2.f156490i = false;
            return;
        }
        C75434l.m132305a("show_transform_link", C89041ag.m154428c(C89387v.m154943a("prop_id", str), C89387v.m154943a("shoot_way", this.f169498a.f155831p), C89387v.m154943a("carrier_type", str2)));
        C70005cr a3 = C70005cr.m123611a();
        C89219l.m154716b(a3, "");
        a3.f156490i = true;
        C70005cr a4 = C70005cr.m123611a();
        C89219l.m154716b(a4, "");
        a4.f156491j = true;
    }
}
