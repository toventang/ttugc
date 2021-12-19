package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ClipboardManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.app.C0214b;
import androidx.appcompat.p017a.p018a.C0196a;
import androidx.appcompat.view.AbstractC0274b;
import androidx.appcompat.view.C0277d;
import androidx.appcompat.view.C0278e;
import androidx.appcompat.view.C0279f;
import androidx.appcompat.view.C0281g;
import androidx.appcompat.view.Window$CallbackC0286i;
import androidx.appcompat.view.menu.AbstractC0318o;
import androidx.appcompat.view.menu.AbstractC0320p;
import androidx.appcompat.view.menu.C0299f;
import androidx.appcompat.view.menu.C0302h;
import androidx.appcompat.widget.AbstractC0453u;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.C0405al;
import androidx.appcompat.widget.C0428h;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.ViewStubCompat;
import androidx.core.app.C0593g;
import androidx.core.p037h.AbstractC0750aa;
import androidx.core.p037h.C0751ab;
import androidx.core.p037h.C0777g;
import androidx.core.p037h.C0792v;
import androidx.core.p037h.C0807z;
import androidx.core.widget.C0822g;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.helios.sdk.C15346a;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.trill.R;
import java.lang.Thread;
import java.lang.reflect.Field;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.app.g */
public final class LayoutInflater$Factory2C0221g extends AbstractC0220f implements LayoutInflater.Factory2, C0302h.AbstractC0303a {

    /* renamed from: x */
    private static final boolean f648x;

    /* renamed from: y */
    private static final int[] f649y = {16842836};

    /* renamed from: z */
    private static boolean f650z = true;

    /* renamed from: A */
    private CharSequence f651A;

    /* renamed from: B */
    private AbstractC0453u f652B;

    /* renamed from: C */
    private C0231b f653C;

    /* renamed from: D */
    private C0239h f654D;

    /* renamed from: E */
    private boolean f655E;

    /* renamed from: F */
    private TextView f656F;

    /* renamed from: G */
    private View f657G;

    /* renamed from: H */
    private boolean f658H;

    /* renamed from: I */
    private boolean f659I;

    /* renamed from: J */
    private boolean f660J;

    /* renamed from: K */
    private C0238g[] f661K;

    /* renamed from: L */
    private C0238g f662L;

    /* renamed from: M */
    private boolean f663M;

    /* renamed from: N */
    private int f664N = -100;

    /* renamed from: O */
    private boolean f665O;

    /* renamed from: P */
    private C0235e f666P;

    /* renamed from: Q */
    private final Runnable f667Q = new Runnable() {
        /* class androidx.appcompat.app.LayoutInflater$Factory2C0221g.RunnableC02232 */

        static {
            Covode.recordClassIndex(257);
        }

        public final void run() {
            if ((LayoutInflater$Factory2C0221g.this.f693w & 1) != 0) {
                LayoutInflater$Factory2C0221g.this.mo543f(0);
            }
            if ((LayoutInflater$Factory2C0221g.this.f693w & 4096) != 0) {
                LayoutInflater$Factory2C0221g.this.mo543f(108);
            }
            LayoutInflater$Factory2C0221g.this.f692v = false;
            LayoutInflater$Factory2C0221g.this.f693w = 0;
        }
    };

    /* renamed from: R */
    private boolean f668R;

    /* renamed from: S */
    private Rect f669S;

    /* renamed from: T */
    private Rect f670T;

    /* renamed from: U */
    private AppCompatViewInflater f671U;

    /* renamed from: b */
    final Context f672b;

    /* renamed from: c */
    final Window f673c;

    /* renamed from: d */
    final Window.Callback f674d;

    /* renamed from: e */
    final Window.Callback f675e;

    /* renamed from: f */
    final AbstractC0219e f676f;

    /* renamed from: g */
    public AbstractC0211a f677g;

    /* renamed from: h */
    MenuInflater f678h;

    /* renamed from: i */
    AbstractC0274b f679i;

    /* renamed from: j */
    ActionBarContextView f680j;

    /* renamed from: k */
    PopupWindow f681k;

    /* renamed from: l */
    Runnable f682l;

    /* renamed from: m */
    C0807z f683m;

    /* renamed from: n */
    boolean f684n = true;

    /* renamed from: o */
    public ViewGroup f685o;

    /* renamed from: p */
    boolean f686p;

    /* renamed from: q */
    boolean f687q;

    /* renamed from: r */
    boolean f688r;

    /* renamed from: s */
    boolean f689s;

    /* renamed from: t */
    boolean f690t;

    /* renamed from: u */
    boolean f691u;

    /* renamed from: v */
    boolean f692v;

    /* renamed from: w */
    int f693w;

    /* renamed from: a */
    private static void m708a(WindowManager windowManager, View view) {
        if (!((Boolean) C15346a.m28238a(windowManager, new Object[]{view}, 102801, "void", false, null).first).booleanValue()) {
            windowManager.removeView(view);
            C15346a.m28240a(null, windowManager, new Object[]{view}, 102801, "androidx_appcompat_app_AppCompatDelegateImpl_android_view_WindowManager_removeView(Landroid/view/WindowManager;Landroid/view/View;)V");
        }
    }

    /* renamed from: a */
    private static void m709a(WindowManager windowManager, View view, ViewGroup.LayoutParams layoutParams) {
        if (!((Boolean) C15346a.m28238a(windowManager, new Object[]{view, layoutParams}, 102800, "void", false, null).first).booleanValue()) {
            windowManager.addView(view, layoutParams);
            C15346a.m28240a(null, windowManager, new Object[]{view, layoutParams}, 102800, "androidx_appcompat_app_AppCompatDelegateImpl_android_view_WindowManager_addView(Landroid/view/WindowManager;Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V");
        }
    }

    /* renamed from: i */
    private static int m718i(int i) {
        if (i == 8) {
            return 108;
        }
        if (i == 9) {
            return 109;
        }
        return i;
    }

    @Override // androidx.appcompat.app.AbstractC0220f
    /* renamed from: c */
    public final void mo523c() {
        m723r();
    }

    @Override // androidx.appcompat.app.AbstractC0220f
    /* renamed from: d */
    public final void mo525d() {
        mo532k();
    }

    @Override // androidx.appcompat.app.AbstractC0220f
    /* renamed from: a */
    public final void mo514a(Bundle bundle) {
        Window.Callback callback = this.f674d;
        if (callback instanceof Activity) {
            String str = null;
            try {
                str = C0593g.m2227b((Activity) callback);
            } catch (IllegalArgumentException unused) {
            }
            if (str != null) {
                AbstractC0211a aVar = this.f677g;
                if (aVar == null) {
                    this.f668R = true;
                } else {
                    aVar.mo420b(true);
                }
            }
        }
        if (bundle != null && this.f664N == -100) {
            this.f664N = bundle.getInt("appcompat:local_night_mode", -100);
        }
    }

    @Override // androidx.appcompat.app.AbstractC0220f
    /* renamed from: a */
    public final void mo517a(Toolbar toolbar) {
        if (this.f674d instanceof Activity) {
            AbstractC0211a a = mo511a();
            if (!(a instanceof C0252m)) {
                this.f678h = null;
                if (a != null) {
                    a.mo430j();
                }
                if (toolbar != null) {
                    C0243j jVar = new C0243j(toolbar, ((Activity) this.f674d).getTitle(), this.f675e);
                    this.f677g = jVar;
                    this.f673c.setCallback(jVar.f740c);
                } else {
                    this.f677g = null;
                    this.f673c.setCallback(this.f675e);
                }
                mo528g();
                return;
            }
            throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
        }
    }

    @Override // androidx.appcompat.app.AbstractC0220f
    /* renamed from: a */
    public final void mo513a(Configuration configuration) {
        AbstractC0211a a;
        if (this.f686p && this.f655E && (a = mo511a()) != null) {
            a.mo414a(configuration);
        }
        C0428h.m1581a().mo1929a(this.f672b);
        mo532k();
    }

    @Override // androidx.appcompat.app.AbstractC0220f
    /* renamed from: a */
    public final void mo515a(View view) {
        m723r();
        ViewGroup viewGroup = (ViewGroup) this.f685o.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f674d.onContentChanged();
    }

    @Override // androidx.appcompat.app.AbstractC0220f
    /* renamed from: a */
    public final void mo516a(View view, ViewGroup.LayoutParams layoutParams) {
        m723r();
        ViewGroup viewGroup = (ViewGroup) this.f685o.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f674d.onContentChanged();
    }

