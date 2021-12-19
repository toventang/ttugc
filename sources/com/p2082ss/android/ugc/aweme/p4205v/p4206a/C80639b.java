package com.p2082ss.android.ugc.aweme.p4205v.p4206a;

import android.content.Context;
import android.graphics.BlurMaskFilter;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.core.content.C0643b;
import com.C1764a;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.widget.DmtTextView;
import com.p2082ss.android.ugc.aweme.p3043g.p3044a.AbstractC52856g;
import com.p2082ss.android.ugc.aweme.p3043g.p3044a.C52821a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.v.a.b */
public final class C80639b implements AbstractC80640c {

    /* renamed from: a */
    private View f180296a;

    /* renamed from: b */
    private final Context f180297b;

    /* renamed from: c */
    private final LayoutInflater f180298c;

    /* renamed from: d */
    private final int f180299d = R.string.f2j;

    /* renamed from: e */
    private final int f180300e = R.string.cp;

    static {
        Covode.recordClassIndex(93913);
    }

    @Override // com.p2082ss.android.ugc.aweme.p4205v.p4206a.AbstractC80640c
    /* renamed from: a */
    public final AbstractC52856g mo70369a(ViewGroup viewGroup) {
        C89219l.m154721d(viewGroup, "");
        return new C52821a(this.f180297b, viewGroup);
    }

    @Override // com.p2082ss.android.ugc.aweme.p4205v.p4206a.AbstractC80640c
    /* renamed from: b */
    public final void mo70371b(RelativeLayout relativeLayout) {
        MethodCollector.m26663i(10757);
        C89219l.m154721d(relativeLayout, "");
        View view = this.f180296a;
        if (view != null) {
            relativeLayout.removeView(view);
        }
        MethodCollector.m26664o(10757);
    }

    @Override // com.p2082ss.android.ugc.aweme.p4205v.p4206a.AbstractC80640c
    /* renamed from: a */
    public final void mo70370a(RelativeLayout relativeLayout) {
        View view;
        DmtTextView dmtTextView;
        DmtTextView dmtTextView2;
        MethodCollector.m26663i(10615);
        C89219l.m154721d(relativeLayout, "");
        View a = C1764a.m5927a(this.f180298c, R.layout.aen, relativeLayout, false);
        this.f180296a = a;
        View view2 = null;
        if (!(a == null || (dmtTextView2 = (DmtTextView) a.findViewById(R.id.bpv)) == null)) {
            dmtTextView2.setText(this.f180297b.getString(this.f180299d));
        }
        View view3 = this.f180296a;
        int i = Build.VERSION.SDK_INT;
        if (view3 != null) {
            view = view3.findViewById(R.id.bq7);
        } else {
            view = null;
        }
        int c = C0643b.m2378c(this.f180297b, R.color.a9);
        C80641d dVar = new C80641d(C13628n.m24520b(this.f180297b, 4.0f), BlurMaskFilter.Blur.NORMAL, C13628n.m24520b(this.f180297b, 2.0f), C0643b.m2378c(this.f180297b, R.color.h_));
        if (view != null) {
            view.setBackground(new C80642e(c, dVar));
        }
        View view4 = this.f180296a;
        if (!(view4 == null || (dmtTextView = (DmtTextView) view4.findViewById(R.id.e6w)) == null)) {
            dmtTextView.setText(this.f180297b.getString(this.f180300e));
        }
        View view5 = this.f180296a;
        int i2 = Build.VERSION.SDK_INT;
        if (view5 != null) {
            view2 = view5.findViewById(R.id.dgh);
        }
        int c2 = C0643b.m2378c(this.f180297b, R.color.bh);
        C80641d dVar2 = new C80641d(C13628n.m24520b(this.f180297b, 4.0f), BlurMaskFilter.Blur.NORMAL, C13628n.m24520b(this.f180297b, 2.0f), C0643b.m2378c(this.f180297b, R.color.h_));
        if (view2 != null) {
            view2.setBackground(new C80642e(c2, dVar2));
        }
        relativeLayout.addView(this.f180296a);
        MethodCollector.m26664o(10615);
    }

    public C80639b(Context context, LayoutInflater layoutInflater) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(layoutInflater, "");
        this.f180297b = context;
        this.f180298c = layoutInflater;
    }
}
