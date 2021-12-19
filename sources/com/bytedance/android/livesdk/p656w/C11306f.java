package com.bytedance.android.livesdk.p656w;

import com.bytedance.android.live.core.p214d.C3868c;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import com.bytedance.android.livesdk.livesetting.message.LiveMsgTypeAlogDurationSetting;
import com.bytedance.android.livesdk.livesetting.message.LiveMsgTypeAlogEnableSetting;
import com.bytedance.android.livesdk.model.message.C9878i;
import com.bytedance.android.livesdk.p430ab.p432b.AbstractC6571a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.live.sdk.message.data.IMessage;
import com.p2082ss.ugc.live.sdk.message.interfaces.IInterceptor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;

/* renamed from: com.bytedance.android.livesdk.w.f */
public final class C11306f implements IInterceptor {

    /* renamed from: a */
    private final List<AbstractC6571a> f27037a = new ArrayList();

    /* renamed from: b */
    private final AbstractC88412b f27038b = AbstractC88979t.m154282a((long) LiveMsgTypeAlogDurationSetting.INSTANCE.getValue(), (long) LiveMsgTypeAlogDurationSetting.INSTANCE.getValue(), TimeUnit.SECONDS).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143289d(new C11307g(this));

    /* renamed from: c */
    private boolean f27039c = true;

    static {
        Covode.recordClassIndex(12943);
    }

    /* renamed from: b */
    public final void mo18068b() {
        AbstractC88412b bVar = this.f27038b;
        if (bVar != null) {
            bVar.dispose();
        }
        mo18067a();
        this.f27039c = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo18067a() {
        if (!this.f27037a.isEmpty()) {
            ArrayList arrayList = new ArrayList(this.f27037a);
            this.f27037a.clear();
            AbstractC88979t.m154294a(new C11308h(arrayList)).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143300g();
        }
    }

    @Override // com.p2082ss.ugc.live.sdk.message.interfaces.IInterceptor
    public final boolean onMessage(IMessage iMessage) {
        if (LiveMsgTypeAlogEnableSetting.INSTANCE.getValue() && (iMessage instanceof AbstractC6571a) && !(iMessage instanceof C9878i)) {
            AbstractC6571a aVar = (AbstractC6571a) iMessage;
            if (!aVar.f16442c) {
                this.f27037a.add(aVar);
                if (this.f27037a.size() > LiveMaxRetainAlogMessageSizeSetting.INSTANCE.getValue()) {
                    if (this.f27039c) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("message_count_exceed_limit", true);
                        C3868c.m9491a("ttlive_broadcast_action_all", 0, hashMap);
                        this.f27039c = false;
                    }
                    mo18067a();
                }
            }
        }
        return false;
    }
}
