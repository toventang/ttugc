package com.p2082ss.android.ugc.aweme.initializer;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.aweme.services.IStorageManagerService;

/* renamed from: com.ss.android.ugc.aweme.initializer.StorageManagerService */
public final class StorageManagerService implements IStorageManagerService {

    /* renamed from: a */
    public static final C56767a f129323a = new C56767a((byte) 0);

    static {
        Covode.recordClassIndex(66631);
    }

    /* renamed from: com.ss.android.ugc.aweme.initializer.StorageManagerService$a */
    public static final class C56767a {
        static {
            Covode.recordClassIndex(66632);
        }

        private C56767a() {
        }

        public /* synthetic */ C56767a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IStorageManagerService
    public final void launchDiskManagerActivity() {
        SmartRouter.buildRoute(C17867d.m33078a(), "//setting/diskmanager").addFlags(268435456).open();
    }
}
