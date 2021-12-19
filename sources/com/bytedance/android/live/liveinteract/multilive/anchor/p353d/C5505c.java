package com.bytedance.android.live.liveinteract.multilive.anchor.p353d;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import com.bytedance.android.live.base.AbstractC2953a;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multilive.anchor.p353d.AbstractC5502b;
import com.bytedance.android.live.liveinteract.multilive.anchor.p356ui.dialog.DialogC5568b;
import com.bytedance.android.live.liveinteract.multilive.anchor.p356ui.p358b.AbstractC5542g;
import com.bytedance.android.live.liveinteract.multilive.api.MultiLiveApi;
import com.bytedance.android.live.liveinteract.multilive.p360c.C5594g;
import com.bytedance.android.live.liveinteract.platform.common.p369a.AbstractC5671b;
import com.bytedance.android.live.network.C5805e;
import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.live.p385p.EnumC5847l;
import com.bytedance.android.live.p405s.AbstractC6103e;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.live.share.AbstractC6107a;
import com.bytedance.android.live.share.AbstractC6109c;
import com.bytedance.android.livesdk.chatroom.p492g.C7593n;
import com.bytedance.android.livesdk.model.C9542az;
import com.bytedance.android.livesdk.p425aa.C6544e;
import com.bytedance.android.livesdk.p456as.AbstractC6872f;
import com.bytedance.android.livesdk.p561j.C9009ac;
import com.bytedance.android.livesdk.p561j.C9065cd;
import com.bytedance.android.livesdk.p561j.C9101dm;
import com.bytedance.android.livesdk.p562k.DialogC9148b;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdk.util.rxutils.C11191f;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.p683e.AbstractC11665b;
import com.bytedance.android.livesdkapi.depend.p683e.C11666c;
import com.bytedance.android.livesdkapi.host.IHostApp;
import com.bytedance.android.livesdkapi.model.C11838d;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.liveinteract.multilive.anchor.d.c */
public final class C5505c extends AbstractC5502b.AbstractC5503a implements AbstractC5542g {

    /* renamed from: a */
    public boolean f14079a = true;

    /* renamed from: b */
    private final DialogC5568b f14080b;

    /* renamed from: c */
    private final DataChannel f14081c;

    /* renamed from: d */
    private AbstractC88412b f14082d;

    /* renamed from: e */
    private Room f14083e;

    /* renamed from: g */
    private DialogC9148b f14084g;

    static {
        Covode.recordClassIndex(6100);
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multilive.anchor.d.c$c */
    public static final class C5508c implements AbstractC11665b {
        static {
            Covode.recordClassIndex(6103);
        }

        @Override // com.bytedance.android.livesdkapi.depend.p683e.AbstractC11665b
        /* renamed from: a */
        public final void mo8903a(String str, String str2, Bundle bundle) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
        }

        @Override // com.bytedance.android.livesdkapi.depend.p683e.AbstractC11665b
        /* renamed from: a */
        public final void mo8904a(Throwable th) {
            C89219l.m154721d(th, "");
        }

        C5508c() {
        }
    }

    @Override // com.bytedance.android.live.liveinteract.platform.common.p369a.C5670a
    /* renamed from: g */
    public final void mo10939g() {
        AbstractC88412b bVar = this.f14082d;
        if (bVar != null) {
            bVar.dispose();
        }
        DialogC9148b bVar2 = this.f14084g;
        if (bVar2 != null) {
            bVar2.dismiss();
        }
    }

