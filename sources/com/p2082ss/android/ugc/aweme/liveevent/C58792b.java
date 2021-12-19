package com.p2082ss.android.ugc.aweme.liveevent;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.liveevent.b */
public final class C58792b {
    @AbstractC27891c(mo46611a = "eventId")

    /* renamed from: a */
    public String f133800a;
    @AbstractC27891c(mo46611a = "title")

    /* renamed from: b */
    public String f133801b;
    @AbstractC27891c(mo46611a = "note")

    /* renamed from: c */
    public String f133802c;
    @AbstractC27891c(mo46611a = "startTime")

    /* renamed from: d */
    public long f133803d;
    @AbstractC27891c(mo46611a = "endTime")

    /* renamed from: e */
    public long f133804e;
    @AbstractC27891c(mo46611a = "alarmMinutes")

    /* renamed from: f */
    public Integer f133805f;
    @AbstractC27891c(mo46611a = "enter_from")

    /* renamed from: g */
    public String f133806g;
    @AbstractC27891c(mo46611a = "anchor")

    /* renamed from: h */
    public C58791a f133807h;

    static {
        Covode.recordClassIndex(69102);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C58792b)) {
            return false;
        }
        C58792b bVar = (C58792b) obj;
        return C89219l.m154714a(this.f133800a, bVar.f133800a) && C89219l.m154714a(this.f133801b, bVar.f133801b) && C89219l.m154714a(this.f133802c, bVar.f133802c) && this.f133803d == bVar.f133803d && this.f133804e == bVar.f133804e && C89219l.m154714a(this.f133805f, bVar.f133805f) && C89219l.m154714a(this.f133806g, bVar.f133806g) && C89219l.m154714a(this.f133807h, bVar.f133807h);
    }

    public final String toString() {
        return "CalendarEvent(eventId=" + this.f133800a + ", title=" + this.f133801b + ", note=" + this.f133802c + ", startTime=" + this.f133803d + ", endTime=" + this.f133804e + ", alarmMinutes=" + this.f133805f + ", enterFrom=" + this.f133806g + ", anchor=" + this.f133807h + ")";
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        String str = this.f133800a;
        int i6 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i7 = i * 31;
        String str2 = this.f133801b;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i8 = (i7 + i2) * 31;
        String str3 = this.f133802c;
        if (str3 != null) {
            i3 = str3.hashCode();
        } else {
            i3 = 0;
        }
        long j = this.f133803d;
        long j2 = this.f133804e;
        int i9 = (((((i8 + i3) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        Integer num = this.f133805f;
        if (num != null) {
            i4 = num.hashCode();
        } else {
            i4 = 0;
        }
        int i10 = (i9 + i4) * 31;
        String str4 = this.f133806g;
        if (str4 != null) {
            i5 = str4.hashCode();
        } else {
            i5 = 0;
        }
        int i11 = (i10 + i5) * 31;
        C58791a aVar = this.f133807h;
        if (aVar != null) {
            i6 = aVar.hashCode();
        }
        return i11 + i6;
    }
}
