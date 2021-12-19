package com.p2082ss.android.ugc.aweme.commercialize.views.cards;

import android.content.Context;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33942b;
import com.p2082ss.android.ugc.aweme.commercialize.event.AdCardClose;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38661b;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.cards.TopPageAction */
public class TopPageAction extends AbsAdCardAction implements AbstractC33974au, AbstractC90253j {

    /* renamed from: i */
    public AbstractC38859a f91782i;

    /* renamed from: j */
    public int f91783j;

    /* renamed from: k */
    private boolean f91784k = true;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.cards.TopPageAction$a */
    public interface AbstractC38859a {
        static {
            Covode.recordClassIndex(46444);
        }

        /* renamed from: a */
        void mo67518a(C38887d dVar);
    }

    static {
        Covode.recordClassIndex(46443);
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i, com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbsAdCardAction
    public Map<Integer, Object> getSubscriberEventTypes() {
        Map<Integer, Object> subscriberEventTypes = super.getSubscriberEventTypes();
        subscriberEventTypes.put(59, new RunnableC90250g(TopPageAction.class, "onEvent", AdCardClose.class, ThreadMode.POSTING, 0, false));
        return subscriberEventTypes;
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbsHalfWebPageAction, androidx.lifecycle.AbstractC1202k, com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbsAdCardAction
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: k */
    public final boolean mo67516k() {
        if (this.f91783j == 8) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbsHalfWebPageAction
    /* renamed from: b */
    public final void mo67486b() {
        if (this.f91761e != null) {
            this.f91761e.mo60189a("ON_AD_TOP_WEB_PAGE_SHOW", (AbstractC1214u<C33942b>) this);
            this.f91761e.mo60189a("ON_AD_TOP_WEB_PAGE_SHOW_FAIL", (AbstractC1214u<C33942b>) this);
            this.f91761e.mo60189a("ON_AD_TOP_WEB_PAGE_HIDE", (AbstractC1214u<C33942b>) this);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbsHalfWebPageAction
    /* renamed from: d */
    public final void mo67489d() {
        mo67495j();
        this.f91763g = true;
        this.f91760d.mo67533a("javascript:window.creative_showModal()");
        mo67484a(new C38661b.C38662a().mo67230a("othershow").mo67233b("coupon").mo67229a(this.f91759c).mo67237f(C37699a.m76315t(this.f91759c)).mo67228a(C37699a.m76316u(this.f91759c)).mo67232a());
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbstractC38883ai, com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbsHalfWebPageAction
    /* renamed from: f */
    public final void mo67491f() {
        mo67495j();
        this.f91763g = false;
        this.f91760d.mo67533a("javascript:window.creative_dismissModal()");
        if (this.f91784k) {
            mo67484a(new C38661b.C38662a().mo67230a("close").mo67233b("coupon").mo67229a(this.f91759c).mo67237f(C37699a.m76315t(this.f91759c)).mo67228a(C37699a.m76316u(this.f91759c)).mo67232a());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbsAdCardAction
    /* renamed from: a */
    public final void mo67471a(C38887d dVar) {
        AbstractC38859a aVar = this.f91782i;
        if (aVar != null) {
            aVar.mo67518a(dVar);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.AbstractC1214u, com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbsHalfWebPageAction
    public /* synthetic */ void onChanged(C33942b bVar) {
        onChanged(bVar);
    }

    @AbstractC90264r
    public void onEvent(AdCardClose adCardClose) {
        mo67495j();
        this.f91784k = false;
        this.f91761e.mo60191a("ACTION_TOP_WEB_PAGE_HIDE", (Object) null);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbsHalfWebPageAction
    /* renamed from: a */
    public final void mo67485a(String str) {
        mo67495j();
        mo67484a(new C38661b.C38662a().mo67230a("othershow_fail").mo67233b("coupon").mo67234c(str).mo67229a(this.f91759c).mo67237f(C37699a.m76315t(this.f91759c)).mo67228a(C37699a.m76316u(this.f91759c)).mo67232a());
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbsHalfWebPageAction
    /* renamed from: a */
    public final void mo67483a(C33942b bVar) {
        if (bVar != null) {
            String str = bVar.f80277a;
            str.hashCode();
            switch (str.hashCode()) {
                case -1923750303:
                    if (str.equals("ON_AD_TOP_WEB_PAGE_SHOW_FAIL")) {
                        mo67485a((String) bVar.mo60212a());
                        return;
                    }
                    return;
                case -200264351:
                    if (str.equals("ON_AD_TOP_WEB_PAGE_HIDE")) {
                        mo67491f();
                        return;
                    }
                    return;
                case -199937252:
                    if (str.equals("ON_AD_TOP_WEB_PAGE_SHOW")) {
                        mo67489d();
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    public TopPageAction(Context context, Aweme aweme, AbstractC38878ae aeVar) {
        super(context, aweme, aeVar);
        this.f91753a = 2131233156;
    }
}
