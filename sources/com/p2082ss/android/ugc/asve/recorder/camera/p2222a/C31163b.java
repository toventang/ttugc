package com.p2082ss.android.ugc.asve.recorder.camera.p2222a;

import android.content.Context;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.medialib.camera.AbstractC29994a;
import com.p2082ss.android.ugc.asve.p2217f.C31092a;
import com.p2082ss.android.ugc.asve.recorder.camera.AbstractC31185d;
import com.p2082ss.android.ugc.asve.recorder.camera.AbstractC31186e;
import com.p2082ss.android.ugc.asve.recorder.camera.C31165b;
import com.p2082ss.android.ugc.tools.C84401c;
import com.p2082ss.android.ugc.tools.utils.AbstractC84903j;

/* renamed from: com.ss.android.ugc.asve.recorder.camera.a.b */
public final class C31163b {

    /* renamed from: b */
    public static boolean f74704b;

    /* renamed from: c */
    public static boolean f74705c;

    /* renamed from: a */
    public boolean f74706a;

    /* renamed from: d */
    public Context f74707d;

    /* renamed from: e */
    public int f74708e;

    /* renamed from: f */
    public AbstractC31185d f74709f;

    /* renamed from: g */
    public AbstractC31186e f74710g;

    /* renamed from: h */
    private int f74711h = -1;

    /* renamed from: i */
    private boolean f74712i;

    static {
        Covode.recordClassIndex(37808);
    }

    /* renamed from: a */
    public final boolean mo56707a() {
        if (C31165b.f74716b) {
            return this.f74710g.mo56705a(this.f74707d, this.f74709f, 0);
        }
        int i = this.f74708e;
        if (i == 1 || i == 2 || i == 4) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m64576b(Context context) {
        if (C31092a.C31093a.m64295a(context).mo56517b() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m64575a(Context context) {
        if (C31092a.C31093a.m64295a(context).mo56517b() != 0) {
            return m64576b(context);
        }
        C31092a.C31093a.m64295a(context).mo56518b(2);
        f74704b = false;
        f74705c = false;
        return false;
    }

    /* renamed from: a */
    public final void mo56706a(final boolean z) {
        if (this.f74706a && mo56707a() && Build.VERSION.SDK_INT >= 23) {
            this.f74709f.mo56669b(z);
            AbstractC31185d dVar = this.f74709f;
            dVar.mo56664b(dVar.mo56676e(), new AbstractC29994a() {
                /* class com.p2082ss.android.ugc.asve.recorder.camera.p2222a.C31163b.C311641 */

                static {
                    Covode.recordClassIndex(37809);
                }

                @Override // com.p2082ss.android.medialib.camera.AbstractC29994a
                /* renamed from: a */
                public final void mo52822a(int i) {
                    C31163b.this.f74709f.mo56676e();
                    C31163b.f74704b = z;
                }

                @Override // com.p2082ss.android.medialib.camera.AbstractC29994a
                /* renamed from: a */
                public final void mo52823a(int i, int i2, String str) {
                    C31163b.this.f74709f.mo56676e();
                }
            }, null);
        }
    }

    /* renamed from: b */
    public final void mo56708b(boolean z) {
        boolean z2;
        boolean z3 = false;
        if (!mo56707a() || Build.VERSION.SDK_INT < 23) {
            C31092a.C31093a.m64295a(this.f74707d).mo56518b(2);
            f74704b = false;
            f74705c = false;
            return;
        }
        boolean a = m64575a(this.f74707d);
        f74704b = a;
        f74705c = a;
        AbstractC31185d dVar = this.f74709f;
        if (!a || !z) {
            z2 = false;
        } else {
            z2 = true;
        }
        dVar.mo56669b(z2);
        AbstractC84903j jVar = C84401c.f188722f;
        StringBuilder sb = new StringBuilder("CameraAntiShakeV1 -> initShakeFreeMode: setEnableAntiShake(");
        if (a && z) {
            z3 = true;
        }
        jVar.mo123658a(sb.append(z3).append(")").toString());
    }

    public C31163b(Context context, AbstractC31185d dVar, int i, boolean z, AbstractC31186e eVar) {
        this.f74711h = i;
        this.f74708e = i == -1 ? C31162a.m64574a(Build.MODEL) : i;
        this.f74707d = context;
        this.f74706a = true;
        this.f74709f = dVar;
        this.f74712i = z;
        this.f74710g = eVar;
    }
}
