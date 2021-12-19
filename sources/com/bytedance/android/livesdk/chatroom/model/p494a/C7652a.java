package com.bytedance.android.livesdk.chatroom.model.p494a;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.chatroom.model.a.a */
public final class C7652a {
    @AbstractC27891c(mo46611a = "block_list")

    /* renamed from: a */
    public List<String> f18962a = null;
    @AbstractC27891c(mo46611a = "multi_list")

    /* renamed from: b */
    public List<String> f18963b = null;
    @AbstractC27891c(mo46611a = "single_list")

    /* renamed from: c */
    public List<String> f18964c = null;

    static {
        Covode.recordClassIndex(8434);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7652a)) {
            return false;
        }
        C7652a aVar = (C7652a) obj;
        return C89219l.m154714a(this.f18962a, aVar.f18962a) && C89219l.m154714a(this.f18963b, aVar.f18963b) && C89219l.m154714a(this.f18964c, aVar.f18964c);
    }

    public final int hashCode() {
        List<String> list = this.f18962a;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        List<String> list2 = this.f18963b;
        int hashCode2 = (hashCode + (list2 != null ? list2.hashCode() : 0)) * 31;
        List<String> list3 = this.f18964c;
        if (list3 != null) {
            i = list3.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "BackRoomListSettingConfig(blockList=" + this.f18962a + ", multiList=" + this.f18963b + ", singleList=" + this.f18964c + ")";
    }
}