    /* renamed from: a */
    public final void mo11304a() {
        long j;
        long j2;
        boolean z;
        try {
            Room room = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
            if (room != null) {
                j2 = room.getId();
                j = room.getOwnerUserId();
            } else {
                j = 0;
                j2 = 0;
            }
            if (j2 != 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                throw new IllegalStateException("Check failed.".toString());
            } else if (j != 0) {
                this.f14082d = ((MultiLiveApi) C5805e.m12718a().mo11572a(MultiLiveApi.class)).getListByType(j2, j, j2, 0).mo142910a(new C11191f()).mo142915a(new C5506a(this), new C5507b(this));
            } else {
                throw new IllegalStateException("Check failed.".toString());
            }
        } catch (IllegalStateException unused) {
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.anchor.p356ui.p358b.AbstractC5542g
    /* renamed from: b */
    public final void mo11306b() {
        String str;
        User user;
        String str2;
        String str3;
        this.f14080b.dismiss();
        Room room = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
        if (room != null) {
            DataChannel dataChannel = this.f14081c;
            Activity activity = null;
            if (dataChannel != null) {
                str = (String) dataChannel.mo28318b(C9065cd.class);
            } else {
                str = null;
            }
            C11666c.C11667a a = C11666c.m20576a(room);
            if (room.getOwner() != null) {
                AbstractC2953a a2 = C6193a.m13435a(IHostApp.class);
                C89219l.m154716b(a2, "");
                if (((IHostApp) a2).isInMusicallyRegion()) {
                    str2 = "h5_m";
                } else {
                    str2 = "h5_t";
                }
                StringBuilder sb = new StringBuilder("www.tiktok.com/@");
                User owner = room.getOwner();
                if (owner != null) {
                    str3 = owner.displayId;
                } else {
                    str3 = null;
                }
                a.f27865l = sb.append(str3).append("/live?source=").append(str2).append("&_r=1").toString();
            }
            AbstractC6872f b = C11115u.m19743a().mo17915b();
            C89219l.m154716b(b, "");
            a.f27857d = b.mo13161c();
            a.f27875v = room.getId();
            a.f27876w = room.getOwnerUserId();
            C89219l.m154716b(a, "");
            a.f27873t = C6544e.m13997k();
            String a3 = C6544e.m13987a();
            String d = C6544e.m13990d();
            if (room.getOwner() != null) {
                User owner2 = room.getOwner();
                C89219l.m154716b(owner2, "");
                if (owner2.getSecret() == 1) {
                    Context context = this.f14080b.getContext();
                    long id = room.getId();
                    long ownerUserId = room.getOwnerUserId();
                    long ownerUserId2 = room.getOwnerUserId();
                    User owner3 = room.getOwner();
                    C89219l.m154716b(owner3, "");
                    ((AbstractC6103e) C6193a.m13435a(AbstractC6103e.class)).report(context, new C11838d(id, ownerUserId, ownerUserId2, owner3.getSecUid(), "anchor_profile", a3, d, str, "report_anchor", room.getRequestId()));
                    return;
                }
            }
            boolean z = false;
            DataChannel dataChannel2 = this.f14081c;
            if (!(dataChannel2 == null || (user = (User) dataChannel2.mo28318b(C9101dm.class)) == null || user.getUserAttr() == null)) {
                C9542az userAttr = user.getUserAttr();
                C89219l.m154716b(userAttr, "");
                if (userAttr.f23192b) {
                    z = true;
                }
            }
            AbstractC6107a share = ((AbstractC6109c) C6193a.m13435a(AbstractC6109c.class)).share();
            Context context2 = this.f14080b.getContext();
            C89219l.m154716b(context2, "");
            while (true) {
                if (context2 != null) {
                    if (!(context2 instanceof Activity)) {
                        if (!(context2 instanceof ContextWrapper)) {
                            break;
                        }
                        context2 = ((ContextWrapper) context2).getBaseContext();
                    } else {
                        activity = (Activity) context2;
                        break;
                    }
                } else {
                    break;
                }
            }
            a.f27867n = room.getAnchorShareText();
            a.f27870q = true;
            a.f27871r = z;
            a.f27872s = EnumC5847l.SHARE.isRedDotShowing(this.f14081c);
            a.f27874u = str;
            share.mo11989a(activity, a.mo18437a(), new C5508c());
            C7593n.m15607a(this.f14080b.getContext()).mo13833a(room.getIdStr(), room.getId());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.liveinteract.multilive.anchor.d.c$b */
    public static final class C5507b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C5505c f14086a;

        static {
            Covode.recordClassIndex(6102);
        }

        C5507b(C5505c cVar) {
            this.f14086a = cVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            AbstractC5502b.AbstractC5504b bVar = (AbstractC5502b.AbstractC5504b) this.f14086a.f14407f;
            if (bVar != null) {
                bVar.mo11303d();
            }
        }
    }

    /* renamed from: a */
    public final void mo10938a(AbstractC5502b.AbstractC5504b bVar) {
        super.mo10938a((AbstractC5671b) bVar);
        this.f14083e = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.liveinteract.multilive.anchor.d.c$a */
    public static final class C5506a<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C5505c f14085a;

        static {
            Covode.recordClassIndex(6101);
        }

        C5506a(C5505c cVar) {
            this.f14085a = cVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C5594g gVar;
            AbstractC5502b.AbstractC5504b bVar;
            C5832d dVar = (C5832d) obj;
            if (dVar != null && (gVar = (C5594g) dVar.data) != null && (bVar = (AbstractC5502b.AbstractC5504b) this.f14085a.f14407f) != null) {
                bVar.mo11302a(gVar.f14234a, gVar.f14235b, gVar.f14236c);
            }
        }
    }

    public C5505c(DialogC5568b bVar) {
        C89219l.m154721d(bVar, "");
        this.f14080b = bVar;
        this.f14081c = bVar.f14188a;
    }
}
