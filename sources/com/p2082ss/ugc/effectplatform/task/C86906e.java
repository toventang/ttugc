package com.p2082ss.ugc.effectplatform.task;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.effectplatform.C86687a;
import com.p2082ss.ugc.effectplatform.model.C86838c;
import com.p2082ss.ugc.effectplatform.model.C86839d;
import com.p2082ss.ugc.effectplatform.model.C86840e;
import com.p2082ss.ugc.effectplatform.model.Effect;
import com.p2082ss.ugc.effectplatform.p4451h.AbstractC86796e;
import com.p2082ss.ugc.effectplatform.p4451h.AbstractC86798g;
import com.p2082ss.ugc.effectplatform.util.C87006t;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p4519d.p4520a.p4521a.C87988a;
import p4519d.p4520a.p4522b.p4525c.C88003f;
import p4600h.C89378p;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.ugc.effectplatform.task.e */
public final class C86906e extends AbstractC86891b {

    /* renamed from: h */
    public static final C86907a f195940h = new C86907a((byte) 0);

    /* renamed from: a */
    public final C87988a<String> f195941a = new C87988a<>(true);

    /* renamed from: b */
    public final C87988a<Effect> f195942b = new C87988a<>(true);

    /* renamed from: c */
    public final C87988a<C89378p<Effect, C86840e>> f195943c = new C87988a<>(true);

    /* renamed from: d */
    public final C86687a f195944d;

    /* renamed from: f */
    public final List<Effect> f195945f;

    /* renamed from: g */
    public final String f195946g;

    /* renamed from: i */
    private final C87988a<Effect> f195947i = new C87988a<>(true);

    /* renamed from: j */
    private final C87988a<Effect> f195948j = new C87988a<>(true);

    /* renamed from: k */
    private final C86838c f195949k;

