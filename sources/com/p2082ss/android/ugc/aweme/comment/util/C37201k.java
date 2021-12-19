package com.p2082ss.android.ugc.aweme.comment.util;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.apm.C12290b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.comment.p2495i.C36500h;
import com.p2082ss.android.ugc.aweme.comment.p2499m.C36540c;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.p2436cc.C35434c;
import com.p2082ss.android.ugc.aweme.p2436cc.EnumC35431b;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.comment.util.k */
public final class C37201k {

    /* renamed from: a */
    public static final HandlerC37203b f87714a = new HandlerC37203b();

    /* renamed from: b */
    public static C37204c f87715b;

    /* renamed from: c */
    public static final C37201k f87716c = new C37201k();

    /* renamed from: com.ss.android.ugc.aweme.comment.util.k$a */
    public interface AbstractC37202a {
        static {
            Covode.recordClassIndex(44557);
        }

        /* renamed from: a */
        void mo64695a(long j, boolean z, int i);
    }

    private C37201k() {
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.util.k$b */
    public static final class HandlerC37203b extends Handler {
        static {
            Covode.recordClassIndex(44558);
        }

        public HandlerC37203b() {
            super(Looper.getMainLooper());
        }

        public final void handleMessage(Message message) {
            Bundle data;
            AbstractC37202a aVar;
            long j;
            int i;
            C89219l.m154721d(message, "");
            super.handleMessage(message);
            if (message.what == 0 && (data = message.getData()) != null && Long.valueOf(data.getLong("key_finish_ts")) != null && C37201k.f87715b != null) {
                C37204c cVar = C37201k.f87715b;
                if (cVar != null) {
                    cVar.f87724h = System.currentTimeMillis();
                }
                C37204c cVar2 = C37201k.f87715b;
                if (cVar2 == null) {
                    C89219l.m154715b();
                }
                if (cVar2.mo64756b() >= 0) {
                    C37204c cVar3 = C37201k.f87715b;
                    if (cVar3 == null) {
                        C89219l.m154715b();
                    }
                    if (cVar3.mo64755a() >= 0) {
                        C37204c cVar4 = C37201k.f87715b;
                        if (cVar4 == null) {
                            C89219l.m154715b();
                        }
                        if (cVar4.mo64757c() >= 0) {
                            C37204c cVar5 = C37201k.f87715b;
                            if (!(cVar5 == null || (aVar = cVar5.f87725i) == null)) {
                                C37204c cVar6 = C37201k.f87715b;
                                if (cVar6 != null) {
                                    j = cVar6.mo64758d();
                                } else {
                                    j = -1;
                                }
                                C37204c cVar7 = C37201k.f87715b;
                                if (cVar7 != null) {
                                    i = cVar7.f87720d;
                                } else {
                                    i = 0;
                                }
                                aVar.mo64695a(j, true, i);
                            }
                            C37200j.m75176a("CommentPageLoadTimer: finishRecord(): duration = " + C37201k.m75184c());
                            C37201k.m75183b();
                            C37201k.f87715b = null;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: c */
    static long m75184c() {
        C37204c cVar = f87715b;
        if (cVar != null) {
            return cVar.mo64758d();
        }
        return -1;
    }

    /* renamed from: d */
    private static long m75185d() {
        C37204c cVar = f87715b;
        if (cVar != null) {
            return cVar.mo64755a();
        }
        return -1;
    }

    /* renamed from: e */
    private static long m75186e() {
        C37204c cVar = f87715b;
        if (cVar != null) {
            return cVar.mo64756b();
        }
        return -1;
    }

    /* renamed from: f */
    private static long m75187f() {
        C37204c cVar = f87715b;
        if (cVar != null) {
            return cVar.mo64757c();
        }
        return -1;
    }

    /* renamed from: g */
    private static long m75188g() {
        C37204c cVar = f87715b;
        if (cVar != null) {
            return System.currentTimeMillis() - cVar.f87721e;
        }
        return -1;
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.util.k$c */
    public static final class C37204c {

        /* renamed from: a */
        public boolean f87717a;

        /* renamed from: b */
        public String f87718b;

        /* renamed from: c */
        public Boolean f87719c;

        /* renamed from: d */
        public int f87720d;

        /* renamed from: e */
        public long f87721e;

        /* renamed from: f */
        public long f87722f;

        /* renamed from: g */
        public long f87723g;

        /* renamed from: h */
        public long f87724h;

        /* renamed from: i */
        public AbstractC37202a f87725i;

        /* renamed from: j */
        public boolean f87726j;

        static {
            Covode.recordClassIndex(44559);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C37204c)) {
                return false;
            }
            C37204c cVar = (C37204c) obj;
            return this.f87717a == cVar.f87717a && C89219l.m154714a(this.f87718b, cVar.f87718b) && C89219l.m154714a(this.f87719c, cVar.f87719c) && this.f87720d == cVar.f87720d && this.f87721e == cVar.f87721e && this.f87722f == cVar.f87722f && this.f87723g == cVar.f87723g && this.f87724h == cVar.f87724h && C89219l.m154714a(this.f87725i, cVar.f87725i) && this.f87726j == cVar.f87726j;
        }

        public final String toString() {
            return "TimeRecorder(isFirstShow=" + this.f87717a + ", eventType=" + this.f87718b + ", isLoadSuccess=" + this.f87719c + ", loadDataCount=" + this.f87720d + ", showFragmentStartAt=" + this.f87721e + ", networkStartAt=" + this.f87722f + ", networkFinishedAt=" + this.f87723g + ", viewHolderFinishedAt=" + this.f87724h + ", listener=" + this.f87725i + ", isFirstLoad=" + this.f87726j + ")";
        }

        /* renamed from: a */
        public final long mo64755a() {
            long j = this.f87722f;
            long j2 = this.f87721e;
            if (1 <= j2 && j > j2) {
                return j - j2;
            }
            return -1;
        }

        /* renamed from: b */
        public final long mo64756b() {
            long j = this.f87723g;
            long j2 = this.f87722f;
            if (1 <= j2 && j > j2) {
                return j - j2;
            }
            return -1;
        }

        /* renamed from: c */
        public final long mo64757c() {
            long j = this.f87724h;
            long j2 = this.f87723g;
            if (1 <= j2 && j > j2) {
                return j - j2;
            }
            return -1;
        }

        /* renamed from: d */
        public final long mo64758d() {
            long j = this.f87721e;
            long j2 = this.f87724h;
            if (1 <= j && j2 > j) {
                return j2 - j;
            }
            long j3 = this.f87723g;
            if (1 <= j && j3 > j) {
                return j3 - j;
            }
            return -1;
        }

        public final int hashCode() {
            int i;
            int i2;
            boolean z = this.f87717a;
            int i3 = 1;
            if (z) {
                z = true;
            }
            int i4 = z ? 1 : 0;
            int i5 = z ? 1 : 0;
            int i6 = z ? 1 : 0;
            int i7 = i4 * 31;
            String str = this.f87718b;
            int i8 = 0;
            if (str != null) {
                i = str.hashCode();
            } else {
                i = 0;
            }
            int i9 = (i7 + i) * 31;
            Boolean bool = this.f87719c;
            if (bool != null) {
                i2 = bool.hashCode();
            } else {
                i2 = 0;
            }
            long j = this.f87721e;
            long j2 = this.f87722f;
            long j3 = this.f87723g;
            long j4 = this.f87724h;
            int i10 = (((((((((((i9 + i2) * 31) + this.f87720d) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31;
            AbstractC37202a aVar = this.f87725i;
            if (aVar != null) {
                i8 = aVar.hashCode();
            }
            int i11 = (i10 + i8) * 31;
            if (!this.f87726j) {
                i3 = 0;
            }
            return i11 + i3;
        }

        private C37204c(boolean z, String str, long j, AbstractC37202a aVar) {
            this.f87717a = z;
            this.f87718b = str;
            this.f87719c = null;
            this.f87720d = 0;
            this.f87721e = j;
            this.f87722f = 0;
            this.f87723g = 0;
            this.f87724h = 0;
            this.f87725i = aVar;
            this.f87726j = false;
        }

        public /* synthetic */ C37204c(boolean z, String str, long j, AbstractC37202a aVar, byte b) {
            this(z, str, j, aVar);
        }
    }

    static {
        Covode.recordClassIndex(44556);
    }

    /* renamed from: a */
    public static final void m75179a() {
        C37204c cVar = f87715b;
        if (cVar != null) {
            cVar.f87722f = System.currentTimeMillis();
            C37204c cVar2 = f87715b;
            if (cVar2 != null) {
                cVar2.f87726j = true;
            }
            C37200j.m75176a("CommentPageLoadTimer: beginNetworkLoad()");
        }
    }

    /* renamed from: b */
    public static void m75183b() {
        C37204c cVar;
        if (C37198h.m75172a() && (cVar = f87715b) != null && cVar.mo64756b() >= 0) {
            C37204c cVar2 = f87715b;
            if (cVar2 == null) {
                C89219l.m154715b();
            }
            if (cVar2.mo64755a() >= 0) {
                C37204c cVar3 = f87715b;
                if (cVar3 == null) {
                    C89219l.m154715b();
                }
                if (cVar3.mo64757c() >= 0) {
                    JSONObject jSONObject = new JSONObject();
                    C37204c cVar4 = f87715b;
                    if (cVar4 == null) {
                        C89219l.m154715b();
                    }
                    jSONObject.put("need_refresh", cVar4.f87717a);
                    JSONObject jSONObject2 = new JSONObject();
                    C37204c cVar5 = f87715b;
                    if (cVar5 == null) {
                        C89219l.m154715b();
                    }
                    jSONObject2.put("is_first", cVar5.f87717a);
                    C37204c cVar6 = f87715b;
                    if (cVar6 == null) {
                        C89219l.m154715b();
                    }
                    jSONObject2.put("list_count", cVar6.f87720d);
                    C37204c cVar7 = f87715b;
                    if (cVar7 == null) {
                        C89219l.m154715b();
                    }
                    String str = cVar7.f87718b;
                    String str2 = "";
                    if (str == null) {
                        str = str2;
                    }
                    jSONObject2.put("event_type", str);
                    jSONObject2.put("duration", m75184c());
                    C37204c cVar8 = f87715b;
                    if (cVar8 == null) {
                        C89219l.m154715b();
                    }
                    jSONObject2.put("start_duration", cVar8.mo64755a());
                    C37204c cVar9 = f87715b;
                    if (cVar9 == null) {
                        C89219l.m154715b();
                    }
                    jSONObject2.put("view_duration", cVar9.mo64757c());
                    C37204c cVar10 = f87715b;
                    if (cVar10 == null) {
                        C89219l.m154715b();
                    }
                    jSONObject2.put("request_duration", cVar10.mo64756b());
                    StringBuilder append = new StringBuilder("CommentPageLoadTimer: uploadApmAgent(): duration = ").append(m75184c()).append(" phase1 = ");
                    C37204c cVar11 = f87715b;
                    if (cVar11 == null) {
                        C89219l.m154715b();
                    }
                    StringBuilder append2 = append.append(cVar11.mo64755a()).append(" phase2 = ");
                    C37204c cVar12 = f87715b;
                    if (cVar12 == null) {
                        C89219l.m154715b();
                    }
                    StringBuilder append3 = append2.append(cVar12.mo64756b()).append(" phase3 = ");
                    C37204c cVar13 = f87715b;
                    if (cVar13 == null) {
                        C89219l.m154715b();
                    }
                    StringBuilder append4 = append3.append(cVar13.mo64757c()).append(" is_first = ");
                    C37204c cVar14 = f87715b;
                    if (cVar14 == null) {
                        C89219l.m154715b();
                    }
                    StringBuilder append5 = append4.append(cVar14.f87717a).append(" list_count = ");
                    C37204c cVar15 = f87715b;
                    if (cVar15 == null) {
                        C89219l.m154715b();
                    }
                    StringBuilder append6 = append5.append(cVar15.f87720d).append(" event_type = ");
                    C37204c cVar16 = f87715b;
                    if (cVar16 == null) {
                        C89219l.m154715b();
                    }
                    String str3 = cVar16.f87718b;
                    if (str3 != null) {
                        str2 = str3;
                    }
                    C37200j.m75176a(append6.append(str2).toString());
                    C12290b.m22066a("comment_page_load_time", jSONObject, (JSONObject) null, jSONObject2);
                }
            }
        }
    }

    /* renamed from: a */
    public static final void m75180a(int i) {
        AbstractC37202a aVar;
        long j;
        C37204c cVar = f87715b;
        if (cVar != null) {
            cVar.f87723g = System.currentTimeMillis();
            C37204c cVar2 = f87715b;
            if (cVar2 != null) {
                cVar2.f87720d = i;
            }
            C37200j.m75176a("CommentPageLoadTimer: onDataLoadSuccess(), commentCount = ".concat(String.valueOf(i)));
            if (i == 0) {
                C37204c cVar3 = f87715b;
                if (!(cVar3 == null || (aVar = cVar3.f87725i) == null)) {
                    C37204c cVar4 = f87715b;
                    if (cVar4 != null) {
                        j = cVar4.mo64758d();
                    } else {
                        j = -1;
                    }
                    aVar.mo64695a(j, true, i);
                }
                m75183b();
                f87715b = null;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.util.k$d */
    public static final class C37205d implements AbstractC37202a {

        /* renamed from: a */
        final /* synthetic */ Aweme f87727a;

        /* renamed from: b */
        final /* synthetic */ C36500h f87728b;

        static {
            Covode.recordClassIndex(44560);
        }

        C37205d(Aweme aweme, C36500h hVar) {
            this.f87727a = aweme;
            this.f87728b = hVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.comment.util.C37201k.AbstractC37202a
        /* renamed from: a */
        public final void mo64695a(long j, boolean z, int i) {
            String str;
            String str2;
            EnumC35431b bVar;
            String str3;
            Aweme aweme = this.f87727a;
            if (aweme != null) {
                if (!z) {
                    str = "fail";
                } else if (i == 0) {
                    str = "empty";
                } else {
                    str = "success";
                }
                String aid = aweme.getAid();
                String authorUid = this.f87727a.getAuthorUid();
                C36500h hVar = this.f87728b;
                if (hVar != null) {
                    str2 = hVar.getEnterFrom();
                } else {
                    str2 = null;
                }
                C36540c.m74387a(aid, authorUid, str2, str, j);
                if (z) {
                    bVar = EnumC35431b.SUCCESS;
                } else {
                    bVar = EnumC35431b.FAIL;
                }
                int i2 = !z ? 1 : 0;
                C36500h hVar2 = this.f87728b;
                if (hVar2 == null || (str3 = hVar2.getEnterFrom()) == null) {
                    str3 = "";
                }
                C37201k.m75181a(UGCMonitor.EVENT_COMMENT, i2, str3, false);
                C35434c.m72462a(UGCMonitor.EVENT_COMMENT, bVar);
            }
        }
    }

    /* renamed from: a */
    public static final AbstractC37202a m75178a(Aweme aweme, C36500h hVar) {
        return new C37205d(aweme, hVar);
    }

    /* renamed from: a */
    public static final void m75182a(boolean z, String str, AbstractC37202a aVar) {
        C89219l.m154721d(str, "");
        C35434c.m72461a(UGCMonitor.EVENT_COMMENT);
        C37200j.m75176a("CommentPageLoadTimer: beginRecord(): isFirstShow = " + z + ", eventType=" + str);
        f87714a.removeCallbacksAndMessages(null);
        f87715b = new C37204c(z, str, System.currentTimeMillis(), aVar, (byte) 0);
    }

    /* renamed from: a */
    public static final void m75181a(String str, int i, String str2, boolean z) {
        long g;
        long j;
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C37204c cVar = f87715b;
        if (cVar != null && cVar.f87726j) {
            C37204c cVar2 = f87715b;
            if (cVar2 != null) {
                cVar2.f87726j = false;
            }
            C33744d a = new C33744d().mo59983a("page_type", str).mo59980a("result", i).mo59983a("enter_from", str2);
            if (!z) {
                g = m75184c();
            } else {
                g = m75188g();
            }
            C33744d a2 = a.mo59981a("duration", g).mo59981a("duration_before_network", m75185d());
            long j2 = -1;
            if (!z) {
                j = m75186e();
            } else {
                j = -1;
            }
            C33744d a3 = a2.mo59981a("duration_network", j);
            if (!z) {
                j2 = m75187f();
            }
            C39162r.m79460a("page_load_time", a3.mo59981a("duration_after_network", j2).f79943a);
        }
    }
}
