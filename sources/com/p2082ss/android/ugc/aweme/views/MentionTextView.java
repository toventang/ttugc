package com.p2082ss.android.ugc.aweme.views;

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
import android.view.MotionEvent;
import android.view.View;
import androidx.core.content.C0643b;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.p1719f.p1720a.C23126b;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.feed.model.AdLabel;
import com.p2082ss.android.ugc.aweme.feed.model.AnchorsExtras;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.p2977v.C50480a;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.model.TextExtraStruct;
import com.p2082ss.android.ugc.aweme.p3382l.p3383a.C58001a;
import com.p2082ss.android.ugc.aweme.utils.C80342dg;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.views.MentionTextView */
public class MentionTextView extends C81431c {

    /* renamed from: a */
    private AbstractC81409f f181875a;

    /* renamed from: b */
    private int f181876b;

    /* renamed from: c */
    private float f181877c;

    /* renamed from: e */
    private int f181878e;

    /* renamed from: f */
    private SpannableString f181879f;

    /* renamed from: g */
    public boolean f181880g;

    /* renamed from: h */
    public int f181881h;

    /* renamed from: i */
    float f181882i;

    /* renamed from: com.ss.android.ugc.aweme.views.MentionTextView$d */
    public interface AbstractC81407d {
        static {
            Covode.recordClassIndex(94760);
        }

        /* renamed from: a */
        boolean mo59077a(TextExtraStruct textExtraStruct);
    }

