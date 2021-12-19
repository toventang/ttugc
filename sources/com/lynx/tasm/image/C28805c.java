package com.lynx.tasm.image;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.lynx.p2031a.AbstractC28184c;
import com.lynx.p2031a.AbstractC28189d;
import com.lynx.p2031a.C28182b;
import com.lynx.p2031a.C28192f;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.AbstractC28510f;
import com.lynx.tasm.behavior.AbstractC28520j;
import com.lynx.tasm.behavior.p2052ui.LynxBaseUI;
import com.lynx.tasm.behavior.p2052ui.image.C28621a;
import com.lynx.tasm.behavior.shadow.ShadowNode;
import com.lynx.tasm.p2054c.C28723a;
import com.lynx.tasm.p2054c.C28725c;
import com.lynx.tasm.p2054c.C28728f;
import com.lynx.tasm.utils.C28916c;
import com.lynx.tasm.utils.C28926j;
import com.lynx.tasm.utils.C28931o;
import java.util.Map;

/* access modifiers changed from: package-private */
/* renamed from: com.lynx.tasm.image.c */
public final class C28805c {

    /* renamed from: a */
    public final C28794b f67966a = new C28794b();

    /* renamed from: b */
    public final AbstractC28813a f67967b;

    /* renamed from: c */
    public final Handler f67968c = new Handler(Looper.getMainLooper());

    /* renamed from: d */
    public String f67969d;

    /* renamed from: e */
    public int f67970e;

    /* renamed from: f */
    public boolean f67971f;

    /* renamed from: g */
    public boolean f67972g;

    /* renamed from: h */
    public Bitmap f67973h;

    /* renamed from: i */
    private final AbstractC28189d f67974i;

    /* renamed from: j */
    private final AbstractC28189d f67975j;

    /* renamed from: k */
    private final LynxBaseUI f67976k;

    /* renamed from: l */
    private final AbstractC28520j f67977l;

    /* renamed from: m */
    private String f67978m;

    /* renamed from: n */
    private int f67979n;

    /* renamed from: o */
    private int f67980o;

    /* renamed from: p */
    private Bitmap.Config f67981p;

    /* renamed from: q */
    private boolean f67982q;

    /* renamed from: r */
    private boolean f67983r;

    /* renamed from: s */
    private int f67984s;

    /* renamed from: t */
    private int f67985t;

    /* renamed from: u */
    private boolean f67986u;

    /* renamed from: v */
    private C28931o[] f67987v;

    /* renamed from: w */
    private float[] f67988w;

    /* renamed from: x */
    private int[] f67989x;

    /* renamed from: y */
    private Boolean f67990y;

    /* access modifiers changed from: package-private */
    /* renamed from: com.lynx.tasm.image.c$a */
    public interface AbstractC28813a {
        static {
            Covode.recordClassIndex(34920);
        }

        /* renamed from: a */
        void mo49906a(Bitmap bitmap);

        /* renamed from: b */
        void mo49907b(Bitmap bitmap);
    }

