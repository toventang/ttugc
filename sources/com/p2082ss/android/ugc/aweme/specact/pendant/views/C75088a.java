package com.p2082ss.android.ugc.aweme.specact.pendant.views;

import android.animation.Animator;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.loader.SmartImageView;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.specact.pendant.p3929c.p3930a.p3931a.C74963a;
import com.p2082ss.android.ugc.aweme.specact.pendant.p3929c.p3933c.C74982a;
import com.p2082ss.android.ugc.aweme.specact.pendant.p3940h.C75067g;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.specact.pendant.views.a */
public final class C75088a extends View$OnTouchListenerC75114c {

    /* renamed from: a */
    public boolean f168769a;

    /* renamed from: b */
    public C74963a f168770b;

    /* renamed from: c */
    public View f168771c;

    /* renamed from: d */
    public TextView f168772d;

    /* renamed from: e */
    public View f168773e;

    /* renamed from: f */
    public View f168774f;

    /* renamed from: g */
    public View f168775g;

    /* renamed from: h */
    public TextView f168776h;

    /* renamed from: i */
    public View f168777i;

    /* renamed from: j */
    public String f168778j;

    /* renamed from: k */
    public String f168779k;

    /* renamed from: l */
    public boolean f168780l;

    /* renamed from: m */
    public C74982a f168781m;

    /* renamed from: p */
    private final AbstractC89244h f168782p;

    /* renamed from: q */
    private final AbstractC89244h f168783q;

    /* renamed from: r */
    private final AbstractC89244h f168784r;

    /* renamed from: s */
    private final AbstractC89244h f168785s;

    /* renamed from: t */
    private AbstractC75089a f168786t;

    /* renamed from: com.ss.android.ugc.aweme.specact.pendant.views.a$a */
    public interface AbstractC75089a {
        static {
            Covode.recordClassIndex(87962);
        }

        /* renamed from: a */
        void mo118187a();
    }

    static {
        Covode.recordClassIndex(87961);
    }

    private final View getPendantLayout() {
        return (View) this.f168785s.getValue();
    }

    public final ImageView getCloseView() {
        return (ImageView) this.f168784r.getValue();
    }

    public final SmartImageView getSmallSmartImageView() {
        return (SmartImageView) this.f168783q.getValue();
    }

