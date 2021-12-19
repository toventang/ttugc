package com.p2082ss.android.ugc.aweme.inbox.p3269d;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.framework.services.IUserService;
import com.p2082ss.android.ugc.aweme.inbox.p3267b.C56318b;
import com.p2082ss.android.ugc.aweme.notice.api.p3509ab.C61536a;
import com.p2082ss.android.ugc.aweme.notice.api.services.C61611b;
import com.p2082ss.android.ugc.aweme.services.BaseUserService;
import java.util.concurrent.Callable;
import org.json.JSONObject;
import p077b.C1731i;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.ss.android.ugc.aweme.inbox.d.e */
public final class C56346e {

    /* renamed from: a */
    public static final C56346e f128534a = new C56346e();

    /* renamed from: b */
    private static volatile C56347a f128535b;

    /* renamed from: c */
    private static String f128536c;

    private C56346e() {
    }

    /* renamed from: b */
    public static void m102336b() {
        m102335a(C56350d.f128547a);
    }

    /* renamed from: c */
    public static void m102338c() {
        m102335a(C56353g.f128550a);
    }

    /* renamed from: d */
    public static void m102339d() {
        m102335a(C56348b.f128545a);
    }

    static {
        Covode.recordClassIndex(66166);
    }

    /* renamed from: f */
    public static void m102341f() {
        m102335a(C56355i.f128552a);
        m102340e();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.inbox.d.e$a */
    public static final class C56347a {

        /* renamed from: a */
        public long f128537a;

        /* renamed from: b */
        public long f128538b;

        /* renamed from: c */
        public C56342b f128539c;

        /* renamed from: d */
        public long f128540d;

        /* renamed from: e */
        public long f128541e;

        /* renamed from: f */
        public C56396l<Integer> f128542f;

        /* renamed from: g */
        public long f128543g;

        /* renamed from: h */
        public long f128544h;

        static {
            Covode.recordClassIndex(66167);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C56347a)) {
                return false;
            }
            C56347a aVar = (C56347a) obj;
            return this.f128537a == aVar.f128537a && this.f128538b == aVar.f128538b && C89219l.m154714a(this.f128539c, aVar.f128539c) && this.f128540d == aVar.f128540d && this.f128541e == aVar.f128541e && C89219l.m154714a(this.f128542f, aVar.f128542f) && this.f128543g == aVar.f128543g && this.f128544h == aVar.f128544h;
        }

        public final String toString() {
            return "MetaData(clickTs=" + this.f128537a + ", fragConstructorTs=" + this.f128538b + ", lifecycleTracker=" + this.f128539c + ", noticeReqTs=" + this.f128540d + ", noticeRespTs=" + this.f128541e + ", noticeResp=" + this.f128542f + ", adapterSetDataTs=" + this.f128543g + ", renderedTs=" + this.f128544h + ")";
        }

        public /* synthetic */ C56347a() {
            this(0, 0, new C56342b(), 0, 0, null, 0, 0);
        }

