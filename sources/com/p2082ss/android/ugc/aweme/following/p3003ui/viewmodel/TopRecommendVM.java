package com.p2082ss.android.ugc.aweme.following.p3003ui.viewmodel;

import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.LiveData;
import com.bytedance.android.widget.C12249d;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicBoolean;
import p4600h.C89391z;

/* renamed from: com.ss.android.ugc.aweme.following.ui.viewmodel.TopRecommendVM */
public final class TopRecommendVM extends AbstractC1174ac {

    /* renamed from: h */
    public static final C51390a f118444h = new C51390a((byte) 0);

    /* renamed from: a */
    public final AtomicBoolean f118445a = new AtomicBoolean(false);

    /* renamed from: b */
    public boolean f118446b;

    /* renamed from: c */
    public boolean f118447c = true;

    /* renamed from: d */
    public final C12249d<C89391z> f118448d;

    /* renamed from: e */
    public final LiveData<C89391z> f118449e;

    /* renamed from: f */
    public final C12249d<Boolean> f118450f;

    /* renamed from: g */
    public final LiveData<Boolean> f118451g;

    static {
        Covode.recordClassIndex(60605);
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewmodel.TopRecommendVM$a */
    public static final class C51390a {
        static {
            Covode.recordClassIndex(60606);
        }

        private C51390a() {
        }

        public /* synthetic */ C51390a(byte b) {
            this();
        }
    }

    public TopRecommendVM() {
        C12249d<C89391z> dVar = new C12249d<>();
        this.f118448d = dVar;
        this.f118449e = dVar;
        C12249d<Boolean> dVar2 = new C12249d<>();
        this.f118450f = dVar2;
        this.f118451g = dVar2;
    }

    /* renamed from: a */
    public final boolean mo86788a() {
        Boolean value;
        if (!this.f118445a.get() || (value = this.f118450f.getValue()) == null || !value.booleanValue()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo86787a(boolean z) {
        if (z) {
            if (mo86788a()) {
                return;
            }
        } else if (!mo86788a()) {
            return;
        }
        if (!this.f118446b) {
            this.f118450f.setValue(Boolean.valueOf(z));
        }
    }
}
