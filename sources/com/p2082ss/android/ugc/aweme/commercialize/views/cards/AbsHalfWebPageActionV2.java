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
import com.p2082ss.android.ugc.aweme.commercialize.depend.C37663b;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38234e;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38661b;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.feed.model.CardStruct;
import org.greenrobot.eventbus.EventBus;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.cards.AbsHalfWebPageActionV2 */
public abstract class AbsHalfWebPageActionV2 implements AbstractC1214u<C33942b>, AbstractC38883ai, AbstractC38883ai {

    /* renamed from: h */
    static final /* synthetic */ boolean f91764h = true;

    /* renamed from: b */
    protected Context f91765b;

    /* renamed from: c */
    protected Aweme f91766c;

    /* renamed from: d */
    protected AbstractC38878ae f91767d;

    /* renamed from: e */
    protected DataCenter f91768e = new DataCenter();

    /* renamed from: f */
    protected boolean f91769f = false;

    /* renamed from: g */
    protected boolean f91770g = false;

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
    public void mo67503e() {
        mo67506j();
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbstractC38883ai
    /* renamed from: i */
    public final boolean mo67494i() {
        return this.f91770g;
    }

    /* access modifiers changed from: package-private */
    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_CREATE)
    public void onCreate() {
        mo67506j();
    }

