package com.bytedance.android.live.core.p218f;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.livesetting.performance.ThreadPoolOptExperiment;
import com.bytedance.common.utility.C13617h;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p2719cv.C40787l;
import com.p2082ss.android.ugc.aweme.p2719cv.EnumC40793o;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* renamed from: com.bytedance.android.live.core.f.o */
public final class C3949o {

    /* renamed from: a */
    static C3949o f10850a = new C3949o();

    /* renamed from: b */
    ExecutorService f10851b;

    /* renamed from: c */
    public List<String> f10852c;

    /* renamed from: d */
    public final Object f10853d = new Object();

    static {
        Covode.recordClassIndex(4478);
    }

    private C3949o() {
        if (!ThreadPoolOptExperiment.INSTANCE.isEnableAll()) {
            C40787l.C40788a a = C40787l.m82269a(EnumC40793o.FIXED);
            a.f95505c = 1;
            this.f10851b = C40780g.m82242a(a.mo70028a());
        }
        this.f10852c = new LinkedList();
    }

    /* renamed from: a */
    public final boolean mo9299a(ImageModel imageModel) {
        MethodCollector.m26663i(12157);
        if (imageModel == null || C13617h.m24465a(imageModel.getUrls())) {
            MethodCollector.m26664o(12157);
            return false;
        }
        synchronized (this.f10853d) {
            try {
                for (String str : imageModel.getUrls()) {
                    if (this.f10852c.contains(str)) {
                        return true;
                    }
                }
                MethodCollector.m26664o(12157);
                return false;
            } finally {
                MethodCollector.m26664o(12157);
            }
        }
    }
}
