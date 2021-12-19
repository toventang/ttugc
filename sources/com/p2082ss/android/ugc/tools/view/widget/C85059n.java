package com.p2082ss.android.ugc.tools.view.widget;

import android.content.Context;
import android.graphics.Color;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.tools.view.style.StyleTextView;
import com.p2082ss.android.ugc.tools.view.widget.p4369c.C85035a;
import com.p2082ss.android.ugc.tools.view.widget.p4369c.C85037b;
import com.p2082ss.android.ugc.trill.R;
import java.util.Locale;
import java.util.Objects;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89332a;
import p4600h.p4622m.C89350l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.tools.view.widget.n */
public final class C85059n extends C85037b {

    /* renamed from: a */
    public StyleTextView f190342a;

    /* renamed from: b */
    public StyleTextView f190343b;

    static {
        Covode.recordClassIndex(99080);
    }

    @Override // com.p2082ss.android.ugc.tools.view.widget.p4369c.C85035a, com.p2082ss.android.ugc.tools.view.widget.p4369c.C85037b
    /* renamed from: a */
    public final int mo129964a() {
        return R.layout.b3k;
    }

    public final StyleTextView getStickerTitleText() {
        StyleTextView styleTextView = this.f190342a;
        if (styleTextView == null) {
            C89219l.m154710a("stickerTitleText");
        }
        return styleTextView;
    }

    public final StyleTextView getStickerUseNumberText() {
        StyleTextView styleTextView = this.f190343b;
        if (styleTextView == null) {
            C89219l.m154710a("stickerUseNumberText");
        }
        return styleTextView;
    }

    /* renamed from: com.ss.android.ugc.tools.view.widget.n$a */
    public static class C85060a extends C85035a.C85036a {

        /* renamed from: a */
        public int f190344a = 2131230945;

        /* renamed from: b */
        public int f190345b = 2131230947;

        /* renamed from: c */
        public int f190346c = R.color.go;

        static {
            Covode.recordClassIndex(99081);
        }

        /* renamed from: a */
        public final C85059n mo122016b() {
            return new C85059n(this.f190291v, this.f190273d, this.f190274e, this.f190276g, this.f190277h, this.f190278i, this.f190279j, this.f190280k, this.f190281l, this.f190346c, this.f190283n, this.f190284o, this.f190286q, this.f190287r, this.f190288s, this.f190289t, mo129973c(), this.f190344a, this.f190345b, this.f190285p, this.f190290u);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C85060a(Context context) {
            super(context);
            C89219l.m154721d(context, "");
        }
    }

    public final void setStickerTitleText(StyleTextView styleTextView) {
        C89219l.m154721d(styleTextView, "");
        this.f190342a = styleTextView;
    }

    public final void setStickerUseNumberText(StyleTextView styleTextView) {
        C89219l.m154721d(styleTextView, "");
        this.f190343b = styleTextView;
    }

    @Override // com.p2082ss.android.ugc.tools.view.widget.p4369c.C85035a
    public final void setText(CharSequence charSequence) {
        super.setText(charSequence);
        StyleTextView styleTextView = this.f190342a;
        if (styleTextView == null) {
            C89219l.m154710a("stickerTitleText");
        }
        styleTextView.setText(charSequence);
    }

    @Override // com.p2082ss.android.ugc.tools.view.widget.p4369c.C85035a, com.p2082ss.android.ugc.tools.view.widget.p4369c.C85037b
    /* renamed from: a */
    public final View mo78372a(Context context) {
        C89219l.m154721d(context, "");
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        StyleTextView styleTextView = new StyleTextView(context);
        styleTextView.setLayoutParams(layoutParams);
        styleTextView.setGravity(8388611);
        return styleTextView;
    }

    @Override // com.p2082ss.android.ugc.tools.view.widget.p4369c.C85035a
    /* renamed from: c */
    public final View mo129967c(Context context) {
        MethodCollector.m26663i(9373);
        C89219l.m154721d(context, "");
        FrameLayout frameLayout = new FrameLayout(context);
        View a = C1764a.m5927a(LayoutInflater.from(context), R.layout.b3k, frameLayout, false);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        View findViewById = a.findViewById(R.id.dsm);
        C89219l.m154716b(findViewById, "");
        this.f190342a = (StyleTextView) findViewById;
        View findViewById2 = a.findViewById(R.id.dsn);
        C89219l.m154716b(findViewById2, "");
        this.f190343b = (StyleTextView) findViewById2;
        C89219l.m154716b(a, "");
        a.setLayoutParams(layoutParams);
        frameLayout.addView(a);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        MethodCollector.m26664o(9373);
        return frameLayout;
    }