    static {
        Covode.recordClassIndex(34912);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x025d, code lost:
        if (r7.equals("") != false) goto L_0x0271;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0266, code lost:
        if (r7.equals("scaleToFill") != false) goto L_0x0271;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x026f, code lost:
        if (r7.equals("none") != false) goto L_0x0271;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo49918a(com.lynx.tasm.behavior.C28716v r17) {
        /*
        // Method dump skipped, instructions count: 1228
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.image.C28805c.mo49918a(com.lynx.tasm.behavior.v):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo49920a(Map<String, C28723a> map) {
        if (map == null) {
            this.f67983r = false;
            this.f67982q = false;
            return;
        }
        this.f67982q = map.containsKey("load");
        this.f67983r = map.containsKey("error");
    }

    /* renamed from: a */
    public final void mo49919a(Throwable th, String str) {
        if (this.f67983r && this.f67986u && TextUtils.equals(this.f67978m, str)) {
            this.f67986u = false;
            C28725c cVar = new C28725c(this.f67976k.getSign(), "error");
            cVar.mo49838a("errMsg", th != null ? th.getCause() : "unknown reason");
            this.f67977l.f67064e.mo49834a(cVar);
            this.f67977l.f67064e.mo49835a(new C28728f(this.f67976k.getSign()));
            this.f67977l.mo49039a(str, "image", Log.getStackTraceString(th));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo49922c() {
        this.f67973h = null;
        this.f67974i.release();
        this.f67975j.release();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo49923d() {
        this.f67973h = null;
        this.f67974i.destroy();
        this.f67975j.destroy();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.lynx.tasm.image.c$5 */
    public static /* synthetic */ class C288125 {

        /* renamed from: a */
        static final /* synthetic */ int[] f68004a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        static {
            /*
                r0 = 34919(0x8867, float:4.8932E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.lynx.react.bridge.ReadableType[] r0 = com.lynx.react.bridge.ReadableType.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.lynx.tasm.image.C28805c.C288125.f68004a = r2
                com.lynx.react.bridge.ReadableType r0 = com.lynx.react.bridge.ReadableType.String     // Catch:{ NoSuchFieldError -> 0x0018 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0018 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                int[] r2 = com.lynx.tasm.image.C28805c.C288125.f68004a     // Catch:{ NoSuchFieldError -> 0x0023 }
                com.lynx.react.bridge.ReadableType r0 = com.lynx.react.bridge.ReadableType.Boolean     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.image.C28805c.C288125.<clinit>():void");
        }
    }

    /* renamed from: a */
    public final void mo49914a() {
        if (this.f67990y != null && this.f67973h != null) {
            ShadowNode b = this.f67976k.mContext.mo49041b(this.f67976k.getSign());
            if (b instanceof AutoSizeImage) {
                ((AutoSizeImage) b).mo49902a(this.f67990y.booleanValue(), this.f67973h.getWidth(), this.f67973h.getHeight(), this.f67976k.getWidth(), this.f67976k.getHeight());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo49921b() {
        Boolean bool;
        int i = this.f67984s;
        int i2 = this.f67985t;
        if (i <= 0) {
            i = this.f67979n;
        }
        if (i2 <= 0) {
            i2 = this.f67980o;
        }
        if (i <= 0 && i2 <= 0 && ((bool = this.f67990y) == null || !bool.booleanValue())) {
            return;
        }
        if (this.f67971f) {
            if (this.f67973h == null && !TextUtils.isEmpty(this.f67969d)) {
                m57656a(this.f67969d, i, i2);
            }
            if (!TextUtils.isEmpty(this.f67978m)) {
                m57658b(this.f67978m, i, i2);
                return;
            }
            return;
        }
        if (this.f67973h == null && !TextUtils.isEmpty(this.f67969d)) {
            m57659c(this.f67969d, i, i2);
        }
        if (!TextUtils.isEmpty(this.f67978m)) {
            m57660d(this.f67978m, i, i2);
        }
    }

    /* renamed from: e */
    private void m57661e() {
        float f;
        int i;
        this.f67966a.f67928a = null;
        if (!C28916c.m57920a((float) this.f67984s, 0.0f) && !C28916c.m57920a((float) this.f67985t, 0.0f)) {
            int i2 = 0;
            if (this.f67987v != null) {
                int i3 = 0;
                while (true) {
                    C28931o[] oVarArr = this.f67987v;
                    if (i3 < oVarArr.length) {
                        if (oVarArr[i3] != null && oVarArr[i3].f68359a > 0.0f) {
                            C28931o[] oVarArr2 = this.f67987v;
                            int i4 = i3 + 1;
                            if (oVarArr2[i4] != null && oVarArr2[i4].f68359a > 0.0f) {
                                if (this.f67988w == null) {
                                    this.f67988w = new float[8];
                                }
                                this.f67966a.f67928a = this.f67988w;
                                int i5 = 0;
                                while (true) {
                                    C28931o[] oVarArr3 = this.f67987v;
                                    if (i5 >= oVarArr3.length) {
                                        break;
                                    }
                                    if (oVarArr3[i5] == null) {
                                        this.f67988w[i5] = 0.0f;
                                    } else if (oVarArr3[i5].f68360b == C28931o.EnumC28932a.PERCENTAGE) {
                                        float[] fArr = this.f67988w;
                                        float f2 = this.f67987v[i5].f68359a / 100.0f;
                                        if (i5 % 2 == 0) {
                                            i = this.f67984s;
                                        } else {
                                            i = this.f67985t;
                                        }
                                        fArr[i5] = f2 * ((float) i);
                                    } else {
                                        this.f67988w[i5] = this.f67987v[i5].f68359a;
                                    }
                                    i5++;
                                }
                                float[] fArr2 = this.f67988w;
                                int i6 = this.f67984s;
                                if (fArr2[0] + fArr2[2] > ((float) i6)) {
                                    f = Math.min(((float) i6) / (fArr2[0] + fArr2[2]), 1.0f);
                                } else {
                                    f = 1.0f;
                                }
                                int i7 = this.f67984s;
                                if (fArr2[4] + fArr2[6] > ((float) i7)) {
                                    f = Math.min(((float) i7) / (fArr2[4] + fArr2[6]), f);
                                }
                                int i8 = this.f67985t;
                                if (fArr2[1] + fArr2[7] > ((float) i8)) {
                                    f = Math.min(((float) i8) / (fArr2[1] + fArr2[7]), f);
                                }
                                int i9 = this.f67985t;
                                if (fArr2[3] + fArr2[5] > ((float) i9)) {
                                    f = Math.min(((float) i9) / (fArr2[3] + fArr2[5]), f);
                                }
                                if (f < 1.0f) {
                                    do {
                                        fArr2[i2] = fArr2[i2] * f;
                                        i2++;
                                    } while (i2 < 8);
                                    return;
                                }
                                return;
                            }
                        }
                        i3 += 2;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private static C28931o m57654a(ReadableArray readableArray, int i) {
        C28931o.EnumC28932a aVar;
        float f = (float) readableArray.getDouble(i);
        if (f <= 0.0f) {
            return null;
        }
        if (readableArray.getInt(i + 1) == 1) {
            aVar = C28931o.EnumC28932a.PERCENTAGE;
        } else {
            aVar = C28931o.EnumC28932a.PX;
        }
        return new C28931o(f, aVar);
    }

    /* renamed from: a */
    public final void mo49917a(Bitmap bitmap, String str) {
        if (this.f67982q && this.f67986u && TextUtils.equals(this.f67978m, str)) {
            this.f67986u = false;
            C28725c cVar = new C28725c(this.f67976k.getSign(), "load");
            cVar.mo49838a("width", Integer.valueOf(bitmap.getWidth()));
            cVar.mo49838a("height", Integer.valueOf(bitmap.getHeight()));
            this.f67977l.f67064e.mo49834a(cVar);
        }
    }

    /* renamed from: b */
    private void m57658b(final String str, int i, int i2) {
        if (!this.f67972g) {
            str = C28621a.m57207a(this.f67977l, str);
        }
        C28621a.m57209a(this.f67977l, str, (float) i, (float) i2, new AbstractC28510f.AbstractC28511a() {
            /* class com.lynx.tasm.image.C28805c.C288082 */

            static {
                Covode.recordClassIndex(34915);
            }

            @Override // com.lynx.tasm.behavior.AbstractC28510f.AbstractC28511a
            /* renamed from: a */
            public final void mo49016a(Object obj, final Throwable th) {
                if (!(obj instanceof Bitmap)) {
                    LLog.m56856a(6, "LynxImage", "need bitmap! ");
                    return;
                }
                final Bitmap bitmap = (Bitmap) obj;
                RunnableC288091 r2 = new Runnable() {
                    /* class com.lynx.tasm.image.C28805c.C288082.RunnableC288091 */

                    static {
                        Covode.recordClassIndex(34916);
                    }

                    public final void run() {
                        C28805c.this.f67973h = bitmap;
                        if (C28805c.this.f67967b != null) {
                            C28805c.this.f67967b.mo49906a(bitmap);
                        }
                        C28805c.this.mo49914a();
                        if (bitmap == null) {
                            C28805c.this.mo49919a(th, str);
                        } else {
                            C28805c.this.mo49917a(bitmap, str);
                        }
                    }
                };
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    r2.run();
                } else {
                    C28805c.this.f67968c.post(r2);
                }
            }
        });
    }

    C28805c(AbstractC28520j jVar, LynxBaseUI lynxBaseUI, AbstractC28813a aVar) {
        this.f67977l = jVar;
        this.f67976k = lynxBaseUI;
        this.f67967b = aVar;
        AbstractC28189d a = C28192f.m56294a().mo48222a();
        this.f67974i = a;
        AbstractC28189d a2 = C28192f.m56294a().mo48222a();
        this.f67975j = a2;
        if (a == null || a2 == null) {
            throw new RuntimeException("set image loader first!");
        }
    }

    /* renamed from: a */
    private void m57655a(int i, ReadableMap readableMap, String str) {
        if (this.f67989x == null) {
            this.f67989x = new int[4];
        }
        this.f67989x[i] = readableMap.getInt(str);
        int[] iArr = this.f67989x;
        if (iArr[i] < 0) {
            iArr[i] = (int) C28926j.m57938a(3.0f);
        }
    }

    /* renamed from: c */
    private void m57659c(final String str, int i, int i2) {
        Uri parse;
        if (!this.f67972g) {
            str = C28621a.m57207a(this.f67977l, str);
        }
        C28182b.C28183a aVar = new C28182b.C28183a();
        aVar.f65971d = this.f67981p;
        aVar.f65970c = this.f67970e;
        aVar.f65968a = i;
        aVar.f65969b = i2;
        C28182b a = aVar.mo48198a();
        AbstractC28189d dVar = this.f67975j;
        AbstractC28520j jVar = this.f67977l;
        if (str == null) {
            parse = null;
        } else {
            parse = Uri.parse(str);
        }
        dVar.load(jVar, parse, a, new AbstractC28184c() {
            /* class com.lynx.tasm.image.C28805c.C288103 */

            static {
                Covode.recordClassIndex(34917);
            }

            @Override // com.lynx.p2031a.AbstractC28184c
            /* renamed from: a */
            public final void mo48199a(Bitmap bitmap) {
                if (C28805c.this.f67967b != null) {
                    C28805c.this.f67967b.mo49907b(bitmap);
                }
            }

            @Override // com.lynx.p2031a.AbstractC28184c
            /* renamed from: b */
            public final void mo48203b(Bitmap bitmap) {
                if (C28805c.this.f67967b != null) {
                    C28805c.this.f67967b.mo49907b(bitmap);
                }
            }

            @Override // com.lynx.p2031a.AbstractC28184c
            /* renamed from: a */
            public final void mo48202a(Throwable th) {
                if (C28805c.this.f67967b != null) {
                    C28805c.this.f67967b.mo49907b(null);
                }
            }

            @Override // com.lynx.p2031a.AbstractC28184c
            /* renamed from: b */
            public final void mo48206b(Throwable th) {
                if (C28805c.this.f67967b != null) {
                    C28805c.this.f67967b.mo49907b(null);
                }
            }
        });
    }

    /* renamed from: d */
    private void m57660d(final String str, int i, int i2) {
        Uri parse;
        if (!this.f67972g) {
            str = C28621a.m57207a(this.f67977l, str);
        }
        C28182b.C28183a aVar = new C28182b.C28183a();
        aVar.f65971d = this.f67981p;
        aVar.f65970c = this.f67970e;
        aVar.f65968a = i;
        aVar.f65969b = i2;
        C28182b a = aVar.mo48198a();
        AbstractC28189d dVar = this.f67974i;
        AbstractC28520j jVar = this.f67977l;
        if (str == null) {
            parse = null;
        } else {
            parse = Uri.parse(str);
        }
        dVar.load(jVar, parse, a, new AbstractC28184c() {
            /* class com.lynx.tasm.image.C28805c.C288114 */

            static {
                Covode.recordClassIndex(34918);
            }

            @Override // com.lynx.p2031a.AbstractC28184c
            /* renamed from: a */
            public final void mo48199a(Bitmap bitmap) {
                C28805c.this.f67973h = bitmap;
                if (C28805c.this.f67967b != null) {
                    C28805c.this.f67967b.mo49906a(bitmap);
                }
                C28805c.this.mo49914a();
                C28805c.this.mo49917a(bitmap, str);
            }

            @Override // com.lynx.p2031a.AbstractC28184c
            /* renamed from: b */
            public final void mo48203b(Bitmap bitmap) {
                C28805c.this.f67973h = bitmap;
                if (C28805c.this.f67967b != null) {
                    C28805c.this.f67967b.mo49906a(bitmap);
                }
            }

            @Override // com.lynx.p2031a.AbstractC28184c
            /* renamed from: a */
            public final void mo48202a(Throwable th) {
                C28805c.this.f67973h = null;
                if (C28805c.this.f67967b != null) {
                    C28805c.this.f67967b.mo49906a(null);
                }
                C28805c.this.mo49919a(th, str);
            }

            @Override // com.lynx.p2031a.AbstractC28184c
            /* renamed from: b */
            public final void mo48206b(Throwable th) {
                C28805c.this.f67973h = null;
                if (C28805c.this.f67967b != null) {
                    C28805c.this.f67967b.mo49906a(null);
                }
            }
        });
    }

    /* renamed from: a */
    private void m57656a(final String str, int i, int i2) {
        if (!this.f67972g) {
            str = C28621a.m57207a(this.f67977l, str);
        }
        C28621a.m57209a(this.f67977l, str, (float) i, (float) i2, new AbstractC28510f.AbstractC28511a() {
            /* class com.lynx.tasm.image.C28805c.C288061 */

            static {
                Covode.recordClassIndex(34913);
            }

            @Override // com.lynx.tasm.behavior.AbstractC28510f.AbstractC28511a
            /* renamed from: a */
            public final void mo49016a(Object obj, Throwable th) {
                if (!(obj instanceof Bitmap)) {
                    LLog.m56856a(6, "LynxImage", "need bitmap! ");
                    return;
                }
                final Bitmap bitmap = (Bitmap) obj;
                RunnableC288071 r2 = new Runnable() {
                    /* class com.lynx.tasm.image.C28805c.C288061.RunnableC288071 */

                    static {
                        Covode.recordClassIndex(34914);
                    }

                    public final void run() {
                        if (C28805c.this.f67967b != null) {
                            C28805c.this.f67967b.mo49907b(bitmap);
                        }
                    }
                };
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    r2.run();
                } else {
                    C28805c.this.f67968c.post(r2);
                }
            }
        });
    }

    /* renamed from: b */
    private void m57657b(int i, ReadableMap readableMap, String str) {
        if (this.f67987v == null) {
            this.f67987v = new C28931o[8];
        }
        ReadableArray array = readableMap.getArray(str);
        int i2 = 0;
        if (i == -1) {
            if (array == null || array.size() != 16) {
                do {
                    this.f67987v[i2] = null;
                    i2++;
                } while (i2 < 8);
                return;
            }
            do {
                this.f67987v[i2] = m57654a(array, i2 * 2);
                i2++;
            } while (i2 < 8);
        } else if (array == null || array.size() != 4) {
            C28931o[] oVarArr = this.f67987v;
            oVarArr[i] = null;
            oVarArr[i + 1] = null;
        } else {
            this.f67987v[i] = m57654a(array, 0);
            this.f67987v[i + 1] = m57654a(array, 2);
        }
    }

    /* renamed from: a */
    public final void mo49915a(int i, float f, float f2) {
        if (this.f67987v == null) {
            this.f67987v = new C28931o[8];
        }
        int i2 = (i - 1) * 2;
        this.f67987v[i2 + 0] = new C28931o(f, C28931o.EnumC28932a.PX);
        this.f67987v[i2 + 1] = new C28931o(f2, C28931o.EnumC28932a.PX);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo49916a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        if (i5 != this.f67984s || i6 != this.f67985t || i5 <= 0 || i6 <= 0) {
            this.f67984s = i;
            this.f67985t = i2;
            this.f67966a.f67931d = i;
            this.f67966a.f67932e = this.f67985t;
            this.f67966a.f67934g = i3;
            this.f67966a.f67935h = i4;
            this.f67966a.f67936i = i5;
            this.f67966a.f67937j = i6;
            if (this.f67989x == null) {
                this.f67989x = new int[4];
            }
            int[] iArr = this.f67989x;
            iArr[0] = i7;
            iArr[1] = i8;
            iArr[2] = i9;
            iArr[3] = i10;
            this.f67966a.f67938k = iArr;
            m57661e();
            mo49921b();
        }
    }
}
