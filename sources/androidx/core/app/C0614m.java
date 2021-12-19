package androidx.core.app;

import android.app.Person;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;

/* renamed from: androidx.core.app.m */
public final class C0614m {

    /* renamed from: a */
    public CharSequence f2598a;

    /* renamed from: b */
    public IconCompat f2599b;

    /* renamed from: c */
    public String f2600c;

    /* renamed from: d */
    public String f2601d;

    /* renamed from: e */
    public boolean f2602e;

    /* renamed from: f */
    public boolean f2603f;

    static {
        Covode.recordClassIndex(692);
    }

    /* renamed from: androidx.core.app.m$a */
    public static class C0615a {

        /* renamed from: a */
        public CharSequence f2604a;

        /* renamed from: b */
        IconCompat f2605b;

        /* renamed from: c */
        String f2606c;

        /* renamed from: d */
        String f2607d;

        /* renamed from: e */
        boolean f2608e;

        /* renamed from: f */
        boolean f2609f;

        static {
            Covode.recordClassIndex(693);
        }

        /* renamed from: a */
        public final C0614m mo2649a() {
            return new C0614m(this);
        }
    }

    /* renamed from: a */
    public final Bundle mo2647a() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        bundle2.putCharSequence(StringSet.name, this.f2598a);
        IconCompat iconCompat = this.f2599b;
        if (iconCompat != null) {
            bundle = iconCompat.mo2735c();
        } else {
            bundle = null;
        }
        bundle2.putBundle("icon", bundle);
        bundle2.putString("uri", this.f2600c);
        bundle2.putString("key", this.f2601d);
        bundle2.putBoolean("isBot", this.f2602e);
        bundle2.putBoolean("isImportant", this.f2603f);
        return bundle2;
    }

    /* renamed from: b */
    public final Person mo2648b() {
        Icon icon;
        Person.Builder name = new Person.Builder().setName(this.f2598a);
        IconCompat iconCompat = this.f2599b;
        if (iconCompat != null) {
            icon = iconCompat.mo2734b();
        } else {
            icon = null;
        }
        return name.setIcon(icon).setUri(this.f2600c).setKey(this.f2601d).setBot(this.f2602e).setImportant(this.f2603f).build();
    }

    C0614m(C0615a aVar) {
        this.f2598a = aVar.f2604a;
        this.f2599b = aVar.f2605b;
        this.f2600c = aVar.f2606c;
        this.f2601d = aVar.f2607d;
        this.f2602e = aVar.f2608e;
        this.f2603f = aVar.f2609f;
    }
}
