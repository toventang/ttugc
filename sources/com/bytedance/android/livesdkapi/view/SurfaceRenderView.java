package com.bytedance.android.livesdkapi.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceView;
import android.view.View;
import com.bytedance.android.livesdk.chatroom.p492g.C7572d;
import com.bytedance.android.livesdk.p561j.C9121ef;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import p4600h.p4611f.p4613b.C89219l;

public final class SurfaceRenderView extends SurfaceView implements AbstractC11877e {

    /* renamed from: a */
    private int f28405a;

    /* renamed from: b */
    private int f28406b;

    /* renamed from: c */
    private int f28407c = 2;

    /* renamed from: d */
    private final float f28408d = 1.7777778f;

    /* renamed from: e */
    private DataChannel f28409e;

    static {
        Covode.recordClassIndex(13590);
    }

    @Override // com.bytedance.android.livesdkapi.view.AbstractC11877e
    /* renamed from: a */
    public final void mo19013a() {
        C7572d.m15561a("RenderView", "SurfaceView:reset");
        this.f28405a = 0;
        this.f28406b = 0;
        this.f28407c = 2;
    }

    @Override // com.bytedance.android.livesdkapi.view.AbstractC11877e
    public final void setDataChannel(DataChannel dataChannel) {
        C89219l.m154721d(dataChannel, "");
        this.f28409e = dataChannel;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SurfaceRenderView(Context context) {
        super(context);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(12201);
        MethodCollector.m26664o(12201);
    }

    @Override // com.bytedance.android.livesdkapi.view.AbstractC11877e
    public final void setScaleType(int i) {
        this.f28407c = i;
        C7572d.m15561a("RenderView", "SurfaceView:setScaleType :".concat(String.valueOf(i)));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SurfaceRenderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C89219l.m154721d(context, "");
        C89219l.m154721d(attributeSet, "");
        MethodCollector.m26663i(12202);
        MethodCollector.m26664o(12202);
    }

    @Override // com.bytedance.android.livesdkapi.view.AbstractC11877e
    /* renamed from: a */
    public final void mo19014a(int i, int i2) {
        C7572d.m15561a("RenderView", "SurfaceView:setVideoSize width:" + i + " height:" + i2);
        if (i > 0 && i2 > 0) {
            this.f28405a = i;
            this.f28406b = i2;
            requestLayout();
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        float f;
        float f2;
        int i3;
        float f3;
        int i4;
        int i5;
        int suggestedMinimumWidth = getSuggestedMinimumWidth() + getPaddingLeft() + getPaddingRight();
        int suggestedMinimumHeight = getSuggestedMinimumHeight() + getPaddingTop() + getPaddingBottom();
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE) {
            suggestedMinimumWidth = Math.min(suggestedMinimumWidth, size);
        } else if (mode == 1073741824) {
            suggestedMinimumWidth = size;
        }
        if (mode2 == Integer.MIN_VALUE) {
            suggestedMinimumHeight = Math.min(suggestedMinimumHeight, size2);
        } else if (mode2 == 1073741824) {
            suggestedMinimumHeight = size2;
        }
        int i6 = this.f28407c;
        if (i6 == 2 || (i4 = this.f28405a) == 0 || (i5 = this.f28406b) == 0) {
            float f4 = (float) suggestedMinimumHeight;
            float f5 = (float) suggestedMinimumWidth;
            float f6 = f4 / f5;
            int i7 = this.f28405a;
            if (i7 == 0 || (i3 = this.f28406b) == 0) {
                f3 = this.f28408d;
                i7 = 9;
                i3 = 16;
            } else {
                f3 = (float) (i3 / i7);
            }
            if (f3 > f6) {
                suggestedMinimumHeight = (int) (((float) i3) * ((f5 * 1.0f) / ((float) i7)));
            } else {
                f = (f4 * 1.0f) / ((float) i3);
                f2 = (float) i7;
                suggestedMinimumWidth = (int) (f2 * f);
            }
        } else if (i6 != 1) {
            if (i6 == 0) {
                float f7 = ((float) i5) * ((((float) suggestedMinimumWidth) * 1.0f) / ((float) i4));
                float f8 = (float) suggestedMinimumHeight;
                if (f7 > f8) {
                    f = (f8 * 1.0f) / ((float) i5);
                    f2 = (float) i4;
                    suggestedMinimumWidth = (int) (f2 * f);
                } else {
                    suggestedMinimumHeight = (int) f7;
                }
            } else if (i6 == 3) {
                suggestedMinimumHeight = (int) (((float) i5) * ((((float) suggestedMinimumWidth) * 1.0f) / ((float) i4)));
            } else {
                suggestedMinimumWidth = 0;
                suggestedMinimumHeight = 0;
            }
        }
        C7572d.m15561a("RenderView", "SurfaceView:onMeasure width:" + suggestedMinimumWidth + " height:" + suggestedMinimumHeight);
        setMeasuredDimension(suggestedMinimumWidth, suggestedMinimumHeight);
        DataChannel dataChannel = this.f28409e;
        if (dataChannel != null) {
            dataChannel.mo28319c(C9121ef.class);
        }
    }
}
