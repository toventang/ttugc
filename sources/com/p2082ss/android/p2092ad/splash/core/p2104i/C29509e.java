package com.p2082ss.android.p2092ad.splash.core.p2104i;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.p2092ad.splash.core.C29495h;
import com.p2082ss.android.p2092ad.splash.p2094b.C29375a;
import com.p2082ss.android.p2092ad.splash.p2109f.C29643f;
import com.p2082ss.android.p2092ad.splash.p2109f.C29644g;
import com.p2082ss.android.p2092ad.splash.p2109f.C29645h;
import com.p2082ss.android.p2092ad.splash.p2109f.C29657l;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import org.json.JSONObject;

/* renamed from: com.ss.android.ad.splash.core.i.e */
public final class C29509e implements AbstractC29508d {

    /* renamed from: a */
    public Context f70265a;

    /* renamed from: b */
    public AbstractC29514g f70266b;

    static {
        Covode.recordClassIndex(35903);
    }

    @Override // com.p2082ss.android.p2092ad.splash.core.p2104i.AbstractC29508d
    /* renamed from: a */
    public final void mo51607a() {
        if (C29645h.m59694a(this.f70265a)) {
            C29495h.f70233i.submit(new Runnable() {
                /* class com.p2082ss.android.p2092ad.splash.core.p2104i.C29509e.RunnableC295101 */

                static {
                    Covode.recordClassIndex(35904);
                }

                public final void run() {
                    final List<C29513f> a = C29509e.this.f70266b.mo51611a();
                    new Handler(Looper.getMainLooper()).post(new Runnable() {
                        /* class com.p2082ss.android.p2092ad.splash.core.p2104i.C29509e.RunnableC295101.RunnableC295111 */

                        static {
                            Covode.recordClassIndex(35905);
                        }

                        public final void run() {
                            C29509e eVar = C29509e.this;
                            List<C29513f> list = a;
                            if (C29643f.m59684b(list)) {
                                for (C29513f fVar : list) {
                                    new AsyncTaskC29512a(eVar, fVar, (byte) 0).executeOnExecutor(C29495h.f70233i, new Void[0]);
                                }
                            }
                        }
                    });
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ad.splash.core.i.e$a */
    public class AsyncTaskC29512a extends AsyncTask<Void, Void, Void> {

        /* renamed from: b */
        private C29513f f70271b;

        /* renamed from: c */
        private long f70272c;

        static {
            Covode.recordClassIndex(35906);
        }

        /* renamed from: a */
        private Void m59157a() {
            boolean z;
            String str = this.f70271b.f70274b;
            if (TextUtils.isEmpty(str) || (!str.startsWith("http://") && !str.startsWith("https://"))) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                return null;
            }
            if (this.f70271b.f70276d == 0) {
                C29509e.this.f70266b.mo51614c(this.f70271b);
                return null;
            }
            while (true) {
                if (this.f70271b.f70276d <= 0 || isCancelled()) {
                    break;
                }
                if (this.f70271b.f70276d == 5) {
                    C29509e.this.f70266b.mo51612a(this.f70271b);
                }
                if (!C29645h.m59694a(C29509e.this.f70265a)) {
                    break;
                }
                String str2 = this.f70271b.f70274b;
                if (!TextUtils.isEmpty(str2)) {
                    long currentTimeMillis = System.currentTimeMillis();
                    this.f70272c = currentTimeMillis;
                    if (str2.contains("{TS}") || str2.contains("__TS__")) {
                        str2 = str2.replace("{TS}", String.valueOf(currentTimeMillis)).replace("__TS__", String.valueOf(currentTimeMillis));
                    }
                }
                int i = this.f70271b.f70277e;
                if (this.f70271b.f70275c) {
                    str2 = m59156a(str2);
                }
                if (C29495h.f70227c == null) {
                    return null;
                }
                C29516i a = C29495h.f70227c.mo28694a(str2);
                if (a != null) {
                    JSONObject jSONObject = new JSONObject();
                    C29513f fVar = this.f70271b;
                    if (fVar != null && fVar.f70278f > 0) {
                        try {
                            jSONObject.put("track_url_list", str2);
                            jSONObject.put("track_status", a.f70282b);
                            jSONObject.put("ts", this.f70272c);
                            jSONObject.put("local_time_ms", System.currentTimeMillis());
                            if (!C29657l.m59760a(a.f70281a)) {
                                jSONObject.put("user_agent", a.f70281a);
                            } else {
                                jSONObject.put("user_agent", -1);
                            }
                            jSONObject.put("is_ad_event", "1");
                            jSONObject.put("ad_event_type", "monitor");
                            long j = -1;
                            if (C29495h.m59102b() != null && C29495h.m59102b().mo51567e() > 0) {
                                j = C29495h.m59102b().mo51567e();
                            }
                            jSONObject.put("user_id", j);
                            if (!C29657l.m59760a(this.f70271b.f70279g)) {
                                jSONObject.put("log_extra", this.f70271b.f70279g);
                            } else {
                                jSONObject.put("log_extra", -1);
                            }
                            String str3 = "";
                            if (i == 1) {
                                str3 = "show";
                            } else if (i == 2) {
                                str3 = "play";
                            } else if (i == 3) {
                                str3 = "click";
                            } else if (i == 4) {
                                str3 = "play_over";
                            }
                            jSONObject.put("track_label", str3);
                            C29495h.m59099a(this.f70271b.f70278f, "track_ad", "track_url", jSONObject);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    if (a.f70282b >= 200 && a.f70282b < 300) {
                        C29509e.this.f70266b.mo51614c(this.f70271b);
                        C29644g.m59689c("track success : " + this.f70271b.f70274b);
                        break;
                    }
                }
                C29644g.m59689c("track fail : " + this.f70271b.f70274b);
                this.f70271b.f70276d--;
                if (this.f70271b.f70276d == 0) {
                    C29509e.this.f70266b.mo51614c(this.f70271b);
                    C29644g.m59689c("track fail and delete : " + this.f70271b.f70274b);
                    break;
                }
                C29509e.this.f70266b.mo51613b(this.f70271b);
            }
            String str4 = this.f70271b.f70274b;
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("key_send_track_url", str4);
                C29375a.m58829a().mo51360a("service_ad_send_track_fail", (JSONObject) null, jSONObject2);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            return null;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object[]] */
        /* access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public final /* synthetic */ Void doInBackground(Void[] voidArr) {
            return m59157a();
        }

        /* renamed from: a */
        private static String m59156a(String str) {
            if (TextUtils.isEmpty(str)) {
                return str;
            }
            try {
                str = str.replace("[ss_random]", String.valueOf(new Random().nextLong())).replace("[ss_timestamp]", String.valueOf(System.currentTimeMillis()));
                return str;
            } catch (Exception e) {
                e.printStackTrace();
                return str;
            }
        }

        private AsyncTaskC29512a(C29513f fVar) {
            this.f70271b = fVar;
        }

        /* synthetic */ AsyncTaskC29512a(C29509e eVar, C29513f fVar, byte b) {
            this(fVar);
        }
    }

    public C29509e(Context context, AbstractC29514g gVar) {
        this.f70265a = context;
        this.f70266b = gVar;
    }

    /* renamed from: a */
    private void m59149a(long j, String str, List<String> list, int i) {
        if (C29643f.m59684b(list)) {
            for (String str2 : list) {
                new AsyncTaskC29512a(this, new C29513f(j, str, UUID.randomUUID().toString(), str2, true, 5, i), (byte) 0).executeOnExecutor(C29495h.f70233i, new Void[0]);
            }
        }
    }

    @Override // com.p2082ss.android.p2092ad.splash.core.p2104i.AbstractC29505b
    /* renamed from: a */
    public final void mo51601a(View view, long j, List<String> list, String str, boolean z, long j2, JSONObject jSONObject, C29506c cVar) {
        m59149a(j, str, list, 1);
    }

    @Override // com.p2082ss.android.p2092ad.splash.core.p2104i.AbstractC29505b
    /* renamed from: b */
    public final void mo51603b(View view, long j, List<String> list, String str, boolean z, long j2, JSONObject jSONObject, C29506c cVar) {
        m59149a(j, str, list, 3);
        C29495h.m59109h().mo51599h();
    }

    @Override // com.p2082ss.android.p2092ad.splash.core.p2104i.AbstractC29505b
    /* renamed from: c */
    public final void mo51604c(View view, long j, List<String> list, String str, boolean z, long j2, JSONObject jSONObject, C29506c cVar) {
        m59149a(j, str, list, 2);
    }

    @Override // com.p2082ss.android.p2092ad.splash.core.p2104i.AbstractC29505b
    /* renamed from: d */
    public final void mo51605d(View view, long j, List<String> list, String str, boolean z, long j2, JSONObject jSONObject, C29506c cVar) {
        m59149a(j, str, list, 4);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.p2082ss.android.p2092ad.splash.core.p2104i.AbstractC29505b
    /* renamed from: a */
    public final void mo51602a(View view, String str, long j, List<String> list, String str2, boolean z, long j2, JSONObject jSONObject, C29506c cVar) {
        int i;
        str.hashCode();
        switch (str.hashCode()) {
            case -1877652737:
                if (str.equals("play_over")) {
                    i = 4;
                    break;
                }
                i = 0;
                break;
            case 3443508:
                if (str.equals("play")) {
                    i = 2;
                    break;
                }
                i = 0;
                break;
            case 3529469:
                if (str.equals("show")) {
                    i = 1;
                    break;
                }
                i = 0;
                break;
            case 94750088:
                if (str.equals("click")) {
                    i = 3;
                    break;
                }
                i = 0;
                break;
            default:
                i = 0;
                break;
        }
        m59149a(j, str2, list, i);
    }
}
