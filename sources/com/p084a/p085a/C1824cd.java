package com.p084a.p085a;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.C0174a;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.xelement.pickview.p1392b.C19386b;
import com.bytedance.tux.badge.TuxAlertBadgeLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.p084a.p088b.AbstractC1876e;
import com.p084a.p088b.p089a.C1863a;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4169j.C79466e;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.a.a.cd */
public final class C1824cd implements AbstractC1876e {
    static {
        Covode.recordClassIndex(1994);
    }

    @Override // com.p084a.p088b.AbstractC1876e
    /* renamed from: a */
    public final View mo5574a(Context context, ViewGroup viewGroup, boolean z) {
        MethodCollector.m26663i(695);
        Resources resources = context.getResources();
        TuxAlertBadgeLayout tuxAlertBadgeLayout = new TuxAlertBadgeLayout(context);
        tuxAlertBadgeLayout.setId(R.id.aw4);
        ViewGroup.MarginLayoutParams a = C0174a.m576a(viewGroup, (int) TypedValue.applyDimension(1, 44.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 44.0f, resources.getDisplayMetrics()));
        if (RelativeLayout.LayoutParams.class.isInstance(a)) {
            ((RelativeLayout.LayoutParams) a).addRule(21, -1);
        }
        TuxIconView tuxIconView = new TuxIconView(context);
        tuxIconView.setId(R.id.ezd);
        ViewGroup.MarginLayoutParams a2 = C0174a.m576a(tuxAlertBadgeLayout, (int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(a2)) {
            ((LinearLayout.LayoutParams) a2).gravity = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(a2)) {
            ((FrameLayout.LayoutParams) a2).gravity = 17;
        }
        if (DrawerLayout.C0844d.class.isInstance(a2)) {
            ((DrawerLayout.C0844d) a2).f3113a = 17;
        }
        C79466e.m138186a("app:tux_icon", new C1863a.C1865b("2131755420", "raw"), tuxIconView, a2);
        C79466e.m138186a("app:tux_iconShadow", new C1863a.C1866c("true"), tuxIconView, a2);
        C79466e.m138186a("app:tux_tintColor", new C1863a.C1865b("2131099683", C19386b.f45894a), tuxIconView, a2);
        C79466e.m138185a(tuxIconView, a2);
        C0174a.m578a(tuxIconView);
        if (tuxIconView.getParent() == null) {
            tuxAlertBadgeLayout.addView(tuxIconView, a2);
        }
        C0174a.m578a(tuxAlertBadgeLayout);
        tuxAlertBadgeLayout.setLayoutParams(a);
        if (viewGroup != null && z) {
            viewGroup.addView(tuxAlertBadgeLayout);
        }
        MethodCollector.m26664o(695);
        return tuxAlertBadgeLayout;
    }
}
