package com.p2082ss.android.ugc.aweme.canvas;

import android.graphics.PointF;
import android.graphics.RectF;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.editSticker.interact.view.AbstractC45920e;
import com.p2082ss.android.ugc.tools.utils.C84908o;
import java.util.HashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.canvas.l */
public final class C35391l {

    /* renamed from: a */
    public AbstractC45920e f83498a;

    /* renamed from: b */
    final C35390k f83499b = new C35390k();

    /* renamed from: c */
    String f83500c = "unset";

    /* renamed from: d */
    float f83501d = 0.15f;

    /* renamed from: e */
    float f83502e = 20.0f;

    /* renamed from: f */
    public RectF f83503f;

    /* renamed from: g */
    private HashMap<String, C35392a> f83504g = new HashMap<>();

    static {
        Covode.recordClassIndex(42565);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo62309a() {
        if (this.f83498a != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.canvas.l$a */
    public static final class C35392a {

        /* renamed from: a */
        public float f83505a;

        /* renamed from: b */
        public float f83506b = 1.0f;

        /* renamed from: c */
        public final PointF[] f83507c;

        /* renamed from: d */
        public final RectF f83508d;

        static {
            Covode.recordClassIndex(42566);
        }

        public C35392a() {
            PointF[] pointFArr = new PointF[4];
            int i = 0;
            do {
                pointFArr[i] = new PointF();
                i++;
            } while (i < 4);
            this.f83507c = pointFArr;
            this.f83508d = new RectF();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.canvas.l$b */
    static final class RunnableC35393b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C35391l f83509a;

        /* renamed from: b */
        final /* synthetic */ View f83510b;

        /* renamed from: c */
        final /* synthetic */ AbstractC45920e f83511c;

        static {
            Covode.recordClassIndex(42567);
        }

        RunnableC35393b(C35391l lVar, View view, AbstractC45920e eVar) {
            this.f83509a = lVar;
            this.f83510b = view;
            this.f83511c = eVar;
        }

        public final void run() {
            this.f83509a.f83503f = new RectF(0.0f, 0.0f, (float) this.f83510b.getWidth(), (float) this.f83510b.getHeight());
            this.f83509a.f83498a = this.f83511c;
            this.f83511c.setEnableFakeFeedView(false);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C35392a mo62310b() {
        if (this.f83504g.get(this.f83500c) == null) {
            HashMap<String, C35392a> hashMap = this.f83504g;
            String str = this.f83500c;
            C35392a aVar = new C35392a();
            RectF rectF = aVar.f83508d;
            RectF rectF2 = this.f83503f;
            if (rectF2 == null) {
                C89219l.m154710a("initializeRect");
            }
            rectF.set(rectF2);
            hashMap.put(str, aVar);
        }
        C35392a aVar2 = this.f83504g.get(this.f83500c);
        if (aVar2 != null) {
            return aVar2;
        }
        throw new IllegalStateException("cannot find canvas state");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final PointF[] mo62311c() {
        C35392a b = mo62310b();
        PointF[] pointFArr = b.f83507c;
        RectF rectF = b.f83508d;
        pointFArr[0].set(rectF.left, rectF.top);
        pointFArr[1].set(rectF.right, rectF.top);
        pointFArr[2].set(rectF.right, rectF.bottom);
        pointFArr[3].set(rectF.left, rectF.bottom);
        for (PointF pointF : pointFArr) {
            C84908o.m145916a(pointF, rectF.centerX(), rectF.centerY(), (float) Math.toRadians((double) b.f83505a));
        }
        return pointFArr;
    }
}
