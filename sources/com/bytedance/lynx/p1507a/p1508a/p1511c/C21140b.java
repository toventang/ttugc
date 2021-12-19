package com.bytedance.lynx.p1507a.p1508a.p1511c;

import android.graphics.Color;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.lynx.p1507a.p1508a.p1513e.C21142a;
import com.bytedance.lynx.p1507a.p1508a.p1514f.C21143a;
import com.bytedance.lynx.p1507a.p1508a.p1514f.C21144b;
import java.util.Map;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.bytedance.lynx.a.a.c.b */
public final class C21140b {

    /* renamed from: a */
    public static final C21140b f50164a = new C21140b();

    /* renamed from: c */
    public static final String m39803c(String str, String str2, Map<String, String> map, Uri uri) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(str2, "");
        C89219l.m154719c(map, "");
        C89219l.m154719c(uri, "");
        return str2;
    }

    private C21140b() {
    }

    static {
        Covode.recordClassIndex(24756);
    }

    /* renamed from: b */
    public static final boolean m39802b(String str, String str2, Map<String, String> map, Uri uri) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(str2, "");
        C89219l.m154719c(map, "");
        C89219l.m154719c(uri, "");
        return C89219l.m154714a((Object) str2, (Object) "1");
    }

    /* renamed from: a */
    public static final int m39801a(String str, String str2, Map<String, String> map, Uri uri) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(str2, "");
        C89219l.m154719c(map, "");
        C89219l.m154719c(uri, "");
        if (C89361p.m154876c(str2, "rpx", false)) {
            return (int) ((Float.parseFloat(C89361p.m154913b(str2, (CharSequence) "rpx")) / 750.0f) * ((float) C21144b.m39810b()));
        }
        if (!C89361p.m154876c(str2, "%", false)) {
            return C21144b.m39809a(Float.parseFloat(str2));
        }
        float parseFloat = Float.parseFloat(C89361p.m154913b(str2, (CharSequence) "%")) / 100.0f;
        if (C89361p.m154908a((CharSequence) str, (CharSequence) "width", false)) {
            return (int) (((float) C21144b.m39810b()) * parseFloat);
        }
        if (C89361p.m154908a((CharSequence) str, (CharSequence) "height", false)) {
            return (int) (((float) C21144b.m39808a()) * parseFloat);
        }
        return (int) (((float) C21144b.m39810b()) * parseFloat);
    }

    /* renamed from: d */
    public static final C21142a m39804d(String str, String str2, Map<String, String> map, Uri uri) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(str2, "");
        C89219l.m154719c(map, "");
        C89219l.m154719c(uri, "");
        C89391z zVar = null;
        C21142a aVar = new C21142a(0, 1, null);
        try {
            aVar.setColor(Color.parseColor(C21143a.m39807a(str2)));
            String str3 = map.get(str + "_light");
            if (str3 != null) {
                aVar.setColorLight(Color.parseColor(C21143a.m39807a(str3)));
            }
            String str4 = map.get(str + "_dark");
            if (str4 != null) {
                aVar.setColorDark(Color.parseColor(C21143a.m39807a(str4)));
                zVar = C89391z.f203057a;
            }
            C89379q.m157068constructorimpl(zVar);
        } catch (Throwable th) {
            C89379q.m157068constructorimpl(C89382r.m154941a(th));
        }
        return aVar;
    }

    /* renamed from: e */
    public static final C21142a m39805e(String str, String str2, Map<String, String> map, Uri uri) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(str2, "");
        C89219l.m154719c(map, "");
        C89219l.m154719c(uri, "");
        C89391z zVar = null;
        C21142a aVar = new C21142a(0, 1, null);
        try {
            aVar.setColor(Color.parseColor(C21143a.m39807a("#".concat(String.valueOf(str2)))));
            String str3 = map.get(str + "_light");
            if (str3 != null) {
                aVar.setColorLight(Color.parseColor(C21143a.m39807a("#".concat(String.valueOf(str3)))));
            }
            String str4 = map.get(str + "_dark");
            if (str4 != null) {
                aVar.setColorDark(Color.parseColor(C21143a.m39807a("#".concat(String.valueOf(str4)))));
                zVar = C89391z.f203057a;
            }
            C89379q.m157068constructorimpl(zVar);
        } catch (Throwable th) {
            C89379q.m157068constructorimpl(C89382r.m154941a(th));
        }
        return aVar;
    }
}
