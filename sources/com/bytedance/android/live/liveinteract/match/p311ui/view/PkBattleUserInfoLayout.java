package com.bytedance.android.live.liveinteract.match.p311ui.view;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.C1764a;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.livesdk.livesetting.linkmic.EnableBattleUiNewStyleSetting;
import com.bytedance.android.livesdk.widget.VHeadView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Objects;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.liveinteract.match.ui.view.PkBattleUserInfoLayout */
public final class PkBattleUserInfoLayout extends FrameLayout {

    /* renamed from: c */
    public static final C5067a f13185c = new C5067a((byte) 0);

    /* renamed from: a */
    public AnimatorSet f13186a;

    /* renamed from: b */
    public final boolean f13187b;

    /* renamed from: d */
    private HashMap f13188d;

    static {
        Covode.recordClassIndex(5656);
    }

    public PkBattleUserInfoLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* renamed from: a */
    public final View mo10808a(int i) {
        if (this.f13188d == null) {
            this.f13188d = new HashMap();
        }
        View view = (View) this.f13188d.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f13188d.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: com.bytedance.android.live.liveinteract.match.ui.view.PkBattleUserInfoLayout$a */
    public static final class C5067a {
        static {
            Covode.recordClassIndex(5657);
        }

        private C5067a() {
        }

        public /* synthetic */ C5067a(byte b) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo10809a();
    }

    /* renamed from: a */
    public final void mo10809a() {
        AnimatorSet animatorSet = this.f13186a;
        if (animatorSet != null && animatorSet.isRunning()) {
            AnimatorSet animatorSet2 = this.f13186a;
            if (animatorSet2 != null) {
                animatorSet2.removeAllListeners();
            }
            AnimatorSet animatorSet3 = this.f13186a;
            if (animatorSet3 != null) {
                animatorSet3.end();
            }
            this.f13186a = null;
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.match.ui.view.PkBattleUserInfoLayout$b */
    public static final class C5068b extends AbstractC89220m implements AbstractC89172b<ConstraintLayout, C89391z> {

        /* renamed from: a */
        final /* synthetic */ PkBattleUserInfoLayout f13189a;

        static {
            Covode.recordClassIndex(5658);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5068b(PkBattleUserInfoLayout pkBattleUserInfoLayout) {
            super(1);
            this.f13189a = pkBattleUserInfoLayout;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(ConstraintLayout constraintLayout) {
            mo10811a(constraintLayout);
            return C89391z.f203057a;
        }

        /* renamed from: a */
        public final void mo10811a(ConstraintLayout constraintLayout) {
            float f;
            int i;
            C89219l.m154721d(constraintLayout, "");
            if (this.f13189a.f13187b) {
                f = 152.0f;
                int id = constraintLayout.getId();
                ConstraintLayout constraintLayout2 = (ConstraintLayout) this.f13189a.mo10808a(R.id.c4k);
                C89219l.m154716b(constraintLayout2, "");
                if (id == constraintLayout2.getId()) {
                    i = 2131234132;
                } else {
                    i = 2131234130;
                }
            } else {
                f = 130.0f;
                int id2 = constraintLayout.getId();
                ConstraintLayout constraintLayout3 = (ConstraintLayout) this.f13189a.mo10808a(R.id.c4k);
                C89219l.m154716b(constraintLayout3, "");
                if (id2 == constraintLayout3.getId()) {
                    i = 2131234131;
                } else {
                    i = 2131234129;
                }
            }
            ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
            layoutParams.width = C3966y.m9653a(f);
            constraintLayout.setLayoutParams(layoutParams);
            constraintLayout.setBackgroundResource(i);
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.match.ui.view.PkBattleUserInfoLayout$c */
    public static final class C5069c extends AbstractC89220m implements AbstractC89172b<LiveTextView, C89391z> {

        /* renamed from: a */
        final /* synthetic */ PkBattleUserInfoLayout f13190a;

        static {
            Covode.recordClassIndex(5659);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5069c(PkBattleUserInfoLayout pkBattleUserInfoLayout) {
            super(1);
            this.f13190a = pkBattleUserInfoLayout;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(LiveTextView liveTextView) {
            mo10812a(liveTextView);
            return C89391z.f203057a;
        }

        /* renamed from: a */
        public final void mo10812a(LiveTextView liveTextView) {
            float f;
            C89219l.m154721d(liveTextView, "");
            if (this.f13190a.f13187b) {
                f = 12.0f;
            } else {
                f = 4.0f;
            }
            ViewGroup.LayoutParams layoutParams = liveTextView.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.C0547a aVar = (ConstraintLayout.C0547a) layoutParams;
            int id = liveTextView.getId();
            LiveTextView liveTextView2 = (LiveTextView) this.f13190a.mo10808a(R.id.eyb);
            C89219l.m154716b(liveTextView2, "");
            if (id == liveTextView2.getId()) {
                aVar.rightMargin = C3966y.m9653a(f);
            } else {
                aVar.leftMargin = C3966y.m9653a(f);
            }
            liveTextView.setLayoutParams(aVar);
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.match.ui.view.PkBattleUserInfoLayout$d */
    public static final class C5070d extends AbstractC89220m implements AbstractC89172b<VHeadView, C89391z> {

        /* renamed from: a */
        final /* synthetic */ PkBattleUserInfoLayout f13191a;

        static {
            Covode.recordClassIndex(5660);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5070d(PkBattleUserInfoLayout pkBattleUserInfoLayout) {
            super(1);
            this.f13191a = pkBattleUserInfoLayout;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(VHeadView vHeadView) {
            mo10813a(vHeadView);
            return C89391z.f203057a;
        }

        /* renamed from: a */
        public final void mo10813a(VHeadView vHeadView) {
            float f;
            C89219l.m154721d(vHeadView, "");
            if (this.f13191a.f13187b) {
                f = 28.0f;
            } else {
                f = 8.0f;
            }
            ViewGroup.LayoutParams layoutParams = vHeadView.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.C0547a aVar = (ConstraintLayout.C0547a) layoutParams;
            int id = vHeadView.getId();
            VHeadView vHeadView2 = (VHeadView) this.f13191a.mo10808a(R.id.bx5);
            C89219l.m154716b(vHeadView2, "");
            if (id == vHeadView2.getId()) {
                aVar.rightMargin = C3966y.m9653a(f);
            } else {
                aVar.leftMargin = C3966y.m9653a(f);
            }
            vHeadView.setLayoutParams(aVar);
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.match.ui.view.PkBattleUserInfoLayout$e */
    public static final class C5071e implements Animator.AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC89171a f13192a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89171a f13193b;

        static {
            Covode.recordClassIndex(5661);
        }

        public final void onAnimationCancel(Animator animator) {
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        public final void onAnimationEnd(Animator animator) {
            AbstractC89171a aVar = this.f13192a;
            if (aVar != null) {
                aVar.invoke();
            }
        }

        public final void onAnimationStart(Animator animator) {
            AbstractC89171a aVar = this.f13193b;
            if (aVar != null) {
                aVar.invoke();
            }
        }

        public C5071e(AbstractC89171a aVar, AbstractC89171a aVar2) {
            this.f13192a = aVar;
            this.f13193b = aVar2;
        }
    }

    private /* synthetic */ PkBattleUserInfoLayout(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private PkBattleUserInfoLayout(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        boolean z = false;
        MethodCollector.m26663i(5433);
        this.f13187b = EnableBattleUiNewStyleSetting.INSTANCE.getValue() > 0 ? true : z;
        C1764a.m5927a(LayoutInflater.from(context), R.layout.bb2, this, true);
        MethodCollector.m26664o(5433);
    }
}
