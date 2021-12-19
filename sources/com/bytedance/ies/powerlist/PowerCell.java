package com.bytedance.ies.powerlist;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1202k;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.lifecycle.C1205n;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.p1231b.AbstractC17641a;
import com.bytedance.ies.powerlist.page.config.C17693c;
import com.bytedance.ies.powerlist.proxy.ListVMProxy;
import com.bytedance.tiktok.proxy.AbstractC22873a;
import com.bytedance.tiktok.proxy.AbstractC22874b;
import com.bytedance.tiktok.proxy.AbstractC22875c;
import com.bytedance.tiktok.proxy.AbstractC22876d;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p084a.p088b.C1868b;
import com.p084a.p088b.C1870c;
import java.util.List;
import p4560f.p4561a.p4591l.C88958b;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89219l;

public abstract class PowerCell<T extends AbstractC17641a> extends RecyclerView.ViewHolder implements AbstractC1202k, AbstractC1204m, AbstractC22875c<PowerCell<T>, T, ListVMProxy<PowerCell<T>, T>> {

    /* renamed from: a */
    private final C1205n f42157a;

    /* renamed from: b */
    private boolean f42158b;

    /* renamed from: c */
    public AbstractC1204m f42159c;

    /* renamed from: d */
    public T f42160d;

    /* renamed from: e */
    public PowerAdapter f42161e;

    /* renamed from: f */
    public PowerStub f42162f;

    /* renamed from: g */
    public boolean f42163g;

    /* renamed from: h */
    public final PowerCell<T> f42164h;

    /* renamed from: i */
    public ListVMProxy<PowerCell<T>, T> f42165i;

    /* renamed from: j */
    private final AbstractC22874b<PowerCell<T>, T> f42166j;

    static {
        Covode.recordClassIndex(20184);
    }

    /* renamed from: a */
    public void mo28065a(T t, List<? extends Object> list) {
        C89219l.m154719c(t, "");
        C89219l.m154719c(list, "");
    }

    /* renamed from: a */
    public void mo28067a(Object obj) {
    }

    /* renamed from: j */
    public int mo28071j() {
        return 0;
    }

    /* renamed from: k */
    public void mo28072k() {
    }

    public void onDestroy() {
    }

    @Override // com.bytedance.tiktok.proxy.AbstractC22875c
    public final AbstractC1204m aK_() {
        return this.f42159c;
    }

    @Override // com.bytedance.tiktok.proxy.AbstractC22875c
    public final /* bridge */ /* synthetic */ AbstractC22876d aO_() {
        return this.f42164h;
    }

    /* renamed from: f */
    public AbstractC22874b<PowerCell<T>, T> mo23353f() {
        return this.f42166j;
    }

    @Override // androidx.lifecycle.AbstractC1204m
    public AbstractC1196i getLifecycle() {
        return this.f42157a;
    }

    /* renamed from: m */
    public void mo28074m() {
        mo28078p();
    }

