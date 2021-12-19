package com.p2082ss.android.ugc.aweme.account.login.p2254a;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2307ai.View$OnTouchListenerC33468a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.login.a.f */
public final class C31826f extends RecyclerView.ViewHolder {

    /* renamed from: a */
    public final ImageView f76060a;

    /* renamed from: b */
    public final ConstraintLayout f76061b;

    /* renamed from: c */
    final TextView f76062c;

    /* renamed from: d */
    final float f76063d;

    /* renamed from: e */
    public final View f76064e;

    static {
        Covode.recordClassIndex(38568);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C31826f(View view) {
        super(view);
        C89219l.m154721d(view, "");
        this.f76064e = view;
        View findViewById = view.findViewById(R.id.bh1);
        C89219l.m154716b(findViewById, "");
        this.f76060a = (ImageView) findViewById;
        View findViewById2 = view.findViewById(R.id.acf);
        C89219l.m154716b(findViewById2, "");
        this.f76061b = (ConstraintLayout) findViewById2;
        View findViewById3 = view.findViewById(R.id.a41);
        C89219l.m154716b(findViewById3, "");
        this.f76062c = (TextView) findViewById3;
        this.f76063d = ((float) C13628n.m24504a(view.getContext())) - C13628n.m24520b(view.getContext(), 60.0f);
        view.setOnTouchListener(new View$OnTouchListenerC33468a(0.5f));
    }
}
