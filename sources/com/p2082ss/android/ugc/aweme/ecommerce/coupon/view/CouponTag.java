package com.p2082ss.android.ugc.aweme.ecommerce.coupon.view;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.coupon.view.CouponTag */
public final class CouponTag extends FrameLayout {

    /* renamed from: a */
    public final TuxTextView f103388a;

    static {
        Covode.recordClassIndex(52662);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.coupon.view.CouponTag$a */
    static final class RunnableC44337a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ CouponTag f103389a;

        static {
            Covode.recordClassIndex(52663);
        }

        RunnableC44337a(CouponTag couponTag) {
            this.f103389a = couponTag;
        }

        public final void run() {
            Layout layout = this.f103389a.f103388a.getLayout();
            if (layout != null && layout.getEllipsisCount(layout.getLineCount() - 1) > 0) {
                this.f103389a.setVisibility(8);
            }
        }
    }

    public final void setText(String str) {
        C89219l.m154721d(str, "");
        this.f103388a.setText(str);
        setVisibility(0);
        post(new RunnableC44337a(this));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CouponTag(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
        C89219l.m154721d(context, "");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private CouponTag(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(8106);
        setBackgroundResource(R.drawable.yf);
        C1764a.m5927a(LayoutInflater.from(context), R.layout.oa, this, true);
        View findViewById = findViewById(R.id.text);
        C89219l.m154716b(findViewById, "");
        this.f103388a = (TuxTextView) findViewById;
        MethodCollector.m26664o(8106);
    }
}
