package com.p2082ss.android.ugc.aweme.utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.util.TypedValue;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.common.C17174a;
import com.bytedance.tux.p1722h.C23163i;
import java.util.Objects;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.utils.hv */
public final class C80554hv {
    static {
        Covode.recordClassIndex(93827);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.utils.hv$a */
    public static final class C80555a extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89172b f180165a;

        /* renamed from: b */
        final /* synthetic */ SpannableStringBuilder f180166b;

        static {
            Covode.recordClassIndex(93828);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C80555a(AbstractC89172b bVar, SpannableStringBuilder spannableStringBuilder) {
            super(0);
            this.f180165a = bVar;
            this.f180166b = spannableStringBuilder;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* bridge */ /* synthetic */ C89391z invoke() {
            this.f180165a.invoke(this.f180166b);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.utils.hv$b */
    public static final class C80556b extends AbstractC89220m implements AbstractC89172b<CharSequence, C89391z> {

        /* renamed from: a */
        final /* synthetic */ TextView f180167a;

        /* renamed from: b */
        final /* synthetic */ Drawable f180168b;

        /* renamed from: c */
        final /* synthetic */ int f180169c = 2;

        static {
            Covode.recordClassIndex(93829);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C80556b(TextView textView, Drawable drawable, int i) {
            super(1);
            this.f180167a = textView;
            this.f180168b = drawable;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(CharSequence charSequence) {
            int a;
            CharSequence charSequence2 = charSequence;
            C89219l.m154721d(charSequence2, "");
            int lineCount = this.f180167a.getLineCount() - 1;
            if (lineCount > 0) {
                String a2 = C80554hv.m139637a(charSequence2, this.f180167a.getLayout().getLineStart(lineCount), this.f180167a.getLayout().getLineEnd(lineCount));
                if (a2.length() != 0 && !(!C89361p.m154870a((CharSequence) a2))) {
                    int i = lineCount - 1;
                    String a3 = C80554hv.m139637a(charSequence2, this.f180167a.getLayout().getLineStart(i), this.f180167a.getLayout().getLineEnd(i));
                    String a4 = C80554hv.m139637a(a3, C89361p.m154885a((CharSequence) a3, " ") + 1, a3.length());
                    Objects.requireNonNull(a4, "null cannot be cast to non-null type kotlin.CharSequence");
                    String obj = C89361p.m154910b((CharSequence) a4).toString();
                    int a5 = C89361p.m154885a(charSequence2, obj);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) C80554hv.m139637a(charSequence2, 0, a5));
                    spannableStringBuilder.append((CharSequence) "\n");
                    spannableStringBuilder.append((CharSequence) obj);
                    spannableStringBuilder.append((CharSequence) "  ");
                    int length = spannableStringBuilder.length() - 2;
                    int length2 = spannableStringBuilder.length() - 1;
                    boolean a6 = C23163i.m43664a(this.f180167a);
                    C17174a aVar = new C17174a(this.f180168b);
                    if (a6) {
                        float f = (float) this.f180169c;
                        Resources system = Resources.getSystem();
                        C89219l.m154709a((Object) system, "");
                        a = C89241a.m154730a(TypedValue.applyDimension(1, f, system.getDisplayMetrics())) * -1;
                    } else {
                        float f2 = (float) this.f180169c;
                        Resources system2 = Resources.getSystem();
                        C89219l.m154709a((Object) system2, "");
                        a = C89241a.m154730a(TypedValue.applyDimension(1, f2, system2.getDisplayMetrics()));
                    }
                    aVar.f40918a = a;
                    spannableStringBuilder.setSpan(aVar, length, length2, 18);
                    C80554hv.m139638a(this.f180167a, spannableStringBuilder);
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public static final void m139638a(TextView textView, Spannable spannable) {
        C89219l.m154721d(textView, "");
        C89219l.m154721d(spannable, "");
        textView.setText(spannable, TextView.BufferType.SPANNABLE);
    }

    /* renamed from: a */
    public static final String m139637a(CharSequence charSequence, int i, int i2) {
        C89219l.m154721d(charSequence, "");
        if (i < 0 || i2 > charSequence.length() || i > i2) {
            return "";
        }
        return charSequence.subSequence(i, i2).toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0065, code lost:
        if (p4600h.p4622m.C89350l.find$default(r0, r3, 0, 2, null) != null) goto L_0x0029;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x006a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m139639a(android.widget.TextView r7, java.lang.String r8, android.graphics.drawable.Drawable r9) {
        /*
        // Method dump skipped, instructions count: 152
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.utils.C80554hv.m139639a(android.widget.TextView, java.lang.String, android.graphics.drawable.Drawable):void");
    }

    /* renamed from: a */
    private static SpannableStringBuilder m139636a(Context context, String str, Drawable drawable, int i) {
        int a;
        if (str != null) {
            Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.CharSequence");
            String obj = C89361p.m154910b((CharSequence) str).toString();
            if (obj == null) {
                obj = "";
            }
            boolean z = false;
            if (!(str == null || str.length() == 0 || drawable == null)) {
                Rect bounds = drawable.getBounds();
                C89219l.m154716b(bounds, "");
                if (!bounds.isEmpty()) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) obj);
                    spannableStringBuilder.append((CharSequence) "  ");
                    int length = (obj.length() + 2) - 1;
                    if (context != null && C23163i.m43663a(context)) {
                        z = true;
                    }
                    C17174a aVar = new C17174a(drawable);
                    if (z) {
                        Resources system = Resources.getSystem();
                        C89219l.m154709a((Object) system, "");
                        a = C89241a.m154730a(TypedValue.applyDimension(1, 2.0f, system.getDisplayMetrics())) * -1;
                    } else {
                        Resources system2 = Resources.getSystem();
                        C89219l.m154709a((Object) system2, "");
                        a = C89241a.m154730a(TypedValue.applyDimension(1, 2.0f, system2.getDisplayMetrics()));
                    }
                    aVar.f40918a = a;
                    spannableStringBuilder.setSpan(aVar, length - 1, length, 18);
                    return spannableStringBuilder;
                }
            }
        }
        return new SpannableStringBuilder();
    }
}
