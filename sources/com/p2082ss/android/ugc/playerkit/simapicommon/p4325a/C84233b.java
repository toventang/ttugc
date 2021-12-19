package com.p2082ss.android.ugc.playerkit.simapicommon.p4325a;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.playerkit.simapicommon.a.b */
public final class C84233b implements Serializable {

    /* renamed from: a */
    private final boolean f188328a;

    /* renamed from: b */
    private final boolean f188329b;

    /* renamed from: c */
    private final C84234c f188330c;

    /* renamed from: d */
    private final List<C84232a> f188331d;

    static {
        Covode.recordClassIndex(98142);
    }

    public final List<C84232a> getCaptionInfos() {
        return this.f188331d;
    }

    public final boolean getEnableAutoCaption() {
        return this.f188328a;
    }

    public final boolean getHasOriginalAudio() {
        return this.f188329b;
    }

    public final C84234c getOriginalLanguageInfo() {
        return this.f188330c;
    }

    public C84233b(boolean z, boolean z2, C84234c cVar, List<C84232a> list) {
        C89219l.m154719c(cVar, "");
        C89219l.m154719c(list, "");
        this.f188328a = z;
        this.f188329b = z2;
        this.f188330c = cVar;
        this.f188331d = list;
    }
}
