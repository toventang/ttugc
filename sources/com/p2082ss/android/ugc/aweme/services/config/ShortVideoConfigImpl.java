package com.p2082ss.android.ugc.aweme.services.config;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.List;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.services.config.ShortVideoConfigImpl */
public final class ShortVideoConfigImpl extends ShortVideoConfigBaseImpl {
    public static final Companion Companion = new Companion(null);
    public static ShortVideoConfigImpl sInstance;

    static {
        Covode.recordClassIndex(79751);
    }

    public static final ShortVideoConfigImpl getInstance() {
        return Companion.getInstance();
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IShortVideoConfig
    public final String cutsameSdkVersion() {
        return "";
    }

    /* renamed from: com.ss.android.ugc.aweme.services.config.ShortVideoConfigImpl$Companion */
    public static final class Companion {
        static {
            Covode.recordClassIndex(79752);
        }

        private Companion() {
        }

        public final ShortVideoConfigImpl getInstance() {
            MethodCollector.m26663i(10756);
            if (ShortVideoConfigImpl.sInstance == null) {
                synchronized (ShortVideoConfigBaseImpl.class) {
                    try {
                        if (ShortVideoConfigImpl.sInstance == null) {
                            ShortVideoConfigImpl.sInstance = new ShortVideoConfigImpl();
                        }
                    } catch (Throwable th) {
                        MethodCollector.m26664o(10756);
                        throw th;
                    }
                }
            }
            ShortVideoConfigImpl shortVideoConfigImpl = ShortVideoConfigImpl.sInstance;
            if (shortVideoConfigImpl == null) {
                C89219l.m154715b();
            }
            MethodCollector.m26664o(10756);
            return shortVideoConfigImpl;
        }

        public /* synthetic */ Companion(C89214g gVar) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IShortVideoConfig
    public final List<String> getBOEBypassHostList() {
        return C89086z.INSTANCE;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IShortVideoConfig
    public final List<String> getBOEBypassPathList() {
        return C89086z.INSTANCE;
    }
}