        public final int hashCode() {
            int i;
            long j = this.f128537a;
            long j2 = this.f128538b;
            int i2 = ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            C56342b bVar = this.f128539c;
            int i3 = 0;
            if (bVar != null) {
                i = bVar.hashCode();
            } else {
                i = 0;
            }
            long j3 = this.f128540d;
            long j4 = this.f128541e;
            int i4 = (((((i2 + i) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31;
            C56396l<Integer> lVar = this.f128542f;
            if (lVar != null) {
                i3 = lVar.hashCode();
            }
            long j5 = this.f128543g;
            long j6 = this.f128544h;
            return ((((i4 + i3) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31) + ((int) (j6 ^ (j6 >>> 32)));
        }

        public C56347a(long j, long j2, C56342b bVar, long j3, long j4, C56396l<Integer> lVar, long j5, long j6) {
            C89219l.m154721d(bVar, "");
            this.f128537a = j;
            this.f128538b = j2;
            this.f128539c = bVar;
            this.f128540d = j3;
            this.f128541e = j4;
            this.f128542f = lVar;
            this.f128543g = j5;
            this.f128544h = j6;
        }
    }

    /* renamed from: a */
    public static void m102333a() {
        if (C56359f.m102344a("inbox_enter_perf", 1.0f)) {
            IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
            C89219l.m154716b(createIUserServicebyMonsterPlugin, "");
            String currentUserID = createIUserServicebyMonsterPlugin.getCurrentUserID();
            if (currentUserID != null && currentUserID.length() != 0 && !C89219l.m154714a((Object) f128536c, (Object) currentUserID)) {
                f128536c = currentUserID;
                f128535b = new C56347a();
                m102335a(C56349c.f128546a);
            }
        }
    }

    /* renamed from: e */
    public static void m102340e() {
        if (f128535b != null) {
            C56347a aVar = f128535b;
            if (aVar == null) {
                C89219l.m154715b();
            }
            if (aVar.f128543g > 0) {
                C56347a aVar2 = f128535b;
                if (aVar2 != null) {
                    Long.valueOf(aVar2.f128543g);
                }
                C56347a aVar3 = f128535b;
                if (aVar3 == null) {
                    C89219l.m154715b();
                }
                aVar3.f128544h = SystemClock.uptimeMillis();
                C56347a aVar4 = f128535b;
                if (aVar4 == null) {
                    C89219l.m154715b();
                }
                long j = aVar4.f128537a;
                long j2 = aVar4.f128538b;
                C56342b bVar = aVar4.f128539c;
                long j3 = aVar4.f128540d;
                long j4 = aVar4.f128541e;
                C56396l<Integer> lVar = aVar4.f128542f;
                long j5 = aVar4.f128543g;
                long j6 = aVar4.f128544h;
                C89219l.m154721d(bVar, "");
                C1731i.m5640b(new CallableC56356j(new C56347a(j, j2, bVar, j3, j4, lVar, j5, j6)), C1731i.f5562a);
                f128535b = null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.inbox.d.e$j */
    public static final class CallableC56356j<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ C56347a f128553a;

        static {
            Covode.recordClassIndex(66176);
        }

        CallableC56356j(C56347a aVar) {
            this.f128553a = aVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            int i;
            if (C56359f.m102344a("inbox_enter_perf", 1.0f)) {
                final C89233z.C89234a aVar = new C89233z.C89234a();
                int i2 = 0;
                aVar.element = false;
                C563571 r10 = new AbstractC89172b<Long, Long>() {
                    /* class com.p2082ss.android.ugc.aweme.inbox.p3269d.C56346e.CallableC56356j.C563571 */

                    static {
                        Covode.recordClassIndex(66177);
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // p4600h.p4611f.p4612a.AbstractC89172b
                    public final /* synthetic */ Long invoke(Long l) {
                        return Long.valueOf(mo93356a(l.longValue()));
                    }

                    /* renamed from: a */
                    public final long mo93356a(long j) {
                        if (j < 0 || j > 600000) {
                            aVar.element = true;
                        }
                        return j;
                    }
                };
                new AbstractC89172b<C56396l<T>, C56396l<T>>() {
                    /* class com.p2082ss.android.ugc.aweme.inbox.p3269d.C56346e.CallableC56356j.C563582 */

                    static {
                        Covode.recordClassIndex(66178);
                    }

                    @Override // p4600h.p4611f.p4612a.AbstractC89172b
                    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        if (obj == null) {
                            aVar.element = true;
                        }
                        return obj;
                    }
                };
                long a = r10.mo93356a(this.f128553a.f128538b - this.f128553a.f128537a);
                long a2 = r10.mo93356a(this.f128553a.f128544h - this.f128553a.f128537a);
                long a3 = r10.mo93356a(this.f128553a.f128544h - this.f128553a.f128543g);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("cost", a2);
                    jSONObject.put("construct_cost", a);
                    jSONObject.put("render_cost", a3);
                    this.f128553a.f128539c.mo93350a(jSONObject);
                    C56396l<Integer> lVar = this.f128553a.f128542f;
                    if (lVar != null) {
                        String str = "";
                        if (lVar.f128638b != null) {
                            jSONObject.put("api_notice_status", 1);
                            String message = lVar.f128638b.getMessage();
                            if (message == null) {
                                message = str;
                            }
                            jSONObject.put("api_notice_error", message);
                        } else {
                            jSONObject.put("api_notice_status", 0);
                        }
                        TYPE type = lVar.f128637a;
                        if (type != null) {
                            i = type.intValue();
                        } else {
                            i = 0;
                        }
                        jSONObject.put("api_notice_count", i);
                        String str2 = lVar.f128639c;
                        if (str2 != null) {
                            str = str2;
                        }
                        jSONObject.put("api_notice_log_id", str);
                    }
                    jSONObject.put("inbox_type", C56318b.m102310a());
                    jSONObject.put("refactor_type", C61536a.m111448a());
                    jSONObject.put("perf_level", C61611b.f139811a.mo99384e());
                    if (aVar.element) {
                        i2 = 1;
                    }
                    C89379q.m157068constructorimpl(jSONObject.put("invalid_metrics", i2));
                } catch (Throwable th) {
                    C89379q.m157068constructorimpl(C89382r.m154941a(th));
                }
                C39162r.m79461a("inbox_enter_perf", jSONObject);
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.inbox.d.e$g */
    public static final class C56353g extends AbstractC89220m implements AbstractC89172b<C56347a, C89391z> {

        /* renamed from: a */
        public static final C56353g f128550a = new C56353g();

        static {
            Covode.recordClassIndex(66173);
        }

        C56353g() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C56347a aVar) {
            C89219l.m154721d(aVar, "");
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.inbox.d.e$h */
    public static final class C56354h extends AbstractC89220m implements AbstractC89172b<C56347a, C89391z> {

        /* renamed from: a */
        public static final C56354h f128551a = new C56354h();

        static {
            Covode.recordClassIndex(66174);
        }

        C56354h() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C56347a aVar) {
            C89219l.m154721d(aVar, "");
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public static void m102335a(AbstractC89172b<? super C56347a, C89391z> bVar) {
        C56347a aVar = f128535b;
        if (aVar != null) {
            bVar.invoke(aVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.inbox.d.e$b */
    public static final class C56348b extends AbstractC89220m implements AbstractC89172b<C56347a, C89391z> {

        /* renamed from: a */
        public static final C56348b f128545a = new C56348b();

        static {
            Covode.recordClassIndex(66168);
        }

        C56348b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C56347a aVar) {
            C56347a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            aVar2.f128543g = SystemClock.uptimeMillis();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.d.e$c */
    static final class C56349c extends AbstractC89220m implements AbstractC89172b<C56347a, C89391z> {

        /* renamed from: a */
        public static final C56349c f128546a = new C56349c();

        static {
            Covode.recordClassIndex(66169);
        }

        C56349c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C56347a aVar) {
            C56347a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            aVar2.f128537a = SystemClock.uptimeMillis();
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.inbox.d.e$d */
    public static final class C56350d extends AbstractC89220m implements AbstractC89172b<C56347a, C89391z> {

        /* renamed from: a */
        public static final C56350d f128547a = new C56350d();

        static {
            Covode.recordClassIndex(66170);
        }

        C56350d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C56347a aVar) {
            C56347a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            aVar2.f128538b = SystemClock.uptimeMillis();
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.inbox.d.e$i */
    public static final class C56355i extends AbstractC89220m implements AbstractC89172b<C56347a, C89391z> {

        /* renamed from: a */
        public static final C56355i f128552a = new C56355i();

        static {
            Covode.recordClassIndex(66175);
        }

        C56355i() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C56347a aVar) {
            C56347a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            aVar2.f128543g = SystemClock.uptimeMillis();
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public static void m102334a(C56396l<Integer> lVar) {
        C89219l.m154721d(lVar, "");
        m102335a(new C56352f(lVar));
    }

    /* renamed from: b */
    public static void m102337b(C56396l<Integer> lVar) {
        C89219l.m154721d(lVar, "");
        m102335a(C56354h.f128551a);
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.d.e$e */
    public static final class C56351e extends AbstractC89220m implements AbstractC89172b<C56347a, C89391z> {

        /* renamed from: a */
        public static final C56351e f128548a = new C56351e();

        static {
            Covode.recordClassIndex(66171);
        }

        C56351e() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C56347a aVar) {
            C56347a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            if (aVar2.f128540d <= 0) {
                aVar2.f128540d = SystemClock.uptimeMillis();
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.inbox.d.e$f */
    public static final class C56352f extends AbstractC89220m implements AbstractC89172b<C56347a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C56396l f128549a;

        static {
            Covode.recordClassIndex(66172);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56352f(C56396l lVar) {
            super(1);
            this.f128549a = lVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C56347a aVar) {
            C56347a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            if (aVar2.f128541e <= 0) {
                aVar2.f128541e = SystemClock.uptimeMillis();
                aVar2.f128542f = this.f128549a;
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public static <T> T m102332a(EnumC56341a aVar, AbstractC89171a<? extends T> aVar2) {
        T t;
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(aVar2, "");
        C56347a aVar3 = f128535b;
        return (aVar3 == null || (t = (T) aVar3.f128539c.mo93349a(aVar, aVar2)) == null) ? (T) aVar2.invoke() : t;
    }
}
