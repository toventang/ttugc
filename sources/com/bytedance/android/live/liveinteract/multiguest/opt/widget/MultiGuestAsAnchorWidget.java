package com.bytedance.android.live.liveinteract.multiguest.opt.widget;

import android.content.Context;
import android.content.DialogInterface;
import android.view.SurfaceView;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.liveinteract.api.BaseLinkWidget;
import com.bytedance.android.live.liveinteract.api.C4441l;
import com.bytedance.android.live.liveinteract.api.p261b.EnumC4422k;
import com.bytedance.android.live.liveinteract.api.p262c.AbstractC4430d;
import com.bytedance.android.live.liveinteract.api.p262c.C4431e;
import com.bytedance.android.live.liveinteract.multiguest.opt.p337a.C5271a;
import com.bytedance.android.live.liveinteract.multiguest.opt.p337a.p338a.C5277b;
import com.bytedance.android.live.liveinteract.multiguest.opt.p339b.p340a.DialogC5344a;
import com.bytedance.android.live.liveinteract.multiguest.p316a.p319c.C5153d;
import com.bytedance.android.live.liveinteract.multiguest.p316a.p322f.C5187f;
import com.bytedance.android.live.liveinteract.multiguest.p333g.p336c.AbstractC5258a;
import com.bytedance.android.live.liveinteract.multiguest.p333g.p336c.C5259b;
import com.bytedance.android.live.liveinteract.multilive.anchor.p351b.C5482a;
import com.bytedance.android.live.liveinteract.multilive.anchor.p351b.C5483b;
import com.bytedance.android.live.liveinteract.multilive.anchor.p351b.C5485d;
import com.bytedance.android.live.liveinteract.multilive.anchor.p356ui.dialog.DialogC5568b;
import com.bytedance.android.live.liveinteract.multilive.anchor.p356ui.dialog.DialogC5581c;
import com.bytedance.android.live.liveinteract.multilive.anchor.p356ui.dialog.MultiLiveAnchorOpenCameraDialog;
import com.bytedance.android.live.liveinteract.multilive.anchor.p356ui.p357a.C5533a;
import com.bytedance.android.live.liveinteract.multilive.p360c.C5590c;
import com.bytedance.android.live.liveinteract.multilive.p360c.C5593f;
import com.bytedance.android.live.liveinteract.multilive.p362e.C5624c;
import com.bytedance.android.live.liveinteract.platform.common.p371c.C5683b;
import com.bytedance.android.live.liveinteract.platform.common.p371c.C5692k;
import com.bytedance.android.live.liveinteract.platform.common.p371c.C5694m;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5702a;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5703b;
import com.bytedance.android.live.liveinteract.platform.p368c.C5668c;
import com.bytedance.android.live.p379n.AbstractC5790v;
import com.bytedance.android.livesdk.chatroom.api.LinkApi;
import com.bytedance.android.livesdk.chatroom.model.p495b.C7666e;
import com.bytedance.android.livesdk.chatroom.p488c.C7399p;
import com.bytedance.android.livesdk.chatroom.p488c.C7400q;
import com.bytedance.android.livesdk.chatroom.viewmodule.AbstractC8095br;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveLinkListOptiEnableSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiLiveLinkPanelStyle;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.p458b.p459a.C6894d;
import com.bytedance.android.livesdk.p561j.C9093de;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.p689e.C11753c;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.store.policy.PrivacyPolicyStore;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

public final class MultiGuestAsAnchorWidget extends BaseLinkWidget implements C5187f.AbstractC5188a, AbstractC33974au {

    /* renamed from: a */
    public C5277b f13849a;

    /* renamed from: b */
    public DialogC5344a f13850b;

    /* renamed from: c */
    public DialogC5568b f13851c;

    /* renamed from: d */
    public AbstractC5258a f13852d;

    /* renamed from: e */
    public C5533a f13853e;
    @AbstractC4430d(mo10204a = "MULTI_GUEST_DATA_HOLDER")

    /* renamed from: f */
    public C5271a f13854f;

