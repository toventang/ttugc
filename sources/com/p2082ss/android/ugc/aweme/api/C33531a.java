package com.p2082ss.android.ugc.aweme.api;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.api.a */
public final class C33531a {
    @AbstractC27891c(mo46611a = "status_code")

    /* renamed from: a */
    public final int f79638a;
    @AbstractC27891c(mo46611a = "status_msg")

    /* renamed from: b */
    public final String f79639b;
    @AbstractC27891c(mo46611a = "anchor")

    /* renamed from: c */
    public final CreateAnchorInfo f79640c;
    @AbstractC27891c(mo46611a = "can_user_remove")

    /* renamed from: d */
    public final Boolean f79641d;
    @AbstractC27891c(mo46611a = "added_icon")

    /* renamed from: e */
    public final C33537f f79642e;

    static {
        Covode.recordClassIndex(40401);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C33531a)) {
            return false;
        }
        C33531a aVar = (C33531a) obj;
        return this.f79638a == aVar.f79638a && C89219l.m154714a(this.f79639b, aVar.f79639b) && C89219l.m154714a(this.f79640c, aVar.f79640c) && C89219l.m154714a(this.f79641d, aVar.f79641d) && C89219l.m154714a(this.f79642e, aVar.f79642e);
    }

    public final int hashCode() {
        int i = this.f79638a * 31;
        String str = this.f79639b;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        CreateAnchorInfo createAnchorInfo = this.f79640c;
        int hashCode2 = (hashCode + (createAnchorInfo != null ? createAnchorInfo.hashCode() : 0)) * 31;
        Boolean bool = this.f79641d;
        int hashCode3 = (hashCode2 + (bool != null ? bool.hashCode() : 0)) * 31;
        C33537f fVar = this.f79642e;
        if (fVar != null) {
            i2 = fVar.hashCode();
        }
        return hashCode3 + i2;
    }

    public final String toString() {
        return "AnchorAutoSelectionResponse(status=" + this.f79638a + ", statusMsg=" + this.f79639b + ", anchor=" + this.f79640c + ", canRemove=" + this.f79641d + ", addedIcon=" + this.f79642e + ")";
    }
}
