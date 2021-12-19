package com.p2082ss.android.ugc.aweme.app.launch;

import android.content.Context;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.statisticlogger.C18205a;
import com.bytedance.ies.ugc.statisticlogger.C18218c;
import com.bytedance.ies.ugc.statisticlogger.C18228e;
import com.bytedance.ies.ugc.statisticlogger.config.C18220b;
import com.bytedance.ies.ugc.statisticlogger.config.EnumC18224c;
import com.p2082ss.android.common.applog.AppLog;
import com.p2082ss.android.common.p2132c.C29823c;
import com.p2082ss.android.ugc.aweme.account.experiment.MultiAccountService;
import com.p2082ss.android.ugc.aweme.feed.CommonFeedLaunchServiceImpl;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.C58221f;
import com.p2082ss.android.ugc.aweme.legoImp.task.MonitorInitTask;
import com.p2082ss.android.ugc.aweme.legoImp.task.RedBadgeUpdateTask;
import com.p2082ss.android.ugc.aweme.metrics.p3438b.C59227a;
import com.p2082ss.android.ugc.aweme.p3301k.C57060a;
import com.p2082ss.android.ugc.aweme.p3301k.C57061b;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4567d.AbstractC88438k;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.app.launch.b */
public final class C33818b {
    static {
        Covode.recordClassIndex(40718);
    }

    /* renamed from: com.ss.android.ugc.aweme.app.launch.b$b */
    public static final class C33820b implements AbstractC88433f<EnumC18224c> {

        /* renamed from: a */
        private boolean f80067a;

        static {
            Covode.recordClassIndex(40720);
        }

        C33820b() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(EnumC18224c cVar) {
            if (!this.f80067a) {
                new C58221f.C58224c().mo95703b((AbstractC58264w) new MonitorInitTask()).mo95706a();
                this.f80067a = true;
            }
            if (!C13627m.m24498a(AppLog.getClientId()) && !C13627m.m24498a(C18205a.m33878a())) {
                new C58221f.C58224c().mo95703b((AbstractC58264w) new RedBadgeUpdateTask()).mo95706a();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.launch.b$a */
    static final class C33819a<T> implements AbstractC88438k {

        /* renamed from: a */
        public static final C33819a f80066a = new C33819a();

        static {
            Covode.recordClassIndex(40719);
        }

        C33819a() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88438k
        /* renamed from: a */
        public final /* synthetic */ boolean mo7718a(Object obj) {
            C89219l.m154721d(obj, "");
            if (obj == EnumC18224c.Local) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: a */
    public static final void m69183a(Context context) {
        C89219l.m154721d(context, "");
        C18220b.f43409a.mo143268a(C33819a.f80066a).mo143289d(new C33820b());
        AbstractC88979t<C18218c> i = C18228e.f43417a.mo143294e().mo143189i();
        C89219l.m154716b(i, "");
        i.mo143289d(C33821c.f80068a);
    }

    /* renamed from: com.ss.android.ugc.aweme.app.launch.b$c */
    static final class C33821c<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C33821c f80068a = new C33821c();

        static {
            Covode.recordClassIndex(40721);
        }

        C33821c() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C18218c cVar = (C18218c) obj;
            C89219l.m154716b(cVar, "");
            C89219l.m154721d(cVar, "");
            int i = C57061b.f129928a[cVar.f43402a.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    C59227a.m108847a("monitor", "launch", cVar.f43404c);
                    MultiAccountService.m65945c().mo57225a();
                } else if (i == 3) {
                    C29823c.m60080a(C17867d.m33078a(), "monitor", "terminate");
                    C59227a.m108847a("monitor", "terminate", cVar.f43404c);
                    C57060a.f129926a = false;
                    CommonFeedLaunchServiceImpl.m91019b().mo80038a();
                }
            } else if (!C57060a.f129926a) {
                C57060a.f129926a = true;
                C29823c.m60080a(C17867d.m33078a(), "monitor", "launch");
            }
        }
    }
}
