package androidx.emoji.p045a;

import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import androidx.core.p036g.C0697g;
import com.bytedance.covode.number.Covode;

/* renamed from: androidx.emoji.a.d */
public abstract class AbstractC0891d extends ReplacementSpan {

    /* renamed from: a */
    public final C0887b f3228a;

    /* renamed from: b */
    public short f3229b = -1;

    /* renamed from: c */
    public short f3230c = -1;

    /* renamed from: d */
    public float f3231d = 1.0f;

    /* renamed from: e */
    private final Paint.FontMetricsInt f3232e = new Paint.FontMetricsInt();

    static {
        Covode.recordClassIndex(977);
    }

    AbstractC0891d(C0887b bVar) {
        C0697g.m2453a(bVar, "metadata cannot be null");
        this.f3228a = bVar;
    }

    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        paint.getFontMetricsInt(this.f3232e);
        this.f3231d = (((float) Math.abs(this.f3232e.descent - this.f3232e.ascent)) * 1.0f) / ((float) this.f3228a.mo3179a().mo3822e());
        this.f3230c = (short) ((int) (((float) this.f3228a.mo3179a().mo3822e()) * this.f3231d));
        this.f3229b = (short) ((int) (((float) this.f3228a.mo3179a().mo3821d()) * this.f3231d));
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = this.f3232e.ascent;
            fontMetricsInt.descent = this.f3232e.descent;
            fontMetricsInt.top = this.f3232e.top;
            fontMetricsInt.bottom = this.f3232e.bottom;
        }
        return this.f3229b;
    }
}
