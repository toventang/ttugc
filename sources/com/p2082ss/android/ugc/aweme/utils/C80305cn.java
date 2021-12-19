package com.p2082ss.android.ugc.aweme.utils;

import com.bytedance.covode.number.Covode;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.utils.cn */
public final class C80305cn<T> implements AbstractC88412b, AbstractC88986z<T> {

    /* renamed from: a */
    public final AbstractC89172b<T, C89391z> f179830a;

    /* renamed from: b */
    public final AbstractC89171a<C89391z> f179831b;

    /* renamed from: c */
    public final AbstractC89172b<Throwable, C89391z> f179832c;

    /* renamed from: d */
    private AbstractC88412b f179833d;

    static {
        Covode.recordClassIndex(93573);
    }

    public C80305cn() {
        this(null, null, null, 7);
    }

    @Override // p4560f.p4561a.p4565b.AbstractC88412b
    public final void dispose() {
        AbstractC88412b bVar = this.f179833d;
        if (bVar != null && !bVar.isDisposed()) {
            bVar.dispose();
        }
    }

    @Override // p4560f.p4561a.p4565b.AbstractC88412b
    public final boolean isDisposed() {
        AbstractC88412b bVar = this.f179833d;
        if (bVar != null) {
            return bVar.isDisposed();
        }
        return true;
    }

    @Override // p4560f.p4561a.AbstractC88986z
    public final void onComplete() {
        try {
            this.f179831b.invoke();
        } catch (Exception e) {
            onError(e);
        } finally {
            dispose();
        }
    }

    @Override // p4560f.p4561a.AbstractC88986z
    public final void onSubscribe(AbstractC88412b bVar) {
        C89219l.m154721d(bVar, "");
        this.f179833d = bVar;
    }

    @Override // p4560f.p4561a.AbstractC88986z
    public final void onError(Throwable th) {
        C89219l.m154721d(th, "");
        try {
            this.f179832c.invoke(th);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            dispose();
        }
    }

    @Override // p4560f.p4561a.AbstractC88986z
    public final void onNext(T t) {
        try {
            this.f179830a.invoke(t);
        } catch (Throwable th) {
            onError(th);
        } finally {
            dispose();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.f.a.b<? super T, h.z> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: h.f.a.b<? super java.lang.Throwable, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    private C80305cn(AbstractC89172b<? super T, C89391z> bVar, AbstractC89171a<C89391z> aVar, AbstractC89172b<? super Throwable, C89391z> bVar2) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(bVar2, "");
        this.f179830a = bVar;
        this.f179831b = aVar;
        this.f179832c = bVar2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C80305cn(AbstractC89172b bVar, AbstractC89171a aVar, AbstractC89172b bVar2, int i) {
        this((i & 1) != 0 ? C803061.f179834a : bVar, (i & 2) != 0 ? C803072.f179835a : aVar, (i & 4) != 0 ? C803083.f179836a : bVar2);
    }
}
