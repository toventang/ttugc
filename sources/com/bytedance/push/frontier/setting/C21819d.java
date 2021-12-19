package com.bytedance.push.frontier.setting;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.common.utility.AbstractC13621j;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.push.C21798f;
import com.bytedance.push.frontier.C21813c;
import com.bytedance.push.frontier.p1594a.AbstractC21809d;
import com.bytedance.push.settings.C21895h;
import com.bytedance.push.settings.PushOnlineSettings;
import com.p2082ss.android.message.p2159a.C30062a;
import com.p2082ss.android.pushmanager.C30205a;
import java.util.ArrayList;
import java.util.Map;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.push.frontier.setting.d */
public final class C21819d {
    static {
        Covode.recordClassIndex(25471);
    }

    C21819d() {
    }

    /* renamed from: a */
    public final synchronized void mo35504a(Context context, AbstractC21809d dVar) {
        boolean z;
        MethodCollector.m26663i(8719);
        FrontierLocalSetting frontierLocalSetting = (FrontierLocalSetting) C21895h.m41120a(context, FrontierLocalSetting.class);
        long currentTimeMillis = System.currentTimeMillis();
        if (Math.abs(currentTimeMillis - frontierLocalSetting.mo35497a()) / 60000 < ((PushOnlineSettings) C21895h.m41120a(context, PushOnlineSettings.class)).mo35614l()) {
            z = true;
        } else {
            z = false;
        }
        C21815a b = frontierLocalSetting.mo35500b();
        if (b == null || !b.mo35502b() || !z) {
            try {
                String a = AbstractC13621j.f33100a.mo21869a(C30062a.m60802a(C30205a.m61093a("/cloudpush/update_frontier_setting/"), C21798f.f51646a.mo35448e()), new ArrayList(), (Map<String, String>) null);
                if (TextUtils.isEmpty(a)) {
                    m40867a(304, a, currentTimeMillis);
                } else {
                    JSONObject jSONObject = new JSONObject(a);
                    if (!TextUtils.equals("success", jSONObject.optString("message"))) {
                        m40867a(302, a, currentTimeMillis);
                    } else {
                        C21815a a2 = C21815a.m40862a(jSONObject.optJSONObject("frontier_setting"));
                        if (a2 == null || !a2.mo35502b()) {
                            m40867a(303, a, currentTimeMillis);
                        } else {
                            frontierLocalSetting.mo35498a(System.currentTimeMillis());
                            frontierLocalSetting.mo35499a(a2);
                            C21813c.m40850a().mo35496c().mo35488a(System.currentTimeMillis() - currentTimeMillis);
                            dVar.mo35492a(a2);
                            MethodCollector.m26664o(8719);
                            return;
                        }
                    }
                }
            } catch (Throwable th) {
                m40867a(301, th.getLocalizedMessage(), currentTimeMillis);
            }
        }
        dVar.mo35492a(b);
        MethodCollector.m26664o(8719);
    }

    /* renamed from: a */
    private static void m40867a(int i, String str, long j) {
        C21813c.m40850a().mo35496c().mo35487a(i, str, System.currentTimeMillis() - j);
    }
}
