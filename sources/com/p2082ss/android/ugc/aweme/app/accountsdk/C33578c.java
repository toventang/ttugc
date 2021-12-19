package com.p2082ss.android.ugc.aweme.app.accountsdk;

import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.common.applog.AppLog;
import com.p2082ss.android.ugc.aweme.C47173f;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.p2372d.C34571b;
import com.p2082ss.android.ugc.aweme.base.p2372d.C34572c;
import com.p2082ss.android.ugc.aweme.base.utils.C34717d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p3070im.C53598c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.providedservices.IMService;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.user.p4196c.C80056b;
import com.p2082ss.android.ugc.aweme.utils.C80214ai;
import com.p2082ss.android.ugc.aweme.web.C81543e;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.app.accountsdk.c */
public class C33578c implements IAccountUserService.AbstractC31278a {
    static {
        Covode.recordClassIndex(40468);
    }

    /* renamed from: a */
    private static String m68791a(User user) {
        if (user == null || user.getAvatarThumb() == null || C34717d.m70908a(user.getAvatarThumb().getUrlList())) {
            return "";
        }
        return user.getAvatarThumb().getUrlList().get(0);
    }

    /* renamed from: a */
    static final /* synthetic */ Object m68790a(User user, User user2) {
        int a;
        MethodCollector.m26663i(3136);
        synchronized (C33578c.class) {
            try {
                C80056b bVar = new C80056b();
                int i = 1;
                if (user.getUserMode() == 0) {
                    int i2 = bVar.f179392a.getInt("ftc_user_mode_prefix_".concat(String.valueOf(user.getUid())), 0);
                    if (i2 == 2 || i2 == 1) {
                        user.setUserMode(i2);
                    }
                }
                if (user.getAgeGatePostAction() == 0 && (a = C31575b.m65862d().mo57196a(user.getUid())) != -1) {
                    C39162r.m79460a("age_gate_fallback_hit", new C33744d().mo59980a("age_gate_action_origin", user.getAgeGateAction()).f79943a);
                    user.setAgeGatePostAction(a);
                    user.setAgeGateAction(0);
                }
                if (user.getAgeGateAction() != 0) {
                    C39162r.m79460a("age_gate_need_pop", new C33744d().mo59980a("age_gate_action", user.getAgeGateAction()).f79943a);
                }
                if (user2.getAgeGatePostAction() == 1 && user.getAgeGatePostAction() == 0) {
                    C39223a.m79603q().mo68627a(false, RunnableC33581f.f79749a);
                }
                C31575b.m65860b().toRecoverDeletedAccount(null);
                Bundle bundle = new Bundle();
                bundle.putInt("user_mode", user.getUserMode());
                bundle.putInt("user_period", user.getUserPeriod());
                if (user.getAgeGatePostAction() != 1) {
                    i = 0;
                }
                bundle.putInt("is_kids_mode", i);
                AppLog.setCustomerHeader(bundle);
                IMService.createIIMServicebyMonsterPlugin(false).updateIMUser(C53598c.m98833a(user));
            } finally {
                MethodCollector.m26664o(3136);
            }
        }
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountUserService.AbstractC31278a
    /* renamed from: a */
    public final void mo57195a(int i, User user, User user2) {
        boolean z;
        boolean z2;
        if (i == 4) {
            C1731i.m5640b(new CallableC33579d(user2, user), C40780g.m82241a());
        } else if (i == 5) {
            AbstractC81915c.m141874a(new C34572c(user2));
        } else if (i == 6) {
            IMService.createIIMServicebyMonsterPlugin(false).updateIMUser(C53598c.m98833a(user2));
        } else if (i == 10) {
            AbstractC81915c.m141875b(new C34571b(user2));
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("code", 1);
                jSONObject.put("user_id", user2.getUid());
            } catch (JSONException e) {
                e.printStackTrace();
            }
            AbstractC81915c.m141875b(new C81543e("userLogin", jSONObject));
        }
        List asList = Arrays.asList(6, 7);
        if (user == null || user2 == null) {
            z = false;
            z2 = false;
        } else {
            z2 = !TextUtils.equals(user.getNickname(), user2.getNickname());
            z = !TextUtils.equals(m68791a(user), m68791a(user2));
        }
        if (asList.contains(Integer.valueOf(i)) || z2 || z) {
            C47173f fVar = new C47173f((char) 0);
            if (z2) {
                fVar.f109794b = user2.getNickname();
            }
            if (z) {
                fVar.f109795c = m68791a(user2);
            }
            C80214ai.m139042a(new RunnableC33580e(fVar), "BoltsUtils");
        }
    }
}
