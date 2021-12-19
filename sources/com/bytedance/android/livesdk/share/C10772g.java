package com.bytedance.android.livesdk.share;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Pair;
import android.view.View;
import android.view.animation.Animation;
import android.widget.ImageView;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.base.model.C2962b;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.core.p218f.C3951p;
import com.bytedance.android.live.design.widget.rtl.LiveAutoRtlTextView;
import com.bytedance.android.live.liveinteract.api.AbstractC4409b;
import com.bytedance.android.live.liveinteract.api.C4402ap;
import com.bytedance.android.live.p385p.AbstractView$OnClickListenerC5841f;
import com.bytedance.android.live.p385p.EnumC5847l;
import com.bytedance.android.live.p405s.AbstractC6103e;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.live.share.AbstractC6109c;
import com.bytedance.android.live.share.C6112e;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.live.slot.ISlotService;
import com.bytedance.android.livesdk.chatroom.p492g.C7577g;
import com.bytedance.android.livesdk.chatroom.p492g.C7593n;
import com.bytedance.android.livesdk.chatroom.p492g.p493a.AbstractC7561a;
import com.bytedance.android.livesdk.chatroom.p492g.p493a.C7565d;
import com.bytedance.android.livesdk.definition.C8315a;
import com.bytedance.android.livesdk.livesetting.watchlive.ShowAudienceDefinitionSelectionSetting;
import com.bytedance.android.livesdk.model.message.C9693by;
import com.bytedance.android.livesdk.model.message.C9718cb;
import com.bytedance.android.livesdk.model.message.p577a.EnumC9596a;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p425aa.C6544e;
import com.bytedance.android.livesdk.p452ao.AbstractC6804a;
import com.bytedance.android.livesdk.p561j.C9045bk;
import com.bytedance.android.livesdk.p561j.C9065cd;
import com.bytedance.android.livesdk.p561j.C9068cg;
import com.bytedance.android.livesdk.p561j.C9093de;
import com.bytedance.android.livesdk.p561j.C9099dk;
import com.bytedance.android.livesdk.p561j.C9114dz;
import com.bytedance.android.livesdk.p561j.C9119ed;
import com.bytedance.android.livesdk.share.C10765c;
import com.bytedance.android.livesdk.toolbar.C10919h;
import com.bytedance.android.livesdk.utils.C11199a;
import com.bytedance.android.livesdk.utils.C11220aj;
import com.bytedance.android.livesdkapi.depend.model.live.C11729j;
import com.bytedance.android.livesdkapi.depend.model.live.EnumC11728i;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.p683e.AbstractC11665b;
import com.bytedance.android.livesdkapi.depend.p683e.C11666c;
import com.bytedance.android.livesdkapi.host.IHostShare;
import com.bytedance.android.livesdkapi.model.C11838d;
import com.bytedance.common.utility.C13627m;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1206f.C17309b;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.ugc.live.sdk.message.data.IMessage;
import com.p2082ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.p2082ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.share.g */
public final class C10772g implements AbstractView$OnClickListenerC5841f, OnMessageListener {

    /* renamed from: a */
    boolean f25936a;

    /* renamed from: b */
    String f25937b;

    /* renamed from: c */
    public boolean f25938c;

    /* renamed from: d */
    public Room f25939d;

    /* renamed from: e */
    AnimatorSet f25940e;

    /* renamed from: f */
    ObjectAnimator f25941f;

    /* renamed from: g */
    ActivityC0945e f25942g;

    /* renamed from: h */
    public Context f25943h;

    /* renamed from: i */
    public DataChannel f25944i;

    /* renamed from: j */
    public AbstractC1204m f25945j;

    /* renamed from: k */
    protected final C88411a f25946k = new C88411a();

    /* renamed from: l */
    public ImageView f25947l;

    /* renamed from: m */
    C9718cb f25948m;

    /* renamed from: n */
    boolean f25949n = false;

    /* renamed from: o */
    LiveAutoRtlTextView f25950o;

    /* renamed from: p */
    private EnumC11728i f25951p;

    /* renamed from: q */
    private IMessageManager f25952q;

    /* renamed from: r */
    private Dialog f25953r;

    static {
        Covode.recordClassIndex(12372);
    }

    @Override // com.bytedance.android.live.p385p.AbstractView$OnClickListenerC5841f
    /* renamed from: a */
    public final void mo8492a(boolean z) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ C89391z mo17689c() {
        C9718cb cbVar = this.f25948m;
        if (cbVar != null) {
            m19376a(cbVar);
        }
        return C89391z.f203057a;
    }

