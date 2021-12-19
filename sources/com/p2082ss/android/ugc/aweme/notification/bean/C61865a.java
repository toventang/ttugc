package com.p2082ss.android.ugc.aweme.notification.bean;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.friends.model.Friend;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import java.util.List;
import java.util.Objects;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notification.bean.a */
public final class C61865a extends MusNotice {

    /* renamed from: c */
    public static final List<Integer> f140447c = C89070n.m154522b(2009, 2010);

    /* renamed from: d */
    public static final C61866a f140448d = new C61866a((byte) 0);

    /* renamed from: a */
    public final int f140449a;

    /* renamed from: b */
    public final Friend f140450b;

    public final String toString() {
        return "ContactNotice(contactType=" + this.f140449a + ", friend=" + this.f140450b + ")";
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.bean.a$a */
    public static final class C61866a {
        static {
            Covode.recordClassIndex(72615);
        }

        private C61866a() {
        }

        public /* synthetic */ C61866a(byte b) {
            this();
        }

        /* renamed from: a */
        public static boolean m112007a(MusNotice musNotice) {
            C89219l.m154721d(musNotice, "");
            return C61865a.f140447c.contains(Integer.valueOf(musNotice.type));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.type), this.f140450b);
    }

    static {
        Covode.recordClassIndex(72614);
    }

    @Override // com.p2082ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C61865a)) {
            return false;
        }
        C61865a aVar = (C61865a) obj;
        if (this.type != aVar.type || !Objects.equals(this.f140450b, aVar.f140450b)) {
            return false;
        }
        return true;
    }

    public C61865a(int i, Friend friend) {
        super(true);
        this.f140449a = i;
        this.f140450b = friend;
        ((MusNotice) this).type = i;
        ((MusNotice) this).nid = String.valueOf(hashCode());
        ((MusNotice) this).hasRead = true;
    }
}
