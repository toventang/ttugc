package com.p2082ss.android.ugc.aweme.discover.hitrank;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.p2123b.C29736b;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.discover.C41856b;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.services.RetrofitService;
import java.util.List;
import java.util.concurrent.Callable;
import p077b.C1731i;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.hitrank.d */
public final class C42066d {

    /* renamed from: a */
    static RankApi f98066a;

    /* renamed from: b */
    public static final C42066d f98067b = new C42066d();

    private C42066d() {
    }

    static {
        Covode.recordClassIndex(50000);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.discover.hitrank.d$a */
    public static final class CallableC42067a<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ String f98068a;

        /* renamed from: b */
        final /* synthetic */ int f98069b;

        /* renamed from: c */
        final /* synthetic */ List f98070c;

        /* renamed from: d */
        final /* synthetic */ String f98071d;

        static {
            Covode.recordClassIndex(50001);
        }

        CallableC42067a(String str, int i, List list, String str2) {
            this.f98068a = str;
            this.f98069b = i;
            this.f98070c = list;
            this.f98071d = str2;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            RankApi rankApi = C42066d.f98066a;
            if (rankApi == null) {
                C89219l.m154715b();
            }
            return rankApi.finishHitRankTask(this.f98068a, 1, this.f98069b, this.f98070c, this.f98071d).get();
        }
    }

    /* renamed from: a */
    public static void m84193a(User user, int i) {
        if (C41856b.f97654a.mo70762a(user, i)) {
            if (user == null) {
                C89219l.m154715b();
            }
            m84194a(user.getUid(), user.getSecUid(), i, null);
        }
    }

    /* renamed from: a */
    public final void mo71244a(Aweme aweme, int i) {
        if (C41856b.f97654a.mo70761a(aweme, i)) {
            if (aweme == null) {
                C89219l.m154715b();
            }
            m84193a(aweme.getAuthor(), i);
        }
    }

    /* renamed from: a */
    public static void m84194a(String str, String str2, int i, List<String> list) {
        C31575b.m65859a();
        IAccountUserService e = C31575b.f75524a.mo57069e();
        C89219l.m154716b(e, "");
        if (e.isLogin()) {
            if (f98066a == null) {
                f98066a = (RankApi) RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(C29736b.f70924e).create(RankApi.class);
            }
            C1731i.m5640b(new CallableC42067a(str, i, list, str2), C1731i.f5562a);
        }
    }
}
