package com.bytedance.ies.xbridge.base.runtime.depend;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import java.util.Map;

public interface IHostUserDepend {

    /* renamed from: com.bytedance.ies.xbridge.base.runtime.depend.IHostUserDepend$a */
    public interface AbstractC18461a {
        static {
            Covode.recordClassIndex(21150);
        }

        /* renamed from: a */
        void mo29425a();

        /* renamed from: b */
        void mo29426b();
    }

    /* renamed from: com.bytedance.ies.xbridge.base.runtime.depend.IHostUserDepend$b */
    public interface AbstractC18462b {
        static {
            Covode.recordClassIndex(21151);
        }

        /* renamed from: a */
        void mo29427a();
    }

    static {
        Covode.recordClassIndex(21149);
    }

    String getAvatarURL();

    String getBoundPhone();

    String getNickname();

    String getSecUid();

    String getUniqueID();

    String getUserId();

    boolean hasLogin();

    void login(Activity activity, AbstractC18461a aVar, Map<String, String> map);

    void logout(Activity activity, AbstractC18462b bVar, Map<String, String> map);
}
