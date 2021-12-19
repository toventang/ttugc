package com.bytedance.android.live.effect.p243d;

import android.view.View;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.covode.number.Covode;
import com.google.android.material.tabs.TabLayout;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.live.effect.d.f */
public final class C4237f {
    static {
        Covode.recordClassIndex(4807);
    }

    /* renamed from: a */
    public static final void m10341a(TabLayout.C26722f fVar) {
        View findViewById;
        View findViewById2;
        if (fVar != null) {
            View view = fVar.f63312f;
            if (!(view == null || (findViewById2 = view.findViewById(R.id.ee8)) == null)) {
                findViewById2.setAlpha(0.5f);
            }
            View view2 = fVar.f63312f;
            if (view2 != null && (findViewById = view2.findViewById(R.id.ee1)) != null) {
                C11279p.m20006a(findViewById);
            }
        }
    }

    /* renamed from: b */
    public static final void m10342b(TabLayout.C26722f fVar) {
        View findViewById;
        View findViewById2;
        View findViewById3;
        if (fVar != null) {
            View view = fVar.f63312f;
            if (!(view == null || (findViewById3 = view.findViewById(R.id.ee8)) == null)) {
                findViewById3.setAlpha(0.9f);
            }
            View view2 = fVar.f63312f;
            if (!(view2 == null || (findViewById2 = view2.findViewById(R.id.ee1)) == null)) {
                C11279p.m20017b(findViewById2);
            }
            View view3 = fVar.f63312f;
            if (view3 != null && (findViewById = view3.findViewById(R.id.eea)) != null) {
                C11279p.m20006a(findViewById);
            }
        }
    }
}
