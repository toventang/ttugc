package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.RemoteException;
import com.bytedance.covode.number.Covode;
import com.google.android.play.core.p1963b.AbstractC26937ca;
import com.google.android.play.core.p1963b.AbstractRunnableC26936c;
import com.google.android.play.core.tasks.C27071m;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.play.core.assetpacks.f */
final class C26861f extends AbstractRunnableC26936c {

    /* renamed from: a */
    final /* synthetic */ List f63715a;

    /* renamed from: b */
    final /* synthetic */ C27071m f63716b;

    /* renamed from: c */
    final /* synthetic */ C26873r f63717c;

    static {
        Covode.recordClassIndex(32336);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C26861f(C26873r rVar, C27071m mVar, List list, C27071m mVar2) {
        super(mVar);
        this.f63717c = rVar;
        this.f63715a = list;
        this.f63716b = mVar2;
    }

    @Override // com.google.android.play.core.p1963b.AbstractRunnableC26936c
    /* renamed from: a */
    public final void mo44415a() {
        List<String> list = this.f63715a;
        ArrayList arrayList = new ArrayList(list.size());
        for (String str : list) {
            Bundle bundle = new Bundle();
            bundle.putString("module_name", str);
            arrayList.add(bundle);
        }
        try {
            ((AbstractC26937ca) this.f63717c.f63755d.f63837k).mo44639a(this.f63717c.f63753b, arrayList, C26873r.m53357b(), new BinderC26868m(this.f63717c, this.f63716b, (byte) 0));
        } catch (RemoteException unused) {
            C26873r.f63751a.mo44597c("cancelDownloads(%s)", this.f63715a);
        }
    }
}
