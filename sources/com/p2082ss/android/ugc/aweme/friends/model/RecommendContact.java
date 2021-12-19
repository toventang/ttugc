package com.p2082ss.android.ugc.aweme.friends.model;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.friends.model.RecommendContact */
public final class RecommendContact extends User {
    private final Integer type;

    static {
        Covode.recordClassIndex(60911);
    }

    public RecommendContact() {
        this(null, 1, null);
    }

    public static /* synthetic */ RecommendContact copy$default(RecommendContact recommendContact, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            num = recommendContact.type;
        }
        return recommendContact.copy(num);
    }

    public final Integer component1() {
        return this.type;
    }

    public final RecommendContact copy(Integer num) {
        return new RecommendContact(num);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.model.User
    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof RecommendContact) && C89219l.m154714a(this.type, ((RecommendContact) obj).type);
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.model.User
    public final int hashCode() {
        Integer num = this.type;
        if (num != null) {
            return num.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "RecommendContact(type=" + this.type + ")";
    }

    public final Integer getType() {
        return this.type;
    }

    public RecommendContact(Integer num) {
        this.type = num;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RecommendContact(Integer num, int i, C89214g gVar) {
        this((i & 1) != 0 ? 0 : num);
    }
}
