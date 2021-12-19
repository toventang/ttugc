package com.p2082ss.ugc.live.barrage.p4468b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.live.barrage.C87046a;
import com.p2082ss.ugc.live.barrage.p4467a.AbstractC87048a;
import com.p2082ss.ugc.live.barrage.view.BarrageLayout;
import java.util.Iterator;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.ugc.live.barrage.b.b */
public final class C87065b extends AbstractC87059a {

    /* renamed from: a */
    private final BarrageLayout f196284a;

    /* renamed from: j */
    private final int f196285j;

    /* renamed from: k */
    private final int f196286k = 2;

    /* renamed from: l */
    private final int f196287l = 7000;

    static {
        Covode.recordClassIndex(102831);
    }

    @Override // com.p2082ss.ugc.live.barrage.p4468b.AbstractC87059a
    /* renamed from: a */
    public final void mo13469a() {
        mo140683d();
        super.mo13469a();
    }

    @Override // com.p2082ss.ugc.live.barrage.p4468b.AbstractC87059a
    /* renamed from: a */
    public final void mo13471a(AbstractC87048a aVar) {
        C89219l.m154719c(aVar, "");
        mo140682c();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C87065b(BarrageLayout barrageLayout, int i) {
        super(barrageLayout);
        C89219l.m154719c(barrageLayout, "");
        this.f196284a = barrageLayout;
        this.f196285j = i;
    }

    @Override // com.p2082ss.ugc.live.barrage.p4468b.AbstractC87059a
    /* renamed from: a */
    public final void mo13472a(C87046a aVar, float f) {
        C89219l.m154719c(aVar, "");
        int width = this.f196284a.getWidth();
        int height = this.f196284a.getHeight();
        this.f196284a.postInvalidate();
        float[] fArr = new float[this.f196286k];
        float f2 = (float) width;
        float f3 = (f / ((float) this.f196287l)) * f2;
        Iterator it = aVar.iterator();
        while (it.hasNext()) {
            AbstractC87048a aVar2 = (AbstractC87048a) it.next();
            if (aVar2.f196257j.left > f2) {
                aVar.remove((Object) aVar2);
            }
            int height2 = (int) ((aVar2.f196257j.bottom - aVar2.f196257j.height()) / ((float) this.f196285j));
            if (aVar2.f196257j.left < fArr[height2]) {
                fArr[height2] = aVar2.f196257j.left;
            }
            aVar2.f196257j.offset(f3, 0.0f);
        }
        int i = this.f196286k;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f196285j * i2 <= height && fArr[i2] >= 0.0f) {
                AbstractC87048a e = mo140684e();
                if (e != null) {
                    float width2 = e.f196257j.width();
                    float height3 = e.f196257j.height();
                    e.f196257j.left = -width2;
                    e.f196257j.right = 0.0f;
                    e.f196257j.top = (float) (this.f196285j * i2);
                    e.f196257j.bottom = ((float) (this.f196285j * i2)) + height3;
                    aVar.add(e);
                } else {
                    return;
                }
            }
        }
    }
}
