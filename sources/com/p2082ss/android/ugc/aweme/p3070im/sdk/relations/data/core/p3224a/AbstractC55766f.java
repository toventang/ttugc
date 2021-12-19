package com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.p3224a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3263m.C56244a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p4560f.p4561a.AbstractC88398aa;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88982v;
import p4560f.p4561a.AbstractC88983w;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89217j;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.f */
public abstract class AbstractC55766f<T, R> extends AbstractC55765e<R> {

    /* renamed from: q */
    public static final C55768b f127180q = new C55768b((byte) 0);

    /* renamed from: a */
    private final AbstractC89244h f127181a = C89250i.m154773a((AbstractC89171a) C55770d.f127193a);

    /* renamed from: b */
    private final AbstractC89172b<List<? extends T>, List<R>> f127182b = new C55769c(this);

    /* renamed from: h */
    public AbstractC89172b<? super T, Boolean> f127183h;

    /* renamed from: i */
    public AbstractC89172b<? super List<? extends T>, ? extends List<? extends T>> f127184i;

    /* renamed from: j */
    public AbstractC89172b<? super R, Boolean> f127185j;

    /* renamed from: k */
    public AbstractC89172b<? super List<? extends R>, ? extends List<? extends R>> f127186k;

    /* renamed from: l */
    public AbstractC88398aa f127187l;

    /* renamed from: m */
    public AbstractC88398aa f127188m;

    /* renamed from: n */
    public int f127189n = -1;

    /* renamed from: o */
    volatile boolean f127190o = true;

    /* renamed from: p */
    public volatile boolean f127191p;

