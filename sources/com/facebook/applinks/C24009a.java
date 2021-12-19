package com.facebook.applinks;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.facebook.AccessToken;
import com.facebook.C24798j;
import com.facebook.C24872m;
import com.facebook.GraphRequest;
import com.facebook.internal.C24693ad;
import com.facebook.internal.C24699ae;
import com.facebook.internal.C24710b;
import com.facebook.internal.p1894a.p1896b.C24677a;
import com.facebook.p1814a.C23973h;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.applinks.a */
public class C24009a {

    /* renamed from: f */
    private static final String f56849f = C24009a.class.getCanonicalName();

    /* renamed from: a */
    public String f56850a;

    /* renamed from: b */
    public Uri f56851b;

    /* renamed from: c */
    JSONObject f56852c;

    /* renamed from: d */
    public Bundle f56853d;

    /* renamed from: e */
    public String f56854e;

    /* renamed from: g */
    private JSONObject f56855g;

    /* renamed from: com.facebook.applinks.a$a */
    public interface AbstractC24011a {
        static {
            Covode.recordClassIndex(28137);
        }

        /* renamed from: a */
        void mo39531a(C24009a aVar);
    }

    private C24009a() {
    }

    static {
        Covode.recordClassIndex(28135);
    }

    /* renamed from: a */
    private static JSONObject m45433a(Uri uri) {
        if (C24677a.m47209a(C24009a.class) || uri == null) {
            return null;
        }
        try {
            String queryParameter = uri.getQueryParameter("al_applink_data");
            if (queryParameter == null) {
                return null;
            }
            try {
                return new JSONObject(queryParameter);
            } catch (JSONException unused) {
                return null;
            }
        } catch (Throwable th) {
            C24677a.m47208a(th, C24009a.class);
            return null;
        }
    }

