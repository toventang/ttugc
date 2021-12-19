package com.p2082ss.android.ugc.aweme.utils;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: com.ss.android.ugc.aweme.utils.x */
public final class C80633x {

    /* renamed from: a */
    public final String f180285a;

    /* renamed from: b */
    public final AbstractC80634a f180286b;

    /* renamed from: c */
    public final int f180287c;

    /* renamed from: com.ss.android.ugc.aweme.utils.x$a */
    public interface AbstractC80634a {
        static {
            Covode.recordClassIndex(93908);
        }

        /* renamed from: a */
        String mo106811a(Aweme aweme, String str, AbstractC80348dm dmVar);

        /* renamed from: a */
        boolean mo106812a(Aweme aweme, String str);
    }

    static {
        Covode.recordClassIndex(93907);
    }

    public final int hashCode() {
        return (this.f180285a.hashCode() * 31) + this.f180287c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C80633x xVar = (C80633x) obj;
        if (this.f180287c != xVar.f180287c) {
            return false;
        }
        return this.f180285a.equals(xVar.f180285a);
    }

    public C80633x(String str, AbstractC80634a aVar, int i) {
        this.f180285a = str;
        this.f180286b = aVar;
        this.f180287c = i;
    }
}
