package com.p2082ss.android.ugc.aweme.account.login;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.view.View;
import android.widget.TextView;
import androidx.core.content.C0643b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.account.p2273m.C32837b;
import com.p2082ss.android.ugc.aweme.account.views.AbstractC33066c;
import com.p2082ss.android.ugc.aweme.account.views.C33064a;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import com.p2082ss.android.ugc.trill.R;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.ss.android.ugc.aweme.account.login.z */
public final class C32821z {

    /* renamed from: a */
    static final Set<String> f78187a = new HashSet(Arrays.asList("AL", "AD", "AT", "BE", "BG", "HR", "CZ", "DK", "EE", "FO", "FI", "FR", "DE", "GI", "GR", "GG", "VA", "HU", "IS", "IE", "IM", "IT", "JE", "LV", "LI", "LT", "LU", "MT", "MC", "NL", "MK", "NO", "PL", "PT", "RO", "SM", "RS", "SK", "SI", "ES", "SJ", "SE", "CH", "GB", "AX"));

    static {
        Covode.recordClassIndex(39601);
    }

    /* renamed from: a */
    public static void m67398a(Context context, TextView textView, final View.OnClickListener onClickListener, final View.OnClickListener onClickListener2, boolean z) {
        int i;
        String str = " " + context.getString(R.string.aqw) + " ";
        String str2 = " " + context.getString(R.string.aqp);
        if (z) {
            i = R.string.aq_;
        } else {
            i = R.string.apm;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(context.getString(i, str, str2));
        int c = C0643b.m2378c(context, R.color.a2);
        int c2 = C0643b.m2378c(context, R.color.a2);
        C328221 r7 = new AbstractC33066c(c, c2) {
            /* class com.p2082ss.android.ugc.aweme.account.login.C32821z.C328221 */

            static {
                Covode.recordClassIndex(39602);
            }

            public final void onClick(View view) {
                View.OnClickListener onClickListener = onClickListener;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
            }

            @Override // com.p2082ss.android.ugc.aweme.account.views.AbstractC33066c
            public final void updateDrawState(TextPaint textPaint) {
                super.updateDrawState(textPaint);
                textPaint.setFakeBoldText(true);
                textPaint.setUnderlineText(false);
            }
        };
        C328232 r6 = new AbstractC33066c(c, c2) {
            /* class com.p2082ss.android.ugc.aweme.account.login.C32821z.C328232 */

            static {
                Covode.recordClassIndex(39603);
            }

            public final void onClick(View view) {
                View.OnClickListener onClickListener = onClickListener2;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
            }

            @Override // com.p2082ss.android.ugc.aweme.account.views.AbstractC33066c
            public final void updateDrawState(TextPaint textPaint) {
                super.updateDrawState(textPaint);
                textPaint.setFakeBoldText(true);
                textPaint.setUnderlineText(false);
            }
        };
        String spannableStringBuilder2 = spannableStringBuilder.toString();
        int indexOf = spannableStringBuilder2.indexOf(str);
        int indexOf2 = spannableStringBuilder2.indexOf(str2);
        if (indexOf < 0 || indexOf2 < 0) {
            C32837b.m67404a("text_highlight_not_match", "", new C33743c().mo59976a("enter_from", "login").mo59977a());
        }
        spannableStringBuilder.setSpan(r7, indexOf + 1, (indexOf + str.length()) - 1, 34);
        spannableStringBuilder.setSpan(r6, indexOf2 + 1, indexOf2 + str2.length(), 34);
        textView.setHighlightColor(C0643b.m2378c(context, R.color.c9));
        textView.setText(spannableStringBuilder);
        textView.setMovementMethod(C33064a.m67722a());
    }
}
