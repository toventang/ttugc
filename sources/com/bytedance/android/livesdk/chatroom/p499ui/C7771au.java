package com.bytedance.android.livesdk.chatroom.p499ui;

import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.C6807ap;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.au */
final /* synthetic */ class C7771au implements AbstractC89172b {

    /* renamed from: a */
    private final C7770at f19292a;

    static {
        Covode.recordClassIndex(8566);
    }

    C7771au(C7770at atVar) {
        this.f19292a = atVar;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public final Object invoke(Object obj) {
        View findViewById;
        C7770at atVar = this.f19292a;
        C6807ap apVar = (C6807ap) obj;
        if (atVar.f19284H != null && (apVar instanceof C6807ap) && (findViewById = atVar.f19284H.findViewById(R.id.bpe)) != null && (findViewById.getLayoutParams() instanceof FrameLayout.LayoutParams)) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) findViewById.getLayoutParams();
            layoutParams.leftMargin = apVar.f17079a;
            layoutParams.topMargin = apVar.f17080b;
            layoutParams.rightMargin = apVar.f17081c;
            layoutParams.bottomMargin = apVar.f17082d;
        }
        return C89391z.f203057a;
    }
}
