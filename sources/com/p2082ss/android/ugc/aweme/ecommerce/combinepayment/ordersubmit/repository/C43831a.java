package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.p1445a.p1460j.AbstractC20287b;
import com.p2082ss.android.ugc.aweme.ecommerce.api.model.C43612a;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.p2829a.C43732h;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.api.C43843a;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.BillInfoResponse;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.C43850d;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.C43860n;
import java.util.HashMap;
import kotlinx.coroutines.AbstractC89699w;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.p4605b.p4606a.AbstractC89110d;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.a */
public final class C43831a extends AbstractC20287b {

    /* renamed from: d */
    public static final HashMap<String, C43831a> f102127d = new HashMap<>();

    /* renamed from: e */
    public static final C43832a f102128e = new C43832a((byte) 0);

    /* renamed from: b */
    public AbstractC89699w<BillInfoResponse> f102129b;

    /* renamed from: c */
    public AbstractC88412b f102130c;

    /* renamed from: f */
    private final AbstractC89244h f102131f = C89250i.m154773a((AbstractC89171a) C43836e.f102135a);

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.a$j */
    public static final class C43841j extends AbstractC89110d {

        /* renamed from: a */
        /* synthetic */ Object f102142a;

        /* renamed from: b */
        int f102143b;

        /* renamed from: c */
        final /* synthetic */ C43831a f102144c;

        /* renamed from: d */
        Object f102145d;

        /* renamed from: e */
        Object f102146e;

        /* renamed from: f */
        Object f102147f;

        /* renamed from: g */
        Object f102148g;

        /* renamed from: h */
        boolean f102149h;

        /* renamed from: i */
        boolean f102150i;

        static {
            Covode.recordClassIndex(52106);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43841j(C43831a aVar, AbstractC89124d dVar) {
            super(dVar);
            this.f102144c = aVar;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            this.f102142a = obj;
            this.f102143b |= Integer.MIN_VALUE;
            return this.f102144c.mo74466a(null, false, null, false, this);
        }
    }

