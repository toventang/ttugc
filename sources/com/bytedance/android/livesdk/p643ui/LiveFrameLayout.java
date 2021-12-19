package com.bytedance.android.livesdk.p643ui;

import android.content.Context;
import android.graphics.Canvas;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.livesetting.performance.PanelOpenCostTimesSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.Map;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89387v;
import p4600h.C89391z;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.ui.LiveFrameLayout */
public final class LiveFrameLayout extends FrameLayout implements Runnable {

    /* renamed from: a */
    private boolean f26259a;

    /* renamed from: b */
    private long f26260b;

    /* renamed from: c */
    private long f26261c;

    /* renamed from: d */
    private long f26262d;

    /* renamed from: e */
    private long f26263e;

    /* renamed from: f */
    private long f26264f;

    /* renamed from: g */
    private long f26265g;

    /* renamed from: h */
    private final AbstractC89244h f26266h;

    /* renamed from: i */
    private AbstractC89172b<? super Map<String, Long>, C89391z> f26267i;

    static {
        Covode.recordClassIndex(12543);
    }

    public LiveFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private final Map<String, Long> getMCostTimesMap() {
        return (Map) this.f26266h.getValue();
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (!this.f26259a) {
            removeCallbacks(this);
        }
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        postDelayed(this, ((long) PanelOpenCostTimesSetting.INSTANCE.getValue().f22809b) * 1000);
    }

    public final void run() {
        this.f26259a = true;
        getMCostTimesMap().remove("traversal_start_time");
        getMCostTimesMap().put("total_traversal_times", Long.valueOf(this.f26265g));
        AbstractC89172b<? super Map<String, Long>, C89391z> bVar = this.f26267i;
        if (bVar != null) {
            bVar.invoke(getMCostTimesMap());
        }
    }

    /* renamed from: com.bytedance.android.livesdk.ui.LiveFrameLayout$a */
    static final class C10933a extends AbstractC89220m implements AbstractC89171a<Map<String, Long>> {

        /* renamed from: a */
        public static final C10933a f26268a = new C10933a();

        static {
            Covode.recordClassIndex(12544);
        }

        C10933a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Map<String, Long> invoke() {
            return C89041ag.m154427b(C89387v.m154943a("traversal_start_time", 0L), C89387v.m154943a("measure_duration", 0L), C89387v.m154943a("layout_duration", 0L), C89387v.m154943a("draw_duration", 0L), C89387v.m154943a("traversal_end_time", 0L), C89387v.m154943a("traversal_total_duration", 0L));
        }
    }

    public final void setTraversalCallBack(AbstractC89172b<? super Map<String, Long>, C89391z> bVar) {
        C89219l.m154721d(bVar, "");
        this.f26267i = bVar;
    }

    /* access modifiers changed from: protected */
    public final void dispatchDraw(Canvas canvas) {
        long j;
        C89219l.m154721d(canvas, "");
        if (this.f26259a) {
            super.dispatchDraw(canvas);
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        super.dispatchDraw(canvas);
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        this.f26264f = elapsedRealtime2;
        this.f26263e = elapsedRealtime2 - elapsedRealtime;
        this.f26265g++;
        Map<String, Long> mCostTimesMap = getMCostTimesMap();
        long j2 = this.f26264f - this.f26260b;
        Long l = mCostTimesMap.get("traversal_total_duration");
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        if (j2 > j) {
            mCostTimesMap.put("traversal_start_time", Long.valueOf(this.f26260b));
            mCostTimesMap.put("measure_duration", Long.valueOf(this.f26261c));
            mCostTimesMap.put("layout_duration", Long.valueOf(this.f26262d));
            mCostTimesMap.put("draw_duration", Long.valueOf(this.f26263e));
            mCostTimesMap.put("traversal_end_time", Long.valueOf(this.f26264f));
            mCostTimesMap.put("traversal_total_duration", Long.valueOf(this.f26264f - this.f26260b));
            mCostTimesMap.put("current_traversal_times", Long.valueOf(this.f26265g));
        }
        this.f26260b = 0;
        this.f26261c = 0;
        this.f26262d = 0;
        this.f26263e = 0;
        this.f26264f = 0;
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        MethodCollector.m26663i(10192);
        if (this.f26259a) {
            super.onMeasure(i, i2);
            MethodCollector.m26664o(10192);
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f26260b == 0) {
            this.f26260b = elapsedRealtime;
        }
        super.onMeasure(i, i2);
        this.f26261c += SystemClock.elapsedRealtime() - elapsedRealtime;
        MethodCollector.m26664o(10192);
    }

    private /* synthetic */ LiveFrameLayout(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private LiveFrameLayout(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(10492);
        this.f26266h = C89250i.m154773a((AbstractC89171a) C10933a.f26268a);
        MethodCollector.m26664o(10492);
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        MethodCollector.m26663i(10350);
        if (this.f26259a) {
            super.onLayout(z, i, i2, i3, i4);
            MethodCollector.m26664o(10350);
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        super.onLayout(z, i, i2, i3, i4);
        this.f26262d += SystemClock.elapsedRealtime() - elapsedRealtime;
        MethodCollector.m26664o(10350);
    }
}
