package com.p2082ss.android.ugc.aweme.feed.p2957n;

import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.os.SystemClock;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.p1477a.C20758o;
import com.bytedance.lighten.p1477a.p1480c.AbstractC20727d;
import com.facebook.p1902j.p1903a.C24801b;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.C39163s;
import com.p2082ss.android.ugc.aweme.common.MobClick;
import com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48234cd;
import com.p2082ss.android.ugc.aweme.feed.helper.C49618d;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.Video;
import com.p2082ss.android.ugc.aweme.logger.C58945a;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.feed.n.j */
public final class C49754j extends AbstractC20727d {

    /* renamed from: a */
    public WeakReference<AbstractC48234cd> f114491a;

    /* renamed from: b */
    public Aweme f114492b;

    /* renamed from: c */
    public Video f114493c;

    /* renamed from: d */
    private long f114494d;

    /* renamed from: e */
    private C49618d f114495e;

    static {
        Covode.recordClassIndex(58858);
    }

    /* renamed from: a */
    public final boolean mo84308a() {
        if (this.f114491a.get() == null || this.f114492b == null || this.f114493c == null) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20727d, com.bytedance.lighten.p1477a.p1480c.AbstractC20734k
    /* renamed from: a */
    public final void mo34146a(Uri uri) {
        this.f114491a.clear();
        this.f114492b = null;
        this.f114493c = null;
    }

    public C49754j(AbstractC48234cd cdVar, C49618d dVar) {
        this.f114491a = new WeakReference<>(cdVar);
        this.f114492b = cdVar.mo80206b();
        this.f114495e = dVar;
    }

    @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20727d, com.bytedance.lighten.p1477a.p1480c.AbstractC20734k
    /* renamed from: a */
    public final void mo34147a(Uri uri, View view) {
        this.f114494d = System.currentTimeMillis();
        C1731i.m5640b(new Callable<Object>() {
            /* class com.p2082ss.android.ugc.aweme.feed.p2957n.C49754j.CallableC497551 */

            static {
                Covode.recordClassIndex(58859);
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                if (C49754j.this.mo84308a()) {
                    return null;
                }
                C39162r.onEvent(MobClick.obtain().setEventName("image_request").setValue(C49754j.this.f114492b.getAid()).setLabelName("perf_monitor").setJsonObject(new C39163s().mo67941a("request_id", C49754j.this.f114491a.get().mo80198as().optString("request_id")).mo67942a()));
                return null;
            }
        }, C39162r.m79452a());
    }

    @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20734k
    /* renamed from: a */
    public final void mo34159a(Uri uri, View view, Throwable th) {
        if (!mo84308a()) {
            final long currentTimeMillis = System.currentTimeMillis() - this.f114494d;
            final boolean at = this.f114491a.get().mo80199at();
            C1731i.m5640b(new Callable<Object>() {
                /* class com.p2082ss.android.ugc.aweme.feed.p2957n.C49754j.CallableC497573 */

                static {
                    Covode.recordClassIndex(58861);
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    int i;
                    MobClick labelName = MobClick.obtain().setEventName("image_request_response").setValue(C49754j.this.f114492b.getAid()).setLabelName("perf_monitor");
                    C39163s a = new C39163s().mo67941a("request_id", C49754j.this.f114491a.get().mo80198as().optString("request_id"));
                    if (!at) {
                        i = 2;
                    } else {
                        i = 0;
                    }
                    C39162r.onEvent(labelName.setJsonObject(a.mo67941a("is_success", String.valueOf(i)).mo67941a("duration", String.valueOf(currentTimeMillis)).mo67941a("internet_speed", String.valueOf((int) C24801b.C24802a.f58850a.mo40616b())).mo67941a("is_cache", String.valueOf(C34577e.m70603a(Uri.parse(C49754j.this.f114493c.getOriginCover().getUrlList().get(0))) ? 1 : 0)).mo67942a()));
                    return null;
                }
            }, C39162r.m79452a());
        }
    }

    @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20734k
    /* renamed from: a */
    public final void mo34158a(Uri uri, View view, C20758o oVar, Animatable animatable) {
        C58945a.C58947b.f134185a.mo96429b("feed_cover_total", false);
        C49618d dVar = this.f114495e;
        if (dVar != null) {
            dVar.f114175a = SystemClock.elapsedRealtime();
        }
        if (!mo84308a()) {
            final long currentTimeMillis = System.currentTimeMillis() - this.f114494d;
            final boolean at = this.f114491a.get().mo80199at();
            C1731i.m5640b(new Callable<Object>() {
                /* class com.p2082ss.android.ugc.aweme.feed.p2957n.C49754j.CallableC497562 */

                static {
                    Covode.recordClassIndex(58860);
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    int i;
                    if (C49754j.this.mo84308a()) {
                        return null;
                    }
                    MobClick labelName = MobClick.obtain().setEventName("image_request_response").setValue(C49754j.this.f114492b.getAid()).setLabelName("perf_monitor");
                    C39163s a = new C39163s().mo67941a("request_id", C49754j.this.f114491a.get().mo80198as().optString("request_id"));
                    if (!at) {
                        i = 2;
                    } else {
                        i = 1;
                    }
                    C39162r.onEvent(labelName.setJsonObject(a.mo67941a("is_success", String.valueOf(i)).mo67941a("duration", String.valueOf(currentTimeMillis)).mo67941a("internet_speed", String.valueOf((int) C24801b.C24802a.f58850a.mo40616b())).mo67941a("is_cache", String.valueOf(C34577e.m70603a(Uri.parse(C49754j.this.f114493c.getOriginCover().getUrlList().get(0))) ? 1 : 0)).mo67942a()));
                    return null;
                }
            }, C39162r.m79452a());
        }
    }
}
