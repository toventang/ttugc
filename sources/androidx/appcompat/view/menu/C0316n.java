package androidx.appcompat.view.menu;

import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.AbstractC0318o;
import androidx.core.p037h.C0774e;
import androidx.core.p037h.C0792v;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.trill.R;
import java.lang.reflect.Field;

/* renamed from: androidx.appcompat.view.menu.n */
public class C0316n {

    /* renamed from: a */
    public View f1159a;

    /* renamed from: b */
    public int f1160b;

    /* renamed from: c */
    public PopupWindow.OnDismissListener f1161c;

    /* renamed from: d */
    private final Context f1162d;

    /* renamed from: e */
    private final C0302h f1163e;

    /* renamed from: f */
    private final boolean f1164f;

    /* renamed from: g */
    private final int f1165g;

    /* renamed from: h */
    private final int f1166h;

    /* renamed from: i */
    private boolean f1167i;

    /* renamed from: j */
    private AbstractC0318o.AbstractC0319a f1168j;

    /* renamed from: k */
    private AbstractC0315m f1169k;

    /* renamed from: l */
    private final PopupWindow.OnDismissListener f1170l;

    static {
        Covode.recordClassIndex(353);
    }

    /* renamed from: c */
    public final void mo1132c() {
        if (mo1134e()) {
            this.f1169k.mo918d();
        }
    }

    /* renamed from: d */
    public void mo1133d() {
        this.f1169k = null;
        PopupWindow.OnDismissListener onDismissListener = this.f1161c;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    /* renamed from: e */
    public final boolean mo1134e() {
        AbstractC0315m mVar = this.f1169k;
        if (mVar == null || !mVar.mo919e()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final boolean mo1131b() {
        if (mo1134e()) {
            return true;
        }
        if (this.f1159a == null) {
            return false;
        }
        mo1128a(0, 0, false, false);
        return true;
    }

    /* renamed from: a */
    public final AbstractC0315m mo1127a() {
        AbstractC0315m tVar;
        if (this.f1169k == null) {
            Display defaultDisplay = ((WindowManager) m1186a(this.f1162d, "window")).getDefaultDisplay();
            Point point = new Point();
            int i = Build.VERSION.SDK_INT;
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= this.f1162d.getResources().getDimensionPixelSize(R.dimen.z)) {
                tVar = new View$OnKeyListenerC0293e(this.f1162d, this.f1159a, this.f1165g, this.f1166h, this.f1164f);
            } else {
                tVar = new View$OnKeyListenerC0325t(this.f1162d, this.f1163e, this.f1159a, this.f1165g, this.f1166h, this.f1164f);
            }
            tVar.mo912a(this.f1163e);
            tVar.mo911a(this.f1170l);
            tVar.mo910a(this.f1159a);
            tVar.mo894a(this.f1168j);
            tVar.mo914b(this.f1167i);
            tVar.mo908a(this.f1160b);
            this.f1169k = tVar;
        }
        return this.f1169k;
    }

    /* renamed from: a */
    public final void mo1129a(AbstractC0318o.AbstractC0319a aVar) {
        this.f1168j = aVar;
        AbstractC0315m mVar = this.f1169k;
        if (mVar != null) {
            mVar.mo894a(aVar);
        }
    }

    /* renamed from: a */
    public final void mo1130a(boolean z) {
        this.f1167i = z;
        AbstractC0315m mVar = this.f1169k;
        if (mVar != null) {
            mVar.mo914b(z);
        }
    }

    /* renamed from: a */
    private static Object m1186a(Context context, String str) {
        Object systemService;
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!C58027i.f132247b && "connectivity".equals(str)) {
                try {
                    new C21708b().mo35361a();
                    C58027i.f132247b = true;
                    return context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            return context.getSystemService(str);
        } else if (!C58027i.f132246a) {
            return context.getSystemService(str);
        } else {
            synchronized (ClipboardManager.class) {
                systemService = context.getSystemService(str);
                if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                    try {
                        Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                        declaredField.setAccessible(true);
                        declaredField.set(systemService, new C58027i.HandlerC58028a((Handler) declaredField.get(systemService)));
                    } catch (Exception e) {
                        C13849d.m25015a(e, "ClipboardManager Handler Reflect Fail");
                    }
                }
                C58027i.f132246a = false;
            }
            return systemService;
        }
    }

    public C0316n(Context context, C0302h hVar, View view, boolean z) {
        this(context, hVar, view, z, R.attr.ho, 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo1128a(int i, int i2, boolean z, boolean z2) {
        AbstractC0315m a = mo1127a();
        a.mo917c(z2);
        if (z) {
            if ((C0774e.m2693a(this.f1160b, C0792v.m2768e(this.f1159a)) & 7) == 5) {
                i -= this.f1159a.getWidth();
            }
            a.mo913b(i);
            a.mo916c(i2);
            int i3 = (int) ((this.f1162d.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a.f1158g = new Rect(i - i3, i2 - i3, i + i3, i2 + i3);
        }
        a.mo915c();
    }

    public C0316n(Context context, C0302h hVar, View view, boolean z, int i, int i2) {
        this.f1160b = 8388611;
        this.f1170l = new PopupWindow.OnDismissListener() {
            /* class androidx.appcompat.view.menu.C0316n.C03171 */

            static {
                Covode.recordClassIndex(354);
            }

            public final void onDismiss() {
                C0316n.this.mo1133d();
            }
        };
        this.f1162d = context;
        this.f1163e = hVar;
        this.f1159a = view;
        this.f1164f = z;
        this.f1165g = i;
        this.f1166h = i2;
    }
}
