package com.p2082ss.android.ugc.aweme.profile.p3565a;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.loader.SmartImageView;
import com.p2082ss.android.p2085a.p2086a.p2087a.C29339a;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39059e;
import com.p2082ss.android.ugc.aweme.draft.model.C43223c;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.profile.a.e */
public final class C63356e extends AbstractC39059e<C43223c> {

    /* renamed from: a */
    public Context f143852a;

    /* renamed from: b */
    SmartImageView f143853b;

    /* renamed from: c */
    TextView f143854c;

    /* renamed from: d */
    TextView f143855d;

    static {
        Covode.recordClassIndex(74647);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39062g
    /* renamed from: c */
    public final void mo62381c() {
    }

    public C63356e(View view) {
        super(view);
        this.f143852a = view.getContext();
        SmartImageView smartImageView = (SmartImageView) view.findViewById(R.id.afn);
        this.f143853b = smartImageView;
        smartImageView.setOnClickListener(new View$OnClickListenerC63358f(this));
        this.f143854c = (TextView) view.findViewById(R.id.eve);
        this.f143855d = (TextView) view.findViewById(R.id.evd);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo67806a(C43223c cVar, int i) {
        if (cVar != null) {
            C29339a.m58754b(new RunnableC63359g(this, cVar, i));
        }
    }
}
