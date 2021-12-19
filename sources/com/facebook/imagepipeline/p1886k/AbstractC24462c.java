package com.facebook.imagepipeline.p1886k;

import com.bytedance.covode.number.Covode;
import com.facebook.imagepipeline.p1889n.AbstractC24547an;
import com.facebook.imagepipeline.p1890o.C24636b;

/* renamed from: com.facebook.imagepipeline.k.c */
public interface AbstractC24462c extends AbstractC24547an {
    static {
        Covode.recordClassIndex(28605);
    }

    void onRequestCancellation(String str);

    void onRequestFailure(C24636b bVar, String str, Throwable th, boolean z);

    void onRequestStart(C24636b bVar, Object obj, String str, boolean z);

    void onRequestSuccess(C24636b bVar, String str, boolean z);
}
