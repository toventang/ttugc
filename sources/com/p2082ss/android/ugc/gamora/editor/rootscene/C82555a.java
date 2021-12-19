package com.p2082ss.android.ugc.gamora.editor.rootscene;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1559o.C21582f;
import com.p2082ss.android.ugc.gamora.editor.C83254v;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.editor.rootscene.a */
public final class C82555a implements IEditRootSceneFactory {
    static {
        Covode.recordClassIndex(96400);
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.rootscene.IEditRootSceneFactory
    /* renamed from: a */
    public final Class<? extends AbstractC82561d> mo108497a() {
        return C83254v.class;
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.rootscene.IEditRootSceneFactory
    /* renamed from: a */
    public final AbstractC82561d mo108496a(C21582f fVar) {
        C89219l.m154721d(fVar, "");
        return new C83254v(fVar);
    }
}
