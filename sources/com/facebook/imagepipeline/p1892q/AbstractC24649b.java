package com.facebook.imagepipeline.p1892q;

import com.bytedance.covode.number.Covode;
import com.facebook.imagepipeline.common.C24363d;
import com.facebook.imagepipeline.common.C24364e;
import com.facebook.imagepipeline.p1885j.C24456e;
import com.facebook.p1870h.C24314c;
import java.io.OutputStream;

/* renamed from: com.facebook.imagepipeline.q.b */
public interface AbstractC24649b {
    static {
        Covode.recordClassIndex(28799);
    }

    boolean canResize(C24456e eVar, C24364e eVar2, C24363d dVar);

    boolean canTranscode(C24314c cVar);

    String getIdentifier();

    C24648a transcode(C24456e eVar, OutputStream outputStream, C24364e eVar2, C24363d dVar, C24314c cVar, Integer num);
}
