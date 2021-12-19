package com.bytedance.android.live.liveinteract.match.p311ui.view;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.C1764a;
import com.bytedance.android.live.core.p218f.C3941k;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.chatroom.p492g.C7577g;
import com.bytedance.android.livesdk.livesetting.linkmic.EnableBattleUiNewStyleSetting;
import com.bytedance.android.livesdk.model.message.p578b.C9646k;
import com.bytedance.android.livesdk.widget.VHeadView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.liveinteract.match.ui.view.BattleMvpContainerLayout */
public final class BattleMvpContainerLayout extends FrameLayout {

    /* renamed from: f */
    public static final boolean f13101f;

    /* renamed from: g */
    public static final C5042a f13102g = new C5042a((byte) 0);

    /* renamed from: a */
    public AbstractC89172b<? super Boolean, C89391z> f13103a;

    /* renamed from: b */
    public AnimatorSet f13104b;

    /* renamed from: c */
    public C5043b f13105c;

    /* renamed from: d */
    public final List<C5043b> f13106d;

    /* renamed from: e */
    public final List<C5043b> f13107e;

    /* renamed from: h */
    private ArrayList<Integer> f13108h;

    /* renamed from: i */
    private ArrayList<Integer> f13109i;

    /* renamed from: j */
    private final AbstractC89244h f13110j;

    /* renamed from: k */
    private HashMap f13111k;

