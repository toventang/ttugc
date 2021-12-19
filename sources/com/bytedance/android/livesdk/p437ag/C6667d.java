package com.bytedance.android.livesdk.p437ag;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import com.bytedance.android.livesdk.p437ag.p438a.C6647e;
import com.bytedance.android.livesdk.p437ag.p440c.C6662e;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.ag.d */
public final class C6667d {

    /* renamed from: a */
    static final Map<String, Integer> f16560a;

    static {
        Covode.recordClassIndex(7405);
        HashMap hashMap = new HashMap();
        f16560a = hashMap;
        hashMap.put("android.permission.CAMERA", Integer.valueOf((int) R.string.gu6));
        hashMap.put("android.permission.RECORD_AUDIO", Integer.valueOf((int) R.string.gua));
        Integer valueOf = Integer.valueOf((int) R.string.gu_);
        hashMap.put("android.permission.READ_EXTERNAL_STORAGE", valueOf);
        hashMap.put("android.permission.WRITE_EXTERNAL_STORAGE", valueOf);
    }

    /* renamed from: a */
    public static boolean m14177a(Context context, String... strArr) {
        if (strArr == null) {
            return true;
        }
        if (Build.VERSION.SDK_INT < 23 || C6662e.C6663a.f16559a.mo12806a()) {
            return C6647e.C6648a.f16542a.mo12793a(context, strArr);
        }
        return C6657c.m14156a(context, strArr);
    }

    /* renamed from: a */
    public static String[] m14178a(Activity activity, String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (!m14177a((Context) activity, str)) {
                arrayList.add(str);
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }
}
