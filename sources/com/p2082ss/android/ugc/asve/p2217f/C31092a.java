package com.p2082ss.android.ugc.asve.p2217f;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.asve.f.a */
public final class C31092a {

    /* renamed from: b */
    public static volatile C31092a f74508b;

    /* renamed from: c */
    public static final C31093a f74509c = new C31093a((byte) 0);

    /* renamed from: a */
    public final SharedPreferences f74510a;

    static {
        Covode.recordClassIndex(37731);
    }

    /* renamed from: com.ss.android.ugc.asve.f.a$a */
    public static final class C31093a {
        static {
            Covode.recordClassIndex(37732);
        }

        private C31093a() {
        }

        public /* synthetic */ C31093a(byte b) {
            this();
        }

        /* renamed from: a */
        public static C31092a m64295a(Context context) {
            MethodCollector.m26663i(6097);
            C89219l.m154721d(context, "");
            if (C31092a.f74508b == null) {
                synchronized (C89204ab.m154669a(C31092a.class)) {
                    try {
                        if (C31092a.f74508b == null) {
                            C31092a.f74508b = new C31092a(context, (byte) 0);
                        }
                    } catch (Throwable th) {
                        MethodCollector.m26664o(6097);
                        throw th;
                    }
                }
            }
            C31092a aVar = C31092a.f74508b;
            if (aVar == null) {
                C89219l.m154715b();
            }
            MethodCollector.m26664o(6097);
            return aVar;
        }
    }

    /* renamed from: a */
    public final int mo56515a() {
        return this.f74510a.getInt("key_camera_wide_mode", 0);
    }

    /* renamed from: b */
    public final int mo56517b() {
        return this.f74510a.getInt("key_camera_shake_mode", 0);
    }

    private C31092a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            applicationContext = C58003a.f132199a;
        }
        SharedPreferences a = C34822d.m71158a(applicationContext, "asve_sp", 0);
        C89219l.m154716b(a, "");
        this.f74510a = a;
    }

    /* renamed from: a */
    public final void mo56516a(int i) {
        this.f74510a.edit().putInt("key_camera_wide_mode", i).apply();
    }

    /* renamed from: b */
    public final void mo56518b(int i) {
        this.f74510a.edit().putInt("key_camera_shake_mode", i).apply();
    }

    public /* synthetic */ C31092a(Context context, byte b) {
        this(context);
    }
}
