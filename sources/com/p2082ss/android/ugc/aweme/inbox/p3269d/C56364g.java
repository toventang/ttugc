package com.p2082ss.android.ugc.aweme.inbox.p3269d;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import java.util.concurrent.Callable;
import org.json.JSONObject;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.ss.android.ugc.aweme.inbox.d.g */
public final class C56364g {

    /* renamed from: a */
    public static volatile C56365a f128566a;

    /* renamed from: b */
    public static String f128567b;

    /* renamed from: c */
    public static final C56364g f128568c = new C56364g();

    private C56364g() {
    }

    /* renamed from: a */
    public static void m102348a() {
        m102349a(C56371g.f128586a);
    }

    /* renamed from: b */
    public static void m102350b() {
        m102349a(C56373i.f128588a);
    }

    /* renamed from: c */
    public static void m102351c() {
        m102349a(C56366b.f128581a);
    }

    static {
        Covode.recordClassIndex(66184);
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.d.g$a */
    public static final class C56365a {

        /* renamed from: a */
        public long f128569a;

        /* renamed from: b */
        public long f128570b;

        /* renamed from: c */
        public C56342b f128571c;

        /* renamed from: d */
        public long f128572d;

        /* renamed from: e */
        public long f128573e;

        /* renamed from: f */
        public long f128574f;

        /* renamed from: g */
        public long f128575g;

        /* renamed from: h */
        public long f128576h;

        /* renamed from: i */
        public long f128577i;

        /* renamed from: j */
        public long f128578j;

        /* renamed from: k */
        public long f128579k;

        /* renamed from: l */
        public long f128580l;

        static {
            Covode.recordClassIndex(66185);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C56365a)) {
                return false;
            }
            C56365a aVar = (C56365a) obj;
            return this.f128569a == aVar.f128569a && this.f128570b == aVar.f128570b && C89219l.m154714a(this.f128571c, aVar.f128571c) && this.f128572d == aVar.f128572d && this.f128573e == aVar.f128573e && this.f128574f == aVar.f128574f && this.f128575g == aVar.f128575g && this.f128576h == aVar.f128576h && this.f128577i == aVar.f128577i && this.f128578j == aVar.f128578j && this.f128579k == aVar.f128579k && this.f128580l == aVar.f128580l;
        }

        public final String toString() {
            return "MetaData(clickTs=" + this.f128569a + ", fragConstructorTs=" + this.f128570b + ", lifecycleTracker=" + this.f128571c + ", imReqTs=" + this.f128572d + ", imRespTs=" + this.f128573e + ", multiReqTs=" + this.f128574f + ", multiRespTs=" + this.f128575g + ", recommendReqTs=" + this.f128576h + ", recommendRespTs=" + this.f128577i + ", contactReqTs=" + this.f128578j + ", contactRespTs=" + this.f128579k + ", endTs=" + this.f128580l + ")";
        }

        public /* synthetic */ C56365a() {
            this(0, 0, new C56342b(), 0, 0, 0, 0, 0, 0, 0, 0, 0);
        }

