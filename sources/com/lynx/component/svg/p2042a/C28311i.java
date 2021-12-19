package com.lynx.component.svg.p2042a;

import android.graphics.Matrix;
import com.C1764a;
import com.appsflyer.BuildConfig;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeAgeThresholdSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.lynx.component.svg.p2042a.C28249a;
import com.lynx.component.svg.p2042a.C28253d;
import com.lynx.component.svg.p2042a.C28257f;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.utils.C28930n;
import com.lynx.tasm.utils.ColorUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.xml.sax.Attributes;
import org.xmlpull.v1.XmlPullParser;

/* access modifiers changed from: package-private */
/* renamed from: com.lynx.component.svg.a.i */
public final class C28311i {

    /* renamed from: a */
    private C28257f f66416a;

    /* renamed from: b */
    private C28257f.AbstractC28269ae f66417b;

    /* renamed from: c */
    private boolean f66418c;

    /* renamed from: d */
    private int f66419d;

    static {
        Covode.recordClassIndex(34269);
    }

    C28311i() {
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0033 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.lynx.component.svg.p2042a.C28257f mo48364a(java.io.InputStream r4) {
        /*
            r3 = this;
            r2 = 11144(0x2b88, float:1.5616E-41)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r2)
            boolean r0 = r4.markSupported()
            if (r0 != 0) goto L_0x0011
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream
            r0.<init>(r4)
            r4 = r0
        L_0x0011:
            r0 = 3
            r4.mark(r0)     // Catch:{ IOException -> 0x0033 }
            int r1 = r4.read()     // Catch:{ IOException -> 0x0033 }
            int r0 = r4.read()     // Catch:{ IOException -> 0x0033 }
            int r0 = r0 << 8
            int r1 = r1 + r0
            r4.reset()     // Catch:{ IOException -> 0x0033 }
            r0 = 35615(0x8b1f, float:4.9907E-41)
            if (r1 != r0) goto L_0x0033
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x0033 }
            java.util.zip.GZIPInputStream r0 = new java.util.zip.GZIPInputStream     // Catch:{ IOException -> 0x0033 }
            r0.<init>(r4)     // Catch:{ IOException -> 0x0033 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x0033 }
            r4 = r1
        L_0x0033:
            r3.m56595b(r4)     // Catch:{ all -> 0x003f }
            com.lynx.component.svg.a.f r0 = r3.f66416a     // Catch:{ all -> 0x003f }
            r4.close()     // Catch:{ IOException -> 0x003b }
        L_0x003b:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r2)
            return r0
        L_0x003f:
            r0 = move-exception
            r4.close()     // Catch:{ IOException -> 0x0043 }
        L_0x0043:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.component.svg.p2042a.C28311i.mo48364a(java.io.InputStream):com.lynx.component.svg.a.f");
    }

    /* renamed from: a */
    private static void m56580a(C28257f.C28279ao aoVar, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int i2 = C283121.f66421b[EnumC28314b.m56614a(attributes.getLocalName(i)).ordinal()];
            if (i2 == 1) {
                aoVar.f66323c = m56596c(trim);
            } else if (i2 == 2) {
                aoVar.f66324d = m56596c(trim);
            } else if (i2 == 3) {
                aoVar.f66325e = m56596c(trim);
                if (aoVar.f66325e.mo48347b()) {
                    throw new C28310h("Invalid <use> element. width cannot be negative");
                }
            } else if (i2 == 4) {
                aoVar.f66326f = m56596c(trim);
                if (aoVar.f66326f.mo48347b()) {
                    throw new C28310h("Invalid <use> element. height cannot be negative");
                }
            } else if (i2 == 6 && ("".equals(attributes.getURI(i)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i)))) {
                aoVar.f66322a = trim;
            }
        }
    }

    /* renamed from: a */
    private static void m56586a(C28257f.C28292n nVar, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int i2 = C283121.f66421b[EnumC28314b.m56614a(attributes.getLocalName(i)).ordinal()];
            if (i2 == 1) {
                nVar.f66355b = m56596c(trim);
            } else if (i2 == 2) {
                nVar.f66356c = m56596c(trim);
            } else if (i2 == 3) {
                nVar.f66357d = m56596c(trim);
                if (nVar.f66357d.mo48347b()) {
                    throw new C28310h("Invalid <use> element. width cannot be negative");
                }
            } else if (i2 == 4) {
                nVar.f66358e = m56596c(trim);
                if (nVar.f66358e.mo48347b()) {
                    throw new C28310h("Invalid <use> element. height cannot be negative");
                }
            } else if (i2 != 6) {
                if (i2 == 7) {
                    m56577a(nVar, trim);
                }
            } else if ("".equals(attributes.getURI(i)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i))) {
                nVar.f66354a = trim;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:110:0x0075 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0205  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m56588a(com.lynx.component.svg.p2042a.C28257f.C28297s r23, org.xml.sax.Attributes r24) {
        /*
        // Method dump skipped, instructions count: 654
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.component.svg.p2042a.C28311i.m56588a(com.lynx.component.svg.a.f$s, org.xml.sax.Attributes):void");
    }

    /* renamed from: a */
    private static void m56591a(C28257f.C28303y yVar, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int i2 = C283121.f66421b[EnumC28314b.m56614a(attributes.getLocalName(i)).ordinal()];
            if (i2 == 1) {
                yVar.f66383a = m56596c(trim);
            } else if (i2 == 2) {
                yVar.f66384b = m56596c(trim);
            } else if (i2 == 3) {
                yVar.f66385c = m56596c(trim);
                if (yVar.f66385c.mo48347b()) {
                    throw new C28310h("Invalid <rect> element. width cannot be negative");
                }
            } else if (i2 == 4) {
                yVar.f66386d = m56596c(trim);
                if (yVar.f66386d.mo48347b()) {
                    throw new C28310h("Invalid <rect> element. height cannot be negative");
                }
            } else if (i2 == 10) {
                yVar.f66387f = m56596c(trim);
                if (yVar.f66387f.mo48347b()) {
                    throw new C28310h("Invalid <rect> element. rx cannot be negative");
                }
            } else if (i2 != 11) {
                continue;
            } else {
                yVar.f66388g = m56596c(trim);
                if (yVar.f66388g.mo48347b()) {
                    throw new C28310h("Invalid <rect> element. ry cannot be negative");
                }
            }
        }
    }

    /* renamed from: a */
    private static void m56581a(C28257f.C28281c cVar, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            switch (C283121.f66421b[EnumC28314b.m56614a(attributes.getLocalName(i)).ordinal()]) {
                case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                    cVar.f66331a = m56596c(trim);
                    break;
                case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                    cVar.f66332b = m56596c(trim);
                    break;
                case ABRConfig.ABR_SELECT_SCENE:
                    cVar.f66333c = m56596c(trim);
                    if (!cVar.f66333c.mo48347b()) {
                        break;
                    } else {
                        throw new C28310h("Invalid <circle> element. r cannot be negative");
                    }
            }
        }
    }

