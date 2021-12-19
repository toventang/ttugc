package com.p2082ss.android.ugc.aweme.request_combine.request.p3678a;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.C33748g;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58259r;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58260s;
import com.p2082ss.android.ugc.aweme.lego.EnumC58147aa;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.notice.api.C61542b;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.request_combine.request.a.c */
public final class C67132c implements AbstractC58259r {

    /* renamed from: a */
    public static boolean f150546a = true;

    /* renamed from: b */
    public static final C67133a f150547b = new C67133a((byte) 0);

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: a */
    public final void mo28600a(Context context) {
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    public final int bQ_() {
        return 1048575;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: f */
    public final EnumC58150ad mo28606f() {
        return AbstractC58260s.m105199a(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: g */
    public final String mo28607g() {
        return "request_";
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: i */
    public final boolean mo28609i() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: j */
    public final List mo28610j() {
        return null;
    }

    /* renamed from: com.ss.android.ugc.aweme.request_combine.request.a.c$a */
    public static final class C67133a {
        static {
            Covode.recordClassIndex(78736);
        }

        private C67133a() {
        }

        public /* synthetic */ C67133a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58259r
    /* renamed from: b */
    public final EnumC58147aa mo58051b() {
        return EnumC58147aa.NORMAL;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: k */
    public final EnumC58148ab mo28611k() {
        return EnumC58148ab.DEFAULT;
    }

    /* renamed from: com.ss.android.ugc.aweme.request_combine.request.a.c$b */
    static final class RunnableC67134b implements Runnable {

        /* renamed from: a */
        public static final RunnableC67134b f150548a = new RunnableC67134b();

        static {
            Covode.recordClassIndex(78737);
        }

        RunnableC67134b() {
        }

        public final void run() {
            int i;
            if (C67132c.f150546a) {
                i = 1;
            } else {
                i = 5;
            }
            C61542b.m111464a(false, i);
            C67132c.f150546a = false;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: h */
    public final String mo28608h() {
        return getClass().getSimpleName();
    }

    static {
        Covode.recordClassIndex(78735);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58259r
    /* renamed from: a */
    public final void mo58050a(Context context, boolean z) {
        C89219l.m154721d(context, "");
        Handler handler = new Handler(Looper.getMainLooper());
        RunnableC67134b bVar = RunnableC67134b.f150548a;
        C89219l.m154721d("fetch_notice_count", "");
        long a = C33748g.m69092a("fetch_notice_count");
        if (a == 60000) {
            a = 0;
        }
        handler.postDelayed(bVar, a);
    }
}
