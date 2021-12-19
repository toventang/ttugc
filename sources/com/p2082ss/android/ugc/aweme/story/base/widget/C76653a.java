package com.p2082ss.android.ugc.aweme.story.base.widget;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.scene.AbstractC22215h;
import com.bytedance.scene.AbstractC22219j;
import com.bytedance.scene.AbstractC22231l;
import com.bytedance.scene.navigation.C22239d;
import com.bytedance.scene.navigation.C22258g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.base.widget.a */
public final class C76653a extends AbstractC22215h {

    /* renamed from: c */
    public boolean f172042c;

    static {
        Covode.recordClassIndex(89647);
    }

    public final boolean canScrollHorizontally(int i) {
        return this.f172042c;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C76653a(Context context) {
        super(context, null, 0);
        C89219l.m154721d(context, "");
    }

    /* renamed from: a */
    public final void mo120416a(AbstractC22219j jVar) {
        C89219l.m154721d(jVar, "");
        C22258g gVar = new C22258g(jVar.getClass());
        gVar.f52653c = false;
        gVar.f52654d = false;
        C22239d dVar = new C22239d();
        dVar.f52554r = gVar.mo36561a();
        setNavigationScene(dVar);
        setRootSceneComponentFactory(new C76654a(jVar));
    }

    public /* synthetic */ C76653a(Context context, byte b) {
        this(context);
    }

    /* renamed from: com.ss.android.ugc.aweme.story.base.widget.a$a */
    static final class C76654a implements AbstractC22231l {

        /* renamed from: a */
        final /* synthetic */ AbstractC22219j f172043a;

        static {
            Covode.recordClassIndex(89648);
        }

        C76654a(AbstractC22219j jVar) {
            this.f172043a = jVar;
        }

        @Override // com.bytedance.scene.AbstractC22231l
        public final AbstractC22219j instantiateScene(ClassLoader classLoader, String str, Bundle bundle) {
            C89219l.m154721d(classLoader, "");
            C89219l.m154721d(str, "");
            if (C89219l.m154714a((Object) str, (Object) this.f172043a.getClass().getName())) {
                return this.f172043a;
            }
            return null;
        }
    }
}
