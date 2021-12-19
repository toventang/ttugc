package com.bytedance.android.livesdk.usermanage;

import android.content.DialogInterface;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.base.model.user.AbstractC2994b;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p214d.C3866a;
import com.bytedance.android.live.core.p214d.C3868c;
import com.bytedance.android.live.p172a.p173a.p175b.C2912a;
import com.bytedance.android.live.p176b.AbstractC2928f;
import com.bytedance.android.live.p379n.C5791w;
import com.bytedance.android.live.p385p.EnumC5847l;
import com.bytedance.android.live.p405s.AbstractC6102d;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.live.p408u.C6203g;
import com.bytedance.android.livesdk.chatroom.p488c.C7400q;
import com.bytedance.android.livesdk.chatroom.p488c.C7402s;
import com.bytedance.android.livesdk.event.C8448b;
import com.bytedance.android.livesdk.model.C9542az;
import com.bytedance.android.livesdk.model.message.C9627ay;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.p450an.C6800c;
import com.bytedance.android.livesdk.p452ao.AbstractC6804a;
import com.bytedance.android.livesdk.p452ao.C6805b;
import com.bytedance.android.livesdk.p452ao.C6806c;
import com.bytedance.android.livesdk.p456as.AbstractC6872f;
import com.bytedance.android.livesdk.p561j.C9066ce;
import com.bytedance.android.livesdk.p561j.C9067cf;
import com.bytedance.android.livesdk.p561j.C9085cx;
import com.bytedance.android.livesdk.p561j.C9093de;
import com.bytedance.android.livesdk.p561j.C9101dm;
import com.bytedance.android.livesdk.p561j.C9119ed;
import com.bytedance.android.livesdk.p561j.C9131m;
import com.bytedance.android.livesdk.p562k.DialogC9148b;
import com.bytedance.android.livesdk.p643ui.C10935a;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdk.util.rxutils.autodispose.AbstractC11181z;
import com.bytedance.android.livesdk.util.rxutils.autodispose.C11152e;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p2082ss.android.ugc.trill.R;
import org.json.JSONObject;
import p4560f.p4561a.AbstractC88406ae;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.C89391z;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.usermanage.h */
public final class C11078h implements AbstractC6102d {

    /* renamed from: a */
    public final C10935a f26657a;

    /* renamed from: b */
    public final DataChannel f26658b;

    /* renamed from: c */
    public final C88411a f26659c;

    /* renamed from: d */
    private final C11088e f26660d = new C11088e(this);

    /* renamed from: com.bytedance.android.livesdk.usermanage.h$b */
    final /* synthetic */ class C11085b implements AbstractC88433f {

        /* renamed from: a */
        private final /* synthetic */ AbstractC89172b f26664a;

        static {
            Covode.recordClassIndex(12706);
        }

        C11085b(AbstractC89172b bVar) {
            this.f26664a = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C89219l.m154716b(this.f26664a.invoke(obj), "");
        }
    }

    static {
        Covode.recordClassIndex(12699);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.usermanage.h$a */
    public static final class RunnableC11084a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C11078h f26663a;

        static {
            Covode.recordClassIndex(12705);
        }

        RunnableC11084a(C11078h hVar) {
            this.f26663a = hVar;
        }

        public final void run() {
            this.f26663a.mo17895c();
        }
    }

    /* renamed from: d */
    private User m19701d() {
        return (User) this.f26658b.mo28318b(C9101dm.class);
    }

