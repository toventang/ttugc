package com.p2082ss.android.ugc.aweme.notification.p3531i;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.C0643b;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.C17273d;
import com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p1194ui.widget.EnumC17270a;
import com.bytedance.ies.dmt.p1194ui.widget.MtEmptyView;
import com.bytedance.tux.status.TuxStatusView;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.C61631f;
import com.p2082ss.android.ugc.aweme.notification.p3520b.C61862a;
import com.p2082ss.android.ugc.aweme.notification.p3531i.C62208i;
import com.p2082ss.android.ugc.aweme.notification.p3535vm.NotificationVM;
import com.p2082ss.android.ugc.aweme.notification.utils.C62269l;
import com.p2082ss.android.ugc.aweme.qna.services.QnaService;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notification.i.h */
public final class C62197h extends C62208i.C62209a {

    /* renamed from: b */
    public static final C62198a f141202b = new C62198a((byte) 0);

    /* renamed from: a */
    public Animator f141203a;

    /* renamed from: d */
    private final AbstractC89244h f141204d = C61862a.m111996a(new C62205h(this));

    /* renamed from: e */
    private final AbstractC89244h f141205e = C61862a.m111996a(new C62207j(this));

    /* renamed from: f */
    private final AbstractC89244h f141206f = C61862a.m111996a(new C62201d(this));

    /* renamed from: g */
    private final AbstractC89244h f141207g = C61862a.m111996a(new C62206i(this));

    static {
        Covode.recordClassIndex(72951);
    }

    /* renamed from: m */
    private final int m112486m() {
        return ((Number) this.f141204d.getValue()).intValue();
    }

    /* renamed from: b */
    public final NotificationVM mo100195b() {
        return (NotificationVM) this.f141205e.getValue();
    }

    /* renamed from: h */
    public final DmtStatusView mo100196h() {
        return (DmtStatusView) this.f141206f.getValue();
    }

