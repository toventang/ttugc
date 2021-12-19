package com.p2082ss.android.p2160ml.process;

import com.bytedance.covode.number.Covode;
import java.util.List;

/* renamed from: com.ss.android.ml.process.c */
public interface AbstractC30113c extends AbstractC30112b {
    static {
        Covode.recordClassIndex(36612);
    }

    String getFeature();

    List<String> getLabels();

    int getLength();

    String getType();

    int getVectorLength();

    int getVectorNum();
}
