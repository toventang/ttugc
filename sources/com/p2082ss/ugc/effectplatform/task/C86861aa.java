package com.p2082ss.ugc.effectplatform.task;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.ugc.effectplatform.C86687a;
import com.p2082ss.ugc.effectplatform.algorithm.C86706c;
import com.p2082ss.ugc.effectplatform.algorithm.C86712f;
import com.p2082ss.ugc.effectplatform.algorithm.C86715h;
import com.p2082ss.ugc.effectplatform.model.C86841f;
import com.p2082ss.ugc.effectplatform.model.C86843g;
import com.p2082ss.ugc.effectplatform.model.C86846i;
import com.p2082ss.ugc.effectplatform.model.algorithm.ModelInfo;
import com.p2082ss.ugc.effectplatform.model.algorithm.SingleAlgorithmModelResponse;
import com.p2082ss.ugc.effectplatform.p4444b.AbstractC86755f;
import com.p2082ss.ugc.effectplatform.p4444b.C86734a;
import com.p2082ss.ugc.effectplatform.p4444b.C86751d;
import com.p2082ss.ugc.effectplatform.task.C86959s;
import com.p2082ss.ugc.effectplatform.task.p4457a.C86858b;
import com.p2082ss.ugc.effectplatform.util.C87006t;
import com.p2082ss.ugc.effectplatform.util.EnumC87003q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p4519d.p4520a.p4521a.C87988a;
import p4519d.p4520a.p4521a.C87989b;
import p4519d.p4520a.p4522b.C87991a;
import p4519d.p4520a.p4522b.p4524b.C87994a;
import p4519d.p4520a.p4522b.p4525c.C88003f;
import p4519d.p4520a.p4532e.C88060b;
import p4519d.p4520a.p4534g.C88067b;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.C89388w;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.ugc.effectplatform.task.aa */
public final class C86861aa {

    /* renamed from: d */
    public static final C87989b<String, C86841f> f195830d = new C87989b<>(true);

    /* renamed from: e */
    public static final C87989b<String, ModelInfo> f195831e = new C87989b<>(true);

    /* renamed from: f */
    public static C87991a<C86861aa> f195832f = new C87991a<>(null);

    /* renamed from: g */
    public static final C86862a f195833g = new C86862a((byte) 0);

    /* renamed from: a */
    public final C87989b<String, Exception> f195834a;

    /* renamed from: b */
    public final C87989b<String, C86959s> f195835b;

    /* renamed from: c */
    public final C86687a f195836c;

    /* renamed from: h */
    private final C86712f f195837h;

    /* renamed from: i */
    private final C87989b<String, Integer> f195838i;

    /* renamed from: j */
    private final C87989b<String, C86858b> f195839j;

    /* renamed from: com.ss.ugc.effectplatform.task.aa$a */
    public static final class C86862a {
        static {
            Covode.recordClassIndex(102627);
        }

        private C86862a() {
        }

        /* renamed from: a */
        public static C86861aa m150471a() {
            if (C86861aa.f195832f.f199870a != null) {
                V v = C86861aa.f195832f.f199870a;
                if (v == null) {
                    C89219l.m154707a();
                }
                return v;
            }
            throw new RuntimeException("Please initialize AlgorithmRepository first!");
        }

        /* renamed from: b */
        private static boolean m150474b() {
            if (C86861aa.f195832f.f199870a != null) {
                return true;
            }
            return false;
        }

        public /* synthetic */ C86862a(byte b) {
            this();
        }

        /* renamed from: b */
        private static void m150473b(C86687a aVar) {
            C89219l.m154719c(aVar, "");
            C86861aa.f195832f.f199870a = (V) new C86861aa(aVar, (byte) 0);
        }

        /* renamed from: a */
        public static C86861aa m150472a(C86687a aVar) {
            C89219l.m154719c(aVar, "");
            if (!m150474b()) {
                m150473b(aVar);
            }
            return m150471a();
        }
    }

