package com.lynx.tasm.p2043a.p2044a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ArgbEvaluator;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableMapKeySetIterator;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.p2052ui.LynxUI;
import com.lynx.tasm.behavior.p2052ui.UIShadowProxy;
import com.lynx.tasm.behavior.p2052ui.utils.BackgroundDrawable;
import com.lynx.tasm.behavior.p2052ui.utils.C28682a;
import com.lynx.tasm.behavior.p2052ui.utils.C28692g;
import com.lynx.tasm.behavior.p2052ui.utils.C28693h;
import com.lynx.tasm.behavior.p2052ui.utils.C28695i;
import com.lynx.tasm.p2043a.C28407b;
import com.lynx.tasm.p2043a.C28419c;
import com.lynx.tasm.p2054c.C28724b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.lynx.tasm.a.a.c */
public class C28397c {

    /* renamed from: a */
    public WeakReference<LynxUI> f66724a;

    /* renamed from: b */
    HashMap<String, Object> f66725b = new HashMap<>();

    /* renamed from: c */
    public ObjectAnimator[] f66726c = null;

    /* renamed from: d */
    public EnumC28404d f66727d = EnumC28404d.IDLE;

    /* renamed from: e */
    public C28407b f66728e = null;

    /* renamed from: f */
    private C28405e f66729f = new C28405e((byte) 0);

    /* renamed from: g */
    private WeakReference<View> f66730g;

    /* renamed from: h */
    private long f66731h = -1;

    /* renamed from: i */
    private C28402b f66732i = null;

    /* renamed from: com.lynx.tasm.a.a.c$c */
    public interface AbstractC28403c {
        static {
            Covode.recordClassIndex(34393);
        }

        /* renamed from: a */
        void mo48831a(String str);
    }

    static {
        Covode.recordClassIndex(34387);
    }

    /* renamed from: com.lynx.tasm.a.a.c$f */
    static class C28406f extends AnimatorListenerAdapter {
        static {
            Covode.recordClassIndex(34396);
        }

        private C28406f() {
        }

        /* synthetic */ C28406f(byte b) {
            this();
        }

        public final void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            animator.cancel();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.lynx.tasm.a.a.c$e */
    public static class C28405e {

        /* renamed from: a */
        long f66755a;

        static {
            Covode.recordClassIndex(34395);
        }

        private C28405e() {
            this.f66755a = -1;
        }

        /* renamed from: a */
        public final long mo48832a() {
            if (this.f66755a == -1) {
                return 0;
            }
            long currentTimeMillis = System.currentTimeMillis() - this.f66755a;
            this.f66755a = -1;
            return currentTimeMillis;
        }

        /* synthetic */ C28405e(byte b) {
            this();
        }
    }

    /* renamed from: i */
    private View m56791i() {
        return this.f66730g.get();
    }

    /* renamed from: j */
    private BackgroundDrawable m56792j() {
        C28682a aVar;
        LynxUI c = mo48822c();
        if (c == null || (aVar = c.mBackgroundManager) == null) {
            return null;
        }
        return aVar.f67659e;
    }