    /* renamed from: g */
    private AbstractC5790v f13855g;

    /* renamed from: h */
    private Room f13856h;

    /* renamed from: i */
    private MultiLiveAnchorOpenCameraDialog f13857i;

    /* renamed from: j */
    private final AbstractC89172b<C7399p, C89391z> f13858j = new C5359a(this);

    static {
        Covode.recordClassIndex(5952);
    }

    @Override // com.bytedance.android.livesdk.chatroom.viewmodule.AbstractC8094bq
    /* renamed from: a */
    public final void mo10546a(Throwable th) {
        AbstractC8095br.m16255a(this, th);
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.bef;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, com.bytedance.android.live.liveinteract.api.BaseLinkWidget, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: d */
    public final void mo11190d() {
        C5277b bVar = this.f13849a;
        if (bVar != null) {
            bVar.mo11135i();
        }
    }

    public MultiGuestAsAnchorWidget() {
        C4431e.f12034a.mo10201a(this);
    }

    @Override // com.bytedance.android.livesdk.chatroom.viewmodule.AbstractC8094bq
    /* renamed from: g */
    public final String mo10549g() {
        return getClass().getName();
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p316a.p322f.C5187f.AbstractC5188a
    /* renamed from: b */
    public final void mo10945b() {
        AbstractC5258a aVar;
        C5271a aVar2 = this.f13854f;
        if (aVar2 == null) {
            C89219l.m154710a("mDataHolder");
        }
        if (aVar2.f13646q != EnumC4422k.NORMAL && (aVar = this.f13852d) != null) {
            aVar.mo11086c();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p316a.p322f.C5187f.AbstractC5188a
    /* renamed from: a */
    public final void mo10940a() {
        C11226ao.m19882a(this.context, (int) R.string.god);
        C5277b bVar = this.f13849a;
        if (bVar != null) {
            bVar.mo11129a(LinkApi.EnumC7285c.RTC_ERROR, PrivacyCert.Builder.Companion.with("bpea-530").usage("").tag("stop link mic when error occurs").policies(PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        C5702a.m12447a("LinkIn_Anchor_Widget_onDestroy");
        C5277b bVar = this.f13849a;
        if (bVar != null) {
            bVar.mo8577b();
        }
        AbstractC5258a aVar = this.f13852d;
        if (aVar != null) {
            aVar.mo11082b();
        }
        DialogC5344a aVar2 = this.f13850b;
        if (aVar2 != null && aVar2.isShowing()) {
            DialogC5344a aVar3 = this.f13850b;
            if (aVar3 != null) {
                aVar3.mo11173e();
            }
            DialogC5344a aVar4 = this.f13850b;
            if (aVar4 != null) {
                aVar4.dismiss();
            }
        }
        this.dataChannel.mo28316b(this);
        super.onDestroy();
    }

    @Override // com.bytedance.android.widget.Widget
    public final void onPause() {
        C5277b bVar = this.f13849a;
        if (bVar != null) {
            C5668c cVar = bVar.f13665f;
            if (cVar == null) {
                C89219l.m154710a("mRtcController");
            }
            cVar.mo11458g();
            if (bVar.f13663d == null) {
                C89219l.m154710a("mInfoCenter");
            }
            C5153d.m11387a(C5153d.EnumC5156c.BACKGROUND);
        }
        super.onPause();
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p316a.p322f.C5187f.AbstractC5188a
    /* renamed from: c */
    public final void mo10948c() {
        MultiLiveAnchorOpenCameraDialog multiLiveAnchorOpenCameraDialog = this.f13857i;
        if (multiLiveAnchorOpenCameraDialog == null || !multiLiveAnchorOpenCameraDialog.isShowing()) {
            C5271a aVar = this.f13854f;
            if (aVar == null) {
                C89219l.m154710a("mDataHolder");
            }
            if (aVar.f13637h && MultiLiveLinkPanelStyle.INSTANCE.getValue() > 0) {
                C5271a aVar2 = this.f13854f;
                if (aVar2 == null) {
                    C89219l.m154710a("mDataHolder");
                }
                if (!aVar2.f13633d) {
                    DialogC5344a aVar3 = this.f13850b;
                    if (aVar3 != null) {
                        aVar3.dismiss();
                    }
                    DialogC5568b bVar = this.f13851c;
                    if (bVar != null) {
                        bVar.dismiss();
                    }
                    Context context = this.context;
                    C89219l.m154716b(context, "");
                    MultiLiveAnchorOpenCameraDialog multiLiveAnchorOpenCameraDialog2 = new MultiLiveAnchorOpenCameraDialog(context, this.dataChannel, this, "end_link_and_no_guest");
                    this.f13857i = multiLiveAnchorOpenCameraDialog2;
                    multiLiveAnchorOpenCameraDialog2.show();
                }
            }
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        boolean z;
        AbstractC5258a bVar;
        Room room;
        C5271a d;
        super.onCreate();
        C5702a.m12447a("LinkIn_Anchor_Widget_onCreate");
        this.f13856h = (Room) this.dataChannel.mo28318b(C9093de.class);
        DataChannelGlobal.f42558d.mo28323a(this, C5692k.class, new C5360b(this));
        this.dataChannel.mo28312a((Object) this, C4441l.class, (AbstractC89172b) this.f13858j).mo28309a((AbstractC1204m) this, C11753c.class, (AbstractC89172b) new C5361c(this)).mo28309a((AbstractC1204m) this, C5683b.class, (AbstractC89172b) new C5362d(this)).mo28309a((AbstractC1204m) this, C5593f.class, (AbstractC89172b) new C5363e(this)).mo28309a((AbstractC1204m) this, C5694m.class, (AbstractC89172b) new C5364f(this)).mo28312a((Object) this, C5483b.class, (AbstractC89172b) new C5365g(this));
        Room room2 = this.f13856h;
        if (room2 != null) {
            DataChannel dataChannel = this.dataChannel;
            C89219l.m154716b(dataChannel, "");
            this.f13849a = new C5277b(room2, dataChannel);
        }
        C5277b bVar2 = this.f13849a;
        if (bVar2 != null) {
            bVar2.mo10297a((C5187f.AbstractC5188a) this);
        }
        C5277b bVar3 = this.f13849a;
        if (bVar3 == null || (d = bVar3.mo11132d()) == null) {
            z = false;
        } else {
            z = d.f13637h;
        }
        C11226ao.m19882a(C3966y.m9669e(), (int) R.string.duc);
        if (z) {
            C5277b bVar4 = this.f13849a;
            if (bVar4 == null) {
                C89219l.m154715b();
            }
            Room room3 = bVar4.f13673n;
            View view = this.contentView;
            Objects.requireNonNull(view, "null cannot be cast to non-null type android.widget.FrameLayout");
            FrameLayout frameLayout = (FrameLayout) view;
            C5277b bVar5 = this.f13849a;
            if (bVar5 == null) {
                C89219l.m154715b();
            }
            bVar = new C5624c(room3, frameLayout, bVar5.mo11123a());
        } else {
            C5277b bVar6 = this.f13849a;
            C5153d dVar = null;
            if (bVar6 != null) {
                room = bVar6.f13673n;
            } else {
                room = null;
            }
            View view2 = getView();
            Objects.requireNonNull(view2, "null cannot be cast to non-null type android.widget.FrameLayout");
            FrameLayout frameLayout2 = (FrameLayout) view2;
            C5277b bVar7 = this.f13849a;
            if (bVar7 != null) {
                dVar = bVar7.mo11123a();
            }
            bVar = new C5259b(room, true, null, frameLayout2, dVar);
        }
        DataChannel dataChannel2 = this.dataChannel;
        C89219l.m154716b(dataChannel2, "");
        bVar.mo11077a(dataChannel2);
        bVar.mo11080a(false);
        this.f13852d = bVar;
    }

    @Override // com.bytedance.android.widget.Widget
    public final void onResume() {
        super.onResume();
        C5277b bVar = this.f13849a;
        if (bVar != null) {
            C5668c cVar = bVar.f13665f;
            if (cVar == null) {
                C89219l.m154710a("mRtcController");
            }
            cVar.mo11452b(false);
            if (bVar.f13663d == null) {
                C89219l.m154710a("mInfoCenter");
            }
            C5153d.m11387a(C5153d.EnumC5156c.FOREGROUND);
        }
        MultiLiveAnchorOpenCameraDialog multiLiveAnchorOpenCameraDialog = this.f13857i;
        if (multiLiveAnchorOpenCameraDialog == null || !multiLiveAnchorOpenCameraDialog.isShowing()) {
            C5271a aVar = this.f13854f;
            if (aVar == null) {
                C89219l.m154710a("mDataHolder");
            }
            if (aVar.f13637h && MultiLiveLinkPanelStyle.INSTANCE.getValue() > 0) {
                C5271a aVar2 = this.f13854f;
                if (aVar2 == null) {
                    C89219l.m154710a("mDataHolder");
                }
                if (aVar2.f13641l == 0) {
                    C5271a aVar3 = this.f13854f;
                    if (aVar3 == null) {
                        C89219l.m154710a("mDataHolder");
                    }
                    aVar3.f13633d = true;
                    C6779a.m14563a().mo13053a(new C7400q(40));
                    DataChannel dataChannel = this.dataChannel;
                    if (dataChannel != null) {
                        dataChannel.mo28320c(C5590c.class, true);
                    }
                    DataChannel dataChannel2 = this.dataChannel;
                    if (dataChannel2 != null) {
                        dataChannel2.mo28320c(C5482a.class, new C5485d(false, "end_link_and_no_guest"));
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        MultiLiveAnchorOpenCameraDialog multiLiveAnchorOpenCameraDialog2 = this.f13857i;
        if (multiLiveAnchorOpenCameraDialog2 != null) {
            multiLiveAnchorOpenCameraDialog2.mo11338a();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.api.AbstractC4435f
    /* renamed from: a */
    public final void mo10216a(AbstractC5790v vVar) {
        C89219l.m154721d(vVar, "");
        this.f13855g = vVar;
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.opt.widget.MultiGuestAsAnchorWidget$h */
    static final class DialogInterface$OnDismissListenerC5366h implements DialogInterface.OnDismissListener {

        /* renamed from: a */
        final /* synthetic */ MultiGuestAsAnchorWidget f13866a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89238e f13867b;

        static {
            Covode.recordClassIndex(5960);
        }

        DialogInterface$OnDismissListenerC5366h(MultiGuestAsAnchorWidget multiGuestAsAnchorWidget, C89233z.C89238e eVar) {
            this.f13866a = multiGuestAsAnchorWidget;
            this.f13867b = eVar;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            this.f13866a.f13851c = null;
            this.f13866a.dataChannel.mo28319c(C5694m.class);
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.opt.widget.MultiGuestAsAnchorWidget$i */
    static final class DialogInterface$OnDismissListenerC5367i implements DialogInterface.OnDismissListener {

        /* renamed from: a */
        final /* synthetic */ MultiGuestAsAnchorWidget f13868a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89238e f13869b;

        static {
            Covode.recordClassIndex(5961);
        }

        DialogInterface$OnDismissListenerC5367i(MultiGuestAsAnchorWidget multiGuestAsAnchorWidget, C89233z.C89238e eVar) {
            this.f13868a = multiGuestAsAnchorWidget;
            this.f13869b = eVar;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            this.f13868a.f13850b = null;
            this.f13868a.dataChannel.mo28319c(C5694m.class);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p316a.p322f.C5187f.AbstractC5188a
    /* renamed from: a */
    public final void mo10942a(String str) {
        C89219l.m154721d(str, "");
        AbstractC5258a aVar = this.f13852d;
        if (aVar != null) {
            aVar.mo11085c(str);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p316a.p322f.C5187f.AbstractC5188a
    /* renamed from: b */
    public final void mo10946b(String str) {
        C89219l.m154721d(str, "");
        AbstractC5258a aVar = this.f13852d;
        if (aVar != null) {
            aVar.mo11085c(str);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p316a.p322f.C5187f.AbstractC5188a
    /* renamed from: d */
    public final void mo10950d(String str) {
        C89219l.m154721d(str, "");
        AbstractC5258a aVar = this.f13852d;
        if (aVar != null) {
            aVar.mo11089d(str);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p316a.p322f.C5187f.AbstractC5188a
    /* renamed from: e */
    public final void mo10951e(String str) {
        C89219l.m154721d(str, "");
        AbstractC5258a aVar = this.f13852d;
        if (aVar != null) {
            aVar.mo11089d(str);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p316a.p322f.C5187f.AbstractC5188a
    /* renamed from: f */
    public final void mo10952f(String str) {
        C89219l.m154721d(str, "");
        AbstractC5258a aVar = this.f13852d;
        if (aVar != null) {
            aVar.mo11083b(str);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p316a.p322f.C5187f.AbstractC5188a
    /* renamed from: h */
    public final int mo10954h(String str) {
        C89219l.m154721d(str, "");
        AbstractC5258a aVar = this.f13852d;
        if (aVar != null) {
            return aVar.mo11093f(str);
        }
        return -1;
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.opt.widget.MultiGuestAsAnchorWidget$a */
    static final class C5359a extends AbstractC89220m implements AbstractC89172b<C7399p, C89391z> {

        /* renamed from: a */
        final /* synthetic */ MultiGuestAsAnchorWidget f13859a;

        static {
            Covode.recordClassIndex(5953);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5359a(MultiGuestAsAnchorWidget multiGuestAsAnchorWidget) {
            super(1);
            this.f13859a = multiGuestAsAnchorWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C7399p pVar) {
            C5277b bVar;
            C7399p pVar2 = pVar;
            C89219l.m154721d(pVar2, "");
            MultiGuestAsAnchorWidget multiGuestAsAnchorWidget = this.f13859a;
            if (pVar2.f18332a == 0 && (bVar = multiGuestAsAnchorWidget.f13849a) != null) {
                bVar.mo11135i();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.opt.widget.MultiGuestAsAnchorWidget$b */
    static final class C5360b extends AbstractC89220m implements AbstractC89172b<C89391z, C89391z> {

        /* renamed from: a */
        final /* synthetic */ MultiGuestAsAnchorWidget f13860a;

        static {
            Covode.recordClassIndex(5954);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5360b(MultiGuestAsAnchorWidget multiGuestAsAnchorWidget) {
            super(1);
            this.f13860a = multiGuestAsAnchorWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C89391z zVar) {
            C89219l.m154721d(zVar, "");
            C11226ao.m19882a(C3966y.m9669e(), (int) R.string.e_2);
            C5277b bVar = this.f13860a.f13849a;
            if (bVar != null) {
                bVar.mo11135i();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.opt.widget.MultiGuestAsAnchorWidget$f */
    static final class C5364f extends AbstractC89220m implements AbstractC89172b<C89391z, C89391z> {

        /* renamed from: a */
        final /* synthetic */ MultiGuestAsAnchorWidget f13864a;

        static {
            Covode.recordClassIndex(5958);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5364f(MultiGuestAsAnchorWidget multiGuestAsAnchorWidget) {
            super(1);
            this.f13864a = multiGuestAsAnchorWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C89391z zVar) {
            C89219l.m154721d(zVar, "");
            AbstractC5258a aVar = this.f13864a.f13852d;
            if (aVar != null) {
                aVar.mo11088d();
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p316a.p322f.C5187f.AbstractC5188a
    /* renamed from: c */
    public final void mo10949c(String str) {
        C89219l.m154721d(str, "");
        C11226ao.m19883a(C3966y.m9669e(), C3966y.m9660a((int) R.string.e7y, str), 0);
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.opt.widget.MultiGuestAsAnchorWidget$c */
    static final class C5361c extends AbstractC89220m implements AbstractC89172b<Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ MultiGuestAsAnchorWidget f13861a;

        static {
            Covode.recordClassIndex(5955);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5361c(MultiGuestAsAnchorWidget multiGuestAsAnchorWidget) {
            super(1);
            this.f13861a = multiGuestAsAnchorWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Boolean bool) {
            bool.booleanValue();
            C5277b bVar = this.f13861a.f13849a;
            if (bVar != null) {
                bVar.mo11129a(LinkApi.EnumC7285c.ILLEGAL_LIVE, PrivacyCert.Builder.Companion.with("bpea-529").usage("").tag("stop link mic").policies(PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.opt.widget.MultiGuestAsAnchorWidget$e */
    static final class C5363e extends AbstractC89220m implements AbstractC89172b<C89391z, C89391z> {

        /* renamed from: a */
        final /* synthetic */ MultiGuestAsAnchorWidget f13863a;

        static {
            Covode.recordClassIndex(5957);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5363e(MultiGuestAsAnchorWidget multiGuestAsAnchorWidget) {
            super(1);
            this.f13863a = multiGuestAsAnchorWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C89391z zVar) {
            C5271a d;
            C5277b bVar;
            C89219l.m154721d(zVar, "");
            C5277b bVar2 = this.f13863a.f13849a;
            if (!(bVar2 == null || (d = bVar2.mo11132d()) == null || !d.f13637h || (bVar = this.f13863a.f13849a) == null)) {
                bVar.mo11135i();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.opt.widget.MultiGuestAsAnchorWidget$g */
    static final class C5365g extends AbstractC89220m implements AbstractC89172b<C5533a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ MultiGuestAsAnchorWidget f13865a;

        static {
            Covode.recordClassIndex(5959);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5365g(MultiGuestAsAnchorWidget multiGuestAsAnchorWidget) {
            super(1);
            this.f13865a = multiGuestAsAnchorWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C5533a aVar) {
            C5533a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            if (this.f13865a.f13851c == null && this.f13865a.f13850b == null) {
                this.f13865a.f13853e = aVar2;
                this.f13865a.mo11190d();
                C5703b.m12473b("plus_button");
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p316a.p322f.C5187f.AbstractC5188a
    /* renamed from: g */
    public final int mo10953g(String str) {
        C89219l.m154721d(str, "");
        C6894d a = C6894d.m14753a();
        C89219l.m154716b(a, "");
        if (C89219l.m154714a((Object) str, (Object) a.f17259d)) {
            return 0;
        }
        AbstractC5258a aVar = this.f13852d;
        if (aVar != null) {
            return aVar.mo11092e(str);
        }
        return -1;
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.opt.widget.MultiGuestAsAnchorWidget$d */
    static final class C5362d extends AbstractC89220m implements AbstractC89172b<Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ MultiGuestAsAnchorWidget f13862a;

        static {
            Covode.recordClassIndex(5956);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5362d(MultiGuestAsAnchorWidget multiGuestAsAnchorWidget) {
            super(1);
            this.f13862a = multiGuestAsAnchorWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Boolean bool) {
            if (bool.booleanValue()) {
                C5277b bVar = this.f13862a.f13849a;
                if (bVar != null) {
                    bVar.mo11129a(LinkApi.EnumC7285c.INTERRUPT_BY_CO_HOST, PrivacyCert.Builder.Companion.with("bpea-569").usage("").tag("pause link mic").policies(PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
                }
                C5703b.m12480d("accept_anchor_invite");
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p316a.p322f.C5187f.AbstractC5188a
    /* renamed from: b */
    public final void mo10947b(List<C7666e> list) {
        DialogC5568b bVar;
        C89219l.m154721d(list, "");
        if (isViewValid()) {
            DialogC5344a aVar = this.f13850b;
            if (aVar == null || !aVar.isShowing()) {
                DialogC5568b bVar2 = this.f13851c;
                if (bVar2 != null && bVar2.isShowing() && (bVar = this.f13851c) != null) {
                    if (LiveLinkListOptiEnableSetting.INSTANCE.getValue()) {
                        C5153d dVar = bVar.f14192e;
                        if (dVar == null) {
                            C89219l.m154710a("mInfoCenter");
                        }
                        List<C7666e> j = dVar.mo10913j();
                        C5153d dVar2 = bVar.f14192e;
                        if (dVar2 == null) {
                            C89219l.m154710a("mInfoCenter");
                        }
                        List<C7666e> i = dVar2.mo10912i();
                        C5153d dVar3 = bVar.f14192e;
                        if (dVar3 == null) {
                            C89219l.m154710a("mInfoCenter");
                        }
                        bVar.mo11352b(j, i, dVar3.f13348c);
                        bVar.mo11356f();
                        return;
                    }
                    bVar.f14190c.mo11304a();
                    return;
                }
                return;
            }
            DialogC5344a aVar2 = this.f13850b;
            if (aVar2 == null) {
                return;
            }
            if (list != null) {
                aVar2.f13814a.mo10853a(DialogC5344a.m11798a(list));
                aVar2.mo11172d();
                return;
            }
            try {
                throw new IllegalArgumentException("Required value was null.".toString());
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: java.util.List<com.bytedance.android.livesdk.chatroom.model.b.e> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.android.live.liveinteract.multiguest.p316a.p322f.C5187f.AbstractC5188a
    /* renamed from: a */
    public final void mo10944a(List<C7666e> list) {
        boolean z;
        int i;
        DialogC5344a aVar;
        C89219l.m154721d(list, "");
        C89233z.C89238e eVar = new C89233z.C89238e();
        eVar.element = list;
        if (isViewValid() && this.f13850b == null && this.f13851c == null) {
            if (eVar.element == null) {
                eVar.element = (T) new ArrayList();
            }
            C5277b bVar = this.f13849a;
            if (bVar != null) {
                C5271a d = bVar.mo11132d();
                if (d != null) {
                    z = d.f13637h;
                } else {
                    z = false;
                }
                C5271a aVar2 = this.f13854f;
                if (aVar2 == null) {
                    C89219l.m154710a("mDataHolder");
                }
                C5533a aVar3 = this.f13853e;
                if (aVar3 != null) {
                    i = aVar3.f14117a;
                } else {
                    i = -1;
                }
                aVar2.f13649t = i;
                if (!z) {
                    Context context = this.context;
                    C89219l.m154716b(context, "");
                    aVar = new DialogC5344a(context, bVar, eVar.element);
                } else if (MultiLiveLinkPanelStyle.INSTANCE.getValue() > 0) {
                    Context context2 = this.context;
                    C89219l.m154716b(context2, "");
                    DialogC5568b bVar2 = new DialogC5568b(this, context2, bVar);
                    this.f13851c = bVar2;
                    bVar2.setOnDismissListener(new DialogInterface$OnDismissListenerC5366h(this, eVar));
                    DialogC5568b bVar3 = this.f13851c;
                    if (bVar3 != null) {
                        bVar3.show();
                    }
                    this.f13853e = null;
                    return;
                } else {
                    Context context3 = this.context;
                    C89219l.m154716b(context3, "");
                    aVar = new DialogC5581c(this, context3, bVar, eVar.element);
                }
                this.f13850b = aVar;
                aVar.setOnDismissListener(new DialogInterface$OnDismissListenerC5367i(this, eVar));
                DialogC5344a aVar4 = this.f13850b;
                if (aVar4 != null) {
                    aVar4.show();
                }
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p316a.p322f.C5187f.AbstractC5188a
    /* renamed from: a */
    public final void mo10943a(String str, SurfaceView surfaceView) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(surfaceView, "");
        AbstractC5258a aVar = this.f13852d;
        if (aVar != null) {
            aVar.mo11079a(str, surfaceView);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p316a.p322f.C5187f.AbstractC5188a
    /* renamed from: a */
    public final void mo10941a(long j, long j2) {
        C3854a.m9453a(4, "bitrate_callback", new StringBuilder().append(j).append(' ').append(j2).toString());
        AbstractC5790v vVar = this.f13855g;
        if (vVar != null) {
            vVar.mo11564e();
        }
    }
}
