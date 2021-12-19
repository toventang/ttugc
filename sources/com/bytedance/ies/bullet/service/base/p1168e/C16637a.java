package com.bytedance.ies.bullet.service.base.p1168e;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.bullet.service.base.e.a */
public final class C16637a extends AbstractC16640d {

    /* renamed from: a */
    public String f39801a = "";

    /* renamed from: b */
    public final Uri f39802b;

    static {
        Covode.recordClassIndex(19074);
    }

    @Override // com.bytedance.ies.bullet.service.base.p1168e.AbstractC16640d
    /* renamed from: b */
    public final String mo26401b() {
        String uri = this.f39802b.toString();
        C89219l.m154709a((Object) uri, "");
        return uri;
    }

    @Override // com.bytedance.ies.bullet.service.base.p1168e.AbstractC16640d
    /* renamed from: a */
    public final String mo26400a() {
        boolean z;
        String uri;
        String path;
        String authority = this.f39802b.getAuthority();
        if (authority == null || authority.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z || !(((path = this.f39802b.getPath()) == null || path.length() == 0) && mo26402c() == EnumC16642f.LYNX)) {
            uri = new Uri.Builder().scheme(this.f39802b.getScheme()).authority(this.f39802b.getAuthority()).path(this.f39802b.getPath()).build().toString();
            C89219l.m154709a((Object) uri, "");
        } else {
            uri = C16639c.m30885a(this.f39802b, "surl");
            if (uri == null) {
                uri = String.valueOf(this.f39802b);
            }
        }
        if (!TextUtils.isEmpty(uri)) {
            return uri;
        }
        String uri2 = this.f39802b.toString();
        C89219l.m154709a((Object) uri2, "");
        return uri2;
    }

    @Override // com.bytedance.ies.bullet.service.base.p1168e.AbstractC16640d
    /* renamed from: c */
    public final EnumC16642f mo26402c() {
        String scheme = this.f39802b.getScheme();
        if (scheme != null) {
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

    public C16637a(Uri uri) {
        C89219l.m154719c(uri, "");
        this.f39802b = uri;
    }
}
