package com.p2082ss.android.ugc.aweme.commentStickerPanel;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commentStickerPanel.CommentStickerPanelContainer */
public final class CommentStickerPanelContainer extends RelativeLayout {

    /* renamed from: a */
    private AbstractC89172b<? super MotionEvent, Boolean> f88112a;

    static {
        Covode.recordClassIndex(44726);
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: h.f.a.b<? super android.view.MotionEvent, java.lang.Boolean>, h.f.a.b<android.view.MotionEvent, java.lang.Boolean> */
    public final AbstractC89172b<MotionEvent, Boolean> getMOnInterceptorHandler() {
        return this.f88112a;
    }

    public final void setMOnInterceptorHandler(AbstractC89172b<? super MotionEvent, Boolean> bVar) {
        this.f88112a = bVar;
    }

    public final void setOnInterceptorHandler(AbstractC89172b<? super MotionEvent, Boolean> bVar) {
        C89219l.m154721d(bVar, "");
        this.f88112a = bVar;
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C89219l.m154721d(motionEvent, "");
        AbstractC89172b<? super MotionEvent, Boolean> bVar = this.f88112a;
        if (bVar != null) {
            bVar.invoke(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommentStickerPanelContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(5724);
        C1764a.m5927a(LayoutInflater.from(context), R.layout.nh, this, true);
        MethodCollector.m26664o(5724);
    }
}