    /* renamed from: l */
    public void mo28073l() {
        mo28076o();
        mo28075n();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public PowerCell() {
        /*
            r2 = this;
            android.widget.Space r1 = com.bytedance.ies.powerlist.C17643c.f42193a
            if (r1 != 0) goto L_0x0009
            java.lang.String r0 = "globalSpace"
            p4600h.p4611f.p4613b.C89219l.m154710a(r0)
        L_0x0009:
            r2.<init>(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.powerlist.PowerCell.<init>():void");
    }

    /* renamed from: e */
    private final void mo23352e() {
        if (this.f42163g) {
            this.f42157a.mo4016a(AbstractC1196i.EnumC1198a.ON_START);
        }
    }

    /* renamed from: q */
    private final void m32716q() {
        if (this.f42163g) {
            this.f42157a.mo4016a(AbstractC1196i.EnumC1198a.ON_PAUSE);
        }
    }

    /* renamed from: i */
    public final AbstractC1204m mo28070i() {
        PowerAdapter powerAdapter = this.f42161e;
        if (powerAdapter != null) {
            return powerAdapter.mo28061j();
        }
        return null;
    }

    /* renamed from: d */
    private final boolean mo23351d() {
        C88958b<C17693c> bVar;
        C17693c i;
        PowerAdapter powerAdapter = this.f42161e;
        if (powerAdapter == null || (bVar = powerAdapter.f42115f) == null || (i = bVar.mo143221i()) == null) {
            return false;
        }
        return i.f42323e;
    }

    /* renamed from: r */
    private final void m32717r() {
        if (this.f42163g) {
            this.f42157a.mo4016a(AbstractC1196i.EnumC1198a.ON_STOP);
            ListVMProxy<PowerCell<T>, T> listVMProxy = this.f42165i;
            if (listVMProxy != null) {
                listVMProxy.mo28192a(this);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final void mo28075n() {
        AbstractC1196i lifecycle;
        if (!this.f42158b) {
            AbstractC1204m mVar = this.f42159c;
            if (!(mVar == null || (lifecycle = mVar.getLifecycle()) == null)) {
                lifecycle.mo4012a(this);
            }
            this.f42158b = true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final void mo28076o() {
        this.f42163g = true;
        int i = C17647d.f42201b[getLifecycle().mo4011a().ordinal()];
        if (i == 1) {
            mo23352e();
            mo64272a(false);
        } else if (i == 2) {
            mo64272a(false);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0017, code lost:
        if (r1 != 3) goto L_0x0019;
     */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo28078p() {
        /*
            r2 = this;
            androidx.lifecycle.i r0 = r2.getLifecycle()
            androidx.lifecycle.i$b r0 = r0.mo4011a()
            int[] r1 = com.bytedance.ies.powerlist.C17647d.f42202c
            int r0 = r0.ordinal()
            r1 = r1[r0]
            r0 = 1
            if (r1 == r0) goto L_0x001d
            r0 = 2
            if (r1 == r0) goto L_0x0020
            r0 = 3
            if (r1 == r0) goto L_0x0020
        L_0x0019:
            r0 = 0
            r2.f42163g = r0
            return
        L_0x001d:
            r2.m32716q()
        L_0x0020:
            r2.m32717r()
            goto L_0x0019
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.powerlist.PowerCell.mo28078p():void");
    }

    @Override // com.bytedance.tiktok.proxy.AbstractC22875c
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo28066a(AbstractC22873a aVar) {
        this.f42165i = (ListVMProxy) aVar;
    }

    /* renamed from: a */
    public void mo23350a(T t) {
        C89219l.m154719c(t, "");
        mo28065a(t, C89086z.INSTANCE);
    }

    private PowerCell(View view) {
        super(view);
        this.f42157a = new C1205n(this);
        this.f42164h = this;
    }

    /* renamed from: a */
    private final void mo64272a(boolean z) {
        if (this.f42163g) {
            this.f42157a.mo4016a(AbstractC1196i.EnumC1198a.ON_RESUME);
            ListVMProxy<PowerCell<T>, T> listVMProxy = this.f42165i;
            if (listVMProxy != null) {
                listVMProxy.mo28193a(this, z);
            }
        }
    }

    /* renamed from: a */
    public View mo23349a(ViewGroup viewGroup) {
        View a;
        C89219l.m154719c(viewGroup, "");
        Integer valueOf = Integer.valueOf(mo28071j());
        if (valueOf.intValue() > 0 && valueOf != null && (a = mo28064a(viewGroup, valueOf.intValue())) != null) {
            return a;
        }
        throw new IllegalArgumentException("onCreateItemView layoutId is valid!!");
    }

    /* renamed from: a */
    public static /* synthetic */ AbstractC1174ac m32711a(PowerCell powerCell, Class cls) {
        ActivityC0945e d;
        PowerAdapter powerAdapter = powerCell.f42161e;
        if (powerAdapter == null || (d = powerAdapter.mo28055d()) == null) {
            return null;
        }
        return C1181ae.m3881a(d, (C1175ad.AbstractC1177b) null).mo3983a(cls);
    }

    /* renamed from: b */
    public static /* synthetic */ AbstractC1174ac m32713b(PowerCell powerCell, Class cls) {
        Fragment c;
        PowerAdapter powerAdapter = powerCell.f42161e;
        if (powerAdapter == null || (c = powerAdapter.mo28054c()) == null) {
            return null;
        }
        return C1181ae.m3879a(c, (C1175ad.AbstractC1177b) null).mo3983a(cls);
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        AbstractC1196i lifecycle;
        C89219l.m154719c(mVar, "");
        C89219l.m154719c(aVar, "");
        switch (C17647d.f42200a[aVar.ordinal()]) {
            case 1:
                this.f42157a.mo4016a(AbstractC1196i.EnumC1198a.ON_CREATE);
                return;
            case 2:
                mo23352e();
                return;
            case 3:
                mo64272a(true);
                return;
            case 4:
                m32716q();
                return;
            case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                m32717r();
                return;
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                mo28078p();
                this.f42157a.mo4016a(AbstractC1196i.EnumC1198a.ON_DESTROY);
                AbstractC1204m mVar2 = this.f42159c;
                if (!(mVar2 == null || (lifecycle = mVar2.getLifecycle()) == null)) {
                    lifecycle.mo4013b(this);
                }
                onDestroy();
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    public final View mo28064a(ViewGroup viewGroup, int i) {
        C89219l.m154719c(viewGroup, "");
        Context context = viewGroup.getContext();
        if (!mo23351d()) {
            View a = C1764a.m5927a(LayoutInflater.from(context), i, viewGroup, false);
            C89219l.m154709a((Object) a, "");
            return a;
        } else if (context instanceof Activity) {
            C1868b.m6035a(i);
            View a2 = C1870c.m6045a((Activity) context, i);
            C1870c.m6049a(context, i);
            C89219l.m154709a((Object) a2, "");
            return a2;
        } else {
            throw new IllegalStateException("context is not an Activity??".toString());
        }
    }
}
