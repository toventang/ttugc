package com.p2082ss.android.ugc.aweme;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.view.View;
import android.widget.TextView;
import androidx.core.content.C0643b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.account.base.p2243a.DialogC31590a;
import com.p2082ss.android.ugc.aweme.account.login.C32821z;
import com.p2082ss.android.ugc.aweme.account.p2273m.C32837b;
import com.p2082ss.android.ugc.aweme.account.util.C33046o;
import com.p2082ss.android.ugc.aweme.account.views.AbstractC33066c;
import com.p2082ss.android.ugc.aweme.account.views.C33064a;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.PrivacyDisclaimerUtilService */
public final class PrivacyDisclaimerUtilService implements IPrivacyDisclaimerUtil {
    static {
        Covode.recordClassIndex(37973);
    }

    /* renamed from: a */
    public static IPrivacyDisclaimerUtil m65401a() {
        MethodCollector.m26663i(8957);
        Object a = C81908b.m141854a(IPrivacyDisclaimerUtil.class, false);
        if (a != null) {
            IPrivacyDisclaimerUtil iPrivacyDisclaimerUtil = (IPrivacyDisclaimerUtil) a;
            MethodCollector.m26664o(8957);
            return iPrivacyDisclaimerUtil;
        }
        if (C81908b.f183410s == null) {
            synchronized (IPrivacyDisclaimerUtil.class) {
                try {
                    if (C81908b.f183410s == null) {
                        C81908b.f183410s = new PrivacyDisclaimerUtilService();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(8957);
                    throw th;
                }
            }
        }
        PrivacyDisclaimerUtilService privacyDisclaimerUtilService = (PrivacyDisclaimerUtilService) C81908b.f183410s;
        MethodCollector.m26664o(8957);
        return privacyDisclaimerUtilService;
    }

    @Override // com.p2082ss.android.ugc.aweme.IPrivacyDisclaimerUtil
    /* renamed from: a */
    public final void mo57232a(Context context) {
        C89219l.m154721d(context, "");
        DialogC31590a.C31591a aVar = new DialogC31590a.C31591a();
        aVar.f75549a = C33046o.m67682a("privacy-policy");
        aVar.mo57591a(context).show();
    }

    @Override // com.p2082ss.android.ugc.aweme.IPrivacyDisclaimerUtil
    /* renamed from: b */
    public final void mo57234b(Context context) {
        C89219l.m154721d(context, "");
        DialogC31590a.C31591a aVar = new DialogC31590a.C31591a();
        aVar.f75549a = C33046o.m67682a("terms-of-use");
        aVar.mo57591a(context).show();
    }

    @Override // com.p2082ss.android.ugc.aweme.IPrivacyDisclaimerUtil
    /* renamed from: c */
    public final void mo57235c(Context context) {
        C89219l.m154721d(context, "");
        DialogC31590a.C31591a aVar = new DialogC31590a.C31591a();
        aVar.f75549a = C33046o.m67682a("virtual-items");
        aVar.mo57591a(context).show();
    }

    @Override // com.p2082ss.android.ugc.aweme.IPrivacyDisclaimerUtil
    /* renamed from: a */
    public final void mo57233a(Context context, TextView textView, View.OnClickListener onClickListener, View.OnClickListener onClickListener2, View.OnClickListener onClickListener3) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(textView, "");
        C89219l.m154721d(onClickListener, "");
        C89219l.m154721d(onClickListener2, "");
        C89219l.m154721d(onClickListener3, "");
        String string = context.getString(R.string.aqw);
        String string2 = context.getString(R.string.aqp);
        String string3 = context.getString(R.string.h9v);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(context.getString(R.string.h98, string, string2, string3));
        int c = C0643b.m2378c(context, R.color.a2);
        int c2 = C0643b.m2378c(context, R.color.a2);
        C32821z.C328243 r10 = new AbstractC33066c(c, c2, onClickListener) {
            /* class com.p2082ss.android.ugc.aweme.account.login.C32821z.C328243 */

            /* renamed from: a */
            final /* synthetic */ View.OnClickListener f78190a;

            static {
                Covode.recordClassIndex(39604);
            }

            public final void onClick(View view) {
                View.OnClickListener onClickListener = this.f78190a;
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

            {
                this.f78190a = r3;
            }
        };
        C32821z.C328254 r6 = new AbstractC33066c(c, c2, onClickListener2) {
            /* class com.p2082ss.android.ugc.aweme.account.login.C32821z.C328254 */

            /* renamed from: a */
            final /* synthetic */ View.OnClickListener f78191a;

            static {
                Covode.recordClassIndex(39605);
            }

            public final void onClick(View view) {
                View.OnClickListener onClickListener = this.f78191a;
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

            {
                this.f78191a = r3;
            }
        };
        C32821z.C328265 r5 = new AbstractC33066c(c, c2, onClickListener3) {
            /* class com.p2082ss.android.ugc.aweme.account.login.C32821z.C328265 */

            /* renamed from: a */
            final /* synthetic */ View.OnClickListener f78192a;

            static {
                Covode.recordClassIndex(39606);
            }

            public final void onClick(View view) {
                View.OnClickListener onClickListener = this.f78192a;
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

            {
                this.f78192a = r3;
            }
        };
        String spannableStringBuilder2 = spannableStringBuilder.toString();
        int indexOf = spannableStringBuilder2.indexOf(string);
        int indexOf2 = spannableStringBuilder2.indexOf(string2);
        int indexOf3 = spannableStringBuilder2.indexOf(string3);
        if (indexOf < 0 || indexOf2 < 0 || indexOf3 < 0) {
            C32837b.m67404a("text_highlight_not_match", "", new C33743c().mo59976a("enter_from", "login").mo59977a());
        }
        spannableStringBuilder.setSpan(r10, indexOf, string.length() + indexOf, 34);
        spannableStringBuilder.setSpan(r6, indexOf2, string2.length() + indexOf2, 34);
        if (indexOf3 >= 0) {
            spannableStringBuilder.setSpan(r5, indexOf3, string3.length() + indexOf3, 34);
        }
        textView.setHighlightColor(C0643b.m2378c(context, R.color.c9));
        textView.setText(spannableStringBuilder);
        textView.setMovementMethod(C33064a.m67722a());
    }
}
