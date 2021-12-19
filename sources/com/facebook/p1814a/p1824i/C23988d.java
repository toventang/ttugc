package com.facebook.p1814a.p1824i;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.C24872m;
import com.facebook.internal.C24699ae;
import com.facebook.internal.C24768q;
import com.facebook.internal.C24770r;
import com.facebook.internal.p1894a.p1896b.C24677a;
import com.facebook.p1814a.p1820e.C23922a;
import com.facebook.p1814a.p1821f.C23953c;
import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.facebook.a.i.d */
public final class C23988d {

    /* renamed from: a */
    static final Set<String> f56777a = new HashSet();

    /* renamed from: b */
    static final Set<String> f56778b = new HashSet();

    /* renamed from: c */
    private static final AtomicBoolean f56779c = new AtomicBoolean(false);

    static {
        Covode.recordClassIndex(28109);
    }

    /* renamed from: b */
    static /* synthetic */ AtomicBoolean m45368b() {
        if (C24677a.m47209a(C23988d.class)) {
            return null;
        }
        try {
            return f56779c;
        } catch (Throwable th) {
            C24677a.m47208a(th, C23988d.class);
            return null;
        }
    }

    /* renamed from: a */
    public static synchronized void m45365a() {
        synchronized (C23988d.class) {
            MethodCollector.m26663i(6291);
            if (C24677a.m47209a(C23988d.class)) {
                MethodCollector.m26664o(6291);
                return;
            }
            try {
                C24872m.m47689c().execute(new Runnable() {
                    /* class com.facebook.p1814a.p1824i.C23988d.RunnableC239891 */

                    static {
                        Covode.recordClassIndex(28110);
                    }

                    public final void run() {
                        Activity activity;
                        MethodCollector.m26663i(6914);
                        if (C24677a.m47209a(this)) {
                            MethodCollector.m26664o(6914);
                            return;
                        }
                        try {
                            if (C23988d.m45368b().get()) {
                                MethodCollector.m26664o(6914);
                                return;
                            }
                            C23988d.m45368b().set(true);
                            if (!C24677a.m47209a(C23988d.class)) {
                                try {
                                    if (!C24677a.m47209a(C23988d.class)) {
                                        try {
                                            C24699ae.m47299a();
                                            C24768q a = C24770r.m47427a(C24872m.f59041a, false);
                                            if (a == null) {
                                                try {
                                                    MethodCollector.m26664o(6914);
                                                    return;
                                                } catch (Throwable th) {
                                                    C24677a.m47208a(th, C23988d.class);
                                                }
                                            } else {
                                                String str = a.f58770r;
                                                if (str == null) {
                                                    MethodCollector.m26664o(6914);
                                                    return;
                                                }
                                                if (!C24677a.m47209a(C23988d.class)) {
                                                    try {
                                                        JSONObject jSONObject = new JSONObject(str);
                                                        if (jSONObject.has("production_events")) {
                                                            JSONArray jSONArray = jSONObject.getJSONArray("production_events");
                                                            for (int i = 0; i < jSONArray.length(); i++) {
                                                                C23988d.f56777a.add(jSONArray.getString(i));
                                                            }
                                                        }
                                                        if (jSONObject.has("eligible_for_prediction_events")) {
                                                            JSONArray jSONArray2 = jSONObject.getJSONArray("eligible_for_prediction_events");
                                                            for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                                                                C23988d.f56778b.add(jSONArray2.getString(i2));
                                                            }
                                                        }
                                                    } catch (Exception unused) {
                                                    } catch (Throwable th2) {
                                                        C24677a.m47208a(th2, C23988d.class);
                                                    }
                                                }
                                                if (!C23988d.f56777a.isEmpty() || !C23988d.f56778b.isEmpty()) {
                                                    File a2 = C23953c.m45282a(C23953c.EnumC23958a.MTML_APP_EVENT_PREDICTION);
                                                    if (a2 == null) {
                                                        MethodCollector.m26664o(6914);
                                                        return;
                                                    }
                                                    if (!C24677a.m47209a(C23985a.class)) {
                                                        try {
                                                            C23985a.f56770d = new JSONObject();
                                                            FileInputStream fileInputStream = new FileInputStream(a2);
                                                            byte[] bArr = new byte[fileInputStream.available()];
                                                            fileInputStream.read(bArr);
                                                            fileInputStream.close();
                                                            C23985a.f56770d = new JSONObject(new String(bArr, "UTF-8"));
                                                            try {
                                                                HashMap hashMap = new HashMap();
                                                                C23985a.f56767a = hashMap;
                                                                hashMap.put("ENGLISH", "1");
                                                                C23985a.f56767a.put("GERMAN", "2");
                                                                C23985a.f56767a.put("SPANISH", "3");
                                                                C23985a.f56767a.put("JAPANESE", "4");
                                                                HashMap hashMap2 = new HashMap();
                                                                C23985a.f56768b = hashMap2;
                                                                hashMap2.put("VIEW_CONTENT", "0");
                                                                C23985a.f56768b.put("SEARCH", "1");
                                                                C23985a.f56768b.put("ADD_TO_CART", "2");
                                                                C23985a.f56768b.put("ADD_TO_WISHLIST", "3");
                                                                C23985a.f56768b.put("INITIATE_CHECKOUT", "4");
                                                                C23985a.f56768b.put("ADD_PAYMENT_INFO", "5");
                                                                C23985a.f56768b.put("PURCHASE", "6");
                                                                C23985a.f56768b.put("LEAD", "7");
                                                                C23985a.f56768b.put("COMPLETE_REGISTRATION", "8");
                                                                HashMap hashMap3 = new HashMap();
                                                                C23985a.f56769c = hashMap3;
                                                                hashMap3.put("BUTTON_TEXT", "1");
                                                                C23985a.f56769c.put("PAGE_TITLE", "2");
                                                                C23985a.f56769c.put("RESOLVED_DOCUMENT_LINK", "3");
                                                                C23985a.f56769c.put("BUTTON_ID", "4");
                                                                C23985a.f56771e = true;
                                                            } catch (Throwable th3) {
                                                                C24677a.m47208a(th3, C23985a.class);
                                                            }
                                                        } catch (Exception unused2) {
                                                        }
                                                    }
                                                    if (!(C23922a.f56648j == null || (activity = C23922a.f56648j.get()) == null)) {
                                                        C23988d.m45366a(activity);
                                                    }
                                                }
                                                MethodCollector.m26664o(6914);
                                                return;
                                            }
                                        } catch (Exception unused3) {
                                            MethodCollector.m26664o(6914);
                                            return;
                                        }
                                    }
                                    MethodCollector.m26664o(6914);
                                    return;
                                } catch (Throwable th4) {
                                    C24677a.m47208a(th4, C23988d.class);
                                }
                            }
                            MethodCollector.m26664o(6914);
                        } catch (Throwable th5) {
                            C24677a.m47208a(th5, this);
                            MethodCollector.m26664o(6914);
                        }
                    }
                });
                MethodCollector.m26664o(6291);
            } catch (Throwable th) {
                C24677a.m47208a(th, C23988d.class);
                MethodCollector.m26664o(6291);
            }
        }
    }

    /* renamed from: a */
    static boolean m45367a(String str) {
        if (C24677a.m47209a(C23988d.class)) {
            return false;
        }
        try {
            return f56777a.contains(str);
        } catch (Throwable th) {
            C24677a.m47208a(th, C23988d.class);
            return false;
        }
    }

    /* renamed from: b */
    static boolean m45369b(String str) {
        if (C24677a.m47209a(C23988d.class)) {
            return false;
        }
        try {
            return f56778b.contains(str);
        } catch (Throwable th) {
            C24677a.m47208a(th, C23988d.class);
            return false;
        }
    }

    /* renamed from: a */
    public static void m45366a(Activity activity) {
        if (!C24677a.m47209a(C23988d.class)) {
            try {
                if (!f56779c.get() || !C23985a.m45349a() || (f56777a.isEmpty() && f56778b.isEmpty())) {
                    ViewTreeObserver$OnGlobalLayoutListenerC23990e.m45374b(activity);
                } else {
                    ViewTreeObserver$OnGlobalLayoutListenerC23990e.m45372a(activity);
                }
            } catch (Exception unused) {
            } catch (Throwable th) {
                C24677a.m47208a(th, C23988d.class);
            }
        }
    }
}
