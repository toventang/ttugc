package com.p2082ss.android.ugc.aweme.publish.core.uploader.p3615a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import com.p2082ss.bduploader.BDUploadUtil;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.ss.android.ugc.aweme.publish.core.uploader.a.a */
public final class C65525a {

    /* renamed from: a */
    public static final C65525a f147759a = new C65525a();

    /* renamed from: b */
    private static AtomicBoolean f147760b = new AtomicBoolean(false);

    private C65525a() {
    }

    static {
        Covode.recordClassIndex(77015);
    }

    /* renamed from: a */
    public static void m117255a() {
        if (f147760b.compareAndSet(false, true)) {
            BDUploadUtil.setSDKConfigDir(m117256b());
        }
    }

    /* renamed from: b */
    private static String m117256b() {
        String c = C63244g.m114602a().mo73279g().mo69470c().mo69477c("upload-config-dir");
        File g = C63244g.m114602a().mo73279g().mo69470c().mo69481g(c);
        if (!g.exists() && !g.mkdirs()) {
            C84911q.m145923a("upload-config-dir", new Throwable("create upload config dir failed!"));
        }
        return c;
    }

    /* renamed from: a */
    public static int m117254a(int i) {
        C63244g.m114602a().mo73287o().mo104789i().mo104814a();
        return i;
    }
}
