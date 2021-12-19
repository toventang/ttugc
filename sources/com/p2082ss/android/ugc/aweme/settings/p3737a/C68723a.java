package com.p2082ss.android.ugc.aweme.settings.p3737a;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.entity.C13866d;
import com.bytedance.crash.p932j.C13913i;
import com.bytedance.crash.util.C14042ab;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.services.apm.api.C22708a;
import com.p109b.p110a.p111a.C2374b;
import com.p109b.p110a.p111a.C2375c;
import com.p109b.p110a.p112b.AbstractC2376a;
import com.p2082ss.android.ugc.aweme.feed.C49907s;
import com.p2082ss.android.ugc.aweme.logger.C58945a;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.settings.a.a */
public final class C68723a {

    /* renamed from: a */
    public static final C68723a f153738a = new C68723a();

    private C68723a() {
    }

    static {
        Covode.recordClassIndex(80992);
    }

    /* renamed from: com.ss.android.ugc.aweme.settings.a.a$a */
    public static final class C68724a implements AbstractC2376a {

        /* renamed from: a */
        private boolean f153739a;

        /* renamed from: b */
        private boolean f153740b;

        static {
            Covode.recordClassIndex(80993);
        }

        /* renamed from: com.ss.android.ugc.aweme.settings.a.a$a$a */
        static final class RunnableC68725a implements Runnable {

            /* renamed from: a */
            public static final RunnableC68725a f153741a = new RunnableC68725a();

            static {
                Covode.recordClassIndex(80994);
            }

            RunnableC68725a() {
            }

            public final void run() {
                throw new RuntimeException(C14042ab.m25488a(new RuntimeException("SafeView")));
            }
        }

        @Override // com.p109b.p110a.p112b.AbstractC2376a
        /* renamed from: a */
        public final void mo6545a(Map<String, String> map) {
            C89219l.m154721d(map, "");
            if (TextUtils.equals(C17867d.f42595s, "local_test")) {
                new Handler(Looper.getMainLooper()).postDelayed(RunnableC68725a.f153741a, 10000);
            }
            String b = C49907s.m93688b();
            StackTraceElement stackTraceElement = new StackTraceElement("SafeView", "report", "SafeView", 0);
            String a = C14042ab.m25488a(new RuntimeException("SafeView"));
            C89219l.m154716b(a, "");
            String a2 = C68723a.m121158a(a);
            Thread currentThread = Thread.currentThread();
            C89219l.m154716b(currentThread, "");
            C13866d a3 = C13866d.m25084a(stackTraceElement, a2, "SafeView", currentThread.getName(), "EnsureNotNull");
            C89219l.m154716b(a3, "");
            a3.mo22350c("activity", b);
            C13913i.m25188a(a3);
            Throwable th = new Throwable("need run in main thread!!!");
            StackTraceElement[] stackTrace = th.getStackTrace();
            int length = stackTrace.length;
            if (length > 3) {
                int i = length - 3;
                StackTraceElement[] stackTraceElementArr = new StackTraceElement[i];
                System.arraycopy(stackTrace, 3, stackTraceElementArr, 0, i);
                th.setStackTrace(stackTraceElementArr);
            }
            C22708a.m42803a(th, "SafeView");
        }

        @Override // com.p109b.p110a.p112b.AbstractC2376a
        /* renamed from: a */
        public final void mo6544a(View view, boolean z) {
            C89219l.m154721d(view, "");
            if (this.f153739a) {
                return;
            }
            if (z) {
                C58945a.C58947b.f134185a.mo96425a("cold_boot_main_layout_duration", false);
                return;
            }
            C58945a.C58947b.f134185a.mo96429b("cold_boot_main_layout_duration", false);
            this.f153739a = true;
        }

        @Override // com.p109b.p110a.p112b.AbstractC2376a
        /* renamed from: b */
        public final void mo6546b(View view, boolean z) {
            C89219l.m154721d(view, "");
            if (this.f153740b) {
                return;
            }
            if (z) {
                C58945a.C58947b.f134185a.mo96425a("cold_boot_main_draw_duration", false);
                return;
            }
            C58945a.C58947b.f134185a.mo96429b("cold_boot_main_draw_duration", false);
            this.f153740b = true;
        }
    }

    /* renamed from: a */
    public static void m121159a(boolean z) {
        String.valueOf(z);
        C2374b.f7216a = z;
        if (z) {
            C2374b.f7217b = new C68724a();
            if (!C2375c.f7218a) {
                Context a = C17867d.m33078a();
                Objects.requireNonNull(a, "null cannot be cast to non-null type android.app.Application");
                C2375c.m7217a((Application) a);
            }
        }
    }

    /* renamed from: a */
    public static String m121158a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        List<String> b = C89361p.m154915b(str, new String[]{"\n"});
        if (b.isEmpty()) {
            return "";
        }
        int i = 0;
        StringBuilder sb = new StringBuilder();
        for (String str2 : b) {
            if (1 > i || 3 < i) {
                sb.append(str2 + "\n");
            }
            i++;
        }
        String sb2 = sb.toString();
        C89219l.m154716b(sb2, "");
        return sb2;
    }
}
