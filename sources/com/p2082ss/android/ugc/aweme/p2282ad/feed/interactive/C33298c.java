package com.p2082ss.android.ugc.aweme.p2282ad.feed.interactive;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.utils.C80471gb;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4619j.AbstractC89264c;
import p4600h.p4619j.C89271h;

/* renamed from: com.ss.android.ugc.aweme.ad.feed.interactive.c */
public class C33298c extends View {

    /* renamed from: a */
    private AbstractC89264c<Double> f79095a;

    /* renamed from: b */
    private AbstractC89264c<Double> f79096b;

    /* renamed from: c */
    private AbstractC33299d f79097c;

    static {
        Covode.recordClassIndex(40129);
    }

    public C33298c(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* access modifiers changed from: protected */
    public final AbstractC89264c<Double> getCoreAreaXRange() {
        return this.f79095a;
    }

    /* access modifiers changed from: protected */
    public final AbstractC89264c<Double> getCoreAreaYRange() {
        return this.f79096b;
    }

    public final AbstractC33299d getInteractiveListener() {
        return this.f79097c;
    }

    public final void setInteractiveListener(AbstractC33299d dVar) {
        this.f79097c = dVar;
    }

    /* access modifiers changed from: protected */
    public final void setCoreAreaXRange(AbstractC89264c<Double> cVar) {
        C89219l.m154721d(cVar, "");
        this.f79095a = cVar;
    }

    /* access modifiers changed from: protected */
    public final void setCoreAreaYRange(AbstractC89264c<Double> cVar) {
        C89219l.m154721d(cVar, "");
        this.f79096b = cVar;
    }

    private /* synthetic */ C33298c(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C33298c(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        AbstractC89264c<Double> a;
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(8003);
        int a2 = C13628n.m24504a(context);
        int b = C13628n.m24521b(context);
        if (C80471gb.m139483a(context)) {
            double d = (double) a2;
            Double.isNaN(d);
            Double.isNaN(d);
            a = C89271h.m154759a(0.22d * d, d * 1.0d);
        } else {
            double d2 = (double) a2;
            Double.isNaN(d2);
            Double.isNaN(d2);
            a = C89271h.m154759a(0.0d * d2, d2 * 0.78d);
        }
        this.f79095a = a;
        double d3 = (double) b;
        Double.isNaN(d3);
        Double.isNaN(d3);
        this.f79096b = C89271h.m154759a(0.12d * d3, d3 * 0.59d);
        MethodCollector.m26664o(8003);
    }

    /* renamed from: a */
    protected static boolean m68260a(float f, float f2, float f3, float f4) {
        if (Math.abs(f3 - f) >= ((float) C34728n.m70946a(10.0d)) || Math.abs(f4 - f2) >= ((float) C34728n.m70946a(10.0d))) {
            return false;
        }
        return true;
    }
}
