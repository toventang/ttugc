package com.bytedance.tiktok.homepage.mainpagefragment.notification;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.discover.tooltip.NotificationCountViewService;

public final class NotificationCountViewManager {

    /* renamed from: a */
    public static AbstractC22854a f53973a;

    /* renamed from: b */
    public static final Companion f53974b = new Companion((byte) 0);

    static {
        Covode.recordClassIndex(26752);
    }

    public static final class Companion {
        static {
            Covode.recordClassIndex(26753);
        }

        private Companion() {
        }

        public static final class NotificationCountViewServiceImpl implements NotificationCountViewService {
            static {
                Covode.recordClassIndex(26754);
            }

            @Override // com.p2082ss.android.ugc.aweme.discover.tooltip.NotificationCountViewService
            /* renamed from: a */
            public final void mo37163a() {
                AbstractC22854a aVar = NotificationCountViewManager.f53973a;
                if (aVar != null) {
                    aVar.mo37166a();
                }
            }

            @Override // com.p2082ss.android.ugc.aweme.discover.tooltip.NotificationCountViewService
            /* renamed from: b */
            public final void mo37164b() {
                AbstractC22854a aVar = NotificationCountViewManager.f53973a;
                if (aVar != null) {
                    aVar.mo37167b();
                }
            }

            @Override // com.p2082ss.android.ugc.aweme.discover.tooltip.NotificationCountViewService
            /* renamed from: c */
            public final void mo37165c() {
                AbstractC22854a aVar = NotificationCountViewManager.f53973a;
                if (aVar != null) {
                    aVar.mo37168c();
                }
            }

            /* renamed from: d */
            public static NotificationCountViewService m43072d() {
                MethodCollector.m26663i(6355);
                Object a = C81908b.m141854a(NotificationCountViewService.class, false);
                if (a != null) {
                    NotificationCountViewService notificationCountViewService = (NotificationCountViewService) a;
                    MethodCollector.m26664o(6355);
                    return notificationCountViewService;
                }
                if (C81908b.f183398g == null) {
                    synchronized (NotificationCountViewService.class) {
                        try {
                            if (C81908b.f183398g == null) {
                                C81908b.f183398g = new NotificationCountViewServiceImpl();
                            }
                        } catch (Throwable th) {
                            MethodCollector.m26664o(6355);
                            throw th;
                        }
                    }
                }
                NotificationCountViewServiceImpl notificationCountViewServiceImpl = (NotificationCountViewServiceImpl) C81908b.f183398g;
                MethodCollector.m26664o(6355);
                return notificationCountViewServiceImpl;
            }
        }

        public /* synthetic */ Companion(byte b) {
            this();
        }
    }
}
