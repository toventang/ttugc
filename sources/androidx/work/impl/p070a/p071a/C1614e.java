package androidx.work.impl.p070a.p071a;

import android.content.Context;
import android.os.Build;
import androidx.work.AbstractC1600g;
import androidx.work.EnumC1602h;
import androidx.work.impl.p070a.C1618b;
import androidx.work.impl.p070a.p072b.C1628g;
import androidx.work.impl.p073b.C1642g;
import com.bytedance.covode.number.Covode;

/* renamed from: androidx.work.impl.a.a.e */
public final class C1614e extends AbstractC1611c<C1618b> {

    /* renamed from: d */
    private static final String f5247d = AbstractC1600g.m5318a("NetworkMeteredCtrlr");

    static {
        Covode.recordClassIndex(1770);
    }

    public C1614e(Context context) {
        super(C1628g.m5396a(context).f5273c);
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.work.impl.p070a.p071a.AbstractC1611c
    /* renamed from: a */
    public final boolean mo5378a(C1642g gVar) {
        if (gVar.f5315j.f5204b == EnumC1602h.METERED) {
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* access modifiers changed from: package-private */
    @Override // androidx.work.impl.p070a.p071a.AbstractC1611c
    /* renamed from: b */
    public final /* synthetic */ boolean mo5379b(C1618b bVar) {
        C1618b bVar2 = bVar;
        if (Build.VERSION.SDK_INT < 26) {
            AbstractC1600g.m5317a();
            if (!bVar2.f5249a) {
                return true;
            }
            return false;
        } else if (!bVar2.f5249a || !bVar2.f5251c) {
            return true;
        } else {
            return false;
        }
    }
}
