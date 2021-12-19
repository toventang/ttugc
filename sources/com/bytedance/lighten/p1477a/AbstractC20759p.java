package com.bytedance.lighten.p1477a;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.p1477a.p1478a.C20714a;
import java.io.File;

/* renamed from: com.bytedance.lighten.a.p */
public interface AbstractC20759p extends AbstractC20752i {
    static {
        Covode.recordClassIndex(24332);
    }

    AbstractC20723c getCache();

    void init(AbstractC20753j jVar);

    C20766v load(int i);

    C20766v load(Uri uri);

    C20766v load(C20714a aVar);

    C20766v load(File file);

    C20766v load(Object obj);

    C20766v load(String str);
}
