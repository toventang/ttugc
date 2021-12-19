package com.p2082ss.android.ugc.aweme.childhook;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.List;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.childhook.d */
public final class C35691d {
    @AbstractC27891c(mo46611a = "LaunchActivity")

    /* renamed from: a */
    public final String f84183a;
    @AbstractC27891c(mo46611a = "Activity")

    /* renamed from: b */
    public final List<String> f84184b;
    @AbstractC27891c(mo46611a = "ContentProvider")

    /* renamed from: c */
    public final List<String> f84185c;
    @AbstractC27891c(mo46611a = "BroadcastReceiver")

    /* renamed from: d */
    public final List<String> f84186d;

    static {
        Covode.recordClassIndex(42921);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35691d)) {
            return false;
        }
        C35691d dVar = (C35691d) obj;
        return C89219l.m154714a(this.f84183a, dVar.f84183a) && C89219l.m154714a(this.f84184b, dVar.f84184b) && C89219l.m154714a(this.f84185c, dVar.f84185c) && C89219l.m154714a(this.f84186d, dVar.f84186d);
    }

    public final int hashCode() {
        String str = this.f84183a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List<String> list = this.f84184b;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        List<String> list2 = this.f84185c;
        int hashCode3 = (hashCode2 + (list2 != null ? list2.hashCode() : 0)) * 31;
        List<String> list3 = this.f84186d;
        if (list3 != null) {
            i = list3.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        return "MajorComponentsAllowList(launchActivity=" + this.f84183a + ", activities=" + this.f84184b + ", contentProviders=" + this.f84185c + ", broadcastReceivers=" + this.f84186d + ")";
    }

    private /* synthetic */ C35691d() {
        this("", C89086z.INSTANCE, C89086z.INSTANCE, C89086z.INSTANCE);
    }

    private C35691d(String str, List<String> list, List<String> list2, List<String> list3) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(list, "");
        C89219l.m154721d(list2, "");
        C89219l.m154721d(list3, "");
        this.f84183a = str;
        this.f84184b = list;
        this.f84185c = list2;
        this.f84186d = list3;
    }
}
