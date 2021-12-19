package com.bytedance.globalpayment.payment.common.lib.p1081i;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.common.utility.AbstractC13621j;
import com.bytedance.common.utility.p907b.RunnableC13596e;
import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.payment.common.lib.p1071a.AbstractC15238d;
import com.bytedance.globalpayment.payment.common.lib.p1078h.C15253a;
import com.bytedance.globalpayment.payment.common.lib.p1082j.C15282d;
import com.bytedance.globalpayment.payment.common.lib.settings.PaymentLocalSettings;
import com.bytedance.globalpayment.payment.common.lib.settings.PaymentOnlineSettings;
import com.bytedance.push.settings.C21895h;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.globalpayment.payment.common.lib.i.a */
public class RunnableC15277a implements Runnable {

    /* renamed from: a */
    public AbstractC15238d f37283a;

    /* renamed from: b */
    private final String f37284b = RunnableC15277a.class.getSimpleName();

    /* renamed from: c */
    private String f37285c;

    static {
        Covode.recordClassIndex(17477);
    }

    /* renamed from: a */
    private static boolean m28151a() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    public void run() {
        final Context b = C15253a.m28071a().mo24709i().mo24713b();
        if (Math.abs(System.currentTimeMillis() - ((PaymentLocalSettings) C21895h.m41120a(b, PaymentLocalSettings.class)).mo24749b()) < ((PaymentOnlineSettings) C21895h.m41120a(b, PaymentOnlineSettings.class)).mo24755c()) {
            C15253a.m28071a().mo24705e();
        } else {
            if (!C58029j.f132253e || !C58029j.m104846b() || C58029j.m104847c()) {
                C58029j.f132253e = m28151a();
            }
            if (C58029j.f132253e) {
                try {
                    String a = AbstractC13621j.f33100a.mo21870a(C15282d.m28157a(this.f37285c + "/service/settings/v3/?caller_name=pipo_pay", C15253a.m28071a().mo24709i().mo24717f()), null);
                    if (TextUtils.isEmpty(a)) {
                        C15253a.m28071a().mo24705e();
                        return;
                    }
                    try {
                        JSONObject jSONObject = new JSONObject(a);
                        String optString = jSONObject.optString("message");
                        JSONObject optJSONObject = jSONObject.optJSONObject("data");
                        if (TextUtils.equals(optString, "success") && optJSONObject != null) {
                            JSONObject optJSONObject2 = optJSONObject.optJSONObject("settings");
                            if (optJSONObject2 == null) {
                                C15253a.m28071a().mo24705e();
                                return;
                            }
                            final JSONObject optJSONObject3 = optJSONObject2.optJSONObject("sdk_key_pipo_pay");
                            if (optJSONObject3 == null) {
                                C15253a.m28071a().mo24705e();
                                return;
                            }
                            C15253a.m28071a().mo24705e();
                            RunnableC152781 r2 = new Runnable() {
                                /* class com.bytedance.globalpayment.payment.common.lib.p1081i.RunnableC15277a.RunnableC152781 */

                                static {
                                    Covode.recordClassIndex(17478);
                                }

                                public final void run() {
                                    ((PaymentOnlineSettings) C21895h.m41120a(b, PaymentOnlineSettings.class)).updateSettings(b, optJSONObject3);
                                    ((PaymentLocalSettings) C21895h.m41120a(b, PaymentLocalSettings.class)).mo24747a(System.currentTimeMillis());
                                    RunnableC15277a.this.f37283a.mo24696a();
                                }
                            };
                            if (Looper.myLooper() == Looper.getMainLooper()) {
                                RunnableC13596e.m24423a(r2);
                                return;
                            } else {
                                r2.run();
                                return;
                            }
                        } else {
                            return;
                        }
                    } catch (JSONException e) {
                        e.printStackTrace();
                        C15253a.m28071a().mo24705e();
                        return;
                    }
                } catch (Exception e2) {
                    C15253a.m28071a().mo24705e();
                    Log.getStackTraceString(e2);
                    return;
                }
            }
        }
        C15253a.m28071a().mo24705e();
    }

    public RunnableC15277a(String str, AbstractC15238d dVar) {
        this.f37285c = str;
        this.f37283a = dVar;
    }
}
