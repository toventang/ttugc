package com.p2082ss.android.ugc.aweme.property;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.property.et */
public final class C65467et {
    @AbstractC27891c(mo46611a = "key")

    /* renamed from: a */
    public final String f147658a;
    @AbstractC27891c(mo46611a = "value")

    /* renamed from: b */
    public final String f147659b;

    static {
        Covode.recordClassIndex(76954);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C65467et)) {
            return false;
        }
        C65467et etVar = (C65467et) obj;
        return C89219l.m154714a(this.f147658a, etVar.f147658a) && C89219l.m154714a(this.f147659b, etVar.f147659b);
    }

    public final int hashCode() {
        String str = this.f147658a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f147659b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "VESynthesisSettingsCategoryItem(key=" + this.f147658a + ", value=" + this.f147659b + ")";
    }

    private /* synthetic */ C65467et() {
        this("", "");
    }

    private C65467et(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        this.f147658a = str;
        this.f147659b = str2;
    }
}
