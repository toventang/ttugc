package com.lynx.tasm.p2062ui.image;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.facebook.drawee.p1845a.p1846a.C24182c;
import com.facebook.drawee.p1851c.AbstractC24198b;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableMapKeySetIterator;
import com.lynx.tasm.behavior.AbstractC28520j;
import com.lynx.tasm.behavior.AbstractC28525m;
import com.lynx.tasm.behavior.C28716v;
import com.lynx.tasm.behavior.p2052ui.UIBody;
import com.lynx.tasm.behavior.p2052ui.image.AbsUIImage;
import com.lynx.tasm.p2054c.C28725c;
import com.lynx.tasm.p2054c.C28728f;
import com.lynx.tasm.p2062ui.image.FrescoImageView;
import com.lynx.tasm.utils.C28930n;

/* renamed from: com.lynx.tasm.ui.image.UIImage */
public class UIImage<T extends FrescoImageView> extends AbsUIImage<T> {

    /* renamed from: a */
    protected AbstractC24198b f68174a;

    /* renamed from: b */
    public int f68175b;

    /* renamed from: c */
    public int f68176c;

    /* renamed from: d */
    public String f68177d;

    /* renamed from: e */
    private boolean f68178e;

    /* renamed from: f */
    private boolean f68179f;

    /* renamed from: g */
    private boolean f68180g;