        public final int hashCode() {
            int i;
            long j = this.f128569a;
            long j2 = this.f128570b;
            int i2 = ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            C56342b bVar = this.f128571c;
            if (bVar != null) {
                i = bVar.hashCode();
            } else {
                i = 0;
            }
            long j3 = this.f128572d;
            long j4 = this.f128573e;
            long j5 = this.f128574f;
            long j6 = this.f128575g;
            long j7 = this.f128576h;
            long j8 = this.f128577i;
            long j9 = this.f128578j;
            long j10 = this.f128579k;
            long j11 = this.f128580l;
            return ((((((((((((((((((i2 + i) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31) + ((int) (j6 ^ (j6 >>> 32)))) * 31) + ((int) (j7 ^ (j7 >>> 32)))) * 31) + ((int) (j8 ^ (j8 >>> 32)))) * 31) + ((int) (j9 ^ (j9 >>> 32)))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)));
        }

        public C56365a(long j, long j2, C56342b bVar, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11) {
            C89219l.m154721d(bVar, "");
            this.f128569a = j;
            this.f128570b = j2;
            this.f128571c = bVar;
            this.f128572d = j3;
            this.f128573e = j4;
            this.f128574f = j5;
            this.f128575g = j6;
            this.f128576h = j7;
            this.f128577i = j8;
            this.f128578j = j9;
            this.f128579k = j10;
            this.f128580l = j11;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.d.g$l */
    public static final class CallableC56376l<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ C56365a f128591a;

        static {
            Covode.recordClassIndex(66196);
        }

        public CallableC56376l(C56365a aVar) {
            this.f128591a = aVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            Throwable th;
            int i;
            if (C56359f.m102344a("inbox_enter_perf_v1", 1.0f)) {
                final C89233z.C89234a aVar = new C89233z.C89234a();
                aVar.element = false;
                C563771 r11 = new AbstractC89172b<Long, Long>() {
                    /* class com.p2082ss.android.ugc.aweme.inbox.p3269d.C56364g.CallableC56376l.C563771 */

                    static {
                        Covode.recordClassIndex(66197);
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // p4600h.p4611f.p4612a.AbstractC89172b
                    public final /* synthetic */ Long invoke(Long l) {
                        return Long.valueOf(mo93367a(l.longValue()));
                    }

                    /* renamed from: a */
                    public final long mo93367a(long j) {
                        if (j < 0 || j > 600000) {
                            aVar.element = true;
                        }
                        return j;
                    }
                };
                long a = r11.mo93367a(this.f128591a.f128580l - this.f128591a.f128569a);
                long a2 = r11.mo93367a(this.f128591a.f128570b - this.f128591a.f128569a);
                long a3 = r11.mo93367a(this.f128591a.f128573e - this.f128591a.f128572d);
                long a4 = r11.mo93367a(this.f128591a.f128575g - this.f128591a.f128574f);
                long a5 = r11.mo93367a(this.f128591a.f128577i - this.f128591a.f128576h);
                long a6 = r11.mo93367a(this.f128591a.f128579k - this.f128591a.f128578j);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("cost", a);
                    jSONObject.put("construct_cost", a2);
                    jSONObject.put("im_cost", a3);
                    jSONObject.put("multi_cost", a4);
                    jSONObject.put("recommend_cost", a5);
                    jSONObject.put("contact_cost", a6);
                    try {
                        this.f128591a.f128571c.mo93350a(jSONObject);
                        if (aVar.element) {
                            i = 1;
                        } else {
                            i = 0;
                        }
                        C89379q.m157068constructorimpl(jSONObject.put("invalid_metrics", i));
                    } catch (Throwable th2) {
                        th = th2;
                        C89379q.m157068constructorimpl(C89382r.m154941a(th));
                        C39162r.m79461a("inbox_enter_perf_v1", jSONObject);
                        return C89391z.f203057a;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    C89379q.m157068constructorimpl(C89382r.m154941a(th));
                    C39162r.m79461a("inbox_enter_perf_v1", jSONObject);
                    return C89391z.f203057a;
                }
                C39162r.m79461a("inbox_enter_perf_v1", jSONObject);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.d.g$d */
    public static final class C56368d extends AbstractC89220m implements AbstractC89172b<C56365a, C89391z> {

        /* renamed from: a */
        public static final C56368d f128583a = new C56368d();

        static {
            Covode.recordClassIndex(66188);
        }

        C56368d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C56365a aVar) {
            C56365a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            aVar2.f128570b = SystemClock.uptimeMillis();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.d.g$k */
    public static final class C56375k extends AbstractC89220m implements AbstractC89172b<C56365a, C89391z> {

        /* renamed from: a */
        public static final C56375k f128590a = new C56375k();

        static {
            Covode.recordClassIndex(66195);
        }

        C56375k() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C56365a aVar) {
            C56365a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            aVar2.f128569a = SystemClock.uptimeMillis();
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public static void m102349a(AbstractC89172b<? super C56365a, C89391z> bVar) {
        C56365a aVar = f128566a;
        if (aVar != null) {
            bVar.invoke(aVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.inbox.d.g$b */
    public static final class C56366b extends AbstractC89220m implements AbstractC89172b<C56365a, C89391z> {

        /* renamed from: a */
        public static final C56366b f128581a = new C56366b();

        static {
            Covode.recordClassIndex(66186);
        }

        C56366b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C56365a aVar) {
            C56365a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            if (aVar2.f128578j <= 0) {
                aVar2.f128578j = SystemClock.uptimeMillis();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.d.g$c */
    public static final class C56367c extends AbstractC89220m implements AbstractC89172b<C56365a, C89391z> {

        /* renamed from: a */
        public static final C56367c f128582a = new C56367c();

        static {
            Covode.recordClassIndex(66187);
        }

        C56367c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C56365a aVar) {
            C56365a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            if (aVar2.f128579k <= 0) {
                aVar2.f128579k = SystemClock.uptimeMillis();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.d.g$e */
    public static final class C56369e extends AbstractC89220m implements AbstractC89172b<C56365a, C89391z> {

        /* renamed from: a */
        public static final C56369e f128584a = new C56369e();

        static {
            Covode.recordClassIndex(66189);
        }

        C56369e() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C56365a aVar) {
            C56365a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            if (aVar2.f128572d <= 0) {
                aVar2.f128572d = SystemClock.uptimeMillis();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.d.g$f */
    public static final class C56370f extends AbstractC89220m implements AbstractC89172b<C56365a, C89391z> {

        /* renamed from: a */
        public static final C56370f f128585a = new C56370f();

        static {
            Covode.recordClassIndex(66190);
        }

        C56370f() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C56365a aVar) {
            C56365a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            if (aVar2.f128573e <= 0) {
                aVar2.f128573e = SystemClock.uptimeMillis();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.d.g$g */
    static final class C56371g extends AbstractC89220m implements AbstractC89172b<C56365a, C89391z> {

        /* renamed from: a */
        public static final C56371g f128586a = new C56371g();

        static {
            Covode.recordClassIndex(66191);
        }

        C56371g() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C56365a aVar) {
            C56365a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            if (aVar2.f128574f <= 0) {
                aVar2.f128574f = SystemClock.uptimeMillis();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.d.g$h */
    public static final class C56372h extends AbstractC89220m implements AbstractC89172b<C56365a, C89391z> {

        /* renamed from: a */
        public static final C56372h f128587a = new C56372h();

        static {
            Covode.recordClassIndex(66192);
        }

        C56372h() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C56365a aVar) {
            C56365a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            if (aVar2.f128575g <= 0) {
                aVar2.f128575g = SystemClock.uptimeMillis();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.d.g$i */
    static final class C56373i extends AbstractC89220m implements AbstractC89172b<C56365a, C89391z> {

        /* renamed from: a */
        public static final C56373i f128588a = new C56373i();

        static {
            Covode.recordClassIndex(66193);
        }

        C56373i() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C56365a aVar) {
            C56365a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            if (aVar2.f128576h <= 0) {
                aVar2.f128576h = SystemClock.uptimeMillis();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.d.g$j */
    public static final class C56374j extends AbstractC89220m implements AbstractC89172b<C56365a, C89391z> {

        /* renamed from: a */
        public static final C56374j f128589a = new C56374j();

        static {
            Covode.recordClassIndex(66194);
        }

        C56374j() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C56365a aVar) {
            C56365a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            if (aVar2.f128577i <= 0) {
                aVar2.f128577i = SystemClock.uptimeMillis();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public static <T> T m102347a(EnumC56341a aVar, AbstractC89171a<? extends T> aVar2) {
        T t;
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(aVar2, "");
        C56365a aVar3 = f128566a;
        return (aVar3 == null || (t = (T) aVar3.f128571c.mo93349a(aVar, aVar2)) == null) ? (T) aVar2.invoke() : t;
    }
}
