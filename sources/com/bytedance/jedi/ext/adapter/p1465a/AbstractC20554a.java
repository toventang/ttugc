package com.bytedance.jedi.ext.adapter.p1465a;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20467g;
import com.bytedance.jedi.arch.AbstractC20468h;
import com.bytedance.jedi.arch.ext.list.AbstractC20443c;
import com.bytedance.jedi.ext.adapter.AbstractC20553a;
import com.bytedance.jedi.ext.adapter.p1465a.AbstractC20554a;
import com.bytedance.jedi.ext.adapter.p1465a.C20594d;
import com.bytedance.jedi.ext.adapter.p1465a.p1466a.C20562a;
import com.bytedance.jedi.ext.adapter.p1465a.p1466a.C20565b;
import com.bytedance.jedi.ext.adapter.p1465a.p1466a.C20568c;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.jedi.ext.adapter.a.a */
public abstract class AbstractC20554a<T, DEC extends C20594d<T>, RECEIVER extends AbstractC20467g, SELF extends AbstractC20554a<T, DEC, RECEIVER, SELF>> {

    /* renamed from: a */
    public View f48653a;

    /* renamed from: b */
    public AbstractC89172b<? super ViewGroup, ? extends RecyclerView.ViewHolder> f48654b;

    /* renamed from: c */
    public View f48655c;

    /* renamed from: d */
    public AbstractC89172b<? super ViewGroup, ? extends RecyclerView.ViewHolder> f48656d;

    /* renamed from: e */
    public int f48657e = 242;

    /* renamed from: f */
    public AbstractC89183m<? super ViewGroup, ? super AbstractC89171a<C89391z>, ? extends AbstractC20595e> f48658f;

    /* renamed from: g */
    public int[] f48659g = {1};

    /* renamed from: h */
    public AbstractC89183m<? super ViewGroup, ? super AbstractC89171a<C89391z>, ? extends AbstractC20593c> f48660h = C20557c.f48671a;

    /* renamed from: i */
    public AbstractC20443c<T, RECEIVER> f48661i;

    /* renamed from: j */
    public AbstractC20443c<T, RECEIVER> f48662j;

    /* renamed from: k */
    public AbstractC89183m<? super RECEIVER, ? super Boolean, C89391z> f48663k;

    /* renamed from: l */
    public AbstractC89183m<? super RECEIVER, ? super Boolean, C89391z> f48664l;

    /* renamed from: m */
    public AbstractC89172b<? super RECEIVER, C89391z> f48665m;

    /* renamed from: n */
    public final AbstractC20553a<T, ?, ?> f48666n;

    /* renamed from: o */
    public final DEC f48667o;

    /* renamed from: p */
    public final AbstractC20468h<RECEIVER> f48668p;

    static {
        Covode.recordClassIndex(24086);
    }

    /* renamed from: com.bytedance.jedi.ext.adapter.a.a$d */
    public static final class C20558d implements AbstractC20443c<T, RECEIVER> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89172b f48672a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89183m f48673b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89183m f48674c;

        /* renamed from: d */
        private final AbstractC89172b<RECEIVER, C89391z> f48675d;

        /* renamed from: e */
        private final AbstractC89183m<RECEIVER, Throwable, C89391z> f48676e;

        /* renamed from: f */
        private final AbstractC89183m<RECEIVER, List<? extends T>, C89391z> f48677f;

        static {
            Covode.recordClassIndex(24090);
        }

        /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: h.f.a.b<RECEIVER, h.z>, h.f.a.b<RECEIVER extends com.bytedance.jedi.arch.g, h.z> */
        @Override // com.bytedance.jedi.arch.ext.list.AbstractC20443c
        /* renamed from: a */
        public final AbstractC89172b<RECEIVER, C89391z> mo33773a() {
            return (AbstractC89172b<RECEIVER, C89391z>) this.f48675d;
        }

