package com.bytedance.ies.bullet.service.popup.p1182a;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.p037h.C0726a;
import androidx.core.p037h.C0792v;
import androidx.core.p037h.p038a.C0733d;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.bullet.service.popup.AbstractC16876a;
import com.bytedance.ies.bullet.service.popup.anim.BottomSheetBehavior;
import com.bytedance.ies.bullet.service.popup.round.RoundFrameLayout;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.bullet.service.popup.a.b */
public final class C16895b extends FrameLayout implements AbstractC16915g, AbstractC16917i {

    /* renamed from: d */
    public static final C16896a f40160d = new C16896a((byte) 0);

    /* renamed from: a */
    public BottomSheetBehavior<FrameLayout> f40161a;

    /* renamed from: b */
    public AbstractC89172b<? super Boolean, C89391z> f40162b;

    /* renamed from: c */
    public AbstractC89172b<? super String, C89391z> f40163c;

    /* renamed from: e */
    private BottomSheetBehavior.AbstractC16922a f40164e;

    /* renamed from: f */
    private C16893a f40165f;

    /* renamed from: g */
    private boolean f40166g;

    /* renamed from: h */
    private View f40167h;

    /* renamed from: i */
    private View f40168i;

    /* renamed from: j */
    private final BottomSheetBehavior.AbstractC16922a f40169j;

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.bullet.service.popup.a.b$e */
    public static final class View$OnTouchListenerC16900e implements View.OnTouchListener {

        /* renamed from: a */
        public static final View$OnTouchListenerC16900e f40173a = new View$OnTouchListenerC16900e();

        static {
            Covode.recordClassIndex(19340);
        }

        View$OnTouchListenerC16900e() {
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    static {
        Covode.recordClassIndex(19335);
    }

    /* renamed from: com.bytedance.ies.bullet.service.popup.a.b$a */
    public static final class C16896a {
        static {
            Covode.recordClassIndex(19336);
        }

        private C16896a() {
        }

        public /* synthetic */ C16896a(byte b) {
            this();
        }

        /* renamed from: a */
        public static C16895b m31133a(Context context, View view, C16893a aVar, AbstractC89171a<C89391z> aVar2, AbstractC89172b<? super String, C89391z> bVar, AbstractC89172b<? super Boolean, C89391z> bVar2) {
            C89219l.m154719c(context, "");
            C89219l.m154719c(view, "");
            C89219l.m154719c(aVar, "");
            C89219l.m154719c(aVar2, "");
            C89219l.m154719c(bVar, "");
            C89219l.m154719c(bVar2, "");
            C16895b bVar3 = new C16895b(context, (byte) 0);
            bVar3.mo26686a(aVar);
            bVar3.mo26685a(context, view, aVar2, bVar);
            bVar3.f40162b = bVar2;
            bVar3.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            return bVar3;
        }
    }

    public final BottomSheetBehavior.AbstractC16922a getOnBottomSheetCallback() {
        return this.f40164e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.bullet.service.popup.a.b$f */
    public static final class RunnableC16901f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C16895b f40174a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89171a f40175b;

        static {
            Covode.recordClassIndex(19341);
        }

        RunnableC16901f(C16895b bVar, AbstractC89171a aVar) {
            this.f40174a = bVar;
            this.f40175b = aVar;
        }

        public final void run() {
            this.f40175b.invoke();
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f40174a.f40161a;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.mo26731c(4);
            }
        }
    }

    /* renamed from: a */
    public final boolean mo26688a() {
        AbstractC16876a.AbstractC16878b bVar = this.f40165f.f40155h;
        if (bVar == null || !bVar.mo26672a()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final void mo26689b() {
        AbstractC89172b<? super Boolean, C89391z> bVar = this.f40162b;
        if (bVar != null) {
            bVar.invoke(Boolean.valueOf(this.f40166g));
        }
    }

    @Override // com.bytedance.ies.bullet.service.popup.p1182a.AbstractC16917i
    /* renamed from: c */
    public final void mo26690c() {
        this.f40166g = true;
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f40161a;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.mo26731c(4);
        }
    }

    @Override // com.bytedance.ies.bullet.service.popup.p1182a.AbstractC16917i
    /* renamed from: e */
    public final void mo26692e() {
        this.f40166g = false;
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f40161a;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.mo26731c(5);
        }
    }

