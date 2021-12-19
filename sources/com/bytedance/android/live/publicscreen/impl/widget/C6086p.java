package com.bytedance.android.live.publicscreen.impl.widget;

import com.bytedance.covode.number.Covode;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.live.publicscreen.impl.widget.p */
public final /* synthetic */ class C6086p implements AbstractC89172b {

    /* renamed from: a */
    private final PublicScreenWidget f15224a;

    static {
        Covode.recordClassIndex(6703);
    }

    C6086p(PublicScreenWidget publicScreenWidget) {
        this.f15224a = publicScreenWidget;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public final Object invoke(Object obj) {
        PublicScreenWidget publicScreenWidget = this.f15224a;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        publicScreenWidget.f15146n.notifyDataSetChanged();
        publicScreenWidget.f15144l = booleanValue;
        publicScreenWidget.mo11928l();
        return C89391z.f203057a;
    }
}
