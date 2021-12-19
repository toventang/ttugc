package com.p2082ss.android.ugc.aweme.choosemusic.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.view.SearchResultView */
public final class SearchResultView extends LinearLayout {

    /* renamed from: a */
    private AbstractC35951a f84853a;

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.view.SearchResultView$a */
    public interface AbstractC35951a {
        static {
            Covode.recordClassIndex(43195);
        }

        /* renamed from: a */
        void mo63078a(MotionEvent motionEvent);
    }

    static {
        Covode.recordClassIndex(43194);
    }

    public SearchResultView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final void setOnDispatchTouchEventListener(AbstractC35951a aVar) {
        C89219l.m154721d(aVar, "");
        this.f84853a = aVar;
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        AbstractC35951a aVar = this.f84853a;
        if (aVar != null) {
            aVar.mo63078a(motionEvent);
        }
        return dispatchTouchEvent;
    }

    private /* synthetic */ SearchResultView(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private SearchResultView(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(541);
        MethodCollector.m26664o(541);
    }
}
