package com.p2082ss.android.ugc.aweme.account.p2244c;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.AbstractC39085b;
import com.p2082ss.android.ugc.aweme.common.AbstractC39144m;
import com.p2082ss.android.ugc.aweme.common.C39088c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.account.c.a */
public class C31599a<T extends AbstractC39085b, K extends AbstractC39144m> extends C39088c<T, K> {

    /* renamed from: a */
    private List<Object> f75561a;

    static {
        Covode.recordClassIndex(38326);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.C39088c, com.p2082ss.android.ugc.aweme.common.AbstractC39159o
    /* renamed from: c */
    public void mo57528c() {
        super.mo57528c();
        this.f75561a = null;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.C39088c
    /* renamed from: a */
    public boolean mo57616a(Object... objArr) {
        this.f75561a = new ArrayList();
        for (Object obj : objArr) {
            this.f75561a.add(obj);
        }
        return super.mo57616a(objArr);
    }
}
