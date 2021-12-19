package com.google.android.datatransport.runtime;

import com.bytedance.covode.number.Covode;
import com.google.android.datatransport.EnumC25111d;
import com.google.android.datatransport.runtime.AbstractC25162k;
import java.util.Arrays;
import java.util.Objects;

/* renamed from: com.google.android.datatransport.runtime.c */
final class C25141c extends AbstractC25162k {

    /* renamed from: a */
    private final String f59576a;

    /* renamed from: b */
    private final byte[] f59577b;

    /* renamed from: c */
    private final EnumC25111d f59578c;

    static {
        Covode.recordClassIndex(30507);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.datatransport.runtime.c$a */
    public static final class C25142a extends AbstractC25162k.AbstractC25163a {

        /* renamed from: a */
        private String f59579a;

        /* renamed from: b */
        private byte[] f59580b;

        /* renamed from: c */
        private EnumC25111d f59581c;

        static {
            Covode.recordClassIndex(30508);
        }

        C25142a() {
        }

        @Override // com.google.android.datatransport.runtime.AbstractC25162k.AbstractC25163a
        /* renamed from: a */
        public final AbstractC25162k mo41127a() {
            String str = "";
            if (this.f59579a == null) {
                str = str + " backendName";
            }
            if (this.f59581c == null) {
                str = str + " priority";
            }
            if (str.isEmpty()) {
                return new C25141c(this.f59579a, this.f59580b, this.f59581c, (byte) 0);
            }
            throw new IllegalStateException("Missing required properties:".concat(String.valueOf(str)));
        }

        @Override // com.google.android.datatransport.runtime.AbstractC25162k.AbstractC25163a
        /* renamed from: a */
        public final AbstractC25162k.AbstractC25163a mo41126a(byte[] bArr) {
            this.f59580b = bArr;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.AbstractC25162k.AbstractC25163a
        /* renamed from: a */
        public final AbstractC25162k.AbstractC25163a mo41124a(EnumC25111d dVar) {
            Objects.requireNonNull(dVar, "Null priority");
            this.f59581c = dVar;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.AbstractC25162k.AbstractC25163a
        /* renamed from: a */
        public final AbstractC25162k.AbstractC25163a mo41125a(String str) {
            Objects.requireNonNull(str, "Null backendName");
            this.f59579a = str;
            return this;
        }
    }

    @Override // com.google.android.datatransport.runtime.AbstractC25162k
    /* renamed from: a */
    public final String mo41119a() {
        return this.f59576a;
    }

    @Override // com.google.android.datatransport.runtime.AbstractC25162k
    /* renamed from: b */
    public final byte[] mo41120b() {
        return this.f59577b;
    }

    @Override // com.google.android.datatransport.runtime.AbstractC25162k
    /* renamed from: c */
    public final EnumC25111d mo41121c() {
        return this.f59578c;
    }

    public final int hashCode() {
        return ((((this.f59576a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f59577b)) * 1000003) ^ this.f59578c.hashCode();
    }

    public final boolean equals(Object obj) {
        byte[] b;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC25162k) {
            AbstractC25162k kVar = (AbstractC25162k) obj;
            if (this.f59576a.equals(kVar.mo41119a())) {
                byte[] bArr = this.f59577b;
                if (kVar instanceof C25141c) {
                    b = ((C25141c) kVar).f59577b;
                } else {
                    b = kVar.mo41120b();
                }
                if (!Arrays.equals(bArr, b) || !this.f59578c.equals(kVar.mo41121c())) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    private C25141c(String str, byte[] bArr, EnumC25111d dVar) {
        this.f59576a = str;
        this.f59577b = bArr;
        this.f59578c = dVar;
    }

    /* synthetic */ C25141c(String str, byte[] bArr, EnumC25111d dVar, byte b) {
        this(str, bArr, dVar);
    }
}