    @Override // androidx.appcompat.app.AbstractC0220f
    /* renamed from: a */
    public final void mo518a(CharSequence charSequence) {
        this.f651A = charSequence;
        AbstractC0453u uVar = this.f652B;
        if (uVar != null) {
            uVar.setWindowTitle(charSequence);
            return;
        }
        AbstractC0211a aVar = this.f677g;
        if (aVar != null) {
            aVar.mo415a(charSequence);
            return;
        }
        TextView textView = this.f656F;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    @Override // androidx.appcompat.app.AbstractC0220f
    /* renamed from: a */
    public final AbstractC0274b mo512a(AbstractC0274b.AbstractC0275a aVar) {
        AbstractC0219e eVar;
        if (aVar != null) {
            AbstractC0274b bVar = this.f679i;
            if (bVar != null) {
                bVar.mo621c();
            }
            C0232c cVar = new C0232c(aVar);
            AbstractC0211a a = mo511a();
            if (a != null) {
                AbstractC0274b a2 = a.mo410a(cVar);
                this.f679i = a2;
                if (!(a2 == null || (eVar = this.f676f) == null)) {
                    eVar.onSupportActionModeStarted(a2);
                }
            }
            if (this.f679i == null) {
                this.f679i = m713b(cVar);
            }
            return this.f679i;
        }
        throw new IllegalArgumentException("ActionMode callback can not be null.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo537a(int i, KeyEvent keyEvent) {
        AbstractC0211a a = mo511a();
        if (a != null && a.mo417a(i, keyEvent)) {
            return true;
        }
        C0238g gVar = this.f662L;
        if (gVar == null || !m712a(gVar, keyEvent.getKeyCode(), keyEvent)) {
            if (this.f662L == null) {
                C0238g e = mo542e(0);
                m715b(e, keyEvent);
                boolean a2 = m712a(e, keyEvent.getKeyCode(), keyEvent);
                e.f727m = false;
                if (a2) {
                    return true;
                }
            }
            return false;
        }
        C0238g gVar2 = this.f662L;
        if (gVar2 != null) {
            gVar2.f728n = true;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00c4, code lost:
        if (r0 != false) goto L_0x00c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x00f9, code lost:
        if (m715b(r1, r7) != false) goto L_0x00fb;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo538a(android.view.KeyEvent r7) {
        /*
        // Method dump skipped, instructions count: 256
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.LayoutInflater$Factory2C0221g.mo538a(android.view.KeyEvent):boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo535a(C0238g gVar, boolean z) {
        AbstractC0453u uVar;
        if (!z || gVar.f715a != 0 || (uVar = this.f652B) == null || !uVar.mo1229c()) {
            WindowManager windowManager = (WindowManager) m707a(this.f672b, "window");
            if (!(windowManager == null || !gVar.f729o || gVar.f721g == null)) {
                m708a(windowManager, gVar.f721g);
                if (z) {
                    mo534a(gVar.f715a, gVar, (Menu) null);
                }
            }
            gVar.f727m = false;
            gVar.f728n = false;
            gVar.f729o = false;
            gVar.f722h = null;
            gVar.f731q = true;
            if (this.f662L == gVar) {
                this.f662L = null;
                return;
            }
            return;
        }
        mo540b(gVar.f724j);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0016, code lost:
        if (r4 != null) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000d, code lost:
        if (r4 != null) goto L_0x000f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x001d  */
    /* JADX WARNING: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo534a(int r3, androidx.appcompat.app.LayoutInflater$Factory2C0221g.C0238g r4, android.view.Menu r5) {
        /*
            r2 = this;
            if (r5 != 0) goto L_0x0016
            if (r4 != 0) goto L_0x000f
            if (r3 < 0) goto L_0x0019
            androidx.appcompat.app.g$g[] r1 = r2.f661K
            int r0 = r1.length
            if (r3 >= r0) goto L_0x0019
            r4 = r1[r3]
            if (r4 == 0) goto L_0x0019
        L_0x000f:
            androidx.appcompat.view.menu.h r5 = r4.f724j
        L_0x0011:
            boolean r0 = r4.f729o
            if (r0 != 0) goto L_0x0019
            return
        L_0x0016:
            if (r4 == 0) goto L_0x0019
            goto L_0x0011
        L_0x0019:
            boolean r0 = r2.f691u
            if (r0 != 0) goto L_0x0022
            android.view.Window$Callback r0 = r2.f674d
            r0.onPanelClosed(r3, r5)
        L_0x0022:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.LayoutInflater$Factory2C0221g.mo534a(int, androidx.appcompat.app.g$g, android.view.Menu):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C0238g mo533a(Menu menu) {
        C0238g[] gVarArr = this.f661K;
        if (gVarArr == null) {
            return null;
        }
        for (C0238g gVar : gVarArr) {
            if (gVar != null && gVar.f724j == menu) {
                return gVar;
            }
        }
        return null;
    }

    @Override // androidx.appcompat.view.menu.C0302h.AbstractC0303a
    /* renamed from: a */
    public final boolean mo539a(C0302h hVar, MenuItem menuItem) {
        C0238g a;
        Window.Callback callback = this.f673c.getCallback();
        if (callback == null || this.f691u || (a = mo533a((Menu) hVar.mo993l())) == null) {
            return false;
        }
        return callback.onMenuItemSelected(a.f715a, menuItem);
    }

    @Override // androidx.appcompat.view.menu.C0302h.AbstractC0303a
    /* renamed from: a */
    public final void mo536a(C0302h hVar) {
        AbstractC0453u uVar = this.f652B;
        if (uVar == null || !uVar.mo1228b() || (ViewConfiguration.get(this.f672b).hasPermanentMenuKey() && !this.f652B.mo1231d())) {
            C0238g e = mo542e(0);
            e.f731q = true;
            mo535a(e, false);
            m710a(e, (KeyEvent) null);
            return;
        }
        Window.Callback callback = this.f673c.getCallback();
        if (this.f652B.mo1229c()) {
            this.f652B.mo1234f();
            if (!this.f691u) {
                callback.onPanelClosed(108, mo542e(0).f724j);
            }
        } else if (callback != null && !this.f691u) {
            if (this.f692v && (1 & this.f693w) != 0) {
                this.f673c.getDecorView().removeCallbacks(this.f667Q);
                this.f667Q.run();
            }
            C0238g e2 = mo542e(0);
            if (e2.f724j != null && !e2.f732r && callback.onPreparePanel(0, e2.f723i, e2.f724j)) {
                callback.onMenuOpened(108, e2.f724j);
                this.f652B.mo1233e();
            }
        }
    }

    @Override // androidx.appcompat.app.AbstractC0220f
    /* renamed from: a */
    public final AbstractC0211a mo511a() {
        m721p();
        return this.f677g;
    }

    @Override // androidx.appcompat.app.AbstractC0220f
    /* renamed from: i */
    public final C0214b.AbstractC0215a mo530i() {
        return new C0230a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final void mo546m() {
        C0807z zVar = this.f683m;
        if (zVar != null) {
            zVar.mo2939b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.g$e */
    public final class C0235e {

        /* renamed from: a */
        C0250l f708a;

        /* renamed from: b */
        boolean f709b;

        /* renamed from: d */
        private BroadcastReceiver f711d;

        /* renamed from: e */
        private IntentFilter f712e;

        static {
            Covode.recordClassIndex(269);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final int mo575a() {
            boolean a = this.f708a.mo605a();
            this.f709b = a;
            if (a) {
                return 2;
            }
            return 1;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public final void mo577c() {
            if (this.f711d != null) {
                LayoutInflater$Factory2C0221g.this.f672b.unregisterReceiver(this.f711d);
                this.f711d = null;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final void mo576b() {
            mo577c();
            if (this.f711d == null) {
                this.f711d = new BroadcastReceiver() {
                    /* class androidx.appcompat.app.LayoutInflater$Factory2C0221g.C0235e.C02361 */

                    static {
                        Covode.recordClassIndex(270);
                    }

                    public final void onReceive(Context context, Intent intent) {
                        C0235e eVar = C0235e.this;
                        boolean a = eVar.f708a.mo605a();
                        if (a != eVar.f709b) {
                            eVar.f709b = a;
                            LayoutInflater$Factory2C0221g.this.mo532k();
                        }
                    }
                };
            }
            if (this.f712e == null) {
                IntentFilter intentFilter = new IntentFilter();
                this.f712e = intentFilter;
                intentFilter.addAction("android.intent.action.TIME_SET");
                this.f712e.addAction("android.intent.action.TIMEZONE_CHANGED");
                this.f712e.addAction("android.intent.action.TIME_TICK");
            }
            m787b(LayoutInflater$Factory2C0221g.this.f672b, this.f711d, this.f712e);
        }

        C0235e(C0250l lVar) {
            this.f708a = lVar;
            this.f709b = lVar.mo605a();
        }

        /* renamed from: a */
        private static Intent m786a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
            try {
                return context.registerReceiver(broadcastReceiver, intentFilter);
            } catch (Exception e) {
                if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                    return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter);
                }
                throw e;
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: java.lang.IllegalArgumentException */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0018, code lost:
            r0 = r2.getMessage().contains("regist too many Broadcast Receivers");
            r2 = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
            if (r0 != false) goto L_0x0025;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
            throw r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0026, code lost:
            r2 = move-exception;
            r2 = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0027, code lost:
            com.bytedance.p890c.p891a.p892a.p893a.C13468b.m24211a(r2, "Register Receiver Exception");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
            return null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
            return com.p2082ss.android.ugc.aweme.lancet.receiver.ReceiverRegisterLancetHelper.registerReceiver(r2, r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
            r2 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
            r0 = r2.getMessage();
            r2 = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0016, code lost:
            if (r0 != null) goto L_0x0018;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x000c */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static android.content.Intent m787b(android.content.Context r1, android.content.BroadcastReceiver r2, android.content.IntentFilter r3) {
            /*
                android.app.Application r0 = com.bytedance.ies.ugc.appcontext.C17879g.m33104a()
                com.p2082ss.android.ugc.aweme.lancet.receiver.C58039a.m104863a(r0)
                android.content.Intent r0 = m786a(r1, r2, r3)     // Catch:{ Exception -> 0x000c }
                return r0
            L_0x000c:
                android.content.Intent r0 = com.p2082ss.android.ugc.aweme.lancet.receiver.ReceiverRegisterLancetHelper.registerReceiver(r2, r3)     // Catch:{ SecurityException -> 0x0026, IllegalArgumentException -> 0x0011 }
                return r0
            L_0x0011:
                r2 = move-exception
                java.lang.String r0 = r2.getMessage()
                if (r0 == 0) goto L_0x0027
                java.lang.String r1 = r2.getMessage()
                java.lang.String r0 = "regist too many Broadcast Receivers"
                boolean r0 = r1.contains(r0)
                if (r0 != 0) goto L_0x0025
                goto L_0x0027
            L_0x0025:
                throw r2
            L_0x0026:
                r2 = move-exception
            L_0x0027:
                java.lang.String r0 = "Register Receiver Exception"
                com.bytedance.p890c.p891a.p892a.p893a.C13468b.m24211a(r2, r0)
                r0 = 0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.LayoutInflater$Factory2C0221g.C0235e.m787b(android.content.Context, android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent");
        }
    }

    /* renamed from: q */
    private Context m722q() {
        Context d;
        AbstractC0211a a = mo511a();
        if (a == null || (d = a.mo423d()) == null) {
            return this.f672b;
        }
        return d;
    }

    /* renamed from: u */
    private CharSequence m726u() {
        Window.Callback callback = this.f674d;
        if (callback instanceof Activity) {
            return ((Activity) callback).getTitle();
        }
        return this.f651A;
    }

    /* renamed from: v */
    private void m727v() {
        if (this.f655E) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    /* renamed from: w */
    private int m728w() {
        int i = this.f664N;
        if (i != -100) {
            return i;
        }
        return AbstractC0220f.f647a;
    }

    @Override // androidx.appcompat.app.AbstractC0220f
    /* renamed from: f */
    public final void mo527f() {
        AbstractC0211a a = mo511a();
        if (a != null) {
            a.mo422c(true);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final void mo547n() {
        mo535a(mo542e(0), true);
    }

    /* renamed from: x */
    private void m729x() {
        if (this.f666P == null) {
            this.f666P = new C0235e(C0250l.m827a(this.f672b));
        }
    }

    @Override // androidx.appcompat.app.AbstractC0220f
    /* renamed from: b */
    public final MenuInflater mo519b() {
        Context context;
        if (this.f678h == null) {
            m721p();
            AbstractC0211a aVar = this.f677g;
            if (aVar != null) {
                context = aVar.mo423d();
            } else {
                context = this.f672b;
            }
            this.f678h = new C0281g(context);
        }
        return this.f678h;
    }

    @Override // androidx.appcompat.app.AbstractC0220f
    /* renamed from: e */
    public final void mo526e() {
        AbstractC0211a a = mo511a();
        if (a != null) {
            a.mo422c(false);
        }
        C0235e eVar = this.f666P;
        if (eVar != null) {
            eVar.mo577c();
        }
    }

    @Override // androidx.appcompat.app.AbstractC0220f
    /* renamed from: g */
    public final void mo528g() {
        AbstractC0211a a = mo511a();
        if (a == null || !a.mo428h()) {
            m717h(0);
        }
    }

    @Override // androidx.appcompat.app.AbstractC0220f
    /* renamed from: j */
    public final void mo531j() {
        LayoutInflater from = LayoutInflater.from(this.f672b);
        if (from.getFactory() == null) {
            C0777g.m2700a(from, this);
        } else {
            from.getFactory2();
        }
    }

    @Override // androidx.appcompat.app.AbstractC0220f
    /* renamed from: k */
    public final boolean mo532k() {
        boolean z;
        int w = m728w();
        int j = m719j(w);
        if (j != -1) {
            z = m720k(j);
        } else {
            z = false;
        }
        if (w == 0) {
            m729x();
            this.f666P.mo576b();
        }
        this.f665O = true;
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final boolean mo545l() {
        ViewGroup viewGroup;
        if (!this.f655E || (viewGroup = this.f685o) == null || !C0792v.m2788v(viewGroup)) {
            return false;
        }
        return true;
    }

    static {
        boolean z;
        Covode.recordClassIndex(255);
        if (Build.VERSION.SDK_INT < 21) {
            z = true;
        } else {
            z = false;
        }
        f648x = z;
        if (z && !f650z) {
            final Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
                /* class androidx.appcompat.app.LayoutInflater$Factory2C0221g.C02221 */

                static {
                    Covode.recordClassIndex(256);
                }

                public final void uncaughtException(Thread thread, Throwable th) {
                    String message;
                    if (!(th instanceof Resources.NotFoundException) || (message = th.getMessage()) == null || (!message.contains("drawable") && !message.contains("Drawable"))) {
                        defaultUncaughtExceptionHandler.uncaughtException(thread, th);
                        return;
                    }
                    Resources.NotFoundException notFoundException = new Resources.NotFoundException(th.getMessage() + ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.");
                    notFoundException.initCause(th.getCause());
                    notFoundException.setStackTrace(th.getStackTrace());
                    defaultUncaughtExceptionHandler.uncaughtException(thread, notFoundException);
                }
            });
        }
    }

    /* renamed from: p */
    private void m721p() {
        m723r();
        if (this.f686p && this.f677g == null) {
            Window.Callback callback = this.f674d;
            if (callback instanceof Activity) {
                this.f677g = new C0252m((Activity) this.f674d, this.f687q);
            } else if (callback instanceof Dialog) {
                this.f677g = new C0252m((Dialog) this.f674d);
            }
            AbstractC0211a aVar = this.f677g;
            if (aVar != null) {
                aVar.mo420b(this.f668R);
            }
        }
    }

    /* renamed from: y */
    private boolean m730y() {
        if (this.f665O) {
            Context context = this.f672b;
            if (context instanceof Activity) {
                PackageManager packageManager = context.getPackageManager();
                try {
                    Context context2 = this.f672b;
                    if ((packageManager.getActivityInfo(new ComponentName(context2, context2.getClass()), 0).configChanges & 512) == 0) {
                        return true;
                    }
                    return false;
                } catch (PackageManager.NameNotFoundException unused) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // androidx.appcompat.app.AbstractC0220f
    /* renamed from: h */
    public final void mo529h() {
        if (this.f692v) {
            this.f673c.getDecorView().removeCallbacks(this.f667Q);
        }
        this.f691u = true;
        AbstractC0211a aVar = this.f677g;
        if (aVar != null) {
            aVar.mo430j();
        }
        C0235e eVar = this.f666P;
        if (eVar != null) {
            eVar.mo577c();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final void mo548o() {
        AbstractC0453u uVar = this.f652B;
        if (uVar != null) {
            uVar.mo1243h();
        }
        if (this.f681k != null) {
            this.f673c.getDecorView().removeCallbacks(this.f682l);
            if (this.f681k.isShowing()) {
                try {
                    this.f681k.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.f681k = null;
        }
        mo546m();
        C0238g e = mo542e(0);
        if (e != null && e.f724j != null) {
            e.f724j.close();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: androidx.appcompat.app.g$g */
    public static final class C0238g {

        /* renamed from: a */
        int f715a;

        /* renamed from: b */
        int f716b;

        /* renamed from: c */
        int f717c;

        /* renamed from: d */
        int f718d;

        /* renamed from: e */
        int f719e;

        /* renamed from: f */
        int f720f;

        /* renamed from: g */
        ViewGroup f721g;

        /* renamed from: h */
        View f722h;

        /* renamed from: i */
        View f723i;

        /* renamed from: j */
        C0302h f724j;

        /* renamed from: k */
        C0299f f725k;

        /* renamed from: l */
        Context f726l;

        /* renamed from: m */
        boolean f727m;

        /* renamed from: n */
        boolean f728n;

        /* renamed from: o */
        boolean f729o;

        /* renamed from: p */
        public boolean f730p;

        /* renamed from: q */
        boolean f731q;

        /* renamed from: r */
        boolean f732r;

        /* renamed from: s */
        Bundle f733s;

        static {
            Covode.recordClassIndex(272);
        }

        /* renamed from: a */
        public final boolean mo585a() {
            if (this.f722h == null) {
                return false;
            }
            if (this.f723i == null && this.f725k.mo932c().getCount() <= 0) {
                return false;
            }
            return true;
        }

        C0238g(int i) {
            this.f715a = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo584a(C0302h hVar) {
            C0299f fVar;
            C0302h hVar2 = this.f724j;
            if (hVar != hVar2) {
                if (hVar2 != null) {
                    hVar2.mo971b(this.f725k);
                }
                this.f724j = hVar;
                if (hVar != null && (fVar = this.f725k) != null) {
                    hVar.mo954a(fVar);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final AbstractC0320p mo582a(AbstractC0318o.AbstractC0319a aVar) {
            if (this.f724j == null) {
                return null;
            }
            if (this.f725k == null) {
                C0299f fVar = new C0299f(this.f726l);
                this.f725k = fVar;
                fVar.f1076h = aVar;
                this.f724j.mo954a(this.f725k);
            }
            return this.f725k.mo931a(this.f721g);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo583a(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme newTheme = context.getResources().newTheme();
            newTheme.setTo(context.getTheme());
            newTheme.resolveAttribute(R.attr.gx, typedValue, true);
            if (typedValue.resourceId != 0) {
                newTheme.applyStyle(typedValue.resourceId, true);
            }
            newTheme.resolveAttribute(R.attr.a6u, typedValue, true);
            if (typedValue.resourceId != 0) {
                newTheme.applyStyle(typedValue.resourceId, true);
            } else {
                newTheme.applyStyle(R.style.ks, true);
            }
            C0277d dVar = new C0277d(context, 0);
            dVar.getTheme().setTo(newTheme);
            this.f726l = dVar;
            TypedArray obtainStyledAttributes = dVar.obtainStyledAttributes(new int[]{16842839, 16842926, R.attr.gv, R.attr.gw, R.attr.gx, R.attr.gy, R.attr.gz, R.attr.h0, R.attr.h1, R.attr.h2, R.attr.h3, R.attr.h4, R.attr.h5, R.attr.h6, R.attr.h7, R.attr.h9, R.attr.h_, R.attr.ha, R.attr.hb, R.attr.hc, R.attr.hd, R.attr.he, R.attr.hf, R.attr.hg, R.attr.hh, R.attr.hi, R.attr.hj, R.attr.hk, R.attr.hl, R.attr.hm, R.attr.hn, R.attr.ho, R.attr.hr, R.attr.i3, R.attr.i4, R.attr.i5, R.attr.i6, R.attr.ip, R.attr.kn, R.attr.ln, R.attr.lo, R.attr.lp, R.attr.lq, R.attr.lr, R.attr.lx, R.attr.ly, R.attr.mn, R.attr.ms, R.attr.oc, R.attr.od, R.attr.oe, R.attr.of, R.attr.og, R.attr.oh, R.attr.oi, R.attr.oj, R.attr.ok, R.attr.on, R.attr.px, R.attr.r_, R.attr.ra, R.attr.rb, R.attr.rl, R.attr.rs, R.attr.s1, R.attr.s2, R.attr.sb, R.attr.sc, R.attr.sd, R.attr.vq, R.attr.wl, R.attr.a2k, R.attr.a2n, R.attr.a2q, R.attr.a2r, R.attr.a2s, R.attr.a2t, R.attr.a2u, R.attr.a2v, R.attr.a2w, R.attr.a6t, R.attr.a6u, R.attr.a6v, R.attr.a7i, R.attr.a7k, R.attr.a8m, R.attr.a92, R.attr.a93, R.attr.a94, R.attr.ab0, R.attr.ab4, R.attr.ab8, R.attr.ab9, R.attr.ad0, R.attr.ad1, R.attr.ag5, R.attr.ahv, R.attr.ahw, R.attr.ahx, R.attr.ahy, R.attr.ai0, R.attr.ai1, R.attr.ai2, R.attr.ai3, R.attr.ai9, R.attr.ai_, R.attr.ajb, R.attr.ajc, R.attr.ajm, R.attr.ajn, R.attr.at1, R.attr.au1, R.attr.au2, R.attr.au3, R.attr.au4, R.attr.au5, R.attr.au6, R.attr.au7, R.attr.au9, R.attr.au_, R.attr.aua});
            this.f716b = obtainStyledAttributes.getResourceId(80, 0);
            this.f720f = obtainStyledAttributes.getResourceId(1, 0);
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: r */
    private void m723r() {
        if (!this.f655E) {
            this.f685o = m724s();
            CharSequence u = m726u();
            if (!TextUtils.isEmpty(u)) {
                AbstractC0453u uVar = this.f652B;
                if (uVar != null) {
                    uVar.setWindowTitle(u);
                } else {
                    AbstractC0211a aVar = this.f677g;
                    if (aVar != null) {
                        aVar.mo415a(u);
                    } else {
                        TextView textView = this.f656F;
                        if (textView != null) {
                            textView.setText(u);
                        }
                    }
                }
            }
            m725t();
            this.f655E = true;
            C0238g e = mo542e(0);
            if (this.f691u) {
                return;
            }
            if (e == null || e.f724j == null) {
                m717h(108);
            }
        }
    }

    /* renamed from: t */
    private void m725t() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.f685o.findViewById(16908290);
        View decorView = this.f673c.getDecorView();
        contentFrameLayout.mo1428a(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray obtainStyledAttributes = this.f672b.obtainStyledAttributes(new int[]{16842839, 16842926, R.attr.gv, R.attr.gw, R.attr.gx, R.attr.gy, R.attr.gz, R.attr.h0, R.attr.h1, R.attr.h2, R.attr.h3, R.attr.h4, R.attr.h5, R.attr.h6, R.attr.h7, R.attr.h9, R.attr.h_, R.attr.ha, R.attr.hb, R.attr.hc, R.attr.hd, R.attr.he, R.attr.hf, R.attr.hg, R.attr.hh, R.attr.hi, R.attr.hj, R.attr.hk, R.attr.hl, R.attr.hm, R.attr.hn, R.attr.ho, R.attr.hr, R.attr.i3, R.attr.i4, R.attr.i5, R.attr.i6, R.attr.ip, R.attr.kn, R.attr.ln, R.attr.lo, R.attr.lp, R.attr.lq, R.attr.lr, R.attr.lx, R.attr.ly, R.attr.mn, R.attr.ms, R.attr.oc, R.attr.od, R.attr.oe, R.attr.of, R.attr.og, R.attr.oh, R.attr.oi, R.attr.oj, R.attr.ok, R.attr.on, R.attr.px, R.attr.r_, R.attr.ra, R.attr.rb, R.attr.rl, R.attr.rs, R.attr.s1, R.attr.s2, R.attr.sb, R.attr.sc, R.attr.sd, R.attr.vq, R.attr.wl, R.attr.a2k, R.attr.a2n, R.attr.a2q, R.attr.a2r, R.attr.a2s, R.attr.a2t, R.attr.a2u, R.attr.a2v, R.attr.a2w, R.attr.a6t, R.attr.a6u, R.attr.a6v, R.attr.a7i, R.attr.a7k, R.attr.a8m, R.attr.a92, R.attr.a93, R.attr.a94, R.attr.ab0, R.attr.ab4, R.attr.ab8, R.attr.ab9, R.attr.ad0, R.attr.ad1, R.attr.ag5, R.attr.ahv, R.attr.ahw, R.attr.ahx, R.attr.ahy, R.attr.ai0, R.attr.ai1, R.attr.ai2, R.attr.ai3, R.attr.ai9, R.attr.ai_, R.attr.ajb, R.attr.ajc, R.attr.ajm, R.attr.ajn, R.attr.at1, R.attr.au1, R.attr.au2, R.attr.au3, R.attr.au4, R.attr.au5, R.attr.au6, R.attr.au7, R.attr.au9, R.attr.au_, R.attr.aua});
        obtainStyledAttributes.getValue(118, contentFrameLayout.getMinWidthMajor());
        obtainStyledAttributes.getValue(119, contentFrameLayout.getMinWidthMinor());
        if (obtainStyledAttributes.hasValue(116)) {
            obtainStyledAttributes.getValue(116, contentFrameLayout.getFixedWidthMajor());
        }
        if (obtainStyledAttributes.hasValue(117)) {
            obtainStyledAttributes.getValue(117, contentFrameLayout.getFixedWidthMinor());
        }
        if (obtainStyledAttributes.hasValue(114)) {
            obtainStyledAttributes.getValue(114, contentFrameLayout.getFixedHeightMajor());
        }
        if (obtainStyledAttributes.hasValue(115)) {
            obtainStyledAttributes.getValue(115, contentFrameLayout.getFixedHeightMinor());
        }
        obtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0066, code lost:
        if (r4 != null) goto L_0x0068;
     */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.view.ViewGroup m724s() {
        /*
        // Method dump skipped, instructions count: 692
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.LayoutInflater$Factory2C0221g.m724s():android.view.ViewGroup");
    }

    /* renamed from: androidx.appcompat.app.g$a */
    class C0230a implements C0214b.AbstractC0215a {
        static {
            Covode.recordClassIndex(264);
        }

        C0230a() {
        }

        @Override // androidx.appcompat.app.C0214b.AbstractC0215a
        /* renamed from: a */
        public final void mo439a(int i) {
            AbstractC0211a a = LayoutInflater$Factory2C0221g.this.mo511a();
            if (a != null) {
                a.mo413a(i);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.g$b */
    public final class C0231b implements AbstractC0318o.AbstractC0319a {
        static {
            Covode.recordClassIndex(265);
        }

        C0231b() {
        }

        @Override // androidx.appcompat.view.menu.AbstractC0318o.AbstractC0319a
        /* renamed from: a */
        public final boolean mo560a(C0302h hVar) {
            Window.Callback callback = LayoutInflater$Factory2C0221g.this.f673c.getCallback();
            if (callback == null) {
                return true;
            }
            callback.onMenuOpened(108, hVar);
            return true;
        }

        @Override // androidx.appcompat.view.menu.AbstractC0318o.AbstractC0319a
        /* renamed from: a */
        public final void mo559a(C0302h hVar, boolean z) {
            LayoutInflater$Factory2C0221g.this.mo540b(hVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.g$h */
    public final class C0239h implements AbstractC0318o.AbstractC0319a {
        static {
            Covode.recordClassIndex(273);
        }

        C0239h() {
        }

        @Override // androidx.appcompat.view.menu.AbstractC0318o.AbstractC0319a
        /* renamed from: a */
        public final boolean mo560a(C0302h hVar) {
            Window.Callback callback;
            if (hVar != null || !LayoutInflater$Factory2C0221g.this.f686p || (callback = LayoutInflater$Factory2C0221g.this.f673c.getCallback()) == null || LayoutInflater$Factory2C0221g.this.f691u) {
                return true;
            }
            callback.onMenuOpened(108, hVar);
            return true;
        }

        @Override // androidx.appcompat.view.menu.AbstractC0318o.AbstractC0319a
        /* renamed from: a */
        public final void mo559a(C0302h hVar, boolean z) {
            boolean z2;
            C0302h l = hVar.mo993l();
            if (l != hVar) {
                z2 = true;
            } else {
                z2 = false;
            }
            LayoutInflater$Factory2C0221g gVar = LayoutInflater$Factory2C0221g.this;
            if (z2) {
                hVar = l;
            }
            C0238g a = gVar.mo533a((Menu) hVar);
            if (a == null) {
                return;
            }
            if (z2) {
                LayoutInflater$Factory2C0221g.this.mo534a(a.f715a, a, l);
                LayoutInflater$Factory2C0221g.this.mo535a(a, true);
                return;
            }
            LayoutInflater$Factory2C0221g.this.mo535a(a, z);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.g$f */
    public class C0237f extends ContentFrameLayout {
        static {
            Covode.recordClassIndex(271);
        }

        public final void setBackgroundResource(int i) {
            setBackgroundDrawable(C0196a.m619b(getContext(), i));
        }

        public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
            if (LayoutInflater$Factory2C0221g.this.mo538a(keyEvent) || super.dispatchKeyEvent(keyEvent)) {
                return true;
            }
            return false;
        }

        public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                if (x < -5 || y < -5 || x > getWidth() + 5 || y > getHeight() + 5) {
                    LayoutInflater$Factory2C0221g.this.mo547n();
                    return true;
                }
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        public C0237f(Context context) {
            super(context);
        }
    }

    @Override // androidx.appcompat.app.AbstractC0220f
    /* renamed from: a */
    public final <T extends View> T mo510a(int i) {
        m723r();
        return (T) this.f673c.findViewById(i);
    }

    @Override // androidx.appcompat.app.AbstractC0220f
    /* renamed from: b */
    public final void mo521b(Bundle bundle) {
        int i = this.f664N;
        if (i != -100) {
            bundle.putInt("appcompat:local_night_mode", i);
        }
    }

    /* renamed from: androidx.appcompat.app.g$d */
    class C0234d extends Window$CallbackC0286i {
        static {
            Covode.recordClassIndex(268);
        }

        @Override // androidx.appcompat.view.Window$CallbackC0286i
        public final void onContentChanged() {
        }

        /* renamed from: a */
        private ActionMode m785a(ActionMode.Callback callback) {
            C0279f.C0280a aVar = new C0279f.C0280a(LayoutInflater$Factory2C0221g.this.f672b, callback);
            AbstractC0274b a = LayoutInflater$Factory2C0221g.this.mo512a(aVar);
            if (a != null) {
                return aVar.mo766b(a);
            }
            return null;
        }

        @Override // androidx.appcompat.view.Window$CallbackC0286i
        public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
            if (LayoutInflater$Factory2C0221g.this.mo538a(keyEvent) || super.dispatchKeyEvent(keyEvent)) {
                return true;
            }
            return false;
        }

        @Override // androidx.appcompat.view.Window$CallbackC0286i
        public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            if (super.dispatchKeyShortcutEvent(keyEvent) || LayoutInflater$Factory2C0221g.this.mo537a(keyEvent.getKeyCode(), keyEvent)) {
                return true;
            }
            return false;
        }

        @Override // androidx.appcompat.view.Window$CallbackC0286i
        public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            if (Build.VERSION.SDK_INT >= 23) {
                return null;
            }
            if (LayoutInflater$Factory2C0221g.this.f684n) {
                return m785a(callback);
            }
            return super.onWindowStartingActionMode(callback);
        }

        C0234d(Window.Callback callback) {
            super(callback);
        }

        @Override // androidx.appcompat.view.Window$CallbackC0286i
        public final boolean onCreatePanelMenu(int i, Menu menu) {
            if (i != 0 || (menu instanceof C0302h)) {
                return super.onCreatePanelMenu(i, menu);
            }
            return false;
        }

        @Override // androidx.appcompat.view.Window$CallbackC0286i
        public final void onPanelClosed(int i, Menu menu) {
            super.onPanelClosed(i, menu);
            LayoutInflater$Factory2C0221g.this.mo541d(i);
        }

        @Override // androidx.appcompat.view.Window$CallbackC0286i
        public final boolean onMenuOpened(int i, Menu menu) {
            AbstractC0211a a;
            super.onMenuOpened(i, menu);
            LayoutInflater$Factory2C0221g gVar = LayoutInflater$Factory2C0221g.this;
            if (i == 108 && (a = gVar.mo511a()) != null) {
                a.mo424d(true);
            }
            return true;
        }

        @Override // androidx.appcompat.view.Window$CallbackC0286i
        public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
            if (!LayoutInflater$Factory2C0221g.this.f684n || i != 0) {
                return super.onWindowStartingActionMode(callback, i);
            }
            return m785a(callback);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:8:0x000f, code lost:
            if (r2 != null) goto L_0x0011;
         */
        @Override // androidx.appcompat.view.Window$CallbackC0286i
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean onPreparePanel(int r4, android.view.View r5, android.view.Menu r6) {
            /*
                r3 = this;
                boolean r0 = r6 instanceof androidx.appcompat.view.menu.C0302h
                if (r0 == 0) goto L_0x000d
                r2 = r6
                androidx.appcompat.view.menu.h r2 = (androidx.appcompat.view.menu.C0302h) r2
            L_0x0007:
                r1 = 0
                if (r4 != 0) goto L_0x000f
                if (r2 != 0) goto L_0x0011
                return r1
            L_0x000d:
                r2 = 0
                goto L_0x0007
            L_0x000f:
                if (r2 == 0) goto L_0x0014
            L_0x0011:
                r0 = 1
                r2.f1101m = r0
            L_0x0014:
                boolean r0 = super.onPreparePanel(r4, r5, r6)
                if (r2 == 0) goto L_0x001c
                r2.f1101m = r1
            L_0x001c:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.LayoutInflater$Factory2C0221g.C0234d.onPreparePanel(int, android.view.View, android.view.Menu):boolean");
        }

        @Override // androidx.appcompat.view.Window$CallbackC0286i, android.view.Window.Callback
        public final void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
            C0238g e = LayoutInflater$Factory2C0221g.this.mo542e(0);
            if (e == null || e.f724j == null) {
                super.onProvideKeyboardShortcuts(list, menu, i);
            } else {
                super.onProvideKeyboardShortcuts(list, e.f724j, i);
            }
        }
    }

    /* renamed from: a */
    private boolean m711a(C0238g gVar) {
        gVar.mo583a(m722q());
        gVar.f721g = new C0237f(gVar.f726l);
        gVar.f717c = 81;
        return true;
    }

    /* renamed from: h */
    private void m717h(int i) {
        this.f693w = (1 << i) | this.f693w;
        if (!this.f692v) {
            C0792v.m2750a(this.f673c.getDecorView(), this.f667Q);
            this.f692v = true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo541d(int i) {
        if (i == 108) {
            AbstractC0211a a = mo511a();
            if (a != null) {
                a.mo424d(false);
            }
        } else if (i == 0) {
            C0238g e = mo542e(i);
            if (e.f729o) {
                mo535a(e, false);
            }
        }
    }

    /* renamed from: c */
    private boolean m716c(C0238g gVar) {
        if (gVar.f723i != null) {
            gVar.f722h = gVar.f723i;
            return true;
        } else if (gVar.f724j == null) {
            return false;
        } else {
            if (this.f654D == null) {
                this.f654D = new C0239h();
            }
            gVar.f722h = (View) gVar.mo582a(this.f654D);
            if (gVar.f722h != null) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: j */
    private int m719j(int i) {
        if (i == -100) {
            return -1;
        }
        if (i != 0) {
            return i;
        }
        if (Build.VERSION.SDK_INT >= 23 && ((UiModeManager) this.f672b.getSystemService(UiModeManager.class)).getNightMode() == 0) {
            return -1;
        }
        m729x();
        return this.f666P.mo575a();
    }

    @Override // androidx.appcompat.app.AbstractC0220f
    /* renamed from: b */
    public final void mo520b(int i) {
        m723r();
        ViewGroup viewGroup = (ViewGroup) this.f685o.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f672b).inflate(i, viewGroup);
        this.f674d.onContentChanged();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final C0238g mo542e(int i) {
        C0238g[] gVarArr = this.f661K;
        if (gVarArr == null || gVarArr.length <= i) {
            C0238g[] gVarArr2 = new C0238g[(i + 1)];
            if (gVarArr != null) {
                System.arraycopy(gVarArr, 0, gVarArr2, 0, gVarArr.length);
            }
            this.f661K = gVarArr2;
            gVarArr = gVarArr2;
        }
        C0238g gVar = gVarArr[i];
        if (gVar != null) {
            return gVar;
        }
        C0238g gVar2 = new C0238g(i);
        gVarArr[i] = gVar2;
        return gVar2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.g$c */
    public class C0232c implements AbstractC0274b.AbstractC0275a {

        /* renamed from: b */
        private AbstractC0274b.AbstractC0275a f705b;

        static {
            Covode.recordClassIndex(266);
        }

        @Override // androidx.appcompat.view.AbstractC0274b.AbstractC0275a
        /* renamed from: a */
        public final void mo561a(AbstractC0274b bVar) {
            this.f705b.mo561a(bVar);
            if (LayoutInflater$Factory2C0221g.this.f681k != null) {
                LayoutInflater$Factory2C0221g.this.f673c.getDecorView().removeCallbacks(LayoutInflater$Factory2C0221g.this.f682l);
            }
            if (LayoutInflater$Factory2C0221g.this.f680j != null) {
                LayoutInflater$Factory2C0221g.this.mo546m();
                LayoutInflater$Factory2C0221g gVar = LayoutInflater$Factory2C0221g.this;
                gVar.f683m = C0792v.m2776j(gVar.f680j).mo2931a(0.0f);
                LayoutInflater$Factory2C0221g.this.f683m.mo2934a(new C0751ab() {
                    /* class androidx.appcompat.app.LayoutInflater$Factory2C0221g.C0232c.C02331 */

                    static {
                        Covode.recordClassIndex(267);
                    }

                    @Override // androidx.core.p037h.AbstractC0750aa, androidx.core.p037h.C0751ab
                    /* renamed from: b */
                    public final void mo558b(View view) {
                        LayoutInflater$Factory2C0221g.this.f680j.setVisibility(8);
                        if (LayoutInflater$Factory2C0221g.this.f681k != null) {
                            LayoutInflater$Factory2C0221g.this.f681k.dismiss();
                        } else if (LayoutInflater$Factory2C0221g.this.f680j.getParent() instanceof View) {
                            C0792v.m2780n((View) LayoutInflater$Factory2C0221g.this.f680j.getParent());
                        }
                        LayoutInflater$Factory2C0221g.this.f680j.removeAllViews();
                        LayoutInflater$Factory2C0221g.this.f683m.mo2934a((AbstractC0750aa) null);
                        LayoutInflater$Factory2C0221g.this.f683m = null;
                    }
                });
            }
            if (LayoutInflater$Factory2C0221g.this.f676f != null) {
                LayoutInflater$Factory2C0221g.this.f676f.onSupportActionModeFinished(LayoutInflater$Factory2C0221g.this.f679i);
            }
            LayoutInflater$Factory2C0221g.this.f679i = null;
        }

        public C0232c(AbstractC0274b.AbstractC0275a aVar) {
            this.f705b = aVar;
        }

        @Override // androidx.appcompat.view.AbstractC0274b.AbstractC0275a
        /* renamed from: a */
        public final boolean mo562a(AbstractC0274b bVar, Menu menu) {
            return this.f705b.mo562a(bVar, menu);
        }

        @Override // androidx.appcompat.view.AbstractC0274b.AbstractC0275a
        /* renamed from: b */
        public final boolean mo564b(AbstractC0274b bVar, Menu menu) {
            return this.f705b.mo564b(bVar, menu);
        }

        @Override // androidx.appcompat.view.AbstractC0274b.AbstractC0275a
        /* renamed from: a */
        public final boolean mo563a(AbstractC0274b bVar, MenuItem menuItem) {
            return this.f705b.mo563a(bVar, menuItem);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x006b, code lost:
        if (r2 != null) goto L_0x0051;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m714b(androidx.appcompat.app.LayoutInflater$Factory2C0221g.C0238g r8) {
        /*
        // Method dump skipped, instructions count: 114
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.LayoutInflater$Factory2C0221g.m714b(androidx.appcompat.app.g$g):boolean");
    }

    /* renamed from: k */
    private boolean m720k(int i) {
        int i2;
        Resources resources = this.f672b.getResources();
        Configuration configuration = resources.getConfiguration();
        int i3 = configuration.uiMode & 48;
        if (i == 2) {
            i2 = 32;
        } else {
            i2 = 16;
        }
        if (i3 == i2) {
            return false;
        }
        if (m730y()) {
            ((Activity) this.f672b).recreate();
            return true;
        }
        Configuration configuration2 = new Configuration(configuration);
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        configuration2.uiMode = i2 | (configuration2.uiMode & -49);
        resources.updateConfiguration(configuration2, displayMetrics);
        if (Build.VERSION.SDK_INT >= 26) {
            return true;
        }
        ResourcesFlusher.flush(resources);
        return true;
    }

    @Override // androidx.appcompat.app.AbstractC0220f
    /* renamed from: c */
    public final boolean mo524c(int i) {
        int i2 = m718i(i);
        if (this.f690t && i2 == 108) {
            return false;
        }
        if (this.f686p && i2 == 1) {
            this.f686p = false;
        } else if (i2 != 1) {
            if (i2 == 2) {
                m727v();
                this.f658H = true;
                return true;
            } else if (i2 == 5) {
                m727v();
                this.f659I = true;
                return true;
            } else if (i2 == 10) {
                m727v();
                this.f688r = true;
                return true;
            } else if (i2 == 108) {
                m727v();
                this.f686p = true;
                return true;
            } else if (i2 != 109) {
                return this.f673c.requestFeature(i2);
            } else {
                m727v();
                this.f687q = true;
                return true;
            }
        }
        m727v();
        this.f690t = true;
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo543f(int i) {
        C0238g e;
        C0238g e2 = mo542e(i);
        if (e2.f724j != null) {
            Bundle bundle = new Bundle();
            e2.f724j.mo975c(bundle);
            if (bundle.size() > 0) {
                e2.f733s = bundle;
            }
            e2.f724j.mo982e();
            e2.f724j.clear();
        }
        e2.f732r = true;
        e2.f731q = true;
        if ((i == 108 || i == 0) && this.f652B != null && (e = mo542e(0)) != null) {
            e.f727m = false;
            m715b(e, (KeyEvent) null);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007d, code lost:
        if (r1 != false) goto L_0x007f;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo544g(int r8) {
        /*
        // Method dump skipped, instructions count: 180
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.LayoutInflater$Factory2C0221g.mo544g(int):int");
    }

    /* renamed from: b */
    private AbstractC0274b m713b(AbstractC0274b.AbstractC0275a aVar) {
        AbstractC0274b bVar;
        AbstractC0219e eVar;
        Context context;
        mo546m();
        AbstractC0274b bVar2 = this.f679i;
        if (bVar2 != null) {
            bVar2.mo621c();
        }
        AbstractC0219e eVar2 = this.f676f;
        if (eVar2 != null && !this.f691u) {
            try {
                AbstractC0274b onWindowStartingSupportActionMode = eVar2.onWindowStartingSupportActionMode(aVar);
                if (onWindowStartingSupportActionMode != null) {
                    this.f679i = onWindowStartingSupportActionMode;
                    bVar = this.f679i;
                    if (!(bVar == null || (eVar = this.f676f) == null)) {
                        eVar.onSupportActionModeStarted(bVar);
                    }
                    return this.f679i;
                }
            } catch (AbstractMethodError unused) {
            }
        }
        boolean z = true;
        if (this.f680j == null) {
            if (this.f689s) {
                TypedValue typedValue = new TypedValue();
                Resources.Theme theme = this.f672b.getTheme();
                theme.resolveAttribute(R.attr.h4, typedValue, true);
                if (typedValue.resourceId != 0) {
                    Resources.Theme newTheme = this.f672b.getResources().newTheme();
                    newTheme.setTo(theme);
                    newTheme.applyStyle(typedValue.resourceId, true);
                    context = new C0277d(this.f672b, 0);
                    context.getTheme().setTo(newTheme);
                } else {
                    context = this.f672b;
                }
                this.f680j = new ActionBarContextView(context);
                PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, (int) R.attr.hh);
                this.f681k = popupWindow;
                C0822g.m2900a(popupWindow, 2);
                this.f681k.setContentView(this.f680j);
                this.f681k.setWidth(-1);
                context.getTheme().resolveAttribute(R.attr.gy, typedValue, true);
                this.f680j.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                this.f681k.setHeight(-2);
                this.f682l = new Runnable() {
                    /* class androidx.appcompat.app.LayoutInflater$Factory2C0221g.RunnableC02276 */

                    static {
                        Covode.recordClassIndex(261);
                    }

                    public final void run() {
                        LayoutInflater$Factory2C0221g.this.f681k.showAtLocation(LayoutInflater$Factory2C0221g.this.f680j, 55, 0, 0);
                        LayoutInflater$Factory2C0221g.this.mo546m();
                        if (LayoutInflater$Factory2C0221g.this.mo545l()) {
                            LayoutInflater$Factory2C0221g.this.f680j.setAlpha(0.0f);
                            LayoutInflater$Factory2C0221g gVar = LayoutInflater$Factory2C0221g.this;
                            gVar.f683m = C0792v.m2776j(gVar.f680j).mo2931a(1.0f);
                            LayoutInflater$Factory2C0221g.this.f683m.mo2934a(new C0751ab() {
                                /* class androidx.appcompat.app.LayoutInflater$Factory2C0221g.RunnableC02276.C02281 */

                                static {
                                    Covode.recordClassIndex(262);
                                }

                                @Override // androidx.core.p037h.AbstractC0750aa, androidx.core.p037h.C0751ab
                                /* renamed from: a */
                                public final void mo557a(View view) {
                                    LayoutInflater$Factory2C0221g.this.f680j.setVisibility(0);
                                }

                                @Override // androidx.core.p037h.AbstractC0750aa, androidx.core.p037h.C0751ab
                                /* renamed from: b */
                                public final void mo558b(View view) {
                                    LayoutInflater$Factory2C0221g.this.f680j.setAlpha(1.0f);
                                    LayoutInflater$Factory2C0221g.this.f683m.mo2934a((AbstractC0750aa) null);
                                    LayoutInflater$Factory2C0221g.this.f683m = null;
                                }
                            });
                            return;
                        }
                        LayoutInflater$Factory2C0221g.this.f680j.setAlpha(1.0f);
                        LayoutInflater$Factory2C0221g.this.f680j.setVisibility(0);
                    }
                };
            } else {
                ViewStubCompat viewStubCompat = (ViewStubCompat) this.f685o.findViewById(R.id.ce);
                if (viewStubCompat != null) {
                    viewStubCompat.setLayoutInflater(LayoutInflater.from(m722q()));
                    this.f680j = (ActionBarContextView) viewStubCompat.mo1691a();
                }
            }
        }
        if (this.f680j != null) {
            mo546m();
            this.f680j.mo1204c();
            Context context2 = this.f680j.getContext();
            ActionBarContextView actionBarContextView = this.f680j;
            if (this.f681k != null) {
                z = false;
            }
            C0278e eVar3 = new C0278e(context2, actionBarContextView, aVar, z);
            if (aVar.mo562a(eVar3, eVar3.mo618b())) {
                eVar3.mo622d();
                this.f680j.mo1201a(eVar3);
                this.f679i = eVar3;
                if (mo545l()) {
                    this.f680j.setAlpha(0.0f);
                    C0807z a = C0792v.m2776j(this.f680j).mo2931a(1.0f);
                    this.f683m = a;
                    a.mo2934a(new C0751ab() {
                        /* class androidx.appcompat.app.LayoutInflater$Factory2C0221g.C02297 */

                        static {
                            Covode.recordClassIndex(263);
                        }

                        @Override // androidx.core.p037h.AbstractC0750aa, androidx.core.p037h.C0751ab
                        /* renamed from: b */
                        public final void mo558b(View view) {
                            LayoutInflater$Factory2C0221g.this.f680j.setAlpha(1.0f);
                            LayoutInflater$Factory2C0221g.this.f683m.mo2934a((AbstractC0750aa) null);
                            LayoutInflater$Factory2C0221g.this.f683m = null;
                        }

                        @Override // androidx.core.p037h.AbstractC0750aa, androidx.core.p037h.C0751ab
                        /* renamed from: a */
                        public final void mo557a(View view) {
                            LayoutInflater$Factory2C0221g.this.f680j.setVisibility(0);
                            LayoutInflater$Factory2C0221g.this.f680j.sendAccessibilityEvent(32);
                            if (LayoutInflater$Factory2C0221g.this.f680j.getParent() instanceof View) {
                                C0792v.m2780n((View) LayoutInflater$Factory2C0221g.this.f680j.getParent());
                            }
                        }
                    });
                } else {
                    this.f680j.setAlpha(1.0f);
                    this.f680j.setVisibility(0);
                    this.f680j.sendAccessibilityEvent(32);
                    if (this.f680j.getParent() instanceof View) {
                        C0792v.m2780n((View) this.f680j.getParent());
                    }
                }
                if (this.f681k != null) {
                    this.f673c.getDecorView().post(this.f682l);
                }
            } else {
                this.f679i = null;
            }
        }
        bVar = this.f679i;
        eVar.onSupportActionModeStarted(bVar);
        return this.f679i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo540b(C0302h hVar) {
        if (!this.f660J) {
            this.f660J = true;
            this.f652B.mo1243h();
            Window.Callback callback = this.f673c.getCallback();
            if (callback != null && !this.f691u) {
                callback.onPanelClosed(108, hVar);
            }
            this.f660J = false;
        }
    }

    /* renamed from: a */
    private static Object m707a(Context context, String str) {
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

    /* renamed from: b */
    private boolean m715b(C0238g gVar, KeyEvent keyEvent) {
        boolean z;
        int i;
        boolean z2;
        AbstractC0453u uVar;
        AbstractC0453u uVar2;
        if (this.f691u) {
            return false;
        }
        if (gVar.f727m) {
            return true;
        }
        C0238g gVar2 = this.f662L;
        if (!(gVar2 == null || gVar2 == gVar)) {
            mo535a(gVar2, false);
        }
        Window.Callback callback = this.f673c.getCallback();
        if (callback != null) {
            gVar.f723i = callback.onCreatePanelView(gVar.f715a);
        }
        if (gVar.f715a == 0 || gVar.f715a == 108) {
            z = true;
            AbstractC0453u uVar3 = this.f652B;
            if (uVar3 != null) {
                uVar3.mo1236g();
            }
        } else {
            z = false;
        }
        if (gVar.f723i == null && (!z || !(this.f677g instanceof C0243j))) {
            if (gVar.f724j == null || gVar.f732r) {
                if (gVar.f724j == null) {
                    m714b(gVar);
                    if (gVar.f724j == null) {
                        return false;
                    }
                }
                if (z && this.f652B != null) {
                    if (this.f653C == null) {
                        this.f653C = new C0231b();
                    }
                    this.f652B.mo1227a(gVar.f724j, this.f653C);
                }
                gVar.f724j.mo982e();
                if (!callback.onCreatePanelMenu(gVar.f715a, gVar.f724j)) {
                    gVar.mo584a((C0302h) null);
                    if (z && (uVar2 = this.f652B) != null) {
                        uVar2.mo1227a(null, this.f653C);
                    }
                    return false;
                }
                gVar.f732r = false;
            }
            gVar.f724j.mo982e();
            if (gVar.f733s != null) {
                gVar.f724j.mo980d(gVar.f733s);
                gVar.f733s = null;
            }
            if (!callback.onPreparePanel(0, gVar.f723i, gVar.f724j)) {
                if (z && (uVar = this.f652B) != null) {
                    uVar.mo1227a(null, this.f653C);
                }
                gVar.f724j.mo983f();
                return false;
            }
            if (keyEvent != null) {
                i = keyEvent.getDeviceId();
            } else {
                i = -1;
            }
            if (KeyCharacterMap.load(i).getKeyboardType() != 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            gVar.f730p = z2;
            gVar.f724j.setQwertyMode(gVar.f730p);
            gVar.f724j.mo983f();
        }
        gVar.f727m = true;
        gVar.f728n = false;
        this.f662L = gVar;
        return true;
    }

    /* renamed from: a */
    private void m710a(C0238g gVar, KeyEvent keyEvent) {
        int i;
        ViewGroup.LayoutParams layoutParams;
        if (!gVar.f729o && !this.f691u) {
            if (gVar.f715a != 0 || (this.f672b.getResources().getConfiguration().screenLayout & 15) != 4) {
                Window.Callback callback = this.f673c.getCallback();
                if (callback == null || callback.onMenuOpened(gVar.f715a, gVar.f724j)) {
                    WindowManager windowManager = (WindowManager) m707a(this.f672b, "window");
                    if (windowManager != null && m715b(gVar, keyEvent)) {
                        if (gVar.f721g == null || gVar.f731q) {
                            if (gVar.f721g == null) {
                                m711a(gVar);
                                if (gVar.f721g == null) {
                                    return;
                                }
                            } else if (gVar.f731q && gVar.f721g.getChildCount() > 0) {
                                gVar.f721g.removeAllViews();
                            }
                            if (m716c(gVar) && gVar.mo585a()) {
                                ViewGroup.LayoutParams layoutParams2 = gVar.f722h.getLayoutParams();
                                if (layoutParams2 == null) {
                                    layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
                                }
                                gVar.f721g.setBackgroundResource(gVar.f716b);
                                ViewParent parent = gVar.f722h.getParent();
                                if (parent != null && (parent instanceof ViewGroup)) {
                                    ((ViewGroup) parent).removeView(gVar.f722h);
                                }
                                gVar.f721g.addView(gVar.f722h, layoutParams2);
                                if (!gVar.f722h.hasFocus()) {
                                    gVar.f722h.requestFocus();
                                }
                                i = -2;
                            } else {
                                return;
                            }
                        } else {
                            if (!(gVar.f723i == null || (layoutParams = gVar.f723i.getLayoutParams()) == null || layoutParams.width != -1)) {
                                i = -1;
                            }
                            i = -2;
                        }
                        gVar.f728n = false;
                        WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(i, -2, gVar.f718d, gVar.f719e, 1002, 8519680, -3);
                        layoutParams3.gravity = gVar.f717c;
                        layoutParams3.windowAnimations = gVar.f720f;
                        m709a(windowManager, gVar.f721g, layoutParams3);
                        gVar.f729o = true;
                        return;
                    }
                    return;
                }
                mo535a(gVar, true);
            }
        }
    }

    @Override // androidx.appcompat.app.AbstractC0220f
    /* renamed from: b */
    public final void mo522b(View view, ViewGroup.LayoutParams layoutParams) {
        m723r();
        ((ViewGroup) this.f685o.findViewById(16908290)).addView(view, layoutParams);
        this.f674d.onContentChanged();
    }

    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    LayoutInflater$Factory2C0221g(Context context, Window window, AbstractC0219e eVar) {
        this.f672b = context;
        this.f673c = window;
        this.f676f = eVar;
        Window.Callback callback = window.getCallback();
        this.f674d = callback;
        if (!(callback instanceof C0234d)) {
            C0234d dVar = new C0234d(callback);
            this.f675e = dVar;
            window.setCallback(dVar);
            C0405al a = C0405al.m1465a(context, (AttributeSet) null, f649y);
            Drawable b = a.mo1829b(0);
            if (b != null) {
                window.setBackgroundDrawable(b);
            }
            a.f1585a.recycle();
            return;
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    /* renamed from: a */
    private boolean m712a(C0238g gVar, int i, KeyEvent keyEvent) {
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((gVar.f727m || m715b(gVar, keyEvent)) && gVar.f724j != null) {
            return gVar.f724j.performShortcut(i, keyEvent, 1);
        }
        return false;
    }

    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return m706a(view, str, context, attributeSet);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003f, code lost:
        if (((org.xmlpull.v1.XmlPullParser) r15).getDepth() > 1) goto L_0x0041;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.view.View m706a(android.view.View r12, java.lang.String r13, android.content.Context r14, android.util.AttributeSet r15) {
        /*
        // Method dump skipped, instructions count: 396
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.LayoutInflater$Factory2C0221g.m706a(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }
}
