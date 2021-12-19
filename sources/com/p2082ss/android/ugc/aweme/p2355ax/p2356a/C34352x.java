package com.p2082ss.android.ugc.aweme.p2355ax.p2356a;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import java.util.Map;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ax.a.x */
public final class C34352x {

    /* renamed from: a */
    static final C34298aa<AbstractC34344q> f81213a = new C34298aa<>(C89204ab.m154669a(AbstractC34344q.class), C34353a.f81215a);

    /* renamed from: b */
    public static final C34352x f81214b = new C34352x();

    private C34352x() {
    }

    static {
        Covode.recordClassIndex(41296);
    }

    /* renamed from: com.ss.android.ugc.aweme.ax.a.x$a */
    static final class C34353a extends AbstractC89220m implements AbstractC89187q<Uri, C34324g, Map<String, ? extends String>, AbstractC34344q> {

        /* renamed from: a */
        public static final C34353a f81215a = new C34353a();

        static {
            Covode.recordClassIndex(41297);
        }

        C34353a() {
            super(3);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89187q
        public final /* synthetic */ AbstractC34344q invoke(Uri uri, C34324g gVar, Map<String, ? extends String> map) {
            Uri uri2 = uri;
            C34324g gVar2 = gVar;
            Map<String, ? extends String> map2 = map;
            C89219l.m154721d(uri2, "");
            C89219l.m154721d(gVar2, "");
            C89219l.m154721d(map2, "");
            if (C89219l.m154714a((Object) uri2.getScheme(), (Object) "react-native")) {
                return new C34354y(uri2, gVar2, map2);
            }
            return null;
        }
    }
}
