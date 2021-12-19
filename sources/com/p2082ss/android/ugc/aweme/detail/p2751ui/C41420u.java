package com.p2082ss.android.ugc.aweme.detail.p2751ui;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.p2379ui.C34685e;
import com.p2082ss.android.ugc.aweme.base.p2379ui.C34700p;
import com.p2082ss.android.ugc.aweme.common.widget.VerticalViewPager;

/* renamed from: com.ss.android.ugc.aweme.detail.ui.u */
final /* synthetic */ class C41420u implements C34700p.AbstractC34704c {

    /* renamed from: a */
    static final C34700p.AbstractC34704c f96623a = new C41420u();

    static {
        Covode.recordClassIndex(49315);
    }

    private C41420u() {
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2379ui.C34700p.AbstractC34704c
    /* renamed from: a */
    public final void mo61375a(C34685e eVar) {
        if (eVar instanceof C41426z) {
            C41426z zVar = (C41426z) eVar;
            zVar.f96638m = false;
            VerticalViewPager verticalViewPager = zVar.f96636k.f114759N;
            if (verticalViewPager != null) {
                verticalViewPager.setDisableScroll(true);
            }
        }
    }
}
