package com.p2082ss.android.ugc.aweme.inbox.p3269d;

import android.net.Uri;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.p2367b.C34485a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.detail.p2748g.C41129b;
import com.p2082ss.android.ugc.aweme.detail.p2748g.C41130c;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.utils.C80298cg;
import com.p2082ss.android.ugc.aweme.utils.C80537hk;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;
import p077b.C1731i;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.inbox.d.h */
public final class C56378h implements AbstractC90252i, AbstractC90253j {

    /* renamed from: a */
    public static final C56378h f128593a;

    /* renamed from: b */
    private static C56379a f128594b;

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(31, new RunnableC90250g(C56378h.class, "onDetailAwemeEvent", C41129b.class, ThreadMode.MAIN, 0, false));
        hashMap.put(32, new RunnableC90250g(C56378h.class, "onDetailFirstFrameEvent", C41130c.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    private C56378h() {
    }

    static {
        Covode.recordClassIndex(66198);
        C56378h hVar = new C56378h();
        f128593a = hVar;
        C80298cg.m139204a(hVar);
    }

    /* renamed from: a */
    public static void m102353a() {
        C56379a aVar = f128594b;
        if (aVar != null) {
            String str = aVar.f128595a;
            int i = aVar.f128596b;
            String str2 = aVar.f128597c;
            boolean z = aVar.f128598d;
            long j = aVar.f128599e;
            long j2 = aVar.f128600f;
            String str3 = aVar.f128601g;
            int i2 = aVar.f128602h;
            String str4 = aVar.f128603i;
            long j3 = aVar.f128604j;
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            C1731i.m5640b(new CallableC56382d(new C56379a(str, i, str2, z, j, j2, str3, i2, str4, j3)), C1731i.f5562a);
            f128594b = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.inbox.d.h$a */
    public static final class C56379a {

        /* renamed from: a */
        public final String f128595a;

        /* renamed from: b */
        public final int f128596b;

        /* renamed from: c */
        public final String f128597c;

        /* renamed from: d */
        public final boolean f128598d;

        /* renamed from: e */
        public long f128599e;

        /* renamed from: f */
        public long f128600f;

        /* renamed from: g */
        public String f128601g;

        /* renamed from: h */
        public int f128602h;

        /* renamed from: i */
        public String f128603i;

        /* renamed from: j */
        public long f128604j;

        static {
            Covode.recordClassIndex(66199);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C56379a)) {
                return false;
            }
            C56379a aVar = (C56379a) obj;
            return C89219l.m154714a(this.f128595a, aVar.f128595a) && this.f128596b == aVar.f128596b && C89219l.m154714a(this.f128597c, aVar.f128597c) && this.f128598d == aVar.f128598d && this.f128599e == aVar.f128599e && this.f128600f == aVar.f128600f && C89219l.m154714a(this.f128601g, aVar.f128601g) && this.f128602h == aVar.f128602h && C89219l.m154714a(this.f128603i, aVar.f128603i) && this.f128604j == aVar.f128604j;
        }

        public final String toString() {
            return "MetaData(aid=" + this.f128595a + ", nType=" + this.f128596b + ", nid=" + this.f128597c + ", isMetricDup=" + this.f128598d + ", clickTs=" + this.f128599e + ", awemeTs=" + this.f128600f + ", awemeLogId=" + this.f128601g + ", awemeErrorCode=" + this.f128602h + ", awemeErrorMsg=" + this.f128603i + ", videoTs=" + this.f128604j + ")";
        }

        public final int hashCode() {
            int i;
            int i2;
            int i3;
            String str = this.f128595a;
            int i4 = 0;
            if (str != null) {
                i = str.hashCode();
            } else {
                i = 0;
            }
            int i5 = ((i * 31) + this.f128596b) * 31;
            String str2 = this.f128597c;
            if (str2 != null) {
                i2 = str2.hashCode();
            } else {
                i2 = 0;
            }
            int i6 = (i5 + i2) * 31;
            boolean z = this.f128598d;
            if (z) {
                z = true;
            }
            int i7 = z ? 1 : 0;
            int i8 = z ? 1 : 0;
            int i9 = z ? 1 : 0;
            long j = this.f128599e;
            long j2 = this.f128600f;
            int i10 = (((((i6 + i7) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            String str3 = this.f128601g;
            if (str3 != null) {
                i3 = str3.hashCode();
            } else {
                i3 = 0;
            }
            int i11 = (((i10 + i3) * 31) + this.f128602h) * 31;
            String str4 = this.f128603i;
            if (str4 != null) {
                i4 = str4.hashCode();
            }
            long j3 = this.f128604j;
            return ((i11 + i4) * 31) + ((int) (j3 ^ (j3 >>> 32)));
        }

        public /* synthetic */ C56379a(String str, int i, String str2, boolean z) {
            this(str, i, str2, z, 0, 0, null, 0, null, 0);
        }

        public C56379a(String str, int i, String str2, boolean z, long j, long j2, String str3, int i2, String str4, long j3) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            this.f128595a = str;
            this.f128596b = i;
            this.f128597c = str2;
            this.f128598d = z;
            this.f128599e = j;
            this.f128600f = j2;
            this.f128601g = str3;
            this.f128602h = i2;
            this.f128603i = str4;
            this.f128604j = j3;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.inbox.d.h$d */
    public static final class CallableC56382d<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ C56379a f128607a;

        static {
            Covode.recordClassIndex(66202);
        }

        CallableC56382d(C56379a aVar) {
            this.f128607a = aVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            int i;
            if (C56359f.m102344a("notice_enter_video_perf", 1.0f)) {
                final C89233z.C89234a aVar = new C89233z.C89234a();
                int i2 = 0;
                aVar.element = false;
                C563831 r5 = new AbstractC89172b<Long, Long>() {
                    /* class com.p2082ss.android.ugc.aweme.inbox.p3269d.C56378h.CallableC56382d.C563831 */

                    static {
                        Covode.recordClassIndex(66203);
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // p4600h.p4611f.p4612a.AbstractC89172b
                    public final /* synthetic */ Long invoke(Long l) {
                        return Long.valueOf(mo93374a(l.longValue()));
                    }

                    /* renamed from: a */
                    public final long mo93374a(long j) {
                        if (j < 0 || j > 600000) {
                            aVar.element = true;
                        }
                        return j;
                    }
                };
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("aid", this.f128607a.f128595a);
                    jSONObject.put(StringSet.type, this.f128607a.f128596b);
                    jSONObject.put("nid", this.f128607a.f128597c);
                    jSONObject.put("api_aweme_cost", r5.mo93374a(this.f128607a.f128600f - this.f128607a.f128599e));
                    jSONObject.put("api_aweme_status", this.f128607a.f128602h);
                    String str = this.f128607a.f128603i;
                    String str2 = "";
                    if (str == null) {
                        str = str2;
                    }
                    jSONObject.put("api_aweme_error", str);
                    String str3 = this.f128607a.f128601g;
                    if (str3 != null) {
                        str2 = str3;
                    }
                    jSONObject.put("api_aweme_log_id", str2);
                    if (this.f128607a.f128602h != 0) {
                        jSONObject.put("cost", r5.mo93374a(this.f128607a.f128600f - this.f128607a.f128599e));
                        jSONObject.put("video_cost", 0);
                    } else {
                        jSONObject.put("cost", r5.mo93374a(this.f128607a.f128604j - this.f128607a.f128599e));
                        jSONObject.put("video_cost", r5.mo93374a(this.f128607a.f128604j - this.f128607a.f128600f));
                    }
                    if (aVar.element) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    jSONObject.put("invalid_metrics", i);
                    if (this.f128607a.f128598d) {
                        i2 = 1;
                    }
                    C89379q.m157068constructorimpl(jSONObject.put("dup_metrics", i2));
                } catch (Throwable th) {
                    C89379q.m157068constructorimpl(C89382r.m154941a(th));
                }
                C39162r.m79461a("notice_enter_video_perf", jSONObject);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    private static void m102354a(AbstractC89172b<? super C56379a, C89391z> bVar) {
        C56379a aVar = f128594b;
        if (aVar != null) {
            bVar.invoke(aVar);
        }
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void onDetailAwemeEvent(C41129b bVar) {
        C89219l.m154721d(bVar, "");
        m102354a(new C56380b(bVar));
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void onDetailFirstFrameEvent(C41130c cVar) {
        C89219l.m154721d(cVar, "");
        m102354a(new C56381c(cVar));
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.d.h$c */
    static final class C56381c extends AbstractC89220m implements AbstractC89172b<C56379a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C41130c f128606a;

        static {
            Covode.recordClassIndex(66201);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56381c(C41130c cVar) {
            super(1);
            this.f128606a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C56379a aVar) {
            C56379a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            String str = this.f128606a.f96131a;
            if (!(str == null || str.length() == 0 || (!C89219l.m154714a((Object) this.f128606a.f96131a, (Object) aVar2.f128595a)))) {
                aVar2.f128604j = SystemClock.uptimeMillis();
                C56378h.m102353a();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.d.h$b */
    static final class C56380b extends AbstractC89220m implements AbstractC89172b<C56379a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C41129b f128605a;

        static {
            Covode.recordClassIndex(66200);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56380b(C41129b bVar) {
            super(1);
            this.f128605a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C56379a aVar) {
            boolean z;
            String str;
            C56379a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            Throwable th = this.f128605a.f96130c;
            if (th != null) {
                th.getMessage();
            }
            String str2 = this.f128605a.f96128a;
            if (str2 == null || str2.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z && !(!C89219l.m154714a((Object) this.f128605a.f96128a, (Object) aVar2.f128595a))) {
                aVar2.f128600f = SystemClock.uptimeMillis();
                String str3 = null;
                if (this.f128605a.f96130c != null) {
                    Throwable th2 = this.f128605a.f96130c;
                    if (th2 != null) {
                        str = th2.getMessage();
                    } else {
                        str = null;
                    }
                    aVar2.f128603i = str;
                    aVar2.f128602h = 1000;
                    try {
                        Throwable th3 = this.f128605a.f96130c;
                        if (th3 != null) {
                            JSONObject jSONObject = new JSONObject(((C34485a) th3).getResponse());
                            aVar2.f128602h = jSONObject.optInt("status_code", 1000);
                            JSONObject optJSONObject = jSONObject.optJSONObject("log_pb");
                            if (optJSONObject != null) {
                                str3 = optJSONObject.optString("impr_id");
                            }
                            aVar2.f128601g = str3;
                            C89379q.m157068constructorimpl(C89391z.f203057a);
                            C56378h.m102353a();
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException");
                        }
                    } catch (Throwable th4) {
                        C89379q.m157068constructorimpl(C89382r.m154941a(th4));
                    }
                } else {
                    Aweme aweme = this.f128605a.f96129b;
                    if (aweme != null) {
                        str3 = aweme.getRequestId();
                    }
                    aVar2.f128601g = str3;
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: b */
    public static void m102356b(String str, Integer num, String str2) {
        int i;
        String str3;
        if (C56359f.m102344a("notice_enter_video_perf", 1.0f) && C80537hk.m139613a(str)) {
            if (str == null) {
                C89219l.m154715b();
            }
            if (num != null) {
                i = num.intValue();
            } else {
                i = 0;
            }
            if (str2 == null) {
                str2 = "";
            }
            C56379a aVar = f128594b;
            if (aVar != null) {
                str3 = aVar.f128595a;
            } else {
                str3 = null;
            }
            C56379a aVar2 = new C56379a(str, i, str2, C89219l.m154714a((Object) str3, (Object) str));
            aVar2.f128599e = SystemClock.uptimeMillis();
            f128594b = aVar2;
        }
    }

    /* renamed from: a */
    public static void m102355a(String str, Integer num, String str2) {
        if (str != null && C89361p.m154908a((CharSequence) str, (CharSequence) "aweme://aweme/detail/", false)) {
            try {
                Uri parse = Uri.parse(str);
                String queryParameter = parse.getQueryParameter("id");
                if (queryParameter == null || queryParameter.length() == 0) {
                    C89219l.m154716b(parse, "");
                    List<String> pathSegments = parse.getPathSegments();
                    if (pathSegments != null) {
                        queryParameter = pathSegments.get(1);
                    } else {
                        queryParameter = null;
                    }
                }
                m102356b(queryParameter, num, str2);
                C89379q.m157068constructorimpl(C89391z.f203057a);
            } catch (Throwable th) {
                C89379q.m157068constructorimpl(C89382r.m154941a(th));
            }
        }
    }
}
