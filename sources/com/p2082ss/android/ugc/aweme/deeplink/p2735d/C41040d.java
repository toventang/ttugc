package com.p2082ss.android.ugc.aweme.deeplink.p2735d;

import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.newmedia.p2166d.C30132b;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.MobClick;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.deeplink.d.d */
public final class C41040d {
    static {
        Covode.recordClassIndex(48910);
    }

    /* renamed from: a */
    static void m82678a(boolean z, String str, String str2, JSONObject jSONObject, Intent intent) {
        String str3;
        if (z) {
            try {
                int a = C30132b.m60952a(intent, "msg_from");
                MobClick eventName = MobClick.obtain().setEventName("detail");
                if (a == 1) {
                    str3 = "click_news_notify";
                } else {
                    str3 = "click_news_alert";
                }
                MobClick labelName = eventName.setLabelName(str3);
                if (str == null) {
                    str = "";
                }
                C39162r.onEvent(labelName.setValue(str).setExtValueString(str2).setJsonObject(jSONObject));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
