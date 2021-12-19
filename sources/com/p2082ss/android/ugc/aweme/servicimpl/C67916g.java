package com.p2082ss.android.ugc.aweme.servicimpl;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1559o.C21582f;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.gamora.editor.rootscene.AbstractC82561d;
import com.p2082ss.android.ugc.gamora.editor.rootscene.C82555a;
import com.p2082ss.android.ugc.gamora.editor.rootscene.C82560c;
import com.p2082ss.android.ugc.gamora.editor.rootscene.IEditRootSceneFactory;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.servicimpl.g */
public final class C67916g implements IEditRootSceneFactory {

    /* renamed from: a */
    public static final C67916g f152128a = new C67916g();

    /* renamed from: b */
    private final /* synthetic */ IEditRootSceneFactory f152129b;

    @Override // com.p2082ss.android.ugc.gamora.editor.rootscene.IEditRootSceneFactory
    /* renamed from: a */
    public final AbstractC82561d mo108496a(C21582f fVar) {
        C89219l.m154721d(fVar, "");
        return this.f152129b.mo108496a(fVar);
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.rootscene.IEditRootSceneFactory
    /* renamed from: a */
    public final Class<? extends AbstractC82561d> mo108497a() {
        return this.f152129b.mo108497a();
    }

    static {
        Covode.recordClassIndex(80085);
    }

    private C67916g() {
        IEditRootSceneFactory aVar;
        if (C63244g.m114602a().mo73255A().mo93901a()) {
            aVar = new C82560c();
        } else {
            aVar = new C82555a();
        }
        this.f152129b = aVar;
    }
}
