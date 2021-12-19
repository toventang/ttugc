package com.p2082ss.ugc.effectplatform.util;

import android.util.SparseArray;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.microedition.khronos.egl.EGL;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL;
import javax.microedition.khronos.opengles.GL10;
import p4519d.p4520a.p4532e.C88060b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89388w;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89350l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.ugc.effectplatform.util.l */
public final class C86995l {

    /* renamed from: a */
    public static final C86995l f196154a = new C86995l();

    /* renamed from: b */
    private static final HashMap<String, float[]> f196155b;

    /* renamed from: c */
    private static final SparseArray<float[]> f196156c;

    /* renamed from: d */
    private static final Pattern f196157d = Pattern.compile("\\d+$");

    /* renamed from: e */
    private static final AbstractC89244h f196158e = C89250i.m154773a((AbstractC89171a) C86998c.f196168a);

    /* renamed from: a */
    static C86996a m150679a() {
        return (C86996a) f196158e.getValue();
    }

    private C86995l() {
    }

    /* renamed from: com.ss.ugc.effectplatform.util.l$c */
    static final class C86998c extends AbstractC89220m implements AbstractC89171a<C86996a> {

        /* renamed from: a */
        public static final C86998c f196168a = new C86998c();

        static {
            Covode.recordClassIndex(102764);
        }

