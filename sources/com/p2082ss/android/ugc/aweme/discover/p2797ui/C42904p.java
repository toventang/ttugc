package com.p2082ss.android.ugc.aweme.discover.p2797ui;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.DmtLoadingLayout;
import com.bytedance.jedi.ext.adapter.p1465a.AbstractC20595e;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.p */
public final class C42904p implements AbstractC20595e {

    /* renamed from: a */
    private final DmtLoadingLayout f100046a;

    /* renamed from: b */
    private final TuxTextView f100047b;

    /* renamed from: c */
    private final View f100048c;

    static {
        Covode.recordClassIndex(51009);
    }

    @Override // com.bytedance.jedi.ext.adapter.p1465a.AbstractC20595e
    /* renamed from: a */
    public final View mo33842a() {
        return this.f100048c;
    }

    public C42904p(View view) {
        C89219l.m154721d(view, "");
        this.f100048c = view;
        View findViewById = view.findViewById(R.id.e7i);
        C89219l.m154716b(findViewById, "");
        this.f100046a = (DmtLoadingLayout) findViewById;
        View findViewById2 = view.findViewById(R.id.ct2);
        C89219l.m154716b(findViewById2, "");
        this.f100047b = (TuxTextView) findViewById2;
    }

    @Override // com.bytedance.jedi.ext.adapter.p1465a.AbstractC20595e
    /* renamed from: a */
    public final void mo33843a(int i) {
        switch (i) {
            case 241:
                this.f100046a.setVisibility(8);
                this.f100047b.setVisibility(8);
                return;
            case 242:
                this.f100046a.setVisibility(0);
                this.f100047b.setVisibility(8);
                return;
            case 243:
                this.f100046a.setVisibility(8);
                this.f100047b.setVisibility(0);
                return;
            case 244:
                this.f100046a.setVisibility(8);
                this.f100047b.setVisibility(8);
                return;
            default:
                return;
        }
    }
}
