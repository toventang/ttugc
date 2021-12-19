package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.C0643b;
import androidx.core.p037h.p039b.C0767b;
import androidx.core.widget.C0820e;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.C4366j;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.api.C3018a;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.core.p215e.p217b.C3886a;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.gift.C4328d;
import com.bytedance.android.live.network.C5805e;
import com.bytedance.android.live.p172a.p173a.C2908a;
import com.bytedance.android.live.p172a.p173a.p175b.C2912a;
import com.bytedance.android.live.p379n.C5793y;
import com.bytedance.android.live.p384o.AbstractC5834a;
import com.bytedance.android.live.p385p.C5840e;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.live.publicscreen.p386a.AbstractC5880e;
import com.bytedance.android.live.uikit.p411c.C6229a;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.C6905bf;
import com.bytedance.android.livesdk.chatroom.C7366c;
import com.bytedance.android.livesdk.chatroom.C7467e;
import com.bytedance.android.livesdk.chatroom.CommentApi;
import com.bytedance.android.livesdk.chatroom.model.Barrage;
import com.bytedance.android.livesdk.chatroom.model.C7682d;
import com.bytedance.android.livesdk.chatroom.model.C7686f;
import com.bytedance.android.livesdk.chatroom.p481b.C7302b;
import com.bytedance.android.livesdk.chatroom.p488c.AbstractC7394l;
import com.bytedance.android.livesdk.chatroom.p488c.C7367a;
import com.bytedance.android.livesdk.chatroom.p488c.C7368aa;
import com.bytedance.android.livesdk.chatroom.p488c.C7371ad;
import com.bytedance.android.livesdk.chatroom.p488c.C7373af;
import com.bytedance.android.livesdk.chatroom.p488c.C7374ag;
import com.bytedance.android.livesdk.chatroom.p488c.C7375ah;
import com.bytedance.android.livesdk.chatroom.p488c.C7382ao;
import com.bytedance.android.livesdk.chatroom.p488c.C7383b;
import com.bytedance.android.livesdk.chatroom.p490e.C7477c;
import com.bytedance.android.livesdk.chatroom.p490e.C7485i;
import com.bytedance.android.livesdk.chatroom.p490e.C7486j;
import com.bytedance.android.livesdk.chatroom.p492g.C7558a;
import com.bytedance.android.livesdk.chatroom.p492g.C7569b;
import com.bytedance.android.livesdk.chatroom.p492g.C7571c;
import com.bytedance.android.livesdk.chatroom.p492g.C7576f;
import com.bytedance.android.livesdk.chatroom.p492g.C7598p;
import com.bytedance.android.livesdk.chatroom.p499ui.AbstractC7766ar;
import com.bytedance.android.livesdk.chatroom.p499ui.C7794bg;
import com.bytedance.android.livesdk.chatroom.p499ui.SweepEffectFrameLayout;
import com.bytedance.android.livesdk.chatroom.viewmodule.C8097bt;
import com.bytedance.android.livesdk.event.C8454g;
import com.bytedance.android.livesdk.livesetting.comment.ChatNeedBindPhoneSetting;
import com.bytedance.android.livesdk.livesetting.comment.LiveCommunityGuidelineSetting;
import com.bytedance.android.livesdk.livesetting.comment.LiveInputDialogAnimationSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveEnableNormalGiftAndBarrageSelfFirstlySetting;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRoomChargeTypeSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.EnablePreloadFirstScreenFrameSetting;
import com.bytedance.android.livesdk.model.message.C9717ca;
import com.bytedance.android.livesdk.model.message.C9878i;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p425aa.C6544e;
import com.bytedance.android.livesdk.p425aa.C6555i;
import com.bytedance.android.livesdk.p448al.C6774a;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.p452ao.AbstractC6804a;
import com.bytedance.android.livesdk.p452ao.C6806c;
import com.bytedance.android.livesdk.p456as.AbstractC6872f;
import com.bytedance.android.livesdk.p456as.C6873g;
import com.bytedance.android.livesdk.p456as.C6876j;
import com.bytedance.android.livesdk.p456as.EnumC6874h;
import com.bytedance.android.livesdk.p561j.C9007aa;
import com.bytedance.android.livesdk.p561j.C9009ac;
import com.bytedance.android.livesdk.p561j.C9013ag;
import com.bytedance.android.livesdk.p561j.C9014ah;
import com.bytedance.android.livesdk.p561j.C9026at;
import com.bytedance.android.livesdk.p561j.C9034ba;
import com.bytedance.android.livesdk.p561j.C9036bc;
import com.bytedance.android.livesdk.p561j.C9068cg;
import com.bytedance.android.livesdk.p561j.C9074cm;
import com.bytedance.android.livesdk.p561j.C9076co;
import com.bytedance.android.livesdk.p561j.C9077cp;
import com.bytedance.android.livesdk.p561j.C9088d;
import com.bytedance.android.livesdk.p561j.C9093de;
import com.bytedance.android.livesdk.p561j.C9114dz;
import com.bytedance.android.livesdk.p561j.C9119ed;
import com.bytedance.android.livesdk.p561j.C9131m;
import com.bytedance.android.livesdk.p561j.C9144z;
import com.bytedance.android.livesdk.p562k.DialogC9148b;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdk.util.rxutils.C11191f;
import com.bytedance.android.livesdk.util.rxutils.autodispose.AbstractC11181z;
import com.bytedance.android.livesdk.utils.C11199a;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.android.livesdk.utils.C11264f;
import com.bytedance.android.livesdk.utils.C11266h;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.AbstractC11818m;
import com.bytedance.android.livesdkapi.host.IHostApp;
import com.bytedance.android.livesdkapi.p689e.C11752b;
import com.bytedance.android.livesdkapi.p690f.C11756a;
import com.bytedance.android.message.IMessageService;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.WidgetExtendsKt;
import com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.ugc.live.sdk.message.interfaces.IMessageManager;
import emotes.C88345a;
import emotes.api.EmoteApi;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p4550e.C88332a;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

public class CommentWidget extends RoomRecycleWidget implements C7477c.AbstractC7479a, AbstractC33974au {

    /* renamed from: F */
    private static final int f19821F = C3966y.m9653a(8.0f);

    /* renamed from: G */
    private static final int f19822G = C3966y.m9653a(8.0f);

    /* renamed from: A */
    private String f19823A;

    /* renamed from: B */
    private String f19824B;

    /* renamed from: C */
    private boolean f19825C;

    /* renamed from: D */
    private final C88411a f19826D = new C88411a();

    /* renamed from: E */
    private DialogC9148b f19827E;

    /* renamed from: H */
    private boolean f19828H;

    /* renamed from: I */
    private boolean f19829I;

