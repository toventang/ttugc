package com.p2082ss.android.ugc.aweme.discover.p2797ui;

import android.text.TextUtils;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.tablayout.C17299b;
import com.p2082ss.android.ugc.aweme.search.theme.C67782c;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.as */
final /* synthetic */ class C42687as implements AbstractC1214u {

    /* renamed from: a */
    private final C42681ap f99561a;

    static {
        Covode.recordClassIndex(50791);
    }

    C42687as(C42681ap apVar) {
        this.f99561a = apVar;
    }

    @Override // androidx.lifecycle.AbstractC1214u
    public final void onChanged(Object obj) {
        C42681ap apVar = this.f99561a;
        C67782c cVar = (C67782c) obj;
        apVar.f99543l = TextUtils.equals("dark", cVar.f151910a);
        apVar.f99540e.setBackgroundColor(apVar.mo72889a(cVar));
        apVar.f99539d.setBackgroundColor(cVar.f151911b);
        apVar.f99539d.setCustomTabViewResId(apVar.mo72892b());
        apVar.f99539d.setupWithViewPager(apVar.f99538c);
        apVar.f99539d.setSelectedTabIndicatorColor(apVar.mo72888a());
        C17299b.m32026a(apVar.f99539d);
    }
}
