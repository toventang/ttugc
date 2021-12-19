package com.p2082ss.android.ugc.aweme.notification.p3529h;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notification.h.ar */
public final class C62060ar extends C62129p {

    /* renamed from: a */
    public RelativeLayout f140887a;

    /* renamed from: b */
    private TextView f140888b;

    static {
        Covode.recordClassIndex(72814);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.notification.p3529h.AbstractView$OnLongClickListenerC62118k, com.p2082ss.android.ugc.aweme.notification.p3529h.View$OnClickListenerC62026a
    /* renamed from: e */
    public final boolean mo100082e() {
        return false;
    }

    /* renamed from: b */
    public final void mo100116b(String str) {
        C89219l.m154721d(str, "");
        this.f140888b.setText(str);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62060ar(View view) {
        super(view);
        C89219l.m154721d(view, "");
        View findViewById = view.findViewById(R.id.f3e);
        C89219l.m154716b(findViewById, "");
        this.f140888b = (TextView) findViewById;
        View findViewById2 = view.findViewById(R.id.dkw);
        C89219l.m154716b(findViewById2, "");
        this.f140887a = (RelativeLayout) findViewById2;
    }
}
