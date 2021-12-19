package com.p2082ss.android.ugc.aweme.story.live;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.live.ILiveOuterService;
import com.p2082ss.android.ugc.aweme.live.LiveOuterService;
import com.p2082ss.android.ugc.aweme.notice.api.adapter.NoticeLiveServiceAdapter;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.live.NoticeLiveServiceAdapterImpl */
public final class NoticeLiveServiceAdapterImpl implements NoticeLiveServiceAdapter {
    static {
        Covode.recordClassIndex(90378);
    }

    @Override // com.p2082ss.android.ugc.aweme.notice.api.adapter.NoticeLiveServiceAdapter
    /* renamed from: a */
    public final void mo99193a() {
        ILiveOuterService s = LiveOuterService.m107269s();
        C89219l.m154716b(s, "");
        s.mo95829c().mo96131a(true);
    }

    /* renamed from: b */
    public static NoticeLiveServiceAdapter m135243b() {
        MethodCollector.m26663i(10863);
        Object a = C81908b.m141854a(NoticeLiveServiceAdapter.class, false);
        if (a != null) {
            NoticeLiveServiceAdapter noticeLiveServiceAdapter = (NoticeLiveServiceAdapter) a;
            MethodCollector.m26664o(10863);
            return noticeLiveServiceAdapter;
        }
        if (C81908b.f183383em == null) {
            synchronized (NoticeLiveServiceAdapter.class) {
                try {
                    if (C81908b.f183383em == null) {
                        C81908b.f183383em = new NoticeLiveServiceAdapterImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(10863);
                    throw th;
                }
            }
        }
        NoticeLiveServiceAdapterImpl noticeLiveServiceAdapterImpl = (NoticeLiveServiceAdapterImpl) C81908b.f183383em;
        MethodCollector.m26664o(10863);
        return noticeLiveServiceAdapterImpl;
    }
}
