package com.bytedance.android.live.core.p218f.p220b.p221a;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.core.p218f.p220b.AbstractC3924c;
import com.bytedance.android.live.core.p218f.p220b.AbstractC3925d;
import com.bytedance.covode.number.Covode;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.bytedance.android.live.core.f.b.a.d */
public class C3917d implements AbstractC3924c, AbstractC3925d {

    /* renamed from: a */
    private static final List<String> f10802a = Arrays.asList("RLI-AN00");

    @Override // com.bytedance.android.live.core.p218f.p220b.AbstractC3925d
    /* renamed from: a */
    public final boolean mo9272a() {
        C3854a.m9456a(Build.MODEL);
        return f10802a.contains(Build.MODEL);
    }

    static {
        Covode.recordClassIndex(4446);
    }

    @Override // com.bytedance.android.live.core.p218f.p220b.AbstractC3925d
    /* renamed from: a */
    public final int mo9271a(Configuration configuration) {
        if (!mo9272a()) {
            return -1;
        }
        float f = (((float) configuration.screenHeightDp) * 1.0f) / ((float) configuration.screenWidthDp);
        if (f < 0.75f || f > 1.3333334f) {
            return 1;
        }
        return 0;
    }

    @Override // com.bytedance.android.live.core.p218f.p220b.AbstractC3924c
    /* renamed from: a */
    public final boolean mo9270a(Context context) {
        try {
            Class<?> loadClass = context.getClassLoader().loadClass("com.huawei.android.util.HwNotchSizeUtil");
            return ((Boolean) loadClass.getMethod("hasNotchInScreen", new Class[0]).invoke(loadClass, new Object[0])).booleanValue();
        } catch (ClassNotFoundException unused) {
            C3854a.m9453a(3, "HW_TAG", "hasNotchInScreen ClassNotFoundException");
            return false;
        } catch (NoSuchMethodException unused2) {
            C3854a.m9453a(3, "HW_TAG", "hasNotchInScreen NoSuchMethodException");
            return false;
        } catch (Exception unused3) {
            C3854a.m9453a(3, "HW_TAG", "hasNotchInScreen Exception");
            return false;
        } catch (Throwable unused4) {
            return false;
        }
    }
}
