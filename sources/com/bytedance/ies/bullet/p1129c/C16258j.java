package com.bytedance.ies.bullet.p1129c;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16203d;
import com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16204e;
import com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16206g;
import com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16208i;
import com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16213l;
import com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16214m;
import com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16186l;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.AbstractC16741q;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.bullet.c.j */
public final class C16258j implements AbstractC16255g {

    /* renamed from: a */
    private final Map<Class<AbstractC16203d<?, ?, ?, ?>>, AbstractC16213l<?, ?>> f39057a = new LinkedHashMap();

    /* renamed from: b */
    private final AbstractC16186l f39058b;

    /* renamed from: c */
    private final C16248b f39059c;

    /* renamed from: d */
    private final AbstractC89172b<C16248b, List<AbstractC16741q>> f39060d;

    static {
        Covode.recordClassIndex(18551);
    }

    @Override // com.bytedance.ies.bullet.p1129c.AbstractC16255g
    /* renamed from: a */
    public final AbstractC16186l mo25840a() {
        return this.f39058b;
    }

    @Override // com.bytedance.ies.bullet.p1129c.AbstractC16255g
    /* renamed from: b */
    public final AbstractC89172b<C16248b, List<AbstractC16741q>> mo25843b() {
        return this.f39060d;
    }

    @Override // com.bytedance.ies.bullet.p1129c.AbstractC16255g
    /* renamed from: c */
    public final C16248b mo25844c() {
        return this.f39059c;
    }

    @Override // com.bytedance.ies.bullet.p1129c.AbstractC16255g
    /* renamed from: a */
    public final <S extends AbstractC16203d<? extends T, ? extends U, ? extends V, ? extends X>, T extends AbstractC16214m, U extends AbstractC16204e, V extends AbstractC16208i, X extends AbstractC16206g> AbstractC16213l<T, U> mo25841a(Class<? extends S> cls) {
        C89219l.m154719c(cls, "");
        AbstractC16213l<T, U> lVar = (AbstractC16213l<T, U>) this.f39057a.get(cls);
        if (lVar != null) {
            return lVar;
        }
        return null;
    }

    @Override // com.bytedance.ies.bullet.p1129c.AbstractC16255g
    /* renamed from: a */
    public final <S extends AbstractC16203d<? extends T, ? extends U, ? extends V, ? extends X>, T extends AbstractC16214m, U extends AbstractC16204e, V extends AbstractC16208i, X extends AbstractC16206g> void mo25842a(Class<? extends S> cls, AbstractC16213l<? extends T, ? extends U> lVar) {
        C89219l.m154719c(cls, "");
        C89219l.m154719c(lVar, "");
        this.f39057a.put(cls, lVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: h.f.a.b<? super com.bytedance.ies.bullet.c.e.a.b, ? extends java.util.List<? extends com.bytedance.ies.bullet.service.f.a.b.q>> */
    /* JADX WARN: Multi-variable type inference failed */
    public C16258j(AbstractC16186l lVar, C16248b bVar, AbstractC89172b<? super C16248b, ? extends List<? extends AbstractC16741q>> bVar2) {
        C89219l.m154719c(lVar, "");
        C89219l.m154719c(bVar, "");
        C89219l.m154719c(bVar2, "");
        this.f39058b = lVar;
        this.f39059c = bVar;
        this.f39060d = bVar2;
    }
}
