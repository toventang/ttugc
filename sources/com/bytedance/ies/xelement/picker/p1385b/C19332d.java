package com.bytedance.ies.xelement.picker.p1385b;

import android.content.Context;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.p1366c.AbstractC19054a;
import com.bytedance.ies.xelement.picker.p1386c.C19333a;
import com.bytedance.ies.xelement.picker.p1386c.C19335c;
import com.bytedance.ies.xelement.picker.p1388e.AbstractC19346j;
import com.bytedance.ies.xelement.picker.view.View$OnClickListenerC19364d;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* renamed from: com.bytedance.ies.xelement.picker.b.d */
public final class C19332d extends AbstractC19329a<C19332d> {

    /* renamed from: a */
    private C19335c f45685a;

    /* renamed from: b */
    private String f45686b = ":";

    /* renamed from: c */
    private String f45687c;

    /* renamed from: d */
    private String f45688d;

    /* renamed from: e */
    private String f45689e;

    static {
        Covode.recordClassIndex(22120);
    }

    /* access modifiers changed from: package-private */
    @Override // com.bytedance.ies.xelement.picker.p1385b.AbstractC19329a
    /* renamed from: a */
    public final C19333a mo30782a() {
        return this.f45685a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0054, code lost:
        if (r2 != false) goto L_0x004a;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m36086c() {
        /*
            r7 = this;
            com.bytedance.ies.xelement.picker.c.c r0 = r7.f45685a
            boolean[] r2 = r0.f45731G
            java.lang.String r6 = "mm"
            java.lang.String r5 = "HH"
            if (r2 == 0) goto L_0x000e
            int r1 = r2.length
            r0 = 3
            if (r1 == r0) goto L_0x0022
        L_0x000e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r5)
            java.lang.String r0 = r7.f45686b
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.StringBuilder r0 = r0.append(r6)
            java.lang.String r0 = r0.toString()
            return r0
        L_0x0022:
            r0 = 0
            boolean r4 = r2[r0]
            r0 = 1
            boolean r3 = r2[r0]
            r0 = 2
            boolean r2 = r2[r0]
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            if (r4 == 0) goto L_0x003e
            r1.append(r5)
            if (r3 != 0) goto L_0x0039
            if (r2 == 0) goto L_0x004f
        L_0x0039:
            java.lang.String r0 = r7.f45686b
            r1.append(r0)
        L_0x003e:
            if (r3 == 0) goto L_0x0054
            r1.append(r6)
            if (r2 == 0) goto L_0x004f
            java.lang.String r0 = r7.f45686b
            r1.append(r0)
        L_0x004a:
            java.lang.String r0 = "ss"
            r1.append(r0)
        L_0x004f:
            java.lang.String r0 = r1.toString()
            return r0
        L_0x0054:
            if (r2 == 0) goto L_0x004f
            goto L_0x004a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.xelement.picker.p1385b.C19332d.m36086c():java.lang.String");
    }

    /* renamed from: b */
    public final View$OnClickListenerC19364d mo30803b() {
        SimpleDateFormat simpleDateFormat;
        this.f45685a.f45749Y = this.f45686b;
        try {
            simpleDateFormat = new SimpleDateFormat(m36086c(), Locale.getDefault());
        } catch (Exception unused) {
            String str = this.f45688d;
            if (str != null) {
                this.f45688d = str.replace(this.f45686b, ":");
            }
            String str2 = this.f45689e;
            if (str2 != null) {
                this.f45689e = str2.replace(this.f45686b, ":");
            }
            String str3 = this.f45687c;
            if (str3 != null) {
                this.f45687c = str3.replace(this.f45686b, ":");
            }
            this.f45686b = ":";
            simpleDateFormat = new SimpleDateFormat(m36086c(), Locale.getDefault());
        }
        String str4 = this.f45688d;
        if (str4 != null) {
            try {
                Date parse = simpleDateFormat.parse(str4);
                this.f45685a.f45733I = Calendar.getInstance();
                this.f45685a.f45733I.setTime(parse);
            } catch (ParseException unused2) {
            }
        }
        if (this.f45685a.f45733I == null) {
            this.f45685a.f45733I = Calendar.getInstance();
            this.f45685a.f45733I.set(LiveNetAdaptiveHurryTimeSetting.DEFAULT, 0, 1, 0, 0, 0);
        }
        String str5 = this.f45689e;
        if (str5 != null) {
            try {
                Date parse2 = simpleDateFormat.parse(str5);
                this.f45685a.f45734J = Calendar.getInstance();
                this.f45685a.f45734J.setTimeInMillis(parse2.getTime());
            } catch (ParseException unused3) {
            }
        }
        if (this.f45685a.f45734J == null) {
            this.f45685a.f45734J = Calendar.getInstance();
            this.f45685a.f45734J.set(LiveNetAdaptiveHurryTimeSetting.DEFAULT, 0, 1, 23, 59, 59);
        }
        String str6 = this.f45687c;
        if (str6 != null) {
            try {
                Date parse3 = simpleDateFormat.parse(str6);
                this.f45685a.f45732H = Calendar.getInstance();
                this.f45685a.f45732H.setTime(parse3);
            } catch (ParseException unused4) {
            }
        }
        if (this.f45685a.f45732H == null) {
            this.f45685a.f45732H = Calendar.getInstance();
        }
        return new View$OnClickListenerC19364d(this.f45685a);
    }

    /* renamed from: d */
    public final C19332d mo30805d(String str) {
        this.f45687c = str;
        return this;
    }

    /* renamed from: a */
    public final C19332d mo30799a(AbstractC19054a aVar) {
        this.f45685a.f45748X = aVar;
        return this;
    }

    /* renamed from: a */
    public final C19332d mo30800a(AbstractC19346j jVar) {
        this.f45685a.f45728D = jVar;
        return this;
    }

    /* renamed from: c */
    public final C19332d mo30804c(String str) {
        if (str == null) {
            this.f45686b = ":";
        } else {
            this.f45686b = str;
        }
        return this;
    }

    public C19332d(Context context) {
        C19335c cVar = new C19335c();
        this.f45685a = cVar;
        cVar.f45698f = context;
    }

    /* renamed from: b */
    public final C19332d mo30802b(String str) {
        if ("hour".equals(str)) {
            this.f45685a.f45731G = new boolean[]{true, false, false};
        } else if ("minute".equals(str)) {
            this.f45685a.f45731G = new boolean[]{true, true, false};
        } else if ("second".equals(str)) {
            this.f45685a.f45731G = new boolean[]{true, true, true};
        } else {
            this.f45685a.f45731G = new boolean[]{true, true, false};
        }
        return this;
    }

    /* renamed from: a */
    public final C19332d mo30801a(String str, String str2) {
        this.f45688d = str;
        this.f45689e = str2;
        return this;
    }
}
