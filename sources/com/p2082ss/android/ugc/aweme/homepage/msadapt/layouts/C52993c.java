package com.p2082ss.android.ugc.aweme.homepage.msadapt.layouts;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.core.content.C0643b;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.homepage.msadapt.core.C52981a;
import com.p2082ss.android.ugc.aweme.homepage.msadapt.core.EnumC52983b;
import com.p2082ss.android.ugc.aweme.homepage.msadapt.layouts.SurfaceDuoLayout;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.homepage.msadapt.layouts.c */
public final class C52993c {

    /* renamed from: a */
    EnumC52983b f121854a = EnumC52983b.SINGLE_SCREEN;

    /* renamed from: b */
    final Context f121855b;

    /* renamed from: c */
    final SurfaceDuoLayout f121856c;

    /* renamed from: d */
    private final SurfaceDuoLayout.C52988a f121857d;

    static {
        Covode.recordClassIndex(62531);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo89442a() {
        if (this.f121856c.getOrientation() != 1 || !this.f121857d.f121845g) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo89443b() {
        if (this.f121856c.getOrientation() != 0 || !this.f121857d.f121843e) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    private final FrameLayout m97927d() {
        MethodCollector.m26663i(9733);
        FrameLayout frameLayout = new FrameLayout(this.f121856c.getContext());
        frameLayout.setId(R.id.b2n);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        MethodCollector.m26664o(9733);
        return frameLayout;
    }

    /* renamed from: e */
    private final View m97928e() {
        MethodCollector.m26663i(9887);
        View view = new View(this.f121856c.getContext());
        view.setId(R.id.bf1);
        Rect a = C52981a.C52982a.m97910a(this.f121855b);
        if (a != null) {
            view.setLayoutParams(new FrameLayout.LayoutParams(a.width(), a.height()));
        }
        view.setBackground(new ColorDrawable(C0643b.m2378c(this.f121855b, R.color.a2)));
        MethodCollector.m26664o(9887);
        return view;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo89444c() {
        MethodCollector.m26663i(9581);
        View e = m97928e();
        FrameLayout frameLayout = new FrameLayout(this.f121856c.getContext());
        frameLayout.setId(R.id.dt2);
        List<Rect> c = C52981a.C52982a.m97913c(this.f121855b);
        if (c != null) {
            int orientation = this.f121856c.getOrientation();
            View findViewById = this.f121856c.findViewById(R.id.b2n);
            C89219l.m154716b(findViewById, "");
            m97926a(orientation, (FrameLayout) findViewById, frameLayout, c.get(0), c.get(1));
        }
        Integer valueOf = Integer.valueOf(this.f121857d.f121841c);
        if (!(valueOf.intValue() == -1 || valueOf == null)) {
            valueOf.intValue();
            frameLayout.addView(C1764a.m5927a(LayoutInflater.from(this.f121855b), this.f121857d.f121841c, this.f121856c, false));
        }
        this.f121856c.addView(e);
        this.f121856c.addView(frameLayout);
        this.f121854a = EnumC52983b.DUAL_SCREEN;
        MethodCollector.m26664o(9581);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0035, code lost:
        if (r2 != 3) goto L_0x0037;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C52993c(android.content.Context r7, com.p2082ss.android.ugc.aweme.homepage.msadapt.layouts.SurfaceDuoLayout r8, com.p2082ss.android.ugc.aweme.homepage.msadapt.layouts.SurfaceDuoLayout.C52988a r9) {
        /*
        // Method dump skipped, instructions count: 221
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.homepage.msadapt.layouts.C52993c.<init>(android.content.Context, com.ss.android.ugc.aweme.homepage.msadapt.layouts.SurfaceDuoLayout, com.ss.android.ugc.aweme.homepage.msadapt.layouts.SurfaceDuoLayout$a):void");
    }

    /* renamed from: a */
    private final void m97925a(int i, Rect rect, Rect rect2) {
        boolean z;
        MethodCollector.m26663i(9885);
        this.f121856c.setOrientation(i);
        View e = m97928e();
        FrameLayout frameLayout = new FrameLayout(this.f121856c.getContext());
        frameLayout.setId(R.id.b2n);
        FrameLayout frameLayout2 = new FrameLayout(this.f121856c.getContext());
        frameLayout2.setId(R.id.dt2);
        m97926a(i, frameLayout, frameLayout2, rect, rect2);
        Integer valueOf = Integer.valueOf(this.f121857d.f121840b);
        if (valueOf.intValue() != -1) {
            z = true;
        } else {
            z = false;
        }
        if (z && valueOf != null) {
            valueOf.intValue();
            frameLayout.addView(C1764a.m5927a(LayoutInflater.from(this.f121855b), this.f121857d.f121840b, this.f121856c, false));
        }
        Integer valueOf2 = Integer.valueOf(this.f121857d.f121841c);
        if (!(valueOf2.intValue() == -1 || valueOf2 == null)) {
            valueOf2.intValue();
            frameLayout2.addView(C1764a.m5927a(LayoutInflater.from(this.f121855b), this.f121857d.f121841c, this.f121856c, false));
        }
        this.f121856c.addView(frameLayout);
        this.f121856c.addView(e);
        this.f121856c.addView(frameLayout2);
        MethodCollector.m26664o(9885);
    }

    /* renamed from: a */
    private static void m97926a(int i, FrameLayout frameLayout, FrameLayout frameLayout2, Rect rect, Rect rect2) {
        if (i == 1) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
            layoutParams.weight = 1.0f;
            frameLayout.setLayoutParams(layoutParams);
            frameLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, rect2.height()));
            return;
        }
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(rect.width(), -1));
        frameLayout2.setLayoutParams(new LinearLayout.LayoutParams(rect2.width(), -1));
    }
}
