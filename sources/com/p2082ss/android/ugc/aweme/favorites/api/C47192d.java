package com.p2082ss.android.ugc.aweme.favorites.api;

import com.bytedance.assem.arch.extensions.AbstractC12779c;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.favorites.api.d */
public final class C47192d extends BaseResponse implements AbstractC12779c {
    @AbstractC27891c(mo46611a = "id")

    /* renamed from: a */
    public final String f109842a;
    @AbstractC27891c(mo46611a = StringSet.name)

    /* renamed from: b */
    public String f109843b;
    @AbstractC27891c(mo46611a = "covers")

    /* renamed from: c */
    public final List<UrlModel> f109844c;
    @AbstractC27891c(mo46611a = "status")

    /* renamed from: d */
    public final C47194b f109845d;
    @AbstractC27891c(mo46611a = "statistic")

    /* renamed from: e */
    public final C47193a f109846e;

    static {
        Covode.recordClassIndex(55802);
    }

    public C47192d() {
        this(null, null, null, null, 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C47192d)) {
            return false;
        }
        C47192d dVar = (C47192d) obj;
        return C89219l.m154714a(this.f109842a, dVar.f109842a) && C89219l.m154714a(this.f109843b, dVar.f109843b) && C89219l.m154714a(this.f109844c, dVar.f109844c) && C89219l.m154714a(this.f109845d, dVar.f109845d) && C89219l.m154714a(this.f109846e, dVar.f109846e);
    }

    public final int hashCode() {
        String str = this.f109842a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f109843b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        List<UrlModel> list = this.f109844c;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        C47194b bVar = this.f109845d;
        int hashCode4 = (hashCode3 + (bVar != null ? bVar.hashCode() : 0)) * 31;
        C47193a aVar = this.f109846e;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return hashCode4 + i;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "CollectionDetail(id=" + this.f109842a + ", name=" + this.f109843b + ", covers=" + this.f109844c + ", status=" + this.f109845d + ", statistic=" + this.f109846e + ")";
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.api.d$b */
    public static final class C47194b {
        @AbstractC27891c(mo46611a = "state")

        /* renamed from: a */
        public final Integer f109849a;

        static {
            Covode.recordClassIndex(55804);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof C47194b) && C89219l.m154714a(this.f109849a, ((C47194b) obj).f109849a);
            }
            return true;
        }

        public final int hashCode() {
            Integer num = this.f109849a;
            if (num != null) {
                return num.hashCode();
            }
            return 0;
        }

        public final String toString() {
            return "Status(state=" + this.f109849a + ")";
        }

        private /* synthetic */ C47194b() {
            this(null);
        }

        public C47194b(Integer num) {
            this.f109849a = num;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.api.d$a */
    public static final class C47193a {
        @AbstractC27891c(mo46611a = "total")

        /* renamed from: a */
        public Long f109847a;
        @AbstractC27891c(mo46611a = "has_videos")

        /* renamed from: b */
        public final boolean f109848b;

        static {
            Covode.recordClassIndex(55803);
        }

        public C47193a() {
            this(null, 3);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C47193a)) {
                return false;
            }
            C47193a aVar = (C47193a) obj;
            return C89219l.m154714a(this.f109847a, aVar.f109847a) && this.f109848b == aVar.f109848b;
        }

        public final int hashCode() {
            Long l = this.f109847a;
            int hashCode = (l != null ? l.hashCode() : 0) * 31;
            boolean z = this.f109848b;
            if (z) {
                z = true;
            }
            int i = z ? 1 : 0;
            int i2 = z ? 1 : 0;
            int i3 = z ? 1 : 0;
            return hashCode + i;
        }

        public final String toString() {
            return "Statistic(total=" + this.f109847a + ", hasVideos=" + this.f109848b + ")";
        }

        private C47193a(Long l) {
            this.f109847a = l;
            this.f109848b = false;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C47193a(Long l, int i) {
            this((i & 1) != 0 ? null : l);
        }
    }

    private C47192d(String str, String str2, C47194b bVar, C47193a aVar) {
        this.f109842a = str;
        this.f109843b = str2;
        this.f109844c = null;
        this.f109845d = bVar;
        this.f109846e = aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C47192d(String str, String str2, C47194b bVar, C47193a aVar, int i) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 8) != 0 ? null : bVar, (i & 16) != 0 ? null : aVar);
    }
}
