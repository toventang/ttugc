package com.p2082ss.android.ugc.aweme.commercialize.views.cards;

import android.content.Context;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.commercialize.depend.C37663b;
import com.p2082ss.android.ugc.aweme.commercialize.event.AdCardClose;
import com.p2082ss.android.ugc.aweme.commercialize.log.C38187i;
import com.p2082ss.android.ugc.aweme.commercialize.p2567h.p2568a.C38009b;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38661b;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.cards.FormAdCardActionV2 */
public class FormAdCardActionV2 extends AbsAdCardActionV2 implements AbstractC33974au, AbstractC90253j {

    /* renamed from: i */
    private boolean f91774i;

    static {
        Covode.recordClassIndex(46424);
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i, com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbsAdCardActionV2
    public Map<Integer, Object> getSubscriberEventTypes() {
        Map<Integer, Object> subscriberEventTypes = super.getSubscriberEventTypes();
        subscriberEventTypes.put(59, new RunnableC90250g(FormAdCardActionV2.class, "onEvent", AdCardClose.class, ThreadMode.POSTING, 0, false));
        return subscriberEventTypes;
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbsHalfWebPageActionV2, com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbsAdCardActionV2, androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbstractC38883ai, com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbsHalfWebPageActionV2
    /* renamed from: f */
    public final void mo67491f() {
        if (!this.f91774i && !mo67494i()) {
            super.mo67491f();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbsHalfWebPageActionV2
    /* renamed from: g */
    public final void mo67504g() {
        super.mo67504g();
        this.f91767d.mo67533a("javascript:window.dialogPopUp()");
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbsHalfWebPageActionV2
    /* renamed from: h */
    public final void mo67505h() {
        AwemeRawAd awemeRawAd;
        super.mo67505h();
        if (!this.f91774i) {
            Context context = this.f91765b;
            Aweme aweme = this.f91766c;
            C38187i.C38188a aVar = new C38187i.C38188a();
            if (aweme != null) {
                awemeRawAd = aweme.getAwemeRawAd();
            } else {
                awemeRawAd = null;
            }
            aVar.f90222a = awemeRawAd;
            aVar.f90224c = false;
            JSONObject a = aVar.mo66507a();
            C89219l.m154716b(a, "");
            C38009b.m77074a(context, aweme, "click_cancel", a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbsHalfWebPageActionV2
    /* renamed from: e */
    public final void mo67503e() {
        super.mo67503e();
        mo67498a(new C38661b.C38662a().mo67230a("click").mo67233b("card").mo67229a(this.f91766c).mo67232a());
        if (C37663b.f89031b.mo65688a() != null && C37663b.f89031b.mo65688a().mo65659a(this.f91765b)) {
            this.f91774i = false;
            mo67491f();
        } else if (C37663b.f89031b.mo65688a() != null) {
            C37663b.f89031b.mo65688a().mo65678j(this.f91766c);
        }
    }

    @AbstractC90264r
    public void onEvent(AdCardClose adCardClose) {
        this.f91774i = false;
        this.f91768e.mo60191a("ACTION_HALF_WEB_PAGE_COLLAPSE", (Object) null);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbsHalfWebPageActionV2
    /* renamed from: b */
    public final void mo67501b(String str) {
        AwemeRawAd awemeRawAd;
        super.mo67501b(str);
        Context context = this.f91765b;
        Aweme aweme = this.f91766c;
        C38187i.C38188a aVar = new C38187i.C38188a();
        if (aweme != null) {
            awemeRawAd = aweme.getAwemeRawAd();
        } else {
            awemeRawAd = null;
        }
        aVar.f90222a = awemeRawAd;
        aVar.f90224c = false;
        JSONObject a = aVar.mo66507a();
        C89219l.m154716b(a, "");
        C38009b.m77074a(context, aweme, "load_fail", a);
    }

    public FormAdCardActionV2(Context context, Aweme aweme, AbstractC38878ae aeVar) {
        super(context, aweme, aeVar);
        this.f91769f = true;
    }
}
