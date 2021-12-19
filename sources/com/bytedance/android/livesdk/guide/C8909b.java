package com.bytedance.android.livesdk.guide;

import com.bytedance.android.livesdk.livesetting.gift.LiveGiftGuideSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveGuideWattingDurationSetting;
import com.bytedance.android.livesdk.model.message.C9893w;
import com.bytedance.android.livesdk.model.message.p579c.C9698b;
import com.bytedance.android.livesdk.p561j.C9119ed;
import com.bytedance.android.livesdk.service.assets.GiftManager;
import com.bytedance.android.livesdk.utils.p653a.C11200a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.p2082ss.ugc.live.sdk.message.data.IMessage;
import com.p2082ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.p2082ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.concurrent.TimeUnit;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.guide.b */
public final class C8909b implements OnMessageListener {

    /* renamed from: a */
    DataChannel f21963a;

    /* renamed from: b */
    IMessageManager f21964b;

    /* renamed from: c */
    AbstractC8910a f21965c;

    /* renamed from: d */
    public long f21966d;

    /* renamed from: e */
    public C9893w f21967e;

    /* renamed from: f */
    AbstractC88412b f21968f;

    /* renamed from: g */
    public boolean f21969g;

    /* renamed from: h */
    C88411a f21970h = new C88411a();

    /* renamed from: i */
    private boolean f21971i;

    /* renamed from: com.bytedance.android.livesdk.guide.b$a */
    public interface AbstractC8910a {
        static {
            Covode.recordClassIndex(9795);
        }

        /* renamed from: a */
        void mo15165a(long j, C9698b bVar);

        /* renamed from: a */
        void mo15166a(C9698b bVar);
    }

    static {
        Covode.recordClassIndex(9794);
    }

    /* renamed from: a */
    public final void mo15171a() {
        Object obj;
        long j;
        C9698b bVar;
        AbstractC8910a aVar;
        C9698b bVar2;
        if (!this.f21969g) {
            if (!this.f21971i) {
                DataChannel dataChannel = this.f21963a;
                if (dataChannel != null) {
                    obj = dataChannel.mo28318b(C9119ed.class);
                } else {
                    obj = null;
                }
                if (!C89219l.m154714a(obj, (Object) true)) {
                    C9893w wVar = this.f21967e;
                    if (wVar == null || wVar.f23926g) {
                        if (LiveGiftGuideSetting.INSTANCE.getValue() == 2 || LiveGiftGuideSetting.INSTANCE.getValue() == 3) {
                            GiftManager inst = GiftManager.inst();
                            C9893w wVar2 = this.f21967e;
                            long j2 = 0;
                            if (wVar2 != null) {
                                j = wVar2.f23925f;
                            } else {
                                j = 0;
                            }
                            if (inst.findGiftById(j) != null) {
                                AbstractC8910a aVar2 = this.f21965c;
                                if (aVar2 != null) {
                                    C9893w wVar3 = this.f21967e;
                                    if (wVar3 != null) {
                                        j2 = wVar3.f23925f;
                                    }
                                    C9893w wVar4 = this.f21967e;
                                    if (wVar4 != null) {
                                        bVar = wVar4.f23924a;
                                    } else {
                                        bVar = null;
                                    }
                                    aVar2.mo15165a(j2, bVar);
                                }
                            } else {
                                return;
                            }
                        }
                    } else if ((LiveGiftGuideSetting.INSTANCE.getValue() == 1 || LiveGiftGuideSetting.INSTANCE.getValue() == 3) && (aVar = this.f21965c) != null) {
                        C9893w wVar5 = this.f21967e;
                        if (wVar5 != null) {
                            bVar2 = wVar5.f23924a;
                        } else {
                            bVar2 = null;
                        }
                        aVar.mo15166a(bVar2);
                    }
                    this.f21971i = true;
                    this.f21967e = null;
                    return;
                }
            }
            this.f21967e = null;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.guide.b$d */
    static final class C8913d<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C8909b f21974a;

        static {
            Covode.recordClassIndex(9798);
        }

        C8913d(C8909b bVar) {
            this.f21974a = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f21974a.mo15171a();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.guide.b$e */
    static final class C8914e<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C8909b f21975a;

        static {
            Covode.recordClassIndex(9799);
        }

        C8914e(C8909b bVar) {
            this.f21975a = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f21975a.mo15171a();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.guide.b$c */
    static final class C8912c extends AbstractC89220m implements AbstractC89172b<Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C8909b f21973a;

        static {
            Covode.recordClassIndex(9797);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8912c(C8909b bVar) {
            super(1);
            this.f21973a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Boolean bool) {
            if (bool.booleanValue()) {
                this.f21973a.f21969g = true;
            } else {
                this.f21973a.f21969g = false;
                if (this.f21973a.f21967e != null) {
                    this.f21973a.mo15171a();
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.guide.b$b */
    static final class C8911b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C8909b f21972a;

        static {
            Covode.recordClassIndex(9796);
        }

        C8911b(C8909b bVar) {
            this.f21972a = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f21972a.f21966d = C11200a.m19851a();
            if (this.f21972a.f21967e != null) {
                C8909b bVar = this.f21972a;
                AbstractC88412b bVar2 = bVar.f21968f;
                if (bVar2 != null) {
                    bVar2.dispose();
                }
                bVar.f21968f = AbstractC88979t.m154307b((long) LiveGuideWattingDurationSetting.INSTANCE.getValue(), TimeUnit.SECONDS).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143289d(new C8913d(bVar));
            }
        }
    }

    @Override // com.p2082ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        if (iMessage instanceof C9893w) {
            this.f21967e = (C9893w) iMessage;
            if (C11200a.m19851a() - this.f21966d > ((long) LiveGuideWattingDurationSetting.INSTANCE.getValue()) * 1000) {
                mo15171a();
                return;
            }
            AbstractC88412b bVar = this.f21968f;
            if (bVar != null) {
                bVar.dispose();
            }
            long value = (((long) (LiveGuideWattingDurationSetting.INSTANCE.getValue() * 1000)) + this.f21966d) - C11200a.m19851a();
            if (value <= 0) {
                mo15171a();
            } else {
                this.f21968f = AbstractC88979t.m154307b(value, TimeUnit.MILLISECONDS).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143289d(new C8914e(this));
            }
        }
    }
}
