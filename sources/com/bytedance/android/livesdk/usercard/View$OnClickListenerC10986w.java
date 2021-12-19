package com.bytedance.android.livesdk.usercard;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.DialogInterface$OnCancelListenerC0944d;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.adminsetting.AbstractC2915b;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.model.C3265j;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.p405s.AbstractC6095a;
import com.bytedance.android.live.p405s.AbstractC6101c;
import com.bytedance.android.live.p405s.AbstractC6103e;
import com.bytedance.android.live.p405s.AbstractC6105g;
import com.bytedance.android.live.p405s.p406a.C6098b;
import com.bytedance.android.live.p405s.p406a.C6099c;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.AbstractC11293v;
import com.bytedance.android.livesdk.model.C9542az;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p425aa.C6544e;
import com.bytedance.android.livesdk.p425aa.C6558k;
import com.bytedance.android.livesdk.p456as.AbstractC6872f;
import com.bytedance.android.livesdk.p458b.p459a.C6894d;
import com.bytedance.android.livesdk.p561j.C9052br;
import com.bytedance.android.livesdk.p561j.C9083cv;
import com.bytedance.android.livesdk.p561j.C9093de;
import com.bytedance.android.livesdk.p561j.C9119ed;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.model.C11838d;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.usercard.w */
public final class View$OnClickListenerC10986w extends AbstractC11293v implements View.OnClickListener, AbstractC6095a, AbstractC6101c, AbstractC6105g {

    /* renamed from: c */
    public static final C10987a f26452c = new C10987a((byte) 0);

    /* renamed from: a */
    public Room f26453a;

    /* renamed from: b */
    public User f26454b;

    /* renamed from: d */
    private boolean f26455d = true;

    /* renamed from: e */
    private HashMap f26456e;

