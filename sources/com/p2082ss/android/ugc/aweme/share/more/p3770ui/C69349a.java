package com.p2082ss.android.ugc.aweme.share.more.p3770ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import p4600h.p4601a.AbstractC89040af;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4619j.C89271h;

/* renamed from: com.ss.android.ugc.aweme.share.more.ui.a */
public final class C69349a extends RecyclerView.AbstractC1361h {

    /* renamed from: a */
    int f154930a;

    /* renamed from: b */
    int f154931b;

    /* renamed from: c */
    private final Paint f154932c;

    /* renamed from: d */
    private final int f154933d;

    /* renamed from: e */
    private final AbstractC89172b<Integer, Boolean> f154934e;

    static {
        Covode.recordClassIndex(81681);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: h.f.a.b<? super java.lang.Integer, java.lang.Boolean> */
    /* JADX WARN: Multi-variable type inference failed */
    public C69349a(int i, int i2, AbstractC89172b<? super Integer, Boolean> bVar) {
        C89219l.m154721d(bVar, "");
        this.f154933d = i;
        this.f154934e = bVar;
        Paint paint = new Paint();
        paint.setColor(i2);
        paint.setStyle(Paint.Style.FILL);
        this.f154932c = paint;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1361h
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.C1378s sVar) {
        RecyclerView.AbstractC1362i layoutManager;
        C89219l.m154721d(canvas, "");
        C89219l.m154721d(recyclerView, "");
        C89219l.m154721d(sVar, "");
        if (!recyclerView.mo4486n() && (layoutManager = recyclerView.getLayoutManager()) != null) {
            C89219l.m154716b(layoutManager, "");
            Iterator it = C89271h.m154766a(0, recyclerView.getChildCount()).iterator();
            while (it.hasNext()) {
                int a = ((AbstractC89040af) it).mo143429a();
                if (this.f154934e.invoke(Integer.valueOf(a)).booleanValue()) {
                    View childAt = recyclerView.getChildAt(a);
                    recyclerView.mo4393a(childAt);
                    int q = RecyclerView.AbstractC1362i.m4433q(childAt);
                    int r = RecyclerView.AbstractC1362i.m4434r(childAt);
                    canvas.drawRect(((float) RecyclerView.AbstractC1362i.m4431o(childAt)) + ((float) this.f154930a), (float) (r - this.f154933d), ((float) q) - ((float) this.f154931b), (float) r, this.f154932c);
                }
            }
        }
    }
}
