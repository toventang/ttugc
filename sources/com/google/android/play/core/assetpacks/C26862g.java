package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.Parcelable;
import android.os.RemoteException;
import com.bytedance.covode.number.Covode;
import com.google.android.play.core.p1963b.AbstractC26937ca;
import com.google.android.play.core.p1963b.AbstractRunnableC26936c;
import com.google.android.play.core.tasks.C27071m;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: com.google.android.play.core.assetpacks.g */
final class C26862g extends AbstractRunnableC26936c {

    /* renamed from: a */
    final /* synthetic */ Map f63718a;

    /* renamed from: b */
    final /* synthetic */ C27071m f63719b;

    /* renamed from: c */
    final /* synthetic */ C26873r f63720c;

    static {
        Covode.recordClassIndex(32337);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C26862g(C26873r rVar, C27071m mVar, Map map, C27071m mVar2) {
        super(mVar);
        this.f63720c = rVar;
        this.f63718a = map;
        this.f63719b = mVar2;
    }

    @Override // com.google.android.play.core.p1963b.AbstractRunnableC26936c
    /* renamed from: a */
    public final void mo44415a() {
        try {
            AbstractC26937ca caVar = (AbstractC26937ca) this.f63720c.f63755d.f63837k;
            String str = this.f63720c.f63753b;
            Map map = this.f63718a;
            Bundle b = C26873r.m53357b();
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
            for (Map.Entry entry : map.entrySet()) {
                Bundle bundle = new Bundle();
                bundle.putString("installed_asset_module_name", (String) entry.getKey());
                bundle.putLong("installed_asset_module_version", ((Long) entry.getValue()).longValue());
                arrayList.add(bundle);
            }
            b.putParcelableArrayList("installed_asset_module", arrayList);
            caVar.mo44638a(str, b, new BinderC26870o(this.f63720c, this.f63719b));
        } catch (RemoteException e) {
            C26873r.f63751a.mo44597c("syncPacks", new Object[0]);
            this.f63719b.mo44784b(new RuntimeException(e));
        }
    }
}
