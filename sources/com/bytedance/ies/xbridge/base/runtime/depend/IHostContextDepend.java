package com.bytedance.ies.xbridge.base.runtime.depend;

import android.app.Application;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.base.runtime.p1292a.C18419a;
import com.bytedance.ies.xbridge.base.runtime.p1292a.C18420b;
import java.util.List;

public interface IHostContextDepend {
    public static final C18452a Companion = C18452a.f44089a;

    static {
        Covode.recordClassIndex(21130);
    }

    int getAppId();

    String getAppName();

    Application getApplication();

    Context getApplicationContext();

    String getBoeChannel();

    String getChannel();

    String getCurrentTelcomCarrier();

    String getDeviceId();

    String getLanguage();

    String getPPEChannel();

    String getPackageName();

    List<C18420b> getSettings(List<C18419a> list);

    String getSkinName();

    String getSkinType();

    String getUpdateVersion();

    long getVersionCode();

    String getVersionName();

    boolean isBoeEnable();

    boolean isDebuggable();

    boolean isPPEEnable();

    boolean isTeenMode();

    /* renamed from: com.bytedance.ies.xbridge.base.runtime.depend.IHostContextDepend$a */
    public static final class C18452a {

        /* renamed from: a */
        static final /* synthetic */ C18452a f44089a = new C18452a();

        private C18452a() {
        }

        static {
            Covode.recordClassIndex(21131);
        }
    }
}
