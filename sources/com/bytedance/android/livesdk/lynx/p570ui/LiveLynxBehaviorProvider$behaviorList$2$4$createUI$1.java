package com.bytedance.android.livesdk.lynx.p570ui;

import android.content.Context;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.AbstractC28520j;
import com.lynx.tasm.behavior.p2052ui.view.C28698a;
import com.lynx.tasm.behavior.p2052ui.view.UISimpleView;

/* renamed from: com.bytedance.android.livesdk.lynx.ui.LiveLynxBehaviorProvider$behaviorList$2$4$createUI$1 */
public final class LiveLynxBehaviorProvider$behaviorList$2$4$createUI$1 extends UISimpleView<C28698a> {

    /* renamed from: a */
    final /* synthetic */ AbstractC28520j f22868a;

    static {
        Covode.recordClassIndex(10883);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI
    public final /* synthetic */ View createView(Context context) {
        return new C28698a(context);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LiveLynxBehaviorProvider$behaviorList$2$4$createUI$1(AbstractC28520j jVar, AbstractC28520j jVar2) {
        super(jVar2);
        this.f22868a = jVar;
    }
}
