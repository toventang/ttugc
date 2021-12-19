package com.bytedance.android.live.publicscreen.impl.p399e;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.C4139e;
import com.bytedance.android.live.base.model.user.AbstractC2994b;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.p379n.C5764a;
import com.bytedance.android.live.p379n.C5768b;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.live.publicscreen.impl.C5893a;
import com.bytedance.android.live.publicscreen.impl.model.AbstractC6017f;
import com.bytedance.android.live.publicscreen.impl.model.C6022k;
import com.bytedance.android.live.publicscreen.impl.model.C6027m;
import com.bytedance.android.live.publicscreen.impl.model.C6030p;
import com.bytedance.android.live.publicscreen.impl.p395b.View$OnClickListenerC5899a;
import com.bytedance.android.live.publicscreen.impl.p397d.C5937a;
import com.bytedance.android.live.publicscreen.impl.p397d.p398a.C5938a;
import com.bytedance.android.live.publicscreen.impl.p397d.p398a.C5939b;
import com.bytedance.android.live.publicscreen.impl.p397d.p398a.C5940c;
import com.bytedance.android.live.publicscreen.impl.p397d.p398a.C5941d;
import com.bytedance.android.live.publicscreen.impl.p397d.p398a.C5942e;
import com.bytedance.android.live.publicscreen.impl.p400f.C5967b;
import com.bytedance.android.live.publicscreen.p386a.AbstractC5857a;
import com.bytedance.android.live.publicscreen.p386a.AbstractC5859b;
import com.bytedance.android.live.publicscreen.p386a.AbstractC5861c;
import com.bytedance.android.live.publicscreen.p386a.AbstractC5865d;
import com.bytedance.android.live.publicscreen.p386a.AbstractC5880e;
import com.bytedance.android.live.publicscreen.p386a.C5889g;
import com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5872g;
import com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5873h;
import com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5877k;
import com.bytedance.android.live.publicscreen.p386a.p391e.AbstractC5882b;
import com.bytedance.android.live.publicscreen.p386a.p391e.AbstractC5883c;
import com.bytedance.android.live.publicscreen.p386a.p391e.AbstractC5885e;
import com.bytedance.android.live.uikit.p411c.C6229a;
import com.bytedance.android.livesdk.AbstractC10073p;
import com.bytedance.android.livesdk.chatroom.model.C7689i;
import com.bytedance.android.livesdk.chatroom.model.C7692l;
import com.bytedance.android.livesdk.chatroom.model.EnterRoomExtra;
import com.bytedance.android.livesdk.chatroom.p481b.C7302b;
import com.bytedance.android.livesdk.chatroom.p488c.C7367a;
import com.bytedance.android.livesdk.chatroom.p490e.AbstractC7501r;
import com.bytedance.android.livesdk.chatroom.p491f.C7557c;
import com.bytedance.android.livesdk.chatroom.viewmodule.AbstractC8094bq;
import com.bytedance.android.livesdk.like.AbstractC9168b;
import com.bytedance.android.livesdk.livesetting.message.LiveMessageListPreloadSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveChatShowDelayEnabledSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveChatShowDelayForHotLiveSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveCommentTranslationConfigSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveMtIgnoreRoomCheckSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LivePublicScreenConfigSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.TestDisableCommentAreaSetting;
import com.bytedance.android.livesdk.model.C9542az;
import com.bytedance.android.livesdk.model.message.C9595a;
import com.bytedance.android.livesdk.model.message.C9602af;
import com.bytedance.android.livesdk.model.message.C9620at;
import com.bytedance.android.livesdk.model.message.C9627ay;
import com.bytedance.android.livesdk.model.message.C9677bj;
import com.bytedance.android.livesdk.model.message.C9678bk;
import com.bytedance.android.livesdk.model.message.C9690bv;
import com.bytedance.android.livesdk.model.message.C9694bz;
import com.bytedance.android.livesdk.model.message.C9871g;
import com.bytedance.android.livesdk.model.message.C9883n;
import com.bytedance.android.livesdk.model.message.C9895y;
import com.bytedance.android.livesdk.model.message.p577a.EnumC9596a;
import com.bytedance.android.livesdk.model.message.tracking.IdMessage;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p425aa.C6555i;
import com.bytedance.android.livesdk.p430ab.p432b.AbstractC6571a;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.p452ao.AbstractC6804a;
import com.bytedance.android.livesdk.p561j.C9017ak;
import com.bytedance.android.livesdk.p561j.C9093de;
import com.bytedance.android.livesdk.p561j.C9101dm;
import com.bytedance.android.livesdk.p561j.C9119ed;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdk.util.rxutils.autodispose.AbstractC11181z;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.android.livesdk.watch.AbstractC11320a;
import com.bytedance.android.livesdk.watch.AbstractC11325d;
import com.bytedance.android.livesdkapi.depend.model.live.EnumC11728i;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1206f.C17309b;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.ugc.live.sdk.message.data.IMessage;
import com.p2082ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4591l.AbstractC88969g;
import p4560f.p4561a.p4591l.C88960c;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4619j.C89271h;

/* renamed from: com.bytedance.android.live.publicscreen.impl.e.h */
public class C5953h extends AbstractC7501r<AbstractC5956a> implements AbstractC5865d, AbstractC5882b, AbstractC5883c, OnMessageListener {

    /* renamed from: A */
    private boolean f14906A;

    /* renamed from: B */
    private C7689i f14907B;

    /* renamed from: C */
    private boolean f14908C;

    /* renamed from: D */
    private int f14909D;

    /* renamed from: E */
    private int f14910E;

    /* renamed from: F */
    private final Map<Class<? extends AbstractC6571a>, AbstractC5861c<? extends AbstractC6571a>> f14911F;

    /* renamed from: G */
    private C5937a f14912G;

    /* renamed from: H */
    private boolean f14913H;

    /* renamed from: I */
    private long f14914I;

    /* renamed from: J */
    private int f14915J;

    /* renamed from: K */
    private int f14916K;

    /* renamed from: L */
    private AbstractC11320a f14917L;

    /* renamed from: a */
    public long f14918a;

    /* renamed from: b */
    public CharSequence f14919b = "";

    /* renamed from: c */
    public C9871g f14920c;

    /* renamed from: d */
    public C7692l f14921d;

    /* renamed from: e */
    public int f14922e;

    /* renamed from: f */
    public final int f14923f;

    /* renamed from: g */
    public final Queue<AbstractC5873h> f14924g;

