package com.facebook.p1814a.p1816b;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import android.view.View;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.AccessToken;
import com.facebook.C24012b;
import com.facebook.C24872m;
import com.facebook.C24915r;
import com.facebook.EnumC25029u;
import com.facebook.GraphRequest;
import com.facebook.internal.C24693ad;
import com.facebook.internal.C24699ae;
import com.facebook.internal.C24780u;
import com.facebook.internal.C24783w;
import com.facebook.internal.p1894a.p1896b.C24677a;
import com.facebook.p1814a.p1816b.p1817a.C23887e;
import com.facebook.p1814a.p1816b.p1817a.C23888f;
import com.facebook.p1814a.p1820e.C23929b;
import java.io.ByteArrayOutputStream;
import java.lang.ref.WeakReference;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.a.b.e */
public class C23901e {

    /* renamed from: a */
    static final String f56592a = C23901e.class.getCanonicalName();

    /* renamed from: f */
    private static C23901e f56593f;

    /* renamed from: b */
    public WeakReference<Activity> f56594b;

    /* renamed from: c */
    public Timer f56595c;

    /* renamed from: d */
    String f56596d = null;

    /* renamed from: e */
    private final Handler f56597e = new Handler(Looper.getMainLooper());

    static {
        Covode.recordClassIndex(28022);
    }

    /* renamed from: b */
    static /* synthetic */ String m45203b() {
        if (C24677a.m47209a(C23901e.class)) {
            return null;
        }
        try {
            return f56592a;
        } catch (Throwable th) {
            C24677a.m47208a(th, C23901e.class);
            return null;
        }
    }

    /* renamed from: com.facebook.a.b.e$a */
    static class CallableC23906a implements Callable<String> {

        /* renamed from: a */
        private WeakReference<View> f56603a;

        static {
            Covode.recordClassIndex(28027);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public final /* synthetic */ String call() {
            MethodCollector.m26663i(8278);
            View view = this.f56603a.get();
            if (view == null || view.getWidth() == 0 || view.getHeight() == 0) {
                MethodCollector.m26664o(8278);
                return "";
            }
            Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.RGB_565);
            view.draw(new Canvas(createBitmap));
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            createBitmap.compress(Bitmap.CompressFormat.JPEG, 10, byteArrayOutputStream);
            String encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
            MethodCollector.m26664o(8278);
            return encodeToString;
        }

        CallableC23906a(View view) {
            this.f56603a = new WeakReference<>(view);
        }
    }