    /* renamed from: b */
    public final void mo17688b() {
        m19377d();
        this.f25947l.setImageDrawable(null);
        this.f25936a = false;
        this.f25937b = null;
        this.f25947l.setScaleX(1.0f);
        this.f25947l.setScaleY(1.0f);
    }

    /* renamed from: d */
    private void m19377d() {
        if (this.f25949n) {
            Integer a = C10919h.m19529a(EnumC5847l.SHARE);
            if (a != null) {
                this.f25947l.setBackgroundResource(a.intValue());
                return;
            }
            return;
        }
        this.f25947l.setBackgroundResource(EnumC5847l.SHARE.getDrawable());
    }

    /* renamed from: a */
    public final void mo17686a() {
        Animation animation = this.f25947l.getAnimation();
        if (animation != null) {
            animation.cancel();
        }
        AnimatorSet animatorSet = this.f25940e;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        ObjectAnimator objectAnimator = this.f25941f;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
        }
        this.f25947l.clearAnimation();
        mo17688b();
    }

    @Override // com.p2082ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        if (iMessage instanceof C9718cb) {
            m19376a((C9718cb) iMessage);
        } else if ((iMessage instanceof C9693by) && ((C9693by) iMessage).f23621a > 100 && this.f25936a) {
            mo17686a();
        }
    }

    /* renamed from: a */
    private void m19376a(final C9718cb cbVar) {
        Context context = this.f25943h;
        if (context != null) {
            this.f25948m = cbVar;
            if (!this.f25938c) {
                this.f25946k.mo142945a(C7593n.m15607a(context).mo13832a(this.f25939d.getIdStr()).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143289d(new AbstractC88433f<Long>() {
                    /* class com.bytedance.android.livesdk.share.C10772g.C107763 */

                    static {
                        Covode.recordClassIndex(12376);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // p4560f.p4561a.p4567d.AbstractC88433f
                    public final /* synthetic */ void accept(Long l) {
                        if (l.longValue() != C10772g.this.f25939d.getId()) {
                            C10772g.this.mo17687a(cbVar, -1);
                        }
                    }
                }));
            } else if (this.f25951p == EnumC11728i.VIDEO) {
                mo17687a(cbVar, 300);
            }
        }
    }

    public final void onClick(View view) {
        IIconSlot.EnumC6149b bVar;
        String str;
        String str2;
        if (this.f25942g != null && this.f25939d != null) {
            long uptimeMillis = SystemClock.uptimeMillis();
            long j = uptimeMillis - C11220aj.f26863a;
            C11220aj.f26863a = uptimeMillis;
            boolean z = true;
            if (j > 500) {
                String str3 = (String) this.f25944i.mo28318b(C9065cd.class);
                String a = C6544e.m13987a();
                String d = C6544e.m13990d();
                Room room = this.f25939d;
                if (room == null || room.getOwner() == null || this.f25939d.getOwner().getSecret() != 1) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("position", "detail_bottom_bar");
                    String str4 = "";
                    hashMap.putAll(C6501b.C6502a.m13948a(str4).mo12659d());
                    Room room2 = this.f25939d;
                    C11666c.C11667a a2 = C6112e.m13328a(room2, this.f25944i, C6112e.m13330a(room2.getOwner()), "live_room_share_button", hashMap);
                    HashMap hashMap2 = new HashMap();
                    Room room3 = this.f25939d;
                    if (room3 == null || room3.mRoomAuthStatus == null || !this.f25939d.mRoomAuthStatus.isEnablePromote()) {
                        z = false;
                    }
                    hashMap2.put("param_broadcast_room_auth_promote_bool", Boolean.valueOf(z));
                    ISlotService iSlotService = (ISlotService) C6193a.m13435a(ISlotService.class);
                    if (this.f25938c) {
                        bVar = IIconSlot.EnumC6149b.SLOT_BROADCAST_SHARE;
                    } else {
                        bVar = IIconSlot.EnumC6149b.SLOT_AUDIENCE_SHARE;
                    }
                    C11666c.C11667a a3 = a2.mo18436a(iSlotService.getLiveShareSheetAction(hashMap2, bVar));
                    EnumC11728i iVar = this.f25951p;
                    Room room4 = this.f25939d;
                    C89219l.m154721d(iVar, str4);
                    ArrayList arrayList = new ArrayList();
                    boolean isEnable = ShowAudienceDefinitionSelectionSetting.INSTANCE.isEnable();
                    if (isEnable && (iVar == EnumC11728i.THIRD_PARTY || iVar == EnumC11728i.SCREEN_RECORD)) {
                        if (room4 == null || (str2 = String.valueOf(room4.getId())) == null) {
                            str2 = str4;
                        }
                        if (iVar != null) {
                            str4 = C11729j.m20684a(iVar);
                        }
                        C8315a.m16468a(str2, str4, "0");
                        arrayList.add(new C10765c.C10766a());
                    }
                    C3854a.m9453a(4, "LiveSheetActionProvider", "provideLiveSheetActions(). enable=" + isEnable + ", liveMode=" + iVar + ", listSize=" + arrayList.size());
                    a3.mo18436a(arrayList);
                    EnumC5847l.SHARE.setRedDotVisible(this.f25944i, false);
                    HashMap hashMap3 = new HashMap();
                    if (this.f25938c) {
                        hashMap3.put("request_page", "live_room");
                        hashMap3.put("position", "detail_bottom_bar");
                        str = "anchor_share_click";
                    } else {
                        Integer num = (Integer) this.f25944i.mo28318b(C9099dk.class);
                        if (num == null) {
                            num = 0;
                        }
                        hashMap3.put("share_num", num.toString());
                        str = "user_share_click";
                    }
                    C6501b.C6502a.m13948a(str).mo12643a(this.f25944i).mo12651a("live_type", C11729j.m20684a(this.f25939d.getStreamType())).mo12652a((Map<String, String>) hashMap3).mo12655b();
                    a2.f27848L = (String) this.f25944i.mo28318b(C9045bk.class);
                    a2.f27851O = C11199a.m19850a(this.f25944i);
                    a2.f27850N = ((AbstractC6103e) C6193a.m13435a(AbstractC6103e.class)).getReportScene();
                    final C11666c a4 = a2.mo18437a();
                    Dialog dialog = this.f25953r;
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                    Dialog b = ((AbstractC6109c) C6193a.m13435a(AbstractC6109c.class)).share().mo11990b(this.f25942g, a4, new AbstractC11665b() {
                        /* class com.bytedance.android.livesdk.share.C10772g.C107807 */

                        static {
                            Covode.recordClassIndex(12380);
                        }

                        @Override // com.bytedance.android.livesdkapi.depend.p683e.AbstractC11665b
                        /* renamed from: a */
                        public final void mo8904a(Throwable th) {
                        }

                        @Override // com.bytedance.android.livesdkapi.depend.p683e.AbstractC11665b
                        /* renamed from: a */
                        public final void mo8903a(String str, String str2, Bundle bundle) {
                            C17309b a;
                            C6112e.m13331a(C10772g.this.f25939d, C10772g.this.f25944i, C10772g.this.f25945j, str2, C10772g.this.f25939d.getLabels(), bundle);
                            HashMap hashMap = null;
                            if (!C10772g.this.f25938c && ((AbstractC4409b) C6193a.m13435a(AbstractC4409b.class)).isRoomInBattle()) {
                                hashMap = new HashMap();
                                hashMap.put("connection_type", "manual_pk");
                                hashMap.put("pk_id", String.valueOf(((AbstractC4409b) C6193a.m13435a(AbstractC4409b.class)).getBattleId()));
                            }
                            C6112e.m13333a(C10772g.this.f25939d, C10772g.this.f25944i, str, str2, bundle, a4.f27795B, hashMap);
                            C6112e.m13332a(C10772g.this.f25939d, C10772g.this.f25944i, str);
                            if (C10772g.this.f25943h != null && (a = C17309b.m32048a(C10772g.this.f25943h, C17309b.f41588b)) != null) {
                                a.mo27623b("live.mt.lastest.share.channel", str);
                            }
                        }
                    });
                    this.f25953r = b;
                    if (b != null) {
                        b.show();
                    }
                    if (this.f25936a && !C13627m.m24498a(this.f25937b)) {
                        C6501b.C6502a.m13948a("livesdk_share_button_click").mo12643a(this.f25944i).mo12651a("share_platform", this.f25937b).mo12655b();
                    }
                    if (this.f25936a && this.f25938c) {
                        C6501b.C6502a.m13948a("livesdk_anchor_share_button_click").mo12643a(this.f25944i).mo12651a("share_platform", "chat_merge").mo12655b();
                    }
                    if (this.f25936a) {
                        mo17686a();
                    }
                    C7593n.m15607a(view.getContext()).mo13833a(this.f25939d.getIdStr(), this.f25939d.getId());
                    return;
                }
                C11838d dVar = new C11838d(this.f25939d.getId(), this.f25939d.getOwnerUserId(), this.f25939d.getOwnerUserId(), this.f25939d.getOwner().getSecUid(), "anchor_profile", a, d, str3, "report_anchor", this.f25939d.getRequestId());
                dVar.f28220s = ((AbstractC6103e) C6193a.m13435a(AbstractC6103e.class)).getReportScene();
                ((AbstractC6103e) C6193a.m13435a(AbstractC6103e.class)).report(this.f25943h, dVar);
            }
        }
    }

    @Override // com.bytedance.android.live.p385p.AbstractView$OnClickListenerC5841f
    /* renamed from: b */
    public final void mo8493b(View view, DataChannel dataChannel) {
        mo17686a();
        IMessageManager iMessageManager = this.f25952q;
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(this);
        }
        dataChannel.mo28316b(this);
        AnimatorSet animatorSet = this.f25940e;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        ObjectAnimator objectAnimator = this.f25941f;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
        }
        this.f25946k.mo142944a();
        this.f25948m = null;
    }

    @Override // com.bytedance.android.live.p385p.AbstractView$OnClickListenerC5841f
    /* renamed from: a */
    public final void mo8491a(View view, DataChannel dataChannel) {
        this.f25944i = dataChannel;
        this.f25938c = ((Boolean) dataChannel.mo28318b(C9119ed.class)).booleanValue();
        this.f25949n = Boolean.TRUE.equals(dataChannel.mo28318b(C9114dz.class));
        this.f25939d = (Room) dataChannel.mo28318b(C9093de.class);
        this.f25947l = (ImageView) view.findViewById(R.id.ek8);
        if (!this.f25938c || !(this.f25951p == EnumC11728i.THIRD_PARTY || this.f25951p == EnumC11728i.SCREEN_RECORD)) {
            m19377d();
        } else {
            this.f25947l.setBackgroundResource(2131234580);
        }
        if (this.f25949n) {
            this.f25950o = (LiveAutoRtlTextView) view.findViewById(R.id.ekj);
            dataChannel.mo28314b(C9099dk.class, (AbstractC89172b) new C10781h(this));
        }
        this.f25936a = false;
        IMessageManager iMessageManager = (IMessageManager) dataChannel.mo28318b(C9068cg.class);
        this.f25952q = iMessageManager;
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(EnumC9596a.SHARE_GUIDE_MESSAGE.getIntType(), this);
            if (this.f25938c && this.f25951p == EnumC11728i.VIDEO) {
                this.f25952q.addMessageListener(EnumC9596a.USER_SEQ.getIntType(), this);
            }
        }
        dataChannel.mo28310a(C4402ap.class, (AbstractC89172b) new C10782i(this));
        boolean isEnable = ShowAudienceDefinitionSelectionSetting.INSTANCE.isEnable();
        if (!this.f25938c && isEnable) {
            if (this.f25951p == EnumC11728i.THIRD_PARTY || this.f25951p == EnumC11728i.SCREEN_RECORD) {
                EnumC5847l.SHARE.setRedDotVisible(dataChannel, !AbstractC6804a.f17019cO.mo13066a().booleanValue());
            }
        }
    }

    /* renamed from: a */
    public final void mo17687a(C9718cb cbVar, final int i) {
        C17309b bVar;
        Context context = this.f25943h;
        String str = null;
        if (context != null) {
            bVar = C17309b.m32048a(context, C17309b.f41588b);
        } else {
            bVar = null;
        }
        String str2 = "";
        if (bVar != null) {
            str = bVar.mo27620a("live.mt.lastest.share.channel", str2);
        }
        if (((IHostShare) C6193a.m13435a(IHostShare.class)).isImChannel(str)) {
            ((IHostShare) C6193a.m13435a(IHostShare.class)).getUrlModelAndShowAnim(new IHostShare.AbstractC11791a() {
                /* class com.bytedance.android.livesdk.share.C10772g.C107731 */

                static {
                    Covode.recordClassIndex(12373);
                }

                @Override // com.bytedance.android.livesdkapi.host.IHostShare.AbstractC11791a
                /* renamed from: a */
                public final void mo17691a(final List<C2962b> list) {
                    if (!C13603b.m24435a((Collection) list)) {
                        C7565d.C7566a.m15555b().mo13814a(new AbstractC7561a() {
                            /* class com.bytedance.android.livesdk.share.C10772g.C107731.C107741 */

                            static {
                                Covode.recordClassIndex(12374);
                            }

                            @Override // com.bytedance.android.livesdk.chatroom.p492g.p493a.AbstractC7563b
                            /* renamed from: a */
                            public final void mo13812a() {
                                C10772g gVar = C10772g.this;
                                List list = list;
                                long j = (long) i;
                                C7565d.C7566a.m15555b().mo13813a();
                                if (gVar.f25947l != null && gVar.f25942g != null && !gVar.f25942g.isFinishing() && !C13627m.m24499a(gVar.f25937b, "copy")) {
                                    if ((gVar.f25939d == null || gVar.f25939d.getOwner() == null || gVar.f25939d.getOwner().getSecret() != 1) && !gVar.f25936a) {
                                        gVar.f25936a = true;
                                        C6501b.C6502a.m13948a("livesdk_share_button_show").mo12643a(gVar.f25944i).mo12651a("share_platform", "chat_merge").mo12655b();
                                        if (gVar.f25938c) {
                                            C6501b.C6502a.m13948a("livesdk_anchor_share_button_show").mo12643a(gVar.f25944i).mo12651a("share_platform", "chat_merge").mo12655b();
                                        }
                                        C107785 r4 = new C3951p.AbstractC3953a() {
                                            /* class com.bytedance.android.livesdk.share.C10772g.C107785 */

                                            static {
                                                Covode.recordClassIndex(12378);
                                            }

                                            @Override // com.bytedance.android.live.core.p218f.C3951p.AbstractC3953a
                                            /* renamed from: a */
                                            public final void mo9301a(ImageModel imageModel) {
                                            }

                                            @Override // com.bytedance.android.live.core.p218f.C3951p.AbstractC3953a
                                            /* renamed from: a */
                                            public final void mo9302a(ImageModel imageModel, int i, int i2) {
                                            }

                                            @Override // com.bytedance.android.live.core.p218f.C3951p.AbstractC3953a
                                            /* renamed from: a */
                                            public final void mo9303a(ImageModel imageModel, Exception exc) {
                                                C10772g.this.mo17686a();
                                            }
                                        };
                                        C7577g.m15572a(gVar.f25947l, ((C2962b) list.get(0)).mo7782a(), r4);
                                        gVar.f25947l.setBackground(null);
                                        long j2 = -1;
                                        if (j != -1) {
                                            j2 = (j * 1000) / 600;
                                        }
                                        gVar.f25940e = new AnimatorSet();
                                        gVar.f25941f = ObjectAnimator.ofFloat(gVar.f25947l, "scaleX", 1.05f, 0.9f).setDuration(600L);
                                        ObjectAnimator duration = ObjectAnimator.ofFloat(gVar.f25947l, "scaleY", 1.05f, 0.9f).setDuration(600L);
                                        gVar.f25941f.setRepeatMode(2);
                                        duration.setRepeatMode(2);
                                        if (gVar.f25938c) {
                                            int i = (int) j2;
                                            gVar.f25941f.setRepeatCount(i);
                                            duration.setRepeatCount(i);
                                        } else {
                                            gVar.f25941f.setRepeatCount(-1);
                                            duration.setRepeatCount(-1);
                                        }
                                        gVar.f25940e.playTogether(gVar.f25941f, duration);
                                        gVar.f25941f.addListener(new AnimatorListenerAdapter(list, r4) {
                                            /* class com.bytedance.android.livesdk.share.C10772g.C107796 */

                                            /* renamed from: a */
                                            int f25965a;

                                            /* renamed from: b */
                                            final /* synthetic */ int f25966b = 16;

                                            /* renamed from: c */
                                            final /* synthetic */ List f25967c;

                                            /* renamed from: d */
                                            final /* synthetic */ C3951p.AbstractC3953a f25968d;

                                            static {
                                                Covode.recordClassIndex(12379);
                                            }

                                            public final void onAnimationEnd(Animator animator) {
                                                super.onAnimationEnd(animator);
                                                C10772g.this.mo17688b();
                                            }

                                            public final void onAnimationRepeat(Animator animator) {
                                                super.onAnimationRepeat(animator);
                                                int i = this.f25965a + 1;
                                                this.f25965a = i;
                                                if (i % this.f25966b == 0) {
                                                    if (i == this.f25967c.size() * this.f25966b) {
                                                        this.f25965a = 0;
                                                    }
                                                    C7577g.m15572a(C10772g.this.f25947l, ((C2962b) this.f25967c.get(this.f25965a / this.f25966b)).mo7782a(), this.f25968d);
                                                    C10772g.this.f25947l.setBackground(null);
                                                }
                                            }

                                            {
                                                this.f25967c = r3;
                                                this.f25968d = r4;
                                            }
                                        });
                                        gVar.f25940e.start();
                                    }
                                }
                            }
                        });
                    }
                }
            });
            return;
        }
        Pair<String, Drawable> breathShareAnimShareRes = ((IHostShare) C6193a.m13435a(IHostShare.class)).getBreathShareAnimShareRes(this.f25942g, str, cbVar.f23686a);
        if (breathShareAnimShareRes != null) {
            if (!C13627m.m24498a((String) breathShareAnimShareRes.first)) {
                str2 = (String) breathShareAnimShareRes.first;
            }
            this.f25937b = str2;
            final Drawable drawable = (Drawable) breathShareAnimShareRes.second;
            if (drawable != null) {
                C7565d.C7566a.m15555b().mo13814a(new AbstractC7561a() {
                    /* class com.bytedance.android.livesdk.share.C10772g.C107752 */

                    static {
                        Covode.recordClassIndex(12375);
                    }

                    @Override // com.bytedance.android.livesdk.chatroom.p492g.p493a.AbstractC7563b
                    /* renamed from: a */
                    public final void mo13812a() {
                        C10772g gVar = C10772g.this;
                        Drawable drawable = drawable;
                        long j = (long) i;
                        C7565d.C7566a.m15555b().mo13813a();
                        if (gVar.f25947l != null && gVar.f25942g != null && !gVar.f25942g.isFinishing() && !C13627m.m24499a(gVar.f25937b, "copy")) {
                            if ((gVar.f25939d == null || gVar.f25939d.getOwner() == null || gVar.f25939d.getOwner().getSecret() != 1) && !gVar.f25936a) {
                                gVar.f25936a = true;
                                if (!C13627m.m24498a(gVar.f25937b)) {
                                    C6501b.C6502a.m13948a("livesdk_share_button_show").mo12643a(gVar.f25944i).mo12651a("share_platform", gVar.f25937b).mo12655b();
                                    if (gVar.f25938c) {
                                        C6501b.C6502a.m13948a("livesdk_anchor_share_button_show").mo12643a(gVar.f25944i).mo12651a("share_platform", gVar.f25937b).mo12655b();
                                    }
                                }
                                gVar.f25947l.setBackground(drawable);
                                long j2 = -1;
                                if (j != -1) {
                                    j2 = (j * 1000) / 600;
                                }
                                gVar.f25940e = new AnimatorSet();
                                gVar.f25941f = ObjectAnimator.ofFloat(gVar.f25947l, "scaleX", 1.05f, 0.9f).setDuration(600L);
                                ObjectAnimator duration = ObjectAnimator.ofFloat(gVar.f25947l, "scaleY", 1.05f, 0.9f).setDuration(600L);
                                gVar.f25941f.setRepeatMode(2);
                                duration.setRepeatMode(2);
                                if (gVar.f25938c) {
                                    int i = (int) j2;
                                    gVar.f25941f.setRepeatCount(i);
                                    duration.setRepeatCount(i);
                                } else {
                                    gVar.f25941f.setRepeatCount(-1);
                                    duration.setRepeatCount(-1);
                                }
                                gVar.f25940e.playTogether(gVar.f25941f, duration);
                                gVar.f25941f.addListener(new AnimatorListenerAdapter() {
                                    /* class com.bytedance.android.livesdk.share.C10772g.C107774 */

                                    static {
                                        Covode.recordClassIndex(12377);
                                    }

                                    public final void onAnimationEnd(Animator animator) {
                                        super.onAnimationEnd(animator);
                                        C10772g.this.mo17688b();
                                    }
                                });
                                gVar.f25940e.start();
                            }
                        }
                    }
                });
            }
        }
    }

    public C10772g(ActivityC0945e eVar, Context context, EnumC11728i iVar, AbstractC1204m mVar) {
        this.f25942g = eVar;
        this.f25943h = context;
        this.f25951p = iVar;
        this.f25945j = mVar;
    }
}
