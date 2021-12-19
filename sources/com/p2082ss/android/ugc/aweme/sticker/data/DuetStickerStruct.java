package com.p2082ss.android.ugc.aweme.sticker.data;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.data.DuetStickerStruct */
public final class DuetStickerStruct implements Serializable {
    @AbstractC27891c(mo46611a = "stickerContent")
    public String duetString;
    @AbstractC27891c(mo46611a = "micPermissionOn")
    public boolean openMic;
    @AbstractC27891c(mo46611a = "invitedToDuetUserIds")
    public List<String> userIdList;
    @AbstractC27891c(mo46611a = "user_list")
    public List<DuetStickerUserStruct> userList;

    static {
        Covode.recordClassIndex(88210);
    }

    public DuetStickerStruct() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.sticker.data.DuetStickerStruct */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DuetStickerStruct copy$default(DuetStickerStruct duetStickerStruct, List list, boolean z, String str, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = duetStickerStruct.userList;
        }
        if ((i & 2) != 0) {
            z = duetStickerStruct.openMic;
        }
        if ((i & 4) != 0) {
            str = duetStickerStruct.duetString;
        }
        if ((i & 8) != 0) {
            list2 = duetStickerStruct.userIdList;
        }
        return duetStickerStruct.copy(list, z, str, list2);
    }

    public final List<DuetStickerUserStruct> component1() {
        return this.userList;
    }

    public final boolean component2() {
        return this.openMic;
    }

    public final String component3() {
        return this.duetString;
    }

    public final List<String> component4() {
        return this.userIdList;
    }

    public final DuetStickerStruct copy(List<DuetStickerUserStruct> list, boolean z, String str, List<String> list2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(list2, "");
        return new DuetStickerStruct(list, z, str, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DuetStickerStruct)) {
            return false;
        }
        DuetStickerStruct duetStickerStruct = (DuetStickerStruct) obj;
        return C89219l.m154714a(this.userList, duetStickerStruct.userList) && this.openMic == duetStickerStruct.openMic && C89219l.m154714a(this.duetString, duetStickerStruct.duetString) && C89219l.m154714a(this.userIdList, duetStickerStruct.userIdList);
    }

    public final int hashCode() {
        List<DuetStickerUserStruct> list = this.userList;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        boolean z = this.openMic;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = (hashCode + i2) * 31;
        String str = this.duetString;
        int hashCode2 = (i5 + (str != null ? str.hashCode() : 0)) * 31;
        List<String> list2 = this.userIdList;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "DuetStickerStruct(userList=" + this.userList + ", openMic=" + this.openMic + ", duetString=" + this.duetString + ", userIdList=" + this.userIdList + ")";
    }

    public final String getDuetString() {
        return this.duetString;
    }

    public final boolean getOpenMic() {
        return this.openMic;
    }

    public final List<String> getUserIdList() {
        return this.userIdList;
    }

    public final List<DuetStickerUserStruct> getUserList() {
        return this.userList;
    }

    public final void completeSecIdList() {
        this.userIdList.clear();
        List<DuetStickerUserStruct> list = this.userList;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                this.userIdList.add(it.next().f169297d);
            }
        }
    }

    public final void setUserIdList(List<String> list) {
        C89219l.m154721d(list, "");
        this.userIdList = list;
    }

    public DuetStickerStruct(List<DuetStickerUserStruct> list, boolean z, String str, List<String> list2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(list2, "");
        this.userList = list;
        this.openMic = z;
        this.duetString = str;
        this.userIdList = list2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DuetStickerStruct(List list, boolean z, String str, List list2, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? false : z, str, (i & 8) != 0 ? new ArrayList() : list2);
    }
}
