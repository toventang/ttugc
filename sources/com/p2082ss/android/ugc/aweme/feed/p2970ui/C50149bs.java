package com.p2082ss.android.ugc.aweme.feed.p2970ui;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.C49557n;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50539g;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50545m;
import p4560f.p4561a.p4567d.AbstractC88438k;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.bs */
final /* synthetic */ class C50149bs implements AbstractC88438k {

    /* renamed from: a */
    private final C50142bq f115746a;

    static {
        Covode.recordClassIndex(59275);
    }

    C50149bs(C50142bq bqVar) {
        this.f115746a = bqVar;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88438k
    /* renamed from: a */
    public final boolean mo7718a(Object obj) {
        Aweme aweme = (Aweme) obj;
        return !C49557n.m92869a(aweme) && !aweme.isHotSearchAweme() && !aweme.isHotVideoAweme() && !C50545m.m94770g(aweme) && !C50539g.m94744a(aweme);
    }
}