    /* renamed from: com.ss.android.ugc.aweme.views.MentionTextView$e */
    public interface AbstractC81408e {
        static {
            Covode.recordClassIndex(94761);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.views.MentionTextView$f */
    public interface AbstractC81409f {
        static {
            Covode.recordClassIndex(94762);
        }

        /* renamed from: a */
        void mo63408a(TextExtraStruct textExtraStruct);
    }

    static {
        Covode.recordClassIndex(94756);
    }

    public int getSpanColor() {
        return this.f181878e;
    }

    public float getSpanSize() {
        return this.f181877c;
    }

    public int getSpanStyle() {
        return this.f181876b;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView
    public CharSequence getText() {
        return super.getText();
    }

    /* renamed from: a */
    private void m141108a() {
        this.f181880g = false;
        this.f181876b = 0;
        this.f181877c = getTextSize();
        this.f181878e = getCurrentTextColor();
        setHighlightColor(0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.views.MentionTextView$a */
    public class C81404a extends AbstractC81406c {

        /* renamed from: d */
        private AbstractC81409f f181884d;

        /* renamed from: e */
        private TextExtraStruct f181885e;

        /* renamed from: f */
        private int f181886f;

        /* renamed from: g */
        private AbstractC81408e f181887g;

        static {
            Covode.recordClassIndex(94757);
        }

        @Override // com.p2082ss.android.ugc.aweme.views.MentionTextView.AbstractC81406c
        /* renamed from: a */
        public final void mo125011a(boolean z) {
            super.mo125011a(z);
        }

        public final void onClick(View view) {
            AbstractC81409f fVar;
            if (!C58001a.m104815a(view, 1200) && (fVar = this.f181884d) != null) {
                fVar.mo63408a(this.f181885e);
            }
        }

        public final void updateDrawState(TextPaint textPaint) {
            int i = MentionTextView.this.f181881h;
            if (i == 0 && (i = this.f181886f) == 0) {
                i = textPaint.linkColor;
            }
            if (this.f181893b) {
                i = MentionTextView.m141107a(i);
            }
            textPaint.setColor(i);
            textPaint.setUnderlineText(MentionTextView.this.f181880g);
        }

        C81404a(AbstractC81409f fVar, TextExtraStruct textExtraStruct, int i, AbstractC81408e eVar) {
            super();
            TextPaint paint;
            int i2;
            this.f181884d = fVar;
            this.f181885e = textExtraStruct;
            this.f181886f = i;
            if (MentionTextView.this.f181881h != 0) {
                paint = MentionTextView.this.getPaint();
                i2 = MentionTextView.this.f181881h;
            } else {
                paint = MentionTextView.this.getPaint();
                i2 = this.f181886f;
                if (i2 == 0) {
                    i2 = MentionTextView.this.getPaint().linkColor;
                }
            }
            paint.setColor(i2);
            this.f181887g = eVar;
        }
    }

    public void setOnSpanClickListener(AbstractC81409f fVar) {
        this.f181875a = fVar;
    }

    public void setShowUnderline(boolean z) {
        this.f181880g = z;
    }

    public void setSpanColor(int i) {
        this.f181881h = i;
    }

    public void setSpanSize(float f) {
        this.f181877c = f;
    }

    public void setSpanStyle(int i) {
        this.f181876b = i;
    }

    /* renamed from: com.ss.android.ugc.aweme.views.MentionTextView$c */
    public abstract class AbstractC81406c extends ClickableSpan {

        /* renamed from: b */
        public boolean f181893b;

        static {
            Covode.recordClassIndex(94759);
        }

        public AbstractC81406c() {
        }

        /* renamed from: a */
        public void mo125011a(boolean z) {
            this.f181893b = z;
            MentionTextView.this.invalidate();
        }
    }

    public MentionTextView(Context context) {
        super(context);
        m141108a();
    }

    public void setMaxSize(int i) {
        setFilters(new InputFilter[]{new InputFilter.LengthFilter(i)});
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.views.MentionTextView$b */
    public class C81405b extends AbstractC81406c {

        /* renamed from: d */
        private AbstractC81409f f181889d;

        /* renamed from: e */
        private TextExtraStruct f181890e;

        /* renamed from: f */
        private int f181891f;

        /* renamed from: g */
        private boolean f181892g;

        static {
            Covode.recordClassIndex(94758);
        }

        public final void onClick(View view) {
            AbstractC81409f fVar;
            if (!C58001a.m104815a(view, 1200) && (fVar = this.f181889d) != null) {
                fVar.mo63408a(this.f181890e);
            }
        }

        public final void updateDrawState(TextPaint textPaint) {
            int i = this.f181891f;
            if (i == 0) {
                i = textPaint.linkColor;
            }
            if (this.f181893b) {
                i = MentionTextView.m141107a(i);
            }
            textPaint.setColor(i);
            textPaint.setUnderlineText(MentionTextView.this.f181880g);
            textPaint.setFakeBoldText(this.f181892g);
        }

        C81405b(AbstractC81409f fVar, TextExtraStruct textExtraStruct, int i) {
            super();
            this.f181889d = fVar;
            this.f181890e = textExtraStruct;
            this.f181891f = i;
            this.f181892g = textExtraStruct.isBoldText();
        }
    }

    /* renamed from: a */
    public static int m141107a(int i) {
        return Color.argb(Math.round(((float) Color.alpha(i)) * 0.75f), Color.red(i), Color.green(i), Color.blue(i));
    }

    @Override // com.p2082ss.android.ugc.aweme.views.C81431c
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (C50480a.m94644a() && getLineHeight() * getLineCount() > getHeight()) {
            if (motionEvent.getAction() == 0) {
                this.f181882i = motionEvent.getY();
            } else if (motionEvent.getAction() == 2) {
                float y = this.f181882i - motionEvent.getY();
                if (y > 0.0f) {
                    getParent().requestDisallowInterceptTouchEvent(false);
                } else if (y < 0.0f) {
                    if (getScrollY() == 0) {
                        getParent().requestDisallowInterceptTouchEvent(false);
                    } else {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                }
                this.f181882i = motionEvent.getY();
            } else {
                getParent().requestDisallowInterceptTouchEvent(false);
            }
        }
        return super.onTouchEvent(motionEvent);
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
            AnchorsExtras anchorsExtras = (AnchorsExtras) C80342dg.m139300a().mo46670a(aweme.getAnchorsExtras(), AnchorsExtras.class);
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
        if (this.f181879f != null && !TextUtils.isEmpty(str)) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f181879f);
            C89219l.m154721d(aweme, "");
            C89219l.m154721d(aweme, "");
            if (TextUtils.isEmpty(aweme.getAnchorsExtras())) {
                adLabelPosition2 = 1;
            } else {
                AnchorsExtras anchorsExtras2 = (AnchorsExtras) C80342dg.m139300a().mo46670a(aweme.getAnchorsExtras(), AnchorsExtras.class);
                if (!(anchorsExtras2 == null || (adLabel3 = anchorsExtras2.getAdLabel()) == null)) {
                    adLabelPosition2 = adLabel3.getAdLabelPosition();
                }
                spannableStringBuilder.append((CharSequence) str);
                m141109a(spannableStringBuilder, this.f181879f.length() + 1, this.f181879f.length() + str.length());
                setText(spannableStringBuilder);
            }
            if (adLabelPosition2 != null && adLabelPosition2.intValue() == 1) {
                spannableStringBuilder.insert(0, (CharSequence) str);
                m141109a(spannableStringBuilder, 0, str.length());
                setText(spannableStringBuilder);
            }
            spannableStringBuilder.append((CharSequence) str);
            m141109a(spannableStringBuilder, this.f181879f.length() + 1, this.f181879f.length() + str.length());
            setText(spannableStringBuilder);
        }
    }

    /* renamed from: a */
    public final void mo124998a(List<TextExtraStruct> list, AbstractC81407d dVar) {
        mo124999a(list, dVar, (AbstractC81407d) null);
    }

    public MentionTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m141108a();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView
    public void onMeasure(int i, int i2) {
        try {
            super.onMeasure(i, i2);
        } catch (Exception e) {
            C51423a.m95788a("", e);
        }
    }

    /* renamed from: a */
    public final void mo124997a(CharSequence charSequence, String str) {
        SpannableStringBuilder spannableStringBuilder;
        if (!C81466s.m141248a() || (!TextUtils.equals("ko", str) && !TextUtils.equals("ja", str) && !TextUtils.equals("zh-Hant", str))) {
            setText(charSequence);
            return;
        }
        int a = C34728n.m70946a((double) C81466s.m141249b());
        if (charSequence instanceof SpannableStringBuilder) {
            spannableStringBuilder = (SpannableStringBuilder) charSequence;
        } else {
            spannableStringBuilder = new SpannableStringBuilder(charSequence);
        }
        spannableStringBuilder.setSpan(new C81440j(a), 0, charSequence.length(), 33);
        setLineSpacing(0.0f, 1.0f);
        setText(spannableStringBuilder);
    }

    /* renamed from: a */
    private static void m141109a(SpannableStringBuilder spannableStringBuilder, int i, int i2) {
        spannableStringBuilder.setSpan(new StyleSpan(1), i, i2, 33);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(-1), i, i2, 33);
    }

    /* renamed from: a */
    public final void mo124996a(int i, int i2, Object obj) {
        int length;
        SpannableString spannableString = this.f181879f;
        if (spannableString != null && i <= (length = spannableString.length()) && i2 <= length && i <= i2) {
            this.f181879f.setSpan(obj, i, i2, 33);
            setText(this.f181879f);
        }
    }

    /* renamed from: a */
    public final void mo124999a(List<TextExtraStruct> list, AbstractC81407d dVar, AbstractC81407d dVar2) {
        int start;
        int end;
        SpannableString spannableString = new SpannableString(getText());
        if (list == null || list.isEmpty() || TextUtils.isEmpty(spannableString.toString())) {
            this.f181879f = spannableString;
            return;
        }
        int length = spannableString.length();
        for (TextExtraStruct textExtraStruct : list) {
            if ((dVar == null || !dVar.mo59077a(textExtraStruct)) && textExtraStruct.getStart() <= textExtraStruct.getEnd() && textExtraStruct.getStart() <= length && textExtraStruct.getEnd() >= 0) {
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
                    } else if (textExtraStruct.getType() != 4 && (dVar2 == null || !dVar2.mo59077a(textExtraStruct))) {
                        if (textExtraStruct.getType() == 65282) {
                            spannableString.setSpan(new C81405b(this.f181875a, textExtraStruct, textExtraStruct.getColor()), start, end, 33);
                        } else if (textExtraStruct.getType() == 5) {
                            spannableString.setSpan(new C81405b(this.f181875a, textExtraStruct, textExtraStruct.getColor()), start, end, 33);
                        } else if (textExtraStruct.getType() == 65285) {
                            Object customSpan = textExtraStruct.getCustomSpan();
                            int i = start + 1;
                            if (i > end) {
                                i = end;
                            }
                            spannableString.setSpan(customSpan, start, i, 33);
                            spannableString.setSpan(new StyleSpan(this.f181876b), start, end, 33);
                            if (customSpan instanceof AbstractC81408e) {
                                spannableString.setSpan(new C81404a(this.f181875a, textExtraStruct, this.f181878e, (AbstractC81408e) customSpan), start, end, 33);
                            }
                        } else {
                            if (textExtraStruct.getType() == 2) {
                                this.f181878e = C0643b.m2378c(getContext(), R.color.bx);
                            } else if (textExtraStruct.getType() == 0 || textExtraStruct.getType() == 1 || textExtraStruct.getType() == 5) {
                                this.f181878e = C0643b.m2378c(getContext(), R.color.ba);
                            } else if (textExtraStruct.getType() == 3) {
                                this.f181878e = C0643b.m2378c(getContext(), R.color.bx);
                            }
                            spannableString.setSpan(new C81404a(this.f181875a, textExtraStruct, this.f181878e, null), start, end, 33);
                            spannableString.setSpan(new C23126b(12, true), start, end, 33);
                            if (textExtraStruct.getType() == 3) {
                                spannableString.setSpan(new StyleSpan(1), start, end, 33);
                            } else {
                                spannableString.setSpan(new StyleSpan(this.f181876b), start, end, 33);
                            }
                            spannableString.setSpan(new AbsoluteSizeSpan((int) this.f181877c), start, end, 33);
                        }
                    }
                }
            }
        }
        this.f181879f = spannableString;
        setText(spannableString);
    }
}
