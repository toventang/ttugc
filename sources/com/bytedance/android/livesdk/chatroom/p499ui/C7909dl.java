package com.bytedance.android.livesdk.chatroom.p499ui;

import android.view.View;
import android.widget.RelativeLayout;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.dl */
final /* synthetic */ class C7909dl implements AbstractC89172b {

    /* renamed from: a */
    private final C7891dd f19668a;

    static {
        Covode.recordClassIndex(8704);
    }

    C7909dl(C7891dd ddVar) {
        this.f19668a = ddVar;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public final Object invoke(Object obj) {
        C7891dd ddVar = this.f19668a;
        Boolean bool = (Boolean) obj;
        if (ddVar.getView() == null || ddVar.getView().findViewById(R.id.fj3) == null) {
            return C89391z.f203057a;
        }
        View findViewById = ddVar.getView().findViewById(R.id.fj3);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) findViewById.getLayoutParams();
        layoutParams.setMarginEnd(C3966y.m9653a(bool.booleanValue() ? 118.0f : 6.0f));
        findViewById.setLayoutParams(layoutParams);
        return C89391z.f203057a;
    }
}
