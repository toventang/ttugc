package com.bytedance.ies.ugc.network.partner.p1276b;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.C22096s;
import com.bytedance.retrofit2.C22099u;
import com.bytedance.retrofit2.client.C22027b;
import com.bytedance.retrofit2.client.C22028c;
import com.bytedance.retrofit2.mime.TypedInput;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.ugc.network.partner.b.g */
public final class C18201g<T> {

    /* renamed from: a */
    public C18202h f43355a;

    /* renamed from: b */
    public int f43356b;

    /* renamed from: c */
    public String f43357c;

    /* renamed from: d */
    public final C18195b f43358d;

    /* renamed from: e */
    public TypedInput f43359e;

    /* renamed from: f */
    public Object f43360f;

    /* renamed from: g */
    public T f43361g;

    /* renamed from: h */
    public TypedInput f43362h;

    /* renamed from: i */
    public C22096s f43363i;

    /* renamed from: j */
    private final C22028c f43364j;

    /* renamed from: k */
    private final C22099u<T> f43365k;

    static {
        Covode.recordClassIndex(20857);
    }

    /* renamed from: a */
    public final C22099u<T> mo29060a() {
        C22028c cVar = new C22028c(this.f43355a.mo29061a(), this.f43356b, this.f43357c, this.f43358d.mo29046a(), this.f43359e);
        cVar.f52044f = this.f43360f;
        if (this.f43365k.f52261a.mo35845a()) {
            C22099u<T> a = C22099u.m41528a((Object) this.f43361g, cVar);
            C89219l.m154716b(a, "");
            return a;
        }
        C22099u<T> a2 = C22099u.m41527a(this.f43362h, cVar);
        C89219l.m154716b(a2, "");
        return a2;
    }

    public C18201g(C22099u<T> uVar) {
        C89219l.m154721d(uVar, "");
        this.f43365k = uVar;
        C22028c cVar = uVar.f52261a;
        C89219l.m154716b(cVar, "");
        this.f43364j = cVar;
        C18202h a = C18202h.m33867a(cVar.f52039a);
        C89219l.m154716b(a, "");
        this.f43355a = a;
        this.f43356b = cVar.f52040b;
        String str = cVar.f52041c;
        C89219l.m154716b(str, "");
        this.f43357c = str;
        List<C22027b> list = cVar.f52042d;
        C89219l.m154716b(list, "");
        this.f43358d = new C18195b(list);
        this.f43359e = cVar.f52043e;
        this.f43360f = cVar.f52044f;
        this.f43361g = uVar.f52262b;
        this.f43362h = uVar.f52263c;
        this.f43363i = uVar.f52264d;
    }
}
