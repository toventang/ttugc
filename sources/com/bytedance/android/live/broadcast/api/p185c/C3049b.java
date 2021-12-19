package com.bytedance.android.live.broadcast.api.p185c;

import com.bytedance.android.live.broadcast.api.p185c.C3051c;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.network.model.C5820b;
import com.bytedance.android.live.p172a.p173a.p174a.C2911c;
import com.bytedance.android.live.p172a.p173a.p175b.C2912a;
import com.bytedance.android.livesdk.p425aa.C6497a;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.broadcast.api.c.b */
public final class C3049b {

    /* renamed from: a */
    public static final C3050a f8889a = new C3050a((byte) 0);

    static {
        Covode.recordClassIndex(3527);
    }

    /* renamed from: com.bytedance.android.live.broadcast.api.c.b$a */
    public static final class C3050a {
        static {
            Covode.recordClassIndex(3528);
        }

        private C3050a() {
        }

        public /* synthetic */ C3050a(byte b) {
            this();
        }

        /* renamed from: a */
        public static C6497a m8357a(String str, Throwable th) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(th, "");
            return C3051c.C3052a.m8361c(str).mo12630a(th);
        }

        /* renamed from: b */
        public static C6497a m8358b(String str, Throwable th) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(th, "");
            C6497a c = C3051c.C3052a.m8361c(str);
            C89219l.m154721d(th, "");
            if (th instanceof C5820b) {
                C5820b bVar = (C5820b) th;
                return c.mo12629a("url", bVar.getUrl()).mo12635b("error_code", Integer.valueOf(bVar.getErrorCode())).mo12637b("error_msg", bVar.getErrorMsg()).mo12629a("error_alert", bVar.getAlert()).mo12629a("error_prompt", bVar.getPrompt());
            } else if (th instanceof C2912a) {
                C2912a aVar = (C2912a) th;
                return c.mo12635b("error_code", Integer.valueOf(aVar.getErrorCode())).mo12637b("error_msg", aVar.getErrorMsg()).mo12629a("error_alert", aVar.getAlert()).mo12629a("error_prompt", aVar.getPrompt());
            } else if (th instanceof C2911c) {
                return c.mo12635b("error_code", (Integer) 1).mo12637b("error_msg", th.getMessage());
            } else {
                C3854a.m9458a("LiveBroadcastBusinessLog", th);
                return c.mo12635b("error_code", (Integer) 1).mo12637b("error_msg", th.getMessage());
            }
        }
    }
}
