package com.p2082ss.android.ugc.aweme.p2359ay;

import android.net.Uri;
import android.os.Looper;
import android.util.Pair;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.C14731e;
import com.bytedance.lighten.p1477a.C20750g;
import com.bytedance.lighten.p1477a.p1480c.AbstractC20732i;
import com.facebook.common.p1833e.C24099a;
import com.facebook.net.AbstractC24901d;
import com.facebook.net.C24890a;
import java.io.IOException;
import java.io.InputStream;
import okhttp3.AbstractC90025ab;
import okhttp3.AbstractC90031ad;
import okhttp3.AbstractC90049e;
import okhttp3.AbstractC90051f;
import okhttp3.C90022aa;
import okhttp3.C90029ac;
import okhttp3.C90047d;
import okhttp3.Request;

/* renamed from: com.ss.android.ugc.aweme.ay.o */
public final class C34384o extends AbstractC34362b {

    /* renamed from: e */
    public volatile AbstractC90049e f81287e;

    /* renamed from: f */
    public volatile Request f81288f;

    static {
        Covode.recordClassIndex(41328);
    }

    @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20736m
    /* renamed from: a */
    public final void mo34162a() {
        if (this.f81287e == null) {
            return;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            this.f81287e.mo144710c();
        } else {
            this.f81232a.execute(new Runnable() {
                /* class com.p2082ss.android.ugc.aweme.p2359ay.C34384o.RunnableC343862 */

                static {
                    Covode.recordClassIndex(41330);
                }

                public final void run() {
                    C34384o.this.f81287e.mo144710c();
                }
            });
        }
    }

    @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20736m
    /* renamed from: a */
    public final void mo34163a(C20750g gVar) {
        gVar.f48974a = System.currentTimeMillis();
        this.f81234c = (AbstractC24901d) gVar.f48984k;
        Uri uri = gVar.f48981h;
        Request.C90016a aVar = new Request.C90016a();
        if (gVar.f48978e > 0) {
            aVar.mo144692a("Range", "bytes=" + gVar.f48978e + "-");
        }
        String a = C14731e.m26982a(this.f81235d.mo60814a(uri.toString()));
        if (C13627m.m24498a(a)) {
            a = uri.toString();
        }
        C90047d.C90048a aVar2 = new C90047d.C90048a();
        aVar2.f204193b = true;
        this.f81288f = aVar.mo144695a(aVar2.mo144766a()).mo144691a(a).mo144693a("GET", (AbstractC90025ab) null).mo144698a();
        this.f81287e = C90022aa.m156235a(C24890a.m47718a(), this.f81288f, false);
    }

    @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20736m
    /* renamed from: a */
    public final void mo34164a(final C20750g gVar, final AbstractC20732i iVar) {
        if (this.f81287e != null && gVar != null) {
            final Request a = this.f81287e.mo144707a();
            this.f81287e.mo144708a(new AbstractC90051f() {
                /* class com.p2082ss.android.ugc.aweme.p2359ay.C34384o.C343851 */

                static {
                    Covode.recordClassIndex(41329);
                }

                @Override // okhttp3.AbstractC90051f
                public final void onFailure(AbstractC90049e eVar, IOException iOException) {
                    C34384o.this.mo60815a(null, gVar, eVar, iOException, iVar);
                }

                @Override // okhttp3.AbstractC90051f
                public final void onResponse(AbstractC90049e eVar, C90029ac acVar) {
                    gVar.f48975b = System.currentTimeMillis();
                    gVar.f48976c = System.currentTimeMillis();
                    AbstractC90031ad adVar = acVar.f204111g;
                    try {
                        if (!acVar.mo144720a()) {
                            C34384o.this.mo60815a(acVar, gVar, eVar, new IOException("Unexpected HTTP code ".concat(String.valueOf(acVar))), iVar);
                            if (adVar != null) {
                                try {
                                    adVar.close();
                                } catch (Exception e) {
                                    C24099a.m45652b("OkHttpNetworkFetchProducer", "Exception when closing response body", e);
                                }
                            }
                        } else {
                            Pair<InputStream, Long> a = C34384o.this.f81235d.mo60813a(adVar.byteStream(), acVar.f204105a.url().toString(), adVar.contentLength());
                            long longValue = ((Long) a.second).longValue();
                            if (longValue < 0 || (gVar.f48978e > 0 && acVar.f204107c != 206)) {
                                longValue = 0;
                            }
                            gVar.f48983j = new RunnableC34387p(this, gVar, acVar, longValue, a);
                            iVar.mo34156a((InputStream) a.first, (int) longValue);
                            try {
                                adVar.close();
                            } catch (Exception e2) {
                                C24099a.m45652b("OkHttpNetworkFetchProducer", "Exception when closing response body", e2);
                            }
                        }
                    } catch (Exception e3) {
                        C34384o.this.mo60815a(acVar, gVar, eVar, e3, iVar);
                        if (adVar != null) {
                            try {
                                adVar.close();
                            } catch (Exception e4) {
                                C24099a.m45652b("OkHttpNetworkFetchProducer", "Exception when closing response body", e4);
                            }
                        }
                    } catch (Throwable th) {
                        if (adVar != null) {
                            try {
                                adVar.close();
                            } catch (Exception e5) {
                                C24099a.m45652b("OkHttpNetworkFetchProducer", "Exception when closing response body", e5);
                            }
                        }
                        throw th;
                    }
                }
            });
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a1, code lost:
        if ("Socket closed".equals(r20.getMessage()) == false) goto L_0x00a3;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo60815a(okhttp3.C90029ac r17, com.bytedance.lighten.p1477a.C20750g r18, okhttp3.AbstractC90049e r19, java.lang.Exception r20, com.bytedance.lighten.p1477a.p1480c.AbstractC20732i r21) {
        /*
        // Method dump skipped, instructions count: 179
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p2359ay.C34384o.mo60815a(okhttp3.ac, com.bytedance.lighten.a.g, okhttp3.e, java.lang.Exception, com.bytedance.lighten.a.c.i):void");
    }
}