        /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: h.f.a.m<RECEIVER, java.lang.Throwable, h.z>, h.f.a.m<RECEIVER extends com.bytedance.jedi.arch.g, java.lang.Throwable, h.z> */
        @Override // com.bytedance.jedi.arch.ext.list.AbstractC20443c
        /* renamed from: b */
        public final AbstractC89183m<RECEIVER, Throwable, C89391z> mo33774b() {
            return (AbstractC89183m<RECEIVER, Throwable, C89391z>) this.f48676e;
        }

        /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: h.f.a.m<RECEIVER, java.util.List<? extends T>, h.z>, h.f.a.m<RECEIVER extends com.bytedance.jedi.arch.g, java.util.List<? extends T>, h.z> */
        @Override // com.bytedance.jedi.arch.ext.list.AbstractC20443c
        /* renamed from: c */
        public final AbstractC89183m<RECEIVER, List<? extends T>, C89391z> mo33775c() {
            return (AbstractC89183m<RECEIVER, List<? extends T>, C89391z>) this.f48677f;
        }

        public C20558d(AbstractC89172b bVar, AbstractC89183m mVar, AbstractC89183m mVar2) {
            this.f48672a = bVar;
            this.f48673b = mVar;
            this.f48674c = mVar2;
            this.f48675d = bVar;
            this.f48676e = mVar;
            this.f48677f = mVar2;
        }
    }

    /* renamed from: com.bytedance.jedi.ext.adapter.a.a$g */
    public static final class C20561g implements AbstractC20443c<T, RECEIVER> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89172b f48680a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89183m f48681b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89183m f48682c;

        /* renamed from: d */
        private final AbstractC89172b<RECEIVER, C89391z> f48683d;

        /* renamed from: e */
        private final AbstractC89183m<RECEIVER, Throwable, C89391z> f48684e;

        /* renamed from: f */
        private final AbstractC89183m<RECEIVER, List<? extends T>, C89391z> f48685f;

        static {
            Covode.recordClassIndex(24093);
        }

        /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: h.f.a.b<RECEIVER, h.z>, h.f.a.b<RECEIVER extends com.bytedance.jedi.arch.g, h.z> */
        @Override // com.bytedance.jedi.arch.ext.list.AbstractC20443c
        /* renamed from: a */
        public final AbstractC89172b<RECEIVER, C89391z> mo33773a() {
            return (AbstractC89172b<RECEIVER, C89391z>) this.f48683d;
        }

        /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: h.f.a.m<RECEIVER, java.lang.Throwable, h.z>, h.f.a.m<RECEIVER extends com.bytedance.jedi.arch.g, java.lang.Throwable, h.z> */
        @Override // com.bytedance.jedi.arch.ext.list.AbstractC20443c
        /* renamed from: b */
        public final AbstractC89183m<RECEIVER, Throwable, C89391z> mo33774b() {
            return (AbstractC89183m<RECEIVER, Throwable, C89391z>) this.f48684e;
        }

        /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: h.f.a.m<RECEIVER, java.util.List<? extends T>, h.z>, h.f.a.m<RECEIVER extends com.bytedance.jedi.arch.g, java.util.List<? extends T>, h.z> */
        @Override // com.bytedance.jedi.arch.ext.list.AbstractC20443c
        /* renamed from: c */
        public final AbstractC89183m<RECEIVER, List<? extends T>, C89391z> mo33775c() {
            return (AbstractC89183m<RECEIVER, List<? extends T>, C89391z>) this.f48685f;
        }

        public C20561g(AbstractC89172b bVar, AbstractC89183m mVar, AbstractC89183m mVar2) {
            this.f48680a = bVar;
            this.f48681b = mVar;
            this.f48682c = mVar2;
            this.f48683d = bVar;
            this.f48684e = mVar;
            this.f48685f = mVar2;
        }
    }

    /* renamed from: a */
    public final SELF mo33839a(int i) {
        this.f48657e = i;
        return this;
    }

    /* renamed from: com.bytedance.jedi.ext.adapter.a.a$e */
    public static final class C20559e extends AbstractC89220m implements AbstractC89172b<RECEIVER, C89391z> {

        /* renamed from: a */
        public static final C20559e f48678a = new C20559e();

        static {
            Covode.recordClassIndex(24091);
        }

        C20559e() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Object obj) {
            C89219l.m154719c(obj, "");
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final SELF mo33841a(AbstractC89183m<? super ViewGroup, ? super AbstractC89171a<C89391z>, ? extends AbstractC20595e> mVar) {
        C89219l.m154719c(mVar, "");
        this.f48658f = mVar;
        return this;
    }

    /* renamed from: com.bytedance.jedi.ext.adapter.a.a$f */
    public static final class C20560f extends AbstractC89220m implements AbstractC89183m<RECEIVER, Throwable, C89391z> {

        /* renamed from: a */
        public static final C20560f f48679a = new C20560f();

        static {
            Covode.recordClassIndex(24092);
        }

        C20560f() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(Object obj, Throwable th) {
            C89219l.m154719c(obj, "");
            C89219l.m154719c(th, "");
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.jedi.ext.adapter.a.a$a */
    public static final class C20555a extends AbstractC89220m implements AbstractC89183m<ViewGroup, AbstractC89171a<? extends C89391z>, C20562a> {

        /* renamed from: a */
        public static final C20555a f48669a = new C20555a();

        static {
            Covode.recordClassIndex(24087);
        }

        C20555a() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C20562a invoke(ViewGroup viewGroup, AbstractC89171a<? extends C89391z> aVar) {
            ViewGroup viewGroup2 = viewGroup;
            AbstractC89171a<? extends C89391z> aVar2 = aVar;
            C89219l.m154719c(viewGroup2, "");
            C89219l.m154719c(aVar2, "");
            return new C20562a(viewGroup2, aVar2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.jedi.ext.adapter.a.a$b */
    public static final class C20556b extends AbstractC89220m implements AbstractC89183m<ViewGroup, AbstractC89171a<? extends C89391z>, C20565b> {

        /* renamed from: a */
        public static final C20556b f48670a = new C20556b();

        static {
            Covode.recordClassIndex(24088);
        }

        C20556b() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C20565b invoke(ViewGroup viewGroup, AbstractC89171a<? extends C89391z> aVar) {
            ViewGroup viewGroup2 = viewGroup;
            AbstractC89171a<? extends C89391z> aVar2 = aVar;
            C89219l.m154719c(viewGroup2, "");
            C89219l.m154719c(aVar2, "");
            return new C20565b(viewGroup2, aVar2);
        }
    }

    /* renamed from: com.bytedance.jedi.ext.adapter.a.a$c */
    static final class C20557c extends AbstractC89220m implements AbstractC89183m<ViewGroup, AbstractC89171a<? extends C89391z>, C20568c> {

        /* renamed from: a */
        public static final C20557c f48671a = new C20557c();

        static {
            Covode.recordClassIndex(24089);
        }

        C20557c() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C20568c invoke(ViewGroup viewGroup, AbstractC89171a<? extends C89391z> aVar) {
            ViewGroup viewGroup2 = viewGroup;
            AbstractC89171a<? extends C89391z> aVar2 = aVar;
            C89219l.m154719c(viewGroup2, "");
            C89219l.m154719c(aVar2, "");
            return new C20568c(viewGroup2, aVar2);
        }
    }

    /* renamed from: a */
    public final SELF mo33840a(AbstractC89172b<? super RECEIVER, C89391z> bVar, AbstractC89183m<? super RECEIVER, ? super Throwable, C89391z> mVar, AbstractC89183m<? super RECEIVER, ? super List<? extends T>, C89391z> mVar2) {
        C89219l.m154719c(bVar, "");
        C89219l.m154719c(mVar, "");
        C89219l.m154719c(mVar2, "");
        this.f48661i = new C20561g(bVar, mVar, mVar2);
        return this;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: com.bytedance.jedi.arch.h<? extends RECEIVER extends com.bytedance.jedi.arch.g> */
    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC20554a(AbstractC20553a<T, ?, ?> aVar, DEC dec, AbstractC20468h<? extends RECEIVER> hVar) {
        C89219l.m154719c(aVar, "");
        C89219l.m154719c(dec, "");
        C89219l.m154719c(hVar, "");
        this.f48666n = aVar;
        this.f48667o = dec;
        this.f48668p = hVar;
    }
}