    /* access modifiers changed from: package-private */
    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_RESUME)
    public void onResume() {
        mo67506j();
    }

    /* renamed from: g */
    public void mo67504g() {
        mo67506j();
        this.f91770g = true;
    }

    /* renamed from: h */
    public void mo67505h() {
        mo67506j();
        this.f91770g = false;
    }

    static {
        Covode.recordClassIndex(46416);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo67506j() {
        getClass().getSimpleName();
        hashCode();
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbstractC38883ai
    /* renamed from: c */
    public final void mo67488c() {
        this.f91768e.mo60188a(this);
        if (EventBus.m156962a().mo145393a(this)) {
            EventBus.m156962a().mo145395b(this);
        }
    }

    /* access modifiers changed from: protected */
    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public void onDestroy() {
        mo67506j();
        this.f91767d.mo67536b().getLifecycle().mo4013b(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo67500b() {
        DataCenter dataCenter = this.f91768e;
        if (dataCenter != null) {
            dataCenter.mo60189a("ON_AD_HALF_WEB_PAGE_SHOW", (AbstractC1214u<C33942b>) this);
            this.f91768e.mo60189a("ON_AD_HALF_WEB_PAGE_SHOW_FAIL", (AbstractC1214u<C33942b>) this);
            this.f91768e.mo60189a("ON_AD_HALF_WEB_PAGE_SHOW_CANCEL", (AbstractC1214u<C33942b>) this);
            this.f91768e.mo60189a("ON_AD_HALF_WEB_PAGE_CLICK_COVER", (AbstractC1214u<C33942b>) this);
            this.f91768e.mo60189a("ON_AD_HALF_WEB_PAGE_HIDE", (AbstractC1214u<C33942b>) this);
            this.f91768e.mo60189a("ON_AD_HALF_WEB_PAGE_EXPAND", (AbstractC1214u<C33942b>) this);
            this.f91768e.mo60189a("ON_AD_HALF_WEB_PAGE_EXPAND_FAIL", (AbstractC1214u<C33942b>) this);
            this.f91768e.mo60189a("ON_AD_HALF_WEB_PAGE_COLLAPSE", (AbstractC1214u<C33942b>) this);
        }
    }

    /* renamed from: d */
    public void mo67502d() {
        String str;
        long j;
        boolean z;
        mo67506j();
        if (C37663b.f89031b.mo65688a() != null) {
            z = C37663b.f89031b.mo65688a().mo65675g(this.f91766c);
            str = C37663b.f89031b.mo65688a().mo65668d(this.f91766c);
            j = C37663b.f89031b.mo65688a().mo65670e(this.f91766c);
        } else {
            str = "";
            j = 0;
            z = false;
        }
        mo67498a(new C38661b.C38662a().mo67230a("othershow").mo67233b("card").mo67229a(this.f91766c).mo67231a(z).mo67237f(str).mo67228a(j).mo67232a());
        if (this.f91769f) {
            this.f91767d.mo67534a(false);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbstractC38883ai
    /* renamed from: f */
    public void mo67491f() {
        String str;
        long j;
        mo67506j();
        if (C37663b.f89031b.mo65688a() != null) {
            str = C37663b.f89031b.mo65688a().mo65668d(this.f91766c);
            j = C37663b.f89031b.mo65688a().mo65670e(this.f91766c);
        } else {
            str = "";
            j = 0;
        }
        mo67498a(new C38661b.C38662a().mo67230a("close").mo67233b("card").mo67229a(this.f91766c).mo67237f(str).mo67228a(j).mo67232a());
    }

    /* renamed from: b */
    public void mo67501b(String str) {
        mo67506j();
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbstractC38883ai
    /* renamed from: a */
    public final void mo67482a(DataCenter dataCenter) {
        this.f91768e = dataCenter;
        mo67500b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo67498a(C38661b bVar) {
        mo67506j();
        if (C37663b.f89031b.mo65688a() != null) {
            C37663b.f89031b.mo65688a().mo65650a(this.f91765b, bVar);
        }
        m78814b(bVar);
    }

    /* renamed from: a */
    public void mo67499a(String str) {
        boolean z;
        String str2;
        long j;
        mo67506j();
        if (C37663b.f89031b.mo65688a() != null) {
            z = C37663b.f89031b.mo65688a().mo65675g(this.f91766c);
            str2 = C37663b.f89031b.mo65688a().mo65668d(this.f91766c);
            j = C37663b.f89031b.mo65688a().mo65670e(this.f91766c);
        } else {
            z = false;
            str2 = "";
            j = 0;
        }
        mo67498a(new C38661b.C38662a().mo67230a("othershow_fail").mo67233b("card").mo67234c(str).mo67229a(this.f91766c).mo67231a(z).mo67237f(str2).mo67228a(j).mo67232a());
    }

    /* renamed from: b */
    private void m78814b(C38661b bVar) {
        String str;
        if (C37663b.f89031b.mo65688a() != null && C37663b.f89031b.mo65688a().mo65676h(bVar.f91341a)) {
            if (f91764h || bVar.f91341a.getAwemeRawAd() != null) {
                AwemeRawAd awemeRawAd = bVar.f91341a.getAwemeRawAd();
                String str2 = bVar.f91342b;
                str2.hashCode();
                if (!str2.equals("othershow")) {
                    if (str2.equals("click") && C37663b.f89031b.mo65688a() != null) {
                        C37663b.f89031b.mo65688a().mo65656a("click", awemeRawAd);
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
                        CardStruct cardStruct = awemeRawAd.getCardInfos().get(str);
                        if (C37663b.f89031b.mo65688a() != null) {
                            C37663b.f89031b.mo65688a().mo65655a("othershow", cardStruct.getTrackUrlList(), this.f91766c);
                        }
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
                        mo67504g();
                        return;
                    }
                    return;
                case -1501644853:
                    if (str.equals("ON_AD_HALF_WEB_PAGE_CLICK_COVER")) {
                        mo67503e();
                        return;
                    }
                    return;
                case -1393672249:
                    if (str.equals("ON_AD_HALF_WEB_PAGE_SHOW_CANCEL")) {
                        bVar.mo60212a();
                        mo67506j();
                        return;
                    }
                    return;
                case -201580690:
                    if (str.equals("ON_AD_HALF_WEB_PAGE_EXPAND_FAIL")) {
                        mo67501b((String) bVar.mo60212a());
                        return;
                    }
                    return;
                case 995285931:
                    if (str.equals("ON_AD_HALF_WEB_PAGE_SHOW_FAIL")) {
                        mo67499a((String) bVar.mo60212a());
                        return;
                    }
                    return;
                case 1538688450:
                    if (str.equals("ON_AD_HALF_WEB_PAGE_COLLAPSE")) {
                        mo67505h();
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
                        mo67502d();
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    public AbsHalfWebPageActionV2(Context context, Aweme aweme, AbstractC38878ae aeVar) {
        this.f91765b = context;
        this.f91766c = aweme;
        this.f91767d = aeVar;
        aeVar.mo67536b().getLifecycle().mo4012a(this);
    }
}
