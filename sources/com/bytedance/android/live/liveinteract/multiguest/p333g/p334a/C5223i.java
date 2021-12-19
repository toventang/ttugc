package com.bytedance.android.live.liveinteract.multiguest.p333g.p334a;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.design.widget.LiveButton;
import com.bytedance.android.live.design.widget.LiveCheckBox;
import com.bytedance.android.live.liveinteract.api.C4441l;
import com.bytedance.android.live.liveinteract.api.C4454x;
import com.bytedance.android.live.liveinteract.api.p260a.C4384b;
import com.bytedance.android.live.liveinteract.api.p260a.C4386c;
import com.bytedance.android.live.liveinteract.multiguest.p333g.p334a.DialogC5211a;
import com.bytedance.android.live.liveinteract.multilive.api.MultiLiveApi;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5714i;
import com.bytedance.android.live.network.C5805e;
import com.bytedance.android.livesdk.AbstractC11293v;
import com.bytedance.android.livesdk.chatroom.api.LinkApi;
import com.bytedance.android.livesdk.chatroom.p488c.C7399p;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiLiveServerAutoJoinChannel;
import com.bytedance.android.livesdk.p425aa.C6555i;
import com.bytedance.android.livesdk.p437ag.C6670f;
import com.bytedance.android.livesdk.p437ag.p439b.AbstractC6656d;
import com.bytedance.android.livesdk.p458b.p459a.C6894d;
import com.bytedance.android.livesdk.p458b.p459a.C6898g;
import com.bytedance.android.livesdk.p561j.C9009ac;
import com.bytedance.android.livesdk.util.rxutils.C11191f;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.android.livesdk.utils.EnumC11229b;
import com.bytedance.android.livesdk.utils.LiveAppBundleUtils;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.bytedance.android.live.liveinteract.multiguest.g.a.i */
public final class C5223i extends AbstractC11293v {

    /* renamed from: d */
    public static final C5224a f13501d = new C5224a((byte) 0);

    /* renamed from: a */
    public AbstractC88412b f13502a;

    /* renamed from: b */
    public LiveButton f13503b;

    /* renamed from: c */
    public boolean f13504c;

    /* renamed from: e */
    private LiveCheckBox f13505e;

    /* renamed from: f */
    private HashMap f13506f;

    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.g.a.i$f */
    static final class C5232f<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C5232f f13518a = new C5232f();

        static {
            Covode.recordClassIndex(5824);
        }

        C5232f() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.g.a.i$g */
    static final class C5233g<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C5233g f13519a = new C5233g();

        static {
            Covode.recordClassIndex(5825);
        }

