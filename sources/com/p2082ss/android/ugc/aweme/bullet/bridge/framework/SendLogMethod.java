package com.p2082ss.android.ugc.aweme.bullet.bridge.framework;

import android.text.TextUtils;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18137d;
import com.google.gson.C28022o;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p2082ss.android.ugc.aweme.commercialize.log.C38189j;
import com.p2082ss.android.ugc.aweme.common.C39161q;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.SendLogMethod */
public final class SendLogMethod extends BaseBridgeMethod implements AbstractC33974au {

    /* renamed from: b */
    public static final C35088a f82798b = new C35088a((byte) 0);

    /* renamed from: c */
    private final String f82799c = "sendLog";

    static {
        Covode.recordClassIndex(42222);
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.SendLogMethod$a */
    public static final class C35088a {
        static {
            Covode.recordClassIndex(42223);
        }

        private C35088a() {
        }

        public /* synthetic */ C35088a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16192q
    /* renamed from: d */
    public final String mo25752d() {
        return this.f82799c;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SendLogMethod(C16248b bVar) {
        super(bVar);
        C89219l.m154721d(bVar, "");
        mo25722a(C35102a.f82836a);
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    /* renamed from: a */
    public final void mo61866a(JSONObject jSONObject, BaseBridgeMethod.AbstractC34965a aVar) {
        long j;
        boolean z;
        C89219l.m154721d(jSONObject, "");
        C89219l.m154721d(aVar, "");
        mo26893e();
        if (jSONObject == null) {
            aVar.mo61871a(0, "");
            return;
        }
        String optString = jSONObject.optString("eventName");
        String optString2 = jSONObject.optString("labelName");
        String optString3 = jSONObject.optString("value");
        String optString4 = jSONObject.optString("extValue");
        JSONObject optJSONObject = jSONObject.optJSONObject("extJson");
        long j2 = 0;
        if (!TextUtils.isEmpty(optString3)) {
            j = Long.parseLong(optString3);
        } else {
            j = 0;
        }
        if (!TextUtils.isEmpty(optString4)) {
            j2 = Long.parseLong(optString4);
        }
        if (optJSONObject == null || !optJSONObject.has("is_ad_event") || (!TextUtils.equals("1", optJSONObject.optString("is_ad_event")) && optJSONObject.optInt("is_ad_event") != 1 && !optJSONObject.optBoolean("is_ad_event"))) {
            z = false;
        } else {
            z = true;
        }
        if (mo26893e() != null) {
            if (!z) {
                C39161q.m79449a(mo26893e(), optString, optString2, j, j2, optJSONObject);
            } else if (TextUtils.equals("click", optString2)) {
                C38189j.m77497a(optString, optString3, j2, optJSONObject);
                optJSONObject.put("has_v3", 1);
                C39161q.m79449a(mo26893e(), optString, optString2, j, j2, optJSONObject);
            } else {
                C89219l.m154716b(optString, "");
                C89219l.m154716b(optString2, "");
                C18129a.C18130a a = C18129a.m33747a(optString, optString2, String.valueOf(j), "", String.valueOf(j2));
                if (optJSONObject != null) {
                    Iterator<String> keys = optJSONObject.keys();
                    C89219l.m154716b(keys, "");
                    while (keys.hasNext()) {
                        String next = keys.next();
                        a.mo28900b(next, optJSONObject.opt(next));
                    }
                }
                a.mo28902c();
                if (C18137d.m33765b()) {
                    C39161q.m79449a(mo26893e(), optString, optString2, j, j2, optJSONObject);
                } else if (C18137d.m33764a()) {
                    if (optJSONObject != null) {
                        try {
                            optJSONObject.put("_ad_staging_flag", "1");
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                    C39161q.m79449a(mo26893e(), optString, optString2, j, j2, optJSONObject);
                }
            }
            aVar.mo61872a(new C28022o());
            return;
        }
        aVar.mo61871a(0, "");
    }
}
