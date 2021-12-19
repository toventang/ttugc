package com.p2082ss.android.ugc.aweme.comment.p2503ui;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.tooltip.C17257b;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.comment.ui.ao */
public final /* synthetic */ class C37023ao implements C17257b.AbstractC17259b {

    /* renamed from: a */
    private final C37157k f87201a;

    /* renamed from: b */
    private final Aweme f87202b;

    /* renamed from: c */
    private final String[] f87203c;

    static {
        Covode.recordClassIndex(44377);
    }

    C37023ao(C37157k kVar, Aweme aweme, String[] strArr) {
        this.f87201a = kVar;
        this.f87202b = aweme;
        this.f87203c = strArr;
    }

    @Override // com.bytedance.ies.dmt.p1194ui.tooltip.C17257b.AbstractC17259b
    /* renamed from: a */
    public final void mo27360a() {
        this.f87201a.mo64700a(this.f87202b, this.f87203c[0], "dismiss_gift_tooltip");
    }
}
