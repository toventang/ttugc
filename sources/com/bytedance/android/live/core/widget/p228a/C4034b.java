package com.bytedance.android.live.core.widget.p228a;

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
import com.bytedance.android.live.core.widget.C4047d;
import com.bytedance.android.live.core.widget.C4048e;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.core.widget.a.b */
public final class C4034b extends PopupWindow {

    /* renamed from: l */
    public static volatile int f11099l;

    /* renamed from: m */
    public static final C4036b f11100m = new C4036b((byte) 0);

    /* renamed from: A */
    private String f11101A = "";

    /* renamed from: B */
    private int f11102B;

    /* renamed from: C */
    private float f11103C;

    /* renamed from: D */
    private float f11104D = 13.0f;

    /* renamed from: E */
    private int f11105E;

    /* renamed from: F */
    private Typeface f11106F;

    /* renamed from: G */
    private boolean f11107G = true;

    /* renamed from: H */
    private float f11108H = 12.0f;

    /* renamed from: I */
    private int f11109I;

    /* renamed from: J */
    private int f11110J;

    /* renamed from: K */
    private boolean f11111K = true;

    /* renamed from: L */
    private boolean f11112L = true;

    /* renamed from: M */
    private boolean f11113M;

    /* renamed from: N */
    private TextView f11114N;

    /* renamed from: O */
    private boolean f11115O;

    /* renamed from: P */
    private int f11116P;

    /* renamed from: Q */
    private Activity f11117Q;

    /* renamed from: R */
    private View f11118R;

    /* renamed from: S */
    private AbstractC4044c<Point> f11119S;

    /* renamed from: T */
    private final Runnable f11120T;

    /* renamed from: a */
    public int f11121a;

    /* renamed from: b */
    public float f11122b;

    /* renamed from: c */
    public boolean f11123c;

    /* renamed from: d */
    public int f11124d;

    /* renamed from: e */
    public long f11125e = 200;

    /* renamed from: f */
    public int f11126f;

    /* renamed from: g */
    public C4032a f11127g;

    /* renamed from: h */
    public AnimatorSet f11128h;

    /* renamed from: i */
    public AbstractC4037c f11129i;

    /* renamed from: j */
    public AbstractC4039e f11130j;

    /* renamed from: k */
    public AbstractC4038d f11131k;

    /* renamed from: n */
    private float f11132n;

    /* renamed from: o */
    private int f11133o;

    /* renamed from: p */
    private int f11134p;

    /* renamed from: q */
    private boolean f11135q = true;

    /* renamed from: r */
    private boolean f11136r;

    /* renamed from: s */
    private boolean f11137s;

    /* renamed from: t */
    private int f11138t;

    /* renamed from: u */
    private boolean f11139u;

    /* renamed from: v */
    private int f11140v;

    /* renamed from: w */
    private long f11141w = 5000;

    /* renamed from: x */
    private boolean f11142x = true;

    /* renamed from: y */
    private int f11143y;

    /* renamed from: z */
    private int f11144z;

    /* renamed from: com.bytedance.android.live.core.widget.a.b$c */
    public interface AbstractC4037c {
        static {
            Covode.recordClassIndex(4578);
        }
    }

    /* renamed from: com.bytedance.android.live.core.widget.a.b$d */
    public interface AbstractC4038d {
        static {
            Covode.recordClassIndex(4579);
        }
    }

    /* renamed from: com.bytedance.android.live.core.widget.a.b$e */
    public interface AbstractC4039e {
        static {
            Covode.recordClassIndex(4580);
        }
    }

    static {
        Covode.recordClassIndex(4575);
    }

