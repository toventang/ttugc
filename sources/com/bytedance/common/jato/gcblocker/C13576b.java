package com.bytedance.common.jato.gcblocker;

import android.os.Build;
import com.bytedance.common.jato.C13556d;
import com.bytedance.common.jato.Jato;
import com.bytedance.common.jato.p903b.C13532b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.File;

/* renamed from: com.bytedance.common.jato.gcblocker.b */
public class C13576b {

    /* renamed from: a */
    private static volatile AbstractC13575a f33018a;

    static {
        Covode.recordClassIndex(15595);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.common.jato.gcblocker.b$a */
    public static class C13577a extends AbstractC13575a {
        static {
            Covode.recordClassIndex(15596);
        }

        @Override // com.bytedance.common.jato.gcblocker.AbstractC13575a
        /* renamed from: a */
        public final void mo21843a(long j) {
        }

        @Override // com.bytedance.common.jato.gcblocker.AbstractC13575a
        /* renamed from: a */
        public final void mo21844a(String str) {
        }

        @Override // com.bytedance.common.jato.gcblocker.AbstractC13575a
        /* renamed from: b */
        public final void mo21845b(String str) {
        }

        private C13577a() {
        }

        /* synthetic */ C13577a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public static AbstractC13575a m24384a() {
        MethodCollector.m26663i(10059);
        if (f33018a == null) {
            synchronized (C13576b.class) {
                try {
                    if (f33018a == null) {
                        if (!(!new File("/data/local/tmp/disable-gcblocker").exists())) {
                            f33018a = new C13577a((byte) 0);
                        } else if (!C13556d.m24356a()) {
                            f33018a = new C13577a((byte) 0);
                        } else if (Jato.getConfig().f32922a && !C13532b.m24311c() && Build.VERSION.SDK_INT == 19) {
                            f33018a = new DvmGcBlocker();
                        } else if (!Jato.getConfig().f32923b || Build.VERSION.SDK_INT < 24) {
                            f33018a = new C13577a((byte) 0);
                        } else {
                            f33018a = new GcBlocker();
                        }
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(10059);
                    throw th;
                }
            }
        }
        AbstractC13575a aVar = f33018a;
        MethodCollector.m26664o(10059);
        return aVar;
    }
}
