package com.lynx.tasm.behavior.p2052ui.text;

import android.content.Context;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.pickview.p1392b.C19386b;
import com.lynx.react.bridge.AbstractC28367a;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableMapKeySetIterator;
import com.lynx.react.bridge.ReadableType;
import com.lynx.tasm.behavior.AbstractC28520j;
import com.lynx.tasm.behavior.AbstractC28525m;
import com.lynx.tasm.behavior.C28716v;
import com.lynx.tasm.behavior.p2048a.AbstractC28464a;
import com.lynx.tasm.behavior.p2052ui.LynxUI;
import com.lynx.tasm.behavior.shadow.text.C28572q;

/* renamed from: com.lynx.tasm.behavior.ui.text.UIText */
public class UIText extends LynxUI<AndroidText> {
    static {
        Covode.recordClassIndex(34748);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI, com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public void dispatchProperties(C28716v vVar) {
        ReadableMap readableMap = vVar.f67715a;
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            int hashCode = nextKey.hashCode();
            if (hashCode != 94842723) {
                if (hashCode == 315007413 && nextKey.equals("accessibility-label")) {
                    setAccessibilityLabel(readableMap.getDynamic(nextKey));
                }
            } else if (nextKey.equals(C19386b.f45894a)) {
                setColor(readableMap.getDynamic(nextKey));
            }
            super.dispatchProperties(vVar);
        }
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public CharSequence getAccessibilityLabel() {
        CharSequence accessibilityLabel = super.getAccessibilityLabel();
        if (!TextUtils.isEmpty(accessibilityLabel)) {
            return accessibilityLabel;
        }
        return ((AndroidText) this.mView).getText();
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI, com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public void onLayoutUpdated() {
        super.onLayoutUpdated();
        int i = this.mPaddingLeft + this.mBorderLeftWidth;
        int i2 = this.mPaddingRight + this.mBorderRightWidth;
        ((AndroidText) this.mView).setPadding(i, this.mPaddingTop + this.mBorderTopWidth, i2, this.mPaddingBottom + this.mBorderBottomWidth);
    }

    public UIText(AbstractC28520j jVar) {
        super(jVar);
        this.mAccessibilityElementStatus = 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AndroidText createView(Context context) {
        return new AndroidText(context);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public void updateExtraData(Object obj) {
        if (obj instanceof C28572q) {
            ((AndroidText) this.mView).setTextBundle((C28572q) obj);
        }
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI, com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    @AbstractC28525m(mo49059a = "accessibility-label")
    public void setAccessibilityLabel(AbstractC28367a aVar) {
        super.setAccessibilityLabel(aVar);
        if (this.mView != null) {
            ((AndroidText) this.mView).setFocusable(true);
            ((AndroidText) this.mView).setContentDescription(getAccessibilityLabel());
        }
    }

    @AbstractC28525m(mo49059a = C19386b.f45894a)
    public void setColor(AbstractC28367a aVar) {
        if (aVar.mo48559h() == ReadableType.Array) {
            ((AndroidText) this.mView).setTextGradient(aVar.mo48557f());
        } else {
            ((AndroidText) this.mView).setTextGradient((ReadableArray) null);
        }
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public AbstractC28464a hitTest(float f, float f2) {
        Spanned spanned;
        if (this.mView == null) {
            return this;
        }
        Layout layout = ((AndroidText) this.mView).mTextLayout;
        AndroidText androidText = (AndroidText) this.mView;
        if (androidText == null || !(androidText.getText() instanceof Spanned)) {
            spanned = null;
        } else {
            spanned = (Spanned) androidText.getText();
        }
        return C28677b.m57395a(f, f2, this, layout, spanned);
    }
}
