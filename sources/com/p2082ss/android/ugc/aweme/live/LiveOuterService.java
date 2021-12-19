package com.p2082ss.android.ugc.aweme.live;

import com.bytedance.android.livesdk.C10930u;
import com.bytedance.android.livesdkapi.depend.model.p685a.AbstractC11687h;
import com.bytedance.android.livesdkapi.host.AbstractC11817l;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.p1469l.p1473b.C20700a;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.experiment.C46775by;
import com.p2082ss.android.ugc.aweme.lego.C58152b;
import com.p2082ss.android.ugc.aweme.live.C58488aa;
import com.p2082ss.android.ugc.aweme.live.C58492ad;
import com.p2082ss.android.ugc.aweme.live.C58495af;
import com.p2082ss.android.ugc.aweme.live.C58581ao;
import com.p2082ss.android.ugc.aweme.live.C58584ap;
import com.p2082ss.android.ugc.aweme.live.C58787x;
import com.p2082ss.android.ugc.aweme.live.feedpage.AbstractC58618b;
import com.p2082ss.android.ugc.aweme.live.feedpage.AbstractC58619c;
import com.p2082ss.android.ugc.aweme.live.feedpage.C58617a;
import com.p2082ss.android.ugc.aweme.live.feedpage.C58621e;
import com.p2082ss.android.ugc.aweme.live.p3406c.AbstractC58594a;
import com.p2082ss.android.ugc.aweme.live.p3406c.C58595b;
import com.p2082ss.android.ugc.aweme.live.p3408e.AbstractC58607b;
import com.p2082ss.android.ugc.aweme.live.p3408e.AbstractC58608c;
import com.p2082ss.android.ugc.aweme.live.p3408e.C58609d;
import com.p2082ss.android.ugc.aweme.p3668r.AbstractC66586a;
import com.p2082ss.android.ugc.aweme.port.internal.AbstractC63279g;
import com.p2082ss.android.ugc.aweme.story.live.AbstractC77352b;
import com.p2082ss.android.ugc.aweme.story.live.C77353c;
import com.p2082ss.android.ugc.aweme.story.live.C77355e;
import com.p2082ss.android.ugc.aweme.story.live.C77360j;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.live.LiveOuterService */
public class LiveOuterService implements ILiveOuterService {

    /* renamed from: a */
    private C77353c f133144a;

    /* renamed from: b */
    private AbstractC58646i f133145b = new C58501aj();

    /* renamed from: c */
    private boolean f133146c = false;

    static {
        Covode.recordClassIndex(68772);
    }

    @Override // com.p2082ss.android.ugc.aweme.live.ILiveOuterService
    /* renamed from: m */
    public final AbstractC58647j mo95839m() {
        return C20700a.C20701a.f48888a;
    }

    @Override // com.p2082ss.android.ugc.aweme.live.ILiveOuterService
    /* renamed from: o */
    public final AbstractC58596d mo95841o() {
        return C58787x.C58788a.f133794a;
    }

    @Override // com.p2082ss.android.ugc.aweme.live.ILiveOuterService
    /* renamed from: c */
    public final AbstractC58725n mo95829c() {
        m107270t();
        return C77355e.f173550a;
    }

    @Override // com.p2082ss.android.ugc.aweme.live.ILiveOuterService
    /* renamed from: d */
    public final AbstractC58593c mo95830d() {
        m107270t();
        return C58492ad.C58493a.f133169a;
    }

    @Override // com.p2082ss.android.ugc.aweme.live.ILiveOuterService
    /* renamed from: i */
    public final AbstractC66586a mo95835i() {
        m107270t();
        return C77360j.C77366c.f173566a;
    }

    @Override // com.p2082ss.android.ugc.aweme.live.ILiveOuterService
    /* renamed from: j */
    public final AbstractC58594a mo95836j() {
        m107270t();
        return C58595b.m107707a();
    }

    @Override // com.p2082ss.android.ugc.aweme.live.ILiveOuterService
    /* renamed from: k */
    public final AbstractC58646i mo95837k() {
        m107270t();
        return this.f133145b;
    }

