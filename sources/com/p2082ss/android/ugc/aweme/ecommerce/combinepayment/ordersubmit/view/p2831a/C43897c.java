package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.view.p2831a;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.input.TuxRadio;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.C43861o;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.C43862p;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.view.a.c */
public final class C43897c extends FrameLayout {

    /* renamed from: a */
    private final C43861o f102323a;

    /* renamed from: b */
    private SparseArray f102324b;

    static {
        Covode.recordClassIndex(52179);
    }

    /* renamed from: a */
    private View m86795a(int i) {
        if (this.f102324b == null) {
            this.f102324b = new SparseArray();
        }
        View view = (View) this.f102324b.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f102324b.put(i, findViewById);
        return findViewById;
    }

    public final C43862p getReason() {
        String str = this.f102323a.f102231b;
        if (str == null) {
            str = "";
        }
        return new C43862p(str);
    }

    /* renamed from: a */
    public final boolean mo74816a() {
        TuxRadio tuxRadio = (TuxRadio) m86795a(R.id.duf);
        C89219l.m154716b(tuxRadio, "");
        return tuxRadio.isChecked();
    }

    public final void setChecked(boolean z) {
        TuxRadio tuxRadio = (TuxRadio) m86795a(R.id.duf);
        C89219l.m154716b(tuxRadio, "");
        tuxRadio.setChecked(z);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C43897c(Context context, C43861o oVar) {
        super(context, null, 0);
        C89219l.m154721d(context, "");
        C89219l.m154721d(oVar, "");
        MethodCollector.m26663i(8815);
        this.f102323a = oVar;
        C1764a.m5927a(LayoutInflater.from(context), R.layout.p4, this, true);
        TuxTextView tuxTextView = (TuxTextView) m86795a(R.id.dui);
        C89219l.m154716b(tuxTextView, "");
        tuxTextView.setText(oVar.f102232c);
        MethodCollector.m26664o(8815);
    }

    public /* synthetic */ C43897c(Context context, C43861o oVar, byte b) {
        this(context, oVar);
    }
}
