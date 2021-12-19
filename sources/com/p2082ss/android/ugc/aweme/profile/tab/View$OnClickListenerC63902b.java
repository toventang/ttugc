package com.p2082ss.android.ugc.aweme.profile.tab;

import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.profile.tab.MusProfileNavigator;

/* renamed from: com.ss.android.ugc.aweme.profile.tab.b */
final /* synthetic */ class View$OnClickListenerC63902b implements View.OnClickListener {

    /* renamed from: a */
    private final MusProfileNavigator f144877a;

    /* renamed from: b */
    private final MusProfileNavigator.AbstractC63898a f144878b;

    /* renamed from: c */
    private final ViewPager f144879c;

    /* renamed from: d */
    private final int f144880d;

    static {
        Covode.recordClassIndex(75332);
    }

    View$OnClickListenerC63902b(MusProfileNavigator musProfileNavigator, MusProfileNavigator.AbstractC63898a aVar, ViewPager viewPager, int i) {
        this.f144877a = musProfileNavigator;
        this.f144878b = aVar;
        this.f144879c = viewPager;
        this.f144880d = i;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        MusProfileNavigator musProfileNavigator = this.f144877a;
        MusProfileNavigator.AbstractC63898a aVar = this.f144878b;
        ViewPager viewPager = this.f144879c;
        int i = this.f144880d;
        if (musProfileNavigator.f144848f) {
            if (aVar != null) {
                aVar.mo103446b(14);
            }
            viewPager.setCurrentItem(i);
        }
    }
}
