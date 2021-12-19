package com.p2082ss.android.ugc.aweme.crossplatform.view;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.crossplatform.activity.AbstractC40547m;
import com.p2082ss.android.ugc.aweme.crossplatform.p2706a.AbstractC40521c;
import com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.AbstractC40690d;
import com.p2082ss.android.ugc.aweme.p2355ax.p2356a.C34337k;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.view.a */
public interface AbstractC40735a extends AbstractC40521c {
    static {
        Covode.recordClassIndex(48587);
    }

    /* renamed from: a */
    <T extends AbstractC40745i> T mo69911a(Class<T> cls);

    /* renamed from: a */
    void mo69913a(Activity activity);

    /* renamed from: a */
    boolean mo69922a();

    /* renamed from: b */
    void mo69923b(Activity activity);

    /* renamed from: c */
    void mo69925c();

    /* renamed from: c */
    void mo69926c(Activity activity);

    /* renamed from: d */
    void mo69928d(Activity activity);

    String getCurrentUrl();

    C34337k getMonitorSession();

    C40742g getViewStatusRegistry();

    void setCrossPlatformActivityContainer(AbstractC40547m mVar);

    void setFullScreen(AbstractC40690d dVar);
}
