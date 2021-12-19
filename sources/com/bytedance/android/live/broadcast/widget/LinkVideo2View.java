package com.bytedance.android.live.broadcast.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceView;
import com.bytedance.android.live.broadcast.EnumC3338p;
import com.bytedance.android.live.broadcast.api.C3059e;
import com.bytedance.android.live.broadcast.api.p186d.AbstractC3055a;
import com.bytedance.android.live.broadcast.api.p187e.AbstractC3060a;
import com.bytedance.android.live.broadcast.p192c.AbstractC3185a;
import com.bytedance.android.live.broadcast.p192c.p193a.AbstractC3186a;
import com.bytedance.android.live.broadcast.p192c.p193a.C3200g;
import com.bytedance.android.live.broadcast.p195d.C3223d;
import com.bytedance.android.live.broadcast.p195d.C3224e;
import com.bytedance.android.live.broadcast.p195d.C3225f;
import com.bytedance.android.live.broadcast.stream.C3678c;
import com.bytedance.android.live.broadcast.stream.C3704d;
import com.bytedance.android.live.broadcast.stream.capture.AbstractC3688a;
import com.bytedance.android.live.broadcast.stream.capture.C3691b;
import com.bytedance.android.live.broadcast.stream.capture.C3693c;
import com.bytedance.android.live.broadcast.stream.capture.p208a.C3689a;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.effect.C4217d;
import com.bytedance.android.live.effect.api.p240a.AbstractC4149b;
import com.bytedance.android.live.liveinteract.multilive.api.AbstractC5585a;
import com.bytedance.android.live.p250i.p251a.AbstractC4357d;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.chatroom.interact.AbstractC7600a;
import com.bytedance.android.livesdk.chatroom.interact.AbstractC7601b;
import com.bytedance.android.livesdk.livesetting.broadcast.AdmServerCfgSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.AdmTypeSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveGuestLiveAudioCaptureSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveGuestLinkPreInitEnableSetting;
import com.bytedance.android.livesdk.model.C9593l;
import com.bytedance.android.livesdkapi.depend.model.C11672a;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.store.policy.PrivacyPolicyStore;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.p2082ss.avframework.livestreamv2.core.Client;
import com.p2082ss.avframework.livestreamv2.core.LiveCore;
import java.io.FileNotFoundException;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;

public class LinkVideo2View extends SurfaceView implements AbstractC3060a, AbstractC3186a, AbstractC7600a, AbstractC7601b {

    /* renamed from: a */
    final AbstractC3060a.C3061a f10383a;

    /* renamed from: b */
    AbstractC3185a f10384b;

    /* renamed from: c */
    public C3689a f10385c;

    /* renamed from: d */
    AbstractC3688a f10386d;

    /* renamed from: e */
    public boolean f10387e;

    /* renamed from: f */
    public AbstractC88412b f10388f;

    /* renamed from: g */
    AbstractC4149b f10389g;

    /* renamed from: h */
    private boolean f10390h;

    /* renamed from: i */
    private C3200g f10391i;

    /* renamed from: j */
    private AbstractC3055a f10392j;

    /* renamed from: k */
    private boolean f10393k;

    /* renamed from: l */
    private int f10394l;

    static {
        Covode.recordClassIndex(4275);
    }

    public void setDataChannel(DataChannel dataChannel) {
    }

    @Override // com.bytedance.android.livesdk.chatroom.interact.AbstractC7600a
    /* renamed from: a */
    public final void mo9070a() {
        this.f10386d.mo8968b();
    }

