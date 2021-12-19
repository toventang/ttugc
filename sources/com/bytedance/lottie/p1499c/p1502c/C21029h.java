package com.bytedance.lottie.p1499c.p1502c;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.AbstractC21121m;
import com.bytedance.lottie.C21088g;
import com.bytedance.lottie.C21106i;
import com.bytedance.lottie.C21132t;
import com.bytedance.lottie.p1495a.p1496a.C20936c;
import com.bytedance.lottie.p1495a.p1497b.AbstractC20954a;
import com.bytedance.lottie.p1495a.p1497b.C20968n;
import com.bytedance.lottie.p1498b.C20972a;
import com.bytedance.lottie.p1499c.C20991b;
import com.bytedance.lottie.p1499c.C21016c;
import com.bytedance.lottie.p1499c.C21032d;
import com.bytedance.lottie.p1499c.C21036h;
import com.bytedance.lottie.p1499c.p1500a.C20987k;
import com.bytedance.lottie.p1499c.p1501b.C21008n;
import com.bytedance.lottie.p1505f.C21087h;
import com.bytedance.lottie.p1506g.C21091c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.lottie.c.c.h */
public final class C21029h extends AbstractC21017a {

    /* renamed from: g */
    private final char[] f49893g = new char[1];

    /* renamed from: h */
    private final RectF f49894h = new RectF();

    /* renamed from: i */
    private final Matrix f49895i = new Matrix();

    /* renamed from: j */
    private final Paint f49896j = new Paint() {
        /* class com.bytedance.lottie.p1499c.p1502c.C21029h.C210301 */

        static {
            Covode.recordClassIndex(24646);
        }

        {
            setStyle(Paint.Style.FILL);
        }
    };

    /* renamed from: k */
    private final Paint f49897k = new Paint() {
        /* class com.bytedance.lottie.p1499c.p1502c.C21029h.C210312 */

        static {
            Covode.recordClassIndex(24647);
        }

        {
            setStyle(Paint.Style.STROKE);
        }
    };

    /* renamed from: l */
    private final Map<C21032d, List<C20936c>> f49898l = new HashMap();

    /* renamed from: m */
    private final C20968n f49899m;

    /* renamed from: n */
    private final C21106i f49900n;

    /* renamed from: o */
    private final C21088g f49901o;

    /* renamed from: p */
    private AbstractC20954a<Integer, Integer> f49902p;

    /* renamed from: q */
    private AbstractC20954a<Integer, Integer> f49903q;

    /* renamed from: r */
    private AbstractC20954a<Float, Float> f49904r;

    /* renamed from: s */
    private AbstractC20954a<Float, Float> f49905s;

    static {
        Covode.recordClassIndex(24645);
    }

    @Override // com.bytedance.lottie.p1499c.AbstractC21034f, com.bytedance.lottie.p1499c.p1502c.AbstractC21017a
    /* renamed from: a */
    public final <T> void mo34455a(T t, C21091c<T> cVar) {
        AbstractC20954a<Float, Float> aVar;
        AbstractC20954a<Float, Float> aVar2;
        AbstractC20954a<Integer, Integer> aVar3;
        AbstractC20954a<Integer, Integer> aVar4;
        super.mo34455a(t, cVar);
        if (t == AbstractC21121m.f50076a && (aVar4 = this.f49902p) != null) {
            aVar4.mo34467a(cVar);
        } else if (t == AbstractC21121m.f50077b && (aVar3 = this.f49903q) != null) {
            aVar3.mo34467a(cVar);
        } else if (t == AbstractC21121m.f50086k && (aVar2 = this.f49904r) != null) {
            aVar2.mo34467a(cVar);
        } else if (t == AbstractC21121m.f50087l && (aVar = this.f49905s) != null) {
            aVar.mo34467a(cVar);
        }
    }

