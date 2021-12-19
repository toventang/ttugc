package com.p2082ss.android.ugc.aweme.effect;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.ServiceLifecycle;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import java.io.File;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.effect.EffectJobService */
public class EffectJobService extends Service {
    static {
        Covode.recordClassIndex(54825);
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        ServiceLifecycle.onStartCommand(this, intent, i, i2);
        return 2;
    }

    /* renamed from: a */
    static final /* synthetic */ Object m89250a() {
        try {
            AVExternalServiceImpl.m113114a().configService().cacheConfig().clearDraftEffectCache();
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public void onCreate() {
        String effectCacheDir = AVExternalServiceImpl.m113114a().configService().cacheConfig().effectCacheDir();
        if (!TextUtils.isEmpty(effectCacheDir) && new File(effectCacheDir).list() != null && new File(effectCacheDir).list().length != 0) {
            C1731i.m5640b(CallableC46367p.f108065a, C40780g.m82241a()).mo5543c(new C46368q(this), C1731i.f5564c);
        }
    }

    public IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
