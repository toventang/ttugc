package com.p2082ss.android.ugc.aweme.editSticker.text.p2886b;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.text.TextPaint;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.p1200f.C17234b;
import com.p2082ss.android.ttve.utils.C30745b;
import com.p2082ss.android.ugc.aweme.editSticker.text.bean.C46110t;
import com.p2082ss.android.ugc.aweme.editSticker.text.bean.InteractTextStructWrap;
import com.p2082ss.android.ugc.aweme.editSticker.text.bean.TextStickerString;
import com.p2082ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextWrap;
import com.p2082ss.android.ugc.aweme.editSticker.text.view.C46239q;
import com.p2082ss.android.ugc.tools.utils.C84908o;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.editSticker.text.b.c */
public final class C46047c {

    /* renamed from: A */
    public float f107220A;

    /* renamed from: B */
    public TextPaint f107221B = new TextPaint();

    /* renamed from: C */
    public Paint f107222C = new Paint();

    /* renamed from: D */
    public Path f107223D;

    /* renamed from: E */
    public C46239q f107224E;

    /* renamed from: F */
    public boolean f107225F = false;

    /* renamed from: G */
    public float f107226G;

    /* renamed from: H */
    public Paint f107227H;

    /* renamed from: I */
    public List<PointF> f107228I = new ArrayList();

    /* renamed from: J */
    public boolean f107229J = false;

    /* renamed from: K */
    private RectF f107230K = new RectF();

    /* renamed from: L */
    private RectF f107231L = new RectF();

    /* renamed from: M */
    private boolean f107232M = true;

    /* renamed from: N */
    private List<TextStickerTextWrap> f107233N;

    /* renamed from: O */
    private TextStickerString[] f107234O;

    /* renamed from: P */
    private float f107235P;

    /* renamed from: Q */
    private Paint f107236Q = new Paint(2);

    /* renamed from: R */
    private float f107237R;

    /* renamed from: S */
    private float f107238S;

    /* renamed from: T */
    private float f107239T;

    /* renamed from: U */
    private Paint.FontMetrics f107240U = new Paint.FontMetrics();

    /* renamed from: a */
    public Context f107241a;

    /* renamed from: b */
    public RectF f107242b = new RectF();

    /* renamed from: c */
    public RectF f107243c = new RectF();

    /* renamed from: d */
    public Rect f107244d = new Rect();

    /* renamed from: e */
    public Bitmap f107245e;

    /* renamed from: f */
    public Path f107246f;

    /* renamed from: g */
    public Bitmap f107247g;

    /* renamed from: h */
    public Rect f107248h = new Rect();

    /* renamed from: i */
    public RectF f107249i = new RectF();

    /* renamed from: j */
    public Paint f107250j;

    /* renamed from: k */
    public int f107251k = 0;

    /* renamed from: l */
    public int f107252l = 0;

    /* renamed from: m */
    public float f107253m = 0.0f;

    /* renamed from: n */
    public float f107254n = 0.0f;

    /* renamed from: o */
    public boolean f107255o = false;

    /* renamed from: p */
    public Paint f107256p;

    /* renamed from: q */
    public int f107257q = 0;

    /* renamed from: r */
    public float f107258r = 60.0f;

    /* renamed from: s */
    public int f107259s = 20;

    /* renamed from: t */
    public int f107260t = 20;

    /* renamed from: u */
    public int f107261u;

    /* renamed from: v */
    public int f107262v;

    /* renamed from: w */
    public int f107263w = 20;

    /* renamed from: x */
    public int f107264x = 30;

    /* renamed from: y */
    public int f107265y = 10;

    /* renamed from: z */
    public int f107266z;

    static {
        Covode.recordClassIndex(54582);
    }

    /* renamed from: a */
    public final RectF mo77724a() {
        RectF rectF = new RectF();
        rectF.set(this.f107242b);
        rectF.set(rectF.left - ((float) this.f107263w), rectF.top - ((float) this.f107263w), rectF.right + ((float) this.f107263w), rectF.bottom + ((float) this.f107263w));
        return rectF;
    }

