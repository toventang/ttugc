package com.bytedance.android.live.broadcast.widget;

import com.bytedance.android.live.broadcast.p192c.C3215b;
import com.bytedance.android.live.broadcast.stream.capture.p208a.C3689a;
import com.bytedance.android.live.broadcast.widget.LinkVideo2View;
import com.bytedance.android.live.effect.C4217d;
import com.bytedance.android.live.effect.api.C4147a;
import com.bytedance.android.live.effect.api.p240a.AbstractC4155h;
import com.bytedance.android.live.effect.api.p240a.C4163l;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.bytedance.android.live.broadcast.widget.c */
final /* synthetic */ class C3781c implements AbstractC88433f {

    /* renamed from: a */
    private final LinkVideo2View.C37551 f10482a;

    static {
        Covode.recordClassIndex(4307);
    }

    C3781c(LinkVideo2View.C37551 r1) {
        this.f10482a = r1;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        LinkVideo2View linkVideo2View = LinkVideo2View.this;
        if (!linkVideo2View.f10387e) {
            linkVideo2View.f10387e = true;
            AbstractC4155h d = C4217d.m10321d();
            C4163l.C4164a aVar = new C4163l.C4164a();
            aVar.f11601d = linkVideo2View.f10389g;
            d.mo9844a(aVar.mo9872a());
            if (linkVideo2View.f10385c == null) {
                linkVideo2View.f10385c = new C3689a();
                linkVideo2View.f10386d.mo8964a(linkVideo2View.f10385c);
            }
            if (linkVideo2View.f10384b == null) {
                linkVideo2View.f10384b = new C3215b();
                linkVideo2View.f10384b.mo8532a(linkVideo2View.f10383a == null ? linkVideo2View.f10384b.f9197d : linkVideo2View.f10383a.f8900a);
            }
            if (linkVideo2View.f10383a != null && linkVideo2View.f10383a.f8901b != null) {
                C4217d.m10321d().mo9846a(C4147a.f11585c, linkVideo2View.f10383a.f8901b);
            }
        }
    }
}
