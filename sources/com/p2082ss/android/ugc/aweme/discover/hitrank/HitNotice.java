package com.p2082ss.android.ugc.aweme.discover.hitrank;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.message.model.SimpleUser;
import java.util.ArrayList;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.hitrank.HitNotice */
public final class HitNotice extends BaseResponse {
    @AbstractC27891c(mo46611a = "user_list")
    private ArrayList<SimpleUser> userList;

    static {
        Covode.recordClassIndex(49993);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.discover.hitrank.HitNotice */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HitNotice copy$default(HitNotice hitNotice, ArrayList arrayList, int i, Object obj) {
        if ((i & 1) != 0) {
            arrayList = hitNotice.userList;
        }
        return hitNotice.copy(arrayList);
    }

    public final ArrayList<SimpleUser> component1() {
        return this.userList;
    }

    public final HitNotice copy(ArrayList<SimpleUser> arrayList) {
        C89219l.m154721d(arrayList, "");
        return new HitNotice(arrayList);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof HitNotice) && C89219l.m154714a(this.userList, ((HitNotice) obj).userList);
        }
        return true;
    }

    public final int hashCode() {
        ArrayList<SimpleUser> arrayList = this.userList;
        if (arrayList != null) {
            return arrayList.hashCode();
        }
        return 0;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "HitNotice(userList=" + this.userList + ")";
    }

    public final ArrayList<SimpleUser> getUserList() {
        return this.userList;
    }

    public final void setUserList(ArrayList<SimpleUser> arrayList) {
        C89219l.m154721d(arrayList, "");
        this.userList = arrayList;
    }

    public HitNotice(ArrayList<SimpleUser> arrayList) {
        C89219l.m154721d(arrayList, "");
        this.userList = arrayList;
    }
}
