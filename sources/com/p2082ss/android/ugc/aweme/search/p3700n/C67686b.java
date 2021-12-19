package com.p2082ss.android.ugc.aweme.search.p3700n;

import com.bytedance.covode.number.Covode;
import com.bytedance.track.AbstractC22883b;
import java.util.UUID;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.search.n.b */
public final class C67686b implements AbstractC22883b<C67686b> {

    /* renamed from: c */
    public static final C67687a f151708c = new C67687a((byte) 0);

    /* renamed from: a */
    public C67685a f151709a = new C67685a();

    /* renamed from: b */
    public final int f151710b;

    /* renamed from: d */
    private final String f151711d;

    static {
        Covode.recordClassIndex(79331);
    }

    /* renamed from: com.ss.android.ugc.aweme.search.n.b$a */
    public static final class C67687a {
        static {
            Covode.recordClassIndex(79332);
        }

        private C67687a() {
        }

        public /* synthetic */ C67687a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.provider.AbstractC21747h
    /* renamed from: a */
    public final String mo35386a() {
        return this.f151711d;
    }

    /* Return type fixed from 'com.bytedance.provider.h' to match base method */
    @Override // com.bytedance.track.AbstractC22883b
    /* renamed from: b */
    public final /* synthetic */ C67686b mo37219b() {
        C67686b bVar = new C67686b(this.f151710b);
        C67685a aVar = this.f151709a;
        String str = aVar.f151706a;
        String str2 = aVar.f151707b;
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        bVar.f151709a = new C67685a(str, str2);
        return bVar;
    }

    public C67686b(int i) {
        this.f151710b = i;
        String uuid = UUID.randomUUID().toString();
        C89219l.m154716b(uuid, "");
        this.f151711d = uuid;
    }
}
