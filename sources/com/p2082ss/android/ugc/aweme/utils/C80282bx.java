package com.p2082ss.android.ugc.aweme.utils;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.common.util.C29843f;
import com.p2082ss.android.deviceregister.DeviceRegisterManager;
import com.p2082ss.android.ugc.aweme.app.p2324e.p2325a.C33732b;
import com.p2082ss.android.ugc.aweme.commercialize.download.depend.DownloadConfigDepend;
import com.p2082ss.android.ugc.aweme.commercialize.download.depend.DownloadMonitorLogSender;
import com.p2082ss.android.ugc.aweme.download.component_api.depend.IDownloadSdkMonitorDepend;
import com.p2082ss.android.ugc.aweme.download.component_api.service.IDownloadService;
import com.p2082ss.android.ugc.aweme.download.impl.component_impl.DownloadServiceImpl;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.ss.android.ugc.aweme.utils.bx */
public final class C80282bx {

    /* renamed from: a */
    private static final AtomicBoolean f179803a = new AtomicBoolean(false);

    static {
        Covode.recordClassIndex(93550);
    }

    /* renamed from: a */
    public static void m139181a(Context context) {
        IDownloadService b;
        MethodCollector.m26663i(9614);
        AtomicBoolean atomicBoolean = f179803a;
        if (atomicBoolean.get()) {
            MethodCollector.m26664o(9614);
            return;
        }
        synchronized (atomicBoolean) {
            try {
                if (atomicBoolean.compareAndSet(false, true) && (b = DownloadServiceImpl.m86121b()) != null) {
                    b.mo73438a(context, new DownloadMonitorLogSender(), new DownloadConfigDepend());
                    if (C29843f.m60129a(context)) {
                        b.mo73439a(new IDownloadSdkMonitorDepend() {
                            /* class com.p2082ss.android.ugc.aweme.utils.C80282bx.C802831 */

                            static {
                                Covode.recordClassIndex(93551);
                            }

                            @Override // com.p2082ss.android.ugc.aweme.download.component_api.depend.IDownloadSdkMonitorDepend
                            public final String getChannel() {
                                return C17867d.f42595s;
                            }

                            @Override // com.p2082ss.android.ugc.aweme.download.component_api.depend.IDownloadSdkMonitorDepend
                            public final String[] getMonitorHosts() {
                                return C33732b.f79896a;
                            }

                            @Override // com.p2082ss.android.ugc.aweme.download.component_api.depend.IDownloadSdkMonitorDepend
                            public final String getAppVersionName() {
                                return C17867d.m33085f();
                            }

                            @Override // com.p2082ss.android.ugc.aweme.download.component_api.depend.IDownloadSdkMonitorDepend
                            public final Context getContext() {
                                return C17867d.m33078a();
                            }

                            @Override // com.p2082ss.android.ugc.aweme.download.component_api.depend.IDownloadSdkMonitorDepend
                            public final String getDeviceId() {
                                return DeviceRegisterManager.getDeviceId();
                            }

                            @Override // com.p2082ss.android.ugc.aweme.download.component_api.depend.IDownloadSdkMonitorDepend
                            public final long getUpdateVersionCode() {
                                return C17867d.m33083d();
                            }

                            @Override // com.p2082ss.android.ugc.aweme.download.component_api.depend.IDownloadSdkMonitorDepend
                            public final String getAid() {
                                return new StringBuilder().append(C17867d.f42590n).toString();
                            }

                            @Override // com.p2082ss.android.ugc.aweme.download.component_api.depend.IDownloadSdkMonitorDepend
                            public final String getPackageName() {
                                return C17867d.m33078a().getPackageName();
                            }
                        });
                    }
                }
            } finally {
                MethodCollector.m26664o(9614);
            }
        }
    }
}
