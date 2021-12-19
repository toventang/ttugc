package com.facebook.p1814a;

import android.content.Intent;
import android.os.Bundle;
import androidx.p051h.p052a.C0998a;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.facebook.AccessToken;
import com.facebook.C24872m;
import com.facebook.C24915r;
import com.facebook.EnumC25029u;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.internal.C24699ae;
import com.facebook.internal.C24768q;
import com.facebook.internal.C24770r;
import com.facebook.internal.C24783w;
import com.facebook.internal.p1894a.p1896b.C24677a;
import com.facebook.p1814a.C23964g;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p2719cv.C40787l;
import com.p2082ss.android.ugc.aweme.p2719cv.EnumC40793o;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.a.e */
public class C23916e {

    /* renamed from: a */
    static final String f56626a = C23916e.class.getName();

    /* renamed from: b */
    public static final ScheduledExecutorService f56627b;

    /* renamed from: c */
    private static final Integer f56628c = 100;

    /* renamed from: d */
    private static volatile C23914d f56629d = new C23914d();

    /* renamed from: e */
    private static ScheduledFuture f56630e;

    /* renamed from: f */
    private static final Runnable f56631f = new Runnable() {
        /* class com.facebook.p1814a.C23916e.RunnableC239171 */

        static {
            Covode.recordClassIndex(28038);
        }

        public final void run() {
            if (!C24677a.m47209a(this)) {
                try {
                    C23916e.m45232b();
                    if (C23973h.m45326a() != C23964g.EnumC23965a.EXPLICIT_ONLY) {
                        C23916e.m45233b(EnumC23995j.TIMER);
                    }
                } catch (Throwable th) {
                    C24677a.m47208a(th, this);
                }
            }
        }
    };

    C23916e() {
    }

    /* renamed from: b */
    static /* synthetic */ ScheduledFuture m45232b() {
        if (C24677a.m47209a(C23916e.class)) {
            return null;
        }
        try {
            f56630e = null;
            return null;
        } catch (Throwable th) {
            C24677a.m47208a(th, C23916e.class);
            return null;
        }
    }

    /* renamed from: c */
    static /* synthetic */ C23914d m45234c() {
        if (C24677a.m47209a(C23916e.class)) {
            return null;
        }
        try {
            return f56629d;
        } catch (Throwable th) {
            C24677a.m47208a(th, C23916e.class);
            return null;
        }
    }

    static {
        Covode.recordClassIndex(28037);
        C40787l.C40788a a = C40787l.m82269a(EnumC40793o.SCHEDULED);
        a.f95505c = 1;
        f56627b = (ScheduledExecutorService) C40780g.m82242a(a.mo70028a());
    }

    /* renamed from: a */
    public static Set<C23866a> m45230a() {
        if (C24677a.m47209a(C23916e.class)) {
            return null;
        }
        try {
            return f56629d.mo39410a();
        } catch (Throwable th) {
            C24677a.m47208a(th, C23916e.class);
            return null;
        }
    }

    /* renamed from: a */
    static /* synthetic */ C23914d m45227a(C23914d dVar) {
        if (C24677a.m47209a(C23916e.class)) {
            return null;
        }
        try {
            f56629d = dVar;
            return dVar;
        } catch (Throwable th) {
            C24677a.m47208a(th, C23916e.class);
            return null;
        }
    }

    /* renamed from: b */
    static void m45233b(EnumC23995j jVar) {
        if (!C24677a.m47209a(C23916e.class)) {
            try {
                f56629d.mo39411a(C23947f.m45271a());
                try {
                    C23997l a = m45228a(jVar, f56629d);
                    if (a != null) {
                        Intent intent = new Intent("com.facebook.sdk.APP_EVENTS_FLUSHED");
                        intent.putExtra("com.facebook.sdk.APP_EVENTS_NUM_EVENTS_FLUSHED", a.f56806a);
                        intent.putExtra("com.facebook.sdk.APP_EVENTS_FLUSH_RESULT", a.f56807b);
                        C24699ae.m47299a();
                        C0998a.m3454a(C24872m.f59047g).mo3694a(intent);
                    }
                } catch (Exception unused) {
                }
            } catch (Throwable th) {
                C24677a.m47208a(th, C23916e.class);
            }
        }
    }

    /* renamed from: a */
    public static void m45231a(final EnumC23995j jVar) {
        if (!C24677a.m47209a(C23916e.class)) {
            try {
                f56627b.execute(new Runnable() {
                    /* class com.facebook.p1814a.C23916e.RunnableC239193 */

                    static {
                        Covode.recordClassIndex(28040);
                    }

                    public final void run() {
                        if (!C24677a.m47209a(this)) {
                            try {
                                C23916e.m45233b(jVar);
                            } catch (Throwable th) {
                                C24677a.m47208a(th, this);
                            }
                        }
                    }
                });
            } catch (Throwable th) {
                C24677a.m47208a(th, C23916e.class);
            }
        }
    }

    /* renamed from: a */
    private static List<GraphRequest> m45229a(C23914d dVar, C23997l lVar) {
        if (C24677a.m47209a(C23916e.class)) {
            return null;
        }
        try {
            C24699ae.m47299a();
            boolean c = C24872m.m47690c(C24872m.f59047g);
            ArrayList arrayList = new ArrayList();
            for (C23866a aVar : dVar.mo39410a()) {
                GraphRequest a = m45226a(aVar, dVar.mo39409a(aVar), c, lVar);
                if (a != null) {
                    arrayList.add(a);
                }
            }
            return arrayList;
        } catch (Throwable th) {
            C24677a.m47208a(th, C23916e.class);
            return null;
        }
    }

