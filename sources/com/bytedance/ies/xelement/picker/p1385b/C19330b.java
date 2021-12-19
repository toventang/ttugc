package com.bytedance.ies.xelement.picker.p1385b;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.p1366c.AbstractC19054a;
import com.bytedance.ies.xelement.picker.p1386c.C19333a;
import com.bytedance.ies.xelement.picker.p1386c.C19335c;
import com.bytedance.ies.xelement.picker.p1388e.AbstractC19346j;
import com.bytedance.ies.xelement.picker.view.View$OnClickListenerC19361b;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* renamed from: com.bytedance.ies.xelement.picker.b.b */
public final class C19330b extends AbstractC19329a<C19330b> {

    /* renamed from: a */
    private C19335c f45679a;

    /* renamed from: b */
    private String f45680b = "-";

    /* renamed from: c */
    private String f45681c;

    /* renamed from: d */
    private String f45682d;

    /* renamed from: e */
    private String f45683e;

    static {
        Covode.recordClassIndex(22118);
    }

    /* access modifiers changed from: package-private */
    @Override // com.bytedance.ies.xelement.picker.p1385b.AbstractC19329a
    /* renamed from: a */
    public final C19333a mo30782a() {
        return this.f45679a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005e, code lost:
        if (r2 != false) goto L_0x0056;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m36070c() {
        /*
            r8 = this;
            com.bytedance.ies.xelement.picker.c.c r0 = r8.f45679a
            boolean[] r2 = r0.f45730F
            java.lang.String r5 = "dd"
            java.lang.String r6 = "MM"
            java.lang.String r7 = "yyyy"
            if (r2 == 0) goto L_0x0010
            int r1 = r2.length
            r0 = 3
            if (r1 == r0) goto L_0x002e
        L_0x0010:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r7)
            java.lang.String r0 = r8.f45680b
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.StringBuilder r1 = r0.append(r6)
            java.lang.String r0 = r8.f45680b
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.StringBuilder r0 = r0.append(r5)
            java.lang.String r0 = r0.toString()
            return r0
        L_0x002e:
            r0 = 0
            boolean r4 = r2[r0]
            r0 = 1
            boolean r3 = r2[r0]
            r0 = 2
            boolean r2 = r2[r0]
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            if (r4 == 0) goto L_0x004a
            r1.append(r7)
            if (r3 != 0) goto L_0x0045
            if (r2 == 0) goto L_0x0059
        L_0x0045:
            java.lang.String r0 = r8.f45680b
            r1.append(r0)
        L_0x004a:
            if (r3 == 0) goto L_0x005e
            r1.append(r6)
            if (r2 == 0) goto L_0x0059
            java.lang.String r0 = r8.f45680b
            r1.append(r0)
        L_0x0056:
            r1.append(r5)
        L_0x0059:
            java.lang.String r0 = r1.toString()
            return r0
        L_0x005e:
            if (r2 == 0) goto L_0x0059
            goto L_0x0056
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.xelement.picker.p1385b.C19330b.m36070c():java.lang.String");
    }

    /* renamed from: b */
    public final View$OnClickListenerC19361b mo30790b() {
        SimpleDateFormat simpleDateFormat;
        this.f45679a.f45749Y = this.f45680b;
        try {
            simpleDateFormat = new SimpleDateFormat(m36070c(), Locale.getDefault());
        } catch (Exception unused) {
            String str = this.f45682d;
            if (str != null) {
                this.f45682d = str.replace(this.f45680b, "-");
            }
            String str2 = this.f45683e;
            if (str2 != null) {
                this.f45683e = str2.replace(this.f45680b, "-");
            }
            String str3 = this.f45681c;
            if (str3 != null) {
                this.f45681c = str3.replace(this.f45680b, "-");
            }
            this.f45680b = "-";
            simpleDateFormat = new SimpleDateFormat(m36070c(), Locale.getDefault());
        }
        String str4 = this.f45682d;
        if (str4 != null) {
            try {
                Date parse = simpleDateFormat.parse(str4);
                this.f45679a.f45733I = Calendar.getInstance();
                this.f45679a.f45733I.setTime(parse);
            } catch (ParseException unused2) {
            }
        }
        String str5 = this.f45683e;
        if (str5 != null) {
            try {
                Date parse2 = simpleDateFormat.parse(str5);
                this.f45679a.f45734J = Calendar.getInstance();
                this.f45679a.f45734J.setTime(parse2);
            } catch (ParseException unused3) {
            }
        }
        String str6 = this.f45681c;
        if (str6 != null) {
            try {
                Date parse3 = simpleDateFormat.parse(str6);
                this.f45679a.f45732H = Calendar.getInstance();
                this.f45679a.f45732H.setTime(parse3);
            } catch (ParseException unused4) {
            }
        }
        return new View$OnClickListenerC19361b(this.f45679a);
    }

    /* renamed from: d */
    public final C19330b mo30792d(String str) {
        this.f45681c = str;
        return this;
    }

    /* renamed from: a */
    public final C19330b mo30786a(AbstractC19054a aVar) {
        this.f45679a.f45748X = aVar;
        return this;
    }

    /* renamed from: a */
    public final C19330b mo30787a(AbstractC19346j jVar) {
        this.f45679a.f45728D = jVar;
        return this;
    }

    /* renamed from: c */
    public final C19330b mo30791c(String str) {
        if (str == null) {
            this.f45680b = "-";
        } else {
            this.f45680b = str;
        }
        return this;
    }

    public C19330b(Context context) {
        C19335c cVar = new C19335c();
        this.f45679a = cVar;
        cVar.f45698f = context;
    }

    /* renamed from: b */
    public final C19330b mo30789b(String str) {
        if ("year".equals(str)) {
            this.f45679a.f45730F = new boolean[]{true, false, false};
        } else if ("month".equals(str)) {
            this.f45679a.f45730F = new boolean[]{true, true, false};
        } else if ("day".equals(str)) {
            this.f45679a.f45730F = new boolean[]{true, true, true};
        } else {
            this.f45679a.f45731G = new boolean[]{true, true, true};
        }
        return this;
    }

    /* renamed from: a */
    public final C19330b mo30788a(String str, String str2) {
        this.f45682d = str;
        this.f45683e = str2;
        return this;
    }
}