    /* renamed from: h */
    public final Queue<AbstractC5873h> f14925h;

    /* renamed from: i */
    public final Queue<AbstractC5873h> f14926i;

    /* renamed from: j */
    public final List<AbstractC5873h> f14927j;

    /* renamed from: k */
    public AbstractC88969g<List<AbstractC5877k<? extends AbstractC6571a>>> f14928k;

    /* renamed from: l */
    public final C5947e f14929l;

    /* renamed from: m */
    public C5889g f14930m;

    /* renamed from: n */
    public final Handler f14931n;

    /* renamed from: o */
    public boolean f14932o;

    /* renamed from: p */
    public final Runnable f14933p;

    /* renamed from: q */
    public final C5946d f14934q;

    /* renamed from: r */
    public Runnable f14935r;

    /* renamed from: s */
    private final int f14936s;

    /* renamed from: t */
    private final boolean f14937t;

    /* renamed from: u */
    private final Comparator<AbstractC5873h> f14938u;

    /* renamed from: v */
    private final int f14939v;

    /* renamed from: z */
    private boolean f14940z;

    /* renamed from: com.bytedance.android.live.publicscreen.impl.e.h$a */
    public interface AbstractC5956a extends AbstractC5857a, AbstractC8094bq {
        static {
            Covode.recordClassIndex(6564);
        }

        /* renamed from: a */
        void mo11841a();

        /* renamed from: a */
        void mo11842a(int i);

        /* renamed from: a */
        void mo11843a(AbstractC5873h hVar);

        /* renamed from: b */
        void mo11844b();

        /* renamed from: b */
        void mo11845b(int i);

        /* renamed from: c */
        void mo11846c();

        /* renamed from: c */
        void mo11847c(int i);

        /* renamed from: d */
        void mo11848d();

        /* renamed from: d */
        void mo11849d(int i);

        /* renamed from: e */
        boolean mo11850e();

        /* renamed from: f */
        void mo11851f();

        /* renamed from: h */
        void mo11852h();
    }

