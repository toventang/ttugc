package com.bytedance.sdk.p1625a.p1650j.p1651a;

import android.os.Message;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.BlockingQueue;

/* renamed from: com.bytedance.sdk.a.j.a.d */
public final class C22459d extends C22456a {
    static {
        Covode.recordClassIndex(26275);
    }

    @Override // com.bytedance.sdk.p1625a.p1650j.p1651a.C22456a
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo36740a() {
        super.mo36740a();
    }

    @Override // com.bytedance.sdk.p1625a.p1650j.p1651a.C22456a
    public final /* bridge */ /* synthetic */ void run() {
        super.run();
    }

    @Override // com.bytedance.sdk.p1625a.p1650j.p1651a.C22456a
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ boolean mo36742b() {
        return super.mo36742b();
    }

    @Override // com.bytedance.sdk.p1625a.p1650j.p1651a.C22456a
    /* renamed from: d */
    public final void mo36744d() {
        this.f53086c.removeMessages(1);
    }

    @Override // com.bytedance.sdk.p1625a.p1650j.p1651a.C22456a
    /* renamed from: c */
    public final void mo36743c() {
        mo36744d();
        this.f53086c.sendEmptyMessageDelayed(1, InteractFirstFrameTimeOutDurationSetting.DEFAULT);
    }

    @Override // com.bytedance.sdk.p1625a.p1650j.p1651a.C22456a
    /* renamed from: a */
    public final void mo36741a(AbstractRunnableC22458c cVar) {
        if (cVar != null) {
            cVar.f53097c.removeMessages(1);
        }
    }

    @Override // com.bytedance.sdk.p1625a.p1650j.p1651a.C22456a, com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        if (message != null) {
            try {
                if (message.what == 1) {
                    f53084a.mo36759e();
                }
            } catch (Throwable unused) {
            }
        }
    }

    public C22459d(BlockingQueue<AbstractC22460e> blockingQueue, String str, String str2) {
        super(blockingQueue, str, str2);
    }
}
