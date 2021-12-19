package com.p2082ss.android.ugc.aweme.utils;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.feed.p2957n.AbstractC49762o;
import com.p2082ss.android.ugc.aweme.feed.p2957n.C49763p;
import com.p2082ss.android.ugc.aweme.framework.p3007b.C51425a;

/* renamed from: com.ss.android.ugc.aweme.utils.gc */
public final class C80472gc {
    static {
        Covode.recordClassIndex(93740);
    }

    /* renamed from: a */
    public static RecyclerView m139484a(RecyclerView recyclerView, AbstractC49762o oVar, int i) {
        recyclerView.mo4405a(new C51425a(C17867d.m33078a()));
        C49763p pVar = new C49763p(recyclerView, oVar);
        pVar.f114504b = i;
        recyclerView.setOnFlingListener(pVar);
        return recyclerView;
    }
}
