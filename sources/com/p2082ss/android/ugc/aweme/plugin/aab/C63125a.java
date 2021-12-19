package com.p2082ss.android.ugc.aweme.plugin.aab;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.apm.C12290b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.plugin.p1265a.C18115a;
import com.bytedance.ies.ugc.aweme.plugin.p1266b.C18123a;
import com.bytedance.ies.ugc.aweme.plugin.service.AbstractC18128a;
import com.bytedance.keva.Keva;
import com.bytedance.p1542m.C21411c;
import com.bytedance.p1542m.p1543a.C21406d;
import com.bytedance.p1542m.p1544b.C21409a;
import com.google.android.play.core.p1965d.C26975a;
import com.p2082ss.android.ugc.aweme.aabplugin.core.base.C31343o;
import com.p2082ss.android.ugc.aweme.aabplugin.core.p2228a.C31301a;
import com.p2082ss.android.ugc.aweme.aabplugin.core.p2228a.C31304d;
import com.p2082ss.android.ugc.aweme.aabplugin.core.p2229b.C31305a;
import com.p2082ss.android.ugc.aweme.aabplugin.core.p2229b.C31308d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.plugin.aab.a */
public final class C63125a implements AbstractC18128a {
    static {
        Covode.recordClassIndex(73969);
    }

    @Override // com.bytedance.ies.ugc.aweme.plugin.service.AbstractC18128a
    /* renamed from: b */
    public final void mo28896b() {
        try {
            ArrayList<String> arrayList = new ArrayList();
            Map<String, C21409a> a = C21411c.m40191a();
            if (a != null) {
                for (C21409a aVar : a.values()) {
                    if (aVar.f50790c == 5) {
                        arrayList.add(C21406d.m40180a().mo35010a(aVar.f50788a));
                    }
                }
            }
            JSONObject jSONObject = new JSONObject();
            StringBuilder sb = new StringBuilder();
            for (String str : arrayList) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(str);
            }
            jSONObject.put("name_list", sb.toString());
            C39162r.m79463b("df_installed_modules", jSONObject);
            C12290b.m22060a("df_installed_modules", 0, jSONObject);
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.plugin.service.AbstractC18128a
    /* renamed from: a */
    public final void mo28894a() {
        Keva repo;
        if (C18123a.f43179d && Build.VERSION.SDK_INT >= 21 && (repo = Keva.getRepo("dynamic_task_triggered", 0)) != null) {
            for (Map.Entry<String, ?> entry : repo.getAll().entrySet()) {
                String str = (String) entry.getValue();
                if (str != null) {
                    if (TextUtils.equals(str, "com.ss.android.ugc.aweme.dflanguage")) {
                        Locale locale = new Locale(entry.getKey());
                        if (!C31305a.m65481a(locale)) {
                            C18115a.C18116a aVar = new C18115a.C18116a();
                            aVar.f43126a = false;
                            aVar.f43130e = true;
                            new C31305a(new C31308d(locale, true, true, null, aVar.mo28875a())).mo57300a();
                        }
                    } else if (!C31343o.m65555a(str)) {
                        C18115a.C18116a aVar2 = new C18115a.C18116a();
                        aVar2.f43126a = false;
                        aVar2.f43130e = true;
                        new C31301a(new C31304d(str, true, true, null, aVar2.mo28875a())).mo57300a();
                    }
                }
            }
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.plugin.service.AbstractC18128a
    /* renamed from: a */
    public final boolean mo28895a(Context context) {
        return C26975a.m53596a(context, false);
    }
}
