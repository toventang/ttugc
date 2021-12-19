package com.p2082ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.p2082ss.android.ugc.aweme.IMandatoryLoginService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.account.login.trusted.C32089b;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.friends.p3018h.C51501a;
import com.p2082ss.android.ugc.aweme.journey.AbstractC56869p;
import com.p2082ss.android.ugc.aweme.journey.C57058z;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58259r;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58265x;
import com.p2082ss.android.ugc.aweme.lego.C58221f;
import com.p2082ss.android.ugc.aweme.lego.EnumC58147aa;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.lego.EnumC58151ae;
import com.p2082ss.android.ugc.aweme.lego.wrapper.InitServiceTask;
import com.p2082ss.android.ugc.aweme.notice.api.p3513d.AbstractC61571e;
import com.p2082ss.android.ugc.aweme.notice.api.p3513d.C61569d;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.providedservices.IMService;
import com.p2082ss.android.ugc.aweme.request_combine.request.p3678a.C67129a;
import com.p2082ss.android.ugc.aweme.requesttask.idle.C67188b;
import com.p2082ss.android.ugc.aweme.requesttask.idle.C67191d;
import com.p2082ss.android.ugc.aweme.requesttask.idle.C67194f;
import com.p2082ss.android.ugc.aweme.requesttask.idle.C67196g;
import com.p2082ss.android.ugc.aweme.requesttask.idle.C67198h;
import com.p2082ss.android.ugc.aweme.requesttask.idle.C67205j;
import com.p2082ss.android.ugc.aweme.requesttask.idle.GeckoCheckInRequest;
import com.p2082ss.android.ugc.aweme.requesttask.idle.GeckoHighPriorityCheckInRequest;
import com.p2082ss.android.ugc.aweme.requesttask.p3680a.C67178a;
import com.p2082ss.android.ugc.aweme.services.MandatoryLoginService;
import com.p2082ss.android.ugc.aweme.settingsrequest.api.C68776g;
import com.p2082ss.android.ugc.aweme.social.service.C74741a;
import com.p2082ss.android.ugc.aweme.task.p4072a.C77723b;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.LegoRequestTask */
public class LegoRequestTask implements AbstractC58264w {
    static {
        Covode.recordClassIndex(68529);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    public final int bQ_() {
        return 1048575;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: f */
    public final EnumC58150ad mo28606f() {
        return AbstractC58265x.m105221a(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: g */
    public final String mo28607g() {
        return "task_";
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: i */
    public final boolean mo28609i() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: j */
    public final List mo28610j() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58264w
    /* renamed from: b */
    public final EnumC58151ae mo28601b() {
        return EnumC58151ae.BACKGROUND;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: k */
    public final EnumC58148ab mo28611k() {
        return EnumC58148ab.DEFAULT;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: h */
    public final String mo28608h() {
        return getClass().getSimpleName();
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: a */
    public final void mo28600a(Context context) {
        new C58221f.C58223b().mo95701b((AbstractC58259r) new C67196g()).mo95701b((AbstractC58259r) new C67178a()).mo95701b((AbstractC58259r) new C67205j()).mo95701b((AbstractC58259r) new C67188b()).mo95701b(C57058z.f129923a.mo57261a()).mo95701b((AbstractC58259r) new C77723b()).mo95701b((AbstractC58259r) new C51501a()).mo95701b((AbstractC58259r) new C67198h()).mo95701b((AbstractC58259r) new C68776g()).mo95701b((AbstractC58259r) new C32089b()).mo95706a();
        if (C16048b.m29633a().mo25412a(true, "use_new_app_alert", 0) == 1) {
            new C58221f.C58223b().mo95701b((AbstractC58259r) new C67191d()).mo95706a();
        }
        IMandatoryLoginService createIMandatoryLoginServicebyMonsterPlugin = MandatoryLoginService.createIMandatoryLoginServicebyMonsterPlugin(false);
        if (AbstractC56869p.C56870a.m103133a().mo63252c() != 0 && createIMandatoryLoginServicebyMonsterPlugin.shouldShowForcedLogin() && !createIMandatoryLoginServicebyMonsterPlugin.getHasRequestComplianceApi()) {
            createIMandatoryLoginServicebyMonsterPlugin.setHasRequestComplianceApi(true);
            new C58221f.C58223b().mo95701b((AbstractC58259r) new C67129a(EnumC58147aa.NORMAL)).mo95706a();
        }
        C39223a.m79604r().mo68634a();
        new C58221f.C58224c().mo95703b((AbstractC58264w) new GeckoHighPriorityCheckInRequest()).mo95703b((AbstractC58264w) new GeckoCheckInRequest()).mo95703b((AbstractC58264w) new FetchFriendsRelationTask()).mo95703b((AbstractC58264w) new InitServiceTask(IMService.createIIMServicebyMonsterPlugin(false).getSystemEmojiService().mo92296a(), 1048575, EnumC58151ae.BOOT_FINISH)).mo95703b((AbstractC58264w) new InitServiceSettingTask()).mo95706a();
        if (C31575b.m65865g().isLogin() && !C80580in.m139687c() && C16048b.m29633a().mo25421a(true, "inbox_has_top_msg", false)) {
            AbstractC61571e eVar = (AbstractC61571e) C61569d.C61570a.m111506a(AbstractC61571e.class);
            if (eVar != null) {
                eVar.mo60987b("");
                eVar.mo60989d("");
                eVar.mo60991f("");
                eVar.mo60993h("");
                eVar.mo60995j("");
                eVar.mo60997l("");
            }
            new C58221f.C58223b().mo95701b((AbstractC58259r) new C67194f()).mo95706a();
        }
        List<AbstractC58259r> a = C74741a.f167998a.mo117775a();
        C58221f.C58225d e = C58221f.m105153e();
        for (AbstractC58259r rVar : a) {
            e.mo95704a(rVar);
        }
        e.mo95706a();
    }
}
