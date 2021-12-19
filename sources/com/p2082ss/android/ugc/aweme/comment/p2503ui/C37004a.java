package com.p2082ss.android.ugc.aweme.comment.p2503ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.loader.SmartImageView;
import com.p2082ss.android.ugc.aweme.views.mention.MentionEditText;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.ss.android.ugc.aweme.comment.ui.a */
public final class C37004a {

    /* renamed from: b */
    public static final C37006b f87160b = new C37006b((byte) 0);

    /* renamed from: a */
    public final View f87161a;

    /* renamed from: c */
    private final MentionEditText f87162c;

    /* renamed from: d */
    private final ImageView f87163d;

    /* renamed from: e */
    private final ImageView f87164e;

    /* renamed from: f */
    private final SmartImageView f87165f;

    /* renamed from: g */
    private final LinearLayout f87166g;

    /* renamed from: com.ss.android.ugc.aweme.comment.ui.a$a  reason: invalid class name */
    public static final class animationInterpolatorC37005a implements Interpolator {
        static {
            Covode.recordClassIndex(44359);
        }

        public final float getInterpolation(float f) {
            if (f == 0.0f) {
                return 0.0f;
            }
            return f <= 0.72f ? (f / 0.72f) * 1.14f : f <= 0.88f ? (((0.88f - f) / 0.16f) * 0.20999998f) + 0.93f : 1.0f - (((1.0f - f) / 0.12f) * 0.06999999f);
        }
    }

