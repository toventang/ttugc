package com.airbnb.lottie.p099e.p102c;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import com.airbnb.lottie.AbstractC2206k;
import com.airbnb.lottie.C2044e;
import com.airbnb.lottie.C2122g;
import com.airbnb.lottie.C2217r;
import com.airbnb.lottie.p093a.p094a.C1994d;
import com.airbnb.lottie.p093a.p095b.AbstractC2012a;
import com.airbnb.lottie.p093a.p095b.C2030n;
import com.airbnb.lottie.p098d.C2042a;
import com.airbnb.lottie.p099e.C2062b;
import com.airbnb.lottie.p099e.C2087c;
import com.airbnb.lottie.p099e.C2103d;
import com.airbnb.lottie.p099e.C2107h;
import com.airbnb.lottie.p099e.p100a.C2058k;
import com.airbnb.lottie.p099e.p101b.C2079n;
import com.airbnb.lottie.p104g.C2144d;
import com.airbnb.lottie.p106i.C2194g;
import com.airbnb.lottie.p107j.C2204c;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.airbnb.lottie.e.c.h */
public final class C2100h extends AbstractC2088a {

    /* renamed from: h */
    private final char[] f6337h = new char[1];

    /* renamed from: i */
    private final RectF f6338i = new RectF();

    /* renamed from: j */
    private final Matrix f6339j = new Matrix();

    /* renamed from: k */
    private final Paint f6340k = new Paint() {
        /* class com.airbnb.lottie.p099e.p102c.C2100h.C21011 */

        static {
            Covode.recordClassIndex(2296);
        }

        {
            setStyle(Paint.Style.FILL);
        }
    };

    /* renamed from: l */
    private final Paint f6341l = new Paint() {
        /* class com.airbnb.lottie.p099e.p102c.C2100h.C21022 */

        static {
            Covode.recordClassIndex(2297);
        }

        {
            setStyle(Paint.Style.STROKE);
        }
    };

    /* renamed from: m */
    private final Map<C2103d, List<C1994d>> f6342m = new HashMap();

    /* renamed from: n */
    private final C2030n f6343n;

    /* renamed from: o */
    private final C2122g f6344o;

    /* renamed from: p */
    private final C2044e f6345p;

    /* renamed from: q */
    private AbstractC2012a<Integer, Integer> f6346q;

    /* renamed from: r */
    private AbstractC2012a<Integer, Integer> f6347r;

    /* renamed from: s */
    private AbstractC2012a<Float, Float> f6348s;

    /* renamed from: t */
    private AbstractC2012a<Float, Float> f6349t;

    static {
        Covode.recordClassIndex(2295);
    }

    /* renamed from: a */
    private void m6567a(RectF rectF) {
        if (C2144d.C2145a.f6479a) {
            rectF.set(0.0f, 0.0f, (float) this.f6345p.f6144h.width(), (float) this.f6345p.f6144h.height());
        }
    }

    @Override // com.airbnb.lottie.p099e.p102c.AbstractC2088a, com.airbnb.lottie.p093a.p094a.AbstractC1995e
    /* renamed from: a */
    public final void mo5897a(RectF rectF, Matrix matrix) {
        super.mo5897a(rectF, matrix);
        m6567a(rectF);
    }

    @Override // com.airbnb.lottie.p099e.p102c.AbstractC2088a
    /* renamed from: b */
    public final void mo5967b(RectF rectF, Matrix matrix) {
        super.mo5967b(rectF, matrix);
        m6567a(rectF);
    }

    C2100h(C2122g gVar, C2094d dVar) {
        super(gVar, dVar);
        this.f6344o = gVar;
        this.f6345p = dVar.f6308b;
        C2030n c = dVar.f6322p.mo5947a();
        this.f6343n = c;
        c.mo5912a(this);
        mo5964a(c);
        C2058k kVar = dVar.f6323q;
        if (kVar != null) {
            if (kVar.f6158a != null) {
                AbstractC2012a<Integer, Integer> a = kVar.f6158a.mo5947a();
                this.f6346q = a;
                a.mo5912a(this);
                mo5964a(this.f6346q);
            }
            if (kVar.f6159b != null) {
                AbstractC2012a<Integer, Integer> a2 = kVar.f6159b.mo5947a();
                this.f6347r = a2;
                a2.mo5912a(this);
                mo5964a(this.f6347r);
            }
            if (kVar.f6160c != null) {
                AbstractC2012a<Float, Float> a3 = kVar.f6160c.mo5947a();
                this.f6348s = a3;
                a3.mo5912a(this);
                mo5964a(this.f6348s);
            }
            if (kVar.f6161d != null) {
                AbstractC2012a<Float, Float> a4 = kVar.f6161d.mo5947a();
                this.f6349t = a4;
                a4.mo5912a(this);
                mo5964a(this.f6349t);
            }
        }
    }

