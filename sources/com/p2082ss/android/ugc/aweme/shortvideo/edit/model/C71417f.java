package com.p2082ss.android.ugc.aweme.shortvideo.edit.model;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.mvtheme.C61288d;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.model.f */
public final class C71417f {

    /* renamed from: a */
    private final int f160021a;

    /* renamed from: b */
    private final int f160022b;

    static {
        Covode.recordClassIndex(83951);
    }

    /* renamed from: a */
    public final EditPreviewInfo mo113022a(C61288d dVar) {
        C89219l.m154721d(dVar, "");
        return new C71419h(this.f160021a, this.f160022b, null, 28).mo113031a(new EditVideoSegment(dVar.contactVideoPath.toString(), null, new VideoFileInfo(this.f160021a, this.f160022b, 0, 30, 0, 0, 0, 0, 240, null), 2, null));
    }

    public C71417f(int i, int i2) {
        this.f160021a = i;
        this.f160022b = i2;
    }
}
