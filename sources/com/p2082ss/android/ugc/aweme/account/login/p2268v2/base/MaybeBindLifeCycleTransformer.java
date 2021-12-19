package com.p2082ss.android.ugc.aweme.account.login.p2268v2.base;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.AbstractC88924h;
import p4560f.p4561a.AbstractC88973n;
import p4560f.p4561a.AbstractC88977r;
import p4560f.p4561a.AbstractC88978s;
import p4560f.p4561a.EnumC88388a;
import p4560f.p4561a.p4567d.AbstractC88438k;
import p4560f.p4561a.p4568e.p4570b.C88466b;
import p4560f.p4561a.p4568e.p4573e.p4576c.C88623u;
import p4560f.p4561a.p4568e.p4573e.p4578e.C88705bc;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4591l.C88958b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.base.MaybeBindLifeCycleTransformer */
public final class MaybeBindLifeCycleTransformer<T> implements AbstractC88978s<T, T>, AbstractC88978s {

    /* renamed from: a */
    public static final C32566a f77708a = new C32566a((byte) 0);

    /* renamed from: b */
    private final C88958b<Integer> f77709b;

    static {
        Covode.recordClassIndex(39337);
    }

    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            disposeRequest();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.base.MaybeBindLifeCycleTransformer$a */
    public static final class C32566a {
        static {
            Covode.recordClassIndex(39338);
        }

        private C32566a() {
        }

        public /* synthetic */ C32566a(byte b) {
            this();
        }
    }

    public MaybeBindLifeCycleTransformer() {
        C88958b<Integer> bVar = new C88958b<>();
        C89219l.m154716b(bVar, "");
        this.f77709b = bVar;
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public final void disposeRequest() {
        this.f77709b.onNext(1);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.base.MaybeBindLifeCycleTransformer$b */
    static final class C32567b<T> implements AbstractC88438k {

        /* renamed from: a */
        public static final C32567b f77710a = new C32567b();

        static {
            Covode.recordClassIndex(39339);
        }

        C32567b() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88438k
        /* renamed from: a */
        public final /* synthetic */ boolean mo7718a(Object obj) {
            Integer num = (Integer) obj;
            C89219l.m154721d(num, "");
            if (num.intValue() == 1) {
                return true;
            }
            return false;
        }
    }

    @Override // p4560f.p4561a.AbstractC88978s
    /* renamed from: a */
    public final AbstractC88977r<T> mo17920a(AbstractC88973n<T> nVar) {
        C89219l.m154721d(nVar, "");
        C88958b<Integer> bVar = this.f77709b;
        C32567b bVar2 = C32567b.f77710a;
        C88466b.m153697a((Object) bVar2, "predicate is null");
        AbstractC88924h<T> a = C88925a.m154171a(new C88705bc(bVar, bVar2)).mo143257a(EnumC88388a.MISSING);
        C88466b.m153697a((Object) a, "other is null");
        AbstractC88973n a2 = C88925a.m154169a(new C88623u(nVar, a));
        C89219l.m154716b(a2, "");
        return a2;
    }
}
