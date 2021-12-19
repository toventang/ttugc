package com.p2082ss.ttvideoengine;

import com.bytedance.covode.number.Covode;
import com.p2082ss.texturerender.VideoSurface;
import com.p2082ss.ttvideoengine.p4430s.C86641i;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.ttvideoengine.aj */
public final /* synthetic */ class C86341aj implements VideoSurface.AbstractC86168b {

    /* renamed from: a */
    private final C86313ai f193418a;

    static {
        Covode.recordClassIndex(101569);
    }

    C86341aj(C86313ai aiVar) {
        this.f193418a = aiVar;
    }

    @Override // com.p2082ss.texturerender.VideoSurface.AbstractC86168b
    /* renamed from: a */
    public final void mo136464a(int i) {
        C86313ai aiVar = this.f193418a;
        aiVar.f192992cC = i;
        if (i == 1 || i == 2) {
            C86641i.m150113b("TTVideoEngine", "sr fail : ".concat(String.valueOf(i)));
            aiVar.f192988by.mo137884a(2, i == 1 ? -7896 : -7895);
        }
        if (aiVar.f193374v == 1 || aiVar.f193374v == 2) {
            aiVar.f192920ae.mo137658u(0);
        }
    }
}
