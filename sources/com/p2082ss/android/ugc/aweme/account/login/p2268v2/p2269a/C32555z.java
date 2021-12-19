package com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2269a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.C32583e;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2269a.p2270a.C32334a;
import p4560f.p4561a.AbstractC88973n;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4567d.AbstractC88428a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4567d.AbstractC88438k;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.z */
public final class C32555z {
    static {
        Covode.recordClassIndex(39323);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.z$c */
    public static final class C32558c implements AbstractC88428a {

        /* renamed from: a */
        final /* synthetic */ C89233z.C89234a f77687a;

        /* renamed from: b */
        final /* synthetic */ AbstractC32572b f77688b;

        static {
            Covode.recordClassIndex(39326);
        }

        C32558c(C89233z.C89234a aVar, AbstractC32572b bVar) {
            this.f77687a = aVar;
            this.f77688b = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88428a
        /* renamed from: a */
        public final void mo8579a() {
            if (!this.f77687a.element) {
                this.f77688b.mo57470b_(0);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.z$d */
    public static final class C32559d<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ AbstractC32572b f77689a;

        static {
            Covode.recordClassIndex(39327);
        }

        C32559d(AbstractC32572b bVar) {
            this.f77689a = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f77689a.mo57470b_(1);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.z$a */
    public static final class C32556a<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ AbstractC32572b f77683a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89234a f77684b;

        static {
            Covode.recordClassIndex(39324);
        }

        C32556a(AbstractC32572b bVar, C89233z.C89234a aVar) {
            this.f77683a = bVar;
            this.f77684b = aVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final void accept(T t) {
            this.f77683a.mo57470b_(0);
            this.f77684b.element = true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.z$b */
    public static final class C32557b<T> implements AbstractC88438k {

        /* renamed from: a */
        final /* synthetic */ AbstractC32572b f77685a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89234a f77686b;

        static {
            Covode.recordClassIndex(39325);
        }

        C32557b(AbstractC32572b bVar, C89233z.C89234a aVar) {
            this.f77685a = bVar;
            this.f77686b = aVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88438k
        /* renamed from: a */
        public final /* synthetic */ boolean mo7718a(Object obj) {
            Throwable th = (Throwable) obj;
            String str = "";
            C89219l.m154721d(th, str);
            this.f77685a.mo57470b_(0);
            this.f77686b.element = true;
            if (th instanceof C32405w) {
                AbstractC32572b bVar = this.f77685a;
                C32405w wVar = (C32405w) th;
                int errorCode = wVar.getErrorCode();
                String message = th.getMessage();
                if (message != null) {
                    str = message;
                }
                C32334a.m66708a(bVar, errorCode, str, wVar.getScene(), wVar.getStep(), wVar.getExtra());
            }
            return true;
        }
    }

    /* renamed from: a */
    public static final <T> AbstractC88973n<T> m67011a(AbstractC32572b bVar, AbstractC88973n<T> nVar) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(nVar, "");
        C89233z.C89234a aVar = new C89233z.C89234a();
        aVar.element = false;
        AbstractC88973n<T> b = nVar.mo143242b(C88391a.m153580a(C88392a.f200660a));
        C89219l.m154716b(b, "");
        AbstractC88973n<T> c = C32583e.m67080a(b, bVar).mo143251d(new C32556a(bVar, aVar)).mo143245b(new C32557b(bVar, aVar)).mo143243b(new C32558c(aVar, bVar)).mo143247c(new C32559d(bVar));
        C89219l.m154716b(c, "");
        return c;
    }
}
