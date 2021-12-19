package com.bytedance.android.livesdk.utils.crop;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class SwitchModeFrameLayout extends FrameLayout {

    /* renamed from: a */
    private AbstractC11255b f26941a;

    /* renamed from: com.bytedance.android.livesdk.utils.crop.SwitchModeFrameLayout$a */
    public static class C11254a implements AbstractC11255b {
        static {
            Covode.recordClassIndex(12886);
        }

        @Override // com.bytedance.android.livesdk.utils.crop.SwitchModeFrameLayout.AbstractC11255b
        /* renamed from: a */
        public void mo17983a(MotionEvent motionEvent) {
        }
    }

    /* renamed from: com.bytedance.android.livesdk.utils.crop.SwitchModeFrameLayout$b */
    public interface AbstractC11255b {
        static {
            Covode.recordClassIndex(12887);
        }

        /* renamed from: a */
        void mo17983a(MotionEvent motionEvent);
    }

    static {
        Covode.recordClassIndex(12885);
    }

    public void setIntercepter(AbstractC11255b bVar) {
        this.f26941a = bVar;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        AbstractC11255b bVar = this.f26941a;
        if (bVar != null) {
            bVar.mo17983a(motionEvent);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public SwitchModeFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.m26663i(9673);
        MethodCollector.m26664o(9673);
    }
}
