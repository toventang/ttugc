package com.p2082ss.android.ugc.aweme.inbox.p3271f;

import android.app.Activity;
import android.content.res.Resources;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.p1198d.C17191a;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.comment.model.Comment;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.inbox.C56463i;
import com.p2082ss.android.ugc.aweme.inbox.p3267b.C56323c;
import com.p2082ss.android.ugc.aweme.inbox.widget.multi.C56532a;
import com.p2082ss.android.ugc.aweme.inbox.widget.multi.C56562b;
import com.p2082ss.android.ugc.aweme.inbox.widget.multi.C56588n;
import com.p2082ss.android.ugc.aweme.inbox.widget.multi.EnumC56565e;
import com.p2082ss.android.ugc.aweme.inbox.widget.multi.EnumC56589o;
import com.p2082ss.android.ugc.aweme.notice.api.C61530a;
import com.p2082ss.android.ugc.aweme.notice.api.C61542b;
import com.p2082ss.android.ugc.aweme.notice.api.bean.C61561m;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.AnnouncementNotice;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.AtMe;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.C61627b;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.C61628c;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.C61629d;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.C61630e;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.C61636j;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.C61638l;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.C61639m;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.CheckProfileNotice;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.CommentNotice;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.DiggNotice;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.DuetNotice;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.FollowApproveNotice;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.FollowNotice;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.FollowPageData;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.FriendNotice;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.PostNotice;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.UserTextNotice;
import com.p2082ss.android.ugc.aweme.notice.repo.list.p3517a.C61621c;
import com.p2082ss.android.ugc.aweme.notice.repo.list.p3517a.C61624f;
import com.p2082ss.android.ugc.aweme.notification.p3529h.View$OnClickListenerC62150u;
import com.p2082ss.android.ugc.aweme.notification.redpoint.C62221f;
import com.p2082ss.android.ugc.aweme.notification.view.template.NoticeTemplateMiddleView;
import com.p2082ss.android.ugc.aweme.p2315ao.C33515a;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.utils.ActivityStack;
import com.p2082ss.android.ugc.aweme.utils.C80187aa;
import com.p2082ss.android.ugc.aweme.utils.C80537hk;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.inbox.f.a */
public final class C56408a {

    /* renamed from: d */
    public static final C56413e f128653d = new C56413e((byte) 0);

    /* renamed from: a */
    public final String f128654a = "Activity";

    /* renamed from: b */
    public final String f128655b = "People you follow are LIVE";

    /* renamed from: c */
    public final AbstractC89244h f128656c = C89250i.m154773a((AbstractC89171a) C56416h.f128682a);

    /* renamed from: e */
    private final AbstractC89244h f128657e = C89250i.m154773a((AbstractC89171a) C56428t.f128695a);

    /* renamed from: f */
    private final AbstractC89244h f128658f = C89250i.m154773a((AbstractC89171a) C56427s.f128694a);

    /* renamed from: g */
    private final AbstractC89244h f128659g = C89250i.m154773a((AbstractC89171a) C56426r.f128693a);

    /* renamed from: h */
    private final AbstractC89244h f128660h = C89250i.m154773a((AbstractC89171a) C56420l.f128687a);

    /* renamed from: i */
    private final AbstractC89244h f128661i = C89250i.m154773a((AbstractC89171a) C56421m.f128688a);

    /* renamed from: j */
    private final String f128662j = "others";

    /* renamed from: k */
    private final String f128663k = "activities";

    /* renamed from: l */
    private final AbstractC89244h f128664l = C89250i.m154773a((AbstractC89171a) C56423o.f128690a);

    /* renamed from: m */
    private final AbstractC89244h f128665m = C89250i.m154773a((AbstractC89171a) C56424p.f128691a);

    /* renamed from: n */
    private final AbstractC89244h f128666n = C89250i.m154773a((AbstractC89171a) C56425q.f128692a);

    /* renamed from: o */
    private final AbstractC89244h f128667o = C89250i.m154773a((AbstractC89171a) C56415g.f128681a);

    /* renamed from: p */
    private final AbstractC89244h f128668p = C89250i.m154773a((AbstractC89171a) C56414f.f128680a);

    /* renamed from: q */
    private final AbstractC89244h f128669q = C89250i.m154773a((AbstractC89171a) new C56412d(this));

