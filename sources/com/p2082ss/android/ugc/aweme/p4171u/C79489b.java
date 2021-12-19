package com.p2082ss.android.ugc.aweme.p4171u;

import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13933m;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.Npth;
import com.bytedance.crash.entity.C13864b;
import com.bytedance.crash.p932j.C13907f;
import com.bytedance.crash.runtime.p933a.C13989e;
import com.bytedance.crash.util.C14042ab;
import com.p2082ss.android.ugc.aweme.feed.experiment.C49495aa;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import org.json.JSONObject;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.u.b */
public final class C79489b {

    /* renamed from: a */
    public static final C79489b f178428a = new C79489b();

    private C79489b() {
    }

    static {
        Covode.recordClassIndex(92692);
    }

    /* renamed from: c */
    private static void m138203c(String str) {
        C51423a.m95784a(6, "BugReportCrashUtil", str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.u.b$b */
    public static final class C79491b<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C79491b f178430a = new C79491b();

        static {
            Covode.recordClassIndex(92694);
        }

        C79491b() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            String str = (String) obj;
            C89219l.m154716b(str, "");
            C79489b.m138202b(str);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.u.b$c */
    public static final class C79492c<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C79492c f178431a = new C79492c();

        static {
            Covode.recordClassIndex(92695);
        }

        C79492c() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            C51423a.m95790a(th);
            String message = th.getMessage();
            if (message != null) {
                C79489b.m138202b(message);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.u.b$a */
    public static final class C79490a<T, R> implements AbstractC88434g {

        /* renamed from: a */
        public static final C79490a f178429a = new C79490a();

        static {
            Covode.recordClassIndex(92693);
        }

        C79490a() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            String str = (String) obj;
            C89219l.m154721d(str, "");
            StringBuilder append = new StringBuilder().append(str).append(',');
            Thread currentThread = Thread.currentThread();
            C89219l.m154716b(currentThread, "");
            return append.append(currentThread.getName()).toString();
        }
    }

    /* renamed from: a */
    public static void m138201a(String str) {
        if (C49495aa.f113854a <= 0) {
            m138203c("can't report:".concat(String.valueOf(str)));
        } else if (str != null) {
            AbstractC88979t.m154310b(str).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143292d(C79490a.f178429a).mo143254a(C79491b.f178430a, C79492c.f178431a);
        }
    }

    /* renamed from: b */
    public static void m138202b(String str) {
        try {
            if (!Npth.isInit()) {
                m138203c("Npth is not init, report abort:".concat(String.valueOf(str)));
                return;
            }
            C13989e a = C13989e.m25320a();
            CrashType crashType = CrashType.JAVA;
            C13864b bVar = new C13864b(new JSONObject());
            bVar.mo22346a("data", (Object) C14042ab.m25488a(new C79493c(str)));
            bVar.mo22346a("isOOM", (Object) false);
            bVar.mo22346a("crash_time", Long.valueOf(System.currentTimeMillis()));
            C13864b a2 = a.mo22510a(crashType, bVar);
            String javaCrashUploadUrl = C13933m.f33942g.getJavaCrashUploadUrl();
            C89219l.m154716b(a2, "");
            C13907f.m25165a(javaCrashUploadUrl, a2.f33757a.toString());
        } catch (Throwable th) {
            C51423a.m95790a(th);
        }
    }
}
