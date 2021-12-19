package com.p2082ss.android.ugc.aweme.services.storage;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2690cr.C40318a;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import java.util.Set;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.services.storage.StorageServiceImpl */
public final class StorageServiceImpl implements IAVStorageService {
    static {
        Covode.recordClassIndex(79980);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.storage.IAVStorageService
    public final void checkStorageClean() {
        if (C40318a.m81469a().getBoolean("key_is_effect_storage_cleaning", false)) {
            C84911q.m145928d("av storage clean not finished last time!!!! effect resources maybe not intact");
            C1731i.m5640b(StorageServiceImpl$checkStorageClean$1.INSTANCE, C1731i.f5562a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.services.storage.IAVStorageService
    public final Set<String> getPrefixAllowList() {
        return C63244g.m114602a().mo73279g().mo69469b().mo69462a();
    }

    @Override // com.p2082ss.android.ugc.aweme.services.storage.IAVStorageService
    public final boolean isMonitorEnabled() {
        return C63244g.m114602a().mo73279g().mo69467a().mo69512a();
    }

    @Override // com.p2082ss.android.ugc.aweme.services.storage.IAVStorageService
    public final void setMonitorLocalSwitch(boolean z) {
        C63244g.m114602a().mo73279g().mo69467a().mo69511a(z);
    }
}
