package com.p2082ss.android.ugc.aweme.notification.p3535vm.p3536a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.C39077ac;
import com.p2082ss.android.ugc.aweme.friends.model.Friend;
import com.p2082ss.android.ugc.aweme.friends.service.C51648a;
import com.p2082ss.android.ugc.aweme.inbox.p3267b.C56316a;
import com.p2082ss.android.ugc.aweme.notification.p3535vm.C62380a;
import com.p2082ss.android.ugc.aweme.notification.p3535vm.p3536a.AbstractC62398e;
import java.util.ArrayList;
import java.util.List;
import p4560f.p4561a.AbstractC88403ab;
import p4560f.p4561a.AbstractC88406ae;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88982v;
import p4560f.p4561a.AbstractC88983w;
import p4560f.p4561a.AbstractC88984x;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notification.vm.a.c */
public final class C62389c implements AbstractC62398e<Object, C62380a> {

    /* renamed from: a */
    public final List<Friend> f141567a = new ArrayList();

    static {
        Covode.recordClassIndex(73179);
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.p3535vm.p3536a.AbstractC62398e
    /* renamed from: d */
    public final boolean mo100369d() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.p3535vm.p3536a.AbstractC62398e
    /* renamed from: c */
    public final AbstractC88979t<AbstractC62398e.C62400b<C62380a>> mo100368c() {
        return AbstractC62398e.C62399a.m112856a();
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.p2082ss.android.ugc.aweme.notification.p3535vm.p3536a.AbstractC62398e
    /* renamed from: a */
    public final /* synthetic */ C62380a mo100366a() {
        return new C62380a(null, this.f141567a, 1);
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.p3535vm.p3536a.AbstractC62398e
    /* renamed from: b */
    public final AbstractC88979t<AbstractC62398e.C62400b<C62380a>> mo100367b() {
        if (!C56316a.m102309a() || (!this.f141567a.isEmpty())) {
            AbstractC88979t<AbstractC62398e.C62400b<C62380a>> a = AbstractC88979t.m154294a(new C62390a(this));
            C89219l.m154716b(a, "");
            return a;
        }
        AbstractC88979t<AbstractC62398e.C62400b<C62380a>> a2 = AbstractC88979t.m154294a(new C62391b(this));
        C89219l.m154716b(a2, "");
        return a2;
    }

    /* renamed from: a */
    public final /* synthetic */ AbstractC62398e.C62400b mo100384a(Object obj) {
        C89219l.m154721d(obj, "");
        return AbstractC62398e.C62399a.m112854a(this, obj);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.notification.vm.a.c$a */
    public static final class C62390a<T> implements AbstractC88983w {

        /* renamed from: a */
        final /* synthetic */ C62389c f141568a;

        static {
            Covode.recordClassIndex(73180);
        }

        C62390a(C62389c cVar) {
            this.f141568a = cVar;
        }

        @Override // p4560f.p4561a.AbstractC88983w
        public final void subscribe(AbstractC88982v<AbstractC62398e.C62400b<C62380a>> vVar) {
            C89219l.m154721d(vVar, "");
            C39077ac.m79342a(vVar, this.f141568a.mo100384a(new C62380a(null, this.f141568a.f141567a, 1)));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.notification.vm.a.c$b */
    public static final class C62391b<T> implements AbstractC88983w {

        /* renamed from: a */
        final /* synthetic */ C62389c f141569a;

        static {
            Covode.recordClassIndex(73181);
        }

        C62391b(C62389c cVar) {
            this.f141569a = cVar;
        }

        @Override // p4560f.p4561a.AbstractC88983w
        public final void subscribe(final AbstractC88982v<AbstractC62398e.C62400b<C62380a>> vVar) {
            C89219l.m154721d(vVar, "");
            AbstractC88403ab.m153601a((AbstractC88984x) C51648a.f118980a.mo87319c(5)).mo142918b(C88925a.m154180b(C88946a.f201991c)).mo142925c(C623921.f141570a).mo142909a(C88391a.m153580a(C88392a.f200660a)).mo116431a_(new AbstractC88406ae<List<? extends Friend>>(this) {
                /* class com.p2082ss.android.ugc.aweme.notification.p3535vm.p3536a.C62389c.C62391b.C623932 */

                /* renamed from: a */
                final /* synthetic */ C62391b f141571a;

                static {
                    Covode.recordClassIndex(73183);
                }

                @Override // p4560f.p4561a.AbstractC88406ae
                public final void onSubscribe(AbstractC88412b bVar) {
                    C89219l.m154721d(bVar, "");
                }

                @Override // p4560f.p4561a.AbstractC88406ae
                public final void onError(Throwable th) {
                    C89219l.m154721d(th, "");
                    AbstractC88982v vVar = vVar;
                    C89219l.m154716b(vVar, "");
                    C39077ac.m79343a(vVar, th);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4560f.p4561a.AbstractC88406ae
                public final /* synthetic */ void onSuccess(List<? extends Friend> list) {
                    List<? extends Friend> list2 = list;
                    C89219l.m154721d(list2, "");
                    this.f141571a.f141569a.f141567a.addAll(list2);
                    AbstractC88982v vVar = vVar;
                    C89219l.m154716b(vVar, "");
                    C39077ac.m79342a(vVar, this.f141571a.f141569a.mo100384a(new C62380a(null, list2, 1)));
                }

                {
                    this.f141571a = r1;
                }
            });
        }
    }

    /* Return type fixed from 'com.ss.android.ugc.aweme.notification.vm.a.e$b' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Throwable] */
    @Override // com.p2082ss.android.ugc.aweme.notification.p3535vm.p3536a.AbstractC62398e
    /* renamed from: a */
    public final /* synthetic */ AbstractC62398e.C62400b<C62380a> mo100365a(C62380a aVar, Throwable th) {
        C89219l.m154721d(aVar, "");
        return AbstractC62398e.C62399a.m112855a(this, aVar, th);
    }
}
