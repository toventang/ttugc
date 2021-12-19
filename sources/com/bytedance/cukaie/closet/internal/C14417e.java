package com.bytedance.cukaie.closet.internal;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.bytedance.cukaie.closet.AbstractC14409e;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Set;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.bytedance.cukaie.closet.internal.e */
public final class C14417e implements AbstractC14409e {

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f34877a = {new C89232y(C89204ab.m154669a(C14417e.class), "sharedPreferences", "getSharedPreferences()Landroid/content/SharedPreferences;")};

    /* renamed from: b */
    private final AbstractC89244h f34878b;

    /* renamed from: a */
    private final SharedPreferences m26313a() {
        return (SharedPreferences) this.f34878b.getValue();
    }

    @Override // com.bytedance.cukaie.closet.AbstractC14408d
    /* renamed from: a */
    public final byte[] mo23225a(String str, byte[] bArr) {
        C89219l.m154719c(str, "");
        String string = m26313a().getString(str, null);
        if (string == null) {
            return bArr;
        }
        Charset charset = StandardCharsets.ISO_8859_1;
        C89219l.m154709a((Object) charset, "");
        byte[] bytes = string.getBytes(charset);
        C89219l.m154709a((Object) bytes, "");
        return bytes == null ? bArr : bytes;
    }

    /* renamed from: com.bytedance.cukaie.closet.internal.e$a */
    static final class C14418a extends AbstractC89220m implements AbstractC89171a<SharedPreferences> {

        /* renamed from: a */
        final /* synthetic */ Context f34879a;

        /* renamed from: b */
        final /* synthetic */ String f34880b;

        static {
            Covode.recordClassIndex(16496);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14418a(Context context, String str) {
            super(0);
            this.f34879a = context;
            this.f34880b = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ SharedPreferences invoke() {
            return C34822d.m71158a(this.f34879a, this.f34880b, 0);
        }
    }

    static {
        Covode.recordClassIndex(16495);
    }

    @Override // com.bytedance.cukaie.closet.AbstractC14409e
    /* renamed from: a */
    public final void mo23226a(String str) {
        C89219l.m154719c(str, "");
        m26313a().edit().remove(str).apply();
    }

    public C14417e(Context context, String str) {
        C89219l.m154719c(context, "");
        C89219l.m154719c(str, "");
        this.f34878b = C89250i.m154773a((AbstractC89171a) new C14418a(context, str));
    }

    @Override // com.bytedance.cukaie.closet.AbstractC14408d
    /* renamed from: a */
    public final float mo23219a(String str, float f) {
        C89219l.m154719c(str, "");
        return m26313a().getFloat(str, f);
    }

    @Override // com.bytedance.cukaie.closet.AbstractC14409e
    /* renamed from: b */
    public final void mo23227b(String str, float f) {
        C89219l.m154719c(str, "");
        m26313a().edit().putFloat(str, f).apply();
    }

    @Override // com.bytedance.cukaie.closet.AbstractC14408d
    /* renamed from: a */
    public final int mo23220a(String str, int i) {
        C89219l.m154719c(str, "");
        return m26313a().getInt(str, i);
    }

    @Override // com.bytedance.cukaie.closet.AbstractC14409e
    /* renamed from: b */
    public final void mo23228b(String str, int i) {
        C89219l.m154719c(str, "");
        m26313a().edit().putInt(str, i).apply();
    }

    @Override // com.bytedance.cukaie.closet.AbstractC14408d
    /* renamed from: a */
    public final long mo23221a(String str, long j) {
        C89219l.m154719c(str, "");
        return m26313a().getLong(str, j);
    }

    @Override // com.bytedance.cukaie.closet.AbstractC14409e
    /* renamed from: b */
    public final void mo23229b(String str, long j) {
        C89219l.m154719c(str, "");
        m26313a().edit().putLong(str, j).apply();
    }

    @Override // com.bytedance.cukaie.closet.AbstractC14408d
    /* renamed from: a */
    public final String mo23222a(String str, String str2) {
        C89219l.m154719c(str, "");
        return m26313a().getString(str, str2);
    }

    @Override // com.bytedance.cukaie.closet.AbstractC14409e
    /* renamed from: b */
    public final void mo23230b(String str, String str2) {
        C89219l.m154719c(str, "");
        m26313a().edit().putString(str, str2).apply();
    }

    @Override // com.bytedance.cukaie.closet.AbstractC14408d
    /* renamed from: a */
    public final Set<String> mo23223a(String str, Set<String> set) {
        C89219l.m154719c(str, "");
        return m26313a().getStringSet(str, set);
    }

    @Override // com.bytedance.cukaie.closet.AbstractC14409e
    /* renamed from: b */
    public final void mo23231b(String str, Set<String> set) {
        C89219l.m154719c(str, "");
        m26313a().edit().putStringSet(str, set).apply();
    }

    @Override // com.bytedance.cukaie.closet.AbstractC14409e
    /* renamed from: b */
    public final void mo23232b(String str, boolean z) {
        C89219l.m154719c(str, "");
        m26313a().edit().putBoolean(str, z).apply();
    }

    @Override // com.bytedance.cukaie.closet.AbstractC14408d
    /* renamed from: a */
    public final boolean mo23224a(String str, boolean z) {
        C89219l.m154719c(str, "");
        return m26313a().getBoolean(str, z);
    }

    @Override // com.bytedance.cukaie.closet.AbstractC14409e
    /* renamed from: b */
    public final void mo23233b(String str, byte[] bArr) {
        String str2;
        C89219l.m154719c(str, "");
        SharedPreferences.Editor edit = m26313a().edit();
        if (bArr != null) {
            Charset charset = StandardCharsets.ISO_8859_1;
            C89219l.m154709a((Object) charset, "");
            str2 = new String(bArr, charset);
        } else {
            str2 = null;
        }
        edit.putString(str, str2).apply();
    }
}
