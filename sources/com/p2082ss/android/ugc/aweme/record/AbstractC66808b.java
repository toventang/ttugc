package com.p2082ss.android.ugc.aweme.record;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.bytedance.scene.AbstractC22233n;
import com.p2082ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84919c;
import java.util.List;
import p4600h.C89386u;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;

/* renamed from: com.ss.android.ugc.aweme.record.b */
public interface AbstractC66808b {
    static {
        Covode.recordClassIndex(78380);
    }

    C89386u<Boolean, Integer, Long> checkMediaDurationValid(Context context, List<? extends MediaModel> list, long j, long j2);

    AbstractC22233n openAlbum(ShortVideoContext shortVideoContext, ActivityC0945e eVar, int i, AbstractC84919c cVar, Bundle bundle);

    void subscribeAlbumClose(ActivityC0945e eVar, AbstractC89171a<C89391z> aVar);

    void subscribeAlbumOpen(ActivityC0945e eVar, AbstractC89171a<C89391z> aVar);
}
