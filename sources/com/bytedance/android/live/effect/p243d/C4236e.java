package com.bytedance.android.live.effect.p243d;

import android.view.View;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.covode.number.Covode;
import com.google.android.material.tabs.TabLayout;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.effect.d.e */
public final class C4236e {

    /* renamed from: a */
    final ArrayList<String> f11729a = new ArrayList<>();

    /* renamed from: b */
    final TabLayout f11730b;

    /* renamed from: c */
    private final ViewPager f11731c;

    static {
        Covode.recordClassIndex(4806);
    }

    public C4236e(TabLayout tabLayout, ViewPager viewPager) {
        C89219l.m154721d(tabLayout, "");
        C89219l.m154721d(viewPager, "");
        this.f11730b = tabLayout;
        this.f11731c = viewPager;
        tabLayout.addOnTabSelectedListener(new C4235d(viewPager));
        viewPager.addOnPageChangeListener(new TabLayout.C26723g(tabLayout));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final TabLayout.C26722f mo9938a(String str, boolean z) {
        View findViewById;
        TextView textView;
        TabLayout.C26722f newTab = this.f11730b.newTab();
        C89219l.m154716b(newTab, "");
        newTab.mo44367a(R.layout.b7x);
        View view = newTab.f63312f;
        if (!(view == null || (textView = (TextView) view.findViewById(R.id.ee8)) == null)) {
            textView.setText(str);
        }
        View view2 = newTab.f63312f;
        if (!(view2 == null || (findViewById = view2.findViewById(R.id.eea)) == null)) {
            if (z) {
                C11279p.m20017b(findViewById);
            } else {
                C11279p.m20006a(findViewById);
            }
        }
        return newTab;
    }
}
