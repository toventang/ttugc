package com.p2082ss.android.ugc.aweme.notification.p3535vm.p3536a;

import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.friends.model.RecommendList;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.p2082ss.android.ugc.aweme.notification.bean.C61886q;
import com.p2082ss.android.ugc.aweme.notification.p3535vm.p3536a.AbstractC62398e;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notification.vm.a.a */
public final class C62381a implements AbstractC62398e<Object, List<? extends MusNotice>> {

    /* renamed from: a */
    public static final C62382a f141559a = new C62382a((byte) 0);

    /* renamed from: b */
    private final AbstractC89244h f141560b = C89250i.m154773a((AbstractC89171a) C62383b.f141562a);

    /* renamed from: c */
    private final AbstractC89244h f141561c = C89250i.m154773a((AbstractC89171a) C62385d.f141564a);

    static {
        Covode.recordClassIndex(73171);
    }

    /* renamed from: g */
    private final List<MusNotice> m112821g() {
        return (List) this.f141560b.getValue();
    }

    /* renamed from: e */
    public final C62423g mo100381e() {
        return (C62423g) this.f141561c.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.vm.a.a$a */
    public static final class C62382a {
        static {
            Covode.recordClassIndex(73172);
        }

        private C62382a() {
        }

        public /* synthetic */ C62382a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.vm.a.a$d */
    static final class C62385d extends AbstractC89220m implements AbstractC89171a<C62423g> {

        /* renamed from: a */
        public static final C62385d f141564a = new C62385d();

        static {
            Covode.recordClassIndex(73175);
        }

        C62385d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C62423g invoke() {
            return new C62423g();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.vm.a.a$b */
    static final class C62383b extends AbstractC89220m implements AbstractC89171a<List<MusNotice>> {

        /* renamed from: a */
        public static final C62383b f141562a = new C62383b();

        static {
            Covode.recordClassIndex(73173);
        }

        C62383b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ List<MusNotice> invoke() {
            return Collections.synchronizedList(new ArrayList());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.p3535vm.p3536a.AbstractC62398e
    /* renamed from: d */
    public final boolean mo100369d() {
        return mo100381e().mo100369d();
    }

    /* renamed from: f */
    public final List<MusNotice> mo100366a() {
        List<MusNotice> g = m112821g();
        C89219l.m154716b(g, "");
        return C89070n.m154590j(g);
    }

    /* Return type fixed from 'f.a.t<com.ss.android.ugc.aweme.notification.vm.a.e$b<java.util.List<com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice>>>' to match base method */
    @Override // com.p2082ss.android.ugc.aweme.notification.p3535vm.p3536a.AbstractC62398e
    /* renamed from: b */
    public final AbstractC88979t<AbstractC62398e.C62400b<List<? extends MusNotice>>> mo100367b() {
        AbstractC88979t<AbstractC62398e.C62400b<List<MusNotice>>> f = mo100381e().mo100367b().mo143292d(new C62386e(this)).mo143299f(new C62387f(this));
        C89219l.m154716b(f, "");
        return f;
    }

    /* Return type fixed from 'f.a.t<com.ss.android.ugc.aweme.notification.vm.a.e$b<java.util.List<com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice>>>' to match base method */
    @Override // com.p2082ss.android.ugc.aweme.notification.p3535vm.p3536a.AbstractC62398e
    /* renamed from: c */
    public final AbstractC88979t<AbstractC62398e.C62400b<List<? extends MusNotice>>> mo100368c() {
        AbstractC88979t<AbstractC62398e.C62400b<List<MusNotice>>> d = mo100381e().mo100368c().mo143292d(new C62384c(this));
        C89219l.m154716b(d, "");
        return d;
    }

    /* renamed from: a */
    public final int mo100378a(String str) {
        return mo100381e().mo100411a(str);
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.vm.a.a$c */
    static final class C62384c<T, R> implements AbstractC88434g {

        /* renamed from: a */
        final /* synthetic */ C62381a f141563a;

        static {
            Covode.recordClassIndex(73174);
        }

        C62384c(C62381a aVar) {
            this.f141563a = aVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            AbstractC62398e.C62400b bVar = (AbstractC62398e.C62400b) obj;
            C89219l.m154721d(bVar, "");
            this.f141563a.mo100380a(bVar.f141596b.f141557a);
            C62381a aVar = this.f141563a;
            return aVar.mo100379a(aVar.mo100366a());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.vm.a.a$e */
    static final class C62386e<T, R> implements AbstractC88434g {

        /* renamed from: a */
        final /* synthetic */ C62381a f141565a;

        static {
            Covode.recordClassIndex(73176);
        }

        C62386e(C62381a aVar) {
            this.f141565a = aVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            AbstractC62398e.C62400b bVar = (AbstractC62398e.C62400b) obj;
            C89219l.m154721d(bVar, "");
            this.f141565a.mo100380a(bVar.f141596b.f141557a);
            C62381a aVar = this.f141565a;
            return aVar.mo100379a(aVar.mo100366a());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.vm.a.a$f */
    static final class C62387f<T, R> implements AbstractC88434g {

        /* renamed from: a */
        final /* synthetic */ C62381a f141566a;

        static {
            Covode.recordClassIndex(73177);
        }

        C62387f(C62381a aVar) {
            this.f141566a = aVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            Throwable th = (Throwable) obj;
            C89219l.m154721d(th, "");
            C62381a aVar = this.f141566a;
            return aVar.mo100365a(aVar.mo100366a(), th);
        }
    }

    /* renamed from: a */
    public final /* synthetic */ AbstractC62398e.C62400b mo100379a(Object obj) {
        C89219l.m154721d(obj, "");
        return AbstractC62398e.C62399a.m112854a(this, obj);
    }

    /* renamed from: a */
    public final void mo100380a(RecommendList recommendList) {
        if (recommendList != null) {
            m112821g().clear();
            List<User> inviterList = recommendList.getInviterList();
            if (inviterList != null) {
                Iterator<T> it = inviterList.iterator();
                while (it.hasNext()) {
                    m112821g().add(new C61886q(2011, it.next(), null, 0, 12));
                }
            }
            List<User> userList = recommendList.getUserList();
            if (userList != null) {
                Iterator<T> it2 = userList.iterator();
                while (it2.hasNext()) {
                    m112821g().add(new C61886q(2001, it2.next(), null, 0, 12));
                }
            }
            List<MusNotice> g = m112821g();
            C89219l.m154716b(g, "");
            if (!g.isEmpty()) {
                m112821g().add(0, new C61886q(LiveNetAdaptiveHurryTimeSetting.DEFAULT, null, null, 0, 14));
            }
        }
    }

    /* Return type fixed from 'com.ss.android.ugc.aweme.notification.vm.a.e$b' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Throwable] */
    @Override // com.p2082ss.android.ugc.aweme.notification.p3535vm.p3536a.AbstractC62398e
    /* renamed from: a */
    public final /* synthetic */ AbstractC62398e.C62400b<List<? extends MusNotice>> mo100365a(List<? extends MusNotice> list, Throwable th) {
        C89219l.m154721d(list, "");
        return AbstractC62398e.C62399a.m112855a(this, list, th);
    }
}
