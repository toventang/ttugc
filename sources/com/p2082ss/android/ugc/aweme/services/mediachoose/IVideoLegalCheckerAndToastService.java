package com.p2082ss.android.ugc.aweme.services.mediachoose;

import com.bytedance.covode.number.Covode;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89188r;

/* renamed from: com.ss.android.ugc.aweme.services.mediachoose.IVideoLegalCheckerAndToastService */
public interface IVideoLegalCheckerAndToastService {
    static {
        Covode.recordClassIndex(79902);
    }

    void isVideoLengthOrTypeSupportedAndShowErrToast(String str, boolean z, int i, int i2, AbstractC89183m<? super String, ? super Long, C89391z> mVar, AbstractC89188r<? super String, ? super Long, ? super Integer, ? super String, C89391z> rVar);

    void isVideoLengthOrTypeSupportedAndShowErrToast(String str, boolean z, int i, AbstractC89171a<C89391z> aVar);

    boolean isVideoLengthOrTypeSupportedAndShowErrToast(String str, boolean z);

    boolean isVideoLengthOrTypeSupportedAndShowErrToast(String str, boolean z, int i, int i2, AbstractC89172b<? super Integer, C89391z> bVar);

    boolean isVideoLengthOrTypeSupportedAndShowErrToast(String str, boolean z, AbstractC89172b<? super Integer, C89391z> bVar);
}