    static {
        Covode.recordClassIndex(44358);
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.ui.a$b */
    public static final class C37006b {
        static {
            Covode.recordClassIndex(44360);
        }

        private C37006b() {
        }

        public /* synthetic */ C37006b(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo64516a() {
        this.f87162c.setVisibility(8);
        this.f87166g.setVisibility(8);
        this.f87163d.setVisibility(8);
        this.f87164e.setVisibility(8);
        this.f87165f.setVisibility(8);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.comment.ui.a$c */
    public static final class C37007c implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C37004a f87167a;

        /* renamed from: b */
        final /* synthetic */ ViewGroup.MarginLayoutParams f87168b;

        static {
            Covode.recordClassIndex(44361);
        }

        C37007c(C37004a aVar, ViewGroup.MarginLayoutParams marginLayoutParams) {
            this.f87167a = aVar;
            this.f87168b = marginLayoutParams;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ViewGroup.MarginLayoutParams marginLayoutParams = this.f87168b;
            C89219l.m154716b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            marginLayoutParams.setMarginEnd(((Integer) animatedValue).intValue());
            this.f87167a.f87161a.setLayoutParams(this.f87168b);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.comment.ui.a$d */
    public static final class C37008d implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C37004a f87169a;

        /* renamed from: b */
        final /* synthetic */ ViewGroup.MarginLayoutParams f87170b;

        static {
            Covode.recordClassIndex(44362);
        }

        C37008d(C37004a aVar, ViewGroup.MarginLayoutParams marginLayoutParams) {
            this.f87169a = aVar;
            this.f87170b = marginLayoutParams;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ViewGroup.MarginLayoutParams marginLayoutParams = this.f87170b;
            C89219l.m154716b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            marginLayoutParams.setMarginStart(((Integer) animatedValue).intValue());
            this.f87169a.f87161a.setLayoutParams(this.f87170b);
        }
    }

    public C37004a(ConstraintLayout constraintLayout) {
        C89219l.m154721d(constraintLayout, "");
        View findViewById = constraintLayout.findViewById(R.id.a9f);
        C89219l.m154716b(findViewById, "");
        this.f87162c = (MentionEditText) findViewById;
        View findViewById2 = constraintLayout.findViewById(R.id.a_a);
        C89219l.m154716b(findViewById2, "");
        this.f87163d = (ImageView) findViewById2;
        View findViewById3 = constraintLayout.findViewById(R.id.dih);
        C89219l.m154716b(findViewById3, "");
        this.f87164e = (ImageView) findViewById3;
        View findViewById4 = constraintLayout.findViewById(R.id.a94);
        C89219l.m154716b(findViewById4, "");
        this.f87165f = (SmartImageView) findViewById4;
        View findViewById5 = constraintLayout.findViewById(R.id.bhp);
        C89219l.m154716b(findViewById5, "");
        this.f87166g = (LinearLayout) findViewById5;
        View findViewById6 = constraintLayout.findViewById(R.id.c3x);
        C89219l.m154716b(findViewById6, "");
        this.f87161a = findViewById6;
    }

    /* renamed from: a */
    public final void mo64517a(boolean z, int i) {
        ValueAnimator ofInt;
        ViewGroup.LayoutParams layoutParams = this.f87161a.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (i == 0) {
            Resources system = Resources.getSystem();
            C89219l.m154709a((Object) system, "");
            marginLayoutParams.setMarginStart(C89241a.m154730a(TypedValue.applyDimension(1, 12.0f, system.getDisplayMetrics())));
            this.f87161a.setLayoutParams(marginLayoutParams);
        } else if (i == 2) {
            if (z) {
                Resources system2 = Resources.getSystem();
                C89219l.m154709a((Object) system2, "");
                Resources system3 = Resources.getSystem();
                C89219l.m154709a((Object) system3, "");
                ofInt = ValueAnimator.ofInt(C89241a.m154730a(TypedValue.applyDimension(1, 114.0f, system2.getDisplayMetrics())), C89241a.m154730a(TypedValue.applyDimension(1, 52.0f, system3.getDisplayMetrics())));
                C89219l.m154716b(ofInt, "");
            } else {
                Resources system4 = Resources.getSystem();
                C89219l.m154709a((Object) system4, "");
                Resources system5 = Resources.getSystem();
                C89219l.m154709a((Object) system5, "");
                ofInt = ValueAnimator.ofInt(C89241a.m154730a(TypedValue.applyDimension(1, 52.0f, system4.getDisplayMetrics())), C89241a.m154730a(TypedValue.applyDimension(1, 114.0f, system5.getDisplayMetrics())));
                C89219l.m154716b(ofInt, "");
            }
            ofInt.addUpdateListener(new C37008d(this, marginLayoutParams));
            ofInt.setDuration(300L).start();
        }
    }

    /* renamed from: b */
    public final void mo64519b(boolean z, boolean z2, boolean z3) {
        int a;
        int[] iArr;
        float applyDimension;
        int a2;
        int a3;
        ViewGroup.LayoutParams layoutParams = this.f87161a.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (z3) {
            if (z) {
                iArr = new int[2];
                if (z2) {
                    Resources system = Resources.getSystem();
                    C89219l.m154709a((Object) system, "");
                    a3 = C89241a.m154730a(TypedValue.applyDimension(1, 14.0f, system.getDisplayMetrics()));
                } else {
                    Resources system2 = Resources.getSystem();
                    C89219l.m154709a((Object) system2, "");
                    a3 = C89241a.m154730a(TypedValue.applyDimension(1, 12.0f, system2.getDisplayMetrics()));
                }
                iArr[0] = a3;
                Resources system3 = Resources.getSystem();
                C89219l.m154709a((Object) system3, "");
                a2 = C89241a.m154730a(TypedValue.applyDimension(1, 52.0f, system3.getDisplayMetrics()));
            } else {
                iArr = new int[2];
                Resources system4 = Resources.getSystem();
                C89219l.m154709a((Object) system4, "");
                iArr[0] = C89241a.m154730a(TypedValue.applyDimension(1, 52.0f, system4.getDisplayMetrics()));
                if (z2) {
                    Resources system5 = Resources.getSystem();
                    C89219l.m154709a((Object) system5, "");
                    applyDimension = TypedValue.applyDimension(1, 14.0f, system5.getDisplayMetrics());
                } else {
                    Resources system6 = Resources.getSystem();
                    C89219l.m154709a((Object) system6, "");
                    applyDimension = TypedValue.applyDimension(1, 12.0f, system6.getDisplayMetrics());
                }
                a2 = C89241a.m154730a(applyDimension);
            }
            iArr[1] = a2;
            ValueAnimator ofInt = ValueAnimator.ofInt(iArr);
            C89219l.m154716b(ofInt, "");
            ofInt.addUpdateListener(new C37007c(this, marginLayoutParams));
            ofInt.setDuration(200L).start();
            return;
        }
        if (z) {
            Resources system7 = Resources.getSystem();
            C89219l.m154709a((Object) system7, "");
            a = C89241a.m154730a(TypedValue.applyDimension(1, 52.0f, system7.getDisplayMetrics()));
        } else if (z2) {
            Resources system8 = Resources.getSystem();
            C89219l.m154709a((Object) system8, "");
            a = C89241a.m154730a(TypedValue.applyDimension(1, 14.0f, system8.getDisplayMetrics()));
        } else {
            Resources system9 = Resources.getSystem();
            C89219l.m154709a((Object) system9, "");
            a = C89241a.m154730a(TypedValue.applyDimension(1, 12.0f, system9.getDisplayMetrics()));
        }
        marginLayoutParams.setMarginEnd(a);
        this.f87161a.setLayoutParams(marginLayoutParams);
    }

    /* renamed from: a */
    public final void mo64518a(boolean z, boolean z2, boolean z3) {
        if (z) {
            this.f87163d.setVisibility(0);
            mo64519b(true, z3, z2);
            if (z2) {
                ObjectAnimator duration = ObjectAnimator.ofFloat(this.f87163d, View.SCALE_X, 0.0f, this.f87163d.getScaleX()).setDuration(250L);
                C89219l.m154716b(duration, "");
                ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.f87163d, View.SCALE_Y, 0.0f, this.f87163d.getScaleY()).setDuration(250L);
                C89219l.m154716b(duration2, "");
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setInterpolator(new animationInterpolatorC37005a());
                animatorSet.playTogether(duration, duration2);
                animatorSet.start();
            }
            this.f87162c.setHint("");
            this.f87162c.setMaxLines(4);
            return;
        }
        this.f87163d.setVisibility(8);
        mo64519b(false, z3, z2);
        this.f87162c.setMaxLines(1);
        this.f87162c.setEllipsize(TextUtils.TruncateAt.END);
    }
}
