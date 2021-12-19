package com.bytedance.apm.p779k;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.apm.C12397c;
import com.bytedance.apm.core.ActivityLifeObserver;
import com.bytedance.apm.p767c.p768a.C12401a;
import com.bytedance.apm.p767c.p769b.C12412f;
import com.bytedance.apm.p788p.C12560b;
import com.bytedance.covode.number.Covode;
import com.bytedance.news.common.service.manager.C21520c;
import com.bytedance.services.apm.api.AbstractC22711d;
import com.bytedance.services.slardar.config.AbstractC22715a;
import com.bytedance.services.slardar.config.IConfigManager;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.k.a */
public abstract class AbstractC12513a implements C12560b.AbstractC12565b, AbstractC22711d, AbstractC22715a {

    /* renamed from: a */
    private boolean f30386a;

    /* renamed from: b */
    private boolean f30387b;

    /* renamed from: c */
    private long f30388c;

    /* renamed from: n */
    public boolean f30389n;

    /* renamed from: o */
    public boolean f30390o;

    /* renamed from: p */
    protected String f30391p;

    /* renamed from: q */
    protected boolean f30392q;

    static {
        Covode.recordClassIndex(14329);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo20032a() {
    }

    @Override // com.bytedance.services.apm.api.AbstractC22711d
    /* renamed from: a */
    public final void mo20108a(Activity activity, Bundle bundle) {
    }

    /* renamed from: a */
    public void mo20034a(JSONObject jSONObject) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract boolean mo20036b();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract long mo20037c();

    @Override // com.bytedance.services.apm.api.AbstractC22711d
    /* renamed from: c */
    public final void mo20109c(Activity activity) {
    }

    /* renamed from: e */
    public void mo20039e() {
    }

    @Override // com.bytedance.services.apm.api.AbstractC22711d
    /* renamed from: l_ */
    public final void mo20110l_() {
    }

    @Override // com.bytedance.services.slardar.config.AbstractC22715a
    /* renamed from: d */
    public void mo20038d() {
        this.f30389n = true;
        mo20040f();
    }

    /* renamed from: f */
    private final void mo20040f() {
        if (!this.f30387b) {
            this.f30387b = true;
            if (mo20036b()) {
                C12560b.C12564a.f30567a.mo20384a(this);
            }
        }
        mo20039e();
        this.f30388c = System.currentTimeMillis();
    }

    /* renamed from: i */
    public final void mo20345i() {
        if (this.f30387b) {
            this.f30387b = false;
            if (mo20036b()) {
                C12560b.C12564a.f30567a.mo20390b(this);
            }
        }
    }

    /* renamed from: h */
    public final void mo20344h() {
        if (!this.f30386a) {
            if (!TextUtils.isEmpty(this.f30391p)) {
                this.f30386a = true;
                ActivityLifeObserver.getInstance().register(this);
                this.f30390o = !ActivityLifeObserver.getInstance().isForeground();
                mo20032a();
                ((IConfigManager) C21520c.m40424a(IConfigManager.class)).registerConfigListener(this);
                if (C12397c.m22288e()) {
                    String[] strArr = new String[1];
                    String str = "perf init: " + this.f30391p;
                    return;
                }
                return;
            }
            throw new IllegalStateException("Must set collector Setting key, before init");
        }
    }

    @Override // com.bytedance.services.apm.api.AbstractC22711d
    /* renamed from: a */
    public void mo20033a(Activity activity) {
        this.f30390o = true;
        if (C12397c.f29940j) {
            mo20345i();
        }
    }

    @Override // com.bytedance.services.apm.api.AbstractC22711d
    /* renamed from: b */
    public void mo20035b(Activity activity) {
        this.f30390o = false;
        if (C12397c.f29940j && this.f30389n) {
            mo20040f();
        }
    }

    /* renamed from: a */
    protected static void m22485a(C12412f fVar) {
        C12516b.m22502a(fVar);
        C12516b.m22503a(fVar, fVar.mo20194e());
        C12401a.m22303b().mo20179a(fVar);
    }

    @Override // com.bytedance.apm.p788p.C12560b.AbstractC12565b
    /* renamed from: a */
    public final void mo20219a(long j) {
        long c = mo20037c();
        if (c > 0 && j - this.f30388c > c && this.f30389n) {
            mo20039e();
            this.f30388c = System.currentTimeMillis();
        }
    }

    @Override // com.bytedance.services.slardar.config.AbstractC22715a
    /* renamed from: a */
    public final void mo20180a(JSONObject jSONObject, boolean z) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2 = jSONObject.optJSONObject("performance_modules");
        if (optJSONObject2 != null && (optJSONObject = optJSONObject2.optJSONObject(this.f30391p)) != null) {
            boolean z2 = false;
            if (optJSONObject.optInt("enable_upload", 0) == 1) {
                z2 = true;
            }
            this.f30392q = z2;
            mo20034a(optJSONObject);
        }
    }
}
