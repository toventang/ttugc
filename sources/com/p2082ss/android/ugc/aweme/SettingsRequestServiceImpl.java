package com.p2082ss.android.ugc.aweme;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.ies.ugc.aweme.network.zstd.ZstdDictUpdateTask;
import com.bytedance.keva.Keva;
import com.google.gson.C28022o;
import com.p2082ss.android.common.util.C29843f;
import com.p2082ss.android.p2140di.push.C29902a;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.SharePrefCache;
import com.p2082ss.android.ugc.aweme.commercialize.link.C38038b;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38634al;
import com.p2082ss.android.ugc.aweme.contentlanguage.C40203j;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.C42995z;
import com.p2082ss.android.ugc.aweme.feed.C49907s;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p2082ss.android.ugc.aweme.lego.C58221f;
import com.p2082ss.android.ugc.aweme.p3070im.C53588a;
import com.p2082ss.android.ugc.aweme.p3070im.C53601e;
import com.p2082ss.android.ugc.aweme.p3070im.C53603g;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.C56256i;
import com.p2082ss.android.ugc.aweme.p4173ug.UgCommonServiceImpl;
import com.p2082ss.android.ugc.aweme.push.downgrade.C65711b;
import com.p2082ss.android.ugc.aweme.push.downgrade.C65714e;
import com.p2082ss.android.ugc.aweme.setting.C68032br;
import com.p2082ss.android.ugc.aweme.setting.model.C68174d;
import com.p2082ss.android.ugc.aweme.setting.serverpush.AbstractC68342a;
import com.p2082ss.android.ugc.aweme.setting.serverpush.p3728a.C68348f;
import com.p2082ss.android.ugc.aweme.settingsrequest.C68812l;
import com.p2082ss.android.ugc.aweme.settingsrequest.api.ISettingsRequestService;
import com.p2082ss.android.ugc.aweme.settingsrequest.p3739b.C68783a;
import com.p2082ss.android.ugc.aweme.settingsrequest.p3740c.C68786a;
import com.p2082ss.android.ugc.aweme.settingsrequest.p3740c.C68787b;
import com.p2082ss.android.ugc.aweme.settingsrequest.p3742e.C68802a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.SettingsRequestServiceImpl */
public class SettingsRequestServiceImpl implements ISettingsRequestService {
    static {
        Covode.recordClassIndex(37984);
    }

    @Override // com.p2082ss.android.ugc.aweme.settingsrequest.api.ISettingsRequestService
    /* renamed from: d */
    public final int mo57286d() {
        return C68787b.f153845a;
    }

    @Override // com.p2082ss.android.ugc.aweme.settingsrequest.api.ISettingsRequestService
    /* renamed from: e */
    public final int mo57287e() {
        return C68786a.f153841a;
    }

    @Override // com.p2082ss.android.ugc.aweme.settingsrequest.api.ISettingsRequestService
    /* renamed from: f */
    public final int mo57288f() {
        return C68786a.f153842b;
    }

    @Override // com.p2082ss.android.ugc.aweme.settingsrequest.api.ISettingsRequestService
    /* renamed from: g */
    public final boolean mo57289g() {
        return C68786a.f153844d;
    }

    @Override // com.p2082ss.android.ugc.aweme.settingsrequest.api.ISettingsRequestService
    /* renamed from: h */
    public final boolean mo57290h() {
        if (C68786a.f153843c == 1) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.settingsrequest.api.ISettingsRequestService
    /* renamed from: c */
    public final boolean mo57285c() {
        return C16048b.m29633a().mo25421a(true, "share_useNotifySingle", false);
    }

    @Override // com.p2082ss.android.ugc.aweme.settingsrequest.api.ISettingsRequestService
    /* renamed from: a */
    public final List<AbstractC68342a> mo57274a() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(C53603g.C53604a.m98850a());
        arrayList.add(C68032br.f152383a);
        arrayList.add(new C53601e());
        return arrayList;
    }

