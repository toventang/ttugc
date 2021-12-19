package com.lynx.tasm.p2043a.p2045b;

import android.graphics.Rect;
import android.view.animation.Animation;
import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.tasm.behavior.p2052ui.LynxUI;
import com.lynx.tasm.p2043a.C28407b;
import com.lynx.tasm.p2043a.C28419c;

/* renamed from: com.lynx.tasm.a.b.a */
public abstract class AbstractC28408a {

    /* renamed from: a */
    protected C28407b f66771a = new C28407b();

    static {
        Covode.recordClassIndex(34398);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract Animation mo48838a(LynxUI lynxUI, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, Rect rect, float f);

    /* renamed from: a */
    public final boolean mo48843a() {
        C28407b bVar = this.f66771a;
        if (bVar == null || bVar.f66757b <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo48839a(int i) {
        this.f66771a.f66759d = i;
    }

    /* renamed from: b */
    public final void mo48845b(long j) {
        this.f66771a.f66757b = j;
    }

    /* renamed from: a */
    public final void mo48841a(long j) {
        this.f66771a.f66758c = j;
    }

    /* renamed from: a */
    public final void mo48842a(ReadableArray readableArray) {
        this.f66771a.mo48834a(readableArray, 0);
    }

    /* renamed from: a */
    public final void mo48840a(int i, float f, float f2, float f3, float f4, int i2) {
        this.f66771a.mo48835a(i, f, f2, f3, f4, i2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Animation mo48844b(LynxUI lynxUI, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, Rect rect, float f) {
        if (!mo48843a()) {
            return null;
        }
        Animation a = mo48838a(lynxUI, i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, rect, f);
        if (a != null) {
            a.setDuration(this.f66771a.f66757b);
            a.setStartOffset(this.f66771a.f66758c);
            a.setInterpolator(C28419c.m56829a(this.f66771a));
        }
        return a;
    }
}
