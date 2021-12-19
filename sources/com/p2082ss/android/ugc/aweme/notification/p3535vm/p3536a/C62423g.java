package com.p2082ss.android.ugc.aweme.notification.p3535vm.p3536a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.common.C39077ac;
import com.p2082ss.android.ugc.aweme.friends.model.RecommendList;
import com.p2082ss.android.ugc.aweme.notification.p3535vm.C62380a;
import com.p2082ss.android.ugc.aweme.notification.p3535vm.p3536a.AbstractC62398e;
import com.p2082ss.android.ugc.aweme.profile.model.RecommendCommonUserModel;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63857u;
import com.p2082ss.android.ugc.aweme.profile.presenter.C63823ab;
import com.p2082ss.android.ugc.aweme.utils.permission.C80619d;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88982v;
import p4560f.p4561a.AbstractC88983w;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notification.vm.a.g */
public final class C62423g implements AbstractC62398e<Object, C62380a>, AbstractC63857u {

    /* renamed from: a */
    public static final C62424a f141642a = new C62424a((byte) 0);

    /* renamed from: b */
    private final AbstractC89244h f141643b = C89250i.m154773a((AbstractC89171a) new C62428d(this));

    /* renamed from: c */
    private final AbstractC89244h f141644c = C89250i.m154773a((AbstractC89171a) C62431f.f141654a);

    /* renamed from: d */
    private final AbstractC89244h f141645d = C89250i.m154773a((AbstractC89171a) C62427c.f141649a);

    static {
        Covode.recordClassIndex(73213);
    }

    /* renamed from: e */
    public final C63823ab mo100413e() {
        return (C63823ab) this.f141643b.getValue();
    }

    /* renamed from: f */
    public final CopyOnWriteArrayList<AbstractC89183m<RecommendList, Throwable, C89391z>> mo100414f() {
        return (CopyOnWriteArrayList) this.f141644c.getValue();
    }

