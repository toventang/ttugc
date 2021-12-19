package com.p2082ss.android.ugc.aweme.friends.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import java.util.List;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.friends.model.MutualStruct */
public final class MutualStruct implements Serializable {
    @AbstractC27891c(mo46611a = "mutual_type")
    public int mutualType;
    @AbstractC27891c(mo46611a = "total")
    public int total;
    @AbstractC27891c(mo46611a = "user_list")
    public List<MutualUser> userList;

    static {
        Covode.recordClassIndex(60905);
    }

    public MutualStruct() {
    }

    /* renamed from: com_ss_android_ugc_aweme_friends_model_MutualStruct_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m96094x29d67f38(int i) {
        return i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.friends.model.MutualStruct */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MutualStruct copy$default(MutualStruct mutualStruct, int i, int i2, List list, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = mutualStruct.mutualType;
        }
        if ((i3 & 2) != 0) {
            i2 = mutualStruct.total;
        }
        if ((i3 & 4) != 0) {
            list = mutualStruct.userList;
        }
        return mutualStruct.copy(i, i2, list);
    }

    public final int component1() {
        return this.mutualType;
    }

    public final int component2() {
        return this.total;
    }

    public final List<MutualUser> component3() {
        return this.userList;
    }

    public final MutualStruct copy(int i, int i2, List<MutualUser> list) {
        return new MutualStruct(i, i2, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MutualStruct)) {
            return false;
        }
        MutualStruct mutualStruct = (MutualStruct) obj;
        return this.mutualType == mutualStruct.mutualType && this.total == mutualStruct.total && C89219l.m154714a(this.userList, mutualStruct.userList);
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_friends_model_MutualStruct_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = ((m96094x29d67f38(this.mutualType) * 31) + m96094x29d67f38(this.total)) * 31;
        List<MutualUser> list = this.userList;
        return com_ss_android_ugc_aweme_friends_model_MutualStruct_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "MutualStruct(mutualType=" + this.mutualType + ", total=" + this.total + ", userList=" + this.userList + ")";
    }

    public final int getMutualType() {
        return this.mutualType;
    }

    public final int getTotal() {
        return this.total;
    }

    public final List<MutualUser> getUserList() {
        return this.userList;
    }

    public MutualStruct(int i, int i2, List<MutualUser> list) {
        this.mutualType = i;
        this.total = i2;
        this.userList = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MutualStruct(int i, int i2, List list, int i3, C89214g gVar) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, list);
    }
}
