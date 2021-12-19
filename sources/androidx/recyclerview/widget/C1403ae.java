package androidx.recyclerview.widget;

import android.view.View;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: androidx.recyclerview.widget.ae */
public final class C1403ae {

    /* renamed from: a */
    final AbstractC1405b f4635a;

    /* renamed from: b */
    C1404a f4636b = new C1404a();

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.ae$b */
    public interface AbstractC1405b {
        static {
            Covode.recordClassIndex(1543);
        }

        /* renamed from: a */
        int mo4738a();

        /* renamed from: a */
        int mo4739a(View view);

        /* renamed from: a */
        View mo4740a(int i);

        /* renamed from: b */
        int mo4741b();

        /* renamed from: b */
        int mo4742b(View view);
    }

    static {
        Covode.recordClassIndex(1541);
    }

    /* renamed from: androidx.recyclerview.widget.ae$a */
    static class C1404a {

        /* renamed from: a */
        int f4637a;

        /* renamed from: b */
        int f4638b;

        /* renamed from: c */
        int f4639c;

        /* renamed from: d */
        int f4640d;

        /* renamed from: e */
        int f4641e;

        static {
            Covode.recordClassIndex(1542);
        }

        /* renamed from: a */
        private static int m4798a(int i, int i2) {
            if (i > i2) {
                return 1;
            }
            return i == i2 ? 2 : 4;
        }

        C1404a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final boolean mo4869a() {
            int i = this.f4637a;
            if ((i & 7) != 0 && (i & (m4798a(this.f4640d, this.f4638b) << 0)) == 0) {
                return false;
            }
            int i2 = this.f4637a;
            if ((i2 & 112) != 0 && (i2 & (m4798a(this.f4640d, this.f4639c) << 4)) == 0) {
                return false;
            }
            int i3 = this.f4637a;
            if ((i3 & 1792) != 0 && (i3 & (m4798a(this.f4641e, this.f4638b) << 8)) == 0) {
                return false;
            }
            int i4 = this.f4637a;
            if ((i4 & 28672) == 0 || (i4 & (m4798a(this.f4641e, this.f4639c) << 12)) != 0) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo4867a(int i) {
            this.f4637a = i | this.f4637a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo4868a(int i, int i2, int i3, int i4) {
            this.f4638b = i;
            this.f4639c = i2;
            this.f4640d = i3;
            this.f4641e = i4;
        }
    }

    C1403ae(AbstractC1405b bVar) {
        this.f4635a = bVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo4866a(View view) {
        this.f4636b.mo4868a(this.f4635a.mo4738a(), this.f4635a.mo4741b(), this.f4635a.mo4739a(view), this.f4635a.mo4742b(view));
        this.f4636b.f4637a = 0;
        this.f4636b.mo4867a(24579);
        return this.f4636b.mo4869a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final View mo4865a(int i, int i2, int i3, int i4) {
        int i5;
        int a = this.f4635a.mo4738a();
        int b = this.f4635a.mo4741b();
        if (i2 > i) {
            i5 = 1;
        } else {
            i5 = -1;
        }
        View view = null;
        while (i != i2) {
            View a2 = this.f4635a.mo4740a(i);
            this.f4636b.mo4868a(a, b, this.f4635a.mo4739a(a2), this.f4635a.mo4742b(a2));
            if (i3 != 0) {
                this.f4636b.f4637a = 0;
                this.f4636b.mo4867a(i3);
                if (this.f4636b.mo4869a()) {
                    return a2;
                }
            }
            if (i4 != 0) {
                this.f4636b.f4637a = 0;
                this.f4636b.mo4867a(i4);
                if (this.f4636b.mo4869a()) {
                    view = a2;
                }
            }
            i += i5;
        }
        return view;
    }
}