    /* renamed from: a */
    public final void mo129999a(String str) {
        C89219l.m154721d(str, "");
        StyleTextView styleTextView = this.f190342a;
        if (styleTextView == null) {
            C89219l.m154710a("stickerTitleText");
        }
        CharSequence text = styleTextView.getText();
        SpannableString spannableString = new SpannableString(text);
        String obj = text.toString();
        Locale locale = Locale.ROOT;
        C89219l.m154716b(locale, "");
        Objects.requireNonNull(obj, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = obj.toLowerCase(locale);
        C89219l.m154716b(lowerCase, "");
        Locale locale2 = Locale.ROOT;
        C89219l.m154716b(locale2, "");
        String lowerCase2 = str.toLowerCase(locale2);
        C89219l.m154716b(lowerCase2, "");
        spannableString.setSpan(new StyleSpan(0), 0, text.length(), 33);
        spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#BFFFFFFF")), 0, text.length(), 33);
        if (C89361p.m154929e((CharSequence) lowerCase, (CharSequence) lowerCase2) || C89361p.m154929e((CharSequence) new C89350l("\\s+").replace(lowerCase, ""), (CharSequence) lowerCase2)) {
            C89378p<Integer, Integer> a = m146255a(text.toString(), str);
            int intValue = a.component1().intValue();
            int intValue2 = a.component2().intValue();
            if (intValue <= str.length() + intValue + intValue2) {
                int length = text.length();
                if (intValue >= 0 && length >= intValue) {
                    int length2 = text.length();
                    int length3 = str.length() + intValue + intValue2;
                    if (length3 >= 0 && length2 >= length3) {
                        spannableString.setSpan(new StyleSpan(1), intValue, str.length() + intValue + intValue2, 33);
                        spannableString.setSpan(new ForegroundColorSpan(-1), intValue, str.length() + intValue + intValue2, 33);
                    }
                }
            }
            StyleTextView styleTextView2 = this.f190342a;
            if (styleTextView2 == null) {
                C89219l.m154710a("stickerTitleText");
            }
            styleTextView2.setText(spannableString);
        }
    }

    /* renamed from: a */
    private static C89378p<Integer, Integer> m146255a(String str, String str2) {
        int i;
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        int length = str.length();
        int i2 = 0;
        while (i2 < length && str2.length() + i2 <= str.length()) {
            int length2 = str2.length();
            int i3 = 0;
            for (int i4 = 0; i4 < length2; i4++) {
                while (true) {
                    i = i2 + i4 + i3;
                    if (i < str.length() && Character.isSpaceChar(str.charAt(i)) && !Character.isSpaceChar(str2.charAt(i4))) {
                        i3++;
                    }
                }
                if (i >= str.length() || !C89332a.m154831a(str.charAt(i), str2.charAt(i4), true)) {
                    i2++;
                }
            }
            return C89387v.m154943a(Integer.valueOf(i2), Integer.valueOf(i3));
        }
        return C89387v.m154943a(-1, -1);
    }

    @Override // com.p2082ss.android.ugc.tools.view.widget.p4369c.C85035a
    /* renamed from: a */
    public final void mo129966a(LinearLayout linearLayout, boolean z) {
        int i;
        C89219l.m154721d(linearLayout, "");
        if (z) {
            i = -1;
        } else {
            i = -2;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, -2);
        layoutParams.gravity = 17;
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
    }

    /* renamed from: a */
    public final void mo130000a(boolean z, String str) {
        C89219l.m154721d(str, "");
        if (z) {
            StyleTextView styleTextView = this.f190342a;
            if (styleTextView == null) {
                C89219l.m154710a("stickerTitleText");
            }
            SpannableString spannableString = new SpannableString(new SpannableString(styleTextView.getText()));
            spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
            spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#FE2C55")), 0, spannableString.length(), 33);
            StyleTextView styleTextView2 = this.f190342a;
            if (styleTextView2 == null) {
                C89219l.m154710a("stickerTitleText");
            }
            styleTextView2.setText(spannableString);
            return;
        }
        mo129999a(str);
    }

    @Override // com.p2082ss.android.ugc.tools.view.widget.p4369c.C85035a
    /* renamed from: a */
    public final void mo129965a(View view, FrameLayout frameLayout, int i, int i2, boolean z) {
        C89219l.m154721d(view, "");
        C89219l.m154721d(frameLayout, "");
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 1;
        frameLayout.setLayoutParams(layoutParams);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(view.getLayoutParams());
        layoutParams2.gravity = 17;
        view.setLayoutParams(layoutParams2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C85059n(Context context, boolean z, int i, int i2, int i3, int i4, boolean z2, int i5, int i6, int i7, boolean z3, boolean z4, int i8, int i9, int i10, int i11, int i12, int i13, int i14, boolean z5, boolean z6) {
        super(context, z, i, i2, i3, i4, z2, i5, i6, i7, z3, z4, i8, i9, i10, i11, i12, i13, i14, z5, z6);
        C89219l.m154721d(context, "");
    }
}
