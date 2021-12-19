package com.lynx.tasm.behavior.p2052ui.text;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Picture;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.Spanned;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.p2052ui.p2053a.AbstractC28588a;
import com.lynx.tasm.behavior.p2052ui.p2053a.C28592e;
import com.lynx.tasm.behavior.p2052ui.p2053a.C28595g;
import com.lynx.tasm.behavior.shadow.text.C28572q;
import com.lynx.tasm.utils.C28929m;

/* renamed from: com.lynx.tasm.behavior.ui.text.AndroidText */
public class AndroidText extends View {
    private AbstractC28588a mGradient;
    protected boolean mHasImage;
    private int mOverflow = 0;
    private Picture mOverflowPicture = new Picture();
    private boolean mOverflowPictureDirty = true;
    private Rect mTextBounds = new Rect();
    protected Layout mTextLayout;

    static {
        Covode.recordClassIndex(34743);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    public Layout getTextLayout() {
        return this.mTextLayout;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        dispatchDetachImageSpan();
    }

    public CharSequence getText() {
        Layout layout = this.mTextLayout;
        if (layout != null) {
            return layout.getText();
        }
        return null;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.mHasImage && (getText() instanceof Spanned)) {
            AbstractC28676a.m57388a((Spanned) getText(), this);
        }
    }

    private void dispatchDetachImageSpan() {
        if (this.mHasImage && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            AbstractC28676a[] aVarArr = (AbstractC28676a[]) spanned.getSpans(0, spanned.length(), AbstractC28676a.class);
            for (AbstractC28676a aVar : aVarArr) {
                aVar.mo49744b();
                aVar.mo49743a((Drawable.Callback) null);
            }
        }
    }

    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        if (this.mHasImage && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (AbstractC28676a aVar : (AbstractC28676a[]) spanned.getSpans(0, spanned.length(), AbstractC28676a.class)) {
                aVar.mo49748e();
            }
        }
    }

    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        if (this.mHasImage && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (AbstractC28676a aVar : (AbstractC28676a[]) spanned.getSpans(0, spanned.length(), AbstractC28676a.class)) {
                aVar.mo49745c();
            }
        }
    }

    private void drawOverflowPicture() {
        if (this.mOverflowPictureDirty && this.mTextLayout != null) {
            if (this.mOverflowPicture == null) {
                this.mOverflowPicture = new Picture();
            }
            Canvas beginRecording = this.mOverflowPicture.beginRecording(this.mTextLayout.getWidth(), this.mTextLayout.getHeight());
            beginRecording.save();
            int i = Build.VERSION.SDK_INT;
            if (getClipBounds() != null) {
                beginRecording.clipRect(getClipBounds());
            }
            AbstractC28588a aVar = this.mGradient;
            if (aVar != null) {
                aVar.setBounds(this.mTextBounds);
                this.mTextLayout.getPaint().setShader(this.mGradient.f67301a);
            }
            this.mTextLayout.draw(beginRecording);
            beginRecording.restore();
            this.mOverflowPicture.endRecording();
            this.mOverflowPictureDirty = false;
        }
    }

    /* access modifiers changed from: protected */
    public Layout generateTextLayout(C28572q qVar) {
        return qVar.f67234b;
    }

    public void setOverflow(int i) {
        this.mOverflow = i;
    }

    public void setTextGradient(String str) {
        LLog.m56856a(6, "text-gradient", "setTextGradient(String) is deprecated, call this function has no effect");
    }

    public AndroidText(Context context) {
        super(context);
        MethodCollector.m26663i(2077);
        setFocusable(true);
        MethodCollector.m26664o(2077);
    }

    public void invalidateDrawable(Drawable drawable) {
        if (C28929m.m57950a()) {
            if (this.mHasImage && (getText() instanceof Spanned)) {
                Spanned spanned = (Spanned) getText();
                for (AbstractC28676a aVar : (AbstractC28676a[]) spanned.getSpans(0, spanned.length(), AbstractC28676a.class)) {
                    if (aVar.mo49742a() == drawable) {
                        invalidate();
                        this.mOverflowPictureDirty = true;
                    }
                }
            }
            super.invalidateDrawable(drawable);
        }
    }

    public void setTextGradient(ReadableArray readableArray) {
        if (readableArray == null) {
            this.mGradient = null;
        } else if (readableArray.size() < 2) {
            LLog.m56856a(6, "text-gradient", "native parser error, gradient array is less than 2 element");
        } else {
            int i = readableArray.getInt(0);
            ReadableArray array = readableArray.getArray(1);
            if (array == null) {
                LLog.m56856a(6, "text-gradient", "gradient arguments is null");
            } else if (i == 2) {
                this.mGradient = new C28592e(array);
            } else if (i == 3) {
                this.mGradient = new C28595g(array);
            }
        }
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        if (this.mHasImage && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (AbstractC28676a aVar : (AbstractC28676a[]) spanned.getSpans(0, spanned.length(), AbstractC28676a.class)) {
                if (aVar.mo49742a() == drawable) {
                    return true;
                }
            }
        }
        return super.verifyDrawable(drawable);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (this.mTextLayout != null) {
            canvas.save();
            canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
            if (this.mOverflow != 0) {
                drawOverflowPicture();
                canvas.drawPicture(this.mOverflowPicture);
            } else {
                AbstractC28588a aVar = this.mGradient;
                if (aVar != null) {
                    aVar.setBounds(this.mTextBounds);
                    this.mTextLayout.getPaint().setShader(this.mGradient.f67301a);
                } else {
                    this.mTextLayout.getPaint().setShader(null);
                }
                this.mTextLayout.draw(canvas);
            }
            canvas.restore();
        }
    }

    public void setTextBundle(C28572q qVar) {
        dispatchDetachImageSpan();
        this.mTextLayout = generateTextLayout(qVar);
        this.mTextBounds = new Rect(0, 0, this.mTextLayout.getWidth(), this.mTextLayout.getHeight());
        boolean z = qVar.f67233a;
        this.mHasImage = z;
        if (z && (getText() instanceof Spanned)) {
            AbstractC28676a.m57388a((Spanned) getText(), this);
        }
        setContentDescription(this.mTextLayout.getText());
        invalidate();
        this.mOverflowPictureDirty = true;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
    }

    public void setTextLayout(Layout layout, boolean z) {
        dispatchDetachImageSpan();
        this.mTextLayout = layout;
        this.mTextBounds = new Rect(0, 0, this.mTextLayout.getWidth(), this.mTextLayout.getHeight());
        this.mHasImage = z;
        if (z && (getText() instanceof Spanned)) {
            AbstractC28676a.m57388a((Spanned) getText(), this);
        }
        setContentDescription(this.mTextLayout.getText());
        invalidate();
        this.mOverflowPictureDirty = true;
    }
}
