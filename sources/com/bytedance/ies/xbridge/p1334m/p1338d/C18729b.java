package com.bytedance.ies.xbridge.p1334m.p1338d;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.AbstractC18700m;
import com.bytedance.ies.xbridge.AbstractC18754n;
import com.bytedance.ies.xbridge.EnumC18805o;
import com.bytedance.ies.xbridge.base.runtime.p1295d.C18441c;
import com.bytedance.ies.xbridge.p1290b.AbstractC18407c;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xbridge.m.d.b */
public final class C18729b implements AbstractC18407c {

    /* renamed from: b */
    public static final C18730a f44512b = new C18730a((byte) 0);

    /* renamed from: a */
    public final SharedPreferences f44513a;

    static {
        Covode.recordClassIndex(21423);
    }

    /* renamed from: com.bytedance.ies.xbridge.m.d.b$a */
    public static final class C18730a extends C18733d<C18729b, Context> {
        static {
            Covode.recordClassIndex(21424);
        }

        private C18730a() {
            super(C187311.f44514a);
        }

        public /* synthetic */ C18730a(byte b) {
            this();
        }
    }

    /* renamed from: b */
    private final SharedPreferences.Editor m34766b() {
        SharedPreferences.Editor edit = this.f44513a.edit();
        C89219l.m154709a((Object) edit, "");
        return edit;
    }

    @Override // com.bytedance.ies.xbridge.p1290b.AbstractC18407c
    /* renamed from: a */
    public final Set<String> mo29434a() {
        return this.f44513a.getAll().keySet();
    }

    private C18729b(Context context) {
        SharedPreferences a = C34822d.m71158a(context, "xbridge-storage", 0);
        C89219l.m154709a((Object) a, "");
        this.f44513a = a;
    }

    @Override // com.bytedance.ies.xbridge.p1290b.AbstractC18407c
    /* renamed from: b */
    public final boolean mo29436b(String str) {
        if (str == null) {
            return false;
        }
        m34766b().remove(str).apply();
        return true;
    }

    @Override // com.bytedance.ies.xbridge.p1290b.AbstractC18407c
    /* renamed from: a */
    public final Object mo29433a(String str) {
        if (str == null || !this.f44513a.contains(str)) {
            return null;
        }
        String string = this.f44513a.getString(str, "");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        if (string == null) {
            C89219l.m154707a();
        }
        C18734e eVar = (C18734e) C18441c.m34302a(string, C18734e.class);
        String str2 = eVar.f44519b;
        switch (C18732c.f44515a[EnumC18805o.valueOf(eVar.f44518a).ordinal()]) {
            case 1:
                return Boolean.valueOf(Boolean.parseBoolean(str2));
            case 2:
                return Integer.valueOf(Integer.parseInt(str2));
            case 3:
                return Double.valueOf(Double.parseDouble(str2));
            case 4:
                return str2;
            case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                return C18441c.m34302a(str2, List.class);
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                return C18441c.m34302a(str2, Map.class);
            default:
                return null;
        }
    }

    public /* synthetic */ C18729b(Context context, byte b) {
        this(context);
    }

    @Override // com.bytedance.ies.xbridge.p1290b.AbstractC18407c
    /* renamed from: a */
    public final boolean mo29435a(String str, Object obj) {
        String a;
        if (str == null || obj == null) {
            return false;
        }
        SharedPreferences.Editor b = m34766b();
        while (true) {
            new LinkedHashMap();
            if (obj instanceof Boolean) {
                a = C18441c.m34303a(new C18734e(EnumC18805o.Boolean.name(), obj.toString()));
                break;
            } else if (obj instanceof Integer) {
                a = C18441c.m34303a(new C18734e(EnumC18805o.Int.name(), obj.toString()));
                break;
            } else if (obj instanceof Double) {
                a = C18441c.m34303a(new C18734e(EnumC18805o.Number.name(), obj.toString()));
                break;
            } else if (obj instanceof String) {
                a = C18441c.m34303a(new C18734e(EnumC18805o.String.name(), obj.toString()));
                break;
            } else if (obj instanceof AbstractC18700m) {
                obj = ((AbstractC18700m) obj).mo29733b();
            } else if (obj instanceof AbstractC18754n) {
                obj = ((AbstractC18754n) obj).mo29758b();
            } else if (obj instanceof List) {
                a = C18441c.m34303a(new C18734e(EnumC18805o.Array.name(), C18441c.m34303a(obj)));
            } else if (obj instanceof Map) {
                a = C18441c.m34303a(new C18734e(EnumC18805o.Map.name(), C18441c.m34303a(obj)));
            } else {
                a = "";
            }
        }
        b.putString(str, a).apply();
        return true;
    }
}
