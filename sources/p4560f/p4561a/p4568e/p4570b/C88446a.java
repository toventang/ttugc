package p4560f.p4561a.p4568e.p4570b;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import org.p4663a.AbstractC90215d;
import p4560f.p4561a.p4566c.C88424d;
import p4560f.p4561a.p4567d.AbstractC88428a;
import p4560f.p4561a.p4567d.AbstractC88430c;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4560f.p4561a.p4567d.AbstractC88435h;
import p4560f.p4561a.p4567d.AbstractC88437j;
import p4560f.p4561a.p4567d.AbstractC88438k;
import p4560f.p4561a.p4587h.C88925a;

/* renamed from: f.a.e.b.a */
public final class C88446a {

    /* renamed from: a */
    public static final AbstractC88434g<Object, Object> f200695a = new C88459m();

    /* renamed from: b */
    public static final Runnable f200696b = new RunnableC88455i();

    /* renamed from: c */
    public static final AbstractC88428a f200697c = new C88452f();

    /* renamed from: d */
    public static final AbstractC88433f<Object> f200698d = new C88453g();

    /* renamed from: e */
    public static final AbstractC88433f<Throwable> f200699e = new C88456j();

    /* renamed from: f */
    public static final AbstractC88433f<Throwable> f200700f = new C88464r();

    /* renamed from: g */
    public static final AbstractC88437j f200701g = new C88454h();

    /* renamed from: h */
    public static final AbstractC88438k<Object> f200702h = new C88465s();

    /* renamed from: i */
    static final AbstractC88438k<Object> f200703i = new C88457k();

    /* renamed from: j */
    static final Callable<Object> f200704j = new CallableC88463q();

    /* renamed from: k */
    static final Comparator<Object> f200705k = new C88462p();

    /* renamed from: l */
    public static final AbstractC88433f<AbstractC90215d> f200706l = new C88461o();

    /* renamed from: f.a.e.b.a$f */
    static final class C88452f implements AbstractC88428a {
        static {
            Covode.recordClassIndex(104494);
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88428a
        /* renamed from: a */
        public final void mo8579a() {
        }

        public final String toString() {
            return "EmptyAction";
        }

        C88452f() {
        }
    }

    /* renamed from: f.a.e.b.a$g */
    static final class C88453g implements AbstractC88433f<Object> {
        static {
            Covode.recordClassIndex(104495);
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final void accept(Object obj) {
        }

        public final String toString() {
            return "EmptyConsumer";
        }

        C88453g() {
        }
    }

    /* renamed from: f.a.e.b.a$h */
    static final class C88454h implements AbstractC88437j {
        static {
            Covode.recordClassIndex(104496);
        }

        C88454h() {
        }
    }

    /* renamed from: f.a.e.b.a$i */
    static final class RunnableC88455i implements Runnable {
        static {
            Covode.recordClassIndex(104497);
        }

        public final void run() {
        }

        public final String toString() {
            return "EmptyRunnable";
        }

        RunnableC88455i() {
        }
    }

    /* renamed from: f.a.e.b.a$j */
    static final class C88456j implements AbstractC88433f<Throwable> {
        static {
            Covode.recordClassIndex(104498);
        }

        C88456j() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Throwable th) {
            C88925a.m154178a(th);
        }
    }

    /* renamed from: f.a.e.b.a$k */
    static final class C88457k implements AbstractC88438k<Object> {
        static {
            Covode.recordClassIndex(104499);
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88438k
        /* renamed from: a */
        public final boolean mo7718a(Object obj) {
            return false;
        }

        C88457k() {
        }
    }

