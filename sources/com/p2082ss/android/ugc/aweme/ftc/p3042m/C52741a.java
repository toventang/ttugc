package com.p2082ss.android.ugc.aweme.ftc.p3042m;

import android.app.Application;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ftc.m.a */
public final class C52741a implements InputFilter {

    /* renamed from: a */
    private final int f121373a;

    static {
        Covode.recordClassIndex(62137);
    }

    public C52741a(int i) {
        this.f121373a = i;
    }

    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        C89219l.m154721d(charSequence, "");
        C89219l.m154721d(spanned, "");
        int length = this.f121373a - (spanned.length() - (i4 - i3));
        if (length <= 0) {
            if (!TextUtils.isEmpty(charSequence)) {
                Application application = C63247i.f143610a;
                C89219l.m154716b(application, "");
                String string = application.getResources().getString(R.string.fin, Integer.valueOf(this.f121373a));
                C89219l.m154716b(string, "");
                new C79459a(C63247i.f143610a).mo123052a(string).mo123053a();
            }
            return "";
        } else if (length >= i2 - i) {
            return null;
        } else {
            int i5 = length + i;
            Application application2 = C63247i.f143610a;
            C89219l.m154716b(application2, "");
            String string2 = application2.getResources().getString(R.string.fin, Integer.valueOf(this.f121373a));
            C89219l.m154716b(string2, "");
            if (!Character.isHighSurrogate(charSequence.charAt(i5 - 1)) || i5 - 1 != i) {
                new C79459a(C63247i.f143610a).mo123052a(string2).mo123053a();
                return charSequence.subSequence(i, i5);
            }
            new C79459a(C63247i.f143610a).mo123052a(string2).mo123053a();
            return "";
        }
    }
}
