package com.p2082ss.android.ugc.aweme.notification.view.template;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.p1706a.p1707a.C22971a;
import com.p2082ss.android.ugc.aweme.notification.p3529h.p3530a.AbstractC62027a;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notification.view.template.NoticeTemplateBottomView */
public final class NoticeTemplateBottomView extends FrameLayout implements AbstractC62327b {

    /* renamed from: a */
    public AbstractC62027a f141423a;

    /* renamed from: b */
    public AbstractC62323a f141424b;

    /* renamed from: c */
    private final AbstractC89244h f141425c;

    /* renamed from: d */
    private SparseArray f141426d;

    static {
        Covode.recordClassIndex(73091);
    }

    public NoticeTemplateBottomView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* renamed from: a */
    private View m112711a(int i) {
        if (this.f141426d == null) {
            this.f141426d = new SparseArray();
        }
        View view = (View) this.f141426d.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f141426d.put(i, findViewById);
        return findViewById;
    }

    private final AnimatorSet getAnimatorSet() {
        return (AnimatorSet) this.f141425c.getValue();
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.view.template.NoticeTemplateBottomView$a */
    static final class C62310a extends AbstractC89220m implements AbstractC89171a<AnimatorSet> {

        /* renamed from: a */
        public static final C62310a f141427a = new C62310a();

        static {
            Covode.recordClassIndex(73092);
        }

        C62310a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AnimatorSet invoke() {
            return new AnimatorSet();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.view.template.AbstractC62327b
    /* renamed from: a */
    public final void mo100299a() {
        AbstractC62027a aVar = this.f141423a;
        if (aVar != null) {
            aVar.mo100098r();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.view.template.AbstractC62327b
    public final NoticeTemplateBottomButton getNegativeButton() {
        NoticeTemplateBottomButton noticeTemplateBottomButton = (NoticeTemplateBottomButton) m112711a(R.id.crd);
        C89219l.m154716b(noticeTemplateBottomButton, "");
        return noticeTemplateBottomButton;
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.view.template.AbstractC62327b
    public final NoticeTemplateBottomButton getPositiveButton() {
        NoticeTemplateBottomButton noticeTemplateBottomButton = (NoticeTemplateBottomButton) m112711a(R.id.d4u);
        C89219l.m154716b(noticeTemplateBottomButton, "");
        return noticeTemplateBottomButton;
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.view.template.AbstractC62327b
    /* renamed from: b */
    public final void mo100300b() {
        if (!getAnimatorSet().isRunning()) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "alpha", getAlpha(), 0.0f);
            C89219l.m154716b(ofFloat, "");
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(new LinearInterpolator());
            ValueAnimator ofInt = ValueAnimator.ofInt(getHeight(), 0);
            C89219l.m154716b(ofInt, "");
            ofInt.setInterpolator(C22971a.m43306b());
            ofInt.setDuration(250L);
            ofInt.addUpdateListener(new C62311b(this));
            getAnimatorSet().play(ofInt).with(ofFloat);
            getAnimatorSet().start();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.view.template.NoticeTemplateBottomView$b */
    static final class C62311b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ NoticeTemplateBottomView f141428a;

        static {
            Covode.recordClassIndex(73093);
        }

        C62311b(NoticeTemplateBottomView noticeTemplateBottomView) {
            this.f141428a = noticeTemplateBottomView;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            NoticeTemplateBottomView noticeTemplateBottomView = this.f141428a;
            ViewGroup.LayoutParams layoutParams = noticeTemplateBottomView.getLayoutParams();
            C89219l.m154716b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            layoutParams.height = ((Integer) animatedValue).intValue();
            noticeTemplateBottomView.setLayoutParams(layoutParams);
        }
    }

    private /* synthetic */ NoticeTemplateBottomView(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private NoticeTemplateBottomView(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(2630);
        this.f141425c = C89250i.m154773a((AbstractC89171a) C62310a.f141427a);
        C1764a.m5927a(LayoutInflater.from(context), R.layout.l5, this, true);
        MethodCollector.m26664o(2630);
    }
}
