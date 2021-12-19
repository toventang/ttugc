package com.p2082ss.android.ugc.aweme.qrcode.presenter;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.AbstractC39159o;
import com.p2082ss.android.ugc.aweme.p2426bw.p2427a.AbstractC35320a;
import com.p2082ss.android.ugc.aweme.p2426bw.p2427a.C35321b;
import com.p2082ss.android.ugc.aweme.qrcode.p3655d.C66390a;
import com.p2082ss.android.ugc.aweme.qrcode.p3655d.C66391b;
import java.io.File;

/* renamed from: com.ss.android.ugc.aweme.qrcode.presenter.e */
public final class C66452e extends C35321b<C66391b, AbstractC66419a> implements AbstractC39159o {
    static {
        Covode.recordClassIndex(77986);
    }

    /* renamed from: d */
    public final File mo105379d() {
        if (this.f83348b != null) {
            return ((C66391b) this.f83348b).mo105312b();
        }
        return null;
    }

    /* renamed from: a */
    public final boolean mo105378a() {
        if (this.f83348b != null) {
            return ((C66391b) this.f83348b).mo105311a();
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39159o
    /* renamed from: c */
    public final void mo57528c() {
        if (this.f83349c == null) {
            return;
        }
        if (((AbstractC35320a) this.f83348b).mData == null) {
            ((AbstractC66419a) this.f83349c).mo105320a(new Exception());
        } else {
            ((AbstractC66419a) this.f83349c).mo105319a((C66390a) ((AbstractC35320a) this.f83348b).mData);
        }
    }

    /* renamed from: a */
    public final void mo105377a(String str) {
        if (this.f83348b != null) {
            ((C66391b) this.f83348b).mo105310a(str);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39159o
    /* renamed from: a_ */
    public final void mo57526a_(Exception exc) {
        if (this.f83349c != null) {
            ((AbstractC66419a) this.f83349c).mo105320a(exc);
        }
    }

    public C66452e(C66391b bVar, AbstractC66419a aVar) {
        super(bVar, aVar);
        bVar.addNotifyListener(this);
    }

    /* renamed from: a */
    public final void mo105376a(int i, String str) {
        ((C66391b) this.f83348b).mo105309a(i, str);
    }
}