    @Override // com.p2082ss.android.ugc.aweme.live.ILiveOuterService
    /* renamed from: l */
    public final AbstractC58611f mo95838l() {
        m107270t();
        return C58495af.C58496a.f133171a;
    }

    @Override // com.p2082ss.android.ugc.aweme.live.ILiveOuterService
    /* renamed from: n */
    public final AbstractC58726o mo95840n() {
        m107270t();
        return C58584ap.C58585a.f133446a;
    }

    @Override // com.p2082ss.android.ugc.aweme.live.ILiveOuterService
    /* renamed from: p */
    public final AbstractC58649l mo95842p() {
        m107270t();
        return C58581ao.C58583b.f133444a;
    }

    @Override // com.p2082ss.android.ugc.aweme.live.ILiveOuterService
    /* renamed from: q */
    public final AbstractC58728q mo95843q() {
        m107270t();
        return C58586aq.f133447a;
    }

    @Override // com.p2082ss.android.ugc.aweme.live.ILiveOuterService
    /* renamed from: r */
    public final AbstractC58618b mo95844r() {
        return new C58617a();
    }

    @Override // com.p2082ss.android.ugc.aweme.live.ILiveOuterService
    /* renamed from: b */
    public final AbstractC58619c mo95828b() {
        m107270t();
        return C58621e.f133505i.mo52219b();
    }

    @Override // com.p2082ss.android.ugc.aweme.live.ILiveOuterService
    /* renamed from: e */
    public final AbstractC58605e mo95831e() {
        if (C46775by.m90126a()) {
            Live.initSPI();
        } else {
            m107270t();
        }
        return C58488aa.C58489a.f133165a;
    }

    @Override // com.p2082ss.android.ugc.aweme.live.ILiveOuterService
    /* renamed from: f */
    public final AbstractC77352b mo95832f() {
        if (this.f133144a == null) {
            this.f133144a = new C77353c();
        }
        return this.f133144a;
    }

    @Override // com.p2082ss.android.ugc.aweme.live.ILiveOuterService
    /* renamed from: g */
    public final AbstractC63279g mo95833g() {
        m107270t();
        return new C58499ai();
    }

    @Override // com.p2082ss.android.ugc.aweme.live.ILiveOuterService
    /* renamed from: h */
    public final AbstractC11687h mo95834h() {
        m107270t();
        return Live.getService().mo13028i();
    }

    /* renamed from: t */
    private void m107270t() {
        if (!C58152b.m105085c() || !this.f133146c) {
            LiveHostOuterService.m107232p().mo95817i();
            if (Live.getService() != null) {
                this.f133146c = true;
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.live.ILiveOuterService
    /* renamed from: a */
    public final void mo95827a() {
        C584841 r1 = new AbstractC11817l() {
            /* class com.p2082ss.android.ugc.aweme.live.LiveOuterService.C584841 */

            static {
                Covode.recordClassIndex(68773);
            }

            @Override // com.bytedance.android.livesdkapi.host.AbstractC11817l
            /* renamed from: a */
            public final boolean mo17783a() {
                return C58495af.C58496a.f133171a.mo95864b();
            }
        };
        C89219l.m154721d(r1, "");
        C10930u.f26256a = r1;
    }

    /* renamed from: s */
    public static ILiveOuterService m107269s() {
        MethodCollector.m26663i(1283);
        Object a = C81908b.m141854a(ILiveOuterService.class, false);
        if (a != null) {
            ILiveOuterService iLiveOuterService = (ILiveOuterService) a;
            MethodCollector.m26664o(1283);
            return iLiveOuterService;
        }
        if (C81908b.f183294cr == null) {
            synchronized (ILiveOuterService.class) {
                try {
                    if (C81908b.f183294cr == null) {
                        C81908b.f183294cr = new LiveOuterService();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(1283);
                    throw th;
                }
            }
        }
        LiveOuterService liveOuterService = (LiveOuterService) C81908b.f183294cr;
        MethodCollector.m26664o(1283);
        return liveOuterService;
    }

    @Override // com.p2082ss.android.ugc.aweme.live.ILiveOuterService
    /* renamed from: a */
    public final AbstractC58608c mo95826a(Runnable runnable, AbstractC58607b bVar) {
        m107270t();
        return new C58609d(runnable, bVar);
    }
}
