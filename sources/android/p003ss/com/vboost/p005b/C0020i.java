package android.p003ss.com.vboost.p005b;

import android.content.Context;
import android.os.Build;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.covode.number.Covode;
import java.io.File;

/* renamed from: android.ss.com.vboost.b.i */
public class C0020i implements AbstractC0012c {

    /* renamed from: a */
    private static final String f76a = C0020i.class.getSimpleName();

    /* renamed from: b */
    private static C0019h f77b = null;

    /* renamed from: c */
    private static boolean f78c = false;

    /* renamed from: d */
    private static int[] f79d = {1077936128, 1, 1086324736, 1, 1082130432, 4095, 1082130688, 4095, 1082130944, 4095, 1098907648, 255, 1119944704, 1, 1124073472, 255, 1128267776, 65535, 1115799552, LiveNetAdaptiveHurryTimeSetting.DEFAULT, 1115734016, 1000};

    /* renamed from: e */
    private static int[] f80e = {1077936128, 1, 1086324736, 1, 1082130432, 4095, 1082130688, 4095, 1098907648, 255, 1119944704, 1, 1124073472, 255, 1128267776, 65535, 1115799552, LiveNetAdaptiveHurryTimeSetting.DEFAULT, 1115734016, 1000};

    /* renamed from: f */
    private static int[] f81f = {1077936128, 1, 1086324736, 1, 1082130432, 4095, 1082130688, 4095, 1098907648, 255, 1119944704, 1, 1124073472, 255, 1128267776, 65535, 1115799552, 1, 1115734016, 1000};

    /* renamed from: g */
    private static int[] f82g = {1077936128, 1, 1086324736, 1, 1082130432, 4095, 1082130688, 4095, 1098907648, 255, 1119944704, 1};

    /* renamed from: h */
    private static int[] f83h = {1077936128, 1, 1086324736, 1, 1090519040, 4, 1090519296, 4, 1082130432, 4095, 1082130688, 4095, 1098907648, 255};

    /* renamed from: i */
    private static int[] f84i;

    /* renamed from: j */
    private static int[] f85j;

    /* renamed from: k */
    private static int[] f86k = {1077936128, 1, 1115799552, LiveNetAdaptiveHurryTimeSetting.DEFAULT, 1115734016, 1000};

    /* renamed from: l */
    private static int[] f87l = {1082146816, 4095};

    @Override // android.p003ss.com.vboost.p005b.AbstractC0012c
    /* renamed from: b */
    public final void mo13b() {
        C0019h hVar = f77b;
        if (hVar != null) {
            hVar.mo21a();
        }
    }

    @Override // android.p003ss.com.vboost.p005b.AbstractC0012c
    /* renamed from: a */
    public final void mo10a() {
        C0019h hVar = f77b;
        if (hVar != null) {
            hVar.mo22a(30000, f85j);
            f78c = true;
        }
    }

    static {
        Covode.recordClassIndex(23);
        int[] iArr = {1077936128, 1, 1086324736, 1, 1082130432, 4095, 1082130688, 4095, 1098907648, 255, 1119944704, 1};
        f84i = iArr;
        f85j = iArr;
    }

    @Override // android.p003ss.com.vboost.p005b.AbstractC0012c
    /* renamed from: b */
    public final void mo14b(long j) {
        C0019h hVar = f77b;
        if (hVar != null) {
            hVar.mo22a((int) j, f85j);
            f78c = true;
        }
    }

    @Override // android.p003ss.com.vboost.p005b.AbstractC0012c
    /* renamed from: c */
    public final void mo15c(long j) {
        C0019h hVar = f77b;
        if (hVar != null) {
            hVar.mo22a((int) j, f86k);
            f78c = true;
        }
    }

    @Override // android.p003ss.com.vboost.p005b.AbstractC0012c
    /* renamed from: a */
    public final void mo11a(long j) {
        C0019h hVar = f77b;
        if (hVar != null) {
            hVar.mo22a((int) j, f85j);
            f78c = true;
        }
    }

    @Override // android.p003ss.com.vboost.p005b.AbstractC0012c
    /* renamed from: a */
    public final boolean mo12a(Context context) {
        if (f77b == null) {
            f77b = new C0019h(context);
        }
        if (C0019h.f71a) {
            File[] listFiles = new File("/sys/devices/system/cpu/cpufreq").listFiles();
            int i = 2;
            if (listFiles != null && listFiles.length > 0) {
                int i2 = 0;
                for (File file : listFiles) {
                    if (file.getName().startsWith("policy")) {
                        i2++;
                    }
                }
                if (i2 != 0) {
                    i = i2;
                }
            }
            if (Build.VERSION.SDK_INT >= 28) {
                if (i == 3) {
                    f85j = f79d;
                    return true;
                }
                f85j = f80e;
                return true;
            } else if (Build.VERSION.SDK_INT >= 26) {
                f85j = f81f;
                return true;
            } else if (Build.VERSION.SDK_INT >= 24) {
                f85j = f82g;
                return true;
            } else if (Build.VERSION.SDK_INT >= 23) {
                f85j = f83h;
                return true;
            }
        }
        return false;
    }
}
