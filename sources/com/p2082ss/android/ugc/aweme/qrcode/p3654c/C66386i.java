package com.p2082ss.android.ugc.aweme.qrcode.p3654c;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.qrcode.api.C66371a;
import com.p2082ss.android.ugc.aweme.qrcode.p3654c.AbstractC66376a;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.qrcode.c.i */
public final class C66386i extends AbstractC66376a {
    static {
        Covode.recordClassIndex(77918);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66386i(AbstractC66376a.AbstractC66377a aVar) {
        super(aVar);
        C89219l.m154721d(aVar, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.qrcode.p3654c.AbstractC66380d
    /* renamed from: a */
    public final boolean mo90116a(String str, int i) {
        C89219l.m154721d(str, "");
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Uri parse = Uri.parse(str);
        C89219l.m154716b(parse, "");
        String host = parse.getHost();
        if (!TextUtils.isEmpty(host) && C66371a.m118060a(host)) {
            List<String> pathSegments = parse.getPathSegments();
            if (pathSegments.size() > 1 && C89219l.m154714a((Object) pathSegments.get(0), (Object) "v")) {
                AbstractC66376a.AbstractC66377a aVar = this.f149284b;
                String str2 = pathSegments.get(1);
                C89219l.m154716b(str2, "");
                return aVar.mo105308a(1, (String) C89070n.m154583g((List) C89361p.m154915b(str2, new String[]{"."})), str, null);
            } else if (pathSegments.size() >= 4 && C89219l.m154714a((Object) pathSegments.get(2), (Object) "video")) {
                return this.f149284b.mo105308a(1, pathSegments.get(3), str, null);
            }
        }
        return false;
    }
}