    /* renamed from: J */
    private final AbstractC7766ar.AbstractC7768b f19830J = new AbstractC7766ar.AbstractC7768b() {
        /* class com.bytedance.android.livesdk.chatroom.viewmodule.CommentWidget.C79761 */

        static {
            Covode.recordClassIndex(8777);
        }

        @Override // com.bytedance.android.livesdk.chatroom.p499ui.AbstractC7766ar.AbstractC7768b
        /* renamed from: a */
        public final void mo14044a() {
            DataChannel dataChannel = CommentWidget.this.dataChannel;
            if (dataChannel != null) {
                C6501b a = C6501b.C6502a.m13948a("livesdk_send_button_click");
                a.mo12643a(dataChannel);
                C7569b.m15557a(a, dataChannel);
                a.mo12655b();
            }
        }

        @Override // com.bytedance.android.livesdk.chatroom.p499ui.AbstractC7766ar.AbstractC7768b
        /* renamed from: b */
        public final void mo14048b() {
            DataChannel dataChannel = CommentWidget.this.dataChannel;
            if (dataChannel != null) {
                C6501b a = C6501b.C6502a.m13948a("livesdk_comment_input");
                a.mo12643a(dataChannel);
                C7569b.m15557a(a, dataChannel);
                a.mo12655b();
            }
        }

        @Override // com.bytedance.android.livesdk.chatroom.p499ui.AbstractC7766ar.AbstractC7768b
        /* renamed from: a */
        public final void mo14045a(C7686f fVar) {
            long j;
            String str;
            if (CommentWidget.this.dataChannel != null) {
                CommentWidget.this.dataChannel.mo28320c(C5840e.class, false);
            }
            if (TextUtils.isEmpty(CommentWidget.this.f19838g) || TextUtils.isEmpty(fVar.f19040e) || !fVar.f19040e.contains(CommentWidget.this.f19838g)) {
                j = 0;
            } else {
                j = CommentWidget.this.f19837f;
            }
            int elapsedRealtime = (int) ((SystemClock.elapsedRealtime() - CommentWidget.this.f19846o) / 1000);
            if (!CommentWidget.this.f19833b) {
                DataChannel dataChannel = CommentWidget.this.dataChannel;
                C6501b a = C6501b.C6502a.m13948a("livesdk_comment_pannel_show_duration");
                a.mo12643a(dataChannel);
                a.mo12645a("duration", elapsedRealtime);
                if (j != 0) {
                    str = "1";
                } else {
                    str = "0";
                }
                a.mo12651a("is_message_reply", str);
                if (j != 0) {
                    a.mo12646a("reply_user_id", j);
                }
                C7569b.m15556a(a);
                a.mo12655b();
            }
            C6905bf.m14776a().mo13206a(false);
            CommentWidget.this.f19848q = null;
            CommentWidget.this.f19849r = fVar;
            CommentWidget.this.f19847p = false;
        }

        @Override // com.bytedance.android.livesdk.chatroom.p499ui.AbstractC7766ar.AbstractC7768b
        /* renamed from: a */
        public final void mo14047a(List<? extends EmoteModel> list) {
            C7477c cVar = CommentWidget.this.f19835d;
            C7373af afVar = new C7373af(list, AbstractC7394l.EnumC7395a.CommentWidget, Collections.emptyMap());
            if (cVar.f18578c != null) {
                long insertMessage = ((AbstractC5880e) C6193a.m13435a(AbstractC5880e.class)).insertMessage(cVar.f18577b.getId(), C7302b.m15208a(cVar.f18577b.getId(), afVar.f18275a, -System.currentTimeMillis(), C11115u.m19743a().mo17915b().mo13147a(), null), true);
                ((C7477c.AbstractC7479a) cVar.f38654y).mo13717a();
                DataChannel dataChannel = cVar.f18624w;
                List<EmoteModel> list2 = afVar.f18275a;
                C89219l.m154721d(list2, "");
                if (dataChannel != null) {
                    C6501b.C6502a.m13948a("livesdk_audience_live_emote").mo12643a(dataChannel).mo12651a("request_id", C6544e.m13997k()).mo12651a("privilege_emotes_label", C89070n.m154551a(list2, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C7569b.C7570a.f18790a, 30)).mo12655b();
                }
                C88411a aVar = cVar.f18578c;
                long id = cVar.f18577b.getId();
                List<EmoteModel> list3 = afVar.f18275a;
                C89219l.m154721d(list3, "");
                AbstractC88979t<R> a = ((CommentApi) C5805e.m12718a().mo11572a(CommentApi.class)).sendEmote(id, C89070n.m154551a(list3, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C8097bt.C8098a.f20108a, 30)).mo143271a(new C11191f());
                C89219l.m154716b(a, "");
                aVar.mo142945a(a.mo143254a(new C7485i(cVar, afVar, insertMessage), new C7486j(cVar, insertMessage)));
            }
            if (CommentWidget.this.f19848q != null) {
                CommentWidget.this.f19848q.mo14040b();
            }
        }

        @Override // com.bytedance.android.livesdk.chatroom.p499ui.AbstractC7766ar.AbstractC7768b
        /* renamed from: a */
        public final void mo14046a(String str, boolean z, int i) {
            CommentWidget.this.mo14266a(str, z, false, i);
            if (!LiveInputDialogAnimationSetting.INSTANCE.isALL()) {
                if (CommentWidget.this.f19847p && LiveInputDialogAnimationSetting.INSTANCE.isAt()) {
                    return;
                }
                if ((CommentWidget.this.f19847p || !LiveInputDialogAnimationSetting.INSTANCE.isClick()) && CommentWidget.this.f19848q != null) {
                    CommentWidget.this.f19848q.mo14040b();
                }
            }
        }
    };

    /* renamed from: K */
    private final AbstractC7766ar.AbstractC7767a f19831K = new AbstractC7766ar.AbstractC7767a() {
        /* class com.bytedance.android.livesdk.chatroom.viewmodule.CommentWidget.C79783 */

        static {
            Covode.recordClassIndex(8779);
        }

        @Override // com.bytedance.android.livesdk.chatroom.p499ui.AbstractC7766ar.AbstractC7767a
        /* renamed from: a */
        public final boolean mo14042a() {
            if (CommentWidget.this.dataChannel != null) {
                return ((Boolean) CommentWidget.this.dataChannel.mo28318b(C9076co.class)).booleanValue();
            }
            return true;
        }

        @Override // com.bytedance.android.livesdk.chatroom.p499ui.AbstractC7766ar.AbstractC7767a
        /* renamed from: b */
        public final void mo14043b() {
            if (CommentWidget.this.dataChannel != null) {
                CommentWidget.this.dataChannel.mo28320c(C9077cp.class, false);
            }
        }
    };

    /* renamed from: a */
    public TextView f19832a;

    /* renamed from: b */
    public boolean f19833b;

    /* renamed from: c */
    public Room f19834c;

    /* renamed from: d */
    public C7477c f19835d;

    /* renamed from: e */
    boolean f19836e;

    /* renamed from: f */
    public long f19837f = 0;

    /* renamed from: g */
    public String f19838g;

