package com.bytedance.android.livesdk.chatroom.model;

import com.bytedance.android.livesdk.model.C9537au;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.chatroom.model.o */
public final class C7695o {
    @AbstractC27891c(mo46611a = "text_stickers")

    /* renamed from: a */
    public List<? extends C9537au> f19074a;
    @AbstractC27891c(mo46611a = "pic_stickers")

    /* renamed from: b */
    public List<? extends C9537au> f19075b;

    static {
        Covode.recordClassIndex(8477);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7695o)) {
            return false;
        }
        C7695o oVar = (C7695o) obj;
        return C89219l.m154714a(this.f19074a, oVar.f19074a) && C89219l.m154714a(this.f19075b, oVar.f19075b);
    }

    public final int hashCode() {
        List<? extends C9537au> list = this.f19074a;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        List<? extends C9537au> list2 = this.f19075b;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "StickerResponse(textStickers=" + this.f19074a + ", picStickers=" + this.f19075b + ")";
    }
}
