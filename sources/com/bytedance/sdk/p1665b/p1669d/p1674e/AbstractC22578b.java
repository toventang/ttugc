package com.bytedance.sdk.p1665b.p1669d.p1674e;

import android.text.TextUtils;
import android.webkit.URLUtil;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.p1665b.C22518a;
import com.bytedance.sdk.p1665b.p1666a.AbstractC22523c;
import com.bytedance.sdk.p1665b.p1668c.C22539a;
import com.bytedance.sdk.p1665b.p1669d.p1672c.C22560a;
import com.bytedance.sdk.p1665b.p1676f.C22584a;
import java.util.Map;

/* renamed from: com.bytedance.sdk.b.d.e.b */
public abstract class AbstractC22578b<T> extends AbstractRunnableC22576a<T> {
    static {
        Covode.recordClassIndex(26394);
    }

    public void run() {
        String str = this.f53349d;
        Map<String, String> map = this.f53350e;
        C22539a.m42533a("request url:" + str + "; request params:" + C22584a.m42607a(map));
        String a = C22584a.m42607a(map);
        if (!TextUtils.isEmpty(a)) {
            if (TextUtils.isEmpty(str)) {
                str = "";
            } else if (str.endsWith("?")) {
                str = str + a;
            } else {
                str = str + "?" + a;
            }
        }
        if (!URLUtil.isValidUrl(str)) {
            mo36853a((Exception) new IllegalArgumentException("target url is invalid"));
            return;
        }
        AbstractC22523c b = C22518a.m42478b();
        if (b == null && (b = C22560a.m42561a()) == null) {
            mo36853a((Exception) new IllegalStateException("do not have a network executor"));
            return;
        }
        try {
            mo36854a((Object) mo36849a(b.mo36796a(this.f53354i, str)));
        } catch (Exception e) {
            mo36853a(e);
            C22539a.m42533a("response exception:" + e.toString());
        }
    }

    public AbstractC22578b(String str, Map<String, String> map) {
        super(str, map);
    }
}
