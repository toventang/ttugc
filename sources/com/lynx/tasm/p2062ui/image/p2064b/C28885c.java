package com.lynx.tasm.p2062ui.image.p2064b;

import android.content.Context;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.base.C28454c;

/* renamed from: com.lynx.tasm.ui.image.b.c */
public class C28885c {

    /* renamed from: a */
    public String f68251a;

    /* renamed from: b */
    public double f68252b;

    /* renamed from: c */
    public boolean f68253c;

    /* renamed from: d */
    private Uri f68254d;

    static {
        Covode.recordClassIndex(35008);
    }

    /* renamed from: a */
    public final Uri mo50100a() {
        return (Uri) C28454c.m56881a(this.f68254d);
    }

    /* renamed from: b */
    private Uri m57864b(Context context) {
        this.f68253c = true;
        return C28888e.m57867a().mo50102b(context, this.f68251a);
    }

    /* renamed from: a */
    private Uri m57863a(Context context) {
        try {
            Uri parse = Uri.parse(this.f68251a);
            if (parse.getScheme() == null) {
                return m57864b(context);
            }
            return parse;
        } catch (Exception unused) {
            return m57864b(context);
        }
    }

    public C28885c(Context context, String str) {
        this(context, str, 0.0d, 0.0d);
    }

    public C28885c(Context context, String str, double d, double d2) {
        this.f68251a = str;
        this.f68252b = d * d2;
        this.f68254d = m57863a(context);
    }
}
