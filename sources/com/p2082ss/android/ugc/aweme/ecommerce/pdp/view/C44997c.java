package com.p2082ss.android.ugc.aweme.ecommerce.pdp.view;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.view.c */
public final class C44997c extends ConstraintLayout {

    /* renamed from: g */
    private SparseArray f104979g;

    static {
        Covode.recordClassIndex(53420);
    }

    /* renamed from: b */
    private View m87684b(int i) {
        if (this.f104979g == null) {
            this.f104979g = new SparseArray();
        }
        View view = (View) this.f104979g.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f104979g.put(i, findViewById);
        return findViewById;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C44997c(Context context) {
        super(context, null, 0);
        C89219l.m154721d(context, "");
        C1764a.m5927a(LayoutInflater.from(context), R.layout.q6, this, true);
    }

    public final void setDesc(String str) {
        if (str != null) {
            TuxTextView tuxTextView = (TuxTextView) m87684b(R.id.ajd);
            C89219l.m154716b(tuxTextView, "");
            tuxTextView.setText(str);
        }
    }

    public final void setTitle(String str) {
        if (str != null) {
            TuxTextView tuxTextView = (TuxTextView) m87684b(R.id.title);
            C89219l.m154716b(tuxTextView, "");
            tuxTextView.setText(str);
        }
    }

    public /* synthetic */ C44997c(Context context, byte b) {
        this(context);
    }
}
