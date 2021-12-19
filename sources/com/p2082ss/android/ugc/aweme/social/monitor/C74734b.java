package com.p2082ss.android.ugc.aweme.social.monitor;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.social.widget.card.p3922c.C74775a;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.ss.android.ugc.aweme.social.monitor.b */
public final class C74734b implements AbstractC74739d {

    /* renamed from: d */
    public static final ConcurrentHashMap<String, C74734b> f167989d = new ConcurrentHashMap<>();

    /* renamed from: e */
    public static final C74735a f167990e = new C74735a((byte) 0);

    /* renamed from: a */
    public C74733a f167991a;

    /* renamed from: b */
    public final int f167992b;

    /* renamed from: c */
    public final String f167993c;

    /* renamed from: com.ss.android.ugc.aweme.social.monitor.b$a */
    public static final class C74735a {
        static {
            Covode.recordClassIndex(87576);
        }

        private C74735a() {
        }

        public /* synthetic */ C74735a(byte b) {
            this();
        }

        /* renamed from: a */
        public static void m131206a(String str) {
            Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
            C89219l.m154716b(str.substring(0, 3), "");
        }
    }

    /* renamed from: h */
    private final void m131195h() {
        C39162r.m79452a().execute(new RunnableC74736b(this));
    }

    @Override // com.p2082ss.android.ugc.aweme.social.monitor.AbstractC74739d
    /* renamed from: a */
    public final void mo117782a() {
        this.f167991a.f167975b = SystemClock.uptimeMillis();
        C74735a.m131206a(this.f167993c);
    }

    @Override // com.p2082ss.android.ugc.aweme.social.monitor.AbstractC74739d
    /* renamed from: b */
    public final void mo117786b() {
        this.f167991a.f167977d = SystemClock.uptimeMillis();
        C74735a.m131206a(this.f167993c);
    }

    @Override // com.p2082ss.android.ugc.aweme.social.monitor.AbstractC74739d
    /* renamed from: c */
    public final void mo117787c() {
        this.f167991a.f167978e = SystemClock.uptimeMillis();
        C74735a.m131206a(this.f167993c);
    }

    @Override // com.p2082ss.android.ugc.aweme.social.monitor.AbstractC74739d
    /* renamed from: d */
    public final void mo117788d() {
        this.f167991a.f167979f = SystemClock.uptimeMillis();
        C74735a.m131206a(this.f167993c);
    }

    @Override // com.p2082ss.android.ugc.aweme.social.monitor.AbstractC74739d
    /* renamed from: e */
    public final void mo117789e() {
        this.f167991a.f167981h = SystemClock.uptimeMillis();
        C74735a.m131206a(this.f167993c);
    }

    @Override // com.p2082ss.android.ugc.aweme.social.monitor.AbstractC74739d
    /* renamed from: f */
    public final void mo117790f() {
        this.f167991a.f167982i = SystemClock.uptimeMillis();
        C74735a.m131206a(this.f167993c);
    }

    static {
        Covode.recordClassIndex(87575);
    }