    /* renamed from: a */
    private static Bundle m45431a(JSONObject jSONObject) {
        Bundle bundle = new Bundle();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONObject) {
                bundle.putBundle(next, m45431a((JSONObject) obj));
            } else if (obj instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) obj;
                int i = 0;
                if (jSONArray.length() == 0) {
                    bundle.putStringArray(next, new String[0]);
                } else {
                    Object obj2 = jSONArray.get(0);
                    if (obj2 instanceof JSONObject) {
                        Bundle[] bundleArr = new Bundle[jSONArray.length()];
                        while (i < jSONArray.length()) {
                            bundleArr[i] = m45431a(jSONArray.getJSONObject(i));
                            i++;
                        }
                        bundle.putParcelableArray(next, bundleArr);
                    } else if (!(obj2 instanceof JSONArray)) {
                        String[] strArr = new String[jSONArray.length()];
                        while (i < jSONArray.length()) {
                            strArr[i] = jSONArray.get(i).toString();
                            i++;
                        }
                        bundle.putStringArray(next, strArr);
                    } else {
                        throw new C24798j("Nested arrays are not supported.");
                    }
                }
            } else {
                bundle.putString(next, obj.toString());
            }
        }
        return bundle;
    }

    /* renamed from: a */
    static C24009a m45432a(String str) {
        if (str == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("version");
            if (jSONObject.getJSONObject("bridge_args").getString("method").equals("applink") && string.equals("2")) {
                C24009a aVar = new C24009a();
                JSONObject jSONObject2 = jSONObject.getJSONObject("method_args");
                aVar.f56852c = jSONObject2;
                if (jSONObject2.has("ref")) {
                    aVar.f56850a = aVar.f56852c.getString("ref");
                } else if (aVar.f56852c.has("referer_data")) {
                    JSONObject jSONObject3 = aVar.f56852c.getJSONObject("referer_data");
                    if (jSONObject3.has("fb_ref")) {
                        aVar.f56850a = jSONObject3.getString("fb_ref");
                    }
                }
                if (aVar.f56852c.has("target_url")) {
                    Uri parse = Uri.parse(aVar.f56852c.getString("target_url"));
                    aVar.f56851b = parse;
                    aVar.f56855g = m45433a(parse);
                }
                if (aVar.f56852c.has("extras")) {
                    JSONObject jSONObject4 = aVar.f56852c.getJSONObject("extras");
                    if (jSONObject4.has("deeplink_context")) {
                        JSONObject jSONObject5 = jSONObject4.getJSONObject("deeplink_context");
                        if (jSONObject5.has("promo_code")) {
                            aVar.f56854e = jSONObject5.getString("promo_code");
                        }
                    }
                }
                aVar.f56853d = m45431a(aVar.f56852c);
                return aVar;
            }
        } catch (JSONException unused) {
            C24693ad.m47277d(f56849f);
        } catch (C24798j unused2) {
            C24693ad.m47277d(f56849f);
        }
        return null;
    }

    /* renamed from: a */
    public static void m45434a(Context context, final AbstractC24011a aVar) {
        C24699ae.m47301a((Object) context, "context");
        C24699ae.m47301a(aVar, "completionHandler");
        final String a = C24693ad.m47233a(context);
        C24699ae.m47301a((Object) a, "applicationId");
        final Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            applicationContext = C58003a.f132199a;
        }
        C24872m.m47689c().execute(new Runnable() {
            /* class com.facebook.applinks.C24009a.RunnableC240101 */

            static {
                Covode.recordClassIndex(28136);
            }

            public final void run() {
                if (!C24677a.m47209a(this)) {
                    try {
                        Context context = applicationContext;
                        String str = a;
                        AbstractC24011a aVar = aVar;
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("event", "DEFERRED_APP_LINK");
                            C24693ad.m47258a(jSONObject, C24710b.m47327a(context), C23973h.m45327a(context), C24872m.m47690c(context));
                            C24699ae.m47299a();
                            C24693ad.m47257a(jSONObject, C24872m.f59047g);
                            jSONObject.put("application_package_name", context.getPackageName());
                            C24009a aVar2 = null;
                            JSONObject jSONObject2 = GraphRequest.m45069a(GraphRequest.m45067a((AccessToken) null, C1764a.m5928a("%s/activities", new Object[]{str}), jSONObject, (GraphRequest.AbstractC23858b) null)).f59153b;
                            if (jSONObject2 != null) {
                                String optString = jSONObject2.optString("applink_args");
                                long optLong = jSONObject2.optLong("click_time", -1);
                                String optString2 = jSONObject2.optString("applink_class");
                                String optString3 = jSONObject2.optString("applink_url");
                                if (!TextUtils.isEmpty(optString) && (aVar2 = C24009a.m45432a(optString)) != null) {
                                    if (optLong != -1) {
                                        try {
                                            if (aVar2.f56852c != null) {
                                                aVar2.f56852c.put("com.facebook.platform.APPLINK_TAP_TIME_UTC", optLong);
                                            }
                                            if (aVar2.f56853d != null) {
                                                aVar2.f56853d.putString("com.facebook.platform.APPLINK_TAP_TIME_UTC", Long.toString(optLong));
                                            }
                                        } catch (JSONException unused) {
                                        }
                                    }
                                    if (optString2 != null) {
                                        try {
                                            if (aVar2.f56852c != null) {
                                                aVar2.f56852c.put("com.facebook.platform.APPLINK_NATIVE_CLASS", optString2);
                                            }
                                            if (aVar2.f56853d != null) {
                                                aVar2.f56853d.putString("com.facebook.platform.APPLINK_NATIVE_CLASS", optString2);
                                            }
                                        } catch (JSONException unused2) {
                                        }
                                    }
                                    if (optString3 != null) {
                                        try {
                                            if (aVar2.f56852c != null) {
                                                aVar2.f56852c.put("com.facebook.platform.APPLINK_NATIVE_URL", optString3);
                                            }
                                            if (aVar2.f56853d != null) {
                                                aVar2.f56853d.putString("com.facebook.platform.APPLINK_NATIVE_URL", optString3);
                                            }
                                        } catch (Exception unused3) {
                                        }
                                    }
                                }
                            }
                            aVar.mo39531a(aVar2);
                        } catch (JSONException e) {
                            throw new C24798j("An error occurred while preparing deferred app link", e);
                        }
                    } catch (Throwable th) {
                        C24677a.m47208a(th, this);
                    }
                }
            }
        });
    }
}
