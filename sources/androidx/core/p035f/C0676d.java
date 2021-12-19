package androidx.core.p035f;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import androidx.core.p036g.C0691d;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.Executor;

/* renamed from: androidx.core.f.d */
public class C0676d implements Spannable {

    /* renamed from: b */
    private static final Object f2721b = new Object();

    /* renamed from: c */
    private static Executor f2722c = null;

    /* renamed from: a */
    public final C0677a f2723a;

    /* renamed from: d */
    private final Spannable f2724d;

    /* renamed from: e */
    private final PrecomputedText f2725e;

    public int length() {
        return this.f2724d.length();
    }

    public String toString() {
        return this.f2724d.toString();
    }

    /* renamed from: androidx.core.f.d$a */
    public static final class C0677a {

        /* renamed from: a */
        public final TextPaint f2726a;

        /* renamed from: b */
        public final TextDirectionHeuristic f2727b;

        /* renamed from: c */
        public final int f2728c;

        /* renamed from: d */
        public final int f2729d;

        /* renamed from: e */
        final PrecomputedText.Params f2730e;

        static {
            Covode.recordClassIndex(756);
        }

        /* renamed from: androidx.core.f.d$a$a */
        public static class C0678a {

            /* renamed from: a */
            public TextDirectionHeuristic f2731a;

            /* renamed from: b */
            public int f2732b;

            /* renamed from: c */
            public int f2733c;

            /* renamed from: d */
            private final TextPaint f2734d;

            static {
                Covode.recordClassIndex(757);
            }

            /* renamed from: a */
            public final C0677a mo2716a() {
                return new C0677a(this.f2734d, this.f2731a, this.f2732b, this.f2733c);
            }

            public C0678a(TextPaint textPaint) {
                this.f2734d = textPaint;
                if (Build.VERSION.SDK_INT >= 23) {
                    this.f2732b = 1;
                    this.f2733c = 1;
                } else {
                    this.f2733c = 0;
                    this.f2732b = 0;
                }
                int i = Build.VERSION.SDK_INT;
                this.f2731a = TextDirectionHeuristics.FIRSTSTRONG_LTR;
            }
        }

