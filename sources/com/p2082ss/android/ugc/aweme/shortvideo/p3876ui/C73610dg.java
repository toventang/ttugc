package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.common.views.CommonItemView;
import com.p2082ss.android.ugc.aweme.shortvideo.p3838k.C71907a;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.C72631i;
import p4600h.p4611f.p4612a.AbstractC89183m;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.dg */
public final /* synthetic */ class C73610dg implements AbstractC89183m {

    /* renamed from: a */
    private final C73560cj f165429a;

    static {
        Covode.recordClassIndex(86348);
    }

    C73610dg(C73560cj cjVar) {
        this.f165429a = cjVar;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89183m
    public final Object invoke(Object obj, Object obj2) {
        C73560cj cjVar = this.f165429a;
        View view = (View) obj;
        CommonItemView commonItemView = (CommonItemView) obj2;
        if (!C71907a.m126982a()) {
            return null;
        }
        if ((!C72631i.C72632a.m128111a() && !C73560cj.m129691j().booleanValue()) || !cjVar.f165264G) {
            return null;
        }
        view.setAlpha(0.34f);
        commonItemView.setChecked(false);
        return null;
    }
}
