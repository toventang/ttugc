package com.p2082ss.android.ugc.aweme.discover.lynx.p2783e;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.loader.SmartImageView;
import com.lynx.tasm.LynxView;
import com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b;
import com.p2082ss.android.ugc.aweme.discover.lynx.delegate.C42224d;
import com.p2082ss.android.ugc.aweme.discover.lynx.p2779a.C42186b;
import com.p2082ss.android.ugc.aweme.discover.lynx.p2781c.AbstractC42199a;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.C42345d;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.p2793e.AbstractC42367a;
import com.p2082ss.android.ugc.aweme.discover.p2766b.AbstractC41858b;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.search.model.C67678d;
import com.p2082ss.android.ugc.aweme.search.p3694j.AbstractC67459a;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67568r;
import com.p2082ss.android.ugc.aweme.xsearch.horizontallist.C81704g;
import com.p2082ss.android.ugc.aweme.xsearch.live.C81741b;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.lynx.e.a */
public final class View$OnAttachStateChangeListenerC42258a extends RecyclerView.ViewHolder implements View.OnAttachStateChangeListener, AbstractC41858b, AbstractC42367a, AbstractC67459a {

    /* renamed from: b */
    public static long f98459b = -1;

    /* renamed from: c */
    public static long f98460c = -1;

    /* renamed from: d */
    public static final C42259a f98461d = new C42259a((byte) 0);

    /* renamed from: a */
    public C42186b f98462a;

    /* renamed from: e */
    private final AbstractC89244h f98463e;

    /* renamed from: f */
    private boolean f98464f;

    /* renamed from: g */
    private boolean f98465g;

    /* renamed from: h */
    private C67568r f98466h;

    /* renamed from: i */
    private AbstractC34186b.AbstractC34192d f98467i;

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34192d
    public final void an_() {
    }

