package com.bytedance.ies.powerlist.page;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.page.AbstractC17714i;
import java.util.LinkedHashMap;
import java.util.Map;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89216i;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89278d;

/* renamed from: com.bytedance.ies.powerlist.page.a */
public final class C17681a {

    /* renamed from: c */
    public static final Map<EnumC17698d, AbstractC89187q<AbstractC17714i, EnumC17699e, Object, AbstractC17714i>> f42305c;

    /* renamed from: d */
    public static final C17682a f42306d = new C17682a((byte) 0);

    /* renamed from: a */
    public final AbstractC17714i f42307a;

    /* renamed from: b */
    public final AbstractC17714i f42308b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17681a)) {
            return false;
        }
        C17681a aVar = (C17681a) obj;
        return C89219l.m154714a(this.f42307a, aVar.f42307a) && C89219l.m154714a(this.f42308b, aVar.f42308b);
    }

    public final int hashCode() {
        AbstractC17714i iVar = this.f42307a;
        int i = 0;
        int hashCode = (iVar != null ? iVar.hashCode() : 0) * 31;
        AbstractC17714i iVar2 = this.f42308b;
        if (iVar2 != null) {
            i = iVar2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "BiDirectionPageState(prev=" + this.f42307a + ", next=" + this.f42308b + ")";
    }

    /* renamed from: com.bytedance.ies.powerlist.page.a$a */
    public static final class C17682a {
        static {
            Covode.recordClassIndex(20241);
        }

        private C17682a() {
        }

        public /* synthetic */ C17682a(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.ies.powerlist.page.a$b */
    static final /* synthetic */ class C17683b extends C89216i implements AbstractC89187q<AbstractC17714i, EnumC17699e, Object, AbstractC17714i> {

        /* renamed from: a */
        public static final C17683b f42309a = new C17683b();

        static {
            Covode.recordClassIndex(20242);
        }

        C17683b() {
            super(3);
        }

        @Override // p4600h.p4611f.p4613b.AbstractC89208c, p4600h.p4620k.AbstractC89276b
        public final String getName() {
            return "onLoading";
        }

        @Override // p4600h.p4611f.p4613b.AbstractC89208c
        public final String getSignature() {
            return "onLoading(Lcom/bytedance/ies/powerlist/page/PageType;Ljava/lang/Object;)Lcom/bytedance/ies/powerlist/page/PowerPageEvent;";
        }

        @Override // p4600h.p4611f.p4613b.AbstractC89208c
        public final AbstractC89278d getOwner() {
            return C89204ab.m154669a(AbstractC17714i.class);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89187q
        public final /* synthetic */ AbstractC17714i invoke(AbstractC17714i iVar, EnumC17699e eVar, Object obj) {
            AbstractC17714i iVar2 = iVar;
            EnumC17699e eVar2 = eVar;
            C89219l.m154719c(iVar2, "");
            C89219l.m154719c(eVar2, "");
            C89219l.m154719c(eVar2, "");
            if (iVar2.mo28189a(eVar2)) {
                return new AbstractC17714i.C17718d(iVar2.f42364a, eVar2);
            }
            return iVar2;
        }
    }

    /* renamed from: com.bytedance.ies.powerlist.page.a$c */
    static final /* synthetic */ class C17684c extends C89216i implements AbstractC89187q<AbstractC17714i, EnumC17699e, Object, AbstractC17714i> {

        /* renamed from: a */
        public static final C17684c f42310a = new C17684c();

        static {
            Covode.recordClassIndex(20243);
        }

        C17684c() {
            super(3);
        }

        @Override // p4600h.p4611f.p4613b.AbstractC89208c, p4600h.p4620k.AbstractC89276b
        public final String getName() {
            return "onLoaded";
        }

        @Override // p4600h.p4611f.p4613b.AbstractC89208c
        public final String getSignature() {
            return "onLoaded(Lcom/bytedance/ies/powerlist/page/PageType;Ljava/lang/Object;)Lcom/bytedance/ies/powerlist/page/PowerPageEvent;";
        }

        @Override // p4600h.p4611f.p4613b.AbstractC89208c
        public final AbstractC89278d getOwner() {
            return C89204ab.m154669a(AbstractC17714i.class);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89187q
        public final /* synthetic */ AbstractC17714i invoke(AbstractC17714i iVar, EnumC17699e eVar, Object obj) {
            AbstractC17714i iVar2 = iVar;
            EnumC17699e eVar2 = eVar;
            C89219l.m154719c(iVar2, "");
            C89219l.m154719c(eVar2, "");
            C89219l.m154719c(eVar2, "");
            if (iVar2.mo28189a(eVar2)) {
                return new AbstractC17714i.C17717c(iVar2.f42364a, eVar2);
            }
            return iVar2;
        }
    }

    /* renamed from: com.bytedance.ies.powerlist.page.a$d */
    static final /* synthetic */ class C17685d extends C89216i implements AbstractC89187q<AbstractC17714i, EnumC17699e, Object, AbstractC17714i> {

        /* renamed from: a */
        public static final C17685d f42311a = new C17685d();

        static {
            Covode.recordClassIndex(20244);
        }

        C17685d() {
            super(3);
        }

        @Override // p4600h.p4611f.p4613b.AbstractC89208c, p4600h.p4620k.AbstractC89276b
        public final String getName() {
            return "onError";
        }

        @Override // p4600h.p4611f.p4613b.AbstractC89208c
        public final String getSignature() {
            return "onError(Lcom/bytedance/ies/powerlist/page/PageType;Ljava/lang/Object;)Lcom/bytedance/ies/powerlist/page/PowerPageEvent;";
        }

        @Override // p4600h.p4611f.p4613b.AbstractC89208c
        public final AbstractC89278d getOwner() {
            return C89204ab.m154669a(AbstractC17714i.class);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89187q
        public final /* synthetic */ AbstractC17714i invoke(AbstractC17714i iVar, EnumC17699e eVar, Object obj) {
            AbstractC17714i iVar2 = iVar;
            EnumC17699e eVar2 = eVar;
            C89219l.m154719c(iVar2, "");
            C89219l.m154719c(eVar2, "");
            C89219l.m154719c(eVar2, "");
            if (!iVar2.mo28189a(eVar2)) {
                return iVar2;
            }
            EnumC17699e eVar3 = iVar2.f42364a;
            if (!(obj instanceof Exception)) {
                obj = null;
            }
            Exception exc = (Exception) obj;
            if (exc == null) {
                exc = new Exception();
            }
            return new AbstractC17714i.C17716b(eVar3, exc, eVar2);
        }
    }

    /* renamed from: com.bytedance.ies.powerlist.page.a$e */
    static final /* synthetic */ class C17686e extends C89216i implements AbstractC89187q<AbstractC17714i, EnumC17699e, Object, AbstractC17714i> {

        /* renamed from: a */
        public static final C17686e f42312a = new C17686e();

        static {
            Covode.recordClassIndex(20245);
        }

        C17686e() {
            super(3);
        }

        @Override // p4600h.p4611f.p4613b.AbstractC89208c, p4600h.p4620k.AbstractC89276b
        public final String getName() {
            return "onEnd";
        }

        @Override // p4600h.p4611f.p4613b.AbstractC89208c
        public final String getSignature() {
            return "onEnd(Lcom/bytedance/ies/powerlist/page/PageType;Ljava/lang/Object;)Lcom/bytedance/ies/powerlist/page/PowerPageEvent;";
        }

        @Override // p4600h.p4611f.p4613b.AbstractC89208c
        public final AbstractC89278d getOwner() {
            return C89204ab.m154669a(AbstractC17714i.class);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89187q
        public final /* synthetic */ AbstractC17714i invoke(AbstractC17714i iVar, EnumC17699e eVar, Object obj) {
            AbstractC17714i iVar2 = iVar;
            EnumC17699e eVar2 = eVar;
            C89219l.m154719c(iVar2, "");
            C89219l.m154719c(eVar2, "");
            C89219l.m154719c(eVar2, "");
            if (iVar2.mo28189a(eVar2)) {
                return new AbstractC17714i.C17715a(iVar2.f42364a, eVar2);
            }
            return iVar2;
        }
    }

    public /* synthetic */ C17681a() {
        this(new AbstractC17714i.C17719e(EnumC17699e.Prev, (byte) 0), new AbstractC17714i.C17719e(EnumC17699e.Next, (byte) 0));
    }

    static {
        Covode.recordClassIndex(20240);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(EnumC17698d.Loading, C17683b.f42309a);
        linkedHashMap.put(EnumC17698d.Loaded, C17684c.f42310a);
        linkedHashMap.put(EnumC17698d.Error, C17685d.f42311a);
        linkedHashMap.put(EnumC17698d.End, C17686e.f42312a);
        f42305c = linkedHashMap;
    }

    private C17681a(AbstractC17714i iVar, AbstractC17714i iVar2) {
        C89219l.m154719c(iVar, "");
        C89219l.m154719c(iVar2, "");
        this.f42307a = iVar;
        this.f42308b = iVar2;
    }

    /* renamed from: a */
    public final C17681a mo28168a(EnumC17698d dVar, EnumC17699e eVar, Object obj) {
        C89219l.m154719c(dVar, "");
        C89219l.m154719c(eVar, "");
        AbstractC89187q<AbstractC17714i, EnumC17699e, Object, AbstractC17714i> qVar = f42305c.get(dVar);
        if (qVar == null) {
            return this;
        }
        AbstractC17714i invoke = qVar.invoke(this.f42307a, eVar, obj);
        AbstractC17714i invoke2 = qVar.invoke(this.f42308b, eVar, obj);
        C89219l.m154719c(invoke, "");
        C89219l.m154719c(invoke2, "");
        return new C17681a(invoke, invoke2);
    }
}
