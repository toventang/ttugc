package com.p2082ss.android.ugc.aweme.commercialize.profile.impl;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.commercialize.p2534ad.C37591b;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.commercialize.profile.api.AbstractC38392a;
import com.p2082ss.android.ugc.aweme.commercialize.profile.api.C38395d;
import com.p2082ss.android.ugc.aweme.commercialize.profile.api.C38396e;
import com.p2082ss.android.ugc.aweme.commercialize.uikit.p2617a.C38545a;
import com.p2082ss.android.ugc.aweme.commercialize.util.C38549a;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.profile.impl.a */
public class View$OnClickListenerC38428a implements View.OnClickListener, AbstractC38392a {

    /* renamed from: a */
    public Context f90785a;

    /* renamed from: b */
    public Aweme f90786b;

    /* renamed from: c */
    public C38395d f90787c;

    /* renamed from: d */
    public final LinearLayout f90788d;

    /* renamed from: e */
    private final AbstractC89244h f90789e = C89250i.m154773a((AbstractC89171a) new C38430b(this));

    /* renamed from: f */
    private final AbstractC89244h f90790f = C89250i.m154773a((AbstractC89171a) new C38429a(this));

    static {
        Covode.recordClassIndex(45936);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.profile.api.AbstractC38392a
    /* renamed from: a */
    public void mo66984a(int i) {
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.profile.api.AbstractC38392a
    /* renamed from: a */
    public void mo66986a(boolean z) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final TextView mo67011b() {
        return (TextView) this.f90789e.getValue();
    }

    public void onClick(View view) {
        ClickAgent.onClick(view);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.profile.impl.a$a */
    static final class C38429a extends AbstractC89220m implements AbstractC89171a<View> {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC38428a f90791a;

        static {
            Covode.recordClassIndex(45937);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38429a(View$OnClickListenerC38428a aVar) {
            super(0);
            this.f90791a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ View invoke() {
            return this.f90791a.f90788d.findViewById(R.id.dh);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.profile.impl.a$b */
    static final class C38430b extends AbstractC89220m implements AbstractC89171a<TextView> {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC38428a f90792a;

        static {
            Covode.recordClassIndex(45938);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38430b(View$OnClickListenerC38428a aVar) {
            super(0);
            this.f90792a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TextView invoke() {
            return this.f90792a.f90788d.findViewById(R.id.dj);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.profile.api.AbstractC38392a
    /* renamed from: a */
    public void mo66983a() {
        this.f90788d.setOnClickListener(this);
        ((View) this.f90790f.getValue()).setOnClickListener(this);
        mo67011b().setOnClickListener(this);
    }

    public View$OnClickListenerC38428a(LinearLayout linearLayout) {
        C89219l.m154721d(linearLayout, "");
        this.f90788d = linearLayout;
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.profile.api.AbstractC38392a
    /* renamed from: a */
    public void mo66985a(C38396e eVar) {
        AwemeRawAd awemeRawAd;
        C89219l.m154721d(eVar, "");
        this.f90786b = eVar.f90717b;
        this.f90785a = eVar.f90716a;
        this.f90787c = eVar.f90719d;
        C38545a.m78162a(mo67011b());
        TextView b = mo67011b();
        float a = (float) C34728n.m70946a(2.0d);
        Aweme aweme = this.f90786b;
        if (aweme != null) {
            awemeRawAd = aweme.getAwemeRawAd();
        } else {
            awemeRawAd = null;
        }
        b.setBackground(new C37591b(a, Color.parseColor(C37699a.m76287c(awemeRawAd))));
        mo67011b().setText(C38549a.m78165a(this.f90785a, this.f90786b, false));
    }
}
