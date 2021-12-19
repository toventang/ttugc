package com.p2082ss.android.ugc.aweme.comment.p2503ui;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.comment.widget.C37299d;

/* renamed from: com.ss.android.ugc.aweme.comment.ui.da */
final /* synthetic */ class C37128da implements C37299d.AbstractC37300a {

    /* renamed from: a */
    private final DialogInterface$OnShowListenerC37084bz f87488a;

    static {
        Covode.recordClassIndex(44482);
    }

    C37128da(DialogInterface$OnShowListenerC37084bz bzVar) {
        this.f87488a = bzVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.widget.C37299d.AbstractC37300a
    /* renamed from: a */
    public final void mo64659a(int i) {
        DialogInterface$OnShowListenerC37084bz bzVar = this.f87488a;
        if (i == 0 && bzVar.f87374F != null) {
            bzVar.f87374F.mo79007e();
        }
    }
}
