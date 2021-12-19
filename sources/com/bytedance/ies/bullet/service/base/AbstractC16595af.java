package com.bytedance.ies.bullet.service.base;

import android.net.Uri;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.base.p1163a.AbstractC16568c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.ies.bullet.service.base.af */
public interface AbstractC16595af extends AbstractC16568c {
    static {
        Covode.recordClassIndex(19032);
    }

    /* renamed from: a */
    Uri mo26364a(Uri uri, Bundle bundle, List<String> list, List<? extends AbstractC16646g> list2);

    /* renamed from: a */
    C16630d mo26365a(String str, List<String> list);

    /* renamed from: b */
    AbstractC16594ae mo26366b();

    /* renamed from: com.bytedance.ies.bullet.service.base.af$a */
    public static final class C16596a {
        static {
            Covode.recordClassIndex(19033);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.bytedance.ies.bullet.service.base.af */
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public static /* synthetic */ Uri m30820a(AbstractC16595af afVar, Uri uri, Bundle bundle, List list, int i) {
            if ((i & 2) != 0) {
                bundle = new Bundle();
            }
            if ((i & 4) != 0) {
                list = new ArrayList();
            }
            return afVar.mo26364a(uri, bundle, list, null);
        }
    }
}
