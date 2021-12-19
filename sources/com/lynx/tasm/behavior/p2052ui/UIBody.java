package com.lynx.tasm.behavior.p2052ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.lynx.tasm.base.TraceEvent;
import com.lynx.tasm.behavior.AbstractC28520j;
import com.lynx.tasm.behavior.p2052ui.AbstractC28586a;

/* renamed from: com.lynx.tasm.behavior.ui.UIBody */
public class UIBody extends UIGroup<C28581a> {

    /* renamed from: a */
    public C28581a f67258a;

    /* renamed from: b */
    public C28598b f67259b;

    static {
        Covode.recordClassIndex(34606);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public boolean isStackingContextNode() {
        return true;
    }

    /* renamed from: com.lynx.tasm.behavior.ui.UIBody$a */
    public static class C28581a extends FrameLayout implements AbstractC28586a.AbstractC28587a {
        public C28598b mAccessibilityNodeProvider;
        private AbstractC28586a mDrawChildHook;
        private boolean mHasMeaningfulLayout;
        private boolean mHasMeaningfulPaint;
        private long mMeaningfulPaintTiming;

        static {
            Covode.recordClassIndex(34610);
        }

        /* access modifiers changed from: package-private */
        public void notifyMeaningfulLayout() {
            this.mHasMeaningfulLayout = true;
        }

        public long getMeaningfulPaintTiming() {
            return this.mMeaningfulPaintTiming;
        }

        /* access modifiers changed from: package-private */
        public void clearMeaningfulFlag() {
            this.mHasMeaningfulLayout = false;
            this.mHasMeaningfulPaint = false;
            this.mMeaningfulPaintTiming = 0;
        }

        @Override // com.lynx.tasm.behavior.p2052ui.AbstractC28586a.AbstractC28587a
        public void bindDrawChildHook(AbstractC28586a aVar) {
            this.mDrawChildHook = aVar;
        }

        public void setChildrenDrawingOrderEnabled(boolean z) {
            super.setChildrenDrawingOrderEnabled(z);
        }

        public C28581a(Context context) {
            super(context);
            MethodCollector.m26663i(1642);
            MethodCollector.m26664o(1642);
        }

        /* access modifiers changed from: protected */
        public void dispatchDraw(Canvas canvas) {
            TraceEvent.m56864a(1, "DispatchDraw");
            AbstractC28586a aVar = this.mDrawChildHook;
            if (aVar != null) {
                aVar.beforeDispatchDraw(canvas);
            }
            super.dispatchDraw(canvas);
            AbstractC28586a aVar2 = this.mDrawChildHook;
            if (aVar2 != null) {
                aVar2.afterDispatchDraw(canvas);
            }
            TraceEvent.m56869b(1, "DispatchDraw");
            if (this.mHasMeaningfulLayout && !this.mHasMeaningfulPaint) {
                TraceEvent.m56867a("FirstMeaningfulPaint", "#0CCE6A");
                this.mMeaningfulPaintTiming = System.currentTimeMillis();
                this.mHasMeaningfulPaint = true;
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0088, code lost:
            r3 = r8.getAction();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0090, code lost:
            if (r3 == 7) goto L_0x00a8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x0092, code lost:
            if (r3 == 9) goto L_0x009f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x0096, code lost:
            if (r3 == 10) goto L_0x0099;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x0098, code lost:
            return true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x0099, code lost:
            r5.f67333e = null;
            r5.mo49426a(r4, r8);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x009f, code lost:
            r8.setAction(9);
            r5.mo49426a(r4, r8);
            r5.f67333e = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x00aa, code lost:
            if (r5.f67333e != null) goto L_0x00b0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:0x00ac, code lost:
            r5.mo49426a(r4, r8);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b0, code lost:
            r8.setAction(9);
            r5.mo49426a(r4, r8);
            r5.f67333e = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x00bc, code lost:
            if (r4 >= 0) goto L_0x0088;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean dispatchHoverEvent(android.view.MotionEvent r8) {
            /*
            // Method dump skipped, instructions count: 197
            */
            throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.behavior.p2052ui.UIBody.C28581a.dispatchHoverEvent(android.view.MotionEvent):boolean");
        }

        /* access modifiers changed from: protected */
        public int getChildDrawingOrder(int i, int i2) {
            AbstractC28586a aVar = this.mDrawChildHook;
            if (aVar != null) {
                return aVar.getChildDrawingOrder(i, i2);
            }
            return super.getChildDrawingOrder(i, i2);
        }

        public boolean requestSendAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            if (accessibilityEvent.getEventType() == 2048) {
                accessibilityEvent.setSource(this);
            }
            return super.requestSendAccessibilityEvent(view, accessibilityEvent);
        }

        public C28581a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            MethodCollector.m26663i(1727);
            MethodCollector.m26664o(1727);
        }

        /* access modifiers changed from: protected */
        public boolean drawChild(Canvas canvas, View view, long j) {
            boolean drawChild;
            Rect beforeDrawChild;
            AbstractC28586a aVar = this.mDrawChildHook;
            if (aVar == null || (beforeDrawChild = aVar.beforeDrawChild(canvas, view, j)) == null) {
                drawChild = super.drawChild(canvas, view, j);
            } else {
                canvas.save();
                canvas.clipRect(beforeDrawChild);
                drawChild = super.drawChild(canvas, view, j);
                canvas.restore();
            }
            AbstractC28586a aVar2 = this.mDrawChildHook;
            if (aVar2 != null) {
                aVar2.afterDrawChild(canvas, view, j);
            }
            return drawChild;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.lynx.tasm.behavior.p2052ui.UIGroup
    public View getRealParentView() {
        return this.f67258a;
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI, com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public void onLayoutUpdated() {
        super.onLayoutUpdated();
        this.f67258a.notifyMeaningfulLayout();
    }

    @Override // com.lynx.tasm.behavior.p2052ui.UIGroup
    public void removeAll() {
        super.removeAll();
        this.f67258a.clearMeaningfulFlag();
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI, com.lynx.tasm.behavior.p2052ui.LynxBaseUI, com.lynx.tasm.behavior.p2052ui.UIGroup
    public void initialize() {
        super.initialize();
        C28581a aVar = this.f67258a;
        if (aVar != null) {
            if (this.f67259b == null) {
                this.f67259b = new C28598b(this);
            }
            aVar.setAccessibilityDelegate(new View.AccessibilityDelegate() {
                /* class com.lynx.tasm.behavior.p2052ui.UIBody.C285801 */

                static {
                    Covode.recordClassIndex(34609);
                }

                public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
                    return UIBody.this.f67259b;
                }
            });
            aVar.mAccessibilityNodeProvider = this.f67259b;
            this.mAccessibilityElementStatus = 1;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI
    public /* bridge */ /* synthetic */ View createView(Context context) {
        return this.f67258a;
    }

    public UIBody(AbstractC28520j jVar, C28581a aVar) {
        super(jVar);
        this.f67258a = aVar;
        initialize();
    }
}
