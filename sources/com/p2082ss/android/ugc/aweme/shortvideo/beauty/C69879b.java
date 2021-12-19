package com.p2082ss.android.ugc.aweme.shortvideo.beauty;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.p2082ss.android.ugc.aweme.beauty.ComposerBeauty;
import com.p2082ss.android.ugc.aweme.tools.beauty.EnumC77817a;
import com.p2082ss.android.ugc.aweme.tools.beauty.p4095g.C77962k;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.beauty.b */
public final class C69879b extends C77962k {

    /* renamed from: a */
    public static final C69880a f156128a = new C69880a((byte) 0);

    /* renamed from: d */
    private static final Keva f156129d;

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.service.AbstractC78055e, com.p2082ss.android.ugc.aweme.tools.beauty.p4095g.C77962k
    /* renamed from: a */
    public final float mo110215a(ComposerBeauty composerBeauty, EnumC77817a aVar, String str, float f) {
        C89219l.m154721d(composerBeauty, "");
        C89219l.m154721d(aVar, "");
        return f;
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.service.AbstractC78055e, com.p2082ss.android.ugc.aweme.tools.beauty.p4095g.C77962k
    /* renamed from: b */
    public final void mo110218b(ComposerBeauty composerBeauty, EnumC77817a aVar, String str, float f) {
        C89219l.m154721d(composerBeauty, "");
        C89219l.m154721d(aVar, "");
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.beauty.b$a */
    public static final class C69880a {
        static {
            Covode.recordClassIndex(82289);
        }

        private C69880a() {
        }

        public /* synthetic */ C69880a(byte b) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(82288);
        Keva repo = Keva.getRepo("story_ulike_repo");
        C89219l.m154716b(repo, "");
        f156129d = repo;
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.service.AbstractC78055e, com.p2082ss.android.ugc.aweme.tools.beauty.p4095g.C77962k
    /* renamed from: a */
    public final boolean mo110217a() {
        return f156129d.getBoolean("key_disable_all_beauty", false);
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.service.AbstractC78055e, com.p2082ss.android.ugc.aweme.tools.beauty.p4095g.C77962k
    /* renamed from: a */
    public final void mo110216a(boolean z) {
        f156129d.storeBoolean("key_disable_all_beauty", z);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C69879b(String str) {
        super(str);
        C89219l.m154721d(str, "");
    }
}
