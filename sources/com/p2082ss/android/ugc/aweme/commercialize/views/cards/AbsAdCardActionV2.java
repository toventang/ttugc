package com.p2082ss.android.ugc.aweme.commercialize.views.cards;

import android.content.Context;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.commercialize.depend.C37663b;
import com.p2082ss.android.ugc.aweme.commercialize.log.C38177d;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38734c;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.cards.AbsAdCardActionV2 */
public abstract class AbsAdCardActionV2 extends AbsHalfWebPageActionV2 implements AbstractC33974au, AbstractC90252i, AbstractC90253j {

    /* renamed from: a */
    protected int f91755a;

    /* renamed from: i */
    private int f91756i;

    static {
        Covode.recordClassIndex(46414);
    }

    /* renamed from: a */
    public void mo67476a(C38887d dVar) {
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(30, new RunnableC90250g(AbsAdCardActionV2.class, "onEvent", C38887d.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbsHalfWebPageActionV2, androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: a */
    public final boolean mo67477a() {
        if (this.f91756i == 1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbsHalfWebPageActionV2
    public void onDestroy() {
        super.onDestroy();
        EventBus.m156962a().mo145395b(this);
    }

    /* access modifiers changed from: package-private */
    @Override // com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbsHalfWebPageActionV2
    public void onCreate() {
        CardStruct cardStruct;
        super.onCreate();
        EventBus.m156966a(EventBus.m156962a(), this);
        if (C37663b.f89031b.mo65688a() != null) {
            cardStruct = C37663b.f89031b.mo65688a().mo65672f(this.f91766c);
        } else {
            cardStruct = null;
        }
        if (C38734c.m78558a(cardStruct)) {
            this.f91755a = 2131232515;
        }
        if (this.f91766c.isLive()) {
            this.f91755a = 2131232516;
        }
        this.f91767d.mo67531a(this.f91755a);
    }

    @AbstractC90264r
    public void onEvent(C38887d dVar) {
        if (this.f91767d.mo67539d() != null && this.f91767d.mo67539d().hashCode() == dVar.f91834d) {
            this.f91756i = dVar.f91831a;
            mo67477a();
            mo67506j();
            mo67476a(dVar);
            if (dVar.f91833c != 1) {
                return;
            }
            if (mo67477a()) {
                C38177d.f90185a.mo66458a(this.f91766c, 0);
            } else {
                C38177d.f90185a.mo66458a(this.f91766c, 1);
            }
        }
    }

    public AbsAdCardActionV2(Context context, Aweme aweme, AbstractC38878ae aeVar) {
        super(context, aweme, aeVar);
    }
}
