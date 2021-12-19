package com.p2082ss.android.ugc.aweme.kids.choosemusic.p3323e;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3320b.C57191a;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import p077b.AbstractC1729g;
import p077b.C1731i;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.kids.choosemusic.e.e */
public final /* synthetic */ class C57243e implements AbstractC1729g {

    /* renamed from: a */
    private final C57238a f130395a;

    /* renamed from: b */
    private final MusicModel f130396b;

    /* renamed from: c */
    private final int f130397c;

    /* renamed from: d */
    private final int f130398d;

    /* renamed from: e */
    private final int f130399e;

    static {
        Covode.recordClassIndex(67148);
    }

    C57243e(C57238a aVar, MusicModel musicModel, int i, int i2, int i3) {
        this.f130395a = aVar;
        this.f130396b = musicModel;
        this.f130397c = i;
        this.f130398d = i2;
        this.f130399e = i3;
    }

    @Override // p077b.AbstractC1729g
    public final Object then(C1731i iVar) {
        C57238a aVar = this.f130395a;
        MusicModel musicModel = this.f130396b;
        int i = this.f130397c;
        int i2 = this.f130398d;
        int i3 = this.f130399e;
        if (iVar.mo5539b()) {
            return null;
        }
        if (iVar.mo5544c()) {
            musicModel.setCollectionType(i == 1 ? MusicModel.CollectionType.NOT_COLLECTED : MusicModel.CollectionType.COLLECTED);
            aVar.f130380b.mo60191a("music_collect_status", new C57191a(1, i, i2, i3, musicModel));
            return null;
        } else if (!iVar.mo5535a()) {
            return null;
        } else {
            musicModel.setCollectionType(i == 1 ? MusicModel.CollectionType.COLLECTED : MusicModel.CollectionType.NOT_COLLECTED);
            aVar.f130380b.mo60191a("music_collect_status", new C57191a(0, i, i2, i3, musicModel));
            return null;
        }
    }
}
