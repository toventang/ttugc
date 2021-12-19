package com.p2082ss.android.ugc.aweme.utils;

import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.compliance.api.model.InterfaceControlSettings;
import com.p2082ss.android.ugc.aweme.compliance.api.p2639c.AbstractC39234e;
import com.p2082ss.android.ugc.aweme.compliance.business.p2646c.C39364a;
import com.p2082ss.android.ugc.aweme.framework.services.IUserService;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.services.BaseUserService;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.utils.dr */
final /* synthetic */ class C80356dr implements AbstractC39234e {

    /* renamed from: a */
    static final AbstractC39234e f179888a = new C80356dr();

    static {
        Covode.recordClassIndex(93624);
    }

    private C80356dr() {
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.p2639c.AbstractC39234e
    /* renamed from: a */
    public final void mo68122a(String str, InterfaceControlSettings interfaceControlSettings, Exception exc) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("event", "init_settings");
        if (str == null || C89361p.m154870a(str)) {
            jSONObject.put("status", 1);
        }
        int i = 2;
        if (exc != null) {
            jSONObject.put("status", 2);
            jSONObject.put("reason", exc.getClass().getSimpleName() + ": " + exc.getMessage());
        }
        jSONObject.put(StringSet.type, String.valueOf(!C89219l.m154714a((Object) (interfaceControlSettings != null ? interfaceControlSettings.getUseNewControl() : null), (Object) false)));
        if (interfaceControlSettings != null) {
            jSONObject.put("version", interfaceControlSettings.getVersion());
            jSONObject.put("user_type", interfaceControlSettings.m157064getUserType());
            IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
            C89219l.m154716b(createIUserServicebyMonsterPlugin, "");
            User currentUser = createIUserServicebyMonsterPlugin.getCurrentUser();
            C89219l.m154716b(currentUser, "");
            String uid = currentUser.getUid();
            if (uid == null || C89361p.m154870a((CharSequence) uid)) {
                i = -1;
            } else if (C80580in.m139687c()) {
                i = 1;
            } else if (!C80580in.m139691e()) {
                i = 0;
            }
            jSONObject.put("current", i);
            if (!C89219l.m154714a((Object) String.valueOf(i), (Object) interfaceControlSettings.m157064getUserType())) {
                jSONObject.put("status", 3);
            }
        }
        if (!jSONObject.has("status")) {
            jSONObject.put("status", 0);
        } else if (str != null && !C89361p.m154870a((CharSequence) str)) {
            jSONObject.put("content", str);
        }
        C39364a.f92920g.add(jSONObject);
        C80342dg.m139300a().mo46674b(interfaceControlSettings);
        if (exc != null) {
            exc.getClass().getSimpleName();
            exc.getMessage();
        }
    }
}
