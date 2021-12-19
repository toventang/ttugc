package com.bytedance.ies.dmt.p1194ui.p1196b;

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
import androidx.core.content.C0643b;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.p1195a.AbstractC17153c;
import com.bytedance.ies.dmt.p1194ui.p1197c.C17167b;
import com.bytedance.ies.dmt.p1194ui.p1197c.C17168c;
import com.bytedance.ies.dmt.p1194ui.widget.DmtTextView;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.dmt.ui.b.b */
public final class C17156b extends PopupWindow {

    /* renamed from: n */
    public static volatile int f40824n;

    /* renamed from: o */
    public static final C17158b f40825o = new C17158b((byte) 0);

    /* renamed from: A */
    private int f40826A;

    /* renamed from: B */
    private int f40827B;

    /* renamed from: C */
    private String f40828C = "";

    /* renamed from: D */
    private int f40829D;

    /* renamed from: E */
    private float f40830E = 13.0f;

    /* renamed from: F */
    private int f40831F;

    /* renamed from: G */
    private Typeface f40832G;

    /* renamed from: H */
    private boolean f40833H = true;

    /* renamed from: I */
    private float f40834I = 12.0f;

    /* renamed from: J */
    private int f40835J;

    /* renamed from: K */
    private int f40836K;

    /* renamed from: L */
    private boolean f40837L = true;

    /* renamed from: M */
    private boolean f40838M = true;

    /* renamed from: N */
    private boolean f40839N;

    /* renamed from: O */
    private TextUtils.TruncateAt f40840O;

    /* renamed from: P */
    private float f40841P = 197.0f;

    /* renamed from: Q */
    private TextView f40842Q;

    /* renamed from: R */
    private boolean f40843R;

    /* renamed from: S */
    private int f40844S;

    /* renamed from: T */
    private View f40845T;

    /* renamed from: U */
    private final Runnable f40846U;

    /* renamed from: a */
    public int f40847a;

    /* renamed from: b */
    public boolean f40848b;

    /* renamed from: c */
    public int f40849c;

    /* renamed from: d */
    public int f40850d;

    /* renamed from: e */
    public long f40851e = 200;

    /* renamed from: f */
    public int f40852f;

    /* renamed from: g */
    public C17154a f40853g;

    /* renamed from: h */
    public AnimatorSet f40854h;

    /* renamed from: i */
    public Activity f40855i;

    /* renamed from: j */
    public AbstractC17159c f40856j;

    /* renamed from: k */
    public AbstractC17161e f40857k;

    /* renamed from: l */
    public AbstractC17160d f40858l;

    /* renamed from: m */
    public AbstractC17153c<Point> f40859m;

    /* renamed from: p */
    private float f40860p;

    /* renamed from: q */
    private float f40861q;

    /* renamed from: r */
    private int f40862r;

    /* renamed from: s */
    private int f40863s;

    /* renamed from: t */
    private boolean f40864t = true;

    /* renamed from: u */
    private boolean f40865u;

    /* renamed from: v */
    private boolean f40866v;

    /* renamed from: w */
    private int f40867w;

    /* renamed from: x */
    private boolean f40868x;

    /* renamed from: y */
    private long f40869y = 5000;

    /* renamed from: z */
    private boolean f40870z = true;

    /* renamed from: com.bytedance.ies.dmt.ui.b.b$c */
    public interface AbstractC17159c {
        static {
            Covode.recordClassIndex(19616);
        }
    }

    /* renamed from: com.bytedance.ies.dmt.ui.b.b$d */
    public interface AbstractC17160d {
        static {
            Covode.recordClassIndex(19617);
        }
    }

    /* renamed from: com.bytedance.ies.dmt.ui.b.b$e */
    public interface AbstractC17161e {
        static {
            Covode.recordClassIndex(19618);
        }

        /* renamed from: a */
        void mo27115a();
    }

    static {
        Covode.recordClassIndex(19613);
    }