    @Override // com.p2082ss.android.ugc.aweme.social.monitor.AbstractC74739d
    /* renamed from: g */
    public final void mo117791g() {
        this.f167991a.f167983j = SystemClock.uptimeMillis();
        C74735a.m131206a(this.f167993c);
        m131195h();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.social.monitor.b$b */
    public static final class RunnableC74736b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C74734b f167994a;

        static {
            Covode.recordClassIndex(87577);
        }

        RunnableC74736b(C74734b bVar) {
            this.f167994a = bVar;
        }

        public final void run() {
            Object obj;
            long j;
            String message;
            long j2;
            String message2;
            final C89233z.C89234a aVar = new C89233z.C89234a();
            aVar.element = true;
            C747371 r7 = new AbstractC89172b<Long, Long>() {
                /* class com.p2082ss.android.ugc.aweme.social.monitor.C74734b.RunnableC74736b.C747371 */

                static {
                    Covode.recordClassIndex(87578);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ Long invoke(Long l) {
                    return Long.valueOf(mo117793a(l.longValue()));
                }

                /* renamed from: a */
                public final long mo117793a(long j) {
                    if (j >= -1 && j <= 2147483647L) {
                        return j;
                    }
                    aVar.element = false;
                    return -1;
                }
            };
            C74733a aVar2 = this.f167994a.f167991a;
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("api_scene", aVar2.f167974a);
                jSONObject.put("is_new_impl", C74775a.m131281a(aVar2.f167984k));
                jSONObject.put("map_size", aVar2.f167986m);
                jSONObject.put("is_valid", C74775a.m131281a(aVar.element));
                jSONObject.put("error_count", aVar2.f167985l);
                Throwable th = aVar2.f167987n;
                if (!(th == null || (message2 = th.getMessage()) == null || message2.length() == 0)) {
                    String message3 = th.getMessage();
                    if (message3 == null) {
                        message3 = "";
                    }
                    jSONObject.put("db_error", message3);
                }
                jSONObject.put("cost", r7.mo117793a(aVar2.f167983j - aVar2.f167975b));
                jSONObject.put("db_cost", r7.mo117793a(aVar2.f167976c - aVar2.f167975b));
                if (aVar2.f167986m != 0) {
                    Long a = C74738c.m131208a(aVar2.f167977d);
                    if (a != null) {
                        jSONObject.put("filter_cost", r7.mo117793a(a.longValue() - aVar2.f167976c));
                    }
                    Long a2 = C74738c.m131208a(aVar2.f167978e);
                    if (a2 != null) {
                        long longValue = a2.longValue();
                        Long a3 = C74738c.m131208a(aVar2.f167977d);
                        if (a3 != null) {
                            j2 = a3.longValue();
                        } else {
                            j2 = aVar2.f167976c;
                        }
                        jSONObject.put("pre_hash_cost", r7.mo117793a(longValue - j2));
                    }
                    long j3 = aVar2.f167979f;
                    Long a4 = C74738c.m131208a(aVar2.f167978e);
                    if (a4 == null && (a4 = C74738c.m131208a(aVar2.f167977d)) == null) {
                        j = aVar2.f167976c;
                    } else {
                        j = a4.longValue();
                    }
                    jSONObject.put("hash_cost", r7.mo117793a(j3 - j));
                    jSONObject.put("serialize_cost", r7.mo117793a(aVar2.f167980g - aVar2.f167979f));
                    jSONObject.put("api_cost", r7.mo117793a(aVar2.f167981h - aVar2.f167979f));
                    Long a5 = C74738c.m131208a(aVar2.f167982i);
                    if (a5 != null) {
                        jSONObject.put("construct_cost", r7.mo117793a(a5.longValue() - aVar2.f167981h));
                    }
                    Throwable th2 = aVar2.f167988o;
                    if (!(th2 == null || (message = th2.getMessage()) == null)) {
                        if (message.length() != 0) {
                            jSONObject.put("net_error", th2.getMessage());
                        }
                    }
                }
                C74735a.m131206a(this.f167994a.f167993c);
                C39162r.m79461a("relation_monitor_contact_android", jSONObject);
                obj = C89379q.m157068constructorimpl(C89391z.f203057a);
            } catch (Throwable th3) {
                obj = C89379q.m157068constructorimpl(C89382r.m154941a(th3));
            }
            Throwable r1 = C89379q.m157071exceptionOrNullimpl(obj);
            if (r1 != null) {
                String str = this.f167994a.f167993c;
                r1.getMessage();
                C74735a.m131206a(str);
            }
            C74734b.f167989d.remove(this.f167994a.f167993c);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.social.monitor.AbstractC74739d
    /* renamed from: a */
    public final void mo117783a(Throwable th) {
        C89219l.m154721d(th, "");
        this.f167991a.f167981h = SystemClock.uptimeMillis();
        this.f167991a.f167988o = th;
        String str = this.f167993c;
        th.getMessage();
        C74735a.m131206a(str);
    }

    public C74734b(int i, String str) {
        C89219l.m154721d(str, "");
        this.f167992b = i;
        this.f167993c = str;
        this.f167991a = new C74733a(i);
    }

    @Override // com.p2082ss.android.ugc.aweme.social.monitor.AbstractC74739d
    /* renamed from: a */
    public final void mo117784a(boolean z, int i) {
        this.f167991a.f167984k = z;
        this.f167991a.f167976c = SystemClock.uptimeMillis();
        this.f167991a.f167986m = i;
        C74735a.m131206a(this.f167993c);
        if (i <= 0) {
            mo117791g();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.social.monitor.AbstractC74739d
    /* renamed from: a */
    public final void mo117785a(boolean z, int i, Throwable th) {
        C89219l.m154721d(th, "");
        this.f167991a.f167984k = z;
        this.f167991a.f167985l = i;
        this.f167991a.f167987n = th;
        String str = this.f167993c;
        th.getMessage();
        C74735a.m131206a(str);
    }
}
