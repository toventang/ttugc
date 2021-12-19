package com.p2082ss.android.ugc.aweme.notification.bean;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.C61637k;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import java.util.List;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notification.bean.p */
public final class C61884p extends MusNotice {

    /* renamed from: d */
    public static final C61885a f140502d = new C61885a((byte) 0);

    /* renamed from: a */
    public final List<UrlModel> f140503a;

    /* renamed from: b */
    public final boolean f140504b;

    /* renamed from: c */
    public final String f140505c;

    static {
        Covode.recordClassIndex(72633);
    }

    public final String toString() {
        return "RecommendLiveNotice(avatarList=" + this.f140503a + ", enable=" + this.f140504b + ", requestId=" + this.f140505c + ")";
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.bean.p$a */
    public static final class C61885a {
        static {
            Covode.recordClassIndex(72634);
        }

        private C61885a() {
        }

        public /* synthetic */ C61885a(byte b) {
            this();
        }

        /* renamed from: a */
        public static C61884p m112013a(C61637k kVar) {
            C89219l.m154721d(kVar, "");
            return new C61884p(kVar.f139917a, kVar.f139918b, kVar.getRequestId());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.type), this.f140503a, Boolean.valueOf(this.f140504b));
    }

    @Override // com.p2082ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C61884p)) {
            return false;
        }
        C61884p pVar = (C61884p) obj;
        if (this.type == pVar.type && Objects.equals(this.f140503a, pVar.f140503a) && this.f140504b == pVar.f140504b) {
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.base.model.UrlModel> */
    /* JADX WARN: Multi-variable type inference failed */
    public C61884p(List<? extends UrlModel> list, boolean z, String str) {
        super(true);
        this.f140503a = list;
        this.f140504b = z;
        this.f140505c = str;
        ((MusNotice) this).type = 50;
        ((MusNotice) this).nid = String.valueOf(hashCode());
        this.createTime = 9223372036854775806L;
    }
}
