package com.p2082ss.android.p2160ml;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.p2160ml.process.AbstractC30097a;
import com.p2082ss.android.p2160ml.process.AbstractC30113c;
import com.p2082ss.android.p2160ml.process.p2162bl.MLConfigModel;
import java.io.FileInputStream;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ml.l */
public interface AbstractC30090l {
    static {
        Covode.recordClassIndex(36586);
    }

    /* renamed from: a */
    float mo53454a(Map<String, Object> map, List<? extends AbstractC30113c> list, AbstractC30097a aVar, List<String> list2);

    /* renamed from: a */
    List<String> mo53455a(Map<String, Object> map, List<? extends AbstractC30113c> list, AbstractC30097a aVar, List<String> list2, Map<String, Float> map2);

    /* renamed from: a */
    void mo53456a(C30094o oVar);

    /* renamed from: a */
    void mo53457a(FileInputStream fileInputStream, MLConfigModel mLConfigModel);

    /* renamed from: a */
    void mo53458a(String str);

    /* renamed from: a */
    boolean mo53459a();
}
