package com.p2082ss.android.ugc.aweme.shortvideo.editcut.p3831b.p3832a;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.bytedance.scene.AbstractC22219j;
import com.bytedance.scene.group.AbstractC22186b;
import com.p2082ss.android.ugc.aweme.shortvideo.editcut.p3831b.AbstractC71643d;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.b.a.a */
public abstract class AbstractC71586a extends AbstractC22219j implements AbstractC21566a, AbstractC71643d {

    /* renamed from: a */
    private final C21582f f160407a;

    /* renamed from: b */
    private final AbstractC22186b f160408b;

    /* renamed from: c */
    private final int f160409c;

    static {
        Covode.recordClassIndex(84131);
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public C21582f getDiContainer() {
        return this.f160407a;
    }

    /* renamed from: d */
    public final void mo113332d() {
        if (this.f160408b.mo36422g(this)) {
            this.f160408b.mo36413d(this);
        }
    }

    /* renamed from: b */
    public final void mo113331b() {
        if (!this.f160408b.mo36421f(this)) {
            this.f160408b.mo36387a(this.f160409c, this, mo113345a());
        }
        if (!this.f160408b.mo36422g(this)) {
            this.f160408b.mo36417e(this);
        }
    }

    public AbstractC71586a(C21582f fVar, AbstractC22186b bVar, int i) {
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(bVar, "");
        this.f160407a = fVar;
        this.f160408b = bVar;
        this.f160409c = i;
    }
}