    static {
        Covode.recordClassIndex(34989);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI, com.lynx.tasm.behavior.p2052ui.LynxBaseUI, com.lynx.tasm.behavior.p2052ui.image.AbsUIImage
    public void dispatchProperties(C28716v vVar) {
        ReadableMap readableMap = vVar.f67715a;
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            boolean z = false;
            int i = 0;
            boolean z2 = false;
            boolean z3 = false;
            switch (nextKey.hashCode()) {
                case -1937917490:
                    if (nextKey.equals("cap-insets-scale")) {
                        setCapInsetsScale(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case -1338903714:
                    if (nextKey.equals("skip-redirection")) {
                        if (!readableMap.isNull(nextKey)) {
                            z = readableMap.getBoolean(nextKey, false);
                        }
                        setSkipRedirection(z);
                        continue;
                    }
                    break;
                case -1138223116:
                    if (nextKey.equals("image-config")) {
                        setImageConfig(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case -602643660:
                    if (nextKey.equals("fresco-nine-patch")) {
                        if (!readableMap.isNull(nextKey)) {
                            z3 = readableMap.getBoolean(nextKey, false);
                        }
                        setFrescoNinePatch(z3);
                        continue;
                    }
                    break;
                case 313009824:
                    if (nextKey.equals("local-cache")) {
                        setLocalCache(readableMap.isNull(nextKey) ? null : Boolean.valueOf(readableMap.getBoolean(nextKey, false)));
                        continue;
                    }
                    break;
                case 512852970:
                    if (nextKey.equals("subsample")) {
                        setSubSample(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case 516005201:
                    if (nextKey.equals("cap-insets")) {
                        setCapInsetsBackUp(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case 1090746891:
                    if (nextKey.equals("fresco-visible")) {
                        setFrescoVisible(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case 1245269388:
                    if (nextKey.equals("fresco-attach")) {
                        setFrescoAttach(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case 1672916293:
                    if (nextKey.equals("fix-fresco-bug")) {
                        if (!readableMap.isNull(nextKey)) {
                            z2 = readableMap.getBoolean(nextKey, false);
                        }
                        fixFrescoWebPBug(z2);
                        continue;
                    }
                    break;
                case 1941332754:
                    if (nextKey.equals("visibility")) {
                        if (!readableMap.isNull(nextKey)) {
                            i = readableMap.getInt(nextKey, 0);
                        }
                        setVisibility(i);
                        continue;
                    }
                    break;
            }
            super.dispatchProperties(vVar);
        }
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public void renderIfNeeded() {
        ((FrescoImageView) this.mView).maybeUpdateView();
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public void destroy() {
        super.destroy();
        ((FrescoImageView) this.mView).destroy();
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI, com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public void onDetach() {
        super.onDetach();
        ((FrescoImageView) this.mView).destroy();
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI, com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public void onLayoutUpdated() {
        super.onLayoutUpdated();
        int i = this.mPaddingLeft + this.mBorderLeftWidth;
        int i2 = this.mPaddingRight + this.mBorderRightWidth;
        int i3 = this.mPaddingTop + this.mBorderTopWidth;
        int i4 = this.mPaddingBottom + this.mBorderBottomWidth;
        if ((this.f68176c < getWidth() || this.f68175b < getHeight()) && !hasAnimationRunning()) {
            ((FrescoImageView) this.mView).markDirty();
        }
        ((FrescoImageView) this.mView).setPadding(i, i3, i2, i4);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public void onPropsUpdated() {
        if (this.f68179f) {
            if (this.f68180g) {
                ((FrescoImageView) this.mView).setSrcSkippingRedirection(this.f68177d);
            } else {
                ((FrescoImageView) this.mView).setSrc(this.f68177d);
            }
            this.f68179f = false;
        }
        ((FrescoImageView) this.mView).maybeUpdateView();
    }

    public UIImage(AbstractC28520j jVar) {
        super(jVar);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.image.AbsUIImage
    @AbstractC28525m(mo49059a = "cap-insets")
    public void setCapInsetsBackUp(String str) {
        setCapInsets(str);
    }

    @AbstractC28525m(mo49059a = "skip-redirection", mo49064f = false)
    public void setSkipRedirection(boolean z) {
        this.f68180g = z;
    }

    @Override // com.lynx.tasm.behavior.p2052ui.image.AbsUIImage
    public void setCoverStart(boolean z) {
        ((FrescoImageView) this.mView).setCoverStart(z);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.image.AbsUIImage
    public void setPlaceholder(String str) {
        ((FrescoImageView) this.mView).setPlaceholder(str);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.image.AbsUIImage
    public void setRepeat(boolean z) {
        ((FrescoImageView) this.mView).setRepeat(z);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.image.AbsUIImage
    public void setSource(String str) {
        this.f68177d = str;
        this.f68179f = true;
    }

    @AbstractC28525m(mo49059a = "fix-fresco-bug")
    public void fixFrescoWebPBug(boolean z) {
        if (this.mView != null) {
            ((FrescoImageView) this.mView).fixFrescoWebPBug(z);
        }
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public void onBorderRadiusUpdated(int i) {
        ((FrescoImageView) this.mView).setBorderRadius(this.mLynxBackground.mo49780d());
    }

    @Override // com.lynx.tasm.behavior.p2052ui.image.AbsUIImage
    public void setDisableDefaultPlaceholder(boolean z) {
        if (this.mView != null) {
            ((FrescoImageView) this.mView).setDisableDefaultPlaceHolder(z);
        }
    }

    @AbstractC28525m(mo49059a = "fresco-nine-patch", mo49064f = false)
    public void setFrescoNinePatch(boolean z) {
        if (this.mView != null) {
            ((FrescoImageView) this.mView).setFrescoNinePatch(z);
        }
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    @AbstractC28525m(mo49059a = "image-config")
    public void setImageConfig(String str) {
        super.setImageConfig(str);
        ((FrescoImageView) this.mView).setBitmapConfig(this.mBitmapConfig);
        invalidate();
    }

    @Override // com.lynx.tasm.behavior.p2052ui.image.AbsUIImage
    public void setLoopCount(int i) {
        if (i <= 0) {
            i = 0;
        }
        ((FrescoImageView) this.mView).setLoopCount(i);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.image.AbsUIImage
    public void setObjectFit(String str) {
        ((FrescoImageView) this.mView).setScaleType(C28894g.m57881a(str));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public T createView(Context context) {
        this.f68174a = C24182c.m45843b();
        T t = (T) new FrescoImageView(context, this.f68174a, null, null);
        t.setNoSubSampleMode(this.f68178e);
        t.setImageLoaderCallback(new C28890d() {
            /* class com.lynx.tasm.p2062ui.image.UIImage.C288691 */

            static {
                Covode.recordClassIndex(34992);
            }

            @Override // com.lynx.tasm.p2062ui.image.C28890d
            /* renamed from: a */
            public final void mo50007a(String str) {
                C28725c cVar = new C28725c(UIImage.this.getSign(), "error");
                cVar.mo49838a("errMsg", str);
                UIImage.this.mContext.f67064e.mo49834a(cVar);
                UIImage.this.mContext.f67064e.mo49835a(new C28728f(UIImage.this.getSign()));
                UIImage.this.mContext.mo49039a(UIImage.this.f68177d, "image", str);
            }

            @Override // com.lynx.tasm.p2062ui.image.C28890d
            /* renamed from: b */
            public final void mo50080b(int i, int i2) {
                UIImage.this.f68176c = i;
                UIImage.this.f68175b = i2;
            }

            @Override // com.lynx.tasm.p2062ui.image.C28890d
            /* renamed from: a */
            public final void mo50006a(int i, int i2) {
                if (UIImage.this.mEvents != null && UIImage.this.mEvents.containsKey("load")) {
                    C28725c cVar = new C28725c(UIImage.this.getSign(), "load");
                    cVar.mo49838a("height", Integer.valueOf(i2));
                    cVar.mo49838a("width", Integer.valueOf(i));
                    UIImage.this.mContext.f67064e.mo49834a(cVar);
                }
            }
        });
        return t;
    }

    @Override // com.lynx.tasm.behavior.p2052ui.image.AbsUIImage
    public void setCapInsets(String str) {
        if (str == null || str.equalsIgnoreCase("")) {
            ((FrescoImageView) this.mView).setCapInsets(null);
        } else {
            ((FrescoImageView) this.mView).setCapInsets(str);
        }
    }

    @Override // com.lynx.tasm.behavior.p2052ui.image.AbsUIImage
    @AbstractC28525m(mo49059a = "cap-insets-scale")
    public void setCapInsetsScale(String str) {
        if (str == null || str.equalsIgnoreCase("")) {
            ((FrescoImageView) this.mView).setCapInsetsScale(null);
        } else {
            ((FrescoImageView) this.mView).setCapInsetsScale(str);
        }
    }

    @AbstractC28525m(mo49059a = "local-cache")
    public void setLocalCache(Boolean bool) {
        if (this.mView != null) {
            if (bool == null) {
                ((FrescoImageView) this.mView).setLocalCache(false);
            }
            ((FrescoImageView) this.mView).setLocalCache(bool.booleanValue());
        }
    }

    @Override // com.lynx.tasm.behavior.p2052ui.image.AbsUIImage
    public void setPreFetchHeight(String str) {
        ((FrescoImageView) this.mView).setPreFetchHeight(C28930n.m57955a(str, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, this.mContext.f67075p));
    }

    @Override // com.lynx.tasm.behavior.p2052ui.image.AbsUIImage
    public void setPreFetchWidth(String str) {
        ((FrescoImageView) this.mView).setPreFetchWidth(C28930n.m57955a(str, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, this.mContext.f67075p));
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI
    @AbstractC28525m(mo49059a = "visibility")
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (((FrescoImageView) this.mView).mIsFrescoVisible) {
            ((FrescoImageView) this.mView).setFrescoVisible();
        }
    }

    @Override // com.lynx.tasm.behavior.p2052ui.image.AbsUIImage
    public void setBlurRadius(String str) {
        UIBody uIBody = this.mContext.f67068i;
        ((FrescoImageView) this.mView).setBlurRadius(Math.round(C28930n.m57956a(str, uIBody.mFontSize, this.mFontSize, (float) uIBody.getWidth(), (float) uIBody.getHeight(), this.mContext.f67075p)));
    }

    @AbstractC28525m(mo49059a = "fresco-attach")
    public void setFrescoAttach(String str) {
        if (str == null) {
            return;
        }
        if (str.equalsIgnoreCase("true") || str.equalsIgnoreCase("yes")) {
            ((FrescoImageView) this.mView).mIsFrescoAttach = true;
            ((FrescoImageView) this.mView).setFrescoAttach();
        }
    }

    @AbstractC28525m(mo49059a = "fresco-visible")
    public void setFrescoVisible(String str) {
        if (str == null) {
            return;
        }
        if (str.equalsIgnoreCase("true") || str.equalsIgnoreCase("yes")) {
            ((FrescoImageView) this.mView).mIsFrescoVisible = true;
            ((FrescoImageView) this.mView).setFrescoVisible();
        }
    }

    @AbstractC28525m(mo49059a = "subsample")
    public void setSubSample(String str) {
        if (str == null || (!str.equalsIgnoreCase("false") && !str.equalsIgnoreCase("no"))) {
            this.f68178e = false;
        } else {
            this.f68178e = true;
        }
        if (this.mView != null) {
            ((FrescoImageView) this.mView).setNoSubSampleMode(this.f68178e);
        }
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public void onBeforeAnimation(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i3 > this.f68176c || i4 > this.f68175b) {
            ((FrescoImageView) this.mView).tryFetchImage(i3, i4, i5, i6, i7, i8);
        }
    }
}
