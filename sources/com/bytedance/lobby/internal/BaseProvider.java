package com.bytedance.lobby.internal;

import android.app.Application;
import androidx.lifecycle.LiveData;
import com.bytedance.covode.number.Covode;
import com.bytedance.lobby.C20892d;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class BaseProvider<T> extends BaseViewModel<T> implements AbstractC20915b {

    /* renamed from: b */
    private final AtomicBoolean f49453b = new AtomicBoolean();

    /* renamed from: c */
    public C20892d f49454c;

    static {
        Covode.recordClassIndex(24514);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract void mo34346d();

    @Override // com.bytedance.lobby.internal.AbstractC20915b
    /* renamed from: e */
    public final C20892d mo34362e() {
        return this.f49454c;
    }

    @Override // com.bytedance.lobby.internal.BaseViewModel
    /* renamed from: g */
    public final /* bridge */ /* synthetic */ LiveData mo34364g() {
        return super.mo34364g();
    }

    @Override // com.bytedance.lobby.internal.AbstractC20915b
    /* renamed from: f */
    public final void mo34363f() {
        if (this.f49453b.compareAndSet(false, true)) {
            mo34346d();
        }
    }

    @Override // com.bytedance.lobby.internal.AbstractC20915b
    /* renamed from: t_ */
    public boolean mo34350t_() {
        String str = this.f49454c.f49402b;
        str.hashCode();
        switch (str.hashCode()) {
            case -1240244679:
                if (str.equals("google")) {
                    return C20920e.f49473a;
                }
                break;
            case -916346253:
                if (str.equals("twitter")) {
                    return C20920e.f49477e;
                }
                break;
            case 3765:
                if (str.equals("vk")) {
                    return C20920e.f49479g;
                }
                break;
            case 3321844:
                if (str.equals("line")) {
                    return C20920e.f49476d;
                }
                break;
            case 28903346:
                if (!str.equals("instagram")) {
                    return false;
                }
                return true;
            case 323062851:
                if (str.equals("google_onetap")) {
                    return C20920e.f49474b;
                }
                break;
            case 486515695:
                if (str.equals("kakaotalk")) {
                    return C20920e.f49478f;
                }
                break;
            case 497130182:
                if (str.equals("facebook")) {
                    return C20920e.f49475c;
                }
                break;
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.lobby.internal.BaseViewModel
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo34361b(Object obj) {
        super.mo34361b(obj);
    }

    public BaseProvider(Application application, C20892d dVar) {
        super(application);
        this.f49454c = dVar;
    }
}
