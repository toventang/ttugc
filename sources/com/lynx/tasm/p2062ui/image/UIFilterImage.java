package com.lynx.tasm.p2062ui.image;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.facebook.drawee.p1845a.p1846a.C24182c;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableMapKeySetIterator;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.AbstractC28520j;
import com.lynx.tasm.behavior.AbstractC28525m;
import com.lynx.tasm.behavior.C28716v;
import com.lynx.tasm.behavior.p2052ui.UIBody;
import com.lynx.tasm.p2054c.C28725c;
import com.lynx.tasm.p2054c.C28728f;
import com.lynx.tasm.utils.C28930n;
import com.lynx.tasm.utils.ColorUtils;

/* renamed from: com.lynx.tasm.ui.image.UIFilterImage */
public class UIFilterImage extends UIImage<FrescoFilterImageView> {
    static {
        Covode.recordClassIndex(34985);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI, com.lynx.tasm.behavior.p2052ui.LynxBaseUI, com.lynx.tasm.p2062ui.image.UIImage, com.lynx.tasm.behavior.p2052ui.image.AbsUIImage
    public void dispatchProperties(C28716v vVar) {
        ReadableMap readableMap = vVar.f67715a;
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            if (nextKey.hashCode() == -992552514 && nextKey.equals("drop-shadow")) {
                setDropShadow(readableMap.getString(nextKey));
            } else {
                super.dispatchProperties(vVar);
            }
        }
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI, com.lynx.tasm.behavior.p2052ui.LynxBaseUI, com.lynx.tasm.p2062ui.image.UIImage
    public void onLayoutUpdated() {
        super.onLayoutUpdated();
        ((FrescoFilterImageView) this.mView).markShadowDirty();
    }

    public UIFilterImage(AbstractC28520j jVar) {
        super(jVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public FrescoFilterImageView createView(Context context) {
        this.f68174a = C24182c.m45843b();
        FrescoFilterImageView frescoFilterImageView = new FrescoFilterImageView(context, this.f68174a, null, null);
        frescoFilterImageView.setImageLoaderCallback(new C28890d() {
            /* class com.lynx.tasm.p2062ui.image.UIFilterImage.C288681 */

            static {
                Covode.recordClassIndex(34988);
            }

            @Override // com.lynx.tasm.p2062ui.image.C28890d
            /* renamed from: a */
            public final void mo50007a(String str) {
                C28725c cVar = new C28725c(UIFilterImage.this.getSign(), "error");
                cVar.mo49838a("errMsg", str);
                UIFilterImage.this.mContext.f67064e.mo49834a(cVar);
                UIFilterImage.this.mContext.f67064e.mo49835a(new C28728f(UIFilterImage.this.getSign()));
            }

            @Override // com.lynx.tasm.p2062ui.image.C28890d
            /* renamed from: a */
            public final void mo50006a(int i, int i2) {
                if (UIFilterImage.this.mEvents != null && UIFilterImage.this.mEvents.containsKey("load")) {
                    C28725c cVar = new C28725c(UIFilterImage.this.getSign(), "load");
                    cVar.mo49838a("height", Integer.valueOf(i2));
                    cVar.mo49838a("width", Integer.valueOf(i));
                    UIFilterImage.this.mContext.f67064e.mo49834a(cVar);
                }
            }
        });
        return frescoFilterImageView;
    }

    @AbstractC28525m(mo49059a = "drop-shadow")
    public void setDropShadow(String str) {
        if (str == null) {
            ((FrescoFilterImageView) this.mView).setShadowOffsetX(0);
            ((FrescoFilterImageView) this.mView).setShadowOffsetY(0);
            ((FrescoFilterImageView) this.mView).setShadowColor(0);
            ((FrescoFilterImageView) this.mView).setShadowRadius(0);
            return;
        }
        String[] split = str.split(" +");
        try {
            if (split.length == 4) {
                UIBody uIBody = this.mContext.f67068i;
                ((FrescoFilterImageView) this.mView).setShadowOffsetX(Math.round(C28930n.m57955a(split[0], uIBody.mFontSize, this.mFontSize, (float) uIBody.getWidth(), (float) uIBody.getHeight(), 0.0f, this.mContext.f67075p)));
                ((FrescoFilterImageView) this.mView).setShadowOffsetY(Math.round(C28930n.m57955a(split[1], uIBody.mFontSize, this.mFontSize, (float) uIBody.getWidth(), (float) uIBody.getHeight(), 0.0f, this.mContext.f67075p)));
                ((FrescoFilterImageView) this.mView).setShadowRadius(Math.round(C28930n.m57955a(split[2], uIBody.mFontSize, this.mFontSize, (float) uIBody.getWidth(), (float) uIBody.getHeight(), 0.0f, this.mContext.f67075p)));
                ((FrescoFilterImageView) this.mView).setShadowColor(ColorUtils.m57910a(split[3]));
                return;
            }
        } catch (Exception unused) {
            if (1 == 0) {
                return;
            }
        }
        LLog.m56856a(5, "UIShadowImage", "Parse error for drop-shadow!");
    }
}
