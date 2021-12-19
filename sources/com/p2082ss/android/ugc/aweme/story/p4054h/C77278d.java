package com.p2082ss.android.ugc.aweme.story.p4054h;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.story.UserStory;
import com.p2082ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.profile.p3568b.C63494a;
import com.p2082ss.android.ugc.aweme.story.C77260g;
import com.p2082ss.android.ugc.aweme.story.api.AbstractC76444b;
import com.p2082ss.android.ugc.aweme.story.api.StoryApi;
import com.p2082ss.android.ugc.aweme.story.avatar.C76494a;
import com.p2082ss.android.ugc.aweme.story.model.C77387j;
import com.p2082ss.android.ugc.aweme.story.p4024c.C76660b;
import com.p2082ss.android.ugc.aweme.story.p4055i.C77283a;
import com.p2082ss.android.ugc.aweme.story.userstory.mine.MineUserStoryFetcher;
import com.p2082ss.android.ugc.aweme.utils.C80298cg;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.h.d */
public final class C77278d implements AbstractC76444b, AbstractC90252i, AbstractC90253j {

    /* renamed from: a */
    public static final C77278d f173366a;

    /* renamed from: b */
    private static final AbstractC89244h f173367b = C89250i.m154773a((AbstractC89171a) C77279a.f173368a);