    /* renamed from: e */
    public final C42224d mo71451e() {
        return (C42224d) this.f98463e.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.search.p3694j.AbstractC67459a
    /* renamed from: k */
    public final C67678d mo60383k() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.search.p3694j.AbstractC67459a
    /* renamed from: p */
    public final int mo60388p() {
        return -1;
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2766b.AbstractC41858b
    /* renamed from: q */
    public final void mo60389q() {
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2766b.AbstractC41858b
    /* renamed from: r */
    public final boolean mo60390r() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2766b.AbstractC41858b
    /* renamed from: s */
    public final SmartImageView mo60391s() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2766b.AbstractC41858b
    /* renamed from: t */
    public final AbstractC34186b.AbstractC34192d mo60392t() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.search.p3694j.AbstractC67459a
    /* renamed from: u */
    public final boolean mo60393u() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.search.p3694j.AbstractC67459a
    /* renamed from: v */
    public final void mo60394v() {
    }

    @Override // com.p2082ss.android.ugc.aweme.search.p3694j.AbstractC67459a
    /* renamed from: w */
    public final void mo60395w() {
    }

    @Override // com.p2082ss.android.ugc.aweme.search.p3694j.AbstractC67459a
    /* renamed from: x */
    public final Aweme mo60396x() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.search.p3694j.AbstractC67459a
    /* renamed from: y */
    public final boolean mo60397y() {
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.lynx.e.a$a */
    public static final class C42259a {
        static {
            Covode.recordClassIndex(50201);
        }

        private C42259a() {
        }

        public /* synthetic */ C42259a(byte b) {
            this();
        }

        /* renamed from: a */
        public static View$OnAttachStateChangeListenerC42258a m84600a(ViewGroup viewGroup, AbstractC42263c cVar) {
            C89219l.m154721d(viewGroup, "");
            long currentTimeMillis = System.currentTimeMillis();
            Context context = viewGroup.getContext();
            C89219l.m154716b(context, "");
            View$OnAttachStateChangeListenerC42258a aVar = new View$OnAttachStateChangeListenerC42258a(C42224d.C42225a.m84515a(context));
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            C42224d e = aVar.mo71451e();
            if (!(e == null || cVar == null)) {
                for (T t : cVar.mo71317a(e.f98388b)) {
                    C42224d e2 = aVar.mo71451e();
                    if (e2 != null) {
                        e2.mo71430a(t);
                    }
                }
            }
            if (currentTimeMillis2 <= View$OnAttachStateChangeListenerC42258a.f98460c) {
                currentTimeMillis2 = View$OnAttachStateChangeListenerC42258a.f98460c;
            }
            View$OnAttachStateChangeListenerC42258a.f98460c = currentTimeMillis2;
            return aVar;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42642ah
    /* renamed from: b */
    public final RecyclerView.ViewHolder mo70833b() {
        return this;
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2766b.AbstractC41858b
    /* renamed from: h */
    public final AbstractC67459a mo60380h() {
        return this;
    }

    @Override // com.p2082ss.android.ugc.aweme.search.p3694j.AbstractC67459a
    /* renamed from: i */
    public final boolean mo60381i() {
        return this.f98465g;
    }

    @Override // com.p2082ss.android.ugc.aweme.search.p3694j.AbstractC67459a
    /* renamed from: j */
    public final boolean mo60382j() {
        return this.f98464f;
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34192d
    /* renamed from: A */
    public final void mo60424A() {
        AbstractC34186b.AbstractC34192d dVar = this.f98467i;
        if (dVar != null) {
            dVar.mo60424A();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34192d
    /* renamed from: B */
    public final void mo60425B() {
        AbstractC34186b.AbstractC34192d dVar = this.f98467i;
        if (dVar != null) {
            dVar.mo60425B();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34192d
    public final void bg_() {
        AbstractC34186b.AbstractC34192d dVar = this.f98467i;
        if (dVar != null) {
            dVar.bg_();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34192d
    public final void bi_() {
        AbstractC34186b.AbstractC34192d dVar = this.f98467i;
        if (dVar != null) {
            dVar.bi_();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.search.p3694j.AbstractC67459a
    /* renamed from: l */
    public final View mo60384l() {
        View view = this.itemView;
        C89219l.m154716b(view, "");
        return view;
    }

    @Override // com.p2082ss.android.ugc.aweme.search.p3694j.AbstractC67459a
    /* renamed from: o */
    public final int mo60387o() {
        return getAdapterPosition();
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.mixfeed.p2793e.AbstractC42367a
    /* renamed from: C */
    public final void mo71445C() {
        C42224d e = mo71451e();
        if (e != null) {
            e.mo71434d();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.search.p3695k.AbstractC67566p
    /* renamed from: F */
    public final C67568r mo70877F() {
        C67568r rVar = this.f98466h;
        if (rVar == null) {
            return C67568r.C67569a.m119673a();
        }
        return rVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34192d
    public final boolean aZ_() {
        AbstractC34186b.AbstractC34192d dVar = this.f98467i;
        if (dVar != null) {
            return dVar.aZ_();
        }
        return false;
    }

    /* renamed from: g */
    public final void mo71452g() {
        C42224d e = mo71451e();
        if (e != null) {
            e.f98388b.f98328j = false;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.search.p3694j.AbstractC67459a
    /* renamed from: m */
    public final int mo60385m() {
        if (this.f98467i == null) {
            return 18;
        }
        return 62;
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34192d
    /* renamed from: z */
    public final View mo60468z() {
        AbstractC34186b.AbstractC34192d dVar = this.f98467i;
        if (dVar != null) {
            return dVar.mo60468z();
        }
        return null;
    }

    static {
        Covode.recordClassIndex(50200);
    }

    /* renamed from: a */
    public final C42186b mo71447a() {
        C42186b bVar = this.f98462a;
        if (bVar == null) {
            C89219l.m154710a("bContext");
        }
        return bVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.search.p3694j.AbstractC67459a
    /* renamed from: n */
    public final int mo60386n() {
        View view = this.itemView;
        C89219l.m154716b(view, "");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof GridLayoutManager.C1336b)) {
            layoutParams = null;
        }
        GridLayoutManager.C1336b bVar = (GridLayoutManager.C1336b) layoutParams;
        if (bVar != null) {
            return bVar.f4324a;
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.discover.lynx.e.a$b */
    public static final class C42260b extends AbstractC89220m implements AbstractC89171a<C42224d> {

        /* renamed from: a */
        final /* synthetic */ View$OnAttachStateChangeListenerC42258a f98468a;

        /* renamed from: b */
        final /* synthetic */ View f98469b;

        static {
            Covode.recordClassIndex(50202);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42260b(View$OnAttachStateChangeListenerC42258a aVar, View view) {
            super(0);
            this.f98468a = aVar;
            this.f98469b = view;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C42224d invoke() {
            View view = this.f98469b;
            if (!(view instanceof C42261b)) {
                view = null;
            }
            C42261b bVar = (C42261b) view;
            if (bVar == null) {
                return null;
            }
            View$OnAttachStateChangeListenerC42258a aVar = this.f98468a;
            C42186b bVar2 = new C42186b(bVar);
            C89219l.m154721d(bVar2, "");
            aVar.f98462a = bVar2;
            return new C42224d(this.f98468a.mo71447a());
        }
    }

    /* renamed from: D */
    public final boolean mo71446D() {
        C42224d e;
        C42186b bVar;
        C42224d e2;
        C42186b bVar2;
        LynxView lynxView;
        if (mo71451e() == null || (e = mo71451e()) == null || (bVar = e.f98388b) == null || bVar.f98322d == null || (e2 = mo71451e()) == null || (bVar2 = e2.f98388b) == null || (lynxView = bVar2.f98322d) == null || lynxView.getLynxContext() == null) {
            return false;
        }
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public View$OnAttachStateChangeListenerC42258a(View view) {
        super(view);
        C89219l.m154721d(view, "");
        this.f98463e = C89250i.m154773a((AbstractC89171a) new C42260b(this, view));
        view.addOnAttachStateChangeListener(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        if (r0 == null) goto L_0x000d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewAttachedToWindow(android.view.View r3) {
        /*
            r2 = this;
            r0 = 1
            r2.f98465g = r0
            com.ss.android.ugc.aweme.discover.lynx.delegate.d r0 = r2.mo71451e()
            if (r0 == 0) goto L_0x0024
            java.util.List<com.ss.android.ugc.aweme.discover.lynx.delegate.b> r0 = r0.f98387a
            if (r0 != 0) goto L_0x0010
        L_0x000d:
            p4600h.p4611f.p4613b.C89219l.m154715b()
        L_0x0010:
            java.util.Iterator r1 = r0.iterator()
        L_0x0014:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0026
            java.lang.Object r0 = r1.next()
            com.ss.android.ugc.aweme.discover.lynx.delegate.b r0 = (com.p2082ss.android.ugc.aweme.discover.lynx.delegate.AbstractC42218b) r0
            r0.mo71431b()
            goto L_0x0014
        L_0x0024:
            r0 = 0
            goto L_0x000d
        L_0x0026:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.discover.lynx.p2783e.View$OnAttachStateChangeListenerC42258a.onViewAttachedToWindow(android.view.View):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        if (r0 == null) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewDetachedFromWindow(android.view.View r3) {
        /*
            r2 = this;
            r0 = 0
            r2.f98465g = r0
            r2.f98464f = r0
            com.ss.android.ugc.aweme.discover.lynx.delegate.d r0 = r2.mo71451e()
            if (r0 == 0) goto L_0x0026
            java.util.List<com.ss.android.ugc.aweme.discover.lynx.delegate.b> r0 = r0.f98387a
            if (r0 != 0) goto L_0x0012
        L_0x000f:
            p4600h.p4611f.p4613b.C89219l.m154715b()
        L_0x0012:
            java.util.Iterator r1 = r0.iterator()
        L_0x0016:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0028
            java.lang.Object r0 = r1.next()
            com.ss.android.ugc.aweme.discover.lynx.delegate.b r0 = (com.p2082ss.android.ugc.aweme.discover.lynx.delegate.AbstractC42218b) r0
            r0.mo71432c()
            goto L_0x0016
        L_0x0026:
            r0 = 0
            goto L_0x000f
        L_0x0028:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.discover.lynx.p2783e.View$OnAttachStateChangeListenerC42258a.onViewDetachedFromWindow(android.view.View):void");
    }

    /* renamed from: a */
    private final boolean m84567a(View view) {
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.addLast(view);
        while (true) {
            if (arrayDeque.isEmpty()) {
                return false;
            }
            Object first = arrayDeque.getFirst();
            Objects.requireNonNull(first, "null cannot be cast to non-null type android.view.View");
            View view2 = (View) first;
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    if (viewGroup.getChildAt(i) instanceof C81741b) {
                        View childAt = viewGroup.getChildAt(i);
                        Objects.requireNonNull(childAt, "null cannot be cast to non-null type com.ss.android.ugc.aweme.xsearch.live.SearchLiveForLynx");
                        this.f98467i = (C81741b) childAt;
                        return true;
                    } else if (viewGroup.getChildAt(i) instanceof C81704g) {
                        View childAt2 = viewGroup.getChildAt(i);
                        Objects.requireNonNull(childAt2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.xsearch.horizontallist.SearchHorizontalForLynx");
                        this.f98467i = (C81704g) childAt2;
                        return true;
                    } else {
                        arrayDeque.addLast(viewGroup.getChildAt(i));
                    }
                }
                continue;
            }
            arrayDeque.pollFirst();
        }
    }

    /* renamed from: a */
    public final void mo71448a(AbstractC42199a aVar) {
        C42224d e = mo71451e();
        if (e != null) {
            e.f98388b.f98332n = aVar;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.search.p3695k.AbstractC67566p
    /* renamed from: a */
    public final void mo70880a(C67568r rVar) {
        C89219l.m154721d(rVar, "");
        this.f98466h = rVar;
        String str = rVar.f151311f;
        if (!TextUtils.isEmpty(str)) {
            View view = this.itemView;
            C89219l.m154716b(view, "");
            view.setTag(this.f98466h);
            C42186b bVar = this.f98462a;
            if (bVar == null) {
                C89219l.m154710a("bContext");
            }
            bVar.f98333o = str;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.mixfeed.p2793e.AbstractC42367a
    /* renamed from: a */
    public final void mo71450a(C42345d dVar, Map<String, ? extends Object> map) {
        C89219l.m154721d(dVar, "");
        C42224d e = mo71451e();
        if (e != null) {
            e.f98388b.f98329k = true;
        }
        m84565a(this, dVar, map, 24);
    }

    /* renamed from: a */
    private final void m84566a(C42345d dVar, int i, Map<String, ? extends Object> map) {
        C42224d e = mo71451e();
        if (e == null) {
            return;
        }
        if (C89219l.m154714a(e.f98388b.f98326h, dVar)) {
            View view = this.itemView;
            Objects.requireNonNull(view, "null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.lynx.viewholder.BulletWrapperView");
            ((C42261b) view).mo71455a();
            LynxView lynxView = e.f98388b.f98322d;
            if (lynxView != null) {
                lynxView.onEnterForeground();
                return;
            }
            return;
        }
        e.f98388b.f98326h = dVar;
        e.f98388b.f98325g = Integer.valueOf(i);
        e.f98388b.f98327i = map;
        e.f98388b.mo71387b();
        e.mo71429a();
    }

    /* renamed from: a */
    public static /* synthetic */ void m84565a(View$OnAttachStateChangeListenerC42258a aVar, C42345d dVar, Map map, int i) {
        Map map2 = map;
        if ((i & 4) != 0) {
            map2 = null;
        }
        aVar.mo71449a(dVar, null, map2, null, null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo71449a(com.p2082ss.android.ugc.aweme.discover.mixfeed.C42345d r7, com.p2082ss.android.ugc.aweme.search.theme.C67782c r8, java.util.Map<java.lang.String, ? extends java.lang.Object> r9, com.p2082ss.android.ugc.aweme.flowfeed.p2993a.AbstractC51043a r10, com.p2082ss.android.ugc.aweme.discover.p2766b.View$OnAttachStateChangeListenerC41864g r11) {
        /*
        // Method dump skipped, instructions count: 130
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.discover.lynx.p2783e.View$OnAttachStateChangeListenerC42258a.mo71449a(com.ss.android.ugc.aweme.discover.mixfeed.d, com.ss.android.ugc.aweme.search.theme.c, java.util.Map, com.ss.android.ugc.aweme.flowfeed.a.a, com.ss.android.ugc.aweme.discover.b.g):void");
    }
}
