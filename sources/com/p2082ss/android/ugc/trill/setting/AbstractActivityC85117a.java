package com.p2082ss.android.ugc.trill.setting;

import android.os.Bundle;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.p2082ss.android.ugc.p2207a.p2208a.p2209a.AbstractC31004b;
import com.p2082ss.android.ugc.p2207a.p2208a.p2209a.C31003a;
import com.p2082ss.android.ugc.p2207a.p2208a.p2209a.EnumC31006d;
import com.p2082ss.android.ugc.p2207a.p2208a.p2210b.C31008a;
import com.p2082ss.android.ugc.p2207a.p2208a.p2211c.C31010a;
import com.p2082ss.android.ugc.p2207a.p2208a.p2211c.C31011b;
import java.util.Iterator;

/* renamed from: com.ss.android.ugc.trill.setting.a */
public abstract class AbstractActivityC85117a<P extends C31008a> extends ActivityC17312a {

    /* renamed from: a */
    private C31011b<P> f190459a;

    static {
        Covode.recordClassIndex(99156);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public void onPause() {
        super.onPause();
    }

    /* renamed from: a */
    public final P mo130059a() {
        return this.f190459a.mo56093a();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.ss.android.ugc.trill.setting.a<P extends com.ss.android.ugc.a.a.b.a> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public void onResume() {
        super.onResume();
        C31011b<P> bVar = this.f190459a;
        bVar.mo56093a();
        if (bVar.f74332b != null && !bVar.f74334d) {
            bVar.f74332b.f74328a = this;
            bVar.f74334d = true;
        }
    }

    public AbstractActivityC85117a() {
        Class<? extends C31008a> a;
        AbstractC31004b bVar = (AbstractC31004b) getClass().getAnnotation(AbstractC31004b.class);
        C31003a aVar = null;
        if (!(bVar == null || (a = bVar.mo56087a()) == null)) {
            aVar = new C31003a(a);
        }
        this.f190459a = new C31011b<>(aVar);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public void onDestroy() {
        C31011b<P> bVar = this.f190459a;
        if (bVar.f74332b != null && bVar.f74334d) {
            bVar.f74332b.f74328a = null;
            bVar.f74334d = false;
        }
        super.onDestroy();
        C31011b<P> bVar2 = this.f190459a;
        boolean z = !isChangingConfigurations();
        if (bVar2.f74332b != null && z) {
            Iterator<C31008a.AbstractC31009a> it = bVar2.f74332b.f74329b.iterator();
            while (it.hasNext()) {
                it.next().mo56092a();
            }
            bVar2.f74332b = null;
        }
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        C31011b<P> bVar = this.f190459a;
        Bundle bundle2 = new Bundle();
        bVar.mo56093a();
        if (bVar.f74332b != null) {
            bundle2.putBundle("presenter", new Bundle());
            bundle2.putString("presenter_id", EnumC31006d.INSTANCE.getId(bVar.f74332b));
        }
        bundle.putBundle("presenter_state", bundle2);
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            C31011b<P> bVar = this.f190459a;
            Bundle bundle2 = bundle.getBundle("presenter_state");
            if (bVar.f74332b == null) {
                Parcel obtain = Parcel.obtain();
                obtain.writeValue(bundle2);
                byte[] marshall = obtain.marshall();
                obtain.recycle();
                Parcel obtain2 = Parcel.obtain();
                obtain2.unmarshall(marshall, 0, marshall.length);
                obtain2.setDataPosition(0);
                Object readValue = obtain2.readValue(C31010a.f74330a);
                obtain2.recycle();
                bVar.f74333c = (Bundle) readValue;
                return;
            }
            throw new IllegalArgumentException("onRestoreInstanceState() should be called before onResume()");
        }
    }
}
