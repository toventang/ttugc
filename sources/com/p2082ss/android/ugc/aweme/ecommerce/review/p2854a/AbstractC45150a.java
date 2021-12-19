package com.p2082ss.android.ugc.aweme.ecommerce.review.p2854a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.ecommerce.review.repo.dto.ReviewFilterStruct;
import com.p2082ss.android.ugc.aweme.ecommerce.review.repo.dto.ReviewItemStruct;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.review.a.a */
public abstract class AbstractC45150a {
    static {
        Covode.recordClassIndex(53584);
    }

    private AbstractC45150a() {
    }

    public /* synthetic */ AbstractC45150a(byte b) {
        this();
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.review.a.a$a */
    public static final class C45151a extends AbstractC45150a {

        /* renamed from: a */
        public final ReviewItemStruct f105247a;

        /* renamed from: b */
        public final boolean f105248b;

        /* renamed from: c */
        public final boolean f105249c;

        /* renamed from: d */
        public final boolean f105250d;

        /* renamed from: e */
        public final boolean f105251e;

        /* renamed from: f */
        public boolean f105252f;

        static {
            Covode.recordClassIndex(53585);
        }

        /* renamed from: a */
        public static /* synthetic */ C45151a m87780a(C45151a aVar, ReviewItemStruct reviewItemStruct, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i) {
            boolean z6 = z5;
            boolean z7 = z4;
            ReviewItemStruct reviewItemStruct2 = reviewItemStruct;
            boolean z8 = z;
            boolean z9 = z2;
            boolean z10 = z3;
            if ((i & 1) != 0) {
                reviewItemStruct2 = aVar.f105247a;
            }
            if ((i & 2) != 0) {
                z8 = aVar.f105248b;
            }
            if ((i & 4) != 0) {
                z9 = aVar.f105249c;
            }
            if ((i & 8) != 0) {
                z10 = aVar.f105250d;
            }
            if ((i & 16) != 0) {
                z7 = aVar.f105251e;
            }
            if ((i & 32) != 0) {
                z6 = aVar.f105252f;
            }
            return m87781a(reviewItemStruct2, z8, z9, z10, z7, z6);
        }

        /* renamed from: a */
        private static C45151a m87781a(ReviewItemStruct reviewItemStruct, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
            C89219l.m154721d(reviewItemStruct, "");
            return new C45151a(reviewItemStruct, z, z2, z3, z4, z5);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C45151a)) {
                return false;
            }
            C45151a aVar = (C45151a) obj;
            return C89219l.m154714a(this.f105247a, aVar.f105247a) && this.f105248b == aVar.f105248b && this.f105249c == aVar.f105249c && this.f105250d == aVar.f105250d && this.f105251e == aVar.f105251e && this.f105252f == aVar.f105252f;
        }

        public final int hashCode() {
            ReviewItemStruct reviewItemStruct = this.f105247a;
            int hashCode = (reviewItemStruct != null ? reviewItemStruct.hashCode() : 0) * 31;
            boolean z = this.f105248b;
            int i = 1;
            if (z) {
                z = true;
            }
            int i2 = z ? 1 : 0;
            int i3 = z ? 1 : 0;
            int i4 = z ? 1 : 0;
            int i5 = (hashCode + i2) * 31;
            boolean z2 = this.f105249c;
            if (z2) {
                z2 = true;
            }
            int i6 = z2 ? 1 : 0;
            int i7 = z2 ? 1 : 0;
            int i8 = z2 ? 1 : 0;
            int i9 = (i5 + i6) * 31;
            boolean z3 = this.f105250d;
            if (z3) {
                z3 = true;
            }
            int i10 = z3 ? 1 : 0;
            int i11 = z3 ? 1 : 0;
            int i12 = z3 ? 1 : 0;
            int i13 = (i9 + i10) * 31;
            boolean z4 = this.f105251e;
            if (z4) {
                z4 = true;
            }
            int i14 = z4 ? 1 : 0;
            int i15 = z4 ? 1 : 0;
            int i16 = z4 ? 1 : 0;
            int i17 = (i13 + i14) * 31;
            if (!this.f105252f) {
                i = 0;
            }
            return i17 + i;
        }

        public final String toString() {
            return "ReviewCellVO(struct=" + this.f105247a + ", mainReviewExpand=" + this.f105248b + ", appendReviewExpand=" + this.f105249c + ", sellerFistReplyExpand=" + this.f105250d + ", sellerAppendReplyExpand=" + this.f105251e + ", showDivider=" + this.f105252f + ")";
        }

        public /* synthetic */ C45151a(ReviewItemStruct reviewItemStruct) {
            this(reviewItemStruct, false, false, false, false, true);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        private C45151a(ReviewItemStruct reviewItemStruct, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
            super((byte) 0);
            C89219l.m154721d(reviewItemStruct, "");
            this.f105247a = reviewItemStruct;
            this.f105248b = z;
            this.f105249c = z2;
            this.f105250d = z3;
            this.f105251e = z4;
            this.f105252f = z5;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.review.a.a$b */
    public static final class C45152b {

        /* renamed from: a */
        public final List<ReviewFilterStruct> f105253a;

        static {
            Covode.recordClassIndex(53586);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof C45152b) && C89219l.m154714a(this.f105253a, ((C45152b) obj).f105253a);
            }
            return true;
        }

        public final int hashCode() {
            List<ReviewFilterStruct> list = this.f105253a;
            if (list != null) {
                return list.hashCode();
            }
            return 0;
        }

        public final String toString() {
            return "ReviewFilterVO(filters=" + this.f105253a + ")";
        }

        public C45152b(List<ReviewFilterStruct> list) {
            C89219l.m154721d(list, "");
            this.f105253a = list;
        }
    }
}
