package com.p2082ss.android.ugc.aweme.servicimpl;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.p1559o.C21582f;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.dmt_integration.AVInitializerImpl;
import com.p2082ss.android.ugc.gamora.editor.rootscene.AbstractC82561d;
import com.p2082ss.android.ugc.gamora.editor.rootscene.IEditRootSceneFactory;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.servicimpl.EditRootSceneFactoryDelegate */
public final class EditRootSceneFactoryDelegate implements IEditRootSceneFactory {
    static {
        Covode.recordClassIndex(80047);
    }

    /* renamed from: c */
    private static IEditRootSceneFactory m120140c() {
        if (!AVInitializerImpl.f100361a) {
            return null;
        }
        return C67916g.f152128a;
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.rootscene.IEditRootSceneFactory
    /* renamed from: a */
    public final Class<? extends AbstractC82561d> mo108497a() {
        IEditRootSceneFactory c = m120140c();
        if (c == null) {
            C89219l.m154715b();
        }
        return c.mo108497a();
    }

    /* renamed from: b */
    public static IEditRootSceneFactory m120139b() {
        MethodCollector.m26663i(4950);
        Object a = C81908b.m141854a(IEditRootSceneFactory.class, false);
        if (a != null) {
            IEditRootSceneFactory iEditRootSceneFactory = (IEditRootSceneFactory) a;
            MethodCollector.m26664o(4950);
            return iEditRootSceneFactory;
        }
        if (C81908b.f183307dD == null) {
            synchronized (IEditRootSceneFactory.class) {
                try {
                    if (C81908b.f183307dD == null) {
                        C81908b.f183307dD = new EditRootSceneFactoryDelegate();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(4950);
                    throw th;
                }
            }
        }
        EditRootSceneFactoryDelegate editRootSceneFactoryDelegate = (EditRootSceneFactoryDelegate) C81908b.f183307dD;
        MethodCollector.m26664o(4950);
        return editRootSceneFactoryDelegate;
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.rootscene.IEditRootSceneFactory
    /* renamed from: a */
    public final AbstractC82561d mo108496a(C21582f fVar) {
        C89219l.m154721d(fVar, "");
        IEditRootSceneFactory c = m120140c();
        if (c == null) {
            C89219l.m154715b();
        }
        return c.mo108496a(fVar);
    }
}
