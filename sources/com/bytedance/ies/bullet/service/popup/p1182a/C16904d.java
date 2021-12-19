package com.bytedance.ies.bullet.service.popup.p1182a;

import android.animation.Animator;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.bullet.service.popup.AbstractC16876a;
import com.bytedance.ies.bullet.service.popup.round.RoundLinearLayout;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.bullet.service.popup.a.d */
public final class C16904d extends FrameLayout implements AbstractC16915g, AbstractC16917i {

    /* renamed from: d */
    public static final C16905a f40184d = new C16905a((byte) 0);

    /* renamed from: a */
    public AbstractC89172b<? super Boolean, C89391z> f40185a;

    /* renamed from: b */
    public C16903c f40186b;

    /* renamed from: c */
    public boolean f40187c;

    /* renamed from: e */
    private View f40188e;

    /* renamed from: f */
    private HashMap f40189f;

    static {
        Covode.recordClassIndex(19344);
    }

    /* renamed from: a */
    private View m31138a(int i) {
        if (this.f40189f == null) {
            this.f40189f = new HashMap();
        }
        View view = (View) this.f40189f.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f40189f.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: com.bytedance.ies.bullet.service.popup.a.d$a */
    public static final class C16905a {
        static {
            Covode.recordClassIndex(19345);
        }

        private C16905a() {
        }

        public /* synthetic */ C16905a(byte b) {
            this();
        }

        /* renamed from: a */
        public static C16904d m31146a(Context context, View view, C16903c cVar, AbstractC89172b<? super Boolean, C89391z> bVar) {
            C89219l.m154719c(context, "");
            C89219l.m154719c(view, "");
            C89219l.m154719c(cVar, "");
            C16904d dVar = new C16904d(context, (byte) 0);
            dVar.mo26706a(cVar);
            dVar.mo26705a(context, view);
            dVar.f40185a = bVar;
            dVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            return dVar;
        }
    }

    @Override // com.bytedance.ies.bullet.service.popup.p1182a.AbstractC16917i
    /* renamed from: c */
    public final void mo26690c() {
        setVisibility(0);
        ViewPropertyAnimator animate = animate();
        C89219l.m154709a((Object) animate, "");
        ViewPropertyAnimator a = m31139a(animate, this.f40186b.f40177a, 0.0f, 0.0f);
        a.setDuration(200);
        a.start();
        this.f40187c = true;
    }

    @Override // com.bytedance.ies.bullet.service.popup.p1182a.AbstractC16917i
    /* renamed from: d */
    public final void mo26691d() {
        this.f40187c = true;
        ViewPropertyAnimator animate = animate();
        C89219l.m154709a((Object) animate, "");
        ViewPropertyAnimator a = m31139a(animate, this.f40186b.f40177a, (float) this.f40186b.f40178b, (float) this.f40186b.f40179c);
        a.setDuration(200);
        a.setListener(new C16906b(a, this));
        a.start();
    }

    @Override // com.bytedance.ies.bullet.service.popup.p1182a.AbstractC16917i
    /* renamed from: e */
    public final void mo26692e() {
        this.f40187c = false;
        ViewPropertyAnimator animate = animate();
        C89219l.m154709a((Object) animate, "");
        ViewPropertyAnimator a = m31139a(animate, this.f40186b.f40177a, (float) this.f40186b.f40178b, (float) this.f40186b.f40179c);
        a.setDuration(200);
        a.setListener(new C16907c(a, this));
        a.start();
    }

    /* renamed from: a */
    public final void mo26706a(C16903c cVar) {
        C89219l.m154719c(cVar, "");
        this.f40186b = cVar;
    }

    /* renamed from: com.bytedance.ies.bullet.service.popup.a.d$b */
    public static final class C16906b implements Animator.AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ ViewPropertyAnimator f40190a;

        /* renamed from: b */
        final /* synthetic */ C16904d f40191b;

        static {
            Covode.recordClassIndex(19346);
        }

        public final void onAnimationCancel(Animator animator) {
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        public final void onAnimationStart(Animator animator) {
        }

        public final void onAnimationEnd(Animator animator) {
            this.f40190a.setListener(null);
            AbstractC89172b<? super Boolean, C89391z> bVar = this.f40191b.f40185a;
            if (bVar != null) {
                bVar.invoke(Boolean.valueOf(this.f40191b.f40187c));
            }
        }

        C16906b(ViewPropertyAnimator viewPropertyAnimator, C16904d dVar) {
            this.f40190a = viewPropertyAnimator;
            this.f40191b = dVar;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.service.popup.a.d$c */
    public static final class C16907c implements Animator.AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ ViewPropertyAnimator f40192a;

        /* renamed from: b */
        final /* synthetic */ C16904d f40193b;

        static {
            Covode.recordClassIndex(19347);
        }

        public final void onAnimationCancel(Animator animator) {
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        public final void onAnimationStart(Animator animator) {
        }

        public final void onAnimationEnd(Animator animator) {
            this.f40192a.setListener(null);
            AbstractC89172b<? super Boolean, C89391z> bVar = this.f40193b.f40185a;
            if (bVar != null) {
                bVar.invoke(Boolean.valueOf(this.f40193b.f40187c));
            }
            this.f40193b.setVisibility(4);
        }

        C16907c(ViewPropertyAnimator viewPropertyAnimator, C16904d dVar) {
            this.f40192a = viewPropertyAnimator;
            this.f40193b = dVar;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.service.popup.a.d$d */
    public static final class C16908d implements Animator.AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ ViewPropertyAnimator f40194a;

        /* renamed from: b */
        final /* synthetic */ C16904d f40195b;

        static {
            Covode.recordClassIndex(19348);
        }

        public final void onAnimationCancel(Animator animator) {
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        public final void onAnimationStart(Animator animator) {
        }

        public final void onAnimationEnd(Animator animator) {
            this.f40194a.setListener(null);
            AbstractC89172b<? super Boolean, C89391z> bVar = this.f40195b.f40185a;
            if (bVar != null) {
                bVar.invoke(Boolean.valueOf(this.f40195b.f40187c));
            }
        }

        C16908d(ViewPropertyAnimator viewPropertyAnimator, C16904d dVar) {
            this.f40194a = viewPropertyAnimator;
            this.f40195b = dVar;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C16904d(Context context) {
        super(context, null, 0);
        C89219l.m154719c(context, "");
        MethodCollector.m26663i(177);
        this.f40186b = new C16903c();
        this.f40187c = true;
        MethodCollector.m26664o(177);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.bullet.service.popup.a.d$e */
    public static final class View$OnClickListenerC16909e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C16904d f40196a;

        static {
            Covode.recordClassIndex(19349);
        }

        View$OnClickListenerC16909e(C16904d dVar) {
            this.f40196a = dVar;
        }

        public final void onClick(View view) {
            AbstractC16876a.AbstractC16878b bVar = this.f40196a.f40186b.f40183g;
            if (bVar != null && bVar.mo26672a()) {
                C16904d dVar = this.f40196a;
                ViewPropertyAnimator animate = dVar.animate();
                C89219l.m154709a((Object) animate, "");
                ViewPropertyAnimator a = C16904d.m31139a(animate, dVar.f40186b.f40177a, (float) dVar.f40186b.f40178b, (float) dVar.f40186b.f40179c);
                a.setDuration(200);
                a.setListener(new C16908d(a, dVar));
                a.start();
            }
        }
    }

    public /* synthetic */ C16904d(Context context, byte b) {
        this(context);
    }

    /* renamed from: a */
    public final void mo26705a(Context context, View view) {
        int i;
        MethodCollector.m26663i(120);
        C89219l.m154719c(context, "");
        C89219l.m154719c(view, "");
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            applicationContext = C58003a.f132199a;
        }
        LayoutInflater.from(applicationContext).inflate(R.layout.m8, this);
        this.f40188e = view;
        ((RoundLinearLayout) m31138a(R.id.ad4)).setRadius(this.f40186b.f40182f);
        ((RoundLinearLayout) m31138a(R.id.ad4)).addView(view);
        ((RelativeLayout) m31138a(R.id.aci)).setOnClickListener(new View$OnClickListenerC16909e(this));
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int i2 = -1;
        if (layoutParams != null) {
            layoutParams.height = this.f40186b.f40181e;
            if (this.f40186b.f40180d > 0) {
                i = this.f40186b.f40180d;
            } else {
                i = -1;
            }
            layoutParams.width = i;
        }
        RoundLinearLayout roundLinearLayout = (RoundLinearLayout) m31138a(R.id.ad4);
        C89219l.m154709a((Object) roundLinearLayout, "");
        ViewGroup.LayoutParams layoutParams2 = roundLinearLayout.getLayoutParams();
        if (layoutParams2 != null) {
            layoutParams2.height = this.f40186b.f40181e;
            if (this.f40186b.f40180d > 0) {
                i2 = this.f40186b.f40180d;
            }
            layoutParams2.width = i2;
        }
        if (this.f40186b.f40177a) {
            setTranslationX((float) this.f40186b.f40179c);
        } else {
            setTranslationY((float) this.f40186b.f40178b);
        }
        ViewPropertyAnimator animate = animate();
        C89219l.m154709a((Object) animate, "");
        ViewPropertyAnimator a = m31139a(animate, this.f40186b.f40177a, 0.0f, 0.0f);
        a.setDuration(200);
        a.start();
        MethodCollector.m26664o(120);
    }

    @Override // com.bytedance.ies.bullet.service.popup.p1182a.AbstractC16915g
    /* renamed from: a */
    public final void mo26687a(boolean z, int i, Integer num) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        ViewGroup.LayoutParams layoutParams3;
        ViewGroup.LayoutParams layoutParams4;
        if (z) {
            if (num != null) {
                int min = Math.min(num.intValue(), this.f40186b.f40181e);
                View view = this.f40188e;
                if (!(view == null || (layoutParams4 = view.getLayoutParams()) == null)) {
                    layoutParams4.height = min;
                }
                RoundLinearLayout roundLinearLayout = (RoundLinearLayout) m31138a(R.id.ad4);
                if (!(roundLinearLayout == null || (layoutParams3 = roundLinearLayout.getLayoutParams()) == null)) {
                    layoutParams3.height = min;
                }
            }
            setPadding(0, 0, 0, i);
            return;
        }
        View view2 = this.f40188e;
        if (!(view2 == null || (layoutParams2 = view2.getLayoutParams()) == null)) {
            layoutParams2.height = this.f40186b.f40181e;
        }
        RoundLinearLayout roundLinearLayout2 = (RoundLinearLayout) m31138a(R.id.ad4);
        if (!(roundLinearLayout2 == null || (layoutParams = roundLinearLayout2.getLayoutParams()) == null)) {
            layoutParams.height = this.f40186b.f40181e;
        }
        setPadding(0, 0, 0, 0);
    }

    /* renamed from: a */
    static ViewPropertyAnimator m31139a(ViewPropertyAnimator viewPropertyAnimator, boolean z, float f, float f2) {
        ViewPropertyAnimator translationY;
        if (z) {
            translationY = viewPropertyAnimator.translationX(f2);
        } else {
            translationY = viewPropertyAnimator.translationY(f);
        }
        C89219l.m154709a((Object) translationY, "");
        return translationY;
    }
}
