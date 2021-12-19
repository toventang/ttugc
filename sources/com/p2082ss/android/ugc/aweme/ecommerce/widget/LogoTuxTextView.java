package com.p2082ss.android.ugc.aweme.ecommerce.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LevelListDrawable;
import android.os.Build;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.widget.TextView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.p1480c.AbstractC20737n;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.ecommerce.api.model.Image;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.dto.PromotionLogo;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.widget.LogoTuxTextView */
public final class LogoTuxTextView extends TuxTextView {

    /* renamed from: a */
    public static final C45579b f106144a = new C45579b((byte) 0);

    /* renamed from: b */
    private List<PromotionLogo> f106145b;

    static {
        Covode.recordClassIndex(54073);
    }

    public LogoTuxTextView(Context context) {
        this(context, (AttributeSet) null, 6);
    }

    public LogoTuxTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.widget.LogoTuxTextView$b */
    public static final class C45579b {
        static {
            Covode.recordClassIndex(54075);
        }

        private C45579b() {
        }

        public /* synthetic */ C45579b(byte b) {
            this();
        }
    }

    public final List<PromotionLogo> getLogoList() {
        return this.f106145b;
    }

    public final void setLogoList(List<PromotionLogo> list) {
        this.f106145b = list;
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.widget.LogoTuxTextView$a */
    public static final class C45578a extends ImageSpan {
        static {
            Covode.recordClassIndex(54074);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C45578a(Drawable drawable) {
            super(drawable);
            C89219l.m154721d(drawable, "");
        }

        public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
            C89219l.m154721d(canvas, "");
            C89219l.m154721d(paint, "");
            canvas.save();
            Drawable drawable = getDrawable();
            C89219l.m154716b(drawable, "");
            canvas.translate(f, (float) (((i5 - i3) / 2) - (drawable.getBounds().height() / 2)));
            getDrawable().draw(canvas);
            canvas.restore();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.widget.LogoTuxTextView$c */
    public static final class C45580c implements Html.ImageGetter {

        /* renamed from: a */
        public final Context f106146a;

        /* renamed from: b */
        public final TextView f106147b;

        static {
            Covode.recordClassIndex(54076);
        }

        public final Drawable getDrawable(String str) {
            C89219l.m154721d(str, "");
            LevelListDrawable levelListDrawable = new LevelListDrawable();
            C20761r.m39061a(str).mo34182a(new C45581a(this, levelListDrawable));
            return levelListDrawable;
        }

        /* renamed from: com.ss.android.ugc.aweme.ecommerce.widget.LogoTuxTextView$c$a */
        public static final class C45581a implements AbstractC20737n {

            /* renamed from: a */
            final /* synthetic */ C45580c f106148a;

            /* renamed from: b */
            final /* synthetic */ LevelListDrawable f106149b;

            static {
                Covode.recordClassIndex(54077);
            }

            @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20737n
            /* renamed from: a */
            public final void mo34150a() {
            }

            @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20737n
            /* renamed from: a */
            public final void mo34166a(Throwable th) {
            }

            @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20737n
            /* renamed from: a */
            public final void mo34165a(Bitmap bitmap) {
                if (bitmap != null) {
                    this.f106149b.addLevel(1, 1, new BitmapDrawable(this.f106148a.f106146a.getResources(), bitmap));
                    this.f106149b.setBounds(0, 0, bitmap.getWidth(), bitmap.getHeight());
                    this.f106149b.setLevel(1);
                    this.f106148a.f106147b.invalidate();
                }
            }

            C45581a(C45580c cVar, LevelListDrawable levelListDrawable) {
                this.f106148a = cVar;
                this.f106149b = levelListDrawable;
            }
        }

        public C45580c(Context context, TextView textView) {
            C89219l.m154721d(context, "");
            C89219l.m154721d(textView, "");
            this.f106146a = context;
            this.f106147b = textView;
        }
    }

    /* renamed from: a */
    public final void mo76800a(CharSequence charSequence, List<PromotionLogo> list) {
        if (list == null || list.isEmpty()) {
            setText(charSequence);
        } else {
            m88127b(charSequence, list);
        }
    }

    /* renamed from: b */
    private final void m88127b(CharSequence charSequence, List<PromotionLogo> list) {
        int i;
        Spanned fromHtml;
        List<String> urls;
        String str;
        StringBuilder sb = new StringBuilder();
        Iterator<PromotionLogo> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Image image = it.next().f104702a;
            if (!(image == null || (urls = image.getUrls()) == null || (str = urls.get(0)) == null)) {
                String a = C1764a.m5928a("<img src='%s'>", Arrays.copyOf(new Object[]{str}, 1));
                C89219l.m154716b(a, "");
                sb.append(a);
            }
        }
        sb.append(" ");
        sb.append(charSequence);
        String sb2 = sb.toString();
        C89219l.m154716b(sb2, "");
        if (Build.VERSION.SDK_INT >= 24) {
            Context context = getContext();
            C89219l.m154716b(context, "");
            fromHtml = Html.fromHtml(sb2, 0, new C45580c(context, this), null);
        } else {
            Context context2 = getContext();
            C89219l.m154716b(context2, "");
            fromHtml = Html.fromHtml(sb2, new C45580c(context2, this), null);
        }
        if (fromHtml instanceof SpannableStringBuilder) {
            ImageSpan[] imageSpanArr = (ImageSpan[]) fromHtml.getSpans(0, fromHtml.length(), ImageSpan.class);
            for (ImageSpan imageSpan : imageSpanArr) {
                int spanStart = fromHtml.getSpanStart(imageSpan);
                int spanEnd = fromHtml.getSpanEnd(imageSpan);
                C89219l.m154716b(imageSpan, "");
                Drawable drawable = imageSpan.getDrawable();
                C89219l.m154716b(drawable, "");
                SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) fromHtml;
                spannableStringBuilder.setSpan(new C45578a(drawable), spanStart, spanEnd, 34);
                spannableStringBuilder.removeSpan(imageSpan);
            }
        }
        setText(fromHtml);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private LogoTuxTextView(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private /* synthetic */ LogoTuxTextView(Context context, AttributeSet attributeSet, int i) {
        this(context, (i & 2) != 0 ? null : attributeSet, (byte) 0);
    }
}
