package com.facebook.imagepipeline.p1876b.p1877a;

import android.os.Looper;
import android.os.SystemClock;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.facebook.imagepipeline.common.C24360a;
import com.facebook.imagepipeline.p1885j.C24456e;
import com.facebook.imagepipeline.p1889n.AbstractC24529ag;
import com.facebook.imagepipeline.p1889n.AbstractC24545al;
import com.facebook.imagepipeline.p1889n.AbstractC24585c;
import com.facebook.imagepipeline.p1889n.AbstractC24596k;
import com.facebook.imagepipeline.p1889n.C24587e;
import com.facebook.imagepipeline.p1889n.C24614t;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import okhttp3.AbstractC90025ab;
import okhttp3.AbstractC90031ad;
import okhttp3.AbstractC90049e;
import okhttp3.AbstractC90051f;
import okhttp3.C90029ac;
import okhttp3.C90047d;
import okhttp3.C90208y;
import okhttp3.Request;

/* renamed from: com.facebook.imagepipeline.b.a.a */
public class C24347a extends AbstractC24585c<C24351a> {
    private final C90047d mCacheControl;
    private final AbstractC90049e.AbstractC90050a mCallFactory;
    public Executor mCancellationExecutor;

    static {
        Covode.recordClassIndex(28489);
    }

    public C24347a(C90208y yVar) {
        this(yVar, yVar.f204905c.mo145012a());
    }

    /* renamed from: com.facebook.imagepipeline.b.a.a$a */
    public static class C24351a extends C24614t {

        /* renamed from: a */
        public long f57737a;

        /* renamed from: b */
        public long f57738b;

        /* renamed from: c */
        public long f57739c;

        static {
            Covode.recordClassIndex(28493);
        }

        public C24351a(AbstractC24596k<C24456e> kVar, AbstractC24545al alVar) {
            super(kVar, alVar);
        }
    }

    public C24347a(AbstractC90049e.AbstractC90050a aVar, Executor executor) {
        this(aVar, executor, true);
    }

    @Override // com.facebook.imagepipeline.p1889n.AbstractC24529ag
    public C24351a createFetchState(AbstractC24596k<C24456e> kVar, AbstractC24545al alVar) {
        return new C24351a(kVar, alVar);
    }

    public void onFetchCompletion(C24351a aVar, int i) {
        aVar.f57739c = SystemClock.elapsedRealtime();
    }

    public Map<String, String> getExtraMap(C24351a aVar, int i) {
        HashMap hashMap = new HashMap(4);
        hashMap.put("queue_time", Long.toString(aVar.f57738b - aVar.f57737a));
        hashMap.put("fetch_time", Long.toString(aVar.f57739c - aVar.f57738b));
        hashMap.put("total_time", Long.toString(aVar.f57739c - aVar.f57737a));
        hashMap.put("image_size", Integer.toString(i));
        return hashMap;
    }

    public void fetch(C24351a aVar, AbstractC24529ag.AbstractC24530a aVar2) {
        aVar.f57737a = System.currentTimeMillis();
        try {
            Request.C90016a a = new Request.C90016a().mo144691a(aVar.mo40453c().toString()).mo144693a("GET", (AbstractC90025ab) null);
            C90047d dVar = this.mCacheControl;
            if (dVar != null) {
                a.mo144695a(dVar);
            }
            C24360a aVar3 = aVar.f58495e.mo40413a().mBytesRange;
            if (aVar3 != null) {
                a.mo144700b("Range", C1764a.m5929a(null, "bytes=%s-%s", new Object[]{C24360a.m46371a(aVar3.f57764a), C24360a.m46371a(aVar3.f57765b)}));
            }
            fetchWithRequest(aVar, aVar2, a.mo144698a());
        } catch (Exception e) {
            aVar2.mo40402a(e);
        }
    }

    public void handleException(AbstractC90049e eVar, Exception exc, AbstractC24529ag.AbstractC24530a aVar) {
        if (eVar.mo144712d()) {
            aVar.mo40400a();
        } else {
            aVar.mo40402a(exc);
        }
    }

    public C24347a(AbstractC90049e.AbstractC90050a aVar, Executor executor, boolean z) {
        C90047d dVar;
        this.mCallFactory = aVar;
        this.mCancellationExecutor = executor;
        if (z) {
            C90047d.C90048a aVar2 = new C90047d.C90048a();
            aVar2.f204193b = true;
            dVar = aVar2.mo144766a();
        } else {
            dVar = null;
        }
        this.mCacheControl = dVar;
    }

    /* access modifiers changed from: protected */
    public void fetchWithRequest(final C24351a aVar, final AbstractC24529ag.AbstractC24530a aVar2, Request request) {
        final AbstractC90049e a = this.mCallFactory.mo144767a(request);
        aVar.f58495e.mo40414a(new C24587e() {
            /* class com.facebook.imagepipeline.p1876b.p1877a.C24347a.C243481 */

            static {
                Covode.recordClassIndex(28490);
            }

            @Override // com.facebook.imagepipeline.p1889n.AbstractC24546am, com.facebook.imagepipeline.p1889n.C24587e
            /* renamed from: a */
            public final void mo34237a() {
                if (Looper.myLooper() != Looper.getMainLooper()) {
                    a.mo144710c();
                } else {
                    C24347a.this.mCancellationExecutor.execute(new Runnable() {
                        /* class com.facebook.imagepipeline.p1876b.p1877a.C24347a.C243481.RunnableC243491 */

                        static {
                            Covode.recordClassIndex(28491);
                        }

                        public final void run() {
                            a.mo144710c();
                        }
                    });
                }
            }
        });
        a.mo144708a(new AbstractC90051f() {
            /* class com.facebook.imagepipeline.p1876b.p1877a.C24347a.C243502 */

            static {
                Covode.recordClassIndex(28492);
            }

            @Override // okhttp3.AbstractC90051f
            public final void onFailure(AbstractC90049e eVar, IOException iOException) {
                C24347a.this.handleException(eVar, iOException, aVar2);
            }

            @Override // okhttp3.AbstractC90051f
            public final void onResponse(AbstractC90049e eVar, C90029ac acVar) {
                aVar.f57738b = System.currentTimeMillis();
                AbstractC90031ad adVar = acVar.f204111g;
                try {
                    if (!acVar.mo144720a()) {
                        C24347a.this.handleException(eVar, new IOException("Unexpected HTTP code ".concat(String.valueOf(acVar))), aVar2);
                        return;
                    }
                    C24360a a = C24360a.m46370a(acVar.mo144718a("Content-Range", null));
                    if (!(a == null || (a.f57764a == 0 && a.f57765b == Integer.MAX_VALUE))) {
                        aVar.f58498h = a;
                        aVar.f58497g = 8;
                    }
                    long contentLength = adVar.contentLength();
                    if (contentLength < 0) {
                        contentLength = 0;
                    }
                    aVar2.mo40401a(adVar.byteStream(), (int) contentLength);
                    adVar.close();
                } catch (Exception e) {
                    C24347a.this.handleException(eVar, e, aVar2);
                } finally {
                    adVar.close();
                }
            }
        });
    }
}
