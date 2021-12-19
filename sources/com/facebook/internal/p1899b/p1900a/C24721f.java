package com.facebook.internal.p1899b.p1900a;

import com.bytedance.covode.number.Covode;
import com.facebook.C24872m;
import com.facebook.internal.p1894a.p1896b.C24677a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.internal.b.a.f */
public final class C24721f {

    /* renamed from: a */
    public static AbstractC24723a f58705a = new AbstractC24723a() {
        /* class com.facebook.internal.p1899b.p1900a.C24721f.C247221 */

        static {
            Covode.recordClassIndex(28875);
        }

        @Override // com.facebook.internal.p1899b.p1900a.C24721f.AbstractC24723a
        /* renamed from: a */
        public final void mo40563a() {
            if (!C24677a.m47209a(C24715b.class)) {
                try {
                    if (!C24715b.f58685b) {
                        C24715b.f58685b = true;
                        if (!C24677a.m47209a(C24715b.class)) {
                            try {
                                C24872m.m47689c().execute(new Runnable() {
                                    /* class com.facebook.internal.p1899b.p1900a.C24715b.RunnableC247161 */

                                    static {
                                        Covode.recordClassIndex(28869);
                                    }

                                    public final void run() {
                                        if (!C24677a.m47209a(this)) {
                                            try {
                                                JSONObject a = C24715b.m47335a();
                                                if (a != null && !C24677a.m47209a(C24715b.class)) {
                                                    try {
                                                        JSONArray jSONArray = a.getJSONObject("monitoring_config").getJSONArray("sample_rates");
                                                        for (int i = 0; i < jSONArray.length(); i++) {
                                                            JSONObject jSONObject = jSONArray.getJSONObject(i);
                                                            String string = jSONObject.getString("key");
                                                            int i2 = jSONObject.getInt("value");
                                                            if ("default".equals(string)) {
                                                                C24715b.f58684a = Integer.valueOf(i2);
                                                            } else {
                                                                C24715b.f58687d.put(string, Integer.valueOf(i2));
                                                            }
                                                        }
                                                    } catch (JSONException unused) {
                                                    } catch (Throwable th) {
                                                        C24677a.m47208a(th, C24715b.class);
                                                    }
                                                }
                                            } catch (Throwable th2) {
                                                C24677a.m47208a(th2, this);
                                            }
                                        }
                                    }
                                });
                            } catch (Throwable th) {
                                C24677a.m47208a(th, C24715b.class);
                            }
                        }
                        C24715b.f58686c.mo40556a();
                    }
                } catch (Throwable th2) {
                    C24677a.m47208a(th2, C24715b.class);
                }
            }
        }
    };

    /* renamed from: com.facebook.internal.b.a.f$a */
    public interface AbstractC24723a {
        static {
            Covode.recordClassIndex(28876);
        }

        /* renamed from: a */
        void mo40563a();
    }

    static {
        Covode.recordClassIndex(28874);
    }
}
