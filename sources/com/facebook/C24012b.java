package com.facebook;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.p051h.p052a.C0998a;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.facebook.AccessToken;
import com.facebook.C24912q;
import com.facebook.GraphRequest;
import com.facebook.internal.C24693ad;
import com.facebook.internal.C24699ae;
import com.facebook.internal.p1894a.p1896b.C24677a;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import java.lang.reflect.Field;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.facebook.b */
public final class C24012b {

    /* renamed from: d */
    private static volatile C24012b f56859d;

    /* renamed from: a */
    final C23864a f56860a;

    /* renamed from: b */
    public AccessToken f56861b;

    /* renamed from: c */
    public AtomicBoolean f56862c = new AtomicBoolean(false);

    /* renamed from: e */
    private final C0998a f56863e;

    /* renamed from: f */
    private Date f56864f = new Date(0);

    static {
        Covode.recordClassIndex(28138);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.facebook.b$a */
    public static class C24017a {

        /* renamed from: a */
        public String f56882a;

        /* renamed from: b */
        public int f56883b;

        /* renamed from: c */
        public Long f56884c;

        /* renamed from: d */
        public String f56885d;

        static {
            Covode.recordClassIndex(28143);
        }

        private C24017a() {
        }

        /* synthetic */ C24017a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public static C24012b m45437a() {
        MethodCollector.m26663i(9363);
        if (f56859d == null) {
            synchronized (C24012b.class) {
                try {
                    if (f56859d == null) {
                        C24699ae.m47299a();
                        f56859d = new C24012b(C0998a.m3454a(C24872m.f59047g), new C23864a());
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(9363);
                    throw th;
                }
            }
        }
        C24012b bVar = f56859d;
        MethodCollector.m26664o(9363);
        return bVar;
    }

    /* renamed from: c */
    private static void m45440c() {
        C24699ae.m47299a();
        Context context = C24872m.f59047g;
        AccessToken accessToken = m45437a().f56861b;
        AlarmManager alarmManager = (AlarmManager) m45438a(context, "alarm");
        if (AccessToken.m45056a() && accessToken.f56400a != null && alarmManager != null) {
            Intent intent = new Intent(context, CurrentAccessTokenExpirationBroadcastReceiver.class);
            intent.setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
            try {
                alarmManager.set(1, accessToken.f56400a.getTime(), PendingIntent.getBroadcast(context, 0, intent, 0));
            } catch (Exception unused) {
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo39535b() {
        if (this.f56861b != null) {
            Long valueOf = Long.valueOf(new Date().getTime());
            if (this.f56861b.f56405f.canExtendToken && valueOf.longValue() - this.f56864f.getTime() > 3600000 && valueOf.longValue() - this.f56861b.f56406g.getTime() > 86400000) {
                if (Looper.getMainLooper().equals(Looper.myLooper())) {
                    mo39532a(null);
                } else {
                    new Handler(Looper.getMainLooper()).post(new Runnable() {
                        /* class com.facebook.C24012b.RunnableC240131 */

                        /* renamed from: a */
                        final /* synthetic */ AccessToken.AbstractC23847a f56865a = null;

                        static {
                            Covode.recordClassIndex(28139);
                        }

                        public final void run() {
                            if (!C24677a.m47209a(this)) {
                                try {
                                    C24012b.this.mo39532a(this.f56865a);
                                } catch (Throwable th) {
                                    C24677a.m47208a(th, this);
                                }
                            }
                        }
                    });
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo39532a(final AccessToken.AbstractC23847a aVar) {
        final AccessToken accessToken = this.f56861b;
        if (accessToken == null) {
            if (aVar != null) {
                new C24798j("No current access token to refresh");
            }
        } else if (this.f56862c.compareAndSet(false, true)) {
            this.f56864f = new Date();
            final HashSet hashSet = new HashSet();
            final HashSet hashSet2 = new HashSet();
            final HashSet hashSet3 = new HashSet();
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            final C24017a aVar2 = new C24017a((byte) 0);
            C24912q qVar = new C24912q(m45436a(accessToken, new GraphRequest.AbstractC23858b() {
                /* class com.facebook.C24012b.C240142 */

                static {
                    Covode.recordClassIndex(28140);
                }

                @Override // com.facebook.GraphRequest.AbstractC23858b
                /* renamed from: a */
                public final void mo39350a(C24915r rVar) {
                    JSONArray optJSONArray;
                    JSONObject jSONObject = rVar.f59153b;
                    if (!(jSONObject == null || (optJSONArray = jSONObject.optJSONArray("data")) == null)) {
                        atomicBoolean.set(true);
                        for (int i = 0; i < optJSONArray.length(); i++) {
                            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                            if (optJSONObject != null) {
                                String optString = optJSONObject.optString("permission");
                                String optString2 = optJSONObject.optString("status");
                                if (!C24693ad.m47261a(optString) && !C24693ad.m47261a(optString2)) {
                                    String lowerCase = optString2.toLowerCase(Locale.US);
                                    if (lowerCase.equals("granted")) {
                                        hashSet.add(optString);
                                    } else if (lowerCase.equals("declined")) {
                                        hashSet2.add(optString);
                                    } else if (lowerCase.equals("expired")) {
                                        hashSet3.add(optString);
                                    }
                                }
                            }
                        }
                    }
                }
            }), m45439b(accessToken, new GraphRequest.AbstractC23858b() {
                /* class com.facebook.C24012b.C240153 */

                static {
                    Covode.recordClassIndex(28141);
                }

                @Override // com.facebook.GraphRequest.AbstractC23858b
                /* renamed from: a */
                public final void mo39350a(C24915r rVar) {
                    JSONObject jSONObject = rVar.f59153b;
                    if (jSONObject != null) {
                        aVar2.f56882a = jSONObject.optString("access_token");
                        aVar2.f56883b = jSONObject.optInt("expires_at");
                        aVar2.f56884c = Long.valueOf(jSONObject.optLong("data_access_expiration_time"));
                        aVar2.f56885d = jSONObject.optString("graph_domain", null);
                    }
                }
            }));
            qVar.mo40793a(new C24912q.AbstractC24913a() {
                /* class com.facebook.C24012b.C240164 */

                static {
                    Covode.recordClassIndex(28142);
                }

                @Override // com.facebook.C24912q.AbstractC24913a
                /* renamed from: a */
                public final void mo39537a() {
                    String str;
                    Set<String> set;
                    Set<String> set2;
                    Set<String> set3;
                    Date date;
                    Date date2;
                    try {
                        if (C24012b.m45437a().f56861b == null || C24012b.m45437a().f56861b.f56408i != accessToken.f56408i) {
                            if (aVar != null) {
                                new C24798j("No current access token to refresh");
                            }
                        } else if (atomicBoolean.get() || aVar2.f56882a != null || aVar2.f56883b != 0) {
                            if (aVar2.f56882a != null) {
                                str = aVar2.f56882a;
                            } else {
                                str = accessToken.f56404e;
                            }
                            String str2 = accessToken.f56407h;
                            String str3 = accessToken.f56408i;
                            if (atomicBoolean.get()) {
                                set = hashSet;
                            } else {
                                set = accessToken.f56401b;
                            }
                            if (atomicBoolean.get()) {
                                set2 = hashSet2;
                            } else {
                                set2 = accessToken.f56402c;
                            }
                            if (atomicBoolean.get()) {
                                set3 = hashSet3;
                            } else {
                                set3 = accessToken.f56403d;
                            }
                            EnumC24020c cVar = accessToken.f56405f;
                            if (aVar2.f56883b != 0) {
                                date = new Date(((long) aVar2.f56883b) * 1000);
                            } else {
                                date = accessToken.f56400a;
                            }
                            Date date3 = new Date();
                            if (aVar2.f56884c != null) {
                                date2 = new Date(1000 * aVar2.f56884c.longValue());
                            } else {
                                date2 = accessToken.f56409j;
                            }
                            C24012b.m45437a().mo39534a(new AccessToken(str, str2, str3, set, set2, set3, cVar, date, date3, date2, aVar2.f56885d), true);
                            C24012b.this.f56862c.set(false);
                            AccessToken.AbstractC23847a aVar = aVar;
                        } else if (aVar != null) {
                            new C24798j("Failed to refresh access token");
                        }
                    } finally {
                        C24012b.this.f56862c.set(false);
                    }
                }
            });
            GraphRequest.m45085b(qVar);
        } else if (aVar != null) {
            new C24798j("Refresh already in progress");
        }
    }

    /* renamed from: a */
    private static GraphRequest m45436a(AccessToken accessToken, GraphRequest.AbstractC23858b bVar) {
        return new GraphRequest(accessToken, "me/permissions", new Bundle(), EnumC24916s.GET, bVar);
    }

    /* renamed from: b */
    private static GraphRequest m45439b(AccessToken accessToken, GraphRequest.AbstractC23858b bVar) {
        Bundle bundle = new Bundle();
        bundle.putString("grant_type", "fb_extend_sso_token");
        bundle.putString("client_id", accessToken.f56407h);
        return new GraphRequest(accessToken, "oauth/access_token", bundle, EnumC24916s.GET, bVar);
    }

    private C24012b(C0998a aVar, C23864a aVar2) {
        C24699ae.m47301a(aVar, "localBroadcastManager");
        C24699ae.m47301a(aVar2, "accessTokenCache");
        this.f56863e = aVar;
        this.f56860a = aVar2;
    }

    /* renamed from: a */
    private static Object m45438a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(9366);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!C58027i.f132247b && "connectivity".equals(str)) {
                try {
                    new C21708b().mo35361a();
                    C58027i.f132247b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (C58027i.f132246a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new C58027i.HandlerC58028a((Handler) declaredField.get(obj)));
                        } catch (Exception e) {
                            C13849d.m25015a(e, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    C58027i.f132246a = false;
                } finally {
                    MethodCollector.m26664o(9366);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo39533a(AccessToken accessToken, AccessToken accessToken2) {
        C24699ae.m47299a();
        Intent intent = new Intent(C24872m.f59047g, CurrentAccessTokenExpirationBroadcastReceiver.class);
        intent.setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN", accessToken);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN", accessToken2);
        this.f56863e.mo3694a(intent);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo39534a(AccessToken accessToken, boolean z) {
        AccessToken accessToken2 = this.f56861b;
        this.f56861b = accessToken;
        this.f56862c.set(false);
        this.f56864f = new Date(0);
        if (z) {
            if (accessToken != null) {
                this.f56860a.mo39369a(accessToken);
            } else {
                this.f56860a.mo39370b();
                C24699ae.m47299a();
                try {
                    C24693ad.m47268b(C24872m.f59047g);
                } catch (Exception unused) {
                }
            }
        }
        if (!C24693ad.m47260a(accessToken2, accessToken)) {
            mo39533a(accessToken2, accessToken);
            m45440c();
        }
    }
}
