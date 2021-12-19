package com.google.android.datatransport.runtime.backends;

import com.bytedance.covode.number.Covode;
import com.google.android.datatransport.runtime.AbstractC25157h;
import com.google.android.datatransport.runtime.backends.AbstractC25130f;
import java.util.Arrays;

/* renamed from: com.google.android.datatransport.runtime.backends.a */
final class C25124a extends AbstractC25130f {

    /* renamed from: a */
    private final Iterable<AbstractC25157h> f59551a;

    /* renamed from: b */
    private final byte[] f59552b;

    static {
        Covode.recordClassIndex(30490);
    }

    @Override // com.google.android.datatransport.runtime.backends.AbstractC25130f
    /* renamed from: a */
    public final Iterable<AbstractC25157h> mo41097a() {
        return this.f59551a;
    }

    @Override // com.google.android.datatransport.runtime.backends.AbstractC25130f
    /* renamed from: b */
    public final byte[] mo41098b() {
        return this.f59552b;
    }

    public final int hashCode() {
        return ((this.f59551a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f59552b);
    }

    /* renamed from: com.google.android.datatransport.runtime.backends.a$a */
    public static final class C25125a extends AbstractC25130f.AbstractC25131a {

        /* renamed from: a */
        private Iterable<AbstractC25157h> f59553a;

        /* renamed from: b */
        private byte[] f59554b;

        static {
            Covode.recordClassIndex(30491);
        }

        @Override // com.google.android.datatransport.runtime.backends.AbstractC25130f.AbstractC25131a
        /* renamed from: a */
        public final AbstractC25130f mo41104a() {
            String str = "";
            if (this.f59553a == null) {
                str = str + " events";
            }
            if (str.isEmpty()) {
                return new C25124a(this.f59553a, this.f59554b, (byte) 0);
            }
            throw new IllegalStateException("Missing required properties:".concat(String.valueOf(str)));
        }

        @Override // com.google.android.datatransport.runtime.backends.AbstractC25130f.AbstractC25131a
        /* renamed from: a */
        public final AbstractC25130f.AbstractC25131a mo41102a(Iterable<AbstractC25157h> iterable) {
            this.f59553a = iterable;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.backends.AbstractC25130f.AbstractC25131a
        /* renamed from: a */
        public final AbstractC25130f.AbstractC25131a mo41103a(byte[] bArr) {
            this.f59554b = bArr;
            return this;
        }
    }

    public final String toString() {
        return "BackendRequest{events=" + this.f59551a + ", extras=" + Arrays.toString(this.f59552b) + "}";
    }

    public final boolean equals(Object obj) {
        byte[] b;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC25130f) {
            AbstractC25130f fVar = (AbstractC25130f) obj;
            if (this.f59551a.equals(fVar.mo41097a())) {
                byte[] bArr = this.f59552b;
                if (fVar instanceof C25124a) {
                    b = ((C25124a) fVar).f59552b;
                } else {
                    b = fVar.mo41098b();
                }
                if (Arrays.equals(bArr, b)) {
                    return true;
                }
            }
        }
        return false;
    }

    private C25124a(Iterable<AbstractC25157h> iterable, byte[] bArr) {
        this.f59551a = iterable;
        this.f59552b = bArr;
    }

    /* synthetic */ C25124a(Iterable iterable, byte[] bArr, byte b) {
        this(iterable, bArr);
    }
}