    @Override // com.bytedance.android.live.p405s.AbstractC6102d
    /* renamed from: a */
    public final void mo11967a() {
        AbstractC6872f b = C11115u.m19743a().mo17915b();
        C89219l.m154716b(b, "");
        if (b.mo13165e()) {
            C6203g.m13462a(new RunnableC11084a(this));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo17894b() {
        Object b = this.f26658b.mo28318b(C9119ed.class);
        if (b == null) {
            C89219l.m154715b();
        }
        return ((Boolean) b).booleanValue();
    }

    /* renamed from: c */
    public final void mo17895c() {
        String str;
        Room room = (Room) this.f26658b.mo28318b(C9093de.class);
        if (room != null) {
            C89378p[] pVarArr = new C89378p[7];
            AbstractC6872f b = C11115u.m19743a().mo17915b();
            C89219l.m154716b(b, "");
            pVarArr[0] = C89387v.m154943a("target_uid", String.valueOf(b.mo13161c()));
            AbstractC6872f b2 = C11115u.m19743a().mo17915b();
            C89219l.m154716b(b2, "");
            AbstractC2994b a = b2.mo13147a();
            C89219l.m154716b(a, "");
            pVarArr[1] = C89387v.m154943a("sec_target_uid", a.getSecUid());
            pVarArr[2] = C89387v.m154943a("packed_level", "2");
            pVarArr[3] = C89387v.m154943a("request_from", "admin");
            pVarArr[4] = C89387v.m154943a("current_room_id", String.valueOf(room.getId()));
            User owner = room.getOwner();
            if (owner == null || (str = String.valueOf(owner.getId())) == null) {
                str = "";
            }
            pVarArr[5] = C89387v.m154943a("anchor_id", str);
            AbstractC6872f b3 = C11115u.m19743a().mo17915b();
            User owner2 = room.getOwner();
            C89219l.m154716b(owner2, "");
            pVarArr[6] = C89387v.m154943a("sec_anchor_id", b3.mo13153a(owner2.getId()));
            C11115u.m19743a().mo17915b().mo13148a(C89041ag.m154428c(pVarArr)).mo142918b(C88925a.m154180b(C88946a.f201991c)).mo142909a(C88391a.m153580a(C88392a.f200660a)).mo116431a_(this.f26660d);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.usermanage.h$e */
    public static final class C11088e implements AbstractC88406ae<AbstractC2994b> {

        /* renamed from: a */
        final /* synthetic */ C11078h f26667a;

        static {
            Covode.recordClassIndex(12709);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C11088e(C11078h hVar) {
            this.f26667a = hVar;
        }

        @Override // p4560f.p4561a.AbstractC88406ae
        public final void onSubscribe(AbstractC88412b bVar) {
            C89219l.m154721d(bVar, "");
            this.f26667a.f26659c.mo142945a(bVar);
        }

        @Override // p4560f.p4561a.AbstractC88406ae
        public final void onError(Throwable th) {
            C89219l.m154721d(th, "");
            if (!(th instanceof C2912a)) {
                th = null;
            }
            C2912a aVar = (C2912a) th;
            if (aVar != null) {
                this.f26667a.mo17890a(aVar);
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.AbstractC88406ae
        public final /* synthetic */ void onSuccess(AbstractC2994b bVar) {
            boolean z;
            AbstractC2994b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            if (this.f26667a.f26657a.isViewValid()) {
                User user = (User) bVar2;
                this.f26667a.mo17891a(user);
                C6805b<Boolean> bVar3 = AbstractC6804a.f16926ab;
                C89219l.m154716b(bVar3, "");
                boolean z2 = false;
                C6806c.m14603a((C6800c) bVar3, (Object) false);
                C9542az userAttr = user.getUserAttr();
                if (userAttr != null) {
                    DataChannel dataChannel = this.f26667a.f26658b;
                    boolean z3 = userAttr.f23191a;
                    if (userAttr.f23194d == -1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    dataChannel.mo28320c(C9131m.class, new C8448b(z3, z));
                }
                AbstractC2928f fVar = (AbstractC2928f) C6193a.m13435a(AbstractC2928f.class);
                if (userAttr != null && userAttr.f23191a) {
                    z2 = true;
                }
                fVar.setUserSilent(z2);
            }
        }
    }

    public final void onEvent(C7402s sVar) {
        this.f26658b.mo28315b(C9066ce.class, sVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.usermanage.h$d */
    public static final class DialogInterface$OnDismissListenerC11087d implements DialogInterface.OnDismissListener {

        /* renamed from: a */
        public static final DialogInterface$OnDismissListenerC11087d f26666a = new DialogInterface$OnDismissListenerC11087d();

        static {
            Covode.recordClassIndex(12708);
        }

        DialogInterface$OnDismissListenerC11087d() {
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            C6779a.m14563a().mo13053a(new C7400q(8));
        }
    }

    /* renamed from: a */
    public final void mo17891a(User user) {
        AbstractC6872f b;
        AbstractC2994b a;
        DataChannel dataChannel = this.f26658b;
        if (user != null) {
            dataChannel.mo28315b(C9101dm.class, user);
            if (user.getUserAttr() != null && (b = C11115u.m19743a().mo17915b()) != null && (a = b.mo13147a()) != null) {
                a.setUserAttr(user.getUserAttr());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo17892a(boolean z) {
        EnumC5847l.SHARE.setRedDotVisible(this.f26658b, z);
        C11115u.m19743a().mo17915b().mo13154a(z ? 1 : 0);
        User d = m19701d();
        if (d != null) {
            if (d.getUserAttr() == null) {
                d.setUserAttr(new C9542az());
            }
            C9542az userAttr = d.getUserAttr();
            C89219l.m154716b(userAttr, "");
            userAttr.f23192b = z;
            return;
        }
        mo17895c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo17893b(boolean z) {
        ((AbstractC2928f) C6193a.m13435a(AbstractC2928f.class)).setUserSilent(z);
        User d = m19701d();
        if (d != null) {
            if (d.getUserAttr() == null) {
                d.setUserAttr(new C9542az());
            }
            C9542az userAttr = d.getUserAttr();
            C89219l.m154716b(userAttr, "");
            userAttr.f23191a = z;
            JSONObject jSONObject = new JSONObject();
            C3866a.m9474a(jSONObject, "error_code", 0L);
            C3866a.m9475a(jSONObject, "error_msg", "is ban: ".concat(String.valueOf(z)));
            C3868c.m9492a("ttlive_audience_ban_talk", 0, jSONObject);
            return;
        }
        mo17895c();
    }

    /* renamed from: a */
    public final void mo17890a(C2912a aVar) {
        int errorCode = aVar.getErrorCode();
        if (errorCode == 30003) {
            C6779a.m14563a().mo13053a(new C7400q(10011, (byte) 0));
        } else if (errorCode != 30005) {
            if (errorCode != 30006) {
                switch (errorCode) {
                    case 50001:
                        this.f26658b.mo28320c(C9131m.class, new C8448b(true));
                        return;
                    case 50002:
                        C6779a.m14563a().mo13053a(new C7400q(10));
                        return;
                    default:
                        return;
                }
            } else if (!mo17894b()) {
                C6779a.m14563a().mo13053a(new C7400q(20));
            }
        } else if (this.f26657a.isViewValid()) {
            DialogC9148b.C9149a a = new DialogC9148b.C9149a(this.f26657a.getActivity()).mo15243a(R.string.grv).mo15248b(R.string.gm6).mo15244a(R.string.go1, (DialogInterface.OnClickListener) DialogInterface$OnClickListenerC11086c.f26665a, false);
            a.f22249f = DialogInterface$OnDismissListenerC11087d.f26666a;
            a.mo15247a().show();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.usermanage.h$c */
    public static final class DialogInterface$OnClickListenerC11086c implements DialogInterface.OnClickListener {

        /* renamed from: a */
        public static final DialogInterface$OnClickListenerC11086c f26665a = new DialogInterface$OnClickListenerC11086c();

        static {
            Covode.recordClassIndex(12707);
        }

        DialogInterface$OnClickListenerC11086c() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    public C11078h(C10935a aVar, DataChannel dataChannel, C88411a aVar2) {
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(dataChannel, "");
        C89219l.m154721d(aVar2, "");
        this.f26657a = aVar;
        this.f26658b = dataChannel;
        this.f26659c = aVar2;
        ((AbstractC11181z) C6779a.m14563a().mo13052a(C7402s.class).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143274a(C11152e.m19789a((Fragment) aVar))).mo17949a(new C11085b(new AbstractC89172b<C7402s, C89391z>(this) {
            /* class com.bytedance.android.livesdk.usermanage.C11078h.C110791 */

            static {
                Covode.recordClassIndex(12700);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(C7402s sVar) {
                C7402s sVar2 = sVar;
                C89219l.m154721d(sVar2, "");
                ((C11078h) this.receiver).onEvent(sVar2);
                return C89391z.f203057a;
            }
        }));
        dataChannel.mo28309a((AbstractC1204m) aVar, C9085cx.class, (AbstractC89172b) new AbstractC89172b<C2912a, C89391z>(this) {
            /* class com.bytedance.android.livesdk.usermanage.C11078h.C110802 */

            static {
                Covode.recordClassIndex(12701);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(C2912a aVar) {
                C2912a aVar2 = aVar;
                C89219l.m154721d(aVar2, "");
                ((C11078h) this.receiver).mo17890a(aVar2);
                return C89391z.f203057a;
            }
        }).mo28312a((Object) aVar, C9067cf.class, (AbstractC89172b) new AbstractC89172b<C9627ay, C89391z>(this) {
            /* class com.bytedance.android.livesdk.usermanage.C11078h.C110813 */

            static {
                Covode.recordClassIndex(12702);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(C9627ay ayVar) {
                C9627ay ayVar2 = ayVar;
                C89219l.m154721d(ayVar2, "");
                C11078h hVar = (C11078h) this.receiver;
                User user = ayVar2.f23444f;
                if (user != null) {
                    long id = user.getId();
                    AbstractC6872f b = C11115u.m19743a().mo17915b();
                    C89219l.m154716b(b, "");
                    if (id == b.mo13161c()) {
                        boolean z = false;
                        switch (ayVar2.f23446h) {
                            case 3:
                            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                                DataChannel dataChannel = hVar.f26658b;
                                Long l = ayVar2.f23461w;
                                if (l != null && l.longValue() == -1) {
                                    z = true;
                                }
                                dataChannel.mo28320c(C9131m.class, new C8448b(true, z));
                                hVar.mo17893b(true);
                                break;
                            case 4:
                            case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                                hVar.f26658b.mo28320c(C9131m.class, new C8448b(false));
                                hVar.mo17893b(false);
                                break;
                            case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                                hVar.mo17892a(true);
                                break;
                            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                                hVar.mo17892a(false);
                                break;
                            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                                C6779a.m14563a().mo13053a(new C7400q(11));
                                break;
                            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 11}*/:
                                if (!hVar.mo17894b()) {
                                    C6779a.m14563a().mo13053a(new C7400q(20));
                                    break;
                                }
                                break;
                        }
                    }
                }
                return C89391z.f203057a;
            }
        }).mo28309a((AbstractC1204m) aVar, C5791w.class, (AbstractC89172b) new AbstractC89172b<C89391z, C89391z>(this) {
            /* class com.bytedance.android.livesdk.usermanage.C11078h.C110824 */

            /* renamed from: a */
            final /* synthetic */ C11078h f26661a;

            static {
                Covode.recordClassIndex(12703);
            }

            {
                this.f26661a = r2;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(C89391z zVar) {
                C89219l.m154721d(zVar, "");
                this.f26661a.mo11967a();
                return C89391z.f203057a;
            }
        }).mo28312a((Object) aVar, C9066ce.class, (AbstractC89172b) new AbstractC89172b<C7402s, C89391z>(this) {
            /* class com.bytedance.android.livesdk.usermanage.C11078h.C110835 */

            /* renamed from: a */
            final /* synthetic */ C11078h f26662a;

            static {
                Covode.recordClassIndex(12704);
            }

            {
                this.f26662a = r2;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(C7402s sVar) {
                C7402s sVar2 = sVar;
                C89219l.m154721d(sVar2, "");
                if (sVar2.f18340a) {
                    this.f26662a.mo17895c();
                }
                return C89391z.f203057a;
            }
        });
    }
}
