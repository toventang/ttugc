package com.p2082ss.android.ugc.aweme.notification.p3531i;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.base.p2364a.AbstractC34478k;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.friends.p3022ui.C51700au;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.metrics.C59256u;
import com.p2082ss.android.ugc.aweme.newfollow.p3506c.C61504e;
import com.p2082ss.android.ugc.aweme.notice.api.C61530a;
import com.p2082ss.android.ugc.aweme.notification.p3520b.C61862a;
import com.p2082ss.android.ugc.aweme.notification.p3531i.C62208i;
import com.p2082ss.android.ugc.aweme.notification.p3535vm.C62455c;
import com.p2082ss.android.ugc.aweme.notification.p3535vm.C62474d;
import com.p2082ss.android.ugc.aweme.notification.p3535vm.NotificationVM;
import com.p2082ss.android.ugc.aweme.notification.utils.C62259e;
import com.p2082ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.recommend.C66623g;
import com.p2082ss.android.ugc.trill.R;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notification.i.g */
public final class C62193g extends C62208i.C62209a implements AbstractC34478k<User> {

    /* renamed from: a */
    private final AbstractC89244h f141197a = C61862a.m111996a(new C62196c(this));

    /* renamed from: b */
    private final AbstractC89244h f141198b = C89250i.m154773a((AbstractC89171a) C62195b.f141200a);

    static {
        Covode.recordClassIndex(72947);
    }

    /* renamed from: h */
    private final NotificationVM m112478h() {
        return (NotificationVM) this.f141197a.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2364a.AbstractC34478k
    /* renamed from: a */
    public final void mo60911a(FollowStatus followStatus, String str, String str2) {
    }

    /* renamed from: b */
    public final Set<String> mo100192b() {
        return (Set) this.f141198b.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.i.g$b */
    static final class C62195b extends AbstractC89220m implements AbstractC89171a<Set<String>> {

        /* renamed from: a */
        public static final C62195b f141200a = new C62195b();

        static {
            Covode.recordClassIndex(72949);
        }

        C62195b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Set<String> invoke() {
            return new LinkedHashSet();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.i.g$c */
    static final class C62196c extends AbstractC89220m implements AbstractC89171a<NotificationVM> {

        /* renamed from: a */
        final /* synthetic */ C62193g f141201a;

        static {
            Covode.recordClassIndex(72950);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C62196c(C62193g gVar) {
            super(0);
            this.f141201a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ NotificationVM invoke() {
            return NotificationVM.C62378a.m112820a(this.f141201a.mo100206j());
        }
    }

    /* renamed from: m */
    private static boolean m112480m() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: i */
    private final C62474d m112479i() {
        C62455c b = m112478h().mo100373b(C61530a.C61532b.m111445a());
        Objects.requireNonNull(b, "null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.vm.NotificationTLModel");
        return (C62474d) b;
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.i.g$a */
    static final class C62194a<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C62193g f141199a;

        static {
            Covode.recordClassIndex(72948);
        }

        C62194a(C62193g gVar) {
            this.f141199a = gVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            this.f141199a.mo100192b().clear();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.p3531i.C62208i.C62209a
    /* renamed from: a */
    public final void mo100174a(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.mo100174a(view, bundle);
        m112479i().mo100436b().observe(mo100206j(), new C62194a(this));
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [int, java.lang.Object, int] */
    @Override // com.p2082ss.android.ugc.aweme.base.p2364a.AbstractC34478k
    /* renamed from: a */
    public final /* synthetic */ void mo60910a(int i, User user, int i2) {
        User user2 = user;
        if (mo100206j().af_() && user2 != null) {
            String str = "";
            if (i == C51700au.f119171c) {
                SmartRoute withParam = SmartRouter.buildRoute(mo100207k(), "aweme://user/profile/" + user2.getUid()).withParam("sec_user_id", user2.getSecUid()).withParam("from_recommend_card", 1).withParam("need_track_compare_recommend_reason", 1).withParam("previous_recommend_reason", user2.getRecommendReason()).withParam("extra_mutual_relation", user2.getMutualStruct()).withParam("extra_from_mutual", true).withParam("recommend_from_type", "list");
                String h = m112479i().f141722f.mo100381e().mo100416h();
                if (h != null) {
                    str = h;
                }
                withParam.withParam("enter_from_request_id", str).withParam("recommend_enter_profile_params", new C66623g("notification_page", null, C59256u.EnumC59259c.CARD, user2.getRecType(), C66623g.C66624a.m118386a(user2), user2.getUid(), null, null, user2.getRequestId(), null, user2.getFriendTypeStr(), user2.getSocialInfo())).open();
                C62259e.m112630d(user2, Integer.valueOf(m112479i().mo100445a(user2.getUid())), m112478h().mo100343b());
            } else if (i == C51700au.f119176h) {
                ActivityC0945e l = mo100208l();
                if (!C58029j.f132256h || !C58029j.m104846b() || C58029j.m104847c()) {
                    C58029j.f132256h = m112480m();
                }
                if (!C58029j.f132256h) {
                    new C23144b(l).mo37640e(R.string.dcq).mo37637b();
                } else {
                    C62259e.m112628c(user2, Integer.valueOf(m112479i().mo100445a(user2.getUid())), m112478h().mo100343b());
                }
            } else if (i == C51700au.f119173e) {
                m112479i().mo100433a(i2);
            } else if (i == C51700au.f119175g && !mo100192b().contains(user2.getUid())) {
                if (user2.isShould_write_impr()) {
                    C61504e.C61505a.f139616a.mo99160a(1, user2.getUid());
                }
                C62259e.m112616a(user2, Integer.valueOf(m112479i().mo100445a(user2.getUid())), m112478h().mo100343b());
                Set<String> b = mo100192b();
                String uid = user2.getUid();
                C89219l.m154716b(uid, str);
                b.add(uid);
            }
        }
    }
}
