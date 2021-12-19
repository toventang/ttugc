package com.lynx.tasm.behavior;

import android.graphics.Rect;
import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.behavior.p2052ui.LynxBaseUI;
import com.lynx.tasm.behavior.p2052ui.LynxFlattenUI;
import com.lynx.tasm.behavior.p2052ui.UIGroup;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.lynx.tasm.behavior.k */
public final class C28521k {

    /* renamed from: a */
    public int f67083a;

    /* renamed from: b */
    public WeakReference<C28524l> f67084b;

    /* renamed from: c */
    public LynxBaseUI f67085c;

    /* renamed from: d */
    public LynxBaseUI f67086d;

    /* renamed from: e */
    public LynxBaseUI f67087e;

    /* renamed from: f */
    public ArrayList<C28523b> f67088f;

    /* renamed from: g */
    private float f67089g;

    /* renamed from: h */
    private float f67090h;

    /* renamed from: i */
    private float f67091i;

    /* renamed from: j */
    private float f67092j;

    /* renamed from: k */
    private ArrayList<Float> f67093k;

    /* renamed from: l */
    private float f67094l;

    /* renamed from: m */
    private boolean f67095m;

    /* renamed from: n */
    private boolean f67096n;

    static {
        Covode.recordClassIndex(34519);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.lynx.tasm.behavior.k$a */
    public static class C28522a {

        /* renamed from: a */
        public Rect f67097a;

        /* renamed from: b */
        public Rect f67098b;

        /* renamed from: c */
        public Rect f67099c;

        /* renamed from: d */
        public float f67100d;

        /* renamed from: e */
        public double f67101e;

        /* renamed from: f */
        public String f67102f;

        static {
            Covode.recordClassIndex(34520);
        }

        private C28522a() {
        }

        /* renamed from: a */
        public final void mo49049a() {
            if (this.f67099c == null) {
                this.f67100d = 0.0f;
                return;
            }
            float width = (float) (this.f67098b.width() * this.f67098b.height());
            float width2 = (float) (this.f67099c.width() * this.f67099c.height());
            if (width > 0.0f) {
                this.f67100d = width2 / width;
            } else {
                this.f67100d = 0.0f;
            }
        }

        /* renamed from: b */
        public final JavaOnlyMap mo49050b() {
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            javaOnlyMap.putMap("relativeRect", m57013a(this.f67097a));
            javaOnlyMap.putMap("boundingClientRect", m57013a(this.f67098b));
            javaOnlyMap.putMap("intersectionRect", m57013a(this.f67099c));
            javaOnlyMap.putDouble("intersectionRatio", (double) this.f67100d);
            javaOnlyMap.putDouble("time", this.f67101e);
            javaOnlyMap.putString("observerId", this.f67102f);
            return javaOnlyMap;
        }

        /* synthetic */ C28522a(byte b) {
            this();
        }

        /* renamed from: a */
        private static JavaOnlyMap m57013a(Rect rect) {
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            if (rect != null) {
                javaOnlyMap.putDouble("left", (double) Math.round((float) rect.left));
                javaOnlyMap.putDouble("right", (double) Math.round((float) rect.right));
                javaOnlyMap.putDouble("top", (double) Math.round((float) rect.top));
                javaOnlyMap.putDouble("bottom", (double) Math.round((float) rect.bottom));
            } else {
                javaOnlyMap.putDouble("left", 0.0d);
                javaOnlyMap.putDouble("right", 0.0d);
                javaOnlyMap.putDouble("top", 0.0d);
                javaOnlyMap.putDouble("bottom", 0.0d);
            }
            return javaOnlyMap;
        }
    }

    /* renamed from: com.lynx.tasm.behavior.k$b */
    public static class C28523b {

        /* renamed from: a */
        public LynxBaseUI f67103a;

        /* renamed from: b */
        public int f67104b;

        /* renamed from: c */
        public C28522a f67105c;

        static {
            Covode.recordClassIndex(34521);
        }

        private C28523b() {
        }

        public /* synthetic */ C28523b(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo49045a() {
        if (this.f67088f.size() != 0) {
            Rect b = mo49048b();
            Iterator<C28523b> it = this.f67088f.iterator();
            while (it.hasNext()) {
                mo49047a(it.next(), b, false);
            }
        }
    }

    /* renamed from: b */
    public final Rect mo49048b() {
        Rect boundingClientRect;
        LynxBaseUI lynxBaseUI = this.f67087e;
        if (lynxBaseUI != null) {
            boundingClientRect = lynxBaseUI.getBoundingClientRect();
        } else {
            boundingClientRect = this.f67084b.get().mo49051a().f67068i.getBoundingClientRect();
        }
        boundingClientRect.left = (int) (((float) boundingClientRect.left) - this.f67089g);
        boundingClientRect.right = (int) (((float) boundingClientRect.right) + this.f67090h);
        boundingClientRect.top = (int) (((float) boundingClientRect.top) - this.f67091i);
        boundingClientRect.bottom = (int) (((float) boundingClientRect.bottom) + this.f67092j);
        return boundingClientRect;
    }

    /* renamed from: a */
    public final void mo49046a(ReadableMap readableMap) {
        this.f67089g = (float) readableMap.getDouble("left", 0.0d);
        this.f67090h = (float) readableMap.getDouble("right", 0.0d);
        this.f67091i = (float) readableMap.getDouble("top", 0.0d);
        this.f67092j = (float) readableMap.getDouble("bottom", 0.0d);
    }

    /* renamed from: a */
    private boolean m57008a(C28522a aVar, C28522a aVar2) {
        float f;
        boolean z;
        boolean z2;
        float f2 = -1.0f;
        if (aVar == null || aVar.f67099c == null) {
            f = -1.0f;
        } else {
            f = aVar.f67100d;
        }
        if (aVar2.f67099c != null) {
            f2 = aVar2.f67100d;
        }
        if (f == f2) {
            return false;
        }
        Iterator<Float> it = this.f67093k.iterator();
        while (it.hasNext()) {
            float floatValue = it.next().floatValue();
            if (floatValue == f || floatValue == f2) {
                return true;
            }
            if (floatValue < f) {
                z = true;
            } else {
                z = false;
            }
            if (floatValue < f2) {
                z2 = true;
                continue;
            } else {
                z2 = false;
                continue;
            }
            if (z != z2) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0068 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0068 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.Rect m57007a(com.lynx.tasm.behavior.p2052ui.LynxBaseUI r11, android.graphics.Rect r12, android.graphics.Rect r13) {
        /*
        // Method dump skipped, instructions count: 105
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.behavior.C28521k.m57007a(com.lynx.tasm.behavior.ui.LynxBaseUI, android.graphics.Rect, android.graphics.Rect):android.graphics.Rect");
    }

    public C28521k(C28524l lVar, ReadableMap readableMap, LynxBaseUI lynxBaseUI) {
        this(lVar, -1, -1, readableMap);
        this.f67085c = lynxBaseUI;
        LynxBaseUI lynxBaseUI2 = null;
        String string = readableMap.getString("relativeToIdSelector", null);
        this.f67089g = (float) readableMap.getDouble("marginLeft", 0.0d);
        this.f67090h = (float) readableMap.getDouble("marginRight", 0.0d);
        this.f67091i = (float) readableMap.getDouble("marginTop", 0.0d);
        this.f67092j = (float) readableMap.getDouble("marginBottom", 0.0d);
        if (string != null && string.startsWith("#")) {
            C28529q qVar = this.f67084b.get().mo49051a().f67069j.get();
            String substring = string.substring(1);
            LynxBaseUI lynxBaseUI3 = this.f67085c;
            while (true) {
                if (lynxBaseUI3 != null && lynxBaseUI3.mIdSelector != null && lynxBaseUI3.mIdSelector.equals(substring)) {
                    lynxBaseUI2 = lynxBaseUI3;
                    break;
                }
                if (!qVar.f67111c.f67077r) {
                    lynxBaseUI3 = lynxBaseUI3 instanceof LynxFlattenUI ? lynxBaseUI3.getParentBaseUI() : lynxBaseUI3;
                    if (!(lynxBaseUI3 instanceof UIGroup)) {
                        break;
                    }
                }
                lynxBaseUI3 = lynxBaseUI3.getParentBaseUI();
            }
            this.f67087e = lynxBaseUI2;
        }
        this.f67096n = true;
        C28523b bVar = new C28523b((byte) 0);
        bVar.f67103a = lynxBaseUI;
        this.f67088f.add(bVar);
        mo49047a(bVar, mo49048b(), true);
    }

    /* renamed from: a */
    public final void mo49047a(C28523b bVar, Rect rect, boolean z) {
        String str;
        C28524l lVar = this.f67084b.get();
        if (this.f67084b != null) {
            Rect boundingClientRect = bVar.f67103a.getBoundingClientRect();
            Rect a = m57007a(bVar.f67103a, boundingClientRect, rect);
            C28522a aVar = new C28522a((byte) 0);
            aVar.f67098b = boundingClientRect;
            aVar.f67097a = rect;
            aVar.f67099c = a;
            aVar.f67101e = 0.0d;
            if (bVar.f67103a == null || bVar.f67103a.mIdSelector == null) {
                str = "";
            } else {
                str = bVar.f67103a.mIdSelector;
            }
            aVar.f67102f = str;
            aVar.mo49049a();
            C28522a aVar2 = bVar.f67105c;
            bVar.f67105c = aVar;
            int i = bVar.f67104b;
            if (z) {
                if (this.f67094l >= aVar.f67100d) {
                    return;
                }
            } else if (!m57008a(aVar2, aVar)) {
                return;
            }
            if (this.f67096n) {
                lVar.mo49054a(this.f67085c.getSign(), aVar.mo49050b());
            } else {
                lVar.mo49053a(this.f67083a, i, aVar.mo49050b());
            }
        }
    }

    public C28521k(C28524l lVar, int i, int i2, ReadableMap readableMap) {
        LynxBaseUI lynxBaseUI;
        WeakReference<C28524l> weakReference = new WeakReference<>(lVar);
        this.f67084b = weakReference;
        this.f67083a = i;
        if (i2 != -1) {
            C28529q qVar = weakReference.get().mo49051a().f67069j.get();
            if (qVar != null) {
                lynxBaseUI = qVar.mo49082b(i2);
            } else {
                lynxBaseUI = null;
            }
            this.f67086d = lynxBaseUI;
        } else {
            this.f67086d = weakReference.get().mo49051a().f67068i;
        }
        this.f67093k = new ArrayList<>();
        ReadableArray array = readableMap.getArray("thresholds");
        if (array != null) {
            for (int i3 = 0; i3 < array.size(); i3++) {
                this.f67093k.add(Float.valueOf((float) array.getDouble(i3)));
            }
        } else {
            this.f67093k.add(Float.valueOf(0.0f));
        }
        this.f67094l = (float) readableMap.getDouble("initialRatio", 0.0d);
        this.f67095m = readableMap.getBoolean("observeAll", false);
        this.f67088f = new ArrayList<>();
        this.f67096n = false;
    }
}
