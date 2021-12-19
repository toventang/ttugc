package com.p2082ss.android.ugc.aweme.property;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.provider.Settings;
import com.bytedance.covode.number.Covode;
import com.bytedance.sysoptimizer.java.ResourcesProtector;
import com.p2082ss.android.common.util.C29843f;
import com.p2082ss.android.ugc.aweme.utils.C80322d;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.property.i */
public final class C65476i {

    /* renamed from: a */
    private static final AbstractC89244h f147672a = C89250i.m154773a((AbstractC89171a) C65477a.f147673a);

    /* renamed from: b */
    private static float m117207b() {
        return ((Number) f147672a.getValue()).floatValue();
    }

    static {
        Covode.recordClassIndex(76963);
    }

    /* renamed from: com.ss.android.ugc.aweme.property.i$a */
    static final class C65477a extends AbstractC89220m implements AbstractC89171a<Float> {

        /* renamed from: a */
        public static final C65477a f147673a = new C65477a();

        static {
            Covode.recordClassIndex(76964);
        }

        C65477a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Float invoke() {
            float a = C65476i.m117203a();
            C80322d.m139251a("tool_performance_brightness", new C84425b().mo129405a("max_brightness", Float.valueOf(a)).f188764a);
            return Float.valueOf(a);
        }
    }

    /* renamed from: a */
    public static final float m117203a() {
        if (!C29843f.m60136c() && !C65487m.m117215a()) {
            return 255.0f;
        }
        try {
            Resources system = Resources.getSystem();
            int identifier = system.getIdentifier("config_screenBrightnessSettingMaximum", "integer", "android");
            if (identifier != 0) {
                return (float) m117205a(system, identifier);
            }
            return 255.0f;
        } catch (Exception unused) {
            return -1.0f;
        }
    }

    /* renamed from: a */
    private static final int m117204a(Context context) {
        ContentResolver contentResolver;
        if (context != null) {
            try {
                contentResolver = context.getContentResolver();
            } catch (Exception unused) {
                return -1;
            }
        } else {
            contentResolver = null;
        }
        return Settings.System.getInt(contentResolver, "screen_brightness");
    }

    /* renamed from: a */
    private static int m117205a(Resources resources, int i) {
        ResourcesProtector.Config matchConfig = ResourcesProtector.getMatchConfig(i);
        if (matchConfig == null) {
            return resources.getInteger(i);
        }
        try {
            if (!matchConfig.mockCrash) {
                return resources.getInteger(i);
            }
            throw new Resources.NotFoundException("unknown resource from mocked");
        } catch (Throwable th) {
            StackTraceElement[] stackTrace = th.getStackTrace();
            int min = Math.min(stackTrace.length, matchConfig.mMaxStep);
            for (int i2 = 0; i2 < min; i2++) {
                StackTraceElement stackTraceElement = stackTrace[i2];
                if (stackTraceElement != null) {
                    if (matchConfig.mProtectClassName.equals(stackTraceElement.getClassName())) {
                        if (matchConfig.mProtectMethodName.equals(stackTraceElement.getMethodName())) {
                            return matchConfig.mReturnIdWhenException;
                        }
                    } else {
                        continue;
                    }
                }
            }
            return resources.getInteger(i);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0079 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00a7  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m117206a(androidx.fragment.app.ActivityC0945e r10, com.p2082ss.android.ugc.aweme.property.AbstractC65488n r11) {
        /*
        // Method dump skipped, instructions count: 246
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.property.C65476i.m117206a(androidx.fragment.app.e, com.ss.android.ugc.aweme.property.n):void");
    }
}
