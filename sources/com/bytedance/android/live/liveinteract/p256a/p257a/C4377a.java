package com.bytedance.android.live.liveinteract.p256a.p257a;

import com.bytedance.android.livesdk.chatroom.model.p498d.C7683a;
import com.bytedance.covode.number.Covode;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.liveinteract.a.a.a */
public final class C4377a {

    /* renamed from: a */
    public List<C7683a> f11890a;

    /* renamed from: b */
    public List<C7683a> f11891b;

    /* renamed from: c */
    public List<C7683a> f11892c;

    /* renamed from: d */
    public boolean f11893d = false;

    static {
        Covode.recordClassIndex(4951);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4377a)) {
            return false;
        }
        C4377a aVar = (C4377a) obj;
        return C89219l.m154714a(this.f11890a, aVar.f11890a) && C89219l.m154714a(this.f11891b, aVar.f11891b) && C89219l.m154714a(this.f11892c, aVar.f11892c) && this.f11893d == aVar.f11893d;
    }

    public final int hashCode() {
        List<C7683a> list = this.f11890a;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        List<C7683a> list2 = this.f11891b;
        int hashCode2 = (hashCode + (list2 != null ? list2.hashCode() : 0)) * 31;
        List<C7683a> list3 = this.f11892c;
        if (list3 != null) {
            i = list3.hashCode();
        }
        int i2 = (hashCode2 + i) * 31;
        boolean z = this.f11893d;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        return i2 + i3;
    }

    public final String toString() {
        return "SociaLiveAllPlayers(onLinePlayerList=" + this.f11890a + ", waitingPlayerList=" + this.f11891b + ", viewerPlayerList=" + this.f11892c + ", loading=" + this.f11893d + ")";
    }

    public C4377a(List<C7683a> list, List<C7683a> list2, List<C7683a> list3) {
        C89219l.m154721d(list, "");
        C89219l.m154721d(list2, "");
        C89219l.m154721d(list3, "");
        this.f11890a = list;
        this.f11891b = list2;
        this.f11892c = list3;
    }
}
