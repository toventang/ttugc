package com.lynx.component.svg.p2042a;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.lynx.component.svg.C28321d;
import com.lynx.tasm.utils.C28930n;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.lynx.component.svg.a.f */
public final class C28257f {

    /* renamed from: a */
    public C28267ac f66242a;

    /* renamed from: b */
    public String f66243b = "";

    /* renamed from: c */
    public float f66244c = 96.0f;

    /* renamed from: d */
    public C28256e f66245d;

    /* renamed from: e */
    private Map<String, AbstractC28271ag> f66246e = new HashMap();

    /* access modifiers changed from: package-private */
    /* renamed from: com.lynx.component.svg.a.f$ae */
    public interface AbstractC28269ae {
        static {
            Covode.recordClassIndex(34227);
        }

        /* renamed from: a */
        void mo48336a(C28273ai aiVar);

        /* renamed from: b */
        List<C28273ai> mo48337b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.lynx.component.svg.a.f$m */
    public interface AbstractC28291m {
        static {
            Covode.recordClassIndex(34249);
        }

        /* renamed from: a */
        void mo48342a(Matrix matrix);
    }

    /* renamed from: com.lynx.component.svg.a.f$q */
    interface AbstractC28295q {
        static {
            Covode.recordClassIndex(34253);
        }
    }

    /* renamed from: com.lynx.component.svg.a.f$u */
    interface AbstractC28299u {
        static {
            Covode.recordClassIndex(34257);
        }

        /* renamed from: a */
        void mo48352a();

        /* renamed from: a */
        void mo48354a(float f, float f2);

        /* renamed from: a */
        void mo48355a(float f, float f2, float f3, float f4);

        /* renamed from: a */
        void mo48356a(float f, float f2, float f3, float f4, float f5, float f6);

        /* renamed from: a */
        void mo48357a(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5);

        /* renamed from: b */
        void mo48359b(float f, float f2);
    }

