package com.lynx.tasm.behavior.p2052ui.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.lynx.tasm.behavior.p2052ui.AbstractC28586a;

/* renamed from: com.lynx.tasm.behavior.ui.view.a */
public class C28698a extends ViewGroup implements AbstractC28586a.AbstractC28587a {

    /* renamed from: a */
    private String f67688a;

    /* renamed from: b */
    private AbstractC28586a f67689b;

    static {
        Covode.recordClassIndex(34783);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    public String getImpressionId() {
        return this.f67688a;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public boolean hasOverlappingRendering() {
        AbstractC28586a aVar = this.f67689b;
        if (aVar != null) {
            return aVar.hasOverlappingRendering();
        }
        return super.hasOverlappingRendering();
    }

    @Override // com.lynx.tasm.behavior.p2052ui.AbstractC28586a.AbstractC28587a
    public void bindDrawChildHook(AbstractC28586a aVar) {
        this.f67689b = aVar;
    }

    public void setChildrenDrawingOrderEnabled(boolean z) {
        super.setChildrenDrawingOrderEnabled(z);
    }

    public void setImpressionId(String str) {
        this.f67688a = str;
    }

    public C28698a(Context context) {
        super(context);
        MethodCollector.m26663i(1083);
        MethodCollector.m26664o(1083);
    }

    public void dispatchDraw(Canvas canvas) {
        AbstractC28586a aVar = this.f67689b;
        if (aVar != null) {
            aVar.beforeDispatchDraw(canvas);
        }
        super.dispatchDraw(canvas);
        AbstractC28586a aVar2 = this.f67689b;
        if (aVar2 != null) {
            aVar2.afterDispatchDraw(canvas);
        }
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i, int i2) {
        AbstractC28586a aVar = this.f67689b;
        if (aVar != null) {
            return aVar.getChildDrawingOrder(i, i2);
        }
        return super.getChildDrawingOrder(i, i2);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j) {
        boolean drawChild;
        Rect beforeDrawChild;
        AbstractC28586a aVar = this.f67689b;
        if (aVar == null || (beforeDrawChild = aVar.beforeDrawChild(canvas, view, j)) == null) {
            drawChild = super.drawChild(canvas, view, j);
        } else {
            canvas.save();
            canvas.clipRect(beforeDrawChild);
            drawChild = super.drawChild(canvas, view, j);
            canvas.restore();
        }
        AbstractC28586a aVar2 = this.f67689b;
        if (aVar2 != null) {
            aVar2.afterDrawChild(canvas, view, j);
        }
        return drawChild;
    }
}