        C5233g() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(5815);
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: a */
    public final void mo8165a() {
        HashMap hashMap = this.f13506f;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: a_ */
    public final View mo8166a_(int i) {
        if (this.f13506f == null) {
            this.f13506f = new HashMap();
        }
        View view = (View) this.f13506f.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f13506f.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: i */
    public final boolean mo10398i() {
        return true;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, com.bytedance.android.livesdk.AbstractC11293v, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo8165a();
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.g.a.i$a */
    public static final class C5224a {
        static {
            Covode.recordClassIndex(5816);
        }

        private C5224a() {
        }

        public /* synthetic */ C5224a(byte b) {
            this();
        }
    }

    private C5223i() {
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.g.a.i$d */
    static final class C5229d extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C5223i f13514a;

        /* renamed from: b */
        final /* synthetic */ View f13515b;

        static {
            Covode.recordClassIndex(5821);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5229d(C5223i iVar, View view) {
            super(0);
            this.f13514a = iVar;
            this.f13515b = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            mo11012a();
            return C89391z.f203057a;
        }

        /* renamed from: a */
        public final void mo11012a() {
            try {
                if (this.f13514a.getContext() != null) {
                    Context context = this.f13514a.getContext();
                    if (context == null) {
                        C89219l.m154715b();
                    }
                    C89219l.m154716b(context, "");
                    Activity a = C5223i.m11561a(context);
                    if (a == null) {
                        throw new IllegalStateException("Required value was null.".toString());
                    } else if (!LiveAppBundleUtils.isPluginAvailable(EnumC11229b.LINK_MIC)) {
                        Context context2 = this.f13514a.getContext();
                        if (context2 == null) {
                            C89219l.m154715b();
                        }
                        LiveAppBundleUtils.ensurePluginAvailable(context2, EnumC11229b.LINK_MIC);
                        throw new IllegalStateException("Check failed.".toString());
                    } else if (C4384b.C4385a.m10496a().mo10147a() != 2) {
                        C11226ao.m19882a(C3966y.m9669e(), (int) R.string.e7o);
                        this.f13514a.dismiss();
                    } else if (C6894d.m14753a().f17273t >= C6894d.m14753a().f17275v) {
                        C11226ao.m19882a(C3966y.m9669e(), (int) R.string.e8n);
                        this.f13514a.dismiss();
                    } else {
                        C6670f.m14183a(a).mo12816a(new AbstractC6656d(this) {
                            /* class com.bytedance.android.live.liveinteract.multiguest.p333g.p334a.C5223i.C5229d.C52301 */

                            /* renamed from: a */
                            final /* synthetic */ C5229d f13516a;

                            static {
                                Covode.recordClassIndex(5822);
                            }

                            /* JADX WARN: Incorrect args count in method signature: ()V */
                            {
                                this.f13516a = r1;
                            }

                            @Override // com.bytedance.android.livesdk.p437ag.p439b.AbstractC6656d
                            /* renamed from: a */
                            public final void mo11013a(String... strArr) {
                                C89219l.m154721d(strArr, "");
                                C6555i.m14021b();
                                C6555i.m9463b("invite_issue_check", "onPermissionGrant");
                                DataChannel dataChannel = this.f13516a.f13514a.f27010p;
                                if (dataChannel != null) {
                                    C7399p pVar = new C7399p(1);
                                    pVar.f18333b = DialogC5211a.EnumC5215a.GO_LIVE;
                                    dataChannel.mo28320c(C4441l.class, pVar);
                                }
                                this.f13516a.f13514a.dismiss();
                            }

                            @Override // com.bytedance.android.livesdk.p437ag.p439b.AbstractC6656d
                            /* renamed from: b */
                            public final void mo11014b(String... strArr) {
                                C89219l.m154721d(strArr, "");
                                C11226ao.m19882a(this.f13516a.f13514a.getContext(), (int) R.string.goo);
                                if (((LiveButton) this.f13516a.f13515b.findViewById(R.id.f2_)).performClick()) {
                                    this.f13516a.f13514a.dismiss();
                                }
                            }
                        }, "android.permission.CAMERA", "android.permission.RECORD_AUDIO");
                    }
                } else {
                    throw new IllegalStateException("Required value was null.".toString());
                }
            } catch (IllegalStateException unused) {
                this.f13514a.dismiss();
            }
        }
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: b */
    public final AbstractC11293v.C11295b mo8355b() {
        AbstractC11293v.C11295b bVar = new AbstractC11293v.C11295b(R.layout.b5x);
        bVar.f27015b = R.style.a35;
        bVar.f27022i = -1;
        return bVar;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        DataChannel dataChannel = this.f27010p;
        if (dataChannel != null) {
            dataChannel.mo28315b(C4454x.class, (Object) false);
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, com.bytedance.android.livesdk.AbstractC11293v
    public final void dismiss() {
        super.dismiss();
        LiveCheckBox liveCheckBox = this.f13505e;
        if (liveCheckBox != null && liveCheckBox.isChecked()) {
            try {
                Room room = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
                if (room != null) {
                    long id = room.getId();
                    if (id != 0) {
                        ((MultiLiveApi) C5805e.m12718a().mo11572a(MultiLiveApi.class)).turnOffInvitation(id).mo143271a(new C11191f()).mo143254a(C5232f.f13518a, C5233g.f13519a);
                    }
                }
                throw new IllegalStateException("Check failed.".toString());
            } catch (Exception unused) {
            }
        }
        AbstractC88412b bVar = this.f13502a;
        if (bVar != null) {
            bVar.dispose();
        }
    }

    public /* synthetic */ C5223i(byte b) {
        this();
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.g.a.i$b */
    static final class View$OnClickListenerC5225b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C5229d f13507a;

        static {
            Covode.recordClassIndex(5817);
        }

        View$OnClickListenerC5225b(C5229d dVar) {
            this.f13507a = dVar;
        }

        public final void onClick(View view) {
            C6555i.m14021b();
            C6555i.m9463b("invite_issue_check", "replyAnchorWithAgree");
            this.f13507a.mo11012a();
        }
    }

    /* renamed from: a */
    public static Activity m11561a(Context context) {
        while (!(context instanceof Activity)) {
            if (!(context instanceof ContextWrapper)) {
                return null;
            }
        }
        return (Activity) context;
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.g.a.i$e */
    static final class C5231e extends AbstractC89220m implements AbstractC89172b<C89391z, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C5223i f13517a;

        static {
            Covode.recordClassIndex(5823);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5231e(C5223i iVar) {
            super(1);
            this.f13517a = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C89391z zVar) {
            C89219l.m154721d(zVar, "");
            LiveButton liveButton = this.f13517a.f13503b;
            if (liveButton != null) {
                liveButton.setEnabled(true);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.g.a.i$c */
    static final class View$OnClickListenerC5226c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C5223i f13508a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89237d f13509b;

        /* renamed from: c */
        final /* synthetic */ C89233z.C89237d f13510c;

        /* renamed from: d */
        final /* synthetic */ String f13511d;

        static {
            Covode.recordClassIndex(5818);
        }

        View$OnClickListenerC5226c(C5223i iVar, C89233z.C89237d dVar, C89233z.C89237d dVar2, String str) {
            this.f13508a = iVar;
            this.f13509b = dVar;
            this.f13510c = dVar2;
            this.f13511d = str;
        }

        public final void onClick(View view) {
            if (!this.f13508a.f13504c) {
                C5714i.m12529a(2L, this.f13509b.element, C6898g.C6899a.f17285a.mo13196a(this.f13509b.element));
                this.f13508a.f13504c = true;
                boolean value = MultiLiveServerAutoJoinChannel.INSTANCE.getValue();
                this.f13508a.f13502a = ((LinkApi) C5805e.m12718a().mo11572a(LinkApi.class)).linkInRoomGuestReplyAnchor(this.f13510c.element, 2, this.f13510c.element, this.f13509b.element, C4386c.m10499a().f11990k, this.f13511d, value).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new AbstractC88433f(this) {
                    /* class com.bytedance.android.live.liveinteract.multiguest.p333g.p334a.C5223i.View$OnClickListenerC5226c.C52271 */

                    /* renamed from: a */
                    final /* synthetic */ View$OnClickListenerC5226c f13512a;

                    static {
                        Covode.recordClassIndex(5819);
                    }

                    {
                        this.f13512a = r1;
                    }

                    @Override // p4560f.p4561a.p4567d.AbstractC88433f
                    public final /* synthetic */ void accept(Object obj) {
                        this.f13512a.f13508a.dismiss();
                        C5714i.m12554b(2, this.f13512a.f13509b.element, C6898g.C6899a.f17285a.mo13196a(this.f13512a.f13509b.element));
                        this.f13512a.f13508a.f13504c = false;
                    }
                }, new AbstractC88433f(this) {
                    /* class com.bytedance.android.live.liveinteract.multiguest.p333g.p334a.C5223i.View$OnClickListenerC5226c.C52282 */

                    /* renamed from: a */
                    final /* synthetic */ View$OnClickListenerC5226c f13513a;

                    static {
                        Covode.recordClassIndex(5820);
                    }

                    {
                        this.f13513a = r1;
                    }

                    @Override // p4560f.p4561a.p4567d.AbstractC88433f
                    public final /* synthetic */ void accept(Object obj) {
                        this.f13513a.f13508a.dismiss();
                        C5714i.m12540a((Throwable) obj, 2, this.f13513a.f13509b.element, C6898g.C6899a.f17285a.mo13196a(this.f13513a.f13509b.element));
                        this.f13513a.f13508a.f13504c = false;
                    }
                });
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0045, code lost:
        if (r9 != null) goto L_0x0048;
     */
    @Override // com.bytedance.android.livesdk.AbstractC11293v, androidx.fragment.app.Fragment
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r13, android.os.Bundle r14) {
        /*
        // Method dump skipped, instructions count: 382
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguest.p333g.p334a.C5223i.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
