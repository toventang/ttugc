package com.p2082ss.android.ugc.aweme.main;

import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1203l;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1205n;
import com.bytedance.covode.number.Covode;
import com.bytedance.p890c.p891a.p892a.p893a.C13468b;

/* renamed from: com.ss.android.ugc.aweme.main.as */
public class C59033as extends C1205n {

    /* renamed from: b */
    Handler f134404b = new Handler(Looper.getMainLooper());

    static {
        Covode.recordClassIndex(69378);
    }

    @Override // androidx.lifecycle.C1205n, androidx.lifecycle.AbstractC1196i
    /* renamed from: a */
    public final AbstractC1196i.EnumC1199b mo4011a() {
        return super.mo4011a();
    }

    /* renamed from: b */
    private static boolean m108500b() {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ void mo96565c(AbstractC1203l lVar) {
        super.mo4013b(lVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ void mo96566d(AbstractC1203l lVar) {
        super.mo4012a(lVar);
    }

    public C59033as(AbstractC1204m mVar) {
        super(mVar);
    }

    @Override // androidx.lifecycle.C1205n, androidx.lifecycle.AbstractC1196i
    /* renamed from: a */
    public final void mo4012a(AbstractC1203l lVar) {
        m108499a(new RunnableC59034at(this, lVar));
    }

    /* renamed from: a */
    private void m108499a(Runnable runnable) {
        if (m108500b()) {
            runnable.run();
            return;
        }
        this.f134404b.post(runnable);
        C13468b.m24211a(new IllegalAccessError("should be in main thread"), "should call in main thread");
    }

    @Override // androidx.lifecycle.C1205n, androidx.lifecycle.AbstractC1196i
    /* renamed from: b */
    public final void mo4013b(AbstractC1203l lVar) {
        m108499a(new RunnableC59035au(this, lVar));
    }
}
