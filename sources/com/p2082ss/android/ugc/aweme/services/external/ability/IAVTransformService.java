package com.p2082ss.android.ugc.aweme.services.external.ability;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.services.upload.ExternalUploadVideoConfig;
import com.p2082ss.android.ugc.aweme.share.gif.VideoShare2GifEditContext;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;

/* renamed from: com.ss.android.ugc.aweme.services.external.ability.IAVTransformService */
public interface IAVTransformService {

    /* renamed from: com.ss.android.ugc.aweme.services.external.ability.IAVTransformService$ITransformCallback */
    public interface ITransformCallback<T> {
        static {
            Covode.recordClassIndex(79828);
        }

        void finish(T t);
    }

    /* renamed from: com.ss.android.ugc.aweme.services.external.ability.IAVTransformService$ITransformProgress */
    public interface ITransformProgress {
        static {
            Covode.recordClassIndex(79829);
        }

        void update(int i);
    }

    static {
        Covode.recordClassIndex(79827);
    }

    void audio2wavebean(String str, ITransformCallback<MusicWaveBean> iTransformCallback);

    ExternalUploadVideoConfig parseUploadVideoConfig(String str);

    void video2gif(VideoShare2GifEditContext videoShare2GifEditContext, ITransformProgress iTransformProgress, ITransformCallback<Boolean> iTransformCallback);

    void video2webp(String str, String str2, int i, int i2, ITransformCallback<Integer> iTransformCallback, ITransformProgress iTransformProgress);
}
