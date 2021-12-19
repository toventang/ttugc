package com.bytedance.platform.godzilla.sysopt;

import android.app.Application;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1574a.C21689g;
import com.bytedance.platform.godzilla.p1585c.AbstractC21717a;

/* renamed from: com.bytedance.platform.godzilla.sysopt.b */
public final class C21730b extends AbstractC21717a {
    static {
        Covode.recordClassIndex(25374);
    }

    @Override // com.bytedance.platform.godzilla.p1585c.AbstractC21717a
    /* renamed from: a */
    public final void mo35359a(Application application) {
    }

    @Override // com.bytedance.platform.godzilla.p1585c.AbstractC21717a
    /* renamed from: b */
    public final String mo35351b() {
        return "UbsanOptPlugin";
    }

    @Override // com.bytedance.platform.godzilla.p1585c.AbstractC21717a
    /* renamed from: a */
    public final void mo35350a() {
        MethodCollector.m26663i(9296);
        C21689g.m40635a(C21689g.EnumC21691a.ERROR);
        String a = m40699a(Long.toHexString(79531005658441L));
        if (a != null && Build.MANUFACTURER.toUpperCase().contains(a) && Build.VERSION.SDK_INT == 29) {
            UbsanOpt.start();
        }
        MethodCollector.m26664o(9296);
    }

    /* renamed from: a */
    private static String m40699a(String str) {
        if (str == null || str.equals("")) {
            return null;
        }
        String replace = str.replace(" ", "");
        int length = replace.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            try {
                bArr[i] = (byte) (Integer.parseInt(replace.substring(i2, i2 + 2), 16) & 255);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        try {
            replace = new String(bArr, "UTF-8");
            return replace;
        } catch (Exception e2) {
            e2.printStackTrace();
            return replace;
        }
    }
}
