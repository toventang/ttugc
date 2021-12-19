package com.p2082ss.android.ugc.aweme.shortvideo.p3896z.p3897a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.challenge.model.Segment;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.z.a.a */
public final class C74332a {

    /* renamed from: d */
    public static final C74333a f167164d = new C74333a((byte) 0);

    /* renamed from: a */
    public final User f167165a;

    /* renamed from: b */
    public final int f167166b;

    /* renamed from: c */
    public final List<Segment> f167167c;

    static {
        Covode.recordClassIndex(87104);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C74332a)) {
            return false;
        }
        C74332a aVar = (C74332a) obj;
        return C89219l.m154714a(this.f167165a, aVar.f167165a) && this.f167166b == aVar.f167166b && C89219l.m154714a(this.f167167c, aVar.f167167c);
    }

    public final int hashCode() {
        User user = this.f167165a;
        int i = 0;
        int hashCode = (((user != null ? user.hashCode() : 0) * 31) + this.f167166b) * 31;
        List<Segment> list = this.f167167c;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "SessionShareFriendModel(user=" + this.f167165a + ", type=" + this.f167166b + ", segments=" + this.f167167c + ")";
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.z.a.a$a */
    public static final class C74333a {
        static {
            Covode.recordClassIndex(87105);
        }

        private C74333a() {
        }

        public /* synthetic */ C74333a(byte b) {
            this();
        }
    }

    private C74332a(User user) {
        C89219l.m154721d(user, "");
        this.f167165a = user;
        this.f167166b = 3;
        this.f167167c = null;
    }

    public /* synthetic */ C74332a(User user, byte b) {
        this(user);
    }
}
