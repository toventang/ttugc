package com.bytedance.jedi.p1445a.p1461k;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.p1445a.p1448c.AbstractC20168e;
import com.bytedance.jedi.p1445a.p1448c.C20169f;
import com.bytedance.jedi.p1445a.p1459i.AbstractC20272a;
import com.bytedance.jedi.p1445a.p1462l.AbstractC20318a;
import com.bytedance.jedi.p1445a.p1462l.AbstractC20319b;
import com.bytedance.jedi.p1445a.p1462l.AbstractC20321d;
import com.bytedance.jedi.p1445a.p1462l.C20322e;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88984x;
import p4560f.p4561a.AbstractC88985y;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4560f.p4561a.p4567d.AbstractC88438k;
import p4560f.p4561a.p4568e.p4573e.p4578e.C88790v;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4589j.C88935b;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.C89388w;
import p4600h.C89391z;
import p4600h.p4601a.C89064i;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89207b;
import p4600h.p4611f.p4613b.C89216i;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89278d;

/* renamed from: com.bytedance.jedi.a.k.e */
public final class C20294e<K, V, K1, V1> {

    /* renamed from: d */
    public static final C20300b f48135d = new C20300b((byte) 0);

    /* renamed from: a */
    public final AbstractC20168e<K, V> f48136a;

    /* renamed from: b */
    public final AbstractC20168e<K1, V1> f48137b;

    /* renamed from: c */
    public final AbstractC20272a<K, V, K1, V1> f48138c;

    static {
        Covode.recordClassIndex(23802);
    }

    /* renamed from: com.bytedance.jedi.a.k.e$b */
    public static final class C20300b {
        static {
            Covode.recordClassIndex(23808);
        }

        private C20300b() {
        }

        public /* synthetic */ C20300b(byte b) {
            this();
        }

        /* renamed from: a */
        public static <T> boolean m38491a(T t, T t2) {
            Boolean bool;
            Boolean bool2;
            Boolean bool3;
            if (t != t2) {
                Boolean bool4 = null;
                if (C89064i.m154506g(new Object[]{t, t2}).size() == 2) {
                    bool = Boolean.valueOf(t instanceof AbstractC20291b);
                } else {
                    bool = null;
                }
                if (!C89219l.m154714a((Object) bool, (Object) true)) {
                    if (C89064i.m154506g(new Object[]{t, t2}).size() == 2) {
                        bool2 = Boolean.valueOf(t instanceof List);
                    } else {
                        bool2 = null;
                    }
                    if (!C89219l.m154714a((Object) bool2, (Object) true)) {
                        if (C89064i.m154506g(new Object[]{t, t2}).size() == 2) {
                            bool3 = Boolean.valueOf(t instanceof Object[]);
                        } else {
                            bool3 = null;
                        }
                        if (!C89219l.m154714a((Object) bool3, (Object) true)) {
                            if (C89064i.m154506g(new Object[]{t, t2}).size() == 2) {
                                bool4 = Boolean.valueOf(t instanceof Map);
                            }
                            if (!C89219l.m154714a((Object) bool4, (Object) true)) {
                                return C89219l.m154714a((Object) t2, (Object) t);
                            }
                            if (t != null) {
                                T t3 = t;
                                if (t2 != null) {
                                    T t4 = t2;
                                    if (t3.size() != t4.size()) {
                                        return false;
                                    }
                                    Set<Map.Entry<K, V>> entrySet = t3.entrySet();
                                    if (!(entrySet instanceof Collection) || !entrySet.isEmpty()) {
                                        Iterator<T> it = entrySet.iterator();
                                        if (it.hasNext()) {
                                            T next = it.next();
                                            Object key = next.getKey();
                                            Object value = next.getValue();
                                            if (t4.containsKey(key) && m38491a(value, t4.get(key))) {
                                                return true;
                                            }
                                            return false;
                                        }
                                    }
                                    return true;
                                }
                                throw new C89388w("null cannot be cast to non-null type");
                            }
                            throw new C89388w("null cannot be cast to non-null type");
                        } else if (t != null) {
                            Object[] objArr = (Object[]) t;
                            if (t2 != null) {
                                Object[] objArr2 = (Object[]) t2;
                                if (objArr.length != objArr2.length) {
                                    return false;
                                }
                                Iterator a = C89207b.m154693a(objArr);
                                Iterator a2 = C89207b.m154693a(objArr2);
                                while (a.hasNext() && a2.hasNext()) {
                                    if (!m38491a(a.next(), a2.next())) {
                                        return false;
                                    }
                                }
                                return true;
                            }
                            throw new C89388w("null cannot be cast to non-null type");
                        } else {
                            throw new C89388w("null cannot be cast to non-null type");
                        }
                    } else if (t != null) {
                        T t5 = t;
                        if (t2 != null) {
                            T t6 = t2;
                            if (t5.size() != t6.size()) {
                                return false;
                            }
                            ListIterator listIterator = t5.listIterator();
                            ListIterator listIterator2 = t6.listIterator();
                            while (listIterator.hasNext() && listIterator2.hasNext()) {
                                if (!m38491a(listIterator.next(), listIterator2.next())) {
                                    return false;
                                }
                            }
                            return true;
                        }
                        throw new C89388w("null cannot be cast to non-null type");
                    } else {
                        throw new C89388w("null cannot be cast to non-null type");
                    }
                } else if (t != null) {
                    T t7 = t;
                    if (t2 == null) {
                        C89219l.m154707a();
                    }
                    return t7.mo33653a();
                } else {
                    throw new C89388w("null cannot be cast to non-null type");
                }
            } else if ((t instanceof Collection) || (t instanceof Map) || (t instanceof Object[])) {
                return false;
            } else {
                return true;
            }
        }
    }

