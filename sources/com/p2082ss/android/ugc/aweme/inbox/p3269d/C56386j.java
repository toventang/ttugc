package com.p2082ss.android.ugc.aweme.inbox.p3269d;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import java.util.concurrent.Callable;
import org.json.JSONObject;
import p077b.C1731i;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.inbox.d.j */
public final class C56386j {

    /* renamed from: a */
    public static volatile C56388b f128613a;

    /* renamed from: b */
    public static final C56386j f128614b = new C56386j();

    /* renamed from: com.ss.android.ugc.aweme.inbox.d.j$a */
    public enum EnumC56387a {
        DETAIL_TYPE_LIKE_LIST("like_list"),
        DETAIL_TYPE_NOTIFICATION("notification"),
        DETAIL_TYPE_FOLLOW_REQUEST("follow_request"),
        DETAIL_TYPE_TRANSLATION_LIKE_LIST("translation_like_list");
        

        /* renamed from: b */
        private final String f128616b;

        public final String getTypeName() {
            return this.f128616b;
        }

        static {
            Covode.recordClassIndex(66207);
        }

        private EnumC56387a(String str) {
            this.f128616b = str;
        }
    }

    private C56386j() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.inbox.d.j$b */
    public static final class C56388b {

        /* renamed from: a */
        public String f128617a;

        /* renamed from: b */
        public int f128618b;

        /* renamed from: c */
        public int f128619c;

        /* renamed from: d */
        public String f128620d;

        /* renamed from: e */
        public String f128621e;

        /* renamed from: f */
        public long f128622f;

        /* renamed from: g */
        public long f128623g;

        /* renamed from: h */
        public int f128624h;

        /* renamed from: i */
        public long f128625i;

        /* renamed from: j */
        public long f128626j;

