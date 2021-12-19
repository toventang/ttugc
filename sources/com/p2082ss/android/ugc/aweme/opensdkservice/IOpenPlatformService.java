package com.p2082ss.android.ugc.aweme.opensdkservice;

import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.services.external.p3712ui.EditConfig;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.opensdkservice.IOpenPlatformService */
public interface IOpenPlatformService {
    static {
        Covode.recordClassIndex(73532);
    }

    /* renamed from: a */
    void mo100636a();

    /* renamed from: a */
    void mo100637a(Intent intent, HandleMediaListener handleMediaListener);

    /* renamed from: a */
    void mo100638a(Fragment fragment, ArrayList<String> arrayList);

    /* renamed from: a */
    void mo100639a(EditConfig.Builder builder, String str);

    /* renamed from: a */
    void mo100640a(String str, String str2, String str3, String str4);

    /* renamed from: a */
    boolean mo100641a(Intent intent);
}
