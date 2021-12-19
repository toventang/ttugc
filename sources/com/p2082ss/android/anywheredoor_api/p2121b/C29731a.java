package com.p2082ss.android.anywheredoor_api.p2121b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.anywheredoor_api.service.IAnyDoorService;
import java.lang.reflect.Method;

/* renamed from: com.ss.android.anywheredoor_api.b.a */
public final class C29731a {

    /* renamed from: a */
    public static final C29731a f70896a = new C29731a();

    /* renamed from: b */
    private static IAnyDoorService f70897b;

    private C29731a() {
    }

    static {
        Covode.recordClassIndex(36129);
    }

    /* renamed from: a */
    public static IAnyDoorService m59910a() {
        IAnyDoorService iAnyDoorService = f70897b;
        if (iAnyDoorService != null) {
            return iAnyDoorService;
        }
        try {
            Method declaredMethod = Class.forName("com.ss.android.anywheredoor.core.AnyDoorServiceImpl").getDeclaredMethod("inst", new Class[0]);
            declaredMethod.setAccessible(true);
            f70897b = (IAnyDoorService) declaredMethod.invoke(null, new Object[0]);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return f70897b;
    }
}
