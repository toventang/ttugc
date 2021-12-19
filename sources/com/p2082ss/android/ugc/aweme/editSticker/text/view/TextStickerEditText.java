package com.p2082ss.android.ugc.aweme.editSticker.text.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.UnderlineSpan;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatEditText;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.editSticker.text.bean.C46110t;
import com.p2082ss.android.ugc.aweme.editSticker.text.bean.InteractTextStructWrap;
import com.p2082ss.android.ugc.aweme.editSticker.text.p2885a.C45989b;
import com.p2082ss.android.ugc.aweme.editSticker.text.p2886b.C46051f;
import com.p2082ss.android.ugc.tools.utils.C84912r;
import java.util.Iterator;
import java.util.List;
import p4600h.C89378p;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.editSticker.text.view.TextStickerEditText */
public class TextStickerEditText extends AppCompatEditText {

    /* renamed from: a */
    protected int f107630a;

    /* renamed from: b */
    protected Paint f107631b;

    /* renamed from: c */
    protected TextPaint f107632c;

    /* renamed from: d */
    protected Path f107633d;

    /* renamed from: e */
    protected int f107634e = -1;

    /* renamed from: f */
    protected int f107635f;

    /* renamed from: g */
    public List<InteractTextStructWrap> f107636g;

    /* renamed from: h */
    public boolean f107637h;

    /* renamed from: i */
    private int f107638i = 1;

    /* renamed from: j */
    private int f107639j = 2;

    /* renamed from: k */
    private int f107640k;

    /* renamed from: l */
    private int f107641l;

    /* renamed from: m */
    private boolean f107642m;

    /* renamed from: n */
    private int f107643n;

    /* renamed from: o */
    private int f107644o;

    /* renamed from: p */
    private float f107645p;

    /* renamed from: q */
    private float f107646q;

    static {
        Covode.recordClassIndex(54774);
    }

    /* access modifiers changed from: protected */
    public int getScene() {
        return 0;
    }

    public int getAlign() {
        return this.f107639j;
    }

    public int getBgColor() {
        return this.f107644o;
    }

    public int getBgColorMode() {
        return this.f107643n;
    }

    public List<InteractTextStructWrap> getTextStructWrapList() {
        return this.f107636g;
    }

    private String[] getTextStr() {
        if (TextUtils.isEmpty(getText())) {
            return null;
        }
        Layout layout = getLayout();
        String obj = getText().toString();
        String[] strArr = new String[getLineCount()];
        int i = 0;
        int i2 = 0;
        while (i < getLineCount()) {
            int lineEnd = layout.getLineEnd(i);
            strArr[i] = obj.substring(i2, lineEnd);
            layout.getLineBounds(i, new Rect());
            i++;
            i2 = lineEnd;
        }
        return strArr;
    }

    public void setMode(int i) {
        this.f107638i = i;
    }

    public void setTextStructWrapList(List<InteractTextStructWrap> list) {
        this.f107636g = list;
    }

    public void setMaxWidth(int i) {
        if (i > 0) {
            super.setMaxWidth(i);
        }
    }

    private void setMaskBlurColor(int i) {
        setTextColor(-1);
        setShadowLayer(12.0f, 0.0f, 0.0f, i);
    }

    /* renamed from: a */
    public static int m89132a(int i) {
        return Color.argb(153, (16711680 & i) >> 16, (65280 & i) >> 8, i & 255);
    }

    public void setAligin(int i) {
        this.f107639j = i;
        if (i == 1) {
            setGravity(3);
        } else if (i == 2) {
            setGravity(17);
        } else if (i == 3) {
            setGravity(5);
        }
    }

    public void setFontSize(int i) {
        float f = (float) i;
        float f2 = f / 28.0f;
        this.f107630a = (int) (C84912r.m145930a(getContext(), 6.0f) * f2);
        this.f107635f = (int) (C84912r.m145930a(getContext(), 5.0f) * f2);
        this.f107631b.setPathEffect(new CornerPathEffect((float) this.f107635f));
        setLineSpacing((float) this.f107630a, getLineSpacingMultiplier());
        setTextSize(f);
    }

