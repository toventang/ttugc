package com.p2082ss.android.ugc.aweme.shortvideo.model;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.C34608n;
import com.p2082ss.android.ugc.aweme.common.AbstractC39085b;
import com.p2082ss.android.ugc.aweme.shortvideo.api.MusicChoicesApi;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.model.MusicListModel */
public class MusicListModel extends AbstractC39085b<MusicList> {
    static {
        Covode.recordClassIndex(84598);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39085b
    public boolean checkParams(Object... objArr) {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39085b
    public boolean sendRequest(Object... objArr) {
        C34608n.m70658a().mo61083a(this.mHandler, new Callable() {
            /* class com.p2082ss.android.ugc.aweme.shortvideo.model.MusicListModel.CallableC719871 */

            static {
                Covode.recordClassIndex(84599);
            }

            @Override // java.util.concurrent.Callable
            public Object call() {
                return MusicChoicesApi.m123400a();
            }
        }, 0);
        return true;
    }
}
