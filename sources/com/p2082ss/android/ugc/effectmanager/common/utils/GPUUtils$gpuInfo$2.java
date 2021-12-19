package com.p2082ss.android.ugc.effectmanager.common.utils;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.common.utils.GPUUtils;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.effectmanager.common.utils.GPUUtils$gpuInfo$2 */
final class GPUUtils$gpuInfo$2 extends AbstractC89220m implements AbstractC89171a<GPUUtils.GPUInfo> {
    public static final GPUUtils$gpuInfo$2 INSTANCE = new GPUUtils$gpuInfo$2();

    static {
        Covode.recordClassIndex(95519);
    }

    GPUUtils$gpuInfo$2() {
        super(0);
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89171a
    public final GPUUtils.GPUInfo invoke() {
        return GPUUtils.INSTANCE.generateGPUInfo();
    }
}