    /* renamed from: r */
    private final AbstractC89244h f128670r = C89250i.m154773a((AbstractC89171a) C56411c.f128678a);

    /* renamed from: s */
    private final AbstractC89244h f128671s = C89250i.m154773a((AbstractC89171a) new C56410b(this));

    /* renamed from: t */
    private final AbstractC89244h f128672t = C89250i.m154773a((AbstractC89171a) C56409a.f128676a);

    /* renamed from: u */
    private final AbstractC89244h f128673u = C89250i.m154773a((AbstractC89171a) C56419k.f128686a);

    /* renamed from: v */
    private final AbstractC89244h f128674v = C89250i.m154773a((AbstractC89171a) C56418j.f128685a);

    /* renamed from: w */
    private final Comparator<MusNotice> f128675w = C56422n.f128689a;

    static {
        Covode.recordClassIndex(66228);
    }

    /* renamed from: e */
    private final List<String> m102377e() {
        return (List) this.f128660h.getValue();
    }

    /* renamed from: f */
    private final List<String> m102378f() {
        return (List) this.f128664l.getValue();
    }

    /* renamed from: h */
    private final List<String> m102380h() {
        return (List) this.f128669q.getValue();
    }

    /* renamed from: i */
    private final C56588n m102381i() {
        return (C56588n) this.f128673u.getValue();
    }

    /* renamed from: j */
    private final C56588n m102382j() {
        return (C56588n) this.f128674v.getValue();
    }