    /* renamed from: h */
    Dialog f19839h;

    /* renamed from: i */
    boolean f19840i;

    /* renamed from: j */
    C7368aa f19841j;

    /* renamed from: k */
    C7374ag f19842k;

    /* renamed from: l */
    long f19843l;

    /* renamed from: m */
    Dialog f19844m;

    /* renamed from: n */
    C7383b f19845n;

    /* renamed from: o */
    long f19846o;

    /* renamed from: p */
    boolean f19847p = false;

    /* renamed from: q */
    public AbstractC7766ar f19848q = null;

    /* renamed from: r */
    public C7686f f19849r = new C7686f();

    /* renamed from: s */
    public final Runnable f19850s = new Runnable() {
        /* class com.bytedance.android.livesdk.chatroom.viewmodule.CommentWidget.RunnableC79772 */

        static {
            Covode.recordClassIndex(8778);
        }

        public final void run() {
            if (CommentWidget.this.isViewValid()) {
                new C7375ah("live_detail");
            }
        }
    };

    /* renamed from: t */
    boolean f19851t;

    /* renamed from: u */
    private View f19852u;

    /* renamed from: v */
    private ImageView f19853v;

    /* renamed from: w */
    private TextView f19854w;

    /* renamed from: x */
    private AnimatorSet f19855x;

    /* renamed from: y */
    private boolean f19856y;

    /* renamed from: z */
    private Activity f19857z;

    @Override // com.bytedance.android.livesdk.chatroom.viewmodule.AbstractC8094bq
    /* renamed from: a */
    public final void mo10546a(Throwable th) {
        AbstractC8095br.m16255a(this, th);
    }

    @Override // com.bytedance.android.widget.Widget
    public int getLayoutId() {
        return R.layout.bdm;
    }

