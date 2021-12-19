package com.p2082ss.android.ugc.asve.editor;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.vesdk.C85391be;
import com.p2082ss.android.vesdk.C85581w;
import com.p2082ss.android.vesdk.VEEditorModel;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.asve.editor.p */
public final class C31087p extends AbstractC31077h {

    /* renamed from: a */
    public final VEEditorModel f74483a;

    /* renamed from: b */
    public final C85391be f74484b;

    static {
        Covode.recordClassIndex(37726);
    }

    public C31087p(VEEditorModel vEEditorModel, C85391be beVar) {
        C89219l.m154721d(vEEditorModel, "");
        this.f74483a = vEEditorModel;
        this.f74484b = beVar;
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31077h
    /* renamed from: a */
    public final int mo56408a(C85581w wVar, boolean z) {
        C89219l.m154721d(wVar, "");
        return wVar.mo131597a(this.f74483a, this.f74484b);
    }
}
