package com.p2082ss.android.ugc.aweme.music.presenter;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.choosemusic.model.C35897aq;
import com.p2082ss.android.ugc.aweme.music.model.AwemeSearchMusicList;
import java.util.List;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.ss.android.ugc.aweme.music.presenter.v */
final /* synthetic */ class C60870v implements AbstractC89172b {

    /* renamed from: a */
    private final int f138338a;

    /* renamed from: b */
    private final AwemeSearchMusicList f138339b;

    /* renamed from: c */
    private final List f138340c;

    static {
        Covode.recordClassIndex(71458);
    }

    C60870v(int i, AwemeSearchMusicList awemeSearchMusicList, List list) {
        this.f138338a = i;
        this.f138339b = awemeSearchMusicList;
        this.f138340c = list;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public final Object invoke(Object obj) {
        int i = this.f138338a;
        AwemeSearchMusicList awemeSearchMusicList = this.f138339b;
        List list = this.f138340c;
        Integer num = (Integer) obj;
        if (num.intValue() < 0 || num.intValue() > i) {
            return null;
        }
        C35897aq aqVar = new C35897aq();
        aqVar.setLogPb(awemeSearchMusicList.logPb);
        list.add(num.intValue(), aqVar);
        return null;
    }
}
