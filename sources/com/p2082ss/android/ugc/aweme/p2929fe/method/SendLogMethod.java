package com.p2082ss.android.ugc.aweme.p2929fe.method;

import android.content.Context;
import android.text.TextUtils;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18137d;
import com.bytedance.ies.web.p1285a.C18288a;
import com.google.gson.C28022o;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.commercialize.log.C38189j;
import com.p2082ss.android.ugc.aweme.common.C39161q;
import com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.fe.method.SendLogMethod */
public final class SendLogMethod extends BaseCommonJavaMethod implements AbstractC33974au {

    /* renamed from: a */
    public static final C47889a f110921a = new C47889a((byte) 0);

    static {
        Covode.recordClassIndex(56572);
    }

    private SendLogMethod(byte b) {
        this();
    }

    @Override // androidx.lifecycle.AbstractC1202k, com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.SendLogMethod$a */
    public static final class C47889a {
        static {
            Covode.recordClassIndex(56573);
        }

        private C47889a() {
        }

        public /* synthetic */ C47889a(byte b) {
            this();
        }
    }

    private /* synthetic */ SendLogMethod() {
        this((C18288a) null);
    }

    public SendLogMethod(C18288a aVar) {
        super(aVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, BaseCommonJavaMethod.AbstractC47813a aVar) {
        long j;
        boolean z;
        if (jSONObject != null) {
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
            if (this.mContextRef != null) {
                if (!z) {
                    C39161q.m79449a((Context) this.mContextRef.get(), optString, optString2, j, j2, optJSONObject);
                } else if (TextUtils.equals("click", optString2)) {
                    C38189j.m77497a(optString, optString3, j2, optJSONObject);
                    optJSONObject.put("has_v3", 1);
                    C39161q.m79449a((Context) this.mContextRef.get(), optString, optString2, j, j2, optJSONObject);
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
                        C39161q.m79449a((Context) this.mContextRef.get(), optString, optString2, j, j2, optJSONObject);
                    } else if (C18137d.m33764a()) {
                        if (optJSONObject != null) {
                            try {
                                optJSONObject.put("_ad_staging_flag", "1");
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
                        }
                        C39161q.m79449a((Context) this.mContextRef.get(), optString, optString2, j, j2, optJSONObject);
                    }
                }
                if (aVar != null) {
                    aVar.mo79886a(new C28022o());
                }
            } else if (aVar != null) {
                aVar.mo79885a(0, "");
            }
        } else if (aVar != null) {
            aVar.mo79885a(0, "");
        }
    }
}
