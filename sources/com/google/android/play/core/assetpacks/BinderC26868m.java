package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.google.android.play.core.p1963b.AbstractBinderC26938cb;
import com.google.android.play.core.tasks.C27071m;
import java.util.List;

/* renamed from: com.google.android.play.core.assetpacks.m */
class BinderC26868m<T> extends AbstractBinderC26938cb {

    /* renamed from: a */
    final C27071m<T> f63743a;

    /* renamed from: b */
    final /* synthetic */ C26873r f63744b;

    static {
        Covode.recordClassIndex(32343);
    }

    BinderC26868m(C26873r rVar, C27071m<T> mVar) {
        this.f63744b = rVar;
        this.f63743a = mVar;
    }

    BinderC26868m(C26873r rVar, C27071m mVar, byte b) {
        this(rVar, mVar);
    }

    BinderC26868m(C26873r rVar, C27071m mVar, char c) {
        this(rVar, mVar);
    }

    BinderC26868m(C26873r rVar, C27071m mVar, short s) {
        this(rVar, mVar);
    }

    @Override // com.google.android.play.core.p1963b.AbstractC26939cc
    /* renamed from: a */
    public final void mo44545a(int i) {
        this.f63744b.f63755d.mo44651a();
        C26873r.f63751a.mo44598d("onStartDownload(%d)", Integer.valueOf(i));
    }

    @Override // com.google.android.play.core.p1963b.AbstractC26939cc
    /* renamed from: a */
    public void mo44548a(List<Bundle> list) {
        this.f63744b.f63755d.mo44651a();
        C26873r.f63751a.mo44598d("onGetSessionStates", new Object[0]);
    }

    @Override // com.google.android.play.core.p1963b.AbstractC26939cc
    /* renamed from: a */
    public void mo44547a(Bundle bundle, Bundle bundle2) {
        this.f63744b.f63756e.mo44651a();
        C26873r.f63751a.mo44598d("onKeepAlive(%b)", Boolean.valueOf(bundle.getBoolean("keep_alive")));
    }

    @Override // com.google.android.play.core.p1963b.AbstractC26939cc
    /* renamed from: b */
    public void mo44552b(Bundle bundle, Bundle bundle2) {
        this.f63744b.f63755d.mo44651a();
        C26873r.f63751a.mo44598d("onGetChunkFileDescriptor", new Object[0]);
    }

    @Override // com.google.android.play.core.p1963b.AbstractC26939cc
    /* renamed from: a */
    public final void mo44544a() {
        this.f63744b.f63755d.mo44651a();
        C26873r.f63751a.mo44598d("onRequestDownloadInfo()", new Object[0]);
    }

    @Override // com.google.android.play.core.p1963b.AbstractC26939cc
    /* renamed from: a */
    public void mo44546a(Bundle bundle) {
        this.f63744b.f63755d.mo44651a();
        int i = bundle.getInt("error_code");
        C26873r.f63751a.mo44596b("onError(%d)", Integer.valueOf(i));
        this.f63743a.mo44784b(new C26765a(i));
    }

    @Override // com.google.android.play.core.p1963b.AbstractC26939cc
    /* renamed from: b */
    public final void mo44550b(int i) {
        this.f63744b.f63755d.mo44651a();
        C26873r.f63751a.mo44598d("onCancelDownload(%d)", Integer.valueOf(i));
    }

    @Override // com.google.android.play.core.p1963b.AbstractC26939cc
    /* renamed from: b */
    public final void mo44549b() {
        this.f63744b.f63755d.mo44651a();
        C26873r.f63751a.mo44598d("onCancelDownloads()", new Object[0]);
    }

    @Override // com.google.android.play.core.p1963b.AbstractC26939cc
    /* renamed from: c */
    public final void mo44554c(int i) {
        this.f63744b.f63755d.mo44651a();
        C26873r.f63751a.mo44598d("onGetSession(%d)", Integer.valueOf(i));
    }

    @Override // com.google.android.play.core.p1963b.AbstractC26939cc
    /* renamed from: b */
    public final void mo44551b(Bundle bundle) {
        this.f63744b.f63755d.mo44651a();
        C26873r.f63751a.mo44598d("onNotifyChunkTransferred(%s, %s, %d, session=%d)", bundle.getString("module_name"), bundle.getString("slice_id"), Integer.valueOf(bundle.getInt("chunk_number")), Integer.valueOf(bundle.getInt("session_id")));
    }

    @Override // com.google.android.play.core.p1963b.AbstractC26939cc
    /* renamed from: c */
    public final void mo44555c(Bundle bundle) {
        this.f63744b.f63755d.mo44651a();
        C26873r.f63751a.mo44598d("onNotifyModuleCompleted(%s, sessionId=%d)", bundle.getString("module_name"), Integer.valueOf(bundle.getInt("session_id")));
    }

    @Override // com.google.android.play.core.p1963b.AbstractC26939cc
    /* renamed from: d */
    public final void mo44556d(Bundle bundle) {
        this.f63744b.f63755d.mo44651a();
        C26873r.f63751a.mo44598d("onNotifySessionFailed(%d)", Integer.valueOf(bundle.getInt("session_id")));
    }

    @Override // com.google.android.play.core.p1963b.AbstractC26939cc
    /* renamed from: c */
    public final void mo44553c() {
        this.f63744b.f63755d.mo44651a();
        C26873r.f63751a.mo44598d("onRemoveModule()", new Object[0]);
    }
}