    public final SmartImageView getSmartImageView() {
        return (SmartImageView) this.f168782p.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.pendant.views.a$g */
    public static final class C75095g implements Animator.AnimatorListener {
        static {
            Covode.recordClassIndex(87968);
        }

        public final void onAnimationCancel(Animator animator) {
        }

        public final void onAnimationEnd(Animator animator) {
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        public final void onAnimationStart(Animator animator) {
        }

        C75095g() {
        }
    }

    public final boolean getStaticPendantIsFold() {
        return this.f168769a;
    }

    public final AbstractC75089a getSubViewListener() {
        return this.f168786t;
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.pendant.views.a$c */
    static final class C75091c extends AbstractC89220m implements AbstractC89171a<ImageView> {

        /* renamed from: a */
        final /* synthetic */ C75088a f168788a;

        static {
            Covode.recordClassIndex(87964);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C75091c(C75088a aVar) {
            super(0);
            this.f168788a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ImageView invoke() {
            return this.f168788a.findViewById(R.id.d09);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.pendant.views.a$f */
    static final class C75094f extends AbstractC89220m implements AbstractC89171a<View> {

        /* renamed from: a */
        final /* synthetic */ C75088a f168794a;

        static {
            Covode.recordClassIndex(87967);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C75094f(C75088a aVar) {
            super(0);
            this.f168794a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ View invoke() {
            return this.f168794a.findViewById(R.id.d0a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.pendant.views.a$h */
    static final class C75096h extends AbstractC89220m implements AbstractC89171a<SmartImageView> {

        /* renamed from: a */
        final /* synthetic */ C75088a f168795a;

        static {
            Covode.recordClassIndex(87969);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C75096h(C75088a aVar) {
            super(0);
            this.f168795a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ SmartImageView invoke() {
            return this.f168795a.findViewById(R.id.e3_);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.pendant.views.a$i */
    static final class C75097i extends AbstractC89220m implements AbstractC89171a<SmartImageView> {

        /* renamed from: a */
        final /* synthetic */ C75088a f168796a;

        static {
            Covode.recordClassIndex(87970);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C75097i(C75088a aVar) {
            super(0);
            this.f168796a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ SmartImageView invoke() {
            return this.f168796a.findViewById(R.id.sh);
        }
    }

    /* renamed from: a */
    public final void mo118194a() {
        setCanDrag(true);
        this.f168769a = false;
        getSmartImageView().setVisibility(0);
        getSmallSmartImageView().setVisibility(8);
        mo118195a(80.0f, 80.0f);
        getSmartImageView().setImageURI(this.f168778j);
        setCloseViewStatus(true);
    }

    public final void setSubViewListener(AbstractC75089a aVar) {
        this.f168786t = aVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.pendant.views.a$b */
    public static final class View$OnClickListenerC75090b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C75088a f168787a;

        static {
            Covode.recordClassIndex(87963);
        }

        public View$OnClickListenerC75090b(C75088a aVar) {
            this.f168787a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            AbstractC75089a subViewListener = this.f168787a.getSubViewListener();
            if (subViewListener != null) {
                subViewListener.mo118187a();
            }
        }
    }

    public final void setCloseViewStatus(boolean z) {
        int i;
        ImageView closeView = getCloseView();
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        closeView.setVisibility(i);
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.pendant.views.a$e */
    public static final class View$OnClickListenerC75093e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C75088a f168792a;

        /* renamed from: b */
        final /* synthetic */ String f168793b;

        static {
            Covode.recordClassIndex(87966);
        }

        public View$OnClickListenerC75093e(C75088a aVar, String str) {
            this.f168792a = aVar;
            this.f168793b = str;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C74982a aVar = this.f168792a.f168781m;
            if (aVar != null) {
                aVar.mo118105a();
            }
            C39162r.m79460a("widget_bubble2_close_click", new C33744d().mo59983a(StringSet.type, this.f168793b).f79943a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C75088a(Context context) {
        super(context, null, 0);
        C89219l.m154721d(context, "");
        this.f168782p = C89250i.m154773a((AbstractC89171a) new C75097i(this));
        this.f168783q = C89250i.m154773a((AbstractC89171a) new C75096h(this));
        this.f168784r = C89250i.m154773a((AbstractC89171a) new C75091c(this));
        this.f168785s = C89250i.m154773a((AbstractC89171a) new C75094f(this));
        this.f168778j = "";
        this.f168779k = "";
        this.f168780l = true;
        Objects.requireNonNull(C1764a.m5927a(LayoutInflater.from(context), R.layout.b0o, this, true), "null cannot be cast to non-null type android.view.View");
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.pendant.views.a$d */
    public static final class C75092d implements Animator.AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ C75088a f168789a;

        /* renamed from: b */
        final /* synthetic */ String f168790b;

        /* renamed from: c */
        final /* synthetic */ boolean f168791c;

        static {
            Covode.recordClassIndex(87965);
        }

        public final void onAnimationCancel(Animator animator) {
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        public final void onAnimationStart(Animator animator) {
        }

        public final void onAnimationEnd(Animator animator) {
            float width;
            C75088a aVar = this.f168789a;
            String str = this.f168790b;
            boolean z = this.f168791c;
            C89219l.m154721d(str, "");
            aVar.getSmartImageView().setVisibility(8);
            aVar.getSmallSmartImageView().setVisibility(0);
            aVar.getSmallSmartImageView().setImageURI(str);
            aVar.mo118195a(32.0f, 107.0f);
            if (aVar.getParent() != null) {
                ViewParent parent = aVar.getParent();
                Objects.requireNonNull(parent, "null cannot be cast to non-null type android.view.View");
                View view = (View) parent;
                if (!z) {
                    width = C13628n.m24520b(aVar.getContext(), -8.0f);
                } else {
                    width = ((float) view.getWidth()) - C13628n.m24520b(aVar.getContext(), 32.0f);
                }
                aVar.animate().setListener(new C75095g()).x(width).y(aVar.getY()).setInterpolator(new DecelerateInterpolator()).setDuration(200).start();
            }
        }

        public C75092d(C75088a aVar, String str, boolean z) {
            this.f168789a = aVar;
            this.f168790b = str;
            this.f168791c = z;
        }
    }

    public /* synthetic */ C75088a(Context context, byte b) {
        this(context);
    }

    /* renamed from: a */
    public final void mo118195a(float f, float f2) {
        int i;
        int c = C13628n.m24522c(getContext(), ((float) C13628n.m24525e(getContext())) + 0.0f);
        if (C75067g.m131833a()) {
            i = 80;
        } else {
            i = 70;
        }
        int i2 = c + i;
        ViewGroup.LayoutParams layoutParams = getPendantLayout().getLayoutParams();
        layoutParams.height = (int) C13628n.m24520b(getContext(), f2);
        layoutParams.width = (int) C13628n.m24520b(getContext(), f);
        getPendantLayout().setLayoutParams(layoutParams);
        ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
        if (layoutParams2 instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams) layoutParams2).topMargin = (int) C13628n.m24520b(getContext(), (float) i2);
        }
        setLayoutParams(layoutParams2);
    }
}
