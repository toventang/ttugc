package com.p2082ss.android.p2092ad.splash.p2107d;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.p2092ad.splash.p2109f.C29657l;

/* renamed from: com.ss.android.ad.splash.d.a */
public final class C29630a {

    /* renamed from: a */
    public String f70687a;

    /* renamed from: b */
    private String f70688b;

    /* renamed from: c */
    private String f70689c;

    /* renamed from: d */
    private String f70690d;

    static {
        Covode.recordClassIndex(36026);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (!C29657l.m59760a(this.f70688b)) {
            sb.append("&iid=").append(Uri.encode(this.f70688b));
        }
        if (!C29657l.m59760a(this.f70687a)) {
            sb.append("&device_id=").append(Uri.encode(this.f70687a));
        }
        if (!C29657l.m59760a(this.f70690d)) {
            sb.append("&openudid=").append(Uri.encode(this.f70690d));
        }
        if (!C29657l.m59760a(this.f70689c)) {
            sb.append("&uuid=").append(Uri.encode(this.f70689c));
        }
        return sb.toString();
    }
}
