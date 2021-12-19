package com.p2082ss.android.ugc.aweme.discover.helper;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.p060l.AbstractC1089aj;
import androidx.p060l.AbstractC1134m;
import androidx.p060l.C1098c;
import androidx.p060l.C1110d;
import androidx.p060l.C1142o;
import androidx.p060l.C1146q;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.p1722h.C23163i;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.discover.p2771f.C41939a;
import com.p2082ss.android.ugc.aweme.shortvideo.animationInterpolatorC69832aj;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.helper.u */
public final class C42052u extends AbstractC41997b {

    /* renamed from: d */
    public boolean f98035d;

    /* renamed from: e */
    public boolean f98036e = true;

    /* renamed from: f */
    public boolean f98037f;

    /* renamed from: g */
    public boolean f98038g;

    /* renamed from: h */
    public final List<AbstractC42053a> f98039h = new ArrayList();

    /* renamed from: i */
    public View f98040i;

    /* renamed from: j */
    private final int f98041j = C34728n.m70946a(16.0d);

    /* renamed from: k */
    private final ViewGroup f98042k;

    /* renamed from: l */
    private final View f98043l;

    /* renamed from: m */
    private final View f98044m;

    /* renamed from: n */
    private final ImageView f98045n;

    /* renamed from: o */
    private final View f98046o;

    /* renamed from: p */
    private final View f98047p;

    /* renamed from: com.ss.android.ugc.aweme.discover.helper.u$a */
    public interface AbstractC42053a {
        static {
            Covode.recordClassIndex(49983);
        }

        /* renamed from: a */
        void mo71222a(boolean z);

        /* renamed from: b */
        void mo71223b(boolean z);
    }

