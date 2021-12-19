package androidx.emoji.p045a;

import android.graphics.Typeface;
import android.util.SparseArray;
import androidx.core.p036g.C0697g;
import androidx.p057k.p058a.p059a.C1071b;
import com.bytedance.covode.number.Covode;

/* renamed from: androidx.emoji.a.g */
public final class C0903g {

    /* renamed from: a */
    public final C1071b f3251a;

    /* renamed from: b */
    public final char[] f3252b;

    /* renamed from: c */
    public final C0904a f3253c;

    /* renamed from: d */
    public final Typeface f3254d;

    static {
        Covode.recordClassIndex(989);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.emoji.a.g$a */
    public static class C0904a {

        /* renamed from: a */
        final SparseArray<C0904a> f3255a;

        /* renamed from: b */
        public C0887b f3256b;

        static {
            Covode.recordClassIndex(990);
        }

        C0904a() {
            this(1);
        }

        C0904a(int i) {
            this.f3255a = new SparseArray<>(i);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final C0904a mo3197a(int i) {
            SparseArray<C0904a> sparseArray = this.f3255a;
            if (sparseArray == null) {
                return null;
            }
            return sparseArray.get(i);
        }
    }

    C0903g() {
        this.f3253c = new C0904a(1024);
        this.f3252b = new char[0];
    }

    /* renamed from: a */
    private void m3105a(C1071b bVar) {
        boolean z;
        int b = bVar.mo3827b();
        for (int i = 0; i < b; i++) {
            C0887b bVar2 = new C0887b(this, i);
            Character.toChars(bVar2.mo3179a().mo3816a(), this.f3252b, i * 2);
            C0697g.m2453a(bVar2, "emoji metadata cannot be null");
            if (bVar2.mo3179a().mo3823f() > 0) {
                z = true;
            } else {
                z = false;
            }
            C0697g.m2454a(z, (Object) "invalid metadata codepoint length");
            C0904a aVar = this.f3253c;
            int f = bVar2.mo3179a().mo3823f() - 1;
            int i2 = 0;
            while (true) {
                C0904a a = aVar.mo3197a(bVar2.mo3178a(i2));
                if (a == null) {
                    a = new C0904a();
                    aVar.f3255a.put(bVar2.mo3178a(i2), a);
                }
                aVar = a;
                if (f <= i2) {
                    break;
                }
                i2++;
            }
            aVar.f3256b = bVar2;
        }
    }

    C0903g(Typeface typeface, C1071b bVar) {
        this.f3254d = typeface;
        this.f3251a = bVar;
        this.f3253c = new C0904a(1024);
        this.f3252b = new char[(bVar.mo3827b() * 2)];
        m3105a(bVar);
    }
}
