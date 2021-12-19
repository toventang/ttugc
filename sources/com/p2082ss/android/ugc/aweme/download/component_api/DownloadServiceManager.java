package com.p2082ss.android.ugc.aweme.download.component_api;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.download.component_api.service.IDownloadService;
import com.p2082ss.android.ugc.aweme.download.impl.component_impl.DownloadServiceImpl;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.download.component_api.DownloadServiceManager */
public final class DownloadServiceManager {
    public static final DownloadServiceManager INSTANCE = new DownloadServiceManager();
    private static final AbstractC89244h downloadService$delegate = C89250i.m154773a((AbstractC89171a) C43166a.f100597a);
    private static final boolean isAutoRemoveListener = C43172b.m86104a();
    private static final int retryExpCount;

    public final IDownloadService getDownloadService() {
        return (IDownloadService) downloadService$delegate.getValue();
    }

    private DownloadServiceManager() {
    }

    public final int getRetryExpCount() {
        return retryExpCount;
    }

    public final boolean isAutoRemoveListener() {
        return isAutoRemoveListener;
    }

    /* renamed from: com.ss.android.ugc.aweme.download.component_api.DownloadServiceManager$a */
    static final class C43166a extends AbstractC89220m implements AbstractC89171a<IDownloadService> {

        /* renamed from: a */
        public static final C43166a f100597a = new C43166a();

        static {
            Covode.recordClassIndex(51345);
        }

        C43166a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ IDownloadService invoke() {
            return DownloadServiceImpl.m86121b();
        }
    }

    static {
        int i;
        Covode.recordClassIndex(51344);
        if (C43172b.m86104a()) {
            i = 3;
        } else {
            i = 0;
        }
        retryExpCount = i;
    }
}
