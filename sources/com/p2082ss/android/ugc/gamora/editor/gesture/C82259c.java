package com.p2082ss.android.ugc.gamora.editor.gesture;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1171ab;
import androidx.lifecycle.C1175ad;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.jedi.arch.AbstractC20362a;
import com.bytedance.jedi.arch.AbstractC20367ae;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.AbstractC20382b;
import com.bytedance.jedi.arch.AbstractC20477i;
import com.bytedance.jedi.arch.AbstractC20534v;
import com.bytedance.jedi.arch.C20365ac;
import com.bytedance.jedi.arch.C20370ah;
import com.bytedance.jedi.arch.C20373ak;
import com.bytedance.jedi.arch.C20374al;
import com.bytedance.jedi.arch.C20375am;
import com.bytedance.jedi.arch.C20376an;
import com.bytedance.jedi.arch.C20391d;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p1559o.p1561b.C21572a;
import com.bytedance.p969f.p970a.p971a.AbstractC14552j;
import com.bytedance.provider.p1587vm.ScopeViewModel;
import com.bytedance.scene.AbstractC22219j;
import com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a;
import com.p2082ss.android.ugc.aweme.sticker.C75673r;
import com.p2082ss.android.ugc.gamora.editor.C83253u;
import com.p2082ss.android.ugc.gamora.editor.C83254v;
import com.p2082ss.android.ugc.gamora.editor.filter.core.AbstractC82200a;
import com.p2082ss.android.ugc.gamora.editor.progress.AbstractC82478a;
import com.p2082ss.android.ugc.gamora.editor.sticker.core.AbstractC82610a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89378p;
import p4600h.C89386u;
import p4600h.C89391z;
import p4600h.EnumC89331m;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4612a.AbstractC89188r;
import p4600h.p4611f.p4612a.AbstractC89189s;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4616h.AbstractC89248d;
import p4600h.p4620k.AbstractC89277c;
import p4600h.p4620k.AbstractC89286i;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.gamora.editor.gesture.c */
public final class C82259c extends AbstractC22219j implements AbstractC20382b, AbstractC21566a {

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f184024a = {new C89232y(C82259c.class, "editStickerApi", "getEditStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/core/EditStickerApi;", 0)};

    /* renamed from: c */
    public static final C82264e f184025c = new C82264e((byte) 0);

    /* renamed from: b */
    public final AbstractC14552j f184026b;

    /* renamed from: d */
    private C75673r f184027d;

    /* renamed from: e */
    private final AbstractC89244h f184028e;

    /* renamed from: f */
    private final AbstractC89244h f184029f = C89250i.m154774a(EnumC89331m.NONE, new C82260a(this));

    /* renamed from: g */
    private final AbstractC89244h f184030g = C89250i.m154774a(EnumC89331m.NONE, new C82261b(this));

    /* renamed from: h */
    private final AbstractC89248d f184031h = C21572a.m40505b(getDiContainer(), AbstractC82610a.class);

    /* renamed from: i */
    private final AbstractC89244h f184032i = C89250i.m154774a(EnumC89331m.NONE, new C82263d(this));

    /* renamed from: j */
    private final C82269j f184033j = new C82269j(this);

    /* renamed from: k */
    private final C21582f f184034k;

    static {
        Covode.recordClassIndex(96093);
    }

