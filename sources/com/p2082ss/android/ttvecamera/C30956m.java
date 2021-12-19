package com.p2082ss.android.ttvecamera;

import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.camera2.CameraManager;
import android.media.Image;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import android.util.Size;
import android.view.WindowManager;
import com.bytedance.android.livesdk.livesetting.feed.LiveFeedRefreshTimeSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.C15346a;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.ttvecamera.m */
public final class C30956m {

    /* renamed from: a */
    public static byte f74222a;

    /* renamed from: b */
    static final ArrayList<TEFrameSizei> f74223b = new ArrayList<>(Arrays.asList(new TEFrameSizei(160, 120), new TEFrameSizei(240, 160), new TEFrameSizei(320, 240), new TEFrameSizei(400, 240), new TEFrameSizei(480, 320), new TEFrameSizei(640, 360), new TEFrameSizei(640, 480), new TEFrameSizei(768, 480), new TEFrameSizei(854, 480), new TEFrameSizei(800, 600), new TEFrameSizei(960, 540), new TEFrameSizei(960, 640), new TEFrameSizei(1024, 576), new TEFrameSizei(1024, 600), new TEFrameSizei(1280, 720), new TEFrameSizei(1280, 1024), new TEFrameSizei(1920, 1080), new TEFrameSizei(1920, 1440), new TEFrameSizei(2560, 1440), new TEFrameSizei(3840, 2160)));

    /* renamed from: c */
    private static int f74224c = 1920;

    /* renamed from: d */
    private static String f74225d;

    /* renamed from: e */
    private static boolean f74226e = true;

    /* renamed from: f */
    private static String[] f74227f = {"SDM632", "SDM636", "SDM638", "SDM660", "SDM670", "SDM710", "SDM720", "MSM8996", "MSM8998", "SDM845", "KIRIN980", "KIRIN970", "KIRIN710", "HI3660", "MT6771", "Exynos 9810", "Exynos 8895"};

    /* renamed from: g */
    private static String[] f74228g = {"BAC-AL00", "ANE-AL00", "HWI-AL00"};

    /* renamed from: h */
    private static boolean f74229h = true;

    /* renamed from: i */
    private static Class f74230i;

    /* renamed from: j */
    private static Field f74231j;

    /* renamed from: k */
    private static Method f74232k;

    /* renamed from: a */
    public static int m63658a(int i, int i2, int i3) {
        return i > i3 ? i3 : i < i2 ? i2 : i;
    }

    /* renamed from: a */
    private static int[] m63674a(int[] iArr, List<int[]> list) {
        int[] b;
        if (list == null || list.size() <= 0) {
            C30969o.m63687b("TECameraUtils", "supported fpsRange is null,use [7,30]");
            return new int[]{7, 30};
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int[] iArr2 : list) {
            if (iArr[0] > 1000) {
                if (iArr2[1] == 30000) {
                    arrayList.add(iArr2);
                } else {
                    arrayList2.add(iArr2);
                }
            } else if (iArr2[1] == 30) {
                arrayList.add(iArr2);
            } else {
                arrayList2.add(iArr2);
            }
        }
        if (!arrayList.isEmpty()) {
            Collections.sort(arrayList, new Comparator<int[]>() {
                /* class com.p2082ss.android.ttvecamera.C30956m.C309571 */

                static {
                    Covode.recordClassIndex(37582);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                @Override // java.util.Comparator
                public final /* bridge */ /* synthetic */ int compare(int[] iArr, int[] iArr2) {
                    return iArr2[0] - iArr[0];
                }
            });
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                b = (int[]) it.next();
                if (b[0] <= iArr[0]) {
                    break;
                }
            }
        }
        b = m63677b(iArr, list);
        C30969o.m63687b("TECameraUtils", "calculate fps range = [" + b[0] + "," + b[1] + "]");
        return b;
    }

    /* renamed from: a */
    public static int[] m63673a(int i, int i2, int[] iArr, List<int[]> list) {
        C30969o.m63687b("TECameraUtils", "requiredFpsRange : [" + iArr[0] + "," + iArr[1] + "]");
        if (i == 1) {
            C30969o.m63687b("TECameraUtils", "fixed framerate for all cameras");
            return m63678c(iArr, list);
        } else if (i == 2) {
            if (i2 == 0) {
                C30969o.m63687b("TECameraUtils", "fixed framerate for rear camera");
                return m63678c(iArr, list);
            }
            C30969o.m63687b("TECameraUtils", "dynamic framerate for front camera");
            return m63674a(iArr, list);
        } else if (i == 3) {
            C30969o.m63687b("TECameraUtils", "dynamic framerate without select");
            return m63677b(iArr, list);
        } else {
            C30969o.m63687b("TECameraUtils", "dynamic framerate");
            return m63674a(iArr, list);
        }
    }