        static {
            Covode.recordClassIndex(66208);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C56388b)) {
                return false;
            }
            C56388b bVar = (C56388b) obj;
            return C89219l.m154714a(this.f128617a, bVar.f128617a) && this.f128618b == bVar.f128618b && this.f128619c == bVar.f128619c && C89219l.m154714a(this.f128620d, bVar.f128620d) && C89219l.m154714a(this.f128621e, bVar.f128621e) && this.f128622f == bVar.f128622f && this.f128623g == bVar.f128623g && this.f128624h == bVar.f128624h && this.f128625i == bVar.f128625i && this.f128626j == bVar.f128626j;
        }

        public final String toString() {
            return "MetaData(type=" + this.f128617a + ", diggType=" + this.f128618b + ", groupType=" + this.f128619c + ", nid=" + this.f128620d + ", logId=" + this.f128621e + ", clickTs=" + this.f128622f + ", requestTs=" + this.f128623g + ", apiState=" + this.f128624h + ", adapterSetDataTs=" + this.f128625i + ", renderedTs=" + this.f128626j + ")";
        }

        public /* synthetic */ C56388b() {
            this("", "", "");
        }

        public final int hashCode() {
            int i;
            int i2;
            String str = this.f128617a;
            int i3 = 0;
            if (str != null) {
                i = str.hashCode();
            } else {
                i = 0;
            }
            int i4 = ((((i * 31) + this.f128618b) * 31) + this.f128619c) * 31;
            String str2 = this.f128620d;
            if (str2 != null) {
                i2 = str2.hashCode();
            } else {
                i2 = 0;
            }
            int i5 = (i4 + i2) * 31;
            String str3 = this.f128621e;
            if (str3 != null) {
                i3 = str3.hashCode();
            }
            long j = this.f128622f;
            long j2 = this.f128623g;
            long j3 = this.f128625i;
            long j4 = this.f128626j;
            return ((((((((((i5 + i3) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.f128624h) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j4 ^ (j4 >>> 32)));
        }

        private C56388b(String str, String str2, String str3) {
            this.f128617a = str;
            this.f128618b = 0;
            this.f128619c = 0;
            this.f128620d = str2;
            this.f128621e = str3;
            this.f128622f = 0;
            this.f128623g = 0;
            this.f128624h = 0;
            this.f128625i = 0;
            this.f128626j = 0;
        }
    }

    /* renamed from: a */
    public static void m102359a() {
        m102363a(C56392f.f128632a);
    }

    /* renamed from: b */
    public static void m102364b() {
        m102363a(C56391e.f128631a);
    }

    static {
        Covode.recordClassIndex(66206);
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.d.j$h */
    static final class CallableC56394h<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ C56388b f128634a;

        static {
            Covode.recordClassIndex(66214);
        }

        CallableC56394h(C56388b bVar) {
            this.f128634a = bVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(StringSet.type, this.f128634a.f128617a);
                jSONObject.put("digg_type", this.f128634a.f128618b);
                jSONObject.put("group_type", this.f128634a.f128619c);
                jSONObject.put("nid", this.f128634a.f128620d);
                jSONObject.put("cost", this.f128634a.f128626j - this.f128634a.f128622f);
                jSONObject.put("api_cost", this.f128634a.f128625i - this.f128634a.f128623g);
                jSONObject.put("api_status", this.f128634a.f128624h);
                jSONObject.put("log_id", this.f128634a.f128621e);
                C89379q.m157068constructorimpl(jSONObject.put("render_cost", this.f128634a.f128626j - this.f128634a.f128625i));
            } catch (Throwable th) {
                C89379q.m157068constructorimpl(C89382r.m154941a(th));
            }
            C39162r.m79461a("notice_enter_detail_perf", jSONObject);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.inbox.d.j$f */
    public static final class C56392f extends AbstractC89220m implements AbstractC89172b<C56388b, C89391z> {

        /* renamed from: a */
        public static final C56392f f128632a = new C56392f();

        static {
            Covode.recordClassIndex(66212);
        }

        C56392f() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C56388b bVar) {
            C56388b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            bVar2.f128623g = SystemClock.uptimeMillis();
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public static void m102360a(int i) {
        m102363a(new C56389c(i));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.inbox.d.j$c */
    public static final class C56389c extends AbstractC89220m implements AbstractC89172b<C56388b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ int f128627a;

        static {
            Covode.recordClassIndex(66209);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56389c(int i) {
            super(1);
            this.f128627a = i;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C56388b bVar) {
            C56388b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            bVar2.f128625i = SystemClock.uptimeMillis();
            if (this.f128627a == 0) {
                if (bVar2.f128624h != 1) {
                    bVar2.f128624h = 2;
                }
                C56386j.m102364b();
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.inbox.d.j$e */
    public static final class C56391e extends AbstractC89220m implements AbstractC89172b<C56388b, C89391z> {

        /* renamed from: a */
        public static final C56391e f128631a = new C56391e();

        static {
            Covode.recordClassIndex(66211);
        }

        C56391e() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C56388b bVar) {
            C56388b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            bVar2.f128626j = SystemClock.uptimeMillis();
            C1731i.m5640b(new CallableC56394h(bVar2), C1731i.f5562a);
            C56386j.f128613a = null;
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public static void m102361a(BaseResponse baseResponse) {
        m102363a(new C56393g(baseResponse));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.inbox.d.j$d */
    public static final class C56390d extends AbstractC89220m implements AbstractC89172b<C56388b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ EnumC56387a f128628a;

        /* renamed from: b */
        final /* synthetic */ int f128629b;

        /* renamed from: c */
        final /* synthetic */ String f128630c;

        static {
            Covode.recordClassIndex(66210);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56390d(EnumC56387a aVar, int i, String str) {
            super(1);
            this.f128628a = aVar;
            this.f128629b = i;
            this.f128630c = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C56388b bVar) {
            C56388b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            bVar2.f128617a = this.f128628a.getTypeName();
            int i = C56395k.f128635a[this.f128628a.ordinal()];
            if (i == 1) {
                bVar2.f128618b = this.f128629b;
            } else if (i == 2) {
                bVar2.f128619c = this.f128629b;
            }
            bVar2.f128620d = this.f128630c;
            bVar2.f128622f = SystemClock.uptimeMillis();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.d.j$g */
    static final class C56393g extends AbstractC89220m implements AbstractC89172b<C56388b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ BaseResponse f128633a;

        static {
            Covode.recordClassIndex(66213);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56393g(BaseResponse baseResponse) {
            super(1);
            this.f128633a = baseResponse;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C56388b bVar) {
            int i;
            String str;
            BaseResponse.ServerTimeExtra serverTimeExtra;
            C56388b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            BaseResponse baseResponse = this.f128633a;
            if (baseResponse == null || baseResponse.status_code != 0) {
                i = 1;
            } else {
                i = 0;
            }
            bVar2.f128624h = i;
            BaseResponse baseResponse2 = this.f128633a;
            if (baseResponse2 == null || (serverTimeExtra = baseResponse2.extra) == null) {
                str = null;
            } else {
                str = serverTimeExtra.logid;
            }
            bVar2.f128621e = str;
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    private static void m102363a(AbstractC89172b<? super C56388b, C89391z> bVar) {
        C56388b bVar2 = f128613a;
        if (bVar2 != null) {
            bVar.invoke(bVar2);
        }
    }

    /* renamed from: a */
    public static void m102362a(EnumC56387a aVar, int i, String str) {
        C89219l.m154721d(aVar, "");
        if (f128613a != null) {
            f128613a = null;
            return;
        }
        f128613a = new C56388b();
        m102363a(new C56390d(aVar, i, str));
    }
}
