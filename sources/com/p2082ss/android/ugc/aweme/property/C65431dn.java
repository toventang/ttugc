package com.p2082ss.android.ugc.aweme.property;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.property.dn */
public class C65431dn {
    @AbstractC27891c(mo46611a = "package_url")
    public final String packageUrl;
    @AbstractC27891c(mo46611a = "scene")
    public final String scene;
    @AbstractC27891c(mo46611a = StringSet.type)
    public final int type;

    static {
        Covode.recordClassIndex(76918);
    }

    public C65431dn() {
        this(null, 0, null, 7, null);
    }

    public C65431dn(String str, int i, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        this.scene = str;
        this.type = i;
        this.packageUrl = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C65431dn(String str, int i, String str2, int i2, C89214g gVar) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? -1 : i, (i2 & 4) != 0 ? "" : str2);
    }
}
