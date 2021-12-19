package com.p2082ss.android.ugc.aweme.commercialize.views.cards;

import android.content.Context;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.commercialize.event.AdCardClose;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.cards.DownloadAdCardActionV2 */
public class DownloadAdCardActionV2 extends AbsAdCardActionV2 implements AbstractC33974au, AbstractC90253j {

    /* renamed from: i */
    private boolean f91772i = true;

    static {
        Covode.recordClassIndex(46420);
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i, com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbsAdCardActionV2
    public Map<Integer, Object> getSubscriberEventTypes() {
        Map<Integer, Object> subscriberEventTypes = super.getSubscriberEventTypes();
        subscriberEventTypes.put(59, new RunnableC90250g(DownloadAdCardActionV2.class, "onEvent", AdCardClose.class, ThreadMode.POSTING, 0, false));
        return subscriberEventTypes;
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbsHalfWebPageActionV2, com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbsAdCardActionV2, androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbstractC38883ai, com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbsHalfWebPageActionV2
    /* renamed from: f */
    public final void mo67491f() {
        if (this.f91772i) {
            super.mo67491f();
        }
    }

    @AbstractC90264r
    public void onEvent(AdCardClose adCardClose) {
        if (this.f91766c.getAwemeRawAd() != null && !this.f91766c.getAwemeRawAd().isCardOnceClick()) {
            this.f91772i = false;
            this.f91766c.getAwemeRawAd().setCardOnceClick(true);
            this.f91768e.mo60191a("ACTION_HALF_WEB_PAGE_HIDE", (Object) null);
        }
    }

    public DownloadAdCardActionV2(Context context, Aweme aweme, AbstractC38878ae aeVar) {
        super(context, aweme, aeVar);
        this.f91755a = 2131232518;
    }
}
