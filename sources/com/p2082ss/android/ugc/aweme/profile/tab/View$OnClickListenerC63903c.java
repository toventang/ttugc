package com.p2082ss.android.ugc.aweme.profile.tab;

import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.profile.tab.MusProfileNavigator;

/* renamed from: com.ss.android.ugc.aweme.profile.tab.c */
final /* synthetic */ class View$OnClickListenerC63903c implements View.OnClickListener {

    /* renamed from: a */
    private final MusProfileNavigator f144881a;

    /* renamed from: b */
    private final MusProfileNavigator.AbstractC63898a f144882b;

    /* renamed from: c */
    private final ViewPager f144883c;

    /* renamed from: d */
    private final int f144884d;

    static {
        Covode.recordClassIndex(75333);
    }

    View$OnClickListenerC63903c(MusProfileNavigator musProfileNavigator, MusProfileNavigator.AbstractC63898a aVar, ViewPager viewPager, int i) {
        this.f144881a = musProfileNavigator;
        this.f144882b = aVar;
        this.f144883c = viewPager;
        this.f144884d = i;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        MusProfileNavigator musProfileNavigator = this.f144881a;
        MusProfileNavigator.AbstractC63898a aVar = this.f144882b;
        ViewPager viewPager = this.f144883c;
        int i = this.f144884d;
        if (musProfileNavigator.f144848f) {
            if (aVar != null) {
                aVar.mo103446b(6);
            }
            viewPager.setCurrentItem(i);
        }
    }
}
