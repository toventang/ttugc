package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3086b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.live.NewLiveRoomStruct;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81914b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.b.a */
public final class C53713a implements AbstractC81914b {

    /* renamed from: a */
    public String f123243a;

    /* renamed from: b */
    public NewLiveRoomStruct f123244b;

    static {
        Covode.recordClassIndex(63293);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C53713a)) {
            return false;
        }
        C53713a aVar = (C53713a) obj;
        return C89219l.m154714a(this.f123243a, aVar.f123243a) && C89219l.m154714a(this.f123244b, aVar.f123244b);
    }

    public final int hashCode() {
        String str = this.f123243a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        NewLiveRoomStruct newLiveRoomStruct = this.f123244b;
        if (newLiveRoomStruct != null) {
            i = newLiveRoomStruct.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "ImRoomStatusEvent(uid=" + this.f123243a + ", room=" + this.f123244b + ")";
    }

    public C53713a(String str, NewLiveRoomStruct newLiveRoomStruct) {
        C89219l.m154721d(str, "");
        this.f123243a = str;
        this.f123244b = newLiveRoomStruct;
    }
}
