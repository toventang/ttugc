package com.lynx.tasm.behavior.p2052ui.view;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableMapKeySetIterator;
import com.lynx.tasm.behavior.AbstractC28520j;
import com.lynx.tasm.behavior.AbstractC28525m;
import com.lynx.tasm.behavior.C28716v;

/* renamed from: com.lynx.tasm.behavior.ui.view.UIComponent */
public class UIComponent extends UIView {

    /* renamed from: a */
    public String f67686a;

    static {
        Covode.recordClassIndex(34773);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI, com.lynx.tasm.behavior.p2052ui.LynxBaseUI, com.lynx.tasm.behavior.p2052ui.view.UIView
    public void dispatchProperties(C28716v vVar) {
        ReadableMap readableMap = vVar.f67715a;
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            if (nextKey.hashCode() == 1176358053 && nextKey.equals("item-key")) {
                setItemKey(readableMap.getString(nextKey));
            } else {
                super.dispatchProperties(vVar);
            }
        }
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI, com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public void onLayoutUpdated() {
        super.onLayoutUpdated();
    }

    public UIComponent(AbstractC28520j jVar) {
        super(jVar);
    }

    @AbstractC28525m(mo49059a = "item-key")
    public void setItemKey(String str) {
        this.f67686a = str;
    }

    /* access modifiers changed from: protected */
    @Override // com.lynx.tasm.behavior.p2052ui.view.UIView
    /* renamed from: a */
    public final C28698a mo49799a(Context context) {
        return new C28699b(context);
    }
}
