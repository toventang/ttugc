package com.p2082ss.android.ugc.aweme.inbox;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.inbox.h */
public final class C56462h {
    @AbstractC27891c(mo46611a = "enter_inbox_meta")

    /* renamed from: a */
    public final C56429g f128745a;
    @AbstractC27891c(mo46611a = "expand_meta")

    /* renamed from: b */
    public final C56429g f128746b;
    @AbstractC27891c(mo46611a = "notice_display_count")

    /* renamed from: c */
    public final int f128747c;
    @AbstractC27891c(mo46611a = "notice_display_recently")

    /* renamed from: d */
    public final int f128748d;
    @AbstractC27891c(mo46611a = "dm_no_update_days")

    /* renamed from: e */
    public final int f128749e;
    @AbstractC27891c(mo46611a = "dm_no_update_display_count")

    /* renamed from: f */
    public final int f128750f;

    static {
        Covode.recordClassIndex(66282);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C56462h)) {
            return false;
        }
        C56462h hVar = (C56462h) obj;
        return C89219l.m154714a(this.f128745a, hVar.f128745a) && C89219l.m154714a(this.f128746b, hVar.f128746b) && this.f128747c == hVar.f128747c && this.f128748d == hVar.f128748d && this.f128749e == hVar.f128749e && this.f128750f == hVar.f128750f;
    }

    public final int hashCode() {
        C56429g gVar = this.f128745a;
        int i = 0;
        int hashCode = (gVar != null ? gVar.hashCode() : 0) * 31;
        C56429g gVar2 = this.f128746b;
        if (gVar2 != null) {
            i = gVar2.hashCode();
        }
        return ((((((((hashCode + i) * 31) + this.f128747c) * 31) + this.f128748d) * 31) + this.f128749e) * 31) + this.f128750f;
    }

    public final String toString() {
        return "InboxCollapseMetas(enterInboxMeta=" + this.f128745a + ", expandMeta=" + this.f128746b + ", noticeDisplayCount=" + this.f128747c + ", noticeDisplayRecently=" + this.f128748d + ", dmNoUpdateDays=" + this.f128749e + ", dmNoUpdateDisplayCount=" + this.f128750f + ")";
    }

    public /* synthetic */ C56462h() {
        this(new C56429g((byte) 0), new C56429g((byte) 0));
    }

    private C56462h(C56429g gVar, C56429g gVar2) {
        C89219l.m154721d(gVar, "");
        C89219l.m154721d(gVar2, "");
        this.f128745a = gVar;
        this.f128746b = gVar2;
        this.f128747c = 3;
        this.f128748d = 24;
        this.f128749e = 14;
        this.f128750f = 4;
    }
}
