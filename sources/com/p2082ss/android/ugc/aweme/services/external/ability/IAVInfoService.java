package com.p2082ss.android.ugc.aweme.services.external.ability;

import android.content.Context;
import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.draft.model.C43223c;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.nio.ByteBuffer;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89188r;

/* renamed from: com.ss.android.ugc.aweme.services.external.ability.IAVInfoService */
public interface IAVInfoService {

    /* renamed from: com.ss.android.ugc.aweme.services.external.ability.IAVInfoService$IFilterMedia */
    public interface IFilterMedia<T> {
        static {
            Covode.recordClassIndex(79818);
        }

        boolean filter(T t);
    }

    /* renamed from: com.ss.android.ugc.aweme.services.external.ability.IAVInfoService$IGetInfoCallback */
    public interface IGetInfoCallback<T> {
        static {
            Covode.recordClassIndex(79819);
        }

        void finish(T t);
    }

    /* renamed from: com.ss.android.ugc.aweme.services.external.ability.IAVInfoService$VEFrameAvailableListener */
    public interface VEFrameAvailableListener {
        static {
            Covode.recordClassIndex(79820);
        }

        boolean processFrame(ByteBuffer byteBuffer, int i, int i2, int i3);
    }

    static {
        Covode.recordClassIndex(79817);
    }

    void audioLegal(Context context, List<? extends MusicModel> list, IFilterMedia<Integer> iFilterMedia, IGetInfoCallback<List<MusicModel>> iGetInfoCallback);

    void audioLegal(String str, int i, IGetInfoCallback<Integer> iGetInfoCallback);

    void audioLegal(List<String> list, IGetInfoCallback<List<Integer>> iGetInfoCallback);

    void importLegal(Context context, String str, boolean z, int i, int i2, AbstractC89183m<? super String, ? super Long, C89391z> mVar, AbstractC89188r<? super String, ? super Long, ? super Integer, ? super String, C89391z> rVar);

    void mp3Legal(Context context, String str, IGetInfoCallback<Integer> iGetInfoCallback);

    void mp3Legal(String str, IGetInfoCallback<Integer> iGetInfoCallback);

    int[] photoInfo(String str);

    void videoCover(C43223c cVar, IGetInfoCallback<Bitmap> iGetInfoCallback);

    void videoFrame(String str, int[] iArr, VEFrameAvailableListener vEFrameAvailableListener);

    void videoInfo(String str, boolean z, IGetInfoCallback<int[]> iGetInfoCallback);
}