    @Override // com.bytedance.ies.bullet.service.popup.p1182a.AbstractC16917i
    /* renamed from: d */
    public final void mo26691d() {
        this.f40166g = true;
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f40161a;
        if (bottomSheetBehavior == null || bottomSheetBehavior.f40218e != 5) {
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior2 = this.f40161a;
            if (bottomSheetBehavior2 != null) {
                bottomSheetBehavior2.mo26731c(5);
                return;
            }
            return;
        }
        AbstractC89172b<? super Boolean, C89391z> bVar = this.f40162b;
        if (bVar != null) {
            bVar.invoke(Boolean.valueOf(this.f40166g));
        }
    }

    public final void setOnBottomSheetCallback(BottomSheetBehavior.AbstractC16922a aVar) {
        this.f40164e = aVar;
    }

    /* renamed from: com.bytedance.ies.bullet.service.popup.a.b$b */
    public static final class C16897b extends BottomSheetBehavior.AbstractC16922a {

        /* renamed from: a */
        final /* synthetic */ C16895b f40170a;

        static {
            Covode.recordClassIndex(19337);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C16897b(C16895b bVar) {
            this.f40170a = bVar;
        }

        @Override // com.bytedance.ies.bullet.service.popup.anim.BottomSheetBehavior.AbstractC16922a
        public final void onEvent(String str) {
            AbstractC89172b<? super String, C89391z> bVar = this.f40170a.f40163c;
            if (bVar != null) {
                bVar.invoke(str);
            }
            BottomSheetBehavior.AbstractC16922a onBottomSheetCallback = this.f40170a.getOnBottomSheetCallback();
            if (onBottomSheetCallback != null) {
                onBottomSheetCallback.onEvent(str);
            }
        }

        @Override // com.bytedance.ies.bullet.service.popup.anim.BottomSheetBehavior.AbstractC16922a
        /* renamed from: a */
        public final void mo26695a(View view, float f) {
            C89219l.m154719c(view, "");
            BottomSheetBehavior.AbstractC16922a onBottomSheetCallback = this.f40170a.getOnBottomSheetCallback();
            if (onBottomSheetCallback != null) {
                onBottomSheetCallback.mo26695a(view, f);
            }
        }

        @Override // com.bytedance.ies.bullet.service.popup.anim.BottomSheetBehavior.AbstractC16922a
        /* renamed from: a */
        public final void mo26696a(View view, int i) {
            C89219l.m154719c(view, "");
            BottomSheetBehavior.AbstractC16922a onBottomSheetCallback = this.f40170a.getOnBottomSheetCallback();
            if (onBottomSheetCallback != null) {
                onBottomSheetCallback.mo26696a(view, i);
            }
            if (i == 5) {
                this.f40170a.mo26689b();
            }
        }
    }

    /* renamed from: com.bytedance.ies.bullet.service.popup.a.b$d */
    public static final class C16899d extends C0726a {

        /* renamed from: b */
        final /* synthetic */ C16895b f40172b;

        static {
            Covode.recordClassIndex(19339);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C16899d(C16895b bVar) {
            this.f40172b = bVar;
        }

        @Override // androidx.core.p037h.C0726a
        /* renamed from: a */
        public final void mo2808a(View view, C0733d dVar) {
            C89219l.m154719c(view, "");
            C89219l.m154719c(dVar, "");
            super.mo2808a(view, dVar);
            if (this.f40172b.mo26688a()) {
                dVar.mo2829a(1048576);
                dVar.mo2845e(true);
                return;
            }
            dVar.mo2845e(false);
        }

        @Override // androidx.core.p037h.C0726a
        /* renamed from: a */
        public final boolean mo2809a(View view, int i, Bundle bundle) {
            C89219l.m154719c(view, "");
            C89219l.m154719c(bundle, "");
            if (i != 1048576 || !this.f40172b.mo26688a()) {
                return super.mo2809a(view, i, bundle);
            }
            this.f40172b.mo26689b();
            return true;
        }
    }

