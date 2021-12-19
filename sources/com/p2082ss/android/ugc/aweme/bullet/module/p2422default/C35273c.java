package com.p2082ss.android.ugc.aweme.bullet.module.p2422default;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.kit.p1156rn.AbstractC16454c;
import com.bytedance.ies.bullet.kit.p1156rn.AbstractC16462e;
import com.bytedance.ies.bullet.kit.p1156rn.AbstractC16463f;
import com.bytedance.ies.bullet.kit.p1156rn.core.AbstractC16456b;
import com.bytedance.ies.bullet.kit.p1156rn.core.AbstractC16458d;
import com.bytedance.ies.bullet.kit.p1156rn.core.AbstractC16459e;
import com.bytedance.ies.bullet.p1125a.p1126a.p1127a.C16116a;
import com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16208i;
import com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16210j;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.p2082ss.android.ugc.aweme.bullet.reactpackage.RNCommonModule;
import com.p2082ss.android.ugc.aweme.bullet.reactpackage.p2423a.C35293a;
import com.p2082ss.android.ugc.aweme.bullet.reactpackage.p2424b.C35297b;
import java.util.ArrayList;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.bullet.module.default.c */
public final class C35273c extends C16116a {

    /* renamed from: a */
    public final C16248b f83286a;

    static {
        Covode.recordClassIndex(42438);
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.module.default.c$a */
    public static final class C35274a implements AbstractC16454c {
        static {
            Covode.recordClassIndex(42439);
        }

        C35274a() {
        }

        @Override // com.bytedance.ies.bullet.kit.p1156rn.AbstractC16454c
        /* renamed from: b */
        public final List<AbstractC16459e<?>> mo26096b(AbstractC16463f fVar, C16248b bVar) {
            C89219l.m154721d(fVar, "");
            C89219l.m154721d(bVar, "");
            return C89086z.INSTANCE;
        }

        @Override // com.bytedance.ies.bullet.kit.p1156rn.AbstractC16454c
        /* renamed from: a */
        public final List<AbstractC16456b> mo26095a(AbstractC16463f fVar, C16248b bVar) {
            C89219l.m154721d(fVar, "");
            C89219l.m154721d(bVar, "");
            return C89070n.m154524c(new RNCommonModule());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.module.default.c$c */
    public static final class C35276c implements AbstractC16462e {
        static {
            Covode.recordClassIndex(42441);
        }

        C35276c() {
        }

        @Override // com.bytedance.ies.bullet.kit.p1156rn.AbstractC16462e
        /* renamed from: a */
        public final List<AbstractC16458d> mo26113a(AbstractC16463f fVar, C16248b bVar) {
            C89219l.m154721d(fVar, "");
            C89219l.m154721d(bVar, "");
            ArrayList arrayList = new ArrayList();
            arrayList.add(new C35293a());
            arrayList.add(new C35297b());
            return arrayList;
        }
    }

    @Override // com.bytedance.ies.bullet.kit.p1156rn.AbstractC16464g, com.bytedance.ies.bullet.p1125a.p1126a.p1127a.C16116a
    /* renamed from: a */
    public final AbstractC16454c mo25654a() {
        return new C35274a();
    }

    @Override // com.bytedance.ies.bullet.kit.p1156rn.AbstractC16464g, com.bytedance.ies.bullet.p1125a.p1126a.p1127a.C16116a
    /* renamed from: b */
    public final AbstractC16462e mo25655b() {
        return new C35276c();
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.module.default.c$b */
    public static final class C35275b implements AbstractC16210j {

        /* renamed from: a */
        final /* synthetic */ C16248b f83287a;

        static {
            Covode.recordClassIndex(42440);
        }

        C35275b(C16248b bVar) {
            this.f83287a = bVar;
        }

        @Override // com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16210j
        /* renamed from: a */
        public final void mo25781a(AbstractC16208i iVar) {
            C89219l.m154721d(iVar, "");
            AbstractC16210j.C16211a.m30127a(iVar);
        }

        @Override // com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16210j
        /* renamed from: a */
        public final void mo25782a(AbstractC16208i iVar, Uri uri) {
            C89219l.m154721d(iVar, "");
            C89219l.m154721d(uri, "");
            AbstractC16210j.C16211a.m30128a(iVar, uri);
        }

        @Override // com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16210j
        /* renamed from: a */
        public final void mo25784a(AbstractC16208i iVar, Throwable th) {
            C89219l.m154721d(iVar, "");
            AbstractC16210j.C16211a.m30130b(iVar);
        }

        @Override // com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16210j
        /* renamed from: a */
        public final void mo25783a(AbstractC16208i iVar, Uri uri, AbstractC89172b<? super Uri, C89391z> bVar, AbstractC89172b<? super Throwable, C89391z> bVar2) {
            C89219l.m154721d(iVar, "");
            C89219l.m154721d(uri, "");
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(bVar2, "");
            AbstractC16210j.C16211a.m30129a(iVar, uri, bVar, bVar2);
        }
    }

    public C35273c(C16248b bVar) {
        C89219l.m154721d(bVar, "");
        this.f83286a = bVar;
    }

    @Override // com.bytedance.ies.bullet.p1125a.p1126a.p1127a.C16116a, com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16204e
    /* renamed from: a */
    public final AbstractC16210j mo25653a(C16248b bVar) {
        C89219l.m154721d(bVar, "");
        return new C35275b(bVar);
    }
}