    /* renamed from: com.ss.ugc.effectplatform.task.aa$e */
    public static final class C86866e extends AbstractC86891b {

        /* renamed from: a */
        final /* synthetic */ C86861aa f195847a;

        /* renamed from: b */
        final /* synthetic */ int f195848b;

        /* renamed from: c */
        final /* synthetic */ String f195849c;

        static {
            Covode.recordClassIndex(102631);
        }

        /* access modifiers changed from: protected */
        @Override // com.p2082ss.ugc.effectplatform.task.AbstractC86891b
        /* renamed from: b */
        public final void mo139953b() {
        }

        /* access modifiers changed from: protected */
        @Override // com.p2082ss.ugc.effectplatform.task.AbstractC86891b
        /* renamed from: a */
        public final void mo139952a() {
            this.f195847a.mo140587a(this.f195848b, this.f195849c);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C86866e(C86861aa aaVar, int i, String str, String str2) {
            super(str2);
            this.f195847a = aaVar;
            this.f195848b = i;
            this.f195849c = str;
        }
    }

    /* renamed from: com.ss.ugc.effectplatform.task.aa$d */
    public static final class C86865d extends AbstractC86891b {

        /* renamed from: a */
        final /* synthetic */ C86861aa f195845a;

        /* renamed from: b */
        final /* synthetic */ int f195846b;

        static {
            Covode.recordClassIndex(102630);
        }

        /* access modifiers changed from: protected */
        @Override // com.p2082ss.ugc.effectplatform.task.AbstractC86891b
        /* renamed from: b */
        public final void mo139953b() {
        }

        /* access modifiers changed from: protected */
        @Override // com.p2082ss.ugc.effectplatform.task.AbstractC86891b
        /* renamed from: a */
        public final void mo139952a() {
            try {
                C89379q.m157068constructorimpl(this.f195845a.mo140590a(this.f195846b, false));
            } catch (Throwable th) {
                C89379q.m157068constructorimpl(C89382r.m154941a(th));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C86865d(C86861aa aaVar, int i, String str) {
            super(str);
            this.f195845a = aaVar;
            this.f195846b = i;
        }
    }

    static {
        Covode.recordClassIndex(102626);
    }

    /* renamed from: com.ss.ugc.effectplatform.task.aa$c */
    public static final class RunnableC86864c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C86841f f195843a;

        /* renamed from: b */
        final /* synthetic */ C86861aa f195844b;

        static {
            Covode.recordClassIndex(102629);
        }

        /* JADX INFO: finally extract failed */
        public final void run() {
            C86841f fVar = this.f195843a;
            AbstractC86755f a = C86751d.m150298a(this.f195844b.f195836c.f195440H);
            if (a != null) {
                C86734a aVar = (C86734a) a;
                C89219l.m154719c(fVar, "");
                C89219l.m154719c(aVar, "");
                if (EnumC87003q.ANDROID != EnumC87003q.PC) {
                    if (fVar.f195763b.isEmpty()) {
                        for (T t : fVar.f195762a.mo142621a()) {
                            fVar.f195763b.put(t.f195764a.getName(), t.f195764a);
                        }
                    }
                    C87989b<String, ModelInfo> bVar = fVar.f195763b;
                    if (bVar == null || bVar.isEmpty()) {
                        C86706c.f195531c.mo142588a(false);
                        return;
                    }
                    Map<String, C86843g> b = aVar.mo139975b();
                    if (b.isEmpty()) {
                        C86706c.f195531c.mo142588a(false);
                        return;
                    }
                    C88003f fVar2 = C86706c.f195529a;
                    fVar2.f199879a.lock();
                    try {
                        for (Map.Entry<String, ModelInfo> entry : bVar.entrySet()) {
                            String key = entry.getKey();
                            C86843g gVar = b.get(key);
                            if (gVar != null) {
                                C86706c.f195530b.put(key, new C86715h(gVar, entry.getValue()));
                            }
                        }
                        fVar2.f199879a.unlock();
                        C86706c.f195531c.mo142588a(true);
                    } catch (Throwable th) {
                        fVar2.f199879a.unlock();
                        throw th;
                    }
                }
            } else {
                throw new C89388w("null cannot be cast to non-null type");
            }
        }

        RunnableC86864c(C86841f fVar, C86861aa aaVar) {
            this.f195843a = fVar;
            this.f195844b = aaVar;
        }
    }

