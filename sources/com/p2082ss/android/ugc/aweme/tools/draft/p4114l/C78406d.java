package com.p2082ss.android.ugc.aweme.tools.draft.p4114l;

import android.content.Context;
import android.graphics.Color;
import android.text.InputFilter;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.core.content.C0643b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17301b;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17303d;
import com.p2082ss.android.ugc.aweme.feed.model.AdLabel;
import com.p2082ss.android.ugc.aweme.feed.model.AnchorsExtras;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.model.TextExtraStruct;
import com.p2082ss.android.ugc.aweme.p2730de.C40970e;
import com.p2082ss.android.ugc.aweme.p2730de.C40973h;
import com.p2082ss.android.ugc.aweme.p2730de.C40977l;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.l.d */
public class C78406d extends C78404b {

    /* renamed from: a */
    public boolean f176159a = false;

    /* renamed from: b */
    public int f176160b;

    /* renamed from: c */
    private AbstractC78411e f176161c;

    /* renamed from: e */
    private int f176162e = 0;

    /* renamed from: f */
    private float f176163f = getTextSize();

    /* renamed from: g */
    private int f176164g = getCurrentTextColor();

    /* renamed from: h */
    private SpannableString f176165h;

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.l.d$d */
    public interface AbstractC78410d {
        static {
            Covode.recordClassIndex(91536);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.l.d$e */
    public interface AbstractC78411e {
        static {
            Covode.recordClassIndex(91537);
        }
    }

    static {
        Covode.recordClassIndex(91532);
    }

    public int getSpanColor() {
        return this.f176164g;
    }

    public float getSpanSize() {
        return this.f176163f;
    }

    public int getSpanStyle() {
        return this.f176162e;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView
    public CharSequence getText() {
        return super.getText();
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.l.d$a */
    class C78407a extends AbstractC78409c {

        /* renamed from: d */
        private AbstractC78411e f176167d;

        /* renamed from: e */
        private TextExtraStruct f176168e;

        /* renamed from: f */
        private int f176169f;

        /* renamed from: g */
        private AbstractC78410d f176170g;

        /* renamed from: h */
        private boolean f176171h;

        static {
            Covode.recordClassIndex(91533);
        }

        @Override // com.p2082ss.android.ugc.aweme.tools.draft.p4114l.C78406d.AbstractC78409c
        /* renamed from: a */
        public final void mo122346a(boolean z) {
            super.mo122346a(z);
        }

        public final void onClick(View view) {
            C40977l.m82500a(view, 1200);
        }

        public final void updateDrawState(TextPaint textPaint) {
            int i = C78406d.this.f176160b;
            if (i == 0 && (i = this.f176169f) == 0) {
                i = textPaint.linkColor;
            }
            if (this.f176177b) {
                i = C78406d.m136931a(i);
            }
            if (this.f176171h) {
                textPaint.setTypeface(C17301b.m32033a().mo27611a(C17303d.f41573g));
            }
            textPaint.setColor(i);
            textPaint.setUnderlineText(C78406d.this.f176159a);
        }

        C78407a(C78406d dVar, AbstractC78411e eVar, TextExtraStruct textExtraStruct, int i) {
            this(eVar, textExtraStruct, i, true, null);
        }

        C78407a(AbstractC78411e eVar, TextExtraStruct textExtraStruct, int i, boolean z, AbstractC78410d dVar) {
            super();
            TextPaint paint;
            int i2;
            this.f176167d = eVar;
            this.f176168e = textExtraStruct;
            this.f176169f = i;
            this.f176171h = z;
            if (C78406d.this.f176160b != 0) {
                paint = C78406d.this.getPaint();
                i2 = C78406d.this.f176160b;
            } else {
                paint = C78406d.this.getPaint();
                i2 = this.f176169f;
                if (i2 == 0) {
                    i2 = C78406d.this.getPaint().linkColor;
                }
            }
            paint.setColor(i2);
            this.f176170g = dVar;
        }
    }

    public void setOnSpanClickListener(AbstractC78411e eVar) {
        this.f176161c = eVar;
    }

    public void setShowUnderline(boolean z) {
        this.f176159a = z;
    }

    public void setSpanColor(int i) {
        this.f176160b = i;
    }

    public void setSpanSize(float f) {
        this.f176163f = f;
    }

    public void setSpanStyle(int i) {
        this.f176162e = i;
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.l.d$b */
    class C78408b extends AbstractC78409c {

        /* renamed from: d */
        private AbstractC78411e f176173d;

        /* renamed from: e */
        private TextExtraStruct f176174e;

        /* renamed from: f */
        private int f176175f;

        /* renamed from: g */
        private boolean f176176g;

        static {
            Covode.recordClassIndex(91534);
        }

        public final void onClick(View view) {
            C40977l.m82500a(view, 1200);
        }

        public final void updateDrawState(TextPaint textPaint) {
            int i = this.f176175f;
            if (i == 0) {
                i = textPaint.linkColor;
            }
            if (this.f176177b) {
                i = C78406d.m136931a(i);
            }
            textPaint.setColor(i);
            textPaint.setUnderlineText(C78406d.this.f176159a);
            textPaint.setFakeBoldText(this.f176176g);
        }

        C78408b(AbstractC78411e eVar, TextExtraStruct textExtraStruct, int i) {
            super();
            this.f176173d = eVar;
            this.f176174e = textExtraStruct;
            this.f176175f = i;
            this.f176176g = textExtraStruct.isBoldText();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.l.d$c */
    public abstract class AbstractC78409c extends ClickableSpan {

        /* renamed from: b */
        public boolean f176177b;

        static {
            Covode.recordClassIndex(91535);
        }

        public AbstractC78409c() {
        }

        /* renamed from: a */
        public void mo122346a(boolean z) {
            this.f176177b = z;
            C78406d.this.invalidate();
        }
    }

    public void setMaxSize(int i) {
        setFilters(new InputFilter[]{new InputFilter.LengthFilter(i)});
    }

    /* renamed from: a */
    public static int m136931a(int i) {
        return Color.argb(Math.round(((float) Color.alpha(i)) * 0.75f), Color.red(i), Color.green(i), Color.blue(i));
    }

    public void setAdHashTag(Aweme aweme) {
        boolean z;
        AdLabel adLabel;
        AdLabel adLabel2;
        Integer adLabelPosition;
        AdLabel adLabel3;
        Integer adLabelPosition2;
        C89219l.m154721d(aweme, "");
        String str = null;
        if (TextUtils.isEmpty(aweme.getAnchorsExtras())) {
            str = "";
        } else {
            AnchorsExtras anchorsExtras = (AnchorsExtras) C40973h.m82494a().mo46670a(aweme.getAnchorsExtras(), AnchorsExtras.class);
            if (anchorsExtras == null || (adLabel2 = anchorsExtras.getAdLabel()) == null || (adLabelPosition = adLabel2.getAdLabelPosition()) == null || adLabelPosition.intValue() != 1) {
                z = false;
            } else {
                z = true;
            }
            if (!(anchorsExtras == null || (adLabel = anchorsExtras.getAdLabel()) == null)) {
                str = adLabel.getAdLabelName();
            }
            if (!TextUtils.isEmpty(str)) {
                String str2 = str + ' ';
                if (!z || str2 == null) {
                    str = " ".concat(String.valueOf(str));
                } else {
                    str = str2;
                }
            }
        }
        if (this.f176165h != null && !TextUtils.isEmpty(str)) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f176165h);
            C89219l.m154721d(aweme, "");
            C89219l.m154721d(aweme, "");
            if (TextUtils.isEmpty(aweme.getAnchorsExtras())) {
                adLabelPosition2 = 1;
            } else {
                AnchorsExtras anchorsExtras2 = (AnchorsExtras) C40973h.m82494a().mo46670a(aweme.getAnchorsExtras(), AnchorsExtras.class);
                if (!(anchorsExtras2 == null || (adLabel3 = anchorsExtras2.getAdLabel()) == null)) {
                    adLabelPosition2 = adLabel3.getAdLabelPosition();
                }
                spannableStringBuilder.append((CharSequence) str);
                m136932a(spannableStringBuilder, this.f176165h.length() + 1, this.f176165h.length() + str.length());
                setText(spannableStringBuilder);
            }
            if (adLabelPosition2 != null && adLabelPosition2.intValue() == 1) {
                spannableStringBuilder.insert(0, (CharSequence) str);
                m136932a(spannableStringBuilder, 0, str.length());
                setText(spannableStringBuilder);
            }
            spannableStringBuilder.append((CharSequence) str);
            m136932a(spannableStringBuilder, this.f176165h.length() + 1, this.f176165h.length() + str.length());
            setText(spannableStringBuilder);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView
    public void onMeasure(int i, int i2) {
        try {
            super.onMeasure(i, i2);
        } catch (Exception e) {
            C40970e.m82484a(e);
        }
    }

    public C78406d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setHighlightColor(0);
    }

    /* renamed from: a */
    public final void mo122335a(List<TextExtraStruct> list, boolean z) {
        int start;
        int end;
        SpannableString spannableString = new SpannableString(getText());
        if (list == null || list.isEmpty() || TextUtils.isEmpty(spannableString.toString())) {
            this.f176165h = spannableString;
            return;
        }
        int length = spannableString.length();
        for (TextExtraStruct textExtraStruct : list) {
            if (textExtraStruct.getStart() <= textExtraStruct.getEnd() && textExtraStruct.getStart() <= length && textExtraStruct.getEnd() >= 0) {
                if (textExtraStruct.getStart() < 0) {
                    start = 0;
                } else {
                    start = textExtraStruct.getStart();
                }
                if (textExtraStruct.getEnd() > length) {
                    end = length;
                } else {
                    end = textExtraStruct.getEnd();
                }
                if (end > start) {
                    if (textExtraStruct.getType() == 65281) {
                        spannableString.setSpan(textExtraStruct.getCustomSpan(), start, end, 33);
                    } else if (textExtraStruct.getType() != 4) {
                        if (textExtraStruct.getType() == 65282) {
                            spannableString.setSpan(new C78408b(this.f176161c, textExtraStruct, textExtraStruct.getColor()), start, end, 33);
                        } else if (textExtraStruct.getType() == 5) {
                            spannableString.setSpan(new C78408b(this.f176161c, textExtraStruct, textExtraStruct.getColor()), start, end, 33);
                        } else if (textExtraStruct.getType() == 65285) {
                            Object customSpan = textExtraStruct.getCustomSpan();
                            int i = start + 1;
                            if (i > end) {
                                i = end;
                            }
                            spannableString.setSpan(customSpan, start, i, 33);
                            spannableString.setSpan(new StyleSpan(this.f176162e), start, end, 33);
                            if (customSpan instanceof AbstractC78410d) {
                                spannableString.setSpan(new C78407a(this.f176161c, textExtraStruct, this.f176164g, z, (AbstractC78410d) customSpan), start, end, 33);
                            }
                        } else {
                            if (textExtraStruct.getType() == 2) {
                                this.f176164g = C0643b.m2378c(getContext(), R.color.bx);
                            } else if (textExtraStruct.getType() == 0 || textExtraStruct.getType() == 1) {
                                this.f176164g = C0643b.m2378c(getContext(), R.color.ba);
                            } else if (textExtraStruct.getType() == 3) {
                                this.f176164g = C0643b.m2378c(getContext(), R.color.bx);
                            }
                            spannableString.setSpan(new C78407a(this, this.f176161c, textExtraStruct, this.f176164g), start, end, 33);
                            if (textExtraStruct.getType() == 3) {
                                spannableString.setSpan(new StyleSpan(1), start, end, 33);
                            } else {
                                spannableString.setSpan(new StyleSpan(this.f176162e), start, end, 33);
                            }
                            spannableString.setSpan(new AbsoluteSizeSpan((int) this.f176163f), start, end, 33);
                        }
                    }
                }
            }
        }
        this.f176165h = spannableString;
        setText(spannableString);
    }

    /* renamed from: a */
    private static void m136932a(SpannableStringBuilder spannableStringBuilder, int i, int i2) {
        spannableStringBuilder.setSpan(new StyleSpan(1), i, i2, 33);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(-1), i, i2, 33);
    }

    /* renamed from: a */
    public final void mo122334a(int i, int i2, Object obj) {
        int length;
        SpannableString spannableString = this.f176165h;
        if (spannableString != null && i <= (length = spannableString.length()) && i2 <= length && i <= i2) {
            this.f176165h.setSpan(obj, i, i2, 33);
            setText(this.f176165h, TextView.BufferType.SPANNABLE);
        }
    }
}
