package com.bytedance.cukaie.closet.internal;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.cukaie.closet.AbstractC14409e;
import com.bytedance.keva.Keva;
import java.util.Set;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.bytedance.cukaie.closet.internal.c */
public final class C14414c implements AbstractC14409e {

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f34873a = {new C89232y(C89204ab.m154669a(C14414c.class), "keva", "getKeva()Lcom/bytedance/keva/Keva;")};

    /* renamed from: b */
    private final AbstractC89244h f34874b;

    /* renamed from: a */
    private final Keva m26296a() {
        return (Keva) this.f34874b.getValue();
    }

    @Override // com.bytedance.cukaie.closet.AbstractC14408d
    /* renamed from: a */
    public final byte[] mo23225a(String str, byte[] bArr) {
        C89219l.m154719c(str, "");
        return m26296a().getBytes(str, bArr);
    }

    /* renamed from: com.bytedance.cukaie.closet.internal.c$a */
    static final class C14415a extends AbstractC89220m implements AbstractC89171a<Keva> {

        /* renamed from: a */
        final /* synthetic */ Context f34875a;

        /* renamed from: b */
        final /* synthetic */ String f34876b;

        static {
            Covode.recordClassIndex(16493);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14415a(Context context, String str) {
            super(0);
            this.f34875a = context;
            this.f34876b = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Keva invoke() {
            return Keva.getRepoFromSp(this.f34875a, this.f34876b, 0);
        }
    }

    static {
        Covode.recordClassIndex(16492);
    }

    @Override // com.bytedance.cukaie.closet.AbstractC14409e
    /* renamed from: a */
    public final void mo23226a(String str) {
        C89219l.m154719c(str, "");
        m26296a().erase(str);
    }

    @Override // com.bytedance.cukaie.closet.AbstractC14409e
    /* renamed from: b */
    public final void mo23227b(String str, float f) {
        C89219l.m154719c(str, "");
        m26296a().storeFloat(str, f);
    }

    public C14414c(Context context, String str) {
        C89219l.m154719c(context, "");
        C89219l.m154719c(str, "");
        this.f34874b = C89250i.m154773a((AbstractC89171a) new C14415a(context, str));
    }

    @Override // com.bytedance.cukaie.closet.AbstractC14408d
    /* renamed from: a */
    public final float mo23219a(String str, float f) {
        C89219l.m154719c(str, "");
        return m26296a().getFloat(str, f);
    }

    @Override // com.bytedance.cukaie.closet.AbstractC14409e
    /* renamed from: b */
    public final void mo23228b(String str, int i) {
        C89219l.m154719c(str, "");
        m26296a().storeInt(str, i);
    }

    @Override // com.bytedance.cukaie.closet.AbstractC14408d
    /* renamed from: a */
    public final int mo23220a(String str, int i) {
        C89219l.m154719c(str, "");
        return m26296a().getInt(str, i);
    }

    @Override // com.bytedance.cukaie.closet.AbstractC14409e
    /* renamed from: b */
    public final void mo23229b(String str, long j) {
        C89219l.m154719c(str, "");
        m26296a().storeLong(str, j);
    }

    @Override // com.bytedance.cukaie.closet.AbstractC14408d
    /* renamed from: a */
    public final long mo23221a(String str, long j) {
        C89219l.m154719c(str, "");
        return m26296a().getLong(str, j);
    }

    @Override // com.bytedance.cukaie.closet.AbstractC14409e
    /* renamed from: b */
    public final void mo23230b(String str, String str2) {
        C89219l.m154719c(str, "");
        m26296a().storeString(str, str2);
    }

    @Override // com.bytedance.cukaie.closet.AbstractC14408d
    /* renamed from: a */
    public final String mo23222a(String str, String str2) {
        C89219l.m154719c(str, "");
        return m26296a().getString(str, str2);
    }

    @Override // com.bytedance.cukaie.closet.AbstractC14409e
    /* renamed from: b */
    public final void mo23231b(String str, Set<String> set) {
        C89219l.m154719c(str, "");
        m26296a().storeStringSet(str, set);
    }

    @Override // com.bytedance.cukaie.closet.AbstractC14408d
    /* renamed from: a */
    public final Set<String> mo23223a(String str, Set<String> set) {
        C89219l.m154719c(str, "");
        return m26296a().getStringSet(str, set);
    }

    @Override // com.bytedance.cukaie.closet.AbstractC14409e
    /* renamed from: b */
    public final void mo23232b(String str, boolean z) {
        C89219l.m154719c(str, "");
        m26296a().storeBoolean(str, z);
    }

    @Override // com.bytedance.cukaie.closet.AbstractC14409e
    /* renamed from: b */
    public final void mo23233b(String str, byte[] bArr) {
        C89219l.m154719c(str, "");
        m26296a().storeBytes(str, bArr);
    }

    @Override // com.bytedance.cukaie.closet.AbstractC14408d
    /* renamed from: a */
    public final boolean mo23224a(String str, boolean z) {
        C89219l.m154719c(str, "");
        return m26296a().getBoolean(str, z);
    }
}
