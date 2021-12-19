package com.p2082ss.android.ugc.aweme.ecommerce.semipdp.p2855a;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.C0643b;
import com.C1764a;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.icon.TuxIconView;
import com.p2082ss.android.ugc.aweme.ecommerce.semipdp.SemiPdpStarter;
import com.p2082ss.android.ugc.aweme.ecommerce.track.C45546d;
import com.p2082ss.android.ugc.aweme.ecommerce.util.C45563h;
import com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.semipdp.a.b */
public final class C45336b extends FrameLayout {

    /* renamed from: a */
    public float f105655a = ((float) (C45563h.f106105a / 3));

    /* renamed from: b */
    public boolean f105656b;

    /* renamed from: c */
    public boolean f105657c;

    /* renamed from: d */
    public boolean f105658d;

    /* renamed from: e */
    public final AbstractC89171a<C89391z> f105659e;

    /* renamed from: f */
    public final AbstractC89171a<C89391z> f105660f;

    /* renamed from: g */
    private SparseArray f105661g;

    static {
        Covode.recordClassIndex(53795);
    }

    /* renamed from: a */
    public final View mo76422a(int i) {
        if (this.f105661g == null) {
            this.f105661g = new SparseArray();
        }
        View view = (View) this.f105661g.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f105661g.put(i, findViewById);
        return findViewById;
    }

    public final boolean getShowedCartEntry() {
        return this.f105658d;
    }

    public final void setShowedCartEntry(boolean z) {
        this.f105658d = z;
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.semipdp.a.b$a */
    public static final class C45337a extends AbstractView$OnClickListenerC80259bp {

        /* renamed from: a */
        final /* synthetic */ long f105662a = 700;

        /* renamed from: b */
        final /* synthetic */ C45336b f105663b;

        static {
            Covode.recordClassIndex(53796);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C45337a(C45336b bVar) {
            super(700);
            this.f105663b = bVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp
        /* renamed from: a */
        public final void mo60873a(View view) {
            AbstractC89171a<C89391z> aVar;
            if (view != null && (aVar = this.f105663b.f105659e) != null) {
                aVar.invoke();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.semipdp.a.b$b */
    public static final class C45338b extends AbstractView$OnClickListenerC80259bp {

        /* renamed from: a */
        final /* synthetic */ long f105664a = 700;

        /* renamed from: b */
        final /* synthetic */ C45336b f105665b;

        static {
            Covode.recordClassIndex(53797);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C45338b(C45336b bVar) {
            super(700);
            this.f105665b = bVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp
        /* renamed from: a */
        public final void mo60873a(View view) {
            AbstractC89171a<C89391z> aVar;
            if (view != null && (aVar = this.f105665b.f105660f) != null) {
                aVar.invoke();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.semipdp.a.b$c */
    public static final class C45339c extends AbstractView$OnClickListenerC80259bp {

        /* renamed from: a */
        final /* synthetic */ long f105666a = 700;

        /* renamed from: b */
        final /* synthetic */ SemiPdpStarter.SemiPdpEnterParams f105667b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89171a f105668c;

        static {
            Covode.recordClassIndex(53798);
        }

        @Override // com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp
        /* renamed from: a */
        public final void mo60873a(View view) {
            HashMap<String, Object> hashMap;
            if (view != null) {
                SemiPdpStarter.SemiPdpEnterParams semiPdpEnterParams = this.f105667b;
                HashMap hashMap2 = new HashMap();
                if (semiPdpEnterParams == null || (hashMap = semiPdpEnterParams.getTrackParams()) == null) {
                    hashMap = new HashMap<>();
                }
                hashMap2.putAll(hashMap);
                hashMap2.put("page_name", "semi_product_detail");
                C45546d.m88094a("tiktokec_cart_entrance_click", hashMap2);
                AbstractC89171a aVar = this.f105668c;
                if (aVar != null) {
                    aVar.invoke();
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C45339c(SemiPdpStarter.SemiPdpEnterParams semiPdpEnterParams, AbstractC89171a aVar) {
            super(700);
            this.f105667b = semiPdpEnterParams;
            this.f105668c = aVar;
        }
    }

    public final void setSpecialIllegalState(boolean z) {
        this.f105656b = z;
        int i = 8;
        if (z) {
            TuxIconView tuxIconView = (TuxIconView) mo76422a(R.id.clv);
            C89219l.m154716b(tuxIconView, "");
            tuxIconView.setVisibility(8);
            ((TuxIconView) mo76422a(R.id.a73)).setTintColor(C0643b.m2378c(getContext(), R.color.bx));
            return;
        }
        TuxIconView tuxIconView2 = (TuxIconView) mo76422a(R.id.clv);
        C89219l.m154716b(tuxIconView2, "");
        if (this.f105657c) {
            i = 0;
        }
        tuxIconView2.setVisibility(i);
        ((TuxIconView) mo76422a(R.id.a73)).setTintColor(C0643b.m2378c(getContext(), R.color.a9));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C45336b(Context context, AbstractC89171a<C89391z> aVar, AbstractC89171a<C89391z> aVar2) {
        super(context);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(8190);
        this.f105659e = aVar;
        this.f105660f = aVar2;
        C1764a.m5927a(LayoutInflater.from(context), R.layout.po, this, true);
        TuxIconView tuxIconView = (TuxIconView) mo76422a(R.id.a73);
        C89219l.m154716b(tuxIconView, "");
        tuxIconView.setOnClickListener(new C45337a(this));
        TuxIconView tuxIconView2 = (TuxIconView) mo76422a(R.id.clv);
        C89219l.m154716b(tuxIconView2, "");
        tuxIconView2.setOnClickListener(new C45338b(this));
        int e = C13628n.m24525e(context);
        ((ConstraintLayout) mo76422a(R.id.be5)).setPadding(getPaddingLeft(), e, getPaddingRight(), getPaddingBottom());
        View a = mo76422a(R.id.be4);
        C89219l.m154716b(a, "");
        a.setLayoutParams(new FrameLayout.LayoutParams(-1, (int) (((float) e) + C13628n.m24520b(context, 44.0f))));
        MethodCollector.m26664o(8190);
    }
}
