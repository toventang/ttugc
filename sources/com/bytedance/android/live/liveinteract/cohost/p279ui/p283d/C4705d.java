package com.bytedance.android.live.liveinteract.cohost.p279ui.p283d;

import com.bytedance.android.livesdk.chatroom.interact.model.C7611i;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.d.d */
public final class C4705d {

    /* renamed from: a */
    public final C7611i.C7612a f12434a;

    static {
        Covode.recordClassIndex(5282);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C4705d) && C89219l.m154714a(this.f12434a, ((C4705d) obj).f12434a);
        }
        return true;
    }

    public final int hashCode() {
        C7611i.C7612a aVar = this.f12434a;
        if (aVar != null) {
            return aVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "RandomLinkMicEntranceItem(bannerText=" + this.f12434a + ")";
    }

    public C4705d(C7611i.C7612a aVar) {
        C89219l.m154721d(aVar, "");
        this.f12434a = aVar;
    }
}
