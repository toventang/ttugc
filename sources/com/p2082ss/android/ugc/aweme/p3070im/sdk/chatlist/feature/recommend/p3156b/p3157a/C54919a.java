package com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.feature.recommend.p3156b.p3157a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.feature.recommend.b.a.a */
public final class C54919a {

    /* renamed from: d */
    public static final C54920a f125726d = new C54920a((byte) 0);

    /* renamed from: a */
    public final int f125727a;

    /* renamed from: b */
    public final User f125728b;

    /* renamed from: c */
    public final int f125729c;

    static {
        Covode.recordClassIndex(64641);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C54919a)) {
            return false;
        }
        C54919a aVar = (C54919a) obj;
        return this.f125727a == aVar.f125727a && C89219l.m154714a(this.f125728b, aVar.f125728b) && this.f125729c == aVar.f125729c;
    }

    public final int hashCode() {
        int i = this.f125727a * 31;
        User user = this.f125728b;
        return ((i + (user != null ? user.hashCode() : 0)) * 31) + this.f125729c;
    }

    public final String toString() {
        return "RecommendFriendListItemBean(recommendType=" + this.f125727a + ", recommendUser=" + this.f125728b + ", sourceType=" + this.f125729c + ")";
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.feature.recommend.b.a.a$a */
    public static final class C54920a {
        static {
            Covode.recordClassIndex(64642);
        }

        private C54920a() {
        }

        public /* synthetic */ C54920a(byte b) {
            this();
        }
    }

    private C54919a(int i, User user, int i2) {
        this.f125727a = i;
        this.f125728b = user;
        this.f125729c = i2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C54919a(int i, User user, int i2, int i3) {
        this(i, (i3 & 2) != 0 ? null : user, (i3 & 4) != 0 ? -1 : i2);
    }
}
