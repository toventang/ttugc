package com.p2082ss.android.ugc.aweme.p2387bf;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.IKevaPreLoader;
import com.bytedance.keva.KevaBuilder;
import com.bytedance.keva.ext.preload.KevaPreLoader;
import com.p2082ss.android.ugc.aweme.experiment.C46869dz;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import java.io.File;
import java.util.UUID;

/* renamed from: com.ss.android.ugc.aweme.bf.a */
public final class C34818a {

    /* renamed from: a */
    static String f82246a = UUID.randomUUID().toString();

    static {
        Covode.recordClassIndex(41826);
    }

    /* renamed from: b */
    private static File m71153b(Context context) {
        if (C58016d.f132222c != null && C58016d.f132224e) {
            return C58016d.f132222c;
        }
        File filesDir = context.getFilesDir();
        C58016d.f132222c = filesDir;
        return filesDir;
    }

    /* renamed from: a */
    public static void m71152a(Context context) {
        C34822d.m71160a(context, C34820c.m71155a(context));
        KevaBuilder instance = KevaBuilder.getInstance();
        instance.setContext(context);
        instance.setMonitor(new C34819b());
        instance.setPortedRepoName("aweme_ported_sp_repo");
        instance.setExecutor(C40780g.m82241a());
        if (C46869dz.m90180a(context)) {
            instance.setPreLoader(KevaPreLoader.makePreLoader(new File(m71153b(context), "keva"), new KevaPreLoader.PreloadConfig(30000, 100, 604800000), C40780g.m82241a()));
            IKevaPreLoader preLoader = KevaPreLoader.getPreLoader();
            if (preLoader != null) {
                preLoader.preload();
            }
        }
    }
}
