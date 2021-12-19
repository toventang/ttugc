package com.bytedance.android.livesdk.p604qa;

import android.content.Context;
import com.bytedance.android.live.p378m.AbstractC5760a;
import com.bytedance.android.live.p385p.AbstractView$OnClickListenerC5841f;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.live.publicscreen.p386a.AbstractC5880e;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.qa.z */
public class C10309z implements AbstractC5760a {
    static {
        Covode.recordClassIndex(11875);
    }

    @Override // com.bytedance.android.live.p378m.AbstractC5760a
    public Class<? extends LiveRecyclableWidget> getQAWidget() {
        return QuestionCardWidget.class;
    }

    @Override // com.bytedance.android.live.base.AbstractC2953a
    public void onInit() {
        ((AbstractC5880e) C6193a.m13435a(AbstractC5880e.class)).addOnRegistryReadyListener(new C10261h());
    }

    @Override // com.bytedance.android.live.p378m.AbstractC5760a
    public AbstractView$OnClickListenerC5841f getToolbarBehavior(Context context) {
        C89219l.m154721d(context, "");
        return new C10227aw(context);
    }
}
