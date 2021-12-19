package com.p2082ss.android.ugc.aweme.choosemusic.model;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.choosemusic.model.p2474a.C35876d;
import com.p2082ss.android.ugc.aweme.music.model.Music;
import p077b.C1731i;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.choosemusic.model.c */
public final /* synthetic */ class C35901c implements AbstractC88433f {

    /* renamed from: a */
    private final C35899b f84739a;

    /* renamed from: b */
    private final String f84740b;

    /* renamed from: c */
    private final boolean f84741c;

    /* renamed from: d */
    private final Music f84742d;

    static {
        Covode.recordClassIndex(43141);
    }

    C35901c(C35899b bVar, String str, boolean z, Music music) {
        this.f84739a = bVar;
        this.f84740b = str;
        this.f84741c = z;
        this.f84742d = music;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        C35899b bVar = this.f84739a;
        String str = this.f84740b;
        boolean z = this.f84741c;
        Music music = this.f84742d;
        C35876d dVar = (C35876d) obj;
        dVar.getClass();
        bVar.mo63021a(C1731i.m5640b(new CallableC35908j(dVar), C1731i.f5563b), str, z, music);
    }
}
