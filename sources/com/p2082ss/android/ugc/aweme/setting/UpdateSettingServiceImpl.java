package com.p2082ss.android.ugc.aweme.setting;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.gson.C28027t;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.framework.services.IUserService;
import com.p2082ss.android.ugc.aweme.services.BaseUserService;
import com.p2082ss.android.ugc.aweme.setting.serverpush.p3728a.C68348f;
import com.p2082ss.android.ugc.aweme.setting.services.IUpdateSettingService;
import com.p2082ss.android.ugc.aweme.utils.C80342dg;
import org.json.JSONObject;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.setting.UpdateSettingServiceImpl */
public final class UpdateSettingServiceImpl implements IUpdateSettingService {

    /* renamed from: a */
    private C89378p<String, ? extends JSONObject> f152284a;

    static {
        Covode.recordClassIndex(80145);
    }

    /* renamed from: b */
    public static IUpdateSettingService m120294b() {
        MethodCollector.m26663i(3221);
        Object a = C81908b.m141854a(IUpdateSettingService.class, false);
        if (a != null) {
            IUpdateSettingService iUpdateSettingService = (IUpdateSettingService) a;
            MethodCollector.m26664o(3221);
            return iUpdateSettingService;
        }
        if (C81908b.f183312dI == null) {
            synchronized (IUpdateSettingService.class) {
                try {
                    if (C81908b.f183312dI == null) {
                        C81908b.f183312dI = new UpdateSettingServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(3221);
                    throw th;
                }
            }
        }
        UpdateSettingServiceImpl updateSettingServiceImpl = (UpdateSettingServiceImpl) C81908b.f183312dI;
        MethodCollector.m26664o(3221);
        return updateSettingServiceImpl;
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.services.IUpdateSettingService
    /* renamed from: a */
    public final C68348f mo108581a() {
        C89378p<String, ? extends JSONObject> pVar = this.f152284a;
        if (pVar != null) {
            String first = pVar.getFirst();
            boolean z = false;
            IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
            C89219l.m154716b(createIUserServicebyMonsterPlugin, "");
            if (C89219l.m154714a((Object) first, (Object) createIUserServicebyMonsterPlugin.getCurrentUserID()) && pVar.getSecond() != null) {
                z = true;
            }
            if (!z) {
                pVar = null;
            }
            if (pVar != null) {
                try {
                    return (C68348f) C80342dg.m139301a(((JSONObject) pVar.getSecond()).toString(), C68348f.class);
                } catch (C28027t e) {
                    C51423a.m95790a((Throwable) e);
                }
            }
        }
        this.f152284a = null;
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.services.IUpdateSettingService
    /* renamed from: a */
    public final void mo108583a(JSONObject jSONObject) {
        if (jSONObject != null) {
            IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
            C89219l.m154716b(createIUserServicebyMonsterPlugin, "");
            String currentUserID = createIUserServicebyMonsterPlugin.getCurrentUserID();
            if (currentUserID != null && !C89361p.m154870a((CharSequence) currentUserID)) {
                this.f152284a = C89387v.m154943a(currentUserID, jSONObject);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.services.IUpdateSettingService
    /* renamed from: a */
    public final void mo108582a(String str, int i) {
        String str2;
        C89378p<String, ? extends JSONObject> pVar;
        JSONObject jSONObject;
        if (this.f152284a != null) {
            IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
            C89219l.m154716b(createIUserServicebyMonsterPlugin, "");
            String currentUserID = createIUserServicebyMonsterPlugin.getCurrentUserID();
            C89378p<String, ? extends JSONObject> pVar2 = this.f152284a;
            if (pVar2 != null) {
                str2 = pVar2.getFirst();
            } else {
                str2 = null;
            }
            if (C89219l.m154714a((Object) currentUserID, (Object) str2) && (pVar = this.f152284a) != null && (jSONObject = (JSONObject) pVar.getSecond()) != null) {
                jSONObject.putOpt(str, Integer.valueOf(i));
            }
        }
    }
}
