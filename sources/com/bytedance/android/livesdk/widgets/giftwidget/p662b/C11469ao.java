package com.bytedance.android.livesdk.widgets.giftwidget.p662b;

import com.bytedance.android.livesdk.C8916h;
import com.bytedance.android.livesdk.p603q.C10146j;
import com.bytedance.android.livesdk.service.p624b.C10700d;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.widgets.giftwidget.b.ao */
final /* synthetic */ class C11469ao implements C10146j.AbstractC10147a {

    /* renamed from: a */
    private final C11455ag f27523a;

    /* renamed from: b */
    private final C10700d f27524b;

    static {
        Covode.recordClassIndex(13128);
    }

    C11469ao(C11455ag agVar, C10700d dVar) {
        this.f27523a = agVar;
        this.f27524b = dVar;
    }

    @Override // com.bytedance.android.livesdk.p603q.C10146j.AbstractC10147a
    /* renamed from: a */
    public final void mo16988a() {
        C11455ag agVar = this.f27523a;
        C10700d dVar = this.f27524b;
        dVar.f25777s = "first_popup";
        agVar.mo18304a(dVar);
        if (agVar.f27481c != null) {
            agVar.f27481c.mo28320c(C8916h.class, true);
        }
    }
}
