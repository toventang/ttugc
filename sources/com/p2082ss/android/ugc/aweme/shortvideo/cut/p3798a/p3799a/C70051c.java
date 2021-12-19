package com.p2082ss.android.ugc.aweme.shortvideo.cut.p3798a.p3799a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import com.p2082ss.android.ugc.aweme.services.IVideo2GifService;
import com.p2082ss.android.vesdk.C85581w;
import java.io.File;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.a.a.c */
public final class C70051c {
    static {
        Covode.recordClassIndex(82471);
    }

    /* renamed from: a */
    public static boolean m123688a(File file) {
        MethodCollector.m26663i(11740);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(11740);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(11740);
        return delete;
    }

    /* renamed from: a */
    static final /* synthetic */ Object m123687a(IVideo2GifService.ConvertListener convertListener, C85581w wVar) {
        convertListener.onDone(false);
        wVar.mo131703j();
        return null;
    }

    /* renamed from: a */
    static final /* synthetic */ Object m123686a(int i, IVideo2GifService.ConvertListener convertListener, float f, C85581w wVar) {
        if (i == 4103) {
            convertListener.onDone(true);
            wVar.mo131703j();
            return null;
        } else if (i != 4105) {
            return null;
        } else {
            convertListener.onUpdateProgress((int) (f * 100.0f));
            return null;
        }
    }
}