    static {
        Covode.recordClassIndex(12601);
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: a */
    public final void mo8165a() {
        HashMap hashMap = this.f26456e;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.android.live.p405s.AbstractC6095a
    /* renamed from: a */
    public final void mo11956a(C6098b bVar, Exception exc) {
    }

    @Override // com.bytedance.android.live.p405s.AbstractC6101c
    /* renamed from: a */
    public final void mo11758a(C6099c cVar, Exception exc) {
    }

    @Override // com.bytedance.android.live.p405s.AbstractC6105g
    /* renamed from: a */
    public final void mo11759a(Exception exc) {
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: a_ */
    public final View mo8166a_(int i) {
        if (this.f26456e == null) {
            this.f26456e = new HashMap();
        }
        View view = (View) this.f26456e.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f26456e.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.bytedance.android.live.p405s.AbstractC6095a
    /* renamed from: b */
    public final void mo11958b(Exception exc) {
    }

    @Override // com.bytedance.android.live.p405s.AbstractC6101c
    /* renamed from: c */
    public final void mo11762c() {
    }

    @Override // com.bytedance.android.live.p405s.AbstractC6101c
    /* renamed from: k_ */
    public final void mo11763k_() {
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, com.bytedance.android.livesdk.AbstractC11293v, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo8165a();
    }

    /* renamed from: com.bytedance.android.livesdk.usercard.w$a */
    public static final class C10987a {
        static {
            Covode.recordClassIndex(12602);
        }

        private C10987a() {
        }

        public /* synthetic */ C10987a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: b */
    public final AbstractC11293v.C11295b mo8355b() {
        boolean z;
        int i;
        Bundle arguments = getArguments();
        if (arguments != null) {
            z = arguments.getBoolean("arg_msg_is_vertical");
        } else {
            z = true;
        }
        this.f26455d = z;
        if (this.f26455d) {
            i = R.layout.b6v;
        } else {
            i = R.layout.b6w;
        }
        AbstractC11293v.C11295b bVar = new AbstractC11293v.C11295b(i);
        bVar.f27014a = 0;
        if (this.f26455d) {
            bVar.f27020g = 80;
            bVar.f27021h = -1;
            bVar.f27022i = -2;
            bVar.f27015b = R.style.a2e;
        } else {
            bVar.f27020g = 5;
            bVar.f27021h = C3966y.m9667d(R.dimen.wl);
            bVar.f27022i = -1;
            bVar.f27015b = R.style.a2f;
        }
        return bVar;
    }

    /* renamed from: com.bytedance.android.livesdk.usercard.w$c */
    static final class C10989c extends AbstractC89220m implements AbstractC89172b<C89391z, C89391z> {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC10986w f26458a;

        static {
            Covode.recordClassIndex(12604);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10989c(View$OnClickListenerC10986w wVar) {
            super(1);
            this.f26458a = wVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C89391z zVar) {
            C89219l.m154721d(zVar, "");
            this.f26458a.dismiss();
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ User m19619a(View$OnClickListenerC10986w wVar) {
        User user = wVar.f26454b;
        if (user == null) {
            C89219l.m154710a("mUser");
        }
        return user;
    }

    /* renamed from: b */
    public static final /* synthetic */ Room m19620b(View$OnClickListenerC10986w wVar) {
        Room room = wVar.f26453a;
        if (room == null) {
            C89219l.m154710a("mRoom");
        }
        return room;
    }

    /* renamed from: com.bytedance.android.livesdk.usercard.w$b */
    static final class C10988b extends AbstractC89220m implements AbstractC89172b<C3265j, C89391z> {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC10986w f26457a;

        static {
            Covode.recordClassIndex(12603);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10988b(View$OnClickListenerC10986w wVar) {
            super(1);
            this.f26457a = wVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C3265j jVar) {
            C3265j jVar2 = jVar;
            C89219l.m154721d(jVar2, "");
            ((AbstractC6103e) C6193a.m13435a(AbstractC6103e.class)).muteUser(View$OnClickListenerC10986w.m19619a(this.f26457a), View$OnClickListenerC10986w.m19620b(this.f26457a).getId(), jVar2, this.f26457a);
            ((AbstractC6103e) C6193a.m13435a(AbstractC6103e.class)).getMuteDuration().mo142929d(new C10991e(this.f26457a, jVar2));
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.android.live.p405s.AbstractC6105g
    /* renamed from: a */
    public final void mo11761a(boolean z) {
        int i;
        if (this.f27009o) {
            LiveTextView liveTextView = (LiveTextView) mo8166a_(R.id.cov);
            if (z) {
                i = R.string.gpw;
            } else {
                i = R.string.gpx;
            }
            liveTextView.setText(i);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.usercard.w$d */
    static final class C10990d<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC10986w f26459a;

        /* renamed from: b */
        final /* synthetic */ Room f26460b;

        /* renamed from: c */
        final /* synthetic */ boolean f26461c;

        static {
            Covode.recordClassIndex(12605);
        }

        C10990d(View$OnClickListenerC10986w wVar, Room room, boolean z) {
            this.f26459a = wVar;
            this.f26460b = room;
            this.f26461c = z;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            String str;
            String str2;
            C3265j jVar = (C3265j) obj;
            AbstractC6872f b = C11115u.m19743a().mo17915b();
            if (b == null || b.mo13161c() != this.f26460b.getOwnerUserId()) {
                str = "admin";
            } else {
                str = "anchor";
            }
            C6501b a = C6501b.C6502a.m13948a("livesdk_mute_click").mo12643a(this.f26459a.f27010p).mo12646a("default_mute_set", jVar.f9352a).mo12651a("to_user_id", String.valueOf(View$OnClickListenerC10986w.m19619a(this.f26459a).getId())).mo12651a("entry_point", "profile_card").mo12646a("anchor_id", this.f26460b.getOwnerUserId()).mo12646a("room_id", this.f26460b.getId()).mo12651a("admin_type", str);
            if (this.f26461c) {
                str2 = "set";
            } else {
                str2 = "cancel";
            }
            a.mo12651a("action_type", str2).mo12655b();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.usercard.w$e */
    static final class C10991e<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC10986w f26462a;

        /* renamed from: b */
        final /* synthetic */ C3265j f26463b;

        static {
            Covode.recordClassIndex(12606);
        }

        C10991e(View$OnClickListenerC10986w wVar, C3265j jVar) {
            this.f26462a = wVar;
            this.f26463b = jVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            String str;
            C3265j jVar = (C3265j) obj;
            AbstractC6872f b = C11115u.m19743a().mo17915b();
            if (b == null || b.mo13161c() != View$OnClickListenerC10986w.m19620b(this.f26462a).getOwnerUserId()) {
                str = "admin";
            } else {
                str = "anchor";
            }
            C6501b.C6502a.m13948a("livesdk_mute_set").mo12643a(this.f26462a.f27010p).mo12651a("admin_type", str).mo12646a("default_mute_set", jVar.f9352a).mo12646a("mute_duration", this.f26463b.f9352a).mo12651a("to_user_id", String.valueOf(View$OnClickListenerC10986w.m19619a(this.f26462a).getId())).mo12651a("entry_point", "profile_card").mo12646a("anchor_id", View$OnClickListenerC10986w.m19620b(this.f26462a).getOwnerUserId()).mo12646a("room_id", View$OnClickListenerC10986w.m19620b(this.f26462a).getId()).mo12655b();
        }
    }

    public final void onClick(View view) {
        String str;
        boolean z;
        long j;
        C11838d dVar;
        C89219l.m154721d(view, "");
        String a = C6544e.m13987a();
        String d = C6544e.m13990d();
        int id = view.getId();
        if (id == R.id.dii) {
            boolean z2 = C6894d.m14753a().f17266k;
            Room room = this.f26453a;
            if (room == null) {
                C89219l.m154710a("mRoom");
            }
            long ownerUserId = room.getOwnerUserId();
            User user = this.f26454b;
            if (user == null) {
                C89219l.m154710a("mUser");
            }
            if (ownerUserId == user.getId() || z2) {
                Room room2 = this.f26453a;
                if (room2 == null) {
                    C89219l.m154710a("mRoom");
                }
                long id2 = room2.getId();
                Room room3 = this.f26453a;
                if (room3 == null) {
                    C89219l.m154710a("mRoom");
                }
                long ownerUserId2 = room3.getOwnerUserId();
                User user2 = this.f26454b;
                if (user2 == null) {
                    C89219l.m154710a("mUser");
                }
                long id3 = user2.getId();
                User user3 = this.f26454b;
                if (user3 == null) {
                    C89219l.m154710a("mUser");
                }
                String secUid = user3.getSecUid();
                String e = C6544e.m13991e();
                Room room4 = this.f26453a;
                if (room4 == null) {
                    C89219l.m154710a("mRoom");
                }
                dVar = new C11838d(id2, ownerUserId2, id3, secUid, "anchor_profile", a, d, e, "report_anchor", room4.getRequestId());
            } else {
                Room room5 = this.f26453a;
                if (room5 == null) {
                    C89219l.m154710a("mRoom");
                }
                long id4 = room5.getId();
                Room room6 = this.f26453a;
                if (room6 == null) {
                    C89219l.m154710a("mRoom");
                }
                long ownerUserId3 = room6.getOwnerUserId();
                User user4 = this.f26454b;
                if (user4 == null) {
                    C89219l.m154710a("mUser");
                }
                long id5 = user4.getId();
                User user5 = this.f26454b;
                if (user5 == null) {
                    C89219l.m154710a("mUser");
                }
                String secUid2 = user5.getSecUid();
                Room room7 = this.f26453a;
                if (room7 == null) {
                    C89219l.m154710a("mRoom");
                }
                dVar = new C11838d(id4, ownerUserId3, id5, secUid2, "user_profile", a, d, "click", "report_user", room7.getRequestId());
            }
            dVar.f28220s = ((AbstractC6103e) C6193a.m13435a(AbstractC6103e.class)).getReportScene();
            dVar.f28219r = z2;
            dVar.f28214m = this.f26455d;
            ((AbstractC6103e) C6193a.m13435a(AbstractC6103e.class)).report(getContext(), dVar);
            dismiss();
            return;
        }
        boolean z3 = false;
        if (id == R.id.cia) {
            dismiss();
            User user6 = this.f26454b;
            if (user6 == null) {
                C89219l.m154710a("mUser");
            }
            C9542az userAttr = user6.getUserAttr();
            if (userAttr == null || !userAttr.f23192b) {
                z = true;
            } else {
                z = false;
            }
            AbstractC6103e eVar = (AbstractC6103e) C6193a.m13435a(AbstractC6103e.class);
            User user7 = this.f26454b;
            if (user7 == null) {
                C89219l.m154710a("mUser");
            }
            Room room8 = this.f26453a;
            if (room8 == null) {
                C89219l.m154710a("mRoom");
            }
            User owner = room8.getOwner();
            if (owner != null) {
                j = owner.getId();
            } else {
                j = 0;
            }
            Room room9 = this.f26453a;
            if (room9 == null) {
                C89219l.m154710a("mRoom");
            }
            eVar.updateAdmin(this, z, user7, j, room9.getId(), "profile_card");
        } else if (id == R.id.c29) {
            dismiss();
            AbstractC6103e eVar2 = (AbstractC6103e) C6193a.m13435a(AbstractC6103e.class);
            Context context = getContext();
            Room room10 = this.f26453a;
            if (room10 == null) {
                C89219l.m154710a("mRoom");
            }
            long id6 = room10.getId();
            Room room11 = this.f26453a;
            if (room11 == null) {
                C89219l.m154710a("mRoom");
            }
            long ownerUserId4 = room11.getOwnerUserId();
            User user8 = this.f26454b;
            if (user8 == null) {
                C89219l.m154710a("mUser");
            }
            Dialog ensureKickOutDialog = eVar2.getEnsureKickOutDialog(context, id6, ownerUserId4, user8.getId(), null);
            if (ensureKickOutDialog != null) {
                ensureKickOutDialog.show();
            }
            Room room12 = this.f26453a;
            if (room12 == null) {
                C89219l.m154710a("mRoom");
            }
            C6501b a2 = C6501b.C6502a.m13948a("blocked_list_click").mo12639a();
            User user9 = this.f26454b;
            if (user9 == null) {
                C89219l.m154710a("mUser");
            }
            C6501b a3 = a2.mo12651a("user_id", String.valueOf(user9.getId()));
            AbstractC6872f b = C11115u.m19743a().mo17915b();
            if (b == null || b.mo13161c() != room12.getOwnerUserId()) {
                str = "admin";
            } else {
                str = "anchor";
            }
            a3.mo12651a("admin_type", str).mo12654b("relation").mo12656c("click").mo12655b();
        } else if (id == R.id.cov) {
            dismiss();
            User user10 = this.f26454b;
            if (user10 == null) {
                C89219l.m154710a("mUser");
            }
            C9542az userAttr2 = user10.getUserAttr();
            if (userAttr2 == null || !userAttr2.f23191a) {
                z3 = true;
                Context context2 = getContext();
                if (!(context2 instanceof ActivityC0945e)) {
                    context2 = null;
                }
                ActivityC0945e eVar3 = (ActivityC0945e) context2;
                if (eVar3 != null) {
                    AbstractC0952i supportFragmentManager = eVar3.getSupportFragmentManager();
                    DialogInterface$OnCancelListenerC0944d muteConfirmDialog = ((AbstractC2915b) C6193a.m13435a(AbstractC2915b.class)).getMuteConfirmDialog(new C10988b(this));
                    if (muteConfirmDialog != null) {
                        muteConfirmDialog.show(supportFragmentManager, getClass().getSimpleName());
                    }
                }
            } else {
                AbstractC6103e eVar4 = (AbstractC6103e) C6193a.m13435a(AbstractC6103e.class);
                User user11 = this.f26454b;
                if (user11 == null) {
                    C89219l.m154710a("mUser");
                }
                Room room13 = this.f26453a;
                if (room13 == null) {
                    C89219l.m154710a("mRoom");
                }
                eVar4.unmuteUser(user11, room13.getId(), this);
            }
            Room room14 = this.f26453a;
            if (room14 == null) {
                C89219l.m154710a("mRoom");
            }
            ((AbstractC6103e) C6193a.m13435a(AbstractC6103e.class)).getMuteDuration().mo142929d(new C10990d(this, room14, z3));
        } else if (id == R.id.a0w) {
            dismiss();
            C6558k.m14024a(getContext());
        }
    }

    @Override // com.bytedance.android.live.p405s.AbstractC6095a
    /* renamed from: a */
    public final void mo11957a(boolean z, long j) {
        LiveTextView liveTextView;
        int i;
        User user = this.f26454b;
        if (user == null) {
            C89219l.m154710a("mUser");
        }
        if (user.getUserAttr() == null) {
            User user2 = this.f26454b;
            if (user2 == null) {
                C89219l.m154710a("mUser");
            }
            user2.setUserAttr(new C9542az());
        }
        User user3 = this.f26454b;
        if (user3 == null) {
            C89219l.m154710a("mUser");
        }
        C9542az userAttr = user3.getUserAttr();
        C89219l.m154716b(userAttr, "");
        userAttr.f23192b = z;
        if (this.f27009o && (liveTextView = (LiveTextView) mo8166a_(R.id.cia)) != null) {
            if (z) {
                i = R.string.e_d;
            } else {
                i = R.string.e_c;
            }
            liveTextView.setText(i);
        }
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Room room;
        User user;
        Boolean bool;
        LiveTextView liveTextView;
        int i;
        int i2;
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        DataChannel dataChannel = this.f27010p;
        if (dataChannel != null && (room = (Room) dataChannel.mo28318b(C9093de.class)) != null) {
            this.f26453a = room;
            DataChannel dataChannel2 = this.f27010p;
            if (dataChannel2 != null && (user = (User) dataChannel2.mo28318b(C9083cv.class)) != null) {
                this.f26454b = user;
                LiveTextView liveTextView2 = (LiveTextView) mo8166a_(R.id.a0w);
                if (liveTextView2 != null) {
                    liveTextView2.setOnClickListener(this);
                }
                ((LiveTextView) mo8166a_(R.id.dii)).setOnClickListener(this);
                ((LiveTextView) mo8166a_(R.id.cov)).setOnClickListener(this);
                LiveTextView liveTextView3 = (LiveTextView) mo8166a_(R.id.c29);
                if (liveTextView3 != null) {
                    liveTextView3.setOnClickListener(this);
                }
                LiveTextView liveTextView4 = (LiveTextView) mo8166a_(R.id.cia);
                if (liveTextView4 != null) {
                    liveTextView4.setOnClickListener(this);
                }
                User user2 = this.f26454b;
                if (user2 == null) {
                    C89219l.m154710a("mUser");
                }
                C9542az userAttr = user2.getUserAttr();
                if (userAttr != null) {
                    LiveTextView liveTextView5 = (LiveTextView) mo8166a_(R.id.cia);
                    if (liveTextView5 != null) {
                        if (userAttr.f23192b) {
                            i2 = R.string.e_d;
                        } else {
                            i2 = R.string.e_c;
                        }
                        liveTextView5.setText(i2);
                    }
                    LiveTextView liveTextView6 = (LiveTextView) mo8166a_(R.id.cov);
                    if (userAttr.f23191a) {
                        i = R.string.gpw;
                    } else {
                        i = R.string.gpx;
                    }
                    liveTextView6.setText(i);
                }
                DataChannel dataChannel3 = this.f27010p;
                if (dataChannel3 != null) {
                    bool = (Boolean) dataChannel3.mo28318b(C9119ed.class);
                } else {
                    bool = null;
                }
                if (C11279p.m20012a(bool) && (liveTextView = (LiveTextView) mo8166a_(R.id.cia)) != null) {
                    C11279p.m20017b(liveTextView);
                }
                DataChannel dataChannel4 = this.f27010p;
                if (dataChannel4 != null) {
                    dataChannel4.mo28309a((AbstractC1204m) this, C9052br.class, (AbstractC89172b) new C10989c(this));
                }
            }
        }
    }
}
