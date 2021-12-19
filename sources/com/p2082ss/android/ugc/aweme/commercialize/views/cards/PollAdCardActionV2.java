package com.p2082ss.android.ugc.aweme.commercialize.views.cards;

import android.content.Context;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.commercialize.depend.AbstractC37687t;
import com.p2082ss.android.ugc.aweme.commercialize.depend.C37663b;
import com.p2082ss.android.ugc.aweme.commercialize.model.ChooseLogAdExtraData;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38661b;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.cards.PollAdCardActionV2 */
public final class PollAdCardActionV2 extends AbsAdCardActionV2 implements AbstractC33974au, AbstractC90253j {

    /* renamed from: i */
    private ChooseLogAdExtraData f91777i;

    static {
        Covode.recordClassIndex(46435);
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i, com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbsAdCardActionV2
    public final Map<Integer, Object> getSubscriberEventTypes() {
        Map<Integer, Object> subscriberEventTypes = super.getSubscriberEventTypes();
        subscriberEventTypes.put(238, new RunnableC90250g(PollAdCardActionV2.class, "userChooseEvent", ChooseLogAdExtraData.class, ThreadMode.POSTING, 0, false));
        return subscriberEventTypes;
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbsHalfWebPageActionV2, com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbsAdCardActionV2, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbsHalfWebPageActionV2
    /* renamed from: d */
    public final void mo67502d() {
        long j;
        String d;
        mo67506j();
        C38661b.C38662a e = new C38661b.C38662a().mo67230a("othershow").mo67233b("card").mo67235d("vote").mo67236e("before");
        Aweme aweme = this.f91766c;
        String str = "";
        C89219l.m154716b(aweme, str);
        C38661b.C38662a a = e.mo67229a(aweme);
        AbstractC37687t a2 = C37663b.f89031b.mo65688a();
        boolean z = true;
        if (a2 == null || !a2.mo65675g(this.f91766c)) {
            z = false;
        }
        C38661b.C38662a a3 = a.mo67231a(z);
        AbstractC37687t a4 = C37663b.f89031b.mo65688a();
        if (!(a4 == null || (d = a4.mo65668d(this.f91766c)) == null)) {
            str = d;
        }
        C38661b.C38662a f = a3.mo67237f(str);
        AbstractC37687t a5 = C37663b.f89031b.mo65688a();
        if (a5 != null) {
            j = a5.mo65670e(this.f91766c);
        } else {
            j = 0;
        }
        mo67498a(f.mo67228a(j).mo67232a());
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbstractC38883ai, com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbsHalfWebPageActionV2
    /* renamed from: f */
    public final void mo67491f() {
        long j;
        String d;
        JSONObject adExtraData;
        String optString;
        mo67506j();
        C38661b.C38662a d2 = new C38661b.C38662a().mo67230a("close").mo67233b("card").mo67235d("vote");
        ChooseLogAdExtraData chooseLogAdExtraData = this.f91777i;
        String str = "before";
        if (!(chooseLogAdExtraData == null || (adExtraData = chooseLogAdExtraData.getAdExtraData()) == null || (optString = adExtraData.optString("status", str)) == null)) {
            str = optString;
        }
        C38661b.C38662a e = d2.mo67236e(str);
        Aweme aweme = this.f91766c;
        String str2 = "";
        C89219l.m154716b(aweme, str2);
        C38661b.C38662a a = e.mo67229a(aweme);
        AbstractC37687t a2 = C37663b.f89031b.mo65688a();
        if (!(a2 == null || (d = a2.mo65668d(this.f91766c)) == null)) {
            str2 = d;
        }
        C38661b.C38662a f = a.mo67237f(str2);
        AbstractC37687t a3 = C37663b.f89031b.mo65688a();
        if (a3 != null) {
            j = a3.mo65670e(this.f91766c);
        } else {
            j = 0;
        }
        mo67498a(f.mo67228a(j).mo67232a());
    }

    @AbstractC90264r
    public final void userChooseEvent(ChooseLogAdExtraData chooseLogAdExtraData) {
        C89219l.m154721d(chooseLogAdExtraData, "");
        this.f91777i = chooseLogAdExtraData;
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbsHalfWebPageActionV2
    /* renamed from: a */
    public final void mo67499a(String str) {
        long j;
        String d;
        mo67506j();
        C38661b.C38662a d2 = new C38661b.C38662a().mo67230a("othershow_fail").mo67233b("card").mo67234c(String.valueOf(str)).mo67235d("vote");
        Aweme aweme = this.f91766c;
        String str2 = "";
        C89219l.m154716b(aweme, str2);
        C38661b.C38662a a = d2.mo67229a(aweme);
        AbstractC37687t a2 = C37663b.f89031b.mo65688a();
        boolean z = true;
        if (a2 == null || !a2.mo65675g(this.f91766c)) {
            z = false;
        }
        C38661b.C38662a a3 = a.mo67231a(z);
        AbstractC37687t a4 = C37663b.f89031b.mo65688a();
        if (!(a4 == null || (d = a4.mo65668d(this.f91766c)) == null)) {
            str2 = d;
        }
        C38661b.C38662a f = a3.mo67237f(str2);
        AbstractC37687t a5 = C37663b.f89031b.mo65688a();
        if (a5 != null) {
            j = a5.mo65670e(this.f91766c);
        } else {
            j = 0;
        }
        mo67498a(f.mo67228a(j).mo67232a());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PollAdCardActionV2(Context context, Aweme aweme, AbstractC38878ae aeVar) {
        super(context, aweme, aeVar);
        C89219l.m154721d(aeVar, "");
    }
}
