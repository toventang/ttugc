package com.bytedance.android.livesdk.chatroom.model.p497c;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.chatroom.model.c.c */
public final class C7678c {
    @AbstractC27891c(mo46611a = "rtc_ext_info")

    /* renamed from: a */
    public String f19024a;

    static {
        Covode.recordClassIndex(8460);
    }

    public C7678c(char c) {
        this((byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C7678c) && C89219l.m154714a(this.f19024a, ((C7678c) obj).f19024a);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f19024a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "UpdateRoomLayoutSettings(rtcExtInfo=" + this.f19024a + ")";
    }

    private C7678c() {
        this.f19024a = null;
    }

    private /* synthetic */ C7678c(byte b) {
        this();
    }
}