    /* renamed from: a */
    public static void m63667a(int i, Rect rect, Rect rect2) {
        Matrix matrix = new Matrix();
        matrix.setRotate((float) (-i));
        RectF rectF = new RectF(rect);
        RectF rectF2 = new RectF(rect2);
        matrix.mapRect(rectF);
        matrix.mapRect(rectF2);
        matrix.reset();
        matrix.setTranslate(-rectF.left, -rectF.top);
        matrix.mapRect(rectF);
        matrix.mapRect(rectF2);
        rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        rect2.set((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
    }

    /* renamed from: a */
    public static List<TEFrameSizei> m63666a(Size[] sizeArr) {
        if (sizeArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(sizeArr.length);
        for (Size size : sizeArr) {
            arrayList.add(new TEFrameSizei(size.getWidth(), size.getHeight()));
        }
        return arrayList;
    }

    /* renamed from: a */
    public static boolean m63670a(Object obj) {
        try {
            if (f74230i == null || f74231j == null || f74232k == null) {
                f74230i = Class.forName("android.hardware.camera2.impl.CameraMetadataNative");
                f74231j = obj.getClass().getSuperclass().getDeclaredField("mResults");
                Method declaredMethod = f74230i.getDeclaredMethod("finalize", new Class[0]);
                f74232k = declaredMethod;
                declaredMethod.setAccessible(true);
                f74231j.setAccessible(true);
            }
            f74232k.invoke(f74231j.get(obj), new Object[0]);
            return true;
        } catch (ClassNotFoundException unused) {
            C30969o.m63688c("TECameraUtils", "CameraMetadataNative class not found");
            return false;
        } catch (NoSuchMethodException unused2) {
            C30969o.m63688c("TECameraUtils", "finalize method not found");
            return false;
        } catch (NoSuchFieldException unused3) {
            C30969o.m63688c("TECameraUtils", "mResults field not found");
            return false;
        } catch (IllegalAccessException unused4) {
            C30969o.m63688c("TECameraUtils", "illegal access");
            return false;
        } catch (InvocationTargetException unused5) {
            C30969o.m63688c("TECameraUtils", "method invoke error");
            return false;
        } catch (Exception unused6) {
            C30969o.m63688c("TECameraUtils", "unknown error");
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m63671a(int[] iArr, int i) {
        if (iArr == null) {
            return false;
        }
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m63672a(String[] strArr, String str) {
        if (strArr == null) {
            return false;
        }
        for (String str2 : strArr) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m63669a(Image image, byte[] bArr) {
        if (image == null) {
            C30969o.m63689d("TECameraUtils", "image is null");
            return false;
        } else if (image.getFormat() != 35) {
            C30969o.m63689d("TECameraUtils", "image format wrong: " + image.getFormat());
            return false;
        } else {
            int width = image.getWidth();
            int height = image.getHeight();
            if (bArr.length < ((width * height) * 3) / 2) {
                C30969o.m63689d("TECameraUtils", "output buffer size invalid...");
                return false;
            }
            Image.Plane[] planes = image.getPlanes();
            int i = 0;
            int i2 = 0;
            while (true) {
                int i3 = 1;
                if (i >= planes.length) {
                    return true;
                }
                Image.Plane plane = planes[i];
                ByteBuffer buffer = plane.getBuffer();
                if (buffer == null) {
                    return false;
                }
                int rowStride = plane.getRowStride();
                if (rowStride <= 0) {
                    C30969o.m63689d("TECameraUtils", "imageToNV21, rowStride: ".concat(String.valueOf(width)));
                    rowStride = width;
                }
                int pixelStride = plane.getPixelStride();
                if (pixelStride <= 0) {
                    C30969o.m63689d("TECameraUtils", "imageToNV21, pixelStride: ".concat(String.valueOf(pixelStride)));
                } else {
                    i3 = pixelStride;
                }
                int i4 = height / i3;
                if (rowStride == width) {
                    buffer.get(bArr, i2, buffer.remaining());
                    i2 += rowStride * i4;
                } else {
                    for (int i5 = 0; i5 < i4 - 1; i5++) {
                        buffer.get(bArr, i2, rowStride);
                        i2 += width;
                    }
                    buffer.get(bArr, i2, Math.min(width, buffer.remaining()));
                    i2 += width;
                }
                i += 2;
            }
        }
    }

    static {
        Covode.recordClassIndex(37581);
        int i = 0;
        String a = m63665a();
        if (!TextUtils.isEmpty(a)) {
            a = a.toUpperCase();
            String[] strArr = f74227f;
            int length = strArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                } else if (a.contains(strArr[i2])) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        String str = Build.MODEL;
        if (!TextUtils.isEmpty(str)) {
            str = str.toUpperCase();
            String[] strArr2 = f74228g;
            int length2 = strArr2.length;
            while (true) {
                if (i >= length2) {
                    break;
                } else if (strArr2[i].equals(str)) {
                    break;
                } else {
                    i++;
                }
            }
        }
        C30969o.m63686a("TECameraUtils", "cpuHardware: " + a + ", isHighPerformanceCpu: " + f74226e + "model: " + str + ", isInAbortCapturesBlockList: " + f74229h);
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x006c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m63665a() {
        /*
        // Method dump skipped, instructions count: 124
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ttvecamera.C30956m.m63665a():java.lang.String");
    }

    /* renamed from: a */
    public static int m63657a(int i) {
        return m63658a(i, -1000, 1000);
    }

    /* renamed from: a */
    public static boolean m63668a(Rect rect) {
        if (rect == null || rect.isEmpty() || rect.left < 0 || rect.right < 0 || rect.top < 0 || rect.bottom < 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static int m63659a(Context context) {
        int rotation = ((WindowManager) m63664a(context, "window")).getDefaultDisplay().getRotation();
        if (rotation == 1) {
            return 90;
        }
        if (rotation == 2) {
            return LiveFeedRefreshTimeSetting.DEFAULT;
        }
        if (rotation != 3) {
            return 0;
        }
        return 270;
    }

    /* renamed from: b */
    public static boolean m63676b(Context context) {
        Object invoke;
        try {
            if (Build.VERSION.SDK_INT < 21) {
                return false;
            }
            CameraManager cameraManager = (CameraManager) m63664a(context, "camera");
            if (Build.VERSION.SDK_INT >= 28 || (Build.VERSION.SDK_INT == 27 && Build.VERSION.PREVIEW_SDK_INT > 0)) {
                Method method = (Method) Class.class.getDeclaredMethod("getDeclaredMethod", String.class, Class[].class).invoke(cameraManager.getClass(), "supportsCamera2ApiLocked", String.class);
                method.setAccessible(true);
                Object[] objArr = {"0"};
                Pair<Boolean, Object> a = C15346a.m28238a(method, new Object[]{cameraManager, objArr}, 110000, "java.lang.Object", true, "com_ss_android_ttvecamera_TECameraUtils_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                if (((Boolean) a.first).booleanValue()) {
                    invoke = a.second;
                } else {
                    invoke = method.invoke(cameraManager, objArr);
                    C15346a.m28242a(invoke, method, new Object[]{cameraManager, objArr}, "com_ss_android_ttvecamera_TECameraUtils_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                }
                return ((Boolean) invoke).booleanValue();
            }
            Method declaredMethod = cameraManager.getClass().getDeclaredMethod("supportsCamera2ApiLocked", String.class);
            declaredMethod.setAccessible(true);
            return ((Boolean) declaredMethod.invoke(cameraManager, "0")).booleanValue();
        } catch (Throwable unused) {
            return true;
        }
    }

    /* renamed from: b */
    private static int[] m63677b(final int[] iArr, List<int[]> list) {
        return (int[]) Collections.min(list, new Comparator<int[]>() {
            /* class com.p2082ss.android.ttvecamera.C30956m.C309593 */

            static {
                Covode.recordClassIndex(37584);
            }

            /* renamed from: a */
            private int m63679a(int[] iArr) {
                int i;
                int i2;
                int[] iArr2 = iArr;
                if (iArr2[0] > iArr[0]) {
                    i = (iArr2[0] - iArr[0]) * 2;
                } else {
                    i = (iArr[0] - iArr2[0]) * 3;
                }
                if (iArr2[1] > iArr[1]) {
                    i2 = (iArr2[1] - iArr[1]) * 4;
                } else {
                    i2 = (iArr[1] - iArr2[1]) * 1;
                }
                return i + i2;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // java.util.Comparator
            public final /* synthetic */ int compare(int[] iArr, int[] iArr2) {
                return m63679a(iArr) - m63679a(iArr2);
            }
        });
    }

    /* renamed from: b */
    private static TEFrameSizei m63675b(List<TEFrameSizei> list, TEFrameSizei tEFrameSizei) {
        TEFrameSizei tEFrameSizei2 = null;
        for (TEFrameSizei tEFrameSizei3 : list) {
            if (tEFrameSizei3.f73616a > tEFrameSizei.f73616a && tEFrameSizei3.f73617b > tEFrameSizei.f73617b) {
                if (tEFrameSizei2 == null || tEFrameSizei3.f73616a < tEFrameSizei2.f73616a) {
                    tEFrameSizei2 = tEFrameSizei3;
                }
            }
        }
        if (tEFrameSizei2 != null) {
            return tEFrameSizei2;
        }
        return null;
    }

    /* renamed from: a */
    public static TEFrameSizei m63660a(List<TEFrameSizei> list, float f) {
        if (f <= 0.0f || list == null || list.size() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (TEFrameSizei tEFrameSizei : list) {
            if (Float.compare(f, ((float) tEFrameSizei.f73616a) / ((float) tEFrameSizei.f73617b)) == 0) {
                arrayList.add(tEFrameSizei);
            } else {
                arrayList2.add(tEFrameSizei);
            }
        }
        if (!arrayList.isEmpty()) {
            ArrayList<TEFrameSizei> arrayList3 = f74223b;
            if (arrayList.contains(arrayList3.get(14))) {
                return arrayList3.get(14);
            }
            if (arrayList.contains(arrayList3.get(16))) {
                return arrayList3.get(16);
            }
            Collections.sort(arrayList, new Comparator<TEFrameSizei>() {
                /* class com.p2082ss.android.ttvecamera.C30956m.C309659 */

                static {
                    Covode.recordClassIndex(37590);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                @Override // java.util.Comparator
                public final /* bridge */ /* synthetic */ int compare(TEFrameSizei tEFrameSizei, TEFrameSizei tEFrameSizei2) {
                    TEFrameSizei tEFrameSizei3 = tEFrameSizei;
                    TEFrameSizei tEFrameSizei4 = tEFrameSizei2;
                    return (tEFrameSizei4.f73616a * tEFrameSizei4.f73617b) - (tEFrameSizei3.f73616a * tEFrameSizei3.f73617b);
                }
            });
            return (TEFrameSizei) arrayList.get(0);
        }
        ArrayList<TEFrameSizei> arrayList4 = f74223b;
        if (arrayList2.contains(arrayList4.get(14))) {
            return arrayList4.get(14);
        }
        if (arrayList.contains(arrayList4.get(16))) {
            return arrayList4.get(16);
        }
        Collections.sort(arrayList2, new Comparator<TEFrameSizei>() {
            /* class com.p2082ss.android.ttvecamera.C30956m.C309582 */

            static {
                Covode.recordClassIndex(37583);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // java.util.Comparator
            public final /* bridge */ /* synthetic */ int compare(TEFrameSizei tEFrameSizei, TEFrameSizei tEFrameSizei2) {
                TEFrameSizei tEFrameSizei3 = tEFrameSizei;
                TEFrameSizei tEFrameSizei4 = tEFrameSizei2;
                return (tEFrameSizei4.f73616a * tEFrameSizei4.f73617b) - (tEFrameSizei3.f73616a * tEFrameSizei3.f73617b);
            }
        });
        return (TEFrameSizei) arrayList.get(arrayList.size() / 2);
    }

    /* renamed from: c */
    private static int[] m63678c(int[] iArr, List<int[]> list) {
        int[] b;
        if (list == null || list.size() <= 0) {
            C30969o.m63687b("TECameraUtils", "supported fpsRange is null,use [30,30]");
            return new int[]{30, 30};
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int[] iArr2 : list) {
            if (iArr2[1] == iArr2[0]) {
                arrayList.add(iArr2);
            } else {
                arrayList2.add(iArr2);
            }
        }
        if (!arrayList.isEmpty()) {
            Collections.sort(arrayList, new Comparator<int[]>() {
                /* class com.p2082ss.android.ttvecamera.C30956m.C309604 */

                static {
                    Covode.recordClassIndex(37585);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                @Override // java.util.Comparator
                public final /* bridge */ /* synthetic */ int compare(int[] iArr, int[] iArr2) {
                    return iArr2[1] - iArr[1];
                }
            });
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                b = (int[]) it.next();
                if (((b[0] >= 15 && b[0] <= 30) || (b[0] >= 15000 && b[1] <= 30000)) && iArr[1] == b[1]) {
                    break;
                }
            }
            C30969o.m63687b("TECameraUtils", "calculate fps range = [" + b[0] + "," + b[1] + "]");
            return b;
        }
        b = m63677b(iArr, list);
        C30969o.m63687b("TECameraUtils", "calculate fps range = [" + b[0] + "," + b[1] + "]");
        return b;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 155
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:72)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:46)
        */
    /* renamed from: a */
    public static com.p2082ss.android.ttvecamera.TEFrameSizei m63661a(java.util.List<com.p2082ss.android.ttvecamera.TEFrameSizei> r10, com.p2082ss.android.ttvecamera.TEFrameSizei r11) {
        /*
        // Method dump skipped, instructions count: 169
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ttvecamera.C30956m.m63661a(java.util.List, com.ss.android.ttvecamera.TEFrameSizei):com.ss.android.ttvecamera.TEFrameSizei");
    }

    /* renamed from: a */
    private static Object m63664a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(9538);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!C58027i.f132247b && "connectivity".equals(str)) {
                try {
                    new C21708b().mo35361a();
                    C58027i.f132247b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (C58027i.f132246a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new C58027i.HandlerC58028a((Handler) declaredField.get(obj)));
                        } catch (Exception e) {
                            C13849d.m25015a(e, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    C58027i.f132246a = false;
                } finally {
                    MethodCollector.m26664o(9538);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    /* renamed from: a */
    public static TEFrameSizei m63663a(List<TEFrameSizei> list, TEFrameSizei tEFrameSizei, TEFrameSizei tEFrameSizei2) {
        if (tEFrameSizei != null && tEFrameSizei.mo55606a()) {
            if (tEFrameSizei.equals(tEFrameSizei2) && list.contains(tEFrameSizei2)) {
                return tEFrameSizei2;
            }
            Iterator<TEFrameSizei> it = list.iterator();
            while (it.hasNext()) {
                TEFrameSizei next = it.next();
                if (next.f73616a * tEFrameSizei.f73617b != next.f73617b * tEFrameSizei.f73616a) {
                    it.remove();
                }
            }
        }
        Collections.sort(list, new Comparator<TEFrameSizei>() {
            /* class com.p2082ss.android.ttvecamera.C30956m.C309615 */

            static {
                Covode.recordClassIndex(37586);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // java.util.Comparator
            public final /* bridge */ /* synthetic */ int compare(TEFrameSizei tEFrameSizei, TEFrameSizei tEFrameSizei2) {
                TEFrameSizei tEFrameSizei3 = tEFrameSizei;
                TEFrameSizei tEFrameSizei4 = tEFrameSizei2;
                return (tEFrameSizei4.f73616a * tEFrameSizei4.f73617b) - (tEFrameSizei3.f73616a * tEFrameSizei3.f73617b);
            }
        });
        TEFrameSizei tEFrameSizei3 = null;
        for (TEFrameSizei tEFrameSizei4 : list) {
            if (tEFrameSizei3 != null) {
                if (tEFrameSizei4.f73616a == tEFrameSizei2.f73616a && tEFrameSizei4.f73617b == tEFrameSizei2.f73617b) {
                    return tEFrameSizei4;
                }
                if (tEFrameSizei4.f73617b <= tEFrameSizei2.f73617b || tEFrameSizei4.f73617b >= tEFrameSizei3.f73617b) {
                    if (tEFrameSizei4.f73617b < tEFrameSizei2.f73617b) {
                        return tEFrameSizei3;
                    }
                }
            }
            tEFrameSizei3 = tEFrameSizei4;
        }
        return tEFrameSizei3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005e, code lost:
        if (r0 != null) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0074, code lost:
        if (r0 != null) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0077, code lost:
        if (r2 != null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0079, code lost:
        com.p2082ss.android.ttvecamera.C30969o.m63689d("TECameraUtils", "unsupport high quality~~");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        return r2;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.p2082ss.android.ttvecamera.TEFrameSizei m63662a(java.util.List<com.p2082ss.android.ttvecamera.TEFrameSizei> r4, com.p2082ss.android.ttvecamera.TEFrameSizei r5, int r6) {
        /*
        // Method dump skipped, instructions count: 129
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ttvecamera.C30956m.m63662a(java.util.List, com.ss.android.ttvecamera.TEFrameSizei, int):com.ss.android.ttvecamera.TEFrameSizei");
    }
}
