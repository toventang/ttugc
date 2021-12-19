package com.p2082ss.android.ugc.aweme.choosemusic.model;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.choosemusic.p2462b.C35755a;
import com.p2082ss.android.ugc.aweme.component.music.MusicService;
import com.p2082ss.android.ugc.aweme.music.p3468c.AbstractC60747a;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import p077b.AbstractC1729g;
import p077b.C1731i;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.choosemusic.model.i */
public final /* synthetic */ class C35907i implements AbstractC1729g {

    /* renamed from: a */
    private final C35899b f84749a;

    /* renamed from: b */
    private final MusicModel f84750b;

    /* renamed from: c */
    private final int f84751c;

    /* renamed from: d */
    private final int f84752d;

    /* renamed from: e */
    private final int f84753e;

    /* renamed from: f */
    private final String f84754f;

    static {
        Covode.recordClassIndex(43147);
    }

    C35907i(C35899b bVar, MusicModel musicModel, int i, int i2, int i3, String str) {
        this.f84749a = bVar;
        this.f84750b = musicModel;
        this.f84751c = i;
        this.f84752d = i2;
        this.f84753e = i3;
        this.f84754f = str;
    }

    @Override // p077b.AbstractC1729g
    public final Object then(C1731i iVar) {
        C35899b bVar = this.f84749a;
        MusicModel musicModel = this.f84750b;
        int i = this.f84751c;
        int i2 = this.f84752d;
        int i3 = this.f84753e;
        String str = this.f84754f;
        if (iVar.mo5539b()) {
            return null;
        }
        boolean z = true;
        if (iVar.mo5544c()) {
            musicModel.setCollectionType(i == 1 ? MusicModel.CollectionType.NOT_COLLECTED : MusicModel.CollectionType.COLLECTED);
            bVar.f84729b.mo60191a("music_collect_status", new C35755a(1, i, i2, i3, musicModel));
            return null;
        } else if (!iVar.mo5535a()) {
            return null;
        } else {
            musicModel.setCollectionType(i == 1 ? MusicModel.CollectionType.COLLECTED : MusicModel.CollectionType.NOT_COLLECTED);
            AbstractC60747a h = MusicService.m81198m().mo69319h();
            if (h != null) {
                if (i != 1) {
                    z = false;
                }
                h.mo98166a(str, z);
            }
            bVar.f84729b.mo60191a("music_collect_status", new C35755a(0, i, i2, i3, musicModel));
            return null;
        }
    }
}
