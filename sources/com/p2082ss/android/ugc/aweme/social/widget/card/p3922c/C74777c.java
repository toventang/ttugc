package com.p2082ss.android.ugc.aweme.social.widget.card.p3922c;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.metrics.C59256u;
import com.p2082ss.android.ugc.aweme.newfollow.p3506c.C61504e;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.utils.C80409eu;
import java.util.Map;
import java.util.concurrent.Callable;
import p077b.C1731i;
import p4600h.C89391z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.social.widget.card.c.c */
public final class C74777c {

    /* renamed from: a */
    public static final C74777c f168076a = new C74777c();

    private C74777c() {
    }

    static {
        Covode.recordClassIndex(87622);
    }

    /* renamed from: com.ss.android.ugc.aweme.social.widget.card.c.c$d */
    public static final class CallableC74781d<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ User f168087a;

        /* renamed from: b */
        final /* synthetic */ String f168088b;

        /* renamed from: c */
        final /* synthetic */ String f168089c;

        static {
            Covode.recordClassIndex(87626);
        }

        public CallableC74781d(User user, String str, String str2) {
            this.f168087a = user;
            this.f168088b = str;
            this.f168089c = str2;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            String a = C74777c.m131285a(this.f168087a);
            C33744d a2 = new C33744d().mo59983a("enter_from", this.f168088b).mo59983a("enter_method", this.f168089c).mo59983a("to_user_id", this.f168087a.getUid());
            new C59256u();
            C33744d a3 = a2.mo59983a("follow_type", C59256u.m108931b(this.f168087a).getType()).mo59983a("relation_type", this.f168087a.getFriendTypeStr()).mo59983a("rec_type", this.f168087a.getRecType());
            C89219l.m154716b(a3, "");
            C39162r.m79460a(a, C80409eu.m139390a(a3, this.f168087a).f79943a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.social.widget.card.c.c$a */
    static final class RunnableC74778a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Map f168077a;

        /* renamed from: b */
        final /* synthetic */ User f168078b;

        /* renamed from: c */
        final /* synthetic */ Integer f168079c;

        /* renamed from: d */
        final /* synthetic */ C59256u.EnumC59259c f168080d;

        static {
            Covode.recordClassIndex(87623);
        }

        RunnableC74778a(Map map, User user, Integer num, C59256u.EnumC59259c cVar) {
            this.f168077a = map;
            this.f168078b = user;
            this.f168079c = num;
            this.f168080d = cVar;
        }

        public final void run() {
            String str = (String) this.f168077a.get("enter_from");
            String str2 = (String) this.f168077a.get("previous_page");
            String str3 = (String) this.f168077a.get("homepage_uid");
            String str4 = (String) this.f168077a.get("position");
            String str5 = (String) this.f168077a.get("enter_method");
            C33744d a = new C33744d().mo59983a("enter_from", str).mo59983a("rec_type", this.f168078b.getRecType()).mo59983a("to_user_id", this.f168078b.getUid()).mo59983a("previous_page", str2).mo59983a("req_id", this.f168078b.getRequestId()).mo59983a("impr_id", this.f168078b.getUid()).mo59980a("follow_status", this.f168078b.getFollowStatus());
            C89219l.m154716b(a, "");
            C33744d a2 = C80409eu.m139390a(a, this.f168078b);
            Integer num = this.f168079c;
            if (num != null) {
                a2.mo59980a("impr_order", num.intValue());
            }
            if (str5 != null) {
                a2.mo59983a("enter_method", str5);
            }
            C39162r.m79460a("enter_personal_detail", a2.f79943a);
            C59256u q = new C59256u().mo96834a(str).mo96837o(str5).mo96839q(str2);
            q.f135350a = this.f168080d;
            q.f135352b = C59256u.EnumC59257a.ENTER_PROFILE;
            q.mo96832a(this.f168078b).mo96841s(this.f168078b.getRequestId()).mo96842t(str3).mo96838p(str4).mo96792f();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.social.widget.card.c.c$b */
    static final class CallableC74779b<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ Map f168081a;

        /* renamed from: b */
        final /* synthetic */ User f168082b;

        /* renamed from: c */
        final /* synthetic */ int f168083c;

        static {
            Covode.recordClassIndex(87624);
        }

        CallableC74779b(Map map, User user, int i) {
            this.f168081a = map;
            this.f168082b = user;
            this.f168083c = i;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            String str = (String) this.f168081a.get("enter_from");
            String str2 = (String) this.f168081a.get("previous_page");
            String str3 = (String) this.f168081a.get("homepage_uid");
            String str4 = (String) this.f168081a.get("position");
            if (this.f168082b.isShould_write_impr()) {
                C61504e.C61505a.f139616a.mo99160a(1, this.f168082b.getUid());
            }
            C39162r.m79460a("show_recommend_user_cell", new C33744d().mo59983a("enter_from", str).mo59983a("rec_type", this.f168082b.getRecType()).mo59983a("rec_uid", this.f168082b.getUid()).mo59980a("impr_order", this.f168083c).mo59983a("previous_page", str2).mo59983a("relation_type", this.f168082b.getFriendTypeStr()).mo59983a("req_id", this.f168082b.getRequestId()).f79943a);
            C59256u q = new C59256u().mo96834a(str).mo96839q(str2);
            q.f135350a = C59256u.EnumC59259c.CARD;
            q.f135352b = C59256u.EnumC59257a.SHOW;
            q.mo96832a(this.f168082b).mo96841s(this.f168082b.getRequestId()).mo96842t(str3).mo96838p(str4).mo96792f();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.social.widget.card.c.c$c */
    static final class RunnableC74780c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Map f168084a;

        /* renamed from: b */
        final /* synthetic */ User f168085b;

        /* renamed from: c */
        final /* synthetic */ int f168086c;

        static {
            Covode.recordClassIndex(87625);
        }

        RunnableC74780c(Map map, User user, int i) {
            this.f168084a = map;
            this.f168085b = user;
            this.f168086c = i;
        }

        public final void run() {
            String str = (String) this.f168084a.get("enter_from");
            String str2 = (String) this.f168084a.get("previous_page");
            C39162r.m79460a("close_recommend_user_cell", new C33744d().mo59983a("enter_from", str).mo59983a("previous_page", str2).mo59983a("rec_type", this.f168085b.getRecType()).mo59983a("rec_uid", this.f168085b.getUid()).mo59980a("impr_order", this.f168086c).mo59983a("relation_type", this.f168085b.getFriendTypeStr()).mo59983a("req_id", this.f168085b.getRequestId()).f79943a);
            C59256u q = new C59256u().mo96834a(str).mo96839q(str2);
            q.f135350a = C59256u.EnumC59259c.CARD;
            q.f135352b = C59256u.EnumC59257a.CLOSE;
            q.mo96832a(this.f168085b).mo96838p((String) this.f168084a.get("position")).mo96841s(this.f168085b.getRequestId()).mo96842t((String) this.f168084a.get("homepage_uid")).mo96792f();
        }
    }

    /* renamed from: a */
    public static String m131285a(User user) {
        if (user.getFollowStatus() == 0) {
            return "follow";
        }
        return "follow_cancel";
    }

    /* renamed from: a */
    public static void m131286a(User user, int i, Map<String, String> map) {
        C89219l.m154721d(user, "");
        C89219l.m154721d(map, "");
        C39162r.m79452a().execute(new RunnableC74780c(map, user, i));
    }

    /* renamed from: b */
    public static void m131289b(User user, int i, Map<String, String> map) {
        C89219l.m154721d(user, "");
        C89219l.m154721d(map, "");
        C1731i.m5640b(new CallableC74779b(map, user, i), C1731i.f5562a);
    }

    /* renamed from: a */
    public static void m131287a(User user, C59256u.EnumC59259c cVar, Integer num, Map<String, String> map) {
        C89219l.m154721d(user, "");
        C89219l.m154721d(cVar, "");
        C89219l.m154721d(map, "");
        C39162r.m79452a().execute(new RunnableC74778a(map, user, num, cVar));
    }

    /* renamed from: a */
    public static void m131288a(User user, String str, String str2, C59256u.EnumC59257a aVar, C59256u.EnumC59259c cVar) {
        C89219l.m154721d(user, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(aVar, "");
        C59256u a = new C59256u().mo96834a(str).mo96837o(str2).mo96832a(user);
        a.f135352b = aVar;
        a.f135350a = cVar;
        a.mo96792f();
    }
}
