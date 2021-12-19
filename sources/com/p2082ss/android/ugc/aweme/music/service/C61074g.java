package com.p2082ss.android.ugc.aweme.music.service;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import p077b.AbstractC1729g;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.music.service.g */
final /* synthetic */ class C61074g implements AbstractC1729g {

    /* renamed from: a */
    private final C61068e f138568a;

    /* renamed from: b */
    private final boolean f138569b;

    /* renamed from: c */
    private final Activity f138570c;

    /* renamed from: d */
    private final MusicModel f138571d;

    /* renamed from: e */
    private final String f138572e;

    /* renamed from: f */
    private final int f138573f;

    static {
        Covode.recordClassIndex(71672);
    }

    C61074g(C61068e eVar, boolean z, Activity activity, MusicModel musicModel, String str, int i) {
        this.f138568a = eVar;
        this.f138569b = z;
        this.f138570c = activity;
        this.f138571d = musicModel;
        this.f138572e = str;
        this.f138573f = i;
    }

    @Override // p077b.AbstractC1729g
    public final Object then(C1731i iVar) {
        return this.f138568a.mo98593a(this.f138569b, this.f138570c, this.f138571d, this.f138572e, this.f138573f, iVar);
    }
}
