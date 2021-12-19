package com.bytedance.ies.bullet.kit.lynx;

import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.bullet.kit.lynx.f */
public final class C16413f {

    /* renamed from: a */
    final List<AbstractC16370a> f39411a;

    /* renamed from: b */
    private final C16417i f39412b;

    static {
        Covode.recordClassIndex(18716);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends com.bytedance.ies.bullet.kit.lynx.a> */
    /* JADX WARN: Multi-variable type inference failed */
    public C16413f(C16417i iVar, List<? extends AbstractC16370a> list) {
        C89219l.m154719c(iVar, "");
        C89219l.m154719c(list, "");
        this.f39412b = iVar;
        this.f39411a = list;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.bullet.kit.lynx.f$a */
    public static final class C16414a extends AbstractC89220m implements AbstractC89183m<Object, Throwable, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C16413f f39413a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89172b f39414b;

        /* renamed from: c */
        final /* synthetic */ Iterator f39415c;

        /* renamed from: d */
        final /* synthetic */ C16416h f39416d;

        /* renamed from: e */
        final /* synthetic */ AbstractC89172b f39417e;

        static {
            Covode.recordClassIndex(18717);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16414a(C16413f fVar, AbstractC89172b bVar, Iterator it, C16416h hVar, AbstractC89172b bVar2) {
            super(2);
            this.f39413a = fVar;
            this.f39414b = bVar;
            this.f39415c = it;
            this.f39416d = hVar;
            this.f39417e = bVar2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(Object obj, Throwable th) {
            Throwable th2 = th;
            if (obj != null) {
                this.f39414b.invoke(obj);
            } else {
                C16413f fVar = this.f39413a;
                Iterator<? extends AbstractC16370a> it = this.f39415c;
                C16416h hVar = this.f39416d;
                AbstractC89172b<Object, C89391z> bVar = this.f39414b;
                AbstractC89172b<? super Throwable, C89391z> bVar2 = this.f39417e;
                if (th2 == null) {
                    th2 = new IllegalStateException("loadImage failed, Bitmap is null");
                }
                fVar.mo26045a(it, hVar, bVar, bVar2, th2);
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo26044a(Iterator<? extends AbstractC16370a> it, C16416h hVar, AbstractC89172b<Object, C89391z> bVar, AbstractC89172b<? super Throwable, C89391z> bVar2) {
        try {
            ((AbstractC16370a) it.next()).mo25954a(this.f39412b, hVar.f39419a, new C16414a(this, bVar, it, hVar, bVar2));
        } catch (Exception e) {
            mo26045a(it, hVar, bVar, bVar2, e);
        }
    }

    /* renamed from: a */
    public final void mo26045a(Iterator<? extends AbstractC16370a> it, C16416h hVar, AbstractC89172b<Object, C89391z> bVar, AbstractC89172b<? super Throwable, C89391z> bVar2, Throwable th) {
        if (it.hasNext()) {
            mo26044a(it, hVar, bVar, bVar2);
        } else {
            bVar2.invoke(th);
        }
    }
}
