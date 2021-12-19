package com.p2082ss.android.ugc.aweme;

import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.profile.ProfileServiceImpl;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.widget.C64382o;
import com.p2082ss.android.ugc.aweme.services.IToolsProfileService;

/* renamed from: com.ss.android.ugc.aweme.di */
public final class C41482di implements IToolsProfileService {
    static {
        Covode.recordClassIndex(49381);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IToolsProfileService
    public final Fragment getSelectMyVideoFragment() {
        new ProfileServiceImpl();
        return new C64382o();
    }
}
