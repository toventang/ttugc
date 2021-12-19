package com.p2082ss.android.ugc.aweme.shortvideo.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.TouchSensitiveRelativeLayout */
public class TouchSensitiveRelativeLayout extends RelativeLayout {

    /* renamed from: a */
    private AbstractC74264a f166986a;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.TouchSensitiveRelativeLayout$a */
    public interface AbstractC74264a {
        static {
            Covode.recordClassIndex(87034);
        }

        /* renamed from: a */
        void mo116857a();
    }

    static {
        Covode.recordClassIndex(87033);
    }

    public void setNoBlockTouchListener(AbstractC74264a aVar) {
        this.f166986a = aVar;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        AbstractC74264a aVar = this.f166986a;
        if (aVar != null) {
            aVar.mo116857a();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public TouchSensitiveRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.m26663i(8566);
        MethodCollector.m26664o(8566);
    }
}
