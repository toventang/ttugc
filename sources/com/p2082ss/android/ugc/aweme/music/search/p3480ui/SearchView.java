package com.p2082ss.android.ugc.aweme.music.search.p3480ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.music.search.ui.SearchView */
public final class SearchView extends FrameLayout {

    /* renamed from: a */
    private AbstractC61061a f138542a;

    /* renamed from: com.ss.android.ugc.aweme.music.search.ui.SearchView$a */
    public interface AbstractC61061a {
        static {
            Covode.recordClassIndex(71653);
        }

        /* renamed from: a */
        void mo98559a();
    }

    static {
        Covode.recordClassIndex(71652);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final AbstractC61061a getDispatchTouchEventListener() {
        return this.f138542a;
    }

    public final void setDispatchTouchEventListener(AbstractC61061a aVar) {
        this.f138542a = aVar;
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        AbstractC61061a aVar = this.f138542a;
        if (aVar != null) {
            aVar.mo98559a();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    private /* synthetic */ SearchView(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private SearchView(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(8335);
        MethodCollector.m26664o(8335);
    }
}
