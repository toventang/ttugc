package com.bytedance.android.live.publicscreen.impl.widget;

import com.bytedance.android.live.liveinteract.api.p261b.C4419h;
import com.bytedance.android.live.publicscreen.p386a.p388b.C5860a;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.live.publicscreen.impl.widget.h */
public final /* synthetic */ class C6078h implements AbstractC88433f {

    /* renamed from: a */
    private final PublicScreenWidget f15216a;

    static {
        Covode.recordClassIndex(6695);
    }

    C6078h(PublicScreenWidget publicScreenWidget) {
        this.f15216a = publicScreenWidget;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        PublicScreenWidget publicScreenWidget = this.f15216a;
        if (obj instanceof C5860a) {
            publicScreenWidget.onEvent((C5860a) obj);
        } else if (obj instanceof C4419h) {
            publicScreenWidget.onEvent((C4419h) obj);
        }
    }
}
