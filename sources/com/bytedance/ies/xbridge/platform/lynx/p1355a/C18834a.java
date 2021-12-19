package com.bytedance.ies.xbridge.platform.lynx.p1355a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.AbstractC18659k;
import com.bytedance.ies.xbridge.AbstractC18700m;
import com.bytedance.ies.xbridge.AbstractC18754n;
import com.bytedance.ies.xbridge.EnumC18805o;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.lynx.react.bridge.AbstractC28367a;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableType;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xbridge.platform.lynx.a.a */
public final class C18834a implements AbstractC18659k {

    /* renamed from: a */
    private final AbstractC28367a f44642a;

    static {
        Covode.recordClassIndex(21531);
    }

    @Override // com.bytedance.ies.xbridge.AbstractC18659k
    /* renamed from: b */
    public final boolean mo29708b() {
        return this.f44642a.mo48553b();
    }

    @Override // com.bytedance.ies.xbridge.AbstractC18659k
    /* renamed from: c */
    public final double mo29709c() {
        return this.f44642a.mo48554c();
    }

    @Override // com.bytedance.ies.xbridge.AbstractC18659k
    /* renamed from: d */
    public final int mo29710d() {
        return this.f44642a.mo48555d();
    }

    @Override // com.bytedance.ies.xbridge.AbstractC18659k
    /* renamed from: e */
    public final String mo29711e() {
        String e = this.f44642a.mo48556e();
        C89219l.m154709a((Object) e, "");
        return e;
    }

    @Override // com.bytedance.ies.xbridge.AbstractC18659k
    /* renamed from: f */
    public final AbstractC18700m mo29712f() {
        ReadableArray f = this.f44642a.mo48557f();
        if (f == null) {
            return null;
        }
        return new C18838e(f);
    }

    @Override // com.bytedance.ies.xbridge.AbstractC18659k
    /* renamed from: g */
    public final AbstractC18754n mo29713g() {
        ReadableMap g = this.f44642a.mo48558g();
        if (g == null) {
            return null;
        }
        return new C18840g(g);
    }

    @Override // com.bytedance.ies.xbridge.AbstractC18659k
    /* renamed from: a */
    public final EnumC18805o mo29707a() {
        ReadableType h = this.f44642a.mo48559h();
        if (h != null) {
            switch (C18835b.f44643a[h.ordinal()]) {
                case 1:
                    return EnumC18805o.Null;
                case 2:
                    return EnumC18805o.Array;
                case 3:
                    return EnumC18805o.Boolean;
                case 4:
                    return EnumC18805o.Map;
                case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                    return EnumC18805o.Number;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                    return EnumC18805o.String;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                    return EnumC18805o.Int;
            }
        }
        return EnumC18805o.Null;
    }

    public C18834a(AbstractC28367a aVar) {
        C89219l.m154719c(aVar, "");
        this.f44642a = aVar;
    }
}
