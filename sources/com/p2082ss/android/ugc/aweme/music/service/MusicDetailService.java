package com.p2082ss.android.ugc.aweme.music.service;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.p2082ss.android.ugc.aweme.music.p3481ui.C61100ah;

/* renamed from: com.ss.android.ugc.aweme.music.service.MusicDetailService */
public class MusicDetailService implements IMusicDetailService {
    static {
        Covode.recordClassIndex(71660);
    }

    /* renamed from: a */
    public static IMusicDetailService m110596a() {
        MethodCollector.m26663i(5968);
        Object a = C81908b.m141854a(IMusicDetailService.class, false);
        if (a != null) {
            IMusicDetailService iMusicDetailService = (IMusicDetailService) a;
            MethodCollector.m26664o(5968);
            return iMusicDetailService;
        }
        if (C81908b.f183265cO == null) {
            synchronized (IMusicDetailService.class) {
                try {
                    if (C81908b.f183265cO == null) {
                        C81908b.f183265cO = new MusicDetailService();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(5968);
                    throw th;
                }
            }
        }
        MusicDetailService musicDetailService = (MusicDetailService) C81908b.f183265cO;
        MethodCollector.m26664o(5968);
        return musicDetailService;
    }

    /* renamed from: b */
    private static Bundle m110597b(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.music.service.IMusicDetailService
    /* renamed from: a */
    public final Fragment mo98580a(Intent intent) {
        if (!MSAdaptionService.m97895c().mo89372a(C17867d.m33078a())) {
            return null;
        }
        Bundle b = m110597b(intent);
        C61100ah ahVar = new C61100ah();
        ahVar.setArguments(b);
        return ahVar;
    }
}