    /* renamed from: a */
    private static int m9842a(int i) {
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

    /* renamed from: com.bytedance.android.live.core.widget.a.b$b */
    public static final class C4036b {
        static {
            Covode.recordClassIndex(4577);
        }

        private C4036b() {
        }

        public /* synthetic */ C4036b(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.android.live.core.widget.a.b$g */
    static final class RunnableC4042g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C4034b f11181a;

        static {
            Covode.recordClassIndex(4583);
        }

        RunnableC4042g(C4034b bVar) {
            this.f11181a = bVar;
        }

        public final void run() {
            this.f11181a.mo9473a(false);
        }
    }

    /* renamed from: c */
    public final int mo9475c() {
        mo9471a();
        View contentView = getContentView();
        C89219l.m154716b(contentView, "");
        return contentView.getMeasuredWidth();
    }

    public final void dismiss() {
        if (!this.f11115O) {
            mo9473a(false);
            getContentView().removeCallbacks(this.f11120T);
            this.f11124d = 0;
            this.f11140v = 0;
        }
    }

    /* renamed from: a */
    public final void mo9471a() {
        int i = this.f11143y;
        if (i == 0 || this.f11144z == 0) {
            getContentView().measure(Integer.MIN_VALUE, Integer.MIN_VALUE);
            return;
        }
        getContentView().measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f11144z, 1073741824));
    }

