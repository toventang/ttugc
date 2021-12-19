package androidx.work.impl.background.p074a;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.AbstractC1600g;
import androidx.work.C1603i;
import androidx.work.WorkerParameters;
import androidx.work.impl.AbstractC1607a;
import androidx.work.impl.AbstractC1680c;
import androidx.work.impl.C1687f;
import androidx.work.impl.p070a.AbstractC1629c;
import androidx.work.impl.p070a.C1630d;
import androidx.work.impl.p073b.C1642g;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.work.impl.background.a.a */
public final class C1662a implements AbstractC1607a, AbstractC1629c, AbstractC1680c {

    /* renamed from: a */
    private static final String f5353a = AbstractC1600g.m5318a("GreedyScheduler");

    /* renamed from: b */
    private C1687f f5354b;

    /* renamed from: c */
    private C1630d f5355c;

    /* renamed from: d */
    private List<C1642g> f5356d = new ArrayList();

    /* renamed from: e */
    private boolean f5357e;

    /* renamed from: f */
    private final Object f5358f;

    static {
        Covode.recordClassIndex(1818);
    }

    /* renamed from: a */
    private void m5479a() {
        if (!this.f5357e) {
            this.f5354b.f5435f.mo5405a(this);
            this.f5357e = true;
        }
    }

    @Override // androidx.work.impl.AbstractC1680c
    /* renamed from: a */
    public final void mo5443a(String str) {
        m5479a();
        AbstractC1600g.m5317a();
        C1764a.m5928a("Cancelling work ID %s", new Object[]{str});
        this.f5354b.mo5468a(str);
    }

    @Override // androidx.work.impl.p070a.AbstractC1629c
    /* renamed from: b */
    public final void mo5401b(List<String> list) {
        for (String str : list) {
            AbstractC1600g.m5317a();
            C1764a.m5928a("Constraints not met: Cancelling work ID %s", new Object[]{str});
            this.f5354b.mo5468a(str);
        }
    }

    @Override // androidx.work.impl.p070a.AbstractC1629c
    /* renamed from: a */
    public final void mo5400a(List<String> list) {
        for (String str : list) {
            AbstractC1600g.m5317a();
            C1764a.m5928a("Constraints met: Scheduling work ID %s", new Object[]{str});
            this.f5354b.mo5469a(str, (WorkerParameters.C1589a) null);
        }
    }

    @Override // androidx.work.impl.AbstractC1680c
    /* renamed from: a */
    public final void mo5444a(C1642g... gVarArr) {
        m5479a();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (C1642g gVar : gVarArr) {
            if (gVar.f5307b == C1603i.EnumC1604a.ENQUEUED && !gVar.mo5419a() && gVar.f5312g == 0 && !gVar.mo5420b()) {
                if (!gVar.mo5422d()) {
                    AbstractC1600g.m5317a();
                    C1764a.m5928a("Starting work for %s", new Object[]{gVar.f5306a});
                    this.f5354b.mo5469a(gVar.f5306a, (WorkerParameters.C1589a) null);
                } else if (Build.VERSION.SDK_INT < 24 || !gVar.f5315j.mo5350a()) {
                    arrayList.add(gVar);
                    arrayList2.add(gVar.f5306a);
                }
            }
        }
        synchronized (this.f5358f) {
            if (!arrayList.isEmpty()) {
                AbstractC1600g.m5317a();
                C1764a.m5928a("Starting tracking for [%s]", new Object[]{TextUtils.join(",", arrayList2)});
                this.f5356d.addAll(arrayList);
                this.f5355c.mo5403a(this.f5356d);
            }
        }
    }

    public C1662a(Context context, C1687f fVar) {
        this.f5354b = fVar;
        this.f5355c = new C1630d(context, this);
        this.f5358f = new Object();
    }

    @Override // androidx.work.impl.AbstractC1607a
    /* renamed from: a */
    public final void mo5376a(String str, boolean z) {
        synchronized (this.f5358f) {
            int size = this.f5356d.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                } else if (this.f5356d.get(i).f5306a.equals(str)) {
                    AbstractC1600g.m5317a();
                    C1764a.m5928a("Stopping tracking for %s", new Object[]{str});
                    this.f5356d.remove(i);
                    this.f5355c.mo5403a(this.f5356d);
                    break;
                } else {
                    i++;
                }
            }
        }
    }
}
