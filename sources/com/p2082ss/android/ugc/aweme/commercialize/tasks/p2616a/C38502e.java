package com.p2082ss.android.ugc.aweme.commercialize.tasks.p2616a;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.rich.p1271c.p1272a.AbstractC18142a;
import com.bytedance.ies.ugc.aweme.rich.p1271c.p1272a.AbstractC18144c;
import com.bytedance.ies.ugc.aweme.rich.p1271c.p1272a.C18148g;
import com.p2082ss.android.ugc.aweme.commercialize.tasks.C38497a;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.tasks.a.e */
public final class C38502e extends AbstractC18142a {

    /* renamed from: d */
    public static final C38503a f90981d = new C38503a((byte) 0);

    /* renamed from: e */
    private final String f90982e;

    static {
        Covode.recordClassIndex(46028);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.tasks.a.e$a */
    public static final class C38503a {
        static {
            Covode.recordClassIndex(46029);
        }

        private C38503a() {
        }

        public /* synthetic */ C38503a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.rich.p1271c.p1272a.AbstractC18143b
    /* renamed from: b */
    public final boolean mo28927b() {
        String str;
        if (TextUtils.isEmpty(this.f90982e)) {
            return false;
        }
        Uri parse = Uri.parse(this.f90982e);
        C89219l.m154716b(parse, "");
        String scheme = parse.getScheme();
        if (scheme != null) {
            Objects.requireNonNull(scheme, "null cannot be cast to non-null type java.lang.String");
            str = scheme.toLowerCase();
            C89219l.m154716b(str, "");
        } else {
            str = null;
        }
        if (m78074a(str) || C89219l.m154714a((Object) str, (Object) "aweme")) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ies.ugc.aweme.rich.p1271c.p1272a.AbstractC18142a
    /* renamed from: a */
    public final C18148g mo28925a() {
        String str;
        Uri parse = Uri.parse(this.f90982e);
        String str2 = "";
        C89219l.m154716b(parse, str2);
        String scheme = parse.getScheme();
        if (scheme != null) {
            Objects.requireNonNull(scheme, "null cannot be cast to non-null type java.lang.String");
            str = scheme.toLowerCase();
            C89219l.m154716b(str, str2);
        } else {
            str = null;
        }
        if (m78074a(str)) {
            C38497a.f90936a.mo65615a(this.f90982e);
            boolean a = C38497a.f90936a.mo65619a(this.f43206b, this.f90982e, (String) null);
            C38497a.f90936a.mo65629d(this.f90982e);
            if (!a) {
                str2 = "handle sslocal scheme failed";
            }
            return new C18148g(a, str2);
        } else if (!C89219l.m154714a((Object) str, (Object) "aweme")) {
            return new C18148g(false);
        } else {
            boolean b = C38497a.f90936a.mo65627b(this.f90982e);
            if (!b) {
                str2 = "handle aweme scheme failed";
            }
            return new C18148g(b, str2);
        }
    }

    /* renamed from: a */
    private static boolean m78074a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (TextUtils.equals("sslocal", str) || TextUtils.equals("localsdk", str)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C38502e(AbstractC18144c cVar, Bundle bundle) {
        super(cVar, bundle);
        C89219l.m154721d(cVar, "");
        C89219l.m154721d(bundle, "");
        String string = bundle.getString("open_url", "");
        C89219l.m154716b(string, "");
        this.f90982e = string;
    }
}
