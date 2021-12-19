package com.p2082ss.android.ugc.aweme.editSticker.p2877a;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.graphics.RectF;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.editSticker.C45890g;
import com.p2082ss.android.ugc.aweme.editSticker.interact.C45902g;
import com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81432d;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.editSticker.a.m */
public class C45842m extends AbstractC45824b {

    /* renamed from: l */
    public LinearLayout f106794l;

    /* renamed from: m */
    public boolean f106795m;

    /* renamed from: n */
    public boolean f106796n;

    /* renamed from: com.ss.android.ugc.aweme.editSticker.a.m$a */
    static final class C45843a implements TimeInterpolator {

        /* renamed from: a */
        public static final C45843a f106797a = new C45843a();

        static {
            Covode.recordClassIndex(54366);
        }

        C45843a() {
        }

        public final float getInterpolation(float f) {
            float f2;
            if (f >= 0.0f && f <= 0.18f) {
                return f * 1.11f;
            }
            if (f >= 0.18f && f <= 0.36f) {
                return f * 1.11f;
            }
            if (f >= 0.36f && f <= 0.56f) {
                f2 = 0.04f;
            } else if (f < 0.56f || f > 0.8f) {
                return f;
            } else {
                f *= 0.833f;
                f2 = 0.1336f;
            }
            return f + f2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.editSticker.a.m$b */
    static final class C45844b implements TimeInterpolator {

        /* renamed from: a */
        public static final C45844b f106798a = new C45844b();

        static {
            Covode.recordClassIndex(54367);
        }

        C45844b() {
        }

        public final float getInterpolation(float f) {
            float f2;
            if (f >= 0.0f && f <= 0.18f) {
                return f * 1.11f;
            }
            if (f >= 0.18f && f <= 0.36f) {
                return f * 1.11f;
            }
            if (f >= 0.36f && f <= 0.56f) {
                f2 = 0.04f;
            } else if (f < 0.56f || f > 0.8f) {
                return f;
            } else {
                f *= 0.833f;
                f2 = 0.1336f;
            }
            return f + f2;
        }
    }

    static {
        Covode.recordClassIndex(54365);
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.p2877a.AbstractC45824b
    /* renamed from: c */
    public View mo77177c() {
        LinearLayout a;
        LinearLayout a2;
        MethodCollector.m26663i(12512);
        LinearLayout d = mo77178d();
        if (C45890g.m88534a().f106862b.f106871b && this.f106778a && !this.f106796n) {
            if (C45890g.m88534a().f106862b.f106872c) {
                if (this.f106795m) {
                    a2 = mo77171a(2131232697, R.string.gbn);
                } else {
                    a2 = mo77171a(2131232698, R.string.axy);
                }
                this.f106794l = a2;
                if (a2 != null) {
                    View childAt = a2.getChildAt(0);
                    C89219l.m154716b(childAt, "");
                    C45902g gVar = new C45902g();
                    if (!gVar.f106891a.getBoolean("read_text_guide_shown_v2", false)) {
                        gVar.f106891a.storeBoolean("read_text_guide_shown_v2", true);
                        AnimatorSet animatorSet = new AnimatorSet();
                        ObjectAnimator duration = ObjectAnimator.ofFloat(childAt, View.ROTATION, 0.0f, 57.6f, -57.6f, 36.0f, -21.6f, 0.0f).setDuration(1000L);
                        C89219l.m154716b(duration, "");
                        duration.setInterpolator(C45844b.f106798a);
                        animatorSet.play(duration).after(duration.clone()).after(1500);
                        animatorSet.start();
                    }
                }
                LinearLayout linearLayout = this.f106794l;
                if (linearLayout != null) {
                    linearLayout.setOnClickListener(new C45845c(this));
                }
                d.addView(this.f106794l);
                d.addView(mo77179e());
            } else {
                if (this.f106795m) {
                    a = mo77171a(2131230936, R.string.axz);
                } else {
                    a = mo77171a(2131230936, R.string.axy);
                }
                this.f106794l = a;
                if (a != null) {
                    View childAt2 = a.getChildAt(0);
                    C89219l.m154716b(childAt2, "");
                    C45902g gVar2 = new C45902g();
                    if (!gVar2.f106891a.getBoolean("read_text_guide_shown", false)) {
                        gVar2.f106891a.storeBoolean("read_text_guide_shown", true);
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        ObjectAnimator duration2 = ObjectAnimator.ofFloat(childAt2, View.ROTATION, 0.0f, 57.6f, -57.6f, 36.0f, -21.6f, 0.0f).setDuration(1000L);
                        C89219l.m154716b(duration2, "");
                        duration2.setInterpolator(C45843a.f106797a);
                        animatorSet2.play(duration2).after(duration2.clone()).after(1500);
                        animatorSet2.start();
                    }
                }
                LinearLayout linearLayout2 = this.f106794l;
                if (linearLayout2 != null) {
                    linearLayout2.setOnClickListener(new C45846d(this));
                }
                d.addView(this.f106794l);
                d.addView(mo77179e());
            }
        }
        LinearLayout a3 = mo77171a(2131230937, R.string.axa);
        LinearLayout a4 = mo77171a(2131230934, R.string.axv);
        a3.setOnClickListener(new View$OnClickListenerC45847e(this));
        a4.setOnClickListener(new View$OnClickListenerC45848f(this));
        if (this.f106778a) {
            d.addView(a3);
            d.addView(mo77179e());
            mo77173a(3);
        } else {
            mo77173a(2);
        }
        d.addView(a4);
        MethodCollector.m26664o(12512);
        return d;
    }

    /* renamed from: com.ss.android.ugc.aweme.editSticker.a.m$c */
    public static final class C45845c extends AbstractView$OnClickListenerC81432d {

        /* renamed from: a */
        final /* synthetic */ C45842m f106799a;

        static {
            Covode.recordClassIndex(54368);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C45845c(C45842m mVar) {
            this.f106799a = mVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81432d
        /* renamed from: a */
        public final void mo77200a(View view) {
            this.f106799a.mo77172a();
            AbstractC45840k kVar = this.f106799a.f106786i;
            if (kVar != null) {
                kVar.mo77194d();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.editSticker.a.m$d */
    public static final class C45846d extends AbstractView$OnClickListenerC81432d {

        /* renamed from: a */
        final /* synthetic */ C45842m f106800a;

        static {
            Covode.recordClassIndex(54369);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C45846d(C45842m mVar) {
            this.f106800a = mVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81432d
        /* renamed from: a */
        public final void mo77200a(View view) {
            this.f106800a.mo77172a();
            AbstractC45840k kVar = this.f106800a.f106786i;
            if (kVar != null) {
                kVar.mo77194d();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.editSticker.a.m$e */
    static final class View$OnClickListenerC45847e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C45842m f106801a;

        static {
            Covode.recordClassIndex(54370);
        }

        View$OnClickListenerC45847e(C45842m mVar) {
            this.f106801a = mVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f106801a.mo77172a();
            AbstractC45840k kVar = this.f106801a.f106786i;
            if (kVar != null) {
                kVar.mo77191a();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.editSticker.a.m$f */
    static final class View$OnClickListenerC45848f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C45842m f106802a;

        static {
            Covode.recordClassIndex(54371);
        }

        View$OnClickListenerC45848f(C45842m mVar) {
            this.f106802a = mVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f106802a.mo77172a();
            AbstractC45840k kVar = this.f106802a.f106786i;
            if (kVar != null) {
                kVar.mo77192b();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C45842m(View view, AbstractC45840k kVar) {
        super(view, kVar);
        C89219l.m154721d(view, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.p2877a.AbstractC45824b
    /* renamed from: a */
    public final void mo77174a(RectF rectF, int i, int i2, float f, boolean z) {
        C89219l.m154721d(rectF, "");
        this.f106795m = z;
        super.mo77174a(rectF, i, i2, f, z);
    }
}
