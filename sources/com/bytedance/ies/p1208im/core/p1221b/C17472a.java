package com.bytedance.ies.p1208im.core.p1221b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1208im.core.api.p1211b.p1212a.AbstractC17425d;
import com.bytedance.p1399im.core.p1407c.C19512f;
import com.bytedance.p1399im.core.p1408d.C19536ag;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import com.bytedance.p1399im.core.p1408d.C19587an;
import com.bytedance.p1399im.core.p1408d.C19593ar;
import com.bytedance.p1399im.core.p1408d.C19600ay;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.im.core.b.a */
public final class C17472a implements AbstractC17425d {

    /* renamed from: a */
    public static final C17472a f41830a = new C17472a();

    /* renamed from: b */
    private static final AbstractC89244h f41831b = C89250i.m154773a((AbstractC89171a) C17473a.f41832a);

    /* renamed from: a */
    public static CopyOnWriteArraySet<AbstractC17425d> m32450a() {
        return (CopyOnWriteArraySet) f41831b.getValue();
    }

    private C17472a() {
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1211b.p1212a.AbstractC17425d, com.bytedance.p1399im.core.p1408d.AbstractC19674v
    /* renamed from: a */
    public final void mo27795a(List<C19538ai> list, int i, C19593ar arVar) {
        C89219l.m154721d(arVar, "");
        m32451a(new C17476d(list, i, arVar));
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1211b.p1212a.AbstractC17425d, com.bytedance.p1399im.core.p1408d.AbstractC19674v
    /* renamed from: a */
    public final void mo27796a(List<C19538ai> list, int i, String str) {
        m32451a(new C17480h(list, i, str));
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1211b.p1212a.AbstractC17425d, com.bytedance.p1399im.core.p1408d.AbstractC19674v
    /* renamed from: a */
    public final void mo27798a(List<C19538ai> list, boolean z) {
        m32451a(new C17479g(list, z));
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1211b.p1212a.AbstractC17425d, com.bytedance.p1399im.core.p1408d.AbstractC19674v
    /* renamed from: a */
    public final void mo27797a(List<C19538ai> list, Map<String, Map<String, String>> map) {
        Integer num;
        Integer num2;
        m32451a(new C17484l(list, map));
        StringBuilder sb = new StringBuilder("onUpdateMessage with ");
        if (list != null) {
            num = Integer.valueOf(list.size());
        } else {
            num = null;
        }
        StringBuilder append = sb.append(num).append(" && ");
        if (map != null) {
            num2 = Integer.valueOf(map.size());
        } else {
            num2 = null;
        }
        C19512f.m36450a("GlobalMsgObserver", append.append(num2).toString(), (Throwable) null);
    }

    /* renamed from: com.bytedance.ies.im.core.b.a$a */
    static final class C17473a extends AbstractC89220m implements AbstractC89171a<CopyOnWriteArraySet<AbstractC17425d>> {

        /* renamed from: a */
        public static final C17473a f41832a = new C17473a();

        static {
            Covode.recordClassIndex(19962);
        }

        C17473a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ CopyOnWriteArraySet<AbstractC17425d> invoke() {
            return new CopyOnWriteArraySet();
        }
    }

    static {
        Covode.recordClassIndex(19961);
    }

    /* renamed from: com.bytedance.ies.im.core.b.a$c */
    static final class C17475c extends AbstractC89220m implements AbstractC89172b<AbstractC17425d, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C19538ai f41835a;

        static {
            Covode.recordClassIndex(19964);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C17475c(C19538ai aiVar) {
            super(1);
            this.f41835a = aiVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AbstractC17425d dVar) {
            AbstractC17425d dVar2 = dVar;
            C89219l.m154721d(dVar2, "");
            dVar2.mo27792a(this.f41835a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.ies.im.core.b.a$b */
    static final class C17474b extends AbstractC89220m implements AbstractC89172b<AbstractC17425d, C89391z> {

        /* renamed from: a */
        final /* synthetic */ int f41833a;

        /* renamed from: b */
        final /* synthetic */ C19538ai f41834b;

        static {
            Covode.recordClassIndex(19963);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C17474b(int i, C19538ai aiVar) {
            super(1);
            this.f41833a = i;
            this.f41834b = aiVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AbstractC17425d dVar) {
            AbstractC17425d dVar2 = dVar;
            C89219l.m154721d(dVar2, "");
            dVar2.mo27789a(this.f41833a, this.f41834b);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.ies.im.core.b.a$d */
    static final class C17476d extends AbstractC89220m implements AbstractC89172b<AbstractC17425d, C89391z> {

        /* renamed from: a */
        final /* synthetic */ List f41836a;

        /* renamed from: b */
        final /* synthetic */ int f41837b;

        /* renamed from: c */
        final /* synthetic */ C19593ar f41838c;

        static {
            Covode.recordClassIndex(19965);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C17476d(List list, int i, C19593ar arVar) {
            super(1);
            this.f41836a = list;
            this.f41837b = i;
            this.f41838c = arVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AbstractC17425d dVar) {
            AbstractC17425d dVar2 = dVar;
            C89219l.m154721d(dVar2, "");
            dVar2.mo27795a(this.f41836a, this.f41837b, this.f41838c);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.ies.im.core.b.a$e */
    static final class C17477e extends AbstractC89220m implements AbstractC89172b<AbstractC17425d, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C19538ai f41839a;

        /* renamed from: b */
        final /* synthetic */ Map f41840b;

        /* renamed from: c */
        final /* synthetic */ Map f41841c;

        static {
            Covode.recordClassIndex(19966);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C17477e(C19538ai aiVar, Map map, Map map2) {
            super(1);
            this.f41839a = aiVar;
            this.f41840b = map;
            this.f41841c = map2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AbstractC17425d dVar) {
            AbstractC17425d dVar2 = dVar;
            C89219l.m154721d(dVar2, "");
            dVar2.mo27793a(this.f41839a, this.f41840b, this.f41841c);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.ies.im.core.b.a$f */
    static final class C17478f extends AbstractC89220m implements AbstractC89172b<AbstractC17425d, C89391z> {

        /* renamed from: a */
        final /* synthetic */ List f41842a;

        /* renamed from: b */
        final /* synthetic */ boolean f41843b;

        static {
            Covode.recordClassIndex(19967);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C17478f(List list, boolean z) {
            super(1);
            this.f41842a = list;
            this.f41843b = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AbstractC17425d dVar) {
            AbstractC17425d dVar2 = dVar;
            C89219l.m154721d(dVar2, "");
            dVar2.mo27799b(this.f41842a, this.f41843b);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.ies.im.core.b.a$g */
    static final class C17479g extends AbstractC89220m implements AbstractC89172b<AbstractC17425d, C89391z> {

        /* renamed from: a */
        final /* synthetic */ List f41844a;

        /* renamed from: b */
        final /* synthetic */ boolean f41845b;

        static {
            Covode.recordClassIndex(19968);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C17479g(List list, boolean z) {
            super(1);
            this.f41844a = list;
            this.f41845b = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AbstractC17425d dVar) {
            AbstractC17425d dVar2 = dVar;
            C89219l.m154721d(dVar2, "");
            dVar2.mo27798a(this.f41844a, this.f41845b);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.ies.im.core.b.a$h */
    static final class C17480h extends AbstractC89220m implements AbstractC89172b<AbstractC17425d, C89391z> {

        /* renamed from: a */
        final /* synthetic */ List f41846a;

        /* renamed from: b */
        final /* synthetic */ int f41847b;

        /* renamed from: c */
        final /* synthetic */ String f41848c;

        static {
            Covode.recordClassIndex(19969);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C17480h(List list, int i, String str) {
            super(1);
            this.f41846a = list;
            this.f41847b = i;
            this.f41848c = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AbstractC17425d dVar) {
            AbstractC17425d dVar2 = dVar;
            C89219l.m154721d(dVar2, "");
            dVar2.mo27796a(this.f41846a, this.f41847b, this.f41848c);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.ies.im.core.b.a$i */
    static final class C17481i extends AbstractC89220m implements AbstractC89172b<AbstractC17425d, C89391z> {

        /* renamed from: a */
        final /* synthetic */ int f41849a;

        /* renamed from: b */
        final /* synthetic */ C19538ai f41850b;

        /* renamed from: c */
        final /* synthetic */ C19600ay f41851c;

        static {
            Covode.recordClassIndex(19970);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C17481i(int i, C19538ai aiVar, C19600ay ayVar) {
            super(1);
            this.f41849a = i;
            this.f41850b = aiVar;
            this.f41851c = ayVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AbstractC17425d dVar) {
            AbstractC17425d dVar2 = dVar;
            C89219l.m154721d(dVar2, "");
            dVar2.mo27790a(this.f41849a, this.f41850b, this.f41851c);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.ies.im.core.b.a$j */
    static final class C17482j extends AbstractC89220m implements AbstractC89172b<AbstractC17425d, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C19538ai f41852a;

        /* renamed from: b */
        final /* synthetic */ boolean f41853b;

        static {
            Covode.recordClassIndex(19971);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C17482j(C19538ai aiVar, boolean z) {
            super(1);
            this.f41852a = aiVar;
            this.f41853b = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AbstractC17425d dVar) {
            AbstractC17425d dVar2 = dVar;
            C89219l.m154721d(dVar2, "");
            dVar2.mo27794a(this.f41852a, this.f41853b);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.ies.im.core.b.a$k */
    static final class C17483k extends AbstractC89220m implements AbstractC89172b<AbstractC17425d, C89391z> {

        /* renamed from: a */
        final /* synthetic */ int f41854a;

        /* renamed from: b */
        final /* synthetic */ C19587an f41855b;

        static {
            Covode.recordClassIndex(19972);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C17483k(int i, C19587an anVar) {
            super(1);
            this.f41854a = i;
            this.f41855b = anVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AbstractC17425d dVar) {
            AbstractC17425d dVar2 = dVar;
            C89219l.m154721d(dVar2, "");
            dVar2.mo27791a(this.f41854a, this.f41855b);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.ies.im.core.b.a$l */
    static final class C17484l extends AbstractC89220m implements AbstractC89172b<AbstractC17425d, C89391z> {

        /* renamed from: a */
        final /* synthetic */ List f41856a;

        /* renamed from: b */
        final /* synthetic */ Map f41857b;

        static {
            Covode.recordClassIndex(19973);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C17484l(List list, Map map) {
            super(1);
            this.f41856a = list;
            this.f41857b = map;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AbstractC17425d dVar) {
            AbstractC17425d dVar2 = dVar;
            C89219l.m154721d(dVar2, "");
            dVar2.mo27797a(this.f41856a, this.f41857b);
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    private static void m32451a(AbstractC89172b<? super AbstractC17425d, C89391z> bVar) {
        Iterator<T> it = m32450a().iterator();
        while (it.hasNext()) {
            bVar.invoke(it.next());
        }
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1211b.p1212a.AbstractC17425d, com.bytedance.p1399im.core.p1408d.AbstractC19674v
    /* renamed from: a */
    public final void mo27792a(C19538ai aiVar) {
        m32451a(new C17475c(aiVar));
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1211b.p1212a.AbstractC17425d, com.bytedance.p1399im.core.p1408d.AbstractC19674v
    /* renamed from: b */
    public final void mo27799b(List<C19538ai> list, boolean z) {
        m32451a(new C17478f(list, z));
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1211b.p1212a.AbstractC17425d, com.bytedance.p1399im.core.p1408d.AbstractC19674v
    /* renamed from: a */
    public final void mo27789a(int i, C19538ai aiVar) {
        m32451a(new C17474b(i, aiVar));
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1211b.p1212a.AbstractC17425d, com.bytedance.p1399im.core.p1408d.AbstractC19674v
    /* renamed from: a */
    public final void mo27791a(int i, C19587an anVar) {
        m32451a(new C17483k(i, anVar));
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1211b.p1212a.AbstractC17425d, com.bytedance.p1399im.core.p1408d.AbstractC19674v
    /* renamed from: a */
    public final void mo27794a(C19538ai aiVar, boolean z) {
        m32451a(new C17482j(aiVar, z));
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1211b.p1212a.AbstractC17425d, com.bytedance.p1399im.core.p1408d.AbstractC19674v
    /* renamed from: a */
    public final void mo27790a(int i, C19538ai aiVar, C19600ay ayVar) {
        m32451a(new C17481i(i, aiVar, ayVar));
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1211b.p1212a.AbstractC17425d, com.bytedance.p1399im.core.p1408d.AbstractC19674v
    /* renamed from: a */
    public final void mo27793a(C19538ai aiVar, Map<String, List<C19536ag>> map, Map<String, List<C19536ag>> map2) {
        m32451a(new C17477e(aiVar, map, map2));
    }
}
