package com.bytedance.ies.bullet.lynx_adapter_impl;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.behavior.p2052ui.LynxUI;
import com.lynx.tasm.behavior.utils.AbstractC28700a;
import p4600h.p4611f.p4613b.C89219l;

public class LynxUIMethodInvokerProxy implements AbstractC28700a<LynxUI<? extends View>> {
    static {
        Covode.recordClassIndex(18968);
    }

    /* renamed from: a */
    public void mo26245a(String str, ReadableMap readableMap, Callback callback) {
        C89219l.m154719c(str, "");
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.lynx.tasm.behavior.ui.LynxBaseUI, java.lang.String, com.lynx.react.bridge.ReadableMap, com.lynx.react.bridge.Callback] */
    @Override // com.lynx.tasm.behavior.utils.AbstractC28700a
    public /* synthetic */ void invoke(LynxUI<? extends View> lynxUI, String str, ReadableMap readableMap, Callback callback) {
        mo26245a(str, readableMap, callback);
    }
}
