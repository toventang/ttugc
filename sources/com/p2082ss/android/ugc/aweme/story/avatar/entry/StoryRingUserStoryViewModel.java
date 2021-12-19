package com.p2082ss.android.ugc.aweme.story.avatar.entry;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import androidx.lifecycle.C1213t;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.story.avatar.AbstractC76508e;
import com.p2082ss.android.ugc.aweme.story.avatar.AbstractC76546f;
import com.p2082ss.android.ugc.aweme.story.avatar.C76494a;
import com.p2082ss.android.ugc.aweme.story.base.AbstractC76618d;
import com.p2082ss.android.ugc.aweme.story.base.distribution.dispatcher.AbstractC76621c;
import com.p2082ss.android.ugc.aweme.story.p4054h.C77278d;
import com.p2082ss.android.ugc.aweme.story.p4055i.C77283a;
import com.p2082ss.android.ugc.aweme.story.userstory.mine.MineUserStoryFetcher;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4560f.p4561a.p4567d.AbstractC88438k;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.aweme.story.avatar.entry.StoryRingUserStoryViewModel */
public final class StoryRingUserStoryViewModel implements AbstractC33974au, AbstractC76546f, AbstractC76618d {

    /* renamed from: f */
    public static final C76511a f171798f = new C76511a((byte) 0);

    /* renamed from: a */
    final C1213t<Aweme> f171799a = new C1213t<>();

    /* renamed from: b */
    final C88411a f171800b = new C88411a();

    /* renamed from: c */
    public User f171801c;

    /* renamed from: d */
    C76512b f171802d;

    /* renamed from: e */
    final MineUserStoryFetcher f171803e;

    /* renamed from: g */
    private final AbstractC1204m f171804g;

    /* renamed from: com.ss.android.ugc.aweme.story.avatar.entry.StoryRingUserStoryViewModel$f */
    public static final class C76516f<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C76516f f171811a = new C76516f();

