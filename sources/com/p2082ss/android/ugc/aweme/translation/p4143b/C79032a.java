package com.p2082ss.android.ugc.aweme.translation.p4143b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.AbstractC39159o;
import com.p2082ss.android.ugc.aweme.p2426bw.p2427a.AbstractC35320a;
import com.p2082ss.android.ugc.aweme.p2426bw.p2427a.C35321b;
import com.p2082ss.android.ugc.aweme.translation.p4142a.C79028b;
import com.p2082ss.android.ugc.aweme.translation.p4144ui.AbstractC79038a;

/* renamed from: com.ss.android.ugc.aweme.translation.b.a */
public final class C79032a extends C35321b<C79028b, AbstractC79038a> implements AbstractC39159o {
    static {
        Covode.recordClassIndex(92205);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39159o
    /* renamed from: c */
    public final void mo57528c() {
        T t = ((AbstractC35320a) this.f83348b).mData;
        if (t == null) {
            new Exception();
            ((AbstractC79038a) this.f83349c).mo85292a();
            return;
        }
        ((AbstractC79038a) this.f83349c).mo85296a(t);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39159o
    /* renamed from: a_ */
    public final void mo57526a_(Exception exc) {
        ((AbstractC79038a) this.f83349c).mo85292a();
    }

    public C79032a(C79028b bVar, AbstractC79038a aVar) {
        super(bVar, aVar);
        ((AbstractC35320a) this.f83348b).addNotifyListener(this);
    }

    /* renamed from: a */
    public final void mo122860a(String str, String str2, String str3, String str4) {
        ((C79028b) this.f83348b).mo122856a(str, str2, str3, str4);
    }
}
