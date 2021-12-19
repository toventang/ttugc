package com.p2082ss.android.ugc.aweme.p2282ad.feed.mask;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.commercialize.log.C38187i;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.commercialize_ad_api.p2626a.AbstractC39043a;
import com.p2082ss.android.ugc.aweme.commercialize_x.service.CommercializeAdServiceImpl;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.mask.p2301a.AbstractC33305a;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.p2296e.AbstractC33253a;
import com.p2082ss.android.ugc.aweme.p2282ad.p2290d.C33178a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ad.feed.mask.d */
public abstract class AbstractView$OnClickListenerC33314d implements View.OnClickListener {

    /* renamed from: a */
    public final Context f79148a;

    /* renamed from: b */
    public final Aweme f79149b;

    /* renamed from: c */
    public final AbstractC33305a f79150c;

    /* renamed from: d */
    public final String f79151d;

    /* renamed from: e */
    public final LinearLayout f79152e;

    /* renamed from: f */
    private final AbstractC89244h f79153f;

    /* renamed from: g */
    private final AbstractC89244h f79154g;

    static {
        Covode.recordClassIndex(40147);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final TextView mo59309a() {
        return (TextView) this.f79153f.getValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo59310a(View view);

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final TextView mo59311b() {
        return (TextView) this.f79154g.getValue();
    }

    /* renamed from: c */
    public abstract void mo59312c();

    /* renamed from: com.ss.android.ugc.aweme.ad.feed.mask.d$a */
    static final class C33315a extends AbstractC89220m implements AbstractC89171a<TextView> {

        /* renamed from: a */
        final /* synthetic */ AbstractView$OnClickListenerC33314d f79155a;

        static {
            Covode.recordClassIndex(40148);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33315a(AbstractView$OnClickListenerC33314d dVar) {
            super(0);
            this.f79155a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TextView invoke() {
            return this.f79155a.f79152e.findViewById(R.id.azt);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.feed.mask.d$b */
    static final class C33316b extends AbstractC89220m implements AbstractC89171a<TextView> {

        /* renamed from: a */
        final /* synthetic */ AbstractView$OnClickListenerC33314d f79156a;

        static {
            Covode.recordClassIndex(40149);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33316b(AbstractView$OnClickListenerC33314d dVar) {
            super(0);
            this.f79156a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TextView invoke() {
            return this.f79156a.f79152e.findViewById(R.id.azy);
        }
    }

    public void onClick(View view) {
        Integer valueOf;
        AbstractC39043a a;
        ClickAgent.onClick(view);
        boolean E = C37699a.m76202E(this.f79149b);
        if (this.f79149b.isAd() || !E) {
            if (!(view == null || (valueOf = Integer.valueOf(view.getId())) == null)) {
                if (valueOf.intValue() == R.id.azt) {
                    this.f79150c.mo59294a(3);
                    this.f79150c.mo59295a(false, true);
                    return;
                } else if (valueOf.intValue() == R.id.azv || valueOf.intValue() == R.id.azy) {
                    if (C37699a.m76314s(this.f79149b)) {
                        AwemeRawAd awemeRawAd = this.f79149b.getAwemeRawAd();
                        C38187i.C38188a aVar = new C38187i.C38188a();
                        aVar.f90222a = awemeRawAd;
                        aVar.f90223b = "button";
                        C33178a.m67998a("replay", awemeRawAd, aVar.mo66507a());
                        if (!(awemeRawAd == null || (a = CommercializeAdServiceImpl.m79243a().mo67720a(4)) == null || !(a instanceof AbstractC33253a))) {
                            ((AbstractC33253a) a).mo59211a(awemeRawAd);
                        }
                        C18129a.m33746a("background_ad", "replay", awemeRawAd).mo28900b("refer", "button").mo28902c();
                        this.f79150c.mo59293a();
                    }
                    this.f79150c.mo59295a(true, false);
                    return;
                }
            }
            mo59310a(view);
        } else if (view != null) {
            new C23144b(view).mo37640e(R.string.o6).mo37637b();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final View mo59308a(ViewGroup viewGroup, int i) {
        C89219l.m154721d(viewGroup, "");
        View findViewById = viewGroup.findViewById(R.id.b4w);
        C89219l.m154716b(findViewById, "");
        FrameLayout frameLayout = (FrameLayout) findViewById;
        frameLayout.removeAllViews();
        View a = C1764a.m5927a(LayoutInflater.from(this.f79148a), i, frameLayout, false);
        C89219l.m154716b(a, "");
        frameLayout.addView(a);
        this.f79152e.setOnClickListener(this);
        return a;
    }

    public AbstractView$OnClickListenerC33314d(LinearLayout linearLayout, C33313c cVar) {
        C89219l.m154721d(linearLayout, "");
        C89219l.m154721d(cVar, "");
        this.f79152e = linearLayout;
        this.f79148a = cVar.mo59306b();
        this.f79149b = cVar.mo59307c();
        AbstractC33305a aVar = cVar.f79144c;
        if (aVar == null) {
            C89219l.m154710a("adMaskCallback");
        }
        this.f79150c = aVar;
        String str = cVar.f79145d;
        if (str == null) {
            C89219l.m154710a("eventType");
        }
        this.f79151d = str;
        this.f79153f = C89250i.m154773a((AbstractC89171a) new C33315a(this));
        this.f79154g = C89250i.m154773a((AbstractC89171a) new C33316b(this));
    }
}
