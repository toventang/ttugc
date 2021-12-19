package androidx.appcompat.p019b.p020a;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.StateSet;
import androidx.appcompat.p019b.p020a.C0264b;
import com.bytedance.covode.number.Covode;

/* renamed from: androidx.appcompat.b.a.e */
class C0270e extends C0264b {

    /* renamed from: b */
    public C0271a f887b;

    /* renamed from: c */
    private boolean f888c;

    static {
        Covode.recordClassIndex(304);
    }

    @Override // androidx.appcompat.p019b.p020a.C0264b
    public boolean isStateful() {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.b.a.e$a */
    public static class C0271a extends C0264b.AbstractC0267b {

        /* renamed from: L */
        int[][] f889L;

        static {
            Covode.recordClassIndex(305);
        }

        public Drawable newDrawable() {
            return new C0270e(this, null);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: int[][] */
        /* JADX WARN: Multi-variable type inference failed */
        /* access modifiers changed from: package-private */
        @Override // androidx.appcompat.p019b.p020a.C0264b.AbstractC0267b
        /* renamed from: a */
        public void mo668a() {
            Object obj;
            int[][] iArr = this.f889L;
            int[][] iArr2 = new int[iArr.length][];
            for (int length = iArr.length - 1; length >= 0; length--) {
                int[][] iArr3 = this.f889L;
                if (iArr3[length] != null) {
                    obj = iArr3[length].clone();
                } else {
                    obj = null;
                }
                iArr2[length] = obj;
            }
            this.f889L = iArr2;
        }

        public Drawable newDrawable(Resources resources) {
            return new C0270e(this, resources);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final int mo735b(int[] iArr) {
            int[][] iArr2 = this.f889L;
            int i = this.f856j;
            for (int i2 = 0; i2 < i; i2++) {
                if (StateSet.stateSetMatches(iArr2[i2], iArr)) {
                    return i2;
                }
            }
            return -1;
        }

        @Override // androidx.appcompat.p019b.p020a.C0264b.AbstractC0267b
        /* renamed from: b */
        public final void mo689b(int i, int i2) {
            super.mo689b(i, i2);
            int[][] iArr = new int[i2][];
            System.arraycopy(this.f889L, 0, iArr, 0, i);
            this.f889L = iArr;
        }

        C0271a(C0271a aVar, C0270e eVar, Resources resources) {
            super(aVar, eVar, resources);
            if (aVar != null) {
                this.f889L = aVar.f889L;
            } else {
                this.f889L = new int[this.f855i.length][];
            }
        }
    }

    C0270e() {
        this(null, null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0271a mo631b() {
        return new C0271a(this.f887b, this, null);
    }

    @Override // androidx.appcompat.p019b.p020a.C0264b
    public Drawable mutate() {
        if (!this.f888c && super.mutate() == this) {
            this.f887b.mo668a();
            this.f888c = true;
        }
        return this;
    }

    C0270e(byte b) {
    }

    @Override // androidx.appcompat.p019b.p020a.C0264b
    public void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.p019b.p020a.C0264b
    /* renamed from: a */
    public void mo629a(C0264b.AbstractC0267b bVar) {
        super.mo629a(bVar);
        if (bVar instanceof C0271a) {
            this.f887b = (C0271a) bVar;
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.p019b.p020a.C0264b
    public boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        int b = this.f887b.mo735b(iArr);
        if (b < 0) {
            b = this.f887b.mo735b(StateSet.WILD_CARD);
        }
        if (mo676a(b) || onStateChange) {
            return true;
        }
        return false;
    }

    C0270e(C0271a aVar, Resources resources) {
        mo629a(new C0271a(aVar, this, resources));
        onStateChange(getState());
    }
}
