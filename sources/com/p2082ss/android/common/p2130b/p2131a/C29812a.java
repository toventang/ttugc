package com.p2082ss.android.common.p2130b.p2131a;

import com.bytedance.covode.number.Covode;
import java.io.File;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.ss.android.common.b.a.a */
public class C29812a {

    /* renamed from: a */
    public Set<AbstractC29815c> f71146a = new HashSet();

    /* renamed from: com.ss.android.common.b.a.a$c */
    public interface AbstractC29815c {
        static {
            Covode.recordClassIndex(36220);
        }

        /* renamed from: a */
        String mo52093a();

        /* renamed from: b */
        Object mo52094b();
    }

    static {
        Covode.recordClassIndex(36217);
    }

    /* renamed from: com.ss.android.common.b.a.a$a */
    public class C29813a implements AbstractC29815c {

        /* renamed from: a */
        public String f71147a;

        /* renamed from: b */
        public byte[] f71148b;

        /* renamed from: c */
        public String f71149c;

        static {
            Covode.recordClassIndex(36218);
        }

        @Override // com.p2082ss.android.common.p2130b.p2131a.C29812a.AbstractC29815c
        /* renamed from: a */
        public final String mo52093a() {
            return this.f71147a;
        }

        @Override // com.p2082ss.android.common.p2130b.p2131a.C29812a.AbstractC29815c
        /* renamed from: b */
        public final Object mo52094b() {
            return this.f71148b;
        }

        public C29813a(String str, byte[] bArr, String str2) {
            this.f71147a = str;
            this.f71148b = bArr;
            this.f71149c = str2;
        }
    }

    /* renamed from: com.ss.android.common.b.a.a$b */
    public class C29814b implements AbstractC29815c {

        /* renamed from: a */
        String f71151a;

        /* renamed from: b */
        File f71152b;

        static {
            Covode.recordClassIndex(36219);
        }

        @Override // com.p2082ss.android.common.p2130b.p2131a.C29812a.AbstractC29815c
        /* renamed from: a */
        public final String mo52093a() {
            return this.f71151a;
        }

        @Override // com.p2082ss.android.common.p2130b.p2131a.C29812a.AbstractC29815c
        /* renamed from: b */
        public final Object mo52094b() {
            return this.f71152b;
        }

        public C29814b(String str, File file) {
            this.f71151a = str;
            this.f71152b = file;
        }
    }

    /* renamed from: com.ss.android.common.b.a.a$d */
    public class C29816d implements AbstractC29815c {

        /* renamed from: a */
        String f71154a;

        /* renamed from: b */
        String f71155b;

        static {
            Covode.recordClassIndex(36221);
        }

        @Override // com.p2082ss.android.common.p2130b.p2131a.C29812a.AbstractC29815c
        /* renamed from: a */
        public final String mo52093a() {
            return this.f71154a;
        }

        @Override // com.p2082ss.android.common.p2130b.p2131a.C29812a.AbstractC29815c
        /* renamed from: b */
        public final Object mo52094b() {
            return this.f71155b;
        }

        public C29816d(String str, String str2) {
            this.f71154a = str;
            this.f71155b = str2;
        }
    }

    /* renamed from: a */
    public final void mo52090a(String str, File file) {
        this.f71146a.add(new C29814b(str, file));
    }

    /* renamed from: a */
    public final void mo52091a(String str, String str2) {
        this.f71146a.add(new C29816d(str, str2));
    }

    /* renamed from: a */
    public final void mo52092a(String str, byte[] bArr, String str2) {
        this.f71146a.add(new C29813a(str, bArr, str2));
    }
}