    static {
        Covode.recordClassIndex(65552);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract AbstractC89172b<T, R> mo92632a();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract List<T> mo92633c();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract List<T> mo92634d();

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final C88411a mo92644f() {
        return (C88411a) this.f127181a.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.f$b */
    public static final class C55768b {
        static {
            Covode.recordClassIndex(65554);
        }

        private C55768b() {
        }

        public /* synthetic */ C55768b(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.p3224a.AbstractC55765e
    public final boolean bO_() {
        return this.f127191p;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.p3224a.AbstractC55765e
    /* renamed from: e */
    public final boolean mo92627e() {
        return this.f127190o;
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.f$d */
    static final class C55770d extends AbstractC89220m implements AbstractC89171a<C88411a> {

        /* renamed from: a */
        public static final C55770d f127193a = new C55770d();

        static {
            Covode.recordClassIndex(65556);
        }

        C55770d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C88411a invoke() {
            return new C88411a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.f$e */
    static final /* synthetic */ class C55771e extends C89217j implements AbstractC89171a<List<T>> {
        static {
            Covode.recordClassIndex(65557);
        }

        C55771e(AbstractC55766f fVar) {
            super(0, fVar, AbstractC55766f.class, "loadInternal", "loadInternal()Ljava/util/List;", 0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Object invoke() {
            return ((AbstractC55766f) this.receiver).mo92633c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.f$f */
    static final /* synthetic */ class C55772f extends C89217j implements AbstractC89171a<List<T>> {
        static {
            Covode.recordClassIndex(65558);
        }

        C55772f(AbstractC55766f fVar) {
            super(0, fVar, AbstractC55766f.class, "loadMoreInternal", "loadMoreInternal()Ljava/util/List;", 0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Object invoke() {
            return ((AbstractC55766f) this.receiver).mo92634d();
        }
    }

    /* renamed from: g */
    public final List<R> mo92645g() {
        return mo92643a(mo92633c());
    }

    /* renamed from: h */
    public final List<R> mo92646h() {
        return mo92643a(mo92634d());
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.p3224a.AbstractC55765e
    /* renamed from: b */
    public boolean mo92623b() {
        if (this.f127191p || this.f127187l == null || this.f127188m == null || !super.mo92623b()) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.p3224a.AbstractC55765e
    public final void bM_() {
        if (mo92623b()) {
            m101537a(false, (AbstractC89171a) new C55771e(this));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.p3224a.AbstractC55765e
    public final void bN_() {
        if (mo92623b()) {
            m101537a(true, (AbstractC89171a) new C55772f(this));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.f$a */
    public static abstract class AbstractC55767a<LOADER extends AbstractC55766f<T, R>, T, R> {
        static {
            Covode.recordClassIndex(65553);
        }

        /* renamed from: a */
        public abstract LOADER mo92638a();

        /* renamed from: b */
        public abstract LOADER mo92639b();

        /* renamed from: a */
        public final AbstractC55767a<LOADER, T, R> mo92647a(int i) {
            mo92638a().f127189n = i;
            return this;
        }

        /* renamed from: a */
        public final AbstractC55767a<LOADER, T, R> mo92648a(AbstractC89172b<? super List<? extends T>, ? extends List<? extends T>> bVar) {
            C89219l.m154721d(bVar, "");
            mo92638a().f127184i = bVar;
            return this;
        }

        /* renamed from: b */
        public final AbstractC55767a<LOADER, T, R> mo92649b(AbstractC89172b<? super R, Boolean> bVar) {
            C89219l.m154721d(bVar, "");
            mo92638a().f127185j = bVar;
            return this;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.f$h */
    public static final class C55774h<T, R> implements AbstractC88434g {

        /* renamed from: a */
        final /* synthetic */ AbstractC55766f f127195a;

        static {
            Covode.recordClassIndex(65560);
        }

        C55774h(AbstractC55766f fVar) {
            this.f127195a = fVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            List<T> list = (List) obj;
            C89219l.m154721d(list, "");
            return this.f127195a.mo92643a(list);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.f$g */
    public static final class C55773g<T> implements AbstractC88983w {

        /* renamed from: a */
        final /* synthetic */ AbstractC89171a f127194a;

        static {
            Covode.recordClassIndex(65559);
        }

        C55773g(AbstractC89171a aVar) {
            this.f127194a = aVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: f.a.v<java.util.List<T>> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // p4560f.p4561a.AbstractC88983w
        public final void subscribe(AbstractC88982v<List<T>> vVar) {
            C89219l.m154721d(vVar, "");
            try {
                vVar.mo143031a((List<T>) this.f127194a.invoke());
            } catch (Throwable th) {
                vVar.mo143024a(th);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.f$i */
    public static final class C55775i<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ AbstractC55766f f127196a;

        /* renamed from: b */
        final /* synthetic */ boolean f127197b;

        static {
            Covode.recordClassIndex(65561);
        }

        C55775i(AbstractC55766f fVar, boolean z) {
            this.f127196a = fVar;
            this.f127197b = z;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            List<R> list = (List) obj;
            this.f127196a.f127191p = false;
            AbstractC55766f fVar = this.f127196a;
            C89219l.m154716b(list, "");
            fVar.mo92642a(list, this.f127197b);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.f$j */
    public static final class C55776j<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ AbstractC55766f f127198a;

        /* renamed from: b */
        final /* synthetic */ boolean f127199b;

        static {
            Covode.recordClassIndex(65562);
        }

        C55776j(AbstractC55766f fVar, boolean z) {
            this.f127198a = fVar;
            this.f127199b = z;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            this.f127198a.f127191p = false;
            AbstractC55766f fVar = this.f127198a;
            C89219l.m154716b(th, "");
            fVar.mo92641a(th, this.f127199b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.f$c */
    static final class C55769c extends AbstractC89220m implements AbstractC89172b<List<? extends T>, List<? extends R>> {

        /* renamed from: a */
        final /* synthetic */ AbstractC55766f f127192a;

        static {
            Covode.recordClassIndex(65555);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55769c(AbstractC55766f fVar) {
            super(1);
            this.f127192a = fVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Object invoke(Object obj) {
            List<T> list = (List) obj;
            C89219l.m154721d(list, "");
            ArrayList arrayList = new ArrayList();
            for (T t : list) {
                R invoke = this.f127192a.mo92632a().invoke(t);
                if (invoke != null) {
                    arrayList.add(invoke);
                }
            }
            return arrayList;
        }
    }

    /* renamed from: a */
    public final List<R> mo92643a(List<T> list) {
        boolean z;
        if (this.f127189n <= 0 || list.size() < this.f127189n) {
            z = false;
        } else {
            z = true;
        }
        this.f127190o = z;
        return C89070n.m154585g((Collection) m101538b(m101536a(m101539c(m101538b(m101536a(list, this.f127183h), this.f127184i), mo92632a()), this.f127185j), this.f127186k));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: java.util.List<? extends D> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    private static <D> List<D> m101536a(List<? extends D> list, AbstractC89172b<? super D, Boolean> bVar) {
        Class<?> cls;
        StringBuilder sb = new StringBuilder("Start filtering ");
        if (bVar != null) {
            cls = bVar.getClass();
        } else {
            cls = null;
        }
        C56244a.m102191c("Loader", sb.append(cls).append(" list size: ").append(list.size()).toString());
        if (bVar == null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Object obj = (Object) it.next();
            if (bVar.invoke(obj).booleanValue()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = arrayList;
        C56244a.m102191c("Loader", "finish filtering " + bVar.getClass() + " list size: " + arrayList2.size());
        return arrayList2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: java.util.List<? extends D> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    private static <D> List<D> m101538b(List<? extends D> list, AbstractC89172b<? super List<? extends D>, ? extends List<? extends D>> bVar) {
        Class<?> cls;
        List<D> list2;
        Class<?> cls2;
        StringBuilder sb = new StringBuilder("Start collating ");
        Integer num = null;
        if (bVar != null) {
            cls = bVar.getClass();
        } else {
            cls = null;
        }
        C56244a.m102191c("Loader", sb.append(cls).append(" list size: ").append(list.size()).toString());
        if (bVar != null) {
            list2 = (List) bVar.invoke(list);
        } else {
            list2 = null;
        }
        StringBuilder sb2 = new StringBuilder("finish collating ");
        if (bVar != null) {
            cls2 = bVar.getClass();
        } else {
            cls2 = null;
        }
        StringBuilder append = sb2.append(cls2).append(" list size: ");
        if (list2 != null) {
            num = Integer.valueOf(list2.size());
        }
        C56244a.m102191c("Loader", append.append(num).toString());
        return list2 == null ? list : list2;
    }

    /* renamed from: c */
    private static <D, F> List<F> m101539c(List<? extends D> list, AbstractC89172b<? super D, ? extends F> bVar) {
        C56244a.m102191c("Loader", "Start converting list size: " + list.size());
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Object invoke = bVar.invoke(it.next());
            if (invoke != null) {
                arrayList.add(invoke);
            }
        }
        C56244a.m102191c("Loader", "finish converting list size: " + list.size());
        return arrayList;
    }

    /* renamed from: a */
    private final void m101537a(boolean z, AbstractC89171a<? extends List<T>> aVar) {
        this.f127191p = true;
        AbstractC88979t a = AbstractC88979t.m154294a(new C55773g(aVar));
        AbstractC88398aa aaVar = this.f127187l;
        if (aaVar == null) {
            C89219l.m154710a("subscribeScheduler");
        }
        AbstractC88979t<R> d = a.mo143278b(aaVar).mo143292d(new C55774h(this));
        AbstractC88398aa aaVar2 = this.f127188m;
        if (aaVar2 == null) {
            C89219l.m154710a("observeScheduler");
        }
        AbstractC88412b a2 = d.mo143261a(aaVar2).mo143254a(new C55775i(this, z), new C55776j(this, z));
        mo92644f().mo142944a();
        mo92644f().mo142945a(a2);
    }
}
