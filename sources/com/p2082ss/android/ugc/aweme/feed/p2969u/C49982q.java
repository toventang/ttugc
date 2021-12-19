package com.p2082ss.android.ugc.aweme.feed.p2969u;

import android.os.SystemClock;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.api.C48337k;
import com.p2082ss.android.ugc.aweme.feed.api.C48338l;
import com.p2082ss.android.ugc.aweme.feed.api.FollowFeedApi;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.AbstractC50084au;
import com.p2082ss.android.ugc.aweme.live.AbstractC58647j;
import com.p2082ss.android.ugc.aweme.live.ILiveOuterService;
import com.p2082ss.android.ugc.aweme.live.LiveOuterService;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.C89387v;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.u.q */
public final class C49982q {

    /* renamed from: a */
    public final C88411a f115312a = new C88411a();

    /* renamed from: b */
    public final AbstractC50084au f115313b;

    static {
        Covode.recordClassIndex(59094);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.u.q$b */
    static final class C49984b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C49982q f115317a;

        static {
            Covode.recordClassIndex(59096);
        }

        C49984b(C49982q qVar) {
            this.f115317a = qVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f115317a.f115313b.mo85220s();
        }
    }

    public C49982q(AbstractC50084au auVar) {
        C89219l.m154721d(auVar, "");
        this.f115313b = auVar;
    }

    /* renamed from: a */
    public final void mo85028a(String str) {
        C89219l.m154721d(str, "");
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        if (g.isLogin()) {
            this.f115312a.mo142945a(FollowFeedApi.C48326a.m91784a().getInterestUsers(2, 0, 2).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C49983a(this, SystemClock.elapsedRealtime(), str), new C49984b(this)));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.u.q$a */
    static final class C49983a<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C49982q f115314a;

        /* renamed from: b */
        final /* synthetic */ long f115315b;

        /* renamed from: c */
        final /* synthetic */ String f115316c;

        static {
            Covode.recordClassIndex(59095);
        }

        C49983a(C49982q qVar, long j, String str) {
            this.f115314a = qVar;
            this.f115315b = j;
            this.f115316c = str;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            int i;
            AbstractC58647j m;
            C48338l lVar = (C48338l) obj;
            C33744d dVar = new C33744d();
            List<C48337k> followingInterestUsers = lVar.getFollowingInterestUsers();
            if (followingInterestUsers != null) {
                i = followingInterestUsers.size();
            } else {
                i = 0;
            }
            C39162r.m79460a("livesdk_live_request_response", dVar.mo59980a("room_num", i).mo59981a("duration", SystemClock.elapsedRealtime() - this.f115315b).mo59983a("enter_from_merge", "homepage_follow").mo59983a("enter_method", "live_cover").mo59983a("action_type", "click").mo59983a("request_api", "/aweme/v1/following/interest/users/").f79943a);
            if (C13603b.m24435a((Collection) lVar.getFollowingInterestUsers())) {
                this.f115314a.f115313b.mo85221t();
                return;
            }
            List<C48337k> followingInterestUsers2 = lVar.getFollowingInterestUsers();
            if (followingInterestUsers2 != null) {
                Iterator<T> it = followingInterestUsers2.iterator();
                while (it.hasNext()) {
                    it.next().setLogPbBean(lVar.getLogPbBean());
                }
            }
            AbstractC50084au auVar = this.f115314a.f115313b;
            List<C48337k> followingInterestUsers3 = lVar.getFollowingInterestUsers();
            if (followingInterestUsers3 == null) {
                C89219l.m154715b();
            }
            auVar.mo85218a(followingInterestUsers3);
            ILiveOuterService s = LiveOuterService.m107269s();
            if (!(s == null || (m = s.mo95839m()) == null)) {
                m.mo34111a("ttlive_from_following_show_live", 0, C89041ag.m154412a(C89387v.m154943a("source", "following")));
            }
            C39162r.m79460a("enter_following_window_feed", new C33744d().mo59983a("enter_from", this.f115316c).mo59983a("is_live", "1").f79943a);
        }
    }
}
