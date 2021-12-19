package com.p2082ss.android.ugc.aweme.discover.widget;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.p1719f.p1720a.C23126b;
import com.p2082ss.android.ugc.aweme.discover.model.CorrectPosition;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.widget.a */
public final class C43030a {

    /* renamed from: a */
    public static final C43030a f100307a = new C43030a();

    private C43030a() {
    }

    static {
        Covode.recordClassIndex(51178);
    }

    /* renamed from: a */
    public static void m85861a(TextView textView, String str) {
        C89219l.m154721d(textView, "");
        C89219l.m154721d(str, "");
        String string = textView.getResources().getString(R.string.fff, "");
        C89219l.m154716b(string, "");
        int length = string.length();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        spannableStringBuilder.append((CharSequence) (" “" + str + (char) 8221));
        int i = length + 1;
        spannableStringBuilder.setSpan(new ForegroundColorSpan(textView.getResources().getColor(R.color.c4)), 0, i, 33);
        spannableStringBuilder.setSpan(new C23126b(61, true), 0, i, 33);
        textView.setText(spannableStringBuilder);
    }

    /* renamed from: a */
    public static void m85862a(TextView textView, String str, int i, List<CorrectPosition> list) {
        C89219l.m154721d(textView, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(list, "");
        String string = textView.getResources().getString(R.string.ffg, "");
        C89219l.m154716b(string, "");
        int length = string.length();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        spannableStringBuilder.append((CharSequence) "“");
        spannableStringBuilder.append((CharSequence) str);
        spannableStringBuilder.setSpan(new C23126b(41, true), 0, length, 33);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(textView.getResources().getColor(R.color.c4)), 0, length, 33);
        for (CorrectPosition correctPosition : list) {
            if (correctPosition.isValid()) {
                int i2 = length + 1;
                try {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(i), correctPosition.getBegin() + i2, i2 + correctPosition.getEnd() + 1, 33);
                } catch (IndexOutOfBoundsException unused) {
                }
            }
        }
        spannableStringBuilder.append((CharSequence) "”");
        textView.setText(spannableStringBuilder);
    }
}
