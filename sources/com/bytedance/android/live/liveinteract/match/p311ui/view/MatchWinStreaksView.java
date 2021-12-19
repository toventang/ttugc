package com.bytedance.android.live.liveinteract.match.p311ui.view;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.liveinteract.match.p294a.C4939b;
import com.bytedance.android.livesdkapi.depend.model.live.p688a.C11695b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.liveinteract.match.ui.view.MatchWinStreaksView */
public final class MatchWinStreaksView extends LinearLayout {

    /* renamed from: d */
    public static final C5052a f13132d = new C5052a((byte) 0);

    /* renamed from: a */
    C11695b f13133a;

    /* renamed from: b */
    final TextView f13134b = ((TextView) findViewById(R.id.fix));

    /* renamed from: c */
    final TextView f13135c = ((TextView) findViewById(R.id.fiz));

    /* renamed from: e */
    private final TextView f13136e = ((TextView) findViewById(R.id.fiy));

    static {
        Covode.recordClassIndex(5638);
    }

    /* renamed from: com.bytedance.android.live.liveinteract.match.ui.view.MatchWinStreaksView$a */
    public static final class C5052a {
        static {
            Covode.recordClassIndex(5639);
        }

        private C5052a() {
        }

        public /* synthetic */ C5052a(byte b) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.liveinteract.match.ui.view.MatchWinStreaksView$e */
    public static final class C5056e extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        public static final C5056e f13146a = new C5056e();

        static {
            Covode.recordClassIndex(5643);
        }

