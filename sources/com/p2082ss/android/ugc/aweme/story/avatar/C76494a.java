package com.p2082ss.android.ugc.aweme.story.avatar;

import android.os.Looper;
import androidx.appcompat.app.ActivityC0218d;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.core.C12752d;
import com.bytedance.assem.arch.core.C12753e;
import com.bytedance.assem.arch.extensions.C12777b;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.assem.arch.viewModel.C12815c;
import com.bytedance.assem.jedi_vm.viewModel.C12874b;
import com.bytedance.assem.p793a.C12642a;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRoute;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.AccountService;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.base.utils.C34727m;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.story.Story;
import com.p2082ss.android.ugc.aweme.feed.model.story.UserStory;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.story.avatar.StoryAvatarEntrySharedVM;
import com.p2082ss.android.ugc.aweme.story.avatar.entry.C76528c;
import com.p2082ss.android.ugc.aweme.story.p4024c.C76660b;
import com.p2082ss.android.ugc.aweme.story.p4043f.C77158a;
import com.p2082ss.android.ugc.aweme.story.p4055i.C77283a;
import com.p2082ss.android.ugc.aweme.story.publish.C77429f;
import com.p2082ss.android.ugc.aweme.utils.C80422fe;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.trill.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89205ac;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89277c;

/* renamed from: com.ss.android.ugc.aweme.story.avatar.a */
public final class C76494a implements AbstractC76504c {

    /* renamed from: a */
    public static final Map<String, Set<AbstractC76546f>> f171779a = new LinkedHashMap();

    /* renamed from: b */
    public static final Map<AbstractC76546f, String> f171780b = new LinkedHashMap();

    /* renamed from: c */
    public static final Map<AbstractC1204m, Set<AbstractC76546f>> f171781c = new LinkedHashMap();

    /* renamed from: d */
    public static final C76494a f171782d = new C76494a();

    /* renamed from: com.ss.android.ugc.aweme.story.avatar.a$a */
    public static final class C76495a extends AbstractC89220m implements AbstractC89172b<C76503b, C76503b> {
        public static final C76495a INSTANCE = new C76495a();

        static {
            Covode.recordClassIndex(89478);
        }

        public C76495a() {
            super(1);
        }

