package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.view;

import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.app.ActivityC0218d;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.ActivityC0945e;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.widget.AutoRTLImageView;
import com.bytedance.jedi.ext.adapter.C20624b;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.view.OrderSubmitInfoView */
public final class OrderSubmitInfoView extends FrameLayout {

    /* renamed from: a */
    private SparseArray f102251a;

    static {
        Covode.recordClassIndex(52151);
    }

    public OrderSubmitInfoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    /* renamed from: a */
    public final View mo74779a(int i) {
        if (this.f102251a == null) {
            this.f102251a = new SparseArray();
        }
        View view = (View) this.f102251a.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f102251a.put(i, findViewById);
        return findViewById;
    }

    public final String getTitleText() {
        TuxTextView tuxTextView = (TuxTextView) mo74779a(R.id.title);
        C89219l.m154716b(tuxTextView, "");
        return tuxTextView.getText().toString();
    }

    public final void setDescColor(int i) {
        ((TuxTextView) mo74779a(R.id.ajd)).setTextColor(i);
    }

    public final void setDescFont(int i) {
        ((TuxTextView) mo74779a(R.id.ajd)).setTuxFont(i);
    }

    public final void setTitleColor(int i) {
        ((TuxTextView) mo74779a(R.id.title)).setTextColor(i);
    }

    public final void setTitleFont(int i) {
        ((TuxTextView) mo74779a(R.id.title)).setTuxFont(i);
    }

    public final void setDescText(String str) {
        C89219l.m154721d(str, "");
        TuxTextView tuxTextView = (TuxTextView) mo74779a(R.id.ajd);
        C89219l.m154716b(tuxTextView, "");
        tuxTextView.setText(str);
    }

    public final void setTitleText(String str) {
        C89219l.m154721d(str, "");
        TuxTextView tuxTextView = (TuxTextView) mo74779a(R.id.title);
        C89219l.m154716b(tuxTextView, "");
        tuxTextView.setText(str);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.view.OrderSubmitInfoView$a */
    public static final class C43871a extends AbstractView$OnClickListenerC80259bp {

        /* renamed from: a */
        final /* synthetic */ long f102252a = 700;

        /* renamed from: b */
        final /* synthetic */ OrderSubmitInfoView f102253b;

        /* renamed from: c */
        final /* synthetic */ String f102254c;

        static {
            Covode.recordClassIndex(52152);
        }

        @Override // com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp
        /* renamed from: a */
        public final void mo60873a(View view) {
            if (view != null) {
                Context context = this.f102253b.getContext();
                C89219l.m154716b(context, "");
                Object a = C20624b.m38845a(context);
                if (!(a instanceof ActivityC0218d)) {
                    a = null;
                }
                ActivityC0945e eVar = (ActivityC0945e) a;
                if (eVar != null) {
                    C43898b bVar = new C43898b(this.f102253b.getTitleText(), this.f102254c);
                    AbstractC0952i supportFragmentManager = eVar.getSupportFragmentManager();
                    C89219l.m154716b(supportFragmentManager, "");
                    bVar.show(supportFragmentManager, "");
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43871a(OrderSubmitInfoView orderSubmitInfoView, String str) {
            super(700);
            this.f102253b = orderSubmitInfoView;
            this.f102254c = str;
        }
    }

    public final void setDescImage(String str) {
        SmartImageView smartImageView = (SmartImageView) mo74779a(R.id.ajo);
        C89219l.m154716b(smartImageView, "");
        smartImageView.setVisibility(0);
        if (str == null) {
            str = " ";
        }
        C20766v a = C20761r.m39061a(str);
        a.f49092E = (SmartImageView) mo74779a(R.id.ajo);
        a.mo34186c();
    }

    public final void setDescImageAlpha(float f) {
        SmartImageView smartImageView = (SmartImageView) mo74779a(R.id.ajo);
        C89219l.m154716b(smartImageView, "");
        if (smartImageView.getAlpha() != f) {
            SmartImageView smartImageView2 = (SmartImageView) mo74779a(R.id.ajo);
            C89219l.m154716b(smartImageView2, "");
            smartImageView2.setAlpha(f);
        }
    }

    public final void setSubDescExtraText(String str) {
        TuxTextView tuxTextView = (TuxTextView) mo74779a(R.id.ea8);
        C89219l.m154716b(tuxTextView, "");
        int i = 0;
        if (str == null || str.length() == 0) {
            i = 8;
        }
        tuxTextView.setVisibility(i);
        TuxTextView tuxTextView2 = (TuxTextView) mo74779a(R.id.ea8);
        C89219l.m154716b(tuxTextView2, "");
        tuxTextView2.setText(str);
    }

    public final void setSubDescText(String str) {
        C89219l.m154721d(str, "");
        TuxTextView tuxTextView = (TuxTextView) mo74779a(R.id.ea7);
        C89219l.m154716b(tuxTextView, "");
        tuxTextView.setVisibility(0);
        TuxTextView tuxTextView2 = (TuxTextView) mo74779a(R.id.ea7);
        C89219l.m154716b(tuxTextView2, "");
        tuxTextView2.setText(str);
    }

    /* renamed from: a */
    public final void mo74781a(boolean z) {
        int i;
        AutoRTLImageView autoRTLImageView = (AutoRTLImageView) mo74779a(R.id.ks);
        C89219l.m154716b(autoRTLImageView, "");
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        autoRTLImageView.setVisibility(i);
    }

    /* renamed from: a */
    public final void mo74780a(Integer num, int i) {
        if (num == null) {
            TuxIconView tuxIconView = (TuxIconView) mo74779a(R.id.ajn);
            C89219l.m154716b(tuxIconView, "");
            tuxIconView.setVisibility(8);
            return;
        }
        TuxIconView tuxIconView2 = (TuxIconView) mo74779a(R.id.ajn);
        C89219l.m154716b(tuxIconView2, "");
        tuxIconView2.setVisibility(0);
        ((TuxIconView) mo74779a(R.id.ajn)).setIconRes(num.intValue());
        ((TuxIconView) mo74779a(R.id.ajn)).setTintColor(i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OrderSubmitInfoView(Context context, AttributeSet attributeSet, int i) {
        this(context, (i & 2) != 0 ? null : attributeSet, (byte) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private OrderSubmitInfoView(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(8983);
        C1764a.m5927a(LayoutInflater.from(context), R.layout.rf, this, true);
        MethodCollector.m26664o(8983);
    }
}
