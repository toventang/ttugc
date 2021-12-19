package com.p2082ss.android.ugc.aweme.request_combine.request.p3679b;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.ext.C18097a;
import com.bytedance.keva.Keva;
import com.p2082ss.android.ugc.aweme.SettingsRequestServiceImpl;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58259r;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58260s;
import com.p2082ss.android.ugc.aweme.lego.EnumC58147aa;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.request_combine.api.SettingCombineApi;
import com.p2082ss.android.ugc.aweme.request_combine.p3676b.C67119a;
import com.p2082ss.android.ugc.aweme.request_combine.p3676b.EnumC67120b;
import com.p2082ss.android.ugc.aweme.request_combine.request.AbstractC67146b;
import com.p2082ss.android.ugc.aweme.request_combine.request.C67151c;
import com.p2082ss.android.ugc.aweme.request_combine.request.SettingRequestExtraInfoImpl;
import com.p2082ss.android.ugc.aweme.requestcombine.AbstractC67177b;
import com.p2082ss.android.ugc.aweme.requestcombine.ISettingRequestExtraInfo;
import com.p2082ss.android.ugc.aweme.settingsrequest.api.ISettingsRequestService;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.request_combine.request.b.c */
public final class C67149c implements AbstractC58259r {
    static {
        Covode.recordClassIndex(78752);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: a */
    public final void mo28600a(Context context) {
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    public final int bQ_() {
        return 1048575;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: f */
    public final EnumC58150ad mo28606f() {
        return AbstractC58260s.m105199a(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: g */
    public final String mo28607g() {
        return "request_";
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

    /* renamed from: com.ss.android.ugc.aweme.request_combine.request.b.c$a */
    public static final class C67150a implements AbstractC67177b {
        static {
            Covode.recordClassIndex(78753);
        }

        C67150a() {
        }

        @Override // com.p2082ss.android.ugc.aweme.requestcombine.AbstractC67177b
        /* renamed from: a */
        public final void mo95778a(Map<String, String> map) {
            ISettingsRequestService i = SettingsRequestServiceImpl.m65417i();
            if (i != null) {
                i.mo57282a(map);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58259r
    /* renamed from: b */
    public final EnumC58147aa mo58051b() {
        return EnumC58147aa.P0;
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

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58259r
    /* renamed from: a */
    public final void mo58050a(Context context, boolean z) {
        Integer num;
        C89219l.m154721d(context, "");
        ISettingRequestExtraInfo a = SettingRequestExtraInfoImpl.m118789a();
        if (a != null) {
            a.mo106071a(new C67150a());
        }
        C67119a.m118771a(EnumC67120b.FETCH_COMBINE_SETTINGS_REQUEST);
        C89219l.m154721d(context, "");
        StringBuilder sb = new StringBuilder();
        Set<String> keySet = C67151c.f150562c.keySet();
        C89219l.m154716b(keySet, "");
        int i = 0;
        for (T t : keySet) {
            if (i != 0) {
                sb.append(",");
            }
            sb.append((String) t);
            i++;
        }
        Keva repoFromSp = Keva.getRepoFromSp(context, "setting_repo_sp", 0);
        if (repoFromSp != null) {
            num = Integer.valueOf(repoFromSp.getInt("key_has_local_cache", 0));
        } else {
            num = null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("api_list", sb.toString());
        hashMap.put("has_local_cache", String.valueOf(num));
        Collection<AbstractC67146b> values = C67151c.f150562c.values();
        C89219l.m154716b(values, "");
        Iterator<T> it = values.iterator();
        while (it.hasNext()) {
            Map<String, String> a2 = it.next().mo106077a(context);
            if (a2 != null) {
                hashMap.putAll(a2);
            }
        }
        C67119a.m118771a(EnumC67120b.SETTINGS_COMBINE_API_CREATE);
        ((SettingCombineApi) C18097a.m33696a().mo28816a(SettingCombineApi.C67118a.f150527a).mo28858a(SettingCombineApi.class)).request(hashMap).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143292d(C67151c.C67156e.f150571a).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143062b(new C67151c.C67157f(context));
    }
}
