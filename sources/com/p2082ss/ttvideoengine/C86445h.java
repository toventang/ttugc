package com.p2082ss.ttvideoengine;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.ttvideoengine.p4412f.p4413a.AbstractC86427b;
import com.p2082ss.ttvideoengine.p4415h.AbstractC86468j;
import com.p2082ss.ttvideoengine.p4417j.C86535p;
import com.p2082ss.ttvideoengine.p4430s.C86633c;
import com.p2082ss.ttvideoengine.p4430s.C86641i;
import com.p2082ss.ttvideoengine.p4430s.C86643k;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.ttvideoengine.h */
public final class C86445h implements AbstractC86427b {

    /* renamed from: a */
    private final WeakReference<C86313ai> f193828a;

    static {
        Covode.recordClassIndex(101673);
    }

    @Override // com.p2082ss.ttvideoengine.p4412f.p4413a.AbstractC86427b
    /* renamed from: a */
    public final String mo137456a() {
        C86313ai aiVar = this.f193828a.get();
        if (aiVar == null) {
            return null;
        }
        return aiVar.f192990cA;
    }

    @Override // com.p2082ss.ttvideoengine.p4412f.p4413a.AbstractC86427b
    /* renamed from: c */
    public final Context mo137462c() {
        C86313ai aiVar = this.f193828a.get();
        if (aiVar == null) {
            return null;
        }
        return aiVar.f192916aa;
    }

    @Override // com.p2082ss.ttvideoengine.p4412f.p4413a.AbstractC86427b
    /* renamed from: b */
    public final String mo137461b() {
        C86313ai aiVar = this.f193828a.get();
        if (aiVar == null) {
            return null;
        }
        return C86643k.m150120a(aiVar.mo137274z());
    }

    public C86445h(C86313ai aiVar) {
        this.f193828a = new WeakReference<>(aiVar);
    }

    @Override // com.p2082ss.ttvideoengine.p4412f.p4413a.AbstractC86427b
    /* renamed from: a */
    public final void mo137460a(String str) {
        C86641i.m150110a("EngineMDLFetcherListener", "fetcher cancelled");
        C86313ai aiVar = this.f193828a.get();
        if (aiVar != null && aiVar.f192920ae != null) {
            aiVar.f192920ae.mo137668x(str);
        }
    }

    @Override // com.p2082ss.ttvideoengine.p4412f.p4413a.AbstractC86427b
    /* renamed from: a */
    public final void mo137458a(C86633c cVar) {
        C86313ai aiVar = this.f193828a.get();
        if (cVar != null && aiVar != null && aiVar.f192920ae != null) {
            C86641i.m150117e("EngineMDLFetcherListener", "fetcher should retry error " + cVar.toString());
            aiVar.f192920ae.mo137554a(cVar, aiVar.f193366n);
        }
    }

    @Override // com.p2082ss.ttvideoengine.p4412f.p4413a.AbstractC86427b
    /* renamed from: a */
    public final void mo137459a(C86633c cVar, String str) {
        AbstractC86468j jVar;
        C86641i.m150110a("EngineMDLFetcherListener", "videoEngine mdl fetch failed " + cVar.toString());
        C86313ai aiVar = this.f193828a.get();
        if (aiVar != null && (jVar = aiVar.f192920ae) != null) {
            jVar.mo137544a(0, str, cVar);
        }
    }

    @Override // com.p2082ss.ttvideoengine.p4412f.p4413a.AbstractC86427b
    /* renamed from: a */
    public final void mo137457a(C86535p pVar, boolean z, String str) {
        int i;
        C86313ai aiVar = this.f193828a.get();
        if (aiVar != null) {
            C86641i.m150110a("EngineMDLFetcherListener", "fetch info success");
            AbstractC86468j jVar = aiVar.f192920ae;
            if (jVar != null) {
                if (z) {
                    i = 1;
                } else {
                    i = 2;
                }
                jVar.mo137544a(i, str, (C86633c) null);
                if (z) {
                    jVar.mo137552a(pVar);
                }
            }
        }
    }
}
