package com.p2082ss.android.ugc.aweme.profile.p3576ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.SwitchModeFrameLayout */
public class SwitchModeFrameLayout extends FrameLayout {

    /* renamed from: a */
    private AbstractC64346b f145874a;

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.SwitchModeFrameLayout$a */
    public static class C64345a implements AbstractC64346b {
        static {
            Covode.recordClassIndex(75798);
        }

        @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.widget.SwitchModeFrameLayout.AbstractC64346b
        /* renamed from: a */
        public void mo103478a(MotionEvent motionEvent) {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.SwitchModeFrameLayout$b */
    public interface AbstractC64346b {
        static {
            Covode.recordClassIndex(75799);
        }

        /* renamed from: a */
        void mo103478a(MotionEvent motionEvent);
    }

    static {
        Covode.recordClassIndex(75797);
    }

    public void setIntercepter(AbstractC64346b bVar) {
        this.f145874a = bVar;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        AbstractC64346b bVar = this.f145874a;
        if (bVar != null) {
            bVar.mo103478a(motionEvent);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public SwitchModeFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.m26663i(7526);
        MethodCollector.m26664o(7526);
    }
}