    static {
        Covode.recordClassIndex(34215);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.lynx.component.svg.a.f$aa */
    public static class C28260aa extends AbstractC28271ag implements AbstractC28269ae {

        /* renamed from: a */
        Float f66252a;

        static {
            Covode.recordClassIndex(34218);
        }

        /* access modifiers changed from: package-private */
        @Override // com.lynx.component.svg.p2042a.C28257f.C28273ai
        /* renamed from: a */
        public final String mo48335a() {
            return "stop";
        }

        @Override // com.lynx.component.svg.p2042a.C28257f.AbstractC28269ae
        /* renamed from: a */
        public final void mo48336a(C28273ai aiVar) {
        }

        C28260aa() {
        }

        @Override // com.lynx.component.svg.p2042a.C28257f.AbstractC28269ae
        /* renamed from: b */
        public final List<C28273ai> mo48337b() {
            return Collections.emptyList();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.lynx.component.svg.a.f$ab */
    public static class C28261ab implements Cloneable {

        /* renamed from: A */
        EnumC28266e f66253A;

        /* renamed from: B */
        EnumC28265d f66254B;

        /* renamed from: a */
        long f66255a;

        /* renamed from: b */
        AbstractC28274aj f66256b;

        /* renamed from: c */
        EnumC28262a f66257c;

        /* renamed from: d */
        Float f66258d;

        /* renamed from: e */
        AbstractC28274aj f66259e;

        /* renamed from: f */
        Float f66260f;

        /* renamed from: g */
        C28293o f66261g;

        /* renamed from: h */
        EnumC28263b f66262h;

        /* renamed from: i */
        EnumC28264c f66263i;

        /* renamed from: j */
        Float f66264j;

        /* renamed from: k */
        C28293o[] f66265k;

        /* renamed from: l */
        C28293o f66266l;

        /* renamed from: m */
        Float f66267m;

        /* renamed from: n */
        C28283e f66268n;

        /* renamed from: o */
        Boolean f66269o;

        /* renamed from: p */
        C28280b f66270p;

        /* renamed from: q */
        Boolean f66271q;

        /* renamed from: r */
        Boolean f66272r;

        /* renamed from: s */
        AbstractC28274aj f66273s;

        /* renamed from: t */
        Float f66274t;

        /* renamed from: u */
        String f66275u;

        /* renamed from: v */
        EnumC28262a f66276v;

        /* renamed from: w */
        AbstractC28274aj f66277w;

        /* renamed from: x */
        Float f66278x;

        /* renamed from: y */
        AbstractC28274aj f66279y;

        /* renamed from: z */
        Float f66280z;

        static {
            Covode.recordClassIndex(34219);
        }

        C28261ab() {
        }

        /* access modifiers changed from: protected */
        @Override // java.lang.Object
        public final Object clone() {
            C28261ab abVar = (C28261ab) super.clone();
            C28293o[] oVarArr = this.f66265k;
            if (oVarArr != null) {
                abVar.f66265k = (C28293o[]) oVarArr.clone();
            }
            return abVar;
        }

        /* renamed from: com.lynx.component.svg.a.f$ab$a */
        public enum EnumC28262a {
            NonZero,
            EvenOdd;

            static {
                Covode.recordClassIndex(34220);
            }
        }

        /* renamed from: com.lynx.component.svg.a.f$ab$b */
        public enum EnumC28263b {
            Butt,
            Round,
            Square;

            static {
                Covode.recordClassIndex(34221);
            }
        }

        /* renamed from: com.lynx.component.svg.a.f$ab$c */
        public enum EnumC28264c {
            Miter,
            Round,
            Bevel;

            static {
                Covode.recordClassIndex(34222);
            }
        }

        /* renamed from: com.lynx.component.svg.a.f$ab$d */
        public enum EnumC28265d {
            auto,
            optimizeQuality,
            optimizeSpeed;

            static {
                Covode.recordClassIndex(34223);
            }
        }

        /* renamed from: com.lynx.component.svg.a.f$ab$e */
        public enum EnumC28266e {
            None,
            NonScalingStroke;

            static {
                Covode.recordClassIndex(34224);
            }
        }

        /* renamed from: a */
        static C28261ab m56445a() {
            C28261ab abVar = new C28261ab();
            abVar.f66255a = -1;
            abVar.f66256b = C28283e.f66335b;
            abVar.f66257c = EnumC28262a.NonZero;
            Float valueOf = Float.valueOf(1.0f);
            abVar.f66258d = valueOf;
            abVar.f66259e = null;
            abVar.f66260f = valueOf;
            abVar.f66261g = new C28293o();
            abVar.f66262h = EnumC28263b.Butt;
            abVar.f66263i = EnumC28264c.Miter;
            abVar.f66264j = Float.valueOf(4.0f);
            abVar.f66265k = null;
            abVar.f66266l = new C28293o();
            abVar.f66267m = valueOf;
            abVar.f66268n = C28283e.f66335b;
            abVar.f66269o = true;
            abVar.f66270p = null;
            abVar.f66271q = Boolean.TRUE;
            abVar.f66272r = Boolean.TRUE;
            abVar.f66273s = C28283e.f66335b;
            abVar.f66274t = valueOf;
            abVar.f66275u = null;
            abVar.f66276v = EnumC28262a.NonZero;
            abVar.f66277w = null;
            abVar.f66278x = valueOf;
            abVar.f66279y = null;
            abVar.f66280z = valueOf;
            abVar.f66253A = EnumC28266e.None;
            abVar.f66254B = EnumC28265d.auto;
            return abVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo48338a(boolean z) {
            Boolean bool;
            this.f66271q = Boolean.TRUE;
            if (z) {
                bool = Boolean.TRUE;
            } else {
                bool = Boolean.FALSE;
            }
            this.f66269o = bool;
            this.f66270p = null;
            this.f66275u = null;
            this.f66267m = Float.valueOf(1.0f);
            this.f66273s = C28283e.f66335b;
            this.f66274t = Float.valueOf(1.0f);
            this.f66277w = null;
            this.f66278x = Float.valueOf(1.0f);
            this.f66279y = null;
            this.f66280z = Float.valueOf(1.0f);
            this.f66253A = EnumC28266e.None;
        }
    }

    /* renamed from: com.lynx.component.svg.a.f$ac */
    public static class C28267ac extends AbstractC28277am {

        /* renamed from: a */
        C28293o f66286a;

        /* renamed from: b */
        C28293o f66287b;

        /* renamed from: c */
        public C28293o f66288c;

        /* renamed from: d */
        public C28293o f66289d;

        /* renamed from: e */
        public String f66290e;

        static {
            Covode.recordClassIndex(34225);
        }

        /* access modifiers changed from: package-private */
        @Override // com.lynx.component.svg.p2042a.C28257f.C28273ai
        /* renamed from: a */
        public final String mo48335a() {
            return "svg";
        }

        C28267ac() {
        }
    }

    /* renamed from: com.lynx.component.svg.a.f$ad */
    static abstract class AbstractC28268ad extends AbstractC28270af implements AbstractC28269ae {

        /* renamed from: i */
        List<C28273ai> f66291i = new ArrayList();

        static {
            Covode.recordClassIndex(34226);
        }

        @Override // com.lynx.component.svg.p2042a.C28257f.AbstractC28269ae
        /* renamed from: b */
        public final List<C28273ai> mo48337b() {
            return this.f66291i;
        }

        AbstractC28268ad() {
        }

        @Override // com.lynx.component.svg.p2042a.C28257f.AbstractC28269ae
        /* renamed from: a */
        public final void mo48336a(C28273ai aiVar) {
            this.f66291i.add(aiVar);
        }
    }

    /* renamed from: com.lynx.component.svg.a.f$af */
    static abstract class AbstractC28270af extends AbstractC28271ag {

        /* renamed from: j */
        C28259a f66292j;

        static {
            Covode.recordClassIndex(34228);
        }

        AbstractC28270af() {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.lynx.component.svg.a.f$ag */
    public static abstract class AbstractC28271ag extends C28273ai {

        /* renamed from: k */
        String f66293k;

        /* renamed from: l */
        Boolean f66294l;

        /* renamed from: m */
        C28261ab f66295m;

        /* renamed from: n */
        C28261ab f66296n;

        static {
            Covode.recordClassIndex(34229);
        }

        AbstractC28271ag() {
        }

        public String toString() {
            return mo48335a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.lynx.component.svg.a.f$ah */
    public static class C28272ah extends AbstractC28287i {

        /* renamed from: f */
        C28293o f66297f;

        /* renamed from: g */
        C28293o f66298g;

        /* renamed from: h */
        C28293o f66299h;

        /* renamed from: i */
        C28293o f66300i;

        static {
            Covode.recordClassIndex(34230);
        }

        /* access modifiers changed from: package-private */
        @Override // com.lynx.component.svg.p2042a.C28257f.C28273ai
        /* renamed from: a */
        public final String mo48335a() {
            return "linearGradient";
        }

        C28272ah() {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.lynx.component.svg.a.f$ai */
    public static class C28273ai {

        /* renamed from: o */
        C28257f f66301o;

        /* renamed from: p */
        AbstractC28269ae f66302p;

        static {
            Covode.recordClassIndex(34231);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public String mo48335a() {
            return "";
        }

        C28273ai() {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.lynx.component.svg.a.f$aj */
    public static abstract class AbstractC28274aj implements Cloneable {
        static {
            Covode.recordClassIndex(34232);
        }

        AbstractC28274aj() {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.lynx.component.svg.a.f$ak */
    public static abstract class AbstractC28275ak extends AbstractC28268ad {

        /* renamed from: q */
        C28253d f66303q;

        static {
            Covode.recordClassIndex(34233);
        }

        AbstractC28275ak() {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.lynx.component.svg.a.f$al */
    public static class C28276al extends AbstractC28287i {

        /* renamed from: f */
        C28293o f66304f;

        /* renamed from: g */
        C28293o f66305g;

        /* renamed from: h */
        C28293o f66306h;

        /* renamed from: i */
        C28293o f66307i;

        /* renamed from: j */
        C28293o f66308j;

        static {
            Covode.recordClassIndex(34234);
        }

        /* access modifiers changed from: package-private */
        @Override // com.lynx.component.svg.p2042a.C28257f.C28273ai
        /* renamed from: a */
        public final String mo48335a() {
            return "radialGradient";
        }

        C28276al() {
        }
    }

    /* renamed from: com.lynx.component.svg.a.f$am */
    public static abstract class AbstractC28277am extends AbstractC28275ak {

        /* renamed from: r */
        public C28259a f66309r;

        static {
            Covode.recordClassIndex(34235);
        }

        AbstractC28277am() {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.lynx.component.svg.a.f$ao */
    public static class C28279ao extends C28290l {

        /* renamed from: a */
        String f66322a;

        /* renamed from: c */
        C28293o f66323c;

        /* renamed from: d */
        C28293o f66324d;

        /* renamed from: e */
        C28293o f66325e;

        /* renamed from: f */
        C28293o f66326f;

        static {
            Covode.recordClassIndex(34237);
        }

        /* access modifiers changed from: package-private */
        @Override // com.lynx.component.svg.p2042a.C28257f.C28273ai, com.lynx.component.svg.p2042a.C28257f.C28290l
        /* renamed from: a */
        public final String mo48335a() {
            return "use";
        }

        C28279ao() {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.lynx.component.svg.a.f$c */
    public static class C28281c extends AbstractC28289k {

        /* renamed from: a */
        C28293o f66331a;

        /* renamed from: b */
        C28293o f66332b;

        /* renamed from: c */
        C28293o f66333c;

        static {
            Covode.recordClassIndex(34239);
        }

        /* access modifiers changed from: package-private */
        @Override // com.lynx.component.svg.p2042a.C28257f.C28273ai
        /* renamed from: a */
        public final String mo48335a() {
            return "circle";
        }

        C28281c() {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.lynx.component.svg.a.f$d */
    public static class C28282d extends C28290l implements AbstractC28295q {

        /* renamed from: a */
        Boolean f66334a;

        static {
            Covode.recordClassIndex(34240);
        }

        /* access modifiers changed from: package-private */
        @Override // com.lynx.component.svg.p2042a.C28257f.C28273ai, com.lynx.component.svg.p2042a.C28257f.C28290l
        /* renamed from: a */
        public final String mo48335a() {
            return "clipPath";
        }

        C28282d() {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.lynx.component.svg.a.f$f */
    public static class C28284f extends AbstractC28274aj {

        /* renamed from: a */
        static C28284f f66338a = new C28284f();

        private C28284f() {
        }

        static {
            Covode.recordClassIndex(34242);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.lynx.component.svg.a.f$g */
    public static class C28285g extends C28290l implements AbstractC28295q {
        static {
            Covode.recordClassIndex(34243);
        }

        /* access modifiers changed from: package-private */
        @Override // com.lynx.component.svg.p2042a.C28257f.C28273ai, com.lynx.component.svg.p2042a.C28257f.C28290l
        /* renamed from: a */
        public final String mo48335a() {
            return "defs";
        }

        C28285g() {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.lynx.component.svg.a.f$h */
    public static class C28286h extends AbstractC28289k {

        /* renamed from: a */
        C28293o f66339a;

        /* renamed from: b */
        C28293o f66340b;

        /* renamed from: c */
        C28293o f66341c;

        /* renamed from: d */
        C28293o f66342d;

        static {
            Covode.recordClassIndex(34244);
        }

        /* access modifiers changed from: package-private */
        @Override // com.lynx.component.svg.p2042a.C28257f.C28273ai
        /* renamed from: a */
        public final String mo48335a() {
            return "ellipse";
        }

        C28286h() {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.lynx.component.svg.a.f$i */
    public static abstract class AbstractC28287i extends AbstractC28271ag implements AbstractC28269ae {

        /* renamed from: a */
        List<C28273ai> f66343a = new ArrayList();

        /* renamed from: b */
        Boolean f66344b;

        /* renamed from: c */
        Matrix f66345c;

        /* renamed from: d */
        EnumC28288j f66346d;

        /* renamed from: e */
        String f66347e;

        static {
            Covode.recordClassIndex(34245);
        }

        @Override // com.lynx.component.svg.p2042a.C28257f.AbstractC28269ae
        /* renamed from: b */
        public final List<C28273ai> mo48337b() {
            return this.f66343a;
        }

        AbstractC28287i() {
        }

        @Override // com.lynx.component.svg.p2042a.C28257f.AbstractC28269ae
        /* renamed from: a */
        public final void mo48336a(C28273ai aiVar) {
            if (aiVar instanceof C28260aa) {
                this.f66343a.add(aiVar);
                return;
            }
            throw new C28310h("Gradient elements cannot contain " + aiVar + " elements.");
        }
    }

    /* renamed from: com.lynx.component.svg.a.f$k */
    static abstract class AbstractC28289k extends AbstractC28270af implements AbstractC28291m {

        /* renamed from: e */
        Matrix f66352e;

        static {
            Covode.recordClassIndex(34247);
        }

        AbstractC28289k() {
        }

        @Override // com.lynx.component.svg.p2042a.C28257f.AbstractC28291m
        /* renamed from: a */
        public final void mo48342a(Matrix matrix) {
            this.f66352e = matrix;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.lynx.component.svg.a.f$l */
    public static class C28290l extends AbstractC28268ad implements AbstractC28291m {

        /* renamed from: b */
        Matrix f66353b;

        static {
            Covode.recordClassIndex(34248);
        }

        /* access modifiers changed from: package-private */
        @Override // com.lynx.component.svg.p2042a.C28257f.C28273ai
        /* renamed from: a */
        public String mo48335a() {
            return "group";
        }

        C28290l() {
        }

        @Override // com.lynx.component.svg.p2042a.C28257f.AbstractC28291m
        /* renamed from: a */
        public final void mo48342a(Matrix matrix) {
            this.f66353b = matrix;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.lynx.component.svg.a.f$n */
    public static class C28292n extends AbstractC28275ak implements AbstractC28291m {

        /* renamed from: a */
        String f66354a;

        /* renamed from: b */
        C28293o f66355b;

        /* renamed from: c */
        C28293o f66356c;

        /* renamed from: d */
        C28293o f66357d;

        /* renamed from: e */
        C28293o f66358e;

        /* renamed from: f */
        Matrix f66359f;

        static {
            Covode.recordClassIndex(34250);
        }

        /* access modifiers changed from: package-private */
        @Override // com.lynx.component.svg.p2042a.C28257f.C28273ai
        /* renamed from: a */
        public final String mo48335a() {
            return "image";
        }

        C28292n() {
        }

        @Override // com.lynx.component.svg.p2042a.C28257f.AbstractC28291m
        /* renamed from: a */
        public final void mo48342a(Matrix matrix) {
            this.f66359f = matrix;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.lynx.component.svg.a.f$p */
    public static class C28294p extends AbstractC28289k {

        /* renamed from: a */
        C28293o f66362a;

        /* renamed from: b */
        C28293o f66363b;

        /* renamed from: c */
        C28293o f66364c;

        /* renamed from: d */
        C28293o f66365d;

        static {
            Covode.recordClassIndex(34252);
        }

        /* access modifiers changed from: package-private */
        @Override // com.lynx.component.svg.p2042a.C28257f.C28273ai
        /* renamed from: a */
        public final String mo48335a() {
            return "line";
        }

        C28294p() {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.lynx.component.svg.a.f$s */
    public static class C28297s extends AbstractC28289k {

        /* renamed from: a */
        C28298t f66368a;

        /* renamed from: b */
        Float f66369b;

        static {
            Covode.recordClassIndex(34255);
        }

        /* access modifiers changed from: package-private */
        @Override // com.lynx.component.svg.p2042a.C28257f.C28273ai
        /* renamed from: a */
        public final String mo48335a() {
            return "path";
        }

        C28297s() {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.lynx.component.svg.a.f$v */
    public static class C28300v extends AbstractC28277am implements AbstractC28295q {

        /* renamed from: a */
        Boolean f66374a;

        /* renamed from: b */
        Boolean f66375b;

        /* renamed from: c */
        Matrix f66376c;

        /* renamed from: d */
        C28293o f66377d;

        /* renamed from: e */
        C28293o f66378e;

        /* renamed from: f */
        C28293o f66379f;

        /* renamed from: g */
        C28293o f66380g;

        /* renamed from: h */
        String f66381h;

        static {
            Covode.recordClassIndex(34258);
        }

        /* access modifiers changed from: package-private */
        @Override // com.lynx.component.svg.p2042a.C28257f.C28273ai
        /* renamed from: a */
        public final String mo48335a() {
            return "pattern";
        }

        C28300v() {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.lynx.component.svg.a.f$w */
    public static class C28301w extends AbstractC28289k {

        /* renamed from: a */
        float[] f66382a;

        static {
            Covode.recordClassIndex(34259);
        }

        /* access modifiers changed from: package-private */
        @Override // com.lynx.component.svg.p2042a.C28257f.C28273ai
        /* renamed from: a */
        public String mo48335a() {
            return "polyline";
        }

        C28301w() {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.lynx.component.svg.a.f$x */
    public static class C28302x extends C28301w {
        static {
            Covode.recordClassIndex(34260);
        }

        /* access modifiers changed from: package-private */
        @Override // com.lynx.component.svg.p2042a.C28257f.C28301w, com.lynx.component.svg.p2042a.C28257f.C28273ai
        /* renamed from: a */
        public final String mo48335a() {
            return "polygon";
        }

        C28302x() {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.lynx.component.svg.a.f$y */
    public static class C28303y extends AbstractC28289k {

        /* renamed from: a */
        C28293o f66383a;

        /* renamed from: b */
        C28293o f66384b;

        /* renamed from: c */
        C28293o f66385c;

        /* renamed from: d */
        C28293o f66386d;

        /* renamed from: f */
        C28293o f66387f;

        /* renamed from: g */
        C28293o f66388g;

        static {
            Covode.recordClassIndex(34261);
        }

        /* access modifiers changed from: package-private */
        @Override // com.lynx.component.svg.p2042a.C28257f.C28273ai
        /* renamed from: a */
        public final String mo48335a() {
            return "rect";
        }

        C28303y() {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.lynx.component.svg.a.f$z */
    public static class C28304z extends AbstractC28271ag implements AbstractC28269ae {
        static {
            Covode.recordClassIndex(34262);
        }

        /* access modifiers changed from: package-private */
        @Override // com.lynx.component.svg.p2042a.C28257f.C28273ai
        /* renamed from: a */
        public final String mo48335a() {
            return "solidColor";
        }

        @Override // com.lynx.component.svg.p2042a.C28257f.AbstractC28269ae
        /* renamed from: a */
        public final void mo48336a(C28273ai aiVar) {
        }

        C28304z() {
        }

        @Override // com.lynx.component.svg.p2042a.C28257f.AbstractC28269ae
        /* renamed from: b */
        public final List<C28273ai> mo48337b() {
            return Collections.emptyList();
        }
    }

    /* renamed from: com.lynx.component.svg.a.f$a */
    public static class C28259a {

        /* renamed from: a */
        float f66248a;

        /* renamed from: b */
        float f66249b;

        /* renamed from: c */
        public float f66250c;

        /* renamed from: d */
        public float f66251d;

        static {
            Covode.recordClassIndex(34217);
        }

        /* renamed from: b */
        public final float mo48333b() {
            return this.f66249b + this.f66251d;
        }

        /* renamed from: a */
        public final float mo48331a() {
            return this.f66248a + this.f66250c;
        }

        public final String toString() {
            return "[" + this.f66248a + " " + this.f66249b + " " + this.f66250c + " " + this.f66251d + "]";
        }

        C28259a(C28259a aVar) {
            this.f66248a = aVar.f66248a;
            this.f66249b = aVar.f66249b;
            this.f66250c = aVar.f66250c;
            this.f66251d = aVar.f66251d;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo48332a(C28259a aVar) {
            float f = aVar.f66248a;
            if (f < this.f66248a) {
                this.f66248a = f;
            }
            float f2 = aVar.f66249b;
            if (f2 < this.f66249b) {
                this.f66249b = f2;
            }
            if (aVar.mo48331a() > mo48331a()) {
                this.f66250c = aVar.mo48331a() - this.f66248a;
            }
            if (aVar.mo48333b() > mo48333b()) {
                this.f66251d = aVar.mo48333b() - this.f66249b;
            }
        }

        /* renamed from: a */
        static C28259a m56438a(float f, float f2, float f3, float f4) {
            return new C28259a(f, f2, f3 - f, f4 - f2);
        }

        C28259a(float f, float f2, float f3, float f4) {
            this.f66248a = f;
            this.f66249b = f2;
            this.f66250c = f3;
            this.f66251d = f4;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.lynx.component.svg.a.f$t */
    public static class C28298t implements AbstractC28299u {

        /* renamed from: a */
        int f66370a;

        /* renamed from: b */
        private byte[] f66371b = new byte[8];

        /* renamed from: c */
        private float[] f66372c = new float[16];

        /* renamed from: d */
        private int f66373d;

        static {
            Covode.recordClassIndex(34256);
        }

        @Override // com.lynx.component.svg.p2042a.C28257f.AbstractC28299u
        /* renamed from: a */
        public final void mo48352a() {
            mo48353a((byte) 8);
        }

        C28298t() {
        }

        /* renamed from: a */
        private void m56477a(int i) {
            float[] fArr = this.f66372c;
            if (fArr.length < this.f66373d + i) {
                float[] fArr2 = new float[(fArr.length * 2)];
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                this.f66372c = fArr2;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo48353a(byte b) {
            int i = this.f66370a;
            byte[] bArr = this.f66371b;
            if (i == bArr.length) {
                byte[] bArr2 = new byte[(bArr.length * 2)];
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                this.f66371b = bArr2;
            }
            byte[] bArr3 = this.f66371b;
            int i2 = this.f66370a;
            this.f66370a = i2 + 1;
            bArr3[i2] = b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo48358a(AbstractC28299u uVar) {
            boolean z;
            boolean z2;
            int i = 0;
            for (int i2 = 0; i2 < this.f66370a; i2++) {
                byte b = this.f66371b[i2];
                if (b == 0) {
                    float[] fArr = this.f66372c;
                    int i3 = i + 1;
                    float f = fArr[i];
                    i = i3 + 1;
                    uVar.mo48354a(f, fArr[i3]);
                } else if (b == 1) {
                    float[] fArr2 = this.f66372c;
                    int i4 = i + 1;
                    float f2 = fArr2[i];
                    i = i4 + 1;
                    uVar.mo48359b(f2, fArr2[i4]);
                } else if (b == 2) {
                    float[] fArr3 = this.f66372c;
                    int i5 = i + 1;
                    float f3 = fArr3[i];
                    int i6 = i5 + 1;
                    float f4 = fArr3[i5];
                    int i7 = i6 + 1;
                    float f5 = fArr3[i6];
                    int i8 = i7 + 1;
                    float f6 = fArr3[i7];
                    int i9 = i8 + 1;
                    i = i9 + 1;
                    uVar.mo48356a(f3, f4, f5, f6, fArr3[i8], fArr3[i9]);
                } else if (b == 3) {
                    float[] fArr4 = this.f66372c;
                    int i10 = i + 1;
                    float f7 = fArr4[i];
                    int i11 = i10 + 1;
                    float f8 = fArr4[i10];
                    int i12 = i11 + 1;
                    i = i12 + 1;
                    uVar.mo48355a(f7, f8, fArr4[i11], fArr4[i12]);
                } else if (b != 8) {
                    if ((b & 2) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if ((b & 1) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    float[] fArr5 = this.f66372c;
                    int i13 = i + 1;
                    float f9 = fArr5[i];
                    int i14 = i13 + 1;
                    float f10 = fArr5[i13];
                    int i15 = i14 + 1;
                    float f11 = fArr5[i14];
                    int i16 = i15 + 1;
                    i = i16 + 1;
                    uVar.mo48357a(f9, f10, f11, z, z2, fArr5[i15], fArr5[i16]);
                } else {
                    uVar.mo48352a();
                }
            }
        }

        @Override // com.lynx.component.svg.p2042a.C28257f.AbstractC28299u
        /* renamed from: b */
        public final void mo48359b(float f, float f2) {
            mo48353a((byte) 1);
            m56477a(2);
            float[] fArr = this.f66372c;
            int i = this.f66373d;
            int i2 = i + 1;
            this.f66373d = i2;
            fArr[i] = f;
            this.f66373d = i2 + 1;
            fArr[i2] = f2;
        }

        @Override // com.lynx.component.svg.p2042a.C28257f.AbstractC28299u
        /* renamed from: a */
        public final void mo48354a(float f, float f2) {
            mo48353a((byte) 0);
            m56477a(2);
            float[] fArr = this.f66372c;
            int i = this.f66373d;
            int i2 = i + 1;
            this.f66373d = i2;
            fArr[i] = f;
            this.f66373d = i2 + 1;
            fArr[i2] = f2;
        }

        @Override // com.lynx.component.svg.p2042a.C28257f.AbstractC28299u
        /* renamed from: a */
        public final void mo48355a(float f, float f2, float f3, float f4) {
            mo48353a((byte) 3);
            m56477a(4);
            float[] fArr = this.f66372c;
            int i = this.f66373d;
            int i2 = i + 1;
            this.f66373d = i2;
            fArr[i] = f;
            int i3 = i2 + 1;
            this.f66373d = i3;
            fArr[i2] = f2;
            int i4 = i3 + 1;
            this.f66373d = i4;
            fArr[i3] = f3;
            this.f66373d = i4 + 1;
            fArr[i4] = f4;
        }

        @Override // com.lynx.component.svg.p2042a.C28257f.AbstractC28299u
        /* renamed from: a */
        public final void mo48356a(float f, float f2, float f3, float f4, float f5, float f6) {
            mo48353a((byte) 2);
            m56477a(6);
            float[] fArr = this.f66372c;
            int i = this.f66373d;
            int i2 = i + 1;
            this.f66373d = i2;
            fArr[i] = f;
            int i3 = i2 + 1;
            this.f66373d = i3;
            fArr[i2] = f2;
            int i4 = i3 + 1;
            this.f66373d = i4;
            fArr[i3] = f3;
            int i5 = i4 + 1;
            this.f66373d = i5;
            fArr[i4] = f4;
            int i6 = i5 + 1;
            this.f66373d = i6;
            fArr[i5] = f5;
            this.f66373d = i6 + 1;
            fArr[i6] = f6;
        }

        @Override // com.lynx.component.svg.p2042a.C28257f.AbstractC28299u
        /* renamed from: a */
        public final void mo48357a(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
            int i;
            if (z) {
                i = 2;
            } else {
                i = 0;
            }
            mo48353a((byte) (i | 4 | (z2 ? 1 : 0)));
            m56477a(5);
            float[] fArr = this.f66372c;
            int i2 = this.f66373d;
            int i3 = i2 + 1;
            this.f66373d = i3;
            fArr[i2] = f;
            int i4 = i3 + 1;
            this.f66373d = i4;
            fArr[i3] = f2;
            int i5 = i4 + 1;
            this.f66373d = i5;
            fArr[i4] = f3;
            int i6 = i5 + 1;
            this.f66373d = i6;
            fArr[i5] = f4;
            this.f66373d = i6 + 1;
            fArr[i6] = f5;
        }
    }

    /* renamed from: com.lynx.component.svg.a.f$o */
    public static class C28293o implements Cloneable {

        /* renamed from: a */
        public float f66360a;

        /* renamed from: b */
        public EnumC28278an f66361b;

        static {
            Covode.recordClassIndex(34251);
        }

        C28293o() {
            this.f66360a = 0.0f;
            this.f66361b = EnumC28278an.px;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final boolean mo48345a() {
            if (this.f66360a == 0.0f) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final boolean mo48347b() {
            if (this.f66360a < 0.0f) {
                return true;
            }
            return false;
        }

        public final String toString() {
            return String.valueOf(this.f66360a) + this.f66361b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final float mo48346b(C28305g gVar) {
            if (this.f66361b != EnumC28278an.percent) {
                return mo48344a(gVar);
            }
            C28259a a = gVar.mo48360a();
            if (a == null) {
                return this.f66360a;
            }
            return (this.f66360a * a.f66251d) / 100.0f;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public final float mo48349d(C28305g gVar) {
            if (this.f66361b == EnumC28278an.percent) {
                return (this.f66360a * 1.0f) / 100.0f;
            }
            return mo48344a(gVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public final float mo48348c(C28305g gVar) {
            if (this.f66361b != EnumC28278an.percent) {
                return mo48344a(gVar);
            }
            C28259a a = gVar.mo48360a();
            if (a == null) {
                return this.f66360a;
            }
            float f = a.f66250c;
            float f2 = a.f66251d;
            if (f == f2) {
                return (this.f66360a * f) / 100.0f;
            }
            return (this.f66360a * ((float) (Math.sqrt((double) ((f * f) + (f2 * f2))) / 1.414213562373095d))) / 100.0f;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final float mo48344a(C28305g gVar) {
            switch (C282581.f66247a[this.f66361b.ordinal()]) {
                case 1:
                case 2:
                case 3:
                    return C28930n.m57954a(this.f66360a + this.f66361b.toString(), gVar.f66390b, gVar.f66391c.f66410d.getTextSize());
                case 4:
                    return this.f66360a * (gVar.f66391c.f66410d.getTextSize() / 2.0f);
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    return this.f66360a * gVar.f66389a;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    return (this.f66360a * gVar.f66389a) / 2.54f;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                    return (this.f66360a * gVar.f66389a) / 25.4f;
                case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                    return (this.f66360a * gVar.f66389a) / 72.0f;
                case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                    return (this.f66360a * gVar.f66389a) / 6.0f;
                case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                    C28259a a = gVar.mo48360a();
                    if (a == null) {
                        return this.f66360a;
                    }
                    return (this.f66360a * a.f66250c) / 100.0f;
                default:
                    return this.f66360a;
            }
        }

        C28293o(float f, EnumC28278an anVar) {
            this.f66360a = f;
            this.f66361b = anVar;
        }

        /* renamed from: a */
        public final float mo48343a(float f, float f2) {
            switch (C282581.f66247a[this.f66361b.ordinal()]) {
                case 2:
                case 3:
                    return C28930n.m57954a(this.f66360a + this.f66361b.toString(), f2, 0.0f);
                case 4:
                default:
                    return this.f66360a;
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    return this.f66360a * f;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    return (this.f66360a * f) / 2.54f;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                    return (this.f66360a * f) / 25.4f;
                case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                    return (this.f66360a * f) / 72.0f;
                case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                    return (this.f66360a * f) / 6.0f;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.lynx.component.svg.a.f$e */
    public static class C28283e extends AbstractC28274aj {

        /* renamed from: b */
        static final C28283e f66335b = new C28283e(-16777216);

        /* renamed from: c */
        static final C28283e f66336c = new C28283e(0);

        /* renamed from: a */
        int f66337a;

        static {
            Covode.recordClassIndex(34241);
        }

        public final String toString() {
            return C1764a.m5928a("#%08x", new Object[]{Integer.valueOf(this.f66337a)});
        }

        C28283e(int i) {
            this.f66337a = i;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.lynx.component.svg.a.f$r */
    public static class C28296r extends AbstractC28274aj {

        /* renamed from: a */
        String f66366a;

        /* renamed from: b */
        AbstractC28274aj f66367b;

        static {
            Covode.recordClassIndex(34254);
        }

        public final String toString() {
            return this.f66366a + " " + this.f66367b;
        }

        C28296r(String str, AbstractC28274aj ajVar) {
            this.f66366a = str;
            this.f66367b = ajVar;
        }
    }

    C28257f() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.lynx.component.svg.a.f$j */
    public enum EnumC28288j {
        pad,
        reflect,
        repeat;

        static {
            Covode.recordClassIndex(34246);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.lynx.component.svg.a.f$1 */
    public static /* synthetic */ class C282581 {

        /* renamed from: a */
        static final /* synthetic */ int[] f66247a;

        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|(3:21|22|24)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(24:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|24) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x005a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0066 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0072 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x007e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0023 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0039 */
        static {
            /*
            // Method dump skipped, instructions count: 139
            */
            throw new UnsupportedOperationException("Method not decompiled: com.lynx.component.svg.p2042a.C28257f.C282581.<clinit>():void");
        }
    }

    /* renamed from: com.lynx.component.svg.a.f$an */
    public enum EnumC28278an {
        px,
        em,
        ex,
        in,
        cm,
        mm,
        pt,
        pc,
        percent,
        rpx,
        rem;

        static {
            Covode.recordClassIndex(34236);
        }
    }

    /* renamed from: a */
    public static C28257f m56435a(String str) {
        MethodCollector.m26663i(11514);
        C28257f a = new C28311i().mo48364a(new ByteArrayInputStream(str.getBytes()));
        MethodCollector.m26664o(11514);
        return a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C28273ai mo48330b(String str) {
        String substring;
        if (str == null) {
            return null;
        }
        if (str.startsWith("\"") && str.endsWith("\"")) {
            str = str.substring(1, str.length() - 1).replace("\\\"", "\"");
        } else if (str.startsWith("'") && str.endsWith("'")) {
            str = str.substring(1, str.length() - 1).replace("\\'", "'");
        }
        String replace = str.replace("\\\n", "").replace("\\A", "\n");
        if (replace.length() <= 1 || !replace.startsWith("#") || (substring = replace.substring(1)) == null || substring.length() == 0) {
            return null;
        }
        if (substring.equals(this.f66242a.f66293k)) {
            return this.f66242a;
        }
        if (this.f66246e.containsKey(substring)) {
            return this.f66246e.get(substring);
        }
        AbstractC28271ag a = m56433a(this.f66242a, substring);
        this.f66246e.put(substring, a);
        return a;
    }

    /* renamed from: a */
    private AbstractC28271ag m56433a(AbstractC28269ae aeVar, String str) {
        AbstractC28271ag a;
        AbstractC28271ag agVar = (AbstractC28271ag) aeVar;
        if (str.equals(agVar.f66293k)) {
            return agVar;
        }
        for (C28273ai aiVar : aeVar.mo48337b()) {
            if (aiVar instanceof AbstractC28271ag) {
                AbstractC28271ag agVar2 = (AbstractC28271ag) aiVar;
                if (str.equals(agVar2.f66293k)) {
                    return agVar2;
                }
                if ((aiVar instanceof AbstractC28269ae) && (a = m56433a((AbstractC28269ae) aiVar, str)) != null) {
                    return a;
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public static C28257f m56434a(Resources resources, int i) {
        MethodCollector.m26663i(11672);
        C28311i iVar = new C28311i();
        InputStream openRawResource = resources.openRawResource(i);
        try {
            return iVar.mo48364a(openRawResource);
        } finally {
            try {
                openRawResource.close();
            } catch (IOException unused) {
            }
            MethodCollector.m26664o(11672);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.lynx.component.svg.a.f$b */
    public static class C28280b {

        /* renamed from: a */
        C28293o f66327a;

        /* renamed from: b */
        C28293o f66328b;

        /* renamed from: c */
        C28293o f66329c;

        /* renamed from: d */
        C28293o f66330d;

        static {
            Covode.recordClassIndex(34238);
        }

        C28280b(C28293o oVar, C28293o oVar2, C28293o oVar3, C28293o oVar4) {
            this.f66327a = oVar;
            this.f66328b = oVar2;
            this.f66329c = oVar3;
            this.f66330d = oVar4;
        }
    }

    /* renamed from: a */
    public final Picture mo48329a(int i, int i2, C28256e eVar, C28321d dVar) {
        this.f66245d = eVar;
        Picture picture = new Picture();
        Canvas beginRecording = picture.beginRecording(i, i2);
        if (eVar != null) {
            if (eVar.f66240b == null) {
                eVar = new C28256e(eVar);
            }
            new C28305g(beginRecording, this.f66244c, eVar.f66241c, dVar).mo48362a(this, eVar);
            picture.endRecording();
            return picture;
        }
        eVar = new C28256e(14.0f);
        eVar.mo48327a((float) i, (float) i2);
        new C28305g(beginRecording, this.f66244c, eVar.f66241c, dVar).mo48362a(this, eVar);
        picture.endRecording();
        return picture;
    }
}
