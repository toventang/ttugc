package com.p2082ss.android.ttve.common;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ttve.model.VEFrame;
import com.p2082ss.android.ttve.nativePort.C30731d;

/* renamed from: com.ss.android.ttve.common.TEImageUtils */
public class TEImageUtils {

    /* renamed from: a */
    private static final String f73246a = TEImageUtils.class.getSimpleName();

    private static native int nativeConvertFrame(VEFrame vEFrame, VEFrame vEFrame2, int i);

    static {
        Covode.recordClassIndex(37180);
        C30731d.m63114a();
    }

    /* renamed from: a */
    public static int m62973a(VEFrame vEFrame, VEFrame vEFrame2, VEFrame.EnumC30669b bVar) {
        MethodCollector.m26663i(11983);
        int nativeConvertFrame = nativeConvertFrame(vEFrame, vEFrame2, bVar.ordinal());
        MethodCollector.m26664o(11983);
        return nativeConvertFrame;
    }
}