    /* renamed from: com.bytedance.jedi.a.k.e$g */
    public static final /* synthetic */ class C20316g extends C89216i implements AbstractC89172b<Throwable, C89391z> {

        /* renamed from: a */
        public static final C20316g f48167a = new C20316g();

        static {
            Covode.recordClassIndex(23824);
        }

        C20316g() {
            super(1);
        }

        @Override // p4600h.p4611f.p4613b.AbstractC89208c, p4600h.p4620k.AbstractC89276b
        public final String getName() {
            return "printStackTrace";
        }

        @Override // p4600h.p4611f.p4613b.AbstractC89208c
        public final String getSignature() {
            return "printStackTrace()V";
        }

        @Override // p4600h.p4611f.p4613b.AbstractC89208c
        public final AbstractC89278d getOwner() {
            return C89204ab.m154669a(Throwable.class);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Throwable th) {
            C89219l.m154719c(th, "");
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.jedi.a.k.e$a */
    static final class C20295a<V, K1, V1> implements AbstractC88985y<V, C89378p<? extends K1, ? extends V1>> {

        /* renamed from: a */
        public final AbstractC20168e<K1, V1> f48139a;

        /* renamed from: b */
        public final AbstractC20272a<?, V, K1, V1> f48140b;

        static {
            Covode.recordClassIndex(23803);
        }

        /* renamed from: com.bytedance.jedi.a.k.e$a$a */
        static final class C20296a<T, R> implements AbstractC88434g<T, Iterable<? extends U>> {

            /* renamed from: a */
            final /* synthetic */ C20295a f48141a;

            static {
                Covode.recordClassIndex(23804);
            }

            C20296a(C20295a aVar) {
                this.f48141a = aVar;
            }

            @Override // p4560f.p4561a.p4567d.AbstractC88434g
            public final /* synthetic */ Object apply(Object obj) {
                return ((AbstractC20272a.C20273a) this.f48141a.f48140b).f48117b.invoke(obj);
            }
        }

        /* renamed from: com.bytedance.jedi.a.k.e$a$b */
        static final class C20297b<T, R> implements AbstractC88434g<T, AbstractC88984x<? extends R>> {

            /* renamed from: a */
            final /* synthetic */ C20295a f48142a;

            static {
                Covode.recordClassIndex(23805);
            }

            C20297b(C20295a aVar) {
                this.f48142a = aVar;
            }

            /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: com.bytedance.jedi.a.c.e<K1, V1> */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // p4560f.p4561a.p4567d.AbstractC88434g
            public final /* synthetic */ Object apply(Object obj) {
                C89378p pVar = (C89378p) obj;
                C89219l.m154719c(pVar, "");
                final Object component1 = pVar.component1();
                final Object component2 = pVar.component2();
                return this.f48142a.f48139a.mo33474a(component1).mo143292d(new AbstractC88434g<T, R>(this) {
                    /* class com.bytedance.jedi.p1445a.p1461k.C20294e.C20295a.C20297b.C202981 */

                    /* renamed from: a */
                    final /* synthetic */ C20297b f48143a;

                    static {
                        Covode.recordClassIndex(23806);
                    }

                    {
                        this.f48143a = r1;
                    }

                    @Override // p4560f.p4561a.p4567d.AbstractC88434g
                    public final /* synthetic */ Object apply(Object obj) {
                        C20169f fVar = (C20169f) obj;
                        C89219l.m154719c(fVar, "");
                        Object a = fVar.mo33486a();
                        Object invoke = ((AbstractC20272a.C20273a) this.f48143a.f48142a.f48140b).f48118c.invoke((Object) component2, a);
                        if (!(!C89219l.m154714a(invoke, a))) {
                            invoke = null;
                        }
                        return C89387v.m154943a(component1, invoke);
                    }
                }).mo143268a(C202992.f48146a);
            }
        }

        @Override // p4560f.p4561a.AbstractC88985y
        /* renamed from: a */
        public final AbstractC88984x<C89378p<K1, V1>> mo17921a(AbstractC88979t<V> tVar) {
            C89219l.m154719c(tVar, "");
            if (this.f48140b instanceof AbstractC20272a.C20273a) {
                AbstractC88979t<R> a = tVar.mo143281b(new C20296a(this)).mo143267a((AbstractC88434g<? super U, ? extends AbstractC88984x<? extends R>>) new C20297b(this), false);
                C89219l.m154709a((Object) a, "");
                return a;
            }
            throw new RuntimeException();
        }

        public C20295a(AbstractC20168e<K1, V1> eVar, AbstractC20272a<?, V, K1, V1> aVar) {
            C89219l.m154719c(eVar, "");
            C89219l.m154719c(aVar, "");
            this.f48139a = eVar;
            this.f48140b = aVar;
        }
    }

    /* renamed from: com.bytedance.jedi.a.k.e$c */
    static final class C20301c<K, V, K1, V1> implements AbstractC88985y<C89378p<? extends K, ? extends V>, C89378p<? extends K1, ? extends V1>> {

        /* renamed from: a */
        public final AbstractC20168e<K1, V1> f48147a;

        /* renamed from: b */
        public final AbstractC20272a<K, V, K1, V1> f48148b;

        static {
            Covode.recordClassIndex(23809);
        }

        /* renamed from: com.bytedance.jedi.a.k.e$c$b */
        static final class C20308b<T> implements AbstractC88438k<C89378p<? extends K1, ? extends V1>> {

            /* renamed from: a */
            public static final C20308b f48159a = new C20308b();

            static {
                Covode.recordClassIndex(23816);
            }

            C20308b() {
            }

            @Override // p4560f.p4561a.p4567d.AbstractC88438k
            /* renamed from: a */
            public final /* synthetic */ boolean mo7718a(Object obj) {
                C89378p pVar = (C89378p) obj;
                C89219l.m154719c(pVar, "");
                if (pVar.getSecond() != null) {
                    return true;
                }
                return false;
            }
        }

        @Override // p4560f.p4561a.AbstractC88985y
        /* renamed from: a */
        public final AbstractC88984x<C89378p<K1, V1>> mo17921a(AbstractC88979t<C89378p<K, V>> tVar) {
            C89219l.m154719c(tVar, "");
            AbstractC88979t<R> a = tVar.mo143267a((AbstractC88434g<? super C89378p<K, V>, ? extends AbstractC88984x<? extends R>>) new C20302a(this), false).mo143268a(C20308b.f48159a);
            C89219l.m154709a((Object) a, "");
            return a;
        }

        /* renamed from: com.bytedance.jedi.a.k.e$c$a */
        static final class C20302a<T, R> implements AbstractC88434g<T, AbstractC88984x<? extends R>> {

            /* renamed from: a */
            final /* synthetic */ C20301c f48149a;

            static {
                Covode.recordClassIndex(23810);
            }

            C20302a(C20301c cVar) {
                this.f48149a = cVar;
            }

            @Override // p4560f.p4561a.p4567d.AbstractC88434g
            public final /* synthetic */ Object apply(Object obj) {
                C89378p pVar = (C89378p) obj;
                C89219l.m154719c(pVar, "");
                final Object component1 = pVar.component1();
                final Object component2 = pVar.component2();
                AbstractC20272a<K, V, K1, V1> aVar = this.f48149a.f48148b;
                if (aVar instanceof AbstractC20272a.C20278c) {
                    return AbstractC88979t.m154310b(((AbstractC20272a.C20278c) this.f48149a.f48148b).f48122b.invoke(component1, component2)).mo143267a((AbstractC88434g) new AbstractC88434g<T, AbstractC88984x<? extends R>>(this) {
                        /* class com.bytedance.jedi.p1445a.p1461k.C20294e.C20301c.C20302a.C203031 */

                        /* renamed from: a */
                        final /* synthetic */ C20302a f48150a;

                        static {
                            Covode.recordClassIndex(23811);
                        }

                        {
                            this.f48150a = r1;
                        }

                        @Override // p4560f.p4561a.p4567d.AbstractC88434g
                        public final /* synthetic */ Object apply(final Object obj) {
                            return this.f48150a.f48149a.f48147a.mo33474a(obj).mo143292d(new AbstractC88434g<T, R>() {
                                /* class com.bytedance.jedi.p1445a.p1461k.C20294e.C20301c.C20302a.C203031.C203041 */

                                static {
                                    Covode.recordClassIndex(23812);
                                }

                                @Override // p4560f.p4561a.p4567d.AbstractC88434g
                                public final /* synthetic */ Object apply(Object obj) {
                                    C20169f fVar = (C20169f) obj;
                                    C89219l.m154719c(fVar, "");
                                    return C89387v.m154943a(obj, fVar.mo33486a());
                                }
                            });
                        }
                    }, false).mo143292d(new AbstractC88434g<T, R>(this) {
                        /* class com.bytedance.jedi.p1445a.p1461k.C20294e.C20301c.C20302a.C203052 */

                        /* renamed from: a */
                        final /* synthetic */ C20302a f48152a;

                        static {
                            Covode.recordClassIndex(23813);
                        }

                        {
                            this.f48152a = r1;
                        }

                        @Override // p4560f.p4561a.p4567d.AbstractC88434g
                        public final /* synthetic */ Object apply(Object obj) {
                            C89378p pVar = (C89378p) obj;
                            C89219l.m154719c(pVar, "");
                            Object component1 = pVar.component1();
                            Object component2 = pVar.component2();
                            Object invoke = ((AbstractC20272a.C20278c) this.f48152a.f48149a.f48148b).f48123c.invoke((Object) component1, (Object) component2, component2);
                            if (C20300b.m38491a(invoke, component2)) {
                                invoke = null;
                            }
                            return C89387v.m154943a(component1, invoke);
                        }
                    });
                }
                if (aVar instanceof AbstractC20272a.C20281d) {
                    return C88935b.m154196a(this.f48149a.f48147a.mo33473a()).mo143268a(new AbstractC88438k<C89378p<? extends K1, ? extends V1>>(this) {
                        /* class com.bytedance.jedi.p1445a.p1461k.C20294e.C20301c.C20302a.C203063 */

                        /* renamed from: a */
                        final /* synthetic */ C20302a f48155a;

                        static {
                            Covode.recordClassIndex(23814);
                        }

                        {
                            this.f48155a = r1;
                        }

                        @Override // p4560f.p4561a.p4567d.AbstractC88438k
                        /* renamed from: a */
                        public final /* synthetic */ boolean mo7718a(Object obj) {
                            C89378p pVar = (C89378p) obj;
                            C89219l.m154719c(pVar, "");
                            Object component2 = pVar.component2();
                            if (C89064i.m154506g(new Object[]{component2, component2}).size() == 2) {
                                AbstractC89183m<? super V, ? super V1, Boolean> mVar = ((AbstractC20272a.C20281d) this.f48155a.f48149a.f48148b).f48126b;
                                Object obj2 = (Object) component2;
                                if (obj2 == 0) {
                                    C89219l.m154707a();
                                }
                                if (component2 == null) {
                                    C89219l.m154707a();
                                }
                                Boolean valueOf = Boolean.valueOf(mVar.invoke(obj2, component2).booleanValue());
                                if (valueOf != null) {
                                    return valueOf.booleanValue();
                                }
                            }
                            return false;
                        }
                    }).mo143292d(new AbstractC88434g<T, R>(this) {
                        /* class com.bytedance.jedi.p1445a.p1461k.C20294e.C20301c.C20302a.C203074 */

                        /* renamed from: a */
                        final /* synthetic */ C20302a f48157a;

                        static {
                            Covode.recordClassIndex(23815);
                        }

                        {
                            this.f48157a = r1;
                        }

                        @Override // p4560f.p4561a.p4567d.AbstractC88434g
                        public final /* synthetic */ Object apply(Object obj) {
                            C89378p pVar = (C89378p) obj;
                            C89219l.m154719c(pVar, "");
                            Object component1 = pVar.component1();
                            Object component2 = pVar.component2();
                            AbstractC89183m<? super V, ? super V1, ? extends V1> mVar = ((AbstractC20272a.C20281d) this.f48157a.f48149a.f48148b).f48127c;
                            Object obj2 = (Object) component2;
                            if (obj2 == 0) {
                                C89219l.m154707a();
                            }
                            if (component2 == null) {
                                C89219l.m154707a();
                            }
                            Object invoke = mVar.invoke(obj2, component2);
                            if (C20300b.m38491a(invoke, component2)) {
                                invoke = null;
                            }
                            return C89387v.m154943a(component1, invoke);
                        }
                    });
                }
                throw new RuntimeException();
            }
        }

        public C20301c(AbstractC20168e<K1, V1> eVar, AbstractC20272a<K, V, K1, V1> aVar) {
            C89219l.m154719c(eVar, "");
            C89219l.m154719c(aVar, "");
            this.f48147a = eVar;
            this.f48148b = aVar;
        }
    }

    /* renamed from: com.bytedance.jedi.a.k.e$d */
    public static final class C20309d<T> implements AbstractC88438k<AbstractC20319b<C89378p<? extends K, ? extends V>>> {

        /* renamed from: a */
        final /* synthetic */ C20294e f48160a;

        static {
            Covode.recordClassIndex(23817);
        }

        public C20309d(C20294e eVar) {
            this.f48160a = eVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88438k
        /* renamed from: a */
        public final /* synthetic */ boolean mo7718a(Object obj) {
            AbstractC20319b bVar = (AbstractC20319b) obj;
            C89219l.m154719c(bVar, "");
            AbstractC20318a<C89378p<K1, V1>> c = this.f48160a.f48137b.mo33484c();
            if (c == null || bVar.mo33656a((AbstractC20318a<?>) c)) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: com.bytedance.jedi.a.k.e$f */
    public static final class C20315f<T> implements AbstractC88433f<AbstractC20319b<C89378p<? extends K1, ? extends V1>>> {

        /* renamed from: a */
        final /* synthetic */ C20294e f48166a;

        static {
            Covode.recordClassIndex(23823);
        }

        public C20315f(C20294e eVar) {
            this.f48166a = eVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            AbstractC20319b<T> bVar = (AbstractC20319b) obj;
            AbstractC20168e<K1, V1> eVar = this.f48166a.f48137b;
            if (!(eVar instanceof AbstractC20321d)) {
                eVar = null;
            }
            AbstractC20321d dVar = (AbstractC20321d) eVar;
            if (dVar != null) {
                C89219l.m154709a((Object) bVar, "");
                dVar.mo33479b(bVar);
            }
        }
    }

    /* renamed from: com.bytedance.jedi.a.k.e$e */
    public static final class C20310e<T, R> implements AbstractC88434g<T, AbstractC88984x<? extends R>> {

        /* renamed from: a */
        final /* synthetic */ C20294e f48161a;

        static {
            Covode.recordClassIndex(23818);
        }

        public C20310e(C20294e eVar) {
            this.f48161a = eVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            AbstractC88979t<R> a;
            final AbstractC20319b bVar = (AbstractC20319b) obj;
            C89219l.m154719c(bVar, "");
            if (this.f48161a.f48138c instanceof AbstractC20272a.C20273a) {
                a = AbstractC88979t.m154310b(bVar.mo33655a()).mo143268a(C203111.f48162a).mo143292d(C203122.f48163a).mo143271a(new C20295a(this.f48161a.f48137b, this.f48161a.f48138c));
            } else {
                a = AbstractC88979t.m154310b(bVar.mo33655a()).mo143271a(new C20301c(this.f48161a.f48137b, this.f48161a.f48138c));
            }
            return a.mo143292d(new AbstractC88434g<T, R>() {
                /* class com.bytedance.jedi.p1445a.p1461k.C20294e.C20310e.C203133 */

                static {
                    Covode.recordClassIndex(23821);
                }

                @Override // p4560f.p4561a.p4567d.AbstractC88434g
                public final /* synthetic */ Object apply(Object obj) {
                    C89219l.m154719c(obj, "");
                    AbstractC20319b bVar = bVar;
                    C89219l.m154709a((Object) bVar, "");
                    return C20322e.C20323a.m38511a(obj, bVar);
                }
            }).mo143264a(C203144.f48165a).mo143287c(C88925a.m154171a(C88790v.f201616a)).mo143282b(C88925a.m154171a(C88790v.f201616a));
        }
    }

    public C20294e(AbstractC20168e<K, V> eVar, AbstractC20168e<K1, V1> eVar2, AbstractC20272a<K, V, K1, V1> aVar) {
        C89219l.m154719c(eVar, "");
        C89219l.m154719c(eVar2, "");
        C89219l.m154719c(aVar, "");
        this.f48136a = eVar;
        this.f48137b = eVar2;
        this.f48138c = aVar;
    }
}