    C21029h(C21106i iVar, C21023d dVar) {
        super(iVar, dVar);
        this.f49900n = iVar;
        this.f49901o = dVar.f49864b;
        C20968n b = dVar.f49879q.mo34480a();
        this.f49899m = b;
        b.mo34466a(this);
        mo34496a(b);
        C20987k kVar = dVar.f49880r;
        if (kVar != null) {
            if (kVar.f49715a != null) {
                AbstractC20954a<Integer, Integer> a = kVar.f49715a.mo34480a();
                this.f49902p = a;
                a.mo34466a(this);
                mo34496a(this.f49902p);
            }
            if (kVar.f49716b != null) {
                AbstractC20954a<Integer, Integer> a2 = kVar.f49716b.mo34480a();
                this.f49903q = a2;
                a2.mo34466a(this);
                mo34496a(this.f49903q);
            }
            if (kVar.f49717c != null) {
                AbstractC20954a<Float, Float> a3 = kVar.f49717c.mo34480a();
                this.f49904r = a3;
                a3.mo34466a(this);
                mo34496a(this.f49904r);
            }
            if (kVar.f49718d != null) {
                AbstractC20954a<Float, Float> a4 = kVar.f49718d.mo34480a();
                this.f49905s = a4;
                a4.mo34466a(this);
                mo34496a(this.f49905s);
            }
        }
    }

