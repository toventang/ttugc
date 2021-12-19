package com.p2082ss.android.ugc.tools.view.style;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.graphics.Point;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.tools.utils.C84912r;
import com.p2082ss.android.ugc.tools.view.p4364c.C84951b;
import com.p2082ss.android.ugc.tools.view.p4364c.C84952c;
import com.p2082ss.android.ugc.trill.R;
import java.util.function.Supplier;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tools.view.style.e */
public final class C84971e extends PopupWindow {

    /* renamed from: A */
    private float f189936A = 13.0f;

    /* renamed from: B */
    private int f189937B;

    /* renamed from: C */
    private Typeface f189938C;

    /* renamed from: D */
    private boolean f189939D = true;

    /* renamed from: E */
    private float f189940E = 12.0f;

    /* renamed from: F */
    private int f189941F;

    /* renamed from: G */
    private int f189942G;

    /* renamed from: H */
    private boolean f189943H = true;

    /* renamed from: I */
    private boolean f189944I = true;

    /* renamed from: J */
    private boolean f189945J;

    /* renamed from: K */
    private TextView f189946K;

    /* renamed from: L */
    private boolean f189947L;

    /* renamed from: M */
    private int f189948M;

    /* renamed from: N */
    private Activity f189949N;

    /* renamed from: O */
    private View f189950O;

    /* renamed from: P */
    private Supplier<Point> f189951P;

    /* renamed from: Q */
    private final Runnable f189952Q;

    /* renamed from: a */
    public int f189953a;

    /* renamed from: b */
    public boolean f189954b;

    /* renamed from: c */
    public long f189955c = 200;

    /* renamed from: d */
    public int f189956d;

    /* renamed from: e */
    public C84969d f189957e;

    /* renamed from: f */
    public AnimatorSet f189958f;

    /* renamed from: g */
    public AbstractC84973b f189959g;

    /* renamed from: h */
    public AbstractC84975d f189960h;

    /* renamed from: i */
    public AbstractC84974c f189961i;

    /* renamed from: j */
    private float f189962j;

    /* renamed from: k */
    private float f189963k;

    /* renamed from: l */
    private int f189964l;

    /* renamed from: m */
    private int f189965m;

    /* renamed from: n */
    private boolean f189966n = true;

    /* renamed from: o */
    private boolean f189967o;

    /* renamed from: p */
    private boolean f189968p;

    /* renamed from: q */
    private int f189969q;

    /* renamed from: r */
    private boolean f189970r;

    /* renamed from: s */
    private int f189971s;

    /* renamed from: t */
    private int f189972t;

    /* renamed from: u */
    private long f189973u = 5000;

    /* renamed from: v */
    private boolean f189974v = true;

    /* renamed from: w */
    private int f189975w;

    /* renamed from: x */
    private int f189976x;

    /* renamed from: y */
    private String f189977y = "";

    /* renamed from: z */
    private int f189978z;

    /* renamed from: com.ss.android.ugc.tools.view.style.e$b */
    public interface AbstractC84973b {
        static {
            Covode.recordClassIndex(98978);
        }
    }

    /* renamed from: com.ss.android.ugc.tools.view.style.e$c */
    public interface AbstractC84974c {
        static {
            Covode.recordClassIndex(98979);
        }
    }

    /* renamed from: com.ss.android.ugc.tools.view.style.e$d */
    public interface AbstractC84975d {
        static {
            Covode.recordClassIndex(98980);
        }
    }

    static {
        Covode.recordClassIndex(98976);
    }

    /* renamed from: a */
    private static int m146042a(int i) {
        if (i == 3) {
            return 2;
        }
        if (i != 5) {
            if (i != 48) {
                return i != 80 ? 1 : 0;
            }
            return 3;
        }
    }

    /* renamed from: com.ss.android.ugc.tools.view.style.e$f */
    static final class RunnableC84978f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C84971e f190014a;

        static {
            Covode.recordClassIndex(98983);
        }

        RunnableC84978f(C84971e eVar) {
            this.f190014a = eVar;
        }

