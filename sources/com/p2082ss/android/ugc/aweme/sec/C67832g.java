package com.p2082ss.android.ugc.aweme.sec;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.sec.AbstractC67826d;
import okhttp3.AbstractC90202u;
import okhttp3.C90029ac;
import okhttp3.C90195q;
import okhttp3.Request;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.sec.g */
public final class C67832g implements AbstractC90202u {
    static {
        Covode.recordClassIndex(79493);
    }

    /* renamed from: com.ss.android.ugc.aweme.sec.g$a */
    static final class C67833a extends C67829f<C90029ac> {

        /* renamed from: g */
        public AbstractC90202u.AbstractC90203a f152030g;

        /* renamed from: h */
        public C90029ac f152031h;

        static {
            Covode.recordClassIndex(79494);
        }

        @Override // com.p2082ss.android.ugc.aweme.sec.AbstractC67826d.C67827a
        /* renamed from: d */
        public final AbstractC67826d<C90029ac> mo106933d() {
            return new AbstractC67826d.C67827a<C90029ac>() {
                /* class com.p2082ss.android.ugc.aweme.sec.C67832g.C67833a.C678341 */

                static {
                    Covode.recordClassIndex(79495);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // com.p2082ss.android.ugc.aweme.sec.AbstractC67826d.C67827a, com.p2082ss.android.ugc.aweme.sec.AbstractC67826d
                /* renamed from: a */
                public final /* bridge */ /* synthetic */ C90029ac mo95562a() {
                    return C67833a.this.f152031h;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // com.p2082ss.android.ugc.aweme.sec.AbstractC67826d.C67827a, com.p2082ss.android.ugc.aweme.sec.AbstractC67826d
                /* renamed from: b */
                public final /* synthetic */ C90029ac mo95563b() {
                    C67833a.this.f152030g.mo144856a().url();
                    AbstractC90202u.AbstractC90203a aVar = C67833a.this.f152030g;
                    Request a = aVar.mo144856a();
                    String valueOf = String.valueOf(System.currentTimeMillis());
                    Request.C90016a a2 = a.newBuilder().mo144697a(a.url());
                    C90195q qVar = (C90195q) a.body();
                    if (qVar != null && qVar.mo145019a() > 0) {
                        C90195q.C90196a aVar2 = new C90195q.C90196a();
                        for (int i = 0; i < qVar.mo145019a(); i++) {
                            if (TextUtils.equals(qVar.mo145020a(i), "_rticket")) {
                                aVar2.mo145024b(qVar.mo145020a(i), valueOf);
                            } else {
                                aVar2.mo145024b(qVar.mo145020a(i), qVar.mo145021b(i));
                            }
                        }
                        a2.mo144693a(a.method(), aVar2.mo145023a());
                    }
                    return aVar.mo144857a(a2.mo144698a());
                }
            };
        }

        private C67833a(AbstractC90202u.AbstractC90203a aVar, C90029ac acVar) {
            this.f152030g = aVar;
            this.f152031h = acVar;
        }

        /* synthetic */ C67833a(AbstractC90202u.AbstractC90203a aVar, C90029ac acVar, byte b) {
            this(aVar, acVar);
        }
    }

    @Override // okhttp3.AbstractC90202u
    public final C90029ac intercept(AbstractC90202u.AbstractC90203a aVar) {
        String str;
        boolean z;
        int intValue;
        C90029ac a = aVar.mo144857a(aVar.mo144856a());
        String str2 = null;
        String a2 = a.mo144718a("Content-Type", null);
        Request request = a.f204105a;
        String str3 = "";
        if (request == null || request.url() == null) {
            str = str3;
        } else {
            str = request.url().toString();
        }
        if (TextUtils.isEmpty(a2)) {
            return a;
        }
        if ((!TextUtils.isEmpty(a2) && !a2.contains("json")) || (!TextUtils.isEmpty(str) && (str.contains("/effect/api") || str.contains("/model/api")))) {
            return a;
        }
        String a3 = C67828e.m120018a(a);
        if (!TextUtils.isEmpty(a3)) {
            try {
                JSONObject jSONObject = new JSONObject(a3);
                boolean z2 = false;
                r2 = 0;
                int i = 0;
                z2 = false;
                C67833a aVar2 = new C67833a(aVar, a, (byte) 0);
                String tVar = aVar.mo144856a().url().toString();
                aVar2.f152027f = jSONObject;
                if ((!jSONObject.has("status_code") || jSONObject.optInt("status_code") != 0) && (!jSONObject.has("message") || !TextUtils.equals("success", jSONObject.optString("message")))) {
                    z = false;
                } else {
                    z = true;
                }
                if (!z) {
                    if (jSONObject.has("error_code")) {
                        intValue = jSONObject.optInt("error_code");
                    } else if (jSONObject.has("status_code")) {
                        intValue = jSONObject.optInt("status_code");
                    } else if (SecApiImpl.m119993a().isCaptchaUrl(tVar)) {
                        if (SecApiImpl.m119993a().isCaptchaUrl(tVar)) {
                            if (jSONObject.has("message")) {
                                str3 = jSONObject.optString("message");
                            }
                            if (TextUtils.equals(str3, "error")) {
                                JSONObject jSONObject2 = new JSONObject(jSONObject.optString("data"));
                                i = jSONObject2.optInt("error_code");
                                str2 = jSONObject2.optString("verify_center_decision_conf");
                                if (TextUtils.isEmpty(str2)) {
                                    str2 = jSONObject2.optString("verify_center_secondary_decision_conf");
                                }
                            }
                        }
                        Pair create = Pair.create(Integer.valueOf(i), str2);
                        intValue = ((Integer) create.first).intValue();
                        if (!TextUtils.isEmpty((CharSequence) create.second)) {
                            z2 = aVar2.mo106935a((String) create.second);
                        }
                    }
                    z2 = aVar2.mo106934a(intValue);
                }
                if (z2) {
                    return (C90029ac) aVar2.mo106932c();
                }
            } catch (JSONException e) {
                e.printStackTrace();
            } catch (InterruptedException e2) {
                e2.printStackTrace();
            } catch (Exception e3) {
                e3.printStackTrace();
            }
        }
        return a;
    }
}
