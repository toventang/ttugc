package androidx.emoji.p045a;

import androidx.p057k.p058a.p059a.C1070a;
import com.bytedance.covode.number.Covode;

/* renamed from: androidx.emoji.a.b */
public final class C0887b {

    /* renamed from: d */
    private static final ThreadLocal<C1070a> f3209d = new ThreadLocal<>();

    /* renamed from: a */
    final int f3210a;

    /* renamed from: b */
    final C0903g f3211b;

    /* renamed from: c */
    public volatile int f3212c;

    static {
        Covode.recordClassIndex(973);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C1070a mo3179a() {
        ThreadLocal<C1070a> threadLocal = f3209d;
        C1070a aVar = threadLocal.get();
        if (aVar == null) {
            aVar = new C1070a();
            threadLocal.set(aVar);
        }
        this.f3211b.f3251a.mo3825a(aVar, this.f3210a);
        return aVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        sb.append(Integer.toHexString(mo3179a().mo3816a()));
        sb.append(", codepoints:");
        int f = mo3179a().mo3823f();
        for (int i = 0; i < f; i++) {
            sb.append(Integer.toHexString(mo3178a(i)));
            sb.append(" ");
        }
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo3180a(boolean z) {
        int i;
        if (z) {
            i = 2;
        } else {
            i = 1;
        }
        this.f3212c = i;
    }

    /* renamed from: a */
    public final int mo3178a(int i) {
        return mo3179a().mo3817a(i);
    }

    C0887b(C0903g gVar, int i) {
        this.f3211b = gVar;
        this.f3210a = i;
    }
}