    /* renamed from: i */
    public final TuxStatusView mo100197i() {
        return (TuxStatusView) this.f141207g.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.i.h$a */
    public static final class C62198a {
        static {
            Covode.recordClassIndex(72952);
        }

        private C62198a() {
        }

        public /* synthetic */ C62198a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.i.h$d */
    static final class C62201d extends AbstractC89220m implements AbstractC89171a<DmtStatusView> {

        /* renamed from: a */
        final /* synthetic */ C62197h f141211a;

        static {
            Covode.recordClassIndex(72955);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C62201d(C62197h hVar) {
            super(0);
            this.f141211a = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ DmtStatusView invoke() {
            return this.f141211a.mo100205c(R.id.ed4);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.i.h$i */
    static final class C62206i extends AbstractC89220m implements AbstractC89171a<TuxStatusView> {

        /* renamed from: a */
        final /* synthetic */ C62197h f141216a;

        static {
            Covode.recordClassIndex(72960);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C62206i(C62197h hVar) {
            super(0);
            this.f141216a = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TuxStatusView invoke() {
            return this.f141216a.mo100205c(R.id.ed5);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.i.h$j */
    static final class C62207j extends AbstractC89220m implements AbstractC89171a<NotificationVM> {

        /* renamed from: a */
        final /* synthetic */ C62197h f141217a;

        static {
            Covode.recordClassIndex(72961);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C62207j(C62197h hVar) {
            super(0);
            this.f141217a = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ NotificationVM invoke() {
            return NotificationVM.C62378a.m112820a(this.f141217a.mo100206j());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.i.h$h */
    static final class C62205h extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        final /* synthetic */ C62197h f141215a;

        static {
            Covode.recordClassIndex(72959);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C62205h(C62197h hVar) {
            super(0);
            this.f141215a = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(this.f141215a.mo100208l().getResources().getDimensionPixelSize(R.dimen.a0s));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.notification.i.h$g */
    public static final class View$OnClickListenerC62204g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C62197h f141214a;

        static {
            Covode.recordClassIndex(72958);
        }

        View$OnClickListenerC62204g(C62197h hVar) {
            this.f141214a = hVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f141214a.mo100195b().mo100374k();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.i.h$b */
    static final class C62199b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C62197h f141208a;

        static {
            Covode.recordClassIndex(72953);
        }

        C62199b(C62197h hVar) {
            this.f141208a = hVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            TuxStatusView i = this.f141208a.mo100197i();
            C89219l.m154716b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            C62197h.m112485a(i, ((Integer) animatedValue).intValue());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.i.h$c */
    public static final class C62200c extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C62197h f141209a;

        /* renamed from: b */
        final /* synthetic */ boolean f141210b;

        static {
            Covode.recordClassIndex(72954);
        }

        public final void onAnimationCancel(Animator animator) {
            if (!this.f141210b) {
                this.f141209a.mo100197i().setVisibility(8);
            }
            this.f141209a.f141203a = null;
        }

        public final void onAnimationEnd(Animator animator) {
            if (!this.f141210b) {
                this.f141209a.mo100197i().setVisibility(8);
            }
            this.f141209a.f141203a = null;
        }

        public final void onAnimationStart(Animator animator) {
            if (this.f141210b) {
                this.f141209a.mo100197i().setVisibility(0);
                this.f141209a.mo100197i().mo37867a();
            }
        }

        C62200c(C62197h hVar, boolean z) {
            this.f141209a = hVar;
            this.f141210b = z;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.i.h$e */
    static final class C62202e<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C62197h f141212a;

        static {
            Covode.recordClassIndex(72956);
        }

        C62202e(C62197h hVar) {
            this.f141212a = hVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            C61631f f = this.f141212a.mo100195b().mo100347f();
            if (f != null) {
                this.f141212a.mo100193a(f.f139902d, f.f139903e, f.f139904f);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.notification.i.h$f */
    public static final class View$OnClickListenerC62203f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C62197h f141213a;

        static {
            Covode.recordClassIndex(72957);
        }

        View$OnClickListenerC62203f(C62197h hVar) {
            this.f141213a = hVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C62208i iVar = this.f141213a.f141220c;
            if (iVar == null) {
                C89219l.m154710a("fragment");
            }
            C89219l.m154721d(C62192f.class, "");
            C62208i.C62209a aVar = iVar.mo100204o().get(C62192f.class);
            if (aVar != null) {
                Objects.requireNonNull(aVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.widget.QnAWidget");
                ((C62192f) aVar).mo99842x();
                return;
            }
            throw new IllegalStateException("Cannot find widget: " + C62192f.class.getSimpleName());
        }
    }

    /* renamed from: a */
    public final void mo100194a(boolean z) {
        int i;
        int i2;
        Animator animator = this.f141203a;
        if (animator != null && animator.isRunning()) {
            animator.cancel();
        }
        if (z) {
            i = -m112486m();
            i2 = 0;
        } else {
            i = 0;
            i2 = -m112486m();
        }
        ValueAnimator ofInt = ObjectAnimator.ofInt(i, i2);
        m112485a(mo100197i(), i);
        ofInt.addUpdateListener(new C62199b(this));
        ofInt.addListener(new C62200c(this, z));
        C89219l.m154716b(ofInt, "");
        ofInt.setDuration(200L);
        ofInt.start();
        this.f141203a = ofInt;
    }

    /* renamed from: a */
    public static void m112485a(View view, int i) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = i;
        view.setLayoutParams(marginLayoutParams);
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.p3531i.C62208i.C62209a
    /* renamed from: a */
    public final void mo100174a(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.mo100174a(view, bundle);
        mo100193a(R.string.dia, R.string.dim, 2131231276);
        mo100195b().mo100344c().observe(mo100206j(), new C62202e(this));
    }

    /* renamed from: a */
    public final void mo100193a(int i, int i2, int i3) {
        ActivityC0945e l = mo100208l();
        C17273d.C17274a c = new C17273d.C17274a(l).mo27457a(i3).mo27462b(i).mo27464c(i2);
        C89219l.m154716b(c, "");
        if (i == R.string.cj && QnaService.m117969a().enablePublicQna()) {
            c.mo27459a(EnumC17270a.SOLID, R.string.ch, new View$OnClickListenerC62203f(this));
        }
        MtEmptyView a = MtEmptyView.m31926a(l);
        a.setStatus(c.f41365a);
        C89219l.m154716b(a, "");
        a.mo27428a(C0643b.m2378c(a.getContext(), R.color.bx), mo100206j().getResources().getDrawable(R.drawable.n_), (int) C13628n.m24520b(l, 30.0f), (int) C13628n.m24520b(l, 84.0f));
        C17273d dVar = new C17273d.C17274a(l).mo27462b(R.string.crk).mo27463b("").f41365a;
        DmtStatusView.C17269a a2 = DmtStatusView.C17269a.m31905a(l).mo27397a().mo27400a(2131233181, R.string.gzs, R.string.gzr, R.string.gzy, new View$OnClickListenerC62204g(this));
        if (!C62269l.m112652a()) {
            a2.mo27406b(a);
        } else {
            a2.mo27404a(dVar);
        }
        mo100196h().setBuilder(a2);
    }
}