    /* renamed from: b */
    public final void mo9474b() {
        AnimatorSet animatorSet = this.f11128h;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
        }
        AnimatorSet animatorSet2 = this.f11128h;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        this.f11128h = null;
        if (!this.f11117Q.isFinishing() && isShowing()) {
            try {
                super.dismiss();
            } catch (Exception unused) {
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.core.widget.a.b$f */
    public static final class RunnableC4040f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C4034b f11177a;

        /* renamed from: b */
        final /* synthetic */ C4032a f11178b;

        /* renamed from: c */
        final /* synthetic */ boolean f11179c;

        static {
            Covode.recordClassIndex(4581);
        }

        RunnableC4040f(C4034b bVar, C4032a aVar, boolean z) {
            this.f11177a = bVar;
            this.f11178b = aVar;
            this.f11179c = z;
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
            if (this.f11177a.f11128h != null) {
                int i3 = this.f11177a.f11121a;
                if (i3 != 3) {
                    if (i3 == 5) {
                        i = (int) this.f11178b.getX();
                        f2 = this.f11178b.getY();
                        f3 = C4034b.m9843a(this.f11177a).getBubbleOffset();
                    } else if (i3 == 48) {
                        i = (int) (this.f11178b.getX() + C4034b.m9843a(this.f11177a).getBubbleOffset());
                        f2 = this.f11178b.getY();
                        f3 = (float) this.f11178b.getMeasuredHeight();
                    } else if (i3 != 80) {
                        i = 0;
                        i2 = 0;
                    } else {
                        i = (int) (this.f11178b.getX() + C4034b.m9843a(this.f11177a).getBubbleOffset());
                        f = this.f11178b.getY();
                        i2 = (int) f;
                    }
                    f = f2 + f3;
                    i2 = (int) f;
                } else {
                    i = (int) (this.f11178b.getX() + ((float) this.f11178b.getMeasuredWidth()));
                    f2 = this.f11178b.getY();
                    f3 = C4034b.m9843a(this.f11177a).getBubbleOffset();
                    f = f2 + f3;
                    i2 = (int) f;
                }
                this.f11178b.setPivotY((float) i2);
                this.f11178b.setPivotX((float) i);
                C4032a aVar = this.f11178b;
                float[] fArr = new float[2];
                boolean z = this.f11179c;
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
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(aVar, "scaleX", fArr);
                C89219l.m154716b(ofFloat, "");
                ofFloat.setDuration(200L);
                C4032a aVar2 = this.f11178b;
                float[] fArr2 = new float[2];
                boolean z2 = this.f11179c;
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
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(aVar2, "scaleY", fArr2);
                C89219l.m154716b(ofFloat2, "");
                ofFloat2.setDuration(200L);
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f11178b, "translationY", 0.0f);
                C89219l.m154716b(ofFloat3, "");
                if (this.f11179c) {
                    j = 500;
                } else {
                    j = 200;
                }
                ofFloat3.setDuration(j);
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.f11178b, "translationY", 0.0f);
                C89219l.m154716b(ofFloat4, "");
                if (this.f11179c) {
                    j2 = 500;
                } else {
                    j2 = 200;
                }
                ofFloat4.setDuration(j2);
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.f11178b, "translationX", 0.0f);
                C89219l.m154716b(ofFloat5, "");
                if (this.f11179c) {
                    j3 = 500;
                } else {
                    j3 = 200;
                }
                ofFloat5.setDuration(j3);
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this.f11178b, "translationX", 0.0f);
                C89219l.m154716b(ofFloat6, "");
                if (this.f11179c) {
                    j4 = 500;
                } else {
                    j4 = 200;
                }
                ofFloat6.setDuration(j4);
                ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(this.f11178b, "translationY", 0.0f, 10.0f);
                C89219l.m154716b(ofFloat7, "");
                if (this.f11179c) {
                    j5 = 200;
                } else {
                    j5 = 150;
                }
                ofFloat7.setDuration(j5);
                ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(this.f11178b, "translationY", 0.0f, -10.0f);
                C89219l.m154716b(ofFloat8, "");
                if (this.f11179c) {
                    j6 = 200;
                } else {
                    j6 = 150;
                }
                ofFloat8.setDuration(j6);
                ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(this.f11178b, "translationX", 0.0f, -10.0f);
                C89219l.m154716b(ofFloat9, "");
                if (this.f11179c) {
                    j7 = 200;
                } else {
                    j7 = 150;
                }
                ofFloat9.setDuration(j7);
                ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(this.f11178b, "translationX", 0.0f, 10.0f);
                C89219l.m154716b(ofFloat10, "");
                if (this.f11179c) {
                    j8 = 200;
                } else {
                    j8 = 150;
                }
                ofFloat10.setDuration(j8);
                this.f11178b.setVisibility(0);
                if (this.f11179c) {
                    int i4 = this.f11177a.f11121a;
                    if (i4 == 3) {
                        ofFloat9.setInterpolator(new C4048e());
                        ofFloat6.setInterpolator(new AccelerateDecelerateInterpolator());
                        AnimatorSet animatorSet2 = this.f11177a.f11128h;
                        if (!(animatorSet2 == null || (play5 = animatorSet2.play(ofFloat)) == null || (with9 = play5.with(ofFloat2)) == null || (with10 = with9.with(ofFloat9)) == null)) {
                            with10.before(ofFloat6);
                        }
                    } else if (i4 == 5) {
                        ofFloat10.setInterpolator(new C4048e());
                        ofFloat5.setInterpolator(new AccelerateDecelerateInterpolator());
                        AnimatorSet animatorSet3 = this.f11177a.f11128h;
                        if (!(animatorSet3 == null || (play6 = animatorSet3.play(ofFloat)) == null || (with11 = play6.with(ofFloat2)) == null || (with12 = with11.with(ofFloat10)) == null)) {
                            with12.before(ofFloat5);
                        }
                    } else if (i4 == 48) {
                        ofFloat8.setInterpolator(new C4048e());
                        ofFloat3.setInterpolator(new AccelerateDecelerateInterpolator());
                        AnimatorSet animatorSet4 = this.f11177a.f11128h;
                        if (!(animatorSet4 == null || (play7 = animatorSet4.play(ofFloat)) == null || (with13 = play7.with(ofFloat2)) == null || (with14 = with13.with(ofFloat8)) == null)) {
                            with14.before(ofFloat3);
                        }
                    } else if (i4 == 80) {
                        ofFloat7.setInterpolator(new C4048e());
                        ofFloat4.setInterpolator(new AccelerateDecelerateInterpolator());
                        AnimatorSet animatorSet5 = this.f11177a.f11128h;
                        if (!(animatorSet5 == null || (play8 = animatorSet5.play(ofFloat)) == null || (with15 = play8.with(ofFloat2)) == null || (with16 = with15.with(ofFloat7)) == null)) {
                            with16.before(ofFloat4);
                        }
                    }
                } else {
                    int i5 = this.f11177a.f11121a;
                    if (i5 == 3) {
                        ofFloat6.setInterpolator(new C4047d());
                        ofFloat9.setInterpolator(new AccelerateDecelerateInterpolator());
                        AnimatorSet animatorSet6 = this.f11177a.f11128h;
                        if (!(animatorSet6 == null || (play = animatorSet6.play(ofFloat)) == null || (with = play.with(ofFloat2)) == null || (with2 = with.with(ofFloat6)) == null)) {
                            with2.after(ofFloat9);
                        }
                    } else if (i5 == 5) {
                        ofFloat5.setInterpolator(new C4047d());
                        ofFloat10.setInterpolator(new AccelerateDecelerateInterpolator());
                        AnimatorSet animatorSet7 = this.f11177a.f11128h;
                        if (!(animatorSet7 == null || (play2 = animatorSet7.play(ofFloat)) == null || (with3 = play2.with(ofFloat2)) == null || (with4 = with3.with(ofFloat5)) == null)) {
                            with4.after(ofFloat10);
                        }
                    } else if (i5 == 48) {
                        ofFloat3.setInterpolator(new C4047d());
                        ofFloat8.setInterpolator(new AccelerateDecelerateInterpolator());
                        AnimatorSet animatorSet8 = this.f11177a.f11128h;
                        if (!(animatorSet8 == null || (play3 = animatorSet8.play(ofFloat)) == null || (with5 = play3.with(ofFloat2)) == null || (with6 = with5.with(ofFloat3)) == null)) {
                            with6.after(ofFloat8);
                        }
                    } else if (i5 == 80) {
                        ofFloat4.setInterpolator(new C4047d());
                        ofFloat7.setInterpolator(new AccelerateDecelerateInterpolator());
                        AnimatorSet animatorSet9 = this.f11177a.f11128h;
                        if (!(animatorSet9 == null || (play4 = animatorSet9.play(ofFloat)) == null || (with7 = play4.with(ofFloat2)) == null || (with8 = with7.with(ofFloat4)) == null)) {
                            with8.after(ofFloat7);
                        }
                    }
                }
                AnimatorSet animatorSet10 = this.f11177a.f11128h;
                if (animatorSet10 != null) {
                    animatorSet10.addListener(new AnimatorListenerAdapter(this) {
                        /* class com.bytedance.android.live.core.widget.p228a.C4034b.RunnableC4040f.C40411 */

                        /* renamed from: a */
                        final /* synthetic */ RunnableC4040f f11180a;

                        static {
                            Covode.recordClassIndex(4582);
                        }

                        /* JADX WARN: Incorrect args count in method signature: ()V */
                        {
                            this.f11180a = r1;
                        }

                        public final void onAnimationEnd(Animator animator) {
                            C89219l.m154721d(animator, "");
                            super.onAnimationEnd(animator);
                            if (!this.f11180a.f11179c) {
                                this.f11180a.f11178b.setVisibility(8);
                                this.f11180a.f11177a.mo9474b();
                            }
                        }

                        public final void onAnimationStart(Animator animator) {
                            C89219l.m154721d(animator, "");
                            super.onAnimationStart(animator);
                            if (this.f11180a.f11179c) {
                                this.f11180a.f11178b.setVisibility(0);
                            }
                        }
                    });
                }
                if (this.f11177a.f11123c && (animatorSet = this.f11177a.f11128h) != null) {
                    animatorSet.setInterpolator(new OvershootInterpolator(1.0f));
                }
                AnimatorSet animatorSet11 = this.f11177a.f11128h;
                if (animatorSet11 != null) {
                    animatorSet11.start();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.core.widget.a.b$h */
    public static final class View$OnClickListenerC4043h implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C4034b f11182a;

        static {
            Covode.recordClassIndex(4584);
        }

        View$OnClickListenerC4043h(C4034b bVar) {
            this.f11182a = bVar;
        }

        public final void onClick(View view) {
            this.f11182a.dismiss();
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ C4032a m9843a(C4034b bVar) {
        C4032a aVar = bVar.f11127g;
        if (aVar == null) {
            C89219l.m154710a("mDmtBubbleLayout");
        }
        return aVar;
    }

    /* renamed from: com.bytedance.android.live.core.widget.a.b$a */
    public static final class C4035a {

        /* renamed from: A */
        public float f11145A = 12.0f;

        /* renamed from: B */
        public boolean f11146B = true;

        /* renamed from: C */
        public boolean f11147C;

        /* renamed from: D */
        public int f11148D;

        /* renamed from: E */
        public boolean f11149E = true;

        /* renamed from: F */
        public Activity f11150F;

        /* renamed from: a */
        public int f11151a;

        /* renamed from: b */
        public float f11152b;

        /* renamed from: c */
        public int f11153c;

        /* renamed from: d */
        public int f11154d;

        /* renamed from: e */
        public boolean f11155e = true;

        /* renamed from: f */
        public boolean f11156f;

        /* renamed from: g */
        public boolean f11157g;

        /* renamed from: h */
        public boolean f11158h;

        /* renamed from: i */
        public int f11159i;

        /* renamed from: j */
        public int f11160j;

        /* renamed from: k */
        public long f11161k = 800;

        /* renamed from: l */
        public long f11162l = 5000;

        /* renamed from: m */
        public boolean f11163m = true;

        /* renamed from: n */
        public View f11164n;

        /* renamed from: o */
        public int f11165o;

        /* renamed from: p */
        public int f11166p;

        /* renamed from: q */
        public String f11167q = "";

        /* renamed from: r */
        public int f11168r;

        /* renamed from: s */
        public float f11169s = 197.0f;

        /* renamed from: t */
        public float f11170t = 13.0f;

        /* renamed from: u */
        public Typeface f11171u;

        /* renamed from: v */
        public int f11172v;

        /* renamed from: w */
        public AbstractC4037c f11173w;

        /* renamed from: x */
        public AbstractC4038d f11174x;

        /* renamed from: y */
        public AbstractC4039e f11175y;

        /* renamed from: z */
        public boolean f11176z = true;

        static {
            Covode.recordClassIndex(4576);
        }

        public C4035a(Activity activity) {
            C89219l.m154721d(activity, "");
            this.f11150F = activity;
        }
    }

    /* renamed from: a */
    public final void mo9473a(boolean z) {
        C4032a aVar = this.f11127g;
        if (aVar == null) {
            C89219l.m154710a("mDmtBubbleLayout");
        }
        if (!z) {
            f11099l--;
            this.f11115O = true;
        }
        this.f11128h = new AnimatorSet();
        if (aVar != null) {
            aVar.post(new RunnableC4040f(this, aVar, z));
        }
    }

    /* renamed from: b */
    private final void m9844b(View view) {
        C4032a aVar = new C4032a(this.f11117Q);
        this.f11127g = aVar;
        aVar.setBackgroundColor(0);
        C4032a aVar2 = this.f11127g;
        if (aVar2 == null) {
            C89219l.m154710a("mDmtBubbleLayout");
        }
        aVar2.addView(view);
        C4032a aVar3 = this.f11127g;
        if (aVar3 == null) {
            C89219l.m154710a("mDmtBubbleLayout");
        }
        aVar3.setGravity(17);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        C4032a aVar4 = this.f11127g;
        if (aVar4 == null) {
            C89219l.m154710a("mDmtBubbleLayout");
        }
        aVar4.setLayoutParams(marginLayoutParams);
        C4032a aVar5 = this.f11127g;
        if (aVar5 == null) {
            C89219l.m154710a("mDmtBubbleLayout");
        }
        aVar5.setVisibility(8);
        if (this.f11133o != 0) {
            C4032a aVar6 = this.f11127g;
            if (aVar6 == null) {
                C89219l.m154710a("mDmtBubbleLayout");
            }
            aVar6.setMBgColor(this.f11133o);
        }
        C4032a aVar7 = this.f11127g;
        if (aVar7 == null) {
            C89219l.m154710a("mDmtBubbleLayout");
        }
        aVar7.setMNeedPath(this.f11135q);
        C4032a aVar8 = this.f11127g;
        if (aVar8 == null) {
            C89219l.m154710a("mDmtBubbleLayout");
        }
        aVar8.setMNeedArrow(this.f11107G);
        C4032a aVar9 = this.f11127g;
        if (aVar9 == null) {
            C89219l.m154710a("mDmtBubbleLayout");
        }
        aVar9.setMNeedPressFade(this.f11136r);
        C4032a aVar10 = this.f11127g;
        if (aVar10 == null) {
            C89219l.m154710a("mDmtBubbleLayout");
        }
        aVar10.setMNeedShadow(this.f11137s);
        C4032a aVar11 = this.f11127g;
        if (aVar11 == null) {
            C89219l.m154710a("mDmtBubbleLayout");
        }
        aVar11.setMShadowColor(this.f11138t);
        C4032a aVar12 = this.f11127g;
        if (aVar12 == null) {
            C89219l.m154710a("mDmtBubbleLayout");
        }
        aVar12.setOnClickListener(new View$OnClickListenerC4043h(this));
        C4032a aVar13 = this.f11127g;
        if (aVar13 == null) {
            C89219l.m154710a("mDmtBubbleLayout");
        }
        setContentView(aVar13);
        getContentView().measure(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0097, code lost:
        if (r1 == null) goto L_0x0099;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo9472a(android.view.View r7) {
        /*
        // Method dump skipped, instructions count: 266
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.core.widget.p228a.C4034b.mo9472a(android.view.View):void");
    }

    public C4034b(C4035a aVar) {
        View view;
        C89219l.m154721d(aVar, "");
        this.f11117Q = aVar.f11150F;
        this.f11121a = aVar.f11151a;
        this.f11132n = aVar.f11152b;
        this.f11133o = aVar.f11153c;
        this.f11134p = aVar.f11154d;
        this.f11135q = aVar.f11155e;
        this.f11136r = aVar.f11156f;
        this.f11123c = aVar.f11157g;
        this.f11139u = aVar.f11158h;
        this.f11124d = aVar.f11159i;
        this.f11140v = aVar.f11160j;
        this.f11125e = aVar.f11161k;
        this.f11141w = aVar.f11162l;
        this.f11142x = aVar.f11163m;
        this.f11118R = aVar.f11164n;
        this.f11144z = aVar.f11166p;
        this.f11143y = aVar.f11165o;
        this.f11101A = aVar.f11167q;
        this.f11102B = aVar.f11168r;
        this.f11103C = aVar.f11169s;
        this.f11104D = aVar.f11170t;
        this.f11105E = aVar.f11172v;
        this.f11106F = aVar.f11171u;
        this.f11129i = aVar.f11173w;
        this.f11131k = aVar.f11174x;
        this.f11130j = aVar.f11175y;
        this.f11107G = aVar.f11176z;
        this.f11108H = aVar.f11145A;
        this.f11111K = aVar.f11146B;
        this.f11137s = aVar.f11147C;
        this.f11138t = aVar.f11148D;
        this.f11112L = aVar.f11149E;
        this.f11126f = (int) C13628n.m24520b(this.f11117Q, 3.0f);
        setWidth(-2);
        setHeight(-2);
        setFocusable(false);
        setOutsideTouchable(this.f11111K);
        setClippingEnabled(false);
        setBackgroundDrawable(new ColorDrawable(0));
        setInputMethodMode(1);
        setSoftInputMode(16);
        if (this.f11142x || (view = this.f11118R) == null) {
            LiveTextView liveTextView = new LiveTextView(this.f11117Q);
            this.f11114N = liveTextView;
            if (this.f11105E != 0) {
                liveTextView.setTextColor(this.f11105E);
            } else {
                liveTextView.setTextColor(this.f11117Q.getResources().getColor(R.color.a1q));
            }
            TextView textView = this.f11114N;
            if (textView == null) {
                C89219l.m154710a("mTextView");
            }
            textView.setTextSize(1, 13.0f);
            int i = Build.VERSION.SDK_INT;
            TextView textView2 = this.f11114N;
            if (textView2 == null) {
                C89219l.m154710a("mTextView");
            }
            textView2.setTextAlignment(5);
            TextView textView3 = this.f11114N;
            if (textView3 == null) {
                C89219l.m154710a("mTextView");
            }
            textView3.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            TextView textView4 = this.f11114N;
            if (textView4 == null) {
                C89219l.m154710a("mTextView");
            }
            textView4.setGravity(17);
            TextView textView5 = this.f11114N;
            if (textView5 == null) {
                C89219l.m154710a("mTextView");
            }
            textView5.setMaxWidth((int) C13628n.m24520b(this.f11117Q, this.f11103C));
            TextView textView6 = this.f11114N;
            if (textView6 == null) {
                C89219l.m154710a("mTextView");
            }
            textView6.setMaxLines(2);
            TextView textView7 = this.f11114N;
            if (textView7 == null) {
                C89219l.m154710a("mTextView");
            }
            m9844b(textView7);
            this.f11139u = true;
            if (!TextUtils.isEmpty(this.f11101A)) {
                TextView textView8 = this.f11114N;
                if (textView8 == null) {
                    C89219l.m154710a("mTextView");
                }
                textView8.setText(this.f11101A);
            }
            if (this.f11102B != 0) {
                TextView textView9 = this.f11114N;
                if (textView9 == null) {
                    C89219l.m154710a("mTextView");
                }
                textView9.setText(this.f11102B);
            }
            if (this.f11104D != 0.0f) {
                TextView textView10 = this.f11114N;
                if (textView10 == null) {
                    C89219l.m154710a("mTextView");
                }
                textView10.setTextSize(1, this.f11104D);
            }
            getContentView().measure(Integer.MIN_VALUE, Integer.MIN_VALUE);
        } else {
            m9844b(view);
            C4032a aVar2 = this.f11127g;
            if (aVar2 == null) {
                C89219l.m154710a("mDmtBubbleLayout");
            }
            aVar2.setUseDefaultView(false);
        }
        int i2 = this.f11143y;
        if (!(i2 == 0 || this.f11144z == 0)) {
            setWidth(i2);
            setHeight(this.f11144z);
            C4032a.f11072n = getWidth();
            C4032a.f11073o = getHeight();
        }
        if (this.f11139u) {
            int i3 = Build.VERSION.SDK_INT;
            int i4 = Build.VERSION.SDK_INT;
            View contentView = getContentView();
            C89219l.m154716b(contentView, "");
            contentView.setSystemUiVisibility(4102);
        }
        if (this.f11133o != 0) {
            C4032a aVar3 = this.f11127g;
            if (aVar3 == null) {
                C89219l.m154710a("mDmtBubbleLayout");
            }
            aVar3.setMBgColor(this.f11133o);
        }
        if (this.f11134p != 0) {
            C4032a aVar4 = this.f11127g;
            if (aVar4 == null) {
                C89219l.m154710a("mDmtBubbleLayout");
            }
            aVar4.setMBorderColor(this.f11134p);
        }
        if (!this.f11112L) {
            C4032a aVar5 = this.f11127g;
            if (aVar5 == null) {
                C89219l.m154710a("mDmtBubbleLayout");
            }
            aVar5.setNeedAddColor(false);
        }
        C4032a aVar6 = this.f11127g;
        if (aVar6 == null) {
            C89219l.m154710a("mDmtBubbleLayout");
        }
        aVar6.setMNeedPath(this.f11135q);
        C4032a aVar7 = this.f11127g;
        if (aVar7 == null) {
            C89219l.m154710a("mDmtBubbleLayout");
        }
        aVar7.setBubbleOrientation(m9842a(this.f11121a));
        if (this.f11108H != 0.0f) {
            C4032a aVar8 = this.f11127g;
            if (aVar8 == null) {
                C89219l.m154710a("mDmtBubbleLayout");
            }
            aVar8.setMPadding(this.f11108H);
        }
        this.f11120T = new RunnableC4042g(this);
    }

    public final void showAtLocation(View view, int i, int i2, int i3) {
        C89219l.m154721d(view, "");
        try {
            super.showAtLocation(view, i, i2, i3);
            mo9473a(true);
        } catch (Exception unused) {
        }
    }
}
