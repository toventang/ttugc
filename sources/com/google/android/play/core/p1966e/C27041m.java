package com.google.android.play.core.p1966e;

import android.os.Bundle;
import android.os.RemoteException;
import com.bytedance.covode.number.Covode;
import com.google.android.play.core.p1963b.AbstractC26899aq;
import com.google.android.play.core.p1963b.AbstractRunnableC26936c;
import com.google.android.play.core.tasks.C27071m;
import java.util.ArrayList;
import java.util.Collection;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.e.m */
public final class C27041m extends AbstractRunnableC26936c {

    /* renamed from: a */
    final /* synthetic */ Collection f64002a;

    /* renamed from: b */
    final /* synthetic */ Collection f64003b;

    /* renamed from: c */
    final /* synthetic */ C27071m f64004c;

    /* renamed from: d */
    final /* synthetic */ C27048t f64005d;

    static {
        Covode.recordClassIndex(32517);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C27041m(C27048t tVar, C27071m mVar, Collection collection, Collection collection2, C27071m mVar2) {
        super(mVar);
        this.f64005d = tVar;
        this.f64002a = collection;
        this.f64003b = collection2;
        this.f64004c = mVar2;
    }

    @Override // com.google.android.play.core.p1963b.AbstractRunnableC26936c
    /* renamed from: a */
    public final void mo44415a() {
        Collection<String> collection = this.f64002a;
        ArrayList arrayList = new ArrayList(collection.size());
        for (String str : collection) {
            Bundle bundle = new Bundle();
            bundle.putString("module_name", str);
            arrayList.add(bundle);
        }
        arrayList.addAll(C27048t.m53766a(this.f64003b));
        try {
            ((AbstractC26899aq) this.f64005d.f64017c.f63837k).mo44575a(this.f64005d.f64016b, arrayList, C27048t.m53765a(), new BinderC27046r(this.f64005d, this.f64004c));
        } catch (RemoteException e) {
            C27048t.f64014a.mo44597c("startInstall(%s,%s)", this.f64002a, this.f64003b);
            this.f64004c.mo44784b(new RuntimeException(e));
        }
    }
}
