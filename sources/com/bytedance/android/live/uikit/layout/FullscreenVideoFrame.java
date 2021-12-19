package com.bytedance.android.live.uikit.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class FullscreenVideoFrame extends FrameLayout {

    /* renamed from: a */
    private AbstractC6231a f15588a;

    /* renamed from: com.bytedance.android.live.uikit.layout.FullscreenVideoFrame$a */
    public interface AbstractC6231a {
        static {
            Covode.recordClassIndex(6938);
        }

        /* renamed from: a */
        void mo12197a();
    }

    static {
        Covode.recordClassIndex(6937);
    }

    public void setListener(AbstractC6231a aVar) {
        this.f15588a = aVar;
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i == 4) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    public FullscreenVideoFrame(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.m26663i(12290);
        setFocusable(true);
        setFocusableInTouchMode(true);
        MethodCollector.m26664o(12290);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        AbstractC6231a aVar = this.f15588a;
        if (aVar == null) {
            return true;
        }
        aVar.mo12197a();
        return true;
    }
}