    /* renamed from: a */
    public final void mo39397a() {
        if (!C24677a.m47209a(this)) {
            try {
                final C239021 r2 = new TimerTask() {
                    /* class com.facebook.p1814a.p1816b.C23901e.C239021 */

                    static {
                        Covode.recordClassIndex(28023);
                    }

                    public final void run() {
                        try {
                            Activity activity = (Activity) C23901e.m45200a(C23901e.this).get();
                            View a = C23929b.m45241a(activity);
                            if (activity != null && a != null) {
                                String simpleName = activity.getClass().getSimpleName();
                                if (C23889b.m45176c()) {
                                    String str = "";
                                    if (C24780u.m47438a()) {
                                        C23887e.m45155a("UnityFacebookSDKPlugin", "CaptureViewHierarchy", str);
                                        return;
                                    }
                                    FutureTask futureTask = new FutureTask(new CallableC23906a(a));
                                    C23901e.m45202b(C23901e.this).post(futureTask);
                                    try {
                                        str = (String) futureTask.get(1, TimeUnit.SECONDS);
                                    } catch (Exception unused) {
                                        C23901e.m45203b();
                                    }
                                    JSONObject jSONObject = new JSONObject();
                                    try {
                                        jSONObject.put("screenname", simpleName);
                                        jSONObject.put("screenshot", str);
                                        JSONArray jSONArray = new JSONArray();
                                        jSONArray.put(C23888f.m45161c(a));
                                        jSONObject.put("view", jSONArray);
                                    } catch (JSONException unused2) {
                                        C23901e.m45203b();
                                    }
                                    String jSONObject2 = jSONObject.toString();
                                    C23901e eVar = C23901e.this;
                                    if (!C24677a.m47209a(C23901e.class)) {
                                        try {
                                            if (!C24677a.m47209a(eVar)) {
                                                try {
                                                    C24872m.m47689c().execute(new Runnable(jSONObject2) {
                                                        /* class com.facebook.p1814a.p1816b.C23901e.RunnableC239043 */

                                                        /* renamed from: a */
                                                        final /* synthetic */ String f56601a;

                                                        static {
                                                            Covode.recordClassIndex(28025);
                                                        }

                                                        public final void run() {
                                                            if (!C24677a.m47209a(this)) {
                                                                try {
                                                                    String b = C24693ad.m47266b("MD5", this.f56601a);
                                                                    AccessToken accessToken = C24012b.m45437a().f56861b;
                                                                    if (b == null || !b.equals(C23901e.m45206e(C23901e.this))) {
                                                                        String str = this.f56601a;
                                                                        C24699ae.m47299a();
                                                                        GraphRequest a = C23901e.m45199a(str, accessToken, C24872m.f59041a, "app_indexing");
                                                                        C23901e eVar = C23901e.this;
                                                                        if (!C24677a.m47209a(eVar) && a != null) {
                                                                            try {
                                                                                try {
                                                                                    JSONObject jSONObject = GraphRequest.m45069a(a).f59153b;
                                                                                    if (jSONObject != null) {
                                                                                        if ("true".equals(jSONObject.optString("success"))) {
                                                                                            C24783w.m47440a(EnumC25029u.APP_EVENTS, C23901e.f56592a, "Successfully send UI component tree to server");
                                                                                            eVar.f56596d = b;
                                                                                        }
                                                                                        if (jSONObject.has("is_app_indexing_enabled")) {
                                                                                            Boolean valueOf = Boolean.valueOf(jSONObject.getBoolean("is_app_indexing_enabled"));
                                                                                            if (!C24677a.m47209a(C23889b.class)) {
                                                                                                try {
                                                                                                    C23889b.f56561e.set(valueOf.booleanValue());
                                                                                                } catch (Throwable th) {
                                                                                                    C24677a.m47208a(th, C23889b.class);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                } catch (JSONException unused) {
                                                                                }
                                                                            } catch (Throwable th2) {
                                                                                C24677a.m47208a(th2, eVar);
                                                                            }
                                                                        }
                                                                    }
                                                                } catch (Throwable th3) {
                                                                    C24677a.m47208a(th3, this);
                                                                }
                                                            }
                                                        }

                                                        {
                                                            this.f56601a = r2;
                                                        }
                                                    });
                                                } catch (Throwable th) {
                                                    C24677a.m47208a(th, eVar);
                                                }
                                            }
                                        } catch (Throwable th2) {
                                            C24677a.m47208a(th2, C23901e.class);
                                        }
                                    }
                                }
                            }
                        } catch (Exception unused3) {
                            C23901e.m45203b();
                        }
                    }
                };
                try {
                    C24872m.m47689c().execute(new Runnable() {
                        /* class com.facebook.p1814a.p1816b.C23901e.RunnableC239032 */

                        static {
                            Covode.recordClassIndex(28024);
                        }

                        /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
                            com.facebook.p1814a.p1816b.C23901e.m45203b();
                         */
                        /* JADX WARNING: Code restructure failed: missing block: B:11:0x003b, code lost:
                            r0 = move-exception;
                         */
                        /* JADX WARNING: Code restructure failed: missing block: B:12:0x003c, code lost:
                            com.facebook.internal.p1894a.p1896b.C24677a.m47208a(r0, r6);
                         */
                        /* JADX WARNING: Code restructure failed: missing block: B:13:0x003f, code lost:
                            return;
                         */
                        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0040, code lost:
                            return;
                         */
                        /* JADX WARNING: Failed to process nested try/catch */
                        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0037 */
                        /* Code decompiled incorrectly, please refer to instructions dump. */
                        public final void run() {
                            /*
                                r6 = this;
                                boolean r0 = com.facebook.internal.p1894a.p1896b.C24677a.m47209a(r6)
                                if (r0 == 0) goto L_0x0007
                                return
                            L_0x0007:
                                com.facebook.a.b.e r0 = com.facebook.p1814a.p1816b.C23901e.this     // Catch:{ Exception -> 0x0037 }
                                java.util.Timer r0 = com.facebook.p1814a.p1816b.C23901e.m45204c(r0)     // Catch:{ Exception -> 0x0037 }
                                if (r0 == 0) goto L_0x0018
                                com.facebook.a.b.e r0 = com.facebook.p1814a.p1816b.C23901e.this     // Catch:{ Exception -> 0x0037 }
                                java.util.Timer r0 = com.facebook.p1814a.p1816b.C23901e.m45204c(r0)     // Catch:{ Exception -> 0x0037 }
                                r0.cancel()     // Catch:{ Exception -> 0x0037 }
                            L_0x0018:
                                com.facebook.a.b.e r0 = com.facebook.p1814a.p1816b.C23901e.this     // Catch:{ Exception -> 0x0037 }
                                com.facebook.p1814a.p1816b.C23901e.m45205d(r0)     // Catch:{ Exception -> 0x0037 }
                                com.facebook.a.b.e r1 = com.facebook.p1814a.p1816b.C23901e.this     // Catch:{ Exception -> 0x0037 }
                                java.util.Timer r0 = new java.util.Timer     // Catch:{ Exception -> 0x0037 }
                                r0.<init>()     // Catch:{ Exception -> 0x0037 }
                                com.facebook.p1814a.p1816b.C23901e.m45201a(r1, r0)     // Catch:{ Exception -> 0x0037 }
                                com.facebook.a.b.e r0 = com.facebook.p1814a.p1816b.C23901e.this     // Catch:{ Exception -> 0x0037 }
                                java.util.Timer r0 = com.facebook.p1814a.p1816b.C23901e.m45204c(r0)     // Catch:{ Exception -> 0x0037 }
                                java.util.TimerTask r1 = r2     // Catch:{ Exception -> 0x0037 }
                                r2 = 0
                                r4 = 1000(0x3e8, double:4.94E-321)
                                r0.scheduleAtFixedRate(r1, r2, r4)     // Catch:{ Exception -> 0x0037 }
                                return
                            L_0x0037:
                                com.facebook.p1814a.p1816b.C23901e.m45203b()     // Catch:{ all -> 0x003b }
                                goto L_0x0040
                            L_0x003b:
                                r0 = move-exception
                                com.facebook.internal.p1894a.p1896b.C24677a.m47208a(r0, r6)
                                return
                            L_0x0040:
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.facebook.p1814a.p1816b.C23901e.RunnableC239032.run():void");
                        }
                    });
                } catch (RejectedExecutionException unused) {
                }
            } catch (Throwable th) {
                C24677a.m47208a(th, this);
            }
        }
    }

    public C23901e(Activity activity) {
        this.f56594b = new WeakReference<>(activity);
        f56593f = this;
    }

    /* renamed from: a */
    static /* synthetic */ WeakReference m45200a(C23901e eVar) {
        if (C24677a.m47209a(C23901e.class)) {
            return null;
        }
        try {
            return eVar.f56594b;
        } catch (Throwable th) {
            C24677a.m47208a(th, C23901e.class);
            return null;
        }
    }

    /* renamed from: b */
    static /* synthetic */ Handler m45202b(C23901e eVar) {
        if (C24677a.m47209a(C23901e.class)) {
            return null;
        }
        try {
            return eVar.f56597e;
        } catch (Throwable th) {
            C24677a.m47208a(th, C23901e.class);
            return null;
        }
    }

    /* renamed from: c */
    static /* synthetic */ Timer m45204c(C23901e eVar) {
        if (C24677a.m47209a(C23901e.class)) {
            return null;
        }
        try {
            return eVar.f56595c;
        } catch (Throwable th) {
            C24677a.m47208a(th, C23901e.class);
            return null;
        }
    }

    /* renamed from: d */
    static /* synthetic */ String m45205d(C23901e eVar) {
        if (C24677a.m47209a(C23901e.class)) {
            return null;
        }
        try {
            eVar.f56596d = null;
            return null;
        } catch (Throwable th) {
            C24677a.m47208a(th, C23901e.class);
            return null;
        }
    }

    /* renamed from: e */
    static /* synthetic */ String m45206e(C23901e eVar) {
        if (C24677a.m47209a(C23901e.class)) {
            return null;
        }
        try {
            return eVar.f56596d;
        } catch (Throwable th) {
            C24677a.m47208a(th, C23901e.class);
            return null;
        }
    }

    /* renamed from: a */
    static /* synthetic */ Timer m45201a(C23901e eVar, Timer timer) {
        if (C24677a.m47209a(C23901e.class)) {
            return null;
        }
        try {
            eVar.f56595c = timer;
            return timer;
        } catch (Throwable th) {
            C24677a.m47208a(th, C23901e.class);
            return null;
        }
    }

    /* renamed from: a */
    public static GraphRequest m45199a(String str, AccessToken accessToken, String str2, String str3) {
        if (C24677a.m47209a(C23901e.class) || str == null) {
            return null;
        }
        try {
            GraphRequest a = GraphRequest.m45067a(accessToken, C1764a.m5929a(Locale.US, "%s/app_indexing", new Object[]{str2}), (JSONObject) null, (GraphRequest.AbstractC23858b) null);
            Bundle bundle = a.f56459j;
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putString("tree", str);
            bundle.putString("app_version", C23929b.m45242a());
            bundle.putString("platform", "android");
            bundle.putString("request_type", str3);
            if (str3.equals("app_indexing")) {
                bundle.putString("device_session_id", C23889b.m45175b());
            }
            a.f56459j = bundle;
            a.mo39348a((GraphRequest.AbstractC23858b) new GraphRequest.AbstractC23858b() {
                /* class com.facebook.p1814a.p1816b.C23901e.C239054 */

                static {
                    Covode.recordClassIndex(28026);
                }

                @Override // com.facebook.GraphRequest.AbstractC23858b
                /* renamed from: a */
                public final void mo39350a(C24915r rVar) {
                    C24783w.m47440a(EnumC25029u.APP_EVENTS, C23901e.m45203b(), "App index sent to FB!");
                }
            });
            return a;
        } catch (Throwable th) {
            C24677a.m47208a(th, C23901e.class);
            return null;
        }
    }
}
