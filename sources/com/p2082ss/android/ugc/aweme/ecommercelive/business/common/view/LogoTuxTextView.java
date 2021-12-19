package com.p2082ss.android.ugc.aweme.ecommercelive.business.common.view;

import android.content.Context;
import android.content.res.TypedArray;
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
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.ecommercebase.dto.GImage;
import com.p2082ss.android.ugc.aweme.ecommercelive.business.audience.api.p2867a.C45697h;
import com.p2082ss.android.ugc.trill.R;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommercelive.business.common.view.LogoTuxTextView */
public final class LogoTuxTextView extends TuxTextView {

    /* renamed from: a */
    public static final C45801b f106701a = new C45801b((byte) 0);

    /* renamed from: b */
    private List<C45697h> f106702b;

    /* renamed from: e */
    private double f106703e;

    /* renamed from: f */
    private double f106704f;

    static {
        Covode.recordClassIndex(54318);
    }

    public LogoTuxTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommercelive.business.common.view.LogoTuxTextView$b */
    public static final class C45801b {
        static {
            Covode.recordClassIndex(54320);
        }

        private C45801b() {
        }

        public /* synthetic */ C45801b(byte b) {
            this();
        }
    }

    public final List<C45697h> getLogoList() {
        return this.f106702b;
    }

    public final void setLogoList(List<C45697h> list) {
        this.f106702b = list;
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommercelive.business.common.view.LogoTuxTextView$a */
    public static final class C45800a extends ImageSpan {
        static {
            Covode.recordClassIndex(54319);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C45800a(Drawable drawable) {
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

    /* renamed from: com.ss.android.ugc.aweme.ecommercelive.business.common.view.LogoTuxTextView$c */
    public static final class C45802c implements Html.ImageGetter {

        /* renamed from: a */
        public final Context f106705a;

        /* renamed from: b */
        public final TextView f106706b;

        /* renamed from: c */
        public final double f106707c;

        /* renamed from: d */
        public final double f106708d;

        static {
            Covode.recordClassIndex(54321);
        }

        public final Drawable getDrawable(String str) {
            C89219l.m154721d(str, "");
            LevelListDrawable levelListDrawable = new LevelListDrawable();
            C20761r.m39061a(str).mo34182a(new C45803a(this, levelListDrawable));
            return levelListDrawable;
        }

        /* renamed from: com.ss.android.ugc.aweme.ecommercelive.business.common.view.LogoTuxTextView$c$a */
        public static final class C45803a implements AbstractC20737n {

            /* renamed from: a */
            final /* synthetic */ C45802c f106709a;

            /* renamed from: b */
            final /* synthetic */ LevelListDrawable f106710b;

            static {
                Covode.recordClassIndex(54322);
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
                    this.f106710b.addLevel(1, 1, new BitmapDrawable(this.f106709a.f106705a.getResources(), bitmap));
                    if (this.f106709a.f106707c == -1.0d && this.f106709a.f106708d == -1.0d) {
                        this.f106710b.setBounds(0, 0, bitmap.getWidth(), bitmap.getHeight());
                    } else {
                        this.f106710b.setBounds(0, 0, (int) this.f106709a.f106707c, (int) this.f106709a.f106708d);
                    }
                    this.f106710b.setLevel(1);
                    this.f106709a.f106706b.invalidate();
                }
            }

            C45803a(C45802c cVar, LevelListDrawable levelListDrawable) {
                this.f106709a = cVar;
                this.f106710b = levelListDrawable;
            }
        }

        public C45802c(Context context, TextView textView, double d, double d2) {
            C89219l.m154721d(context, "");
            C89219l.m154721d(textView, "");
            this.f106705a = context;
            this.f106706b = textView;
            this.f106707c = d;
            this.f106708d = d2;
        }
    }

    /* renamed from: a */
    public final void mo77103a(CharSequence charSequence, List<C45697h> list) {
        if (list == null || list.isEmpty()) {
            setText(charSequence);
        } else {
            m88413b(charSequence, list);
        }
    }

    /* renamed from: b */
    private final void m88413b(CharSequence charSequence, List<C45697h> list) {
        int i;
        Spanned fromHtml;
        List<String> urls;
        String str;
        StringBuilder sb = new StringBuilder();
        Iterator<C45697h> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            GImage gImage = it.next().f106414a;
            if (!(gImage == null || (urls = gImage.getUrls()) == null || (str = urls.get(0)) == null)) {
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
            fromHtml = Html.fromHtml(sb2, 0, new C45802c(context, this, this.f106703e, this.f106704f), null);
        } else {
            Context context2 = getContext();
            C89219l.m154716b(context2, "");
            fromHtml = Html.fromHtml(sb2, new C45802c(context2, this, this.f106703e, this.f106704f), null);
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
                spannableStringBuilder.setSpan(new C45800a(drawable), spanStart, spanEnd, 34);
                spannableStringBuilder.removeSpan(imageSpan);
            }
        }
        setText(fromHtml);
    }

    private /* synthetic */ LogoTuxTextView(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private LogoTuxTextView(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.a3r, R.attr.a3s});
        C89219l.m154716b(obtainStyledAttributes, "");
        this.f106703e = (double) obtainStyledAttributes.getDimensionPixelSize(1, C34728n.m70946a(-1.0d));
        this.f106704f = (double) obtainStyledAttributes.getDimensionPixelSize(0, C34728n.m70946a(-1.0d));
        obtainStyledAttributes.recycle();
    }
}