    public void setFontType(Typeface typeface) {
        boolean z;
        if (getTypeface() != typeface) {
            setTypeface(typeface);
            if (this.f107632c.getTypeface() != typeface) {
                this.f107632c.setTypeface(typeface);
            }
        }
        C45989b a = C45989b.m88764a();
        int scene = getScene();
        if (a.mo77599d(scene) != null) {
            z = a.mo77599d(scene).mo77601a();
        } else {
            z = false;
        }
        this.f107642m = z;
        if (z) {
            setMaskBlurColor(getCurrentTextColor());
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        char c;
        char c2;
        int i;
        int i2 = this.f107638i;
        int i3 = 1;
        if (!(i2 == 1 || i2 == 4 || TextUtils.isEmpty(getText().toString()))) {
            this.f107631b.setColor(this.f107634e);
            String[] textStr = getTextStr();
            if (!(textStr == null || textStr.length == 0)) {
                int length = textStr.length;
                Point[][] pointArr = new Point[length][];
                Paint.FontMetrics fontMetrics = getPaint().getFontMetrics();
                int ceil = (int) Math.ceil((double) (fontMetrics.descent - fontMetrics.ascent));
                int textSize = ((int) getTextSize()) / 4;
                if (this.f107639j == 1) {
                    this.f107640k = getPaddingLeft();
                }
                if (this.f107639j == 3) {
                    this.f107640k = getMeasuredWidth() - getPaddingRight();
                }
                if (this.f107639j == 2) {
                    this.f107640k = getMeasuredWidth() / 2;
                }
                int i4 = -1;
                int i5 = -1;
                int i6 = 0;
                int i7 = 0;
                int i8 = 0;
                int i9 = 0;
                int i10 = 0;
                while (i6 < length) {
                    int measureText = (int) getPaint().measureText(textStr[i6]);
                    int i11 = this.f107640k;
                    int i12 = measureText / 2;
                    int i13 = this.f107630a;
                    int i14 = (i11 - i12) - (i13 * 2);
                    int i15 = i11 + i12 + (i13 * 2);
                    int i16 = this.f107639j;
                    if (i16 == i3) {
                        i14 = i11 - (i13 * 2);
                        i15 = i11 + measureText + (i13 * 2);
                    } else if (i16 == 3) {
                        i14 = (i11 - measureText) - (i13 * 2);
                        i15 = i11 + (i13 * 2);
                    }
                    if (TextUtils.isEmpty(textStr[i6]) || textStr[i6].trim().length() == 0) {
                        i15 = getMeasuredWidth() / 2;
                        int i17 = this.f107639j;
                        if (i17 == 1) {
                            i15 = this.f107630a;
                        }
                        if (i17 == 3) {
                            i15 = getMeasuredWidth() - this.f107630a;
                        }
                        i14 = i15;
                    }
                    if (Math.abs(measureText - i7) >= textSize || ((i = this.f107639j) != 1 ? i != 3 ? i != 2 || i9 <= 0 : i9 <= 0 : i8 <= 0)) {
                        i8 = i15;
                        i9 = i14;
                    }
                    if (i6 == 0) {
                        C45989b.m88764a();
                        int scene = getScene();
                        String[] strArr = C45989b.f107105a;
                        int length2 = strArr.length;
                        int i18 = 0;
                        while (true) {
                            if (i18 >= length2) {
                                i10 = this.f107641l - this.f107630a;
                                break;
                            } else if (strArr[i18].equals(C45989b.m88764a().mo77593b(scene))) {
                                i10 = this.f107641l;
                                break;
                            } else {
                                i18++;
                            }
                        }
                    }
                    int i19 = i10 + ceil;
                    if (length > 1) {
                        if (i6 > 0) {
                            i4 = (int) getPaint().measureText(textStr[i6 - 1]);
                        }
                        if (i6 < length - 1) {
                            i5 = (int) getPaint().measureText(textStr[i6 + 1]);
                        }
                    }
                    if (i4 > 0 && measureText >= i4) {
                        i19 += this.f107630a;
                    }
                    if (i5 > 0 && measureText > i5) {
                        i19 += this.f107630a;
                    }
                    if (i6 == 0) {
                        i10 -= this.f107630a;
                    }
                    if (i6 == length - 1) {
                        i19 += this.f107630a;
                    }
                    pointArr[i6] = new Point[]{new Point(i9, i10), new Point(i8, i10), new Point(i8, i19), new Point(i9, i19)};
                    i6++;
                    i7 = measureText;
                    i10 = i19;
                    i3 = 1;
                }
                this.f107633d.reset();
                for (int i20 = 0; i20 < length; i20++) {
                    if (i20 == 0) {
                        this.f107633d.moveTo((float) pointArr[i20][0].x, (float) pointArr[i20][0].y);
                    }
                    this.f107633d.lineTo((float) pointArr[i20][1].x, (float) pointArr[i20][1].y);
                    if (pointArr[i20][0].x == pointArr[i20][1].x) {
                        this.f107633d.lineTo((float) pointArr[i20][1].x, (float) pointArr[i20][1].y);
                        c2 = 2;
                        this.f107633d.lineTo((float) pointArr[i20][2].x, (float) pointArr[i20][2].y);
                    } else {
                        c2 = 2;
                    }
                    this.f107633d.lineTo((float) pointArr[i20][c2].x, (float) pointArr[i20][c2].y);
                }
                char c3 = 1;
                int i21 = length - 1;
                while (i21 >= 0) {
                    if (pointArr[i21][0].x == pointArr[i21][c3].x) {
                        c = 3;
                        this.f107633d.lineTo((float) pointArr[i21][3].x, (float) pointArr[i21][3].y);
                    } else {
                        c = 3;
                    }
                    this.f107633d.lineTo((float) pointArr[i21][c].x, (float) pointArr[i21][c].y);
                    if (pointArr[i21][0].x == pointArr[i21][1].x) {
                        this.f107633d.lineTo((float) pointArr[i21][0].x, (float) pointArr[i21][0].y);
                    }
                    this.f107633d.lineTo((float) pointArr[i21][0].x, (float) pointArr[i21][0].y);
                    i21--;
                    c3 = 1;
                }
                this.f107633d.lineTo((float) pointArr[0][1].x, (float) pointArr[0][1].y);
                canvas.drawPath(this.f107633d, this.f107631b);
            }
        }
        if (this.f107638i == 4) {
            TextPaint paint = getPaint();
            Paint.Cap strokeCap = paint.getStrokeCap();
            paint.setStrokeCap(Paint.Cap.ROUND);
            Paint.Join strokeJoin = paint.getStrokeJoin();
            paint.setStrokeJoin(Paint.Join.ROUND);
            Paint.Style style = paint.getStyle();
            paint.setStyle(Paint.Style.FILL_AND_STROKE);
            float strokeWidth = paint.getStrokeWidth();
            paint.setStrokeWidth(C46051f.m88906a(getContext(), getTextSize()));
            super.onDraw(canvas);
            canvas.drawRect(0.0f, 0.0f, ((float) Math.max(getLayout().getWidth(), getWidth())) * 1.5f, ((float) Math.max(getLayout().getHeight(), getHeight())) * 1.5f, this.f107632c);
            paint.setStrokeCap(strokeCap);
            paint.setStrokeJoin(strokeJoin);
            paint.setStyle(style);
            paint.setStrokeWidth(strokeWidth);
        }
        super.onDraw(canvas);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f107640k = getMeasuredWidth() / 2;
        this.f107641l = (getLineHeight() - this.f107630a) / 2;
    }

    /* renamed from: a */
    public final void mo78446a(int i, int i2) {
        this.f107643n = i;
        this.f107644o = i2;
        if (this.f107642m) {
            setMaskBlurColor(i2);
            this.f107638i = 1;
            return;
        }
        setShadowLayer(0.0f, 0.0f, 0.0f, i2);
        if (i == 1) {
            this.f107638i = 1;
            this.f107634e = i2;
            setBackground(null);
            setTextColor(i2);
        } else if (i == 4) {
            this.f107638i = 4;
            this.f107634e = i2;
            this.f107632c.setColor(C46051f.m88907a(i2));
            setBackground(null);
            setTextColor(i2);
            setShadowLayer(12.0f, 0.0f, 0.0f, 0);
            if (Build.VERSION.SDK_INT >= 28) {
                setFallbackLineSpacing(false);
            }
        } else if (i == 2) {
            this.f107638i = 2;
            this.f107634e = i2;
            if (i2 == -1) {
                setTextColor(-16777216);
            } else {
                setTextColor(-1);
            }
        } else if (i == 3) {
            this.f107638i = 3;
            this.f107634e = m89132a(i2);
            setTextColor(-1);
        }
    }

    /* access modifiers changed from: protected */
    public void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
        if (getText() != null && i == i2 && C46110t.m88965a(this.f107636g, getText().length())) {
            for (InteractTextStructWrap interactTextStructWrap : this.f107636g) {
                if (i > interactTextStructWrap.getRange().getStart() && i < interactTextStructWrap.getRange().getEnd()) {
                    setSelection(Math.min(interactTextStructWrap.getRange().getEnd(), getText().toString().length()));
                    return;
                }
            }
        }
    }

