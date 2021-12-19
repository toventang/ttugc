package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.bytedance.android.livesdk.chatroom.p488c.C7401r;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.bd */
final /* synthetic */ class C8081bd implements AbstractC88433f {

    /* renamed from: a */
    private final DecorationWrapperWidget f20095a;

    static {
        Covode.recordClassIndex(8888);
    }

    C8081bd(DecorationWrapperWidget decorationWrapperWidget) {
        this.f20095a = decorationWrapperWidget;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        DecorationWrapperWidget decorationWrapperWidget = this.f20095a;
        C7401r rVar = (C7401r) obj;
        if (rVar != null && decorationWrapperWidget.getView() != null) {
            if (rVar.f18339b) {
                decorationWrapperWidget.hide();
            } else {
                decorationWrapperWidget.show();
            }
        }
    }
}
