package com.p2082ss.android.ugc.aweme.ecommerce.pdp.view;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2851c.C44766a;
import com.p2082ss.android.ugc.aweme.ecommerce.review.view.RatingNumber;
import com.p2082ss.android.ugc.aweme.i18n.C53437b;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.view.PdpExtraInfoView */
public final class PdpExtraInfoView extends FrameLayout {

    /* renamed from: a */
    private SparseArray f104965a;

    static {
        Covode.recordClassIndex(53416);
    }

    public PdpExtraInfoView(Context context) {
        this(context, (AttributeSet) null, 6);
    }

    public PdpExtraInfoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    /* renamed from: a */
    private View m87680a(int i) {
        if (this.f104965a == null) {
            this.f104965a = new SparseArray();
        }
        View view = (View) this.f104965a.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f104965a.put(i, findViewById);
        return findViewById;
    }

    /* renamed from: a */
    private final void m87681a() {
        int i;
        TuxTextView tuxTextView = (TuxTextView) m87680a(R.id.dou);
        C89219l.m154716b(tuxTextView, "");
        if (tuxTextView.getVisibility() != 0) {
            TuxIconView tuxIconView = (TuxIconView) m87680a(R.id.e64);
            C89219l.m154716b(tuxIconView, "");
            if (tuxIconView.getVisibility() != 0) {
                i = 8;
                setVisibility(i);
            }
        }
        i = 0;
        setVisibility(i);
    }

    public final void setRate(float f) {
        if (f == 0.0f) {
            TuxIconView tuxIconView = (TuxIconView) m87680a(R.id.e64);
            C89219l.m154716b(tuxIconView, "");
            tuxIconView.setVisibility(8);
            View a = m87680a(R.id.aml);
            C89219l.m154716b(a, "");
            a.setVisibility(8);
            RatingNumber ratingNumber = (RatingNumber) m87680a(R.id.deh);
            C89219l.m154716b(ratingNumber, "");
            ratingNumber.setVisibility(8);
        } else {
            TuxIconView tuxIconView2 = (TuxIconView) m87680a(R.id.e64);
            C89219l.m154716b(tuxIconView2, "");
            tuxIconView2.setVisibility(0);
            TuxTextView tuxTextView = (TuxTextView) m87680a(R.id.dou);
            C89219l.m154716b(tuxTextView, "");
            if (tuxTextView.getVisibility() == 0) {
                View a2 = m87680a(R.id.aml);
                C89219l.m154716b(a2, "");
                a2.setVisibility(0);
            }
            RatingNumber ratingNumber2 = (RatingNumber) m87680a(R.id.deh);
            C89219l.m154716b(ratingNumber2, "");
            ratingNumber2.setVisibility(0);
            ((RatingNumber) m87680a(R.id.deh)).getScore().setText(String.valueOf(f));
        }
        m87681a();
    }

    public final void setSales(long j) {
        String str;
        Resources resources;
        if (j > 0) {
            setVisibility(0);
            TuxTextView tuxTextView = (TuxTextView) m87680a(R.id.dou);
            C89219l.m154716b(tuxTextView, "");
            tuxTextView.setVisibility(0);
            TuxTextView tuxTextView2 = (TuxTextView) m87680a(R.id.dou);
            C89219l.m154716b(tuxTextView2, "");
            TuxTextView tuxTextView3 = (TuxTextView) m87680a(R.id.dou);
            C89219l.m154716b(tuxTextView3, "");
            Context context = tuxTextView3.getContext();
            if (context == null || (resources = context.getResources()) == null) {
                str = null;
            } else {
                str = resources.getString(R.string.bg1, C53437b.m98615a(j));
            }
            tuxTextView2.setText(str);
        } else {
            TuxTextView tuxTextView4 = (TuxTextView) m87680a(R.id.dou);
            C89219l.m154716b(tuxTextView4, "");
            tuxTextView4.setVisibility(8);
        }
        m87681a();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private PdpExtraInfoView(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(7502);
        C44766a.m87492a(context, R.layout.q1, this, true);
        MethodCollector.m26664o(7502);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private /* synthetic */ PdpExtraInfoView(Context context, AttributeSet attributeSet, int i) {
        this(context, (i & 2) != 0 ? null : attributeSet, (byte) 0);
    }
}
