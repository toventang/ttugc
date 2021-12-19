package com.p2082ss.android.ugc.aweme.detail.base;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.detail.p2742a.C41104b;
import com.p2082ss.android.ugc.aweme.p3043g.p3044a.AbstractC52856g;
import com.p2082ss.android.ugc.aweme.p4205v.p4206a.AbstractC80640c;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.detail.base.a */
public final class C41112a implements AbstractC80640c {

    /* renamed from: a */
    public RemoteImageView f96106a;

    /* renamed from: b */
    private final Context f96107b;

    /* renamed from: c */
    private final int f96108c;

    static {
        Covode.recordClassIndex(48992);
    }

    @Override // com.p2082ss.android.ugc.aweme.p4205v.p4206a.AbstractC80640c
    /* renamed from: b */
    public final void mo70371b(RelativeLayout relativeLayout) {
        C89219l.m154721d(relativeLayout, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.p4205v.p4206a.AbstractC80640c
    /* renamed from: a */
    public final AbstractC52856g mo70369a(ViewGroup viewGroup) {
        C89219l.m154721d(viewGroup, "");
        return new C41104b(this.f96107b, viewGroup);
    }

    @Override // com.p2082ss.android.ugc.aweme.p4205v.p4206a.AbstractC80640c
    /* renamed from: a */
    public final void mo70370a(RelativeLayout relativeLayout) {
        MethodCollector.m26663i(11500);
        C89219l.m154721d(relativeLayout, "");
        View a = C1764a.m5927a(LayoutInflater.from(this.f96107b), R.layout.vy, relativeLayout, false);
        RemoteImageView remoteImageView = (RemoteImageView) a.findViewById(R.id.e6u);
        this.f96106a = remoteImageView;
        C34577e.m70591a(remoteImageView, this.f96108c);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(C41114c.m82816a(96), C41114c.m82816a(96));
        layoutParams.addRule(12);
        layoutParams.addRule(14);
        layoutParams.bottomMargin = C41114c.m82816a(8);
        relativeLayout.addView(a, layoutParams);
        MethodCollector.m26664o(11500);
    }

    public C41112a(Context context, int i) {
        C89219l.m154721d(context, "");
        this.f96107b = context;
        this.f96108c = i;
    }
}
