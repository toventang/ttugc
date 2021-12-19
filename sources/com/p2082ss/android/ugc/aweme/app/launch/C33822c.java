package com.p2082ss.android.ugc.aweme.app.launch;

import android.content.Context;
import android.os.AsyncTask;
import com.bytedance.common.utility.C13627m;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.p907b.C13586a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.ies.ugc.statisticlogger.C18205a;
import com.bytedance.ies.ugc.statisticlogger.config.C18220b;
import com.bytedance.ies.ugc.statisticlogger.config.EnumC18224c;
import com.bytedance.ttnet.utils.C22966b;
import com.p2082ss.android.common.applog.AppLog;
import com.p2082ss.android.ugc.aweme.lego.C58195d;
import java.util.Map;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4567d.AbstractC88438k;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.app.launch.c */
public final class C33822c {
    static {
        Covode.recordClassIndex(40722);
    }

    /* renamed from: com.ss.android.ugc.aweme.app.launch.c$c */
    public static final class AsyncTaskC33825c extends AsyncTask<Void, Void, Void> {

        /* renamed from: a */
        final /* synthetic */ Context f80071a;

        static {
            Covode.recordClassIndex(40725);
        }

        AsyncTaskC33825c(Context context) {
            this.f80071a = context;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            C89219l.m154721d(voidArr, "");
            Context context = this.f80071a;
            Map<String, String> b = C18205a.m33879b();
            if (context == null) {
                return null;
            }
            Logger.debug();
            try {
                C22966b.m43298a(context, 1, C13627m.m24496a(b));
                return null;
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.launch.c$a */
    static final class C33823a<T> implements AbstractC88438k {

        /* renamed from: a */
        public static final C33823a f80069a = new C33823a();

        static {
            Covode.recordClassIndex(40723);
        }

        C33823a() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88438k
        /* renamed from: a */
        public final /* synthetic */ boolean mo7718a(Object obj) {
            C89219l.m154721d(obj, "");
            if (obj == EnumC18224c.Local) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: a */
    public static final void m69185a(Context context) {
        C89219l.m154721d(context, "");
        C18220b.f43409a.mo143268a(C33823a.f80069a).mo143278b(C88391a.m153580a(C88392a.f200660a)).mo143289d(new C33824b(context));
    }

    /* renamed from: com.ss.android.ugc.aweme.app.launch.c$b */
    static final class C33824b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ Context f80070a;

        static {
            Covode.recordClassIndex(40724);
        }

        C33824b(Context context) {
            this.f80070a = context;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: com.bytedance.common.utility.b.a$a */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Context context = this.f80070a;
            if (!C58195d.m105112e() && C17873f.m33102j() == null) {
                System.currentTimeMillis();
            }
            if (!C13627m.m24498a(AppLog.getClientId()) && !C13627m.m24498a(C18205a.m33878a())) {
                C13586a.f33031a.mo21852a(new AsyncTaskC33825c(context), new Void[0]);
            }
        }
    }
}
