package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.common.views.CommonItemView;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.C72683v;
import p4600h.p4611f.p4612a.AbstractC89183m;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.er */
final /* synthetic */ class C73648er implements AbstractC89183m {

    /* renamed from: a */
    private final CommonItemView f165477a;

    /* renamed from: b */
    private final C72683v f165478b;

    static {
        Covode.recordClassIndex(86386);
    }

    C73648er(CommonItemView commonItemView, C72683v vVar) {
        this.f165477a = commonItemView;
        this.f165478b = vVar;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89183m
    public final Object invoke(Object obj, Object obj2) {
        CommonItemView commonItemView = this.f165477a;
        C72683v vVar = this.f165478b;
        Boolean bool = (Boolean) obj2;
        commonItemView.setChecked(bool.booleanValue());
        vVar.f162957j = bool.booleanValue();
        return null;
    }
}
