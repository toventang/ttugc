package com.p2082ss.android.ugc.aweme.commercialize.views.cards;

import android.content.Context;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.commercialize.event.AdCardClose;
import com.p2082ss.android.ugc.aweme.commercialize.event.C37836e;
import com.p2082ss.android.ugc.aweme.commercialize.log.C38189j;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38661b;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38767w;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.cards.FormAdCardAction */
public class FormAdCardAction extends AbsAdCardAction implements AbstractC33974au, AbstractC90253j {

    /* renamed from: i */
    private boolean f91773i;

    static {
        Covode.recordClassIndex(46423);
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i, com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbsAdCardAction
    public Map<Integer, Object> getSubscriberEventTypes() {
        Map<Integer, Object> subscriberEventTypes = super.getSubscriberEventTypes();
        subscriberEventTypes.put(59, new RunnableC90250g(FormAdCardAction.class, "onEvent", AdCardClose.class, ThreadMode.POSTING, 0, false));
        return subscriberEventTypes;
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbsHalfWebPageAction, androidx.lifecycle.AbstractC1202k, com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbsAdCardAction
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbstractC38883ai, com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbsHalfWebPageAction
    /* renamed from: f */
    public final void mo67491f() {
        if (!this.f91773i && !mo67494i()) {
            super.mo67491f();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbsHalfWebPageAction
    /* renamed from: g */
    public final void mo67492g() {
        super.mo67492g();
        this.f91760d.mo67533a("javascript:window.dialogPopUp()");
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbsHalfWebPageAction
    /* renamed from: e */
    public final void mo67490e() {
        super.mo67490e();
        mo67484a(new C38661b.C38662a().mo67230a("click").mo67233b("card").mo67229a(this.f91759c).mo67232a());
        if (C38767w.m78631a(this.f91758b, 33)) {
            this.f91773i = false;
            mo67491f();
            return;
        }
        AbstractC81915c.m141874a(new C37836e(this.f91759c, 2));
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbsHalfWebPageAction
    /* renamed from: h */
    public final void mo67493h() {
        AwemeRawAd awemeRawAd;
        super.mo67493h();
        if (!this.f91773i) {
            C38189j.m77549x(this.f91758b, this.f91759c);
            if (this.f91759c != null) {
                awemeRawAd = this.f91759c.getAwemeRawAd();
            } else {
                awemeRawAd = null;
            }
            C18129a.m33746a("feed_form", "click_cancel", awemeRawAd).mo28902c();
        }
    }

    @AbstractC90264r
    public void onEvent(AdCardClose adCardClose) {
        this.f91773i = false;
        this.f91761e.mo60191a("ACTION_HALF_WEB_PAGE_COLLAPSE", (Object) null);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbsHalfWebPageAction
    /* renamed from: b */
    public final void mo67487b(String str) {
        AwemeRawAd awemeRawAd;
        super.mo67487b(str);
        C38189j.m77550y(this.f91758b, this.f91759c);
        if (this.f91759c != null) {
            awemeRawAd = this.f91759c.getAwemeRawAd();
        } else {
            awemeRawAd = null;
        }
        C18129a.m33746a("feed_form", "load_fail", awemeRawAd).mo28902c();
    }

    public FormAdCardAction(Context context, Aweme aweme, AbstractC38878ae aeVar) {
        super(context, aweme, aeVar);
        this.f91762f = true;
    }
}
