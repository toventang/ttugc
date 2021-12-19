package com.p2082ss.android.ugc.aweme.utils;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.common.utility.C13617h;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p2719cv.C40787l;
import com.p2082ss.android.ugc.aweme.p2719cv.EnumC40793o;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* renamed from: com.ss.android.ugc.aweme.utils.do */
public final class C80352do {

    /* renamed from: a */
    static C80352do f179881a = new C80352do();

    /* renamed from: b */
    ExecutorService f179882b;

    /* renamed from: c */
    public List<String> f179883c;

    /* renamed from: d */
    public final Object f179884d = new Object();

    static {
        Covode.recordClassIndex(93620);
    }

    private C80352do() {
        C40787l.C40788a a = C40787l.m82269a(EnumC40793o.FIXED);
        a.f95505c = 1;
        this.f179882b = C40780g.m82242a(a.mo70028a());
        this.f179883c = new LinkedList();
    }

    /* renamed from: a */
    public final boolean mo123711a(ImageModel imageModel) {
        MethodCollector.m26663i(12073);
        if (imageModel == null || C13617h.m24465a(imageModel.getUrls())) {
            MethodCollector.m26664o(12073);
            return false;
        }
        synchronized (this.f179884d) {
            try {
                for (String str : imageModel.getUrls()) {
                    if (this.f179883c.contains(str)) {
                        return true;
                    }
                }
                MethodCollector.m26664o(12073);
                return false;
            } finally {
                MethodCollector.m26664o(12073);
            }
        }
    }
}
