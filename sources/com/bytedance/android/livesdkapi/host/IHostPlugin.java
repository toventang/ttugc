package com.bytedance.android.livesdkapi.host;

import android.content.Context;
import com.bytedance.android.live.base.AbstractC2953a;
import com.bytedance.covode.number.Covode;

public interface IHostPlugin extends AbstractC2953a {

    /* renamed from: com.bytedance.android.livesdkapi.host.IHostPlugin$a */
    public interface AbstractC11790a {
        static {
            Covode.recordClassIndex(13485);
        }

        /* renamed from: a */
        void mo8919a(String str);
    }

    static {
        Covode.recordClassIndex(13484);
    }

    boolean checkPluginInstalled(String str);

    String getHostModeFilePath();

    String getHostPackageName();

    int getPluginAttributeMinVersion(String str);

    boolean isFull();

    boolean loadLibrary(int i, Context context, String str, String str2, ClassLoader classLoader);

    void preload(String str);
}
