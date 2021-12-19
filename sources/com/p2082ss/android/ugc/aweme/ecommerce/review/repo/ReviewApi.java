package com.p2082ss.android.ugc.aweme.ecommerce.review.repo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.AbstractC18099f;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.ecommerce.api.model.C43612a;
import com.p2082ss.android.ugc.aweme.ecommerce.review.repo.dto.ListReviewData;
import java.util.Objects;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.p4611f.p4613b.C89219l;
import p4640l.p4644b.AbstractC89717a;
import p4640l.p4644b.AbstractC89731o;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.review.repo.ReviewApi */
public interface ReviewApi {

    /* renamed from: a */
    public static final C45173a f105306a = C45173a.f105308b;

    static {
        Covode.recordClassIndex(53607);
    }

    @AbstractC89731o(mo144285a = "api/v1/review/digg")
    AbstractC88979t<Object> dig(@AbstractC89717a C45178b bVar);

    @AbstractC89731o(mo144285a = "api/v1/review/list")
    AbstractC88979t<C43612a<ListReviewData>> getReviewInfo(@AbstractC89717a C45179c cVar);

    @AbstractC89731o(mo144285a = "api/v1/review/cancel_digg")
    AbstractC88979t<Object> unDig(@AbstractC89717a C45178b bVar);

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.review.repo.ReviewApi$a */
    public static final class C45173a {

        /* renamed from: a */
        public static final AbstractC18099f f105307a = RetrofitFactory.m33635a().mo28817b("https://oec-api.tiktokv.com/").mo28832d();

        /* renamed from: b */
        static final /* synthetic */ C45173a f105308b = new C45173a();

        /* renamed from: com.ss.android.ugc.aweme.ecommerce.review.repo.ReviewApi$a$a */
        public static final class C45174a<T> implements AbstractC88433f {

            /* renamed from: a */
            public static final C45174a f105309a = new C45174a();

            static {
                Covode.recordClassIndex(53609);
            }

            C45174a() {
            }

            @Override // p4560f.p4561a.p4567d.AbstractC88433f
            public final void accept(Object obj) {
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.ecommerce.review.repo.ReviewApi$a$b */
        public static final class C45175b<T> implements AbstractC88433f {

            /* renamed from: a */
            public static final C45175b f105310a = new C45175b();

            static {
                Covode.recordClassIndex(53610);
            }

            C45175b() {
            }

            @Override // p4560f.p4561a.p4567d.AbstractC88433f
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.ecommerce.review.repo.ReviewApi$a$c */
        public static final class C45176c<T> implements AbstractC88433f {

            /* renamed from: a */
            public static final C45176c f105311a = new C45176c();

            static {
                Covode.recordClassIndex(53611);
            }

            C45176c() {
            }

            @Override // p4560f.p4561a.p4567d.AbstractC88433f
            public final void accept(Object obj) {
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.ecommerce.review.repo.ReviewApi$a$d */
        public static final class C45177d<T> implements AbstractC88433f {

            /* renamed from: a */
            public static final C45177d f105312a = new C45177d();

            static {
                Covode.recordClassIndex(53612);
            }

            C45177d() {
            }

            @Override // p4560f.p4561a.p4567d.AbstractC88433f
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        }

        private C45173a() {
        }

        static {
            Covode.recordClassIndex(53608);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.review.repo.ReviewApi$c */
    public static final class C45179c {
        @AbstractC27891c(mo46611a = "product_id")

        /* renamed from: a */
        public final String f105314a;
        @AbstractC27891c(mo46611a = "filter_id")

        /* renamed from: b */
        public final String f105315b;
        @AbstractC27891c(mo46611a = "size")

        /* renamed from: c */
        public final int f105316c = 10;
        @AbstractC27891c(mo46611a = "cursor")

        /* renamed from: d */
        public final int f105317d;
        @AbstractC27891c(mo46611a = "need_filter")

        /* renamed from: e */
        public final boolean f105318e;

        static {
            Covode.recordClassIndex(53614);
        }

        public final int hashCode() {
            int i;
            int hashCode = this.f105314a.hashCode() * 31;
            String str = this.f105315b;
            if (str != null) {
                i = str.hashCode();
            } else {
                i = 0;
            }
            return ((((hashCode + i) * 31) + this.f105316c) * 31) + this.f105317d;
        }

        public final boolean equals(Object obj) {
            Class<?> cls;
            if (this == obj) {
                return true;
            }
            Class<?> cls2 = getClass();
            if (obj != null) {
                cls = obj.getClass();
            } else {
                cls = null;
            }
            if (!C89219l.m154714a(cls2, cls)) {
                return false;
            }
            Objects.requireNonNull(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ecommerce.review.repo.ReviewApi.ReviewRequest");
            C45179c cVar = (C45179c) obj;
            if (!(!C89219l.m154714a((Object) this.f105314a, (Object) cVar.f105314a)) && !(!C89219l.m154714a((Object) this.f105315b, (Object) cVar.f105315b)) && this.f105316c == cVar.f105316c && this.f105317d == cVar.f105317d) {
                return true;
            }
            return false;
        }

        public C45179c(String str, String str2, int i, boolean z) {
            C89219l.m154721d(str, "");
            this.f105314a = str;
            this.f105315b = str2;
            this.f105317d = i;
            this.f105318e = z;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.review.repo.ReviewApi$b */
    public static final class C45178b {
        @AbstractC27891c(mo46611a = "main_review_id")

        /* renamed from: a */
        public final String f105313a;

        static {
            Covode.recordClassIndex(53613);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof C45178b) && C89219l.m154714a(this.f105313a, ((C45178b) obj).f105313a);
            }
            return true;
        }

        public final int hashCode() {
            String str = this.f105313a;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public final String toString() {
            return "ReviewDiggRequest(reviewId=" + this.f105313a + ")";
        }

        public C45178b(String str) {
            C89219l.m154721d(str, "");
            this.f105313a = str;
        }
    }
}
