package com.p2082ss.android.sdk.webview;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81914b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.sdk.webview.b */
public final class C30244b implements AbstractC81914b {

    /* renamed from: a */
    public final String f72160a;

    static {
        Covode.recordClassIndex(36755);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C30244b) && C89219l.m154714a(this.f72160a, ((C30244b) obj).f72160a);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f72160a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "CloseWebActivityEvent(id=" + this.f72160a + ")";
    }

    public C30244b(String str) {
        C89219l.m154719c(str, "");
        this.f72160a = str;
    }
}
