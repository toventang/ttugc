package com.p2082ss.android.ugc.aweme.filter.repository.internal.main;

import com.bytedance.covode.number.Covode;
import com.bytedance.cukaie.closet.AbstractC14409e;
import com.bytedance.cukaie.closet.internal.AbstractC14413b;

/* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.main.AndroidResourceFilterBackupPreferences_CukaieClosetFactory */
public final class AndroidResourceFilterBackupPreferences_CukaieClosetFactory implements AbstractC14413b {
    static {
        Covode.recordClassIndex(59920);
    }

    @Override // com.bytedance.cukaie.closet.internal.AbstractC14413b
    public final String closetName() {
        return "VideoRecord";
    }

    @Override // com.bytedance.cukaie.closet.internal.AbstractC14413b
    public final Object createCloset(AbstractC14409e eVar) {
        return new AndroidResourceFilterBackupPreferences_CukaieClosetAdapter(eVar);
    }
}
