package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.view;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.widget.AutoRTLImageView;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.a */
public final class C44172a extends FrameLayout {

    /* renamed from: a */
    private SparseArray f103006a;

    static {
        Covode.recordClassIndex(52483);
    }

    /* renamed from: a */
    public final View mo75015a(int i) {
        if (this.f103006a == null) {
            this.f103006a = new SparseArray();
        }
        View view = (View) this.f103006a.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f103006a.put(i, findViewById);
        return findViewById;
    }

    public final String getBalanceTextValue() {
        TuxTextView tuxTextView = (TuxTextView) mo75015a(R.id.qe);
        C89219l.m154716b(tuxTextView, "");
        return tuxTextView.getText().toString();
    }

    public final String getButtonTextValue() {
        TuxTextView tuxTextView = (TuxTextView) mo75015a(R.id.a0i);
        C89219l.m154716b(tuxTextView, "");
        return tuxTextView.getText().toString();
    }

    public final String getNoteTextValue() {
        TuxTextView tuxTextView = (TuxTextView) mo75015a(R.id.cts);
        C89219l.m154716b(tuxTextView, "");
        return tuxTextView.getText().toString();
    }

    public final void setBalanceTextColor(int i) {
        ((TuxTextView) mo75015a(R.id.qe)).setTextColor(i);
    }

    public final void setButtonTextColor(int i) {
        ((TuxTextView) mo75015a(R.id.a0i)).setTextColor(i);
    }

    public final void setNoteTextColor(int i) {
        ((TuxTextView) mo75015a(R.id.cts)).setTextColor(i);
    }

    public final void setBalanceTextValue(String str) {
        C89219l.m154721d(str, "");
        TuxTextView tuxTextView = (TuxTextView) mo75015a(R.id.qe);
        C89219l.m154716b(tuxTextView, "");
        tuxTextView.setText(str);
    }

    public final void setButtonTextValue(String str) {
        C89219l.m154721d(str, "");
        TuxTextView tuxTextView = (TuxTextView) mo75015a(R.id.a0i);
        C89219l.m154716b(tuxTextView, "");
        tuxTextView.setText(str);
    }

    public final void setNoteTextValue(String str) {
        C89219l.m154721d(str, "");
        TuxTextView tuxTextView = (TuxTextView) mo75015a(R.id.cts);
        C89219l.m154716b(tuxTextView, "");
        tuxTextView.setText(str);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C44172a(Context context) {
        super(context, null, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(7763);
        C89219l.m154716b(LayoutInflater.from(getContext()).inflate(R.layout.p6, this), "");
        MethodCollector.m26664o(7763);
    }

    /* renamed from: a */
    public final void mo75016a(boolean z) {
        int i;
        AutoRTLImageView autoRTLImageView = (AutoRTLImageView) mo75015a(R.id.ks);
        C89219l.m154716b(autoRTLImageView, "");
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        autoRTLImageView.setVisibility(i);
    }

    public final void setNoteTextVisibility(boolean z) {
        int i;
        TuxTextView tuxTextView = (TuxTextView) mo75015a(R.id.cts);
        C89219l.m154716b(tuxTextView, "");
        int i2 = 0;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        tuxTextView.setVisibility(i);
        TuxTextView tuxTextView2 = (TuxTextView) mo75015a(R.id.qe);
        C89219l.m154716b(tuxTextView2, "");
        ViewGroup.LayoutParams layoutParams = tuxTextView2.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.C0547a aVar = (ConstraintLayout.C0547a) layoutParams;
        if (z) {
            i2 = -1;
        }
        aVar.f2273k = i2;
    }

    public /* synthetic */ C44172a(Context context, byte b) {
        this(context);
    }
}