    /* renamed from: f.a.e.b.a$m */
    static final class C88459m implements AbstractC88434g<Object, Object> {
        static {
            Covode.recordClassIndex(104501);
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final Object apply(Object obj) {
            return obj;
        }

        public final String toString() {
            return "IdentityFunction";
        }

        C88459m() {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f.a.e.b.a$n */
    public static final class CallableC88460n<T, U> implements AbstractC88434g<T, U>, Callable<U> {

        /* renamed from: a */
        final U f200714a;

        static {
            Covode.recordClassIndex(104502);
        }

        @Override // java.util.concurrent.Callable
        public final U call() {
            return this.f200714a;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final U apply(T t) {
            return this.f200714a;
        }

        CallableC88460n(U u) {
            this.f200714a = u;
        }
    }

    /* renamed from: f.a.e.b.a$o */
    static final class C88461o implements AbstractC88433f<AbstractC90215d> {
        static {
            Covode.recordClassIndex(104503);
        }

        C88461o() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(AbstractC90215d dVar) {
            dVar.request(Long.MAX_VALUE);
        }
    }

    /* renamed from: f.a.e.b.a$p */
    static final class C88462p implements Comparator<Object> {
        static {
            Covode.recordClassIndex(104504);
        }

        C88462p() {
        }

        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ((Comparable) obj).compareTo(obj2);
        }
    }

    /* renamed from: f.a.e.b.a$q */
    static final class CallableC88463q implements Callable<Object> {
        static {
            Covode.recordClassIndex(104505);
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            return null;
        }

        CallableC88463q() {
        }
    }

    /* renamed from: f.a.e.b.a$r */
    static final class C88464r implements AbstractC88433f<Throwable> {
        static {
            Covode.recordClassIndex(104506);
        }

        C88464r() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Throwable th) {
            C88925a.m154178a(new C88424d(th));
        }
    }

    /* renamed from: f.a.e.b.a$s */
    static final class C88465s implements AbstractC88438k<Object> {
        static {
            Covode.recordClassIndex(104507);
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88438k
        /* renamed from: a */
        public final boolean mo7718a(Object obj) {
            return true;
        }

        C88465s() {
        }
    }

    /* renamed from: f.a.e.b.a$c */
    public static final class CallableC88449c<T> implements Callable<List<T>> {

        /* renamed from: a */
        final int f200709a = 16;

        static {
            Covode.recordClassIndex(104491);
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            return new ArrayList(this.f200709a);
        }

        public CallableC88449c(int i) {
        }
    }

    /* renamed from: f.a.e.b.a$l */
    public enum EnumC88458l implements Callable<Set<Object>> {
        INSTANCE;

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Set<Object> call() {
            return new HashSet();
        }

        static {
            Covode.recordClassIndex(104500);
        }
    }

    static {
        Covode.recordClassIndex(104488);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f.a.e.b.a$a */
    public static final class C88447a<T1, T2, R> implements AbstractC88434g<Object[], R> {

        /* renamed from: a */
        final AbstractC88430c<? super T1, ? super T2, ? extends R> f200707a;

        static {
            Covode.recordClassIndex(104489);
        }

        C88447a(AbstractC88430c<? super T1, ? super T2, ? extends R> cVar) {
            this.f200707a = cVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object[] objArr) {
            Object[] objArr2 = objArr;
            if (objArr2.length == 2) {
                return this.f200707a.mo9210a(objArr2[0], objArr2[1]);
            }
            throw new IllegalArgumentException("Array of size 2 expected but got " + objArr2.length);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f.a.e.b.a$b */
    public static final class C88448b<T1, T2, T3, R> implements AbstractC88434g<Object[], R> {

        /* renamed from: a */
        final AbstractC88435h<T1, T2, T3, R> f200708a;

        static {
            Covode.recordClassIndex(104490);
        }

        C88448b(AbstractC88435h<T1, T2, T3, R> hVar) {
            this.f200708a = hVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: f.a.d.h<T1, T2, T3, R> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object[] objArr) {
            Object[] objArr2 = objArr;
            if (objArr2.length == 3) {
                return this.f200708a.mo9211a(objArr2[0], objArr2[1], objArr2[2]);
            }
            throw new IllegalArgumentException("Array of size 3 expected but got " + objArr2.length);
        }
    }

    /* renamed from: f.a.e.b.a$d */
    public static final class C88450d<T, U> implements AbstractC88434g<T, U> {

        /* renamed from: a */
        final Class<U> f200710a;

        static {
            Covode.recordClassIndex(104492);
        }

        public C88450d(Class<U> cls) {
            this.f200710a = cls;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final U apply(T t) {
            return this.f200710a.cast(t);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f.a.e.b.a$e */
    public static final class C88451e<T, U> implements AbstractC88438k<T> {

        /* renamed from: a */
        final Class<U> f200711a;

        static {
            Covode.recordClassIndex(104493);
        }

        C88451e(Class<U> cls) {
            this.f200711a = cls;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88438k
        /* renamed from: a */
        public final boolean mo7718a(T t) {
            return this.f200711a.isInstance(t);
        }
    }

    /* renamed from: a */
    public static <T, U> AbstractC88438k<T> m153689a(Class<U> cls) {
        return new C88451e(cls);
    }

    /* renamed from: b */
    public static <T, U> AbstractC88434g<T, U> m153691b(U u) {
        return new CallableC88460n(u);
    }

    /* renamed from: a */
    public static <T1, T2, R> AbstractC88434g<Object[], R> m153687a(AbstractC88430c<? super T1, ? super T2, ? extends R> cVar) {
        C88466b.m153697a((Object) cVar, "f is null");
        return new C88447a(cVar);
    }

    /* renamed from: a */
    public static <T1, T2, T3, R> AbstractC88434g<Object[], R> m153688a(AbstractC88435h<T1, T2, T3, R> hVar) {
        C88466b.m153697a((Object) hVar, "f is null");
        return new C88448b(hVar);
    }

    /* renamed from: a */
    public static <T> Callable<T> m153690a(T t) {
        return new CallableC88460n(t);
    }
}