    /* renamed from: a */
    private static void m39595a(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() != 0) {
            if (paint.getStyle() != Paint.Style.STROKE || paint.getStrokeWidth() != 0.0f) {
                canvas.drawPath(path, paint);
            }
        }
    }

    /* renamed from: a */
    private static void m39597a(char[] cArr, Paint paint, Canvas canvas) {
        if (paint.getColor() != 0) {
            if (paint.getStyle() != Paint.Style.STROKE || paint.getStrokeWidth() != 0.0f) {
                canvas.drawText(cArr, 0, 1, 0.0f, 0.0f, paint);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Override // com.bytedance.lottie.p1499c.p1502c.AbstractC21017a
    /* renamed from: b */
    public final void mo34498b(Canvas canvas, Matrix matrix, int i) {
        List<C20936c> arrayList;
        canvas.save();
        if (!this.f49900n.mo34596f()) {
            canvas.setMatrix(matrix);
        }
        C20991b bVar = (C20991b) this.f49899m.mo34470d();
        C21016c cVar = this.f49901o.f49972d.get(bVar.f49728b);
        if (cVar == null) {
            canvas.restore();
            return;
        }
        AbstractC20954a<Integer, Integer> aVar = this.f49902p;
        if (aVar != null) {
            this.f49896j.setColor(aVar.mo34470d().intValue());
        } else {
            this.f49896j.setColor(bVar.f49734h);
        }
        AbstractC20954a<Integer, Integer> aVar2 = this.f49903q;
        if (aVar2 != null) {
            this.f49897k.setColor(aVar2.mo34470d().intValue());
        } else {
            this.f49897k.setColor(bVar.f49735i);
        }
        int intValue = (this.f49833f.f49690e.mo34470d().intValue() * 255) / 100;
        this.f49896j.setAlpha(intValue);
        this.f49897k.setAlpha(intValue);
        AbstractC20954a<Float, Float> aVar3 = this.f49904r;
        if (aVar3 != null) {
            this.f49897k.setStrokeWidth(aVar3.mo34470d().floatValue());
        } else {
            float a = C21087h.m39716a(matrix);
            Paint paint = this.f49897k;
            double d = bVar.f49736j;
            double a2 = (double) C21087h.m39715a();
            Double.isNaN(a2);
            double d2 = d * a2;
            double d3 = (double) a;
            Double.isNaN(d3);
            paint.setStrokeWidth((float) (d2 * d3));
        }
        if (this.f49900n.mo34596f()) {
            float f = ((float) bVar.f49729c) / 100.0f;
            float a3 = C21087h.m39716a(matrix);
            String str = bVar.f49727a;
            for (int i2 = 0; i2 < str.length(); i2++) {
                C21032d a4 = this.f49901o.f49973e.mo2183a(C21032d.m39600a(str.charAt(i2), cVar.f49824a, cVar.f49826c), null);
                if (a4 != null) {
                    if (this.f49898l.containsKey(a4)) {
                        arrayList = this.f49898l.get(a4);
                    } else {
                        List<C21008n> list = a4.f49908a;
                        int size = list.size();
                        arrayList = new ArrayList<>(size);
                        for (int i3 = 0; i3 < size; i3++) {
                            arrayList.add(new C20936c(this.f49900n, this, list.get(i3)));
                        }
                        this.f49898l.put(a4, arrayList);
                    }
                    for (int i4 = 0; i4 < arrayList.size(); i4++) {
                        Path e = arrayList.get(i4).mo34460e();
                        e.computeBounds(this.f49894h, false);
                        this.f49895i.set(matrix);
                        this.f49895i.preTranslate(0.0f, ((float) (-bVar.f49733g)) * C21087h.m39715a());
                        this.f49895i.preScale(f, f);
                        e.transform(this.f49895i);
                        if (bVar.f49737k) {
                            m39595a(e, this.f49896j, canvas);
                            m39595a(e, this.f49897k, canvas);
                        } else {
                            m39595a(e, this.f49897k, canvas);
                            m39595a(e, this.f49896j, canvas);
                        }
                    }
                    float a5 = ((float) a4.f49910c) * f * C21087h.m39715a() * a3;
                    float f2 = ((float) bVar.f49731e) / 10.0f;
                    AbstractC20954a<Float, Float> aVar4 = this.f49905s;
                    if (aVar4 != null) {
                        f2 += aVar4.mo34470d().floatValue();
                    }
                    canvas.translate(a5 + (f2 * a3), 0.0f);
                }
            }
        } else {
            m39596a(bVar, cVar, matrix, canvas);
        }
        canvas.restore();
    }

    /* renamed from: a */
    private void m39596a(C20991b bVar, C21016c cVar, Matrix matrix, Canvas canvas) {
        int i;
        float a = C21087h.m39716a(matrix);
        C21106i iVar = this.f49900n;
        T t = (T) cVar.f49824a;
        T t2 = (T) cVar.f49826c;
        Typeface typeface = null;
        if (iVar.getCallback() != null) {
            if (iVar.f50039h == null) {
                iVar.f50039h = new C20972a(iVar.getCallback(), iVar.f50040i);
            }
            C20972a aVar = iVar.f50039h;
            if (aVar != null) {
                C21036h<String> hVar = aVar.f49695a;
                hVar.f49918a = t;
                hVar.f49919b = t2;
                Typeface typeface2 = aVar.f49696b.get(aVar.f49695a);
                if (typeface2 != null) {
                    typeface = typeface2;
                } else {
                    Typeface a2 = aVar.mo34476a(t);
                    if (a2 != null) {
                        boolean contains = t2.contains("Italic");
                        boolean contains2 = t2.contains("Bold");
                        if (contains) {
                            if (contains2) {
                                i = 3;
                            } else {
                                i = 2;
                            }
                        } else if (contains2) {
                            i = 1;
                        } else {
                            i = 0;
                        }
                        if (a2.getStyle() == i) {
                            typeface = a2;
                        } else {
                            typeface = Typeface.create(a2, i);
                        }
                    }
                    aVar.f49696b.put(aVar.f49695a, typeface);
                    if (typeface == null) {
                        return;
                    }
                }
                String str = bVar.f49727a;
                C21132t tVar = this.f49900n.f50041j;
                if (tVar != null) {
                    if (tVar.f50123b && tVar.f50122a.containsKey(str)) {
                        str = tVar.f50122a.get(str);
                    } else if (tVar.f50123b) {
                        tVar.f50122a.put(str, str);
                    }
                }
                this.f49896j.setTypeface(typeface);
                Paint paint = this.f49896j;
                double d = bVar.f49729c;
                double a3 = (double) C21087h.m39715a();
                Double.isNaN(a3);
                paint.setTextSize((float) (d * a3));
                this.f49897k.setTypeface(this.f49896j.getTypeface());
                this.f49897k.setTextSize(this.f49896j.getTextSize());
                for (int i2 = 0; i2 < str.length(); i2++) {
                    char charAt = str.charAt(i2);
                    this.f49893g[0] = charAt;
                    if (bVar.f49737k) {
                        m39597a(this.f49893g, this.f49896j, canvas);
                        m39597a(this.f49893g, this.f49897k, canvas);
                    } else {
                        m39597a(this.f49893g, this.f49897k, canvas);
                        m39597a(this.f49893g, this.f49896j, canvas);
                    }
                    char[] cArr = this.f49893g;
                    cArr[0] = charAt;
                    float measureText = this.f49896j.measureText(cArr, 0, 1);
                    float f = ((float) bVar.f49731e) / 10.0f;
                    AbstractC20954a<Float, Float> aVar2 = this.f49905s;
                    if (aVar2 != null) {
                        f += aVar2.mo34470d().floatValue();
                    }
                    canvas.translate(measureText + (f * a), 0.0f);
                }
            }
        }
    }
}
