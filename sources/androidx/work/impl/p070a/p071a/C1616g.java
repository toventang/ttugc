package androidx.work.impl.p070a.p071a;

import android.content.Context;
import androidx.work.EnumC1602h;
import androidx.work.impl.p070a.C1618b;
import androidx.work.impl.p070a.p072b.C1628g;
import androidx.work.impl.p073b.C1642g;
import com.bytedance.covode.number.Covode;

/* renamed from: androidx.work.impl.a.a.g */
public final class C1616g extends AbstractC1611c<C1618b> {
    static {
        Covode.recordClassIndex(1772);
    }

    public C1616g(Context context) {
        super(C1628g.m5396a(context).f5273c);
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.work.impl.p070a.p071a.AbstractC1611c
    /* renamed from: a */
    public final boolean mo5378a(C1642g gVar) {
        if (gVar.f5315j.f5204b == EnumC1602h.UNMETERED) {
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* access modifiers changed from: package-private */
    @Override // androidx.work.impl.p070a.p071a.AbstractC1611c
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ boolean mo5379b(C1618b bVar) {
        C1618b bVar2 = bVar;
        if (!bVar2.f5249a || bVar2.f5251c) {
            return true;
        }
        return false;
    }
}
