package com.p2082ss.android.ugc.aweme.profile.p3565a;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.ActivityC0945e;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.profile.p3575f.C63786o;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.a.n */
public final class C63374n extends RecyclerView.ViewHolder {

    /* renamed from: a */
    public final RecyclerView f143886a;

    /* renamed from: b */
    public final ActivityC0945e f143887b;

    /* renamed from: c */
    public final ConstraintLayout f143888c;

    /* renamed from: d */
    public final TextView f143889d;

    static {
        Covode.recordClassIndex(74665);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63374n(View view, ActivityC0945e eVar) {
        super(view);
        C89219l.m154721d(view, "");
        C89219l.m154721d(eVar, "");
        this.f143887b = eVar;
        View findViewById = view.findViewById(R.id.bqz);
        C89219l.m154716b(findViewById, "");
        this.f143888c = (ConstraintLayout) findViewById;
        View findViewById2 = view.findViewById(R.id.a1w);
        C89219l.m154716b(findViewById2, "");
        this.f143886a = (RecyclerView) findViewById2;
        View findViewById3 = view.findViewById(R.id.abo);
        C89219l.m154716b(findViewById3, "");
        this.f143889d = (TextView) findViewById3;
        C63786o.f144582b = true;
    }
}
