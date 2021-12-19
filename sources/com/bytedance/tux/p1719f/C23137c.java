package com.bytedance.tux.p1719f;

import android.content.Context;
import android.graphics.Color;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.p1708b.C22978b;
import com.bytedance.tux.p1708b.C22981e;
import com.bytedance.tux.p1708b.C22982f;
import com.bytedance.tux.p1708b.C22983g;
import com.bytedance.tux.p1710c.C22999a;
import com.bytedance.tux.p1710c.C23005c;
import com.bytedance.tux.p1719f.p1720a.AbstractC23124a;
import com.bytedance.tux.p1719f.p1720a.C23127c;
import com.bytedance.tux.p1722h.C23155d;
import com.bytedance.tux.p1722h.C23163i;
import com.p2082ss.android.ugc.trill.R;
import java.util.Map;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.bytedance.tux.f.c */
public final class C23137c {

    /* renamed from: a */
    public C22999a f54758a;

    /* renamed from: b */
    public boolean f54759b = true;

    /* renamed from: c */
    public int f54760c;

    /* renamed from: d */
    public int f54761d;

    /* renamed from: e */
    public boolean f54762e = true;

    /* renamed from: f */
    public AbstractC89171a<C89391z> f54763f;

    /* renamed from: g */
    private String f54764g;

    /* renamed from: h */
    private Integer f54765h;

    /* renamed from: com.bytedance.tux.f.c$a */
    static final class C23138a extends AbstractC23124a implements AbstractC23124a.AbstractC23125a {

        /* renamed from: a */
        public static final C23139a f54766a = new C23139a((byte) 0);

        /* renamed from: b */
        private int f54767b;

        /* renamed from: c */
        private final AbstractC89171a<C89391z> f54768c;

        /* renamed from: d */
        private final int f54769d;

        static {
            Covode.recordClassIndex(27067);
        }

        /* renamed from: com.bytedance.tux.f.c$a$a */
        public static final class C23139a {
            static {
                Covode.recordClassIndex(27068);
            }

            private C23139a() {
            }

            public /* synthetic */ C23139a(byte b) {
                this();
            }
        }

        public final void onClick(View view) {
            C89219l.m154719c(view, "");
            AbstractC89171a<C89391z> aVar = this.f54768c;
            if (aVar != null) {
                aVar.invoke();
            }
        }

        /* renamed from: a */
        private final void m43605a(Spannable spannable) {
            Object[] spans = spannable.getSpans(0, spannable.length(), C23127c.class);
            C89219l.m154709a((Object) spans, "");
            for (Object obj : spans) {
                ((C23127c) obj).mo37613a(this.f54767b);
            }
        }

        public final void updateDrawState(TextPaint textPaint) {
            C89219l.m154719c(textPaint, "");
            textPaint.setColor(Color.argb(this.f54767b, Color.red(this.f54769d), Color.green(this.f54769d), Color.blue(this.f54769d)));
        }

        public C23138a(AbstractC89171a<C89391z> aVar, int i) {
            this.f54768c = aVar;
            this.f54769d = i;
            this.f54767b = Color.alpha(i);
        }

        @Override // com.bytedance.tux.p1719f.p1720a.AbstractC23124a.AbstractC23125a
        /* renamed from: b */
        public final void mo37610b(TextView textView, Spannable spannable) {
            C89219l.m154719c(textView, "");
            C89219l.m154719c(spannable, "");
            this.f54767b = Color.alpha(this.f54769d);
            m43605a(spannable);
        }

        @Override // com.bytedance.tux.p1719f.p1720a.AbstractC23124a.AbstractC23125a
        /* renamed from: a */
        public final void mo37609a(TextView textView, Spannable spannable) {
            C89219l.m154719c(textView, "");
            C89219l.m154719c(spannable, "");
            double alpha = (double) Color.alpha(this.f54769d);
            Double.isNaN(alpha);
            this.f54767b = (int) (alpha * 0.75d);
            m43605a(spannable);
        }
    }

    static {
        Covode.recordClassIndex(27066);
    }

    /* renamed from: a */
    public final C23137c mo37623a(int i) {
        this.f54765h = Integer.valueOf(i);
        return this;
    }

    /* renamed from: com.bytedance.tux.f.c$c */
    public static final class C23141c extends AbstractC89220m implements AbstractC89172b<C22999a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ int f54773a = R.raw.icon_tips;

        static {
            Covode.recordClassIndex(27070);
        }

