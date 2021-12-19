package com.p2082ss.android.ugc.aweme.geofencing.p3046b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.geofencing.api.TranslatedRegionApi;
import com.p2082ss.android.ugc.aweme.geofencing.p3047c.C52891a;
import com.p2082ss.android.ugc.aweme.geofencing.p3047c.C52892b;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.geofencing.b.a */
public final class C52880a {

    /* renamed from: a */
    public static List<C52891a> f121646a = C89086z.INSTANCE;

    /* renamed from: b */
    public static final C52880a f121647b = new C52880a();

    /* renamed from: c */
    private static final AbstractC89244h f121648c = C89250i.m154773a((AbstractC89171a) C52881a.f121649a);

    /* renamed from: a */
    public static C88411a m97731a() {
        return (C88411a) f121648c.getValue();
    }

    private C52880a() {
    }

    /* renamed from: com.ss.android.ugc.aweme.geofencing.b.a$a */
    static final class C52881a extends AbstractC89220m implements AbstractC89171a<C88411a> {

        /* renamed from: a */
        public static final C52881a f121649a = new C52881a();

        static {
            Covode.recordClassIndex(62286);
        }

        C52881a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C88411a invoke() {
            return new C88411a();
        }
    }

    static {
        Covode.recordClassIndex(62285);
    }

    /* renamed from: b */
    public static void m97734b() {
        if (f121646a.isEmpty()) {
            m97731a().mo142945a(TranslatedRegionApi.C52879a.m97730a().getTranslatedRegions().mo143248c(C52886f.f121654a).mo143234a(C88391a.m153580a(C88392a.f200660a)).mo143242b(C88925a.m154180b(C88946a.f201991c)).mo143236a(C52887g.f121655a).mo143252d(C52888h.f121656a).mo143253e(C52889i.f121657a));
        }
        C52890b.m97736a(f121646a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.geofencing.b.a$b */
    public static final class C52882b<T, R> implements AbstractC88434g {

        /* renamed from: a */
        public static final C52882b f121650a = new C52882b();

        static {
            Covode.recordClassIndex(62287);
        }

        C52882b() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            C52892b bVar = (C52892b) obj;
            C89219l.m154721d(bVar, "");
            return bVar.f121662a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.geofencing.b.a$d */
    public static final class C52884d<T, R> implements AbstractC88434g {

        /* renamed from: a */
        public static final C52884d f121652a = new C52884d();

        static {
            Covode.recordClassIndex(62289);
        }

        C52884d() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            C89219l.m154721d(obj, "");
            return C52890b.m97735a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.geofencing.b.a$e */
    public static final class C52885e<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C52885e f121653a = new C52885e();

        static {
            Covode.recordClassIndex(62290);
        }

        C52885e() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            List list = (List) obj;
            C89219l.m154716b(list, "");
            C52880a.f121646a = C89070n.m154580f((Iterable) list);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.geofencing.b.a$f */
    static final class C52886f<T, R> implements AbstractC88434g {

        /* renamed from: a */
        public static final C52886f f121654a = new C52886f();

        static {
            Covode.recordClassIndex(62291);
        }

        C52886f() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            C52892b bVar = (C52892b) obj;
            C89219l.m154721d(bVar, "");
            return bVar.f121662a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.geofencing.b.a$g */
    static final class C52887g<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C52887g f121655a = new C52887g();

        static {
            Covode.recordClassIndex(62292);
        }

        C52887g() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            List list = (List) obj;
            C89219l.m154716b(list, "");
            C52890b.m97736a(C89070n.m154580f((Iterable) list));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.geofencing.b.a$h */
    static final class C52888h<T, R> implements AbstractC88434g {

        /* renamed from: a */
        public static final C52888h f121656a = new C52888h();

        static {
            Covode.recordClassIndex(62293);
        }

        C52888h() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            C89219l.m154721d(obj, "");
            return C52890b.m97735a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.geofencing.b.a$i */
    static final class C52889i<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C52889i f121657a = new C52889i();

        static {
            Covode.recordClassIndex(62294);
        }

        C52889i() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            List list = (List) obj;
            C89219l.m154716b(list, "");
            C52880a.f121646a = C89070n.m154580f((Iterable) list);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.geofencing.b.a$c */
    public static final class C52883c<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ AbstractC89171a f121651a;

        static {
            Covode.recordClassIndex(62288);
        }

        C52883c(AbstractC89171a aVar) {
            this.f121651a = aVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            List list = (List) obj;
            this.f121651a.invoke();
            C89219l.m154716b(list, "");
            C52890b.m97736a(C89070n.m154580f((Iterable) list));
        }
    }

    /* renamed from: a */
    public static List<C52891a> m97732a(List<String> list) {
        if (list == null) {
            return C89086z.INSTANCE;
        }
        List<C52891a> a = C52890b.m97735a();
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            ListIterator<C52891a> listIterator = a.listIterator(a.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    break;
                }
                C52891a previous = listIterator.previous();
                if (C89219l.m154714a((Object) previous.getCode(), (Object) t)) {
                    if (previous != null) {
                        arrayList.add(previous);
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static void m97733a(AbstractC89171a<C89391z> aVar) {
        C89219l.m154721d(aVar, "");
        if (!f121646a.isEmpty()) {
            aVar.invoke();
        } else {
            m97731a().mo142945a(TranslatedRegionApi.C52879a.m97730a().getTranslatedRegions().mo143248c(C52882b.f121650a).mo143234a(C88391a.m153580a(C88392a.f200660a)).mo143242b(C88925a.m154180b(C88946a.f201991c)).mo143236a(new C52883c(aVar)).mo143252d(C52884d.f121652a).mo143253e(C52885e.f121653a));
        }
    }
}
