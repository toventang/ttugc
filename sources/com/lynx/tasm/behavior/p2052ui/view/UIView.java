package com.lynx.tasm.behavior.p2052ui.view;

import android.content.Context;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableMapKeySetIterator;
import com.lynx.tasm.behavior.AbstractC28520j;
import com.lynx.tasm.behavior.AbstractC28525m;
import com.lynx.tasm.behavior.C28716v;
import com.lynx.tasm.p2054c.C28727e;
import java.util.HashMap;

/* renamed from: com.lynx.tasm.behavior.ui.view.UIView */
public class UIView extends UISimpleView<C28698a> {
    static {
        Covode.recordClassIndex(34779);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI, com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public void dispatchProperties(C28716v vVar) {
        ReadableMap readableMap = vVar.f67715a;
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            if (nextKey.hashCode() == -1389119727 && nextKey.equals("impression_id")) {
                setImpressionId(readableMap.getString(nextKey));
            } else {
                super.dispatchProperties(vVar);
            }
        }
    }

    public UIView(AbstractC28520j jVar) {
        super(jVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C28698a mo49799a(Context context) {
        return new C28698a(context);
    }

    @AbstractC28525m(mo49059a = "impression_id")
    public void setImpressionId(String str) {
        ((C28698a) this.mView).setImpressionId(str);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI
    public /* synthetic */ View createView(Context context) {
        C28698a a = mo49799a(context);
        a.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
            /* class com.lynx.tasm.behavior.p2052ui.view.UIView.View$OnAttachStateChangeListenerC286971 */

            static {
                Covode.recordClassIndex(34782);
            }

            public final void onViewAttachedToWindow(View view) {
                if (view == UIView.this.mView && UIView.this.mEvents != null && UIView.this.mEvents.containsKey("attach")) {
                    C28727e eVar = new C28727e(UIView.this.getSign(), "attach");
                    HashMap<String, Object> hashMap = new HashMap<>();
                    hashMap.put("impression_id", ((C28698a) UIView.this.mView).getImpressionId());
                    eVar.mo49839a("params", hashMap);
                    UIView.this.mContext.f67064e.mo49834a(eVar);
                }
            }

            public final void onViewDetachedFromWindow(View view) {
                if (view == UIView.this.mView && UIView.this.mEvents != null && UIView.this.mEvents.containsKey("detach")) {
                    C28727e eVar = new C28727e(UIView.this.getSign(), "detach");
                    HashMap<String, Object> hashMap = new HashMap<>();
                    hashMap.put("impression_id", ((C28698a) UIView.this.mView).getImpressionId());
                    eVar.mo49839a("params", hashMap);
                    UIView.this.mContext.f67064e.mo49834a(eVar);
                }
            }
        });
        return a;
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI, com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public void updateAttributes(C28716v vVar) {
        ReadableMap readableMap = vVar.f67715a;
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            if (nextKey.equals("impression_id")) {
                ((C28698a) this.mView).setImpressionId(readableMap.getString(nextKey));
                return;
            }
        }
        super.updateAttributes(vVar);
    }
}