    /* renamed from: a */
    public final List<String> mo93394a() {
        return (List) this.f128667o.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.f.a$e */
    public static final class C56413e {
        static {
            Covode.recordClassIndex(66233);
        }

        private C56413e() {
        }

        /* renamed from: a */
        public static void m102391a() {
            if (!C56323c.m102322i()) {
                if (C61542b.m111458a(12) != 0) {
                    C61542b.m111470d(12);
                    AbstractC81915c.m141874a(new C61561m(6, C61542b.m111458a(6)));
                }
            }
        }

        public /* synthetic */ C56413e(byte b) {
            this();
        }

        /* renamed from: a */
        public static List<FollowPageData> m102390a(List<FollowPageData> list) {
            MusNotice notice;
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (T t : list) {
                T t2 = t;
                if (!(t2.getFollowRequest() == null && ((notice = t2.getNotice()) == null || notice.followNotice == null))) {
                    arrayList.add(t);
                }
            }
            return arrayList;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.f.a$j */
    static final class C56418j extends AbstractC89220m implements AbstractC89171a<C56588n> {

        /* renamed from: a */
        public static final C56418j f128685a = new C56418j();

        static {
            Covode.recordClassIndex(66238);
        }

        C56418j() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C56588n invoke() {
            return new C56588n(EnumC56589o.DOT);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.f.a$k */
    static final class C56419k extends AbstractC89220m implements AbstractC89171a<C56588n> {

        /* renamed from: a */
        public static final C56419k f128686a = new C56419k();

        static {
            Covode.recordClassIndex(66239);
        }

        C56419k() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C56588n invoke() {
            return new C56588n(EnumC56589o.NONE);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.f.a$a */
    static final class C56409a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        public static final C56409a f128676a = new C56409a();

        static {
            Covode.recordClassIndex(66229);
        }

        C56409a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            String a = C3966y.m9657a((int) R.string.cjy);
            if (a == null) {
                return "";
            }
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.f.a$c */
    static final class C56411c extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        public static final C56411c f128678a = new C56411c();

        static {
            Covode.recordClassIndex(66231);
        }

        C56411c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            String a = C3966y.m9657a((int) R.string.ckj);
            if (a == null) {
                return "";
            }
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.f.a$f */
    static final class C56414f extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        public static final C56414f f128680a = new C56414f();

        static {
            Covode.recordClassIndex(66234);
        }

        C56414f() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            String a = C3966y.m9657a((int) R.string.ck2);
            if (a == null) {
                return "";
            }
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.f.a$g */
    static final class C56415g extends AbstractC89220m implements AbstractC89171a<List<? extends String>> {

        /* renamed from: a */
        public static final C56415g f128681a = new C56415g();

        static {
            Covode.recordClassIndex(66235);
        }

        C56415g() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ List<? extends String> invoke() {
            String a = C3966y.m9657a((int) R.string.ck_);
            if (a == null) {
                a = "";
            }
            return C89070n.m154516a(a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.f.a$h */
    static final class C56416h extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        public static final C56416h f128682a = new C56416h();

        static {
            Covode.recordClassIndex(66236);
        }

        C56416h() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            String a = C3966y.m9657a((int) R.string.fiu);
            if (a == null) {
                return "";
            }
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.f.a$r */
    static final class C56426r extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        public static final C56426r f128693a = new C56426r();

        static {
            Covode.recordClassIndex(66246);
        }

        C56426r() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            String a = C3966y.m9657a((int) R.string.cjo);
            if (a == null) {
                return "";
            }
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.f.a$s */
    static final class C56427s extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        public static final C56427s f128694a = new C56427s();

        static {
            Covode.recordClassIndex(66247);
        }

        C56427s() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            String a = C3966y.m9657a((int) R.string.ck3);
            if (a == null) {
                return "";
            }
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.f.a$b */
    static final class C56410b extends AbstractC89220m implements AbstractC89171a<List<? extends String>> {

        /* renamed from: a */
        final /* synthetic */ C56408a f128677a;

        static {
            Covode.recordClassIndex(66230);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56410b(C56408a aVar) {
            super(0);
            this.f128677a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ List<? extends String> invoke() {
            String[] strArr = new String[2];
            String a = C3966y.m9657a((int) R.string.cjx);
            if (a == null) {
                a = "";
            }
            strArr[0] = a;
            strArr[1] = this.f128677a.f128655b;
            return C89070n.m154522b(strArr);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.f.a$d */
    static final class C56412d extends AbstractC89220m implements AbstractC89171a<List<? extends String>> {

        /* renamed from: a */
        final /* synthetic */ C56408a f128679a;

        static {
            Covode.recordClassIndex(66232);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56412d(C56408a aVar) {
            super(0);
            this.f128679a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ List<? extends String> invoke() {
            String[] strArr = new String[2];
            String a = C3966y.m9657a((int) R.string.ckk);
            if (a == null) {
                a = "";
            }
            strArr[0] = a;
            strArr[1] = this.f128679a.f128654a;
            return C89070n.m154522b(strArr);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.f.a$o */
    static final class C56423o extends AbstractC89220m implements AbstractC89171a<List<? extends String>> {

        /* renamed from: a */
        public static final C56423o f128690a = new C56423o();

        static {
            Covode.recordClassIndex(66243);
        }

        C56423o() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ List<? extends String> invoke() {
            return C89070n.m154522b("New %s", "New %1$s and %2$s", "New %1$s, %2$s and %3$s", "New %1$s, %2$s, %3$s, and %4$s", "New %1$s, %2$s, %3$s, %4$s, and %5$s", "New %1$s, %2$s, %3$s, %4$s, %5$s and %6$s", "New %1$s, %2$s, %3$s, %4$s, %5$s, %6$s and %7$s");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.f.a$p */
    static final class C56424p extends AbstractC89220m implements AbstractC89171a<List<? extends String>> {

        /* renamed from: a */
        public static final C56424p f128691a = new C56424p();

        static {
            Covode.recordClassIndex(66244);
        }

        C56424p() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ List<? extends String> invoke() {
            return C89070n.m154522b("New %s ...", "New %1$s, %2$s ...", "New %1$s, %2$s, %3$s ...", "New %1$s, %2$s, %3$s, %4$s ...", "New %1$s, %2$s, %3$s, %4$s, %5$s ...", "New %1$s, %2$s, %3$s, %4$s, %5$s, %6$s ...");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.f.a$q */
    static final class C56425q extends AbstractC89220m implements AbstractC89171a<List<? extends String>> {

        /* renamed from: a */
        public static final C56425q f128692a = new C56425q();

        static {
            Covode.recordClassIndex(66245);
        }

        C56425q() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ List<? extends String> invoke() {
            return C89070n.m154522b("mentions", "comments", "followers", "Q&amp;A", "from TikTok", "likes");
        }
    }

    /* renamed from: g */
    private static Resources m102379g() {
        Resources resources;
        Activity topActivity = ActivityStack.getTopActivity();
        if (topActivity == null || (resources = topActivity.getResources()) == null) {
            return C17867d.m33078a().getResources();
        }
        return resources;
    }

    /* renamed from: l */
    private static int m102384l() {
        if (C56323c.m102316c()) {
            return R.drawable.nn;
        }
        if (C56323c.m102317d()) {
            return R.drawable.no;
        }
        return R.drawable.nm;
    }

    /* renamed from: k */
    private final C56588n m102383k() {
        int[] e = C89070n.m154578e((Collection<Integer>) C62221f.m112527c(C61530a.C61532b.m111445a()));
        int b = C61542b.m111466b(Arrays.copyOf(e, e.length));
        int[] e2 = C89070n.m154578e((Collection<Integer>) C62221f.m112528d(C61530a.C61532b.m111445a()));
        int b2 = C61542b.m111466b(Arrays.copyOf(e2, e2.length));
        if (b > 0) {
            return new C56588n(EnumC56589o.COUNT, b);
        }
        if (b2 > 0) {
            return m102382j();
        }
        return m102381i();
    }

    /* renamed from: d */
    public final C56588n mo93397d() {
        int a;
        if (C56323c.m102322i()) {
            a = C61542b.m111458a(534);
        } else {
            a = C61542b.m111458a(7) - C61542b.m111458a(233);
        }
        if (a > 0) {
            return new C56588n(EnumC56589o.COUNT, a);
        }
        return m102381i();
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.f.a$l */
    static final class C56420l extends AbstractC89220m implements AbstractC89171a<List<? extends String>> {

        /* renamed from: a */
        public static final C56420l f128687a = new C56420l();

        static {
            Covode.recordClassIndex(66240);
        }

        C56420l() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ List<? extends String> invoke() {
            String[] strArr = new String[7];
            String a = C3966y.m9657a((int) R.string.cjb);
            String str = "";
            if (a == null) {
                a = str;
            }
            strArr[0] = a;
            String a2 = C3966y.m9657a((int) R.string.cjc);
            if (a2 == null) {
                a2 = str;
            }
            strArr[1] = a2;
            String a3 = C3966y.m9657a((int) R.string.cje);
            if (a3 == null) {
                a3 = str;
            }
            strArr[2] = a3;
            String a4 = C3966y.m9657a((int) R.string.cjg);
            if (a4 == null) {
                a4 = str;
            }
            strArr[3] = a4;
            String a5 = C3966y.m9657a((int) R.string.cji);
            if (a5 == null) {
                a5 = str;
            }
            strArr[4] = a5;
            String a6 = C3966y.m9657a((int) R.string.cjk);
            if (a6 == null) {
                a6 = str;
            }
            strArr[5] = a6;
            String a7 = C3966y.m9657a((int) R.string.cjm);
            if (a7 != null) {
                str = a7;
            }
            strArr[6] = str;
            return C89070n.m154522b(strArr);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.f.a$m */
    static final class C56421m extends AbstractC89220m implements AbstractC89171a<List<? extends String>> {

        /* renamed from: a */
        public static final C56421m f128688a = new C56421m();

        static {
            Covode.recordClassIndex(66241);
        }

        C56421m() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ List<? extends String> invoke() {
            String[] strArr = new String[6];
            String a = C3966y.m9657a((int) R.string.cjd);
            String str = "";
            if (a == null) {
                a = str;
            }
            strArr[0] = a;
            String a2 = C3966y.m9657a((int) R.string.cjf);
            if (a2 == null) {
                a2 = str;
            }
            strArr[1] = a2;
            String a3 = C3966y.m9657a((int) R.string.cjh);
            if (a3 == null) {
                a3 = str;
            }
            strArr[2] = a3;
            String a4 = C3966y.m9657a((int) R.string.cjj);
            if (a4 == null) {
                a4 = str;
            }
            strArr[3] = a4;
            String a5 = C3966y.m9657a((int) R.string.cjl);
            if (a5 == null) {
                a5 = str;
            }
            strArr[4] = a5;
            String a6 = C3966y.m9657a((int) R.string.cjn);
            if (a6 != null) {
                str = a6;
            }
            strArr[5] = str;
            return C89070n.m154522b(strArr);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.f.a$t */
    static final class C56428t extends AbstractC89220m implements AbstractC89171a<List<? extends C56417i>> {

        /* renamed from: a */
        public static final C56428t f128695a = new C56428t();

        static {
            Covode.recordClassIndex(66248);
        }

        C56428t() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ List<? extends C56417i> invoke() {
            C56417i[] iVarArr = new C56417i[6];
            String a = C3966y.m9657a((int) R.string.cjz);
            String str = "";
            if (a == null) {
                a = str;
            }
            iVarArr[0] = new C56417i(26, a);
            String a2 = C3966y.m9657a((int) R.string.cjq);
            if (a2 == null) {
                a2 = str;
            }
            iVarArr[1] = new C56417i(44, a2);
            String a3 = C3966y.m9657a((int) R.string.cjs);
            if (a3 == null) {
                a3 = str;
            }
            iVarArr[2] = new C56417i(7, a3);
            String a4 = C3966y.m9657a((int) R.string.ck4);
            if (a4 == null) {
                a4 = str;
            }
            iVarArr[3] = new C56417i(84, a4);
            String a5 = C3966y.m9657a((int) R.string.ck1);
            if (a5 == null) {
                a5 = str;
            }
            iVarArr[4] = new C56417i(37, a5);
            String a6 = C3966y.m9657a((int) R.string.cjv);
            if (a6 != null) {
                str = a6;
            }
            iVarArr[5] = new C56417i(3, str);
            return C89070n.m154522b(iVarArr);
        }
    }

    /* renamed from: b */
    public final C56562b mo93395b() {
        List<String> list;
        boolean z;
        List<String> h = m102380h();
        String str = (String) this.f128670r.getValue();
        String b = C80187aa.C80188a.m139008b(System.currentTimeMillis());
        C56562b a = C56463i.m102435a(EnumC56565e.ACTIVITY);
        if (!C56323c.m102320g() || a == null || (list = a.f128964b) == null) {
            list = h;
        }
        C56532a aVar = null;
        if (C56323c.m102319f()) {
            if (a != null && C80537hk.m139613a(a.f128966d)) {
                aVar = a.f128965c;
                str = a.f128966d;
            }
            b = "";
        }
        C56588n k = m102383k();
        if (k.f129020a != EnumC56589o.NONE || !C56323c.m102319f()) {
            z = false;
        } else {
            z = true;
        }
        return new C56562b(EnumC56565e.ACTIVITY, list, aVar, str, k, b, m102384l(), z, 0, 256);
    }

    /* renamed from: c */
    public final C56562b mo93396c() {
        boolean z;
        C56532a aVar = null;
        if (!C56323c.m102321h()) {
            return null;
        }
        List<String> a = mo93394a();
        String str = (String) this.f128668p.getValue();
        C56562b a2 = C56463i.m102435a(EnumC56565e.FOLLOWER);
        if (a2 != null && C80537hk.m139613a(a2.f128966d)) {
            aVar = a2.f128965c;
            str = a2.f128966d;
        }
        C56588n d = mo93397d();
        if (d.f129020a != EnumC56589o.COUNT) {
            z = true;
        } else {
            z = false;
        }
        return new C56562b(EnumC56565e.FOLLOWER, a, aVar, str, d, "", R.drawable.nu, z, 0, 256);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:170:0x01d6, code lost:
        if (r1 != null) goto L_0x01d8;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.p2082ss.android.ugc.aweme.inbox.widget.multi.C56532a m102376b(com.p2082ss.android.ugc.aweme.notice.repo.list.bean.MusNotice r6) {
        /*
        // Method dump skipped, instructions count: 512
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.inbox.p3271f.C56408a.m102376b(com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice):com.ss.android.ugc.aweme.inbox.widget.multi.a");
    }

    /* renamed from: a */
    public static String m102375a(MusNotice musNotice) {
        String str;
        Throwable th;
        C61630e eVar;
        C61621c cVar;
        C61621c cVar2;
        C61624f fVar;
        String str2;
        C61621c cVar3;
        User user;
        String str3;
        List<? extends User> list;
        String string;
        Aweme aweme;
        User author;
        User user2;
        String str4;
        Aweme aweme2;
        User user3;
        String str5;
        String str6;
        String title;
        String title2;
        int i;
        try {
            if (musNotice.followNotice != null) {
                FollowNotice followNotice = musNotice.followNotice;
                C89219l.m154716b(followNotice, "");
                String a = C33515a.m68677a(C89070n.m154516a(followNotice.getUser()), 1);
                String string2 = m102379g().getString(R.string.diu);
                C89219l.m154716b(string2, "");
                str = a + ' ' + string2;
            } else if (musNotice.diggNotice != null) {
                DiggNotice diggNotice = musNotice.diggNotice;
                C89219l.m154716b(diggNotice, "");
                String a2 = C33515a.m68677a(diggNotice.getUsers(), diggNotice.getMergeCount());
                Resources g = m102379g();
                DiggNotice diggNotice2 = musNotice.diggNotice;
                C89219l.m154716b(diggNotice2, "");
                int diggType = diggNotice2.getDiggType();
                if (diggType == View$OnClickListenerC62150u.AbstractC62152a.C62153a.f141115b) {
                    i = R.string.cl;
                } else {
                    if (!(diggType == View$OnClickListenerC62150u.AbstractC62152a.C62153a.f141114a || diggType == View$OnClickListenerC62150u.AbstractC62152a.C62153a.f141117d)) {
                        if (diggType != View$OnClickListenerC62150u.AbstractC62152a.C62153a.f141119f) {
                            if (diggType == View$OnClickListenerC62150u.AbstractC62152a.C62153a.f141118e) {
                                i = R.string.di3;
                            } else {
                                i = R.string.dj7;
                            }
                        }
                    }
                    i = R.string.dj6;
                }
                String string3 = g.getString(i);
                C89219l.m154716b(string3, "");
                str = a2 + ' ' + string3;
            } else {
                if (musNotice.commentNotice != null) {
                    CommentNotice commentNotice = musNotice.commentNotice;
                    C89219l.m154716b(commentNotice, "");
                    if (commentNotice.getComment() != null) {
                        CommentNotice commentNotice2 = musNotice.commentNotice;
                        C89219l.m154716b(commentNotice2, "");
                        Comment comment = commentNotice2.getComment();
                        C89219l.m154716b(comment, "");
                        str = C33515a.m68677a(C89070n.m154516a(comment.getUser()), 1) + ' ' + C33515a.m68673a(commentNotice2).getFirst();
                    }
                }
                if (musNotice.atMe != null) {
                    AtMe atMe = musNotice.atMe;
                    C89219l.m154716b(atMe, "");
                    String a3 = C33515a.m68677a(C89070n.m154516a(atMe.getUser()), 1);
                    AtMe atMe2 = musNotice.atMe;
                    C89219l.m154716b(atMe2, "");
                    str = a3 + ' ' + C33515a.m68674a(atMe2);
                } else {
                    String str7 = null;
                    if (musNotice.announcement != null) {
                        AnnouncementNotice announcementNotice = musNotice.announcement;
                        if (!(announcementNotice == null || (title2 = announcementNotice.getTitle()) == null)) {
                            if (C80537hk.m139613a(title2)) {
                                str7 = title2;
                            }
                            if (str7 != null) {
                                str = m102379g().getString(R.string.diw) + ": " + str7;
                            }
                        }
                    } else if (musNotice.textNotice != null) {
                        UserTextNotice userTextNotice = musNotice.textNotice;
                        if (!(userTextNotice == null || (title = userTextNotice.getTitle()) == null)) {
                            if (C80537hk.m139613a(title)) {
                                str7 = title;
                            }
                            if (str7 != null) {
                                str = m102379g().getString(R.string.dj4) + ": " + str7;
                            }
                        }
                    } else if (musNotice.tcmNotice != null) {
                        C61638l lVar = musNotice.tcmNotice;
                        if (!(lVar == null || (str6 = lVar.f139920a) == null)) {
                            if (C80537hk.m139613a(str6)) {
                                str7 = str6;
                            }
                            if (str7 != null) {
                                str = m102379g().getString(R.string.cf4) + ": " + str7;
                            }
                        }
                    } else if (musNotice.promoteNotice != null) {
                        C61636j jVar = musNotice.promoteNotice;
                        if (!(jVar == null || (str5 = jVar.f139913a) == null)) {
                            if (C80537hk.m139613a(str5)) {
                                str7 = str5;
                            }
                            if (str7 != null) {
                                str = m102379g().getString(R.string.ex7) + ": " + str7;
                            }
                        }
                    } else if (musNotice.followApproveNotice != null) {
                        FollowApproveNotice followApproveNotice = musNotice.followApproveNotice;
                        if (!(followApproveNotice == null || (user3 = followApproveNotice.getUser()) == null)) {
                            String a4 = C33515a.m68677a(C89070n.m154516a(user3), 1);
                            String string4 = m102379g().getString(R.string.die);
                            C89219l.m154716b(string4, "");
                            str = a4 + ' ' + string4;
                        }
                    } else if (musNotice.checkProfileNotice != null) {
                        CheckProfileNotice checkProfileNotice = musNotice.checkProfileNotice;
                        if (checkProfileNotice != null) {
                            String a5 = C33515a.m68677a(checkProfileNotice.getUsers(), checkProfileNotice.getCountOfUser());
                            String string5 = m102379g().getString(R.string.dif);
                            C89219l.m154716b(string5, "");
                            str = a5 + ' ' + string5;
                        }
                    } else if (musNotice.duetNotice != null) {
                        DuetNotice duetNotice = musNotice.duetNotice;
                        if (!(duetNotice == null || (aweme2 = duetNotice.getAweme()) == null)) {
                            String a6 = C33515a.m68677a(C89070n.m154516a(aweme2.getAuthor()), 1);
                            String string6 = m102379g().getString(R.string.dik);
                            C89219l.m154716b(string6, "");
                            str = a6 + ' ' + string6;
                        }
                    } else if (musNotice.adHelperNotice != null) {
                        C61627b bVar = musNotice.adHelperNotice;
                        if (!(bVar == null || (str4 = bVar.f139874b) == null)) {
                            if (C80537hk.m139613a(str4)) {
                                str7 = str4;
                            }
                            if (str7 != null) {
                                str = m102379g().getString(R.string.cbo) + ": " + str7;
                            }
                        }
                    } else if (musNotice.friendNotice != null) {
                        FriendNotice friendNotice = musNotice.friendNotice;
                        if (!(friendNotice == null || (user2 = friendNotice.getUser()) == null)) {
                            str = user2 + ' ' + m102379g().getString(R.string.d8n);
                        }
                    } else if (musNotice.postNotice != null) {
                        PostNotice postNotice = musNotice.postNotice;
                        if (!(postNotice == null || (aweme = postNotice.getAweme()) == null || (author = aweme.getAuthor()) == null)) {
                            str = C33515a.m68677a(C89070n.m154516a(author), 1) + ' ' + m102379g().getString(R.string.djm);
                        }
                    } else if (musNotice.voteNotice != null) {
                        C61639m mVar = musNotice.voteNotice;
                        if (!(mVar == null || (list = mVar.f139927a) == null)) {
                            String a7 = C33515a.m68677a(list, musNotice.voteNotice.f139930d);
                            if (list.size() == 1) {
                                string = m102379g().getString(R.string.ha5, musNotice.voteNotice.f139929c);
                            } else {
                                string = m102379g().getString(R.string.ha3);
                            }
                            C89219l.m154716b(string, "");
                            str = a7 + ' ' + string;
                        }
                    } else if (musNotice.businessAccountNotice != null) {
                        C61628c cVar4 = musNotice.businessAccountNotice;
                        if (!(cVar4 == null || (str3 = cVar4.f139881b) == null)) {
                            str = m102379g().getString(R.string.a7a) + ": " + str3;
                        }
                    } else if (musNotice.donationNotice != null) {
                        C61629d dVar = musNotice.donationNotice;
                        if (!(dVar == null || (user = dVar.f139884b) == null)) {
                            String a8 = C33515a.m68677a(C89070n.m154516a(user), 1);
                            String string7 = m102379g().getString(R.string.ba_);
                            C89219l.m154716b(string7, "");
                            str = a8 + ' ' + string7;
                        }
                    } else if (!(musNotice.templateNotice == null || (eVar = musNotice.templateNotice) == null || (cVar = eVar.f139886b) == null)) {
                        String str8 = cVar.f139845f;
                        if (str8 == null) {
                            str8 = cVar.f139846g;
                        }
                        if (str8 != null) {
                            C61630e eVar2 = musNotice.templateNotice;
                            if (eVar2 == null || (cVar3 = eVar2.f139886b) == null || cVar3.f139842c != 5) {
                                C61630e eVar3 = musNotice.templateNotice;
                                if (!(eVar3 == null || (cVar2 = eVar3.f139886b) == null || (fVar = cVar2.f139843d) == null)) {
                                    if (cVar2.f139842c == 0) {
                                        str2 = fVar.f139869d;
                                    } else {
                                        List<User> list2 = fVar.f139866a;
                                        if (list2 == null || (str2 = C33515a.m68677a(list2, 1)) == null) {
                                            str2 = fVar.f139869d;
                                        }
                                    }
                                    if (str2 != null) {
                                        str = str2 + ' ' + str8;
                                    }
                                }
                            } else {
                                C17191a.C17192a aVar = new C17191a.C17192a();
                                NoticeTemplateMiddleView.C62312a.m112728a(aVar, cVar3, null);
                                str = aVar.f40973a.toString();
                                C89219l.m154716b(str, "");
                            }
                        }
                    }
                    str = "";
                }
            }
            try {
                C89379q.m157068constructorimpl(C89391z.f203057a);
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            str = "";
            C89379q.m157068constructorimpl(C89382r.m154941a(th));
            String aVar2 = new C17191a.C17192a().mo27179b(str).f40973a.toString();
            C89219l.m154716b(aVar2, "");
            return aVar2;
        }
        String aVar22 = new C17191a.C17192a().mo27179b(str).f40973a.toString();
        C89219l.m154716b(aVar22, "");
        return aVar22;
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.f.a$i */
    static final class C56417i {

        /* renamed from: a */
        public final int f128683a;

        /* renamed from: b */
        public final String f128684b;

        static {
            Covode.recordClassIndex(66237);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C56417i)) {
                return false;
            }
            C56417i iVar = (C56417i) obj;
            return this.f128683a == iVar.f128683a && C89219l.m154714a(this.f128684b, iVar.f128684b);
        }

        public final int hashCode() {
            int i = this.f128683a * 31;
            String str = this.f128684b;
            return i + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            return "GroupFilter(noticeGroup=" + this.f128683a + ", title=" + this.f128684b + ")";
        }

        public C56417i(int i, String str) {
            C89219l.m154721d(str, "");
            this.f128683a = i;
            this.f128684b = str;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.f.a$n */
    static final class C56422n<T> implements Comparator {

        /* renamed from: a */
        public static final C56422n f128689a = new C56422n();

        static {
            Covode.recordClassIndex(66242);
        }

        C56422n() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:7:0x0022 A[RETURN] */
        @Override // java.util.Comparator
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* bridge */ /* synthetic */ int compare(java.lang.Object r8, java.lang.Object r9) {
            /*
                r7 = this;
                com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice r8 = (com.p2082ss.android.ugc.aweme.notice.repo.list.bean.MusNotice) r8
                com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice r9 = (com.p2082ss.android.ugc.aweme.notice.repo.list.bean.MusNotice) r9
                int r2 = r9.priority
                int r0 = r8.priority
                int r2 = r2 - r0
                int r1 = r8.priority
                int r0 = r9.priority
                r6 = -1
                r5 = 1
                if (r1 != r0) goto L_0x001d
                long r3 = r9.createTime
                long r0 = r8.createTime
                long r3 = r3 - r0
                r1 = 0
                int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                if (r0 <= 0) goto L_0x0022
            L_0x001c:
                return r5
            L_0x001d:
                if (r2 <= 0) goto L_0x0020
                goto L_0x001c
            L_0x0020:
                if (r2 >= 0) goto L_0x0023
            L_0x0022:
                return r6
            L_0x0023:
                r0 = 0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.inbox.p3271f.C56408a.C56422n.compare(java.lang.Object, java.lang.Object):int");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:114:0x0355 A[LOOP:6: B:113:0x0353->B:114:0x0355, LOOP_END] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.p2082ss.android.ugc.aweme.inbox.widget.multi.C56562b mo93393a(com.p2082ss.android.ugc.aweme.notice.repo.list.bean.NoticeCombineResponse r29, com.p2082ss.android.ugc.aweme.notice.repo.list.bean.NoticeListsResponse r30) {
        /*
        // Method dump skipped, instructions count: 927
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.inbox.p3271f.C56408a.mo93393a(com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeCombineResponse, com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeListsResponse):com.ss.android.ugc.aweme.inbox.widget.multi.b");
    }
}
