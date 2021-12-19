package com.p2082ss.android.ugc.aweme.photo.local;

import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.photo.local.a */
final /* synthetic */ class View$OnClickListenerC62877a implements View.OnClickListener {

    /* renamed from: a */
    private final ViewPager f142599a;

    /* renamed from: b */
    private final int f142600b;

    static {
        Covode.recordClassIndex(73709);
    }

    View$OnClickListenerC62877a(ViewPager viewPager, int i) {
        this.f142599a = viewPager;
        this.f142600b = i;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f142599a.setCurrentItem(this.f142600b);
    }
}
