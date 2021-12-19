package com.bytedance.ies.xelement.input.p1383b;

import android.text.Spannable;
import android.text.SpannableString;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xelement.input.b.b */
public final class C19276b {

    /* renamed from: a */
    public String f45554a;

    /* renamed from: b */
    public String f45555b;

    static {
        Covode.recordClassIndex(22055);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19276b)) {
            return false;
        }
        C19276b bVar = (C19276b) obj;
        return C89219l.m154714a(this.f45554a, bVar.f45554a) && C89219l.m154714a(this.f45555b, bVar.f45555b);
    }

    public final int hashCode() {
        String str = this.f45554a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f45555b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "LynxMentionSpan(name=" + this.f45554a + ", symbol=" + this.f45555b + ")";
    }

    public /* synthetic */ C19276b(String str) {
        this(str, "@");
    }

    public C19276b(String str, String str2) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(str2, "");
        this.f45554a = str;
        this.f45555b = str2;
    }

    /* renamed from: a */
    public static Spannable m36000a(CharSequence charSequence, Object... objArr) {
        C89219l.m154719c(charSequence, "");
        C89219l.m154719c(objArr, "");
        SpannableString valueOf = SpannableString.valueOf(charSequence);
        int i = 0;
        do {
            valueOf.setSpan(objArr[0], 0, valueOf.length(), 33);
            i++;
        } while (i <= 0);
        C89219l.m154709a((Object) valueOf, "");
        return valueOf;
    }
}
