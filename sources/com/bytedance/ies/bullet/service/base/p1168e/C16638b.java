package com.bytedance.ies.bullet.service.base.p1168e;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.bullet.service.base.e.b */
public final class C16638b extends AbstractC16640d {

    /* renamed from: a */
    public final Uri f39803a;

    static {
        Covode.recordClassIndex(19075);
    }

    @Override // com.bytedance.ies.bullet.service.base.p1168e.AbstractC16640d
    /* renamed from: b */
    public final String mo26401b() {
        String uri = this.f39803a.toString();
        C89219l.m154709a((Object) uri, "");
        return uri;
    }

    /* renamed from: d */
    private final Uri m30880d() {
        Object obj;
        Uri uri = null;
        try {
            String a = C16639c.m30885a(this.f39803a, "url");
            if (a != null) {
                return Uri.parse(a);
            }
            obj = C89379q.m157068constructorimpl(null);
            if (!C89379q.m157073isFailureimpl(obj)) {
                uri = obj;
            }
            return uri;
        } catch (Throwable th) {
            obj = C89379q.m157068constructorimpl(C89382r.m154941a(th));
        }
    }

    @Override // com.bytedance.ies.bullet.service.base.p1168e.AbstractC16640d
    /* renamed from: a */
    public final String mo26400a() {
        String path;
        Uri d = m30880d();
        if (d == null) {
            return "";
        }
        String authority = d.getAuthority();
        if ((authority == null || authority.length() == 0) && (((path = d.getPath()) == null || path.length() == 0) && mo26402c() == EnumC16642f.LYNX)) {
            String a = C16639c.m30885a(d, "surl");
            if (a == null) {
                return String.valueOf(d);
            }
            return a;
        }
        String uri = new Uri.Builder().scheme(d.getScheme()).authority(d.getAuthority()).path(d.getPath()).build().toString();
        C89219l.m154709a((Object) uri, "");
        return uri;
    }

    @Override // com.bytedance.ies.bullet.service.base.p1168e.AbstractC16640d
    /* renamed from: c */
    public final EnumC16642f mo26402c() {
        String scheme;
        Uri d = m30880d();
        if (!(d == null || (scheme = d.getScheme()) == null)) {
            switch (scheme.hashCode()) {
                case -1772600516:
                    if (scheme.equals("lynxview")) {
                        return EnumC16642f.LYNX;
                    }
                    break;
                case 3213448:
                    if (scheme.equals("http")) {
                        return EnumC16642f.WEB;
                    }
                    break;
                case 99617003:
                    if (scheme.equals("https")) {
                        return EnumC16642f.WEB;
                    }
                    break;
                case 828638245:
                    if (scheme.equals("react-native")) {
                        return EnumC16642f.RN;
                    }
                    break;
            }
        }
        return EnumC16642f.UNKNOWN;
    }

    public C16638b(Uri uri) {
        C89219l.m154719c(uri, "");
        this.f39803a = uri;
    }
}