    /* renamed from: a */
    private static void m56583a(C28257f.C28286h hVar, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            switch (C283121.f66421b[EnumC28314b.m56614a(attributes.getLocalName(i)).ordinal()]) {
                case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                    hVar.f66341c = m56596c(trim);
                    if (!hVar.f66341c.mo48347b()) {
                        break;
                    } else {
                        throw new C28310h("Invalid <ellipse> element. rx cannot be negative");
                    }
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                    hVar.f66342d = m56596c(trim);
                    if (!hVar.f66342d.mo48347b()) {
                        break;
                    } else {
                        throw new C28310h("Invalid <ellipse> element. ry cannot be negative");
                    }
                case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                    hVar.f66339a = m56596c(trim);
                    break;
                case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                    hVar.f66340b = m56596c(trim);
                    break;
            }
        }
    }

    /* renamed from: a */
    private static void m56587a(C28257f.C28294p pVar, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            switch (C283121.f66421b[EnumC28314b.m56614a(attributes.getLocalName(i)).ordinal()]) {
                case 15:
                    pVar.f66362a = m56596c(trim);
                    break;
                case 16:
                    pVar.f66363b = m56596c(trim);
                    break;
                case 17:
                    pVar.f66364c = m56596c(trim);
                    break;
                case LiveRechargeAgeThresholdSetting.DEFAULT:
                    pVar.f66365d = m56596c(trim);
                    break;
            }
        }
    }

    /* renamed from: a */
    private static void m56590a(C28257f.C28301w wVar, Attributes attributes, String str) {
        for (int i = 0; i < attributes.getLength(); i++) {
            if (EnumC28314b.m56614a(attributes.getLocalName(i)) == EnumC28314b.points) {
                C28316d dVar = new C28316d(attributes.getValue(i));
                ArrayList<Float> arrayList = new ArrayList();
                dVar.mo48370b();
                while (!dVar.mo48367a()) {
                    float d = dVar.mo48372d();
                    if (!Float.isNaN(d)) {
                        dVar.mo48371c();
                        float d2 = dVar.mo48372d();
                        if (!Float.isNaN(d2)) {
                            dVar.mo48371c();
                            arrayList.add(Float.valueOf(d));
                            arrayList.add(Float.valueOf(d2));
                        } else {
                            throw new C28310h("Invalid <" + str + "> points attribute. There should be an even number of coordinates.");
                        }
                    } else {
                        throw new C28310h("Invalid <" + str + "> points attribute. Non-coordinate content found in list.");
                    }
                }
                wVar.f66382a = new float[arrayList.size()];
                int i2 = 0;
                for (Float f : arrayList) {
                    wVar.f66382a[i2] = f.floatValue();
                    i2++;
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0026, code lost:
        continue;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m56584a(com.lynx.component.svg.p2042a.C28257f.AbstractC28287i r5, org.xml.sax.Attributes r6) {
        /*
        // Method dump skipped, instructions count: 160
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.component.svg.p2042a.C28311i.m56584a(com.lynx.component.svg.a.f$i, org.xml.sax.Attributes):void");
    }

    /* renamed from: a */
    private static void m56576a(C28257f.C28272ah ahVar, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            switch (C283121.f66421b[EnumC28314b.m56614a(attributes.getLocalName(i)).ordinal()]) {
                case 15:
                    ahVar.f66297f = m56596c(trim);
                    break;
                case 16:
                    ahVar.f66298g = m56596c(trim);
                    break;
                case 17:
                    ahVar.f66299h = m56596c(trim);
                    break;
                case LiveRechargeAgeThresholdSetting.DEFAULT:
                    ahVar.f66300i = m56596c(trim);
                    break;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002a, code lost:
        continue;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m56578a(com.lynx.component.svg.p2042a.C28257f.C28276al r4, org.xml.sax.Attributes r5) {
        /*
        // Method dump skipped, instructions count: 108
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.component.svg.p2042a.C28311i.m56578a(com.lynx.component.svg.a.f$al, org.xml.sax.Attributes):void");
    }

    /* renamed from: a */
    private static void m56582a(C28257f.C28282d dVar, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            if (C283121.f66421b[EnumC28314b.m56614a(attributes.getLocalName(i)).ordinal()] == 25) {
                if ("objectBoundingBox".equals(trim)) {
                    dVar.f66334a = false;
                } else if ("userSpaceOnUse".equals(trim)) {
                    dVar.f66334a = true;
                } else {
                    throw new C28310h("Invalid value for attribute clipPathUnits");
                }
            }
        }
    }

    /* renamed from: a */
    private static void m56589a(C28257f.C28300v vVar, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int i2 = C283121.f66421b[EnumC28314b.m56614a(attributes.getLocalName(i)).ordinal()];
            if (i2 == 1) {
                vVar.f66377d = m56596c(trim);
            } else if (i2 == 2) {
                vVar.f66378e = m56596c(trim);
            } else if (i2 == 3) {
                vVar.f66379f = m56596c(trim);
                if (vVar.f66379f.mo48347b()) {
                    throw new C28310h("Invalid <pattern> element. width cannot be negative");
                }
            } else if (i2 == 4) {
                vVar.f66380g = m56596c(trim);
                if (vVar.f66380g.mo48347b()) {
                    throw new C28310h("Invalid <pattern> element. height cannot be negative");
                }
            } else if (i2 != 6) {
                switch (i2) {
                    case 26:
                        if (!"objectBoundingBox".equals(trim)) {
                            if ("userSpaceOnUse".equals(trim)) {
                                vVar.f66374a = true;
                                break;
                            } else {
                                break;
                            }
                        } else {
                            vVar.f66374a = false;
                            continue;
                        }
                    case 27:
                        if (!"objectBoundingBox".equals(trim)) {
                            if ("userSpaceOnUse".equals(trim)) {
                                vVar.f66375b = true;
                                break;
                            } else {
                                break;
                            }
                        } else {
                            vVar.f66375b = false;
                            continue;
                        }
                    case 28:
                        vVar.f66376c = m56593b(trim);
                        continue;
                }
            } else if ("".equals(attributes.getURI(i)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i))) {
                vVar.f66381h = trim;
            }
        }
    }

    /* renamed from: a */
    private static void m56579a(C28257f.AbstractC28277am amVar, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int i2 = C283121.f66421b[EnumC28314b.m56614a(attributes.getLocalName(i)).ordinal()];
            if (i2 == 7) {
                m56577a(amVar, trim);
            } else if (i2 != 57) {
                continue;
            } else {
                C28316d dVar = new C28316d(trim);
                dVar.mo48370b();
                float b = C28930n.m57958b(dVar.mo48377i(), 0.0f);
                dVar.mo48371c();
                float b2 = C28930n.m57958b(dVar.mo48377i(), 0.0f);
                dVar.mo48371c();
                float b3 = C28930n.m57958b(dVar.mo48377i(), 0.0f);
                dVar.mo48371c();
                float b4 = C28930n.m57958b(dVar.mo48377i(), 0.0f);
                if (Float.isNaN(b) || Float.isNaN(b2) || Float.isNaN(b3) || Float.isNaN(b4)) {
                    throw new C28310h("Invalid viewBox definition - should have four numbers");
                } else if (b3 < 0.0f) {
                    throw new C28310h("Invalid viewBox. width cannot be negative");
                } else if (b4 >= 0.0f) {
                    amVar.f66309r = new C28257f.C28259a(b, b2, b3, b4);
                } else {
                    throw new C28310h("Invalid viewBox. height cannot be negative");
                }
            }
        }
    }

    /* renamed from: a */
    private static void m56585a(C28257f.AbstractC28291m mVar, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            if (EnumC28314b.m56614a(attributes.getLocalName(i)) == EnumC28314b.transform) {
                mVar.mo48342a(m56593b(attributes.getValue(i)));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.lynx.component.svg.a.i$e */
    public class C28317e implements Attributes {

        /* renamed from: b */
        private XmlPullParser f66519b;

        static {
            Covode.recordClassIndex(34275);
        }

        public final int getIndex(String str) {
            return -1;
        }

        public final int getIndex(String str, String str2) {
            return -1;
        }

        @Override // org.xml.sax.Attributes
        public final String getType(int i) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public final String getType(String str) {
            return null;
        }

        public final String getType(String str, String str2) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public final String getValue(String str) {
            return null;
        }

        public final String getValue(String str, String str2) {
            return null;
        }

        public final int getLength() {
            return this.f66519b.getAttributeCount();
        }

        public final String getLocalName(int i) {
            return this.f66519b.getAttributeName(i);
        }

        public final String getURI(int i) {
            return this.f66519b.getAttributeNamespace(i);
        }

        @Override // org.xml.sax.Attributes
        public final String getValue(int i) {
            return this.f66519b.getAttributeValue(i);
        }

        public final String getQName(int i) {
            String attributeName = this.f66519b.getAttributeName(i);
            if (this.f66519b.getAttributePrefix(i) != null) {
                return this.f66519b.getAttributePrefix(i) + ':' + attributeName;
            }
            return attributeName;
        }

        public C28317e(XmlPullParser xmlPullParser) {
            this.f66519b = xmlPullParser;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.lynx.component.svg.a.i$d */
    public static class C28316d {

        /* renamed from: a */
        String f66514a;

        /* renamed from: b */
        int f66515b;

        /* renamed from: c */
        int f66516c;

        /* renamed from: d */
        private C28252c f66517d = new C28252c();

        static {
            Covode.recordClassIndex(34274);
        }

        /* renamed from: a */
        static boolean m56616a(int i) {
            return i == 32 || i == 10 || i == 13 || i == 9;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final void mo48370b() {
            while (true) {
                int i = this.f66515b;
                if (i < this.f66516c && m56616a((int) this.f66514a.charAt(i))) {
                    this.f66515b++;
                } else {
                    return;
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public final boolean mo48371c() {
            mo48370b();
            int i = this.f66515b;
            if (i == this.f66516c || this.f66514a.charAt(i) != ',') {
                return false;
            }
            this.f66515b++;
            mo48370b();
            return true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public final float mo48372d() {
            float a = this.f66517d.mo48324a(this.f66514a, this.f66515b, this.f66516c);
            if (!Float.isNaN(a)) {
                this.f66515b = this.f66517d.f66225a;
            }
            return a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public final float mo48373e() {
            mo48371c();
            float a = this.f66517d.mo48324a(this.f66514a, this.f66515b, this.f66516c);
            if (!Float.isNaN(a)) {
                this.f66515b = this.f66517d.f66225a;
            }
            return a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public final Integer mo48374f() {
            int i = this.f66515b;
            if (i == this.f66516c) {
                return null;
            }
            String str = this.f66514a;
            this.f66515b = i + 1;
            return Integer.valueOf(str.charAt(i));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public final C28257f.C28293o mo48375g() {
            float d = mo48372d();
            if (Float.isNaN(d)) {
                return null;
            }
            C28257f.EnumC28278an l = m56618l();
            if (l == null) {
                return new C28257f.C28293o(d, C28257f.EnumC28278an.px);
            }
            return new C28257f.C28293o(d, l);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public final int mo48376h() {
            int i = this.f66515b;
            int i2 = this.f66516c;
            if (i == i2) {
                return -1;
            }
            int i3 = i + 1;
            this.f66515b = i3;
            if (i3 < i2) {
                return this.f66514a.charAt(i3);
            }
            return -1;
        }

        /* renamed from: k */
        private Boolean m56617k() {
            int i = this.f66515b;
            if (i == this.f66516c) {
                return null;
            }
            char charAt = this.f66514a.charAt(i);
            if (charAt != '0' && charAt != '1') {
                return null;
            }
            boolean z = true;
            this.f66515b++;
            if (charAt != '1') {
                z = false;
            }
            return Boolean.valueOf(z);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public final String mo48377i() {
            if (mo48367a()) {
                return null;
            }
            char charAt = this.f66514a.charAt(this.f66515b);
            if (m56616a((int) charAt) || charAt == ' ') {
                return null;
            }
            int i = this.f66515b;
            int h = mo48376h();
            while (h != -1 && h != 32 && !m56616a(h)) {
                h = mo48376h();
            }
            return this.f66514a.substring(i, this.f66515b);
        }

        /* renamed from: l */
        private C28257f.EnumC28278an m56618l() {
            if (mo48367a()) {
                return null;
            }
            if (this.f66514a.charAt(this.f66515b) == '%') {
                this.f66515b++;
                return C28257f.EnumC28278an.percent;
            }
            int i = this.f66515b;
            int i2 = this.f66516c;
            if (i > i2 - 2) {
                return null;
            }
            if (i > i2 - 3) {
                try {
                    String substring = this.f66514a.substring(i, i + 3);
                    if ("rem".equals(substring)) {
                        this.f66515b += 3;
                        return C28257f.EnumC28278an.rem;
                    } else if ("rpx".equals(substring)) {
                        this.f66515b += 3;
                        return C28257f.EnumC28278an.rpx;
                    }
                } catch (IllegalArgumentException unused) {
                    return null;
                }
            }
            String str = this.f66514a;
            int i3 = this.f66515b;
            C28257f.EnumC28278an valueOf = C28257f.EnumC28278an.valueOf(str.substring(i3, i3 + 2).toLowerCase(Locale.US));
            this.f66515b += 2;
            return valueOf;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final boolean mo48367a() {
            if (this.f66515b == this.f66516c) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public final String mo48378j() {
            if (mo48367a()) {
                return null;
            }
            int i = this.f66515b;
            int charAt = this.f66514a.charAt(i);
            while (true) {
                if ((charAt < 97 || charAt > 122) && (charAt < 65 || charAt > 90)) {
                    int i2 = this.f66515b;
                } else {
                    charAt = mo48376h();
                }
            }
            int i22 = this.f66515b;
            while (m56616a(charAt)) {
                charAt = mo48376h();
            }
            if (charAt == 40) {
                this.f66515b++;
                return this.f66514a.substring(i, i22);
            }
            this.f66515b = i;
            return null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final Boolean mo48366a(Object obj) {
            if (obj == null) {
                return null;
            }
            mo48371c();
            return m56617k();
        }

        C28316d(String str) {
            String trim = str.trim();
            this.f66514a = trim;
            this.f66516c = trim.length();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final float mo48365a(float f) {
            if (Float.isNaN(f)) {
                return Float.NaN;
            }
            mo48371c();
            return mo48372d();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final boolean mo48368a(char c) {
            int i = this.f66515b;
            if (i >= this.f66516c || this.f66514a.charAt(i) != c) {
                return false;
            }
            this.f66515b++;
            return true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final boolean mo48369a(String str) {
            int length = str.length();
            int i = this.f66515b;
            if (i > this.f66516c - length || !this.f66514a.substring(i, i + length).equals(str)) {
                return false;
            }
            this.f66515b += length;
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.lynx.component.svg.a.i$a */
    public static class C28313a {

        /* renamed from: a */
        private static final Map<String, C28253d.EnumC28254a> f66422a;

        static {
            Covode.recordClassIndex(34271);
            HashMap hashMap = new HashMap(10);
            f66422a = hashMap;
            hashMap.put("none", C28253d.EnumC28254a.none);
            hashMap.put("xMinYMin", C28253d.EnumC28254a.xMinYMin);
            hashMap.put("xMidYMin", C28253d.EnumC28254a.xMidYMin);
            hashMap.put("xMaxYMin", C28253d.EnumC28254a.xMaxYMin);
            hashMap.put("xMinYMid", C28253d.EnumC28254a.xMinYMid);
            hashMap.put("xMidYMid", C28253d.EnumC28254a.xMidYMid);
            hashMap.put("xMaxYMid", C28253d.EnumC28254a.xMaxYMid);
            hashMap.put("xMinYMax", C28253d.EnumC28254a.xMinYMax);
            hashMap.put("xMidYMax", C28253d.EnumC28254a.xMidYMax);
            hashMap.put("xMaxYMax", C28253d.EnumC28254a.xMaxYMax);
        }

        /* renamed from: a */
        static C28253d.EnumC28254a m56613a(String str) {
            return f66422a.get(str);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.lynx.component.svg.a.i$c */
    public enum EnumC28315c {
        svg,
        circle,
        clipPath,
        defs,
        ellipse,
        g,
        image,
        line,
        linearGradient,
        path,
        pattern,
        polygon,
        polyline,
        radialGradient,
        rect,
        solidColor,
        stop,
        use,
        UNSUPPORTED;
        

        /* renamed from: t */
        private static final Map<String, EnumC28315c> f66512t = new HashMap();

        static {
            Covode.recordClassIndex(34273);
            EnumC28315c[] values = values();
            for (EnumC28315c cVar : values) {
                if (cVar != UNSUPPORTED) {
                    f66512t.put(cVar.name(), cVar);
                }
            }
        }

        /* renamed from: a */
        public static EnumC28315c m56615a(String str) {
            EnumC28315c cVar = f66512t.get(str);
            if (cVar != null) {
                return cVar;
            }
            return UNSUPPORTED;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.lynx.component.svg.a.i$1 */
    public static /* synthetic */ class C283121 {

        /* renamed from: a */
        static final /* synthetic */ int[] f66420a;

        /* renamed from: b */
        static final /* synthetic */ int[] f66421b;

        /* JADX WARNING: Can't wrap try/catch for region: R(150:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|(2:21|22)|23|(2:25|26)|27|(2:29|30)|31|(2:33|34)|35|(2:37|38)|39|(2:41|42)|43|(2:45|46)|47|(2:49|50)|51|(2:53|54)|55|(2:57|58)|59|(2:61|62)|63|(2:65|66)|67|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|123|124|125|126|127|128|129|130|131|132|133|134|135|136|137|138|139|140|141|142|143|144|145|146|(2:147|148)|149|151|152|153|154|155|156|157|158|159|160|161|162|163|164|165|166|167|168|169|170|171|172|173|174|175|176|177|178|179|180|181|182|183|184|(3:185|186|188)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(151:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|(2:21|22)|23|(2:25|26)|27|(2:29|30)|31|(2:33|34)|35|37|38|39|(2:41|42)|43|(2:45|46)|47|(2:49|50)|51|(2:53|54)|55|(2:57|58)|59|(2:61|62)|63|(2:65|66)|67|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|123|124|125|126|127|128|129|130|131|132|133|134|135|136|137|138|139|140|141|142|143|144|145|146|(2:147|148)|149|151|152|153|154|155|156|157|158|159|160|161|162|163|164|165|166|167|168|169|170|171|172|173|174|175|176|177|178|179|180|181|182|183|184|(3:185|186|188)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(152:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|(2:21|22)|23|(2:25|26)|27|(2:29|30)|31|33|34|35|37|38|39|(2:41|42)|43|(2:45|46)|47|(2:49|50)|51|(2:53|54)|55|(2:57|58)|59|(2:61|62)|63|(2:65|66)|67|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|123|124|125|126|127|128|129|130|131|132|133|134|135|136|137|138|139|140|141|142|143|144|145|146|(2:147|148)|149|151|152|153|154|155|156|157|158|159|160|161|162|163|164|165|166|167|168|169|170|171|172|173|174|175|176|177|178|179|180|181|182|183|184|(3:185|186|188)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(154:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|(2:21|22)|23|(2:25|26)|27|(2:29|30)|31|33|34|35|37|38|39|(2:41|42)|43|(2:45|46)|47|(2:49|50)|51|(2:53|54)|55|(2:57|58)|59|(2:61|62)|63|(2:65|66)|67|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|123|124|125|126|127|128|129|130|131|132|133|134|135|136|137|138|139|140|141|142|143|144|145|146|(2:147|148)|149|151|152|153|154|155|156|157|158|159|160|161|162|163|164|165|166|167|168|169|170|171|172|173|174|175|176|177|178|179|180|181|182|183|184|185|186|188) */
        /* JADX WARNING: Can't wrap try/catch for region: R(155:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|(2:21|22)|23|(2:25|26)|27|29|30|31|33|34|35|37|38|39|(2:41|42)|43|(2:45|46)|47|(2:49|50)|51|(2:53|54)|55|(2:57|58)|59|(2:61|62)|63|(2:65|66)|67|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|123|124|125|126|127|128|129|130|131|132|133|134|135|136|137|138|139|140|141|142|143|144|145|146|(2:147|148)|149|151|152|153|154|155|156|157|158|159|160|161|162|163|164|165|166|167|168|169|170|171|172|173|174|175|176|177|178|179|180|181|182|183|184|185|186|188) */
        /* JADX WARNING: Can't wrap try/catch for region: R(156:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|(2:21|22)|23|25|26|27|29|30|31|33|34|35|37|38|39|(2:41|42)|43|(2:45|46)|47|(2:49|50)|51|(2:53|54)|55|(2:57|58)|59|(2:61|62)|63|(2:65|66)|67|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|123|124|125|126|127|128|129|130|131|132|133|134|135|136|137|138|139|140|141|142|143|144|145|146|(2:147|148)|149|151|152|153|154|155|156|157|158|159|160|161|162|163|164|165|166|167|168|169|170|171|172|173|174|175|176|177|178|179|180|181|182|183|184|185|186|188) */
        /* JADX WARNING: Can't wrap try/catch for region: R(157:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|(2:21|22)|23|25|26|27|29|30|31|33|34|35|37|38|39|(2:41|42)|43|(2:45|46)|47|(2:49|50)|51|(2:53|54)|55|(2:57|58)|59|(2:61|62)|63|65|66|67|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|123|124|125|126|127|128|129|130|131|132|133|134|135|136|137|138|139|140|141|142|143|144|145|146|(2:147|148)|149|151|152|153|154|155|156|157|158|159|160|161|162|163|164|165|166|167|168|169|170|171|172|173|174|175|176|177|178|179|180|181|182|183|184|185|186|188) */
        /* JADX WARNING: Can't wrap try/catch for region: R(158:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|21|22|23|25|26|27|29|30|31|33|34|35|37|38|39|(2:41|42)|43|(2:45|46)|47|(2:49|50)|51|(2:53|54)|55|(2:57|58)|59|(2:61|62)|63|65|66|67|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|123|124|125|126|127|128|129|130|131|132|133|134|135|136|137|138|139|140|141|142|143|144|145|146|(2:147|148)|149|151|152|153|154|155|156|157|158|159|160|161|162|163|164|165|166|167|168|169|170|171|172|173|174|175|176|177|178|179|180|181|182|183|184|185|186|188) */
        /* JADX WARNING: Can't wrap try/catch for region: R(159:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|21|22|23|25|26|27|29|30|31|33|34|35|37|38|39|(2:41|42)|43|(2:45|46)|47|(2:49|50)|51|(2:53|54)|55|(2:57|58)|59|61|62|63|65|66|67|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|123|124|125|126|127|128|129|130|131|132|133|134|135|136|137|138|139|140|141|142|143|144|145|146|(2:147|148)|149|151|152|153|154|155|156|157|158|159|160|161|162|163|164|165|166|167|168|169|170|171|172|173|174|175|176|177|178|179|180|181|182|183|184|185|186|188) */
        /* JADX WARNING: Can't wrap try/catch for region: R(160:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|21|22|23|25|26|27|29|30|31|33|34|35|37|38|39|(2:41|42)|43|(2:45|46)|47|(2:49|50)|51|(2:53|54)|55|(2:57|58)|59|61|62|63|65|66|67|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|123|124|125|126|127|128|129|130|131|132|133|134|135|136|137|138|139|140|141|142|143|144|145|146|(2:147|148)|149|151|152|153|154|155|156|157|158|159|160|161|162|163|164|165|166|167|168|169|170|171|172|173|174|175|176|177|178|179|180|181|182|183|184|185|186|188) */
        /* JADX WARNING: Can't wrap try/catch for region: R(162:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|17|18|19|21|22|23|25|26|27|29|30|31|33|34|35|37|38|39|(2:41|42)|43|(2:45|46)|47|(2:49|50)|51|(2:53|54)|55|57|58|59|61|62|63|65|66|67|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|123|124|125|126|127|128|129|130|131|132|133|134|135|136|137|138|139|140|141|142|143|144|145|146|(2:147|148)|149|151|152|153|154|155|156|157|158|159|160|161|162|163|164|165|166|167|168|169|170|171|172|173|174|175|176|177|178|179|180|181|182|183|184|185|186|188) */
        /* JADX WARNING: Can't wrap try/catch for region: R(163:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|17|18|19|21|22|23|25|26|27|29|30|31|33|34|35|37|38|39|(2:41|42)|43|(2:45|46)|47|(2:49|50)|51|(2:53|54)|55|57|58|59|61|62|63|65|66|67|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|123|124|125|126|127|128|129|130|131|132|133|134|135|136|137|138|139|140|141|142|143|144|145|146|147|148|149|151|152|153|154|155|156|157|158|159|160|161|162|163|164|165|166|167|168|169|170|171|172|173|174|175|176|177|178|179|180|181|182|183|184|185|186|188) */
        /* JADX WARNING: Can't wrap try/catch for region: R(165:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|21|22|23|25|26|27|29|30|31|33|34|35|37|38|39|(2:41|42)|43|(2:45|46)|47|(2:49|50)|51|53|54|55|57|58|59|61|62|63|65|66|67|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|123|124|125|126|127|128|129|130|131|132|133|134|135|136|137|138|139|140|141|142|143|144|145|146|147|148|149|151|152|153|154|155|156|157|158|159|160|161|162|163|164|165|166|167|168|169|170|171|172|173|174|175|176|177|178|179|180|181|182|183|184|185|186|188) */
        /* JADX WARNING: Can't wrap try/catch for region: R(167:0|(2:1|2)|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|25|26|27|29|30|31|33|34|35|37|38|39|(2:41|42)|43|(2:45|46)|47|49|50|51|53|54|55|57|58|59|61|62|63|65|66|67|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|123|124|125|126|127|128|129|130|131|132|133|134|135|136|137|138|139|140|141|142|143|144|145|146|147|148|149|151|152|153|154|155|156|157|158|159|160|161|162|163|164|165|166|167|168|169|170|171|172|173|174|175|176|177|178|179|180|181|182|183|184|185|186|188) */
        /* JADX WARNING: Can't wrap try/catch for region: R(169:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|25|26|27|29|30|31|33|34|35|37|38|39|(2:41|42)|43|45|46|47|49|50|51|53|54|55|57|58|59|61|62|63|65|66|67|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|123|124|125|126|127|128|129|130|131|132|133|134|135|136|137|138|139|140|141|142|143|144|145|146|147|148|149|151|152|153|154|155|156|157|158|159|160|161|162|163|164|165|166|167|168|169|170|171|172|173|174|175|176|177|178|179|180|181|182|183|184|185|186|188) */
        /* JADX WARNING: Can't wrap try/catch for region: R(170:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|25|26|27|29|30|31|33|34|35|37|38|39|41|42|43|45|46|47|49|50|51|53|54|55|57|58|59|61|62|63|65|66|67|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|123|124|125|126|127|128|129|130|131|132|133|134|135|136|137|138|139|140|141|142|143|144|145|146|147|148|149|151|152|153|154|155|156|157|158|159|160|161|162|163|164|165|166|167|168|169|170|171|172|173|174|175|176|177|178|179|180|181|182|183|184|185|186|188) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:101:0x0196 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:103:0x01a2 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:105:0x01ae */
        /* JADX WARNING: Missing exception handler attribute for start block: B:107:0x01ba */
        /* JADX WARNING: Missing exception handler attribute for start block: B:109:0x01c6 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:111:0x01d2 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:113:0x01de */
        /* JADX WARNING: Missing exception handler attribute for start block: B:115:0x01ea */
        /* JADX WARNING: Missing exception handler attribute for start block: B:117:0x01f6 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:119:0x0202 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:121:0x020e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:123:0x021a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:125:0x0226 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:127:0x0232 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:129:0x023e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:131:0x024a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:133:0x0256 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:135:0x0262 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:137:0x026e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:139:0x027a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:141:0x0286 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:143:0x0292 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:145:0x029e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:147:0x02aa */
        /* JADX WARNING: Missing exception handler attribute for start block: B:153:0x02c7 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:155:0x02d1 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:157:0x02db */
        /* JADX WARNING: Missing exception handler attribute for start block: B:159:0x02e5 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:161:0x02ef */
        /* JADX WARNING: Missing exception handler attribute for start block: B:163:0x02f9 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:165:0x0303 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:167:0x030d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:169:0x0317 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:171:0x0321 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:173:0x032b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:175:0x0335 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:177:0x033f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:179:0x0349 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:181:0x0353 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:183:0x035f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:185:0x0369 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:71:0x00e2 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:73:0x00ee */
        /* JADX WARNING: Missing exception handler attribute for start block: B:75:0x00fa */
        /* JADX WARNING: Missing exception handler attribute for start block: B:77:0x0106 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:79:0x0112 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:81:0x011e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:83:0x012a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:85:0x0136 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:87:0x0142 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:89:0x014e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:91:0x015a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:93:0x0166 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:95:0x0172 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:97:0x017e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:99:0x018a */
        static {
            /*
            // Method dump skipped, instructions count: 884
            */
            throw new UnsupportedOperationException("Method not decompiled: com.lynx.component.svg.p2042a.C28311i.C283121.<clinit>():void");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.lynx.component.svg.a.i$b */
    public enum EnumC28314b {
        clip,
        clip_path,
        clipPathUnits,
        clip_rule,
        f66471e,
        cx,
        cy,
        direction,
        dx,
        dy,
        fx,
        fy,
        d,
        display,
        fill,
        fill_rule,
        fill_opacity,
        gradientTransform,
        gradientUnits,
        height,
        href,
        image_rendering,
        offset,
        opacity,
        orient,
        overflow,
        pathLength,
        patternContentUnits,
        patternTransform,
        patternUnits,
        points,
        preserveAspectRatio,
        r,
        refX,
        refY,
        rx,
        ry,
        solid_color,
        solid_opacity,
        spreadMethod,
        startOffset,
        stop_color,
        stop_opacity,
        stroke,
        stroke_dasharray,
        stroke_dashoffset,
        stroke_linecap,
        stroke_linejoin,
        stroke_miterlimit,
        stroke_opacity,
        stroke_width,
        style,
        transform,
        f66451ab,
        vector_effect,
        version,
        viewBox,
        width,
        x,
        y,
        x1,
        y1,
        x2,
        y2,
        viewport_fill,
        viewport_fill_opacity,
        visibility,
        UNSUPPORTED;
        

        /* renamed from: aq */
        private static final Map<String, EnumC28314b> f66466aq = new HashMap();

        static {
            Covode.recordClassIndex(34272);
            EnumC28314b[] values = values();
            for (EnumC28314b bVar : values) {
                if (bVar != UNSUPPORTED) {
                    f66466aq.put(bVar.name().replace('_', '-'), bVar);
                }
            }
        }

        /* renamed from: a */
        public static EnumC28314b m56614a(String str) {
            EnumC28314b bVar = f66466aq.get(str);
            if (bVar != null) {
                return bVar;
            }
            return UNSUPPORTED;
        }
    }

    /* renamed from: a */
    private static C28257f.C28293o m56570a(C28316d dVar) {
        if (dVar.mo48369a("auto")) {
            return new C28257f.C28293o();
        }
        return dVar.mo48375g();
    }

    /* renamed from: d */
    private static float m56597d(String str) {
        int length = str.length();
        if (length != 0) {
            return m56569a(str, length);
        }
        throw new C28310h("Invalid float value (empty string)");
    }

    /* renamed from: e */
    private static Float m56598e(String str) {
        try {
            float d = m56597d(str);
            if (d < 0.0f) {
                d = 0.0f;
            } else if (d > 1.0f) {
                d = 1.0f;
            }
            return Float.valueOf(d);
        } catch (C28310h unused) {
            return null;
        }
    }

    /* renamed from: h */
    private static C28257f.AbstractC28274aj m56601h(String str) {
        str.hashCode();
        if (str.equals("none")) {
            return C28257f.C28283e.f66336c;
        }
        if (str.equals("currentColor")) {
            return C28257f.C28284f.f66338a;
        }
        try {
            return m56602i(str);
        } catch (C28310h unused) {
            return null;
        }
    }

    /* renamed from: i */
    private static C28257f.C28283e m56602i(String str) {
        try {
            return new C28257f.C28283e(ColorUtils.m57910a(str));
        } catch (Exception e) {
            throw new C28310h(e.toString());
        }
    }

    /* renamed from: j */
    private static C28257f.C28261ab.EnumC28262a m56603j(String str) {
        if ("nonzero".equals(str)) {
            return C28257f.C28261ab.EnumC28262a.NonZero;
        }
        if ("evenodd".equals(str)) {
            return C28257f.C28261ab.EnumC28262a.EvenOdd;
        }
        return null;
    }

    /* renamed from: p */
    private static C28257f.C28261ab.EnumC28266e m56609p(String str) {
        str.hashCode();
        if (str.equals("none")) {
            return C28257f.C28261ab.EnumC28266e.None;
        }
        if (!str.equals("non-scaling-stroke")) {
            return null;
        }
        return C28257f.C28261ab.EnumC28266e.NonScalingStroke;
    }

    /* renamed from: k */
    private static C28257f.C28261ab.EnumC28263b m56604k(String str) {
        if ("butt".equals(str)) {
            return C28257f.C28261ab.EnumC28263b.Butt;
        }
        if ("round".equals(str)) {
            return C28257f.C28261ab.EnumC28263b.Round;
        }
        if ("square".equals(str)) {
            return C28257f.C28261ab.EnumC28263b.Square;
        }
        return null;
    }

    /* renamed from: l */
    private static C28257f.C28261ab.EnumC28264c m56605l(String str) {
        if ("miter".equals(str)) {
            return C28257f.C28261ab.EnumC28264c.Miter;
        }
        if ("round".equals(str)) {
            return C28257f.C28261ab.EnumC28264c.Round;
        }
        if ("bevel".equals(str)) {
            return C28257f.C28261ab.EnumC28264c.Bevel;
        }
        return null;
    }

    /* renamed from: q */
    private static C28257f.C28261ab.EnumC28265d m56610q(String str) {
        str.hashCode();
        switch (str.hashCode()) {
            case -933002398:
                if (!str.equals("optimizeQuality")) {
                    return null;
                }
                return C28257f.C28261ab.EnumC28265d.optimizeQuality;
            case 3005871:
                if (!str.equals("auto")) {
                    return null;
                }
                return C28257f.C28261ab.EnumC28265d.auto;
            case 362741610:
                if (!str.equals("optimizeSpeed")) {
                    return null;
                }
                return C28257f.C28261ab.EnumC28265d.optimizeSpeed;
            default:
                return null;
        }
    }

    /* renamed from: r */
    private static String m56611r(String str) {
        if (str.equals("none") || !str.startsWith("url(")) {
            return null;
        }
        if (str.endsWith(")")) {
            return str.substring(4, str.length() - 1).trim();
        }
        return str.substring(4).trim();
    }

    /* renamed from: a */
    private static Float m56571a(String str) {
        if (str.length() != 0) {
            int length = str.length();
            boolean z = false;
            if (str.charAt(str.length() - 1) == '%') {
                length--;
                z = true;
            }
            try {
                float a = m56569a(str, length);
                float f = 100.0f;
                if (z) {
                    a /= 100.0f;
                }
                if (a < 0.0f) {
                    f = 0.0f;
                } else if (a <= 100.0f) {
                    f = a;
                }
                return Float.valueOf(f);
            } catch (NumberFormatException e) {
                throw new C28310h("Invalid offset value in <stop>: ".concat(String.valueOf(str)), e);
            }
        } else {
            throw new C28310h("Invalid offset value in <stop> (empty string)");
        }
    }

    /* renamed from: f */
    private static C28253d m56599f(String str) {
        C28316d dVar = new C28316d(str);
        dVar.mo48370b();
        String i = dVar.mo48377i();
        if ("defer".equals(i)) {
            dVar.mo48370b();
            i = dVar.mo48377i();
        }
        C28253d.EnumC28254a a = C28313a.m56613a(i);
        C28253d.EnumC28255b bVar = null;
        dVar.mo48370b();
        if (!dVar.mo48367a()) {
            String i2 = dVar.mo48377i();
            i2.hashCode();
            if (i2.equals("meet")) {
                bVar = C28253d.EnumC28255b.meet;
            } else if (!i2.equals("slice")) {
                throw new C28310h("Invalid preserveAspectRatio definition: ".concat(String.valueOf(str)));
            } else {
                bVar = C28253d.EnumC28255b.slice;
            }
        }
        return new C28253d(a, bVar);
    }

    /* renamed from: g */
    private static C28257f.AbstractC28274aj m56600g(String str) {
        if (!str.startsWith("url(")) {
            return m56601h(str);
        }
        int indexOf = str.indexOf(")");
        C28257f.AbstractC28274aj ajVar = null;
        if (indexOf == -1) {
            return new C28257f.C28296r(str.substring(4).trim(), null);
        }
        String trim = str.substring(4, indexOf).trim();
        String trim2 = str.substring(indexOf + 1).trim();
        if (trim2.length() > 0) {
            ajVar = m56601h(trim2);
        }
        return new C28257f.C28296r(trim, ajVar);
    }

    /* renamed from: m */
    private static C28257f.C28293o[] m56606m(String str) {
        C28257f.C28293o g;
        C28316d dVar = new C28316d(str);
        dVar.mo48370b();
        if (dVar.mo48367a() || (g = dVar.mo48375g()) == null || g.mo48347b()) {
            return null;
        }
        float f = g.f66360a;
        ArrayList arrayList = new ArrayList();
        arrayList.add(g);
        while (!dVar.mo48367a()) {
            dVar.mo48371c();
            C28257f.C28293o g2 = dVar.mo48375g();
            if (g2 == null || g2.mo48347b()) {
                return null;
            }
            arrayList.add(g2);
            f += g2.f66360a;
        }
        if (f == 0.0f) {
            return null;
        }
        return (C28257f.C28293o[]) arrayList.toArray(new C28257f.C28293o[arrayList.size()]);
    }

    /* renamed from: n */
    private static Boolean m56607n(String str) {
        str.hashCode();
        switch (str.hashCode()) {
            case -1217487446:
                if (!str.equals("hidden")) {
                    return null;
                }
                return Boolean.FALSE;
            case -907680051:
                if (!str.equals("scroll")) {
                    return null;
                }
                return Boolean.FALSE;
            case 3005871:
                if (!str.equals("auto")) {
                    return null;
                }
                return Boolean.TRUE;
            case 466743410:
                if (!str.equals("visible")) {
                    return null;
                }
                return Boolean.TRUE;
            default:
                return null;
        }
    }

    /* renamed from: o */
    private static C28257f.C28280b m56608o(String str) {
        if ("auto".equals(str) || !str.startsWith("rect(")) {
            return null;
        }
        C28316d dVar = new C28316d(str.substring(5));
        dVar.mo48370b();
        C28257f.C28293o a = m56570a(dVar);
        dVar.mo48371c();
        C28257f.C28293o a2 = m56570a(dVar);
        dVar.mo48371c();
        C28257f.C28293o a3 = m56570a(dVar);
        dVar.mo48371c();
        C28257f.C28293o a4 = m56570a(dVar);
        dVar.mo48370b();
        if (dVar.mo48368a(')') || dVar.mo48367a()) {
            return new C28257f.C28280b(a, a2, a3, a4);
        }
        return null;
    }

    /* renamed from: c */
    private static C28257f.C28293o m56596c(String str) {
        if (str.length() != 0) {
            int length = str.length();
            C28257f.EnumC28278an anVar = C28257f.EnumC28278an.px;
            char charAt = str.charAt(length - 1);
            if (charAt == '%') {
                length--;
                anVar = C28257f.EnumC28278an.percent;
            } else {
                if (str.endsWith("rpx")) {
                    anVar = C28257f.EnumC28278an.rpx;
                } else if (str.endsWith("rem")) {
                    anVar = C28257f.EnumC28278an.rem;
                } else if (length > 2 && Character.isLetter(charAt) && Character.isLetter(str.charAt(length - 2))) {
                    length -= 2;
                    try {
                        anVar = C28257f.EnumC28278an.valueOf(str.substring(length).toLowerCase(Locale.US));
                    } catch (IllegalArgumentException unused) {
                        throw new C28310h("Invalid length unit specifier: ".concat(String.valueOf(str)));
                    }
                }
                length -= 3;
            }
            try {
                return new C28257f.C28293o(m56569a(str, length), anVar);
            } catch (NumberFormatException e) {
                throw new C28310h("Invalid length value: ".concat(String.valueOf(str)), e);
            }
        } else {
            throw new C28310h("Invalid length value (empty string)");
        }
    }

    /* renamed from: b */
    private static Matrix m56593b(String str) {
        Matrix matrix = new Matrix();
        C28316d dVar = new C28316d(str);
        dVar.mo48370b();
        while (!dVar.mo48367a()) {
            String j = dVar.mo48378j();
            if (j != null) {
                j.hashCode();
                char c = 65535;
                switch (j.hashCode()) {
                    case -1081239615:
                        if (j.equals("matrix")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -925180581:
                        if (j.equals("rotate")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 109250890:
                        if (j.equals("scale")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 109493390:
                        if (j.equals("skewX")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 109493391:
                        if (j.equals("skewY")) {
                            c = 4;
                            break;
                        }
                        break;
                    case 1052832078:
                        if (j.equals("translate")) {
                            c = 5;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        dVar.mo48370b();
                        float d = dVar.mo48372d();
                        dVar.mo48371c();
                        float d2 = dVar.mo48372d();
                        dVar.mo48371c();
                        float d3 = dVar.mo48372d();
                        dVar.mo48371c();
                        float d4 = dVar.mo48372d();
                        dVar.mo48371c();
                        float d5 = dVar.mo48372d();
                        dVar.mo48371c();
                        float d6 = dVar.mo48372d();
                        dVar.mo48370b();
                        if (!Float.isNaN(d6) && dVar.mo48368a(')')) {
                            Matrix matrix2 = new Matrix();
                            matrix2.setValues(new float[]{d, d3, d5, d2, d4, d6, 0.0f, 0.0f, 1.0f});
                            matrix.preConcat(matrix2);
                            break;
                        } else {
                            throw new C28310h("Invalid transform list: ".concat(String.valueOf(str)));
                        }
                        break;
                    case 1:
                        dVar.mo48370b();
                        float d7 = dVar.mo48372d();
                        float e = dVar.mo48373e();
                        float e2 = dVar.mo48373e();
                        dVar.mo48370b();
                        if (Float.isNaN(d7) || !dVar.mo48368a(')')) {
                            throw new C28310h("Invalid transform list: ".concat(String.valueOf(str)));
                        } else if (Float.isNaN(e)) {
                            matrix.preRotate(d7);
                            break;
                        } else if (!Float.isNaN(e2)) {
                            matrix.preRotate(d7, e, e2);
                            break;
                        } else {
                            throw new C28310h("Invalid transform list: ".concat(String.valueOf(str)));
                        }
                        break;
                    case 2:
                        dVar.mo48370b();
                        float d8 = dVar.mo48372d();
                        float e3 = dVar.mo48373e();
                        dVar.mo48370b();
                        if (!Float.isNaN(d8) && dVar.mo48368a(')')) {
                            if (!Float.isNaN(e3)) {
                                matrix.preScale(d8, e3);
                                break;
                            } else {
                                matrix.preScale(d8, d8);
                                break;
                            }
                        } else {
                            throw new C28310h("Invalid transform list: ".concat(String.valueOf(str)));
                        }
                        break;
                    case 3:
                        dVar.mo48370b();
                        float d9 = dVar.mo48372d();
                        dVar.mo48370b();
                        if (!Float.isNaN(d9) && dVar.mo48368a(')')) {
                            matrix.preSkew((float) Math.tan(Math.toRadians((double) d9)), 0.0f);
                            break;
                        } else {
                            throw new C28310h("Invalid transform list: ".concat(String.valueOf(str)));
                        }
                    case 4:
                        dVar.mo48370b();
                        float d10 = dVar.mo48372d();
                        dVar.mo48370b();
                        if (!Float.isNaN(d10) && dVar.mo48368a(')')) {
                            matrix.preSkew(0.0f, (float) Math.tan(Math.toRadians((double) d10)));
                            break;
                        } else {
                            throw new C28310h("Invalid transform list: ".concat(String.valueOf(str)));
                        }
                    case ABRConfig.ABR_STARTUP_MODEL_KEY:
                        dVar.mo48370b();
                        float d11 = dVar.mo48372d();
                        float e4 = dVar.mo48373e();
                        dVar.mo48370b();
                        if (!Float.isNaN(d11) && dVar.mo48368a(')')) {
                            if (!Float.isNaN(e4)) {
                                matrix.preTranslate(d11, e4);
                                break;
                            } else {
                                matrix.preTranslate(d11, 0.0f);
                                break;
                            }
                        } else {
                            throw new C28310h("Invalid transform list: ".concat(String.valueOf(str)));
                        }
                        break;
                    default:
                        throw new C28310h("Invalid transform list fn: " + j + ")");
                }
                if (dVar.mo48367a()) {
                    return matrix;
                }
                dVar.mo48371c();
            } else {
                throw new C28310h("Bad transform function encountered in transform list: ".concat(String.valueOf(str)));
            }
        }
        return matrix;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:201:0x041e, code lost:
        continue;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m56595b(java.io.InputStream r13) {
        /*
        // Method dump skipped, instructions count: 1264
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.component.svg.p2042a.C28311i.m56595b(java.io.InputStream):void");
    }

    /* renamed from: a */
    private static void m56577a(C28257f.AbstractC28275ak akVar, String str) {
        akVar.f66303q = m56599f(str);
    }

    /* renamed from: a */
    private static void m56592a(String str, Object... objArr) {
        LLog.m56856a(3, "SVGParser", C1764a.m5928a(str, objArr));
    }

    /* renamed from: a */
    private static float m56569a(String str, int i) {
        float a = new C28252c().mo48324a(str, 0, i);
        if (!Float.isNaN(a)) {
            return a;
        }
        throw new C28310h("Invalid float value: ".concat(String.valueOf(str)));
    }

    /* renamed from: a */
    private static void m56572a(C28257f.C28260aa aaVar, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            if (C283121.f66421b[EnumC28314b.m56614a(attributes.getLocalName(i)).ordinal()] == 24) {
                aaVar.f66252a = m56571a(trim);
            }
        }
    }

    /* renamed from: a */
    private static void m56574a(C28257f.C28267ac acVar, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int i2 = C283121.f66421b[EnumC28314b.m56614a(attributes.getLocalName(i)).ordinal()];
            if (i2 == 1) {
                acVar.f66286a = m56596c(trim);
            } else if (i2 == 2) {
                acVar.f66287b = m56596c(trim);
            } else if (i2 == 3) {
                acVar.f66288c = m56596c(trim);
                if (acVar.f66288c.mo48347b()) {
                    throw new C28310h("Invalid <svg> element. width cannot be negative");
                }
            } else if (i2 == 4) {
                acVar.f66289d = m56596c(trim);
                if (acVar.f66289d.mo48347b()) {
                    throw new C28310h("Invalid <svg> element. height cannot be negative");
                }
            } else if (i2 == 5) {
                acVar.f66290e = trim;
            }
        }
    }

    /* renamed from: b */
    private static void m56594b(C28257f.AbstractC28271ag agVar, Attributes attributes) {
        int i;
        for (int i2 = 0; i2 < attributes.getLength(); i2++) {
            String trim = attributes.getValue(i2).trim();
            if (trim.length() != 0) {
                if (C283121.f66421b[EnumC28314b.m56614a(attributes.getLocalName(i2)).ordinal()] == 29) {
                    C28249a.C28250a aVar = new C28249a.C28250a(trim.replaceAll("/\\*.*?\\*/", ""));
                    while (!aVar.mo48367a()) {
                        aVar.mo48370b();
                        if (aVar.mo48367a()) {
                            i = aVar.f66515b;
                        } else {
                            int i3 = aVar.f66515b;
                            i = aVar.f66515b;
                            int charAt = aVar.f66514a.charAt(aVar.f66515b);
                            if (charAt == 45) {
                                charAt = aVar.mo48376h();
                            }
                            if ((charAt >= 65 && charAt <= 90) || ((charAt >= 97 && charAt <= 122) || charAt == 95)) {
                                int h = aVar.mo48376h();
                                while (true) {
                                    if ((h < 65 || h > 90) && ((h < 97 || h > 122) && !((h >= 48 && h <= 57) || h == 45 || h == 95))) {
                                        break;
                                    }
                                    h = aVar.mo48376h();
                                }
                                i = aVar.f66515b;
                            }
                            aVar.f66515b = i3;
                        }
                        String str = null;
                        if (i != aVar.f66515b) {
                            str = aVar.f66514a.substring(aVar.f66515b, i);
                            aVar.f66515b = i;
                        }
                        aVar.mo48370b();
                        if (!aVar.mo48368a(';')) {
                            if (!aVar.mo48368a(':')) {
                                break;
                            }
                            aVar.mo48370b();
                            if (!aVar.mo48367a()) {
                                int i4 = aVar.f66515b;
                                int i5 = aVar.f66515b;
                                int charAt2 = aVar.f66514a.charAt(aVar.f66515b);
                                while (charAt2 != -1 && charAt2 != 59 && charAt2 != 125 && charAt2 != 33 && charAt2 != 10 && charAt2 != 13) {
                                    if (!C28249a.C28250a.m56616a(charAt2)) {
                                        i5 = aVar.f66515b + 1;
                                    }
                                    charAt2 = aVar.mo48376h();
                                }
                                if (aVar.f66515b > i4) {
                                    String substring = aVar.f66514a.substring(i4, i5);
                                    if (substring != null) {
                                        aVar.mo48370b();
                                        if (aVar.mo48367a() || aVar.mo48368a(';')) {
                                            if (agVar.f66296n == null) {
                                                agVar.f66296n = new C28257f.C28261ab();
                                            }
                                            m56573a(agVar.f66296n, str, substring);
                                            aVar.mo48370b();
                                        }
                                    }
                                } else {
                                    aVar.f66515b = i4;
                                }
                            }
                        }
                    }
                } else {
                    if (agVar.f66295m == null) {
                        agVar.f66295m = new C28257f.C28261ab();
                    }
                    m56573a(agVar.f66295m, attributes.getLocalName(i2), attributes.getValue(i2).trim());
                }
            }
        }
    }

    /* renamed from: a */
    private static void m56575a(C28257f.AbstractC28271ag agVar, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String qName = attributes.getQName(i);
            if (qName.equals("id") || qName.equals("xml:id")) {
                agVar.f66293k = attributes.getValue(i).trim();
                return;
            } else if (qName.equals("xml:space")) {
                String trim = attributes.getValue(i).trim();
                if ("default".equals(trim)) {
                    agVar.f66294l = Boolean.FALSE;
                    return;
                } else if ("preserve".equals(trim)) {
                    agVar.f66294l = Boolean.TRUE;
                    return;
                } else {
                    throw new C28310h("Invalid value for \"xml:space\" attribute: ".concat(String.valueOf(trim)));
                }
            }
        }
    }

    /* renamed from: a */
    private static void m56573a(C28257f.C28261ab abVar, String str, String str2) {
        if (str2.length() != 0 && !str2.equals("inherit")) {
            switch (C283121.f66421b[EnumC28314b.m56614a(str).ordinal()]) {
                case 30:
                    abVar.f66256b = m56600g(str2);
                    if (abVar.f66256b != null) {
                        abVar.f66255a |= 1;
                        return;
                    }
                    return;
                case 31:
                    abVar.f66257c = m56603j(str2);
                    if (abVar.f66257c != null) {
                        abVar.f66255a |= 2;
                        return;
                    }
                    return;
                case 32:
                    abVar.f66258d = m56598e(str2);
                    if (abVar.f66258d != null) {
                        abVar.f66255a |= 4;
                        return;
                    }
                    return;
                case 33:
                    abVar.f66259e = m56600g(str2);
                    if (abVar.f66259e != null) {
                        abVar.f66255a |= 8;
                        return;
                    }
                    return;
                case 34:
                    abVar.f66260f = m56598e(str2);
                    if (abVar.f66260f != null) {
                        abVar.f66255a |= 16;
                        return;
                    }
                    return;
                case 35:
                    try {
                        abVar.f66261g = m56596c(str2);
                        abVar.f66255a |= 32;
                        return;
                    } catch (C28310h unused) {
                        return;
                    }
                case 36:
                    abVar.f66262h = m56604k(str2);
                    if (abVar.f66262h != null) {
                        abVar.f66255a |= 64;
                        return;
                    }
                    return;
                case 37:
                    abVar.f66263i = m56605l(str2);
                    if (abVar.f66263i != null) {
                        abVar.f66255a |= 128;
                        return;
                    }
                    return;
                case 38:
                    try {
                        abVar.f66264j = Float.valueOf(m56597d(str2));
                        abVar.f66255a |= 256;
                        return;
                    } catch (C28310h unused2) {
                        return;
                    }
                case 39:
                    if ("none".equals(str2)) {
                        abVar.f66265k = null;
                        abVar.f66255a |= 512;
                        return;
                    }
                    abVar.f66265k = m56606m(str2);
                    if (abVar.f66265k != null) {
                        abVar.f66255a |= 512;
                        return;
                    }
                    return;
                case 40:
                    try {
                        abVar.f66266l = m56596c(str2);
                        abVar.f66255a |= 1024;
                        return;
                    } catch (C28310h unused3) {
                        return;
                    }
                case 41:
                    abVar.f66267m = m56598e(str2);
                    abVar.f66255a |= 2048;
                    return;
                case 42:
                    try {
                        abVar.f66268n = m56602i(str2);
                        abVar.f66255a |= 4096;
                        return;
                    } catch (C28310h unused4) {
                        return;
                    }
                case 43:
                    abVar.f66269o = m56607n(str2);
                    if (abVar.f66269o != null) {
                        abVar.f66255a |= 524288;
                        return;
                    }
                    return;
                case BuildConfig.VERSION_CODE:
                    if (str2.indexOf(124) < 0 && "|inline|block|list-item|run-in|compact|marker|table|inline-table|table-row-group|table-header-group|table-footer-group|table-row|table-column-group|table-column|table-cell|table-caption|none|".contains("|" + str2 + '|')) {
                        abVar.f66271q = Boolean.valueOf(!str2.equals("none"));
                        abVar.f66255a |= 16777216;
                        return;
                    }
                    return;
                case 45:
                    if (str2.indexOf(124) < 0 && "|visible|hidden|collapse|".contains("|" + str2 + '|')) {
                        abVar.f66272r = Boolean.valueOf(str2.equals("visible"));
                        abVar.f66255a |= 33554432;
                        return;
                    }
                    return;
                case 46:
                    if (str2.equals("currentColor")) {
                        abVar.f66273s = C28257f.C28284f.f66338a;
                    } else {
                        try {
                            abVar.f66273s = m56602i(str2);
                        } catch (C28310h e) {
                            e.getMessage();
                            return;
                        }
                    }
                    abVar.f66255a |= 67108864;
                    return;
                case 47:
                    abVar.f66274t = m56598e(str2);
                    abVar.f66255a |= 134217728;
                    return;
                case 48:
                    abVar.f66270p = m56608o(str2);
                    if (abVar.f66270p != null) {
                        abVar.f66255a |= 1048576;
                        return;
                    }
                    return;
                case 49:
                    abVar.f66275u = m56611r(str2);
                    abVar.f66255a |= 268435456;
                    return;
                case 50:
                    abVar.f66276v = m56603j(str2);
                    abVar.f66255a |= 536870912;
                    return;
                case 51:
                    if (str2.equals("currentColor")) {
                        abVar.f66277w = C28257f.C28284f.f66338a;
                    } else {
                        try {
                            abVar.f66277w = m56602i(str2);
                        } catch (C28310h e2) {
                            e2.getMessage();
                            return;
                        }
                    }
                    abVar.f66255a |= 2147483648L;
                    return;
                case 52:
                    abVar.f66278x = m56598e(str2);
                    abVar.f66255a |= 4294967296L;
                    return;
                case 53:
                    if (str2.equals("currentColor")) {
                        abVar.f66279y = C28257f.C28284f.f66338a;
                    } else {
                        try {
                            abVar.f66279y = m56602i(str2);
                        } catch (C28310h e3) {
                            e3.getMessage();
                            return;
                        }
                    }
                    abVar.f66255a |= 8589934592L;
                    return;
                case 54:
                    abVar.f66280z = m56598e(str2);
                    abVar.f66255a |= 17179869184L;
                    return;
                case 55:
                    abVar.f66253A = m56609p(str2);
                    if (abVar.f66253A != null) {
                        abVar.f66255a |= 34359738368L;
                        return;
                    }
                    return;
                case 56:
                    abVar.f66254B = m56610q(str2);
                    if (abVar.f66254B != null) {
                        abVar.f66255a |= 137438953472L;
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }
}