        static {
            Covode.recordClassIndex(89501);
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.avatar.entry.StoryRingUserStoryViewModel$j */
    public static final class C76520j<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C76520j f171816a = new C76520j();

        static {
            Covode.recordClassIndex(89505);
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(89495);
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            clear();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.avatar.entry.StoryRingUserStoryViewModel$a */
    public static final class C76511a {
        static {
            Covode.recordClassIndex(89496);
        }

        private C76511a() {
        }

        public /* synthetic */ C76511a(byte b) {
            this();
        }

        /* renamed from: a */
        public static boolean m134134a(User user) {
            String uid;
            if (user == null || (uid = user.getUid()) == null || !C76494a.f171782d.mo120232a()) {
                return false;
            }
            if (C77278d.f173366a.mo120171a(uid) == null && !C76494a.f171782d.mo120233a(user)) {
                return false;
            }
            return true;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.story.avatar.AbstractC76546f
    /* renamed from: A */
    public final AbstractC1204m mo89643A() {
        return this.f171804g;
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public final void clear() {
        this.f171800b.dispose();
        C76494a.f171782d.mo120230a(this);
    }

    @Override // androidx.lifecycle.AbstractC1204m
    public final AbstractC1196i getLifecycle() {
        AbstractC1196i lifecycle = this.f171804g.getLifecycle();
        C89219l.m154716b(lifecycle, "");
        return lifecycle;
    }

    /* renamed from: a */
    public final void mo120247a(Aweme aweme) {
        this.f171799a.setValue(aweme);
    }

    /* renamed from: com.ss.android.ugc.aweme.story.avatar.entry.StoryRingUserStoryViewModel$d */
    public static final class C76514d<T, R> implements AbstractC88434g {

        /* renamed from: a */
        final /* synthetic */ AbstractC89290k[] f171809a;

        static {
            Covode.recordClassIndex(89499);
        }

        public C76514d(AbstractC89290k[] kVarArr) {
            this.f171809a = kVarArr;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            AbstractC76621c.C76622a aVar = (AbstractC76621c.C76622a) obj;
            C89219l.m154721d(aVar, "");
            return AbstractC76621c.C76622a.m134212a(aVar.f171957a, aVar.f171958b, aVar.f171959c, this.f171809a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.avatar.entry.StoryRingUserStoryViewModel$h */
    public static final class C76518h<T, R> implements AbstractC88434g {

        /* renamed from: a */
        final /* synthetic */ AbstractC89290k[] f171814a;

        static {
            Covode.recordClassIndex(89503);
        }

        public C76518h(AbstractC89290k[] kVarArr) {
            this.f171814a = kVarArr;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            AbstractC76621c.C76622a aVar = (AbstractC76621c.C76622a) obj;
            C89219l.m154721d(aVar, "");
            return AbstractC76621c.C76622a.m134212a(aVar.f171957a, aVar.f171958b, aVar.f171959c, this.f171814a);
        }
    }

    /* renamed from: a */
    public final void mo120248a(C76512b bVar) {
        if (C89219l.m154714a(bVar, this.f171802d)) {
            this.f171802d = null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.avatar.entry.StoryRingUserStoryViewModel$c */
    public static final class C76513c<T> implements AbstractC88438k {

        /* renamed from: a */
        final /* synthetic */ Object f171807a;

        /* renamed from: b */
        final /* synthetic */ AbstractC76621c f171808b;

        static {
            Covode.recordClassIndex(89498);
        }

        public C76513c(Object obj, AbstractC76621c cVar) {
            this.f171807a = obj;
            this.f171808b = cVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88438k
        /* renamed from: a */
        public final /* synthetic */ boolean mo7718a(Object obj) {
            AbstractC76621c.C76622a aVar = (AbstractC76621c.C76622a) obj;
            C89219l.m154721d(aVar, "");
            if (!C89219l.m154714a(this.f171808b.mo120327a((Object) aVar.f171958b, (Object) aVar.f171959c), this.f171807a) || !(!aVar.f171957a.isEmpty())) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.avatar.entry.StoryRingUserStoryViewModel$e */
    public static final class C76515e<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ StoryRingUserStoryViewModel f171810a;

        static {
            Covode.recordClassIndex(89500);
        }

        public C76515e(StoryRingUserStoryViewModel storyRingUserStoryViewModel) {
            this.f171810a = storyRingUserStoryViewModel;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            String str;
            Aweme clone = ((AbstractC76621c.C76622a) obj).f171959c.clone();
            C89219l.m154716b(clone, "");
            User user = this.f171810a.f171801c;
            if (user != null) {
                str = user.getUid();
            } else {
                str = null;
            }
            if (C89219l.m154714a((Object) str, (Object) clone.getAuthorUid())) {
                this.f171810a.mo120247a(clone);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.avatar.entry.StoryRingUserStoryViewModel$g */
    public static final class C76517g<T> implements AbstractC88438k {

        /* renamed from: a */
        final /* synthetic */ Object f171812a;

        /* renamed from: b */
        final /* synthetic */ AbstractC76621c f171813b;

        static {
            Covode.recordClassIndex(89502);
        }

        public C76517g(Object obj, AbstractC76621c cVar) {
            this.f171812a = obj;
            this.f171813b = cVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88438k
        /* renamed from: a */
        public final /* synthetic */ boolean mo7718a(Object obj) {
            AbstractC76621c.C76622a aVar = (AbstractC76621c.C76622a) obj;
            C89219l.m154721d(aVar, "");
            if (!C89219l.m154714a(this.f171813b.mo120327a((Object) aVar.f171958b, (Object) aVar.f171959c), this.f171812a) || !(!aVar.f171957a.isEmpty())) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.avatar.entry.StoryRingUserStoryViewModel$i */
    public static final class C76519i<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ StoryRingUserStoryViewModel f171815a;

        static {
            Covode.recordClassIndex(89504);
        }

        public C76519i(StoryRingUserStoryViewModel storyRingUserStoryViewModel) {
            this.f171815a = storyRingUserStoryViewModel;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            String str;
            Aweme clone = ((AbstractC76621c.C76622a) obj).f171959c.clone();
            C89219l.m154716b(clone, "");
            User user = this.f171815a.f171801c;
            if (user != null) {
                str = user.getUid();
            } else {
                str = null;
            }
            if (C89219l.m154714a((Object) str, (Object) clone.getAuthorUid())) {
                this.f171815a.mo120247a(clone);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.avatar.entry.StoryRingUserStoryViewModel$k */
    static final class C76521k extends AbstractC89220m implements AbstractC89172b<Aweme, C89391z> {

        /* renamed from: a */
        final /* synthetic */ StoryRingUserStoryViewModel f171817a;

        /* renamed from: b */
        final /* synthetic */ boolean f171818b;

        /* renamed from: c */
        final /* synthetic */ String f171819c;

        static {
            Covode.recordClassIndex(89506);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C76521k(StoryRingUserStoryViewModel storyRingUserStoryViewModel, boolean z, String str) {
            super(1);
            this.f171817a = storyRingUserStoryViewModel;
            this.f171818b = z;
            this.f171819c = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Aweme aweme) {
            String uid;
            Aweme aweme2 = aweme;
            C89219l.m154721d(aweme2, "");
            User author = aweme2.getAuthor();
            if (!(author == null || (uid = author.getUid()) == null)) {
                this.f171817a.mo89644a(uid, aweme2);
            }
            this.f171817a.mo120248a(new C76512b(this.f171819c, this.f171818b));
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.avatar.entry.StoryRingUserStoryViewModel$l */
    static final class C76522l extends AbstractC89220m implements AbstractC89172b<Aweme, C89391z> {

        /* renamed from: a */
        final /* synthetic */ StoryRingUserStoryViewModel f171820a;

        /* renamed from: b */
        final /* synthetic */ boolean f171821b;

        /* renamed from: c */
        final /* synthetic */ String f171822c;

        static {
            Covode.recordClassIndex(89507);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C76522l(StoryRingUserStoryViewModel storyRingUserStoryViewModel, boolean z, String str) {
            super(1);
            this.f171820a = storyRingUserStoryViewModel;
            this.f171821b = z;
            this.f171822c = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Aweme aweme) {
            String uid;
            Aweme aweme2 = aweme;
            C89219l.m154721d(aweme2, "");
            User author = aweme2.getAuthor();
            if (!(author == null || (uid = author.getUid()) == null)) {
                this.f171820a.mo89644a(uid, aweme2);
            }
            this.f171820a.mo120248a(new C76512b(this.f171822c, this.f171821b));
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.avatar.entry.StoryRingUserStoryViewModel$m */
    static final class C76523m extends AbstractC89220m implements AbstractC89172b<Throwable, C89391z> {

        /* renamed from: a */
        final /* synthetic */ StoryRingUserStoryViewModel f171823a;

        /* renamed from: b */
        final /* synthetic */ boolean f171824b;

        /* renamed from: c */
        final /* synthetic */ String f171825c;

        static {
            Covode.recordClassIndex(89508);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C76523m(StoryRingUserStoryViewModel storyRingUserStoryViewModel, boolean z, String str) {
            super(1);
            this.f171823a = storyRingUserStoryViewModel;
            this.f171824b = z;
            this.f171825c = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Throwable th) {
            Throwable th2 = th;
            C89219l.m154721d(th2, "");
            C77283a.m135109a("StoryRingUserStoryViewModel", th2);
            this.f171823a.mo120248a(new C76512b(this.f171825c, this.f171824b));
            this.f171823a.mo89644a(this.f171825c, null);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.avatar.entry.StoryRingUserStoryViewModel$n */
    static final class C76524n<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ StoryRingUserStoryViewModel f171826a;

        /* renamed from: b */
        final /* synthetic */ String f171827b;

        /* renamed from: c */
        final /* synthetic */ boolean f171828c;

        static {
            Covode.recordClassIndex(89509);
        }

        C76524n(StoryRingUserStoryViewModel storyRingUserStoryViewModel, String str, boolean z) {
            this.f171826a = storyRingUserStoryViewModel;
            this.f171827b = str;
            this.f171828c = z;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            User author;
            String uid;
            Aweme aweme = (Aweme) obj;
            if (!(aweme == null || (author = aweme.getAuthor()) == null || (uid = author.getUid()) == null)) {
                this.f171826a.mo89644a(uid, aweme);
            }
            this.f171826a.mo120248a(new C76512b(this.f171827b, this.f171828c));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.avatar.entry.StoryRingUserStoryViewModel$o */
    static final class C76525o<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ StoryRingUserStoryViewModel f171829a;

        /* renamed from: b */
        final /* synthetic */ String f171830b;

        /* renamed from: c */
        final /* synthetic */ boolean f171831c;

        static {
            Covode.recordClassIndex(89510);
        }

        C76525o(StoryRingUserStoryViewModel storyRingUserStoryViewModel, String str, boolean z) {
            this.f171829a = storyRingUserStoryViewModel;
            this.f171830b = str;
            this.f171831c = z;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            C89219l.m154716b(th, "");
            C77283a.m135109a("StoryRingUserStoryViewModel", th);
            this.f171829a.mo120248a(new C76512b(this.f171830b, this.f171831c));
            this.f171829a.mo89644a(this.f171830b, null);
        }
    }

    public StoryRingUserStoryViewModel(AbstractC76508e eVar) {
        C89219l.m154721d(eVar, "");
        AbstractC1204m b = eVar.mo80538b();
        this.f171804g = b;
        this.f171803e = new MineUserStoryFetcher(getLifecycle());
        b.getLifecycle().mo4012a(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.story.avatar.entry.StoryRingUserStoryViewModel$b */
    public static final class C76512b {

        /* renamed from: a */
        public final String f171805a;

        /* renamed from: b */
        public final boolean f171806b;

        static {
            Covode.recordClassIndex(89497);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C76512b)) {
                return false;
            }
            C76512b bVar = (C76512b) obj;
            return C89219l.m154714a(this.f171805a, bVar.f171805a) && this.f171806b == bVar.f171806b;
        }

        public final int hashCode() {
            String str = this.f171805a;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            boolean z = this.f171806b;
            if (z) {
                z = true;
            }
            int i = z ? 1 : 0;
            int i2 = z ? 1 : 0;
            int i3 = z ? 1 : 0;
            return hashCode + i;
        }

        public final String toString() {
            return "QueryParam(uid=" + this.f171805a + ", useCache=" + this.f171806b + ")";
        }

        public C76512b(String str, boolean z) {
            C89219l.m154721d(str, "");
            this.f171805a = str;
            this.f171806b = z;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.story.avatar.AbstractC76546f
    /* renamed from: a */
    public final void mo89644a(String str, Aweme aweme) {
        String str2;
        User user;
        C89219l.m154721d(str, "");
        User user2 = this.f171801c;
        if (user2 != null) {
            str2 = user2.getUid();
        } else {
            str2 = null;
        }
        if (!(!C89219l.m154714a((Object) str, (Object) str2))) {
            mo120247a(aweme);
            if (aweme == null && (user = this.f171801c) != null) {
                user.setStoryStatus(0);
            }
        }
    }
}
