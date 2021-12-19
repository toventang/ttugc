package com.p2082ss.android.ugc.gamora.editor.rootscene;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1559o.C21582f;
import com.p2082ss.android.ugc.aweme.ftc.components.C51918a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.editor.rootscene.c */
public final class C82560c implements IEditRootSceneFactory {
    static {
        Covode.recordClassIndex(96405);
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.rootscene.IEditRootSceneFactory
    /* renamed from: a */
    public final Class<? extends AbstractC82561d> mo108497a() {
        return C51918a.class;
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.rootscene.IEditRootSceneFactory
    /* renamed from: a */
    public final AbstractC82561d mo108496a(C21582f fVar) {
        C89219l.m154721d(fVar, "");
        return new C51918a(fVar);
    }
}
