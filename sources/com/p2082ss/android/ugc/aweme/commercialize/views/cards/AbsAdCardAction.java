package com.p2082ss.android.ugc.aweme.commercialize.views.cards;

import android.content.Context;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.commercialize.service.C38488a;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38734c;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.cards.AbsAdCardAction */
public abstract class AbsAdCardAction extends AbsHalfWebPageAction implements AbstractC33974au, AbstractC90252i, AbstractC90253j {

    /* renamed from: a */
    protected int f91753a;

    /* renamed from: i */
    private int f91754i;

    static {
        Covode.recordClassIndex(46413);
    }

    /* renamed from: a */
    public void mo67471a(C38887d dVar) {
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(30, new RunnableC90250g(AbsAdCardAction.class, "onEvent", C38887d.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbsHalfWebPageAction, androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: a */
    public final boolean mo67472a() {
        if (this.f91754i == 1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbsHalfWebPageAction
    public void onDestroy() {
        super.onDestroy();
        EventBus.m156962a().mo145395b(this);
    }

    /* access modifiers changed from: package-private */
    @Override // com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbsHalfWebPageAction
    public void onCreate() {
        super.onCreate();
        EventBus.m156966a(EventBus.m156962a(), this);
        if (C38734c.m78558a(C37699a.m76292e(this.f91759c))) {
            this.f91753a = 2131232515;
        }
        if (this.f91759c.isLive()) {
            this.f91753a = 2131232516;
        }
        this.f91760d.mo67531a(this.f91753a);
    }

    @AbstractC90264r
    public void onEvent(C38887d dVar) {
        if (this.f91760d.mo67539d() != null && this.f91760d.mo67539d().hashCode() == dVar.f91834d) {
            this.f91754i = dVar.f91831a;
            mo67472a();
            mo67495j();
            mo67471a(dVar);
            if (dVar.f91833c != 1) {
                return;
            }
            if (mo67472a()) {
                C38488a.f90908a.mo67045a().mo66458a(this.f91759c, 0);
            } else {
                C38488a.f90908a.mo67045a().mo66458a(this.f91759c, 1);
            }
        }
    }

    public AbsAdCardAction(Context context, Aweme aweme, AbstractC38878ae aeVar) {
        super(context, aweme, aeVar);
    }
}
