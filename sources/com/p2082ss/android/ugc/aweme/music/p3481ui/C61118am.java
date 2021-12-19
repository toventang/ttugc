package com.p2082ss.android.ugc.aweme.music.p3481ui;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.music.model.ExternalMusicInfo;
import com.p2082ss.android.ugc.aweme.music.p3465b.C60736n;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.music.ui.am */
public final /* synthetic */ class C61118am implements C60736n.AbstractC60737a {

    /* renamed from: a */
    private final C61100ah f138791a;

    /* renamed from: b */
    private final List f138792b;

    static {
        Covode.recordClassIndex(71721);
    }

    C61118am(C61100ah ahVar, List list) {
        this.f138791a = ahVar;
        this.f138792b = list;
    }

    @Override // com.p2082ss.android.ugc.aweme.music.p3465b.C60736n.AbstractC60737a
    /* renamed from: a */
    public final void mo98158a(int i) {
        C61100ah ahVar = this.f138791a;
        List list = this.f138792b;
        if (i >= 0 && i < list.size()) {
            ExternalMusicInfo externalMusicInfo = (ExternalMusicInfo) list.get(i);
            if (ahVar.f138732aw != null) {
                ahVar.f138732aw.mo98693a(ahVar.getContext(), externalMusicInfo, true);
            }
        }
    }
}
