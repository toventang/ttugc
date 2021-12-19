package com.p2082ss.android.ugc.aweme.notification.utils;

import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.analysis.AbstractC33501c;
import com.p2082ss.android.ugc.aweme.analysis.Analysis;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.ugc.aweme.notification.utils.AnalysisStayTimeFragmentComponent */
public class AnalysisStayTimeFragmentComponent implements AbstractC33974au {

    /* renamed from: a */
    public boolean f141280a = true;

    /* renamed from: b */
    private long f141281b = -1;

    /* renamed from: c */
    private WeakReference<AbstractC33501c> f141282c;

    /* renamed from: d */
    private Fragment f141283d;

    static {
        Covode.recordClassIndex(73017);
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_RESUME) {
            onResume();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_PAUSE) {
            onPause();
        }
    }

    /* renamed from: b */
    private Analysis m112598b() {
        AbstractC33501c cVar;
        WeakReference<AbstractC33501c> weakReference = this.f141282c;
        if (weakReference == null || (cVar = weakReference.get()) == null) {
            return null;
        }
        return cVar.mo59595F();
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_PAUSE)
    public void onPause() {
        this.f141283d.getClass().getSimpleName();
        if (this.f141280a) {
            m112597a();
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_RESUME)
    public void onResume() {
        this.f141283d.getClass().getSimpleName();
        if (this.f141280a) {
            this.f141281b = System.currentTimeMillis();
        }
    }

    /* renamed from: a */
    private void m112597a() {
        if (this.f141281b != -1) {
            long currentTimeMillis = System.currentTimeMillis() - this.f141281b;
            if (currentTimeMillis > 100 && m112598b() != null && !TextUtils.isEmpty(m112598b().getLabelName())) {
                C39162r.m79460a("stay_time", new C33744d().mo59983a("duration", String.valueOf(currentTimeMillis)).mo59983a("enter_from", m112598b().getLabelName()).f79943a);
                this.f141283d.getClass().getSimpleName();
            }
            this.f141281b = -1;
        }
    }

    /* renamed from: a */
    public final void mo100243a(boolean z) {
        this.f141283d.getClass().getSimpleName();
        m112599b(!z);
    }

    public AnalysisStayTimeFragmentComponent(Fragment fragment) {
        this.f141283d = fragment;
        if (fragment instanceof AbstractC33501c) {
            this.f141282c = new WeakReference<>(fragment);
        }
        fragment.getLifecycle().mo4012a(this);
    }

    /* renamed from: b */
    private void m112599b(boolean z) {
        this.f141283d.getClass().getSimpleName();
        this.f141280a = z;
        if (z) {
            this.f141281b = System.currentTimeMillis();
        } else {
            m112597a();
        }
    }
}
