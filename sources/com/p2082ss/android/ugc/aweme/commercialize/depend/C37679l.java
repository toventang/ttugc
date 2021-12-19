package com.p2082ss.android.ugc.aweme.commercialize.depend;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.FrameLayout;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.challenge.p2454ui.C35650p;
import com.p2082ss.android.ugc.aweme.commerce_challenge_api.p2522a.AbstractC37537a;
import com.p2082ss.android.ugc.aweme.commercialize.C38000g;
import com.p2082ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageView;
import com.p2082ss.android.ugc.aweme.commercialize.feed.popupwebview.C37977b;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38618ac;
import com.p2082ss.android.ugc.aweme.commercialize.utils.p2623b.C38669b;
import com.p2082ss.android.ugc.aweme.crossplatform.business.p2708a.C40584a;
import com.p2082ss.android.ugc.aweme.framework.services.IUserService;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.services.BaseUserService;
import com.p2082ss.android.ugc.aweme.utils.C80534hh;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.depend.l */
public final class C37679l implements AbstractC37537a {
    static {
        Covode.recordClassIndex(45112);
    }

    @Override // com.p2082ss.android.ugc.aweme.commerce_challenge_api.p2522a.AbstractC37537a
    /* renamed from: a */
    public final User mo65355a() {
        IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
        if (createIUserServicebyMonsterPlugin != null) {
            return createIUserServicebyMonsterPlugin.getCurrentUser();
        }
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.commerce_challenge_api.p2522a.AbstractC37537a
    /* renamed from: a */
    public final void mo65356a(ActivityC0945e eVar) {
        AdPopUpWebPageView b;
        if (eVar != null) {
            C37977b a = new C37977b.C37978a().mo66199a(eVar).mo66204b(8).mo66198a(2).mo66204b(0).mo66203a();
            Context context = a.f89721a;
            if ((context instanceof Activity) && context != null && (b = C35650p.C35651a.m72758b(eVar)) != null && !b.mo66115g()) {
                FrameLayout a2 = C35650p.C35651a.m72757a(eVar);
                if (a2 != null) {
                    a2.setVisibility(0);
                }
                b.getActionMode().f89717f = a.f89724d;
                b.mo66105a(a);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commerce_challenge_api.p2522a.AbstractC37537a
    /* renamed from: a */
    public final void mo65358a(String str, String str2) {
        C40584a.m81931a(str, null, str2);
    }

    @Override // com.p2082ss.android.ugc.aweme.commerce_challenge_api.p2522a.AbstractC37537a
    /* renamed from: a */
    public final boolean mo65359a(Context context, String str) {
        C89219l.m154721d(context, "");
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return C38669b.m78464b(context, Uri.parse(str));
    }

    @Override // com.p2082ss.android.ugc.aweme.commerce_challenge_api.p2522a.AbstractC37537a
    /* renamed from: a */
    public final void mo65357a(ActivityC0945e eVar, String str) {
        MethodCollector.m26663i(7918);
        C89219l.m154721d(str, "");
        if (eVar == null) {
            MethodCollector.m26664o(7918);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("isFromChallenge", true);
        C38618ac a = new C38618ac.C38619a().mo67196a(bundle).mo67197a(eVar).mo67199a(str).mo67195a(C80534hh.m139609b()).mo67200a();
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(a, "");
        if (C35650p.C35651a.m72758b(eVar) == null) {
            AdPopUpWebPageView adPopUpWebPageView = new AdPopUpWebPageView(eVar, (byte) 0);
            adPopUpWebPageView.setId(R.id.a3l);
            adPopUpWebPageView.setParams(a);
            adPopUpWebPageView.setMBehaviorCallback(null);
            adPopUpWebPageView.setKeyDownCallBack(null);
            FrameLayout a2 = C35650p.C35651a.m72757a(eVar);
            if (a2 != null) {
                a2.addView(adPopUpWebPageView);
                MethodCollector.m26664o(7918);
                return;
            }
        }
        MethodCollector.m26664o(7918);
    }

    @Override // com.p2082ss.android.ugc.aweme.commerce_challenge_api.p2522a.AbstractC37537a
    /* renamed from: a */
    public final boolean mo65360a(Context context, String str, String str2) {
        C89219l.m154721d(context, "");
        return C38000g.m77052c().mo65919a(context, str, str2);
    }

    @Override // com.p2082ss.android.ugc.aweme.commerce_challenge_api.p2522a.AbstractC37537a
    /* renamed from: a */
    public final boolean mo65361a(Context context, String str, boolean z) {
        C89219l.m154721d(context, "");
        return C38000g.m77052c().mo65920a(context, str, z);
    }
}
