package com.bytedance.ies.p1191d.p1192a;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import java.util.Collection;
import java.util.Set;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.bytedance.ies.d.a.d */
public class C17111d implements AbstractC17115g {

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f40725a = {new C89232y(C89204ab.m154669a(C17111d.class), "cacheShared", "getCacheShared()Landroid/content/SharedPreferences;")};

    /* renamed from: b */
    public final Context f40726b;

    /* renamed from: c */
    private final AbstractC89244h f40727c;

    /* renamed from: b */
    private final SharedPreferences m31602b() {
        return (SharedPreferences) this.f40727c.getValue();
    }

    /* renamed from: com.bytedance.ies.d.a.d$a */
    static final class C17112a extends AbstractC89220m implements AbstractC89171a<SharedPreferences> {

        /* renamed from: a */
        final /* synthetic */ C17111d f40728a;

        /* renamed from: b */
        final /* synthetic */ String f40729b;

        static {
            Covode.recordClassIndex(19569);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C17112a(C17111d dVar, String str) {
            super(0);
            this.f40728a = dVar;
            this.f40729b = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ SharedPreferences invoke() {
            return C34822d.m71158a(this.f40728a.f40726b, this.f40729b, 0);
        }
    }

    static {
        Covode.recordClassIndex(19568);
    }

    @Override // com.bytedance.ies.p1191d.p1192a.AbstractC17115g
    /* renamed from: a */
    public final void mo27019a() {
        m31602b().edit().clear().apply();
    }

    @Override // com.bytedance.ies.p1191d.p1192a.AbstractC17115g
    /* renamed from: a */
    public final String mo27018a(String str) {
        C89219l.m154719c(str, "");
        return m31602b().getString(str, null);
    }

    @Override // com.bytedance.ies.p1191d.p1192a.AbstractC17115g
    /* renamed from: b */
    public final Collection<String> mo27022b(String str) {
        C89219l.m154719c(str, "");
        return m31602b().getStringSet(str, null);
    }

    @Override // com.bytedance.ies.p1191d.p1192a.AbstractC17115g
    /* renamed from: c */
    public final void mo27023c(String str) {
        C89219l.m154719c(str, "");
        m31602b().edit().remove(str).apply();
    }

    public C17111d(Context context, String str) {
        C89219l.m154719c(context, "");
        C89219l.m154719c(str, "");
        this.f40726b = context;
        this.f40727c = C89250i.m154773a((AbstractC89171a) new C17112a(this, str));
    }

    @Override // com.bytedance.ies.p1191d.p1192a.AbstractC17115g
    /* renamed from: a */
    public final void mo27020a(String str, String str2) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(str2, "");
        m31602b().edit().putString(str, str2).apply();
    }

    @Override // com.bytedance.ies.p1191d.p1192a.AbstractC17115g
    /* renamed from: a */
    public final void mo27021a(String str, Collection<String> collection) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(collection, "");
        if (collection instanceof Set) {
            m31602b().edit().putStringSet(str, (Set) collection).apply();
        }
    }
}
