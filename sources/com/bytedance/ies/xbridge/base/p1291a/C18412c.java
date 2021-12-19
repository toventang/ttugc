package com.bytedance.ies.xbridge.base.p1291a;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.AbstractC18700m;
import com.bytedance.ies.xbridge.AbstractC18754n;
import com.bytedance.ies.xbridge.EnumC18805o;
import com.bytedance.ies.xbridge.p1290b.AbstractC18407c;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xbridge.base.a.c */
public final class C18412c implements AbstractC18407c {

    /* renamed from: b */
    public static final C18413a f43997b = new C18413a((byte) 0);

    /* renamed from: a */
    public final SharedPreferences f43998a;

    static {
        Covode.recordClassIndex(21084);
    }

    /* renamed from: com.bytedance.ies.xbridge.base.a.c$a */
    public static final class C18413a extends C18416e<C18412c, Context> {
        static {
            Covode.recordClassIndex(21085);
        }

        private C18413a() {
            super(C184141.f43999a);
        }

        public /* synthetic */ C18413a(byte b) {
            this();
        }
    }

    /* renamed from: b */
    private final SharedPreferences.Editor m34270b() {
        SharedPreferences.Editor edit = this.f43998a.edit();
        C89219l.m154709a((Object) edit, "");
        return edit;
    }

    @Override // com.bytedance.ies.xbridge.p1290b.AbstractC18407c
    /* renamed from: a */
    public final Set<String> mo29434a() {
        return this.f43998a.getAll().keySet();
    }

    private C18412c(Context context) {
        SharedPreferences a = C34822d.m71158a(context, "xbridge-storage", 0);
        C89219l.m154709a((Object) a, "");
        this.f43998a = a;
    }

    @Override // com.bytedance.ies.xbridge.p1290b.AbstractC18407c
    /* renamed from: b */
    public final boolean mo29436b(String str) {
        if (str == null) {
            return false;
        }
        m34270b().remove(str).apply();
        return true;
    }

    @Override // com.bytedance.ies.xbridge.p1290b.AbstractC18407c
    /* renamed from: a */
    public final Object mo29433a(String str) {
        if (str == null || !this.f43998a.contains(str)) {
            return null;
        }
        String string = this.f43998a.getString(str, "");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        if (string == null) {
            C89219l.m154707a();
        }
        C18417f fVar = (C18417f) C18410a.m34267a(string, C18417f.class);
        String str2 = fVar.f44004b;
        switch (C18415d.f44000a[EnumC18805o.valueOf(fVar.f44003a).ordinal()]) {
            case 1:
                return Boolean.valueOf(Boolean.parseBoolean(str2));
            case 2:
                return Integer.valueOf(Integer.parseInt(str2));
            case 3:
                return Double.valueOf(Double.parseDouble(str2));
            case 4:
                return str2;
            case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                return C18410a.m34267a(str2, List.class);
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                return C18410a.m34267a(str2, Map.class);
            default:
                return null;
        }
    }

    public /* synthetic */ C18412c(Context context, byte b) {
        this(context);
    }

    @Override // com.bytedance.ies.xbridge.p1290b.AbstractC18407c
    /* renamed from: a */
    public final boolean mo29435a(String str, Object obj) {
        String a;
        if (str == null || obj == null) {
            return false;
        }
        SharedPreferences.Editor b = m34270b();
        while (true) {
            new LinkedHashMap();
            if (obj instanceof Boolean) {
                a = C18410a.m34268a(new C18417f(EnumC18805o.Boolean.name(), obj.toString()));
                break;
            } else if (obj instanceof Integer) {
                a = C18410a.m34268a(new C18417f(EnumC18805o.Int.name(), obj.toString()));
                break;
            } else if (obj instanceof Double) {
                a = C18410a.m34268a(new C18417f(EnumC18805o.Number.name(), obj.toString()));
                break;
            } else if (obj instanceof String) {
                a = C18410a.m34268a(new C18417f(EnumC18805o.String.name(), obj.toString()));
                break;
            } else if (obj instanceof AbstractC18700m) {
                obj = ((AbstractC18700m) obj).mo29733b();
            } else if (obj instanceof AbstractC18754n) {
                obj = ((AbstractC18754n) obj).mo29758b();
            } else if (obj instanceof List) {
                a = C18410a.m34268a(new C18417f(EnumC18805o.Array.name(), C18410a.m34268a(obj)));
            } else if (obj instanceof Map) {
                a = C18410a.m34268a(new C18417f(EnumC18805o.Map.name(), C18410a.m34268a(obj)));
            } else {
                a = "";
            }
        }
        b.putString(str, a).apply();
        return true;
    }
}
