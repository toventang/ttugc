package com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3175f;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3253d.AbstractC56219a;
import java.io.File;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.f.a */
public final class C55121a implements AbstractC56219a {

    /* renamed from: a */
    public static final C55125a f126146a = new C55125a((byte) 0);

    /* renamed from: b */
    private final AbstractC89183m<String, String, String> f126147b;

    /* renamed from: c */
    private final AbstractC89172b<String, Boolean> f126148c;

    /* renamed from: d */
    private final String f126149d;

    /* renamed from: e */
    private final AbstractC89172b<String, File> f126150e;

    static {
        Covode.recordClassIndex(64849);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.f.a$a */
    public static final class C55125a {
        static {
            Covode.recordClassIndex(64853);
        }

        private C55125a() {
        }

        public /* synthetic */ C55125a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.p3253d.AbstractC56219a
    /* renamed from: a */
    public final boolean mo92036a() {
        return this.f126148c.invoke("tt_messaging_mt_emoji_zip").booleanValue();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C55121a() {
        /*
            r4 = this;
            com.ss.android.ugc.aweme.im.sdk.common.controller.f.a$1 r3 = com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3175f.C55121a.C551221.f126151a
            com.ss.android.ugc.aweme.im.sdk.common.controller.f.a$2 r2 = com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3175f.C55121a.C551232.f126152a
            com.ss.android.ugc.aweme.web.k r1 = com.p2082ss.android.ugc.aweme.web.C81631k.f182525a
            java.lang.String r0 = ""
            p4600h.p4611f.p4613b.C89219l.m154716b(r1, r0)
            java.lang.String r1 = r1.mo125297c()
            com.ss.android.ugc.aweme.im.sdk.common.controller.f.a$3 r0 = com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3175f.C55121a.C551243.f126153a
            r4.<init>(r3, r2, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3175f.C55121a.<init>():void");
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.p3253d.AbstractC56219a
    /* renamed from: a */
    public final Object mo92035a(String str) {
        C89219l.m154721d(str, "");
        if (!mo92036a()) {
            return C89379q.m157068constructorimpl(C89382r.m154941a((Throwable) new IllegalStateException("GeckoEmojiUtils: gecko small emoji not loaded yet")));
        }
        String invoke = this.f126147b.invoke(this.f126149d, "tt_messaging_mt_emoji_zip");
        if (invoke == null || invoke.length() == 0) {
            return C89379q.m157068constructorimpl(C89382r.m154941a((Throwable) new IllegalStateException("GeckoEmojiUtils: invalid parent channel path")));
        }
        File invoke2 = this.f126150e.invoke(invoke + File.separator + str);
        if (!invoke2.exists()) {
            return C89379q.m157068constructorimpl(C89382r.m154941a((Throwable) new IllegalStateException("GeckoEmojiUtils: emoji file does not exist")));
        }
        return C89379q.m157068constructorimpl(invoke2.getAbsolutePath());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.f.a.m<? super java.lang.String, ? super java.lang.String, java.lang.String> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: h.f.a.b<? super java.lang.String, java.lang.Boolean> */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: h.f.a.b<? super java.lang.String, ? extends java.io.File> */
    /* JADX WARN: Multi-variable type inference failed */
    private C55121a(AbstractC89183m<? super String, ? super String, String> mVar, AbstractC89172b<? super String, Boolean> bVar, String str, AbstractC89172b<? super String, ? extends File> bVar2) {
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(bVar2, "");
        this.f126147b = mVar;
        this.f126148c = bVar;
        this.f126149d = str;
        this.f126150e = bVar2;
    }
}
