package com.airbnb.epoxy;

import android.os.Handler;
import android.view.View;
import androidx.recyclerview.widget.C1415b;
import androidx.recyclerview.widget.C1445j;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.epoxy.C1925c;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.airbnb.epoxy.o */
public final class C1951o extends AbstractC1931d implements C1925c.AbstractC1930c {

    /* renamed from: j */
    private static final C1445j.AbstractC1451e<AbstractC1956s<?>> f5820j = new C1445j.AbstractC1451e<AbstractC1956s<?>>() {
        /* class com.airbnb.epoxy.C1951o.C19521 */

        static {
            Covode.recordClassIndex(2143);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // androidx.recyclerview.widget.C1445j.AbstractC1451e
        /* renamed from: b */
        public final /* synthetic */ boolean mo4954b(AbstractC1956s<?> sVar, AbstractC1956s<?> sVar2) {
            return sVar.equals(sVar2);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // androidx.recyclerview.widget.C1445j.AbstractC1451e
        /* renamed from: c */
        public final /* synthetic */ Object mo4955c(AbstractC1956s<?> sVar, AbstractC1956s<?> sVar2) {
            return new C1940j(sVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // androidx.recyclerview.widget.C1445j.AbstractC1451e
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ boolean mo4953a(AbstractC1956s<?> sVar, AbstractC1956s<?> sVar2) {
            if (sVar.f5838a == sVar2.f5838a) {
                return true;
            }
            return false;
        }
    };

    /* renamed from: e */
    final C1915ae f5821e;

    /* renamed from: f */
    public final C1925c f5822f;

    /* renamed from: g */
    final AbstractC1944n f5823g;

    /* renamed from: h */
    final List<AbstractC1917ag> f5824h = new ArrayList();

    /* renamed from: i */
    private int f5825i;

    /* access modifiers changed from: package-private */
    @Override // com.airbnb.epoxy.AbstractC1931d
    /* renamed from: b */
    public final boolean mo5723b() {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a, com.airbnb.epoxy.AbstractC1931d
    public final int getItemCount() {
        return this.f5825i;
    }

    /* access modifiers changed from: package-private */
    @Override // com.airbnb.epoxy.AbstractC1931d
    /* renamed from: a */
    public final List<? extends AbstractC1956s<?>> mo5715a() {
        return this.f5822f.f5778f;
    }

    @Override // com.airbnb.epoxy.AbstractC1931d
    /* renamed from: c */
    public final C1933e mo5725c() {
        return super.mo5725c();
    }

    static {
        Covode.recordClassIndex(2142);
    }

    @Override // com.airbnb.epoxy.AbstractC1931d
    /* renamed from: b */
    public final void mo5721b(View view) {
        this.f5823g.teardownStickyHeaderView(view);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        this.f5823g.onAttachedToRecyclerViewInternal(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        this.f5823g.onDetachedFromRecyclerViewInternal(recyclerView);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder] */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a, com.airbnb.epoxy.AbstractC1931d
    public final /* synthetic */ void onViewAttachedToWindow(C1974u uVar) {
        onViewAttachedToWindow(uVar);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder] */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a, com.airbnb.epoxy.AbstractC1931d
    public final /* synthetic */ void onViewDetachedFromWindow(C1974u uVar) {
        onViewDetachedFromWindow(uVar);
    }

    @Override // com.airbnb.epoxy.AbstractC1931d
    /* renamed from: a */
    public final void mo5716a(View view) {
        this.f5823g.setupStickyHeaderView(view);
    }

    @Override // com.airbnb.epoxy.AbstractC1931d
    /* renamed from: b */
    public final void mo5722b(C1974u uVar) {
        super.onViewDetachedFromWindow(uVar);
        this.f5823g.onViewDetachedFromWindow(uVar, uVar.mo5821b());
    }

    @Override // com.airbnb.epoxy.AbstractC1931d
    /* renamed from: a */
    public final void mo5717a(C1974u uVar) {
        super.onViewAttachedToWindow(uVar);
        this.f5823g.onViewAttachedToWindow(uVar, uVar.mo5821b());
    }

    @Override // com.airbnb.epoxy.AbstractC1931d
    /* renamed from: b */
    public final boolean mo5724b(int i) {
        return this.f5823g.isStickyHeader(i);
    }

    @Override // com.airbnb.epoxy.AbstractC1931d
    /* renamed from: a */
    public final int mo5713a(AbstractC1956s<?> sVar) {
        int size = this.f5822f.f5778f.size();
        for (int i = 0; i < size; i++) {
            if (((AbstractC1956s) this.f5822f.f5778f.get(i)).f5838a == sVar.f5838a) {
                return i;
            }
        }
        return -1;
    }

    @Override // com.airbnb.epoxy.C1925c.AbstractC1930c
    /* renamed from: a */
    public final void mo5712a(C1941k kVar) {
        this.f5825i = kVar.f5811b.size();
        this.f5821e.f5769a = true;
        C1415b bVar = new C1415b(this);
        if (kVar.f5812c != null) {
            kVar.f5812c.mo4952a(bVar);
        } else if (kVar.f5811b.isEmpty() && !kVar.f5810a.isEmpty()) {
            bVar.mo3775b(0, kVar.f5810a.size());
        } else if (!kVar.f5811b.isEmpty() && kVar.f5810a.isEmpty()) {
            bVar.mo3773a(0, kVar.f5811b.size());
        }
        this.f5821e.f5769a = false;
        for (int size = this.f5824h.size() - 1; size >= 0; size--) {
            this.f5824h.get(size);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo5781a(C1937h hVar) {
        int a;
        List<? extends AbstractC1956s<?>> list;
        MethodCollector.m26663i(5524);
        List<? extends AbstractC1956s<?>> list2 = this.f5822f.f5778f;
        if (!list2.isEmpty()) {
            if (((AbstractC1956s) list2.get(0)).mo5797d()) {
                for (int i = 0; i < list2.size(); i++) {
                    ((AbstractC1956s) list2.get(i)).mo5791a("The model was changed between being bound and when models were rebuilt", i);
                }
            }
        }
        C1925c cVar = this.f5822f;
        synchronized (cVar) {
            try {
                a = cVar.f5776d.mo5708a();
                list = cVar.f5777e;
            } catch (Throwable th) {
                MethodCollector.m26664o(5524);
                throw th;
            }
        }
        if (hVar == list) {
            if (list == null) {
                list = Collections.emptyList();
            }
            cVar.mo5703a(a, hVar, new C1941k(list, list, null));
            MethodCollector.m26664o(5524);
        } else if (hVar == null || hVar.isEmpty()) {
            cVar.mo5703a(a, null, (list == null || list.isEmpty()) ? null : new C1941k(list, Collections.EMPTY_LIST, null));
            MethodCollector.m26664o(5524);
        } else if (list == null || list.isEmpty()) {
            cVar.mo5703a(a, hVar, new C1941k(Collections.EMPTY_LIST, hVar, null));
            MethodCollector.m26664o(5524);
        } else {
            cVar.f5773a.execute(
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0096: INVOKE  
                  (wrap: java.util.concurrent.Executor : 0x008f: IGET  (r0v10 java.util.concurrent.Executor) = (r6v0 'cVar' com.airbnb.epoxy.c) com.airbnb.epoxy.c.a java.util.concurrent.Executor)
                  (wrap: com.airbnb.epoxy.c$1 : 0x0093: CONSTRUCTOR  (r5v0 com.airbnb.epoxy.c$1) = 
                  (r6v0 'cVar' com.airbnb.epoxy.c)
                  (wrap: com.airbnb.epoxy.c$a : 0x008c: CONSTRUCTOR  (r7v0 com.airbnb.epoxy.c$a) = 
                  (r10v0 'list' java.util.List<? extends com.airbnb.epoxy.s<?>>)
                  (r12v0 'hVar' com.airbnb.epoxy.h)
                  (wrap: androidx.recyclerview.widget.j$e<com.airbnb.epoxy.s<?>> : 0x008a: IGET  (r0v9 androidx.recyclerview.widget.j$e<com.airbnb.epoxy.s<?>>) = (r6v0 'cVar' com.airbnb.epoxy.c) com.airbnb.epoxy.c.c androidx.recyclerview.widget.j$e)
                 call: com.airbnb.epoxy.c.a.<init>(java.util.List, java.util.List, androidx.recyclerview.widget.j$e):void type: CONSTRUCTOR)
                  (r8v0 'a' int)
                  (r12v0 'hVar' com.airbnb.epoxy.h)
                  (r10v0 'list' java.util.List<? extends com.airbnb.epoxy.s<?>>)
                 call: com.airbnb.epoxy.c.1.<init>(com.airbnb.epoxy.c, com.airbnb.epoxy.c$a, int, java.util.List, java.util.List):void type: CONSTRUCTOR)
                 type: INTERFACE call: java.util.concurrent.Executor.execute(java.lang.Runnable):void in method: com.airbnb.epoxy.o.a(com.airbnb.epoxy.h):void, file: classes9.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:157)
                	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:176)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:153)
                	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:176)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:153)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0093: CONSTRUCTOR  (r5v0 com.airbnb.epoxy.c$1) = 
                  (r6v0 'cVar' com.airbnb.epoxy.c)
                  (wrap: com.airbnb.epoxy.c$a : 0x008c: CONSTRUCTOR  (r7v0 com.airbnb.epoxy.c$a) = 
                  (r10v0 'list' java.util.List<? extends com.airbnb.epoxy.s<?>>)
                  (r12v0 'hVar' com.airbnb.epoxy.h)
                  (wrap: androidx.recyclerview.widget.j$e<com.airbnb.epoxy.s<?>> : 0x008a: IGET  (r0v9 androidx.recyclerview.widget.j$e<com.airbnb.epoxy.s<?>>) = (r6v0 'cVar' com.airbnb.epoxy.c) com.airbnb.epoxy.c.c androidx.recyclerview.widget.j$e)
                 call: com.airbnb.epoxy.c.a.<init>(java.util.List, java.util.List, androidx.recyclerview.widget.j$e):void type: CONSTRUCTOR)
                  (r8v0 'a' int)
                  (r12v0 'hVar' com.airbnb.epoxy.h)
                  (r10v0 'list' java.util.List<? extends com.airbnb.epoxy.s<?>>)
                 call: com.airbnb.epoxy.c.1.<init>(com.airbnb.epoxy.c, com.airbnb.epoxy.c$a, int, java.util.List, java.util.List):void type: CONSTRUCTOR in method: com.airbnb.epoxy.o.a(com.airbnb.epoxy.h):void, file: classes9.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                	... 23 more
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.airbnb.epoxy.c, state: GENERATED_AND_UNLOADED
                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                	... 29 more
                */
            /*
            // Method dump skipped, instructions count: 163
            */
            throw new UnsupportedOperationException("Method not decompiled: com.airbnb.epoxy.C1951o.mo5781a(com.airbnb.epoxy.h):void");
        }

        /* access modifiers changed from: protected */
        @Override // com.airbnb.epoxy.AbstractC1931d
        /* renamed from: a */
        public final void mo5720a(RuntimeException runtimeException) {
            this.f5823g.onExceptionSwallowed(runtimeException);
        }

        C1951o(AbstractC1944n nVar, Handler handler) {
            C1915ae aeVar = new C1915ae();
            this.f5821e = aeVar;
            this.f5823g = nVar;
            this.f5822f = new C1925c(handler, this, f5820j);
            registerAdapterDataObserver(aeVar);
        }

        /* access modifiers changed from: protected */
        @Override // com.airbnb.epoxy.AbstractC1931d
        /* renamed from: a */
        public final void mo5718a(C1974u uVar, AbstractC1956s<?> sVar) {
            this.f5823g.onModelUnbound(uVar, sVar);
        }

        /* access modifiers changed from: protected */
        @Override // com.airbnb.epoxy.AbstractC1931d
        /* renamed from: a */
        public final void mo5719a(C1974u uVar, AbstractC1956s<?> sVar, int i, AbstractC1956s<?> sVar2) {
            this.f5823g.onModelBound(uVar, sVar, i, sVar2);
        }
    }
