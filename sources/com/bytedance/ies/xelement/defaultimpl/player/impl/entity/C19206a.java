package com.bytedance.ies.xelement.defaultimpl.player.impl.entity;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1379c.AbstractC19186f;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1379c.AbstractC19188h;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xelement.defaultimpl.player.impl.entity.a */
public final class C19206a implements AbstractC19188h {

    /* renamed from: a */
    private final String f45372a;

    /* renamed from: b */
    private final List<AbstractC19186f> f45373b;

    /* renamed from: c */
    private int f45374c;

    static {
        Covode.recordClassIndex(21972);
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1379c.AbstractC19188h
    /* renamed from: a */
    public final String mo30537a() {
        return this.f45372a;
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1379c.AbstractC19188h
    /* renamed from: b */
    public final List<AbstractC19186f> mo30539b() {
        return this.f45373b;
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1379c.AbstractC19188h
    /* renamed from: c */
    public final int mo30540c() {
        return this.f45374c;
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1379c.AbstractC19188h
    /* renamed from: a */
    public final void mo30538a(int i) {
        this.f45374c = i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.f> */
    /* JADX WARN: Multi-variable type inference failed */
    public C19206a(String str, List<? extends AbstractC19186f> list, int i) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(list, "");
        this.f45372a = str;
        this.f45373b = list;
        this.f45374c = i;
    }
}
