package com.p2082ss.android.ugc.aweme.specact.popup.p3942a;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.specact.popup.a.c */
public final class C75118c {
    @AbstractC27891c(mo46611a = "calendar_remind_time")

    /* renamed from: a */
    public long f168865a;
    @AbstractC27891c(mo46611a = "calendar_title")

    /* renamed from: b */
    public String f168866b;
    @AbstractC27891c(mo46611a = "calendar_desc")

    /* renamed from: c */
    public String f168867c;

    static {
        Covode.recordClassIndex(87991);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C75118c)) {
            return false;
        }
        C75118c cVar = (C75118c) obj;
        return this.f168865a == cVar.f168865a && C89219l.m154714a(this.f168866b, cVar.f168866b) && C89219l.m154714a(this.f168867c, cVar.f168867c);
    }

    public final String toString() {
        return "CalendarInfo(calendarRemindTime=" + this.f168865a + ", calendarTitle=" + this.f168866b + ", calendarDesc=" + this.f168867c + ")";
    }

    public /* synthetic */ C75118c() {
        this("", "");
    }

    public final int hashCode() {
        int i;
        long j = this.f168865a;
        int i2 = ((int) (j ^ (j >>> 32))) * 31;
        String str = this.f168866b;
        int i3 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i4 = (i2 + i) * 31;
        String str2 = this.f168867c;
        if (str2 != null) {
            i3 = str2.hashCode();
        }
        return i4 + i3;
    }

    private C75118c(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        this.f168865a = 0;
        this.f168866b = str;
        this.f168867c = str2;
    }
}