        public final int hashCode() {
            if (Build.VERSION.SDK_INT >= 24) {
                return C0691d.m2447a(Float.valueOf(this.f2726a.getTextSize()), Float.valueOf(this.f2726a.getTextScaleX()), Float.valueOf(this.f2726a.getTextSkewX()), Float.valueOf(this.f2726a.getLetterSpacing()), Integer.valueOf(this.f2726a.getFlags()), this.f2726a.getTextLocales(), this.f2726a.getTypeface(), Boolean.valueOf(this.f2726a.isElegantTextHeight()), this.f2727b, Integer.valueOf(this.f2728c), Integer.valueOf(this.f2729d));
            } else if (Build.VERSION.SDK_INT >= 21) {
                return C0691d.m2447a(Float.valueOf(this.f2726a.getTextSize()), Float.valueOf(this.f2726a.getTextScaleX()), Float.valueOf(this.f2726a.getTextSkewX()), Float.valueOf(this.f2726a.getLetterSpacing()), Integer.valueOf(this.f2726a.getFlags()), this.f2726a.getTextLocale(), this.f2726a.getTypeface(), Boolean.valueOf(this.f2726a.isElegantTextHeight()), this.f2727b, Integer.valueOf(this.f2728c), Integer.valueOf(this.f2729d));
            } else {
                int i = Build.VERSION.SDK_INT;
                return C0691d.m2447a(Float.valueOf(this.f2726a.getTextSize()), Float.valueOf(this.f2726a.getTextScaleX()), Float.valueOf(this.f2726a.getTextSkewX()), Integer.valueOf(this.f2726a.getFlags()), this.f2726a.getTextLocale(), this.f2726a.getTypeface(), this.f2727b, Integer.valueOf(this.f2728c), Integer.valueOf(this.f2729d));
            }
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("{");
            sb.append("textSize=" + this.f2726a.getTextSize());
            sb.append(", textScaleX=" + this.f2726a.getTextScaleX());
            sb.append(", textSkewX=" + this.f2726a.getTextSkewX());
            if (Build.VERSION.SDK_INT >= 21) {
                sb.append(", letterSpacing=" + this.f2726a.getLetterSpacing());
                sb.append(", elegantTextHeight=" + this.f2726a.isElegantTextHeight());
            }
            if (Build.VERSION.SDK_INT >= 24) {
                sb.append(", textLocale=" + this.f2726a.getTextLocales());
            } else {
                int i = Build.VERSION.SDK_INT;
                sb.append(", textLocale=" + this.f2726a.getTextLocale());
            }
            sb.append(", typeface=" + this.f2726a.getTypeface());
            if (Build.VERSION.SDK_INT >= 26) {
                sb.append(", variationSettings=" + this.f2726a.getFontVariationSettings());
            }
            sb.append(", textDir=" + this.f2727b);
            sb.append(", breakStrategy=" + this.f2728c);
            sb.append(", hyphenationFrequency=" + this.f2729d);
            sb.append("}");
            return sb.toString();
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C0677a)) {
                return false;
            }
            C0677a aVar = (C0677a) obj;
            if (!mo2712a(aVar)) {
                return false;
            }
            int i = Build.VERSION.SDK_INT;
            if (this.f2727b != aVar.f2727b) {
                return false;
            }
            return true;
        }

        public C0677a(PrecomputedText.Params params) {
            this.f2726a = params.getTextPaint();
            this.f2727b = params.getTextDirection();
            this.f2728c = params.getBreakStrategy();
            this.f2729d = params.getHyphenationFrequency();
            this.f2730e = Build.VERSION.SDK_INT < 29 ? null : params;
        }

        /* renamed from: a */
        public final boolean mo2712a(C0677a aVar) {
            if ((Build.VERSION.SDK_INT >= 23 && (this.f2728c != aVar.f2728c || this.f2729d != aVar.f2729d)) || this.f2726a.getTextSize() != aVar.f2726a.getTextSize() || this.f2726a.getTextScaleX() != aVar.f2726a.getTextScaleX() || this.f2726a.getTextSkewX() != aVar.f2726a.getTextSkewX()) {
                return false;
            }
            if ((Build.VERSION.SDK_INT >= 21 && (this.f2726a.getLetterSpacing() != aVar.f2726a.getLetterSpacing() || !TextUtils.equals(this.f2726a.getFontFeatureSettings(), aVar.f2726a.getFontFeatureSettings()))) || this.f2726a.getFlags() != aVar.f2726a.getFlags()) {
                return false;
            }
            if (Build.VERSION.SDK_INT < 24) {
                int i = Build.VERSION.SDK_INT;
                if (!this.f2726a.getTextLocale().equals(aVar.f2726a.getTextLocale())) {
                    return false;
                }
            } else if (!this.f2726a.getTextLocales().equals(aVar.f2726a.getTextLocales())) {
                return false;
            }
            if (this.f2726a.getTypeface() == null) {
                if (aVar.f2726a.getTypeface() != null) {
                    return false;
                }
                return true;
            } else if (!this.f2726a.getTypeface().equals(aVar.f2726a.getTypeface())) {
                return false;
            } else {
                return true;
            }
        }

        C0677a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i, int i2) {
            if (Build.VERSION.SDK_INT >= 29) {
                this.f2730e = new PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i).setHyphenationFrequency(i2).setTextDirection(textDirectionHeuristic).build();
            } else {
                this.f2730e = null;
            }
            this.f2726a = textPaint;
            this.f2727b = textDirectionHeuristic;
            this.f2728c = i;
            this.f2729d = i2;
        }
    }

    static {
        Covode.recordClassIndex(755);
    }

    /* renamed from: a */
    public final PrecomputedText mo2700a() {
        Spannable spannable = this.f2724d;
        if (spannable instanceof PrecomputedText) {
            return (PrecomputedText) spannable;
        }
        return null;
    }

    public char charAt(int i) {
        return this.f2724d.charAt(i);
    }

    public int getSpanEnd(Object obj) {
        return this.f2724d.getSpanEnd(obj);
    }

    public int getSpanFlags(Object obj) {
        return this.f2724d.getSpanFlags(obj);
    }

    public int getSpanStart(Object obj) {
        return this.f2724d.getSpanStart(obj);
    }

    public void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        } else if (Build.VERSION.SDK_INT >= 29) {
            this.f2725e.removeSpan(obj);
        } else {
            this.f2724d.removeSpan(obj);
        }
    }

    public CharSequence subSequence(int i, int i2) {
        return this.f2724d.subSequence(i, i2);
    }

    public int nextSpanTransition(int i, int i2, Class cls) {
        return this.f2724d.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int i, int i2, Class<T> cls) {
        return Build.VERSION.SDK_INT >= 29 ? (T[]) this.f2725e.getSpans(i, i2, cls) : (T[]) this.f2724d.getSpans(i, i2, cls);
    }

    public void setSpan(Object obj, int i, int i2, int i3) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        } else if (Build.VERSION.SDK_INT >= 29) {
            this.f2725e.setSpan(obj, i, i2, i3);
        } else {
            this.f2724d.setSpan(obj, i, i2, i3);
        }
    }
}
