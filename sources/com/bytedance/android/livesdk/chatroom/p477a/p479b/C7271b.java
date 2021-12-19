package com.bytedance.android.livesdk.chatroom.p477a.p479b;

import android.graphics.Path;
import android.graphics.PathMeasure;
import com.bytedance.android.livesdk.chatroom.p477a.p478a.C7266a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.live.barrage.C87046a;
import com.p2082ss.ugc.live.barrage.p4467a.AbstractC87048a;
import com.p2082ss.ugc.live.barrage.p4468b.AbstractC87059a;
import com.p2082ss.ugc.live.barrage.view.BarrageLayout;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.chatroom.a.b.b */
public final class C7271b extends AbstractC87059a {

    /* renamed from: a */
    public static final C7272a f18087a = new C7272a((byte) 0);

    /* renamed from: j */
    private final float[] f18088j;

    /* renamed from: k */
    private final CopyOnWriteArrayList<Float> f18089k = new CopyOnWriteArrayList<>();

    /* renamed from: l */
    private final PathMeasure f18090l;

    /* renamed from: m */
    private final BarrageLayout f18091m;

    /* renamed from: n */
    private final Path f18092n;

    /* renamed from: o */
    private final int f18093o;

    static {
        Covode.recordClassIndex(8022);
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.a.b.b$a */
    public static final class C7272a {
        static {
            Covode.recordClassIndex(8023);
        }

        private C7272a() {
        }

        public /* synthetic */ C7272a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.ugc.live.barrage.p4468b.AbstractC87059a
    /* renamed from: a */
    public final void mo13469a() {
        mo140683d();
        this.f18089k.clear();
        super.mo13469a();
    }

    @Override // com.p2082ss.ugc.live.barrage.p4468b.AbstractC87059a
    /* renamed from: a */
    public final void mo13471a(AbstractC87048a aVar) {
        C89219l.m154721d(aVar, "");
        mo140682c();
    }

    @Override // com.p2082ss.ugc.live.barrage.p4468b.AbstractC87059a
    /* renamed from: a */
    public final void mo13472a(C87046a aVar, float f) {
        C89219l.m154721d(aVar, "");
        float f2 = f / ((float) this.f18093o);
        Iterator it = aVar.iterator();
        while (it.hasNext()) {
            AbstractC87048a aVar2 = (AbstractC87048a) it.next();
            int indexOf = aVar.indexOf((Object) aVar2);
            if (aVar2 instanceof C7266a) {
                Float f3 = this.f18089k.get(indexOf);
                float[] fArr = new float[2];
                float[] fArr2 = new float[2];
                this.f18090l.getPosTan(f3.floatValue() * this.f18090l.getLength(), fArr, null);
                this.f18090l.getPosTan((f3.floatValue() + f2) * this.f18090l.getLength(), fArr2, null);
                aVar2.f196257j.top += fArr2[1] - fArr[1];
                aVar2.f196257j.bottom += fArr2[1] - fArr[1];
                aVar2.f196257j.left += fArr2[0] - fArr[0];
                aVar2.f196257j.right += fArr2[0] - fArr[0];
                if (f3.floatValue() + f2 > 0.5f) {
                    C89219l.m154716b(f3, "");
                    ((C7266a) aVar2).f18075a = (int) (((1.0f - f3.floatValue()) - f2) * 326.4f);
                }
                if (f3.floatValue() + f2 < 0.2f) {
                    ((C7266a) aVar2).f18076b = ((f3.floatValue() + f2) * 2.8f) + 0.24f;
                }
                C7266a aVar3 = (C7266a) aVar2;
                double d = aVar3.f18078d;
                double floatValue = (double) f3.floatValue();
                Double.isNaN(floatValue);
                aVar3.f18077c = (float) (Math.sin(d + (floatValue * 3.141592653589793d * 8.0d)) * 4.0d);
                this.f18089k.set(indexOf, Float.valueOf(f3.floatValue() + f2));
                if (aVar3.f18075a == 0) {
                    aVar.remove(indexOf);
                    this.f18089k.remove(indexOf);
                }
            }
        }
        for (T t : this.f18089k) {
            if (t.floatValue() >= 1.0f) {
                int indexOf2 = this.f18089k.indexOf(t);
                aVar.remove(indexOf2);
                this.f18089k.remove(indexOf2);
            }
        }
        while (true) {
            AbstractC87048a e = mo140684e();
            if (e == null) {
                return;
            }
            if (e instanceof C7266a) {
                float width = e.f196257j.width();
                float height = e.f196257j.height();
                e.f196257j.left = this.f18088j[0];
                e.f196257j.right = this.f18088j[0] + width;
                e.f196257j.top = this.f18088j[1];
                e.f196257j.bottom = this.f18088j[1] + height;
                ((C7266a) e).f18076b = 0.0f;
                aVar.add(e);
                this.f18089k.add(Float.valueOf(0.0f));
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7271b(BarrageLayout barrageLayout, Path path, int i) {
        super(barrageLayout);
        C89219l.m154721d(barrageLayout, "");
        C89219l.m154721d(path, "");
        this.f18091m = barrageLayout;
        this.f18092n = path;
        this.f18093o = i;
        float[] fArr = new float[2];
        this.f18088j = fArr;
        PathMeasure pathMeasure = new PathMeasure();
        this.f18090l = pathMeasure;
        pathMeasure.setPath(path, false);
        pathMeasure.getPosTan(0.0f, fArr, null);
    }
}
