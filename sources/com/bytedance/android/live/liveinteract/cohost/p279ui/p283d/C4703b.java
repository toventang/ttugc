package com.bytedance.android.live.liveinteract.cohost.p279ui.p283d;

import com.bytedance.android.live.liveinteract.api.EnumC4442m;
import com.bytedance.android.livesdk.chatroom.interact.model.C7610h;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.d.b */
public final class C4703b {

    /* renamed from: a */
    public final Room f12429a;

    /* renamed from: b */
    public final EnumC4442m f12430b;

    /* renamed from: c */
    public final C7610h f12431c;

    /* renamed from: d */
    public final String f12432d;

    static {
        Covode.recordClassIndex(5280);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4703b)) {
            return false;
        }
        C4703b bVar = (C4703b) obj;
        return C89219l.m154714a(this.f12429a, bVar.f12429a) && C89219l.m154714a(this.f12430b, bVar.f12430b) && C89219l.m154714a(this.f12431c, bVar.f12431c) && C89219l.m154714a(this.f12432d, bVar.f12432d);
    }

    public final int hashCode() {
        Room room = this.f12429a;
        int i = 0;
        int hashCode = (room != null ? room.hashCode() : 0) * 31;
        EnumC4442m mVar = this.f12430b;
        int hashCode2 = (hashCode + (mVar != null ? mVar.hashCode() : 0)) * 31;
        C7610h hVar = this.f12431c;
        int hashCode3 = (hashCode2 + (hVar != null ? hVar.hashCode() : 0)) * 31;
        String str = this.f12432d;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        return "InteractUserItem(room=" + this.f12429a + ", inviteType=" + this.f12430b + ", rivalExtraInfo=" + this.f12431c + ", requestId=" + this.f12432d + ")";
    }

    public C4703b(Room room, EnumC4442m mVar, C7610h hVar, String str) {
        C89219l.m154721d(room, "");
        this.f12429a = room;
        this.f12430b = mVar;
        this.f12431c = hVar;
        this.f12432d = str;
    }
}