    /* renamed from: a */
    public final void mo26686a(C16893a aVar) {
        C89219l.m154719c(aVar, "");
        this.f40165f = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.bullet.service.popup.a.b$c */
    public static final class View$OnClickListenerC16898c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C16895b f40171a;

        static {
            Covode.recordClassIndex(19338);
        }

        View$OnClickListenerC16898c(C16895b bVar) {
            this.f40171a = bVar;
        }

        public final void onClick(View view) {
            if (this.f40171a.mo26688a()) {
                this.f40171a.mo26689b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.bullet.service.popup.a.b$g */
    public static final class View$OnClickListenerC16902g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C16895b f40176a;

        static {
            Covode.recordClassIndex(19342);
        }

        View$OnClickListenerC16902g(C16895b bVar) {
            this.f40176a = bVar;
        }

        public final void onClick(View view) {
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior;
            if (this.f40176a.mo26688a() && (bottomSheetBehavior = this.f40176a.f40161a) != null) {
                bottomSheetBehavior.mo26731c(5);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C16895b(Context context) {
        super(context, null, 0);
        C89219l.m154719c(context, "");
        MethodCollector.m26663i(1729);
        this.f40165f = new C16893a(0, 0, 0, 0, 0, 0, null, 0, false, false, false, 4095);
        this.f40166g = true;
        this.f40169j = new C16897b(this);
        MethodCollector.m26664o(1729);
    }

    public /* synthetic */ C16895b(Context context, byte b) {
        this(context);
    }

    @Override // com.bytedance.ies.bullet.service.popup.p1182a.AbstractC16915g
    /* renamed from: a */
    public final void mo26687a(boolean z, int i, Integer num) {
        CoordinatorLayout coordinatorLayout;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        ViewGroup.LayoutParams layoutParams3;
        View view = this.f40167h;
        RoundFrameLayout roundFrameLayout = null;
        if (view != null) {
            coordinatorLayout = (CoordinatorLayout) view.findViewById(R.id.aeb);
            if (coordinatorLayout != null) {
                roundFrameLayout = (RoundFrameLayout) coordinatorLayout.findViewById(R.id.aa_);
            }
        } else {
            coordinatorLayout = null;
        }
        View view2 = this.f40168i;
        if (z) {
            if (num != null && this.f40165f.f40148a == 0 && !this.f40165f.f40157j) {
                int min = Math.min(this.f40165f.f40153f, num.intValue());
                BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f40161a;
                if (bottomSheetBehavior != null) {
                    bottomSheetBehavior.mo26730b(min);
                }
                if (!(coordinatorLayout == null || (layoutParams3 = coordinatorLayout.getLayoutParams()) == null)) {
                    layoutParams3.height = min;
                }
                if (!(roundFrameLayout == null || (layoutParams2 = roundFrameLayout.getLayoutParams()) == null)) {
                    layoutParams2.height = min;
                }
                if (!(view2 == null || (layoutParams = view2.getLayoutParams()) == null)) {
                    layoutParams.height = min;
                }
            }
            View view3 = this.f40167h;
            if (view3 != null) {
                view3.setPadding(0, 0, 0, i);
                return;
            }
            return;
        }
        if (!(coordinatorLayout == null || roundFrameLayout == null || view2 == null)) {
            m31124a(coordinatorLayout, roundFrameLayout, view2);
        }
        View view4 = this.f40167h;
        if (view4 != null) {
            view4.setPadding(0, 0, 0, 0);
        }
    }

    /* renamed from: a */
    private final void m31124a(CoordinatorLayout coordinatorLayout, View view, View view2) {
        int i = this.f40165f.f40148a;
        if (i == 0) {
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f40161a;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.mo26730b(this.f40165f.f40153f);
            }
            ViewGroup.LayoutParams layoutParams = coordinatorLayout.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = this.f40165f.f40153f;
            }
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.height = this.f40165f.f40153f;
            }
            if (this.f40165f.f40157j) {
                ViewGroup.LayoutParams layoutParams3 = view2.getLayoutParams();
                if (layoutParams3 != null) {
                    layoutParams3.height = -1;
                }
                ViewGroup.LayoutParams layoutParams4 = view.getLayoutParams();
                if (layoutParams4 != null) {
                    layoutParams4.height = -1;
                }
            } else {
                ViewGroup.LayoutParams layoutParams5 = view2.getLayoutParams();
                if (layoutParams5 != null) {
                    layoutParams5.height = this.f40165f.f40153f;
                }
                ViewGroup.LayoutParams layoutParams6 = view.getLayoutParams();
                if (layoutParams6 != null) {
                    layoutParams6.height = this.f40165f.f40153f;
                }
            }
            if (this.f40165f.f40152e > 0) {
                ViewGroup.LayoutParams layoutParams7 = coordinatorLayout.getLayoutParams();
                if (layoutParams7 != null) {
                    layoutParams7.width = this.f40165f.f40152e;
                }
                ViewGroup.LayoutParams layoutParams8 = view.getLayoutParams();
                if (layoutParams8 != null) {
                    layoutParams8.width = this.f40165f.f40152e;
                }
                ViewGroup.LayoutParams layoutParams9 = view2.getLayoutParams();
                if (layoutParams9 != null) {
                    layoutParams9.width = this.f40165f.f40152e;
                }
            }
        } else if (i == 1) {
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior2 = this.f40161a;
            if (bottomSheetBehavior2 != null) {
                bottomSheetBehavior2.mo26730b(this.f40165f.f40153f);
            }
            ViewGroup.LayoutParams layoutParams10 = coordinatorLayout.getLayoutParams();
            if (layoutParams10 != null) {
                layoutParams10.height = -1;
            }
            ViewGroup.LayoutParams layoutParams11 = view.getLayoutParams();
            if (layoutParams11 != null) {
                layoutParams11.height = -1;
            }
            ViewGroup.LayoutParams layoutParams12 = view2.getLayoutParams();
            if (layoutParams12 != null) {
                layoutParams12.height = -2;
            }
        } else if (i == 2) {
            throw new Exception("auto height is an incubating feature");
        } else if (i == 3) {
            throw new Exception("auto height is an incubating feature");
        }
    }

    /* renamed from: a */
    public final void mo26685a(Context context, View view, AbstractC89171a<C89391z> aVar, AbstractC89172b<? super String, C89391z> bVar) {
        MethodCollector.m26663i(1698);
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            applicationContext = C58003a.f132199a;
        }
        View inflate = LayoutInflater.from(applicationContext).inflate(R.layout.m7, this);
        this.f40167h = inflate;
        this.f40168i = view;
        this.f40163c = bVar;
        View findViewById = inflate.findViewById(R.id.aeb);
        C89219l.m154709a((Object) findViewById, "");
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) findViewById;
        RoundFrameLayout roundFrameLayout = (RoundFrameLayout) coordinatorLayout.findViewById(R.id.aa_);
        roundFrameLayout.setRadius(this.f40165f.f40154g);
        BottomSheetBehavior<FrameLayout> a = BottomSheetBehavior.m31159a(roundFrameLayout);
        this.f40161a = a;
        if (a != null) {
            a.f40223j = this.f40169j;
        }
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f40161a;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.f40217d = true;
        }
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior2 = this.f40161a;
        if (bottomSheetBehavior2 != null) {
            bottomSheetBehavior2.f40226m = this.f40165f.f40151d;
        }
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior3 = this.f40161a;
        if (bottomSheetBehavior3 != null) {
            bottomSheetBehavior3.mo26731c(5);
        }
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior4 = this.f40161a;
        if (bottomSheetBehavior4 != null) {
            bottomSheetBehavior4.f40228o = this.f40165f.f40157j;
        }
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior5 = this.f40161a;
        if (bottomSheetBehavior5 != null) {
            bottomSheetBehavior5.f40229p = this.f40165f.f40158k;
        }
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior6 = this.f40161a;
        if (bottomSheetBehavior6 != null) {
            bottomSheetBehavior6.f40230q = this.f40165f.f40159l;
        }
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior7 = this.f40161a;
        if (bottomSheetBehavior7 != null) {
            bottomSheetBehavior7.f40227n = this.f40165f.f40156i;
        }
        roundFrameLayout.addView(view);
        coordinatorLayout.findViewById(R.id.emn).setOnClickListener(new View$OnClickListenerC16898c(this));
        C89219l.m154709a((Object) roundFrameLayout, "");
        m31124a(coordinatorLayout, roundFrameLayout, view);
        C0792v.m2747a(roundFrameLayout, new C16899d(this));
        roundFrameLayout.setOnTouchListener(View$OnTouchListenerC16900e.f40173a);
        post(new RunnableC16901f(this, aVar));
        setOnClickListener(new View$OnClickListenerC16902g(this));
        MethodCollector.m26664o(1698);
    }
}