        C86998c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C86996a invoke() {
            return C86995l.f196154a.mo140620b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.ugc.effectplatform.util.l$a */
    public static final class C86996a {

        /* renamed from: a */
        public String f196159a = "unknown";

        /* renamed from: b */
        public String f196160b = "unknown";

        /* renamed from: c */
        public String f196161c = "unknown";

        /* renamed from: d */
        public int f196162d;

        /* renamed from: e */
        public int f196163e;

        /* renamed from: f */
        public int f196164f = -1;

        /* renamed from: g */
        public double f196165g = -1.0d;

        /* renamed from: h */
        public String f196166h = "unknown";

        static {
            Covode.recordClassIndex(102762);
        }

        public final String toString() {
            return "GPUInfo{renderer='" + this.f196159a + "', version='" + this.f196160b + "', vendor='" + this.f196161c + "', maxFreq=" + this.f196162d + ", minFreq=" + this.f196163e + ", glVer=" + this.f196164f + ", alusOrThroughput=" + this.f196165g + "}";
        }

        /* renamed from: a */
        public final void mo140621a(String str) {
            C89219l.m154719c(str, "");
            this.f196160b = str;
        }
    }

    static {
        Covode.recordClassIndex(102761);
        HashMap<String, float[]> hashMap = new HashMap<>();
        f196155b = hashMap;
        SparseArray<float[]> sparseArray = new SparseArray<>();
        f196156c = sparseArray;
        hashMap.put("mali-g72", new float[]{850.0f, 850.0f, 27.2f});
        hashMap.put("mali-g71", new float[]{850.0f, 850.0f, 27.2f});
        hashMap.put("mali-t880", new float[]{850.0f, 850.0f, 13.6f});
        hashMap.put("mali-t860", new float[]{650.0f, 650.0f, 10.4f});
        hashMap.put("mali-t760", new float[]{650.0f, 650.0f, 10.4f});
        hashMap.put("mali-g51", new float[]{650.0f, 650.0f, 3.9f});
        hashMap.put("mali-t830", new float[]{650.0f, 650.0f, 2.6f});
        hashMap.put("mali-t820", new float[]{650.0f, 650.0f, 2.6f});
        hashMap.put("mali-t720", new float[]{650.0f, 650.0f, 5.2f});
        hashMap.put("mali-t470", new float[]{250.0f, 650.0f, 0.65f});
        hashMap.put("mali-t450", new float[]{270.0f, 650.0f, 5.2f});
        hashMap.put("mali-t400", new float[]{210.0f, 500.0f, 2.0f});
        hashMap.put("mali-400 mp", new float[]{210.0f, 500.0f, 2.0f});
        hashMap.put("mali-450 mp", new float[]{210.0f, 500.0f, 2.6f});
        sparseArray.put(200, new float[]{200.0f, 245.0f, 8.0f});
        sparseArray.put(203, new float[]{245.0f, 294.0f, 16.0f});
        sparseArray.put(205, new float[]{225.0f, 245.0f, 16.0f});
        sparseArray.put(220, new float[]{266.0f, 266.0f, 32.0f});
        sparseArray.put(225, new float[]{400.0f, 400.0f, 32.0f});
        sparseArray.put(302, new float[]{400.0f, 400.0f, 24.0f});
        sparseArray.put(304, new float[]{400.0f, 400.0f, 24.0f});
        sparseArray.put(305, new float[]{400.0f, 450.0f, 24.0f});
        sparseArray.put(306, new float[]{400.0f, 400.0f, 24.0f});
        sparseArray.put(308, new float[]{500.0f, 500.0f, 24.0f});
        sparseArray.put(320, new float[]{450.0f, 450.0f, 96.0f});
        sparseArray.put(330, new float[]{578.0f, 578.0f, 128.0f});
        sparseArray.put(405, new float[]{550.0f, 550.0f, 48.0f});
        sparseArray.put(418, new float[]{600.0f, 600.0f, 128.0f});
        sparseArray.put(420, new float[]{600.0f, 600.0f, 128.0f});
        sparseArray.put(430, new float[]{500.0f, 650.0f, 192.0f});
        sparseArray.put(505, new float[]{450.0f, 450.0f, 48.0f});
        sparseArray.put(506, new float[]{650.0f, 650.0f, 96.0f});
        sparseArray.put(508, new float[]{850.0f, 850.0f, 96.0f});
        sparseArray.put(510, new float[]{600.0f, 600.0f, 128.0f});
        sparseArray.put(512, new float[]{600.0f, 850.0f, 128.0f});
        sparseArray.put(530, new float[]{650.0f, 650.0f, 256.0f});
        sparseArray.put(540, new float[]{710.0f, 710.0f, 256.0f});
    }

    /* renamed from: b */
    public final C86996a mo140620b() {
        GL gl;
        double d;
        float[] fArr;
        Collection collection;
        C86996a aVar = new C86996a();
        try {
            C86987f fVar = new C86987f();
            int[] iArr = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344};
            EGL egl = EGLContext.getEGL();
            if (!(egl instanceof EGL10)) {
                egl = null;
            }
            EGL10 egl10 = (EGL10) egl;
            if (egl10 != null) {
                fVar.f196138b = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
                if (fVar.f196138b == EGL10.EGL_NO_DISPLAY) {
                    fVar.mo140617a("unable to get EGL10 display");
                }
                fVar.mo140618a(egl10);
                if (!egl10.eglInitialize(fVar.f196138b, new int[2])) {
                    fVar.mo140617a("unable to initialize EGL10");
                }
                fVar.mo140618a(egl10);
                int[] iArr2 = new int[1];
                if (!egl10.eglChooseConfig(fVar.f196138b, iArr, null, 0, iArr2)) {
                    fVar.mo140617a("eglChooseConfig failed");
                }
                fVar.mo140618a(egl10);
                EGLConfig[] eGLConfigArr = new EGLConfig[iArr2[0]];
                if (!egl10.eglChooseConfig(fVar.f196138b, iArr, eGLConfigArr, iArr2[0], iArr2)) {
                    fVar.mo140617a("eglChooseConfig#2 failed");
                }
                fVar.mo140618a(egl10);
                fVar.f196139c = eGLConfigArr[0];
                if (fVar.f196139c == null) {
                    fVar.mo140617a("Unable to find a suitable EGLConfig");
                }
                fVar.f196140d = egl10.eglCreatePbufferSurface(fVar.f196138b, fVar.f196139c, new int[]{12375, 16, 12374, 16, 12344});
                if (fVar.f196140d == EGL10.EGL_NO_SURFACE || fVar.f196140d == null) {
                    fVar.mo140617a("surface was null");
                }
                fVar.mo140618a(egl10);
                fVar.f196141e = egl10.eglCreateContext(fVar.f196138b, fVar.f196139c, fVar.f196143g, new int[]{12440, 2, 12344});
                if (fVar.f196141e == EGL10.EGL_NO_CONTEXT || fVar.f196141e == null) {
                    fVar.mo140617a("context was null");
                }
                fVar.mo140618a(egl10);
                if (!egl10.eglMakeCurrent(fVar.f196138b, fVar.f196140d, fVar.f196140d, fVar.f196141e)) {
                    fVar.mo140617a("eglMakeCurrent failed");
                }
                fVar.mo140618a(egl10);
                EGLContext eGLContext = fVar.f196141e;
                if (eGLContext != null) {
                    gl = eGLContext.getGL();
                } else {
                    gl = null;
                }
                if (!(gl instanceof GL10)) {
                    gl = null;
                }
                fVar.f196142f = (GL10) gl;
                fVar.f196137a = egl10;
            }
            GL10 gl10 = fVar.f196142f;
            if (gl10 != null) {
                String glGetString = gl10.glGetString(7936);
                C89219l.m154709a((Object) glGetString, "");
                C89219l.m154719c(glGetString, "");
                aVar.f196161c = glGetString;
                String glGetString2 = gl10.glGetString(7938);
                C89219l.m154709a((Object) glGetString2, "");
                aVar.mo140621a(glGetString2);
                String glGetString3 = gl10.glGetString(7937);
                C89219l.m154709a((Object) glGetString3, "");
                C89219l.m154719c(glGetString3, "");
                aVar.f196159a = glGetString3;
                String glGetString4 = gl10.glGetString(7939);
                C89219l.m154709a((Object) glGetString4, "");
                C89219l.m154719c(glGetString4, "");
                aVar.f196166h = glGetString4;
            }
            EGL10 egl102 = fVar.f196137a;
            if (egl102 != null) {
                if (!fVar.f196144h) {
                    EGLDisplay eGLDisplay = fVar.f196138b;
                    EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
                    egl102.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
                    egl102.eglDestroySurface(fVar.f196138b, fVar.f196140d);
                    egl102.eglDestroyContext(fVar.f196138b, fVar.f196141e);
                    egl102.eglTerminate(fVar.f196138b);
                } else if (fVar.f196138b != EGL10.EGL_NO_DISPLAY) {
                    if (!(fVar.f196140d == null || fVar.f196140d == EGL10.EGL_NO_SURFACE)) {
                        EGLDisplay eGLDisplay2 = fVar.f196138b;
                        EGLSurface eGLSurface2 = EGL10.EGL_NO_SURFACE;
                        egl102.eglMakeCurrent(eGLDisplay2, eGLSurface2, eGLSurface2, EGL10.EGL_NO_CONTEXT);
                        egl102.eglDestroySurface(fVar.f196138b, fVar.f196140d);
                        fVar.f196140d = null;
                    }
                    if (fVar.f196141e != null) {
                        egl102.eglDestroyContext(fVar.f196138b, fVar.f196141e);
                        fVar.f196141e = null;
                    }
                    if (fVar.f196138b != null) {
                        egl102.eglTerminate(fVar.f196138b);
                        fVar.f196138b = null;
                    }
                }
            }
            String str = aVar.f196160b;
            if (C89361p.m154874b(str, "OpenGL ES", false)) {
                if (str != null) {
                    String substring = str.substring(9);
                    C89219l.m154709a((Object) substring, "");
                    if (substring != null) {
                        str = C89361p.m154910b((CharSequence) substring).toString();
                        List<String> split = new C89350l(" ").split(str, 0);
                        if (!split.isEmpty()) {
                            ListIterator<String> listIterator = split.listIterator(split.size());
                            while (true) {
                                if (listIterator.hasPrevious()) {
                                    if (listIterator.previous().length() != 0) {
                                        collection = C89070n.m154571d((Iterable) split, listIterator.nextIndex() + 1);
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                        }
                        collection = C89086z.INSTANCE;
                        Object[] array = collection.toArray(new String[0]);
                        if (array != null) {
                            String[] strArr = (String[]) array;
                            if (strArr.length != 0) {
                                str = strArr[0];
                            }
                        } else {
                            throw new C89388w("null cannot be cast to non-null type");
                        }
                    } else {
                        throw new C89388w("null cannot be cast to non-null type");
                    }
                } else {
                    throw new C89388w("null cannot be cast to non-null type");
                }
            }
            aVar.mo140621a(str);
            aVar.f196162d = m150678a(aVar.f196159a, "max");
            aVar.f196163e = m150678a(aVar.f196159a, "min");
            String str2 = aVar.f196159a;
            C89219l.m154719c(str2, "");
            if (str2.length() > 0) {
                String lowerCase = str2.toLowerCase();
                C89219l.m154709a((Object) lowerCase, "");
                if (C89361p.m154874b(lowerCase, "mali", false)) {
                    fArr = f196155b.get(str2);
                } else {
                    String lowerCase2 = str2.toLowerCase();
                    C89219l.m154709a((Object) lowerCase2, "");
                    if (C89361p.m154908a((CharSequence) lowerCase2, (CharSequence) "adreno", false)) {
                        fArr = f196156c.get(m150677a(str2));
                    }
                }
                if (fArr != null) {
                    d = (double) fArr[2];
                    aVar.f196165g = d;
                    return aVar;
                }
            }
            d = -1.0d;
            aVar.f196165g = d;
        } catch (Throwable th) {
            C88060b.m153136a("GPUUtils", "get gpu info error:" + th.getMessage(), null);
        }
        return aVar;
    }

    /* renamed from: a */
    private static int m150677a(String str) {
        Matcher matcher = f196157d.matcher(str);
        if (matcher.find()) {
            String group = matcher.group(0);
            C89219l.m154709a((Object) group, "");
            if (group.length() > 0) {
                return Integer.parseInt(group);
            }
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.ugc.effectplatform.util.l$b */
    public static final class C86997b implements FilenameFilter {

        /* renamed from: a */
        public static final C86997b f196167a = new C86997b();

        static {
            Covode.recordClassIndex(102763);
        }

        C86997b() {
        }

        public final boolean accept(File file, String str) {
            C89219l.m154709a((Object) file, "");
            if (file.isDirectory()) {
                C89219l.m154709a((Object) str, "");
                if (C89361p.m154908a((CharSequence) str, (CharSequence) "kgsl", false)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: a */
    private static int m150678a(String str, String str2) {
        boolean z;
        float f;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return -1;
        }
        if (str != null) {
            String lowerCase = str.toLowerCase();
            C89219l.m154709a((Object) lowerCase, "");
            if (C89361p.m154874b(lowerCase, "mali", false)) {
                float[] fArr = f196155b.get(str);
                if (fArr == null) {
                    return 850;
                }
                if (C89219l.m154714a((Object) "min", (Object) str2)) {
                    f = fArr[0];
                } else {
                    f = fArr[1];
                }
                return (int) f;
            }
            String lowerCase2 = str.toLowerCase();
            C89219l.m154709a((Object) lowerCase2, "");
            if (C89361p.m154874b(lowerCase2, "adreno", false)) {
                return m150680b(str, str2);
            }
            return -1;
        }
        throw new C89388w("null cannot be cast to non-null type");
    }

    /* renamed from: b */
    private static int m150680b(String str, String str2) {
        Throwable th;
        int i;
        boolean z;
        float[] fArr;
        MethodCollector.m26663i(539);
        int a = m150677a(str);
        if (a <= 0 || (fArr = f196156c.get(a)) == null) {
            File[] listFiles = new File("/sys/class/devfreq/").listFiles(C86997b.f196167a);
            if (listFiles == null || listFiles.length == 0) {
                int i2 = a + 200;
                MethodCollector.m26664o(539);
                return i2;
            }
            int length = listFiles.length;
            for (int i3 = 0; i3 < length; i3++) {
                BufferedReader bufferedReader = null;
                try {
                    BufferedReader bufferedReader2 = new BufferedReader(new FileReader(new File(listFiles[i3], str2 + "_freq")));
                    try {
                        String readLine = bufferedReader2.readLine();
                        C89219l.m154709a((Object) readLine, "");
                        int length2 = readLine.length() - 1;
                        int i4 = 0;
                        boolean z2 = false;
                        while (i4 <= length2) {
                            if (!z2) {
                                i = i4;
                            } else {
                                i = length2;
                            }
                            if (readLine.charAt(i) <= ' ') {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z2) {
                                if (!z) {
                                    break;
                                }
                                length2--;
                            } else if (!z) {
                                z2 = true;
                            } else {
                                i4++;
                            }
                        }
                        int parseInt = Integer.parseInt(readLine.subSequence(i4, length2 + 1).toString()) / 1000000;
                        try {
                            bufferedReader2.close();
                        } catch (IOException unused) {
                        }
                        MethodCollector.m26664o(539);
                        return parseInt;
                    } catch (Exception unused2) {
                        bufferedReader = bufferedReader2;
                        try {
                            bufferedReader.close();
                        } catch (IOException unused3) {
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            bufferedReader2.close();
                        } catch (IOException unused4) {
                        }
                        MethodCollector.m26664o(539);
                        throw th;
                    }
                } catch (Exception unused5) {
                    if (0 == 0) {
                    }
                    bufferedReader.close();
                } catch (Throwable th3) {
                    th = th3;
                    MethodCollector.m26664o(539);
                    throw th;
                }
            }
            MethodCollector.m26664o(539);
            return -1;
        }
        int i5 = (int) fArr[1];
        MethodCollector.m26664o(539);
        return i5;
    }
}
