package com.p2082ss.android.ugc.aweme.emoji.emojichoose;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.emoji.views.SwipeControlledViewPager;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.emoji.emojichoose.l */
final /* synthetic */ class RunnableC46513l implements Runnable {

    /* renamed from: a */
    private final C46510i f108428a;

    /* renamed from: b */
    private final List f108429b;

    /* renamed from: c */
    private final List f108430c;

    /* renamed from: d */
    private final View f108431d;

    /* renamed from: e */
    private final SwipeControlledViewPager f108432e;

    static {
        Covode.recordClassIndex(55098);
    }

    RunnableC46513l(C46510i iVar, List list, List list2, View view, SwipeControlledViewPager swipeControlledViewPager) {
        this.f108428a = iVar;
        this.f108429b = list;
        this.f108430c = list2;
        this.f108431d = view;
        this.f108432e = swipeControlledViewPager;
    }

    public final void run() {
        C46510i iVar = this.f108428a;
        iVar.mo79020a(iVar.f108416k, iVar.f108417l, this.f108429b, this.f108430c, this.f108431d, this.f108432e);
    }
}
