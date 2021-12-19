package com.lynx.tasm.behavior.p2052ui;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableMapKeySetIterator;
import com.lynx.tasm.base.TraceEvent;
import com.lynx.tasm.behavior.AbstractC28520j;
import com.lynx.tasm.behavior.AbstractC28525m;
import com.lynx.tasm.behavior.C28716v;
import com.lynx.tasm.behavior.p2052ui.utils.BackgroundDrawable;
import com.lynx.tasm.p2057f.p2058a.AbstractC28774a;
import com.lynx.tasm.p2057f.p2058a.C28777d;
import com.lynx.tasm.p2057f.p2058a.C28778e;
import com.lynx.tasm.p2057f.p2058a.C28779f;
import com.lynx.tasm.p2057f.p2058a.C28780g;

/* renamed from: com.lynx.tasm.behavior.ui.LynxFlattenUI */
public class LynxFlattenUI extends LynxBaseUI {

    /* renamed from: a */
    public float f67255a;

    /* renamed from: b */
    private AbstractC28774a f67256b;

    /* renamed from: c */
    private boolean f67257c;

    static {
        Covode.recordClassIndex(34600);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public void dispatchProperties(C28716v vVar) {
        ReadableMap readableMap = vVar.f67715a;
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            int hashCode = nextKey.hashCode();
            if (hashCode != -1267206133) {
                if (hashCode == 1052666732 && nextKey.equals("transform")) {
                    setTransform(readableMap.getArray(nextKey));
                }
            } else if (nextKey.equals("opacity")) {
                setAlpha(readableMap.isNull(nextKey) ? 1.0f : (float) readableMap.getDouble(nextKey, 1.0d));
            }
            super.dispatchProperties(vVar);
        }
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public float getTranslationX() {
        return 0.0f;
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public float getTranslationY() {
        return 0.0f;
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public float getTranslationZ() {
        return 0.0f;
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public boolean isFlatten() {
        return true;
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public void onAttach() {
        super.onAttach();
        invalidate();
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI, com.lynx.tasm.behavior.p2052ui.AbstractC28618d
    public void invalidate() {
        this.f67257c = false;
        if (this.mContext.f67077r) {
            if (this.mDrawParent != null) {
                this.mDrawParent.invalidate();
            }
        } else if (this.mParent != null) {
            this.mParent.invalidate();
        }
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public void measure() {
        for (LynxBaseUI lynxBaseUI : this.mChildren) {
            lynxBaseUI.measure();
        }
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI, com.lynx.tasm.behavior.p2052ui.AbstractC28618d
    public void requestLayout() {
        this.f67257c = false;
        if (this.mContext.f67077r) {
            if (this.mDrawParent != null) {
                this.mDrawParent.requestLayout();
            }
        } else if (this.mParent != null) {
            this.mParent.requestLayout();
        }
    }

    public LynxFlattenUI(AbstractC28520j jVar) {
        this(jVar, (byte) 0);
    }

    @AbstractC28525m(mo49059a = "opacity", mo49062d = 1.0f)
    public void setAlpha(float f) {
        this.f67255a = f;
        invalidate();
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    @AbstractC28525m(mo49059a = "transform")
    public void setTransform(ReadableArray readableArray) {
        super.setTransform(readableArray);
        invalidate();
    }

    /* renamed from: c */
    public void mo49320c(Canvas canvas) {
        BackgroundDrawable backgroundDrawable = this.mLynxBackground.f67659e;
        if (backgroundDrawable != null) {
            backgroundDrawable.setBounds(0, 0, getWidth(), getHeight());
            backgroundDrawable.draw(canvas);
            if (this.mContext.f67076q) {
                for (LynxBaseUI lynxBaseUI : this.mChildren) {
                    if (lynxBaseUI instanceof LynxFlattenUI) {
                        ((LynxFlattenUI) lynxBaseUI).mo49318a(canvas);
                    }
                }
            }
        } else if (this.mContext.f67076q) {
            for (LynxBaseUI lynxBaseUI2 : this.mChildren) {
                if (lynxBaseUI2 instanceof LynxFlattenUI) {
                    ((LynxFlattenUI) lynxBaseUI2).mo49318a(canvas);
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo49319b(Canvas canvas) {
        String str = this.mTagName + ".flatten.draw";
        TraceEvent.m56864a(0, str);
        if (this.f67255a <= 0.0f) {
            TraceEvent.m56869b(0, str);
            return;
        }
        int left = getLeft();
        int top = getTop();
        int i = 0;
        if (this.f67255a >= 1.0f) {
            if ((left | top) == 0) {
                if (this.mTransformRaw != null) {
                    int save = canvas.save();
                    m57150a(canvas, false);
                    i = save;
                }
                mo49320c(canvas);
                if (this.mTransformRaw != null) {
                    canvas.restoreToCount(i);
                }
            } else {
                int save2 = canvas.save();
                m57150a(canvas, true);
                if (getOverflow() != 0) {
                    Rect boundRectForOverflow = getBoundRectForOverflow();
                    if (boundRectForOverflow != null) {
                        canvas.clipRect(boundRectForOverflow);
                    }
                } else {
                    canvas.clipRect(new Rect(0, 0, getWidth(), getHeight()));
                }
                mo49320c(canvas);
                canvas.restoreToCount(save2);
            }
        } else if ((left | top) == 0) {
            canvas.saveLayerAlpha(0.0f, 0.0f, (float) getWidth(), (float) getHeight(), (int) (this.f67255a * 255.0f), 31);
            m57150a(canvas, false);
            mo49320c(canvas);
            canvas.restore();
        } else {
            m57150a(canvas, true);
            canvas.saveLayerAlpha(0.0f, 0.0f, (float) getWidth(), (float) getHeight(), (int) (this.f67255a * 255.0f), 31);
            mo49320c(canvas);
            canvas.restore();
            canvas.translate((float) (-left), (float) (-top));
        }
        TraceEvent.m56869b(0, str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo49318a(Canvas canvas) {
        boolean z = this.f67257c;
        this.f67257c = true;
        if (this.f67256b == null || !canvas.isHardwareAccelerated()) {
            mo49319b(canvas);
            return;
        }
        if (!z || !this.f67256b.mo49896b()) {
            AbstractC28774a aVar = this.f67256b;
            int left = getLeft() + getWidth();
            int top = getTop() + getHeight();
            int overflow = getOverflow();
            if (!(overflow != 3 && (overflow & 1) == 0 && (overflow & 2) == 0)) {
                LynxBaseUI lynxBaseUI = (LynxBaseUI) this.mParent;
                if (lynxBaseUI instanceof UIGroup) {
                    UIGroup uIGroup = (UIGroup) lynxBaseUI;
                    left = Math.max(left, uIGroup.getWidth());
                    top = Math.max(top, uIGroup.getHeight());
                    for (int childCount = uIGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        LynxBaseUI childAt = uIGroup.getChildAt(childCount);
                        left = Math.max(left, childAt.getLeft() + childAt.getWidth() + childAt.mMarginRight + uIGroup.mPaddingRight);
                        top = Math.max(top, childAt.getTop() + childAt.getHeight() + childAt.mMarginBottom + uIGroup.mPaddingBottom);
                    }
                }
            }
            aVar.mo49892a(left, top);
            Canvas b = aVar.mo49894b(left, top);
            try {
                mo49319b(b);
            } finally {
                aVar.mo49895b(b);
            }
        }
        if (this.f67256b.mo49896b()) {
            this.f67256b.mo49893a(canvas);
        }
    }

    private LynxFlattenUI(AbstractC28520j jVar, byte b) {
        super(jVar, null);
        AbstractC28774a dVar;
        this.f67255a = 1.0f;
        if (AbstractC28774a.f67849a) {
            if (Build.VERSION.SDK_INT >= 29) {
                dVar = new C28780g();
            } else if (Build.VERSION.SDK_INT >= 23) {
                dVar = new C28779f();
            } else if (Build.VERSION.SDK_INT >= 21) {
                dVar = new C28778e();
            } else {
                int i = Build.VERSION.SDK_INT;
                dVar = new C28777d();
            }
            dVar.mo49891a();
            this.f67256b = dVar;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0073 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m57150a(android.graphics.Canvas r9, boolean r10) {
        /*
        // Method dump skipped, instructions count: 282
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.behavior.p2052ui.LynxFlattenUI.m57150a(android.graphics.Canvas, boolean):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a7  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo49317a(int r7, int r8, android.graphics.Rect r9) {
        /*
        // Method dump skipped, instructions count: 209
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.behavior.p2052ui.LynxFlattenUI.mo49317a(int, int, android.graphics.Rect):void");
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public void setTransformData(float f, float f2, int[] iArr, float[] fArr) {
        super.setTransformData(f, f2, iArr, fArr);
        invalidate();
    }
}
