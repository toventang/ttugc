package com.bytedance.android.livesdk.chatroom.p499ui;

import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.ad */
final /* synthetic */ class C7717ad implements AbstractC89172b {

    /* renamed from: a */
    private final AbstractC7703a f19181a;

    static {
        Covode.recordClassIndex(8512);
    }

    C7717ad(AbstractC7703a aVar) {
        this.f19181a = aVar;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public final Object invoke(Object obj) {
        AbstractC7703a aVar = this.f19181a;
        if (aVar.f19106F != null) {
            ViewGroup.LayoutParams layoutParams = aVar.f19106F.getLayoutParams();
            if (layoutParams instanceof RelativeLayout.LayoutParams) {
                ((RelativeLayout.LayoutParams) layoutParams).addRule(6, R.id.cjn);
            }
        }
        return C89391z.f203057a;
    }
}