    /* renamed from: a */
    private final EditGestureViewModel m142299a() {
        return (EditGestureViewModel) this.f184028e.getValue();
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.gesture.c$e */
    public static final class C82264e {
        static {
            Covode.recordClassIndex(96098);
        }

        private C82264e() {
        }

        public /* synthetic */ C82264e(byte b) {
            this();
        }
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f184034k;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.AbstractC20367ae
    public final /* bridge */ /* synthetic */ AbstractC20477i getReceiver() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20534v
    public final AbstractC1204m getLifecycleOwner() {
        return AbstractC20382b.C20383a.m38581a(this);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final AbstractC20534v getLifecycleOwnerHolder() {
        return AbstractC20382b.C20383a.m38601b(this);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final AbstractC20367ae<AbstractC20477i> getReceiverHolder() {
        return AbstractC20382b.C20383a.m38604c(this);
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.gesture.c$a */
    public static final class C82260a extends AbstractC89220m implements AbstractC89171a<AbstractC82200a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f184035a;

        static {
            Covode.recordClassIndex(96094);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C82260a(AbstractC21566a aVar) {
            super(0);
            this.f184035a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.gamora.editor.filter.core.a, com.bytedance.als.b] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.gamora.editor.filter.core.AbstractC82200a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f184035a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.gamora.editor.filter.core.a> r1 = com.p2082ss.android.ugc.gamora.editor.filter.core.AbstractC82200a.class
                r0 = 0
                java.lang.Object r0 = r2.mo35249a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.gesture.C82259c.C82260a.invoke():com.bytedance.als.b");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.gesture.c$b */
    public static final class C82261b extends AbstractC89220m implements AbstractC89171a<AbstractC72510a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f184036a;

        static {
            Covode.recordClassIndex(96095);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C82261b(AbstractC21566a aVar) {
            super(0);
            this.f184036a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.aweme.shortvideo.preview.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f184036a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.aweme.shortvideo.preview.a> r1 = com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a.class
                r0 = 0
                java.lang.Object r0 = r2.mo35249a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.gesture.C82259c.C82261b.invoke():com.bytedance.als.b");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.gesture.c$d */
    public static final class C82263d extends AbstractC89220m implements AbstractC89171a<AbstractC82478a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f184040a;

        static {
            Covode.recordClassIndex(96097);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C82263d(AbstractC21566a aVar) {
            super(0);
            this.f184040a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.gamora.editor.progress.a, com.bytedance.als.b] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.gamora.editor.progress.AbstractC82478a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f184040a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.gamora.editor.progress.a> r1 = com.p2082ss.android.ugc.gamora.editor.progress.AbstractC82478a.class
                r0 = 0
                java.lang.Object r0 = r2.mo35252b(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.gesture.C82259c.C82263d.invoke():com.bytedance.als.b");
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: n_ */
    public final void mo22713n_() {
        super.mo22713n_();
        C75673r rVar = this.f184027d;
        if (rVar == null) {
            C89219l.m154710a("stickerPanelGestureAdapter");
        }
        rVar.f170094b = null;
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.gesture.c$j */
    public static final class C82269j implements C75673r.AbstractC75674a {

        /* renamed from: a */
        final /* synthetic */ C82259c f184045a;

        static {
            Covode.recordClassIndex(96103);
        }

        @Override // com.p2082ss.android.ugc.aweme.sticker.C75673r.AbstractC75674a
        /* renamed from: a */
        public final void mo119404a() {
            AbstractC22219j jVar = this.f184045a.f52551o;
            if (!(jVar instanceof C83254v)) {
                jVar = null;
            }
            C83254v vVar = (C83254v) jVar;
            if (vVar != null) {
                vVar.mo128347ad();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C82269j(C82259c cVar) {
            this.f184045a = cVar;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.gesture.c$c */
    public static final class C82262c extends AbstractC89220m implements AbstractC89171a<EditGestureViewModel> {

        /* renamed from: a */
        final /* synthetic */ AbstractC22219j f184037a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89277c f184038b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89277c f184039c;

        static {
            Covode.recordClassIndex(96096);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C82262c(AbstractC22219j jVar, AbstractC89277c cVar, AbstractC89277c cVar2) {
            super(0);
            this.f184037a = jVar;
            this.f184038b = cVar;
            this.f184039c = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v8, types: [com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.gamora.editor.gesture.EditGestureViewModel] */
        /* JADX WARN: Type inference failed for: r0v15, types: [com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.gamora.editor.gesture.EditGestureViewModel] */
        /* JADX WARNING: Unknown variable types count: 2 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.gamora.editor.gesture.EditGestureViewModel invoke() {
            /*
                r6 = this;
                com.bytedance.scene.j r0 = r6.f184037a
                com.bytedance.scene.j r5 = r0.f52551o
                h.k.c r0 = r6.f184039c
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                java.lang.String r3 = r0.getCanonicalName()
                java.lang.String r4 = ""
                p4600h.p4611f.p4613b.C89219l.m154716b(r3, r4)
            L_0x0013:
                if (r5 == 0) goto L_0x003a
                androidx.lifecycle.ad$b r0 = com.bytedance.jedi.arch.C20392e.f48284a     // Catch:{ as -> 0x0035 }
                androidx.lifecycle.ad r2 = com.bytedance.scene.C22267s.m41934a(r5, r0)     // Catch:{ as -> 0x0035 }
                h.k.c r0 = r6.f184039c     // Catch:{ as -> 0x0035 }
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)     // Catch:{ as -> 0x0035 }
                java.lang.String r1 = r0.getCanonicalName()     // Catch:{ as -> 0x0035 }
                p4600h.p4611f.p4613b.C89219l.m154716b(r1, r4)     // Catch:{ as -> 0x0035 }
                h.k.c r0 = r6.f184038b     // Catch:{ as -> 0x0035 }
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)     // Catch:{ as -> 0x0035 }
                androidx.lifecycle.ac r0 = m142304x52b6d7f1(r2, r1, r0)     // Catch:{ as -> 0x0035 }
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0     // Catch:{ as -> 0x0035 }
                goto L_0x0038
            L_0x0035:
                com.bytedance.scene.j r5 = r5.f52551o
                goto L_0x0013
            L_0x0038:
                if (r0 != 0) goto L_0x0052
            L_0x003a:
                com.bytedance.scene.j r0 = r6.f184037a
                androidx.fragment.app.e r1 = com.bytedance.scene.ktx.C22228c.m41832b(r0)
                androidx.lifecycle.ad$b r0 = com.bytedance.jedi.arch.C20392e.f48284a
                androidx.lifecycle.ad r1 = androidx.lifecycle.C1181ae.m3881a(r1, r0)
                h.k.c r0 = r6.f184038b
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                androidx.lifecycle.ac r0 = m142304x52b6d7f1(r1, r3, r0)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
            L_0x0052:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.gesture.C82259c.C82262c.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        /* renamed from: com_ss_android_ugc_gamora_editor_gesture_EditGestureScene$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get */
        public static AbstractC1174ac m142304x52b6d7f1(C1175ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.mo3984a(str, cls);
            }
            AbstractC1174ac a = adVar.mo3984a(str, cls);
            C1171ab.m3870a(a, adVar);
            return a;
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af> S1 getState(VM1 vm1) {
        C89219l.m154721d(vm1, "");
        return (S1) AbstractC20382b.C20383a.m38582a(this, vm1);
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.gesture.c$f */
    static final class C82265f<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C82259c f184041a;

        static {
            Covode.recordClassIndex(96099);
        }

        C82265f(C82259c cVar) {
            this.f184041a = cVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            C89386u uVar = (C89386u) obj;
            if (uVar != null) {
                this.f184041a.mo127431a(((Boolean) uVar.getThird()).booleanValue());
            }
        }
    }

    /* renamed from: a */
    public final void mo127431a(boolean z) {
        ((AbstractC82200a) this.f184029f.getValue()).mo127386a(z);
        AbstractC82478a aVar = (AbstractC82478a) this.f184032i.getValue();
        if (aVar != null) {
            aVar.mo127563a(z);
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final void mo22704a(Bundle bundle) {
        AbstractC89171a<Rect> aVar;
        super.mo22704a(bundle);
        ((AbstractC72510a) this.f184030g.getValue()).mo114781F().observe(this, new C82265f(this));
        selectNonNullSubscribe(m142299a(), C82270d.f184046a, new C20370ah(), new C82266g(this));
        AbstractC20382b.C20383a.m38603b(this, m142299a(), C82271e.f184047a, new C82267h(this));
        AbstractC20382b.C20383a.m38603b(this, m142299a(), C82272f.f184048a, new C82268i(this));
        AbstractC14552j jVar = this.f184026b;
        AbstractC82610a aVar2 = (AbstractC82610a) this.f184031h.mo23374a(this, f184024a[0]);
        if (aVar2 != null) {
            aVar = aVar2.mo127685h();
        } else {
            aVar = null;
        }
        C75673r rVar = new C75673r(jVar, aVar);
        this.f184027d = rVar;
        rVar.f170094b = this.f184033j;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af, R> R withState(VM1 vm1, AbstractC89172b<? super S1, ? extends R> bVar) {
        C89219l.m154721d(vm1, "");
        C89219l.m154721d(bVar, "");
        return (R) AbstractC20382b.C20383a.m38593a(this, vm1, bVar);
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.gesture.c$g */
    static final class C82266g extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C82259c f184042a;

        static {
            Covode.recordClassIndex(96100);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82266g(C82259c cVar) {
            super(2);
            this.f184042a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(bVar, "");
            this.f184042a.mo127431a(booleanValue);
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final View mo22702a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        MethodCollector.m26663i(9704);
        C89219l.m154721d(layoutInflater, "");
        C89219l.m154721d(viewGroup, "");
        View view = new View(viewGroup.getContext());
        MethodCollector.m26664o(9704);
        return view;
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.gesture.c$h */
    static final class C82267h extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, C89378p<? extends Float, ? extends Long>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C82259c f184043a;

        static {
            Covode.recordClassIndex(96101);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82267h(C82259c cVar) {
            super(2);
            this.f184043a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, C89378p<? extends Float, ? extends Long> pVar) {
            C89378p<? extends Float, ? extends Long> pVar2 = pVar;
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(pVar2, "");
            C83253u.m143652a(this.f184043a.f184026b.mo23382a(), ((Number) pVar2.getFirst()).floatValue(), ((Number) pVar2.getSecond()).longValue());
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.gesture.c$i */
    static final class C82268i extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, C89386u<? extends Float, ? extends Float, ? extends Float>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C82259c f184044a;

        static {
            Covode.recordClassIndex(96102);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82268i(C82259c cVar) {
            super(2);
            this.f184044a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, C89386u<? extends Float, ? extends Float, ? extends Float> uVar) {
            C89386u<? extends Float, ? extends Float, ? extends Float> uVar2 = uVar;
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(uVar2, "");
            C83253u.m143651a(this.f184044a.f184026b.mo23382a(), ((Number) uVar2.getFirst()).floatValue(), ((Number) uVar2.getSecond()).floatValue(), ((Number) uVar2.getThird()).floatValue());
            return C89391z.f203057a;
        }
    }

    public C82259c(AbstractC14552j jVar, C21582f fVar) {
        C89219l.m154721d(jVar, "");
        C89219l.m154721d(fVar, "");
        this.f184026b = jVar;
        this.f184034k = fVar;
        AbstractC89277c a = C89204ab.m154669a(EditGestureViewModel.class);
        this.f184028e = C89250i.m154773a((AbstractC89171a) new C82262c(this, a, a));
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af> AbstractC88412b subscribe(JediViewModel<S> jediViewModel, C20370ah<S> ahVar, AbstractC89183m<? super AbstractC20477i, ? super S, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        return AbstractC20382b.C20383a.m38583a(this, jediViewModel, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public final <S extends AbstractC20368af, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, C20370ah<C20373ak<A>> ahVar, AbstractC89183m<? super AbstractC20382b, ? super A, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        AbstractC20382b.C20383a.m38599a(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, C20370ah<C20373ak<A>> ahVar, AbstractC89183m<? super AbstractC20477i, ? super A, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        return AbstractC20382b.C20383a.m38606d(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public final <S extends AbstractC20368af, A> void subscribeEvent(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends C20391d<? extends A>> kVar, C20370ah<C20373ak<C20391d<A>>> ahVar, AbstractC89183m<? super AbstractC20382b, ? super A, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        AbstractC20382b.C20383a.m38602b(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public final <S extends AbstractC20368af, A> void subscribeMultiEvent(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends C20365ac<? extends A>> kVar, C20370ah<C20373ak<C20365ac<A>>> ahVar, AbstractC89183m<? super AbstractC20382b, ? super A, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        AbstractC20382b.C20383a.m38605c(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A, B> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, C20370ah<C20374al<A, B>> ahVar, AbstractC89187q<? super AbstractC20477i, ? super A, ? super B, C89391z> qVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(qVar, "");
        return AbstractC20382b.C20383a.m38585a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, T> AbstractC88412b asyncSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends AbstractC20362a<? extends T>> kVar, C20370ah<C20373ak<AbstractC20362a<T>>> ahVar, AbstractC89183m<? super AbstractC20477i, ? super Throwable, C89391z> mVar, AbstractC89172b<? super AbstractC20477i, C89391z> bVar, AbstractC89183m<? super AbstractC20477i, ? super T, C89391z> mVar2) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        return AbstractC20382b.C20383a.m38584a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A, B, C> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, AbstractC89290k<S, ? extends C> kVar3, C20370ah<C20375am<A, B, C>> ahVar, AbstractC89188r<? super AbstractC20477i, ? super A, ? super B, ? super C, C89391z> rVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(kVar3, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(rVar, "");
        return AbstractC20382b.C20383a.m38586a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A, B, C, D> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, AbstractC89290k<S, ? extends C> kVar3, AbstractC89290k<S, ? extends D> kVar4, C20370ah<C20376an<A, B, C, D>> ahVar, AbstractC89189s<? super AbstractC20477i, ? super A, ? super B, ? super C, ? super D, C89391z> sVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(kVar3, "");
        C89219l.m154721d(kVar4, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(sVar, "");
        return AbstractC20382b.C20383a.m38587a(this, jediViewModel, kVar, kVar2, kVar3, kVar4, ahVar, sVar);
    }
}
