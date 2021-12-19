package com.lynx.tasm.p2057f.p2058a;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.DisplayList;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* renamed from: com.lynx.tasm.f.a.b */
public class C28775b extends AbstractC28774a {

    /* renamed from: j */
    private static Method f67850j;

    /* renamed from: k */
    private static Method f67851k;

    /* renamed from: l */
    private static Method f67852l;

    /* renamed from: m */
    private static Method f67853m;

    /* renamed from: n */
    private static Method f67854n;

    /* renamed from: o */
    private static Method f67855o;

    /* renamed from: p */
    private static Method f67856p;

    /* renamed from: b */
    int f67857b;

    /* renamed from: c */
    int f67858c;

    /* renamed from: d */
    int f67859d;

    /* renamed from: e */
    int f67860e;

    /* renamed from: f */
    int f67861f;

    /* renamed from: g */
    int f67862g;

    /* renamed from: h */
    DisplayList f67863h;

    /* renamed from: i */
    Constructor<?> f67864i;

    static {
        Covode.recordClassIndex(34874);
    }

    @Override // com.lynx.tasm.p2057f.p2058a.AbstractC28774a
    /* renamed from: b */
    public boolean mo49896b() {
        try {
            if (f67850j == null) {
                Method declaredMethod = DisplayList.class.getDeclaredMethod("isValid", new Class[0]);
                f67850j = declaredMethod;
                declaredMethod.setAccessible(true);
            }
            return ((Boolean) f67850j.invoke(this.f67863h, new Object[0])).booleanValue();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /* access modifiers changed from: package-private */
    @Override // com.lynx.tasm.p2057f.p2058a.AbstractC28774a
    /* renamed from: a */
    public void mo49891a() {
        try {
            if (this.f67864i == null) {
                Constructor<?> constructor = Class.forName("android.view.GLES20DisplayList").getConstructor(new Class[0]);
                this.f67864i = constructor;
                constructor.setAccessible(true);
            }
            this.f67863h = (DisplayList) this.f67864i.newInstance(new Object[0]);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.lynx.tasm.p2057f.p2058a.AbstractC28774a
    /* renamed from: a */
    public void mo49893a(Canvas canvas) {
        mo49897a(canvas, this.f67863h);
    }

    @Override // com.lynx.tasm.p2057f.p2058a.AbstractC28774a
    /* renamed from: b */
    public void mo49895b(Canvas canvas) {
        try {
            if (f67853m == null) {
                Method declaredMethod = Canvas.class.getDeclaredMethod("onPostDraw", new Class[0]);
                f67853m = declaredMethod;
                declaredMethod.setAccessible(true);
            }
            f67853m.invoke(canvas, new Object[0]);
            try {
                if (f67856p == null) {
                    Method declaredMethod2 = DisplayList.class.getDeclaredMethod("end", new Class[0]);
                    f67856p = declaredMethod2;
                    declaredMethod2.setAccessible(true);
                }
                f67856p.invoke(this.f67863h, new Object[0]);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // com.lynx.tasm.p2057f.p2058a.AbstractC28774a
    /* renamed from: a */
    public final void mo49892a(int i, int i2) {
        this.f67857b = 0;
        this.f67858c = 0;
        this.f67859d = i;
        this.f67860e = i2;
    }

    @Override // com.lynx.tasm.p2057f.p2058a.AbstractC28774a
    /* renamed from: b */
    public Canvas mo49894b(int i, int i2) {
        this.f67861f = i;
        this.f67862g = i2;
        try {
            if (f67851k == null) {
                Method declaredMethod = DisplayList.class.getDeclaredMethod("start", new Class[0]);
                f67851k = declaredMethod;
                declaredMethod.setAccessible(true);
            }
            Canvas canvas = (Canvas) f67851k.invoke(this.f67863h, new Object[0]);
            m57594a(i, i2, canvas);
            try {
                if (f67852l == null) {
                    Method declaredMethod2 = Canvas.class.getDeclaredMethod("onPreDraw", Rect.class);
                    f67852l = declaredMethod2;
                    declaredMethod2.setAccessible(true);
                }
                f67852l.invoke(canvas, null);
                return canvas;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }

    /* renamed from: a */
    public void mo49897a(Canvas canvas, Object obj) {
        try {
            if (f67855o == null) {
                Method declaredMethod = Canvas.class.getDeclaredMethod("drawDisplayList", DisplayList.class, Integer.TYPE, Integer.TYPE, Rect.class);
                f67855o = declaredMethod;
                declaredMethod.setAccessible(true);
            }
            f67855o.invoke(canvas, obj, Integer.valueOf(this.f67861f), Integer.valueOf(this.f67862g), null);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    static void m57594a(int i, int i2, Canvas canvas) {
        try {
            if (f67854n == null) {
                Method declaredMethod = Canvas.class.getDeclaredMethod("setViewport", Integer.TYPE, Integer.TYPE);
                f67854n = declaredMethod;
                declaredMethod.setAccessible(true);
            }
            f67854n.invoke(canvas, Integer.valueOf(i), Integer.valueOf(i2));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