        public C23141c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C22999a aVar) {
            C22999a aVar2 = aVar;
            C89219l.m154719c(aVar2, "");
            aVar2.f54431a = this.f54773a;
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final C23137c mo37624a(String str) {
        C89219l.m154719c(str, "");
        this.f54764g = str;
        return this;
    }

    /* renamed from: com.bytedance.tux.f.c$b */
    static final class C23140b extends AbstractC89220m implements AbstractC89172b<C22999a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C89233z.C89236c f54770a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89236c f54771b;

        /* renamed from: c */
        final /* synthetic */ C89233z.C89236c f54772c;

        static {
            Covode.recordClassIndex(27069);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23140b(C89233z.C89236c cVar, C89233z.C89236c cVar2, C89233z.C89236c cVar3) {
            super(1);
            this.f54770a = cVar;
            this.f54771b = cVar2;
            this.f54772c = cVar3;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C22999a aVar) {
            C22999a aVar2 = aVar;
            C89219l.m154719c(aVar2, "");
            aVar2.f54431a = this.f54770a.element;
            aVar2.f54435e = Integer.valueOf(this.f54771b.element);
            aVar2.f54432b = this.f54772c.element;
            aVar2.f54433c = this.f54772c.element;
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final CharSequence mo37625a(Context context) {
        int i;
        String str;
        Map<Integer, Object> a;
        Map<Integer, Object> map;
        C89219l.m154719c(context, "");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String str2 = this.f54764g;
        Integer num = this.f54765h;
        if (str2 == null) {
            if (num != null) {
                str2 = context.getResources().getString(num.intValue());
                C89219l.m154709a((Object) str2, "");
            } else {
                str2 = "";
            }
        }
        C23142d dVar = new C23142d(str2);
        C22999a aVar = this.f54758a;
        C22999a a2 = aVar != null ? C23005c.m43393a(new C22999a.C23000a(aVar)) : null;
        C89233z.C89236c cVar = new C89233z.C89236c();
        cVar.element = 0;
        C89233z.C89236c cVar2 = new C89233z.C89236c();
        cVar2.element = 0;
        C89233z.C89236c cVar3 = new C89233z.C89236c();
        cVar3.element = 0;
        C22978b a3 = C22982f.m43324a((int) R.attr.apw, this.f54760c);
        if (a3 == null || (map = a3.f54330a) == null) {
            i = 0;
        } else {
            i = 0;
            for (Map.Entry<Integer, Object> entry : map.entrySet()) {
                int intValue = entry.getKey().intValue();
                if (intValue == R.attr.ap2) {
                    C22983g.m43338l();
                    Object value = entry.getValue();
                    C89219l.m154719c(value, "");
                    dVar.mo37628a(((Number) value).intValue());
                } else if (intValue == R.attr.apl) {
                    C22983g.m43339m();
                    Object value2 = entry.getValue();
                    C89219l.m154719c(value2, "");
                    int intValue2 = ((Number) value2).intValue();
                    if (a2 != null) {
                        if (a2.f54432b < 0) {
                            a2.f54432b = intValue2;
                        }
                        if (a2.f54433c < 0) {
                            a2.f54433c = intValue2;
                        }
                    }
                } else if (intValue == R.attr.apu) {
                    C22983g.m43352z();
                    Object value3 = entry.getValue();
                    C89219l.m154719c(value3, "");
                    cVar.element = ((Number) value3).intValue();
                } else if (intValue == R.attr.apv) {
                    C22983g.m43351y();
                    Object value4 = entry.getValue();
                    C89219l.m154719c(value4, "");
                    i = ((Number) value4).intValue();
                }
            }
        }
        C22978b a4 = C22982f.m43324a((int) R.attr.apx, this.f54761d);
        if (!(a4 == null || (a = a4.mo37293a(new C22981e(null, Boolean.valueOf(this.f54762e), 55))) == null)) {
            for (Map.Entry<Integer, Object> entry2 : a.entrySet()) {
                int intValue3 = entry2.getKey().intValue();
                if (intValue3 == 16842904) {
                    C22983g.m43333g();
                    Object value5 = entry2.getValue();
                    C89219l.m154719c(value5, "");
                    cVar3.element = ((Number) value5).intValue();
                } else if (intValue3 == R.attr.ap6) {
                    C22983g.m43341o();
                    Object value6 = entry2.getValue();
                    C89219l.m154719c(value6, "");
                    cVar2.element = ((Number) value6).intValue();
                }
            }
        }
        if (C23163i.m43663a(context)) {
            str = "‏";
        } else {
            str = "‎";
        }
        spannableStringBuilder.append((CharSequence) str);
        if (a2 != null) {
            C89219l.m154719c(a2, "");
            if (a2.f54434d == null && a2.f54435e == null) {
                a2.f54435e = Integer.valueOf(cVar3.element);
            }
            if (a2.f54431a > 0) {
                C23127c b = a2.mo37369b(context);
                b.mo37614a(C23163i.m43663a(context), i);
                spannableStringBuilder.append((CharSequence) "*");
                spannableStringBuilder.setSpan(b, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 17);
            }
        }
        spannableStringBuilder.append((CharSequence) dVar);
        if (this.f54759b) {
            C23127c b2 = C23005c.m43393a(new C23140b(cVar2, cVar3, cVar)).mo37369b(context);
            spannableStringBuilder.append((CharSequence) "*");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.setSpan(b2, length - 1, length, 17);
        }
        Integer a5 = C23155d.m43641a(context, cVar3.element);
        if (a5 != null) {
            int intValue4 = a5.intValue();
            if (this.f54763f == null || !this.f54762e) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(intValue4), 0, spannableStringBuilder.length(), 17);
            } else {
                spannableStringBuilder.setSpan(new C23138a(this.f54763f, intValue4), 0, spannableStringBuilder.length(), 17);
            }
        }
        return spannableStringBuilder;
    }
}
