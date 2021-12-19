package com.bytedance.android.livesdk.guide;

import android.content.Context;
import androidx.appcompat.app.ActivityC0218d;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.AbstractC0976n;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.gift.C4332h;
import com.bytedance.android.live.gift.C4334j;
import com.bytedance.android.livesdk.guide.C8902a;
import com.bytedance.android.livesdk.guide.C8909b;
import com.bytedance.android.livesdk.model.message.p577a.EnumC9596a;
import com.bytedance.android.livesdk.model.message.p579c.C9698b;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.p561j.C9034ba;
import com.bytedance.android.livesdk.p561j.C9068cg;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.ugc.live.sdk.message.interfaces.IMessageManager;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

public final class LiveGiftGuideWidget extends LiveWidget implements C8902a.AbstractC8903a, C8909b.AbstractC8910a, AbstractC33974au {

    /* renamed from: a */
    private final C8909b f21945a = new C8909b();

    /* renamed from: b */
    private C8902a f21946b;

    static {
        Covode.recordClassIndex(9786);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        super.onDestroy();
        C8909b bVar = this.f21945a;
        IMessageManager iMessageManager = bVar.f21964b;
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(bVar);
        }
        AbstractC88412b bVar2 = bVar.f21968f;
        if (bVar2 != null) {
            bVar2.dispose();
        }
        bVar.f21970h.mo142944a();
    }

    @Override // com.bytedance.android.livesdk.guide.C8902a.AbstractC8903a
    /* renamed from: a */
    public final void mo15164a() {
        Context context = this.context;
        AbstractC0952i iVar = null;
        if (!(context instanceof ActivityC0218d)) {
            context = null;
        }
        ActivityC0945e eVar = (ActivityC0945e) context;
        if (eVar != null) {
            iVar = eVar.getSupportFragmentManager();
        }
        C8902a aVar = this.f21946b;
        if (aVar == null) {
            return;
        }
        if (!C3966y.m9672g()) {
            if (iVar != null) {
                AbstractC0976n a = iVar.mo3552a().mo3451a(R.anim.el, R.anim.ep);
                if (a != null) {
                    a.mo3455a(aVar).mo3473c();
                }
                iVar.mo3562c();
            }
        } else if (iVar != null) {
            AbstractC0976n a2 = iVar.mo3552a().mo3451a(R.anim.em, R.anim.en);
            if (a2 != null) {
                a2.mo3455a(aVar).mo3473c();
            }
            iVar.mo3562c();
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        IMessageManager iMessageManager;
        super.onCreate();
        C8909b bVar = this.f21945a;
        DataChannel dataChannel = this.dataChannel;
        C89219l.m154721d(this, "");
        bVar.f21963a = dataChannel;
        DataChannel dataChannel2 = bVar.f21963a;
        if (dataChannel2 != null) {
            iMessageManager = (IMessageManager) dataChannel2.mo28318b(C9068cg.class);
        } else {
            iMessageManager = null;
        }
        bVar.f21964b = iMessageManager;
        bVar.f21965c = this;
        bVar.f21970h.mo142945a(C6779a.m14563a().mo13052a(C4334j.class).mo143289d(new C8909b.C8911b(bVar)));
        DataChannel dataChannel3 = bVar.f21963a;
        if (dataChannel3 != null) {
            dataChannel3.mo28310a(C9034ba.class, (AbstractC89172b) new C8909b.C8912c(bVar));
        }
        C8909b bVar2 = this.f21945a;
        IMessageManager iMessageManager2 = bVar2.f21964b;
        if (iMessageManager2 != null) {
            iMessageManager2.addMessageListener(EnumC9596a.GIFT_GUIDE_MESSAGE.getIntType(), bVar2);
        }
    }

    @Override // com.bytedance.android.livesdk.guide.C8909b.AbstractC8910a
    /* renamed from: a */
    public final void mo15166a(C9698b bVar) {
        C6779a.m14563a().mo13053a(new C4332h(bVar));
    }

    @Override // com.bytedance.android.livesdk.guide.C8909b.AbstractC8910a
    /* renamed from: a */
    public final void mo15165a(long j, C9698b bVar) {
        AbstractC0952i supportFragmentManager;
        C8902a aVar = new C8902a();
        this.f21946b = aVar;
        aVar.f21949c = this.dataChannel;
        C8902a aVar2 = this.f21946b;
        if (aVar2 != null) {
            C89219l.m154721d(this, "");
            aVar2.f21950d = this;
        }
        C8902a aVar3 = this.f21946b;
        if (aVar3 != null) {
            aVar3.f21947a = j;
            aVar3.f21948b = bVar;
        }
        Context context = this.context;
        if (!(context instanceof ActivityC0218d)) {
            context = null;
        }
        ActivityC0945e eVar = (ActivityC0945e) context;
        if (eVar != null && (supportFragmentManager = eVar.getSupportFragmentManager()) != null) {
            AbstractC0976n a = supportFragmentManager.mo3552a();
            C89219l.m154716b(a, "");
            C8902a aVar4 = this.f21946b;
            if (aVar4 != null) {
                if (!C3966y.m9672g()) {
                    a.mo3451a(R.anim.el, R.anim.ep).mo3454a(R.id.fbx, aVar4, "LiveGiftGuideDialog").mo3457a("LiveGiftGuideDialog");
                } else {
                    a.mo3451a(R.anim.em, R.anim.en).mo3454a(R.id.fbx, aVar4, "LiveGiftGuideDialog").mo3457a("LiveGiftGuideDialog");
                }
            }
            a.mo3473c();
        }
    }
}
