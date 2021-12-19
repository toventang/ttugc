package com.p2082ss.android.ugc.aweme.shortvideo.cutmusic;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2730de.C40983r;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.cutmusic.i */
public final /* synthetic */ class RunnableC70610i implements Runnable {

    /* renamed from: a */
    private final View$OnTouchListenerC70606h f158034a;

    static {
        Covode.recordClassIndex(83076);
    }

    private RunnableC70610i(View$OnTouchListenerC70606h hVar) {
        this.f158034a = hVar;
    }

    /* renamed from: a */
    static Runnable m124742a(View$OnTouchListenerC70606h hVar) {
        return new RunnableC70610i(hVar);
    }

    public final void run() {
        View$OnTouchListenerC70606h hVar = this.f158034a;
        if (hVar.f158017a != null && hVar.f158018b != null) {
            double d = (double) hVar.f158024h;
            Double.isNaN(d);
            double width = (double) hVar.f158018b.getWidth();
            Double.isNaN(width);
            double d2 = d * 1.0d * width;
            double d3 = (double) hVar.f158025i;
            Double.isNaN(d3);
            int i = (int) (d2 / d3);
            hVar.f158017a.setX((hVar.f158018b.getX() + ((float) i)) - ((float) (hVar.f158017a.getWidth() / 2)));
            hVar.f158018b.setStart(i);
            hVar.f158018b.setLength(hVar.mo111410a());
            hVar.f158019c.setText(C40983r.m82524a(hVar.f158024h));
        }
    }
}
