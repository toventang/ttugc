package com.bytedance.android.live.publicscreen.impl.widget;

import android.view.View;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.bytedance.android.live.publicscreen.impl.widget.b */
final /* synthetic */ class C6055b implements AbstractC89172b {

    /* renamed from: a */
    private final PublicScreenWidget f15167a;

    static {
        Covode.recordClassIndex(6672);
    }

    C6055b(PublicScreenWidget publicScreenWidget) {
        this.f15167a = publicScreenWidget;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public final Object invoke(Object obj) {
        PublicScreenWidget publicScreenWidget = this.f15167a;
        if (((View) obj).getTranslationY() >= 0.0f || publicScreenWidget.f15151s.f14743c == null || publicScreenWidget.f15151s.f14743c.mo11676d().f14726a != 0) {
            return null;
        }
        publicScreenWidget.f15139g.mo11668a(publicScreenWidget.f15151s.f14743c);
        publicScreenWidget.f15151s.f14743c.mo11676d().f14726a++;
        publicScreenWidget.f15139g.mo11670b(publicScreenWidget.f15151s.f14743c);
        return null;
    }
}
