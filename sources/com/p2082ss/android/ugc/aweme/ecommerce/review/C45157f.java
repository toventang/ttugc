package com.p2082ss.android.ugc.aweme.ecommerce.review;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.p2082ss.android.ugc.aweme.ecommerce.api.model.Image;
import com.p2082ss.android.ugc.aweme.ecommerce.review.repo.dto.ReviewFilterStruct;
import com.p2082ss.android.ugc.aweme.ecommerce.review.repo.dto.ReviewItemStruct;
import com.p2082ss.android.ugc.aweme.ecommerce.track.C45544c;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89188r;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.review.f */
public final class C45157f {

    /* renamed from: k */
    public static final C45158a f105258k = new C45158a((byte) 0);

    /* renamed from: a */
    public float f105259a;

    /* renamed from: b */
    public int f105260b;

    /* renamed from: c */
    public String f105261c = "";

    /* renamed from: d */
    public String f105262d = "return";

    /* renamed from: e */
    public C45159b f105263e;

    /* renamed from: f */
    public final Set<String> f105264f = new LinkedHashSet();

    /* renamed from: g */
    public long f105265g = SystemClock.elapsedRealtime();

    /* renamed from: h */
    public final HashSet<String> f105266h = new HashSet<>();

    /* renamed from: i */
    public boolean f105267i;

    /* renamed from: j */
    public final Context f105268j;

