package com.p2082ss.android.ugc.aweme.emoji.p2897b;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.emoji.p2904g.C46534a;

/* renamed from: com.ss.android.ugc.aweme.emoji.b.a */
public final class C46447a {

    /* renamed from: a */
    public int f108221a;

    /* renamed from: b */
    public String f108222b;

    /* renamed from: c */
    public String f108223c;

    /* renamed from: d */
    public C46534a f108224d;

    static {
        Covode.recordClassIndex(55030);
    }

    /* renamed from: a */
    public final boolean mo78961a() {
        if (this.f108224d != null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C46447a)) {
            return false;
        }
        C46447a aVar = (C46447a) obj;
        if ((aVar.f108221a > 0 || !TextUtils.isEmpty(aVar.f108222b)) && aVar.f108221a == this.f108221a && TextUtils.equals(aVar.f108222b, this.f108222b) && TextUtils.equals(aVar.f108223c, this.f108223c)) {
            return true;
        }
        C46534a aVar2 = aVar.f108224d;
        if (aVar2 == null || !aVar2.equals(this.f108224d)) {
            return false;
        }
        return true;
    }
}