    /* renamed from: a */
    private static int m31684a(int i) {
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

    /* renamed from: com.bytedance.ies.dmt.ui.b.b$b */
    public static final class C17158b {
        static {
            Covode.recordClassIndex(19615);
        }

        private C17158b() {
        }

        public /* synthetic */ C17158b(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.ies.dmt.ui.b.b$g */
    static final class RunnableC17164g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C17156b f40908a;

        static {
            Covode.recordClassIndex(19621);
        }

        RunnableC17164g(C17156b bVar) {
            this.f40908a = bVar;
        }

        public final void run() {
            this.f40908a.mo27106a(false);
        }
    }

    /* renamed from: com.bytedance.ies.dmt.ui.b.b$a */
    public static final class C17157a {

        /* renamed from: A */
        public boolean f40871A = true;

        /* renamed from: B */
        public boolean f40872B;

        /* renamed from: C */
        public int f40873C;

        /* renamed from: D */
        public boolean f40874D = true;

        /* renamed from: E */
        public TextUtils.TruncateAt f40875E;

        /* renamed from: F */
        public float f40876F = 197.0f;

        /* renamed from: G */
        public Activity f40877G;

        /* renamed from: a */
        public int f40878a;

        /* renamed from: b */
        public float f40879b;

        /* renamed from: c */
        public int f40880c;

        /* renamed from: d */
        public int f40881d;

        /* renamed from: e */
        public boolean f40882e = true;

        /* renamed from: f */
        public boolean f40883f;

        /* renamed from: g */
        public boolean f40884g;

        /* renamed from: h */
        public boolean f40885h;

        /* renamed from: i */
        public int f40886i;

        /* renamed from: j */
        public int f40887j;

        /* renamed from: k */
        public long f40888k = 800;

        /* renamed from: l */
        public long f40889l = 5000;

        /* renamed from: m */
        public boolean f40890m = true;

        /* renamed from: n */
        public View f40891n;

        /* renamed from: o */
        public int f40892o;

        /* renamed from: p */
        public int f40893p;

        /* renamed from: q */
        public String f40894q = "";

        /* renamed from: r */
        public int f40895r;

        /* renamed from: s */
        public float f40896s = 13.0f;

        /* renamed from: t */
        public Typeface f40897t;

        /* renamed from: u */
        public int f40898u;

        /* renamed from: v */
        public AbstractC17159c f40899v;

        /* renamed from: w */
        public AbstractC17160d f40900w;

        /* renamed from: x */
        public AbstractC17161e f40901x;

        /* renamed from: y */
        public boolean f40902y = true;

        /* renamed from: z */
        public float f40903z = 12.0f;

        static {
            Covode.recordClassIndex(19614);
        }

        /* renamed from: a */
        public final C17156b mo27114a() {
            return new C17156b(this);
        }

        /* renamed from: a */
        public final C17157a mo27113a(AbstractC17161e eVar) {
            C89219l.m154721d(eVar, "");
            this.f40901x = eVar;
            return this;
        }

        public C17157a(Activity activity) {
            C89219l.m154721d(activity, "");
            this.f40877G = activity;
        }
    }

    /* renamed from: c */
    public final int mo27108c() {
        mo27102a();
        View contentView = getContentView();
        C89219l.m154716b(contentView, "");
        return contentView.getMeasuredHeight();
    }

    /* renamed from: d */
    public final int mo27109d() {
        mo27102a();
        View contentView = getContentView();
        C89219l.m154716b(contentView, "");
        return contentView.getMeasuredWidth();
    }

    public final void dismiss() {
        if (!this.f40843R) {
            mo27106a(false);
            getContentView().removeCallbacks(this.f40846U);
            this.f40849c = 0;
            this.f40850d = 0;
        }
    }

    /* renamed from: a */
    public final void mo27102a() {
        int i = this.f40826A;
        if (i == 0 || this.f40827B == 0) {
            getContentView().measure(Integer.MIN_VALUE, Integer.MIN_VALUE);
            return;
        }
        getContentView().measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f40827B, 1073741824));
    }