    /* renamed from: g */
    public final CopyOnWriteArrayList<AbstractC89183m<RecommendList, Throwable, C89391z>> mo100415g() {
        return (CopyOnWriteArrayList) this.f141645d.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.vm.a.g$a */
    public static final class C62424a {
        static {
            Covode.recordClassIndex(73214);
        }

        private C62424a() {
        }

        public /* synthetic */ C62424a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.vm.a.g$c */
    static final class C62427c extends AbstractC89220m implements AbstractC89171a<CopyOnWriteArrayList<AbstractC89183m<? super RecommendList, ? super Throwable, ? extends C89391z>>> {

        /* renamed from: a */
        public static final C62427c f141649a = new C62427c();

        static {
            Covode.recordClassIndex(73217);
        }

        C62427c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ CopyOnWriteArrayList<AbstractC89183m<? super RecommendList, ? super Throwable, ? extends C89391z>> invoke() {
            return new CopyOnWriteArrayList();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.vm.a.g$f */
    static final class C62431f extends AbstractC89220m implements AbstractC89171a<CopyOnWriteArrayList<AbstractC89183m<? super RecommendList, ? super Throwable, ? extends C89391z>>> {

        /* renamed from: a */
        public static final C62431f f141654a = new C62431f();

        static {
            Covode.recordClassIndex(73221);
        }

        C62431f() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ CopyOnWriteArrayList<AbstractC89183m<? super RecommendList, ? super Throwable, ? extends C89391z>> invoke() {
            return new CopyOnWriteArrayList();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.vm.a.g$d */
    static final class C62428d extends AbstractC89220m implements AbstractC89171a<C63823ab> {

        /* renamed from: a */
        final /* synthetic */ C62423g f141650a;

        static {
            Covode.recordClassIndex(73218);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C62428d(C62423g gVar) {
            super(0);
            this.f141650a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C63823ab invoke() {
            return new C63823ab(new RecommendCommonUserModel(), this.f141650a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.p3535vm.p3536a.AbstractC62398e
    /* renamed from: c */
    public final AbstractC88979t<AbstractC62398e.C62400b<C62380a>> mo100368c() {
        AbstractC88979t<AbstractC62398e.C62400b<C62380a>> a = AbstractC88979t.m154294a(new C62425b(this));
        C89219l.m154716b(a, "");
        return a;
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.p3535vm.p3536a.AbstractC62398e
    /* renamed from: b */
    public final AbstractC88979t<AbstractC62398e.C62400b<C62380a>> mo100367b() {
        mo100413e().mo103288e();
        AbstractC88979t<AbstractC62398e.C62400b<C62380a>> a = AbstractC88979t.m154294a(new C62429e(this));
        C89219l.m154716b(a, "");
        return a;
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.p3535vm.p3536a.AbstractC62398e
    /* renamed from: d */
    public final boolean mo100369d() {
        RecommendList a = mo100413e().mo103280a();
        if (a != null) {
            return a.hasMore();
        }
        return false;
    }

    /* renamed from: h */
    public final String mo100416h() {
        RecommendList a = mo100413e().mo103280a();
        if (a != null) {
            return a.getRid();
        }
        return null;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.p2082ss.android.ugc.aweme.notification.p3535vm.p3536a.AbstractC62398e
    /* renamed from: a */
    public final /* synthetic */ C62380a mo100366a() {
        return new C62380a(mo100413e().mo103280a(), null, 2);
    }

    /* renamed from: a */
    public final int mo100411a(String str) {
        return mo100413e().mo103279a(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.notification.vm.a.g$b */
    public static final class C62425b<T> implements AbstractC88983w {

        /* renamed from: a */
        final /* synthetic */ C62423g f141646a;

        static {
            Covode.recordClassIndex(73215);
        }

        C62425b(C62423g gVar) {
            this.f141646a = gVar;
        }

        @Override // p4560f.p4561a.AbstractC88983w
        public final void subscribe(final AbstractC88982v<AbstractC62398e.C62400b<C62380a>> vVar) {
            C89219l.m154721d(vVar, "");
            this.f141646a.mo100415g().add(new AbstractC89183m<RecommendList, Throwable, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.notification.p3535vm.p3536a.C62423g.C62425b.C624261 */

                /* renamed from: a */
                final /* synthetic */ C62425b f141647a;

                static {
                    Covode.recordClassIndex(73216);
                }

                {
                    this.f141647a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89183m
                public final /* synthetic */ C89391z invoke(RecommendList recommendList, Throwable th) {
                    RecommendList recommendList2 = recommendList;
                    Throwable th2 = th;
                    if (th2 != null) {
                        AbstractC88982v vVar = vVar;
                        C89219l.m154716b(vVar, "");
                        C39077ac.m79343a(vVar, th2);
                    } else {
                        AbstractC88982v vVar2 = vVar;
                        C89219l.m154716b(vVar2, "");
                        C39077ac.m79342a(vVar2, this.f141647a.f141646a.mo100412a(new C62380a(recommendList2, null, 2)));
                    }
                    return C89391z.f203057a;
                }
            });
            C63823ab e = this.f141646a.mo100413e();
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            e.mo103284a(g.getCurUserId(), C80619d.m139776a(), "0");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.notification.vm.a.g$e */
    public static final class C62429e<T> implements AbstractC88983w {

        /* renamed from: a */
        final /* synthetic */ C62423g f141651a;

        static {
            Covode.recordClassIndex(73219);
        }

        C62429e(C62423g gVar) {
            this.f141651a = gVar;
        }

        @Override // p4560f.p4561a.AbstractC88983w
        public final void subscribe(final AbstractC88982v<AbstractC62398e.C62400b<C62380a>> vVar) {
            C89219l.m154721d(vVar, "");
            this.f141651a.mo100414f().add(new AbstractC89183m<RecommendList, Throwable, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.notification.p3535vm.p3536a.C62423g.C62429e.C624301 */

                /* renamed from: a */
                final /* synthetic */ C62429e f141652a;

                static {
                    Covode.recordClassIndex(73220);
                }

                {
                    this.f141652a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89183m
                public final /* synthetic */ C89391z invoke(RecommendList recommendList, Throwable th) {
                    RecommendList recommendList2 = recommendList;
                    Throwable th2 = th;
                    if (th2 != null) {
                        AbstractC88982v vVar = vVar;
                        C89219l.m154716b(vVar, "");
                        C39077ac.m79343a(vVar, th2);
                    } else {
                        AbstractC88982v vVar2 = vVar;
                        C89219l.m154716b(vVar2, "");
                        C39077ac.m79342a(vVar2, this.f141652a.f141651a.mo100412a(new C62380a(recommendList2, null, 2)));
                    }
                    return C89391z.f203057a;
                }
            });
            C63823ab e = this.f141651a.mo100413e();
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            e.mo103285a(g.getCurUserId(), C80619d.m139776a(), "0", false);
        }
    }

    /* renamed from: a */
    public final /* synthetic */ AbstractC62398e.C62400b mo100412a(Object obj) {
        C89219l.m154721d(obj, "");
        return AbstractC62398e.C62399a.m112854a(this, obj);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63857u
    /* renamed from: b */
    public final void mo81332b(RecommendList recommendList) {
        if (recommendList != null) {
            List<User> inviterList = recommendList.getInviterList();
            if (inviterList != null) {
                Integer.valueOf(inviterList.size());
            }
            List<User> userList = recommendList.getUserList();
            if (userList != null) {
                Integer.valueOf(userList.size());
            }
        }
        mo100414f().size();
        m112877a(mo100415g(), recommendList, null);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63857u
    /* renamed from: a */
    public final void mo81328a(RecommendList recommendList) {
        if (recommendList != null) {
            List<User> inviterList = recommendList.getInviterList();
            if (inviterList != null) {
                Integer.valueOf(inviterList.size());
            }
            List<User> userList = recommendList.getUserList();
            if (userList != null) {
                Integer.valueOf(userList.size());
            }
        }
        mo100414f().size();
        m112877a(mo100414f(), recommendList, null);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63857u
    /* renamed from: a */
    public final void mo81329a(Exception exc) {
        mo100414f().size();
        mo100415g().size();
        if (exc != null) {
            exc.getMessage();
        } else {
            exc = new IllegalStateException("Unknown error for recommend");
        }
        m112877a(mo100414f(), null, exc);
        m112877a(mo100415g(), null, exc);
    }

    /* Return type fixed from 'com.ss.android.ugc.aweme.notification.vm.a.e$b' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Throwable] */
    @Override // com.p2082ss.android.ugc.aweme.notification.p3535vm.p3536a.AbstractC62398e
    /* renamed from: a */
    public final /* synthetic */ AbstractC62398e.C62400b<C62380a> mo100365a(C62380a aVar, Throwable th) {
        C89219l.m154721d(aVar, "");
        return AbstractC62398e.C62399a.m112855a(this, aVar, th);
    }

    /* renamed from: a */
    private static void m112877a(CopyOnWriteArrayList<AbstractC89183m<RecommendList, Throwable, C89391z>> copyOnWriteArrayList, RecommendList recommendList, Throwable th) {
        Iterator<T> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            it.next().invoke(recommendList, th);
        }
        copyOnWriteArrayList.clear();
    }
}