    /* renamed from: a */
    private static C23997l m45228a(EnumC23995j jVar, C23914d dVar) {
        if (C24677a.m47209a(C23916e.class)) {
            return null;
        }
        try {
            C23997l lVar = new C23997l();
            List<GraphRequest> a = m45229a(dVar, lVar);
            if (a.size() <= 0) {
                return null;
            }
            C24783w.m47441a(EnumC25029u.APP_EVENTS, f56626a, "Flushing %d events due to %s.", Integer.valueOf(lVar.f56806a), jVar.toString());
            for (GraphRequest graphRequest : a) {
                GraphRequest.m45069a(graphRequest);
            }
            return lVar;
        } catch (Throwable th) {
            C24677a.m47208a(th, C23916e.class);
            return null;
        }
    }

    /* renamed from: a */
    private static GraphRequest m45226a(final C23866a aVar, final C24001o oVar, boolean z, final C23997l lVar) {
        if (C24677a.m47209a(C23916e.class)) {
            return null;
        }
        try {
            String applicationId = aVar.getApplicationId();
            boolean z2 = false;
            C24768q a = C24770r.m47427a(applicationId, false);
            final GraphRequest a2 = GraphRequest.m45067a((AccessToken) null, C1764a.m5928a("%s/activities", new Object[]{applicationId}), (JSONObject) null, (GraphRequest.AbstractC23858b) null);
            Bundle bundle = a2.f56459j;
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putString("access_token", aVar.getAccessTokenString());
            String d = C23973h.m45329d();
            if (d != null) {
                bundle.putString("device_token", d);
            }
            String e = C23973h.m45330e();
            if (e != null) {
                bundle.putString("install_referrer", e);
            }
            a2.f56459j = bundle;
            if (a != null) {
                z2 = a.f58753a;
            }
            C24699ae.m47299a();
            int a3 = oVar.mo39483a(a2, C24872m.f59047g, z2, z);
            if (a3 == 0) {
                return null;
            }
            lVar.f56806a += a3;
            a2.mo39348a((GraphRequest.AbstractC23858b) new GraphRequest.AbstractC23858b() {
                /* class com.facebook.p1814a.C23916e.C239204 */

                static {
                    Covode.recordClassIndex(28041);
                }

                @Override // com.facebook.GraphRequest.AbstractC23858b
                /* renamed from: a */
                public final void mo39350a(C24915r rVar) {
                    String str;
                    C23866a aVar = aVar;
                    GraphRequest graphRequest = a2;
                    C24001o oVar = oVar;
                    C23997l lVar = lVar;
                    if (!C24677a.m47209a(C23916e.class)) {
                        try {
                            FacebookRequestError facebookRequestError = rVar.f59155d;
                            String str2 = "Success";
                            EnumC23996k kVar = EnumC23996k.SUCCESS;
                            boolean z = true;
                            if (facebookRequestError != null) {
                                if (facebookRequestError.f56432d == -1) {
                                    str2 = "Failed: No Connectivity";
                                    kVar = EnumC23996k.NO_CONNECTIVITY;
                                } else {
                                    str2 = C1764a.m5928a("Failed:\n  Response: %s\n  Error %s", new Object[]{rVar.toString(), facebookRequestError.toString()});
                                    kVar = EnumC23996k.SERVER_ERROR;
                                }
                            }
                            if (C24872m.m47686a(EnumC25029u.APP_EVENTS)) {
                                try {
                                    str = new JSONArray((String) graphRequest.f56461l).toString(2);
                                } catch (JSONException unused) {
                                    str = "<Can't encode events for debug logging>";
                                }
                                C24783w.m47441a(EnumC25029u.APP_EVENTS, C23916e.f56626a, "Flush completed\nParams: %s\n  Result: %s\n  Events JSON: %s", graphRequest.f56455f.toString(), str2, str);
                            }
                            if (facebookRequestError == null) {
                                z = false;
                            }
                            oVar.mo39486a(z);
                            if (kVar == EnumC23996k.NO_CONNECTIVITY) {
                                C24872m.m47689c().execute(new Runnable(aVar, oVar) {
                                    /* class com.facebook.p1814a.C23916e.RunnableC239215 */

                                    /* renamed from: a */
                                    final /* synthetic */ C23866a f56637a;

                                    /* renamed from: b */
                                    final /* synthetic */ C24001o f56638b;

                                    static {
                                        Covode.recordClassIndex(28042);
                                    }

                                    public final void run() {
                                        if (!C24677a.m47209a(this)) {
                                            try {
                                                C23947f.m45272a(this.f56637a, this.f56638b);
                                            } catch (Throwable th) {
                                                C24677a.m47208a(th, this);
                                            }
                                        }
                                    }

                                    {
                                        this.f56637a = r1;
                                        this.f56638b = r2;
                                    }
                                });
                            }
                            if (kVar != EnumC23996k.SUCCESS && lVar.f56807b != EnumC23996k.NO_CONNECTIVITY) {
                                lVar.f56807b = kVar;
                            }
                        } catch (Throwable th) {
                            C24677a.m47208a(th, C23916e.class);
                        }
                    }
                }
            });
            return a2;
        } catch (Throwable th) {
            C24677a.m47208a(th, C23916e.class);
            return null;
        }
    }
}