        public final C76503b invoke(C76503b bVar) {
            C89219l.m154719c(bVar, "");
            return bVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.avatar.a$g */
    static final class C76501g extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        public static final C76501g f171786a = new C76501g();

        static {
            Covode.recordClassIndex(89484);
        }

        C76501g() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* bridge */ /* synthetic */ String invoke() {
            return "story_avatar_entry";
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.avatar.a$e */
    public static final class C76499e extends AbstractC89220m implements AbstractC89171a<AbstractC1204m> {

        /* renamed from: a */
        final /* synthetic */ AbstractC1204m f171785a;

        static {
            Covode.recordClassIndex(89482);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C76499e(AbstractC1204m mVar) {
            super(0);
            this.f171785a = mVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final AbstractC1204m invoke() {
            return this.f171785a;
        }
    }

    private C76494a() {
    }

    @Override // com.p2082ss.android.ugc.aweme.story.avatar.AbstractC76504c
    /* renamed from: a */
    public final boolean mo120234a(AbstractC76546f fVar, String str) {
        Set<AbstractC76546f> set;
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(str, "");
        if (m134082c()) {
            Map<AbstractC76546f, String> map = f171780b;
            if (C89219l.m154714a((Object) map.get(fVar), (Object) str) && (set = f171779a.get(str)) != null && set.contains(fVar)) {
                return true;
            }
            mo120230a(fVar);
            C89219l.m154721d(fVar, "");
            if (m134082c()) {
                AbstractC1204m A = fVar.mo89643A();
                if (A == null) {
                    return false;
                }
                Map<AbstractC1204m, Set<AbstractC76546f>> map2 = f171781c;
                Set<AbstractC76546f> set2 = map2.get(A);
                if (set2 == null) {
                    set2 = new LinkedHashSet<>();
                    map2.put(A, set2);
                    A.getLifecycle().mo4012a(new AvatarEntryManager$register$1(A));
                }
                set2.add(fVar);
                map.put(fVar, str);
                Map<String, Set<AbstractC76546f>> map3 = f171779a;
                Set<AbstractC76546f> set3 = map3.get(str);
                if (set3 == null) {
                    set3 = new LinkedHashSet<>();
                    map3.put(str, set3);
                }
                set3.add(fVar);
                return true;
            }
            throw new IllegalAccessException("should register in main thread");
        }
        throw new IllegalAccessException("should bind in main thread");
    }

    /* renamed from: com.ss.android.ugc.aweme.story.avatar.a$d */
    public static final class C76498d extends AbstractC89220m implements AbstractC89171a<C12874b<C76503b>> {
        public static final C76498d INSTANCE = new C76498d();

        static {
            Covode.recordClassIndex(89481);
        }

        public C76498d() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C76503b> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.avatar.a$f */
    public static final class C76500f extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C76500f INSTANCE = new C76500f();

        static {
            Covode.recordClassIndex(89483);
        }

        public C76500f() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.avatar.a$b */
    public static final class C76496b extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ ActivityC0945e f171783a;

        static {
            Covode.recordClassIndex(89479);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C76496b(ActivityC0945e eVar) {
            super(0);
            this.f171783a = eVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f171783a);
            if (b != null) {
                return Assembler.C12747a.m22936a(b).mo20583b(b);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.avatar.a$c */
    public static final class C76497c extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ ActivityC0945e f171784a;

        static {
            Covode.recordClassIndex(89480);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C76497c(ActivityC0945e eVar) {
            super(0);
            this.f171784a = eVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f171784a);
            if (b != null) {
                return Assembler.C12747a.m22936a(b).mo20584c(b);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: c */
    private static boolean m134082c() {
        Thread currentThread = Thread.currentThread();
        Looper mainLooper = Looper.getMainLooper();
        C89219l.m154716b(mainLooper, "");
        return C89219l.m154714a(currentThread, mainLooper.getThread());
    }

    static {
        Covode.recordClassIndex(89477);
    }

    /* renamed from: b */
    private static boolean m134081b() {
        IAccountUserService e = AccountService.m65215a().mo57069e();
        C89219l.m154716b(e, "");
        return e.isChildrenMode();
    }

    /* renamed from: com.ss.android.ugc.aweme.story.avatar.a$h */
    static final class RunnableC76502h implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f171787a;

        /* renamed from: b */
        final /* synthetic */ Aweme f171788b;

        static {
            Covode.recordClassIndex(89485);
        }

        RunnableC76502h(String str, Aweme aweme) {
            this.f171787a = str;
            this.f171788b = aweme;
        }

        public final void run() {
            C77283a.m135111b("AvatarEntryManager", "dispatching update: uid: " + this.f171787a + ", aweme instance: " + System.identityHashCode(this.f171788b));
            Set<AbstractC76546f> set = C76494a.f171779a.get(this.f171787a);
            if (set != null) {
                Iterator<T> it = set.iterator();
                while (it.hasNext()) {
                    it.next().mo89644a(this.f171787a, this.f171788b);
                }
            }
            Set<AbstractC76546f> set2 = C76494a.f171779a.get("*");
            if (set2 != null) {
                Iterator<T> it2 = set2.iterator();
                while (it2.hasNext()) {
                    it2.next().mo89644a(this.f171787a, this.f171788b);
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.story.avatar.AbstractC76504c
    /* renamed from: a */
    public final boolean mo120232a() {
        if (!C76660b.m134243c() || C76660b.m134246f() || C76660b.m134247g() || m134081b()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static boolean m134079a(String str) {
        IAccountUserService e = AccountService.m65215a().mo57069e();
        C89219l.m154716b(e, "");
        return C89219l.m154714a((Object) str, (Object) e.getCurUserId());
    }

    /* renamed from: b */
    public static int m134080b(User user) {
        C89219l.m154721d(user, "");
        if (user.getFollowStatus() == 2) {
            return 2;
        }
        if (user.getFollowStatus() == 1) {
            return 1;
        }
        if (user.getFollowerStatus() == 1) {
            return 3;
        }
        return 0;
    }

    @Override // com.p2082ss.android.ugc.aweme.story.avatar.AbstractC76504c
    /* renamed from: a */
    public final AbstractC76506d mo120228a(AbstractC76508e eVar) {
        C89219l.m154721d(eVar, "");
        if (eVar.mo80539c() == EnumC76586o.WESTWINDOW || mo120232a()) {
            return new C76528c(eVar);
        }
        return null;
    }

    /* renamed from: a */
    public static boolean m134078a(Aweme aweme) {
        boolean z;
        T t;
        boolean z2;
        C89219l.m154721d(aweme, "");
        UserStory userStory = aweme.getUserStory();
        if (userStory != null) {
            z = userStory.getAllViewed();
        } else {
            z = false;
        }
        if (!m134079a(aweme.getAuthorUid())) {
            return z;
        }
        Iterator<T> it = C77429f.f173727b.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            Story story = t.getStory();
            if (story != null && !story.getViewed()) {
                break;
            }
        }
        T t2 = t;
        if (t2 == null) {
            z2 = true;
        } else {
            z2 = false;
            t2.getAid();
            Story story2 = t2.getStory();
            if (story2 != null) {
                Boolean.valueOf(story2.isPublishing());
            }
        }
        if (!z || !z2) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.story.avatar.AbstractC76504c
    /* renamed from: a */
    public final void mo120230a(AbstractC76546f fVar) {
        C89219l.m154721d(fVar, "");
        if (m134082c()) {
            Map<AbstractC76546f, String> map = f171780b;
            String str = map.get(fVar);
            if (str != null) {
                Map<String, Set<AbstractC76546f>> map2 = f171779a;
                Set<AbstractC76546f> set = map2.get(str);
                if (set != null) {
                    Integer.valueOf(set.size());
                }
                Set<AbstractC76546f> set2 = map2.get(str);
                if (set2 != null) {
                    Boolean.valueOf(set2.contains(fVar));
                }
                Set<AbstractC76546f> set3 = map2.get(str);
                if (set3 != null) {
                    set3.remove(fVar);
                    if (set3.isEmpty()) {
                        map2.remove(str);
                    }
                }
                map.remove(fVar);
                return;
            }
            return;
        }
        throw new IllegalAccessException("should unregister in main thread");
    }

    @Override // com.p2082ss.android.ugc.aweme.story.avatar.AbstractC76504c
    /* renamed from: a */
    public final boolean mo120233a(User user) {
        if (user == null || user.getUid() == null || m134081b()) {
            return false;
        }
        boolean a = m134079a(user.getUid());
        if ((user.getStoryStatus() > 0 || (a && !C77429f.f173727b.isEmpty())) && C76660b.m134243c() && C77158a.f173088b && !user.isAdFake() && !user.isBlock && !user.isBlocked()) {
            if (!C80580in.m139685b(user, a) || user.getFollowStatus() == 1 || user.getFollowStatus() == 2) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: a */
    public static void m134077a(String str, Aweme aweme) {
        C89219l.m154721d(str, "");
        C34727m.m70944a(new RunnableC76502h(str, aweme));
    }

    @Override // com.p2082ss.android.ugc.aweme.story.avatar.AbstractC76504c
    /* renamed from: a */
    public final void mo120229a(Aweme aweme, ActivityC0218d dVar, SmartRoute smartRoute) {
        List<Aweme> stories;
        C89219l.m154721d(aweme, "");
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(smartRoute, "");
        if (!C80422fe.m139425a(dVar)) {
            new C23144b(dVar).mo37640e(R.string.dcq).mo37637b();
            return;
        }
        UserStory userStory = aweme.getUserStory();
        if (!(userStory == null || (stories = userStory.getStories()) == null)) {
            Iterator<T> it = stories.iterator();
            while (it.hasNext()) {
                it.next().setUserStory(null);
            }
        }
        C76501g gVar = C76501g.f171786a;
        AbstractC89277c a = C89204ab.m154669a(StoryAvatarEntrySharedVM.class);
        C76495a aVar = C76495a.INSTANCE;
        C76496b bVar = new C76496b(dVar);
        C76497c cVar = new C76497c(dVar);
        C89219l.m154721d(aweme, "");
        ((AssemViewModel) new C12642a(a, gVar, C76498d.INSTANCE, new C76499e(dVar), C76500f.INSTANCE, aVar, bVar, cVar).getValue()).mo20662a(new StoryAvatarEntrySharedVM.C76492b(aweme));
        smartRoute.open();
    }

    @Override // com.p2082ss.android.ugc.aweme.story.avatar.AbstractC76504c
    /* renamed from: a */
    public final void mo120231a(String str, String str2, User user, String str3, C89378p<? extends Object, String>... pVarArr) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(user, "");
        C89219l.m154721d(pVarArr, "");
        String uid = user.getUid();
        int b = m134080b(user);
        C89205ac acVar = new C89205ac(5);
        acVar.mo143596b(C89387v.m154943a(str2, "enter_from"));
        acVar.mo143596b(C89387v.m154943a(uid, "author_id"));
        acVar.mo143596b(C89387v.m154943a(Integer.valueOf(b), "follow_status"));
        if (str3 == null) {
            str3 = "";
        }
        acVar.mo143596b(C89387v.m154943a(str3, "req_id"));
        acVar.mo143594a((Object) pVarArr);
        C39162r.m79462a(str, (C89378p[]) acVar.mo143595a((Object[]) new C89378p[acVar.f202887a.size()]));
    }
}
