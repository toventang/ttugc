package com.p2082ss.android.ugc.aweme.notification.p3529h;

import android.view.View;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.C61634i;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notification.h.z */
public final class C62172z extends C62129p {

    /* renamed from: a */
    private final TextView f141170a;

    static {
        Covode.recordClassIndex(72926);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.notification.p3529h.AbstractView$OnLongClickListenerC62118k, com.p2082ss.android.ugc.aweme.notification.p3529h.View$OnClickListenerC62026a
    /* renamed from: e */
    public final boolean mo100082e() {
        return false;
    }

    /* renamed from: b */
    public final void mo100171b(String str) {
        C89219l.m154721d(str, "");
        this.f141170a.setText(str);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62172z(View view) {
        super(view);
        C89219l.m154721d(view, "");
        View findViewById = view.findViewById(R.id.f5x);
        C89219l.m154716b(findViewById, "");
        this.f141170a = (TextView) findViewById;
    }

    /* renamed from: a */
    public final void mo100170a(C61634i iVar) {
        C89219l.m154721d(iVar, "");
        int i = iVar.timeLineType;
        if (i == 0) {
            this.f141170a.setText(R.string.djx);
        } else if (i == 1) {
            this.f141170a.setText(R.string.dk0);
        } else if (i == 2) {
            this.f141170a.setText(R.string.dk1);
        } else if (i == 3) {
            this.f141170a.setText(R.string.djz);
        } else if (i == 4) {
            this.f141170a.setText(R.string.djy);
        } else if (i == 5) {
            this.f141170a.setText(R.string.djw);
        }
    }
}