    /* renamed from: i */
    public static ISettingsRequestService m65417i() {
        MethodCollector.m26663i(6339);
        Object a = C81908b.m141854a(ISettingsRequestService.class, false);
        if (a != null) {
            ISettingsRequestService iSettingsRequestService = (ISettingsRequestService) a;
            MethodCollector.m26664o(6339);
            return iSettingsRequestService;
        }
        if (C81908b.f183412u == null) {
            synchronized (ISettingsRequestService.class) {
                try {
                    if (C81908b.f183412u == null) {
                        C81908b.f183412u = new SettingsRequestServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(6339);
                    throw th;
                }
            }
        }
        SettingsRequestServiceImpl settingsRequestServiceImpl = (SettingsRequestServiceImpl) C81908b.f183412u;
        MethodCollector.m26664o(6339);
        return settingsRequestServiceImpl;
    }

    @Override // com.p2082ss.android.ugc.aweme.settingsrequest.api.ISettingsRequestService
    /* renamed from: b */
    public final C56256i mo57283b() {
        C56256i a = C56256i.m102224a();
        a.f128309a = SharePrefCache.inst().getOpenImLink();
        a.f128310b = SharePrefCache.inst().getImUrlTemplate();
        a.f128311c = SharePrefCache.inst().getMultiSelectLimit();
        return a;
    }

    @Override // com.p2082ss.android.ugc.aweme.settingsrequest.api.ISettingsRequestService
    /* renamed from: a */
    public final void mo57279a(C68348f fVar) {
        C68802a.m121271a(fVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.settingsrequest.api.ISettingsRequestService
    /* renamed from: a */
    public final void mo57277a(C28022o oVar) {
        C42995z.f100241a.mo73181a(oVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.settingsrequest.api.ISettingsRequestService
    /* renamed from: a */
    public final void mo57275a(Activity activity) {
        if (activity != null) {
            C40203j a = C40203j.C40204a.m81323a();
            Boolean a2 = C49907s.m93685a();
            C89219l.m154716b(a2, "");
            if (a2.booleanValue() && !a.f94395a.mo69427c()) {
                C40203j.C40204a.m81323a().mo69406a(activity);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.settingsrequest.api.ISettingsRequestService
    /* renamed from: a */
    public final void mo57276a(Context context) {
        if (!C17873f.f42636l) {
            if (C65714e.m117626a(C17867d.m33078a())) {
                C65711b.f148061a = false;
                C65711b.m117624a();
            } else {
                C29902a.m60273a().initPushAccountService(C31575b.m65865g().isLogin());
            }
        }
        if (C29843f.m60129a(context)) {
            Keva.getRepo("ab_iorap_repo", 0).storeBoolean("iorap_enable_prefetch", C16048b.m29633a().mo25421a(true, "iorap_enable_prefetch", false));
        }
        C58221f.m105153e().mo95704a(new ZstdDictUpdateTask()).mo95706a();
        UgCommonServiceImpl.m138290j().mo123103c().mo123147a();
    }

    @Override // com.p2082ss.android.ugc.aweme.settingsrequest.api.ISettingsRequestService
    /* renamed from: b */
    public final JSONObject mo57284b(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        String[] split = Uri.decode(str).split(",");
        try {
            C28022o oVar = new C28022o();
            for (int i = 0; i < split.length; i++) {
                C68783a.m121254a(oVar, split[i], C68783a.m121251a(split[i]));
            }
            return new JSONObject(oVar.toString());
        } catch (JSONException unused) {
            return jSONObject;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.settingsrequest.api.ISettingsRequestService
    /* renamed from: a */
    public final void mo57278a(C68174d dVar) {
        if (dVar != null) {
            List<String> u = C68174d.m120440u();
            if (u != null && (!u.isEmpty())) {
                C38038b.f89886a = u;
            }
            if (dVar != null) {
                C38634al.f91293a = SettingsManager.m29616a().mo25394a("ad_web_container", 0);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.settingsrequest.api.ISettingsRequestService
    /* renamed from: a */
    public final void mo57280a(AbstractC68342a aVar) {
        C68802a.m121273a(aVar, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0043 A[SYNTHETIC] */
    @Override // com.p2082ss.android.ugc.aweme.settingsrequest.api.ISettingsRequestService
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo57281a(java.lang.String r18) {
        /*
        // Method dump skipped, instructions count: 343
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.SettingsRequestServiceImpl.mo57281a(java.lang.String):void");
    }

    @Override // com.p2082ss.android.ugc.aweme.settingsrequest.api.ISettingsRequestService
    /* renamed from: a */
    public final void mo57282a(Map<String, String> map) {
        if (map != null) {
            C68812l.f153899c.putAll(map);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.settingsrequest.api.ISettingsRequestService
    /* renamed from: a */
    public final C56256i mo57273a(SharedPreferences.Editor editor, IESSettingsProxy iESSettingsProxy) {
        return C53588a.m98812a(editor, iESSettingsProxy);
    }
}