    /* renamed from: b */
    public static C77272b m135096b() {
        return (C77272b) f173367b.getValue();
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(360, new RunnableC90250g(C77278d.class, "onBlockEvent", C63494a.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    private C77278d() {
    }

    /* renamed from: com.ss.android.ugc.aweme.story.h.d$a */
    static final class C77279a extends AbstractC89220m implements AbstractC89171a<C77272b> {

        /* renamed from: a */
        public static final C77279a f173368a = new C77279a();

        static {
            Covode.recordClassIndex(90296);
        }

        C77279a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C77272b invoke() {
            return new C77272b();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.story.api.AbstractC76444b
    /* renamed from: a */
    public final Aweme mo120170a() {
        m135096b();
        return MineUserStoryFetcher.m135716a();
    }

    static {
        Covode.recordClassIndex(90295);
        C77278d dVar = new C77278d();
        f173366a = dVar;
        C80298cg.m139204a(dVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.story.api.AbstractC76444b
    /* renamed from: a */
    public final Aweme mo120171a(String str) {
        C89219l.m154721d(str, "");
        return m135096b().mo120874a(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.story.h.d$c */
    public static final class C77281c<T, R> implements AbstractC88434g {

        /* renamed from: a */
        final /* synthetic */ String f173370a;

        static {
            Covode.recordClassIndex(90298);
        }

        C77281c(String str) {
            this.f173370a = str;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            Object obj2;
            List list = (List) obj;
            C89219l.m154721d(list, "");
            if (list.size() == 1 && (obj2 = list.get(0)) != null) {
                return obj2;
            }
            Aweme aweme = new Aweme();
            aweme.setAid(this.f173370a);
            return aweme;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.story.h.d$d */
    public static final class C77282d<T, R> implements AbstractC88434g {

        /* renamed from: a */
        final /* synthetic */ String f173371a;

        static {
            Covode.recordClassIndex(90299);
        }

        C77282d(String str) {
            this.f173371a = str;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            C89219l.m154721d(list, "");
            if (!list.isEmpty()) {
                return list.get(0);
            }
            Aweme aweme = new Aweme();
            aweme.setAid(this.f173371a);
            return aweme;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.story.api.AbstractC76444b
    /* renamed from: a */
    public final AbstractC88979t<List<Aweme>> mo120173a(List<String> list) {
        C89219l.m154721d(list, "");
        return m135097b(list);
    }

    @AbstractC90264r
    public final void onBlockEvent(C63494a aVar) {
        String uid;
        C89219l.m154721d(aVar, "");
        User user = aVar.f144112a;
        if (user != null && (uid = user.getUid()) != null) {
            m135096b().mo120876b(uid);
            C76494a.m134077a(uid, (Aweme) null);
        }
    }

    /* renamed from: b */
    private static AbstractC88979t<List<Aweme>> m135097b(List<String> list) {
        String obj = list.toString();
        C77283a.m135107a("UserStoryRepo", "querying server for ".concat(String.valueOf(obj)));
        AbstractC88979t<R> d = StoryApi.f171712a.getUserStories(obj).mo143292d(new C77280b(list));
        C89219l.m154716b(d, "");
        return d;
    }

    /* renamed from: c */
    private static AbstractC88979t<Aweme> m135099c(String str) {
        Aweme a = m135096b().mo120874a(str);
        if (a == null) {
            AbstractC88979t<R> d = m135097b(C89070n.m154516a(str)).mo143292d(new C77281c(str));
            C89219l.m154716b(d, "");
            return d;
        }
        AbstractC88979t<Aweme> b = AbstractC88979t.m154310b(a);
        C89219l.m154716b(b, "");
        return b;
    }

    /* renamed from: b */
    public static void m135098b(String str) {
        C89219l.m154721d(str, "");
        Aweme a = m135096b().mo120874a(str);
        if (a != null) {
            UserStory userStory = a.getUserStory();
            if (userStory != null) {
                userStory.setAllViewed(true);
            }
            C77283a.m135111b("UserStoryRepo", str + " 's stories reported all viewed");
            if (!C76660b.m134246f()) {
                C76494a.m134077a(str, a);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.story.h.d$b */
    public static final class C77280b<T, R> implements AbstractC88434g {

        /* renamed from: a */
        final /* synthetic */ List f173369a;

        static {
            Covode.recordClassIndex(90297);
        }

        C77280b(List list) {
            this.f173369a = list;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            String str;
            String uid;
            String str2;
            C77387j jVar = (C77387j) obj;
            String str3 = "";
            C89219l.m154721d(jVar, str3);
            List<Aweme> awemes = jVar.getAwemes();
            if (awemes == null) {
                awemes = C89086z.INSTANCE;
            }
            List list = this.f173369a;
            ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) awemes, 10));
            Iterator<T> it = awemes.iterator();
            while (it.hasNext()) {
                User author = it.next().getAuthor();
                if (author == null || (str2 = author.getUid()) == null) {
                    str2 = str3;
                }
                arrayList.add(str2);
            }
            ArrayList arrayList2 = arrayList;
            ArrayList arrayList3 = new ArrayList();
            for (T t : list) {
                if (!arrayList2.contains(t)) {
                    arrayList3.add(t);
                }
            }
            ArrayList arrayList4 = arrayList3;
            User b = C80580in.m139683b();
            if (!(b == null || (uid = b.getUid()) == null)) {
                str3 = uid;
            }
            List g = C89070n.m154585g((Collection) awemes);
            for (T t2 : arrayList4) {
                if (!C89219l.m154714a((Object) t2, (Object) str3) || C77260g.f173332a.mo120158f().mo120165a().isEmpty()) {
                    C77278d.m135096b().mo120876b(t2);
                } else {
                    C77278d.m135096b();
                    g.add(0, MineUserStoryFetcher.m135716a());
                }
            }
            BaseResponse.ServerTimeExtra serverTimeExtra = jVar.extra;
            if (serverTimeExtra != null) {
                str = serverTimeExtra.logid;
            } else {
                str = null;
            }
            C77278d.m135095a(g, str);
            return g;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.story.api.AbstractC76444b
    /* renamed from: a */
    public final void mo120175a(FollowStatus followStatus) {
        User author;
        C89219l.m154721d(followStatus, "");
        String str = followStatus.userId;
        C89219l.m154716b(str, "");
        Aweme a = mo120171a(str);
        if (a != null && (author = a.getAuthor()) != null) {
            author.setFollowStatus(followStatus.followStatus);
            author.setFollowerStatus(followStatus.followerStatus);
        }
    }

    /* renamed from: a */
    public static void m135095a(List<? extends Aweme> list, String str) {
        C89219l.m154721d(list, "");
        C77272b b = m135096b();
        C89219l.m154721d(list, "");
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            b.mo120875a(it.next(), true, str);
        }
        C77283a.m135107a(C77272b.f173357b, "tried update " + list.size() + " in cache");
    }

    @Override // com.p2082ss.android.ugc.aweme.story.api.AbstractC76444b
    /* renamed from: a */
    public final AbstractC88979t<Aweme> mo120172a(String str, boolean z) {
        C89219l.m154721d(str, "");
        if (z) {
            return m135099c(str);
        }
        AbstractC88979t<R> d = m135097b(C89070n.m154516a(str)).mo143292d(new C77282d(str));
        C89219l.m154716b(d, "");
        return d;
    }

    @Override // com.p2082ss.android.ugc.aweme.story.api.AbstractC76444b
    /* renamed from: a */
    public final void mo120174a(Aweme aweme, boolean z, String str) {
        C89219l.m154721d(aweme, "");
        m135096b().mo120875a(aweme, z, str);
    }
}