    /* renamed from: a */
    public final void mo77726a(List<TextStickerTextWrap> list) {
        this.f107233N = list;
        if (C46110t.m88964a(list)) {
            if (this.f107257q == -1) {
                this.f107221B.setColor(-16777216);
            } else {
                this.f107221B.setColor(this.f107224E.getResources().getColor(R.color.a_));
            }
        }
        this.f107234O = C46110t.m88966b(list);
    }

    /* renamed from: a */
    private int m88888a(List<InteractTextStructWrap> list, String str) {
        if (!C46110t.m88965a(list, str.length())) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            InteractTextStructWrap interactTextStructWrap = list.get(i2);
            if (interactTextStructWrap.getRange().isValid(str.length())) {
                int start = interactTextStructWrap.getRange().getStart();
                if (start < str.length() && str.charAt(start) == ' ') {
                    start++;
                }
                if (start < str.length() && str.charAt(start) == '_') {
                    i = (int) (((float) (i - C46110t.m88957a(this.f107221B, str, start, start + 1))) + this.f107231L.width() + this.f107220A);
                }
            }
        }
        return i;
    }

    /* renamed from: a */
    public final void mo77725a(Canvas canvas, C46046b bVar) {
        char c;
        char c2;
        while (true) {
            this.f107237R = bVar.f107214c.x;
            this.f107238S = bVar.f107214c.y;
            this.f107221B.setTextSize(((float) bVar.f107216e) * bVar.f107212a);
            this.f107239T = C46051f.m88906a(this.f107241a, this.f107221B.getTextSize());
            this.f107221B.getFontMetrics(this.f107240U);
            this.f107238S += this.f107240U.bottom * 2.0f;
            this.f107226G = bVar.f107213b;
            if (this.f107234O != null) {
                int i = 0;
                int i2 = 0;
                while (true) {
                    TextStickerString[] textStickerStringArr = this.f107234O;
                    if (i >= textStickerStringArr.length) {
                        break;
                    }
                    int a = C46110t.m88957a(this.f107221B, textStickerStringArr[i].getStr(), 0, this.f107234O[i].getStr().length());
                    if (a > i2) {
                        i2 = a;
                    }
                    i++;
                }
                if (bVar.f107215d == 1) {
                    this.f107237R -= (float) (i2 / 2);
                }
                if (bVar.f107215d == 3) {
                    this.f107237R += (float) (i2 / 2);
                }
            }
            float f = this.f107237R;
            float f2 = this.f107238S;
            float f3 = bVar.f107212a;
            int i3 = bVar.f107215d;
            boolean z = this.f107255o;
            TextStickerString[] textStickerStringArr2 = this.f107234O;
            if (!(textStickerStringArr2 == null || textStickerStringArr2.length == 0)) {
                Paint.FontMetrics fontMetrics = this.f107221B.getFontMetrics();
                float f4 = fontMetrics.ascent;
                float f5 = fontMetrics.descent;
                int length = this.f107234O.length;
                int i4 = length - 1;
                float f6 = ((float) i4) * (fontMetrics.descent - fontMetrics.ascent);
                PointF[][] pointFArr = new PointF[length][];
                int i5 = (int) (f5 - f4);
                int i6 = this.f107261u;
                int i7 = (int) (((float) i6) * f3);
                this.f107259s = i7;
                int i8 = this.f107262v;
                int i9 = (int) (((float) i8) * f3);
                this.f107260t = i9;
                if (i9 >= i8) {
                    this.f107260t = i8;
                }
                if (i7 >= i6) {
                    this.f107259s = i6;
                }
                int i10 = (int) (f2 - (f6 / 2.0f));
                float f7 = (this.f107258r * f3) / 4.0f;
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                float f8 = 0.0f;
                float f9 = 0.0f;
                int i15 = -1;
                int i16 = -1;
                while (i11 < length) {
                    int measureText = (int) this.f107221B.measureText(this.f107234O[i11].getStr());
                    float f10 = (float) (measureText / 2);
                    int i17 = this.f107259s;
                    float f11 = (f - f10) - ((float) i17);
                    float f12 = f10 + f + ((float) i17);
                    if (i3 == 1) {
                        f11 = f - ((float) i17);
                        f12 = ((float) i17) + ((float) measureText) + f;
                    } else if (i3 == 3) {
                        f11 = (f - ((float) measureText)) - ((float) i17);
                        f12 = f + ((float) i17);
                    }
                    if (this.f107234O[i11].getStr().trim().length() == 0) {
                        if (i3 == 1) {
                            f12 = ((float) this.f107259s) + f;
                        } else {
                            f12 = f;
                            if (i3 == 3) {
                                f12 = f - ((float) this.f107259s);
                            }
                        }
                        f11 = f12;
                    }
                    if (((float) Math.abs(measureText - i12)) >= f7 || (i3 != 1 ? i3 != 3 ? i3 != 2 || f9 <= 0.0f : f9 <= 0.0f : f8 <= 0.0f)) {
                        f9 = f11;
                    } else {
                        f12 = f8;
                    }
                    if (i11 == 0) {
                        i14 = i10 - i5;
                    }
                    int i18 = i14 + i5;
                    if (length > 1) {
                        if (i11 > 0) {
                            i15 = (int) this.f107221B.measureText(this.f107234O[i11 - 1].getStr());
                        }
                        if (i11 < i4) {
                            i16 = (int) this.f107221B.measureText(this.f107234O[i11 + 1].getStr());
                        }
                    }
                    if (i15 > 0 && measureText >= i15) {
                        i18 += this.f107260t;
                    }
                    if (i16 > 0 && measureText > i16) {
                        i18 += this.f107260t;
                    }
                    if (i11 == 0) {
                        i14 -= this.f107260t;
                    }
                    if (i11 == i4) {
                        i18 += this.f107260t;
                    }
                    float f13 = (float) i14;
                    float f14 = (float) i18;
                    pointFArr[i11] = new PointF[]{new PointF(f9, f13), new PointF(f12, f13), new PointF(f12, f14), new PointF(f9, f14)};
                    if (measureText > i13) {
                        i13 = measureText;
                    }
                    i11++;
                    i12 = measureText;
                    f8 = f12;
                    i14 = i18;
                }
                this.f107223D.reset();
                this.f107228I.clear();
                for (int i19 = 0; i19 < length; i19++) {
                    if (i19 == 0) {
                        this.f107223D.moveTo(pointFArr[i19][0].x, pointFArr[i19][0].y);
                    }
                    this.f107223D.lineTo(pointFArr[i19][1].x, pointFArr[i19][1].y);
                    if (pointFArr[i19][0].x == pointFArr[i19][1].x) {
                        this.f107223D.lineTo(pointFArr[i19][1].x, pointFArr[i19][1].y);
                        c2 = 2;
                        this.f107223D.lineTo(pointFArr[i19][2].x, pointFArr[i19][2].y);
                    } else {
                        c2 = 2;
                    }
                    this.f107223D.lineTo(pointFArr[i19][c2].x, pointFArr[i19][c2].y);
                    this.f107228I.add(pointFArr[i19][0]);
                    this.f107228I.add(pointFArr[i19][1]);
                    this.f107228I.add(pointFArr[i19][2]);
                    this.f107228I.add(pointFArr[i19][3]);
                }
                for (int i20 = i4; i20 >= 0; i20--) {
                    if (pointFArr[i20][0].x == pointFArr[i20][1].x) {
                        c = 3;
                        this.f107223D.lineTo(pointFArr[i20][3].x, pointFArr[i20][3].y);
                    } else {
                        c = 3;
                    }
                    this.f107223D.lineTo(pointFArr[i20][c].x, pointFArr[i20][c].y);
                    if (pointFArr[i20][0].x == pointFArr[i20][1].x) {
                        this.f107223D.lineTo(pointFArr[i20][0].x, pointFArr[i20][0].y);
                    }
                    this.f107223D.lineTo(pointFArr[i20][0].x, pointFArr[i20][0].y);
                }
                this.f107223D.lineTo(pointFArr[0][1].x, pointFArr[0][1].y);
                this.f107221B.getTextBounds(this.f107234O[0].getStr(), 0, this.f107234O[0].getStr().length(), new Rect());
                int i21 = i13 >> 1;
                if (i3 == 1) {
                    this.f107242b = new RectF(f - ((float) this.f107259s), pointFArr[0][0].y, ((float) i13) + f + ((float) this.f107259s), pointFArr[i4][2].y);
                } else if (i3 == 3) {
                    this.f107242b = new RectF((f - ((float) i13)) - ((float) this.f107259s), pointFArr[0][0].y, ((float) this.f107259s) + f, pointFArr[i4][2].y);
                } else if (i3 == 2) {
                    float f15 = (float) i21;
                    this.f107242b = new RectF((f - f15) - ((float) this.f107259s), pointFArr[0][0].y, f + f15 + ((float) this.f107259s), pointFArr[i4][2].y);
                }
                this.f107243c.set(this.f107242b);
                RectF rectF = this.f107243c;
                rectF.set(rectF.left - ((float) this.f107263w), this.f107243c.top - ((float) this.f107263w), this.f107243c.right + ((float) this.f107263w), this.f107243c.bottom + ((float) this.f107263w));
                if (z) {
                    float f16 = this.f107242b.left - ((float) this.f107251k);
                    float f17 = this.f107242b.right + ((float) this.f107251k);
                    float f18 = this.f107242b.top - ((float) this.f107251k);
                    float f19 = this.f107242b.bottom + ((float) this.f107251k);
                    this.f107246f.reset();
                    this.f107246f.moveTo(f16, f18);
                    this.f107246f.lineTo(f17, f18);
                    this.f107246f.lineTo(f17, f19);
                    this.f107246f.lineTo(f16, f19);
                    this.f107246f.lineTo(f16, f18);
                    Context context = this.f107224E.getContext();
                    if (context != null) {
                        int i22 = Build.VERSION.SDK_INT;
                        if (context.getResources().getConfiguration().getLayoutDirection() == 1) {
                            RectF rectF2 = this.f107249i;
                            int i23 = this.f107252l;
                            rectF2.set(f17 - ((float) i23), f18 - ((float) i23), f17 + ((float) i23), f18 + ((float) i23));
                        }
                    }
                    RectF rectF3 = this.f107249i;
                    int i24 = this.f107252l;
                    rectF3.set(f16 - ((float) i24), f18 - ((float) i24), f16 + ((float) i24), f18 + ((float) i24));
                }
            }
            if (!(this.f107255o && this.f107232M)) {
                break;
            }
            this.f107232M = false;
            float a2 = ((float) C17234b.m31806a(this.f107224E.getContext())) - (C30745b.m63132b(this.f107224E.getContext(), 54.0f) * 2.0f);
            if (this.f107242b.width() <= a2) {
                break;
            }
            float width = (bVar.f107212a * a2) / this.f107242b.width();
            this.f107224E.mo78545b(width);
            bVar.f107212a = width;
        }
        float f20 = bVar.f107213b;
        if (bVar.f107218g) {
            canvas.save();
            canvas.rotate(f20, this.f107243c.centerX(), this.f107243c.centerY());
            this.f107222C.setColor(-1);
            RectF rectF4 = this.f107243c;
            int i25 = this.f107265y;
            canvas.drawRoundRect(rectF4, (float) i25, (float) i25, this.f107222C);
            canvas.restore();
        }
        m88889a(canvas, this.f107237R, this.f107238S, bVar.f107213b, bVar.f107212a, bVar.f107215d);
        float f21 = bVar.f107213b;
        boolean z2 = bVar.f107217f;
        if (!this.f107225F && z2) {
            canvas.save();
            canvas.rotate(f21, this.f107243c.centerX(), this.f107243c.centerY());
            this.f107256p.setColor(this.f107257q);
            canvas.drawPath(this.f107223D, this.f107256p);
            canvas.restore();
        }
        float f22 = bVar.f107213b;
        if (this.f107255o) {
            canvas.save();
            canvas.rotate(f22, this.f107243c.centerX(), this.f107243c.centerY());
            canvas.drawPath(this.f107246f, this.f107250j);
            canvas.drawBitmap(this.f107247g, this.f107248h, this.f107249i, this.f107250j);
            canvas.restore();
        }
    }

    /* renamed from: a */
    private void m88891a(Canvas canvas, List<InteractTextStructWrap> list, String str, float f, float f2) {
        char c;
        float f3 = f;
        if (!C46110t.m88965a(list, str.length())) {
            m88890a(canvas, str, 0, str.length(), f3, f2, this.f107221B);
            canvas.drawText(str, f3, f2, this.f107221B);
            return;
        }
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            InteractTextStructWrap interactTextStructWrap = list.get(i2);
            if (interactTextStructWrap.getRange().isValid(str.length())) {
                if (i < interactTextStructWrap.getRange().getStart()) {
                    m88890a(canvas, str, i, interactTextStructWrap.getRange().getStart(), f3, f2, this.f107221B);
                    canvas.drawText(str, i, interactTextStructWrap.getRange().getStart(), f3, f2, (Paint) this.f107221B);
                    f3 += (float) C46110t.m88957a(this.f107221B, str, i, interactTextStructWrap.getRange().getStart());
                }
                int start = interactTextStructWrap.getRange().getStart();
                int end = interactTextStructWrap.getRange().getEnd();
                if (start >= str.length() || str.charAt(start) != ' ') {
                    c = ' ';
                } else {
                    int i3 = start + 1;
                    c = ' ';
                    canvas.drawText(str, start, i3, f3, f2, (Paint) this.f107221B);
                    f3 += (float) C46110t.m88957a(this.f107221B, str, start, i3);
                    start = i3;
                }
                if (start < str.length() && str.charAt(start) == '_') {
                    this.f107231L.offsetTo(f3, ((((((float) this.f107221B.getFontMetricsInt().descent) + f2) + f2) + ((float) this.f107221B.getFontMetricsInt().ascent)) / 2.0f) - (this.f107231L.height() / 2.0f));
                    canvas.drawBitmap(this.f107245e, this.f107244d, this.f107231L, this.f107236Q);
                    f3 += this.f107231L.width() + this.f107220A;
                    start++;
                }
                if (str.charAt(end - 1) == c) {
                    end--;
                }
                if (start < end) {
                    m88890a(canvas, str, start, end, f3, f2, this.f107221B);
                    this.f107221B.setUnderlineText(true);
                    canvas.drawText(str, start, end, f3, f2, (Paint) this.f107221B);
                    this.f107221B.setUnderlineText(false);
                    f3 += (float) C46110t.m88957a(this.f107221B, str, start, end);
                }
                if (end < interactTextStructWrap.getRange().getEnd()) {
                    int i4 = end + 1;
                    canvas.drawText(str, end, i4, f3, f2, (Paint) this.f107221B);
                    f3 += (float) C46110t.m88957a(this.f107221B, str, end, i4);
                }
                i = interactTextStructWrap.getRange().getEnd();
            }
        }
        if (i < str.length()) {
            m88890a(canvas, str, i, str.length(), f3, f2, this.f107221B);
            canvas.drawText(str, i, str.length(), f3, f2, (Paint) this.f107221B);
        }
    }

    /* renamed from: a */
    private void m88889a(Canvas canvas, float f, float f2, float f3, float f4, int i) {
        Object obj;
        List<InteractTextStructWrap> arrayList;
        TextStickerString[] textStickerStringArr = this.f107234O;
        if (!(textStickerStringArr == null || textStickerStringArr.length == 0)) {
            Paint.FontMetrics fontMetrics = this.f107221B.getFontMetrics();
            float f5 = fontMetrics.ascent;
            float f6 = fontMetrics.descent;
            int length = this.f107234O.length;
            float f7 = ((((float) (length - 1)) * (fontMetrics.descent - fontMetrics.ascent)) / 2.0f) - f6;
            canvas.save();
            canvas.rotate(f3, this.f107243c.centerX(), this.f107243c.centerY());
            float f8 = this.f107258r * 0.7f;
            this.f107235P = f8;
            this.f107230K.set(0.0f, 0.0f, f8, f8);
            this.f107231L.set(this.f107230K);
            C84908o.m145918a(this.f107231L, f4);
            C84908o.m145919a(this.f107231L, f, f2, f3);
            for (int i2 = 0; i2 < length; i2++) {
                float f9 = (((float) (-((length - i2) - 1))) * (f6 - f5)) + f7;
                String str = this.f107234O[i2].getStr();
                List<TextStickerTextWrap> list = this.f107233N;
                TextStickerString textStickerString = this.f107234O[i2];
                C89219l.m154721d(textStickerString, "");
                if (list == null) {
                    arrayList = new ArrayList<>();
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        C89070n.m154535a((Collection) arrayList2, (Iterable) it.next().getStrMap().entrySet());
                    }
                    Iterator it2 = arrayList2.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it2.next();
                        if (C89219l.m154714a(((Map.Entry) obj).getKey(), textStickerString)) {
                            break;
                        }
                    }
                    Map.Entry entry = (Map.Entry) obj;
                    if (entry != null) {
                        arrayList = (List) entry.getValue();
                    } else {
                        arrayList = new ArrayList<>();
                    }
                }
                int a = C46110t.m88957a(this.f107221B, str, 0, str.length()) + m88888a(arrayList, str);
                if (i == 2) {
                    m88891a(canvas, arrayList, str, f - ((float) (a / 2)), f9 + f2 + ((float) (this.f107260t * i2)));
                } else if (i == 1) {
                    m88891a(canvas, arrayList, str, f, f9 + f2 + ((float) (this.f107260t * i2)));
                } else if (i == 3) {
                    m88891a(canvas, arrayList, str, f - ((float) a), f9 + f2 + ((float) (this.f107260t * i2)));
                }
            }
            canvas.restore();
        }
    }

    /* renamed from: a */
    private void m88890a(Canvas canvas, String str, int i, int i2, float f, float f2, Paint paint) {
        if (this.f107229J) {
            for (TextStickerTextWrap textStickerTextWrap : this.f107224E.getTextWrapList()) {
                if (!(textStickerTextWrap == null || TextUtils.isEmpty(textStickerTextWrap.getText()))) {
                    int color = paint.getColor();
                    paint.setColor(C46051f.m88907a(color));
                    Paint.Style style = paint.getStyle();
                    paint.setStyle(Paint.Style.FILL_AND_STROKE);
                    Paint.Cap strokeCap = paint.getStrokeCap();
                    paint.setStrokeCap(Paint.Cap.ROUND);
                    Paint.Join strokeJoin = paint.getStrokeJoin();
                    paint.setStrokeJoin(Paint.Join.ROUND);
                    float strokeWidth = paint.getStrokeWidth();
                    paint.setStrokeWidth(this.f107239T);
                    canvas.drawText(str, i, i2, f, f2, (Paint) this.f107221B);
                    paint.setColor(color);
                    paint.setStyle(style);
                    paint.setStrokeCap(strokeCap);
                    paint.setStrokeJoin(strokeJoin);
                    paint.setStrokeWidth(strokeWidth);
                    return;
                }
            }
        }
    }
}
