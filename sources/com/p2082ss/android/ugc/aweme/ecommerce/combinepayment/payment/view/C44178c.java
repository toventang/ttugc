package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.view;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.C0643b;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.widget.AutoRTLImageView;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44078g;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.c */
public final class C44178c extends FrameLayout {

    /* renamed from: a */
    public C44078g f103019a;

    /* renamed from: b */
    private SparseArray f103020b;

    static {
        Covode.recordClassIndex(52489);
    }

    /* renamed from: a */
    public final View mo75031a(int i) {
        if (this.f103020b == null) {
            this.f103020b = new SparseArray();
        }
        View view = (View) this.f103020b.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f103020b.put(i, findViewById);
        return findViewById;
    }

    public final C44078g getOption() {
        return this.f103019a;
    }

    /* renamed from: a */
    public final boolean mo75032a() {
        ConstraintLayout constraintLayout = (ConstraintLayout) mo75031a(R.id.cx5);
        C89219l.m154716b(constraintLayout, "");
        return constraintLayout.isSelected();
    }

    public final void setOption(C44078g gVar) {
        this.f103019a = gVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.c$a */
    public static final class View$OnClickListenerC44179a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ String f103021a;

        /* renamed from: b */
        final /* synthetic */ C44178c f103022b;

        static {
            Covode.recordClassIndex(52490);
        }

        public View$OnClickListenerC44179a(String str, C44178c cVar) {
            this.f103021a = str;
            this.f103022b = cVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            SmartRouter.buildRoute(this.f103022b.getContext(), this.f103021a).open();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C44178c(Context context) {
        super(context, null, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(7750);
        C89219l.m154716b(LayoutInflater.from(getContext()).inflate(R.layout.pe, this), "");
        MethodCollector.m26664o(7750);
    }

    public final void setChecked(boolean z) {
        int i;
        int i2;
        ConstraintLayout constraintLayout = (ConstraintLayout) mo75031a(R.id.cx5);
        C89219l.m154716b(constraintLayout, "");
        if (constraintLayout.isSelected() != z) {
            ConstraintLayout constraintLayout2 = (ConstraintLayout) mo75031a(R.id.cx5);
            C89219l.m154716b(constraintLayout2, "");
            constraintLayout2.setSelected(z);
            AutoRTLImageView autoRTLImageView = (AutoRTLImageView) mo75031a(R.id.duv);
            C89219l.m154716b(autoRTLImageView, "");
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            autoRTLImageView.setVisibility(i);
            TuxTextView tuxTextView = (TuxTextView) mo75031a(R.id.cx4);
            Context context = getContext();
            if (!z) {
                i2 = R.color.bx;
            } else {
                i2 = R.color.bh;
            }
            tuxTextView.setTextColor(C0643b.m2378c(context, i2));
        }
    }

    public /* synthetic */ C44178c(Context context, byte b) {
        this(context);
    }
}