        public final void run() {
            this.f190014a.mo129804a(false);
        }
    }

    /* renamed from: c */
    private int m146047c() {
        mo129802a();
        View contentView = getContentView();
        C89219l.m154716b(contentView, "");
        return contentView.getMeasuredHeight();
    }

    public final void dismiss() {
        if (!this.f189947L) {
            mo129804a(false);
            getContentView().removeCallbacks(this.f189952Q);
            this.f189971s = 0;
            this.f189972t = 0;
        }
    }

    /* renamed from: a */
    public final void mo129802a() {
        int i = this.f189975w;
        if (i == 0 || this.f189976x == 0) {
            getContentView().measure(Integer.MIN_VALUE, Integer.MIN_VALUE);
            return;
        }
        getContentView().measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f189976x, 1073741824));
    }

    /* renamed from: b */
    public final void mo129805b() {
        AnimatorSet animatorSet = this.f189958f;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
        }
        AnimatorSet animatorSet2 = this.f189958f;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        this.f189958f = null;
        if (!this.f189949N.isFinishing() && isShowing()) {
            super.dismiss();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.tools.view.style.e$e */
    public static final class RunnableC84976e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C84971e f190010a;

        /* renamed from: b */
        final /* synthetic */ C84969d f190011b;

        /* renamed from: c */
        final /* synthetic */ boolean f190012c;

        static {
            Covode.recordClassIndex(98981);
        }

        RunnableC84976e(C84971e eVar, C84969d dVar, boolean z) {
            this.f190010a = eVar;
            this.f190011b = dVar;
            this.f190012c = z;
        }

        public final void run() {
            int i;
            float f;
            int i2;
            float f2;
            float f3;
            float f4;
            float f5;
            float f6;
            float f7;
            long j;
            long j2;
            long j3;
            long j4;
            long j5;
            long j6;
            long j7;
            long j8;
            AnimatorSet.Builder play;
            AnimatorSet.Builder with;
            AnimatorSet.Builder with2;
            AnimatorSet.Builder play2;
            AnimatorSet.Builder with3;
            AnimatorSet.Builder with4;
            AnimatorSet.Builder play3;
            AnimatorSet.Builder with5;
            AnimatorSet.Builder with6;
            AnimatorSet.Builder play4;
            AnimatorSet.Builder with7;
            AnimatorSet.Builder with8;
            AnimatorSet animatorSet;
            AnimatorSet.Builder play5;
            AnimatorSet.Builder with9;
            AnimatorSet.Builder with10;
            AnimatorSet.Builder play6;
            AnimatorSet.Builder with11;
            AnimatorSet.Builder with12;
            AnimatorSet.Builder play7;
            AnimatorSet.Builder with13;
            AnimatorSet.Builder with14;
            AnimatorSet.Builder play8;
            AnimatorSet.Builder with15;
            AnimatorSet.Builder with16;
            if (this.f190010a.f189958f != null) {
                int i3 = this.f190010a.f189953a;
                if (i3 != 3) {
                    if (i3 == 5) {
                        i = (int) this.f190011b.getX();
                        f2 = this.f190011b.getY();
                        f3 = C84971e.m146043a(this.f190010a).getBubbleOffset();
                    } else if (i3 == 48) {
                        i = (int) (this.f190011b.getX() + C84971e.m146043a(this.f190010a).getBubbleOffset());
                        f2 = this.f190011b.getY();
                        f3 = (float) this.f190011b.getMeasuredHeight();
                    } else if (i3 != 80) {
                        i = 0;
                        i2 = 0;
                    } else {
                        i = (int) (this.f190011b.getX() + C84971e.m146043a(this.f190010a).getBubbleOffset());
                        f = this.f190011b.getY();
                        i2 = (int) f;
                    }
                    f = f2 + f3;
                    i2 = (int) f;
                } else {
                    i = (int) (this.f190011b.getX() + ((float) this.f190011b.getMeasuredWidth()));
                    f2 = this.f190011b.getY();
                    f3 = C84971e.m146043a(this.f190010a).getBubbleOffset();
                    f = f2 + f3;
                    i2 = (int) f;
                }
                this.f190011b.setPivotY((float) i2);
                this.f190011b.setPivotX((float) i);
                C84969d dVar = this.f190011b;
                float[] fArr = new float[2];
                boolean z = this.f190012c;
                if (z) {
                    f4 = 0.0f;
                } else {
                    f4 = 1.0f;
                }
                fArr[0] = f4;
                if (z) {
                    f5 = 1.0f;
                } else {
                    f5 = 0.0f;
                }
                fArr[1] = f5;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(dVar, "scaleX", fArr);
                C89219l.m154716b(ofFloat, "");
                ofFloat.setDuration(200L);
                C84969d dVar2 = this.f190011b;
                float[] fArr2 = new float[2];
                boolean z2 = this.f190012c;
                if (z2) {
                    f6 = 0.0f;
                } else {
                    f6 = 1.0f;
                }
                fArr2[0] = f6;
                if (z2) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                fArr2[1] = f7;
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(dVar2, "scaleY", fArr2);
                C89219l.m154716b(ofFloat2, "");
                ofFloat2.setDuration(200L);
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f190011b, "translationY", 0.0f);
                C89219l.m154716b(ofFloat3, "");
                if (this.f190012c) {
                    j = 500;
                } else {
                    j = 200;
                }
                ofFloat3.setDuration(j);
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.f190011b, "translationY", 0.0f);
                C89219l.m154716b(ofFloat4, "");
                if (this.f190012c) {
                    j2 = 500;
                } else {
                    j2 = 200;
                }
                ofFloat4.setDuration(j2);
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.f190011b, "translationX", 0.0f);
                C89219l.m154716b(ofFloat5, "");
                if (this.f190012c) {
                    j3 = 500;
                } else {
                    j3 = 200;
                }
                ofFloat5.setDuration(j3);
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this.f190011b, "translationX", 0.0f);
                C89219l.m154716b(ofFloat6, "");
                if (this.f190012c) {
                    j4 = 500;
                } else {
                    j4 = 200;
                }
                ofFloat6.setDuration(j4);
                ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(this.f190011b, "translationY", 0.0f, 10.0f);
                C89219l.m154716b(ofFloat7, "");
                if (this.f190012c) {
                    j5 = 200;
                } else {
                    j5 = 150;
                }
                ofFloat7.setDuration(j5);
                ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(this.f190011b, "translationY", 0.0f, -10.0f);
                C89219l.m154716b(ofFloat8, "");
                if (this.f190012c) {
                    j6 = 200;
                } else {
                    j6 = 150;
                }
                ofFloat8.setDuration(j6);
                ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(this.f190011b, "translationX", 0.0f, -10.0f);
                C89219l.m154716b(ofFloat9, "");
                if (this.f190012c) {
                    j7 = 200;
                } else {
                    j7 = 150;
                }
                ofFloat9.setDuration(j7);
                ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(this.f190011b, "translationX", 0.0f, 10.0f);
                C89219l.m154716b(ofFloat10, "");
                if (this.f190012c) {
                    j8 = 200;
                } else {
                    j8 = 150;
                }
                ofFloat10.setDuration(j8);
                this.f190011b.setVisibility(0);
                if (this.f190012c) {
                    int i4 = this.f190010a.f189953a;
                    if (i4 == 3) {
                        ofFloat9.setInterpolator(new C84952c());
                        ofFloat6.setInterpolator(new AccelerateDecelerateInterpolator());
                        AnimatorSet animatorSet2 = this.f190010a.f189958f;
                        if (!(animatorSet2 == null || (play5 = animatorSet2.play(ofFloat)) == null || (with9 = play5.with(ofFloat2)) == null || (with10 = with9.with(ofFloat9)) == null)) {
                            with10.before(ofFloat6);
                        }
                    } else if (i4 == 5) {
                        ofFloat10.setInterpolator(new C84952c());
                        ofFloat5.setInterpolator(new AccelerateDecelerateInterpolator());
                        AnimatorSet animatorSet3 = this.f190010a.f189958f;
                        if (!(animatorSet3 == null || (play6 = animatorSet3.play(ofFloat)) == null || (with11 = play6.with(ofFloat2)) == null || (with12 = with11.with(ofFloat10)) == null)) {
                            with12.before(ofFloat5);
                        }
                    } else if (i4 == 48) {
                        ofFloat8.setInterpolator(new C84952c());
                        ofFloat3.setInterpolator(new AccelerateDecelerateInterpolator());
                        AnimatorSet animatorSet4 = this.f190010a.f189958f;
                        if (!(animatorSet4 == null || (play7 = animatorSet4.play(ofFloat)) == null || (with13 = play7.with(ofFloat2)) == null || (with14 = with13.with(ofFloat8)) == null)) {
                            with14.before(ofFloat3);
                        }
                    } else if (i4 == 80) {
                        ofFloat7.setInterpolator(new C84952c());
                        ofFloat4.setInterpolator(new AccelerateDecelerateInterpolator());
                        AnimatorSet animatorSet5 = this.f190010a.f189958f;
                        if (!(animatorSet5 == null || (play8 = animatorSet5.play(ofFloat)) == null || (with15 = play8.with(ofFloat2)) == null || (with16 = with15.with(ofFloat7)) == null)) {
                            with16.before(ofFloat4);
                        }
                    }
                } else {
                    int i5 = this.f190010a.f189953a;
                    if (i5 == 3) {
                        ofFloat6.setInterpolator(new C84951b());
                        ofFloat9.setInterpolator(new AccelerateDecelerateInterpolator());
                        AnimatorSet animatorSet6 = this.f190010a.f189958f;
                        if (!(animatorSet6 == null || (play = animatorSet6.play(ofFloat)) == null || (with = play.with(ofFloat2)) == null || (with2 = with.with(ofFloat6)) == null)) {
                            with2.after(ofFloat9);
                        }
                    } else if (i5 == 5) {
                        ofFloat5.setInterpolator(new C84951b());
                        ofFloat10.setInterpolator(new AccelerateDecelerateInterpolator());
                        AnimatorSet animatorSet7 = this.f190010a.f189958f;
                        if (!(animatorSet7 == null || (play2 = animatorSet7.play(ofFloat)) == null || (with3 = play2.with(ofFloat2)) == null || (with4 = with3.with(ofFloat5)) == null)) {
                            with4.after(ofFloat10);
                        }
                    } else if (i5 == 48) {
                        ofFloat3.setInterpolator(new C84951b());
                        ofFloat8.setInterpolator(new AccelerateDecelerateInterpolator());
                        AnimatorSet animatorSet8 = this.f190010a.f189958f;
                        if (!(animatorSet8 == null || (play3 = animatorSet8.play(ofFloat)) == null || (with5 = play3.with(ofFloat2)) == null || (with6 = with5.with(ofFloat3)) == null)) {
                            with6.after(ofFloat8);
                        }
                    } else if (i5 == 80) {
                        ofFloat4.setInterpolator(new C84951b());
                        ofFloat7.setInterpolator(new AccelerateDecelerateInterpolator());
                        AnimatorSet animatorSet9 = this.f190010a.f189958f;
                        if (!(animatorSet9 == null || (play4 = animatorSet9.play(ofFloat)) == null || (with7 = play4.with(ofFloat2)) == null || (with8 = with7.with(ofFloat4)) == null)) {
                            with8.after(ofFloat7);
                        }
                    }
                }
                AnimatorSet animatorSet10 = this.f190010a.f189958f;
                if (animatorSet10 != null) {
                    animatorSet10.addListener(new AnimatorListenerAdapter(this) {
                        /* class com.p2082ss.android.ugc.tools.view.style.C84971e.RunnableC84976e.C849771 */

                        /* renamed from: a */
                        final /* synthetic */ RunnableC84976e f190013a;

                        static {
                            Covode.recordClassIndex(98982);
                        }

                        /* JADX WARN: Incorrect args count in method signature: ()V */
                        {
                            this.f190013a = r1;
                        }

                        public final void onAnimationEnd(Animator animator) {
                            C89219l.m154721d(animator, "");
                            super.onAnimationEnd(animator);
                            if (!this.f190013a.f190012c) {
                                this.f190013a.f190011b.setVisibility(8);
                                this.f190013a.f190010a.mo129805b();
                            }
                        }

                        public final void onAnimationStart(Animator animator) {
                            C89219l.m154721d(animator, "");
                            super.onAnimationStart(animator);
                            if (this.f190013a.f190012c) {
                                this.f190013a.f190011b.setVisibility(0);
                            }
                        }
                    });
                }
                if (this.f190010a.f189954b && (animatorSet = this.f190010a.f189958f) != null) {
                    animatorSet.setInterpolator(new OvershootInterpolator(1.0f));
                }
                AnimatorSet animatorSet11 = this.f190010a.f189958f;
                if (animatorSet11 != null) {
                    animatorSet11.start();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.tools.view.style.e$g */
    public static final class View$OnClickListenerC84979g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C84971e f190015a;

        static {
            Covode.recordClassIndex(98984);
        }

        View$OnClickListenerC84979g(C84971e eVar) {
            this.f190015a = eVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f190015a.dismiss();
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ C84969d m146043a(C84971e eVar) {
        C84969d dVar = eVar.f189957e;
        if (dVar == null) {
            C89219l.m154710a("mDmtBubbleLayout");
        }
        return dVar;
    }

    /* renamed from: com.ss.android.ugc.tools.view.style.e$a */
    public static final class C84972a {

        /* renamed from: A */
        public boolean f189979A = true;

        /* renamed from: B */
        public boolean f189980B;

        /* renamed from: C */
        public int f189981C;

        /* renamed from: D */
        public boolean f189982D = true;

        /* renamed from: E */
        public Activity f189983E;

        /* renamed from: a */
        public int f189984a;

        /* renamed from: b */
        public float f189985b;

        /* renamed from: c */
        public int f189986c;

        /* renamed from: d */
        public int f189987d;

        /* renamed from: e */
        public boolean f189988e = true;

        /* renamed from: f */
        public boolean f189989f;

        /* renamed from: g */
        public boolean f189990g;

        /* renamed from: h */
        public boolean f189991h;

        /* renamed from: i */
        public int f189992i;

        /* renamed from: j */
        public int f189993j;

        /* renamed from: k */
        public long f189994k = 800;

        /* renamed from: l */
        public long f189995l = 5000;

        /* renamed from: m */
        public boolean f189996m = true;

        /* renamed from: n */
        public View f189997n;

        /* renamed from: o */
        public int f189998o;

        /* renamed from: p */
        public int f189999p;

        /* renamed from: q */
        public String f190000q = "";

        /* renamed from: r */
        public int f190001r;

        /* renamed from: s */
        public float f190002s = 13.0f;

        /* renamed from: t */
        public Typeface f190003t;

        /* renamed from: u */
        public int f190004u;

        /* renamed from: v */
        public AbstractC84973b f190005v;

        /* renamed from: w */
        public AbstractC84974c f190006w;

        /* renamed from: x */
        public AbstractC84975d f190007x;

        /* renamed from: y */
        public boolean f190008y = true;

        /* renamed from: z */
        public float f190009z = 12.0f;

        static {
            Covode.recordClassIndex(98977);
        }

        public C84972a(Activity activity) {
            C89219l.m154721d(activity, "");
            this.f189983E = activity;
        }
    }

    /* renamed from: a */
    private final void m146044a(View view) {
        C84969d dVar = new C84969d(this.f189949N);
        this.f189957e = dVar;
        dVar.setBackgroundColor(0);
        C84969d dVar2 = this.f189957e;
        if (dVar2 == null) {
            C89219l.m154710a("mDmtBubbleLayout");
        }
        dVar2.addView(view);
        C84969d dVar3 = this.f189957e;
        if (dVar3 == null) {
            C89219l.m154710a("mDmtBubbleLayout");
        }
        dVar3.setGravity(17);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        C84969d dVar4 = this.f189957e;
        if (dVar4 == null) {
            C89219l.m154710a("mDmtBubbleLayout");
        }
        dVar4.setLayoutParams(marginLayoutParams);
        C84969d dVar5 = this.f189957e;
        if (dVar5 == null) {
            C89219l.m154710a("mDmtBubbleLayout");
        }
        dVar5.setVisibility(8);
        if (this.f189964l != 0) {
            C84969d dVar6 = this.f189957e;
            if (dVar6 == null) {
                C89219l.m154710a("mDmtBubbleLayout");
            }
            dVar6.setMBgColor(this.f189964l);
        }
        C84969d dVar7 = this.f189957e;
        if (dVar7 == null) {
            C89219l.m154710a("mDmtBubbleLayout");
        }
        dVar7.setMNeedPath(this.f189966n);
        C84969d dVar8 = this.f189957e;
        if (dVar8 == null) {
            C89219l.m154710a("mDmtBubbleLayout");
        }
        dVar8.setMNeedArrow(this.f189939D);
        C84969d dVar9 = this.f189957e;
        if (dVar9 == null) {
            C89219l.m154710a("mDmtBubbleLayout");
        }
        dVar9.setMNeedPressFade(this.f189967o);
        C84969d dVar10 = this.f189957e;
        if (dVar10 == null) {
            C89219l.m154710a("mDmtBubbleLayout");
        }
        dVar10.setMNeedShadow(this.f189968p);
        C84969d dVar11 = this.f189957e;
        if (dVar11 == null) {
            C89219l.m154710a("mDmtBubbleLayout");
        }
        dVar11.setMShadowColor(this.f189969q);
        C84969d dVar12 = this.f189957e;
        if (dVar12 == null) {
            C89219l.m154710a("mDmtBubbleLayout");
        }
        dVar12.setOnClickListener(new View$OnClickListenerC84979g(this));
        C84969d dVar13 = this.f189957e;
        if (dVar13 == null) {
            C89219l.m154710a("mDmtBubbleLayout");
        }
        setContentView(dVar13);
        getContentView().measure(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    /* renamed from: b */
    private void m146046b(View view) {
        if (!this.f189949N.isFinishing() && view != null && view.getWindowToken() != null) {
            this.f189941F = view.getMeasuredHeight();
            this.f189942G = view.getMeasuredWidth();
            getContentView().removeCallbacks(this.f189952Q);
            this.f189953a = 48;
            C84969d dVar = this.f189957e;
            if (dVar == null) {
                C89219l.m154710a("mDmtBubbleLayout");
            }
            this.f189948M = dVar.getPADDING();
            if (isShowing()) {
                super.dismiss();
                return;
            }
            int a = m146042a(48);
            int i = this.f189975w;
            if (i == 0 || this.f189976x == 0) {
                getContentView().measure(Integer.MIN_VALUE, Integer.MIN_VALUE);
            } else {
                getContentView().measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f189976x, 1073741824));
            }
            if (!this.f189945J) {
                this.f189963k += (float) (this.f189948M * 8);
                this.f189945J = true;
            }
            C84969d dVar2 = this.f189957e;
            if (dVar2 == null) {
                C89219l.m154710a("mDmtBubbleLayout");
            }
            dVar2.mo129756a(a, this.f189962j + this.f189963k);
            m146045a(view, 48);
            this.f189947L = false;
            if (this.f189973u > 0) {
                getContentView().postDelayed(this.f189952Q, this.f189973u);
            }
        }
    }

    /* renamed from: a */
    public final void mo129804a(boolean z) {
        C84969d dVar = this.f189957e;
        if (dVar == null) {
            C89219l.m154710a("mDmtBubbleLayout");
        }
        if (!z) {
            this.f189947L = true;
        }
        this.f189958f = new AnimatorSet();
        if (dVar != null) {
            dVar.post(new RunnableC84976e(this, dVar, z));
        }
    }

    public C84971e(C84972a aVar) {
        View view;
        C89219l.m154721d(aVar, "");
        this.f189949N = aVar.f189983E;
        this.f189953a = aVar.f189984a;
        this.f189963k = aVar.f189985b;
        this.f189964l = aVar.f189986c;
        this.f189965m = aVar.f189987d;
        this.f189966n = aVar.f189988e;
        this.f189967o = aVar.f189989f;
        this.f189954b = aVar.f189990g;
        this.f189970r = aVar.f189991h;
        this.f189971s = aVar.f189992i;
        this.f189972t = aVar.f189993j;
        this.f189955c = aVar.f189994k;
        this.f189973u = aVar.f189995l;
        this.f189974v = aVar.f189996m;
        this.f189950O = aVar.f189997n;
        this.f189976x = aVar.f189999p;
        this.f189975w = aVar.f189998o;
        this.f189977y = aVar.f190000q;
        this.f189978z = aVar.f190001r;
        this.f189936A = aVar.f190002s;
        this.f189937B = aVar.f190004u;
        this.f189938C = aVar.f190003t;
        this.f189959g = aVar.f190005v;
        this.f189961i = aVar.f190006w;
        this.f189960h = aVar.f190007x;
        this.f189939D = aVar.f190008y;
        this.f189940E = aVar.f190009z;
        this.f189943H = aVar.f189979A;
        this.f189968p = aVar.f189980B;
        this.f189969q = aVar.f189981C;
        this.f189944I = aVar.f189982D;
        this.f189956d = (int) C84912r.m145930a(this.f189949N, 3.0f);
        setWidth(-2);
        setHeight(-2);
        setFocusable(false);
        setOutsideTouchable(this.f189943H);
        setClippingEnabled(false);
        setBackgroundDrawable(new ColorDrawable(0));
        setInputMethodMode(1);
        setSoftInputMode(16);
        if (this.f189974v || (view = this.f189950O) == null) {
            StyleTextView styleTextView = new StyleTextView(this.f189949N);
            this.f189946K = styleTextView;
            if (this.f189937B != 0) {
                styleTextView.setTextColor(this.f189937B);
            } else {
                styleTextView.setTextColor(this.f189949N.getResources().getColor(R.color.st));
            }
            TextView textView = this.f189946K;
            if (textView == null) {
                C89219l.m154710a("mTextView");
            }
            textView.setTextSize(1, 13.0f);
            int i = Build.VERSION.SDK_INT;
            TextView textView2 = this.f189946K;
            if (textView2 == null) {
                C89219l.m154710a("mTextView");
            }
            textView2.setTextAlignment(5);
            TextView textView3 = this.f189946K;
            if (textView3 == null) {
                C89219l.m154710a("mTextView");
            }
            textView3.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            TextView textView4 = this.f189946K;
            if (textView4 == null) {
                C89219l.m154710a("mTextView");
            }
            textView4.setGravity(17);
            TextView textView5 = this.f189946K;
            if (textView5 == null) {
                C89219l.m154710a("mTextView");
            }
            textView5.setMaxWidth((int) C84912r.m145930a(this.f189949N, 197.0f));
            TextView textView6 = this.f189946K;
            if (textView6 == null) {
                C89219l.m154710a("mTextView");
            }
            textView6.setMaxLines(2);
            TextView textView7 = this.f189946K;
            if (textView7 == null) {
                C89219l.m154710a("mTextView");
            }
            m146044a(textView7);
            this.f189970r = true;
            if (!TextUtils.isEmpty(this.f189977y)) {
                TextView textView8 = this.f189946K;
                if (textView8 == null) {
                    C89219l.m154710a("mTextView");
                }
                textView8.setText(this.f189977y);
            }
            if (this.f189978z != 0) {
                TextView textView9 = this.f189946K;
                if (textView9 == null) {
                    C89219l.m154710a("mTextView");
                }
                textView9.setText(this.f189978z);
            }
            if (this.f189936A != 0.0f) {
                TextView textView10 = this.f189946K;
                if (textView10 == null) {
                    C89219l.m154710a("mTextView");
                }
                textView10.setTextSize(1, this.f189936A);
            }
            getContentView().measure(Integer.MIN_VALUE, Integer.MIN_VALUE);
        } else {
            m146044a(view);
            C84969d dVar = this.f189957e;
            if (dVar == null) {
                C89219l.m154710a("mDmtBubbleLayout");
            }
            dVar.setUseDefaultView(false);
        }
        int i2 = this.f189975w;
        if (!(i2 == 0 || this.f189976x == 0)) {
            setWidth(i2);
            setHeight(this.f189976x);
            C84969d.f189909l = getWidth();
            C84969d.f189910m = getHeight();
        }
        if (this.f189970r) {
            int i3 = Build.VERSION.SDK_INT;
            int i4 = Build.VERSION.SDK_INT;
            View contentView = getContentView();
            C89219l.m154716b(contentView, "");
            contentView.setSystemUiVisibility(4102);
        }
        if (this.f189964l != 0) {
            C84969d dVar2 = this.f189957e;
            if (dVar2 == null) {
                C89219l.m154710a("mDmtBubbleLayout");
            }
            dVar2.setMBgColor(this.f189964l);
        }
        if (this.f189965m != 0) {
            C84969d dVar3 = this.f189957e;
            if (dVar3 == null) {
                C89219l.m154710a("mDmtBubbleLayout");
            }
            dVar3.setMBorderColor(this.f189965m);
        }
        if (!this.f189944I) {
            C84969d dVar4 = this.f189957e;
            if (dVar4 == null) {
                C89219l.m154710a("mDmtBubbleLayout");
            }
            dVar4.setNeedAddColor(false);
        }
        C84969d dVar5 = this.f189957e;
        if (dVar5 == null) {
            C89219l.m154710a("mDmtBubbleLayout");
        }
        dVar5.setMNeedPath(this.f189966n);
        C84969d dVar6 = this.f189957e;
        if (dVar6 == null) {
            C89219l.m154710a("mDmtBubbleLayout");
        }
        dVar6.setBubbleOrientation(m146042a(this.f189953a));
        if (this.f189940E != 0.0f) {
            C84969d dVar7 = this.f189957e;
            if (dVar7 == null) {
                C89219l.m154710a("mDmtBubbleLayout");
            }
            dVar7.setMPadding(this.f189940E);
        }
        this.f189952Q = new RunnableC84978f(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0019, code lost:
        if (r1 == null) goto L_0x001b;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m146045a(android.view.View r7, int r8) {
        /*
            r6 = this;
            r0 = 2
            int[] r2 = new int[r0]
            java.util.function.Supplier<android.graphics.Point> r0 = r6.f189951P
            r5 = 1
            r4 = 0
            if (r0 == 0) goto L_0x0052
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 24
            if (r1 < r0) goto L_0x0052
            java.util.function.Supplier<android.graphics.Point> r0 = r6.f189951P
            if (r0 == 0) goto L_0x0050
            java.lang.Object r1 = r0.get()
            android.graphics.Point r1 = (android.graphics.Point) r1
            if (r1 != 0) goto L_0x001e
        L_0x001b:
            p4600h.p4611f.p4613b.C89219l.m154715b()
        L_0x001e:
            int r0 = r1.x
            r2[r4] = r0
            int r0 = r1.y
            r2[r5] = r0
        L_0x0026:
            r3 = r2[r4]
            int r0 = r6.f189971s
            int r3 = r3 + r0
            int r3 = r3 + r4
            android.app.Activity r1 = r6.f189949N
            r0 = 1068708659(0x3fb33333, float:1.4)
            float r0 = com.p2082ss.android.ugc.tools.utils.C84912r.m145930a(r1, r0)
            int r0 = (int) r0
            int r3 = r3 + r0
            r2 = r2[r5]
            int r0 = r6.m146047c()
            int r2 = r2 - r0
            int r0 = r6.f189972t
            int r2 = r2 + r0
            android.app.Activity r1 = r6.f189949N
            r0 = 1067869798(0x3fa66666, float:1.3)
            float r0 = com.p2082ss.android.ugc.tools.utils.C84912r.m145930a(r1, r0)
            int r0 = (int) r0
            int r2 = r2 + r0
            r6.showAtLocation(r7, r4, r3, r2)
            return
        L_0x0050:
            r1 = 0
            goto L_0x001b
        L_0x0052:
            r7.getLocationOnScreen(r2)
            goto L_0x0026
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.tools.view.style.C84971e.m146045a(android.view.View, int):void");
    }

    /* renamed from: a */
    public final void mo129803a(View view, float f, int i) {
        this.f189971s = i;
        this.f189962j = f;
        m146046b(view);
    }

    public final void showAtLocation(View view, int i, int i2, int i3) {
        C89219l.m154721d(view, "");
        super.showAtLocation(view, i, i2, i3);
        mo129804a(true);
    }
}
