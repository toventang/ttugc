package com.p2082ss.android.ugc.aweme.legoImp.inflate;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.p084a.p088b.C1862a;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58258q;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58265x;
import com.p2082ss.android.ugc.aweme.lego.C58221f;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.lego.EnumC58151ae;
import com.p2082ss.android.ugc.aweme.main.MainPageServiceImpl;
import java.util.ArrayList;
import java.util.List;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.ss.android.ugc.aweme.legoImp.inflate.X2CBaseInflate */
public abstract class X2CBaseInflate implements AbstractC58258q {

    /* renamed from: a */
    private int f132739a = -1;

    /* renamed from: b */
    private AbstractC58264w f132740b = new AbstractC58264w() {
        /* class com.p2082ss.android.ugc.aweme.legoImp.inflate.X2CBaseInflate.C582872 */

        static {
            Covode.recordClassIndex(68366);
        }

        @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
        public final int bQ_() {
            return 1048575;
        }

        @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
        /* renamed from: f */
        public final EnumC58150ad mo28606f() {
            return AbstractC58265x.m105221a(this);
        }

        @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
        /* renamed from: g */
        public final String mo28607g() {
            return "task_";
        }

        @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
        /* renamed from: i */
        public final boolean mo28609i() {
            return true;
        }

        @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
        /* renamed from: j */
        public final List mo28610j() {
            return null;
        }

        @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58264w
        /* renamed from: b */
        public final EnumC58151ae mo28601b() {
            return EnumC58151ae.BOOT_FINISH;
        }

        @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
        /* renamed from: k */
        public final EnumC58148ab mo28611k() {
            return EnumC58148ab.DEFAULT;
        }

        @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
        /* renamed from: h */
        public final String mo28608h() {
            return getClass().getSimpleName();
        }

        @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
        /* renamed from: a */
        public final void mo28600a(Context context) {
            X2CBaseInflate.this.mo95718l();
        }
    };

    /* renamed from: e */
    protected List<SparseArray<View>> f132741e = new ArrayList();

    /* renamed from: f */
    public boolean f132742f = false;

    static {
        Covode.recordClassIndex(68364);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: a */
    public final void mo28600a(Context context) {
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    public final int bQ_() {
        return 1048575;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public int mo67524c() {
        return 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract int[] mo67525d();

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public boolean mo89637e() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: g */
    public final String mo28607g() {
        return "inflate_";
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: i */
    public final boolean mo28609i() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: j */
    public final List mo28610j() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: f */
    public final EnumC58150ad mo28606f() {
        return EnumC58150ad.INFLATE;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: k */
    public final EnumC58148ab mo28611k() {
        return EnumC58148ab.DEFAULT;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58258q
    /* renamed from: b */
    public final Class<? extends Activity> mo28743b() {
        return MainPageServiceImpl.m108428b().mo96455a();
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: h */
    public String mo28608h() {
        return getClass().getSimpleName();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final /* synthetic */ void mo95721o() {
        synchronized (this.f132741e) {
            this.f132741e.clear();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final void mo95718l() {
        this.f132742f = true;
        new Handler(Looper.getMainLooper()).post(new RunnableC58291d(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final boolean mo95719m() {
        if (this.f132739a == -1) {
            this.f132739a = C58293f.f132752b;
        }
        if (this.f132739a == -2) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final boolean mo95720n() {
        if (this.f132739a == -1) {
            this.f132739a = C58293f.f132752b;
        }
        if (this.f132739a == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public View mo67522a(Context context, int i) {
        if (mo95720n()) {
            for (SparseArray<View> sparseArray : this.f132741e) {
                View view = sparseArray.get(i);
                if (view != null) {
                    sparseArray.remove(i);
                    return view;
                }
            }
            return C1862a.m6032a(context, i, new FrameLayout(context), false);
        } else if (mo95719m()) {
            return C1764a.m5927a(LayoutInflater.from(context), i, new FrameLayout(context), false);
        } else {
            return C1862a.m6032a(context, i, new FrameLayout(context), false);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58258q
    /* renamed from: a */
    public void mo28741a(Context context, Activity activity) {
        if (activity != null && mo95720n()) {
            for (int i = 0; i < mo67524c(); i++) {
                SparseArray<View> sparseArray = new SparseArray<>();
                synchronized (this.f132741e) {
                    this.f132741e.add(sparseArray);
                }
            }
            for (SparseArray<View> sparseArray2 : this.f132741e) {
                int[] d = mo67525d();
                for (int i2 : d) {
                    sparseArray2.put(i2, C1862a.m6032a(activity, i2, new FrameLayout(activity), false));
                }
            }
            if (mo89637e()) {
                final int hashCode = activity.hashCode();
                C17873f.m33098f().mo143289d(new AbstractC88433f<Activity>() {
                    /* class com.p2082ss.android.ugc.aweme.legoImp.inflate.X2CBaseInflate.C582861 */

                    static {
                        Covode.recordClassIndex(68365);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // p4560f.p4561a.p4567d.AbstractC88433f
                    public final /* synthetic */ void accept(Activity activity) {
                        if (!X2CBaseInflate.this.f132742f && activity.hashCode() == hashCode) {
                            X2CBaseInflate.this.mo95718l();
                        }
                    }
                });
                return;
            }
            new C58221f.C58224c().mo95703b(this.f132740b).mo95706a();
        }
    }
}
