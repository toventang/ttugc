package kotlinx.coroutines;

import com.bytedance.covode.number.Covode;

/* renamed from: kotlinx.coroutines.bt */
public final class C89562bt implements AbstractC89563bu {

    /* renamed from: a */
    private final C89588cj f203281a;

    static {
        Covode.recordClassIndex(105653);
    }

    @Override // kotlinx.coroutines.AbstractC89563bu
    public final boolean isActive() {
        return false;
    }

    @Override // kotlinx.coroutines.AbstractC89563bu
    public final C89588cj getList() {
        return this.f203281a;
    }

    public final String toString() {
        if (C89527ar.f203244b) {
            return getList().mo144146a("New");
        }
        return super.toString();
    }

    public C89562bt(C89588cj cjVar) {
        this.f203281a = cjVar;
    }
}
