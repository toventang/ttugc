package com.bytedance.push.p1600k;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.push.k.a */
public final class C21853a {

    /* renamed from: a */
    public List<C21855b> f51766a = new ArrayList();

    /* renamed from: b */
    public String f51767b;

    /* renamed from: c */
    public String f51768c;

    /* renamed from: d */
    public String f51769d;

    /* renamed from: e */
    public String f51770e;

    static {
        Covode.recordClassIndex(25505);
    }

    /* renamed from: com.bytedance.push.k.a$b */
    public static class C21855b {

        /* renamed from: a */
        List<String> f51772a;

        /* renamed from: b */
        List<String> f51773b;

        /* renamed from: c */
        Uri f51774c;

        /* renamed from: d */
        String f51775d;

        static {
            Covode.recordClassIndex(25507);
        }

        public final int hashCode() {
            int i;
            int i2;
            int i3;
            List<String> list = this.f51772a;
            int i4 = 0;
            if (list != null) {
                i = list.hashCode();
            } else {
                i = 0;
            }
            int i5 = i * 31;
            List<String> list2 = this.f51773b;
            if (list2 != null) {
                i2 = list2.hashCode();
            } else {
                i2 = 0;
            }
            int i6 = (i5 + i2) * 31;
            String str = this.f51775d;
            if (str != null) {
                i3 = str.hashCode();
            } else {
                i3 = 0;
            }
            int i7 = (i6 + i3) * 31;
            Uri uri = this.f51774c;
            if (uri != null) {
                i4 = uri.hashCode();
            }
            return i7 + i4;
        }

        public final String toString() {
            return "IntentFilter{actions=" + this.f51772a + ", categories=" + this.f51773b + ", data=" + this.f51774c + ", mimetype=" + this.f51775d + '}';
        }

        public C21855b(List<String> list) {
            this(list, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C21855b)) {
                return false;
            }
            C21855b bVar = (C21855b) obj;
            List<String> list = this.f51772a;
            if (list == null ? bVar.f51772a != null : !list.equals(bVar.f51772a)) {
                return false;
            }
            List<String> list2 = this.f51773b;
            if (list2 == null ? bVar.f51773b != null : !list2.equals(bVar.f51773b)) {
                return false;
            }
            String str = this.f51775d;
            if (str == null ? bVar.f51775d != null : !str.equals(bVar.f51775d)) {
                return false;
            }
            Uri uri = this.f51774c;
            Uri uri2 = bVar.f51774c;
            if (uri != null) {
                return uri.equals(uri2);
            }
            if (uri2 == null) {
                return true;
            }
            return false;
        }

        public C21855b(List<String> list, List<String> list2) {
            this.f51772a = list;
            this.f51773b = list2;
        }
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        List<C21855b> list = this.f51766a;
        int i5 = 0;
        if (list != null) {
            i = list.hashCode();
        } else {
            i = 0;
        }
        int i6 = i * 31;
        String str = this.f51767b;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (i6 + i2) * 31;
        String str2 = this.f51768c;
        if (str2 != null) {
            i3 = str2.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 31;
        String str3 = this.f51769d;
        if (str3 != null) {
            i4 = str3.hashCode();
        } else {
            i4 = 0;
        }
        int i9 = (i8 + i4) * 31;
        String str4 = this.f51770e;
        if (str4 != null) {
            i5 = str4.hashCode();
        }
        return i9 + i5;
    }

    public final String toString() {
        return "Component{name='" + this.f51767b + '\'' + ", intentFilter=" + this.f51766a + ", processName='" + this.f51768c + '\'' + ", permission='" + this.f51769d + '\'' + ", authorities='" + this.f51770e + '\'' + '}';
    }

    /* renamed from: com.bytedance.push.k.a$a */
    public static class C21854a {

        /* renamed from: a */
        public C21853a f51771a;

        static {
            Covode.recordClassIndex(25506);
        }

        /* renamed from: c */
        public static C21854a m40935c(String str) {
            return new C21854a(str);
        }

        /* renamed from: a */
        public final C21854a mo35530a(C21855b bVar) {
            this.f51771a.f51766a.add(bVar);
            return this;
        }

        /* renamed from: b */
        public final C21854a mo35532b(String str) {
            this.f51771a.f51769d = str;
            return this;
        }

        private C21854a(String str) {
            this.f51771a = new C21853a(str);
        }

        /* renamed from: a */
        public final C21854a mo35531a(String str) {
            this.f51771a.f51768c = str;
            return this;
        }
    }

    public C21853a(String str) {
        this.f51767b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21853a)) {
            return false;
        }
        C21853a aVar = (C21853a) obj;
        List<C21855b> list = this.f51766a;
        if (list == null ? aVar.f51766a != null : !list.equals(aVar.f51766a)) {
            return false;
        }
        String str = this.f51767b;
        if (str == null ? aVar.f51767b != null : !str.equals(aVar.f51767b)) {
            return false;
        }
        String str2 = this.f51768c;
        if (str2 == null ? aVar.f51768c != null : !str2.equals(aVar.f51768c)) {
            return false;
        }
        String str3 = this.f51769d;
        if (str3 == null ? aVar.f51769d != null : !str3.equals(aVar.f51769d)) {
            return false;
        }
        String str4 = this.f51770e;
        String str5 = aVar.f51770e;
        if (str4 == null ? str5 == null : str4.equals(str5)) {
            return true;
        }
        return false;
    }
}
