package com.p2082ss.android.ugc.aweme.account.agegate.viewmodel;

import android.text.InputFilter;
import android.text.Spanned;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1210r;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.account.agegate.util.C31556d;
import java.util.regex.Pattern;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.account.agegate.viewmodel.AgeGateNicknameViewModel */
public final class AgeGateNicknameViewModel extends AbstractC1174ac {

    /* renamed from: a */
    public String f75509a = "^\\s+.*";

    /* renamed from: b */
    public String f75510b = "^.*[\r\n]+.*$";

    /* renamed from: c */
    public InputFilter f75511c = new C31568a(this);

    /* renamed from: d */
    public C1210r<Boolean> f75512d = new C1210r<>();

    static {
        Covode.recordClassIndex(38287);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.agegate.viewmodel.AgeGateNicknameViewModel$a */
    public static final class C31568a implements InputFilter {

        /* renamed from: a */
        final /* synthetic */ AgeGateNicknameViewModel f75513a;

        static {
            Covode.recordClassIndex(38288);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31568a(AgeGateNicknameViewModel ageGateNicknameViewModel) {
            this.f75513a = ageGateNicknameViewModel;
        }

        public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
            String str;
            CharSequence charSequence2;
            if (charSequence == null || (str = charSequence.subSequence(i, i2).toString()) == null) {
                str = "";
            }
            if (spanned != null) {
                charSequence2 = C89361p.m154893a(spanned, i3, i4, str);
            } else {
                charSequence2 = null;
            }
            boolean matches = Pattern.compile(this.f75513a.f75509a).matcher(charSequence2).matches();
            boolean matches2 = Pattern.compile(this.f75513a.f75510b).matcher(charSequence2).matches();
            if ((matches || matches2) && spanned != null) {
                return spanned.subSequence(i3, i4);
            }
            return null;
        }
    }

    /* renamed from: a */
    public final void mo57574a(String str) {
        C89219l.m154721d(str, "");
        if (C89361p.m154870a((CharSequence) str)) {
            this.f75512d.postValue(null);
        } else {
            this.f75512d.postValue(Boolean.valueOf(C31556d.C31557a.m65839a(str)));
        }
    }
}