    /* renamed from: b */
    public final C43843a mo74467b() {
        return (C43843a) this.f102131f.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.a$a */
    public static final class C43832a {
        static {
            Covode.recordClassIndex(52097);
        }

        private C43832a() {
        }

        public /* synthetic */ C43832a(byte b) {
            this();
        }

        /* renamed from: a */
        public static C43831a m86766a(String str) {
            C89219l.m154721d(str, "");
            C43831a aVar = C43831a.f102127d.get(str);
            if (aVar != null) {
                return aVar;
            }
            C43831a aVar2 = new C43831a();
            C43831a.f102127d.put(str, aVar2);
            return aVar2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.a$e */
    static final class C43836e extends AbstractC89220m implements AbstractC89171a<C43843a> {

        /* renamed from: a */
        public static final C43836e f102135a = new C43836e();

        static {
            Covode.recordClassIndex(52101);
        }

        C43836e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C43843a invoke() {
            return new C43843a();
        }
    }

    static {
        Covode.recordClassIndex(52096);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.a$b */
    public static final class C43833b implements AbstractC88986z<C43850d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89124d f102132a;

        static {
            Covode.recordClassIndex(52098);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onComplete() {
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onSubscribe(AbstractC88412b bVar) {
            C89219l.m154721d(bVar, "");
        }

        public C43833b(AbstractC89124d dVar) {
            this.f102132a = dVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.AbstractC88986z
        public final /* synthetic */ void onNext(C43850d dVar) {
            C89219l.m154721d(dVar, "");
            this.f102132a.resumeWith(C89379q.m157068constructorimpl(dVar));
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onError(Throwable th) {
            C89219l.m154721d(th, "");
            this.f102132a.resumeWith(C89379q.m157068constructorimpl(C89382r.m154941a(th)));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.a$f */
    public static final class C43837f implements AbstractC88986z<C43612a<C43860n>> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89124d f102136a;

        static {
            Covode.recordClassIndex(52102);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onComplete() {
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onSubscribe(AbstractC88412b bVar) {
            C89219l.m154721d(bVar, "");
        }

        public C43837f(AbstractC89124d dVar) {
            this.f102136a = dVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.AbstractC88986z
        public final /* synthetic */ void onNext(C43612a<C43860n> aVar) {
            C89219l.m154721d(aVar, "");
            this.f102136a.resumeWith(C89379q.m157068constructorimpl(aVar));
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onError(Throwable th) {
            C89219l.m154721d(th, "");
            this.f102136a.resumeWith(C89379q.m157068constructorimpl(C89382r.m154941a(th)));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.a$i */
    public static final class C43840i implements AbstractC88986z<C43612a<Object>> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89124d f102141a;

        static {
            Covode.recordClassIndex(52105);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onComplete() {
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onSubscribe(AbstractC88412b bVar) {
            C89219l.m154721d(bVar, "");
        }

        public C43840i(AbstractC89124d dVar) {
            this.f102141a = dVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.AbstractC88986z
        public final /* synthetic */ void onNext(C43612a<Object> aVar) {
            C89219l.m154721d(aVar, "");
            this.f102141a.resumeWith(C89379q.m157068constructorimpl(aVar));
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onError(Throwable th) {
            C89219l.m154721d(th, "");
            this.f102141a.resumeWith(C89379q.m157068constructorimpl(C89382r.m154941a(th)));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.a$c */
    public static final class C43834c<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ AbstractC89124d f102133a;

        static {
            Covode.recordClassIndex(52099);
        }

        C43834c(AbstractC89124d dVar) {
            this.f102133a = dVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C89219l.m154721d(obj, "");
            this.f102133a.resumeWith(C89379q.m157068constructorimpl(obj));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.a$d */
    public static final class C43835d<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ AbstractC89124d f102134a;

        static {
            Covode.recordClassIndex(52100);
        }

        C43835d(AbstractC89124d dVar) {
            this.f102134a = dVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            C89219l.m154721d(th, "");
            this.f102134a.resumeWith(C89379q.m157068constructorimpl(C89382r.m154941a(th)));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.a$g */
    public static final class C43838g<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C43831a f102137a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89699w f102138b;

        static {
            Covode.recordClassIndex(52103);
        }

        public C43838g(C43831a aVar, AbstractC89699w wVar) {
            this.f102137a = aVar;
            this.f102138b = wVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C89219l.m154721d(obj, "");
            C43732h.m86737b();
            this.f102138b.mo144262a(obj);
            AbstractC88412b bVar = this.f102137a.f102130c;
            if (bVar != null) {
                bVar.dispose();
            }
            this.f102137a.f102130c = null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.a$h */
    public static final class C43839h<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C43831a f102139a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89699w f102140b;

        static {
            Covode.recordClassIndex(52104);
        }

        public C43839h(C43831a aVar, AbstractC89699w wVar) {
            this.f102139a = aVar;
            this.f102140b = wVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            C89219l.m154721d(th, "");
            this.f102140b.mo144263a(th);
            AbstractC88412b bVar = this.f102139a.f102130c;
            if (bVar != null) {
                bVar.dispose();
            }
            this.f102139a.f102130c = null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0058  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m86763a(java.util.HashMap<java.lang.String, java.lang.Object> r6, com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.BillInfoResponse r7, boolean r8, boolean r9) {
        /*
        // Method dump skipped, instructions count: 111
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.C43831a.m86763a(java.util.HashMap, com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.BillInfoResponse, boolean, boolean):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x008f A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x002a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo74466a(com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.BillInfoRequest r17, boolean r18, java.util.HashMap<java.lang.String, java.lang.Object> r19, boolean r20, p4600h.p4603c.AbstractC89124d<? super com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.BillInfoResponse> r21) {
        /*
        // Method dump skipped, instructions count: 305
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.C43831a.mo74466a(com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.BillInfoRequest, boolean, java.util.HashMap, boolean, h.c.d):java.lang.Object");
    }
}
