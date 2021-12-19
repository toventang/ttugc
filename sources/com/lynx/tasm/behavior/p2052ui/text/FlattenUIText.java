package com.lynx.tasm.behavior.p2052ui.text;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
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
import com.lynx.tasm.behavior.p2052ui.LynxFlattenUI;
import com.lynx.tasm.behavior.p2052ui.p2053a.AbstractC28588a;
import com.lynx.tasm.behavior.p2052ui.p2053a.C28592e;
import com.lynx.tasm.behavior.p2052ui.p2053a.C28595g;
import com.lynx.tasm.behavior.shadow.text.C28572q;
import com.lynx.tasm.utils.C28929m;

/* renamed from: com.lynx.tasm.behavior.ui.text.FlattenUIText */
public class FlattenUIText extends LynxFlattenUI {

    /* renamed from: b */
    private Layout f67588b;

    /* renamed from: c */
    private boolean f67589c;

    /* renamed from: d */
    private AbstractC28588a f67590d;

    /* renamed from: e */
    private Drawable.Callback f67591e = new C28675a(this, (byte) 0);

    static {
        Covode.recordClassIndex(34744);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI, com.lynx.tasm.behavior.p2052ui.LynxFlattenUI
    public void dispatchProperties(C28716v vVar) {
        ReadableMap readableMap = vVar.f67715a;
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            if (nextKey.hashCode() == 94842723 && nextKey.equals(C19386b.f45894a)) {
                setColor(readableMap.getDynamic(nextKey));
            } else {
                super.dispatchProperties(vVar);
            }
        }
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public void onLayoutUpdated() {
        super.onLayoutUpdated();
        invalidate();
    }

    /* renamed from: a */
    public final CharSequence mo49734a() {
        Layout layout = this.f67588b;
        if (layout != null) {
            return layout.getText();
        }
        return null;
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public CharSequence getAccessibilityLabel() {
        CharSequence accessibilityLabel = super.getAccessibilityLabel();
        if (!TextUtils.isEmpty(accessibilityLabel)) {
            return accessibilityLabel;
        }
        return mo49734a();
    }

    /* renamed from: com.lynx.tasm.behavior.ui.text.FlattenUIText$a */
    class C28675a implements Drawable.Callback {
        static {
            Covode.recordClassIndex(34747);
        }

        public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        }

        public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        }

        private C28675a() {
        }

        public final void invalidateDrawable(Drawable drawable) {
            if (C28929m.m57950a()) {
                FlattenUIText.this.invalidate();
            }
        }

        /* synthetic */ C28675a(FlattenUIText flattenUIText, byte b) {
            this();
        }
    }

    public FlattenUIText(AbstractC28520j jVar) {
        super(jVar);
        this.mAccessibilityElementStatus = 1;
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxFlattenUI
    /* renamed from: c */
    public final void mo49320c(Canvas canvas) {
        super.mo49320c(canvas);
        if (this.f67588b != null) {
            int i = this.mPaddingLeft + this.mBorderLeftWidth;
            int i2 = this.mPaddingRight + this.mBorderRightWidth;
            int i3 = this.mPaddingTop + this.mBorderTopWidth;
            int i4 = this.mPaddingBottom + this.mBorderBottomWidth;
            canvas.save();
            if (getOverflow() != 0) {
                Rect boundRectForOverflow = getBoundRectForOverflow();
                if (boundRectForOverflow != null) {
                    canvas.clipRect(boundRectForOverflow);
                }
            } else {
                canvas.clipRect(i, i3, getWidth() - i2, getHeight() - i4);
            }
            canvas.translate((float) i, (float) i3);
            AbstractC28588a aVar = this.f67590d;
            if (aVar != null) {
                aVar.setBounds(new Rect(0, 0, this.f67588b.getWidth(), this.f67588b.getHeight()));
                this.f67588b.getPaint().setShader(this.f67590d.f67301a);
            } else {
                this.f67588b.getPaint().setShader(null);
            }
            this.f67588b.draw(canvas);
            canvas.restore();
        }
    }

    @AbstractC28525m(mo49059a = C19386b.f45894a)
    public void setColor(AbstractC28367a aVar) {
        if (aVar.mo48559h() == ReadableType.Array) {
            ReadableArray f = aVar.mo48557f();
            if (f == null || f.size() < 2) {
                this.f67590d = null;
            } else {
                int i = f.getInt(0);
                ReadableArray array = f.getArray(1);
                if (array == null) {
                    this.f67590d = null;
                } else if (i == 2) {
                    this.f67590d = new C28592e(array);
                } else if (i == 3) {
                    this.f67590d = new C28595g(array);
                }
            }
        } else {
            this.f67590d = null;
        }
        invalidate();
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public void updateExtraData(Object obj) {
        if (obj instanceof C28572q) {
            C28572q qVar = (C28572q) obj;
            if (this.f67589c && (mo49734a() instanceof Spanned)) {
                Spanned spanned = (Spanned) mo49734a();
                AbstractC28676a[] aVarArr = (AbstractC28676a[]) spanned.getSpans(0, spanned.length(), AbstractC28676a.class);
                for (AbstractC28676a aVar : aVarArr) {
                    aVar.mo49744b();
                    aVar.mo49743a((Drawable.Callback) null);
                }
            }
            this.f67588b = qVar.f67234b;
            boolean z = qVar.f67233a;
            this.f67589c = z;
            if (z && (mo49734a() instanceof Spanned)) {
                AbstractC28676a.m57388a((Spanned) mo49734a(), this.f67591e);
            }
            invalidate();
        }
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public AbstractC28464a hitTest(float f, float f2) {
        Spanned spanned;
        Layout layout = this.f67588b;
        if (layout == null || !(layout.getText() instanceof Spanned)) {
            spanned = null;
        } else {
            spanned = (Spanned) layout.getText();
        }
        return C28677b.m57395a(f, f2, this, layout, spanned);
    }
}
