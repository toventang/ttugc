package com.p2082ss.android.ugc.aweme.shortvideo.p3837j;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81914b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.j.h */
public final class C71902h implements AbstractC81914b {

    /* renamed from: a */
    public final String f161103a;

    static {
        Covode.recordClassIndex(84451);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C71902h) && C89219l.m154714a(this.f161103a, ((C71902h) obj).f161103a);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f161103a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "VideoEditBackRecordEvent(commerceData=" + this.f161103a + ")";
    }

    public C71902h(String str) {
        this.f161103a = str;
    }
}
