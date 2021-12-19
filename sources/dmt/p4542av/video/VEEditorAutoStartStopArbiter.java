package dmt.p4542av.video;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.covode.number.Covode;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.p2082ss.android.ugc.asve.editor.AbstractC31071f;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.tools.C84401c;
import com.p2082ss.android.vesdk.C85581w;
import com.p2082ss.android.vesdk.C85615x;

/* renamed from: dmt.av.video.VEEditorAutoStartStopArbiter */
public final class VEEditorAutoStartStopArbiter implements AbstractC33974au {

    /* renamed from: a */
    public boolean f200066a;

    /* renamed from: b */
    public boolean f200067b;

    /* renamed from: c */
    public boolean f200068c;

    /* renamed from: d */
    public boolean f200069d;

    /* renamed from: e */
    public boolean f200070e;

    /* renamed from: f */
    public boolean f200071f;

    /* renamed from: g */
    public boolean f200072g = true;

    /* renamed from: h */
    private Context f200073h;

    /* renamed from: i */
    private BroadcastReceiver f200074i;

    /* renamed from: j */
    private AbstractC31071f f200075j;

    /* renamed from: dmt.av.video.VEEditorAutoStartStopArbiter$a */
    public interface AbstractC88148a {
        static {
            Covode.recordClassIndex(104180);
        }

        /* renamed from: g */
        void mo88412g();
    }

    static {
        Covode.recordClassIndex(104176);
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            onDestroy();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_PAUSE) {
            onPause();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_RESUME) {
            onResume();
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_PAUSE)
    public final void onPause() {
        if (!this.f200067b && !this.f200069d) {
            mo142665a();
        }
        this.f200072g = false;
    }

    /* renamed from: b */
    public final void mo142668b() {
        if (!this.f200066a) {
            try {
                if (this.f200075j.mo56356f() != C85581w.EnumC85611j.STARTED) {
                    this.f200075j.mo56388t();
                }
            } catch (Exception e) {
                C84401c.f188722f.mo123660b(e.toString());
            }
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_RESUME)
    public final void onResume() {
        if (!this.f200067b && !this.f200069d && !this.f200070e && this.f200071f && !this.f200068c) {
            mo142668b();
        }
        this.f200072g = true;
    }

    /* renamed from: a */
    public final void mo142665a() {
        if (!this.f200066a) {
            try {
                if (this.f200075j.mo56356f() != C85581w.EnumC85611j.PAUSED) {
                    this.f200075j.mo56390u();
                }
            } catch (C85615x e) {
                if (e.getRetCd() != -105) {
                    throw e;
                }
            }
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public final void onDestroy() {
        if (this.f200074i != null) {
            try {
                C84401c.f188722f.mo123662d("Unregister Receiver " + this.f200073h + " " + this.f200074i);
                this.f200073h.unregisterReceiver(this.f200074i);
                this.f200074i = null;
            } catch (Exception e) {
                C84401c.f188722f.mo123660b(e.toString());
            }
        } else {
            C84401c.f188722f.mo123660b("Receiver not registered");
        }
        this.f200072g = false;
    }

    /* renamed from: a */
    public final void mo142666a(boolean z) {
        mo142667a(z, false);
    }

    /* renamed from: a */
    public final void mo142667a(boolean z, boolean z2) {
        boolean z3 = this.f200066a;
        if (z3 != z) {
            if (z3) {
                if (!z2) {
                    this.f200075j.mo56388t();
                }
                Context context = this.f200073h;
                if (context instanceof AbstractC88148a) {
                    ((AbstractC88148a) context).mo88412g();
                }
            } else {
                this.f200075j.mo56390u();
            }
            this.f200066a = z;
        }
    }

    /* renamed from: a */
    private static Intent m153221a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
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
    private static android.content.Intent m153222b(android.content.Context r1, android.content.BroadcastReceiver r2, android.content.IntentFilter r3) {
        /*
            android.app.Application r0 = com.bytedance.ies.ugc.appcontext.C17879g.m33104a()
            com.p2082ss.android.ugc.aweme.lancet.receiver.C58039a.m104863a(r0)
            android.content.Intent r0 = m153221a(r1, r2, r3)     // Catch:{ Exception -> 0x000c }
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
        throw new UnsupportedOperationException("Method not decompiled: dmt.p4542av.video.VEEditorAutoStartStopArbiter.m153222b(android.content.Context, android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent");
    }

    public VEEditorAutoStartStopArbiter(Context context, final AbstractC1204m mVar, AbstractC31071f fVar, SurfaceView surfaceView, final boolean z) {
        this.f200071f = z;
        this.f200073h = context;
        this.f200075j = fVar;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        this.f200074i = new BroadcastReceiver() {
            /* class dmt.p4542av.video.VEEditorAutoStartStopArbiter.C881451 */

            static {
                Covode.recordClassIndex(104177);
            }

            public final void onReceive(Context context, Intent intent) {
                if (intent.getAction().equals("android.intent.action.SCREEN_OFF") && !VEEditorAutoStartStopArbiter.this.f200067b && !VEEditorAutoStartStopArbiter.this.f200069d) {
                    VEEditorAutoStartStopArbiter.this.mo142665a();
                }
            }
        };
        int i = Build.VERSION.SDK_INT;
        ((ViewGroup) surfaceView.getParent()).getViewTreeObserver().addOnWindowFocusChangeListener(new ViewTreeObserver.OnWindowFocusChangeListener() {
            /* class dmt.p4542av.video.VEEditorAutoStartStopArbiter.ViewTreeObserver$OnWindowFocusChangeListenerC881462 */

            static {
                Covode.recordClassIndex(104178);
            }

            public final void onWindowFocusChanged(boolean z) {
                if (z && mVar.getLifecycle().mo4011a().isAtLeast(AbstractC1196i.EnumC1199b.RESUMED) && !VEEditorAutoStartStopArbiter.this.f200067b && z && !VEEditorAutoStartStopArbiter.this.f200068c) {
                    VEEditorAutoStartStopArbiter.this.mo142668b();
                }
            }
        });
        m153222b(this.f200073h, this.f200074i, intentFilter);
        C84401c.f188722f.mo123662d("Register Receiver " + this.f200073h + " " + this.f200074i);
        surfaceView.getHolder().addCallback(new SurfaceHolder.Callback2() {
            /* class dmt.p4542av.video.VEEditorAutoStartStopArbiter.SurfaceHolder$Callback2C881473 */

            static {
                Covode.recordClassIndex(104179);
            }

            public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            }

            public final void surfaceCreated(SurfaceHolder surfaceHolder) {
            }

            public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            }

            public final void surfaceRedrawNeeded(SurfaceHolder surfaceHolder) {
            }
        });
        mVar.getLifecycle().mo4012a(this);
    }
}
