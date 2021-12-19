package com.bytedance.android.live.publicscreen.impl.widget;

import com.bytedance.covode.number.Covode;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.live.publicscreen.impl.widget.o */
public final /* synthetic */ class C6085o implements AbstractC89172b {

    /* renamed from: a */
    private final PublicScreenWidget f15223a;

    static {
        Covode.recordClassIndex(6702);
    }

    C6085o(PublicScreenWidget publicScreenWidget) {
        this.f15223a = publicScreenWidget;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public final Object invoke(Object obj) {
        PublicScreenWidget publicScreenWidget = this.f15223a;
        Boolean bool = (Boolean) obj;
        if (publicScreenWidget.mo11850e()) {
            boolean booleanValue = bool.booleanValue();
            publicScreenWidget.f15146n.notifyDataSetChanged();
            publicScreenWidget.f15143k = booleanValue;
            publicScreenWidget.mo11928l();
        }
        return C89391z.f203057a;
    }
}
