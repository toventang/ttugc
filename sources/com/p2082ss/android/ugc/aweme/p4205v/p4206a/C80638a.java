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

/* renamed from: com.ss.android.ugc.aweme.v.a.a */
public final class C80638a implements AbstractC80640c {

    /* renamed from: a */
    public View f180291a;

    /* renamed from: b */
    public AbstractC52856g f180292b;

    /* renamed from: c */
    private final Context f180293c;

    /* renamed from: d */
    private final LayoutInflater f180294d;

    /* renamed from: e */
    private final int f180295e;

    static {
        Covode.recordClassIndex(93912);
    }

    @Override // com.p2082ss.android.ugc.aweme.p4205v.p4206a.AbstractC80640c
    /* renamed from: a */
    public final AbstractC52856g mo70369a(ViewGroup viewGroup) {
        C89219l.m154721d(viewGroup, "");
        C52821a aVar = new C52821a(this.f180293c, viewGroup);
        this.f180292b = aVar;
        return aVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.p4205v.p4206a.AbstractC80640c
    /* renamed from: b */
    public final void mo70371b(RelativeLayout relativeLayout) {
        MethodCollector.m26663i(11195);
        C89219l.m154721d(relativeLayout, "");
        View view = this.f180291a;
        if (view != null) {
            relativeLayout.removeView(view);
        }
        MethodCollector.m26664o(11195);
    }

    @Override // com.p2082ss.android.ugc.aweme.p4205v.p4206a.AbstractC80640c
    /* renamed from: a */
    public final void mo70370a(RelativeLayout relativeLayout) {
        DmtTextView dmtTextView;
        MethodCollector.m26663i(11194);
        C89219l.m154721d(relativeLayout, "");
        View a = C1764a.m5927a(this.f180294d, R.layout.aem, relativeLayout, false);
        this.f180291a = a;
        View view = null;
        if (!(a == null || (dmtTextView = (DmtTextView) a.findViewById(R.id.e6w)) == null)) {
            dmtTextView.setText(this.f180293c.getString(this.f180295e));
        }
        View view2 = this.f180291a;
        int i = Build.VERSION.SDK_INT;
        if (view2 != null) {
            view = view2.findViewById(R.id.e6q);
        }
        int c = C0643b.m2378c(this.f180293c, R.color.bh);
        C80641d dVar = new C80641d(C13628n.m24520b(this.f180293c, 4.0f), BlurMaskFilter.Blur.NORMAL, C13628n.m24520b(this.f180293c, 2.0f), C0643b.m2378c(this.f180293c, R.color.h_));
        if (view != null) {
            view.setBackground(new C80642e(c, dVar));
        }
        relativeLayout.addView(this.f180291a);
        MethodCollector.m26664o(11194);
    }

    public C80638a(Context context, LayoutInflater layoutInflater, int i) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(layoutInflater, "");
        this.f180293c = context;
        this.f180294d = layoutInflater;
        this.f180295e = i;
    }
}
