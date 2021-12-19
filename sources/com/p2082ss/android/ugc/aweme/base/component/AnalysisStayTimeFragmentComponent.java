package com.p2082ss.android.ugc.aweme.base.component;

import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.analysis.AbstractC33501c;
import com.p2082ss.android.ugc.aweme.analysis.Analysis;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.metrics.C59218am;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.base.component.AnalysisStayTimeFragmentComponent */
public class AnalysisStayTimeFragmentComponent implements AbstractC33974au {

    /* renamed from: a */
    public boolean f81539a;

    /* renamed from: b */
    public AbstractC34536a f81540b;

    /* renamed from: c */
    private long f81541c = -1;

    /* renamed from: d */
    private WeakReference<AbstractC33501c> f81542d;

    /* renamed from: e */
    private Fragment f81543e;

    /* renamed from: com.ss.android.ugc.aweme.base.component.AnalysisStayTimeFragmentComponent$a */
    public interface AbstractC34536a {
        static {
            Covode.recordClassIndex(41496);
        }

        /* renamed from: a */
        C59218am mo61009a(C59218am amVar);
    }

    static {
        Covode.recordClassIndex(41494);
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_RESUME) {
            onResume();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_PAUSE) {
            onPause();
        }
    }

    /* renamed from: a */
    public final Analysis mo61003a() {
        AbstractC33501c cVar;
        WeakReference<AbstractC33501c> weakReference = this.f81542d;
        if (weakReference == null || (cVar = weakReference.get()) == null) {
            return null;
        }
        return cVar.mo59595F();
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_PAUSE)
    public void onPause() {
        this.f81543e.getClass().getSimpleName();
        if (this.f81539a) {
            m70563b();
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_RESUME)
    public void onResume() {
        this.f81543e.getClass().getSimpleName();
        if (this.f81539a) {
            this.f81541c = System.currentTimeMillis();
        }
    }

    /* renamed from: b */
    private void m70563b() {
        if (this.f81541c != -1) {
            final long currentTimeMillis = System.currentTimeMillis() - this.f81541c;
            if (currentTimeMillis > 100) {
                if (mo61003a() != null && !TextUtils.isEmpty(mo61003a().getLabelName())) {
                    C1731i.m5640b(new Callable<Object>() {
                        /* class com.p2082ss.android.ugc.aweme.base.component.AnalysisStayTimeFragmentComponent.CallableC345351 */

                        static {
                            Covode.recordClassIndex(41495);
                        }

                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            C59218am amVar = new C59218am();
                            amVar.f134899a = String.valueOf(currentTimeMillis);
                            C59218am a = amVar.mo96758a(AnalysisStayTimeFragmentComponent.this.mo61003a().getLabelName());
                            if (AnalysisStayTimeFragmentComponent.this.f81540b != null) {
                                a = AnalysisStayTimeFragmentComponent.this.f81540b.mo61009a(a);
                            }
                            a.mo96792f();
                            return null;
                        }
                    }, C39162r.m79452a());
                }
                this.f81543e.getClass().getSimpleName();
            }
            this.f81541c = -1;
        }
    }

    /* renamed from: a */
    public final void mo61004a(boolean z) {
        this.f81543e.getClass().getSimpleName();
        mo61005b(!z);
    }

    /* renamed from: b */
    public final void mo61005b(boolean z) {
        this.f81543e.getClass().getSimpleName();
        this.f81539a = z;
        if (z) {
            this.f81541c = System.currentTimeMillis();
        } else {
            m70563b();
        }
    }

    public AnalysisStayTimeFragmentComponent(Fragment fragment, boolean z) {
        this.f81539a = z;
        this.f81543e = fragment;
        this.f81542d = new WeakReference<>(fragment);
        fragment.getLifecycle().mo4012a(this);
    }
}
