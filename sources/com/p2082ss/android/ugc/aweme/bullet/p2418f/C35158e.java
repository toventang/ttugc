package com.p2082ss.android.ugc.aweme.bullet.p2418f;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1191d.p1192a.AbstractC17114f;
import com.bytedance.ies.p1191d.p1192a.AbstractC17116h;
import com.bytedance.ies.p1191d.p1192a.AbstractC17122k;
import com.bytedance.ies.p1191d.p1192a.C17144y;
import com.bytedance.ies.p1191d.p1192a.C17147z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.bullet.f.e */
public final class C35158e {

    /* renamed from: a */
    public static final C35158e f82958a = new C35158e();

    /* renamed from: com.ss.android.ugc.aweme.bullet.f.e$b */
    public static final class C35160b implements AbstractC17122k {
        static {
            Covode.recordClassIndex(42315);
        }

        @Override // com.bytedance.ies.p1191d.p1192a.AbstractC17122k
        /* renamed from: a */
        public final void mo27036a(String str) {
            C89219l.m154721d(str, "");
        }

        @Override // com.bytedance.ies.p1191d.p1192a.AbstractC17122k
        /* renamed from: a */
        public final void mo27037a(String str, Throwable th) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(th, "");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.f.e$c */
    public static final class C35161c implements AbstractC17116h {
        static {
            Covode.recordClassIndex(42316);
        }

        @Override // com.bytedance.ies.p1191d.p1192a.AbstractC17116h
        /* renamed from: a */
        public final void mo27025a(C17147z zVar, C17144y.EnumC17146b bVar) {
            C89219l.m154721d(zVar, "");
            C89219l.m154721d(bVar, "");
        }
    }

    private C35158e() {
    }

    static {
        Covode.recordClassIndex(42313);
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.f.e$a */
    public static final class C35159a implements AbstractC17114f {

        /* renamed from: a */
        final /* synthetic */ Collection f82959a;

        static {
            Covode.recordClassIndex(42314);
        }

        @Override // com.bytedance.ies.p1191d.p1192a.AbstractC17114f
        /* renamed from: a */
        public final List<String> mo27024a() {
            ArrayList arrayList = new ArrayList();
            for (AbstractC35150b bVar : this.f82959a) {
                arrayList.addAll(bVar.mo61994a());
            }
            return arrayList;
        }

        public C35159a(Collection collection) {
            this.f82959a = collection;
        }
    }
}
