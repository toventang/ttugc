package com.p2082ss.android.ugc.aweme.p2929fe.method;

import android.app.Activity;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.p1285a.AbstractC18293d;
import com.bytedance.ies.web.p1285a.C18288a;
import com.bytedance.ies.web.p1285a.C18297h;
import com.p2082ss.android.sdk.webview.C30246d;
import java.lang.ref.WeakReference;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.fe.method.c */
public final class C47920c implements AbstractC18293d {

    /* renamed from: a */
    AbstractC47909a f110991a;

    /* renamed from: b */
    C18288a f110992b;

    /* renamed from: c */
    String f110993c;

    /* renamed from: d */
    public WeakReference<Context> f110994d;

    static {
        Covode.recordClassIndex(56617);
    }

    @Override // com.bytedance.ies.web.p1285a.AbstractC18293d
    public final void call(C18297h hVar, JSONObject jSONObject) {
        hVar.f43676i = false;
        this.f110993c = hVar.f43669b;
        this.f110991a.mo79933a(hVar.f43671d);
    }

    public C47920c(WeakReference<Context> weakReference, C18288a aVar) {
        this.f110992b = aVar;
        this.f110994d = weakReference;
        C479211 r1 = new AbstractC47909a(this.f110994d) {
            /* class com.p2082ss.android.ugc.aweme.p2929fe.method.C47920c.C479211 */

            static {
                Covode.recordClassIndex(56618);
            }

            @Override // com.p2082ss.android.ugc.aweme.p2929fe.method.AbstractC47963m
            /* renamed from: a */
            public final void mo61887a(final JSONArray jSONArray) {
                Activity b = C30246d.m61215b(C47920c.this.f110994d);
                if (b != null) {
                    b.runOnUiThread(new Runnable() {
                        /* class com.p2082ss.android.ugc.aweme.p2929fe.method.C47920c.C479211.RunnableC479221 */

                        static {
                            Covode.recordClassIndex(56619);
                        }

                        public final void run() {
                            C47920c cVar = C47920c.this;
                            JSONArray jSONArray = jSONArray;
                            cVar.f110991a.f110960c.mo79936a();
                            JSONObject jSONObject = new JSONObject();
                            try {
                                jSONObject.put("code", 1);
                                jSONObject.put("msg", "uploadSuccess");
                                jSONObject.put("data", jSONArray);
                                cVar.f110992b.mo29249a(cVar.f110993c, jSONObject);
                            } catch (JSONException unused) {
                                cVar.f110992b.mo29249a(cVar.f110993c, (JSONObject) null);
                            }
                        }
                    });
                }
            }

            @Override // com.p2082ss.android.ugc.aweme.p2929fe.method.AbstractC47963m
            /* renamed from: a */
            public final void mo61886a(final int i, final String str) {
                Activity b = C30246d.m61215b(C47920c.this.f110994d);
                if (b != null) {
                    b.runOnUiThread(new Runnable() {
                        /* class com.p2082ss.android.ugc.aweme.p2929fe.method.C47920c.C479211.RunnableC479232 */

                        static {
                            Covode.recordClassIndex(56620);
                        }

                        public final void run() {
                            C47920c cVar = C47920c.this;
                            int i = i;
                            String str = str;
                            cVar.f110991a.f110960c.mo79936a();
                            JSONObject jSONObject = new JSONObject();
                            try {
                                jSONObject.put("code", i);
                                jSONObject.put("msg", str);
                                jSONObject.put("data", new JSONArray());
                                cVar.f110992b.mo29249a(cVar.f110993c, jSONObject);
                            } catch (JSONException unused) {
                                cVar.f110992b.mo29249a(cVar.f110993c, (JSONObject) null);
                            }
                        }
                    });
                }
            }
        };
        this.f110991a = r1;
        r1.f110963f = false;
    }
}