    @Override // com.bytedance.android.live.broadcast.p192c.p193a.AbstractC3186a
    /* renamed from: d_ */
    public final void mo8540d_() {
        C4217d.m10321d().mo9845a("effect_gift");
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        if (!(getParent() instanceof AbstractC5585a) || !((AbstractC5585a) getParent()).mo11021d()) {
            super.onAttachedToWindow();
            this.f10392j.mo8289a(PrivacyCert.Builder.with("bpea-373").usage("").tag("link mic resume").policies(PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
            return;
        }
        super.onAttachedToWindow();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        AbstractC88412b bVar;
        if (!(getParent() instanceof AbstractC5585a) || !((AbstractC5585a) getParent()).mo11021d()) {
            if (!this.f10390h) {
                AbstractC88412b bVar2 = this.f10388f;
                if (bVar2 != null && !bVar2.isDisposed()) {
                    this.f10388f.dispose();
                }
                C4217d.m10321d().mo9848b();
                this.f10386d.mo8965a(PrivacyCert.Builder.with("bpea-433").usage("").tag("stop video/audio capture when link mic ends").policies(PrivacyPolicyStore.getVideoPrivacyPolicy()).build());
                this.f10392j.mo8297b(PrivacyCert.Builder.with("bpea-400").usage("").tag("link mic finish").policies(PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
                this.f10392j.mo8299c(PrivacyCert.Builder.with("bpea-493").usage("").tag("release when link mic ends").policies(PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
            }
            super.onDetachedFromWindow();
            if (!this.f10390h && (bVar = this.f10388f) != null && !bVar.isDisposed()) {
                this.f10388f.dispose();
                return;
            }
            return;
        }
        super.onDetachedFromWindow();
    }

    @Override // com.bytedance.android.livesdk.chatroom.interact.AbstractC7601b
    /* renamed from: a */
    public final Client mo9069a(LiveCore.InteractConfig interactConfig) {
        return this.f10392j.mo8280a(interactConfig);
    }

    @Override // com.bytedance.android.live.broadcast.api.p187e.AbstractC3060a
    /* renamed from: b */
    public final void mo8324b(PrivacyCert privacyCert) {
        this.f10392j.mo8306h(privacyCert);
    }

    @Override // com.bytedance.android.live.broadcast.api.p187e.AbstractC3060a
    /* renamed from: a */
    public final void mo8321a(int i) {
        AbstractC3185a aVar = this.f10384b;
        if (aVar != null) {
            aVar.mo8532a(i);
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.interact.AbstractC7600a
    /* renamed from: a_ */
    public final void mo9072a_(PrivacyCert privacyCert) {
        try {
            this.f10392j.mo8297b(privacyCert);
        } catch (NullPointerException e) {
            C3854a.m9455a(6, "LinkVideo2View", e.getStackTrace());
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.interact.AbstractC7600a
    /* renamed from: b_ */
    public final void mo9073b_(PrivacyCert privacyCert) {
        try {
            this.f10392j.mo8289a(privacyCert);
            this.f10391i.mo8554a();
        } catch (NullPointerException e) {
            C3854a.m9455a(6, "LinkVideo2View", e.getStackTrace());
        }
    }

    @Override // com.bytedance.android.live.broadcast.p192c.p193a.AbstractC3186a
    /* renamed from: a */
    public final void mo8538a(C11672a aVar) {
        C4217d.m10321d().mo9846a("effect_gift", aVar);
    }

    @Override // com.bytedance.android.live.broadcast.api.p187e.AbstractC3060a
    /* renamed from: a */
    public final void mo8322a(PrivacyCert privacyCert) {
        this.f10386d.mo8969b(privacyCert);
    }

    @Override // com.bytedance.android.livesdk.chatroom.interact.AbstractC7600a
    /* renamed from: c */
    public final void mo9074c(PrivacyCert privacyCert) {
        this.f10391i.mo8558d();
        this.f10390h = true;
        AbstractC88412b bVar = this.f10388f;
        if (bVar != null && !bVar.isDisposed()) {
            this.f10388f.dispose();
        }
        C4217d.m10321d().mo9848b();
        this.f10386d.mo8965a(privacyCert);
        this.f10392j.mo8307i(privacyCert);
        this.f10392j.mo8297b(privacyCert);
        this.f10392j.mo8299c(privacyCert);
        AbstractC88412b bVar2 = this.f10388f;
        if (bVar2 != null && !bVar2.isDisposed()) {
            this.f10388f.dispose();
        }
        DataChannelGlobal.f42558d.mo28327c(C3059e.class);
    }

    public LinkVideo2View(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, null);
    }

    public LinkVideo2View(Context context, AbstractC3060a.C3061a aVar) {
        this(context, null, aVar);
    }

    @Override // com.bytedance.android.live.broadcast.api.p187e.AbstractC3060a
    /* renamed from: a_ */
    public final void mo8323a_(boolean z, PrivacyCert privacyCert) {
        int videoCaptureDevice;
        if (z != this.f10393k) {
            this.f10393k = z;
            if (z) {
                this.f10392j.mo8283a(this.f10394l, privacyCert);
                return;
            }
            if (!(this.f10392j.mo8302e() == null || this.f10392j.mo8302e().getBuilder() == null || (videoCaptureDevice = this.f10392j.mo8302e().getBuilder().getVideoCaptureDevice()) == 5)) {
                this.f10394l = videoCaptureDevice;
            }
            this.f10392j.mo8283a(5, privacyCert);
        }
    }

    @Override // com.bytedance.android.live.broadcast.p192c.p193a.AbstractC3186a
    /* renamed from: a */
    public final void mo8539a(String str, String str2) {
        this.f10385c.mo8973a(str, str2);
    }

    @Override // com.bytedance.android.livesdk.chatroom.interact.AbstractC7600a
    /* renamed from: a */
    public final void mo9071a(boolean z, PrivacyCert privacyCert) {
        this.f10392j.mo8295a(z, privacyCert);
    }

    private LinkVideo2View(Context context, AttributeSet attributeSet, AbstractC3060a.C3061a aVar) {
        super(context, attributeSet);
        int i;
        boolean z;
        MethodCollector.m26663i(6856);
        this.f10394l = 1;
        this.f10389g = new AbstractC4149b() {
            /* class com.bytedance.android.live.broadcast.widget.LinkVideo2View.C37562 */

            static {
                Covode.recordClassIndex(4277);
            }

            @Override // com.bytedance.android.live.effect.api.p240a.AbstractC4149b
            /* renamed from: a */
            public final int mo9080a(String str, String str2, int[] iArr) {
                return 0;
            }

            @Override // com.bytedance.android.live.effect.api.p240a.AbstractC4149b
            /* renamed from: b */
            public final int mo9085b(String[] strArr) {
                return 0;
            }

            @Override // com.bytedance.android.live.effect.api.p240a.AbstractC4149b
            /* renamed from: b */
            public final int mo9086b(String[] strArr, String[] strArr2) {
                return 0;
            }

            @Override // com.bytedance.android.live.effect.api.p240a.AbstractC4149b
            /* renamed from: c */
            public final int mo9087c(String[] strArr) {
                return 0;
            }

            @Override // com.bytedance.android.live.effect.api.p240a.AbstractC4149b
            /* renamed from: a */
            public final int mo9078a() {
                LinkVideo2View.this.f10385c.mo8971a();
                return 1;
            }

            @Override // com.bytedance.android.live.effect.api.p240a.AbstractC4149b
            /* renamed from: a */
            public final int mo9082a(boolean z) {
                LinkVideo2View.this.f10385c.mo8977a(z);
                return 1;
            }

            @Override // com.bytedance.android.live.effect.api.p240a.AbstractC4149b
            /* renamed from: a */
            public final int mo9083a(String[] strArr) {
                LinkVideo2View.this.f10385c.mo8978a(strArr);
                return 1;
            }

            @Override // com.bytedance.android.live.effect.api.p240a.AbstractC4149b
            /* renamed from: a */
            public final int mo9081a(String str, boolean z) {
                try {
                    LinkVideo2View.this.f10385c.mo8976a(str, z);
                    return 1;
                } catch (FileNotFoundException e) {
                    C3854a.m9458a("LinkVideo2View", e);
                    return -1;
                }
            }

            @Override // com.bytedance.android.live.effect.api.p240a.AbstractC4149b
            /* renamed from: a */
            public final int mo9084a(String[] strArr, String[] strArr2) {
                LinkVideo2View.this.f10385c.mo8979a(strArr, strArr2);
                return 1;
            }

            @Override // com.bytedance.android.live.effect.api.p240a.AbstractC4149b
            /* renamed from: a */
            public final int mo9079a(String str, String str2, float f) {
                LinkVideo2View.this.f10385c.mo8974a(str, str2, f);
                return 1;
            }
        };
        this.f10383a = aVar;
        String modelFilePath = EnumC3338p.INST.getModelFilePath();
        if (aVar == null || aVar.f8902c != 0) {
            i = 1;
        } else {
            i = 2;
        }
        this.f10393k = true;
        if (aVar != null && !aVar.f8903d) {
            this.f10393k = false;
            i = 5;
        }
        Integer valueOf = Integer.valueOf(AdmTypeSetting.INSTANCE.getValue());
        C9593l a = C9593l.m17932a(valueOf.intValue(), AdmServerCfgSetting.INSTANCE.getValue());
        C3704d.C3705a aVar2 = new C3704d.C3705a(getContext());
        aVar2.f10269v = ((AbstractC4357d) C6193a.m13435a(AbstractC4357d.class)).getProjectKey();
        aVar2.f10237E = new C3224e();
        aVar2.f10267t = new C3225f();
        aVar2.f10238F = new C3223d();
        aVar2.f10264q = i;
        aVar2.f10265r = 5;
        aVar2.f10266s = a;
        aVar2.f10240H = modelFilePath;
        aVar2.f10241I = EnumC3338p.INST.getResourceFinder(getContext());
        C3704d.C3705a a2 = aVar2.mo9020a(240, 320);
        if (LiveGuestLiveAudioCaptureSetting.INSTANCE.getValue()) {
            a2.f10247O = true;
        }
        this.f10392j = new C3678c(a2.mo9021a());
        AbstractC3055a aVar3 = this.f10392j;
        if (aVar == null || aVar.f8904e) {
            z = true;
        } else {
            z = false;
        }
        this.f10386d = new C3691b(this, aVar3, z);
        this.f10391i = new C3200g(this);
        this.f10386d.mo8962a(new C3693c.AbstractC3694a() {
            /* class com.bytedance.android.live.broadcast.widget.LinkVideo2View.C37551 */

            static {
                Covode.recordClassIndex(4276);
            }

            @Override // com.bytedance.android.live.broadcast.stream.capture.C3693c.AbstractC3694a
            /* renamed from: a */
            public final void mo8838a(int i, int i2) {
            }

            @Override // com.bytedance.android.live.broadcast.stream.capture.C3693c.AbstractC3694a
            /* renamed from: a */
            public final void mo8837a() {
                if (!LinkVideo2View.this.f10387e) {
                    LinkVideo2View.this.f10388f = AbstractC88979t.m154310b((Object) 1).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C3781c(this), C3782d.f10483a);
                }
            }
        });
        if ((valueOf.intValue() == 1 || LiveGuestLiveAudioCaptureSetting.INSTANCE.getValue()) && !LiveGuestLinkPreInitEnableSetting.INSTANCE.getValue()) {
            this.f10392j.mo8306h(PrivacyCert.Builder.with("bpea-568").usage("").tag("start link mic audio capture").policies(PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
        }
        DataChannelGlobal.f42558d.mo28321a(C3059e.class, this.f10392j);
        MethodCollector.m26664o(6856);
    }
}
