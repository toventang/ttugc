package com.p2082ss.android.ugc.aweme.compliance.business.serviceimpl;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.p1777x.p1780c.C23697c;
import com.google.gson.C27910f;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.compliance.api.model.AppealStatusResponse;
import com.p2082ss.android.ugc.aweme.compliance.api.model.C39241b;
import com.p2082ss.android.ugc.aweme.compliance.api.p2639c.AbstractC39233d;
import com.p2082ss.android.ugc.aweme.compliance.api.services.banappeal.IBanAppealService;
import com.p2082ss.android.ugc.aweme.compliance.api.services.depend.C39275a;
import com.p2082ss.android.ugc.aweme.compliance.business.banappeal.C39314a;
import com.p2082ss.android.ugc.aweme.compliance.business.banappeal.api.AppealApi;
import com.p2082ss.android.ugc.aweme.compliance.business.banappeal.gradientpunish.C39343a;
import com.p2082ss.android.ugc.aweme.compliance.business.banappeal.gradientpunish.GradientPunishWarning;
import com.p2082ss.android.ugc.aweme.compliance.business.banappeal.p2643a.C39317a;
import com.p2082ss.android.ugc.aweme.compliance.business.banappeal.p2644b.C39320a;
import com.p2082ss.android.ugc.aweme.compliance.business.banappeal.p2644b.C39326b;
import com.p2082ss.android.ugc.aweme.compliance.common.C39608b;
import com.p2082ss.android.ugc.aweme.compliance.common.p2661b.C39614a;
import com.p2082ss.android.ugc.aweme.main.AbstractC59103j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.business.serviceimpl.BanAppealServiceImpl */
public final class BanAppealServiceImpl implements IBanAppealService {
    static {
        Covode.recordClassIndex(47216);
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.banappeal.IBanAppealService
    /* renamed from: b */
    public final String mo68607b() {
        String bubbleText;
        GradientPunishWarning a = C39343a.m79987a();
        if (a == null || (bubbleText = a.getBubbleText()) == null) {
            return "";
        }
        return bubbleText;
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.banappeal.IBanAppealService
    /* renamed from: e */
    public final void mo68610e() {
        C39608b.f93371b.mo69031a(new ArrayList());
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.banappeal.IBanAppealService
    /* renamed from: c */
    public final void mo68608c() {
        C39162r.m79460a("violation_bubble_show", new C33744d().mo59983a("enter_from", "personal_homepage").f79943a);
    }

    /* renamed from: f */
    public static IBanAppealService m80219f() {
        MethodCollector.m26663i(9015);
        Object a = C81908b.m141854a(IBanAppealService.class, false);
        if (a != null) {
            IBanAppealService iBanAppealService = (IBanAppealService) a;
            MethodCollector.m26664o(9015);
            return iBanAppealService;
        }
        if (C81908b.f183145aA == null) {
            synchronized (IBanAppealService.class) {
                try {
                    if (C81908b.f183145aA == null) {
                        C81908b.f183145aA = new BanAppealServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(9015);
                    throw th;
                }
            }
        }
        BanAppealServiceImpl banAppealServiceImpl = (BanAppealServiceImpl) C81908b.f183145aA;
        MethodCollector.m26664o(9015);
        return banAppealServiceImpl;
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.banappeal.IBanAppealService
    /* renamed from: d */
    public final void mo68609d() {
        if (C39317a.m79965a()) {
            AppealApi.C39318a.f92809a.syncAccountBannedDetails().mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(C39314a.C39315a.f92805a, C39314a.C39316b.f92806a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.banappeal.IBanAppealService
    /* renamed from: a */
    public final boolean mo68605a() {
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        if (g.isLogin()) {
            IAccountUserService g2 = C31575b.m65865g();
            C89219l.m154716b(g2, "");
            String curUserId = g2.getCurUserId();
            C89219l.m154716b(curUserId, "");
            C89219l.m154721d(curUserId, "");
            GradientPunishWarning a = C39343a.m79987a();
            if (a == null || a.getWarnType() == 0) {
                C39343a.m79990b(curUserId, false);
            } else if (a.getWarnType() >= 2 && !C23697c.m44781a(a.getBubbleText()) && !C23697c.m44781a(a.getDetailUrl())) {
                IAccountUserService g3 = C31575b.m65865g();
                C89219l.m154716b(g3, "");
                String curUserId2 = g3.getCurUserId();
                C89219l.m154716b(curUserId2, "");
                C89219l.m154721d(curUserId2, "");
                if (!C39343a.f92873b.mo61055a("has_click_warning_bubble_".concat(String.valueOf(curUserId2)), false)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.banappeal.IBanAppealService
    /* renamed from: a */
    public final void mo68601a(Context context) {
        C89219l.m154721d(context, "");
        C39343a.m79988a(context, "float_warning");
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        String curUserId = g.getCurUserId();
        C89219l.m154716b(curUserId, "");
        C39343a.m79990b(curUserId, true);
        C39162r.m79460a("enter_violation_record", new C33744d().mo59983a("enter_method", "bubble").mo59983a("enter_from", "personal_homepage").f79943a);
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.banappeal.IBanAppealService
    /* renamed from: a */
    public final void mo68603a(ActivityC0945e eVar) {
        String str;
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(eVar, "");
        if (eVar instanceof AbstractC59103j) {
            str = ((AbstractC59103j) eVar).getEnterFrom();
        } else {
            str = "homepage_hot";
        }
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        if (g.isLogin()) {
            IAccountUserService g2 = C31575b.m65865g();
            C89219l.m154716b(g2, "");
            String curUserId = g2.getCurUserId();
            C89219l.m154716b(curUserId, "");
            C89219l.m154721d(curUserId, "");
            GradientPunishWarning a = C39343a.m79987a();
            if (a == null || a.getWarnType() == 0) {
                C39343a.m79989a(curUserId, false);
            } else if (a.getWarnType() >= 3 && !C23697c.m44781a(a.getDialogMessage()) && !C23697c.m44781a(a.getDialogButton()) && !C23697c.m44781a(a.getDetailUrl())) {
                IAccountUserService g3 = C31575b.m65865g();
                C89219l.m154716b(g3, "");
                String curUserId2 = g3.getCurUserId();
                C89219l.m154716b(curUserId2, "");
                C89219l.m154721d(curUserId2, "");
                if (!C39343a.f92873b.mo61055a("has_click_warning_dialog_".concat(String.valueOf(curUserId2)), false) && !C39275a.m79779a().mo68103a()) {
                    C1731i.m5640b(new C39343a.CallableC39344a(eVar, str), C1731i.f5564c);
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.banappeal.IBanAppealService
    /* renamed from: a */
    public final boolean mo68606a(int i) {
        List<C39241b> list;
        Integer banPlatform;
        if (C39317a.m79965a()) {
            C39614a aVar = C39608b.f93371b;
            if (aVar.f93390b != null) {
                list = aVar.f93390b;
            } else {
                list = (List) new C27910f().mo46671a(aVar.f93389a.getString("account_banned_detail", ""), new C39614a.C39616b().type);
            }
            if (list != null && (!(list instanceof Collection) || !list.isEmpty())) {
                for (T t : list) {
                    Integer banType = t.getBanType();
                    if (banType != null && banType.intValue() == i && (banPlatform = t.getBanPlatform()) != null && banPlatform.intValue() == 1) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.banappeal.IBanAppealService
    /* renamed from: a */
    public final void mo68602a(Context context, String str) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(str, "");
        C39343a.m79988a(context, str);
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.banappeal.IBanAppealService
    /* renamed from: a */
    public final void mo68604a(String str, AbstractC1729g<AppealStatusResponse, Void> gVar) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(gVar, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(gVar, "");
        AppealApi.C39318a.f92809a.getUserAppealStatus("6", str).mo5534a(gVar, C1731i.f5564c, null);
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.banappeal.IBanAppealService
    /* renamed from: a */
    public final AbstractC39233d mo68600a(Activity activity, AppealStatusResponse appealStatusResponse) {
        C89219l.m154721d(activity, "");
        C89219l.m154721d(appealStatusResponse, "");
        C89219l.m154721d(activity, "");
        C89219l.m154721d(appealStatusResponse, "");
        if (appealStatusResponse.getAppealType() != 102) {
            return new C39326b(activity, appealStatusResponse);
        }
        return new C39320a(activity, appealStatusResponse);
    }
}
