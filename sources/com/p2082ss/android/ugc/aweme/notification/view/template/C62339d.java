package com.p2082ss.android.ugc.aweme.notification.view.template;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notification.view.template.d */
public final class C62339d {

    /* renamed from: a */
    public final MusNotice f141467a;

    /* renamed from: b */
    public final int f141468b;

    /* renamed from: c */
    public final String f141469c;

    /* renamed from: d */
    public final String f141470d;

    /* renamed from: e */
    public final String f141471e;

    /* renamed from: f */
    public final boolean f141472f;

    static {
        Covode.recordClassIndex(73124);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C62339d)) {
            return false;
        }
        C62339d dVar = (C62339d) obj;
        return C89219l.m154714a(this.f141467a, dVar.f141467a) && this.f141468b == dVar.f141468b && C89219l.m154714a(this.f141469c, dVar.f141469c) && C89219l.m154714a(this.f141470d, dVar.f141470d) && C89219l.m154714a(this.f141471e, dVar.f141471e) && this.f141472f == dVar.f141472f;
    }

    public final int hashCode() {
        MusNotice musNotice = this.f141467a;
        int i = 0;
        int hashCode = (((musNotice != null ? musNotice.hashCode() : 0) * 31) + this.f141468b) * 31;
        String str = this.f141469c;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f141470d;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f141471e;
        if (str3 != null) {
            i = str3.hashCode();
        }
        int i2 = (hashCode3 + i) * 31;
        boolean z = this.f141472f;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        return i2 + i3;
    }

    public final String toString() {
        return "NoticeTemplateBindData(notice=" + this.f141467a + ", clientOrder=" + this.f141468b + ", timelineType=" + this.f141469c + ", tabName=" + this.f141470d + ", enterFrom=" + this.f141471e + ", isSecondPage=" + this.f141472f + ")";
    }

    public C62339d(MusNotice musNotice, int i, String str, String str2, String str3, boolean z) {
        C89219l.m154721d(musNotice, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str3, "");
        this.f141467a = musNotice;
        this.f141468b = i;
        this.f141469c = str;
        this.f141470d = str2;
        this.f141471e = str3;
        this.f141472f = z;
    }
}
