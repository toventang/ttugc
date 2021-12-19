package com.p2082ss.android.ugc.aweme.feedback.runtime.behavior.strategy;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feedback.runtime.behavior.C50580b;
import com.p2082ss.android.ugc.aweme.runtime.behavior.C67212c;
import com.p2082ss.android.ugc.aweme.shortvideo.model.BehaviorType;
import com.p2082ss.android.ugc.aweme.shortvideo.model.PublishBehaviorModel;
import com.p2082ss.android.ugc.aweme.utils.C80342dg;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4602b.C89090a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.i */
public abstract class AbstractC50597i extends AbstractC50584a {

    /* renamed from: a */
    public static final C50599b f116903a = new C50599b((byte) 0);

    static {
        Covode.recordClassIndex(59753);
    }

    /* renamed from: com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.i$b */
    public static final class C50599b {
        static {
            Covode.recordClassIndex(59755);
        }

        private C50599b() {
        }

        public /* synthetic */ C50599b(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.i$c */
    public static final class C50600c {

        /* renamed from: a */
        public final boolean f116904a;

        /* renamed from: b */
        public final boolean f116905b;

        /* renamed from: c */
        public final boolean f116906c;

        /* renamed from: d */
        public final long f116907d;

        /* renamed from: e */
        public final long f116908e;

        /* renamed from: f */
        public final AbstractC50601a f116909f;

        /* renamed from: g */
        public final List<PublishBehaviorModel> f116910g;

        static {
            Covode.recordClassIndex(59756);
        }

        /* renamed from: com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.i$c$a */
        public static abstract class AbstractC50601a {

            /* renamed from: a */
            public final String f116911a;

            static {
                Covode.recordClassIndex(59757);
            }

            /* renamed from: com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.i$c$a$a */
            public static final class C50602a extends AbstractC50601a {

                /* renamed from: b */
                public static final C50602a f116912b = new C50602a();

                private C50602a() {
                    super("Cancel", (byte) 0);
                }

                static {
                    Covode.recordClassIndex(59758);
                }
            }

            /* renamed from: com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.i$c$a$b */
            public static abstract class AbstractC50603b extends AbstractC50601a {
                static {
                    Covode.recordClassIndex(59759);
                }

                private AbstractC50603b() {
                    super("Failed", (byte) 0);
                }

                public /* synthetic */ AbstractC50603b(byte b) {
                    this();
                }

                /* renamed from: com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.i$c$a$b$b */
                public static final class C50605b extends AbstractC50603b {

                    /* renamed from: b */
                    public final String f116915b;

                    static {
                        Covode.recordClassIndex(59761);
                    }

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    public C50605b(String str) {
                        super((byte) 0);
                        C89219l.m154721d(str, "");
                        this.f116915b = str;
                    }
                }

                /* renamed from: com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.i$c$a$b$c */
                public static final class C50606c extends AbstractC50603b {

                    /* renamed from: b */
                    public final String f116916b;

                    static {
                        Covode.recordClassIndex(59762);
                    }

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    public C50606c(String str) {
                        super((byte) 0);
                        C89219l.m154721d(str, "");
                        this.f116916b = str;
                    }
                }

                /* renamed from: com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.i$c$a$b$a */
                public static final class C50604a extends AbstractC50603b {

                    /* renamed from: b */
                    public final String f116913b;

                    /* renamed from: c */
                    public final String f116914c;

                    static {
                        Covode.recordClassIndex(59760);
                    }

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    public C50604a(String str, String str2) {
                        super((byte) 0);
                        C89219l.m154721d(str, "");
                        C89219l.m154721d(str2, "");
                        this.f116913b = str;
                        this.f116914c = str2;
                    }
                }
            }

            /* renamed from: com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.i$c$a$c */
            public static final class C50607c extends AbstractC50601a {

                /* renamed from: b */
                public static final C50607c f116917b = new C50607c();

                private C50607c() {
                    super("Success", (byte) 0);
                }

                static {
                    Covode.recordClassIndex(59763);
                }
            }

            private AbstractC50601a(String str) {
                this.f116911a = str;
            }

            public /* synthetic */ AbstractC50601a(String str, byte b) {
                this(str);
            }
        }

        /* renamed from: a */
        private final AbstractC50601a m94870a() {
            T t;
            PublishBehaviorModel publishBehaviorModel;
            if (this.f116905b) {
                return new AbstractC50601a.AbstractC50603b.C50604a(this.f116910g.get(0).code, this.f116910g.get(0).stage);
            }
            if (!this.f116904a) {
                return AbstractC50601a.C50602a.f116912b;
            }
            Iterator<T> it = this.f116910g.iterator();
            while (true) {
                t = null;
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                T t2 = next;
                if (C89219l.m154714a((Object) t2.stage, (Object) "CA") && t2.type == BehaviorType.SUCCESS) {
                    if (next != null) {
                        return AbstractC50601a.C50607c.f116917b;
                    }
                }
            }
            List<PublishBehaviorModel> list = this.f116910g;
            ListIterator<PublishBehaviorModel> listIterator = list.listIterator(list.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    publishBehaviorModel = null;
                    break;
                }
                publishBehaviorModel = listIterator.previous();
                if (publishBehaviorModel.type == BehaviorType.FAILED) {
                    break;
                }
            }
            PublishBehaviorModel publishBehaviorModel2 = publishBehaviorModel;
            if (publishBehaviorModel2 == null) {
                AbstractC50601a.AbstractC50603b.C50606c a = m94869a("SN", C50608b.f116918a);
                if (a != null) {
                    return a;
                }
                AbstractC50601a.AbstractC50603b.C50606c a2 = m94869a("AK", C50609c.f116919a);
                if (a2 != null) {
                    return a2;
                }
                AbstractC50601a.AbstractC50603b.C50606c a3 = m94869a("UP", C50610d.f116920a);
                if (a3 != null) {
                    return a3;
                }
                AbstractC50601a.AbstractC50603b.C50606c a4 = m94869a("CA", C50611e.f116921a);
                if (a4 != null) {
                    return a4;
                }
                return new AbstractC50601a.AbstractC50603b.C50605b("UNKNOW");
            } else if (!C89219l.m154714a((Object) publishBehaviorModel2.stage, (Object) "UP") || !C89219l.m154714a((Object) publishBehaviorModel2.code, (Object) "-39995")) {
                return new AbstractC50601a.AbstractC50603b.C50604a(publishBehaviorModel2.code, publishBehaviorModel2.stage);
            } else {
                Iterator<T> it2 = this.f116910g.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    T next2 = it2.next();
                    T t3 = next2;
                    if (C89219l.m154714a((Object) t3.stage, (Object) "SN") && t3.type == BehaviorType.FAILED) {
                        t = next2;
                        break;
                    }
                }
                T t4 = t;
                if (t4 == null) {
                    return new AbstractC50601a.AbstractC50603b.C50605b("CONFLICT");
                }
                return new AbstractC50601a.AbstractC50603b.C50604a(t4.code, t4.stage);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.i$c$b */
        public static final class C50608b extends AbstractC89220m implements AbstractC89172b<PublishBehaviorModel, Boolean> {

            /* renamed from: a */
            public static final C50608b f116918a = new C50608b();

            static {
                Covode.recordClassIndex(59764);
            }

            C50608b() {
                super(1);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ Boolean invoke(PublishBehaviorModel publishBehaviorModel) {
                boolean z;
                PublishBehaviorModel publishBehaviorModel2 = publishBehaviorModel;
                C89219l.m154721d(publishBehaviorModel2, "");
                if (!C89219l.m154714a((Object) publishBehaviorModel2.stage, (Object) "SN") || publishBehaviorModel2.type != BehaviorType.START) {
                    z = false;
                } else {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.i$c$c */
        public static final class C50609c extends AbstractC89220m implements AbstractC89172b<PublishBehaviorModel, Boolean> {

            /* renamed from: a */
            public static final C50609c f116919a = new C50609c();

            static {
                Covode.recordClassIndex(59765);
            }

            C50609c() {
                super(1);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ Boolean invoke(PublishBehaviorModel publishBehaviorModel) {
                boolean z;
                PublishBehaviorModel publishBehaviorModel2 = publishBehaviorModel;
                C89219l.m154721d(publishBehaviorModel2, "");
                if (!C89219l.m154714a((Object) publishBehaviorModel2.stage, (Object) "SN") || publishBehaviorModel2.type != BehaviorType.START) {
                    z = false;
                } else {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.i$c$d */
        public static final class C50610d extends AbstractC89220m implements AbstractC89172b<PublishBehaviorModel, Boolean> {

            /* renamed from: a */
            public static final C50610d f116920a = new C50610d();

            static {
                Covode.recordClassIndex(59766);
            }

            C50610d() {
                super(1);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ Boolean invoke(PublishBehaviorModel publishBehaviorModel) {
                boolean z;
                PublishBehaviorModel publishBehaviorModel2 = publishBehaviorModel;
                C89219l.m154721d(publishBehaviorModel2, "");
                if (!C89219l.m154714a((Object) publishBehaviorModel2.stage, (Object) "AK") || publishBehaviorModel2.type != BehaviorType.SUCCESS) {
                    z = false;
                } else {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.i$c$e */
        public static final class C50611e extends AbstractC89220m implements AbstractC89172b<PublishBehaviorModel, Boolean> {

            /* renamed from: a */
            public static final C50611e f116921a = new C50611e();

            static {
                Covode.recordClassIndex(59767);
            }

            C50611e() {
                super(1);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ Boolean invoke(PublishBehaviorModel publishBehaviorModel) {
                boolean z;
                PublishBehaviorModel publishBehaviorModel2 = publishBehaviorModel;
                C89219l.m154721d(publishBehaviorModel2, "");
                if (!C89219l.m154714a((Object) publishBehaviorModel2.stage, (Object) "UP") || publishBehaviorModel2.type != BehaviorType.SUCCESS) {
                    z = false;
                } else {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }

        /* renamed from: a */
        public final void mo85935a(int i) {
            Iterator<T> it = this.f116910g.iterator();
            while (it.hasNext()) {
                it.next().idIndex = i;
            }
        }

        public C50600c(String str, List<PublishBehaviorModel> list) {
            boolean z;
            C89219l.m154721d(str, "");
            C89219l.m154721d(list, "");
            this.f116910g = list;
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                if (C89219l.m154714a((Object) next.stage, (Object) "CP")) {
                    if (next != null) {
                        z = true;
                    }
                }
            }
            z = false;
            this.f116904a = z;
            this.f116905b = C89219l.m154714a((Object) str, (Object) "-1");
            this.f116906c = C89219l.m154714a((Object) str, (Object) "-2");
            this.f116907d = ((PublishBehaviorModel) C89070n.m154579f((List) this.f116910g)).timeStamp;
            this.f116908e = ((PublishBehaviorModel) C89070n.m154586h((List) this.f116910g)).timeStamp;
            this.f116909f = m94870a();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0049, code lost:
            if (r3 == null) goto L_0x0055;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final com.p2082ss.android.ugc.aweme.feedback.runtime.behavior.strategy.AbstractC50597i.C50600c.AbstractC50601a.AbstractC50603b.C50606c m94869a(java.lang.String r9, p4600h.p4611f.p4612a.AbstractC89172b<? super com.p2082ss.android.ugc.aweme.shortvideo.model.PublishBehaviorModel, java.lang.Boolean> r10) {
            /*
                r8 = this;
                java.util.List<com.ss.android.ugc.aweme.shortvideo.model.PublishBehaviorModel> r0 = r8.f116910g
                java.util.Iterator r2 = r0.iterator()
            L_0x0006:
                boolean r0 = r2.hasNext()
                r7 = 0
                if (r0 == 0) goto L_0x0059
                java.lang.Object r1 = r2.next()
                java.lang.Object r0 = r10.invoke(r1)
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r0 = r0.booleanValue()
                if (r0 == 0) goto L_0x0006
            L_0x001d:
                r6 = 1
                r0 = 0
                if (r1 == 0) goto L_0x0057
                r5 = 1
            L_0x0022:
                java.util.List<com.ss.android.ugc.aweme.shortvideo.model.PublishBehaviorModel> r0 = r8.f116910g
                java.util.Iterator r4 = r0.iterator()
            L_0x0028:
                boolean r0 = r4.hasNext()
                if (r0 == 0) goto L_0x0055
                java.lang.Object r3 = r4.next()
                r2 = r3
                com.ss.android.ugc.aweme.shortvideo.model.PublishBehaviorModel r2 = (com.p2082ss.android.ugc.aweme.shortvideo.model.PublishBehaviorModel) r2
                java.lang.String r0 = r2.stage
                boolean r0 = p4600h.p4611f.p4613b.C89219l.m154714a(r0, r9)
                if (r0 == 0) goto L_0x0028
                com.ss.android.ugc.aweme.shortvideo.model.BehaviorType r1 = r2.type
                com.ss.android.ugc.aweme.shortvideo.model.BehaviorType r0 = com.p2082ss.android.ugc.aweme.shortvideo.model.BehaviorType.SUCCESS
                if (r1 == r0) goto L_0x0049
                com.ss.android.ugc.aweme.shortvideo.model.BehaviorType r1 = r2.type
                com.ss.android.ugc.aweme.shortvideo.model.BehaviorType r0 = com.p2082ss.android.ugc.aweme.shortvideo.model.BehaviorType.FAILED
                if (r1 != r0) goto L_0x0028
            L_0x0049:
                if (r3 == 0) goto L_0x0055
            L_0x004b:
                if (r5 == 0) goto L_0x005b
                if (r6 != 0) goto L_0x005b
                com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.i$c$a$b$c r0 = new com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.i$c$a$b$c
                r0.<init>(r9)
                return r0
            L_0x0055:
                r6 = 0
                goto L_0x004b
            L_0x0057:
                r5 = 0
                goto L_0x0022
            L_0x0059:
                r1 = r7
                goto L_0x001d
            L_0x005b:
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.feedback.runtime.behavior.strategy.AbstractC50597i.C50600c.m94869a(java.lang.String, h.f.a.b):com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.i$c$a$b$c");
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feedback.runtime.behavior.strategy.AbstractC50584a
    /* renamed from: b */
    public final long mo85930b() {
        return TimeUnit.HOURS.toMillis(24);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final List<C50600c> mo85933e() {
        List<C50600c> a;
        List<C50600c> d;
        C50612d d2 = mo85932d();
        List<C50600c> list = d2.f116923b;
        List<C50600c> list2 = d2.f116924c;
        List<C50600c> list3 = d2.f116925d;
        List d3 = C89070n.m154573d((List) list2, 4);
        if (d3.isEmpty()) {
            a = C89070n.m154573d((List) list3, 4);
        } else {
            a = m94864a(list3, d3);
        }
        if (!d3.isEmpty()) {
            d = m94864a(list, d3);
        } else if (!a.isEmpty()) {
            d = m94864a(list, a);
        } else {
            d = C89070n.m154573d((List) list, 4);
        }
        return C89070n.m154572d((Collection) C89070n.m154572d((Collection) d3, (Iterable) a), (Iterable) d);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final C50612d mo85932d() {
        Object obj;
        Object obj2;
        ArrayList arrayList;
        ArrayList arrayList2;
        List<PublishBehaviorModel> list;
        List<PublishBehaviorModel> list2;
        List<C67212c> a = C50580b.m94818a("publish", System.currentTimeMillis() - mo85930b());
        ArrayList arrayList3 = new ArrayList(C89070n.m154526a((Iterable) a, 10));
        Iterator<T> it = a.iterator();
        while (it.hasNext()) {
            arrayList3.add(C80342dg.m139301a(it.next().f150639d, PublishBehaviorModel.class));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj3 : arrayList3) {
            String str = ((PublishBehaviorModel) obj3).publishId;
            Object obj4 = linkedHashMap.get(str);
            if (obj4 == null) {
                obj4 = new ArrayList();
                linkedHashMap.put(str, obj4);
            }
            ((List) obj4).add(obj3);
        }
        ArrayList arrayList4 = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList4.add(new C50600c((String) entry.getKey(), C89070n.m154553a((Iterable) entry.getValue(), (Comparator) new C50598a())));
        }
        List a2 = C89070n.m154553a((Iterable) arrayList4, (Comparator) new C50614f());
        Iterator it2 = a2.iterator();
        while (true) {
            obj = null;
            if (!it2.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it2.next();
            if (((C50600c) obj2).f116905b) {
                break;
            }
        }
        C50600c cVar = (C50600c) obj2;
        if (cVar == null || (list2 = cVar.f116910g) == null) {
            arrayList = C89086z.INSTANCE;
        } else {
            ArrayList arrayList5 = new ArrayList(C89070n.m154526a((Iterable) list2, 10));
            for (T t : list2) {
                arrayList5.add(new C50600c(t.publishId, C89070n.m154516a((Object) t)));
            }
            arrayList = arrayList5;
        }
        Iterator it3 = a2.iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            Object next = it3.next();
            if (((C50600c) next).f116906c) {
                obj = next;
                break;
            }
        }
        C50600c cVar2 = (C50600c) obj;
        if (cVar2 == null || (list = cVar2.f116910g) == null) {
            arrayList2 = C89086z.INSTANCE;
        } else {
            ArrayList arrayList6 = new ArrayList(C89070n.m154526a((Iterable) list, 10));
            for (T t2 : list) {
                arrayList6.add(new C50600c(t2.publishId, C89070n.m154516a((Object) t2)));
            }
            arrayList2 = arrayList6;
        }
        ArrayList arrayList7 = new ArrayList();
        for (Object obj5 : a2) {
            C50600c cVar3 = (C50600c) obj5;
            if (!cVar3.f116905b && !cVar3.f116906c && cVar3.f116904a) {
                arrayList7.add(obj5);
            }
        }
        ArrayList arrayList8 = arrayList7;
        ArrayList arrayList9 = new ArrayList();
        for (Object obj6 : a2) {
            C50600c cVar4 = (C50600c) obj6;
            if (!cVar4.f116905b && !cVar4.f116906c && !cVar4.f116904a) {
                arrayList9.add(obj6);
            }
        }
        return new C50612d(arrayList2, arrayList, arrayList8, arrayList9);
    }

    @Override // com.p2082ss.android.ugc.aweme.feedback.runtime.behavior.strategy.AbstractC50584a
    /* renamed from: a */
    public final boolean mo85929a(String str) {
        C89219l.m154721d(str, "");
        if (str.hashCode() == -235365105 && str.equals("publish")) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    protected static List<List<C50600c>> m94862a(List<C50600c> list) {
        C50600c cVar;
        C89219l.m154721d(list, "");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = null;
        for (T t : list) {
            if (!C50613e.m94872a(t.f116909f, (arrayList2 == null || (cVar = (C50600c) C89070n.m154583g((List) arrayList2)) == null) ? null : cVar.f116909f)) {
                if (arrayList2 != null) {
                    arrayList.add(arrayList2);
                }
                arrayList2 = new ArrayList();
                arrayList2.add(t);
            } else if (arrayList2 != null) {
                arrayList2.add(t);
            }
        }
        if (arrayList2 != null) {
            arrayList.add(arrayList2);
        }
        return arrayList;
    }

    /* renamed from: com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.i$e */
    static final class C50613e extends AbstractC89220m implements AbstractC89183m<C50600c.AbstractC50601a, C50600c.AbstractC50601a, Boolean> {

        /* renamed from: a */
        public static final C50613e f116926a = new C50613e();

        static {
            Covode.recordClassIndex(59769);
        }

        C50613e() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ Boolean invoke(C50600c.AbstractC50601a aVar, C50600c.AbstractC50601a aVar2) {
            return Boolean.valueOf(m94872a(aVar, aVar2));
        }

        /* renamed from: a */
        public static boolean m94872a(C50600c.AbstractC50601a aVar, C50600c.AbstractC50601a aVar2) {
            C89219l.m154721d(aVar, "");
            if (aVar2 == null) {
                return false;
            }
            if (C89219l.m154714a(aVar, aVar2)) {
                return true;
            }
            return C89219l.m154714a((Object) aVar.f116911a, (Object) aVar2.f116911a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.i$a */
    public static final class C50598a<T> implements Comparator {
        static {
            Covode.recordClassIndex(59754);
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return C89090a.m154604a(Long.valueOf(t.timeStamp), Long.valueOf(t2.timeStamp));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.i$f */
    public static final class C50614f<T> implements Comparator {
        static {
            Covode.recordClassIndex(59770);
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return C89090a.m154604a(Long.valueOf(t.f116907d), Long.valueOf(t2.f116907d));
        }
    }

    /* renamed from: a */
    private static List<C50600c> m94864a(List<C50600c> list, List<C50600c> list2) {
        if (list2.isEmpty() || list.isEmpty()) {
            return C89086z.INSTANCE;
        }
        return m94863a(list, ((C50600c) C89070n.m154579f((List) list2)).f116907d, ((C50600c) C89070n.m154586h((List) list)).f116908e, 2);
    }

    /* renamed from: com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.i$d */
    public static final class C50612d {

        /* renamed from: a */
        public final List<C50600c> f116922a;

        /* renamed from: b */
        public final List<C50600c> f116923b;

        /* renamed from: c */
        public final List<C50600c> f116924c;

        /* renamed from: d */
        public final List<C50600c> f116925d;

        static {
            Covode.recordClassIndex(59768);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C50612d)) {
                return false;
            }
            C50612d dVar = (C50612d) obj;
            return C89219l.m154714a(this.f116922a, dVar.f116922a) && C89219l.m154714a(this.f116923b, dVar.f116923b) && C89219l.m154714a(this.f116924c, dVar.f116924c) && C89219l.m154714a(this.f116925d, dVar.f116925d);
        }

        public final int hashCode() {
            List<C50600c> list = this.f116922a;
            int i = 0;
            int hashCode = (list != null ? list.hashCode() : 0) * 31;
            List<C50600c> list2 = this.f116923b;
            int hashCode2 = (hashCode + (list2 != null ? list2.hashCode() : 0)) * 31;
            List<C50600c> list3 = this.f116924c;
            int hashCode3 = (hashCode2 + (list3 != null ? list3.hashCode() : 0)) * 31;
            List<C50600c> list4 = this.f116925d;
            if (list4 != null) {
                i = list4.hashCode();
            }
            return hashCode3 + i;
        }

        public final String toString() {
            return "Publishes(events=" + this.f116922a + ", checkFailed=" + this.f116923b + ", clickPublish=" + this.f116924c + ", unClickPublish=" + this.f116925d + ")";
        }

        public C50612d(List<C50600c> list, List<C50600c> list2, List<C50600c> list3, List<C50600c> list4) {
            C89219l.m154721d(list, "");
            C89219l.m154721d(list2, "");
            C89219l.m154721d(list3, "");
            C89219l.m154721d(list4, "");
            this.f116922a = list;
            this.f116923b = list2;
            this.f116924c = list3;
            this.f116925d = list4;
        }
    }

    /* renamed from: a */
    private static List<C50600c> m94863a(List<C50600c> list, long j, long j2, int i) {
        Iterator<C50600c> it = list.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (it.next().f116907d <= j) {
                i2++;
            } else if (i2 != -1) {
                ListIterator<C50600c> listIterator = list.listIterator(list.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        break;
                    } else if (listIterator.previous().f116908e < j2) {
                        int nextIndex = listIterator.nextIndex();
                        if (nextIndex != -1) {
                            return list.subList(Math.max(0, i2 - 2), Math.min(list.size() - 1, nextIndex + 2) + 1);
                        }
                    }
                }
                return C89086z.INSTANCE;
            }
        }
        return C89086z.INSTANCE;
    }
}
