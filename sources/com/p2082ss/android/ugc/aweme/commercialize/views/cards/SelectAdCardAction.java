package com.p2082ss.android.ugc.aweme.commercialize.views.cards;

import android.content.Context;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.commercialize.model.ChooseLogAdExtraData;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38661b;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38739d;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.cards.SelectAdCardAction */
public final class SelectAdCardAction extends AbsAdCardAction implements AbstractC33974au, AbstractC90253j {

    /* renamed from: i */
    private ChooseLogAdExtraData f91778i;

    static {
        Covode.recordClassIndex(46437);
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i, com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbsAdCardAction
    public final Map<Integer, Object> getSubscriberEventTypes() {
        Map<Integer, Object> subscriberEventTypes = super.getSubscriberEventTypes();
        subscriberEventTypes.put(238, new RunnableC90250g(SelectAdCardAction.class, "userChooseEvent", ChooseLogAdExtraData.class, ThreadMode.POSTING, 0, false));
        return subscriberEventTypes;
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbsHalfWebPageAction, androidx.lifecycle.AbstractC1202k, com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbsAdCardAction
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbsHalfWebPageAction
    /* renamed from: d */
    public final void mo67489d() {
        mo67495j();
        C38661b.C38662a d = new C38661b.C38662a().mo67230a("othershow").mo67233b("card").mo67235d("choose");
        Aweme aweme = this.f91759c;
        C89219l.m154716b(aweme, "");
        C38661b.C38662a a = d.mo67229a(aweme).mo67231a(C38739d.m78577d(this.f91759c));
        String t = C37699a.m76315t(this.f91759c);
        C89219l.m154716b(t, "");
        mo67484a(a.mo67237f(t).mo67228a(C37699a.m76316u(this.f91759c)).mo67232a());
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbstractC38883ai, com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbsHalfWebPageAction
    /* renamed from: f */
    public final void mo67491f() {
        JSONObject adExtraData;
        String optString;
        mo67495j();
        C38661b.C38662a aVar = new C38661b.C38662a();
        Aweme aweme = this.f91759c;
        C89219l.m154716b(aweme, "");
        C38661b.C38662a b = aVar.mo67229a(aweme).mo67230a("close").mo67233b("card");
        ChooseLogAdExtraData chooseLogAdExtraData = this.f91778i;
        String str = "choose";
        if (!(chooseLogAdExtraData == null || (adExtraData = chooseLogAdExtraData.getAdExtraData()) == null || (optString = adExtraData.optString("card_type", str)) == null)) {
            str = optString;
        }
        C38661b.C38662a d = b.mo67235d(str);
        String t = C37699a.m76315t(this.f91759c);
        C89219l.m154716b(t, "");
        mo67484a(d.mo67237f(t).mo67228a(C37699a.m76316u(this.f91759c)).mo67232a());
    }

    @AbstractC90264r
    public final void userChooseEvent(ChooseLogAdExtraData chooseLogAdExtraData) {
        C89219l.m154721d(chooseLogAdExtraData, "");
        this.f91778i = chooseLogAdExtraData;
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbsHalfWebPageAction
    /* renamed from: a */
    public final void mo67485a(String str) {
        mo67495j();
        C38661b.C38662a d = new C38661b.C38662a().mo67230a("othershow_fail").mo67233b("card").mo67234c(String.valueOf(str)).mo67235d("choose");
        Aweme aweme = this.f91759c;
        C89219l.m154716b(aweme, "");
        C38661b.C38662a a = d.mo67229a(aweme).mo67231a(C38739d.m78577d(this.f91759c));
        String t = C37699a.m76315t(this.f91759c);
        C89219l.m154716b(t, "");
        mo67484a(a.mo67237f(t).mo67228a(C37699a.m76316u(this.f91759c)).mo67232a());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SelectAdCardAction(Context context, Aweme aweme, AbstractC38878ae aeVar) {
        super(context, aweme, aeVar);
        C89219l.m154721d(aeVar, "");
        this.f91753a = 2131232515;
    }
}
