package com.p2082ss.android.ugc.aweme.prop.p3606b;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.services.IAVMobService;
import com.p2082ss.android.ugc.aweme.tools.p4118f.AbstractC78597a;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.prop.b.w */
public final /* synthetic */ class C65304w implements AbstractC78597a {

    /* renamed from: a */
    private final C65283j f147404a;

    static {
        Covode.recordClassIndex(76783);
    }

    C65304w(C65283j jVar) {
        this.f147404a = jVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.p4118f.AbstractC78597a
    public final void onIntercept(String str, Effect effect) {
        C65283j jVar = this.f147404a;
        IAVMobService aVMobService = AVExternalServiceImpl.m113114a().getAVMobService();
        C33744d a = new C33744d().mo59983a("creation_id", str).mo59983a("shoot_way", "prop_page").mo59983a("prop_id", effect.getEffectId()).mo59983a("group_id", jVar.f147349ar).mo59983a("log_pb", jVar.f147348aq).mo59983a("enter_from", "prop_page").mo59983a("enter_method", "click_prop_publish").mo59981a("time_elapsed_since_launch_app", AVExternalServiceImpl.m113114a().infoService().getDurationSinceAppForeground(str)).mo59982a("is_ui_shoot", (Object) false).mo59983a("shoot_enter_from", jVar.f147350as).mo59980a("is_bundled", jVar.f147352au);
        if (!TextUtils.isEmpty(jVar.f147351at)) {
            a.mo59983a("from_banner_id", jVar.f147351at);
        }
        aVMobService.onEventV3("shoot", a.f79943a);
    }
}