    public TextStickerEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f107630a = (int) C84912r.m145930a(context, 6.0f);
        this.f107635f = (int) C84912r.m145930a(context, 5.0f);
        this.f107646q = C46110t.m88956a(context);
        Paint paint = new Paint();
        this.f107631b = paint;
        paint.setColor(this.f107634e);
        this.f107631b.setStyle(Paint.Style.FILL);
        this.f107631b.setAntiAlias(true);
        this.f107631b.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        this.f107631b.setPathEffect(new CornerPathEffect((float) this.f107635f));
        this.f107633d = new Path();
        setLayerType(1, null);
        setLineSpacing((float) this.f107630a, getLineSpacingMultiplier());
        addTextChangedListener(new TextWatcher() {
            /* class com.p2082ss.android.ugc.aweme.editSticker.text.view.TextStickerEditText.C462131 */

            static {
                Covode.recordClassIndex(54775);
            }

            public final void afterTextChanged(Editable editable) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                C89378p pVar;
                T t;
                String substring;
                if (TextStickerEditText.this.f107637h) {
                    TextStickerEditText.this.f107637h = false;
                    return;
                }
                int i4 = i3 - i2;
                if (i4 < 0) {
                    List<InteractTextStructWrap> list = TextStickerEditText.this.f107636g;
                    String charSequence2 = charSequence.toString();
                    if (list == null) {
                        pVar = new C89378p(null, 0);
                    } else if (charSequence2 == null) {
                        pVar = new C89378p(null, 0);
                    } else if (i < 0 || i >= charSequence2.length()) {
                        pVar = new C89378p(null, 0);
                    } else {
                        Iterator<T> it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                t = null;
                                break;
                            }
                            t = it.next();
                            T t2 = t;
                            if (i > t2.getRange().getStart() && i < t2.getRange().getEnd()) {
                                break;
                            }
                        }
                        T t3 = t;
                        if (t3 == null || !t3.getRange().isValid(charSequence2.length())) {
                            pVar = new C89378p(null, 0);
                        } else {
                            String str = "";
                            if (!(t3.getRange().getStart() == 0 && t3.getRange().getEnd() == charSequence2.length())) {
                                if (t3.getRange().getStart() == 0) {
                                    substring = charSequence2.substring(t3.getRange().getEnd(), charSequence2.length());
                                    C89219l.m154716b(substring, str);
                                } else if (t3.getRange().getEnd() == charSequence2.length()) {
                                    substring = charSequence2.substring(0, t3.getRange().getStart());
                                    C89219l.m154716b(substring, str);
                                } else {
                                    StringBuilder sb = new StringBuilder();
                                    String substring2 = charSequence2.substring(0, t3.getRange().getStart());
                                    C89219l.m154716b(substring2, str);
                                    StringBuilder append = sb.append(substring2);
                                    String substring3 = charSequence2.substring(t3.getRange().getEnd(), charSequence2.length());
                                    C89219l.m154716b(substring3, str);
                                    str = append.append(substring3).toString();
                                }
                                str = substring;
                            }
                            C46110t.m88963a(list, t3);
                            pVar = new C89378p(str, Integer.valueOf(t3.getRange().getStart()));
                        }
                    }
                    if (pVar.getFirst() != null) {
                        TextStickerEditText.this.mo78447a((String) pVar.getFirst(), ((Integer) pVar.getSecond()).intValue());
                    } else {
                        C46110t.m88962a(TextStickerEditText.this.f107636g, i, i4);
                    }
                } else {
                    C46110t.m88962a(TextStickerEditText.this.f107636g, i, i4);
                }
            }
        });
        TextPaint textPaint = new TextPaint();
        this.f107632c = textPaint;
        textPaint.set(getPaint());
        this.f107632c.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        this.f107632c.setStyle(Paint.Style.FILL);
    }

    /* renamed from: a */
    public final void mo78447a(String str, int i) {
        if (str != null) {
            this.f107637h = true;
            if (!C46110t.m88965a(this.f107636g, str.length())) {
                setText(str);
                setSelection(Math.min(i, getText().toString().length()));
                return;
            }
            SpannableString spannableString = new SpannableString(str);
            Drawable drawable = getContext().getResources().getDrawable(2131232455);
            this.f107645p = getTextSize() * 0.7f;
            float f = this.f107645p;
            drawable.setBounds(new Rect(0, 0, (int) f, (int) f));
            for (InteractTextStructWrap interactTextStructWrap : this.f107636g) {
                if (interactTextStructWrap.isValid(str.length())) {
                    spannableString.setSpan(new C46243s(drawable, this.f107646q), interactTextStructWrap.getRange().getStart() + 1, interactTextStructWrap.getRange().getStart() + 2, 33);
                    spannableString.setSpan(new UnderlineSpan(), interactTextStructWrap.getRange().getStart() + 2, interactTextStructWrap.getRange().getEnd() - 1, 33);
                }
            }
            setText(spannableString);
            setSelection(Math.min(i, getText().toString().length()));
        }
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        float lineSpacingExtra = getLineSpacingExtra();
        float lineSpacingMultiplier = getLineSpacingMultiplier();
        setLineSpacing(0.0f, 1.0f);
        setLineSpacing(lineSpacingExtra, lineSpacingMultiplier);
        if (getLineCount() > 20) {
            String obj = getText().toString();
            mo78447a(obj.substring(0, obj.length() - 1), getText().length());
        }
    }
}
