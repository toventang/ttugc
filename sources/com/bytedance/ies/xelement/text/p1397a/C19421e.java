package com.bytedance.ies.xelement.text.p1397a;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.text.p1397a.C19418c;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.bytedance.ies.xelement.text.a.e */
public final class C19421e {

    /* renamed from: a */
    public static Pattern f46016a = Pattern.compile("(\\[)([^\\[\\]]+)(])");

    /* renamed from: b */
    public static boolean f46017b;

    /* renamed from: c */
    public static final C19421e f46018c = new C19421e();

    private C19421e() {
    }

    static {
        Covode.recordClassIndex(22231);
    }

    /* renamed from: a */
    public static CharSequence m36226a(Context context, CharSequence charSequence, int i) {
        C19418c a = C19418c.C19419a.m36225a();
        Matcher matcher = f46016a.matcher(charSequence);
        SpannableString spannableString = new SpannableString(charSequence);
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            String group = matcher.group();
            Drawable a2 = a.mo30985a(context, group);
            if (a2 != null) {
                a2.setBounds(0, 0, (int) ((((float) i) * ((((float) a2.getIntrinsicWidth()) + 0.0f) / ((float) a2.getIntrinsicHeight()))) + 0.5f), i);
                spannableString.setSpan(new C19420d(a2, Integer.valueOf(end - start), group), start, end, 33);
            }
        }
        return spannableString;
    }
}