    /* renamed from: b */
    public final void mo27107b() {
        AnimatorSet animatorSet = this.f40854h;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
        }
        AnimatorSet animatorSet2 = this.f40854h;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        this.f40854h = null;
        if (!this.f40855i.isFinishing() && isShowing()) {
            try {
                super.dismiss();
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: e */
    public final void mo27111e() {
        if (!this.f40843R) {
            f40824n--;
            C17154a aVar = this.f40853g;
            if (aVar == null) {
                C89219l.m154710a("mDmtBubbleLayout");
            }
            aVar.setVisibility(8);
            mo27107b();
            getContentView().removeCallbacks(this.f40846U);
            this.f40849c = 0;
            this.f40850d = 0;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.dmt.ui.b.b$f */
    public static final class RunnableC17162f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C17156b f40904a;

        /* renamed from: b */
        final /* synthetic */ C17154a f40905b;

        /* renamed from: c */
        final /* synthetic */ boolean f40906c;

        static {
            Covode.recordClassIndex(19619);
        }

        RunnableC17162f(C17156b bVar, C17154a aVar, boolean z) {
            this.f40904a = bVar;
            this.f40905b = aVar;
            this.f40906c = z;
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
            if (this.f40904a.f40854h != null) {
                int i3 = this.f40904a.f40847a;
                if (i3 != 3) {
                    if (i3 == 5) {
                        i = (int) this.f40905b.getX();
                        f2 = this.f40905b.getY();
                        f3 = C17156b.m31685a(this.f40904a).getBubbleOffset();
                    } else if (i3 == 48) {
                        i = (int) (this.f40905b.getX() + C17156b.m31685a(this.f40904a).getBubbleOffset());
                        f2 = this.f40905b.getY();
                        f3 = (float) this.f40905b.getMeasuredHeight();
                    } else if (i3 != 80) {
                        i = 0;
                        i2 = 0;
                    } else {
                        i = (int) (this.f40905b.getX() + C17156b.m31685a(this.f40904a).getBubbleOffset());
                        f = this.f40905b.getY();
                        i2 = (int) f;
                    }
                    f = f2 + f3;
                    i2 = (int) f;
                } else {
                    i = (int) (this.f40905b.getX() + ((float) this.f40905b.getMeasuredWidth()));
                    f2 = this.f40905b.getY();
                    f3 = C17156b.m31685a(this.f40904a).getBubbleOffset();
                    f = f2 + f3;
                    i2 = (int) f;
                }
                this.f40905b.setPivotY((float) i2);
                this.f40905b.setPivotX((float) i);
                C17154a aVar = this.f40905b;
                float[] fArr = new float[2];
                boolean z = this.f40906c;
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
                C17154a aVar2 = this.f40905b;
                float[] fArr2 = new float[2];
                boolean z2 = this.f40906c;
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
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f40905b, "translationY", 0.0f);
                C89219l.m154716b(ofFloat3, "");
                if (this.f40906c) {
                    j = 500;
                } else {
                    j = 200;
                }
                ofFloat3.setDuration(j);
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.f40905b, "translationY", 0.0f);
                C89219l.m154716b(ofFloat4, "");
                if (this.f40906c) {
                    j2 = 500;
                } else {
                    j2 = 200;
                }
                ofFloat4.setDuration(j2);
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.f40905b, "translationX", 0.0f);
                C89219l.m154716b(ofFloat5, "");
                if (this.f40906c) {
                    j3 = 500;
                } else {
                    j3 = 200;
                }
                ofFloat5.setDuration(j3);
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this.f40905b, "translationX", 0.0f);
                C89219l.m154716b(ofFloat6, "");
                if (this.f40906c) {
                    j4 = 500;
                } else {
                    j4 = 200;
                }
                ofFloat6.setDuration(j4);
                ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(this.f40905b, "translationY", 0.0f, 10.0f);
                C89219l.m154716b(ofFloat7, "");
                if (this.f40906c) {
                    j5 = 200;
                } else {
                    j5 = 150;
                }
                ofFloat7.setDuration(j5);
                ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(this.f40905b, "translationY", 0.0f, -10.0f);
                C89219l.m154716b(ofFloat8, "");
                if (this.f40906c) {
                    j6 = 200;
                } else {
                    j6 = 150;
                }
                ofFloat8.setDuration(j6);
                ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(this.f40905b, "translationX", 0.0f, -10.0f);
                C89219l.m154716b(ofFloat9, "");
                if (this.f40906c) {
                    j7 = 200;
                } else {
                    j7 = 150;
                }
                ofFloat9.setDuration(j7);
                ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(this.f40905b, "translationX", 0.0f, 10.0f);
                C89219l.m154716b(ofFloat10, "");
                if (this.f40906c) {
                    j8 = 200;
                } else {
                    j8 = 150;
                }
                ofFloat10.setDuration(j8);
                this.f40905b.setVisibility(0);
                if (this.f40906c) {
                    int i4 = this.f40904a.f40847a;
                    if (i4 == 3) {
                        ofFloat9.setInterpolator(new C17168c());
                        ofFloat6.setInterpolator(new AccelerateDecelerateInterpolator());
                        AnimatorSet animatorSet2 = this.f40904a.f40854h;
                        if (!(animatorSet2 == null || (play5 = animatorSet2.play(ofFloat)) == null || (with9 = play5.with(ofFloat2)) == null || (with10 = with9.with(ofFloat9)) == null)) {
                            with10.before(ofFloat6);
                        }
                    } else if (i4 == 5) {
                        ofFloat10.setInterpolator(new C17168c());
                        ofFloat5.setInterpolator(new AccelerateDecelerateInterpolator());
                        AnimatorSet animatorSet3 = this.f40904a.f40854h;
                        if (!(animatorSet3 == null || (play6 = animatorSet3.play(ofFloat)) == null || (with11 = play6.with(ofFloat2)) == null || (with12 = with11.with(ofFloat10)) == null)) {
                            with12.before(ofFloat5);
                        }
                    } else if (i4 == 48) {
                        ofFloat8.setInterpolator(new C17168c());
                        ofFloat3.setInterpolator(new AccelerateDecelerateInterpolator());
                        AnimatorSet animatorSet4 = this.f40904a.f40854h;
                        if (!(animatorSet4 == null || (play7 = animatorSet4.play(ofFloat)) == null || (with13 = play7.with(ofFloat2)) == null || (with14 = with13.with(ofFloat8)) == null)) {
                            with14.before(ofFloat3);
                        }
                    } else if (i4 == 80) {
                        ofFloat7.setInterpolator(new C17168c());
                        ofFloat4.setInterpolator(new AccelerateDecelerateInterpolator());
                        AnimatorSet animatorSet5 = this.f40904a.f40854h;
                        if (!(animatorSet5 == null || (play8 = animatorSet5.play(ofFloat)) == null || (with15 = play8.with(ofFloat2)) == null || (with16 = with15.with(ofFloat7)) == null)) {
                            with16.before(ofFloat4);
                        }
                    }
                } else {
                    int i5 = this.f40904a.f40847a;
                    if (i5 == 3) {
                        ofFloat6.setInterpolator(new C17167b());
                        ofFloat9.setInterpolator(new AccelerateDecelerateInterpolator());
                        AnimatorSet animatorSet6 = this.f40904a.f40854h;
                        if (!(animatorSet6 == null || (play = animatorSet6.play(ofFloat)) == null || (with = play.with(ofFloat2)) == null || (with2 = with.with(ofFloat6)) == null)) {
                            with2.after(ofFloat9);
                        }
                    } else if (i5 == 5) {
                        ofFloat5.setInterpolator(new C17167b());
                        ofFloat10.setInterpolator(new AccelerateDecelerateInterpolator());
                        AnimatorSet animatorSet7 = this.f40904a.f40854h;
                        if (!(animatorSet7 == null || (play2 = animatorSet7.play(ofFloat)) == null || (with3 = play2.with(ofFloat2)) == null || (with4 = with3.with(ofFloat5)) == null)) {
                            with4.after(ofFloat10);
                        }
                    } else if (i5 == 48) {
                        ofFloat3.setInterpolator(new C17167b());
                        ofFloat8.setInterpolator(new AccelerateDecelerateInterpolator());
                        AnimatorSet animatorSet8 = this.f40904a.f40854h;
                        if (!(animatorSet8 == null || (play3 = animatorSet8.play(ofFloat)) == null || (with5 = play3.with(ofFloat2)) == null || (with6 = with5.with(ofFloat3)) == null)) {
                            with6.after(ofFloat8);
                        }
                    } else if (i5 == 80) {
                        ofFloat4.setInterpolator(new C17167b());
                        ofFloat7.setInterpolator(new AccelerateDecelerateInterpolator());
                        AnimatorSet animatorSet9 = this.f40904a.f40854h;
                        if (!(animatorSet9 == null || (play4 = animatorSet9.play(ofFloat)) == null || (with7 = play4.with(ofFloat2)) == null || (with8 = with7.with(ofFloat4)) == null)) {
                            with8.after(ofFloat7);
                        }
                    }
                }
                AnimatorSet animatorSet10 = this.f40904a.f40854h;
                if (animatorSet10 != null) {
                    animatorSet10.addListener(new AnimatorListenerAdapter(this) {
                        /* class com.bytedance.ies.dmt.p1194ui.p1196b.C17156b.RunnableC17162f.C171631 */

                        /* renamed from: a */
                        final /* synthetic */ RunnableC17162f f40907a;

                        static {
                            Covode.recordClassIndex(19620);
                        }

                        /* JADX WARN: Incorrect args count in method signature: ()V */
                        {
                            this.f40907a = r1;
                        }

                        public final void onAnimationEnd(Animator animator) {
                            C89219l.m154721d(animator, "");
                            super.onAnimationEnd(animator);
                            if (!this.f40907a.f40906c) {
                                this.f40907a.f40905b.setVisibility(8);
                                this.f40907a.f40904a.mo27107b();
                            }
                        }

                        public final void onAnimationStart(Animator animator) {
                            C89219l.m154721d(animator, "");
                            super.onAnimationStart(animator);
                            if (this.f40907a.f40906c) {
                                AbstractC17161e eVar = this.f40907a.f40904a.f40857k;
                                if (eVar != null) {
                                    eVar.mo27115a();
                                }
                                this.f40907a.f40905b.setVisibility(0);
                            }
                        }
                    });
                }
                if (this.f40904a.f40848b && (animatorSet = this.f40904a.f40854h) != null) {
                    animatorSet.setInterpolator(new OvershootInterpolator(1.0f));
                }
                AnimatorSet animatorSet11 = this.f40904a.f40854h;
                if (animatorSet11 != null) {
                    animatorSet11.start();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.dmt.ui.b.b$h */
    public static final class View$OnClickListenerC17165h implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C17156b f40909a;

        static {
            Covode.recordClassIndex(19622);
        }

        View$OnClickListenerC17165h(C17156b bVar) {
            this.f40909a = bVar;
        }

        public final void onClick(View view) {
            this.f40909a.dismiss();
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ C17154a m31685a(C17156b bVar) {
        C17154a aVar = bVar.f40853g;
        if (aVar == null) {
            C89219l.m154710a("mDmtBubbleLayout");
        }
        return aVar;
    }

    /* renamed from: a */
    private final void m31686a(View view) {
        C17154a aVar = new C17154a(this.f40855i);
        this.f40853g = aVar;
        aVar.setBackgroundColor(0);
        C17154a aVar2 = this.f40853g;
        if (aVar2 == null) {
            C89219l.m154710a("mDmtBubbleLayout");
        }
        aVar2.addView(view);
        C17154a aVar3 = this.f40853g;
        if (aVar3 == null) {
            C89219l.m154710a("mDmtBubbleLayout");
        }
        aVar3.setGravity(17);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        C17154a aVar4 = this.f40853g;
        if (aVar4 == null) {
            C89219l.m154710a("mDmtBubbleLayout");
        }
        aVar4.setLayoutParams(marginLayoutParams);
        C17154a aVar5 = this.f40853g;
        if (aVar5 == null) {
            C89219l.m154710a("mDmtBubbleLayout");
        }
        aVar5.setVisibility(8);
        if (this.f40862r != 0) {
            C17154a aVar6 = this.f40853g;
            if (aVar6 == null) {
                C89219l.m154710a("mDmtBubbleLayout");
            }
            aVar6.setMBgColor(this.f40862r);
        }
        C17154a aVar7 = this.f40853g;
        if (aVar7 == null) {
            C89219l.m154710a("mDmtBubbleLayout");
        }
        aVar7.setMNeedPath(this.f40864t);
        C17154a aVar8 = this.f40853g;
        if (aVar8 == null) {
            C89219l.m154710a("mDmtBubbleLayout");
        }
        aVar8.setMNeedArrow(this.f40833H);
        C17154a aVar9 = this.f40853g;
        if (aVar9 == null) {
            C89219l.m154710a("mDmtBubbleLayout");
        }
        aVar9.setMNeedPressFade(this.f40865u);
        C17154a aVar10 = this.f40853g;
        if (aVar10 == null) {
            C89219l.m154710a("mDmtBubbleLayout");
        }
        aVar10.setMNeedShadow(this.f40866v);
        C17154a aVar11 = this.f40853g;
        if (aVar11 == null) {
            C89219l.m154710a("mDmtBubbleLayout");
        }
        aVar11.setMShadowColor(this.f40867w);
        C17154a aVar12 = this.f40853g;
        if (aVar12 == null) {
            C89219l.m154710a("mDmtBubbleLayout");
        }
        aVar12.setOnClickListener(new View$OnClickListenerC17165h(this));
        C17154a aVar13 = this.f40853g;
        if (aVar13 == null) {
            C89219l.m154710a("mDmtBubbleLayout");
        }
        aVar13.setMTextViewMaxWidth(this.f40841P);
        C17154a aVar14 = this.f40853g;
        if (aVar14 == null) {
            C89219l.m154710a("mDmtBubbleLayout");
        }
        setContentView(aVar14);
        getContentView().measure(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    public C17156b(C17157a aVar) {
        View view;
        C89219l.m154721d(aVar, "");
        this.f40855i = aVar.f40877G;
        this.f40847a = aVar.f40878a;
        this.f40861q = aVar.f40879b;
        this.f40862r = aVar.f40880c;
        this.f40863s = aVar.f40881d;
        this.f40864t = aVar.f40882e;
        this.f40865u = aVar.f40883f;
        this.f40848b = aVar.f40884g;
        this.f40868x = aVar.f40885h;
        this.f40849c = aVar.f40886i;
        this.f40850d = aVar.f40887j;
        this.f40851e = aVar.f40888k;
        this.f40869y = aVar.f40889l;
        this.f40870z = aVar.f40890m;
        this.f40845T = aVar.f40891n;
        this.f40827B = aVar.f40893p;
        this.f40826A = aVar.f40892o;
        this.f40828C = aVar.f40894q;
        this.f40829D = aVar.f40895r;
        this.f40830E = aVar.f40896s;
        this.f40831F = aVar.f40898u;
        this.f40832G = aVar.f40897t;
        this.f40856j = aVar.f40899v;
        this.f40858l = aVar.f40900w;
        this.f40857k = aVar.f40901x;
        this.f40833H = aVar.f40902y;
        this.f40834I = aVar.f40903z;
        this.f40837L = aVar.f40871A;
        this.f40866v = aVar.f40872B;
        this.f40867w = aVar.f40873C;
        this.f40838M = aVar.f40874D;
        this.f40840O = aVar.f40875E;
        this.f40841P = aVar.f40876F;
        this.f40852f = (int) C13628n.m24520b(this.f40855i, 3.0f);
        setWidth(-2);
        setHeight(-2);
        setFocusable(false);
        setOutsideTouchable(this.f40837L);
        setClippingEnabled(false);
        setBackgroundDrawable(new ColorDrawable(0));
        setInputMethodMode(1);
        setSoftInputMode(16);
        if (this.f40870z || (view = this.f40845T) == null) {
            DmtTextView dmtTextView = new DmtTextView(this.f40855i);
            this.f40842Q = dmtTextView;
            if (this.f40831F != 0) {
                dmtTextView.setTextColor(this.f40831F);
            } else {
                dmtTextView.setTextColor(C0643b.m2378c(this.f40855i, R.color.a_));
            }
            TextView textView = this.f40842Q;
            if (textView == null) {
                C89219l.m154710a("mTextView");
            }
            textView.setTextSize(1, 13.0f);
            int i = Build.VERSION.SDK_INT;
            TextView textView2 = this.f40842Q;
            if (textView2 == null) {
                C89219l.m154710a("mTextView");
            }
            textView2.setTextAlignment(5);
            TextView textView3 = this.f40842Q;
            if (textView3 == null) {
                C89219l.m154710a("mTextView");
            }
            textView3.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            TextView textView4 = this.f40842Q;
            if (textView4 == null) {
                C89219l.m154710a("mTextView");
            }
            textView4.setGravity(17);
            TextView textView5 = this.f40842Q;
            if (textView5 == null) {
                C89219l.m154710a("mTextView");
            }
            textView5.setMaxWidth((int) C13628n.m24520b(this.f40855i, this.f40841P));
            TextView textView6 = this.f40842Q;
            if (textView6 == null) {
                C89219l.m154710a("mTextView");
            }
            textView6.setMaxLines(2);
            TextView textView7 = this.f40842Q;
            if (textView7 == null) {
                C89219l.m154710a("mTextView");
            }
            m31686a(textView7);
            this.f40868x = true;
            if (!TextUtils.isEmpty(this.f40828C)) {
                TextView textView8 = this.f40842Q;
                if (textView8 == null) {
                    C89219l.m154710a("mTextView");
                }
                textView8.setText(this.f40828C);
            }
            if (this.f40840O != null) {
                TextView textView9 = this.f40842Q;
                if (textView9 == null) {
                    C89219l.m154710a("mTextView");
                }
                textView9.setEllipsize(this.f40840O);
            }
            if (this.f40829D != 0) {
                TextView textView10 = this.f40842Q;
                if (textView10 == null) {
                    C89219l.m154710a("mTextView");
                }
                textView10.setText(this.f40829D);
            }
            if (this.f40830E != 0.0f) {
                TextView textView11 = this.f40842Q;
                if (textView11 == null) {
                    C89219l.m154710a("mTextView");
                }
                textView11.setTextSize(1, this.f40830E);
            }
            getContentView().measure(Integer.MIN_VALUE, Integer.MIN_VALUE);
        } else {
            m31686a(view);
            C17154a aVar2 = this.f40853g;
            if (aVar2 == null) {
                C89219l.m154710a("mDmtBubbleLayout");
            }
            aVar2.setUseDefaultView(false);
        }
        int i2 = this.f40826A;
        if (!(i2 == 0 || this.f40827B == 0)) {
            setWidth(i2);
            setHeight(this.f40827B);
            C17154a.f40796l = getWidth();
            C17154a.f40797m = getHeight();
        }
        if (this.f40868x) {
            int i3 = Build.VERSION.SDK_INT;
            int i4 = Build.VERSION.SDK_INT;
            View contentView = getContentView();
            C89219l.m154716b(contentView, "");
            contentView.setSystemUiVisibility(4102);
        }
        if (this.f40862r != 0) {
            C17154a aVar3 = this.f40853g;
            if (aVar3 == null) {
                C89219l.m154710a("mDmtBubbleLayout");
            }
            aVar3.setMBgColor(this.f40862r);
        }
        if (this.f40863s != 0) {
            C17154a aVar4 = this.f40853g;
            if (aVar4 == null) {
                C89219l.m154710a("mDmtBubbleLayout");
            }
            aVar4.setMBorderColor(this.f40863s);
        }
        if (!this.f40838M) {
            C17154a aVar5 = this.f40853g;
            if (aVar5 == null) {
                C89219l.m154710a("mDmtBubbleLayout");
            }
            aVar5.setNeedAddColor(false);
        }
        C17154a aVar6 = this.f40853g;
        if (aVar6 == null) {
            C89219l.m154710a("mDmtBubbleLayout");
        }
        aVar6.setMNeedPath(this.f40864t);
        C17154a aVar7 = this.f40853g;
        if (aVar7 == null) {
            C89219l.m154710a("mDmtBubbleLayout");
        }
        aVar7.setBubbleOrientation(m31684a(this.f40847a));
        if (this.f40834I != 0.0f) {
            C17154a aVar8 = this.f40853g;
            if (aVar8 == null) {
                C89219l.m154710a("mDmtBubbleLayout");
            }
            aVar8.setMPadding(this.f40834I);
        }
        this.f40846U = new RunnableC17164g(this);
    }

    /* renamed from: a */
    public final void mo27106a(boolean z) {
        C17154a aVar = this.f40853g;
        if (aVar == null) {
            C89219l.m154710a("mDmtBubbleLayout");
        }
        if (!z) {
            f40824n--;
            this.f40843R = true;
        }
        this.f40854h = new AnimatorSet();
        if (aVar != null) {
            aVar.post(new RunnableC17162f(this, aVar, z));
        }
    }

    /* renamed from: a */
    public final void mo27103a(View view, float f, int i) {
        this.f40849c = i;
        this.f40860p = f;
        mo27105a(view, 48, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0019, code lost:
        if (r3 == null) goto L_0x001b;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m31687b(android.view.View r9, int r10, boolean r11) {
        /*
        // Method dump skipped, instructions count: 240
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.dmt.p1194ui.p1196b.C17156b.m31687b(android.view.View, int, boolean):void");
    }

    /* renamed from: a */
    public final void mo27105a(View view, int i, boolean z) {
        if (!this.f40855i.isFinishing() && view != null && view.getWindowToken() != null) {
            this.f40835J = view.getMeasuredHeight();
            this.f40836K = view.getMeasuredWidth();
            getContentView().removeCallbacks(this.f40846U);
            this.f40847a = i;
            C17154a aVar = this.f40853g;
            if (aVar == null) {
                C89219l.m154710a("mDmtBubbleLayout");
            }
            this.f40844S = aVar.getPADDING();
            if (!isShowing()) {
                int a = m31684a(i);
                int i2 = this.f40826A;
                if (i2 == 0 || this.f40827B == 0) {
                    getContentView().measure(Integer.MIN_VALUE, Integer.MIN_VALUE);
                } else {
                    getContentView().measure(View.MeasureSpec.makeMeasureSpec(i2, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f40827B, 1073741824));
                }
                if (z) {
                    if (i == 80 || i == 48) {
                        this.f40860p = ((float) mo27109d()) / 2.0f;
                    } else {
                        this.f40860p = ((float) mo27108c()) / 2.0f;
                    }
                } else if (!this.f40839N) {
                    this.f40861q += (float) (this.f40844S * 8);
                    this.f40839N = true;
                }
                C17154a aVar2 = this.f40853g;
                if (aVar2 == null) {
                    C89219l.m154710a("mDmtBubbleLayout");
                }
                aVar2.mo27054a(a, this.f40860p + this.f40861q);
                m31687b(view, i, z);
                this.f40843R = false;
                if (this.f40869y > 0) {
                    getContentView().postDelayed(this.f40846U, this.f40869y);
                }
                f40824n++;
                return;
            }
            super.dismiss();
        }
    }

    public final void showAtLocation(View view, int i, int i2, int i3) {
        C89219l.m154721d(view, "");
        try {
            super.showAtLocation(view, i, i2, i3);
            mo27106a(true);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final void mo27104a(View view, int i, int i2, int i3, float f) {
        C89219l.m154721d(view, "");
        try {
            this.f40847a = i;
            this.f40861q = f;
            C17154a aVar = this.f40853g;
            if (aVar == null) {
                C89219l.m154710a("mDmtBubbleLayout");
            }
            aVar.mo27054a(m31684a(i), this.f40860p + this.f40861q);
            showAtLocation(view, 0, i2, i3);
            if (this.f40869y > 0) {
                getContentView().postDelayed(this.f40846U, this.f40869y);
            }
        } catch (Exception unused) {
        }
    }
}
