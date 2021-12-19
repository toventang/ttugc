package com.bytedance.android.live.slot;

import android.os.Handler;
import android.view.View;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.gift.C4338n;
import com.bytedance.android.live.gift.C4342r;
import com.bytedance.android.livesdk.event.C8460m;
import com.bytedance.android.livesdk.model.message.p577a.EnumC9596a;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.p561j.C9068cg;
import com.bytedance.android.livesdk.util.rxutils.autodispose.AbstractC11181z;
import com.bytedance.android.livesdk.util.rxutils.autodispose.C11152e;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.p2082ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4600h.p4611f.p4612a.AbstractC89172b;

public class BarrageWidget extends LiveRecyclableWidget implements AbstractC33974au, OnMessageListener {

    /* renamed from: a */
    protected IMessageManager f15246a;

    /* renamed from: b */
    public View f15247b;

    /* renamed from: c */
    int f15248c;

    /* renamed from: d */
    public boolean f15249d;

    /* renamed from: e */
    private final Handler f15250e = new Handler();

    static {
        Covode.recordClassIndex(6810);
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onInit(Object[] objArr) {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.AbstractC1202k, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public BarrageWidget() {
        m13334a();
    }

    /* renamed from: a */
    private void m13334a() {
        this.f15248c = C3966y.m9667d(R.dimen.yx);
        this.f15249d = false;
        this.f15247b = null;
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onUnload() {
        this.f15250e.removeCallbacksAndMessages(null);
        this.dataChannel.mo28319c(C4342r.class);
        View view = this.f15247b;
        if (view != null) {
            view.setVisibility(8);
        }
        this.dataChannel.mo28316b(this);
        m13334a();
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onLoad(Object[] objArr) {
        this.f15246a = (IMessageManager) this.dataChannel.mo28318b(C9068cg.class);
        this.dataChannel.mo28309a((AbstractC1204m) this, C4338n.class, (AbstractC89172b) new C6168d(this));
        IMessageManager iMessageManager = this.f15246a;
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(EnumC9596a.BARRAGE_MESSAGE.getIntType(), this);
        }
        ((AbstractC11181z) C6779a.m14563a().mo13052a(C8460m.class).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143274a(C11152e.m19790a(this))).mo17949a(new C6169e(this));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x015d, code lost:
        if (r1 == null) goto L_0x0161;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0161, code lost:
        if (r2 != null) goto L_0x0163;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0167, code lost:
        if (android.text.TextUtils.isEmpty(r1) == false) goto L_0x01c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0169, code lost:
        r5 = com.bytedance.android.livesdk.chatroom.p491f.C7557c.m15540a(r2, r3, null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x016d, code lost:
        r4.setText(r5);
        r4 = r11.f23823a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0172, code lost:
        if (r4 == null) goto L_0x01bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0174, code lost:
        r3 = new java.util.HashMap(r4.f23828b);
        r3.put("enter_from_merge", com.bytedance.android.livesdk.p425aa.C6544e.m13987a());
        r3.put("enter_method", com.bytedance.android.livesdk.p425aa.C6544e.m13990d());
        r3.put("room_id", java.lang.String.valueOf(com.bytedance.android.livesdk.p425aa.C6544e.m13995i()));
        r3.put("anchor_id", java.lang.String.valueOf(com.bytedance.android.livesdk.p425aa.C6544e.m13994h()));
        r3.put("action_type", com.bytedance.android.livesdk.p425aa.C6544e.m13991e());
        com.bytedance.android.livesdk.p425aa.C6501b.C6502a.m13948a(r4.f23827a).mo12652a((java.util.Map<java.lang.String, java.lang.String>) r3).mo12655b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x01bd, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(12476);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x01c1, code lost:
        r2 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x01c4, code lost:
        return;
     */
    @Override // com.p2082ss.ugc.live.sdk.message.interfaces.OnMessageListener
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void onMessage(com.p2082ss.ugc.live.sdk.message.data.IMessage r11) {
        /*
        // Method dump skipped, instructions count: 456
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.slot.BarrageWidget.onMessage(com.ss.ugc.live.sdk.message.data.IMessage):void");
    }
}
