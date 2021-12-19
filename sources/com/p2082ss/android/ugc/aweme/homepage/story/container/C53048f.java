package com.p2082ss.android.ugc.aweme.homepage.story.container;

import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import com.bytedance.hox.Hox;
import com.bytedance.hox.p1106a.AbstractC15497d;
import com.bytedance.ies.uikit.p1279a.AbstractC18234b;
import com.p2082ss.android.ugc.aweme.C34792be;
import com.p2082ss.android.ugc.aweme.homepage.story.container.DrawerViewModel;
import com.p2082ss.android.ugc.aweme.homepage.story.container.StepDrawerContainer;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.homepage.story.container.f */
public final class C53048f extends StepDrawerContainer {

    /* renamed from: h */
    C53058j f121984h;

    /* renamed from: i */
    public AbstractC18234b f121985i;

    /* renamed from: j */
    private boolean f121986j;

    /* renamed from: k */
    private final AbstractC89244h f121987k;

    /* renamed from: l */
    private View f121988l;

    static {
        Covode.recordClassIndex(62593);
    }

    public final DrawerViewModel getDrawerViewModel() {
        return (DrawerViewModel) this.f121987k.getValue();
    }

    public final View getContentView() {
        return this.f121988l;
    }

    public final C53058j getSidebarContainer() {
        return this.f121984h;
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.container.f$e */
    public static final class C53053e implements AbstractC53046d {

        /* renamed from: a */
        final /* synthetic */ C53048f f121993a;

        static {
            Covode.recordClassIndex(62598);
        }

        @Override // com.p2082ss.android.ugc.aweme.homepage.story.container.AbstractC53041a
        /* renamed from: a */
        public final void mo37184a() {
        }

        @Override // com.p2082ss.android.ugc.aweme.homepage.story.container.AbstractC53041a
        /* renamed from: a */
        public final void mo37185a(float f) {
        }

        @Override // com.p2082ss.android.ugc.aweme.homepage.story.container.AbstractC53041a
        /* renamed from: a */
        public final void mo37186a(int i, boolean z, boolean z2) {
        }

        @Override // com.p2082ss.android.ugc.aweme.homepage.story.container.AbstractC53041a
        /* renamed from: b */
        public final void mo37187b() {
        }

        @Override // com.p2082ss.android.ugc.aweme.homepage.story.container.AbstractC53046d
        /* renamed from: c */
        public final void mo89457c() {
            this.f121993a.mo89562c(true);
        }

        @Override // com.p2082ss.android.ugc.aweme.homepage.story.container.AbstractC53046d
        /* renamed from: d */
        public final void mo89458d() {
            this.f121993a.mo89562c(false);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C53053e(C53048f fVar) {
            this.f121993a = fVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.container.f$b */
    static final class C53050b extends AbstractC89220m implements AbstractC89171a<DrawerViewModel> {

        /* renamed from: a */
        final /* synthetic */ Context f121990a;

        static {
            Covode.recordClassIndex(62595);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C53050b(Context context) {
            super(0);
            this.f121990a = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ DrawerViewModel invoke() {
            Context context = this.f121990a;
            Objects.requireNonNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            return DrawerViewModel.C53032a.m97961a((ActivityC0945e) context);
        }
    }

    public final AbstractC18234b getHostFragment() {
        AbstractC18234b bVar = this.f121985i;
        if (bVar == null) {
            C89219l.m154710a("hostFragment");
        }
        return bVar;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.homepage.story.container.StepDrawerContainer
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        DrawerViewModel drawerViewModel = getDrawerViewModel();
        drawerViewModel.f121921e.clear();
        drawerViewModel.f121922f.clear();
    }

    /* renamed from: e */
    public final void mo89563e() {
        C53055h.m98054b("StoryContainer>>> onCreate");
        setNeedDrawShadow(true);
        mo89473a(new C53049a());
        Context context = getContext();
        if (!(context instanceof ActivityC0945e)) {
            context = null;
        }
        ActivityC0945e eVar = (ActivityC0945e) context;
        if (eVar != null) {
            Hox.C15490a.m28529a(eVar).mo25209a("HOME", new C53051c(this));
            getDrawerViewModel().f121923g.observe(eVar, new C53052d(this));
        }
        getDrawerViewModel().mo89467a(new C53053e(this));
    }

    public final void setContentView(View view) {
        this.f121988l = view;
    }

    public final void setSidebarContainer(C53058j jVar) {
        this.f121984h = jVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.container.f$a */
    public final class C53049a implements StepDrawerContainer.AbstractC53037b {
        static {
            Covode.recordClassIndex(62594);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public C53049a() {
        }

        @Override // com.p2082ss.android.ugc.aweme.homepage.story.container.StepDrawerContainer.AbstractC53037b
        /* renamed from: a */
        public final void mo89544a(View view, boolean z) {
            C89219l.m154721d(view, "");
            C53055h.m98052a("onDrawerClosed: isStep:" + z + ' ');
            if (z) {
                C53048f.this.getDrawerViewModel().f121918b.setValue(false);
                for (AbstractC53047e eVar : C89070n.m154590j(C53048f.this.getDrawerViewModel().f121921e)) {
                    eVar.mo37189c();
                }
            } else {
                C53048f.this.getDrawerViewModel().f121919c.setValue(false);
                for (AbstractC53046d dVar : C89070n.m154590j(C53048f.this.getDrawerViewModel().f121922f)) {
                    dVar.mo89458d();
                }
            }
            C53048f.this.getDrawerViewModel().f121917a.setValue(false);
            DrawerViewModel drawerViewModel = C53048f.this.getDrawerViewModel();
            for (AbstractC53041a aVar : C89070n.m154574d((Iterable) drawerViewModel.f121921e, (Iterable) drawerViewModel.f121922f)) {
                aVar.mo37187b();
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.homepage.story.container.StepDrawerContainer.AbstractC53037b
        /* renamed from: a */
        public final void mo89542a(int i, boolean z, boolean z2) {
            C53055h.m98052a("onDrawerStateChanged : newState:" + i + ", hasStep:" + z + ", isStepState:" + z2 + ' ');
            DrawerViewModel drawerViewModel = C53048f.this.getDrawerViewModel();
            for (AbstractC53041a aVar : C89070n.m154574d((Iterable) drawerViewModel.f121921e, (Iterable) drawerViewModel.f121922f)) {
                aVar.mo37186a(i, z, z2);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.homepage.story.container.StepDrawerContainer.AbstractC53037b
        /* renamed from: a */
        public final void mo89545a(View view, boolean z, boolean z2) {
            C53042b event;
            C89219l.m154721d(view, "");
            C53055h.m98052a("onDrawerOpened: isStep:" + z + " , hasStep:" + z2);
            if (z) {
                C53048f.this.getDrawerViewModel().f121918b.setValue(true);
                for (AbstractC53047e eVar : C89070n.m154590j(C53048f.this.getDrawerViewModel().f121921e)) {
                    eVar.mo37190d();
                }
            } else {
                C53048f.this.getDrawerViewModel().f121919c.setValue(true);
                for (AbstractC53046d dVar : C89070n.m154590j(C53048f.this.getDrawerViewModel().f121922f)) {
                    dVar.mo89457c();
                }
                if (z2 && C89219l.m154714a((Object) C53048f.this.getDrawerViewModel().f121918b.getValue(), (Object) true)) {
                    C53058j sidebarContainer = C53048f.this.getSidebarContainer();
                    if (!(sidebarContainer == null || (event = sidebarContainer.getEvent()) == null)) {
                        event.mo89559c("slide_left");
                    }
                    C53048f.this.getDrawerViewModel().f121918b.setValue(false);
                    for (AbstractC53047e eVar2 : C89070n.m154590j(C53048f.this.getDrawerViewModel().f121921e)) {
                        eVar2.mo37189c();
                    }
                }
            }
            C53048f.this.getDrawerViewModel().f121917a.setValue(true);
            DrawerViewModel drawerViewModel = C53048f.this.getDrawerViewModel();
            for (AbstractC53041a aVar : C89070n.m154574d((Iterable) drawerViewModel.f121921e, (Iterable) drawerViewModel.f121922f)) {
                aVar.mo37184a();
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.homepage.story.container.StepDrawerContainer.AbstractC53037b
        /* renamed from: a */
        public final void mo89543a(View view, float f, boolean z, float f2) {
            C89219l.m154721d(view, "");
            for (AbstractC53047e eVar : C89070n.m154590j(C53048f.this.getDrawerViewModel().f121921e)) {
                if (z) {
                    eVar.mo37188b(f2);
                }
                eVar.mo37185a(f);
            }
            for (AbstractC53046d dVar : C89070n.m154590j(C53048f.this.getDrawerViewModel().f121922f)) {
                dVar.mo37185a(f);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.container.f$c */
    public static final class C53051c implements AbstractC15497d {

        /* renamed from: a */
        final /* synthetic */ C53048f f121991a;

        static {
            Covode.recordClassIndex(62596);
        }

        C53051c(C53048f fVar) {
            this.f121991a = fVar;
        }

        @Override // com.bytedance.hox.p1106a.AbstractC15497d
        /* renamed from: a */
        public final void mo25223a(Bundle bundle) {
            C89219l.m154721d(bundle, "");
            this.f121991a.mo89561a(false, true, "onNodeShow");
        }

        @Override // com.bytedance.hox.p1106a.AbstractC15497d
        /* renamed from: b */
        public final void mo25224b(Bundle bundle) {
            C89219l.m154721d(bundle, "");
            if (!C89219l.m154714a((Object) this.f121991a.getDrawerViewModel().f121919c.getValue(), (Object) true)) {
                this.f121991a.mo89561a(true, true, "onNodeHide");
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C53048f(Context context) {
        super(context, null, 0);
        C89219l.m154721d(context, "");
        this.f121987k = C89250i.m154773a((AbstractC89171a) new C53050b(context));
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.homepage.story.container.StepDrawerContainer
    /* renamed from: b */
    public final boolean mo89486b(View view) {
        C89219l.m154721d(view, "");
        View view2 = this.f121988l;
        if (view2 == null || !C89219l.m154714a(view2, view)) {
            return super.mo89486b(view);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.homepage.story.container.StepDrawerContainer
    /* renamed from: c */
    public final boolean mo89488c(View view) {
        C89219l.m154721d(view, "");
        C53058j jVar = this.f121984h;
        if (jVar == null || !C89219l.m154714a(jVar, view)) {
            return super.mo89488c(view);
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.homepage.story.container.StepDrawerContainer
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C89219l.m154721d(motionEvent, "");
        if (C53055h.f121996b) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (!mo89487c()) {
            return false;
        }
        mo89484b();
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.homepage.story.container.StepDrawerContainer
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C89219l.m154721d(motionEvent, "");
        if (C53055h.f121996b) {
            return super.onTouchEvent(motionEvent);
        }
        if (!mo89487c()) {
            return false;
        }
        mo89484b();
        return false;
    }

    /* renamed from: c */
    public final void mo89562c(boolean z) {
        Context context = getContext();
        if (!(context instanceof ActivityC0945e)) {
            context = null;
        }
        ActivityC0945e eVar = (ActivityC0945e) context;
        if (eVar != null) {
            String a = C53055h.m98051a(eVar);
            if (a.length() != 0) {
                C53055h.m98052a("notifyHomeHidden>>> hide:" + z + ", bottomTab:" + "HOME" + ", topTab:" + a);
                Bundle bundle = new Bundle();
                bundle.putBoolean(C34792be.f82128g, true);
                if (z) {
                    Hox.C15490a.m28529a(eVar).mo25217d("page_feed", bundle);
                    Hox.C15490a.m28529a(eVar).mo25217d("HOME", bundle);
                    Hox.C15490a.m28529a(eVar).mo25217d(a, bundle);
                    return;
                }
                Hox.C15490a.m28529a(eVar).mo25215c("page_feed", bundle);
                Hox.C15490a.m28529a(eVar).mo25208a("HOME", bundle);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.container.f$d */
    static final class C53052d<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C53048f f121992a;

        static {
            Covode.recordClassIndex(62597);
        }

        C53052d(C53048f fVar) {
            this.f121992a = fVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            C53058j sidebarContainer;
            C53042b event;
            Integer num = (Integer) obj;
            boolean z = false;
            boolean z2 = true;
            if ((num.intValue() & 4) == 4) {
                if (!(this.f121992a.getDrawerViewModel().f121924h.length() <= 0 || (sidebarContainer = this.f121992a.getSidebarContainer()) == null || (event = sidebarContainer.getEvent()) == null)) {
                    event.mo89559c(this.f121992a.getDrawerViewModel().f121924h);
                }
                C53048f fVar = this.f121992a;
                if ((num.intValue() & 16) == 0) {
                    z = true;
                }
                fVar.mo89485b(z);
            } else if ((num.intValue() & 3) == 3) {
                if ((num.intValue() & 32) == 32) {
                    this.f121992a.mo89485b(false);
                }
                C53048f fVar2 = this.f121992a;
                if ((num.intValue() & 16) == 0) {
                    z = true;
                }
                fVar2.mo89476a(true, z);
            } else if ((num.intValue() & 1) == 1) {
                if ((num.intValue() & 32) == 32) {
                    this.f121992a.mo89485b(false);
                }
                C53048f fVar3 = this.f121992a;
                if ((num.intValue() & 16) != 0) {
                    z2 = false;
                }
                fVar3.mo89476a(false, z2);
            }
        }
    }

    public /* synthetic */ C53048f(Context context, byte b) {
        this(context);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.homepage.story.container.StepDrawerContainer
    /* renamed from: a */
    public final void mo89475a(boolean z, float f) {
        C53042b event;
        C53042b event2;
        String str;
        if (z) {
            C53058j jVar = this.f121984h;
            if (jVar != null && (event2 = jVar.getEvent()) != null) {
                if (f > 0.0f) {
                    str = "slide_down";
                } else {
                    str = "slide_up";
                }
                event2.mo89559c(str);
                return;
            }
            return;
        }
        C53058j jVar2 = this.f121984h;
        if (jVar2 != null && (event = jVar2.getEvent()) != null) {
            event.mo89559c("click");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0076, code lost:
        if (r5 == false) goto L_0x0078;
     */
    @Override // com.p2082ss.android.ugc.aweme.homepage.story.container.StepDrawerContainer
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo89476a(boolean r5, boolean r6) {
        /*
        // Method dump skipped, instructions count: 160
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.homepage.story.container.C53048f.mo89476a(boolean, boolean):void");
    }

    /* renamed from: a */
    public final void mo89561a(boolean z, boolean z2, String str) {
        C89219l.m154721d(str, "");
        if (z) {
            if (z2) {
                this.f121986j = true;
            }
            setDrawerLockMode(1);
        } else {
            if (z2) {
                this.f121986j = false;
            }
            if (!this.f121986j) {
                setDrawerLockMode(0);
            }
        }
        C53055h.m98052a("StoryContainer>>> " + str + ":setDrawerLock to lock=" + z + " , doubleLockState:" + this.f121986j);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.homepage.story.container.StepDrawerContainer
    /* renamed from: a */
    public final boolean mo89480a(View view, int i, int i2) {
        C89219l.m154721d(view, "");
        if (!mo89488c(view) || (!C89219l.m154714a((Object) getDrawerViewModel().f121918b.getValue(), (Object) true))) {
            return false;
        }
        C53058j jVar = this.f121984h;
        if (jVar != null) {
            int[] iArr = new int[2];
            jVar.f122006b.getLocationOnScreen(iArr);
            int i3 = iArr[0];
            int i4 = iArr[1];
            int measuredWidth = jVar.f122006b.getMeasuredWidth() + i3;
            int measuredHeight = jVar.f122006b.getMeasuredHeight() + i4;
            if (i4 <= i2 && measuredHeight >= i2 && i3 <= i && measuredWidth >= i) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.homepage.story.container.StepDrawerContainer
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (getChildCount() > 2) {
            if (!C53055h.m98053a()) {
                C53055h.m98052a("StepDrawerContainer is allowed to have only two views, content and Drawer!!!");
            } else {
                throw new IllegalStateException("StepDrawerContainer is allowed to have only two views, content and Drawer!!!");
            }
        }
        super.onLayout(z, i, i2, i3, i4);
    }
}
