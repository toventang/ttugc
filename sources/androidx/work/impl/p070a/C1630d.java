package androidx.work.impl.p070a;

import android.content.Context;
import androidx.work.AbstractC1600g;
import androidx.work.impl.p070a.p071a.AbstractC1611c;
import androidx.work.impl.p070a.p071a.C1609a;
import androidx.work.impl.p070a.p071a.C1610b;
import androidx.work.impl.p070a.p071a.C1613d;
import androidx.work.impl.p070a.p071a.C1614e;
import androidx.work.impl.p070a.p071a.C1615f;
import androidx.work.impl.p070a.p071a.C1616g;
import androidx.work.impl.p070a.p071a.C1617h;
import androidx.work.impl.p073b.C1642g;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.work.impl.a.d */
public final class C1630d implements AbstractC1611c.AbstractC1612a {

    /* renamed from: a */
    private static final String f5275a = AbstractC1600g.m5318a("WorkConstraintsTracker");

    /* renamed from: b */
    private final AbstractC1629c f5276b;

    /* renamed from: c */
    private final AbstractC1611c[] f5277c;

    /* renamed from: d */
    private final Object f5278d;

    static {
        Covode.recordClassIndex(1786);
    }

    /* renamed from: a */
    public final void mo5402a() {
        synchronized (this.f5278d) {
            AbstractC1611c[] cVarArr = this.f5277c;
            for (AbstractC1611c cVar : cVarArr) {
                if (!cVar.f5243a.isEmpty()) {
                    cVar.f5243a.clear();
                    cVar.f5245c.mo5395b(cVar);
                }
            }
        }
    }

    @Override // androidx.work.impl.p070a.p071a.AbstractC1611c.AbstractC1612a
    /* renamed from: c */
    public final void mo5383c(List<String> list) {
        synchronized (this.f5278d) {
            AbstractC1629c cVar = this.f5276b;
            if (cVar != null) {
                cVar.mo5401b(list);
            }
        }
    }

    @Override // androidx.work.impl.p070a.p071a.AbstractC1611c.AbstractC1612a
    /* renamed from: b */
    public final void mo5382b(List<String> list) {
        synchronized (this.f5278d) {
            ArrayList arrayList = new ArrayList();
            for (String str : list) {
                if (mo5404a(str)) {
                    AbstractC1600g.m5317a();
                    C1764a.m5928a("Constraints met for %s", new Object[]{str});
                    arrayList.add(str);
                }
            }
            AbstractC1629c cVar = this.f5276b;
            if (cVar != null) {
                cVar.mo5400a(arrayList);
            }
        }
    }

    /* renamed from: a */
    public final void mo5403a(List<C1642g> list) {
        synchronized (this.f5278d) {
            for (AbstractC1611c cVar : this.f5277c) {
                cVar.mo5380a((AbstractC1611c.AbstractC1612a) null);
            }
            for (AbstractC1611c cVar2 : this.f5277c) {
                cVar2.mo5381a(list);
            }
            for (AbstractC1611c cVar3 : this.f5277c) {
                cVar3.mo5380a((AbstractC1611c.AbstractC1612a) this);
            }
        }
    }

    /* renamed from: a */
    public final boolean mo5404a(String str) {
        synchronized (this.f5278d) {
            AbstractC1611c[] cVarArr = this.f5277c;
            for (AbstractC1611c cVar : cVarArr) {
                if (cVar.f5244b != null && cVar.mo5379b(cVar.f5244b) && cVar.f5243a.contains(str)) {
                    AbstractC1600g.m5317a();
                    C1764a.m5928a("Work %s constrained by %s", new Object[]{str, cVar.getClass().getSimpleName()});
                    return false;
                }
            }
            return true;
        }
    }

    public C1630d(Context context, AbstractC1629c cVar) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            applicationContext = C58003a.f132199a;
        }
        this.f5276b = cVar;
        this.f5277c = new AbstractC1611c[]{new C1609a(applicationContext), new C1610b(applicationContext), new C1617h(applicationContext), new C1613d(applicationContext), new C1616g(applicationContext), new C1615f(applicationContext), new C1614e(applicationContext)};
        this.f5278d = new Object();
    }
}
