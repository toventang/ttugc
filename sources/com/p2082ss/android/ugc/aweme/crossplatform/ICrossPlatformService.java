package com.p2082ss.android.ugc.aweme.crossplatform;

import android.app.Activity;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.ICrossPlatformService */
public interface ICrossPlatformService {
    static {
        Covode.recordClassIndex(48331);
    }

    /* renamed from: a */
    Class<? extends Activity> mo69601a();

    /* renamed from: a */
    void mo69602a(Context context, Map<String, String> map);

    /* renamed from: b */
    String mo69603b();
}