    static {
        Covode.recordClassIndex(53591);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.review.f$a */
    public static final class C45158a {
        static {
            Covode.recordClassIndex(53592);
        }

        private C45158a() {
        }

        public /* synthetic */ C45158a(byte b) {
            this();
        }

        /* renamed from: a */
        public static void m87786a(C45544c.C45545a aVar, ReviewItemStruct reviewItemStruct, C45159b bVar) {
            int i;
            String str;
            int i2;
            String str2;
            long j;
            int i3;
            C89219l.m154721d(aVar, "");
            C89219l.m154721d(reviewItemStruct, "");
            int i4 = 1;
            aVar.mo76752b("is_self", Integer.valueOf(C89219l.m154714a(reviewItemStruct.f105345f, true) ? 1 : 0));
            List<Image> list = reviewItemStruct.f105340a.f105356d;
            if (list != null) {
                i = list.size();
            } else {
                i = 0;
            }
            aVar.mo76752b("photo_cnt", Integer.valueOf(i));
            aVar.mo76752b("rate", reviewItemStruct.f105340a.f105354b);
            if (reviewItemStruct.f105340a.f105360h) {
                str = UGCMonitor.EVENT_COMMENT;
            } else {
                str = "default";
            }
            aVar.mo76752b("text_type", str);
            Integer num = reviewItemStruct.f105343d;
            if (num != null) {
                i2 = num.intValue();
            } else {
                i2 = 0;
            }
            aVar.mo76752b("like_cnt", Integer.valueOf(i2));
            aVar.mo76752b("sku_id", reviewItemStruct.f105342c);
            aVar.mo76752b("review_id", reviewItemStruct.f105340a.f105353a);
            ReviewItemStruct.User user = reviewItemStruct.f105346g;
            if (user == null || (str2 = user.f105361a) == null) {
                str2 = "";
            }
            aVar.mo76752b("review_author_id", str2);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd", Locale.getDefault());
            Calendar instance = Calendar.getInstance();
            C89219l.m154716b(instance, "");
            Long g = C89361p.m154865g(reviewItemStruct.f105340a.f105357e);
            if (g != null) {
                j = g.longValue();
            } else {
                j = 0;
            }
            instance.setTimeInMillis(j);
            C89219l.m154716b(instance, "");
            String format = simpleDateFormat.format(instance.getTime());
            C89219l.m154716b(format, "");
            aVar.mo76752b("post_date", format);
            aVar.mo76752b("is_anonymous", Integer.valueOf(C89219l.m154714a(reviewItemStruct.f105348i, true) ? 1 : 0));
            if (bVar != null) {
                aVar.mo76752b("filter_name", bVar.f105270b);
                aVar.mo76752b("filter_id", bVar.f105271c);
            }
            if (reviewItemStruct.f105340a.f105359g != null) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            ReviewItemStruct.AppendReview appendReview = reviewItemStruct.f105340a.f105358f;
            if (!(appendReview == null || appendReview.f105352d == null)) {
                i3++;
            }
            aVar.mo76752b("reply_cnt", Integer.valueOf(i3));
            if (reviewItemStruct.f105340a.f105358f == null) {
                i4 = 0;
            }
            aVar.mo76752b("has_add_review", Integer.valueOf(i4));
            aVar.mo76752b("is_anonymous", Integer.valueOf(C89219l.m154714a(reviewItemStruct.f105348i, true) ? 1 : 0));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.review.f$c */
    static final class C45160c extends AbstractC89220m implements AbstractC89172b<C45544c.C45545a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ String f105272a;

        static {
            Covode.recordClassIndex(53594);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45160c(String str) {
            super(1);
            this.f105272a = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C45544c.C45545a aVar) {
            C45544c.C45545a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            aVar2.mo76752b("button_name", this.f105272a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.review.f$d */
    static final class C45161d extends AbstractC89220m implements AbstractC89172b<C45544c.C45545a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C45157f f105273a;

        /* renamed from: b */
        final /* synthetic */ ReviewItemStruct f105274b;

        static {
            Covode.recordClassIndex(53595);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45161d(C45157f fVar, ReviewItemStruct reviewItemStruct) {
            super(1);
            this.f105273a = fVar;
            this.f105274b = reviewItemStruct;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C45544c.C45545a aVar) {
            C45544c.C45545a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            C45158a.m87786a(aVar2, this.f105274b, this.f105273a.f105263e);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.review.f$e */
    static final class C45162e extends AbstractC89220m implements AbstractC89172b<C45544c.C45545a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C45157f f105275a;

        static {
            Covode.recordClassIndex(53596);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45162e(C45157f fVar) {
            super(1);
            this.f105275a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C45544c.C45545a aVar) {
            C45544c.C45545a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            aVar2.mo76752b("review_cnt", Integer.valueOf(this.f105275a.f105260b));
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.review.f$j */
    static final class C45168j extends AbstractC89220m implements AbstractC89172b<C45544c.C45545a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C45157f f105295a;

        /* renamed from: b */
        final /* synthetic */ ReviewItemStruct f105296b;

        /* renamed from: c */
        final /* synthetic */ String f105297c;

        static {
            Covode.recordClassIndex(53602);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45168j(C45157f fVar, ReviewItemStruct reviewItemStruct, String str) {
            super(1);
            this.f105295a = fVar;
            this.f105296b = reviewItemStruct;
            this.f105297c = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C45544c.C45545a aVar) {
            C45544c.C45545a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            C45158a.m87786a(aVar2, this.f105296b, this.f105295a.f105263e);
            aVar2.mo76752b("button_for", this.f105297c);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.review.f$k */
    static final class C45169k extends AbstractC89220m implements AbstractC89172b<C45544c.C45545a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C45157f f105298a;

        /* renamed from: b */
        final /* synthetic */ ReviewItemStruct f105299b;

        static {
            Covode.recordClassIndex(53603);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45169k(C45157f fVar, ReviewItemStruct reviewItemStruct) {
            super(1);
            this.f105298a = fVar;
            this.f105299b = reviewItemStruct;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C45544c.C45545a aVar) {
            C45544c.C45545a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            C45158a.m87786a(aVar2, this.f105299b, this.f105298a.f105263e);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.review.f$l */
    public static final class C45170l extends AbstractC89220m implements AbstractC89172b<C45544c.C45545a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C45157f f105300a;

        /* renamed from: b */
        final /* synthetic */ ReviewItemStruct f105301b;

        static {
            Covode.recordClassIndex(53604);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C45170l(C45157f fVar, ReviewItemStruct reviewItemStruct) {
            super(1);
            this.f105300a = fVar;
            this.f105301b = reviewItemStruct;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C45544c.C45545a aVar) {
            C45544c.C45545a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            C45158a.m87786a(aVar2, this.f105301b, this.f105300a.f105263e);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.review.f$f */
    static final class C45163f extends AbstractC89220m implements AbstractC89172b<C45544c.C45545a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C45157f f105276a;

        /* renamed from: b */
        final /* synthetic */ C45159b f105277b;

        static {
            Covode.recordClassIndex(53597);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45163f(C45157f fVar, C45159b bVar) {
            super(1);
            this.f105276a = fVar;
            this.f105277b = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C45544c.C45545a aVar) {
            C45544c.C45545a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            aVar2.mo76752b("product_id", this.f105276a.f105261c);
            aVar2.mo76752b("filter_name", this.f105277b.f105270b);
            aVar2.mo76752b("filter_id", this.f105277b.f105271c);
            aVar2.mo76752b("rank", Integer.valueOf(this.f105277b.f105269a));
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.review.f$g */
    static final class C45164g extends AbstractC89220m implements AbstractC89172b<C45544c.C45545a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C45157f f105278a;

        /* renamed from: b */
        final /* synthetic */ ReviewFilterStruct f105279b;

        /* renamed from: c */
        final /* synthetic */ int f105280c;

        static {
            Covode.recordClassIndex(53598);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45164g(C45157f fVar, ReviewFilterStruct reviewFilterStruct, int i) {
            super(1);
            this.f105278a = fVar;
            this.f105279b = reviewFilterStruct;
            this.f105280c = i;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C45544c.C45545a aVar) {
            String str;
            String str2;
            C45544c.C45545a aVar2 = aVar;
            String str3 = "";
            C89219l.m154721d(aVar2, str3);
            aVar2.mo76752b("product_id", this.f105278a.f105261c);
            ReviewFilterStruct reviewFilterStruct = this.f105279b;
            if (reviewFilterStruct == null || (str = reviewFilterStruct.f105337b) == null) {
                str = str3;
            }
            aVar2.mo76752b("filter_name", str);
            ReviewFilterStruct reviewFilterStruct2 = this.f105279b;
            if (!(reviewFilterStruct2 == null || (str2 = reviewFilterStruct2.f105336a) == null)) {
                str3 = str2;
            }
            aVar2.mo76752b("filter_id", str3);
            aVar2.mo76752b("rank", Integer.valueOf(this.f105280c));
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.review.f$m */
    public static final class C45171m extends AbstractC89220m implements AbstractC89172b<C45544c.C45545a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C45157f f105302a;

        /* renamed from: b */
        final /* synthetic */ int f105303b;

        /* renamed from: c */
        final /* synthetic */ ReviewItemStruct f105304c;

        static {
            Covode.recordClassIndex(53605);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C45171m(C45157f fVar, int i, ReviewItemStruct reviewItemStruct) {
            super(1);
            this.f105302a = fVar;
            this.f105303b = i;
            this.f105304c = reviewItemStruct;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C45544c.C45545a aVar) {
            C45544c.C45545a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            aVar2.mo76752b("review_cnt", Integer.valueOf(this.f105302a.f105260b));
            aVar2.mo76752b("rank", Integer.valueOf(this.f105303b));
            C45158a.m87786a(aVar2, this.f105304c, this.f105302a.f105263e);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.review.f$n */
    static final class C45172n extends AbstractC89220m implements AbstractC89172b<C45544c.C45545a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C45157f f105305a;

        static {
            Covode.recordClassIndex(53606);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45172n(C45157f fVar) {
            super(1);
            this.f105305a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C45544c.C45545a aVar) {
            C45544c.C45545a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            aVar2.mo76752b("review_cnt", Integer.valueOf(this.f105305a.f105260b));
            aVar2.mo76752b("stay_time", Long.valueOf(SystemClock.elapsedRealtime() - this.f105305a.f105265g));
            aVar2.mo76752b("quit_type", this.f105305a.f105262d);
            aVar2.mo76752b("is_load_data", Integer.valueOf(this.f105305a.f105267i ? 1 : 0));
            return C89391z.f203057a;
        }
    }

    public C45157f(Context context) {
        C89219l.m154721d(context, "");
        this.f105268j = context;
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.review.f$h */
    public static final class C45165h extends AbstractC89220m implements AbstractC89172b<C45544c.C45545a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C45157f f105281a;

        /* renamed from: b */
        final /* synthetic */ String f105282b;

        /* renamed from: c */
        final /* synthetic */ String f105283c;

        /* renamed from: d */
        final /* synthetic */ String f105284d;

        /* renamed from: e */
        final /* synthetic */ String f105285e;

        /* renamed from: f */
        final /* synthetic */ String f105286f;

        /* renamed from: g */
        final /* synthetic */ boolean f105287g;

        static {
            Covode.recordClassIndex(53599);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C45165h(C45157f fVar, String str, String str2, String str3, String str4, String str5, boolean z) {
            super(1);
            this.f105281a = fVar;
            this.f105282b = str;
            this.f105283c = str2;
            this.f105284d = str3;
            this.f105285e = str4;
            this.f105286f = str5;
            this.f105287g = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C45544c.C45545a aVar) {
            C45544c.C45545a aVar2 = aVar;
            String str = "";
            C89219l.m154721d(aVar2, str);
            aVar2.mo76752b("photo_id", this.f105282b);
            aVar2.mo76752b("rank", this.f105283c);
            aVar2.mo76752b("product_id", this.f105281a.f105261c);
            Object obj = this.f105284d;
            if (obj == null) {
                obj = str;
            }
            aVar2.mo76752b("sku_id", obj);
            String str2 = this.f105285e;
            if (str2 != null) {
                str = str2;
            }
            aVar2.mo76752b("review_author_id", str);
            aVar2.mo76752b("review_id", this.f105286f);
            aVar2.mo76752b("is_self", Integer.valueOf(this.f105287g ? 1 : 0));
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final void mo76231a(ReviewItemStruct reviewItemStruct, String str) {
        C89219l.m154721d(reviewItemStruct, "");
        C89219l.m154721d(str, "");
        C45544c.m88080a(this.f105268j, "tiktokec_report_entrance_click", new C45168j(this, reviewItemStruct, str));
        if (!C89219l.m154714a((Object) str, (Object) "cancel")) {
            C45544c.m88080a(this.f105268j, "tiktokec_denounce_review", new C45169k(this, reviewItemStruct));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.review.f$b */
    public static final class C45159b {

        /* renamed from: a */
        public final int f105269a;

        /* renamed from: b */
        public final String f105270b;

        /* renamed from: c */
        public final String f105271c;

        static {
            Covode.recordClassIndex(53593);
        }

        public C45159b(int i, String str, String str2) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            this.f105269a = i;
            this.f105270b = str;
            this.f105271c = str2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.review.f$i */
    public static final class C45166i extends AbstractC89220m implements AbstractC89188r<ReviewItemStruct.MainReview, String, String, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C45157f f105288a;

        /* renamed from: b */
        final /* synthetic */ ReviewItemStruct f105289b;

        static {
            Covode.recordClassIndex(53600);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C45166i(C45157f fVar, ReviewItemStruct reviewItemStruct) {
            super(4);
            this.f105288a = fVar;
            this.f105289b = reviewItemStruct;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89188r
        /* renamed from: a */
        public final /* synthetic */ C89391z mo8774a(ReviewItemStruct.MainReview mainReview, String str, String str2, Boolean bool) {
            mo76232a(mainReview, str, str2, bool.booleanValue());
            return C89391z.f203057a;
        }

        /* renamed from: a */
        public final void mo76232a(final ReviewItemStruct.MainReview mainReview, final String str, final String str2, final boolean z) {
            C89219l.m154721d(mainReview, "");
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            if (!this.f105288a.f105266h.contains(str)) {
                this.f105288a.f105266h.add(str);
                C45544c.m88080a(this.f105288a.f105268j, "tiktokec_photo_show", new AbstractC89172b<C45544c.C45545a, C89391z>(this) {
                    /* class com.p2082ss.android.ugc.aweme.ecommerce.review.C45157f.C45166i.C451671 */

                    /* renamed from: a */
                    final /* synthetic */ C45166i f105290a;

                    static {
                        Covode.recordClassIndex(53601);
                    }

                    {
                        this.f105290a = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // p4600h.p4611f.p4612a.AbstractC89172b
                    public final /* synthetic */ C89391z invoke(C45544c.C45545a aVar) {
                        String str;
                        C45544c.C45545a aVar2 = aVar;
                        String str2 = "";
                        C89219l.m154721d(aVar2, str2);
                        aVar2.mo76752b("photo_id", str);
                        aVar2.mo76752b("rank", str2);
                        aVar2.mo76752b("review_id", mainReview.f105353a);
                        aVar2.mo76752b("sku_id", this.f105290a.f105289b.f105342c);
                        ReviewItemStruct.User user = this.f105290a.f105289b.f105346g;
                        if (!(user == null || (str = user.f105361a) == null)) {
                            str2 = str;
                        }
                        aVar2.mo76752b("review_author_id", str2);
                        aVar2.mo76752b("is_self", Integer.valueOf(z ? 1 : 0));
                        return C89391z.f203057a;
                    }
                });
            }
        }
    }
}
