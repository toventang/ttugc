package com.p2082ss.android.ugc.aweme.homepage.story.feed;

import android.os.Handler;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1203l;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.assem.arch.extensions.C12776a;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.p2082ss.android.ugc.aweme.AccountService;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.homepage.experiment.C52970a;
import com.p2082ss.android.ugc.aweme.homepage.story.HomepageStoryApi;
import com.p2082ss.android.ugc.aweme.homepage.story.IHomepageStoryApi;
import com.p2082ss.android.ugc.aweme.homepage.story.p3053b.C53029a;
import com.p2082ss.android.ugc.aweme.homepage.story.p3054c.C53030a;
import com.p2082ss.android.ugc.aweme.homepage.story.p3054c.C53031b;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.profile.p3575f.C63770ai;
import com.p2082ss.android.ugc.aweme.story.C77260g;
import com.p2082ss.android.ugc.aweme.story.p4025d.C76706a;
import com.p2082ss.android.ugc.aweme.story.p4055i.C77283a;
import com.p2082ss.android.ugc.aweme.story.userstory.mine.MineUserStoryFetcher;
import com.p2082ss.android.ugc.aweme.utils.C80566ib;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88984x;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88428a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4560f.p4561a.p4568e.p4573e.p4574a.C88502d;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4589j.C88934a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.homepage.story.feed.StorySidebarFeedVM */
public final class StorySidebarFeedVM extends AssemViewModel<C53110d> implements AbstractC1203l {

    /* renamed from: q */
    public static final C53084a f122079q = new C53084a((byte) 0);

    /* renamed from: j */
    public final C53111e f122080j = new C53111e();

    /* renamed from: k */
    public boolean f122081k;

    /* renamed from: l */
    public boolean f122082l;

    /* renamed from: m */
    public C53109c f122083m = new C53109c();

    /* renamed from: n */
    public boolean f122084n;

    /* renamed from: o */
    public boolean f122085o;

    /* renamed from: p */
    public final List<Runnable> f122086p = new ArrayList();

    /* renamed from: r */
    private boolean f122087r;

    /* renamed from: s */
    private boolean f122088s;

    /* renamed from: t */
    private boolean f122089t;

    /* renamed from: u */
    private final C88411a f122090u = new C88411a();

    /* renamed from: v */
    private long f122091v;

    /* renamed from: w */
    private final Handler f122092w = new Handler();

    /* renamed from: x */
    private final MineUserStoryFetcher f122093x = new MineUserStoryFetcher();

    /* renamed from: y */
    private final Runnable f122094y = new RunnableC53105u(this);

    /* renamed from: z */
    private final Runnable f122095z = new RunnableC53085b(this);