    /* renamed from: b */
    public final boolean mo48821b() {
        if (this.f66727d == EnumC28404d.RUNNING) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final LynxUI mo48822c() {
        return this.f66724a.get();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.lynx.tasm.a.a.c$a */
    public static class C28401a extends AnimatorListenerAdapter {

        /* renamed from: b */
        private static Map<String, Object> f66736b;

        /* renamed from: a */
        WeakReference<C28397c> f66737a;

        static {
            Covode.recordClassIndex(34391);
            HashMap hashMap = new HashMap();
            f66736b = hashMap;
            hashMap.put("animation_type", "keyframe-animation");
            f66736b.put("animation_name", "");
        }

        public final void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
        }

        public C28401a(C28397c cVar) {
            this.f66737a = new WeakReference<>(cVar);
        }

        public final void onAnimationCancel(Animator animator) {
            super.onAnimationCancel(animator);
            if (animator != null) {
                animator.removeAllListeners();
            }
        }

        public final void onAnimationRepeat(Animator animator) {
            String str;
            super.onAnimationRepeat(animator);
            C28397c cVar = this.f66737a.get();
            if (cVar != null) {
                C28407b bVar = cVar.f66728e;
                if (bVar != null) {
                    str = bVar.f66756a;
                } else {
                    str = "";
                }
                m56799a(cVar.mo48822c(), "animationiteration", str);
            }
        }

        public final void onAnimationEnd(Animator animator) {
            String str;
            super.onAnimationEnd(animator);
            C28397c cVar = this.f66737a.get();
            if (cVar != null) {
                C28407b bVar = cVar.f66728e;
                if (bVar != null) {
                    str = bVar.f66756a;
                } else {
                    str = "";
                }
                if (cVar.mo48821b()) {
                    LynxUI c = cVar.mo48822c();
                    m56799a(c, "animationend", str);
                    C28395b.f66722b = true;
                    for (String str2 : C28395b.f66721a.keySet()) {
                        if (str.equals(str2)) {
                            C28395b.f66721a.get(str2);
                        }
                    }
                    C28395b.f66722b = false;
                    while (!C28395b.f66723c.isEmpty()) {
                        C28395b.f66723c.remove().run();
                    }
                    if (c != null) {
                        c.onAnimationEnd(str);
                    }
                    cVar.f66727d = EnumC28404d.IDLE;
                }
                if (!(bVar == null || bVar.f66767l == 1 || bVar.f66767l == 3)) {
                    cVar.mo48823d();
                }
                cVar.f66726c = null;
            }
        }

        /* renamed from: a */
        public static void m56799a(LynxUI lynxUI, String str, String str2) {
            if (lynxUI != null && lynxUI.getEvents() != null && lynxUI.getEvents().containsKey(str)) {
                f66736b.put("animation_name", str2);
                lynxUI.mContext.f67064e.mo49834a(new C28724b(lynxUI.getSign(), str, f66736b));
            }
        }
    }

    /* renamed from: f */
    private boolean m56788f() {
        LynxUI lynxUI = this.f66724a.get();
        if (!m56789g() || lynxUI == null || !lynxUI.hasSizeChanged()) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    private boolean m56789g() {
        C28402b bVar = this.f66732i;
        if (bVar != null && bVar.f66748k) {
            return true;
        }
        C28692g gVar = mo48822c().mTransformOrigin;
        if (gVar == null || !gVar.mo49787e()) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public final void mo48824e() {
        int length;
        ObjectAnimator[] objectAnimatorArr = this.f66726c;
        if (objectAnimatorArr != null && (length = objectAnimatorArr.length) > 0) {
            objectAnimatorArr[length - 1].addListener(new C28401a(this));
        }
    }

    /* renamed from: com.lynx.tasm.a.a.c$3 */
    static /* synthetic */ class C284003 {

        /* renamed from: a */
        static final /* synthetic */ int[] f66735a;

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0023 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002e */
        static {
            /*
                r0 = 34390(0x8656, float:4.819E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.lynx.tasm.a.a.c$d[] r0 = com.lynx.tasm.p2043a.p2044a.C28397c.EnumC28404d.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.lynx.tasm.p2043a.p2044a.C28397c.C284003.f66735a = r2
                com.lynx.tasm.a.a.c$d r0 = com.lynx.tasm.p2043a.p2044a.C28397c.EnumC28404d.IDLE     // Catch:{ NoSuchFieldError -> 0x0018 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0018 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                int[] r2 = com.lynx.tasm.p2043a.p2044a.C28397c.C284003.f66735a     // Catch:{ NoSuchFieldError -> 0x0023 }
                com.lynx.tasm.a.a.c$d r0 = com.lynx.tasm.p2043a.p2044a.C28397c.EnumC28404d.CANCELED     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                int[] r2 = com.lynx.tasm.p2043a.p2044a.C28397c.C284003.f66735a     // Catch:{ NoSuchFieldError -> 0x002e }
                com.lynx.tasm.a.a.c$d r0 = com.lynx.tasm.p2043a.p2044a.C28397c.EnumC28404d.PAUSED     // Catch:{ NoSuchFieldError -> 0x002e }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r2 = com.lynx.tasm.p2043a.p2044a.C28397c.C284003.f66735a     // Catch:{ NoSuchFieldError -> 0x0039 }
                com.lynx.tasm.a.a.c$d r0 = com.lynx.tasm.p2043a.p2044a.C28397c.EnumC28404d.RUNNING     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r0 = 4
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.p2043a.p2044a.C28397c.C284003.<clinit>():void");
        }
    }

    /* renamed from: h */
    private void m56790h() {
        ObjectAnimator[] objectAnimatorArr = this.f66726c;
        if (objectAnimatorArr != null && objectAnimatorArr.length > 0) {
            int i = Build.VERSION.SDK_INT;
            for (ObjectAnimator objectAnimator : this.f66726c) {
                objectAnimator.cancel();
            }
        }
        this.f66728e = null;
        this.f66726c = null;
        this.f66727d = EnumC28404d.CANCELED;
    }

    /* renamed from: com.lynx.tasm.a.a.c$d */
    public enum EnumC28404d {
        IDLE,
        RUNNING,
        PAUSED,
        CANCELED,
        DESTROYED;

        static {
            Covode.recordClassIndex(34394);
        }
    }

    /* renamed from: a */
    public final void mo48819a() {
        m56790h();
        mo48823d();
        this.f66727d = EnumC28404d.DESTROYED;
    }

    /* renamed from: d */
    public final void mo48823d() {
        View i = m56791i();
        LynxUI c = mo48822c();
        if (!(c == null || i == null)) {
            for (Map.Entry<String, Object> entry : this.f66725b.entrySet()) {
                String key = entry.getKey();
                key.hashCode();
                switch (key.hashCode()) {
                    case -1238332596:
                        if (!key.equals("Transform")) {
                            break;
                        } else {
                            c.mBackgroundManager.mo49766a((List) entry.getValue());
                            break;
                        }
                    case 63357246:
                        if (!key.equals("Alpha")) {
                            break;
                        } else {
                            i.setAlpha(((Float) entry.getValue()).floatValue());
                            break;
                        }
                    case 65290051:
                        if (!key.equals("Color")) {
                            break;
                        } else {
                            m56792j().setColor(((Integer) entry.getValue()).intValue());
                            break;
                        }
                    case 290107061:
                        if (!key.equals("BackgroundColor")) {
                            break;
                        } else {
                            i.setBackgroundColor(((Integer) entry.getValue()).intValue());
                            break;
                        }
                }
            }
        }
    }

    /* renamed from: b */
    private void m56786b(C28407b bVar) {
        this.f66727d = EnumC28404d.PAUSED;
        if (this.f66726c != null) {
            int i = Build.VERSION.SDK_INT;
            for (ObjectAnimator objectAnimator : this.f66726c) {
                objectAnimator.pause();
            }
        }
        C28405e eVar = this.f66729f;
        if (eVar.f66755a == -1) {
            eVar.f66755a = System.currentTimeMillis();
        }
        this.f66728e = bVar;
    }

    /* renamed from: c */
    private void m56787c(C28407b bVar) {
        this.f66727d = EnumC28404d.RUNNING;
        if (this.f66726c != null) {
            int i = Build.VERSION.SDK_INT;
            for (ObjectAnimator objectAnimator : this.f66726c) {
                objectAnimator.resume();
            }
        }
        this.f66731h += this.f66729f.mo48832a();
        this.f66728e = bVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.lynx.tasm.a.a.c$b */
    public class C28402b {

        /* renamed from: a */
        public ArrayList<Keyframe> f66738a;

        /* renamed from: b */
        public ArrayList<Keyframe> f66739b;

        /* renamed from: c */
        public ArrayList<Keyframe> f66740c;

        /* renamed from: d */
        public ArrayList<Keyframe> f66741d;

        /* renamed from: e */
        public ArrayList<Keyframe> f66742e;

        /* renamed from: f */
        public ArrayList<Keyframe> f66743f;

        /* renamed from: g */
        public ArrayList<Keyframe> f66744g;

        /* renamed from: h */
        public ArrayList<Keyframe> f66745h;

        /* renamed from: i */
        public ArrayList<Keyframe> f66746i;

        /* renamed from: j */
        public ArrayList<Keyframe> f66747j;

        /* renamed from: k */
        public boolean f66748k;

        /* renamed from: l */
        public boolean[] f66749l;

        /* renamed from: m */
        public boolean[] f66750m;

        /* renamed from: n */
        PropertyValuesHolder[] f66751n;

        /* renamed from: o */
        PropertyValuesHolder[] f66752o;

        static {
            Covode.recordClassIndex(34392);
        }

        private C28402b() {
            this.f66738a = new ArrayList<>();
            this.f66739b = new ArrayList<>();
            this.f66740c = new ArrayList<>();
            this.f66741d = new ArrayList<>();
            this.f66742e = new ArrayList<>();
            this.f66743f = new ArrayList<>();
            this.f66744g = new ArrayList<>();
            this.f66745h = new ArrayList<>();
            this.f66746i = new ArrayList<>();
            this.f66747j = new ArrayList<>();
            this.f66748k = false;
            this.f66749l = new boolean[10];
            this.f66750m = new boolean[10];
        }

        /* synthetic */ C28402b(C28397c cVar, byte b) {
            this();
        }
    }

    /* renamed from: a */
    private static void m56784a(LynxUI lynxUI) {
        int height;
        if (lynxUI.getWidth() > lynxUI.getHeight()) {
            height = lynxUI.getWidth();
        } else {
            height = lynxUI.getHeight();
        }
        if (height > 0) {
            lynxUI.mView.setCameraDistance((float) (height * 100));
        }
    }

    /* renamed from: a */
    public final void mo48820a(C28407b bVar) {
        int i;
        int i2;
        int i3;
        int i4;
        PropertyValuesHolder[] propertyValuesHolderArr;
        long j;
        View view;
        int i5;
        PropertyValuesHolder[] propertyValuesHolderArr2;
        PropertyValuesHolder a;
        float f;
        int i6;
        while (true) {
            if (this.f66728e != null) {
                bVar.f66756a.equals(this.f66728e.f66756a);
            }
            if (mo48822c() != null) {
                int i7 = C284003.f66735a[this.f66727d.ordinal()];
                i = 3;
                i2 = 0;
                i3 = 1;
                if (i7 == 1 || i7 == 2) {
                    C28407b bVar2 = this.f66728e;
                } else if (i7 != 3 && i7 != 4) {
                    return;
                } else {
                    if (!bVar.mo48836a(this.f66728e) || m56788f()) {
                        C28407b bVar3 = this.f66728e;
                        if (!bVar.mo48837b(bVar3) || bVar.f66769n == bVar3.f66769n) {
                            m56790h();
                        } else if (this.f66727d == EnumC28404d.PAUSED) {
                            m56787c(bVar);
                            return;
                        } else {
                            m56786b(bVar);
                            return;
                        }
                    } else {
                        return;
                    }
                }
            } else {
                return;
            }
        }
        C28407b bVar22 = this.f66728e;
        if ((bVar22 == null || !bVar.mo48836a(bVar22)) && bVar.f66757b > 0) {
            View i8 = m56791i();
            LynxUI c = mo48822c();
            if (!(i8 == null || c == null)) {
                if (this.f66732i == null || m56788f()) {
                    ReadableMap keyframes = c.getKeyframes(bVar.f66756a);
                    if (keyframes != null) {
                        C28402b bVar4 = new C28402b(this, (byte) 0);
                        ReadableMapKeySetIterator keySetIterator = keyframes.keySetIterator();
                        loop1:
                        while (true) {
                            float f2 = 1.0f;
                            if (keySetIterator.hasNextKey()) {
                                String nextKey = keySetIterator.nextKey();
                                float parseFloat = Float.parseFloat(nextKey);
                                if (bVar.f66768m == i3 || bVar.f66768m == i) {
                                    parseFloat = 1.0f - parseFloat;
                                }
                                ReadableMap map = keyframes.getMap(nextKey);
                                ReadableMapKeySetIterator keySetIterator2 = map.keySetIterator();
                                while (true) {
                                    if (keySetIterator2.hasNextKey()) {
                                        String nextKey2 = keySetIterator2.nextKey();
                                        if (nextKey2.equals("opacity")) {
                                            m56785a("Alpha", Float.valueOf(m56791i().getAlpha()));
                                            m56783a(parseFloat, i2, bVar4);
                                            float f3 = (float) map.getDouble(nextKey2);
                                            if (f3 < 0.0f || f3 > f2) {
                                                break loop1;
                                            }
                                            bVar4.f66738a.add(Keyframe.ofFloat(parseFloat, f3));
                                        } else {
                                            if (nextKey2.equals("transform")) {
                                                m56785a("Transform", c.mTransformRaw);
                                                List<C28695i> a2 = C28695i.m57467a(map.getArray(nextKey2));
                                                float latestWidth = (float) c.mContext.f67068i.getLatestWidth();
                                                c.mContext.f67068i.getLatestHeight();
                                                C28693h a3 = C28693h.m57450a(a2, latestWidth, (float) c.getLatestWidth(), (float) c.getLatestHeight());
                                                if (a3 == null) {
                                                    break loop1;
                                                }
                                                if (C28695i.m57468a(a2)) {
                                                    i6 = 1;
                                                    bVar4.f66748k = true;
                                                } else {
                                                    i6 = 1;
                                                }
                                                for (C28695i iVar : a2) {
                                                    int i9 = iVar.f67679a;
                                                    if (i9 != i6) {
                                                        if (i9 == 2) {
                                                            m56783a(parseFloat, 1, bVar4);
                                                            bVar4.f66739b.add(Keyframe.ofFloat(parseFloat, a3.mo49788a()));
                                                        } else if (i9 == 4) {
                                                            m56783a(parseFloat, 2, bVar4);
                                                            bVar4.f66740c.add(Keyframe.ofFloat(parseFloat, a3.mo49789b()));
                                                        } else if (i9 != 8) {
                                                            if (i9 != 16) {
                                                                if (i9 != 32) {
                                                                    if (i9 == 64) {
                                                                        m56784a(c);
                                                                        m56783a(parseFloat, 5, bVar4);
                                                                        bVar4.f66743f.add(Keyframe.ofFloat(parseFloat, a3.mo49792e()));
                                                                    } else if (i9 == 128) {
                                                                        m56784a(c);
                                                                        if (c.getWidth() > 0) {
                                                                            c.mView.setCameraDistance((float) (c.getWidth() * 100));
                                                                        }
                                                                        m56783a(parseFloat, 6, bVar4);
                                                                        bVar4.f66744g.add(Keyframe.ofFloat(parseFloat, a3.mo49793f()));
                                                                    } else if (i9 != 256) {
                                                                        if (i9 == 512) {
                                                                            m56783a(parseFloat, 7, bVar4);
                                                                            bVar4.f66745h.add(Keyframe.ofFloat(parseFloat, a3.mo49794g()));
                                                                            m56783a(parseFloat, 8, bVar4);
                                                                            bVar4.f66746i.add(Keyframe.ofFloat(parseFloat, a3.mo49795h()));
                                                                        } else if (i9 == 1024) {
                                                                            m56783a(parseFloat, 7, bVar4);
                                                                            bVar4.f66745h.add(Keyframe.ofFloat(parseFloat, a3.mo49794g()));
                                                                        } else if (i9 == 2048) {
                                                                            m56783a(parseFloat, 8, bVar4);
                                                                            bVar4.f66746i.add(Keyframe.ofFloat(parseFloat, a3.mo49795h()));
                                                                        }
                                                                    }
                                                                }
                                                                m56783a(parseFloat, 4, bVar4);
                                                                bVar4.f66742e.add(Keyframe.ofFloat(parseFloat, a3.mo49791d()));
                                                            }
                                                        } else if (Build.VERSION.SDK_INT >= 21) {
                                                            m56783a(parseFloat, 3, bVar4);
                                                            bVar4.f66741d.add(Keyframe.ofFloat(parseFloat, a3.mo49790c()));
                                                        }
                                                        i6 = 1;
                                                    }
                                                    m56783a(parseFloat, 1, bVar4);
                                                    bVar4.f66739b.add(Keyframe.ofFloat(parseFloat, a3.mo49788a()));
                                                    m56783a(parseFloat, 2, bVar4);
                                                    bVar4.f66740c.add(Keyframe.ofFloat(parseFloat, a3.mo49789b()));
                                                    if (Build.VERSION.SDK_INT >= 21) {
                                                        m56783a(parseFloat, 3, bVar4);
                                                        bVar4.f66741d.add(Keyframe.ofFloat(parseFloat, a3.mo49790c()));
                                                        i6 = 1;
                                                    }
                                                    m56783a(parseFloat, 4, bVar4);
                                                    bVar4.f66742e.add(Keyframe.ofFloat(parseFloat, a3.mo49791d()));
                                                    i6 = 1;
                                                }
                                            } else if (nextKey2.equals("background-color")) {
                                                if (m56792j() == null) {
                                                    m56785a("BackgroundColor", Integer.valueOf(c.getBackgroundColor()));
                                                } else {
                                                    m56785a("Color", Integer.valueOf(c.getBackgroundColor()));
                                                }
                                                m56783a(parseFloat, 9, bVar4);
                                                bVar4.f66747j.add(Keyframe.ofInt(parseFloat, map.getInt(nextKey2)));
                                            }
                                            f2 = 1.0f;
                                        }
                                        i = 3;
                                        i2 = 0;
                                        i3 = 1;
                                    }
                                }
                            } else {
                                if (m56792j() != null) {
                                    i5 = 2;
                                } else {
                                    i5 = 1;
                                }
                                int i10 = 0;
                                do {
                                    View i11 = m56791i();
                                    LynxUI c2 = mo48822c();
                                    if (i11 != null && c2 != null) {
                                        ArrayList arrayList = new ArrayList();
                                        C283992 r12 = new Comparator<Keyframe>() {
                                            /* class com.lynx.tasm.p2043a.p2044a.C28397c.C283992 */

                                            static {
                                                Covode.recordClassIndex(34389);
                                            }

                                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                                            @Override // java.util.Comparator
                                            public final /* synthetic */ int compare(Keyframe keyframe, Keyframe keyframe2) {
                                                return Float.compare(keyframe.getFraction(), keyframe2.getFraction());
                                            }
                                        };
                                        if (bVar4.f66738a.size() != 0 && i10 == 0) {
                                            if (!bVar4.f66749l[0]) {
                                                bVar4.f66738a.add(Keyframe.ofFloat(0.0f, i11.getAlpha()));
                                            }
                                            if (!bVar4.f66750m[0]) {
                                                bVar4.f66738a.add(Keyframe.ofFloat(1.0f, i11.getAlpha()));
                                            }
                                            Collections.sort(bVar4.f66738a, r12);
                                            arrayList.add(m56782a(bVar4.f66738a, "Alpha"));
                                        }
                                        if (bVar4.f66739b.size() != 0 && i10 == 0) {
                                            if (!bVar4.f66749l[1]) {
                                                bVar4.f66739b.add(Keyframe.ofFloat(0.0f, i11.getTranslationX()));
                                            }
                                            if (!bVar4.f66750m[1]) {
                                                bVar4.f66739b.add(Keyframe.ofFloat(1.0f, i11.getTranslationX()));
                                            }
                                            Collections.sort(bVar4.f66739b, r12);
                                            arrayList.add(m56782a(bVar4.f66739b, "TranslationX"));
                                        }
                                        if (bVar4.f66740c.size() != 0 && i10 == 0) {
                                            if (!bVar4.f66749l[2]) {
                                                bVar4.f66740c.add(Keyframe.ofFloat(0.0f, i11.getTranslationY()));
                                            }
                                            if (!bVar4.f66750m[2]) {
                                                bVar4.f66740c.add(Keyframe.ofFloat(1.0f, i11.getTranslationY()));
                                            }
                                            Collections.sort(bVar4.f66740c, r12);
                                            arrayList.add(m56782a(bVar4.f66740c, "TranslationY"));
                                        }
                                        if (bVar4.f66741d.size() != 0 && i10 == 0) {
                                            if (Build.VERSION.SDK_INT >= 21) {
                                                f = i11.getTranslationZ();
                                            } else {
                                                f = 0.0f;
                                            }
                                            if (!bVar4.f66749l[3]) {
                                                bVar4.f66741d.add(Keyframe.ofFloat(0.0f, f));
                                            }
                                            if (!bVar4.f66750m[3]) {
                                                bVar4.f66741d.add(Keyframe.ofFloat(1.0f, f));
                                            }
                                            Collections.sort(bVar4.f66741d, r12);
                                            arrayList.add(m56782a(bVar4.f66741d, "TranslationZ"));
                                        }
                                        if (bVar4.f66742e.size() != 0 && i10 == 0) {
                                            if (!bVar4.f66749l[4]) {
                                                bVar4.f66742e.add(Keyframe.ofFloat(0.0f, i11.getRotation()));
                                            }
                                            if (!bVar4.f66750m[4]) {
                                                bVar4.f66742e.add(Keyframe.ofFloat(1.0f, i11.getRotation()));
                                            }
                                            Collections.sort(bVar4.f66742e, r12);
                                            arrayList.add(m56782a(bVar4.f66742e, "Rotation"));
                                        }
                                        if (bVar4.f66743f.size() != 0 && i10 == 0) {
                                            if (!bVar4.f66749l[5]) {
                                                bVar4.f66743f.add(Keyframe.ofFloat(0.0f, i11.getRotationX()));
                                            }
                                            if (!bVar4.f66750m[5]) {
                                                bVar4.f66743f.add(Keyframe.ofFloat(1.0f, i11.getRotationX()));
                                            }
                                            Collections.sort(bVar4.f66743f, r12);
                                            arrayList.add(m56782a(bVar4.f66743f, "RotationX"));
                                        }
                                        if (bVar4.f66744g.size() != 0 && i10 == 0) {
                                            if (!bVar4.f66749l[6]) {
                                                bVar4.f66744g.add(Keyframe.ofFloat(0.0f, i11.getRotationY()));
                                            }
                                            if (!bVar4.f66750m[6]) {
                                                bVar4.f66744g.add(Keyframe.ofFloat(1.0f, i11.getRotationY()));
                                            }
                                            Collections.sort(bVar4.f66744g, r12);
                                            arrayList.add(m56782a(bVar4.f66744g, "RotationY"));
                                        }
                                        if (bVar4.f66745h.size() != 0 && i10 == 0) {
                                            if (!bVar4.f66749l[7]) {
                                                bVar4.f66745h.add(Keyframe.ofFloat(0.0f, i11.getScaleX()));
                                            }
                                            if (!bVar4.f66750m[7]) {
                                                bVar4.f66745h.add(Keyframe.ofFloat(1.0f, i11.getScaleX()));
                                            }
                                            Collections.sort(bVar4.f66745h, r12);
                                            arrayList.add(m56782a(bVar4.f66745h, "ScaleX"));
                                        }
                                        if (bVar4.f66746i.size() != 0 && i10 == 0) {
                                            if (!bVar4.f66749l[8]) {
                                                bVar4.f66746i.add(Keyframe.ofFloat(0.0f, i11.getScaleY()));
                                            }
                                            if (!bVar4.f66750m[8]) {
                                                bVar4.f66746i.add(Keyframe.ofFloat(1.0f, i11.getScaleY()));
                                            }
                                            Collections.sort(bVar4.f66746i, r12);
                                            arrayList.add(m56782a(bVar4.f66746i, "ScaleY"));
                                        }
                                        if (bVar4.f66747j.size() != 0 && i10 + 1 == i5) {
                                            if (!bVar4.f66749l[9]) {
                                                bVar4.f66747j.add(Keyframe.ofInt(0.0f, c2.getBackgroundColor()));
                                            }
                                            if (!bVar4.f66750m[9]) {
                                                bVar4.f66747j.add(Keyframe.ofInt(1.0f, c2.getBackgroundColor()));
                                            }
                                            Collections.sort(bVar4.f66747j, r12);
                                            if (i10 == 0) {
                                                a = m56782a(bVar4.f66747j, "BackgroundColor");
                                            } else {
                                                a = m56782a(bVar4.f66747j, "Color");
                                            }
                                            a.setEvaluator(new ArgbEvaluator());
                                            arrayList.add(a);
                                        }
                                        if (!(arrayList.size() == 0 || (propertyValuesHolderArr2 = (PropertyValuesHolder[]) arrayList.toArray(new PropertyValuesHolder[arrayList.size()])) == null)) {
                                            if (i10 == 0) {
                                                bVar4.f66751n = propertyValuesHolderArr2;
                                            } else if (i10 == 1) {
                                                bVar4.f66752o = propertyValuesHolderArr2;
                                            }
                                        }
                                    }
                                    i10++;
                                } while (i10 < i5);
                                this.f66732i = bVar4;
                            }
                        }
                    }
                    LLog.m56856a(6, "Lynx", "Keyframes input error.");
                    return;
                }
                if (this.f66731h != -1 && bVar.f66769n == 1) {
                    this.f66731h += this.f66729f.mo48832a();
                }
                BackgroundDrawable j2 = m56792j();
                if (j2 != null) {
                    i4 = 2;
                } else {
                    i4 = 1;
                }
                ObjectAnimator[] objectAnimatorArr = new ObjectAnimator[i4];
                int i12 = 0;
                int i13 = 0;
                do {
                    C28402b bVar5 = this.f66732i;
                    if (i13 == 1) {
                        propertyValuesHolderArr = bVar5.f66752o;
                    } else {
                        propertyValuesHolderArr = bVar5.f66751n;
                    }
                    if (propertyValuesHolderArr != null) {
                        if (i13 == 1) {
                            view = j2;
                        } else {
                            view = i8;
                        }
                        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, propertyValuesHolderArr);
                        ofPropertyValuesHolder.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                            /* class com.lynx.tasm.p2043a.p2044a.C28397c.C283981 */

                            static {
                                Covode.recordClassIndex(34388);
                            }

                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                if (C28397c.this.f66724a.get() != null && (C28397c.this.f66724a.get().mParent instanceof UIShadowProxy)) {
                                    ((UIShadowProxy) C28397c.this.f66724a.get().mParent).invalidate();
                                }
                            }
                        });
                        objectAnimatorArr[i13] = ofPropertyValuesHolder;
                        ofPropertyValuesHolder.setDuration(bVar.f66757b);
                        ofPropertyValuesHolder.setRepeatCount(bVar.f66766k);
                        if (bVar.f66768m == 2 || bVar.f66768m == 3) {
                            ofPropertyValuesHolder.setRepeatMode(2);
                        } else {
                            ofPropertyValuesHolder.setRepeatMode(1);
                        }
                        ofPropertyValuesHolder.setInterpolator(C28419c.m56829a(bVar));
                        if (bVar.f66758c != 0 && (bVar.f66767l == 2 || bVar.f66767l == 3)) {
                            ObjectAnimator clone = ofPropertyValuesHolder.clone();
                            clone.setDuration(10000000L);
                            clone.addListener(new C28406f((byte) 0));
                            clone.start();
                        }
                        i12++;
                        ofPropertyValuesHolder.setStartDelay(bVar.f66758c);
                        if (this.f66731h != -1) {
                            long currentTimeMillis = System.currentTimeMillis() - this.f66731h;
                            if (currentTimeMillis < bVar.f66758c) {
                                ofPropertyValuesHolder.setStartDelay(bVar.f66758c - currentTimeMillis);
                            } else {
                                ofPropertyValuesHolder.setCurrentPlayTime(currentTimeMillis - bVar.f66758c);
                            }
                        }
                        ofPropertyValuesHolder.start();
                    }
                    i13++;
                } while (i13 < i4);
                int i14 = 0;
                if (i12 == 0) {
                    this.f66726c = null;
                } else if (i12 == i4) {
                    this.f66726c = objectAnimatorArr;
                } else {
                    this.f66726c = new ObjectAnimator[i12];
                    int i15 = 0;
                    do {
                        ObjectAnimator objectAnimator = objectAnimatorArr[i14];
                        if (objectAnimator != null) {
                            this.f66726c[i15] = objectAnimator;
                            i15++;
                        }
                        i14++;
                    } while (i14 < i4);
                }
                mo48824e();
                if (this.f66731h == -1) {
                    this.f66731h = System.currentTimeMillis();
                }
                if (((double) bVar.f66766k) >= 9.99999999E8d) {
                    j = Long.MAX_VALUE;
                } else {
                    j = (bVar.f66757b * ((long) (bVar.f66766k + 1))) + bVar.f66758c;
                }
                if (System.currentTimeMillis() - this.f66731h < j) {
                    if (this.f66727d == EnumC28404d.IDLE) {
                        C28401a.m56799a(c, "animationstart", bVar.f66756a);
                    }
                    if (bVar.f66769n == 0) {
                        m56786b(bVar);
                        this.f66727d = EnumC28404d.PAUSED;
                    } else if (bVar.f66769n == 1) {
                        this.f66727d = EnumC28404d.RUNNING;
                    }
                }
                this.f66728e = bVar;
            }
        }
    }

    /* renamed from: a */
    private void m56785a(String str, Object obj) {
        if (!this.f66725b.containsKey(str)) {
            this.f66725b.put(str, obj);
        }
    }

    /* renamed from: a */
    private static PropertyValuesHolder m56782a(ArrayList<Keyframe> arrayList, String str) {
        return PropertyValuesHolder.ofKeyframe(str, (Keyframe[]) arrayList.toArray(new Keyframe[arrayList.size()]));
    }

    public C28397c(View view, LynxUI lynxUI) {
        this.f66724a = new WeakReference<>(lynxUI);
        this.f66730g = new WeakReference<>(view);
    }

    /* renamed from: a */
    private static void m56783a(float f, int i, C28402b bVar) {
        if (f == 0.0f) {
            bVar.f66749l[i] = true;
        }
        if (f == 1.0f) {
            bVar.f66750m[i] = true;
        }
    }
}
