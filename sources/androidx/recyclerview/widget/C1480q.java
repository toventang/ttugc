package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;

/* renamed from: androidx.recyclerview.widget.q */
final class C1480q {

    /* renamed from: a */
    boolean f4902a = true;

    /* renamed from: b */
    int f4903b;

    /* renamed from: c */
    int f4904c;

    /* renamed from: d */
    int f4905d;

    /* renamed from: e */
    int f4906e;

    /* renamed from: f */
    int f4907f;

    /* renamed from: g */
    int f4908g;

    /* renamed from: h */
    boolean f4909h;

    /* renamed from: i */
    boolean f4910i;

    static {
        Covode.recordClassIndex(1618);
    }

    C1480q() {
    }

    public final String toString() {
        return "LayoutState{mAvailable=" + this.f4903b + ", mCurrentPosition=" + this.f4904c + ", mItemDirection=" + this.f4905d + ", mLayoutDirection=" + this.f4906e + ", mStartLine=" + this.f4907f + ", mEndLine=" + this.f4908g + '}';
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final View mo5007a(RecyclerView.C1372o oVar) {
        View c = oVar.mo4766c(this.f4904c);
        this.f4904c += this.f4905d;
        return c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo5008a(RecyclerView.C1378s sVar) {
        int i = this.f4904c;
        if (i < 0 || i >= sVar.mo4782a()) {
            return false;
        }
        return true;
    }
}