    static {
        Covode.recordClassIndex(62629);
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_PAUSE)
    public final void onPause() {
        this.f122089t = false;
    }

    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_RESUME) {
            onResume();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_PAUSE) {
            onPause();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.feed.StorySidebarFeedVM$a */
    public static final class C53084a {
        static {
            Covode.recordClassIndex(62630);
        }

        private C53084a() {
        }

        public /* synthetic */ C53084a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.feed.StorySidebarFeedVM$u */
    static final class RunnableC53105u implements Runnable {

        /* renamed from: a */
        final /* synthetic */ StorySidebarFeedVM f122119a;

        static {
            Covode.recordClassIndex(62651);
        }

        RunnableC53105u(StorySidebarFeedVM storySidebarFeedVM) {
            this.f122119a = storySidebarFeedVM;
        }

        public final void run() {
            this.f122119a.f122084n = false;
        }
    }

    /* renamed from: k */
    public final void mo89622k() {
        mo20662a(C53093j.f122105a);
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.feed.StorySidebarFeedVM$b */
    static final class RunnableC53085b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ StorySidebarFeedVM f122096a;

        static {
            Covode.recordClassIndex(62631);
        }

        RunnableC53085b(StorySidebarFeedVM storySidebarFeedVM) {
            this.f122096a = storySidebarFeedVM;
        }

        public final void run() {
            this.f122096a.f122085o = false;
            this.f122096a.mo89622k();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.homepage.story.feed.StorySidebarFeedVM$t */
    public static final class C53104t implements AbstractC88428a {

        /* renamed from: a */
        final /* synthetic */ StorySidebarFeedVM f122117a;

        /* renamed from: b */
        final /* synthetic */ boolean f122118b;

        static {
            Covode.recordClassIndex(62650);
        }

        C53104t(StorySidebarFeedVM storySidebarFeedVM, boolean z) {
            this.f122117a = storySidebarFeedVM;
            this.f122118b = z;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88428a
        /* renamed from: a */
        public final void mo8579a() {
            this.f122117a.mo89617a(this.f122118b, (Throwable) null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.homepage.story.feed.StorySidebarFeedVM$v */
    public static final class C53106v implements AbstractC88428a {

        /* renamed from: a */
        final /* synthetic */ StorySidebarFeedVM f122120a;

        static {
            Covode.recordClassIndex(62652);
        }

        C53106v(StorySidebarFeedVM storySidebarFeedVM) {
            this.f122120a = storySidebarFeedVM;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88428a
        /* renamed from: a */
        public final void mo8579a() {
            C77283a.m135111b("StorySidebarFeedVM", "refresh auto timer");
            this.f122120a.mo89620i();
        }
    }

    /* renamed from: l */
    public static String m98126l() {
        User b = C63770ai.m139683b();
        if (b != null) {
            return b.getUid();
        }
        return null;
    }

    /* renamed from: n */
    private final boolean m98128n() {
        if (this.f122081k || !C53030a.f121910a || !this.f122089t) {
            return false;
        }
        return true;
    }

    /* Return type fixed from 'com.bytedance.assem.arch.viewModel.j' to match base method */
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    /* renamed from: f */
    public final /* synthetic */ C53110d mo20674f() {
        getLifecycle().mo4012a(this);
        return new C53110d();
    }

    /* renamed from: g */
    public final boolean mo23342g() {
        if (this.f122088s || this.f122082l) {
            return false;
        }
        return true;
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_RESUME)
    public final void onResume() {
        this.f122089t = true;
        if (!this.f122081k && this.f122087r) {
            mo89620i();
        }
    }

    /* renamed from: i */
    public final void mo89620i() {
        if (!this.f122088s && m98128n() && !mo89618a(false)) {
            m98125c(true);
        }
    }

    /* renamed from: j */
    public final void mo89621j() {
        this.f122084n = true;
        this.f122092w.removeCallbacks(this.f122094y);
        this.f122092w.postDelayed(this.f122094y, 700);
        mo20662a(C53092i.f122104a);
    }

    /* renamed from: m */
    private static boolean m98127m() {
        IAccountUserService e = AccountService.m65215a().mo57069e();
        C89219l.m154716b(e, "");
        boolean isLogin = e.isLogin();
        boolean isChildrenMode = e.isChildrenMode();
        if (!isLogin || isChildrenMode || !C77260g.f173332a.mo120146a() || C53030a.f121913d) {
            return false;
        }
        return true;
    }

    /* renamed from: p */
    private final void m98130p() {
        long j;
        String l = m98126l();
        if (l != null) {
            j = Long.parseLong(l);
        } else {
            j = -1;
        }
        Aweme a = C77260g.f173332a.mo120157e().mo120170a();
        C53109c cVar = this.f122083m;
        List g = C89070n.m154585g((Collection) cVar.f122124a);
        C89070n.m154537a(g, (AbstractC89172b) new C53089f(j));
        g.add(0, Long.valueOf(j));
        List g2 = C89070n.m154585g((Collection) mo23343h());
        C89070n.m154537a(g2, (AbstractC89172b) new C53090g(this, a));
        g2.add(0, a);
        this.f122083m = C53109c.m98145a(cVar, g, g2, null, 4);
    }

    /* renamed from: h */
    public final List<Aweme> mo23343h() {
        String uid;
        List<Aweme> list = this.f122083m.f122125b;
        ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list, 10));
        for (T t : list) {
            User author = t.getAuthor();
            if (!(author == null || (uid = author.getUid()) == null)) {
                if (C53031b.m97957a(uid)) {
                    MineUserStoryFetcher.m135716a();
                } else {
                    Aweme a = C77260g.f173332a.mo120157e().mo120171a(uid);
                    if (a != null) {
                        t = a;
                    }
                }
            }
            arrayList.add(t);
        }
        return arrayList;
    }

    /* renamed from: o */
    private static void m98129o() {
        Keva repo = Keva.getRepo("repo_story_cold_start");
        long j = repo.getLong("key_guide_show_last_time_" + m98126l(), 0);
        if (j == 0 || C80566ib.m139650a(Long.valueOf(j)) <= 0) {
            repo.storeInt("key_guide_show_count_limit_" + m98126l(), repo.getInt("key_guide_show_count_limit_" + m98126l(), 0) + 1);
        } else {
            repo.storeInt("key_guide_show_count_limit_" + m98126l(), 1);
        }
        repo.storeLong("key_guide_show_last_time_" + m98126l(), System.currentTimeMillis());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.homepage.story.feed.StorySidebarFeedVM$s */
    public static final class C53103s<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ StorySidebarFeedVM f122115a;

        /* renamed from: b */
        final /* synthetic */ boolean f122116b;

        static {
            Covode.recordClassIndex(62649);
        }

        C53103s(StorySidebarFeedVM storySidebarFeedVM, boolean z) {
            this.f122115a = storySidebarFeedVM;
            this.f122116b = z;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            C51423a.m95790a(th);
            this.f122115a.mo89617a(this.f122116b, th);
        }
    }

    /* renamed from: a */
    public final void mo89616a(List<? extends Aweme> list) {
        C89219l.m154721d(list, "");
        this.f122083m = C53109c.m98145a(this.f122083m, null, list, null, 5);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.homepage.story.feed.StorySidebarFeedVM$c */
    public static final class C53086c extends AbstractC89220m implements AbstractC89172b<C53110d, C53110d> {

        /* renamed from: a */
        public static final C53086c f122097a = new C53086c();

        static {
            Covode.recordClassIndex(62632);
        }

        C53086c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C53110d invoke(C53110d dVar) {
            C53110d dVar2 = dVar;
            C89219l.m154721d(dVar2, "");
            return C53110d.m98146a(dVar2, 0, 1, null, null, null, null, 61);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.homepage.story.feed.StorySidebarFeedVM$f */
    public static final class C53089f extends AbstractC89220m implements AbstractC89172b<Long, Boolean> {

        /* renamed from: a */
        final /* synthetic */ long f122100a;

        static {
            Covode.recordClassIndex(62635);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C53089f(long j) {
            super(1);
            this.f122100a = j;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(Long l) {
            boolean z;
            if (l.longValue() == this.f122100a) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.homepage.story.feed.StorySidebarFeedVM$g */
    public static final class C53090g extends AbstractC89220m implements AbstractC89172b<Aweme, Boolean> {

        /* renamed from: a */
        final /* synthetic */ StorySidebarFeedVM f122101a;

        /* renamed from: b */
        final /* synthetic */ Aweme f122102b;

        static {
            Covode.recordClassIndex(62636);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C53090g(StorySidebarFeedVM storySidebarFeedVM, Aweme aweme) {
            super(1);
            this.f122101a = storySidebarFeedVM;
            this.f122102b = aweme;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(Aweme aweme) {
            String str;
            Aweme aweme2 = aweme;
            C89219l.m154721d(aweme2, "");
            User author = aweme2.getAuthor();
            if (author != null) {
                str = author.getUid();
            } else {
                str = null;
            }
            return Boolean.valueOf(C89219l.m154714a((Object) str, (Object) StorySidebarFeedVM.m98126l()));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.feed.StorySidebarFeedVM$h */
    public static final class C53091h extends AbstractC89220m implements AbstractC89172b<C53110d, C53110d> {

        /* renamed from: a */
        public static final C53091h f122103a = new C53091h();

        static {
            Covode.recordClassIndex(62637);
        }

        C53091h() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C53110d invoke(C53110d dVar) {
            C53110d dVar2 = dVar;
            C89219l.m154721d(dVar2, "");
            return C53110d.m98146a(dVar2, 1, 0, null, null, null, null, 62);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.feed.StorySidebarFeedVM$i */
    static final class C53092i extends AbstractC89220m implements AbstractC89172b<C53110d, C53110d> {

        /* renamed from: a */
        public static final C53092i f122104a = new C53092i();

        static {
            Covode.recordClassIndex(62638);
        }

        C53092i() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C53110d invoke(C53110d dVar) {
            C53110d dVar2 = dVar;
            C89219l.m154721d(dVar2, "");
            return C53110d.m98146a(dVar2, 0, 0, null, new C12776a("auto"), null, null, 55);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.homepage.story.feed.StorySidebarFeedVM$j */
    public static final class C53093j extends AbstractC89220m implements AbstractC89172b<C53110d, C53110d> {

        /* renamed from: a */
        public static final C53093j f122105a = new C53093j();

        static {
            Covode.recordClassIndex(62639);
        }

        C53093j() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C53110d invoke(C53110d dVar) {
            C53110d dVar2 = dVar;
            C89219l.m154721d(dVar2, "");
            return C53110d.m98146a(dVar2, 0, 0, null, null, new C12776a(true), null, 46);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.feed.StorySidebarFeedVM$k */
    public static final class C53094k extends AbstractC89220m implements AbstractC89172b<C53110d, C53110d> {

        /* renamed from: a */
        public static final C53094k f122106a = new C53094k();

        static {
            Covode.recordClassIndex(62640);
        }

        C53094k() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C53110d invoke(C53110d dVar) {
            C53110d dVar2 = dVar;
            C89219l.m154721d(dVar2, "");
            return C53110d.m98146a(dVar2, 0, 0, null, new C12776a("publish"), null, null, 55);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.feed.StorySidebarFeedVM$m */
    static final class C53096m extends AbstractC89220m implements AbstractC89172b<C53110d, C53110d> {

        /* renamed from: a */
        final /* synthetic */ int f122108a;

        static {
            Covode.recordClassIndex(62642);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C53096m(int i) {
            super(1);
            this.f122108a = i;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C53110d invoke(C53110d dVar) {
            C53110d dVar2 = dVar;
            C89219l.m154721d(dVar2, "");
            return C53110d.m98146a(dVar2, this.f122108a, 0, null, null, null, null, 62);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.homepage.story.feed.StorySidebarFeedVM$n */
    public static final class C53097n extends AbstractC89220m implements AbstractC89172b<C53110d, C53110d> {

        /* renamed from: a */
        public static final C53097n f122109a = new C53097n();

        static {
            Covode.recordClassIndex(62643);
        }

        C53097n() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C53110d invoke(C53110d dVar) {
            C53110d dVar2 = dVar;
            C89219l.m154721d(dVar2, "");
            return C53110d.m98146a(dVar2, 0, 1, null, null, null, null, 61);
        }
    }

    /* renamed from: a */
    public final boolean mo89618a(boolean z) {
        long j;
        if (this.f122088s) {
            return true;
        }
        if (z) {
            j = C53030a.f121912c;
        } else {
            j = C53030a.f121911b;
        }
        if (System.currentTimeMillis() - this.f122091v < j) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.homepage.story.feed.StorySidebarFeedVM$d */
    public static final class C53087d extends AbstractC89220m implements AbstractC89172b<C53110d, C53110d> {

        /* renamed from: a */
        final /* synthetic */ StorySidebarFeedVM f122098a;

        static {
            Covode.recordClassIndex(62633);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C53087d(StorySidebarFeedVM storySidebarFeedVM) {
            super(1);
            this.f122098a = storySidebarFeedVM;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C53110d invoke(C53110d dVar) {
            C53110d dVar2 = dVar;
            C89219l.m154721d(dVar2, "");
            this.f122098a.f122082l = false;
            return C53110d.m98146a(dVar2, 0, 10, new C12776a(new C53108b(true, EnumC53107a.NOTIFY_PUBLISH_PREPARED_WITH_OPEN_SIDEBAR)), null, null, null, 57);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.homepage.story.feed.StorySidebarFeedVM$e */
    public static final class C53088e extends AbstractC89220m implements AbstractC89172b<C53110d, C53110d> {

        /* renamed from: a */
        final /* synthetic */ StorySidebarFeedVM f122099a;

        static {
            Covode.recordClassIndex(62634);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C53088e(StorySidebarFeedVM storySidebarFeedVM) {
            super(1);
            this.f122099a = storySidebarFeedVM;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C53110d invoke(C53110d dVar) {
            C53110d dVar2 = dVar;
            C89219l.m154721d(dVar2, "");
            this.f122099a.f122082l = false;
            return C53110d.m98146a(dVar2, 0, 10, new C12776a(new C53108b(true, EnumC53107a.NOTIFY_PUBLISH_PREPARED)), null, null, null, 57);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.homepage.story.feed.StorySidebarFeedVM$l */
    public static final class C53095l extends AbstractC89220m implements AbstractC89172b<C53110d, C53110d> {

        /* renamed from: a */
        final /* synthetic */ StorySidebarFeedVM f122107a;

        static {
            Covode.recordClassIndex(62641);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C53095l(StorySidebarFeedVM storySidebarFeedVM) {
            super(1);
            this.f122107a = storySidebarFeedVM;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C53110d invoke(C53110d dVar) {
            C53110d dVar2 = dVar;
            C89219l.m154721d(dVar2, "");
            return C53110d.m98146a(dVar2, 0, 6, new C12776a(new C53108b(!this.f122107a.f122083m.f122125b.isEmpty(), null, 2)), null, null, null, 57);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.homepage.story.feed.StorySidebarFeedVM$o */
    public static final class C53098o<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ StorySidebarFeedVM f122110a;

        static {
            Covode.recordClassIndex(62644);
        }

        C53098o(StorySidebarFeedVM storySidebarFeedVM) {
            this.f122110a = storySidebarFeedVM;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C53029a aVar = (C53029a) obj;
            StorySidebarFeedVM storySidebarFeedVM = this.f122110a;
            String str = "";
            C89219l.m154716b(aVar, str);
            storySidebarFeedVM.f122083m = new C53109c();
            List<Long> uidList = aVar.getUidList();
            if (uidList != null) {
                C53109c cVar = storySidebarFeedVM.f122083m;
                String str2 = aVar.extra.logid;
                if (str2 != null) {
                    str = str2;
                }
                storySidebarFeedVM.f122083m = C53109c.m98145a(cVar, uidList, null, str, 2);
            }
            C77283a.m135111b("StorySidebarFeedVM", "onGetFeedResponse: ".concat(String.valueOf(aVar)));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.homepage.story.feed.StorySidebarFeedVM$q */
    public static final class C53100q<T, R> implements AbstractC88434g {

        /* renamed from: a */
        public static final C53100q f122112a = new C53100q();

        static {
            Covode.recordClassIndex(62646);
        }

        C53100q() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            List<String> list = (List) obj;
            C89219l.m154721d(list, "");
            if (!list.isEmpty()) {
                return C77260g.f173332a.mo120157e().mo120173a(list);
            }
            AbstractC88979t a = AbstractC88979t.m154294a(C531011.f122113a);
            C89219l.m154716b(a, "");
            return a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.homepage.story.feed.StorySidebarFeedVM$r */
    public static final class C53102r<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ StorySidebarFeedVM f122114a;

        static {
            Covode.recordClassIndex(62648);
        }

        C53102r(StorySidebarFeedVM storySidebarFeedVM) {
            this.f122114a = storySidebarFeedVM;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            List list = (List) obj;
            StorySidebarFeedVM storySidebarFeedVM = this.f122114a;
            C89219l.m154716b(list, "");
            ArrayList arrayList = new ArrayList();
            for (T t : list) {
                if (!C53031b.m97956a((Aweme) t)) {
                    arrayList.add(t);
                }
            }
            storySidebarFeedVM.mo89616a(arrayList);
            C77283a.m135111b("StorySidebarFeedVM", "onGetUserStories: ".concat(String.valueOf(list)));
        }
    }

    /* renamed from: a */
    public final void mo89615a(String str) {
        C89219l.m154721d(str, "");
        C77283a.m135111b("StorySidebarFeedVM", "refresh manually. desc: " + str + ". isRefreshing: " + this.f122088s);
        if (!this.f122088s) {
            m98125c(false);
        }
    }

    /* renamed from: b */
    public final void mo89619b(boolean z) {
        this.f122082l = true;
        mo20670c(C53086c.f122097a);
        m98130p();
        C77283a.m135111b("StorySidebarFeedVM", "insertSelfToPreloadData, cache size: " + this.f122083m.f122125b.size());
        if (z) {
            mo20670c(new C53087d(this));
        } else {
            mo20670c(new C53088e(this));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.homepage.story.feed.StorySidebarFeedVM$p */
    public static final class C53099p<T, R> implements AbstractC88434g {

        /* renamed from: a */
        final /* synthetic */ StorySidebarFeedVM f122111a;

        static {
            Covode.recordClassIndex(62645);
        }

        C53099p(StorySidebarFeedVM storySidebarFeedVM) {
            this.f122111a = storySidebarFeedVM;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            C89219l.m154721d(obj, "");
            List<Long> list = this.f122111a.f122083m.f122124a;
            if (list.size() > IHomepageStoryApi.C52994a.f121861a) {
                list = list.subList(0, IHomepageStoryApi.C52994a.f121861a);
            }
            ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(it.next().longValue()));
            }
            return arrayList;
        }
    }

    /* renamed from: a */
    public final void mo89614a(int i) {
        boolean z;
        boolean z2;
        boolean z3 = this.f122081k;
        if (i == 1) {
            z = true;
        } else {
            z = false;
        }
        if (z3 != z) {
            if (i == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.f122081k = z2;
            if (z2) {
                Iterator<T> it = this.f122086p.iterator();
                while (it.hasNext()) {
                    it.next().run();
                }
            }
            mo20662a(new C53096m(i));
            if (!this.f122081k) {
                mo89620i();
                if (this.f122085o) {
                    this.f122085o = false;
                    this.f122092w.removeCallbacks(this.f122095z);
                }
            } else if (this.f122084n) {
                this.f122084n = false;
                this.f122092w.removeCallbacks(this.f122094y);
                m98129o();
                this.f122085o = true;
                this.f122092w.removeCallbacks(this.f122095z);
                this.f122092w.postDelayed(this.f122095z, ((long) C52970a.m97881a()) * 1000);
            }
        }
    }

    /* renamed from: c */
    private final void m98125c(boolean z) {
        if (m98127m()) {
            this.f122088s = true;
            this.f122090u.mo142944a();
            C77283a.m135111b("StorySidebarFeedVM", "start refreshing: isAutoRefresh: ".concat(String.valueOf(z)));
            mo20662a(C53097n.f122109a);
            AbstractC88412b a = HomepageStoryApi.f121858a.getFeed(!z).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143280b(new C53098o(this)).mo143292d(new C53099p(this)).mo143261a(C88925a.m154180b(C88946a.f201991c)).mo143267a((AbstractC88434g<? super R, ? extends AbstractC88984x<? extends R>>) C53100q.f122112a, false).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143255a(new C53102r(this), new C53103s(this, z), new C53104t(this, z));
            C89219l.m154716b(a, "");
            C88934a.m154195a(a, this.f122090u);
        }
    }

    /* renamed from: a */
    public final void mo89617a(boolean z, Throwable th) {
        C77283a.m135111b("StorySidebarFeedVM", "OnRefreshFinish(" + hashCode() + "): isAutoRefresh: " + z + ", " + C76706a.m134271a(th));
        if (!C77260g.f173332a.mo120158f().mo120165a().isEmpty()) {
            m98130p();
        }
        this.f122088s = false;
        this.f122091v = System.currentTimeMillis();
        mo20662a(new C53095l(this));
        this.f122087r = true;
        if (C53030a.f121910a) {
            AbstractC88412b cN_ = C88925a.m154165a(C88502d.f200771a).mo142936a(C53030a.f121911b, TimeUnit.MILLISECONDS).mo142941b(C88925a.m154180b(C88946a.f201991c)).mo142937a(C88391a.m153580a(C88392a.f200660a)).mo142938a(new C53106v(this)).cN_();
            C89219l.m154716b(cN_, "");
            C88934a.m154195a(cN_, this.f122090u);
        }
    }
}
