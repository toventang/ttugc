package com.p2082ss.android.account.share.data.read;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.account.share.data.C29356a;
import java.util.HashSet;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.account.share.data.read.b */
public final class C29359b {

    /* renamed from: a */
    static Context f69697a;

    /* renamed from: b */
    public static final C29359b f69698b = new C29359b();

    /* renamed from: c */
    private static Handler f69699c = new Handler(Looper.getMainLooper());

    /* renamed from: d */
    private static boolean f69700d;

    /* renamed from: e */
    private static HashSet<String> f69701e = new HashSet<>();

    /* renamed from: f */
    private static Runnable f69702f = RunnableC29360a.f69703a;

    private C29359b() {
    }

    /* renamed from: com.ss.android.account.share.data.read.b$a */
    static final class RunnableC29360a implements Runnable {

        /* renamed from: a */
        public static final RunnableC29360a f69703a = new RunnableC29360a();

        static {
            Covode.recordClassIndex(35749);
        }

        RunnableC29360a() {
        }

        public final void run() {
            C29356a.m58786a().mo51314a("share_sdk_read_time_out").mo51316b();
            C29359b.m58791a(new C29358a("", false, "time out", 8, (byte) 0));
        }
    }

    static {
        Covode.recordClassIndex(35748);
    }

    /* renamed from: a */
    public static void m58791a(C29358a aVar) {
        C89219l.m154719c(aVar, "");
        if (!f69700d) {
            f69701e.remove(aVar.f69693c);
            if (aVar.f69694d && !TextUtils.isEmpty(aVar.f69692b)) {
                m58792b(aVar);
            } else if (TextUtils.isEmpty(aVar.f69693c)) {
                m58792b(aVar);
            } else if (f69701e.isEmpty()) {
                m58792b(aVar);
            }
        }
    }

    /* renamed from: b */
    private static void m58792b(C29358a aVar) {
        C89219l.m154719c(aVar, "");
        f69700d = true;
        f69699c.removeCallbacks(f69702f);
        C29356a.m58786a().mo51314a("share_sdk_read_result").mo51315a("is_succ", Boolean.valueOf(aVar.f69694d)).mo51315a("err_msg", aVar.f69695e).mo51315a("query_type", Integer.valueOf(aVar.f69696f)).mo51315a("pkg_name", aVar.f69693c).mo51316b();
    }
}