    /* renamed from: com.ss.ugc.effectplatform.task.aa$b */
    public static final class C86863b implements C86959s.AbstractC86960a {

        /* renamed from: a */
        final /* synthetic */ C86861aa f195840a;

        /* renamed from: b */
        final /* synthetic */ int f195841b;

        /* renamed from: c */
        final /* synthetic */ String f195842c;

        static {
            Covode.recordClassIndex(102628);
        }

        @Override // com.p2082ss.ugc.effectplatform.task.C86959s.AbstractC86960a
        /* renamed from: a */
        public final void mo140592a(Exception exc) {
            C89219l.m154719c(exc, "");
            this.f195840a.f195834a.put(this.f195842c, exc);
            C88060b.m153136a("FetchModelListTask", "fetch model list error happens!", exc);
            this.f195840a.f195835b.remove(this.f195842c);
        }

        @Override // com.p2082ss.ugc.effectplatform.task.C86959s.AbstractC86960a
        /* renamed from: a */
        public final void mo140591a(C86846i iVar) {
            ModelInfo next;
            String name;
            C89219l.m154719c(iVar, "");
            C87989b<String, C86841f> bVar = C86861aa.f195830d;
            String str = this.f195842c;
            C86841f fVar = iVar.f195772a;
            if (fVar == null) {
                HashMap hashMap = new HashMap();
                Iterator<ModelInfo> it = iVar.f195773b.mo142621a().iterator();
                while (it.hasNext() && (name = (next = it.next()).getName()) != null) {
                    if (!hashMap.containsKey(name)) {
                        hashMap.put(name, next.getVersion());
                    } else if (!C89219l.m154714a(hashMap.get(name), (Object) next.getVersion())) {
                        throw new RuntimeException("model " + name + " has different versions in ServerTable,Please modify the file to the correct format ");
                    }
                }
                fVar = new C86841f();
                C88067b<String, C86841f.C86842a> bVar2 = new C88067b<>();
                for (K k : iVar.f195773b.f199977a.keySet()) {
                    Collection<ModelInfo> collection = (C87988a) iVar.f195773b.f199977a.get(k);
                    if (collection == null) {
                        collection = new ArrayList();
                    }
                    for (ModelInfo modelInfo : collection) {
                        bVar2.mo142622a(k, new C86841f.C86842a(modelInfo));
                    }
                }
                fVar.mo140163a(bVar2);
                iVar.f195772a = fVar;
            }
            bVar.put(str, fVar);
            this.f195840a.f195835b.remove(this.f195842c);
        }

        C86863b(C86861aa aaVar, int i, String str) {
            this.f195840a = aaVar;
            this.f195841b = i;
            this.f195842c = str;
        }
    }

    private C86861aa(C86687a aVar) {
        this.f195836c = aVar;
        this.f195837h = new C86712f(aVar.f195435C, aVar.f195437E);
        this.f195834a = new C87989b<>(true);
        this.f195835b = new C87989b<>(true);
        this.f195838i = new C87989b<>(true);
        this.f195839j = new C87989b<>(true);
    }

    /* renamed from: a */
    public final C86841f mo140589a(int i) {
        C86882al alVar;
        C86841f fVar = f195830d.get(C86867ab.m150481a(i));
        if (fVar == null && (alVar = this.f195836c.f195470z) != null) {
            alVar.mo140600a(new C86865d(this, i, C87006t.m150696a()));
        }
        return fVar;
    }

