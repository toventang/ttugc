package com.p2082ss.android.ugc.aweme.notification.bean;

import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import java.util.Objects;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notification.bean.q */
public final class C61886q extends MusNotice {

    /* renamed from: e */
    public static final List<Integer> f140506e = C89070n.m154522b(Integer.valueOf((int) LiveNetAdaptiveHurryTimeSetting.DEFAULT), 2001, 2011, 2002, 2003, 2004, 2005, 2006);

    /* renamed from: f */
    public static final List<Integer> f140507f = C89070n.m154522b(2004, 2005);

    /* renamed from: g */
    public static final C61887a f140508g = new C61887a((byte) 0);

    /* renamed from: a */
    public final int f140509a;

    /* renamed from: b */
    public final User f140510b;

    /* renamed from: c */
    public final List<User> f140511c;

    /* renamed from: d */
    public final int f140512d;

    public final String toString() {
        return "RecommendNotice(recommend_type=" + this.f140509a + ", recommend_user=" + this.f140510b + ", aggregateUsers=" + this.f140511c + ", aggregateTotalUserCount=" + this.f140512d + ")";
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.bean.q$a */
    public static final class C61887a {
        static {
            Covode.recordClassIndex(72636);
        }

        private C61887a() {
        }

        public /* synthetic */ C61887a(byte b) {
            this();
        }

        /* renamed from: a */
        public static boolean m112014a(MusNotice musNotice) {
            C89219l.m154721d(musNotice, "");
            return C61886q.f140506e.contains(Integer.valueOf(musNotice.type));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f140509a), this.f140510b, this.f140511c, Integer.valueOf(this.f140512d));
    }

    static {
        Covode.recordClassIndex(72635);
    }

    @Override // com.p2082ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C61886q)) {
            return false;
        }
        C61886q qVar = (C61886q) obj;
        if (this.f140509a != qVar.f140509a || !Objects.equals(this.f140510b, qVar.f140510b) || !Objects.equals(this.f140511c, qVar.f140511c) || this.f140512d != qVar.f140512d) {
            return false;
        }
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.profile.model.User> */
    /* JADX WARN: Multi-variable type inference failed */
    private C61886q(int i, User user, List<? extends User> list, int i2) {
        super(true);
        this.f140509a = i;
        this.f140510b = user;
        this.f140511c = list;
        this.f140512d = i2;
        ((MusNotice) this).type = i;
        ((MusNotice) this).nid = String.valueOf(hashCode());
        ((MusNotice) this).hasRead = true;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C61886q(int i, User user, List list, int i2, int i3) {
        this(i, (i3 & 2) != 0 ? null : user, (i3 & 4) != 0 ? null : list, (i3 & 8) != 0 ? 0 : i2);
    }
}
