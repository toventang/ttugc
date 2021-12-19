package com.p2082ss.android.ugc.aweme.bullet;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.kit.lynx.AbstractC16405c;
import com.bytedance.ies.bullet.kit.lynx.AbstractC16412e;
import com.bytedance.ies.bullet.kit.lynx.p1153b.AbstractC16391d;
import com.bytedance.ies.bullet.kit.p1156rn.AbstractC16464g;
import com.bytedance.ies.bullet.kit.p1156rn.AbstractC16466i;
import com.bytedance.ies.bullet.kit.p1156rn.p1157a.AbstractC16451c;
import com.bytedance.ies.bullet.kit.web.AbstractC16495d;
import com.bytedance.ies.bullet.kit.web.AbstractC16497f;
import com.bytedance.ies.bullet.kit.web.p1159a.AbstractC16483g;
import com.bytedance.ies.bullet.p1125a.AbstractC16127c;
import com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16183k;
import com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16190o;
import com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16192q;
import com.bytedance.ies.bullet.p1129c.p1132c.p1133a.C16162c;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.bytedance.ies.bullet.p1129c.p1136e.p1138b.AbstractC16252a;
import com.bytedance.ies.bullet.p1184ui.common.p1186b.AbstractC17019c;
import com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.AbstractC16741q;
import com.p2082ss.android.ugc.aweme.bullet.module.base.C35222b;
import com.p2082ss.android.ugc.aweme.bullet.module.p2422default.C35271b;
import com.p2082ss.android.ugc.aweme.bullet.module.p2422default.C35273c;
import com.p2082ss.android.ugc.aweme.bullet.module.p2422default.C35277d;
import com.p2082ss.android.ugc.aweme.bullet.module.p2422default.C35278e;
import com.p2082ss.android.ugc.aweme.bullet.module.p2422default.C35281f;
import com.p2082ss.android.ugc.aweme.bullet.module.p2422default.DefaultLynxKitDelegatesProvider;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.bullet.d */
public final class C35132d implements AbstractC16127c, AbstractC16391d, AbstractC16451c, AbstractC16483g {
    static {
        Covode.recordClassIndex(42287);
    }

    @Override // com.bytedance.ies.bullet.p1125a.AbstractC16129d
    /* renamed from: a */
    public final List<AbstractC16190o> mo25666a(C16248b bVar) {
        C89219l.m154721d(bVar, "");
        return AbstractC16127c.C16128a.m29945a(bVar);
    }

    @Override // com.bytedance.ies.bullet.p1125a.AbstractC16129d
    /* renamed from: b */
    public final List<AbstractC16183k> mo25667b(C16248b bVar) {
        C89219l.m154721d(bVar, "");
        return BulletHostProxy.m71370b().mo61835a(bVar);
    }

    @Override // com.bytedance.ies.bullet.p1125a.AbstractC16129d
    /* renamed from: c */
    public final List<AbstractC16192q> mo25668c(C16248b bVar) {
        C89219l.m154721d(bVar, "");
        return AbstractC16127c.C16128a.m29946b(bVar);
    }

    @Override // com.bytedance.ies.bullet.p1125a.AbstractC16129d
    /* renamed from: d */
    public final AbstractC16252a<C16162c> mo25669d(C16248b bVar) {
        C89219l.m154721d(bVar, "");
        return AbstractC16127c.C16128a.m29947c(bVar);
    }

    @Override // com.bytedance.ies.bullet.p1125a.AbstractC16132f
    /* renamed from: e */
    public final AbstractC17019c mo25670e(C16248b bVar) {
        C89219l.m154721d(bVar, "");
        return new C35222b(bVar);
    }

    @Override // com.bytedance.ies.bullet.p1125a.AbstractC16136i
    /* renamed from: f */
    public final List<AbstractC16741q> mo25680f(C16248b bVar) {
        C89219l.m154721d(bVar, "");
        return AbstractC16127c.C16128a.m29948d(bVar);
    }

    @Override // com.bytedance.ies.bullet.kit.lynx.p1153b.AbstractC16391d
    /* renamed from: g */
    public final AbstractC16412e mo26021g(C16248b bVar) {
        C89219l.m154721d(bVar, "");
        return new C35271b();
    }

    @Override // com.bytedance.ies.bullet.kit.lynx.p1153b.AbstractC16391d
    /* renamed from: h */
    public final AbstractC16405c mo26022h(C16248b bVar) {
        C89219l.m154721d(bVar, "");
        return new DefaultLynxKitDelegatesProvider();
    }

    @Override // com.bytedance.ies.bullet.kit.p1156rn.p1157a.AbstractC16451c
    /* renamed from: i */
    public final AbstractC16466i mo26090i(C16248b bVar) {
        C89219l.m154721d(bVar, "");
        return new C35277d(bVar);
    }

    @Override // com.bytedance.ies.bullet.kit.p1156rn.p1157a.AbstractC16451c
    /* renamed from: j */
    public final AbstractC16464g mo26091j(C16248b bVar) {
        C89219l.m154721d(bVar, "");
        return new C35273c(bVar);
    }

    @Override // com.bytedance.ies.bullet.kit.web.p1159a.AbstractC16483g
    /* renamed from: k */
    public final AbstractC16497f mo26188k(C16248b bVar) {
        C89219l.m154721d(bVar, "");
        return new C35281f(bVar);
    }

    @Override // com.bytedance.ies.bullet.kit.web.p1159a.AbstractC16483g
    /* renamed from: l */
    public final AbstractC16495d mo26189l(C16248b bVar) {
        C89219l.m154721d(bVar, "");
        return new C35278e(bVar);
    }
}
