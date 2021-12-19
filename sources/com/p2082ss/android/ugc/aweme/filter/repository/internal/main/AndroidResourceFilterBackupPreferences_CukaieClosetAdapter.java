package com.p2082ss.android.ugc.aweme.filter.repository.internal.main;

import com.bytedance.covode.number.Covode;
import com.bytedance.cukaie.closet.AbstractC14409e;
import com.bytedance.cukaie.closet.internal.AbstractC14412a;

/* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.main.AndroidResourceFilterBackupPreferences_CukaieClosetAdapter */
public final class AndroidResourceFilterBackupPreferences_CukaieClosetAdapter extends AbstractC14412a implements AndroidResourceFilterBackupPreferences {
    static {
        Covode.recordClassIndex(59919);
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.repository.internal.main.AndroidResourceFilterBackupPreferences
    public final int getResourcesVersion() {
        return super.getStore().mo23220a("resources_version", 0);
    }

    public AndroidResourceFilterBackupPreferences_CukaieClosetAdapter(AbstractC14409e eVar) {
        super(eVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.repository.internal.main.AndroidResourceFilterBackupPreferences
    public final void setResourcesVersion(int i) {
        super.getStore().mo23228b("resources_version", i);
    }
}
