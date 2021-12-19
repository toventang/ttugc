package com.p2082ss.android.ugc.aweme.music.p3481ui;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import p077b.AbstractC1729g;
import p077b.C1731i;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.music.ui.bd */
public final /* synthetic */ class C61142bd implements AbstractC1729g {

    /* renamed from: a */
    private final MusicDownloadPlayHelper f138825a;

    /* renamed from: b */
    private final MusicModel f138826b;

    /* renamed from: c */
    private final boolean f138827c;

    /* renamed from: d */
    private final String f138828d;

    /* renamed from: e */
    private final boolean f138829e;

    static {
        Covode.recordClassIndex(71747);
    }

    C61142bd(MusicDownloadPlayHelper musicDownloadPlayHelper, MusicModel musicModel, boolean z, String str, boolean z2) {
        this.f138825a = musicDownloadPlayHelper;
        this.f138826b = musicModel;
        this.f138827c = z;
        this.f138828d = str;
        this.f138829e = z2;
    }

    @Override // p077b.AbstractC1729g
    public final Object then(C1731i iVar) {
        return this.f138825a.mo98617a(this.f138826b, this.f138827c, this.f138828d, this.f138829e, iVar);
    }
}