        C5056e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* bridge */ /* synthetic */ C89391z invoke() {
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.match.ui.view.MatchWinStreaksView$f */
    static final class C5057f extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        public static final C5057f f13147a = new C5057f();

        static {
            Covode.recordClassIndex(5644);
        }

        C5057f() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            C3854a.m9453a(3, "MatchWinningStreaksIcon", "animation end");
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.match.ui.view.MatchWinStreaksView$g */
    static final class C5058g extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        public static final C5058g f13148a = new C5058g();

        static {
            Covode.recordClassIndex(5645);
        }

        C5058g() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            C3854a.m9453a(3, "MatchWinningStreaksIcon", "animation end");
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.liveinteract.match.ui.view.MatchWinStreaksView$d */
    public static final class C5055d extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ MatchWinStreaksView f13143a;

        /* renamed from: b */
        final /* synthetic */ C11695b f13144b;

        /* renamed from: c */
        final /* synthetic */ C11695b f13145c;

        static {
            Covode.recordClassIndex(5642);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5055d(MatchWinStreaksView matchWinStreaksView, C11695b bVar, C11695b bVar2) {
            super(0);
            this.f13143a = matchWinStreaksView;
            this.f13144b = bVar;
            this.f13145c = bVar2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            boolean z;
            if (this.f13144b.f27978c != this.f13145c.f27978c) {
                MatchWinStreaksView matchWinStreaksView = this.f13143a;
                C11695b bVar = this.f13145c;
                C3854a.m9453a(3, "MatchWinningStreaksIcon", "update count");
                C11695b bVar2 = matchWinStreaksView.f13133a;
                if (bVar2 == null) {
                    C89219l.m154715b();
                }
                if (bVar2.f27978c <= 99) {
                    z = true;
                } else {
                    z = false;
                }
                TextView textView = matchWinStreaksView.f13135c;
                C89219l.m154716b(textView, "");
                C11695b bVar3 = matchWinStreaksView.f13133a;
                if (bVar3 == null) {
                    C89219l.m154715b();
                }
                textView.setText(String.valueOf(bVar3.f27978c));
                C11695b bVar4 = matchWinStreaksView.f13133a;
                if (bVar4 == null) {
                    C89219l.m154715b();
                }
                matchWinStreaksView.mo10779b(bVar4, bVar);
                matchWinStreaksView.f13133a = bVar;
                matchWinStreaksView.setCountTv(bVar);
                if (!z) {
                    TextView textView2 = matchWinStreaksView.f13134b;
                    C89219l.m154716b(textView2, "");
                    textView2.setVisibility(0);
                    TextView textView3 = matchWinStreaksView.f13135c;
                    C89219l.m154716b(textView3, "");
                    textView3.setVisibility(8);
                } else if (bVar.f27977b == 1) {
                    TextView textView4 = matchWinStreaksView.f13135c;
                    C89219l.m154716b(textView4, "");
                    TextView textView5 = matchWinStreaksView.f13134b;
                    C89219l.m154716b(textView5, "");
                    C4939b.m11141a(textView4, textView5, C5057f.f13147a);
                } else {
                    TextView textView6 = matchWinStreaksView.f13135c;
                    C89219l.m154716b(textView6, "");
                    TextView textView7 = matchWinStreaksView.f13134b;
                    C89219l.m154716b(textView7, "");
                    C4939b.m11142b(textView6, textView7, C5058g.f13148a);
                }
            } else {
                C3854a.m9453a(3, "MatchWinningStreaksIcon", "counts haven't change");
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.match.ui.view.MatchWinStreaksView$b */
    public static final class C5053b implements Animator.AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ MatchWinStreaksView f13137a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89171a f13138b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89171a f13139c;

        static {
            Covode.recordClassIndex(5640);
        }

        public final void onAnimationCancel(Animator animator) {
            this.f13137a.setVisibility(8);
        }

        public final void onAnimationEnd(Animator animator) {
            this.f13137a.setVisibility(8);
        }

        public final void onAnimationRepeat(Animator animator) {
            this.f13137a.setVisibility(0);
        }

        public final void onAnimationStart(Animator animator) {
            this.f13137a.setVisibility(0);
        }

        C5053b(MatchWinStreaksView matchWinStreaksView, AbstractC89171a aVar, AbstractC89171a aVar2) {
            this.f13137a = matchWinStreaksView;
            this.f13138b = aVar;
            this.f13139c = aVar2;
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.match.ui.view.MatchWinStreaksView$c */
    public static final class C5054c implements Animator.AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ MatchWinStreaksView f13140a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89171a f13141b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89171a f13142c;

        static {
            Covode.recordClassIndex(5641);
        }

        public final void onAnimationCancel(Animator animator) {
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        public final void onAnimationEnd(Animator animator) {
            AbstractC89171a aVar = this.f13142c;
            if (aVar != null) {
                aVar.invoke();
            }
        }

        public final void onAnimationStart(Animator animator) {
            AbstractC89171a aVar = this.f13141b;
            if (aVar != null) {
                aVar.invoke();
            }
        }

        C5054c(MatchWinStreaksView matchWinStreaksView, AbstractC89171a aVar, AbstractC89171a aVar2) {
            this.f13140a = matchWinStreaksView;
            this.f13141b = aVar;
            this.f13142c = aVar2;
        }
    }

    /* access modifiers changed from: package-private */
    public final void setCountTv(C11695b bVar) {
        if (bVar.f27978c > 99) {
            TextView textView = this.f13134b;
            C89219l.m154716b(textView, "");
            textView.setText("99+");
            return;
        }
        TextView textView2 = this.f13134b;
        C89219l.m154716b(textView2, "");
        textView2.setText(String.valueOf(bVar.f27978c));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo10779b(C11695b bVar, C11695b bVar2) {
        long j;
        String str;
        if (bVar.f27978c > bVar2.f27978c) {
            j = bVar.f27978c;
        } else {
            j = bVar2.f27978c;
        }
        TextView textView = this.f13136e;
        C89219l.m154716b(textView, "");
        if (j > 99) {
            str = "99+";
        } else if (j > 9) {
            str = "99";
        } else {
            str = "9";
        }
        textView.setText(str);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MatchWinStreaksView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(4719);
        LayoutInflater.from(context).inflate(R.layout.bbo, this);
        setOrientation(0);
        setGravity(17);
        MethodCollector.m26664o(4719);
    }

    /* renamed from: a */
    public final void mo10778a(C11695b bVar, C11695b bVar2) {
        if (bVar == null || bVar2 == null) {
            setVisibility(8);
            return;
        }
        C3854a.m9453a(3, "MatchWinningStreaksIcon", "set data " + bVar.f27977b);
        if (bVar2.f27977b == 0) {
            setVisibility(8);
            return;
        }
        setAlpha(1.0f);
        this.f13133a = bVar;
        setCountTv(bVar);
        mo10779b(bVar, new C11695b((byte) 0));
        if (bVar2.f27977b == 1) {
            setBackgroundResource(2131234905);
        } else if (bVar2.f27977b == 2) {
            setBackgroundResource(2131234904);
        }
        C5055d dVar = new C5055d(this, bVar, bVar2);
        C5056e eVar = C5056e.f13146a;
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.addListener(new C5053b(this, dVar, eVar));
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, View.SCALE_X, 0.0f, 1.2f, 1.0f);
        ofFloat.setDuration(480L);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, View.SCALE_Y, 0.0f, 1.2f, 1.0f);
        ofFloat2.setDuration(480L);
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 100.0f);
        ofFloat3.setDuration(2920L);
        ofFloat3.addListener(new C5054c(this, dVar, eVar));
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this, View.ALPHA, 1.0f, 0.0f);
        ofFloat4.setDuration(400L);
        animatorSet.play(ofFloat).with(ofFloat2);
        animatorSet.play(ofFloat).before(ofFloat3);
        animatorSet.play(ofFloat3).before(ofFloat4);
        animatorSet.start();
    }
}
