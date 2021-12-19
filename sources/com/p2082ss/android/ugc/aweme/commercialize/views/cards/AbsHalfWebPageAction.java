package com.p2082ss.android.ugc.aweme.commercialize.views.cards;

import android.content.Context;
import android.text.TextUtils;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33942b;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p2082ss.android.ugc.aweme.commercialize.log.C38164aj;
import com.p2082ss.android.ugc.aweme.commercialize.log.C38182f;
import com.p2082ss.android.ugc.aweme.commercialize.log.C38189j;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38234e;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38661b;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38739d;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import org.greenrobot.eventbus.EventBus;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.cards.AbsHalfWebPageAction */
public abstract class AbsHalfWebPageAction implements AbstractC1214u<C33942b>, AbstractC38883ai, AbstractC38883ai {

    /* renamed from: h */
    static final /* synthetic */ boolean f91757h = true;

    /* renamed from: b */
    protected Context f91758b;

    /* renamed from: c */
    protected Aweme f91759c;

    /* renamed from: d */
    protected AbstractC38878ae f91760d;

    /* renamed from: e */
    protected DataCenter f91761e = new DataCenter();

    /* renamed from: f */
    protected boolean f91762f = false;

    /* renamed from: g */
    protected boolean f91763g = false;

    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_CREATE) {
            onCreate();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_RESUME) {
            onResume();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            onDestroy();
        }
    }

    /* renamed from: e */
    public void mo67490e() {
        mo67495j();
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbstractC38883ai
    /* renamed from: i */
    public final boolean mo67494i() {
        return this.f91763g;
    }

    /* access modifiers changed from: package-private */
    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_CREATE)
    public void onCreate() {
        mo67495j();
    }

    /* access modifiers changed from: package-private */
    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_RESUME)
    public void onResume() {
        mo67495j();
    }

    /* renamed from: g */
    public void mo67492g() {
        mo67495j();
        this.f91763g = true;
    }

    /* renamed from: h */
    public void mo67493h() {
        mo67495j();
        this.f91763g = false;
    }

    static {
        Covode.recordClassIndex(46415);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo67495j() {
        getClass().getSimpleName();
        hashCode();
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbstractC38883ai
    /* renamed from: c */
    public final void mo67488c() {
        this.f91761e.mo60188a(this);
        if (EventBus.m156962a().mo145393a(this)) {
            EventBus.m156962a().mo145395b(this);
        }
    }

    /* access modifiers changed from: protected */
    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public void onDestroy() {
        mo67495j();
        this.f91760d.mo67536b().getLifecycle().mo4013b(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo67486b() {
        DataCenter dataCenter = this.f91761e;
        if (dataCenter != null) {
            dataCenter.mo60189a("ON_AD_HALF_WEB_PAGE_SHOW", (AbstractC1214u<C33942b>) this);
            this.f91761e.mo60189a("ON_AD_HALF_WEB_PAGE_SHOW_FAIL", (AbstractC1214u<C33942b>) this);
            this.f91761e.mo60189a("ON_AD_HALF_WEB_PAGE_SHOW_CANCEL", (AbstractC1214u<C33942b>) this);
            this.f91761e.mo60189a("ON_AD_HALF_WEB_PAGE_CLICK_COVER", (AbstractC1214u<C33942b>) this);
            this.f91761e.mo60189a("ON_AD_HALF_WEB_PAGE_HIDE", (AbstractC1214u<C33942b>) this);
            this.f91761e.mo60189a("ON_AD_HALF_WEB_PAGE_EXPAND", (AbstractC1214u<C33942b>) this);
            this.f91761e.mo60189a("ON_AD_HALF_WEB_PAGE_EXPAND_FAIL", (AbstractC1214u<C33942b>) this);
            this.f91761e.mo60189a("ON_AD_HALF_WEB_PAGE_COLLAPSE", (AbstractC1214u<C33942b>) this);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbstractC38883ai
    /* renamed from: f */
    public void mo67491f() {
        mo67495j();
        mo67484a(new C38661b.C38662a().mo67230a("close").mo67233b("card").mo67229a(this.f91759c).mo67237f(C37699a.m76315t(this.f91759c)).mo67228a(C37699a.m76316u(this.f91759c)).mo67232a());
    }

    /* renamed from: d */
    public void mo67489d() {
        mo67495j();
        mo67484a(new C38661b.C38662a().mo67230a("othershow").mo67233b("card").mo67229a(this.f91759c).mo67231a(C38739d.m78577d(this.f91759c)).mo67237f(C37699a.m76315t(this.f91759c)).mo67228a(C37699a.m76316u(this.f91759c)).mo67232a());
        if (this.f91762f) {
            this.f91760d.mo67534a(false);
        }
    }

    /* renamed from: b */
    public void mo67487b(String str) {
        mo67495j();
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbstractC38883ai
    /* renamed from: a */
    public final void mo67482a(DataCenter dataCenter) {
        this.f91761e = dataCenter;
        mo67486b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo67484a(C38661b bVar) {
        mo67495j();
        C38189j.m77475a(this.f91758b, bVar);
        m78798b(bVar);
    }

    /* renamed from: a */
    public void mo67485a(String str) {
        mo67495j();
        mo67484a(new C38661b.C38662a().mo67230a("othershow_fail").mo67233b("card").mo67234c(str).mo67229a(this.f91759c).mo67231a(C38739d.m78577d(this.f91759c)).mo67237f(C37699a.m76315t(this.f91759c)).mo67228a(C37699a.m76316u(this.f91759c)).mo67232a());
    }

    /* renamed from: b */
    private void m78798b(C38661b bVar) {
        String str;
        if (C37699a.m76314s(bVar.f91341a)) {
            if (f91757h || bVar.f91341a.getAwemeRawAd() != null) {
                AwemeRawAd awemeRawAd = bVar.f91341a.getAwemeRawAd();
                String str2 = bVar.f91342b;
                str2.hashCode();
                if (!str2.equals("othershow")) {
                    if (str2.equals("click")) {
                        C38164aj.m77369a("click", awemeRawAd.getClickTrackUrlList(), awemeRawAd.getCreativeId(), awemeRawAd.getLogExtra(), new C38864a(awemeRawAd));
                    }
                } else if (awemeRawAd.getCardInfos() != null) {
                    String str3 = bVar.f91343c;
                    TextUtils.equals(str3, "card");
                    if (TextUtils.equals(str3, "coupon")) {
                        str = "4";
                    } else {
                        str = "3";
                    }
                    if (awemeRawAd.getCardInfos().containsKey(str)) {
                        C38164aj.m77369a("othershow", awemeRawAd.getCardInfos().get(str).getTrackUrlList(), awemeRawAd.getCreativeId(), awemeRawAd.getLogExtra(), new C38885b(this));
                    }
                }
            } else {
                throw new AssertionError();
            }
        }
    }

    /* renamed from: a */
    public void onChanged(C33942b bVar) {
        if (bVar != null) {
            String str = bVar.f80277a;
            str.hashCode();
            switch (str.hashCode()) {
                case -1528248849:
                    if (str.equals("ON_AD_HALF_WEB_PAGE_EXPAND")) {
                        mo67492g();
                        return;
                    }
                    return;
                case -1501644853:
                    if (str.equals("ON_AD_HALF_WEB_PAGE_CLICK_COVER")) {
                        mo67490e();
                        return;
                    }
                    return;
                case -1393672249:
                    if (str.equals("ON_AD_HALF_WEB_PAGE_SHOW_CANCEL")) {
                        bVar.mo60212a();
                        mo67495j();
                        return;
                    }
                    return;
                case -201580690:
                    if (str.equals("ON_AD_HALF_WEB_PAGE_EXPAND_FAIL")) {
                        mo67487b((String) bVar.mo60212a());
                        return;
                    }
                    return;
                case 995285931:
                    if (str.equals("ON_AD_HALF_WEB_PAGE_SHOW_FAIL")) {
                        mo67485a((String) bVar.mo60212a());
                        return;
                    }
                    return;
                case 1538688450:
                    if (str.equals("ON_AD_HALF_WEB_PAGE_COLLAPSE")) {
                        mo67493h();
                        return;
                    }
                    return;
                case 2116917719:
                    if (str.equals("ON_AD_HALF_WEB_PAGE_HIDE")) {
                        C38234e eVar = (C38234e) bVar.mo60212a();
                        if (eVar == null || eVar.f90342b) {
                            mo67491f();
                            return;
                        }
                        return;
                    }
                    return;
                case 2117244818:
                    if (str.equals("ON_AD_HALF_WEB_PAGE_SHOW")) {
                        mo67489d();
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ C38182f.C38184b mo67481a(C38182f.C38184b bVar, Boolean bool) {
        if (bool.booleanValue()) {
            return bVar.mo66497b(this.f91759c);
        }
        return bVar.mo66488a(this.f91759c);
    }

    public AbsHalfWebPageAction(Context context, Aweme aweme, AbstractC38878ae aeVar) {
        this.f91758b = context;
        this.f91759c = aweme;
        this.f91760d = aeVar;
        aeVar.mo67536b().getLifecycle().mo4012a(this);
    }
}