    public /* synthetic */ C86861aa(C86687a aVar, byte b) {
        this(aVar);
    }

    /* renamed from: a */
    public final synchronized ModelInfo mo140587a(int i, String str) {
        MethodCollector.m26663i(3805);
        ModelInfo modelInfo = null;
        if (str == null) {
            MethodCollector.m26664o(3805);
            return null;
        }
        C87989b<String, ModelInfo> bVar = f195831e;
        ModelInfo modelInfo2 = bVar.get(str);
        if (modelInfo2 == null) {
            String str2 = str + '_' + i;
            C87989b<String, C86858b> bVar2 = this.f195839j;
            C86858b bVar3 = bVar2.get(str2);
            if (bVar3 == null) {
                bVar3 = new C86858b(this.f195836c, str, i);
                bVar2.put(str2, bVar3);
            }
            SingleAlgorithmModelResponse c = bVar3.mo140584c();
            if (!(c == null || (modelInfo = c.getData()) == null)) {
                bVar.put(str, modelInfo);
            }
            this.f195839j.remove(str2);
            modelInfo2 = modelInfo;
        }
        MethodCollector.m26664o(3805);
        return modelInfo2;
    }

    /* renamed from: a */
    public final synchronized C86841f mo140590a(int i, boolean z) {
        C86841f fVar;
        MethodCollector.m26663i(3689);
        String a = C86867ab.m150481a(i);
        C87989b<String, C86841f> bVar = f195830d;
        if (bVar.get(a) == null) {
            C87989b<String, Integer> bVar2 = this.f195838i;
            int i2 = bVar2.get(a);
            if (i2 == null) {
                i2 = 0;
                bVar2.put(a, 0);
            }
            int intValue = i2.intValue();
            if (z || intValue < this.f195836c.f195459o) {
                C87989b<String, C86959s> bVar3 = this.f195835b;
                C86959s sVar = bVar3.get(a);
                if (sVar == null) {
                    sVar = new C86959s(this.f195836c, this.f195837h, i, new C86863b(this, i, a));
                    bVar3.put(a, sVar);
                }
                C86959s sVar2 = sVar;
                this.f195838i.put(a, Integer.valueOf(intValue + 1));
                C88003f fVar2 = C86961t.f196069a;
                fVar2.f199879a.lock();
                try {
                    if (!sVar2.f196064a.mo142589a()) {
                        sVar2.run();
                        sVar2.f196064a.mo142588a(true);
                    }
                    fVar2.f199879a.unlock();
                    C86841f fVar3 = bVar.get(a);
                    if (fVar3 != null) {
                        new C87994a().execute(new RunnableC86864c(fVar3, this));
                    }
                } catch (Throwable th) {
                    fVar2.f199879a.unlock();
                    MethodCollector.m26664o(3689);
                    throw th;
                }
            }
            if (bVar.get(a) == null) {
                Exception exc = this.f195834a.get(a);
                if (exc != null) {
                    MethodCollector.m26664o(3689);
                    throw exc;
                }
                RuntimeException runtimeException = new RuntimeException("error happens when requireDecidedConfig");
                MethodCollector.m26664o(3689);
                throw runtimeException;
            }
        }
        fVar = bVar.get(a);
        MethodCollector.m26664o(3689);
        return fVar;
    }

    /* renamed from: a */
    public final ModelInfo mo140588a(int i, String str, boolean z) {
        C86882al alVar;
        if (str == null) {
            return null;
        }
        ModelInfo modelInfo = f195831e.get(str);
        if (modelInfo == null && z && (alVar = this.f195836c.f195470z) != null) {
            alVar.mo140600a(new C86866e(this, i, str, C87006t.m150696a()));
        }
        return modelInfo;
    }
}
