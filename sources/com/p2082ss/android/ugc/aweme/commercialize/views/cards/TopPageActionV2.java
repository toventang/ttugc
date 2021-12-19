package com.p2082ss.android.ugc.aweme.commercialize.views.cards;

import android.content.Context;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33942b;
import com.p2082ss.android.ugc.aweme.commercialize.depend.C37663b;
import com.p2082ss.android.ugc.aweme.commercialize.event.AdCardClose;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38661b;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.cards.TopPageActionV2 */
public class TopPageActionV2 extends AbsAdCardActionV2 implements AbstractC33974au, AbstractC90253j {

    /* renamed from: i */
    public AbstractC38860a f91785i;

    /* renamed from: j */
    public int f91786j;

    /* renamed from: k */
    private boolean f91787k = true;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.cards.TopPageActionV2$a */
    public interface AbstractC38860a {
        static {
            Covode.recordClassIndex(46446);
        }

        /* renamed from: a */
        void mo67521a(C38887d dVar);
    }

    static {
        Covode.recordClassIndex(46445);
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i, com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbsAdCardActionV2
    public Map<Integer, Object> getSubscriberEventTypes() {
        Map<Integer, Object> subscriberEventTypes = super.getSubscriberEventTypes();
        subscriberEventTypes.put(59, new RunnableC90250g(TopPageActionV2.class, "onEvent", AdCardClose.class, ThreadMode.POSTING, 0, false));
        return subscriberEventTypes;
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbsHalfWebPageActionV2, com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbsAdCardActionV2, androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: k */
    public final boolean mo67519k() {
        if (this.f91786j == 8) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbsHalfWebPageActionV2
    /* renamed from: b */
    public final void mo67500b() {
        if (this.f91768e != null) {
            this.f91768e.mo60189a("ON_AD_TOP_WEB_PAGE_SHOW", (AbstractC1214u<C33942b>) this);
            this.f91768e.mo60189a("ON_AD_TOP_WEB_PAGE_SHOW_FAIL", (AbstractC1214u<C33942b>) this);
            this.f91768e.mo60189a("ON_AD_TOP_WEB_PAGE_HIDE", (AbstractC1214u<C33942b>) this);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbsHalfWebPageActionV2
    /* renamed from: d */
    public final void mo67502d() {
        String str;
        long j;
        mo67506j();
        this.f91770g = true;
        this.f91767d.mo67533a("javascript:window.creative_showModal()");
        if (C37663b.f89031b.mo65688a() != null) {
            str = C37663b.f89031b.mo65688a().mo65668d(this.f91766c);
            j = C37663b.f89031b.mo65688a().mo65670e(this.f91766c);
        } else {
            str = "";
            j = 0;
        }
        mo67498a(new C38661b.C38662a().mo67230a("othershow").mo67233b("coupon").mo67229a(this.f91766c).mo67237f(str).mo67228a(j).mo67232a());
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbstractC38883ai, com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbsHalfWebPageActionV2
    /* renamed from: f */
    public final void mo67491f() {
        String str;
        long j;
        mo67506j();
        this.f91770g = false;
        this.f91767d.mo67533a("javascript:window.creative_dismissModal()");
        if (C37663b.f89031b.mo65688a() != null) {
            str = C37663b.f89031b.mo65688a().mo65668d(this.f91766c);
            j = C37663b.f89031b.mo65688a().mo65670e(this.f91766c);
        } else {
            str = "";
            j = 0;
        }
        if (this.f91787k) {
            mo67498a(new C38661b.C38662a().mo67230a("close").mo67233b("coupon").mo67229a(this.f91766c).mo67237f(str).mo67228a(j).mo67232a());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbsAdCardActionV2
    /* renamed from: a */
    public final void mo67476a(C38887d dVar) {
        AbstractC38860a aVar = this.f91785i;
        if (aVar != null) {
            aVar.mo67521a(dVar);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.AbstractC1214u, com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbsHalfWebPageActionV2
    public /* synthetic */ void onChanged(C33942b bVar) {
        onChanged(bVar);
    }

    @AbstractC90264r
    public void onEvent(AdCardClose adCardClose) {
        mo67506j();
        this.f91787k = false;
        this.f91768e.mo60191a("ACTION_TOP_WEB_PAGE_HIDE", (Object) null);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbsHalfWebPageActionV2
    /* renamed from: a */
    public final void mo67497a(C33942b bVar) {
        if (bVar != null) {
            String str = bVar.f80277a;
            str.hashCode();
            switch (str.hashCode()) {
                case -1923750303:
                    if (str.equals("ON_AD_TOP_WEB_PAGE_SHOW_FAIL")) {
                        mo67499a((String) bVar.mo60212a());
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
                        mo67502d();
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbsHalfWebPageActionV2
    /* renamed from: a */
    public final void mo67499a(String str) {
        String str2;
        long j;
        mo67506j();
        if (C37663b.f89031b.mo65688a() != null) {
            str2 = C37663b.f89031b.mo65688a().mo65668d(this.f91766c);
            j = C37663b.f89031b.mo65688a().mo65670e(this.f91766c);
        } else {
            str2 = "";
            j = 0;
        }
        mo67498a(new C38661b.C38662a().mo67230a("othershow_fail").mo67233b("coupon").mo67234c(str).mo67229a(this.f91766c).mo67237f(str2).mo67228a(j).mo67232a());
    }

    public TopPageActionV2(Context context, Aweme aweme, AbstractC38878ae aeVar) {
        super(context, aweme, aeVar);
        this.f91755a = 2131233156;
    }
}
