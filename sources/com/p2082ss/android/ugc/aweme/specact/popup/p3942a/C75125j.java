package com.p2082ss.android.ugc.aweme.specact.popup.p3942a;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.specact.popup.a.j */
public final class C75125j {
    @AbstractC27891c(mo46611a = "task_award_desc")

    /* renamed from: a */
    public String f168900a;
    @AbstractC27891c(mo46611a = "task_name")

    /* renamed from: b */
    public String f168901b;
    @AbstractC27891c(mo46611a = "task_id")

    /* renamed from: c */
    public String f168902c;
    @AbstractC27891c(mo46611a = "bold")

    /* renamed from: d */
    public boolean f168903d;

    static {
        Covode.recordClassIndex(87998);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C75125j)) {
            return false;
        }
        C75125j jVar = (C75125j) obj;
        return C89219l.m154714a(this.f168900a, jVar.f168900a) && C89219l.m154714a(this.f168901b, jVar.f168901b) && C89219l.m154714a(this.f168902c, jVar.f168902c) && this.f168903d == jVar.f168903d;
    }

    public final int hashCode() {
        String str = this.f168900a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f168901b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f168902c;
        if (str3 != null) {
            i = str3.hashCode();
        }
        int i2 = (hashCode2 + i) * 31;
        boolean z = this.f168903d;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        return i2 + i3;
    }

    public final String toString() {
        return "TaskInfo(taskAwardDesc=" + this.f168900a + ", taskName=" + this.f168901b + ", taskId=" + this.f168902c + ", bold=" + this.f168903d + ")";
    }

    private /* synthetic */ C75125j() {
        this("", "", "");
    }

    private C75125j(String str, String str2, String str3) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        this.f168900a = str;
        this.f168901b = str2;
        this.f168902c = str3;
        this.f168903d = false;
    }
}