    static {
        Covode.recordClassIndex(6561);
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.AbstractC5865d
    /* renamed from: d */
    public final int mo11672d() {
        return this.f14936s;
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.AbstractC5865d
    /* renamed from: e */
    public final boolean mo11673e() {
        return this.f14937t;
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.p391e.AbstractC5883c
    /* renamed from: a */
    public final <MESSAGE extends AbstractC6571a> void mo11736a(Class<MESSAGE> cls, AbstractC5861c<MESSAGE> cVar) {
        this.f14911F.put(cls, cVar);
    }

    /* renamed from: a */
    public final void mo10297a(AbstractC5956a aVar) {
        boolean z;
        super.mo10297a((AbstractC8094bq) aVar);
        boolean booleanValue = ((Boolean) this.f18624w.mo28318b(C9119ed.class)).booleanValue();
        Room room = (Room) this.f18624w.mo28318b(C9093de.class);
        C7692l value = LivePublicScreenConfigSetting.getValue();
        this.f14921d = value;
        this.f14922e = value.f19065a;
        C7689i value2 = LiveCommentTranslationConfigSetting.INSTANCE.getValue();
        this.f14907B = value2;
        this.f14906A = value2.f19057a;
        EnterRoomExtra enterRoomExtra = (EnterRoomExtra) this.f18624w.mo28318b(C9017ak.class);
        boolean z2 = true;
        if (!this.f14906A || booleanValue || room == null || ((room.mRoomAuthStatus != null && !room.mRoomAuthStatus.enableChat) || enterRoomExtra == null || enterRoomExtra.isSameAppLanguage)) {
            this.f14908C = false;
        } else {
            int a = C17309b.m32048a(((AbstractC5956a) this.f38654y).getContext(), C17309b.f41588b).mo27617a("live.mt.text_message.guidance_total_display_count", 0);
            this.f14909D = a;
            if (a < this.f14907B.f19059c) {
                this.f14910E = C17309b.m32048a(((AbstractC5956a) this.f38654y).getContext(), C17309b.f41588b).mo27617a("live.mt.text_message.guidance_daily_display_count", 0);
                int a2 = C17309b.m32048a(((AbstractC5956a) this.f38654y).getContext(), C17309b.f41588b).mo27617a("live.mt.text_message.guidance_last_display_year", 0);
                int a3 = C17309b.m32048a(((AbstractC5956a) this.f38654y).getContext(), C17309b.f41588b).mo27617a("live.mt.text_message.guidance_last_display_day", 0);
                Calendar instance = Calendar.getInstance();
                if (!(a2 == instance.get(1) && a3 == instance.get(6))) {
                    this.f14910E = 0;
                }
                if (this.f14910E < this.f14907B.f19058b) {
                    z = true;
                } else {
                    z = false;
                }
                this.f14908C = z;
            } else {
                this.f14908C = false;
            }
        }
        this.f14930m = new C5889g(aVar.getContext(), aVar, C6229a.m13521a(aVar.getContext()), aVar.mo11850e(), this.f14906A, booleanValue, room, room.getOwner(), this.f18624w, aVar, this);
        for (AbstractC5873h hVar : this.f14927j) {
            if (hVar instanceof AbstractC5872g) {
                ((AbstractC5872g) hVar).mo11685a(this.f14930m);
            }
        }
        C5937a aVar2 = new C5937a();
        this.f14912G = aVar2;
        aVar2.f14863a.put(C9595a.class, new C5938a());
        aVar2.f14863a.put(C9883n.class, new C5939b());
        aVar2.f14863a.put(C9627ay.class, new C5942e());
        aVar2.f14863a.put(C9895y.class, new C5940c());
        aVar2.f14863a.put(C9620at.class, new C5941d());
        List<AbstractC5885e> onRegistryReadyListeners = ((AbstractC5880e) C6193a.m13435a(AbstractC5880e.class)).getOnRegistryReadyListeners();
        if (!onRegistryReadyListeners.isEmpty()) {
            for (AbstractC5885e eVar : onRegistryReadyListeners) {
                eVar.mo10595a(this.f14912G);
            }
        }
        List<AbstractC5885e> onRegistryReadyListeners2 = ((AbstractC5880e) C6193a.m13435a(AbstractC5880e.class)).getOnRegistryReadyListeners();
        if (!onRegistryReadyListeners2.isEmpty()) {
            for (AbstractC5885e eVar2 : onRegistryReadyListeners2) {
                eVar2.mo10597a((AbstractC5883c) this);
            }
        }
        this.f18624w.mo28313b((AbstractC1204m) this.f38654y, C5768b.class, (AbstractC89172b) new C5958j(this)).mo28313b((AbstractC1204m) this.f38654y, C5764a.class, (AbstractC89172b) new C5959k(this));
        ((AbstractC11181z) C6779a.m14563a().mo13052a(C7367a.class).mo143274a(mo13748u())).mo17949a(new C5960l(this));
        if (this.f14930m.f14752i && this.f14930m.f14753j != null && this.f14930m.f14753j.getStreamType() == EnumC11728i.SCREEN_RECORD) {
            this.f14940z = true;
        }
        if (this.f18625x != null) {
            this.f18625x.addMessageListener(EnumC9596a.CHAT.getIntType(), this);
            this.f18625x.addMessageListener(EnumC9596a.EMOTE_CHAT.getIntType(), this);
            this.f18625x.addMessageListener(EnumC9596a.GIFT.getIntType(), this);
            this.f18625x.addMessageListener(EnumC9596a.MEMBER.getIntType(), this);
            this.f18625x.addMessageListener(EnumC9596a.DIGG.getIntType(), this);
            AbstractC9168b likeHelper = ((AbstractC10073p) C6193a.m13435a(AbstractC10073p.class)).getLikeHelper(this.f14930m.f14744a);
            if (likeHelper != null && likeHelper.mo15295n()) {
                this.f18625x.addMessageListener(EnumC9596a.LIKE.getIntType(), this);
            }
            this.f18625x.addMessageListener(EnumC9596a.ROOM.getIntType(), this);
            this.f18625x.addMessageListener(EnumC9596a.SOCIAL.getIntType(), this);
            this.f18625x.addMessageListener(EnumC9596a.CONTROL.getIntType(), this);
            this.f18625x.addMessageListener(EnumC9596a.SCREEN.getIntType(), this);
            this.f18625x.addMessageListener(EnumC9596a.ROOM_RICH_CHAT_MESSAGE.getIntType(), this);
            this.f18625x.addMessageListener(EnumC9596a.COMMENT_IMAGE.getIntType(), this);
            this.f18625x.addMessageListener(EnumC9596a.GOODS_ORDER.getIntType(), this);
            this.f18625x.addMessageListener(EnumC9596a.ASSET_MESSAGE.getIntType(), this);
            this.f18625x.addMessageListener(EnumC9596a.PORTAL_MESSAGE.getIntType(), this);
            this.f18625x.addMessageListener(EnumC9596a.LIVE_INTRO_MESSAGE.getIntType(), this);
            this.f18625x.addMessageListener(EnumC9596a.ROOM_VERIFY.getIntType(), this);
            this.f18625x.addMessageListener(EnumC9596a.BOTTOM_MESSAGE.getIntType(), this);
            this.f18625x.addMessageListener(EnumC9596a.IM_DELETE.getIntType(), this);
            this.f18625x.addMessageListener(EnumC9596a.QUESTION_DELETE_MESSAGE.getIntType(), this);
            this.f18625x.addMessageListener(EnumC9596a.RED_ENVELOPE_MESSAGE.getIntType(), this);
            this.f18625x.addMessageListener(EnumC9596a.WISH_LIST_UPDATE_MESSAGE.getIntType(), this);
        }
        List<AbstractC5885e> onRegistryReadyListeners3 = ((AbstractC5880e) C6193a.m13435a(AbstractC5880e.class)).getOnRegistryReadyListeners();
        if (!onRegistryReadyListeners3.isEmpty()) {
            for (AbstractC5885e eVar3 : onRegistryReadyListeners3) {
                eVar3.mo10596a((AbstractC5882b) this);
            }
        }
        this.f14931n.postDelayed(this.f14933p, (long) this.f14923f);
        this.f14932o = false;
        mo11834a((this.f14930m.f14752i && AbstractC6804a.f16969bR.mo13066a().booleanValue()) || (!this.f14930m.f14752i && this.f14930m.f14753j != null && (this.f14930m.f14753j.mRoomAuthStatus == null || this.f14930m.f14753j.mRoomAuthStatus.enableChat)));
        this.f14914I = SystemClock.uptimeMillis();
        this.f14915J = 0;
        this.f14916K = 0;
        if (!this.f14927j.isEmpty() || LiveMessageListPreloadSetting.INSTANCE.getValue() != 1) {
            z2 = false;
        }
        this.f14913H = z2;
        C5946d dVar = this.f14934q;
        C5889g gVar = this.f14930m;
        C89219l.m154721d(gVar, "");
        Iterator<AbstractC5944b> it = dVar.f14866b.iterator();
        while (it.hasNext()) {
            it.next().mo11793a(gVar);
        }
        Iterator<AbstractC5944b> it2 = this.f14934q.f14866b.iterator();
        while (it2.hasNext()) {
            it2.next().mo11795b();
        }
        C5893a aVar3 = (C5893a) C6193a.m13435a(AbstractC5880e.class);
        aVar3.registerPresenter(this.f14930m.f14744a, this);
        C9871g pendingBottomMessage = aVar3.getPendingBottomMessage(this.f14930m.f14744a);
        if (pendingBottomMessage != null) {
            mo11833a(pendingBottomMessage);
        } else if (this.f14918a > 0) {
            mo11838h();
            aVar.mo11844b();
        }
        AbstractC11320a createShareGuideEvasionStrategy = ((AbstractC11325d) C6193a.m13435a(AbstractC11325d.class)).createShareGuideEvasionStrategy(this.f18624w);
        this.f14917L = createShareGuideEvasionStrategy;
        createShareGuideEvasionStrategy.mo17744a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo11834a(boolean z) {
        if (this.f38654y != null) {
            if (!z || !m13029i()) {
                ((AbstractC5956a) this.f38654y).mo11848d();
            } else {
                ((AbstractC5956a) this.f38654y).mo11846c();
            }
        }
    }

    /* renamed from: a */
    public final void mo11831a(int i, AbstractC5873h hVar) {
        if (i >= 0 && i < this.f14927j.size() && hVar != null && this.f38654y != null && this.f14930m != null) {
            if (!this.f14927j.contains(hVar) && (hVar instanceof AbstractC5872g)) {
                ((AbstractC5872g) hVar).mo11685a(this.f14930m);
            }
            this.f14927j.get(i).mo11692r();
            this.f14927j.set(i, hVar);
            ((AbstractC5956a) this.f38654y).mo11842a(i);
        }
    }

    /* renamed from: a */
    public final long mo11829a(AbstractC6571a aVar, boolean z) {
        AbstractC11320a aVar2;
        this.f14934q.mo11813a(aVar);
        if (TestDisableCommentAreaSetting.INSTANCE.getValue()) {
            return 0;
        }
        if (this.f38654y == null) {
            C5967b.m13084a(aVar, "Message discarded because of null view interface.");
            return 0;
        } else if (!aVar.mo18721a(this.f14930m.f14744a) && !LiveMtIgnoreRoomCheckSetting.INSTANCE.getValue()) {
            if (((IHostContext) C6193a.m13435a(IHostContext.class)).isLocalTest()) {
                C11226ao.m19883a(C3966y.m9669e(), "The message's room id differs from the current room. So it's discarded.", 0);
            }
            C5967b.m13084a(aVar, "Message discarded because it doesn't belong to this room.");
            return 0;
        } else if (aVar instanceof C9871g) {
            mo11833a((C9871g) aVar);
            return 0;
        } else {
            if (aVar instanceof C9694bz) {
                if (this.f14930m.f14752i) {
                    return 0;
                }
                if (!(this.f14930m.f14753j == null || this.f14930m.f14753j.mRoomAuthStatus == null)) {
                    C9694bz bzVar = (C9694bz) aVar;
                    if (bzVar.f23626a == 3) {
                        this.f14930m.f14753j.mRoomAuthStatus.setEnableChat(false);
                        mo11834a(false);
                    } else if (bzVar.f23626a == 4) {
                        this.f14930m.f14753j.mRoomAuthStatus.setEnableChat(true);
                        mo11834a(true);
                    }
                    return 0;
                }
            }
            if (aVar instanceof C9602af) {
                m13018a((C9602af) aVar);
                return 0;
            } else if (aVar instanceof C9677bj) {
                m13020a((C9677bj) aVar);
                return 0;
            } else {
                if (aVar instanceof C9627ay) {
                    m13019a((C9627ay) aVar);
                }
                if (this.f14930m.f14753j != null && this.f14930m.f14753j.mRoomAuthStatus != null && (((this.f14930m.f14752i && !AbstractC6804a.f16969bR.mo13066a().booleanValue()) || (!this.f14930m.f14752i && !this.f14930m.f14753j.mRoomAuthStatus.enableChat)) && !(aVar instanceof C9690bv))) {
                    return 0;
                }
                AbstractC5859b<? extends IMessage> bVar = this.f14912G.f14863a.get(aVar.getClass());
                if (bVar == null || !bVar.mo10373a(aVar, this.f14930m)) {
                    AbstractC5873h a = mo11830a(aVar);
                    if (a == null) {
                        return 0;
                    }
                    if (!(a instanceof C6030p) || (aVar2 = this.f14917L) == null || aVar2.mo17747c()) {
                        if (a instanceof AbstractC5872g) {
                            ((AbstractC5872g) a).mo11685a(this.f14930m);
                        }
                        if (!aVar.mo15100b()) {
                            C5967b.m13084a(aVar, "Message discarded because it cannot be displayed as a text message.");
                            return 0;
                        }
                        this.f14934q.mo11811a(a);
                        if (a.mo11689o() || z) {
                            mo11837d(a);
                        } else if (!this.f14913H || SystemClock.uptimeMillis() - this.f14914I > ((long) this.f14923f)) {
                            m13026f(a);
                        } else if (a.mo11682j()) {
                            if (this.f14916K <= 0) {
                                mo11837d(a);
                                this.f14916K++;
                            } else {
                                m13026f(a);
                            }
                        } else if (this.f14915J <= m13031j()) {
                            mo11837d(a);
                            this.f14915J++;
                        } else {
                            m13026f(a);
                        }
                        m13034k(a);
                        return a.mo11691q();
                    }
                    this.f14917L.mo17745a(new RunnableC5961m(this, aVar));
                    return 0;
                }
                this.f14934q.mo11810a(bVar, aVar);
                return 0;
            }
        }
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.AbstractC5865d
    /* renamed from: a */
    public final void mo11668a(AbstractC5873h hVar) {
        C5946d dVar = this.f14934q;
        C89219l.m154721d(hVar, "");
        Iterator<AbstractC5944b> it = dVar.f14866b.iterator();
        while (it.hasNext()) {
            it.next().mo11792a(hVar);
        }
    }

    /* renamed from: a */
    public final void mo11833a(C9871g gVar) {
        if (gVar != null && gVar.f28134O != null && gVar.f28134O.f28144j != null) {
            if (m13036m() && (gVar.f23849i == 1 || gVar.f23849i == 2)) {
                return;
            }
            if (!m13036m() || gVar.f23849i != 5 || this.f14920c.f23849i == 1 || this.f14920c.f23849i == 2) {
                if (gVar.f23849i == 5) {
                    C6501b.C6502a.m13948a("livesdk_tns_ags_popup_message_warning").mo12643a(this.f18624w).mo12646a("user_id", C11115u.m19743a().mo17915b().mo13161c()).mo12655b();
                }
                long j = gVar.f23848h >= 0 ? gVar.f23848h : Long.MAX_VALUE;
                this.f14918a = j;
                gVar.f23848h = j;
                this.f14919b = C7557c.m15538a(gVar.f28134O.f28144j, "");
                this.f14920c = gVar;
                ((AbstractC5956a) this.f38654y).mo11844b();
            }
        }
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.AbstractC5865d
    /* renamed from: a */
    public final AbstractC88979t<List<AbstractC5877k<? extends AbstractC6571a>>> mo11667a() {
        if (!this.f14940z) {
            return null;
        }
        AbstractC88969g<List<AbstractC5877k<? extends AbstractC6571a>>> gVar = this.f14928k;
        if (gVar != null) {
            gVar.onComplete();
        } else {
            this.f14931n.postDelayed(this.f14935r, 1000);
        }
        C88960c cVar = new C88960c();
        this.f14928k = cVar;
        return cVar;
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.AbstractC5865d
    /* renamed from: a */
    public final void mo11669a(AbstractC5877k<? extends AbstractC6571a> kVar) {
        C5889g gVar;
        String str;
        if (kVar != null && kVar.mo10375b() != null && this.f38654y != null && (gVar = this.f14930m) != null && gVar.f14753j != null && this.f14930m.f14750g && this.f14930m.f14755l != null) {
            if (kVar instanceof AbstractC6017f) {
                AbstractC6017f fVar = (AbstractC6017f) kVar;
                if (!this.f14930m.f14751h) {
                    str = "";
                } else if (fVar.mo11878s()) {
                    str = C3966y.m9657a((int) R.string.emj);
                } else {
                    str = C3966y.m9657a((int) R.string.emh);
                }
                Context context = this.f14930m.f14747d;
                User b = kVar.mo10375b();
                Room room = this.f14930m.f14753j;
                boolean z = this.f14930m.f14752i;
                MESSAGE message = kVar.f14737d;
                AbstractC2994b bVar = (AbstractC2994b) this.f18624w.mo28318b(C9101dm.class);
                boolean z2 = this.f14930m.f14751h;
                if (str == null) {
                    str = "";
                }
                new View$OnClickListenerC5899a(context, b, room, z, message, bVar, z2, str, new C5962n(this, fVar, kVar)).show();
            } else {
                new View$OnClickListenerC5899a(this.f14930m.f14747d, kVar.mo10375b(), this.f14930m.f14753j, this.f14930m.f14752i, kVar.f14737d, (AbstractC2994b) this.f18624w.mo28318b(C9101dm.class), false, "", null).show();
            }
            C6501b.C6502a.m13948a("livesdk_long_press_comment").mo12643a(this.f14930m.f14755l).mo12651a("user_type", kVar.mo11702C() ? "anchor" : "user").mo12646a("to_user_id", kVar.mo11704E()).mo12655b();
            MESSAGE message2 = kVar.f14737d;
            if (message2 != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("longClickedMessage", C4139e.C4140a.f11575b.mo46674b(IdMessage.from(message2)));
                C6555i.m14021b().mo9217b("ttlive_text_message_long_clicked", hashMap);
            }
        }
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.AbstractC5865d
    /* renamed from: f */
    public final int mo11674f() {
        return this.f14924g.size();
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.AbstractC5865d
    /* renamed from: g */
    public final int mo11675g() {
        return this.f14926i.size();
    }

    /* renamed from: h */
    public final void mo11838h() {
        this.f14918a--;
    }

    /* renamed from: j */
    private int m13031j() {
        C7689i iVar = this.f14907B;
        if (iVar == null) {
            return Integer.MAX_VALUE;
        }
        return iVar.f19060d;
    }

    /* renamed from: k */
    private int m13033k() {
        if (this.f14937t) {
            return this.f14939v;
        }
        return 100;
    }

    /* renamed from: m */
    private boolean m13036m() {
        if (this.f14918a > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    private void m13035l() {
        C6501b.C6502a.m13948a("livesdk_anchor_host_notice").mo12643a(this.f18624w).mo12651a("event_type", "show").mo12655b();
    }

    /* renamed from: i */
    private boolean m13029i() {
        if (this.f14930m.f14753j == null) {
            return false;
        }
        if (this.f14930m.f14753j.getRoomAuthStatus() == null || this.f14930m.f14753j.getRoomAuthStatus().isMessageEnable()) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.AbstractC5865d
    /* renamed from: c */
    public final boolean mo11671c() {
        if (!this.f14932o) {
            boolean z = false;
            int size = this.f14925h.size() + 0;
            Iterator<AbstractC5873h> it = this.f14924g.iterator();
            while (it.hasNext() && it.next().mo11690p() <= SystemClock.uptimeMillis()) {
                size++;
            }
            if (size >= m13031j()) {
                z = true;
            }
            this.f14932o = z;
        }
        return this.f14932o;
    }

    public C5953h() {
        int i = LivePublicScreenConfigSetting.getValue().f19066b;
        this.f14923f = i;
        int value = LiveChatShowDelayForHotLiveSetting.INSTANCE.getValue();
        this.f14936s = value;
        this.f14937t = LiveChatShowDelayEnabledSetting.INSTANCE.getValue();
        Comparator<AbstractC5873h> comparator = C5957i.f14943a;
        this.f14938u = comparator;
        this.f14939v = (int) ((((float) (value + i)) / ((float) i)) * 100.0f);
        this.f14924g = new PriorityQueue(m13033k(), comparator);
        this.f14925h = new ArrayDeque(100);
        this.f14926i = new ArrayDeque(8);
        this.f14927j = new ArrayList(200);
        this.f14940z = false;
        this.f14929l = new C5947e();
        this.f14911F = new HashMap();
        this.f14931n = new Handler();
        this.f14932o = false;
        this.f14933p = new Runnable() {
            /* class com.bytedance.android.live.publicscreen.impl.p399e.C5953h.RunnableC59541 */

            static {
                Covode.recordClassIndex(6562);
            }

            public final void run() {
                int i;
                if (C5953h.this.f38654y != null && C5953h.this.f14930m != null) {
                    C5953h hVar = C5953h.this;
                    if (hVar.f38654y != null) {
                        ((AbstractC5956a) hVar.f38654y).mo11851f();
                    }
                    Iterator<AbstractC5944b> it = hVar.f14934q.f14866b.iterator();
                    while (it.hasNext()) {
                        it.next().mo11801d();
                    }
                    if (C5953h.this.f14926i.size() > 0) {
                        C5953h hVar2 = C5953h.this;
                        hVar2.mo11837d(hVar2.f14926i.poll());
                        i = 1;
                    } else {
                        i = 0;
                    }
                    boolean z = false;
                    while (i < C5953h.this.f14922e && (C5953h.this.f14925h.size() != 0 || (C5953h.this.f14924g.size() != 0 && !z))) {
                        if (C5953h.this.f14925h.size() > 0) {
                            C5953h hVar3 = C5953h.this;
                            hVar3.mo11837d(hVar3.f14925h.poll());
                        } else {
                            AbstractC5873h peek = C5953h.this.f14924g.peek();
                            if (peek != null) {
                                if (peek.mo11690p() == 0) {
                                    C5953h.this.mo11837d(peek);
                                    C5953h.this.f14924g.poll();
                                } else if (peek.mo11690p() <= SystemClock.uptimeMillis()) {
                                    C5953h.this.mo11837d(peek);
                                    C5953h.this.f14924g.poll();
                                }
                            }
                            z = true;
                        }
                        i++;
                    }
                    C5953h.this.f14932o = false;
                    C5953h.this.f14931n.postDelayed(C5953h.this.f14933p, (long) C5953h.this.f14923f);
                    Iterator<AbstractC5944b> it2 = C5953h.this.f14934q.f14866b.iterator();
                    while (it2.hasNext()) {
                        it2.next();
                    }
                }
            }
        };
        C5946d dVar = new C5946d();
        this.f14934q = dVar;
        this.f14935r = new Runnable() {
            /* class com.bytedance.android.live.publicscreen.impl.p399e.C5953h.RunnableC59552 */

            static {
                Covode.recordClassIndex(6563);
            }

            public final void run() {
                if (C5953h.this.f14928k != null) {
                    C5947e eVar = C5953h.this.f14929l;
                    ArrayDeque<AbstractC5877k<?>> arrayDeque = eVar.f14870a;
                    if (arrayDeque == null) {
                        C89219l.m154710a("messageQueue");
                    }
                    ArrayList arrayList = new ArrayList();
                    for (int c = C89271h.m154772c(100, arrayDeque.size()); c > 0; c--) {
                        ArrayDeque<AbstractC5877k<?>> arrayDeque2 = eVar.f14870a;
                        if (arrayDeque2 == null) {
                            C89219l.m154710a("messageQueue");
                        }
                        AbstractC5877k<?> pollFirst = arrayDeque2.pollFirst();
                        if (pollFirst == null) {
                            break;
                        }
                        if (!eVar.mo11824b(pollFirst)) {
                            arrayList.add(pollFirst);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        C5953h.this.f14928k.onNext(arrayList);
                    }
                    C5953h.this.f14931n.postDelayed(C5953h.this.f14935r, 1000);
                }
            }
        };
        dVar.mo11812a(new C5943a());
        dVar.mo11812a(new C5965q());
    }

    @Override // com.bytedance.ies.p1114a.AbstractC16043b, com.bytedance.android.livesdk.chatroom.p490e.AbstractC7501r
    /* renamed from: b */
    public final void mo8577b() {
        super.mo8577b();
        this.f14931n.removeCallbacksAndMessages(null);
        int size = this.f14925h.size();
        AbstractC5873h peek = this.f14925h.isEmpty() ? null : this.f14925h.peek();
        int size2 = this.f14926i.size();
        AbstractC5873h peek2 = this.f14926i.isEmpty() ? null : this.f14926i.peek();
        int size3 = this.f14924g.size();
        AbstractC5873h peek3 = this.f14924g.isEmpty() ? null : this.f14924g.peek();
        HashMap hashMap = new HashMap();
        hashMap.put("stillInBufferSelfMessageCount", Integer.valueOf(size));
        if (!(peek instanceof AbstractC5877k)) {
            peek = null;
        }
        AbstractC5877k kVar = (AbstractC5877k) peek;
        if (kVar != null) {
            hashMap.put("firstSelfMessage", C4139e.C4140a.f11575b.mo46674b(IdMessage.from(kVar.f14737d)));
        }
        hashMap.put("stillInBufferFoldedMessageCount", Integer.valueOf(size2));
        if (!(peek2 instanceof AbstractC5877k)) {
            peek2 = null;
        }
        AbstractC5877k kVar2 = (AbstractC5877k) peek2;
        if (kVar2 != null) {
            hashMap.put("firstFoldedMessage", C4139e.C4140a.f11575b.mo46674b(IdMessage.from(kVar2.f14737d)));
        }
        hashMap.put("stillInBufferMessageCount", Integer.valueOf(size3));
        if (!(peek3 instanceof AbstractC5877k)) {
            peek3 = null;
        }
        AbstractC5877k kVar3 = (AbstractC5877k) peek3;
        if (kVar3 != null) {
            hashMap.put("firstMessage", C4139e.C4140a.f11575b.mo46674b(IdMessage.from(kVar3.f14737d)));
        }
        C6555i.m14021b().mo9217b("ttlive_widget_destroyed", hashMap);
        for (AbstractC5873h hVar : this.f14927j) {
            hVar.mo11692r();
        }
        this.f14912G.f14863a.clear();
        this.f14911F.clear();
        ((C5893a) C6193a.m13435a(AbstractC5880e.class)).unregisterPresenter(this.f14930m.f14744a);
        this.f14934q.mo11809a();
        this.f14917L.mo17746b();
        this.f14917L = null;
    }

    @Override // com.p2082ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public void onMessage(IMessage iMessage) {
        mo11829a((AbstractC6571a) iMessage, false);
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.p391e.AbstractC5882b
    /* renamed from: a */
    public final void mo11735a(int i) {
        if (this.f18625x != null) {
            this.f18625x.addMessageListener(i, this);
        }
    }

    /* renamed from: k */
    private void m13034k(AbstractC5873h hVar) {
        if (this.f14940z && (hVar instanceof AbstractC5877k)) {
            this.f14929l.mo11823a((AbstractC5877k) hVar);
        }
    }

    /* renamed from: a */
    public final AbstractC5873h mo11830a(AbstractC6571a aVar) {
        AbstractC5861c<? extends AbstractC6571a> cVar;
        AbstractC5873h a = C6022k.m13208a(aVar);
        if (a == null && ((cVar = this.f14911F.get(aVar.getClass())) == null || (a = cVar.mo10369a(aVar)) == null)) {
            C5967b.m13084a(aVar, "Message discarded because of no definition of PublicScreenModel.");
        }
        return a;
    }

    /* renamed from: b */
    public final void mo11835b(int i) {
        this.f14927j.get(i).mo11692r();
        this.f14927j.remove(i);
        ((AbstractC5956a) this.f38654y).mo11847c(i);
    }

    /* renamed from: c */
    public final void mo11836c(AbstractC5873h hVar) {
        int indexOf;
        if (hVar != null && this.f38654y != null && this.f14930m != null && (indexOf = this.f14927j.indexOf(hVar)) != -1) {
            this.f14927j.set(indexOf, hVar);
            ((AbstractC5956a) this.f38654y).mo11842a(indexOf);
        }
    }

    /* renamed from: d */
    public final void mo11837d(AbstractC5873h hVar) {
        m13032j(hVar);
        m13025e(hVar);
        hVar.mo11680h().f14731c = SystemClock.uptimeMillis();
        this.f14934q.mo11822j(hVar);
    }

    /* renamed from: b */
    private void m13023b(AbstractC5877k<? extends AbstractC6571a> kVar) {
        if (kVar.f14737d.f28131L == EnumC9596a.DIGG || kVar.f14737d.f28131L == EnumC9596a.ROOM || (kVar.f14737d.f28131L == EnumC9596a.MEMBER && ((C9627ay) kVar.f14737d).f23446h == 1)) {
            m13024c(kVar);
        } else if (kVar.f14737d.f28131L == EnumC9596a.LINK_CO_HOST_GUIDE) {
            m13035l();
        }
    }

    /* renamed from: g */
    private boolean m13027g(AbstractC5873h hVar) {
        if (this.f14925h.size() < 100) {
            this.f14925h.add(hVar);
            hVar.mo11680h().f14729a = true;
            hVar.mo11680h().f14730b = SystemClock.uptimeMillis();
            this.f14934q.mo11814b(hVar);
            this.f14934q.mo11815c(hVar);
            return true;
        }
        hVar.mo11692r();
        this.f14934q.mo11818f(hVar);
        this.f14934q.mo11819g(hVar);
        return false;
    }

    /* renamed from: h */
    private boolean m13028h(AbstractC5873h hVar) {
        if (this.f14926i.size() < 8) {
            this.f14926i.add(hVar);
            hVar.mo11684l().f14732a = true;
            hVar.mo11680h().f14729a = true;
            hVar.mo11680h().f14730b = SystemClock.uptimeMillis();
            this.f14934q.mo11814b(hVar);
            this.f14934q.mo11817e(hVar);
            return true;
        }
        hVar.mo11692r();
        this.f14934q.mo11818f(hVar);
        this.f14934q.mo11821i(hVar);
        return false;
    }

    /* renamed from: a */
    private void m13018a(C9602af afVar) {
        if (this.f38654y != null) {
            for (int size = this.f14927j.size() - 1; size >= 0; size--) {
                AbstractC5873h hVar = this.f14927j.get(size);
                if (hVar.mo11688n() && (hVar instanceof AbstractC5877k)) {
                    AbstractC5877k kVar = (AbstractC5877k) hVar;
                    if ((afVar.f23309f != null && afVar.f23309f.contains(Long.valueOf(kVar.mo11704E()))) || (afVar.f23308a != null && afVar.f23308a.contains(Long.valueOf(kVar.f14737d.getMessageId())))) {
                        this.f14927j.remove(size);
                        ((AbstractC5956a) this.f38654y).mo11847c(size);
                        ((AbstractC5956a) this.f38654y).mo11849d(this.f14927j.size() - 1);
                    }
                }
            }
            m13021a(this.f14924g, afVar);
            m13021a(this.f14925h, afVar);
            this.f14932o = false;
        }
    }

    /* renamed from: f */
    private void m13026f(AbstractC5873h hVar) {
        if (!hVar.mo11681i() || !hVar.mo11687m()) {
            if (hVar.mo11682j()) {
                if (!m13028h(hVar) && (hVar instanceof AbstractC5877k)) {
                    C5967b.m13086b(((AbstractC5877k) hVar).f14737d, "Message discarded because it exceeds fold message buffer size.");
                }
            } else if (!m13030i(hVar) && (hVar instanceof AbstractC5877k)) {
                C5967b.m13086b(((AbstractC5877k) hVar).f14737d, "Message discarded because it exceeds other message buffer size.");
            }
        } else if (!m13027g(hVar) && (hVar instanceof AbstractC5877k)) {
            C5967b.m13086b(((AbstractC5877k) hVar).f14737d, "Message discarded because it exceeds self message buffer size.");
        }
    }

    /* renamed from: i */
    private boolean m13030i(AbstractC5873h hVar) {
        if (this.f14924g.size() < m13033k()) {
            this.f14924g.add(hVar);
            hVar.mo11680h().f14729a = true;
            hVar.mo11680h().f14730b = SystemClock.uptimeMillis();
            this.f14934q.mo11814b(hVar);
            this.f14934q.mo11816d(hVar);
            return true;
        }
        hVar.mo11692r();
        this.f14934q.mo11818f(hVar);
        this.f14934q.mo11820h(hVar);
        return false;
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.AbstractC5865d
    /* renamed from: b */
    public final void mo11670b(AbstractC5873h hVar) {
        C5946d dVar = this.f14934q;
        C89219l.m154721d(hVar, "");
        Iterator<AbstractC5944b> it = dVar.f14866b.iterator();
        while (it.hasNext()) {
            long j = dVar.f14865a;
            dVar.f14865a = 1 + j;
            it.next().mo11790a(hVar, j);
        }
    }

    /* renamed from: a */
    private void m13019a(C9627ay ayVar) {
        User b;
        if (!(ayVar.f23444f == null || ayVar.f23444f.getId() == 0)) {
            ArrayList arrayList = new ArrayList(this.f14927j);
            for (int i = 0; i < arrayList.size(); i++) {
                AbstractC5873h hVar = (AbstractC5873h) arrayList.get(i);
                if (hVar instanceof AbstractC5877k) {
                    AbstractC5877k kVar = (AbstractC5877k) hVar;
                    if (kVar.mo11704E() == ayVar.f23444f.getId() && (b = kVar.mo10375b()) != null) {
                        if (b.getUserAttr() == null) {
                            b.setUserAttr(new C9542az());
                        }
                        C9542az userAttr = b.getUserAttr();
                        int i2 = ayVar.f23446h;
                        if (i2 != 3) {
                            if (i2 != 4) {
                                if (i2 == 5) {
                                    userAttr.f23192b = true;
                                    ((AbstractC5956a) this.f38654y).mo11842a(i);
                                } else if (i2 == 6) {
                                    userAttr.f23192b = false;
                                    ((AbstractC5956a) this.f38654y).mo11842a(i);
                                } else if (i2 != 9) {
                                    if (i2 != 10) {
                                    }
                                }
                            }
                            userAttr.f23191a = false;
                        }
                        userAttr.f23191a = true;
                    }
                }
            }
        }
    }

    /* renamed from: c */
    private void m13024c(AbstractC5877k<? extends AbstractC6571a> kVar) {
        String str;
        String str2 = "";
        if (kVar.f14737d.f28131L == EnumC9596a.MEMBER) {
            C9627ay ayVar = (C9627ay) kVar.f14737d;
            if (ayVar.f23457s != null) {
                str = ayVar.f23457s.f23645a;
            } else {
                return;
            }
        } else if (kVar.f14737d.f28131L != EnumC9596a.ROOM || kVar.f14737d.f28134O.f28144j == null) {
            str = str2;
        } else {
            str = kVar.f14737d.f28134O.f28144j.f23645a;
        }
        if (str.equals("pm_mt_guidance_coming_viewers") || str.equals("pm_mt_guidance_coming_viewers_second")) {
            if ("pm_mt_guidance_coming_viewers_second".equals(str)) {
                str2 = "live_null_viewer";
            }
            if ("pm_mt_guidance_coming_viewers".equals(str)) {
                str2 = "live_started";
            }
            C6501b.C6502a.m13948a("livesdk_anchor_notify_notice").mo12643a(this.f18624w).mo12651a("event_type", "show").mo12651a("msg_type", str2).mo12655b();
        } else if (str.equals("pm_mt_guidance_interaction") || str.equals("pm_mt_guidance_interaction_first") || str.equals("pm_mt_guidance_interaction_second")) {
            if ("pm_mt_guidance_interaction".equals(str)) {
                str2 = "origin_words";
            }
            if ("pm_mt_guidance_interaction_first".equals(str)) {
                str2 = "after_joined_msg";
            }
            if ("pm_mt_guidance_interaction_second".equals(str)) {
                str2 = "system_msg";
            }
            C6501b.C6502a.m13948a("livesdk_anchor_interact_notice").mo12643a(this.f18624w).mo12651a("event_type", "show").mo12651a("msg_type", str2).mo12655b();
        }
    }

    /* renamed from: e */
    private void m13025e(AbstractC5873h hVar) {
        String str;
        if (this.f14908C) {
            this.f14908C = false;
            if (!mo11671c() && (hVar instanceof C6027m) && !((C9690bv) ((AbstractC5877k) hVar).f14737d).f16442c) {
                m13032j(C6022k.m13208a(C7302b.m15204a(this.f14930m.f14744a, C3966y.m9657a((int) R.string.emi))));
                Calendar instance = Calendar.getInstance();
                C17309b.m32048a(((AbstractC5956a) this.f38654y).getContext(), C17309b.f41588b).mo27619a("live.mt.text_message.guidance_total_display_count", Integer.valueOf(this.f14909D + 1)).mo27619a("live.mt.text_message.guidance_last_display_year", Integer.valueOf(instance.get(1))).mo27619a("live.mt.text_message.guidance_last_display_day", Integer.valueOf(instance.get(6))).mo27619a("live.mt.text_message.guidance_daily_display_count", Integer.valueOf(this.f14910E + 1)).mo27621a();
                C6501b a = C6501b.C6502a.m13948a("livesdk_translate_guide").mo12643a(this.f18624w);
                if (this.f14930m.f14752i) {
                    str = "anchor";
                } else {
                    str = "user";
                }
                a.mo12651a("user_type", str).mo12655b();
            }
        }
    }

    /* renamed from: j */
    private void m13032j(AbstractC5873h hVar) {
        if (hVar != null) {
            if (this.f14927j.size() >= 200) {
                List<AbstractC5873h> subList = this.f14927j.subList(0, 70);
                for (AbstractC5873h hVar2 : subList) {
                    hVar2.mo11692r();
                }
                subList.clear();
                ((AbstractC5956a) this.f38654y).mo11841a();
            }
            if (LivePublicScreenConfigSetting.getValue().f19067c == 0) {
                if (!this.f14927j.isEmpty()) {
                    List<AbstractC5873h> list = this.f14927j;
                    AbstractC5873h hVar3 = list.get(list.size() - 1);
                    if (hVar3 != null && hVar3.mo11682j()) {
                        if (hVar.mo11682j()) {
                            List<AbstractC5873h> list2 = this.f14927j;
                            list2.set(list2.size() - 1, hVar);
                            ((AbstractC5956a) this.f38654y).mo11842a(this.f14927j.size() - 1);
                        } else {
                            List<AbstractC5873h> list3 = this.f14927j;
                            list3.add(list3.size() - 1, hVar);
                            ((AbstractC5956a) this.f38654y).mo11845b(this.f14927j.size() - 2);
                        }
                    }
                }
                this.f14927j.add(hVar);
                ((AbstractC5956a) this.f38654y).mo11845b(this.f14927j.size() - 1);
            } else if (hVar.mo11682j()) {
                ((AbstractC5956a) this.f38654y).mo11843a(hVar);
            } else {
                this.f14927j.add(hVar);
                ((AbstractC5956a) this.f38654y).mo11845b(this.f14927j.size() - 1);
            }
            if (hVar instanceof AbstractC5877k) {
                m13023b((AbstractC5877k) hVar);
            }
        }
    }

    /* renamed from: a */
    private void m13020a(C9677bj bjVar) {
        for (int i = 0; i < this.f14927j.size(); i++) {
            AbstractC5873h hVar = this.f14927j.get(i);
            if (hVar instanceof AbstractC5877k) {
                AbstractC5877k kVar = (AbstractC5877k) hVar;
                if (kVar.f14737d instanceof C9678bk) {
                    C9678bk bkVar = (C9678bk) kVar.f14737d;
                    if (bkVar.f23554a != null && bkVar.f23554a.f23546a == bjVar.f23551a) {
                        hVar.mo11692r();
                        this.f14927j.remove(i);
                        ((AbstractC5956a) this.f38654y).mo11847c(i);
                        return;
                    }
                } else {
                    continue;
                }
            }
        }
    }

    /* renamed from: a */
    public final int mo11828a(long j) {
        if (j == 0) {
            return -1;
        }
        for (int i = 0; i < this.f14927j.size(); i++) {
            if (this.f14927j.get(i).mo11691q() == j) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public static boolean m13022a(long j, Queue<AbstractC5873h> queue) {
        Iterator<AbstractC5873h> it = queue.iterator();
        while (it.hasNext()) {
            AbstractC5873h next = it.next();
            if (next.mo11691q() == j) {
                next.mo11692r();
                it.remove();
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private static void m13021a(Collection<AbstractC5873h> collection, C9602af afVar) {
        if (collection != null && !collection.isEmpty() && afVar != null) {
            Iterator<AbstractC5873h> it = collection.iterator();
            while (it.hasNext()) {
                AbstractC5873h next = it.next();
                if (next.mo11688n() && (next instanceof AbstractC5877k)) {
                    AbstractC5877k kVar = (AbstractC5877k) next;
                    if ((afVar.f23309f != null && afVar.f23309f.contains(Long.valueOf(kVar.mo11704E()))) || (afVar.f23308a != null && afVar.f23308a.contains(Long.valueOf(kVar.f14737d.getMessageId())))) {
                        next.mo11692r();
                        it.remove();
                    }
                }
            }
        }
    }
}
