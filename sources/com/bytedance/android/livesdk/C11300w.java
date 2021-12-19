package com.bytedance.android.livesdk;

import android.text.Spannable;
import android.text.TextUtils;
import com.bytedance.android.livesdk.chatroom.p491f.C7557c;
import com.bytedance.android.livesdk.i18n.C8983b;
import com.bytedance.android.livesdk.model.message.p579c.C9698b;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.w */
public final class C11300w {

    /* renamed from: a */
    public static final C11300w f27032a = new C11300w();

    private C11300w() {
    }

    static {
        Covode.recordClassIndex(12937);
    }

    /* renamed from: a */
    public static CharSequence m20049a(C9698b bVar) {
        String str;
        if (bVar == null) {
            return "";
        }
        if (bVar.f23645a == null || TextUtils.isEmpty(C8983b.m17319a().mo15219a(bVar.f23645a))) {
            str = bVar.f23646b;
            if (str == null) {
                str = "";
            }
        } else {
            str = C8983b.m17319a().mo15219a(bVar.f23645a);
            C89219l.m154716b(str, "");
        }
        if (TextUtils.isEmpty(str) || C7557c.m15540a(str, bVar, null) == C7557c.f18769a) {
            return "";
        }
        Spannable a = C7557c.m15540a(str, bVar, null);
        C89219l.m154716b(a, "");
        return a;
    }
}
