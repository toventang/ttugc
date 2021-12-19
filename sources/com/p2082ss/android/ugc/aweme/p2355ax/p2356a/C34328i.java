package com.p2082ss.android.ugc.aweme.p2355ax.p2356a;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import java.util.Map;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ax.a.i */
public final class C34328i {

    /* renamed from: a */
    static final C34298aa<AbstractC34340m> f81182a = new C34298aa<>(C89204ab.m154669a(AbstractC34340m.class), C34329a.f81184a);

    /* renamed from: b */
    public static final C34328i f81183b = new C34328i();

    private C34328i() {
    }

    static {
        Covode.recordClassIndex(41272);
    }

    /* renamed from: com.ss.android.ugc.aweme.ax.a.i$a */
    static final class C34329a extends AbstractC89220m implements AbstractC89187q<Uri, C34324g, Map<String, ? extends String>, AbstractC34340m> {

        /* renamed from: a */
        public static final C34329a f81184a = new C34329a();

        static {
            Covode.recordClassIndex(41273);
        }

        C34329a() {
            super(3);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89187q
        public final /* synthetic */ AbstractC34340m invoke(Uri uri, C34324g gVar, Map<String, ? extends String> map) {
            Uri uri2 = uri;
            C34324g gVar2 = gVar;
            Map<String, ? extends String> map2 = map;
            C89219l.m154721d(uri2, "");
            C89219l.m154721d(gVar2, "");
            C89219l.m154721d(map2, "");
            if (C89219l.m154714a((Object) uri2.getScheme(), (Object) "http") || C89219l.m154714a((Object) uri2.getScheme(), (Object) "https") || 0 != 0) {
                return new C34330j(uri2, gVar2, map2);
            }
            return null;
        }
    }
}
