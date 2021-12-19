package com.p2082ss.android.account.share.data.write;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.account.share.data.write.a */
public final class C29361a {

    /* renamed from: c */
    public static C29361a f69704c;

    /* renamed from: d */
    public static final C29362a f69705d = new C29362a((byte) 0);

    /* renamed from: a */
    public final String f69706a = "account_sec_share_data";

    /* renamed from: b */
    public final Context f69707b;

    static {
        Covode.recordClassIndex(35750);
    }

    /* renamed from: com.ss.android.account.share.data.write.a$a */
    public static final class C29362a {
        static {
            Covode.recordClassIndex(35751);
        }

        private C29362a() {
        }

        public /* synthetic */ C29362a(byte b) {
            this();
        }

        /* renamed from: a */
        public static C29361a m58794a(Context context) {
            MethodCollector.m26663i(460);
            C89219l.m154719c(context, "");
            if (C29361a.f69704c == null) {
                synchronized (C29361a.class) {
                    try {
                        if (C29361a.f69704c == null) {
                            Context applicationContext = context.getApplicationContext();
                            if (C58003a.f132201c) {
                                if (applicationContext == null) {
                                    applicationContext = C58003a.f132199a;
                                }
                            }
                            C89219l.m154709a((Object) applicationContext, "");
                            C29361a.f69704c = new C29361a(applicationContext);
                        }
                    } catch (Throwable th) {
                        MethodCollector.m26664o(460);
                        throw th;
                    }
                }
            }
            C29361a aVar = C29361a.f69704c;
            if (aVar == null) {
                C89219l.m154707a();
            }
            MethodCollector.m26664o(460);
            return aVar;
        }
    }

    public C29361a(Context context) {
        C89219l.m154719c(context, "");
        this.f69707b = context;
    }

    /* renamed from: a */
    public final String mo51330a(String str) {
        C89219l.m154719c(str, "");
        SharedPreferences a = C34822d.m71158a(this.f69707b, this.f69706a, 0);
        C89219l.m154709a((Object) a, "");
        return a.getString(str, "");
    }
}
