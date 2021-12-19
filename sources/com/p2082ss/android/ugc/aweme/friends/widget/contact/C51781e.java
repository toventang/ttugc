package com.p2082ss.android.ugc.aweme.friends.widget.contact;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.friends.model.Friend;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.friends.widget.contact.e */
public final class C51781e extends AbstractC51770a implements Comparable<C51781e> {

    /* renamed from: b */
    public final Friend f119341b;

    static {
        Covode.recordClassIndex(61146);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C51781e) && C89219l.m154714a(this.f119341b, ((C51781e) obj).f119341b);
        }
        return true;
    }

    public final int hashCode() {
        Friend friend = this.f119341b;
        if (friend != null) {
            return friend.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "InviteContactPod(friend=" + this.f119341b + ")";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C51781e(Friend friend) {
        super(1);
        C89219l.m154721d(friend, "");
        this.f119341b = friend;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0098 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00c8  */
    @Override // java.lang.Comparable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ int compareTo(com.p2082ss.android.ugc.aweme.friends.widget.contact.C51781e r11) {
        /*
        // Method dump skipped, instructions count: 238
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.friends.widget.contact.C51781e.compareTo(java.lang.Object):int");
    }
}