    static {
        Covode.recordClassIndex(102671);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.ugc.effectplatform.task.AbstractC86891b
    /* renamed from: b */
    public final void mo139953b() {
    }

    /* renamed from: com.ss.ugc.effectplatform.task.e$a */
    public static final class C86907a {
        static {
            Covode.recordClassIndex(102672);
        }

        private C86907a() {
        }

        public /* synthetic */ C86907a(byte b) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.ugc.effectplatform.task.AbstractC86891b
    /* renamed from: a */
    public final void mo139952a() {
        if (this.f195948j.isEmpty()) {
            m150540a(new ArrayList());
        } else {
            mo140609c();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.ugc.effectplatform.task.e$c */
    public static final class C86909c extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C86906e f195951a;

        /* renamed from: b */
        final /* synthetic */ C86840e f195952b;

        static {
            Covode.recordClassIndex(102674);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C86909c(C86906e eVar, C86840e eVar2) {
            super(0);
            this.f195951a = eVar;
            this.f195952b = eVar2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            AbstractC86796e a = this.f195951a.f195944d.f195443K.mo140035a(this.f195951a.f195946g);
            if (a != null) {
                a.onFail(this.f195951a.f195945f, this.f195952b);
            }
            this.f195951a.f195944d.f195443K.mo140037b(this.f195951a.f195946g);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.ugc.effectplatform.task.e$d */
    public static final class C86910d extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C86906e f195953a;

        /* renamed from: b */
        final /* synthetic */ List f195954b;

        static {
            Covode.recordClassIndex(102675);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C86910d(C86906e eVar, List list) {
            super(0);
            this.f195953a = eVar;
            this.f195954b = list;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            AbstractC86796e a = this.f195953a.f195944d.f195443K.mo140035a(this.f195953a.f195946g);
            if (a != null) {
                a.onSuccess(this.f195954b);
            }
            this.f195953a.f195944d.f195443K.mo140037b(this.f195953a.f195946g);
            return C89391z.f203057a;
        }
    }

    /* renamed from: c */
    public final void mo140609c() {
        C86840e eVar;
        C89378p<Effect, C86840e> pVar;
        Effect remove;
        if (!this.f195948j.isEmpty()) {
            if (this.f195941a.size() < 5) {
                int size = 5 - this.f195941a.size();
                int i = 0;
                while (i <= size && (!this.f195948j.isEmpty())) {
                    C88003f fVar = C86911f.f195955a;
                    fVar.f199879a.lock();
                    try {
                        C87988a<Effect> aVar = this.f195948j;
                        if (!(!(!aVar.isEmpty()) || aVar == null || (remove = aVar.remove(0)) == null)) {
                            this.f195941a.add(remove.getId());
                            String a = C87006t.m150696a();
                            this.f195944d.f195443K.mo140036a(a, new C86908b(this));
                            C86912g gVar = new C86912g(remove, this.f195944d, a, this.f195949k);
                            C86882al alVar = this.f195944d.f195470z;
                            if (alVar != null) {
                                alVar.mo140600a(gVar);
                            }
                            Integer.valueOf(i);
                            i++;
                        }
                    } finally {
                        fVar.f199879a.unlock();
                    }
                }
            }
        } else if (this.f195942b.size() + this.f195943c.size() != this.f195947i.size()) {
        } else {
            if (this.f195942b.size() == this.f195947i.size()) {
                m150540a(this.f195945f);
                return;
            }
            C87988a<C89378p<Effect, C86840e>> aVar2 = this.f195943c;
            ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) aVar2, 10));
            Iterator<T> it = aVar2.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getFirst());
            }
            ArrayList arrayList2 = arrayList;
            C87988a<C89378p<Effect, C86840e>> aVar3 = this.f195943c;
            if (!(!aVar3.isEmpty()) || aVar3 == null || (pVar = aVar3.get(0)) == null || (eVar = pVar.getSecond()) == null) {
                eVar = new C86840e(10002);
            }
            C89219l.m154719c(arrayList2, "");
            C89219l.m154719c(eVar, "");
            if (!arrayList2.isEmpty()) {
                m150523a(new C86909c(this, eVar));
            }
        }
    }

    /* renamed from: com.ss.ugc.effectplatform.task.e$b */
    public static final class C86908b implements AbstractC86798g {

        /* renamed from: a */
        final /* synthetic */ C86906e f195950a;

        static {
            Covode.recordClassIndex(102673);
        }

        @Override // com.p2082ss.ugc.effectplatform.p4451h.AbstractC86798g
        public final void onProgress(Effect effect, int i, long j) {
        }

        @Override // com.p2082ss.ugc.effectplatform.p4451h.AbstractC86798g
        public final void onStart(Effect effect) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C86908b(C86906e eVar) {
            this.f195950a = eVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.p2082ss.ugc.effectplatform.p4451h.AbstractC86796e
        public final /* synthetic */ void onSuccess(Effect effect) {
            Effect effect2 = effect;
            if (effect2 != null) {
                this.f195950a.f195941a.remove(effect2.getId());
                this.f195950a.f195942b.add(effect2);
            }
            this.f195950a.mo140609c();
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.ss.ugc.effectplatform.model.e] */
        @Override // com.p2082ss.ugc.effectplatform.p4451h.AbstractC86796e
        public final /* synthetic */ void onFail(Effect effect, C86840e eVar) {
            Effect effect2 = effect;
            C89219l.m154719c(eVar, "");
            if (effect2 != null) {
                this.f195950a.f195941a.remove(effect2.getId());
                this.f195950a.f195943c.add(new C89378p<>(effect2, eVar));
            }
            this.f195950a.mo140609c();
        }
    }

    /* renamed from: a */
    private void m150540a(List<? extends Effect> list) {
        C89219l.m154719c(list, "");
        m150523a(new C86910d(this, list));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: java.util.List<? extends com.ss.ugc.effectplatform.model.Effect> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C86906e(C86687a aVar, List<? extends Effect> list, String str, C86838c cVar) {
        super(str, aVar.f195443K);
        C89219l.m154719c(aVar, "");
        C89219l.m154719c(list, "");
        C89219l.m154719c(str, "");
        this.f195944d = aVar;
        this.f195945f = list;
        this.f195946g = str;
        this.f195949k = cVar;
        HashSet hashSet = new HashSet();
        for (Effect effect : list) {
            String a = C86839d.m150405a(effect);
            if (!hashSet.contains(a)) {
                this.f195947i.add(effect);
                hashSet.add(a);
            }
        }
        this.f195948j.addAll(this.f195947i);
    }
}
