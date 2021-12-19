package com.facebook.p1814a.p1820e;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.facebook.C24006ab;
import com.facebook.C24872m;
import com.facebook.internal.C24699ae;
import com.facebook.internal.C24764p;
import com.facebook.internal.p1894a.p1896b.C24677a;
import com.facebook.p1814a.C23916e;
import com.facebook.p1814a.C23964g;
import com.facebook.p1814a.C23973h;
import com.facebook.p1814a.C23998m;
import com.facebook.p1814a.EnumC23995j;
import com.facebook.p1814a.p1820e.C23933d;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Currency;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.a.e.g */
public class C23938g {

    /* renamed from: a */
    public static final AtomicBoolean f56666a = new AtomicBoolean(false);

    /* renamed from: b */
    public static Boolean f56667b = null;

    /* renamed from: c */
    public static Boolean f56668c = null;

    /* renamed from: d */
    public static ServiceConnection f56669d;

    /* renamed from: e */
    public static Application.ActivityLifecycleCallbacks f56670e;

    /* renamed from: f */
    public static Intent f56671f;

    /* renamed from: g */
    public static Object f56672g;

    /* renamed from: h */
    private static final String f56673h = C23938g.class.getCanonicalName();

    static {
        Covode.recordClassIndex(28059);
    }

    /* renamed from: a */
    public static void m45249a(Context context, ArrayList<String> arrayList, boolean z) {
        C23933d.C23934a a;
        if (!arrayList.isEmpty()) {
            HashMap hashMap = new HashMap();
            ArrayList arrayList2 = new ArrayList();
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                try {
                    String string = new JSONObject(next).getString("productId");
                    hashMap.put(string, next);
                    arrayList2.add(string);
                } catch (JSONException unused) {
                }
            }
            for (Map.Entry<String, String> entry : C23943h.m45256a(context, arrayList2, f56672g, z).entrySet()) {
                String str = (String) hashMap.get(entry.getKey());
                String value = entry.getValue();
                if (C23933d.m45245a() && (a = C23933d.m45244a(str, value, new HashMap())) != null) {
                    boolean z2 = false;
                    if (z) {
                        C24699ae.m47299a();
                        if (C24764p.m47419a("app_events_if_auto_log_subs", C24872m.f59041a, false)) {
                            z2 = true;
                        }
                    }
                    if (z2) {
                        C23943h.m45258a(value);
                        C23998m mVar = C23933d.f56658a;
                        BigDecimal bigDecimal = a.f56660a;
                        Currency currency = a.f56661b;
                        Bundle bundle = a.f56662c;
                        if (C24006ab.m45407b()) {
                            C23973h hVar = mVar.f56808a;
                            if (!(C24677a.m47209a(hVar) || bigDecimal == null || currency == null)) {
                                if (bundle == null) {
                                    try {
                                        bundle = new Bundle();
                                    } catch (Throwable th) {
                                        C24677a.m47208a(th, hVar);
                                    }
                                }
                                bundle.putString("fb_currency", currency.getCurrencyCode());
                                Double.valueOf(bigDecimal.doubleValue());
                            }
                        }
                    } else {
                        C23998m mVar2 = C23933d.f56658a;
                        BigDecimal bigDecimal2 = a.f56660a;
                        Currency currency2 = a.f56661b;
                        Bundle bundle2 = a.f56662c;
                        if (C24006ab.m45407b()) {
                            C23973h hVar2 = mVar2.f56808a;
                            if (!C24677a.m47209a(hVar2)) {
                                try {
                                    if (!C24677a.m47209a(hVar2)) {
                                        if (bigDecimal2 == null) {
                                            try {
                                                C23973h.m45328a("purchaseAmount cannot be null");
                                            } catch (Throwable th2) {
                                                C24677a.m47208a(th2, hVar2);
                                            }
                                        } else if (currency2 == null) {
                                            C23973h.m45328a("currency cannot be null");
                                        } else {
                                            if (bundle2 == null) {
                                                bundle2 = new Bundle();
                                            }
                                            bundle2.putString("fb_currency", currency2.getCurrencyCode());
                                            Double.valueOf(bigDecimal2.doubleValue());
                                            if (!C24677a.m47209a(C23973h.class)) {
                                                try {
                                                    if (C23973h.m45326a() != C23964g.EnumC23965a.EXPLICIT_ONLY) {
                                                        C23916e.m45231a(EnumC23995j.EAGER_FLUSHING_EVENT);
                                                    }
                                                } catch (Throwable th3) {
                                                    C24677a.m47208a(th3, C23973h.class);
                                                }
                                            }
                                        }
                                    }
                                } catch (Throwable th4) {
                                    C24677a.m47208a(th4, hVar2);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
