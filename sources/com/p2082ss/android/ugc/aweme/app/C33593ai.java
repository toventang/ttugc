package com.p2082ss.android.ugc.aweme.app;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.app.ai */
public final class C33593ai {

    /* renamed from: a */
    public final String f79762a;

    static {
        Covode.recordClassIndex(40483);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C33593ai) && C89219l.m154714a(this.f79762a, ((C33593ai) obj).f79762a);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f79762a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "SearchTabInfo(type=" + this.f79762a + ")";
    }

    public C33593ai(String str) {
        C89219l.m154721d(str, "");
        this.f79762a = str;
    }
}
