package com.p2082ss.android.ugc.aweme.story.base.widget.surfaceView;

import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.base.widget.surfaceView.StickyHolderSurfaceView */
public final class StickyHolderSurfaceView extends SurfaceView {

    /* renamed from: a */
    private SurfaceHolderC76655a f172044a;

    static {
        Covode.recordClassIndex(89649);
    }

    public StickyHolderSurfaceView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final SurfaceHolder getHolder() {
        if (this.f172044a == null) {
            SurfaceHolder holder = super.getHolder();
            C89219l.m154716b(holder, "");
            this.f172044a = new SurfaceHolderC76655a(holder);
        }
        SurfaceHolderC76655a aVar = this.f172044a;
        if (aVar == null) {
            C89219l.m154715b();
        }
        return aVar;
    }

    private /* synthetic */ StickyHolderSurfaceView(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private StickyHolderSurfaceView(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(5072);
        MethodCollector.m26664o(5072);
    }
}
