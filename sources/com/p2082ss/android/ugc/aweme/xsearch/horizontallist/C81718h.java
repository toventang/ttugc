package com.p2082ss.android.ugc.aweme.xsearch.horizontallist;

import android.graphics.Rect;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.autoplay.player.C34195d;
import com.p2082ss.android.ugc.aweme.flowfeed.utils.AbstractC51064i;
import com.p2082ss.android.ugc.aweme.flowfeed.utils.C51060g;
import com.p2082ss.android.ugc.aweme.framework.p3009d.C51428b;
import com.p2082ss.android.ugc.aweme.xsearch.C81687b;
import java.util.Set;
import p4600h.C89378p;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.xsearch.horizontallist.h */
public final class C81718h extends C34195d {

    /* renamed from: e */
    public C81687b f182724e;

    /* renamed from: f */
    private final Rect f182725f = new Rect(0, 0, 0, 0);

    static {
        Covode.recordClassIndex(95123);
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.C34195d
    /* renamed from: c */
    public final int mo60515c() {
        return 0;
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.C34195d
    /* renamed from: d */
    public final void mo60516d() {
        mo60517e().getLocationOnScreen(mo60514b());
        this.f80855b.left = mo60514b()[0];
        this.f80855b.top = mo60514b()[1];
        this.f80855b.right = mo60514b()[0] + mo60517e().getWidth();
        this.f80855b.bottom = mo60514b()[1] + mo60517e().getHeight();
        this.f80854a.set(this.f80855b.left + this.f182725f.left, this.f80855b.top + this.f182725f.top, this.f80855b.left + this.f182725f.right, this.f80855b.top + this.f182725f.bottom);
    }

    @Override // com.p2082ss.android.ugc.aweme.flowfeed.utils.AbstractC51057e, com.p2082ss.android.ugc.aweme.autoplay.player.C34195d
    /* renamed from: a */
    public final AbstractC51064i mo60507a(Set<? extends AbstractC51064i> set) {
        C89219l.m154721d(set, "");
        AbstractC51064i a = super.mo60507a(set);
        if (a == null) {
            return null;
        }
        C81687b bVar = this.f182724e;
        if (bVar != null) {
            C81687b.m141550a(bVar, "scrolltoactive", C89041ag.m154412a(new C89378p("index", Integer.valueOf(a.mo60326a()))));
        }
        return a;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C81718h(View view, C51060g gVar) {
        super(view, gVar);
        C89219l.m154721d(view, "");
        C89219l.m154721d(gVar, "");
    }

    /* renamed from: a */
    public final void mo125389a(float f, float f2, float f3, float f4) {
        this.f182725f.set(C51428b.m95803a(mo60517e().getContext(), f), C51428b.m95803a(mo60517e().getContext(), f2), C51428b.m95803a(mo60517e().getContext(), f + f3), C51428b.m95803a(mo60517e().getContext(), f2 + f4));
    }
}
