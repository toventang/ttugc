package com.p2082ss.android.ugc.aweme.deeplink.p2733b;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC34266aw;
import com.p2082ss.android.ugc.aweme.deeplink.C41051n;
import java.util.HashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.deeplink.b.f */
public final class C41021f {

    /* renamed from: a */
    public static final HashMap<EnumC41020e, AbstractC41017b> f95904a;

    /* renamed from: b */
    public static final C41021f f95905b = new C41021f();

    private C41021f() {
    }

    static {
        Covode.recordClassIndex(48891);
        HashMap<EnumC41020e, AbstractC41017b> hashMap = new HashMap<>();
        f95904a = hashMap;
        hashMap.put(EnumC41020e.TYPE_NONE, new C41019d());
        hashMap.put(EnumC41020e.TYPE_COMMAND, new C41018c());
        hashMap.put(EnumC41020e.TYPE_ACTION, new C41016a());
    }

    /* renamed from: a */
    public static boolean m82638a(Uri uri) {
        for (AbstractC34266aw awVar : C41051n.C41052a.m82700b()) {
            String scheme = uri.getScheme();
            if (scheme == null) {
                scheme = "";
            }
            C89219l.m154716b(scheme, "");
            String host = uri.getHost();
            if (host == null) {
                host = "";
            }
            C89219l.m154716b(host, "");
            String path = uri.getPath();
            if (path == null) {
                path = "";
            }
            C89219l.m154716b(path, "");
            if (awVar.mo59964a(uri, scheme, host, path)) {
                return true;
            }
        }
        return false;
    }
}
