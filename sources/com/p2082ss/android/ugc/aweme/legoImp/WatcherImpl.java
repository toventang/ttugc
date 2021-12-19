package com.p2082ss.android.ugc.aweme.legoImp;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.watcher.AbstractC18284b;
import com.bytedance.ies.watcher.C18283a;
import com.bytedance.ies.watcher.IWatcher;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import java.util.HashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.legoImp.WatcherImpl */
public final class WatcherImpl implements IWatcher {
    static {
        Covode.recordClassIndex(68358);
    }

    /* renamed from: com.ss.android.ugc.aweme.legoImp.WatcherImpl$a */
    public static final class C58282a extends C18283a {

        /* renamed from: a */
        public final String[] f132732a = {"extra", "play_count", "share_count", "comment_count", "digg_count", "download_count", "photosensitiveMaskInfo", "reportMaskInfo", "generalMaskInfo", "createTime", "user_count", "view_count"};

        /* renamed from: b */
        public final String[] f132733b = {"tiktokcdn", "/obj/"};

        static {
            Covode.recordClassIndex(68359);
        }

        @Override // com.bytedance.ies.watcher.AbstractC18284b, com.bytedance.ies.watcher.C18283a
        /* renamed from: a */
        public final String[] mo29239a() {
            return this.f132732a;
        }

        C58282a() {
        }

        @Override // com.bytedance.ies.watcher.AbstractC18284b, com.bytedance.ies.watcher.C18283a
        /* renamed from: a */
        public final void mo29238a(String str, long j) {
            C89219l.m154721d(str, "");
            super.mo29238a(str, j);
            HashMap hashMap = new HashMap();
            hashMap.put(str, String.valueOf(j));
            C39162r.m79460a("metrics_watcher", hashMap);
        }
    }

    @Override // com.bytedance.ies.watcher.IWatcher
    /* renamed from: a */
    public final AbstractC18284b mo29237a() {
        return new C58282a();
    }

    /* renamed from: b */
    public static IWatcher m105269b() {
        MethodCollector.m26663i(1476);
        Object a = C81908b.m141854a(IWatcher.class, false);
        if (a != null) {
            IWatcher iWatcher = (IWatcher) a;
            MethodCollector.m26664o(1476);
            return iWatcher;
        }
        if (C81908b.f183289cm == null) {
            synchronized (IWatcher.class) {
                try {
                    if (C81908b.f183289cm == null) {
                        C81908b.f183289cm = new WatcherImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(1476);
                    throw th;
                }
            }
        }
        WatcherImpl watcherImpl = (WatcherImpl) C81908b.f183289cm;
        MethodCollector.m26664o(1476);
        return watcherImpl;
    }
}
