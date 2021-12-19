package com.p2082ss.android.ugc.aweme.services.storage;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2690cr.p2705h.AbstractC40385a;
import com.p2082ss.android.ugc.aweme.p2690cr.p2705h.AbstractC40387b;
import com.p2082ss.android.ugc.aweme.p2690cr.p2705h.AbstractC40389c;
import com.p2082ss.android.ugc.aweme.p2690cr.p2705h.AbstractC40390d;
import com.p2082ss.android.ugc.aweme.p2690cr.p2705h.AbstractC40391e;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;

/* renamed from: com.ss.android.ugc.aweme.services.storage.AVStorageManagerImpl */
public final class AVStorageManagerImpl implements AbstractC40385a {
    private final AbstractC89244h allowListService$delegate = C89250i.m154773a((AbstractC89171a) AVStorageManagerImpl$allowListService$2.INSTANCE);
    private final AbstractC89244h fileProvider$delegate = C89250i.m154773a((AbstractC89171a) AVStorageManagerImpl$fileProvider$2.INSTANCE);
    private final AbstractC89244h monitor$delegate = C89250i.m154773a((AbstractC89171a) AVStorageManagerImpl$monitor$2.INSTANCE);
    private final AbstractC89244h persistedAllowListManager$delegate = C89250i.m154773a((AbstractC89171a) AVStorageManagerImpl$persistedAllowListManager$2.INSTANCE);

    static {
        Covode.recordClassIndex(79974);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2690cr.p2705h.AbstractC40385a
    public final AbstractC40391e getAllowListService() {
        return (AbstractC40391e) this.allowListService$delegate.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.p2690cr.p2705h.AbstractC40385a
    public final AbstractC40389c getFileProvider() {
        return (AbstractC40389c) this.fileProvider$delegate.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.p2690cr.p2705h.AbstractC40385a
    public final AbstractC40387b getMonitor() {
        return (AbstractC40387b) this.monitor$delegate.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.p2690cr.p2705h.AbstractC40385a
    public final AbstractC40390d getPersistedAllowListManager() {
        return (AbstractC40390d) this.persistedAllowListManager$delegate.getValue();
    }
}
