package com.google.android.datatransport.runtime.scheduling;

import android.content.Context;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.google.android.datatransport.runtime.p1927d.AbstractC25148a;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC25223g;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC25239s;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C25216a;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C25221e;
import com.google.android.datatransport.runtime.scheduling.p1929a.AbstractC25182c;
import dagger.p4535a.AbstractC88078c;
import dagger.p4535a.C88081f;
import javax.p4631a.AbstractC89405a;

/* renamed from: com.google.android.datatransport.runtime.scheduling.g */
public final class C25215g implements AbstractC88078c<AbstractC25239s> {

    /* renamed from: a */
    private final AbstractC89405a<Context> f59700a;

    /* renamed from: b */
    private final AbstractC89405a<AbstractC25182c> f59701b;

    /* renamed from: c */
    private final AbstractC89405a<AbstractC25223g> f59702c;

    /* renamed from: d */
    private final AbstractC89405a<AbstractC25148a> f59703d;

    static {
        Covode.recordClassIndex(30581);
    }

    @Override // javax.p4631a.AbstractC89405a
    public final /* synthetic */ Object get() {
        Object aVar;
        Context context = this.f59700a.get();
        AbstractC25182c cVar = this.f59701b.get();
        AbstractC25223g gVar = this.f59702c.get();
        AbstractC25148a aVar2 = this.f59703d.get();
        if (Build.VERSION.SDK_INT >= 21) {
            aVar = new C25221e(context, cVar, gVar);
        } else {
            aVar = new C25216a(context, cVar, aVar2, gVar);
        }
        return C88081f.m153153a(aVar, "Cannot return null from a non-@Nullable @Provides method");
    }

    public C25215g(AbstractC89405a<Context> aVar, AbstractC89405a<AbstractC25182c> aVar2, AbstractC89405a<AbstractC25223g> aVar3, AbstractC89405a<AbstractC25148a> aVar4) {
        this.f59700a = aVar;
        this.f59701b = aVar2;
        this.f59702c = aVar3;
        this.f59703d = aVar4;
    }
}
