package com.p2082ss.android.ugc.aweme.recommend;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.inbox.widget.C56520b;
import java.util.Map;
import p4560f.p4561a.p4565b.C88411a;

/* renamed from: com.ss.android.ugc.aweme.recommend.b */
public interface AbstractC66617b {

    /* renamed from: com.ss.android.ugc.aweme.recommend.b$a */
    public static final class C66618a {
        static {
            Covode.recordClassIndex(78175);
        }
    }

    static {
        Covode.recordClassIndex(78174);
    }

    /* renamed from: a */
    void mo61458a(C56520b bVar);

    /* renamed from: a */
    void mo61459a(EnumC66622f fVar, EnumC66621e eVar, int i);

    /* renamed from: b */
    void mo9139b();

    View getContainer();

    void setActionListener(AbstractC66619c cVar);

    void setEnterFrom(String str);

    void setUFRExternalParams(Map<String, String> map);

    void setUFRSubscription(C88411a aVar);
}
