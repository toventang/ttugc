package com.bytedance.tux.status.loading;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1710c.C23008e;
import com.bytedance.tux.p1710c.C23009f;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

public final class TuxLoadingHUD extends FrameLayout {

    /* renamed from: a */
    private boolean f55157a;

    /* renamed from: b */
    private HashMap f55158b;

    static {
        Covode.recordClassIndex(27214);
    }

    public TuxLoadingHUD(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* renamed from: b */
    private View m43828b(int i) {
        if (this.f55158b == null) {
            this.f55158b = new HashMap();
        }
        View view = (View) this.f55158b.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f55158b.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final void setVisibility(int i) {
        super.setVisibility(i);
        if (this.f55157a) {
            m43827a(i);
        }
    }

    /* renamed from: a */
    private final void m43827a(int i) {
        if (i == 0) {
            ((TuxDualBallView) m43828b(R.id.cff)).mo37884b();
        } else {
            ((TuxDualBallView) m43828b(R.id.cff)).mo37885c();
        }
    }

    public final void setMessage(int i) {
        TuxTextView tuxTextView = (TuxTextView) m43828b(R.id.message_tv);
        C89219l.m154709a((Object) tuxTextView, "");
        tuxTextView.setText(getResources().getString(i));
    }

    public final void setMessage(String str) {
        TuxTextView tuxTextView = (TuxTextView) m43828b(R.id.message_tv);
        C89219l.m154709a((Object) tuxTextView, "");
        tuxTextView.setText(str);
    }

    private /* synthetic */ TuxLoadingHUD(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private TuxLoadingHUD(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, R.attr.bw);
        C89219l.m154719c(context, "");
        MethodCollector.m26663i(8627);
        this.f55157a = true;
        View.inflate(context, R.layout.n, this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.ds, R.attr.dt, R.attr.du, R.attr.dv, R.attr.apy}, R.attr.bw, 0);
        C89219l.m154709a((Object) obtainStyledAttributes, "");
        String string = obtainStyledAttributes.getString(4);
        int i = obtainStyledAttributes.getInt(3, 0);
        int color = obtainStyledAttributes.getColor(2, 0);
        final int color2 = obtainStyledAttributes.getColor(0, 0);
        final float dimension = obtainStyledAttributes.getDimension(1, 0.0f);
        obtainStyledAttributes.recycle();
        ((TuxTextView) m43828b(R.id.message_tv)).setTuxFont(i);
        ((TuxTextView) m43828b(R.id.message_tv)).setTextColor(color);
        setMessage(string);
        LinearLayout linearLayout = (LinearLayout) m43828b(R.id.cje);
        C89219l.m154709a((Object) linearLayout, "");
        linearLayout.setBackground(C23009f.m43397a(new AbstractC89172b<C23008e, C89391z>() {
            /* class com.bytedance.tux.status.loading.TuxLoadingHUD.C232681 */

            static {
                Covode.recordClassIndex(27215);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(C23008e eVar) {
                C23008e eVar2 = eVar;
                C89219l.m154719c(eVar2, "");
                eVar2.f54462a = Integer.valueOf(color2);
                eVar2.f54464c = Float.valueOf(dimension);
                return C89391z.f203057a;
            }
        }).mo37389a(context));
        m43827a(getVisibility());
        MethodCollector.m26664o(8627);
    }
}
