package kotlinx.coroutines;

import com.bytedance.covode.number.Covode;

/* renamed from: kotlinx.coroutines.bk */
final class C89551bk implements AbstractC89563bu {

    /* renamed from: a */
    private final boolean f203273a;

    static {
        Covode.recordClassIndex(105642);
    }

    @Override // kotlinx.coroutines.AbstractC89563bu
    public final C89588cj getList() {
        return null;
    }

    @Override // kotlinx.coroutines.AbstractC89563bu
    public final boolean isActive() {
        return this.f203273a;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Empty{");
        if (isActive()) {
            str = "Active";
        } else {
            str = "New";
        }
        return sb.append(str).append('}').toString();
    }

    public C89551bk(boolean z) {
        this.f203273a = z;
    }
}
