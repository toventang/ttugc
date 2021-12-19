package com.bytedance.android.livesdk.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.ArrayList;
import java.util.List;

public class GestureDetectLayout extends FrameLayout {

    /* renamed from: a */
    public List<View.OnTouchListener> f27181a = new ArrayList();

    /* renamed from: b */
    private List<View.OnTouchListener> f27182b = new ArrayList();

    /* renamed from: c */
    private List<View.OnTouchListener> f27183c = new ArrayList();

    /* renamed from: d */
    private AbstractC11348a f27184d;

    /* renamed from: e */
    private boolean f27185e = false;

    /* renamed from: com.bytedance.android.livesdk.widget.GestureDetectLayout$a */
    public interface AbstractC11348a {
        static {
            Covode.recordClassIndex(12996);
        }

        /* renamed from: a */
        void mo14014a(int i, int i2);
    }

    static {
        Covode.recordClassIndex(12995);
    }

    /* renamed from: a */
    public final void mo18160a() {
        this.f27183c.clear();
        this.f27182b.clear();
        this.f27181a.clear();
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
    }

    public void setInterceptTouchEvent(boolean z) {
        this.f27185e = z;
    }

    public void setOnSizeChangedListener(AbstractC11348a aVar) {
        this.f27184d = aVar;
    }

    /* renamed from: a */
    public final void mo18161a(View.OnTouchListener onTouchListener) {
        if (onTouchListener != null) {
            this.f27183c.add(onTouchListener);
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        for (int size = this.f27182b.size() - 1; size >= 0; size--) {
            this.f27182b.get(size).onTouch(this, motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        for (int size = this.f27183c.size() - 1; size >= 0; size--) {
            this.f27183c.get(size).onTouch(this, motionEvent);
        }
        return true;
    }

    public GestureDetectLayout(Context context) {
        super(context);
        MethodCollector.m26663i(9218);
        MethodCollector.m26664o(9218);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        for (int size = this.f27181a.size() - 1; size >= 0; size--) {
            this.f27181a.get(size).onTouch(this, motionEvent);
        }
        if (this.f27185e || super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public GestureDetectLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.m26663i(9369);
        MethodCollector.m26664o(9369);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        AbstractC11348a aVar = this.f27184d;
        if (aVar != null) {
            aVar.mo14014a(i2, i4);
        }
    }
}
