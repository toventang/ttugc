package com.p2082ss.android.ugc.aweme.profile.tab;

import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.profile.tab.MusProfileNavigator;

/* renamed from: com.ss.android.ugc.aweme.profile.tab.a */
final /* synthetic */ class View$OnClickListenerC63901a implements View.OnClickListener {

    /* renamed from: a */
    private final MusProfileNavigator f144873a;

    /* renamed from: b */
    private final MusProfileNavigator.AbstractC63898a f144874b;

    /* renamed from: c */
    private final ViewPager f144875c;

    /* renamed from: d */
    private final int f144876d;

    static {
        Covode.recordClassIndex(75331);
    }

    View$OnClickListenerC63901a(MusProfileNavigator musProfileNavigator, MusProfileNavigator.AbstractC63898a aVar, ViewPager viewPager, int i) {
        this.f144873a = musProfileNavigator;
        this.f144874b = aVar;
        this.f144875c = viewPager;
        this.f144876d = i;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        MusProfileNavigator musProfileNavigator = this.f144873a;
        MusProfileNavigator.AbstractC63898a aVar = this.f144874b;
        ViewPager viewPager = this.f144875c;
        int i = this.f144876d;
        if (musProfileNavigator.f144848f) {
            if (aVar != null) {
                aVar.mo103446b(16);
            }
            viewPager.setCurrentItem(i);
        }
    }
}