    public BattleMvpContainerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* renamed from: a */
    private View m11261a(int i) {
        if (this.f13111k == null) {
            this.f13111k = new HashMap();
        }
        View view = (View) this.f13111k.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f13111k.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final HSImageView getMMvpImageView() {
        return (HSImageView) this.f13110j.getValue();
    }

    /* renamed from: com.bytedance.android.live.liveinteract.match.ui.view.BattleMvpContainerLayout$a */
    public static final class C5042a {
        static {
            Covode.recordClassIndex(5628);
        }

        private C5042a() {
        }

        public /* synthetic */ C5042a(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.match.ui.view.BattleMvpContainerLayout$j */
    static final class C5051j extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ BattleMvpContainerLayout f13131a;

        static {
            Covode.recordClassIndex(5637);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5051j(BattleMvpContainerLayout battleMvpContainerLayout) {
            super(0);
            this.f13131a = battleMvpContainerLayout;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            mo10777a();
            return C89391z.f203057a;
        }

        /* renamed from: a */
        public final void mo10777a() {
            AnimatorSet animatorSet = this.f13131a.f13104b;
            if (animatorSet != null && animatorSet.isRunning()) {
                AnimatorSet animatorSet2 = this.f13131a.f13104b;
                if (animatorSet2 != null) {
                    animatorSet2.removeAllListeners();
                }
                AnimatorSet animatorSet3 = this.f13131a.f13104b;
                if (animatorSet3 != null) {
                    animatorSet3.end();
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo10763b() {
        mo10762a(true, null);
    }

    /* renamed from: c */
    public final void mo10764c() {
        mo10762a(false, null);
    }

    /* renamed from: com.bytedance.android.live.liveinteract.match.ui.view.BattleMvpContainerLayout$c */
    static final class C5044c extends AbstractC89220m implements AbstractC89171a<HSImageView> {

        /* renamed from: a */
        final /* synthetic */ BattleMvpContainerLayout f13121a;

        static {
            Covode.recordClassIndex(5630);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5044c(BattleMvpContainerLayout battleMvpContainerLayout) {
            super(0);
            this.f13121a = battleMvpContainerLayout;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ HSImageView invoke() {
            return this.f13121a.findViewById(R.id.bt3);
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.match.ui.view.BattleMvpContainerLayout$i */
    static final class C5050i extends AbstractC89220m implements AbstractC89171a<AnimatorSet> {

        /* renamed from: a */
        final /* synthetic */ C5046e f13130a;

        static {
            Covode.recordClassIndex(5636);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5050i(C5046e eVar) {
            super(0);
            this.f13130a = eVar;
        }

        /* renamed from: a */
        public final AnimatorSet invoke() {
            return this.f13130a.mo10772a(0.8f, 1.0f, 160);
        }
    }

    static {
        Covode.recordClassIndex(5625);
        boolean z = false;
        if (EnableBattleUiNewStyleSetting.INSTANCE.getValue() > 0) {
            z = true;
        }
        f13101f = z;
    }

    /* renamed from: com.bytedance.android.live.liveinteract.match.ui.view.BattleMvpContainerLayout$g */
    static final class C5048g extends AbstractC89220m implements AbstractC89171a<AnimatorSet> {

        /* renamed from: a */
        final /* synthetic */ C5047f f13125a;

        /* renamed from: b */
        final /* synthetic */ C5046e f13126b;

        static {
            Covode.recordClassIndex(5634);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5048g(C5047f fVar, C5046e eVar) {
            super(0);
            this.f13125a = fVar;
            this.f13126b = eVar;
        }

        /* renamed from: a */
        public final AnimatorSet invoke() {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playSequentially(this.f13125a.mo10773a(0.0f, 0.0f, 0), this.f13126b.mo10772a(0.0f, 4.0f, 200), this.f13126b.mo10772a(4.0f, 3.0f, 160), this.f13126b.mo10772a(3.0f, 3.5f, 120), this.f13126b.mo10772a(3.5f, 3.5f, 360));
            return animatorSet;
        }
    }

    /* renamed from: a */
    public final void mo10761a() {
        MethodCollector.m26663i(4939);
        ((LinearLayout) m11261a(R.id.c4l)).removeAllViews();
        ((LinearLayout) m11261a(R.id.c5x)).removeAllViews();
        C5043b bVar = this.f13105c;
        if (bVar != null) {
            bVar.mo10770a(false);
        }
        this.f13105c = null;
        this.f13106d.clear();
        this.f13107e.clear();
        MethodCollector.m26664o(4939);
    }

    /* renamed from: com.bytedance.android.live.liveinteract.match.ui.view.BattleMvpContainerLayout$d */
    public static final class RunnableC5045d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ BattleMvpContainerLayout f13122a;

        static {
            Covode.recordClassIndex(5631);
        }

        public RunnableC5045d(BattleMvpContainerLayout battleMvpContainerLayout) {
            this.f13122a = battleMvpContainerLayout;
        }

        public final void run() {
            View view;
            C5043b bVar = this.f13122a.f13105c;
            if (bVar != null && (view = bVar.f13120g) != null && view.findViewById(R.id.c16) != null) {
                this.f13122a.getMMvpImageView().setVisibility(0);
                C3941k.m9607a(this.f13122a.getMMvpImageView(), "tiktok_live_interaction_resource", "ttlive_pk_army_mvp.png");
                BattleMvpContainerLayout battleMvpContainerLayout = this.f13122a;
                C5043b bVar2 = battleMvpContainerLayout.f13105c;
                if (bVar2 == null) {
                    C89219l.m154715b();
                }
                View findViewById = bVar2.f13120g.findViewById(R.id.c16);
                C89219l.m154716b(findViewById, "");
                C5046e eVar = new C5046e(battleMvpContainerLayout);
                C5047f fVar = new C5047f(battleMvpContainerLayout);
                C5048g gVar = new C5048g(fVar, eVar);
                C5049h hVar = new C5049h(battleMvpContainerLayout, fVar, eVar);
                C5050i iVar = new C5050i(eVar);
                new C5051j(battleMvpContainerLayout).mo10777a();
                battleMvpContainerLayout.f13104b = new AnimatorSet();
                AnimatorSet animatorSet = battleMvpContainerLayout.f13104b;
                if (animatorSet != null) {
                    animatorSet.playSequentially(gVar.invoke(), hVar.invoke(findViewById), iVar.invoke());
                }
                AnimatorSet animatorSet2 = battleMvpContainerLayout.f13104b;
                if (animatorSet2 != null) {
                    animatorSet2.start();
                }
                C5043b bVar3 = this.f13122a.f13105c;
                if (bVar3 != null) {
                    bVar3.mo10770a(true);
                }
            }
        }
    }

    public final void setClickCallback(AbstractC89172b<? super Boolean, C89391z> bVar) {
        C89219l.m154721d(bVar, "");
        this.f13103a = bVar;
    }

    /* renamed from: com.bytedance.android.live.liveinteract.match.ui.view.BattleMvpContainerLayout$b */
    public static final class C5043b {

        /* renamed from: a */
        public boolean f13114a;

        /* renamed from: b */
        public final VHeadView f13115b;

        /* renamed from: c */
        public final AppCompatImageView f13116c;

        /* renamed from: d */
        public final AppCompatImageView f13117d;

        /* renamed from: e */
        public final HSImageView f13118e;

        /* renamed from: f */
        public boolean f13119f;

        /* renamed from: g */
        public final View f13120g;

        static {
            Covode.recordClassIndex(5629);
        }

        public C5043b(View view) {
            C89219l.m154721d(view, "");
            this.f13120g = view;
            View findViewById = view.findViewById(R.id.c16);
            C89219l.m154716b(findViewById, "");
            this.f13115b = (VHeadView) findViewById;
            View findViewById2 = view.findViewById(R.id.c19);
            C89219l.m154716b(findViewById2, "");
            this.f13116c = (AppCompatImageView) findViewById2;
            View findViewById3 = view.findViewById(R.id.c17);
            C89219l.m154716b(findViewById3, "");
            this.f13117d = (AppCompatImageView) findViewById3;
            this.f13118e = (HSImageView) view.findViewById(R.id.c18);
        }

        /* renamed from: a */
        public final void mo10770a(boolean z) {
            int i;
            AppCompatImageView appCompatImageView = this.f13117d;
            int i2 = 8;
            if (z) {
                i = 8;
            } else {
                i = 0;
            }
            appCompatImageView.setVisibility(i);
            if (!BattleMvpContainerLayout.f13101f) {
                HSImageView hSImageView = this.f13118e;
                C89219l.m154716b(hSImageView, "");
                if (z) {
                    i2 = 0;
                }
                hSImageView.setVisibility(i2);
                C3941k.m9607a(this.f13118e, "tiktok_live_interaction_resource", "ttlive_pk_army_mvp.png");
            }
            this.f13119f = z;
        }

        /* renamed from: a */
        public final void mo10769a(C9646k kVar, int i, int i2) {
            C89219l.m154721d(kVar, "");
            int i3 = 0;
            if (C89219l.m154714a(kVar, C9646k.f23501e)) {
                this.f13114a = true;
                this.f13115b.setImageResource(2131234813);
            } else if (C89219l.m154714a(kVar, C9646k.f23502f)) {
                this.f13114a = true;
                this.f13115b.setImageResource(2131234814);
            } else {
                this.f13114a = false;
                C7577g.m15571a(this.f13115b, kVar.f23507d, this.f13115b.getWidth(), this.f13115b.getHeight(), 2131234441);
            }
            this.f13116c.setImageResource(i);
            AppCompatImageView appCompatImageView = this.f13117d;
            if (this.f13114a) {
                i3 = 8;
            }
            appCompatImageView.setVisibility(i3);
            this.f13117d.setImageResource(i2);
            if (this.f13119f) {
                this.f13117d.setVisibility(8);
            }
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.match.ui.view.BattleMvpContainerLayout$h */
    static final class C5049h extends AbstractC89220m implements AbstractC89172b<View, AnimatorSet> {

        /* renamed from: a */
        final /* synthetic */ BattleMvpContainerLayout f13127a;

        /* renamed from: b */
        final /* synthetic */ C5047f f13128b;

        /* renamed from: c */
        final /* synthetic */ C5046e f13129c;

        static {
            Covode.recordClassIndex(5635);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5049h(BattleMvpContainerLayout battleMvpContainerLayout, C5047f fVar, C5046e eVar) {
            super(1);
            this.f13127a = battleMvpContainerLayout;
            this.f13128b = fVar;
            this.f13129c = eVar;
        }

        /* renamed from: a */
        public final AnimatorSet invoke(View view) {
            boolean z;
            float d;
            C89219l.m154721d(view, "");
            int c = C3966y.m9664c();
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            float f = ((float) c) / 2.0f;
            if (((float) iArr[0]) < f) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                d = -(f - (((float) iArr[0]) + (((float) C3966y.m9667d(R.dimen.ra)) / 2.0f)));
            } else {
                d = f - (((float) (c - iArr[0])) - (((float) C3966y.m9667d(R.dimen.ra)) / 2.0f));
            }
            float bottom = ((float) view.getBottom()) - (((float) this.f13127a.getHeight()) / 2.0f);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(this.f13128b.mo10773a(d, bottom, 200), this.f13129c.mo10772a(3.5f, 0.8f, 200));
            return animatorSet;
        }
    }

    /* renamed from: a */
    public final void mo10762a(boolean z, List<C9646k> list) {
        int i;
        List<C5043b> list2;
        int i2;
        C9646k kVar;
        List d;
        MethodCollector.m26663i(4979);
        ArrayList arrayList = new ArrayList();
        if (!(list == null || (d = C89070n.m154571d((Iterable) list, 3)) == null)) {
            arrayList.addAll(d);
        }
        if (arrayList.size() < 3) {
            if (z) {
                kVar = C9646k.f23501e;
            } else {
                kVar = C9646k.f23502f;
            }
            arrayList.add(kVar);
        }
        if (z) {
            i = R.id.c4l;
        } else {
            i = R.id.c5x;
        }
        LinearLayout linearLayout = (LinearLayout) m11261a(i);
        if (z) {
            list2 = this.f13106d;
        } else {
            list2 = this.f13107e;
        }
        while (true) {
            C89219l.m154716b(linearLayout, "");
            i2 = 0;
            if (linearLayout.getChildCount() >= arrayList.size()) {
                break;
            }
            View a = C1764a.m5927a(LayoutInflater.from(getContext()), R.layout.bb1, linearLayout, false);
            C89219l.m154716b(a, "");
            if (z) {
                linearLayout.addView(a, 0);
            } else {
                linearLayout.addView(a);
            }
            list2.add(new C5043b(a));
        }
        for (Object obj : arrayList) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                C89070n.m154520a();
            }
            C5043b bVar = list2.get(i2);
            Integer num = this.f13108h.get(i2);
            C89219l.m154716b(num, "");
            int intValue = num.intValue();
            Integer num2 = this.f13109i.get(i2);
            C89219l.m154716b(num2, "");
            bVar.mo10769a((C9646k) obj, intValue, num2.intValue());
            i2 = i3;
        }
        MethodCollector.m26664o(4979);
    }

    private /* synthetic */ BattleMvpContainerLayout(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.liveinteract.match.ui.view.BattleMvpContainerLayout$e */
    public static final class C5046e extends AbstractC89220m implements AbstractC89187q<Float, Float, Long, AnimatorSet> {

        /* renamed from: a */
        final /* synthetic */ BattleMvpContainerLayout f13123a;

        static {
            Covode.recordClassIndex(5632);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5046e(BattleMvpContainerLayout battleMvpContainerLayout) {
            super(3);
            this.f13123a = battleMvpContainerLayout;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89187q
        public final /* synthetic */ AnimatorSet invoke(Float f, Float f2, Long l) {
            return mo10772a(f.floatValue(), f2.floatValue(), l.longValue());
        }

        /* renamed from: a */
        public final AnimatorSet mo10772a(float f, float f2, long j) {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.f13123a.getMMvpImageView(), "scaleX", f, f2), ObjectAnimator.ofFloat(this.f13123a.getMMvpImageView(), "scaleY", f, f2));
            animatorSet.setDuration(j);
            return animatorSet;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.liveinteract.match.ui.view.BattleMvpContainerLayout$f */
    public static final class C5047f extends AbstractC89220m implements AbstractC89187q<Float, Float, Long, AnimatorSet> {

        /* renamed from: a */
        final /* synthetic */ BattleMvpContainerLayout f13124a;

        static {
            Covode.recordClassIndex(5633);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5047f(BattleMvpContainerLayout battleMvpContainerLayout) {
            super(3);
            this.f13124a = battleMvpContainerLayout;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89187q
        public final /* synthetic */ AnimatorSet invoke(Float f, Float f2, Long l) {
            return mo10773a(f.floatValue(), f2.floatValue(), l.longValue());
        }

        /* renamed from: a */
        public final AnimatorSet mo10773a(float f, float f2, long j) {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.f13124a.getMMvpImageView(), "translationX", 0.0f, f), ObjectAnimator.ofFloat(this.f13124a.getMMvpImageView(), "translationY", 0.0f, f2));
            animatorSet.setDuration(j);
            return animatorSet;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private BattleMvpContainerLayout(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(5053);
        this.f13108h = C89070n.m154525d(2131234816, 2131234818, 2131234820);
        this.f13109i = C89070n.m154525d(2131234815, 2131234817, 2131234819);
        this.f13110j = C89250i.m154773a((AbstractC89171a) new C5044c(this));
        this.f13106d = new ArrayList();
        this.f13107e = new ArrayList();
        C1764a.m5927a(LayoutInflater.from(context), R.layout.bb0, this, true);
        ((LinearLayout) m11261a(R.id.c4l)).setOnClickListener(new View.OnClickListener(this) {
            /* class com.bytedance.android.live.liveinteract.match.p311ui.view.BattleMvpContainerLayout.View$OnClickListenerC50401 */

            /* renamed from: a */
            final /* synthetic */ BattleMvpContainerLayout f13112a;

            static {
                Covode.recordClassIndex(5626);
            }

            {
                this.f13112a = r1;
            }

            public final void onClick(View view) {
                AbstractC89172b<? super Boolean, C89391z> bVar = this.f13112a.f13103a;
                if (bVar != null) {
                    bVar.invoke(true);
                }
            }
        });
        ((LinearLayout) m11261a(R.id.c5x)).setOnClickListener(new View.OnClickListener(this) {
            /* class com.bytedance.android.live.liveinteract.match.p311ui.view.BattleMvpContainerLayout.View$OnClickListenerC50412 */

            /* renamed from: a */
            final /* synthetic */ BattleMvpContainerLayout f13113a;

            static {
                Covode.recordClassIndex(5627);
            }

            {
                this.f13113a = r1;
            }

            public final void onClick(View view) {
                AbstractC89172b<? super Boolean, C89391z> bVar = this.f13113a.f13103a;
                if (bVar != null) {
                    bVar.invoke(false);
                }
            }
        });
        MethodCollector.m26664o(5053);
    }
}
