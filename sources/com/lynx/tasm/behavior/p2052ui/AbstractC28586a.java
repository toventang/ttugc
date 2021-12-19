package com.lynx.tasm.behavior.p2052ui;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import com.bytedance.covode.number.Covode;

/* renamed from: com.lynx.tasm.behavior.ui.a */
public interface AbstractC28586a {

    /* renamed from: com.lynx.tasm.behavior.ui.a$a */
    public interface AbstractC28587a {
        static {
            Covode.recordClassIndex(34622);
        }

        void bindDrawChildHook(AbstractC28586a aVar);
    }

    static {
        Covode.recordClassIndex(34621);
    }

    void afterDispatchDraw(Canvas canvas);

    void afterDrawChild(Canvas canvas, View view, long j);

    void beforeDispatchDraw(Canvas canvas);

    Rect beforeDrawChild(Canvas canvas, View view, long j);

    int getChildDrawingOrder(int i, int i2);

    boolean hasOverlappingRendering();
}
