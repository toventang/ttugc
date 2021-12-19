package com.bytedance.android.livesdk.p643ui;

import android.content.Context;
import android.graphics.Canvas;
import android.os.SystemClock;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.livesdk.livesetting.performance.PanelOpenCostTimesSetting;
import com.bytedance.covode.number.Covode;
import java.util.Map;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89387v;
import p4600h.C89391z;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89188r;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.ui.TraversalConstraintLayout */
public final class TraversalConstraintLayout extends ConstraintLayout implements Runnable {

    /* renamed from: g */
    private boolean f26269g;

    /* renamed from: h */
    private long f26270h;

    /* renamed from: i */
    private long f26271i;

    /* renamed from: j */
    private long f26272j;

    /* renamed from: k */
    private long f26273k;

    /* renamed from: l */
    private long f26274l;

    /* renamed from: m */
    private final AbstractC89244h f26275m;

    /* renamed from: n */
    private AbstractC89188r<? super Long, ? super Long, ? super Long, ? super Long, C89391z> f26276n;

    static {
        Covode.recordClassIndex(12545);
    }

    public TraversalConstraintLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private final Map<String, Long> getMCostTimesMap() {
        return (Map) this.f26275m.getValue();
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: h.f.a.r<? super java.lang.Long, ? super java.lang.Long, ? super java.lang.Long, ? super java.lang.Long, h.z>, h.f.a.r<java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Long, h.z> */
    public final AbstractC89188r<Long, Long, Long, Long, C89391z> getTraversalCallBack() {
        return this.f26276n;
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (!this.f26269g) {
            removeCallbacks(this);
        }
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        postDelayed(this, ((long) PanelOpenCostTimesSetting.INSTANCE.getValue().f22809b) * 1000);
    }

    /* renamed from: com.bytedance.android.livesdk.ui.TraversalConstraintLayout$a */
    static final class C10934a extends AbstractC89220m implements AbstractC89171a<Map<String, Long>> {

        /* renamed from: a */
        public static final C10934a f26277a = new C10934a();

        static {
            Covode.recordClassIndex(12546);
        }

        C10934a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Map<String, Long> invoke() {
            return C89041ag.m154427b(C89387v.m154943a("measure_duration", 0L), C89387v.m154943a("layout_duration", 0L), C89387v.m154943a("draw_duration", 0L), C89387v.m154943a("traversal_total_duration", 0L));
        }
    }

    public final void run() {
        long j;
        long j2;
        long j3;
        this.f26269g = true;
        Map<String, Long> mCostTimesMap = getMCostTimesMap();
        AbstractC89188r<? super Long, ? super Long, ? super Long, ? super Long, C89391z> rVar = this.f26276n;
        if (rVar != null) {
            Long l = mCostTimesMap.get("measure_duration");
            long j4 = 0;
            if (l != null) {
                j = l.longValue();
            } else {
                j = 0;
            }
            Long valueOf = Long.valueOf(j);
            Long l2 = mCostTimesMap.get("layout_duration");
            if (l2 != null) {
                j2 = l2.longValue();
            } else {
                j2 = 0;
            }
            Long valueOf2 = Long.valueOf(j2);
            Long l3 = mCostTimesMap.get("draw_duration");
            if (l3 != null) {
                j3 = l3.longValue();
            } else {
                j3 = 0;
            }
            Long valueOf3 = Long.valueOf(j3);
            Long l4 = mCostTimesMap.get("traversal_total_duration");
            if (l4 != null) {
                j4 = l4.longValue();
            }
            rVar.mo8774a(valueOf, valueOf2, valueOf3, Long.valueOf(j4));
        }
    }

    public final void setTraversalCallBack(AbstractC89188r<? super Long, ? super Long, ? super Long, ? super Long, C89391z> rVar) {
        this.f26276n = rVar;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public final void dispatchDraw(Canvas canvas) {
        long j;
        C89219l.m154721d(canvas, "");
        if (this.f26269g) {
            super.dispatchDraw(canvas);
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        super.dispatchDraw(canvas);
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        this.f26274l = elapsedRealtime2;
        this.f26273k = elapsedRealtime2 - elapsedRealtime;
        Map<String, Long> mCostTimesMap = getMCostTimesMap();
        long j2 = this.f26274l - this.f26270h;
        Long l = mCostTimesMap.get("traversal_total_duration");
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        if (j2 > j) {
            mCostTimesMap.put("measure_duration", Long.valueOf(this.f26271i));
            mCostTimesMap.put("layout_duration", Long.valueOf(this.f26272j));
            mCostTimesMap.put("draw_duration", Long.valueOf(this.f26273k));
            mCostTimesMap.put("traversal_total_duration", Long.valueOf(this.f26274l - this.f26270h));
        }
        this.f26270h = 0;
        this.f26271i = 0;
        this.f26272j = 0;
        this.f26273k = 0;
        this.f26274l = 0;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public final void onMeasure(int i, int i2) {
        if (this.f26269g) {
            super.onMeasure(i, i2);
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f26270h == 0) {
            this.f26270h = elapsedRealtime;
        }
        super.onMeasure(i, i2);
        this.f26271i += SystemClock.elapsedRealtime() - elapsedRealtime;
    }

    private /* synthetic */ TraversalConstraintLayout(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private TraversalConstraintLayout(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        this.f26275m = C89250i.m154773a((AbstractC89171a) C10934a.f26277a);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f26269g) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        super.onLayout(z, i, i2, i3, i4);
        this.f26272j += SystemClock.elapsedRealtime() - elapsedRealtime;
    }
}