    @Override // com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.AbstractC1202k, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.android.livesdk.chatroom.p490e.C7477c.AbstractC7479a
    /* renamed from: a */
    public final void mo13721a(C9878i iVar) {
        if (isViewValid()) {
            m16118i();
            if (this.f19857z instanceof ActivityC0945e) {
                ((IHostApp) C6193a.m13435a(IHostApp.class)).checkBindHelpShow((ActivityC0945e) this.f19857z, "live_comment");
            }
            IMessageManager iMessageManager = (IMessageManager) this.dataChannel.mo28318b(C9068cg.class);
            if (iMessageManager != null) {
                iMessageManager.insertMessage(iVar, true);
            }
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.p490e.C7477c.AbstractC7479a
    /* renamed from: a */
    public final void mo13722a(C9878i iVar, AbstractC7394l.EnumC7395a aVar) {
        Room room;
        if (this.dataChannel != null) {
            this.dataChannel.mo28311a(C7366c.class, iVar.f23853f);
        }
        if (TextUtils.isEmpty(this.f19838g) || TextUtils.isEmpty(iVar.f23853f) || !iVar.f23853f.contains(this.f19838g)) {
            m16117h();
        }
        m16111a(C88332a.m153528a().f200532b.mo142853a(iVar.f23853f), iVar.f23852a, aVar);
        if (this.dataChannel != null && C11199a.m19850a(this.dataChannel) && (room = this.f19834c) != null && room.author() != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("anchor_id", String.valueOf(this.f19834c.author().getId()));
            hashMap.put("room_id", String.valueOf(this.f19834c.getId()));
            C11199a.m19849a("live_ad", "live_comment", null, hashMap);
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.p490e.C7477c.AbstractC7479a
    /* renamed from: a */
    public final void mo13724a(boolean z) {
        this.f19849r.f19041f = z;
    }

    @Override // com.bytedance.android.livesdk.chatroom.p490e.C7477c.AbstractC7479a
    /* renamed from: a */
    public final void mo13719a(Barrage barrage) {
        C9717ca a;
        if (isViewValid()) {
            m16118i();
            if (TextUtils.isEmpty(barrage.getOrderId())) {
                C11226ao.m19882a(C3966y.m9669e(), (int) R.string.gmf);
                return;
            }
            ((IWalletService) C6193a.m13435a(IWalletService.class)).walletCenter().mo12366a((long) barrage.getLeftDiamond());
            if (LiveEnableNormalGiftAndBarrageSelfFirstlySetting.INSTANCE.getValue() && ((IMessageService) C6193a.m13435a(IMessageService.class)).get() != null && isViewValid() && (a = C7302b.m15205a(barrage)) != null) {
                a.f16442c = true;
                ((IMessageService) C6193a.m13435a(IMessageService.class)).get().insertMessage(a);
            }
            HashMap hashMap = new HashMap();
            try {
                hashMap.put("live_source", this.f19823A);
                if (!TextUtils.isEmpty(this.f19834c.getSourceType())) {
                    hashMap.put("moment_room_source", this.f19834c.getSourceType());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            C6501b.C6502a.m13948a("send_barrage").mo12643a(this.dataChannel).mo12652a((Map<String, String>) hashMap).mo12654b("live_interact").mo12655b();
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.p490e.C7477c.AbstractC7479a
    /* renamed from: a */
    public final void mo13723a(Exception exc) {
        if (exc instanceof C2912a) {
            C2912a aVar = (C2912a) exc;
            int errorCode = aVar.getErrorCode();
            if (50001 == errorCode) {
                C11226ao.m19883a(this.f19857z, aVar.getPrompt(), 0);
            } else if (50004 == errorCode || 50014 == errorCode || 80074 == errorCode) {
                m16118i();
                mo14268c();
                C11226ao.m19883a(this.f19857z, aVar.getPrompt(), 0);
            } else if (40001 == errorCode) {
                C11226ao.m19883a(this.f19857z, aVar.getPrompt(), 0);
                if (LiveRoomChargeTypeSetting.INSTANCE.getValue() == 1) {
                    new C7375ah("live_detail");
                }
            } else if (errorCode == 50019) {
                mo14268c();
                C7558a.m15545a(this.f19857z, "send_barrage", new AbstractC11818m() {
                    /* class com.bytedance.android.livesdk.chatroom.viewmodule.CommentWidget.C79816 */

                    static {
                        Covode.recordClassIndex(8782);
                    }
                });
            } else {
                C11264f.m19957a(getContext(), aVar);
            }
            m16109a(aVar);
            return;
        }
        C11226ao.m19882a(this.context, (int) R.string.gmf);
        C3854a.m9453a(3, "CommentWidget", "unknown exception " + exc.toString());
    }

    /* renamed from: a */
    public final void mo14266a(String str, boolean z, boolean z2, int i) {
        AbstractC7394l.EnumC7395a aVar = AbstractC7394l.EnumC7395a.CommentWidget;
        if (!C11115u.m19743a().mo17915b().mo13165e()) {
            AbstractC6872f b = C11115u.m19743a().mo17915b();
            Context context = this.context;
            C6876j.C6877a a = C6876j.m14732a();
            a.f17232a = C3966y.m9657a((int) R.string.giz);
            a.f17235d = "comment_live";
            a.f17234c = -1;
            b.mo13149a(context, a.mo13173a()).mo143271a(getAutoUnbindTransformer()).mo143062b(new C6873g());
            C7576f.m15566a(0);
        } else if (C11115u.m19743a().mo17915b().mo13158a(EnumC6874h.COMMENT)) {
            C7576f.m15566a(1);
        } else if (!this.f19828H) {
            C11226ao.m19882a(this.f19857z, (int) R.string.e6f);
            C7576f.m15566a(2);
        } else if (!z) {
            C7477c cVar = this.f19835d;
            String str2 = this.f19824B;
            cVar.f18577b = (Room) cVar.f18624w.mo28318b(C9093de.class);
            if (!(cVar.f18577b == null || cVar.f18577b.getOwner() == null)) {
                if (C11115u.m19743a().mo17915b().mo13161c() == cVar.f18577b.getOwner().getId()) {
                    C6501b.C6502a.m13948a("livesdk_anchor_replay_audience_message").mo12651a("event_type", "click").mo12651a("enter_from", (String) cVar.f18624w.mo28318b(C9088d.class)).mo12643a(cVar.f18624w).mo12655b();
                }
                HashMap hashMap = new HashMap();
                hashMap.put("live.intent.extra.ENTER_LIVE_SOURCE", str2);
                cVar.mo13715a(new C7374ag(str, z2, i, aVar, hashMap));
            }
            if (this.f19842k != null) {
                C6501b.C6502a.m13948a("livesdk_comment_rethink_send_after_edit_ck").mo12643a(this.dataChannel).mo12646a("user_id", C11115u.m19743a().mo17915b().mo13161c()).mo12651a("comment_hit_model", this.f19842k.mo13596b()).mo12651a("comment_resend", str).mo12646a("edit_duration", SystemClock.uptimeMillis() - this.f19843l).mo12655b();
                this.f19842k = null;
            }
        } else if (str.length() > 15) {
            C11226ao.m19882a(this.context, (int) R.string.gmg);
        } else {
            C7477c cVar2 = this.f19835d;
            String str3 = this.f19824B;
            HashMap hashMap2 = new HashMap();
            hashMap2.put("live.intent.extra.ENTER_LIVE_SOURCE", str3);
            cVar2.mo13714a(new C7371ad(str, aVar, hashMap2));
        }
    }

    /* renamed from: h */
    private void m16117h() {
        this.f19837f = 0;
        this.f19838g = null;
    }

    /* renamed from: i */
    private void m16118i() {
        AbstractC7766ar arVar = this.f19848q;
        if (arVar != null) {
            arVar.mo14038a("");
        } else {
            this.f19849r.f19040e = "";
        }
    }

    /* renamed from: j */
    private void m16119j() {
        AbstractC7766ar arVar = this.f19848q;
        if (arVar != null) {
            arVar.mo14034a();
        } else {
            this.f19849r.mo13912a(null);
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.viewmodule.AbstractC8094bq
    /* renamed from: g */
    public final String mo10549g() {
        return getClass().getName();
    }

    @Override // com.bytedance.android.widget.Widget
    public void onPause() {
        super.onPause();
        C6555i.m14021b();
        C6555i.m9463b("ttlive_comment", "CommentWidget onPause");
    }

    @Override // com.bytedance.android.widget.Widget
    public void onResume() {
        super.onResume();
        C6555i.m14021b();
        C6555i.m9463b("ttlive_comment", "CommentWidget onResume");
    }

    static {
        Covode.recordClassIndex(8776);
    }

    /* renamed from: e */
    private void m16115e() {
        ((AbstractC5834a) C6193a.m13435a(AbstractC5834a.class)).openUserSubscribeEntry(this.context, this.f19834c, "");
    }

    /* renamed from: k */
    private void m16120k() {
        this.f19832a.setText(R.string.e6e);
        getView().setClickable(false);
        this.f19828H = false;
        mo14269c(m16122m());
    }

    /* renamed from: l */
    private void m16121l() {
        this.f19832a.setText(R.string.e6l);
        getView().setClickable(true);
        this.f19828H = true;
        mo14269c(m16122m());
    }

    /* renamed from: m */
    private boolean m16122m() {
        Room room = this.f19834c;
        if (room == null || room.getOwner() == null) {
            return false;
        }
        return this.f19834c.getOwner().isSubscribed();
    }

    /* renamed from: n */
    private boolean m16123n() {
        if (this.f19834c == null || this.dataChannel == null || !this.f19828H || !m16124o() || !m16125p()) {
            return false;
        }
        return true;
    }

    /* renamed from: o */
    private boolean m16124o() {
        Room room = this.f19834c;
        if (room == null || room.getOwner() == null || !this.f19834c.getOwner().isAnchorHasSubQualification()) {
            return false;
        }
        return true;
    }

    /* renamed from: p */
    private boolean m16125p() {
        Room room = this.f19834c;
        if (room == null || room.getRoomAuthStatus() == null || !this.f19834c.getRoomAuthStatus().chatSubOnly) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public final void mo14268c() {
        if (this.f19848q != null && isViewValid()) {
            this.f19848q.mo14040b();
            this.dataChannel.mo28320c(C9077cp.class, false);
        }
    }

    /* renamed from: d */
    private void m16114d() {
        this.f19833b = ((Boolean) this.dataChannel.mo28318b(C9119ed.class)).booleanValue();
        Room room = (Room) this.dataChannel.mo28318b(C9093de.class);
        this.f19834c = room;
        if (room.getRoomAuthStatus() == null || this.f19834c.getRoomAuthStatus().isEnableChat()) {
            m16121l();
            this.dataChannel.mo28311a(C9007aa.class, (Object) true);
        } else {
            m16120k();
        }
        C6555i.m14021b();
        C6555i.m9463b("ttlive_comment", "CommentWidget onLoad");
        m16116f();
        this.f19835d.mo10297a((C7477c.AbstractC7479a) this);
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onUnload() {
        this.f19826D.mo142944a();
        resetAnim();
        C88345a.f200549b = false;
        if (!C88345a.f200548a.isDisposed()) {
            C88345a.f200548a.mo142944a();
        }
        this.f19835d.mo8577b();
        this.f19836e = false;
        m16118i();
        m16119j();
        AbstractC7766ar arVar = this.f19848q;
        if (arVar != null) {
            arVar.dismissAllowingStateLoss();
            this.f19848q = null;
        }
        Dialog dialog = this.f19839h;
        if (dialog != null) {
            dialog.dismiss();
            this.f19839h = null;
        }
        Dialog dialog2 = this.f19844m;
        if (dialog2 != null) {
            dialog2.dismiss();
            this.f19844m = null;
        }
        this.f19841j = null;
        this.f19845n = null;
        this.f19842k = null;
        C6555i.m14021b();
        C6555i.m9463b("ttlive_comment", "CommentWidget onUnload");
        this.f19855x.cancel();
    }

    @Override // com.bytedance.android.livesdk.chatroom.p490e.C7477c.AbstractC7479a
    /* renamed from: a */
    public final void mo13717a() {
        if (isViewValid()) {
            m16119j();
            if (this.f19857z instanceof ActivityC0945e) {
                ((IHostApp) C6193a.m13435a(IHostApp.class)).checkBindHelpShow((ActivityC0945e) this.f19857z, "live_comment");
            }
        }
    }

    /* renamed from: f */
    private void m16116f() {
        if (this.context != null && this.f19832a != null && getView() != null && (getView().getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getView().getLayoutParams();
            if (this.f19836e) {
                int i = f19821F;
                marginLayoutParams.rightMargin = i;
                marginLayoutParams.leftMargin = i;
                marginLayoutParams.bottomMargin = C3966y.m9653a(12.0f);
            } else if (this.f19825C || !C6229a.m13521a(this.context)) {
                marginLayoutParams.leftMargin = f19821F;
                marginLayoutParams.rightMargin = 0;
                marginLayoutParams.bottomMargin = f19822G;
            } else {
                marginLayoutParams.rightMargin = f19821F;
                marginLayoutParams.leftMargin = 0;
                marginLayoutParams.bottomMargin = f19822G;
            }
            if (this.f19829I) {
                marginLayoutParams.bottomMargin = C3966y.m9653a(12.0f);
            }
            getView().setLayoutParams(marginLayoutParams);
            SweepEffectFrameLayout sweepEffectFrameLayout = (SweepEffectFrameLayout) getView();
            if (this.f19825C) {
                sweepEffectFrameLayout.setBackgroundColor(C0643b.m2378c(getContext(), R.color.vh));
                sweepEffectFrameLayout.setStrokeWidth(0.0f);
                int c = C0643b.m2378c(getContext(), R.color.vj);
                this.f19832a.setTextColor(c);
                this.f19854w.setTextColor(c);
                C0820e.m2895a(this.f19853v, ColorStateList.valueOf(c));
            } else {
                sweepEffectFrameLayout.setBackgroundColor(C0643b.m2378c(getContext(), R.color.a0));
                sweepEffectFrameLayout.setStrokeColor(C0643b.m2378c(getContext(), R.color.a7));
                sweepEffectFrameLayout.setStrokeWidth((float) getContext().getResources().getDimensionPixelSize(R.dimen.v1));
                int c2 = C0643b.m2378c(getContext(), R.color.vj);
                this.f19832a.setTextColor(c2);
                this.f19854w.setTextColor(c2);
                C0820e.m2895a(this.f19853v, ColorStateList.valueOf(c2));
            }
            if (this.f19829I) {
                sweepEffectFrameLayout.setBackgroundColor(C0643b.m2378c(this.context, R.color.vi));
                this.f19832a.setShadowLayer(this.context.getResources().getDimension(R.dimen.v4), this.context.getResources().getDimension(R.dimen.v2), this.context.getResources().getDimension(R.dimen.v3), C0643b.m2378c(this.context, R.color.vk));
            }
        }
    }

    /* renamed from: b */
    public final void mo14267b() {
        if (this.f19848q == null && this.isViewValid) {
            if (this.f19833b && !AbstractC6804a.f16969bR.mo13066a().booleanValue()) {
                if (this.f19827E == null) {
                    DialogC9148b.C9149a aVar = new DialogC9148b.C9149a(this.context);
                    aVar.f22253j = true;
                    this.f19827E = aVar.mo15248b(R.string.e6k).mo15244a(R.string.eaf, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC8123z(this), false).mo15249b(R.string.gi8, DialogInterface$OnClickListenerC8051aa.f20057a, false).mo15247a();
                }
                DialogC9148b bVar = this.f19827E;
                if (bVar != null && !bVar.isShowing()) {
                    this.f19827E.show();
                }
                C7571c.m15560a("Current user is anchor who disable comment");
            } else if (C11115u.m19743a().mo17915b().mo13158a(EnumC6874h.COMMENT)) {
                C7571c.m15560a("Anchor closed comment");
            } else if (!this.f19849r.f19038c) {
                boolean o = m16124o();
                if (this.f19833b || !o || !m16125p() || m16122m()) {
                    this.dataChannel.mo28320c(C9077cp.class, true);
                    Room room = this.f19834c;
                    if (!(room == null || room.mRoomAuthStatus == null)) {
                        this.f19849r.f19041f = this.f19834c.mRoomAuthStatus.enableDanmaku;
                    }
                    Room room2 = this.f19834c;
                    if (room2 != null && room2.isOfficial()) {
                        this.f19849r.f19042g = true;
                    }
                    this.f19849r.f19043h = o;
                    C7686f fVar = this.f19849r;
                    AbstractC7766ar.AbstractC7767a aVar2 = this.f19831K;
                    C7794bg bgVar = new C7794bg();
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("live.intent.extra.DANMU_OPEN", fVar.f19036a);
                    bundle.putBoolean("live.intent.extra.IS_BROADCASTER", fVar.f19037b);
                    bundle.putBoolean("live.intent.extra.USER_BANNED", fVar.f19038c);
                    bundle.putBoolean("live.intent.extra.USER_BANNED_WHOLE_LIVE", fVar.f19039d);
                    bundle.putString("live.intent.extra.INPUT", fVar.f19040e);
                    bundle.putBoolean("live.inter.extra.CAN_DANMU", fVar.f19041f);
                    bundle.putBoolean("live.inter.extra.IS_OFFICIAL", fVar.f19042g);
                    bundle.putInt("live.intent.extra.INPUT_MODE", !fVar.f19043h ? 1 : 0);
                    bundle.putParcelableArrayList("live.intent.extra.EMOTES", new ArrayList<>(Collections.unmodifiableList(fVar.f19044i)));
                    bgVar.setArguments(bundle);
                    bgVar.f19335c = aVar2;
                    this.f19848q = bgVar;
                    bgVar.mo14036a(this.f19830J);
                    try {
                        this.f19848q.mo14035a(this.f19857z, "INPUT");
                        this.f19846o = SystemClock.elapsedRealtime();
                        C6905bf.m14776a().mo13206a(true);
                        this.dataChannel.mo28319c(C9144z.class);
                    } catch (IllegalStateException e) {
                        C7571c.m15560a("exception" + e.getMessage());
                        this.f19848q = null;
                    }
                } else {
                    if (!this.f19825C) {
                        this.dataChannel.mo28311a(C7467e.class, Long.valueOf(this.f19834c.getId()));
                        C6779a.m14563a().mo13053a(new C11756a(1));
                    } else {
                        m16115e();
                    }
                    C7571c.m15560a("Anchor set only subscribed users can comment");
                }
            } else {
                C7571c.m15560a("User is banded");
                if (this.f19849r.f19039d) {
                    C11226ao.m19882a(this.f19857z, (int) R.string.enr);
                } else {
                    C11226ao.m19882a(this.f19857z, (int) R.string.enq);
                }
            }
        }
    }

    public void onEvent(C7382ao aoVar) {
        m16112b(aoVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ C89391z mo14263a(C7382ao aoVar) {
        m16112b(aoVar);
        return C89391z.f203057a;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget
    public void onVisibilityToUser(boolean z) {
        super.onVisibilityToUser(z);
        this.f19851t = z;
    }

    @Override // com.bytedance.android.livesdk.chatroom.p490e.C7477c.AbstractC7479a
    /* renamed from: a */
    public final void mo13720a(C7682d dVar) {
        if (dVar != null) {
            m16111a(false, dVar.f19025a, AbstractC7394l.EnumC7395a.CommentWidget);
        }
    }

    /* renamed from: a */
    private <T> void m16110a(Class<T> cls) {
        C6779a.m14563a().mo13050a(this, cls, this.dataChannel).mo17949a(new C8061ak(this));
    }

    public void onEvent(C7367a aVar) {
        if (this.f19833b) {
            if (aVar.f18261a) {
                m16121l();
            } else {
                m16120k();
            }
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget
    public void onGetRoomInfo(Room room) {
        super.onGetRoomInfo(room);
        m16114d();
        if (this.f19851t && EnablePreloadFirstScreenFrameSetting.INSTANCE.getValue() == 1) {
            C7576f.f18800b = this.f19834c;
            C7576f.m15565a();
        }
    }

    /* renamed from: a */
    private void m16109a(C2912a aVar) {
        if (C3886a.m9504a(aVar) && ChatNeedBindPhoneSetting.INSTANCE.getValue()) {
            ((IHostApp) C6193a.m13435a(IHostApp.class)).startBindPhoneDialogFragment(this.f19857z, "live_detail", "live_detail", new C8060aj(this));
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.p490e.C7477c.AbstractC7479a
    /* renamed from: b */
    public final void mo13725b(Exception exc) {
        m16113c(exc);
        if ((exc instanceof C2912a) && ((C2908a) exc).getErrorCode() == 4010024) {
            C6501b.C6502a.m13948a("livesdk_subscribe_expire").mo12643a(this.dataChannel).mo12651a("click_position", "sub_emote").mo12655b();
        }
    }

    /* renamed from: b */
    private void m16112b(final C7382ao aoVar) {
        long id;
        this.dataChannel.mo28311a(C9088d.class, aoVar.f18302f);
        m16117h();
        if (aoVar.f18301e == null) {
            id = 0;
        } else {
            id = aoVar.f18301e.getId();
        }
        this.f19837f = id;
        if (aoVar.f18297a == 1) {
            getView().postDelayed(new Runnable() {
                /* class com.bytedance.android.livesdk.chatroom.viewmodule.CommentWidget.RunnableC79827 */

                static {
                    Covode.recordClassIndex(8783);
                }

                public final void run() {
                    if (CommentWidget.this.isViewValid()) {
                        String a = C11266h.m19968a("@%s ", aoVar.f18298b);
                        CommentWidget.this.f19838g = C11266h.m19968a("@%s", aoVar.f18298b);
                        if (CommentWidget.this.f19848q != null) {
                            CommentWidget.this.f19848q.mo14038a(a);
                            return;
                        }
                        CommentWidget.this.f19849r.f19040e = a;
                        CommentWidget.this.f19847p = true;
                        CommentWidget.this.mo14267b();
                    }
                }
            }, 500);
        } else if (aoVar.f18297a == 2) {
            getView().postDelayed(new Runnable() {
                /* class com.bytedance.android.livesdk.chatroom.viewmodule.CommentWidget.RunnableC79838 */

                static {
                    Covode.recordClassIndex(8784);
                }

                public final void run() {
                    if (CommentWidget.this.isViewValid()) {
                        if (CommentWidget.this.f19848q != null) {
                            CommentWidget.this.f19848q.mo14039a(aoVar.f18299c);
                            return;
                        }
                        CommentWidget.this.f19849r.f19036a = aoVar.f18299c;
                        CommentWidget.this.mo14267b();
                    }
                }
            }, 500);
        } else {
            if (aoVar.f18297a == 3) {
                if (isViewValid()) {
                    AbstractC7766ar arVar = this.f19848q;
                    if (arVar != null) {
                        arVar.mo14038a(aoVar.f18298b);
                        return;
                    } else {
                        this.f19849r.f19040e = aoVar.f18298b;
                    }
                } else {
                    return;
                }
            }
            mo14267b();
        }
    }

    /* renamed from: c */
    private void m16113c(Exception exc) {
        if (exc instanceof C2912a) {
            C2912a aVar = (C2912a) exc;
            int errorCode = aVar.getErrorCode();
            long j = 0;
            if (50001 == errorCode) {
                C11226ao.m19883a(this.f19857z, aVar.getPrompt(), 0);
            } else if (50004 == errorCode) {
                m16118i();
                mo14268c();
                C11226ao.m19883a(this.f19857z, aVar.getPrompt(), 0);
            } else if (errorCode == 50019) {
                mo14268c();
                C7558a.m15545a(this.f19857z, "send_message", new AbstractC11818m() {
                    /* class com.bytedance.android.livesdk.chatroom.viewmodule.CommentWidget.C79805 */

                    static {
                        Covode.recordClassIndex(8781);
                    }
                });
            } else if (errorCode == 50015) {
                mo14268c();
                C11226ao.m19882a(this.f19857z, (int) R.string.e6f);
            } else if (errorCode != 4010021) {
                C11226ao.m19883a(this.f19857z, aVar.getPrompt(), 0);
            } else if (!C13627m.m24498a(aVar.getExtra())) {
                try {
                    j = (long) ((Integer) new JSONObject(aVar.getExtra()).get("dueDate")).intValue();
                } catch (JSONException unused) {
                }
                mo14265a(new C7383b(j));
            }
            m16109a(aVar);
            return;
        }
        C11226ao.m19882a(C3966y.m9669e(), (int) R.string.e27);
        C3854a.m9453a(6, "CommentWidget", "unknown exception " + exc.toString());
    }

    @Override // com.bytedance.android.livesdk.chatroom.p490e.C7477c.AbstractC7479a
    /* renamed from: b */
    public final void mo13726b(boolean z) {
        if (this.f19833b) {
            if (z != AbstractC6804a.f16969bR.mo13066a().booleanValue()) {
                C6806c.m14603a(AbstractC6804a.f16969bR, Boolean.valueOf(z));
                C6779a.m14563a().mo13053a(new C7367a(z));
            }
        } else if (z) {
            m16121l();
        } else {
            m16120k();
        }
    }

    /* renamed from: a */
    public final void mo14264a(C7368aa aaVar) {
        if (aaVar != null && this.dataChannel != null) {
            if (((Boolean) this.dataChannel.mo28318b(C9074cm.class)).booleanValue()) {
                this.f19841j = aaVar;
                return;
            }
            C6501b.C6502a.m13948a("livesdk_comment_rethink_sw").mo12643a(this.dataChannel).mo12646a("user_id", C11115u.m19743a().mo17915b().mo13161c()).mo12651a(UGCMonitor.EVENT_COMMENT, aaVar.f18263b).mo12645a("resend_same_cmt", aaVar.mo13595a() ? 1 : 0).mo12655b();
            Dialog dialog = this.f19839h;
            if (dialog != null) {
                dialog.dismiss();
            }
            String value = LiveCommunityGuidelineSetting.INSTANCE.getValue();
            RunnableC8054ad adVar = null;
            if (!this.f19833b && !TextUtils.isEmpty(value)) {
                adVar = new RunnableC8054ad(this, value, aaVar);
            }
            this.f19839h = C6774a.m14562a(getContext(), adVar, new RunnableC8055ae(this, aaVar), new RunnableC8056af(this, aaVar));
            C6905bf.m14776a().mo13207b();
            this.f19840i = false;
            this.f19839h.show();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo14269c(boolean z) {
        String str;
        this.f19853v.setScaleX(1.0f);
        this.f19853v.setScaleY(1.0f);
        this.f19853v.setAlpha(1.0f);
        this.f19854w.setScaleX(1.0f);
        this.f19854w.setScaleY(1.0f);
        this.f19854w.setAlpha(1.0f);
        this.f19832a.setScaleX(1.0f);
        this.f19832a.setScaleY(1.0f);
        this.f19832a.setAlpha(1.0f);
        ((SweepEffectFrameLayout) getView()).setSweepRatio(0.0f);
        if (!m16123n()) {
            this.f19852u.setVisibility(8);
            this.f19832a.setVisibility(0);
        } else if (!z) {
            this.f19852u.setVisibility(0);
            this.f19832a.setVisibility(8);
        } else if (!C7598p.m15613a(this.f19834c.getId()) || this.f19856y) {
            this.f19852u.setVisibility(8);
            this.f19832a.setVisibility(0);
        } else {
            C7598p.m15614b(this.f19834c.getId());
            this.f19856y = true;
            this.f19852u.setVisibility(0);
            this.f19832a.setVisibility(8);
            this.f19855x.start();
        }
        C6501b a = C6501b.C6502a.m13948a("livesdk_comment_area_mode").mo12643a(this.dataChannel);
        if (m16123n()) {
            str = "sub_only";
        } else {
            str = "normal";
        }
        a.mo12651a("mode", str).mo12655b();
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onInit(Object... objArr) {
        String str;
        this.f19833b = ((Boolean) this.dataChannel.mo28318b(C9119ed.class)).booleanValue();
        this.f19834c = (Room) this.dataChannel.mo28318b(C9093de.class);
        this.f19825C = ((Boolean) this.dataChannel.mo28318b(C9076co.class)).booleanValue();
        this.f19824B = (String) this.dataChannel.mo28318b(C11752b.class);
        this.f19857z = C11279p.m20001a(this.context);
        this.f19835d = new C7477c();
        this.f19832a = (TextView) findViewById(R.id.ari);
        this.f19852u = findViewById(R.id.a_s);
        this.f19853v = (ImageView) findViewById(R.id.a_r);
        this.f19854w = (TextView) findViewById(R.id.a_t);
        getView().setOnClickListener(new View$OnClickListenerC8122y(this));
        this.f19849r.f19037b = this.f19833b;
        if (C34822d.m71158a(this.f19857z, "feed_live_span", 0).getInt("span_count", 0) > 1) {
            str = "live_small_picture";
        } else {
            str = "live_big_picture";
        }
        this.f19823A = str;
        this.f19855x = new AnimatorSet();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f19853v, View.SCALE_X, 1.0f, 0.0f);
        ofFloat.setInterpolator(C0767b.m2680a(0.67f, -1.15f, 0.88f, 0.67f));
        ofFloat.setDuration(667L);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f19853v, View.SCALE_Y, 1.0f, 0.0f);
        ofFloat2.setInterpolator(C0767b.m2680a(0.67f, -1.15f, 0.88f, 0.67f));
        ofFloat2.setDuration(667L);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f19853v, View.ALPHA, 1.0f, 0.0f);
        ofFloat3.setInterpolator(C0767b.m2680a(0.34f, 0.0f, 0.7f, 1.0f));
        ofFloat3.setStartDelay(500);
        ofFloat3.setDuration(333L);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.f19854w, View.SCALE_X, 1.0f, 0.0f);
        ofFloat4.setInterpolator(C0767b.m2680a(0.2f, 0.0f, 0.6f, 1.0f));
        ofFloat4.setStartDelay(467);
        ofFloat4.setDuration(300L);
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.f19854w, View.SCALE_Y, 1.0f, 0.0f);
        ofFloat5.setInterpolator(C0767b.m2680a(0.2f, 0.0f, 0.6f, 1.0f));
        ofFloat5.setStartDelay(467);
        ofFloat5.setDuration(300L);
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this.f19854w, View.ALPHA, 1.0f, 0.0f);
        ofFloat6.setInterpolator(C0767b.m2680a(0.33f, 0.0f, 0.67f, 1.0f));
        ofFloat6.setStartDelay(467);
        ofFloat6.setDuration(200L);
        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(this.f19832a, View.SCALE_X, 1.0f, 1.1f, 1.0f);
        ofFloat7.setInterpolator(C0767b.m2680a(0.33f, 0.0f, 0.67f, 1.0f));
        ofFloat7.setStartDelay(533);
        ofFloat7.setDuration(500L);
        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(this.f19832a, View.SCALE_Y, 1.0f, 1.1f, 1.0f);
        ofFloat8.setInterpolator(C0767b.m2680a(0.33f, 0.0f, 0.67f, 1.0f));
        ofFloat8.setStartDelay(533);
        ofFloat8.setDuration(500L);
        ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(this.f19832a, View.ALPHA, 0.0f, 1.0f);
        ofFloat9.addListener(new AnimatorListenerAdapter() {
            /* class com.bytedance.android.livesdk.chatroom.viewmodule.CommentWidget.C79794 */

            static {
                Covode.recordClassIndex(8780);
            }

            public final void onAnimationStart(Animator animator) {
                super.onAnimationStart(animator);
                CommentWidget.this.f19832a.setVisibility(0);
            }
        });
        ofFloat9.setInterpolator(C0767b.m2680a(0.33f, 0.0f, 0.67f, 1.0f));
        ofFloat9.setStartDelay(467);
        ofFloat9.setDuration(1033L);
        ValueAnimator ofFloat10 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat10.addUpdateListener(new C8118u((SweepEffectFrameLayout) getView()));
        ofFloat10.setInterpolator(C0767b.m2680a(0.21f, 0.0f, 0.5f, 1.0f));
        ofFloat10.setStartDelay(1333);
        ofFloat10.setDuration(1667L);
        this.f19855x.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ofFloat9, ofFloat10);
        C6555i.m14021b();
        C6555i.m9463b("ttlive_comment", "CommentWidget onInit");
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onLoad(Object... objArr) {
        Long l;
        boolean z;
        boolean z2;
        String str;
        User owner;
        User owner2;
        m16110a(C7382ao.class);
        m16110a(C7367a.class);
        if (this.f19834c != null && getView() != null) {
            m16117h();
            this.f19833b = ((Boolean) this.dataChannel.mo28318b(C9119ed.class)).booleanValue();
            this.f19834c = (Room) this.dataChannel.mo28318b(C9093de.class);
            this.f19825C = ((Boolean) this.dataChannel.mo28318b(C9076co.class)).booleanValue();
            this.f19824B = (String) this.dataChannel.mo28318b(C11752b.class);
            this.f19836e = ((Boolean) this.dataChannel.mo28318b(C9036bc.class)).booleanValue();
            this.f19857z = C11279p.m20001a(this.context);
            this.f19829I = Boolean.TRUE.equals(this.dataChannel.mo28318b(C9114dz.class));
            m16114d();
            DataChannel dataChannel = this.dataChannel;
            C89219l.m154721d(this.f19834c, "");
            if (dataChannel != null) {
                C88345a.f200549b = true;
                if (!C88345a.f200548a.isDisposed()) {
                    C88345a.f200548a.mo142944a();
                }
                Room room = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
                if (room == null || (owner2 = room.getOwner()) == null) {
                    z2 = false;
                } else {
                    z2 = owner2.isAnchorHasSubQualification();
                }
                Room room2 = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
                if (room2 == null || (owner = room2.getOwner()) == null) {
                    str = null;
                } else {
                    str = owner.getSecUid();
                }
                if (!z2 || TextUtils.isEmpty(str)) {
                    C3854a.m9459b("isAnchorHasQualification  = ".concat(String.valueOf(z2)));
                } else {
                    C88345a.f200548a.mo142945a(((EmoteApi) C5805e.m12718a().mo11572a(EmoteApi.class)).getEmotesDetail(false, str).mo143261a(C88925a.m154180b(C88946a.f201991c)).mo143292d(new C88345a.C88346a()).mo143271a(new C11191f()).mo143254a(C88345a.C88347b.f200551a, C88345a.C88348c.f200552a));
                }
            }
            this.dataChannel.mo28309a((AbstractC1204m) this, C4366j.class, (AbstractC89172b) new C8119v(this)).mo28309a((AbstractC1204m) this, C9014ah.class, (AbstractC89172b) new C8057ag(this)).mo28309a((AbstractC1204m) this, C9131m.class, (AbstractC89172b) new C8064an(this)).mo28309a((AbstractC1204m) this, C9034ba.class, (AbstractC89172b) new C8065ao(this)).mo28313b((AbstractC1204m) this, C4328d.class, (AbstractC89172b) new C8066ap(this)).mo28309a((AbstractC1204m) this, C9013ag.class, (AbstractC89172b) new C8067aq(this)).mo28309a((AbstractC1204m) this, C9026at.class, (AbstractC89172b) new C8068ar(this)).mo28309a((AbstractC1204m) this, C3018a.class, (AbstractC89172b) new C8069as(this)).mo28309a((AbstractC1204m) this, C9074cm.class, (AbstractC89172b) new C8070at(this));
            C6555i.m14021b();
            C6555i.m9463b("ttlive_comment", "CommentWidget onLoad");
            m16116f();
            if (!this.f19825C) {
                this.f19826D.mo142945a(((AbstractC11181z) C6779a.m14563a().mo13052a(C8454g.class).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143274a(WidgetExtendsKt.autoDispose(this))).mo17949a(new C8120w(this)));
            }
            if (!this.f19833b) {
                DataChannel dataChannel2 = this.dataChannel;
                boolean z3 = this.f19828H;
                if (dataChannel2 != null) {
                    Boolean bool = (Boolean) dataChannel2.mo28318b(C9119ed.class);
                    if (bool != null) {
                        z = bool.booleanValue();
                    } else {
                        z = false;
                    }
                    C6501b a = C6501b.C6502a.m13948a("livesdk_comment_box_show");
                    a.mo12643a(dataChannel2);
                    if (!z) {
                        a.mo12645a("is_click_available", z3 ? 1 : 0);
                    }
                    C7569b.m15557a(a, dataChannel2);
                    a.mo12655b();
                }
            }
            this.f19856y = false;
            DataChannelGlobal.f42558d.mo28322a(this, this, C5793y.class, new C8121x(this));
            if (this.f19834c != null && (l = (Long) this.dataChannel.mo28318b(C7467e.class)) != null && l.longValue() == this.f19834c.getId()) {
                m16115e();
                this.dataChannel.mo28311a(C7467e.class, (Object) null);
            }
        }
    }

    /* renamed from: a */
    public final void mo14265a(C7383b bVar) {
        if (((Boolean) this.dataChannel.mo28318b(C9074cm.class)).booleanValue()) {
            this.f19845n = bVar;
            return;
        }
        Dialog dialog = this.f19844m;
        if (dialog != null) {
            dialog.dismiss();
        }
        String a = C3966y.m9657a((int) R.string.dw9);
        DialogC9148b.C9149a aVar = new DialogC9148b.C9149a(getContext());
        aVar.f22244a = C3966y.m9657a((int) R.string.dwa);
        aVar.f22245b = a;
        DialogC9148b.C9149a a2 = aVar.mo15249b(R.string.eev, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC8058ah(this), false).mo15244a(R.string.dw_, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC8059ai(this), false);
        a2.f22256m = false;
        this.f19844m = a2.mo15247a();
        C6905bf.m14776a().mo13207b();
        this.f19844m.show();
    }

    @Override // com.bytedance.android.livesdk.chatroom.p490e.C7477c.AbstractC7479a
    /* renamed from: a */
    public final void mo13718a(C7374ag agVar, Exception exc) {
        if (!(exc instanceof C2912a) || ((C2908a) exc).getErrorCode() != 4010020) {
            m16113c(exc);
        } else if (this.dataChannel != null) {
            mo14264a(new C7368aa((String) this.dataChannel.mo28318b(C7366c.class), agVar.mo13596b(), agVar.mo13597c(), agVar.mo13598d(), agVar.mo13599e(), agVar.mo13600f()));
        }
        if (this.dataChannel != null) {
            this.dataChannel.mo28311a(C7366c.class, agVar.mo13596b());
        }
    }

    /* renamed from: a */
    private void m16111a(boolean z, long j, AbstractC7394l.EnumC7395a aVar) {
        if (this.f19833b) {
            C7569b.m15558a(this.dataChannel);
            return;
        }
        C7569b.m15559a(this.dataChannel, z, j, this.f19823A, this.f19825C, m16123n(), aVar, this.f19837f);
        m16117h();
    }
}
