package com.bytedance.ies.xbridge.platform.lynx.p1355a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.AbstractC18659k;
import com.bytedance.ies.xbridge.AbstractC18687l;
import com.bytedance.ies.xbridge.AbstractC18700m;
import com.bytedance.ies.xbridge.AbstractC18754n;
import com.bytedance.ies.xbridge.EnumC18805o;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.lynx.react.bridge.AbstractC28367a;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableMapKeySetIterator;
import com.lynx.react.bridge.ReadableType;
import java.util.HashMap;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xbridge.platform.lynx.a.g */
public final class C18840g implements AbstractC18754n {

    /* renamed from: a */
    private final ReadableMap f44648a;

    static {
        Covode.recordClassIndex(21537);
    }

    @Override // com.bytedance.ies.xbridge.AbstractC18754n
    /* renamed from: b */
    public final Map<String, Object> mo29758b() {
        HashMap<String, Object> hashMap = this.f44648a.toHashMap();
        C89219l.m154709a((Object) hashMap, "");
        return hashMap;
    }

    @Override // com.bytedance.ies.xbridge.AbstractC18754n
    /* renamed from: a */
    public final AbstractC18687l mo29756a() {
        ReadableMapKeySetIterator keySetIterator = this.f44648a.keySetIterator();
        C89219l.m154709a((Object) keySetIterator, "");
        return new C18836c(keySetIterator);
    }

    public C18840g(ReadableMap readableMap) {
        C89219l.m154719c(readableMap, "");
        this.f44648a = readableMap;
    }

    @Override // com.bytedance.ies.xbridge.AbstractC18754n
    /* renamed from: a */
    public final boolean mo29757a(String str) {
        C89219l.m154719c(str, "");
        return this.f44648a.hasKey(str);
    }

    @Override // com.bytedance.ies.xbridge.AbstractC18754n
    /* renamed from: c */
    public final boolean mo29760c(String str) {
        C89219l.m154719c(str, "");
        return this.f44648a.getBoolean(str);
    }

    @Override // com.bytedance.ies.xbridge.AbstractC18754n
    /* renamed from: d */
    public final double mo29761d(String str) {
        C89219l.m154719c(str, "");
        return this.f44648a.getDouble(str);
    }

    @Override // com.bytedance.ies.xbridge.AbstractC18754n
    /* renamed from: e */
    public final int mo29762e(String str) {
        C89219l.m154719c(str, "");
        return this.f44648a.getInt(str);
    }

    @Override // com.bytedance.ies.xbridge.AbstractC18754n
    /* renamed from: f */
    public final String mo29763f(String str) {
        C89219l.m154719c(str, "");
        String string = this.f44648a.getString(str);
        C89219l.m154709a((Object) string, "");
        return string;
    }

    @Override // com.bytedance.ies.xbridge.AbstractC18754n
    /* renamed from: b */
    public final boolean mo29759b(String str) {
        C89219l.m154719c(str, "");
        return this.f44648a.isNull(str);
    }

    @Override // com.bytedance.ies.xbridge.AbstractC18754n
    /* renamed from: g */
    public final AbstractC18700m mo29764g(String str) {
        C89219l.m154719c(str, "");
        ReadableArray array = this.f44648a.getArray(str);
        if (array == null) {
            return null;
        }
        return new C18838e(array);
    }

    @Override // com.bytedance.ies.xbridge.AbstractC18754n
    /* renamed from: h */
    public final AbstractC18754n mo29765h(String str) {
        C89219l.m154719c(str, "");
        ReadableMap map = this.f44648a.getMap(str);
        if (map == null) {
            return null;
        }
        return new C18840g(map);
    }

    @Override // com.bytedance.ies.xbridge.AbstractC18754n
    /* renamed from: i */
    public final AbstractC18659k mo29766i(String str) {
        C89219l.m154719c(str, "");
        AbstractC28367a dynamic = this.f44648a.getDynamic(str);
        C89219l.m154709a((Object) dynamic, "");
        return new C18834a(dynamic);
    }

    @Override // com.bytedance.ies.xbridge.AbstractC18754n
    /* renamed from: j */
    public final EnumC18805o mo29767j(String str) {
        C89219l.m154719c(str, "");
        ReadableType type = this.f44648a.getType(str);
        if (type != null) {
            switch (C18841h.f44649a[type.ordinal()]) {
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
}
