package androidx.core.p037h.p038a;

import android.view.accessibility.AccessibilityRecord;
import com.bytedance.covode.number.Covode;

/* renamed from: androidx.core.h.a.f */
public final class C0740f {

    /* renamed from: a */
    public final AccessibilityRecord f2885a;

    static {
        Covode.recordClassIndex(821);
    }

    /* renamed from: a */
    public static C0740f m2624a() {
        return new C0740f(AccessibilityRecord.obtain());
    }

    public final int hashCode() {
        AccessibilityRecord accessibilityRecord = this.f2885a;
        if (accessibilityRecord == null) {
            return 0;
        }
        return accessibilityRecord.hashCode();
    }

    private C0740f(Object obj) {
        this.f2885a = (AccessibilityRecord) obj;
    }

    /* renamed from: a */
    public final void mo2858a(int i) {
        this.f2885a.setItemCount(i);
    }

    /* renamed from: b */
    public final void mo2860b(int i) {
        this.f2885a.setFromIndex(i);
    }

    /* renamed from: c */
    public final void mo2861c(int i) {
        this.f2885a.setToIndex(i);
    }

    /* renamed from: a */
    public final void mo2859a(boolean z) {
        this.f2885a.setScrollable(z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0740f)) {
            return false;
        }
        C0740f fVar = (C0740f) obj;
        AccessibilityRecord accessibilityRecord = this.f2885a;
        if (accessibilityRecord == null) {
            if (fVar.f2885a != null) {
                return false;
            }
        } else if (!accessibilityRecord.equals(fVar.f2885a)) {
            return false;
        }
        return true;
    }
}
