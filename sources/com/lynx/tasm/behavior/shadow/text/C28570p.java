package com.lynx.tasm.behavior.shadow.text;

import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.shadow.EnumC28540e;

/* renamed from: com.lynx.tasm.behavior.shadow.text.p */
public class C28570p {

    /* renamed from: a */
    final C28571a f67224a;

    /* renamed from: b */
    final EnumC28540e f67225b;

    /* renamed from: c */
    final EnumC28540e f67226c;

    /* renamed from: d */
    public final float f67227d;

    /* renamed from: e */
    public final float f67228e;

    /* renamed from: f */
    final int f67229f;

    /* renamed from: g */
    final boolean f67230g;

    static {
        Covode.recordClassIndex(34586);
    }

    /* renamed from: com.lynx.tasm.behavior.shadow.text.p$a */
    public static class C28571a {

        /* renamed from: a */
        CharSequence f67231a;

        /* renamed from: b */
        final C28561k f67232b;

        static {
            Covode.recordClassIndex(34587);
        }

        public int hashCode() {
            int hashCode;
            CharSequence charSequence = this.f67231a;
            int i = 0;
            if (charSequence == null) {
                hashCode = 0;
            } else {
                hashCode = charSequence.hashCode();
            }
            int i2 = hashCode * 31;
            C28561k kVar = this.f67232b;
            if (kVar != null) {
                i = kVar.hashCode();
            }
            return i2 + i;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C28571a)) {
                return false;
            }
            C28571a aVar = (C28571a) obj;
            CharSequence charSequence = this.f67231a;
            if (charSequence == null) {
                if (aVar.f67231a != null) {
                    return false;
                }
            } else if (!charSequence.equals(aVar.f67231a)) {
                return false;
            }
            C28561k kVar = this.f67232b;
            if (kVar == null) {
                if (aVar.f67232b != null) {
                    return false;
                }
                return true;
            } else if (kVar.equals(aVar.f67232b)) {
                return true;
            } else {
                return false;
            }
        }

        C28571a(CharSequence charSequence, C28561k kVar) {
            this.f67231a = charSequence;
            this.f67232b = kVar;
        }
    }

    public int hashCode() {
        return (((((((((((this.f67224a.hashCode() * 31) + this.f67225b.hashCode()) * 31) + this.f67226c.hashCode()) * 31) + Float.floatToIntBits(this.f67227d)) * 31) + Float.floatToIntBits(this.f67228e)) * 31) + this.f67229f) * 31) + (this.f67230g ? 1 : 0);
    }

    public String toString() {
        return ((Object) this.f67224a.f67231a) + " " + this.f67227d + " " + this.f67228e;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C28570p)) {
            return false;
        }
        C28570p pVar = (C28570p) obj;
        if (this.f67224a.equals(pVar.f67224a) && this.f67225b == pVar.f67225b && this.f67226c == pVar.f67226c && this.f67227d == pVar.f67227d && this.f67228e == pVar.f67228e && this.f67229f == pVar.f67229f && this.f67230g == pVar.f67230g) {
            return true;
        }
        return false;
    }

    public C28570p(CharSequence charSequence, C28561k kVar, EnumC28540e eVar, EnumC28540e eVar2, float f, float f2, int i, boolean z) {
        this.f67224a = new C28571a(charSequence, kVar);
        this.f67227d = f;
        this.f67228e = f2;
        this.f67225b = eVar;
        this.f67226c = eVar2;
        this.f67229f = i;
        this.f67230g = z;
    }
}
