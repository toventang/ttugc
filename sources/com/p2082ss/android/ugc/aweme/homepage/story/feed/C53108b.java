package com.p2082ss.android.ugc.aweme.homepage.story.feed;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.homepage.story.feed.b */
public final class C53108b {

    /* renamed from: a */
    public final boolean f122122a;

    /* renamed from: b */
    public final EnumC53107a f122123b;

    static {
        Covode.recordClassIndex(62654);
    }

    public C53108b() {
        this(false, null, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C53108b)) {
            return false;
        }
        C53108b bVar = (C53108b) obj;
        return this.f122122a == bVar.f122122a && C89219l.m154714a(this.f122123b, bVar.f122123b);
    }

    public final int hashCode() {
        boolean z = this.f122122a;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = i * 31;
        EnumC53107a aVar = this.f122123b;
        return i4 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        return "ContainerMessage(newData=" + this.f122122a + ", nextInstruction=" + this.f122123b + ")";
    }

    public C53108b(boolean z, EnumC53107a aVar) {
        C89219l.m154721d(aVar, "");
        this.f122122a = z;
        this.f122123b = aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C53108b(boolean z, EnumC53107a aVar, int i) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? EnumC53107a.DEFAULT : aVar);
    }
}