    @Override // com.airbnb.lottie.p099e.p102c.AbstractC2088a, com.airbnb.lottie.p099e.AbstractC2105f
    /* renamed from: a */
    public final <T> void mo5899a(T t, C2204c<T> cVar) {
        AbstractC2012a<Float, Float> aVar;
        AbstractC2012a<Float, Float> aVar2;
        AbstractC2012a<Integer, Integer> aVar3;
        AbstractC2012a<Integer, Integer> aVar4;
        super.mo5899a(t, cVar);
        if (t == AbstractC2206k.f6595a && (aVar4 = this.f6346q) != null) {
            aVar4.mo5913a(cVar);
        } else if (t == AbstractC2206k.f6596b && (aVar3 = this.f6347r) != null) {
            aVar3.mo5913a(cVar);
        } else if (t == AbstractC2206k.f6609o && (aVar2 = this.f6348s) != null) {
            aVar2.mo5913a(cVar);
        } else if (t == AbstractC2206k.f6610p && (aVar = this.f6349t) != null) {
            aVar.mo5913a(cVar);
        }
    }

    /* renamed from: a */
    private static void m6566a(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() != 0) {
            if (paint.getStyle() != Paint.Style.STROKE || paint.getStrokeWidth() != 0.0f) {
                canvas.drawPath(path, paint);
            }
        }
    }

    /* renamed from: a */
    private static void m6569a(char[] cArr, Paint paint, Canvas canvas) {
        if (paint.getColor() != 0) {
            if (paint.getStyle() != Paint.Style.STROKE || paint.getStrokeWidth() != 0.0f) {
                canvas.drawText(cArr, 0, 1, 0.0f, 0.0f, paint);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Override // com.airbnb.lottie.p099e.p102c.AbstractC2088a
    /* renamed from: b */
    public final void mo5966b(Canvas canvas, Matrix matrix, int i) {
        List<C1994d> arrayList;
        canvas.save();
        if (!this.f6344o.mo6030h()) {
            if (C2144d.C2145a.f6479a) {
                canvas.concat(matrix);
            } else {
                canvas.setMatrix(matrix);
            }
        }
        C2062b bVar = (C2062b) this.f6343n.mo5918f();
        C2087c cVar = this.f6345p.f6140d.get(bVar.f6171b);
        if (cVar == null) {
            canvas.restore();
            return;
        }
        AbstractC2012a<Integer, Integer> aVar = this.f6346q;
        if (aVar != null) {
            this.f6340k.setColor(aVar.mo5918f().intValue());
        } else {
            this.f6340k.setColor(bVar.f6177h);
        }
        AbstractC2012a<Integer, Integer> aVar2 = this.f6347r;
        if (aVar2 != null) {
            this.f6341l.setColor(aVar2.mo5918f().intValue());
        } else {
            this.f6341l.setColor(bVar.f6178i);
        }
        int intValue = (this.f6277g.f6101e.mo5918f().intValue() * 255) / 100;
        this.f6340k.setAlpha(intValue);
        this.f6341l.setAlpha(intValue);
        AbstractC2012a<Float, Float> aVar3 = this.f6348s;
        if (aVar3 != null) {
            this.f6341l.setStrokeWidth(aVar3.mo5918f().floatValue());
        } else {
            this.f6341l.setStrokeWidth(((float) bVar.f6179j) * C2194g.m6792a() * C2194g.m6793a(matrix));
        }
        if (this.f6344o.mo6030h()) {
            float f = ((float) bVar.f6172c) / 100.0f;
            float a = C2194g.m6793a(matrix);
            String str = bVar.f6170a;
            for (int i2 = 0; i2 < str.length(); i2++) {
                C2103d a2 = this.f6345p.f6141e.mo2183a(C2103d.m6574a(str.charAt(i2), cVar.f6267a, cVar.f6269c), null);
                if (a2 != null) {
                    if (this.f6342m.containsKey(a2)) {
                        arrayList = this.f6342m.get(a2);
                    } else {
                        List<C2079n> list = a2.f6352a;
                        int size = list.size();
                        arrayList = new ArrayList<>(size);
                        for (int i3 = 0; i3 < size; i3++) {
                            arrayList.add(new C1994d(this.f6344o, this, list.get(i3)));
                        }
                        this.f6342m.put(a2, arrayList);
                    }
                    for (int i4 = 0; i4 < arrayList.size(); i4++) {
                        Path e = arrayList.get(i4).mo5906e();
                        e.computeBounds(this.f6338i, false);
                        this.f6339j.set(matrix);
                        this.f6339j.preTranslate(0.0f, ((float) (-bVar.f6176g)) * C2194g.m6792a());
                        this.f6339j.preScale(f, f);
                        e.transform(this.f6339j);
                        if (bVar.f6180k) {
                            m6566a(e, this.f6340k, canvas);
                            m6566a(e, this.f6341l, canvas);
                        } else {
                            m6566a(e, this.f6341l, canvas);
                            m6566a(e, this.f6340k, canvas);
                        }
                    }
                    float a3 = ((float) a2.f6354c) * f * C2194g.m6792a() * a;
                    float f2 = ((float) bVar.f6174e) / 10.0f;
                    AbstractC2012a<Float, Float> aVar4 = this.f6349t;
                    if (aVar4 != null) {
                        f2 += aVar4.mo5918f().floatValue();
                    }
                    canvas.translate(a3 + (f2 * a), 0.0f);
                }
            }
        } else {
            m6568a(bVar, cVar, matrix, canvas);
        }
        canvas.restore();
    }

    /* renamed from: a */
    private void m6568a(C2062b bVar, C2087c cVar, Matrix matrix, Canvas canvas) {
        int i;
        float a = C2194g.m6793a(matrix);
        C2122g gVar = this.f6344o;
        T t = (T) cVar.f6267a;
        T t2 = (T) cVar.f6269c;
        if (gVar.getCallback() != null) {
            if (gVar.f6404i == null) {
                gVar.f6404i = new C2042a(gVar.getCallback(), gVar.f6405j);
            }
            C2042a aVar = gVar.f6404i;
            if (aVar != null) {
                C2107h<String> hVar = aVar.f6126a;
                hVar.f6362a = t;
                hVar.f6363b = t2;
                Typeface typeface = aVar.f6127b.get(aVar.f6126a);
                if (typeface == null) {
                    typeface = aVar.f6128c.get(t);
                    if (typeface == null) {
                        typeface = Typeface.createFromAsset(aVar.f6129d, "fonts/" + ((String) t) + aVar.f6131f);
                        aVar.f6128c.put(t, typeface);
                    }
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
                    if (typeface.getStyle() != i) {
                        typeface = Typeface.create(typeface, i);
                    }
                    aVar.f6127b.put(aVar.f6126a, typeface);
                    if (typeface == null) {
                        return;
                    }
                }
                String str = bVar.f6170a;
                C2217r rVar = this.f6344o.f6406k;
                if (rVar != null) {
                    if (rVar.f6642b && rVar.f6641a.containsKey(str)) {
                        str = rVar.f6641a.get(str);
                    } else if (rVar.f6642b) {
                        rVar.f6641a.put(str, str);
                    }
                }
                this.f6340k.setTypeface(typeface);
                Paint paint = this.f6340k;
                double d = bVar.f6172c;
                double a2 = (double) C2194g.m6792a();
                Double.isNaN(a2);
                paint.setTextSize((float) (d * a2));
                this.f6341l.setTypeface(this.f6340k.getTypeface());
                this.f6341l.setTextSize(this.f6340k.getTextSize());
                for (int i2 = 0; i2 < str.length(); i2++) {
                    char charAt = str.charAt(i2);
                    this.f6337h[0] = charAt;
                    if (bVar.f6180k) {
                        m6569a(this.f6337h, this.f6340k, canvas);
                        m6569a(this.f6337h, this.f6341l, canvas);
                    } else {
                        m6569a(this.f6337h, this.f6341l, canvas);
                        m6569a(this.f6337h, this.f6340k, canvas);
                    }
                    char[] cArr = this.f6337h;
                    cArr[0] = charAt;
                    float measureText = this.f6340k.measureText(cArr, 0, 1);
                    float f = ((float) bVar.f6174e) / 10.0f;
                    AbstractC2012a<Float, Float> aVar2 = this.f6349t;
                    if (aVar2 != null) {
                        f += aVar2.mo5918f().floatValue();
                    }
                    canvas.translate(measureText + (f * a), 0.0f);
                }
            }
        }
    }
}