    static {
        Covode.recordClassIndex(49982);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.discover.helper.AbstractC41997b
    /* renamed from: a */
    public final void mo71168a(Animator animator) {
        C89219l.m154721d(animator, "");
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.discover.helper.AbstractC41997b
    /* renamed from: a */
    public final void mo71169a(ValueAnimator valueAnimator) {
        C89219l.m154721d(valueAnimator, "");
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.discover.helper.AbstractC41997b
    /* renamed from: b */
    public final void mo71172b(Animator animator) {
        C89219l.m154721d(animator, "");
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.discover.helper.AbstractC41997b
    /* renamed from: b */
    public final void mo71173b(ValueAnimator valueAnimator) {
        C89219l.m154721d(valueAnimator, "");
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.discover.helper.AbstractC41997b
    /* renamed from: c */
    public final void mo71174c(Animator animator) {
        C89219l.m154721d(animator, "");
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.discover.helper.AbstractC41997b
    /* renamed from: d */
    public final void mo71175d(Animator animator) {
        C89219l.m154721d(animator, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.helper.AbstractC41997b
    /* renamed from: a */
    public final void mo71167a() {
        C23163i.m43668b(this.f98047p, 0, null, 0, null, false, 26);
        m84155b(false);
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.helper.AbstractC41997b
    /* renamed from: b */
    public final void mo71171b() {
        boolean z;
        int i;
        int i2 = 0;
        if (this.f98040i != null) {
            z = true;
        } else {
            z = false;
        }
        if ((!this.f98035d || this.f98036e) && ((!this.f98037f || this.f98038g) && !z)) {
            i = this.f98041j;
        } else {
            i = 0;
        }
        if (C41939a.f97819a.mo71095b()) {
            i2 = this.f98041j;
        }
        C23163i.m43668b(this.f98047p, Integer.valueOf(i), null, Integer.valueOf(i2), null, false, 26);
        m84155b(true);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.helper.u$b */
    public static final class C42054b implements AbstractC1134m.AbstractC1140c {

        /* renamed from: a */
        final /* synthetic */ C42052u f98048a;

        /* renamed from: b */
        final /* synthetic */ boolean f98049b;

        static {
            Covode.recordClassIndex(49984);
        }

        @Override // androidx.p060l.AbstractC1134m.AbstractC1140c
        /* renamed from: b */
        public final void mo3866b(AbstractC1134m mVar) {
            C89219l.m154721d(mVar, "");
        }

        @Override // androidx.p060l.AbstractC1134m.AbstractC1140c
        /* renamed from: c */
        public final void mo3867c(AbstractC1134m mVar) {
            C89219l.m154721d(mVar, "");
        }

        @Override // androidx.p060l.AbstractC1134m.AbstractC1140c
        /* renamed from: a */
        public final void mo3865a(AbstractC1134m mVar) {
            C89219l.m154721d(mVar, "");
            C42052u uVar = this.f98048a;
            boolean z = this.f98049b;
            List<AbstractC42053a> list = uVar.f98039h;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                list.get(i).mo71223b(z);
            }
        }

        @Override // androidx.p060l.AbstractC1134m.AbstractC1140c
        /* renamed from: d */
        public final void mo3868d(AbstractC1134m mVar) {
            C89219l.m154721d(mVar, "");
            C42052u uVar = this.f98048a;
            boolean z = this.f98049b;
            List<AbstractC42053a> list = uVar.f98039h;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                list.get(i).mo71222a(z);
            }
        }

        C42054b(C42052u uVar, boolean z) {
            this.f98048a = uVar;
            this.f98049b = z;
        }
    }

    /* renamed from: b */
    private final void m84155b(boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        this.f97944c = !z ? 1 : 0;
        C1146q qVar = new C1146q();
        AbstractC1134m b = new C1110d().mo3921b(this.f98045n).mo3921b(this.f98043l).mo3921b(this.f98046o).mo3921b(this.f98044m);
        View view = this.f98040i;
        if (view != null) {
            b.mo3921b(view);
        }
        b.mo3906a(100);
        Objects.requireNonNull(b, "null cannot be cast to non-null type androidx.transition.Fade");
        ((AbstractC1089aj) b).mo3863c(2);
        C89219l.m154716b(b, "");
        AbstractC1134m e = b.clone();
        e.mo3920b(100L);
        Objects.requireNonNull(e, "null cannot be cast to non-null type androidx.transition.Fade");
        ((AbstractC1089aj) e).mo3863c(1);
        C89219l.m154716b(e, "");
        qVar.mo3941a(e).mo3941a(b);
        AbstractC1134m b2 = new C1098c().mo3919b(R.id.dl4);
        b2.mo3906a(200);
        new animationInterpolatorC69832aj(0.32f, 0.94f, 0.6f);
        C89219l.m154716b(b2, "");
        qVar.mo3941a(b2);
        qVar.mo3908a(new C42054b(this, z));
        ViewGroup viewGroup = this.f98042k;
        Objects.requireNonNull(viewGroup, "null cannot be cast to non-null type android.view.ViewGroup");
        C1142o.m3795a(viewGroup, qVar);
        View view2 = this.f98046o;
        int i5 = 8;
        if (z) {
            i = 8;
        } else {
            i = 0;
        }
        view2.setVisibility(i);
        if (!this.f98035d || this.f98036e) {
            View view3 = this.f98044m;
            if (z) {
                i3 = 8;
            } else {
                i3 = 0;
            }
            view3.setVisibility(i3);
            if (this.f98036e) {
                ImageView imageView = this.f98045n;
                if (!z) {
                    i4 = 8;
                } else {
                    i4 = 0;
                }
                imageView.setVisibility(i4);
            }
        }
        if (this.f98037f) {
            View view4 = this.f98043l;
            if (!z) {
                i2 = 8;
            } else {
                i2 = 0;
            }
            view4.setVisibility(i2);
        }
        View view5 = this.f98040i;
        if (view5 != null) {
            if (z) {
                i5 = 0;
            }
            view5.setVisibility(i5);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C42052u(Context context, ViewGroup viewGroup, View view, View view2, ImageView imageView, View view3, View view4) {
        super(context);
        C89219l.m154721d(viewGroup, "");
        C89219l.m154721d(view, "");
        C89219l.m154721d(view2, "");
        C89219l.m154721d(imageView, "");
        C89219l.m154721d(view3, "");
        C89219l.m154721d(view4, "");
        this.f98042k = viewGroup;
        this.f98043l = view;
        this.f98044m = view2;
        this.f98045n = imageView;
        this.f98046o = view3;
        this.f98047p = view4;
    }
}
