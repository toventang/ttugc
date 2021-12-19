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
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xbridge.platform.lynx.a.e */
public final class C18838e implements AbstractC18700m {

    /* renamed from: a */
    private final ReadableArray f44646a;

    static {
        Covode.recordClassIndex(21535);
    }

    @Override // com.bytedance.ies.xbridge.AbstractC18700m
    /* renamed from: a */
    public final int mo29730a() {
        return this.f44646a.size();
    }

    @Override // com.bytedance.ies.xbridge.AbstractC18700m
    /* renamed from: b */
    public final List<Object> mo29733b() {
        ArrayList<Object> arrayList = this.f44646a.toArrayList();
        C89219l.m154709a((Object) arrayList, "");
        return arrayList;
    }

    @Override // com.bytedance.ies.xbridge.AbstractC18700m
    /* renamed from: b */
    public final double mo29732b(int i) {
        return this.f44646a.getDouble(i);
    }

    @Override // com.bytedance.ies.xbridge.AbstractC18700m
    /* renamed from: c */
    public final int mo29734c(int i) {
        return this.f44646a.getInt(i);
    }

    public C18838e(ReadableArray readableArray) {
        C89219l.m154719c(readableArray, "");
        this.f44646a = readableArray;
    }

    @Override // com.bytedance.ies.xbridge.AbstractC18700m
    /* renamed from: a */
    public final boolean mo29731a(int i) {
        return this.f44646a.getBoolean(i);
    }

    @Override // com.bytedance.ies.xbridge.AbstractC18700m
    /* renamed from: d */
    public final String mo29735d(int i) {
        String string = this.f44646a.getString(i);
        C89219l.m154709a((Object) string, "");
        return string;
    }

    @Override // com.bytedance.ies.xbridge.AbstractC18700m
    /* renamed from: e */
    public final AbstractC18700m mo29736e(int i) {
        ReadableArray array = this.f44646a.getArray(i);
        if (array == null) {
            return null;
        }
        return new C18838e(array);
    }

    @Override // com.bytedance.ies.xbridge.AbstractC18700m
    /* renamed from: f */
    public final AbstractC18754n mo29737f(int i) {
        ReadableMap map = this.f44646a.getMap(i);
        if (map == null) {
            return null;
        }
        return new C18840g(map);
    }

    @Override // com.bytedance.ies.xbridge.AbstractC18700m
    /* renamed from: g */
    public final AbstractC18659k mo29738g(int i) {
        AbstractC28367a dynamic = this.f44646a.getDynamic(i);
        C89219l.m154709a((Object) dynamic, "");
        return new C18834a(dynamic);
    }

    @Override // com.bytedance.ies.xbridge.AbstractC18700m
    /* renamed from: h */
    public final EnumC18805o mo29739h(int i) {
        ReadableType type = this.f44646a.getType(i);
        if (type != null) {
            switch (C18839f.f44647a[type.ordinal()]) {
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
