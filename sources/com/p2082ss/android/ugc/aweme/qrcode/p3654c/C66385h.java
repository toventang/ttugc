package com.p2082ss.android.ugc.aweme.qrcode.p3654c;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.qrcode.C66375c;
import com.p2082ss.android.ugc.aweme.qrcode.api.C66371a;
import com.p2082ss.android.ugc.aweme.qrcode.p3654c.AbstractC66376a;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.qrcode.c.h */
public final class C66385h extends AbstractC66376a {

    /* renamed from: c */
    private Context f149288c;

    static {
        Covode.recordClassIndex(77917);
    }

    public C66385h(AbstractC66376a.AbstractC66377a aVar, Context context) {
        super(aVar);
        this.f149288c = context;
    }

    @Override // com.p2082ss.android.ugc.aweme.qrcode.p3654c.AbstractC66380d
    /* renamed from: a */
    public final boolean mo90116a(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Uri parse = Uri.parse(str);
        String host = parse.getHost();
        if (!TextUtils.isEmpty(host) && C66371a.m118060a(host)) {
            List<String> pathSegments = parse.getPathSegments();
            if (!C13603b.m24435a((Collection) pathSegments) && pathSegments.size() >= 3 && TextUtils.equals("share", pathSegments.get(0))) {
                String str2 = pathSegments.get(2);
                int a = C66375c.m118064a(pathSegments.get(1));
                this.f149283a = C66375c.m118065b(a, str2);
                return this.f149284b.mo105308a(a, str2, str, null);
            }
        }
        return false;
    }
}
