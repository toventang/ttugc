package com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.uploadpicsticker.p4003c;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.c.a */
public final class C76003a {

    /* renamed from: a */
    public String f170767a;

    /* renamed from: b */
    public String f170768b;

    /* renamed from: c */
    public String f170769c;

    /* renamed from: d */
    public List<String> f170770d;

    static {
        Covode.recordClassIndex(88947);
    }

    /* renamed from: a */
    public final String mo119704a() {
        List<String> list = this.f170770d;
        if (list == null) {
            C89219l.m154715b();
        }
        if (list.isEmpty() || TextUtils.isEmpty(this.f170768b)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        List<String> list2 = this.f170770d;
        if (list2 == null) {
            C89219l.m154715b();
        }
        StringBuilder append = sb.append(list2.get(0));
        String str = this.f170768b;
        if (str == null) {
            C89219l.m154715b();
        }
        return append.append(str).toString();
    }

    /* renamed from: b */
    public final String mo119705b() {
        List<String> list = this.f170770d;
        if (list == null || list.isEmpty() || TextUtils.isEmpty(this.f170767a)) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        List<String> list2 = this.f170770d;
        if (list2 == null) {
            C89219l.m154715b();
        }
        StringBuilder append = sb.append(list2.get(0));
        String str = this.f170767a;
        if (str == null) {
            C89219l.m154715b();
        }
        return append.append(str).toString();
    }
}
