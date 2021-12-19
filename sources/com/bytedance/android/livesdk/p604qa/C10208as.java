package com.bytedance.android.livesdk.p604qa;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.DialogInterface$OnCancelListenerC0944d;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.adminsetting.AbstractC2915b;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.api.C3018a;
import com.bytedance.android.live.broadcast.model.C3265j;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.network.C5805e;
import com.bytedance.android.live.p172a.p173a.p175b.C2912a;
import com.bytedance.android.live.p405s.AbstractC6101c;
import com.bytedance.android.live.p405s.AbstractC6103e;
import com.bytedance.android.live.p405s.AbstractC6104f;
import com.bytedance.android.live.p405s.AbstractC6105g;
import com.bytedance.android.live.p405s.p406a.C6099c;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.AbstractC11293v;
import com.bytedance.android.livesdk.model.C9542az;
import com.bytedance.android.livesdk.model.message.C9676bi;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p425aa.C6544e;
import com.bytedance.android.livesdk.p430ab.C6581g;
import com.bytedance.android.livesdk.p456as.AbstractC6872f;
import com.bytedance.android.livesdk.p561j.C9093de;
import com.bytedance.android.livesdk.p561j.C9101dm;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdk.util.rxutils.C11191f;
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

/* renamed from: com.bytedance.android.livesdk.qa.as */
public final class C10208as extends AbstractC11293v implements AbstractC6101c, AbstractC6105g {

    /* renamed from: a */
    public C10188af f24721a;

    /* renamed from: b */
    public User f24722b;

    /* renamed from: c */
    public C9676bi f24723c;

    /* renamed from: d */
    public Room f24724d;

    /* renamed from: e */
    public String f24725e = "";

    /* renamed from: f */
    private HashMap f24726f;

    static {
        Covode.recordClassIndex(11774);
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: a */
    public final void mo8165a() {
        HashMap hashMap = this.f24726f;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.android.live.p405s.AbstractC6101c
    /* renamed from: a */
    public final void mo11758a(C6099c cVar, Exception exc) {
    }

    @Override // com.bytedance.android.live.p405s.AbstractC6105g
    /* renamed from: a */
    public final void mo11759a(Exception exc) {
    }

    @Override // com.bytedance.android.live.p405s.AbstractC6105g
    /* renamed from: a */
    public final void mo11761a(boolean z) {
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: a_ */
    public final View mo8166a_(int i) {
        if (this.f24726f == null) {
            this.f24726f = new HashMap();
        }
        View view = (View) this.f24726f.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f24726f.put(Integer.valueOf(i), findViewById);
        return findViewById;
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

    /* renamed from: com.bytedance.android.livesdk.qa.as$a */
    public static final class C10209a implements AbstractC6104f {

        /* renamed from: a */
        final /* synthetic */ Room f24727a;

        /* renamed from: b */
        final /* synthetic */ C10208as f24728b;

        static {
            Covode.recordClassIndex(11775);
        }

        @Override // com.bytedance.android.live.p405s.AbstractC6104f
        /* renamed from: a */
        public final void mo11984a() {
            this.f24728b.mo17030b(false);
        }

        C10209a(Room room, C10208as asVar) {
            this.f24727a = room;
            this.f24728b = asVar;
        }
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: b */
    public final AbstractC11293v.C11295b mo8355b() {
        AbstractC11293v.C11295b bVar = new AbstractC11293v.C11295b(R.layout.b57);
        bVar.f27014a = 0;
        bVar.f27015b = R.style.a2c;
        bVar.f27020g = 80;
        bVar.f27022i = -2;
        return bVar;
    }

    /* renamed from: com.bytedance.android.livesdk.qa.as$h */
    static final class View$OnClickListenerC10217h implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C10208as f24741a;

        static {
            Covode.recordClassIndex(11783);
        }

        View$OnClickListenerC10217h(C10208as asVar) {
            this.f24741a = asVar;
        }

        public final void onClick(View view) {
            this.f24741a.dismiss();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.qa.as$c */
    static final class C10212c extends AbstractC89220m implements AbstractC89172b<C89391z, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C10208as f24736a;

        static {
            Covode.recordClassIndex(11778);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10212c(C10208as asVar) {
            super(1);
            this.f24736a = asVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C89391z zVar) {
            C89219l.m154721d(zVar, "");
            this.f24736a.dismiss();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.qa.as$d */
    static final class View$OnClickListenerC10213d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C10208as f24737a;

        static {
            Covode.recordClassIndex(11779);
        }

        View$OnClickListenerC10213d(C10208as asVar) {
            this.f24737a = asVar;
        }

        public final void onClick(View view) {
            C6501b.C6502a.m13948a("livesdk_anchor_qa_more_click_module").mo12651a("action_type", "report_question").mo12655b();
            this.f24737a.mo17030b(false);
            this.f24737a.dismiss();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.qa.as$j */
    public static final class C10219j<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C10219j f24744a = new C10219j();

        static {
            Covode.recordClassIndex(11785);
        }

        C10219j() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            String prompt;
            Throwable th = (Throwable) obj;
            if (!(th instanceof C2912a)) {
                th = null;
            }
            C2912a aVar = (C2912a) th;
            if (aVar != null && (prompt = aVar.getPrompt()) != null && prompt.length() > 0) {
                C11279p.m20010a(prompt);
            }
        }
    }

    /* renamed from: b */
    public final void mo17030b(boolean z) {
        C9676bi biVar = this.f24723c;
        if (biVar != null) {
            ((QAApi) C5805e.m12718a().mo11572a(QAApi.class)).deleteQuestion(biVar.f23546a).mo143271a(new C11191f()).mo143254a(new C10218i(this, z), C10219j.f24744a);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.qa.as$f */
    static final class View$OnClickListenerC10215f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C10208as f24739a;

        static {
            Covode.recordClassIndex(11781);
        }

        View$OnClickListenerC10215f(C10208as asVar) {
            this.f24739a = asVar;
        }

        public final void onClick(View view) {
            boolean z;
            User user;
            C9542az userAttr;
            C10208as asVar = this.f24739a;
            C6501b.C6502a.m13948a("livesdk_anchor_qa_more_click_module").mo12651a("action_type", "mute_account").mo12655b();
            C9676bi biVar = asVar.f24723c;
            if (biVar == null || (user = biVar.f23550e) == null || (userAttr = user.getUserAttr()) == null || !userAttr.f23191a) {
                z = true;
            } else {
                z = false;
            }
            Room room = asVar.f24724d;
            if (room != null) {
                long id = room.getId();
                User user2 = asVar.f24722b;
                if (user2 != null) {
                    ((AbstractC6103e) C6193a.m13435a(AbstractC6103e.class)).getMuteDuration().mo142929d(new C10210b(user2, id, asVar, z));
                }
            }
            this.f24739a.dismiss();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.qa.as$g */
    static final class View$OnClickListenerC10216g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C10208as f24740a;

        static {
            Covode.recordClassIndex(11782);
        }

        View$OnClickListenerC10216g(C10208as asVar) {
            this.f24740a = asVar;
        }

        public final void onClick(View view) {
            User user;
            Dialog ensureKickOutDialog;
            C10208as asVar = this.f24740a;
            C6501b.C6502a.m13948a("livesdk_anchor_qa_more_click_module").mo12651a("action_type", "block_account").mo12655b();
            asVar.dismiss();
            Room room = asVar.f24724d;
            if (!(room == null || (user = asVar.f24722b) == null || (ensureKickOutDialog = ((AbstractC6103e) C6193a.m13435a(AbstractC6103e.class)).getEnsureKickOutDialog(asVar.getContext(), room.getId(), room.getOwnerUserId(), user.getId(), new C10209a(room, asVar))) == null)) {
                ensureKickOutDialog.show();
            }
            this.f24740a.dismiss();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.qa.as$i */
    public static final class C10218i<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C10208as f24742a;

        /* renamed from: b */
        final /* synthetic */ boolean f24743b;

        static {
            Covode.recordClassIndex(11784);
        }

        C10218i(C10208as asVar, boolean z) {
            this.f24742a = asVar;
            this.f24743b = z;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            long j;
            User user;
            if (this.f24743b) {
                DataChannel dataChannel = this.f24742a.f27010p;
                if (dataChannel != null) {
                    C9676bi biVar = this.f24742a.f24723c;
                    if (biVar == null || (user = biVar.f23550e) == null) {
                        j = -1;
                    } else {
                        j = user.getId();
                    }
                    dataChannel.mo28320c(C10177ac.class, Long.valueOf(j));
                    return;
                }
                return;
            }
            DataChannel dataChannel2 = this.f24742a.f27010p;
            if (dataChannel2 != null) {
                C10188af afVar = this.f24742a.f24721a;
                if (afVar == null) {
                    C9676bi biVar2 = this.f24742a.f24723c;
                    if (biVar2 == null) {
                        C89219l.m154715b();
                    }
                    afVar = new C10188af(biVar2, 6);
                }
                dataChannel2.mo28315b(C10203an.class, afVar);
            }
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, com.bytedance.android.livesdk.AbstractC11293v, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Room room;
        String str;
        C9676bi biVar;
        C9676bi biVar2;
        C10188af afVar;
        super.onCreate(bundle);
        DataChannel dataChannel = this.f27010p;
        User user = null;
        if (dataChannel != null) {
            room = (Room) dataChannel.mo28318b(C9093de.class);
        } else {
            room = null;
        }
        this.f24724d = room;
        DataChannel dataChannel2 = this.f27010p;
        if (dataChannel2 == null || (str = (String) dataChannel2.mo28318b(C10225au.class)) == null) {
            str = "";
        }
        this.f24725e = str;
        if (C89219l.m154714a((Object) "qa_board", (Object) str)) {
            DataChannel dataChannel3 = this.f27010p;
            if (dataChannel3 != null) {
                afVar = (C10188af) dataChannel3.mo28318b(C10189ag.class);
            } else {
                afVar = null;
            }
            this.f24721a = afVar;
        }
        C10188af afVar2 = this.f24721a;
        if (afVar2 != null) {
            biVar = afVar2.f24694a;
        } else {
            biVar = null;
        }
        this.f24723c = biVar;
        if (biVar == null) {
            DataChannel dataChannel4 = this.f27010p;
            if (dataChannel4 != null) {
                biVar2 = (C9676bi) dataChannel4.mo28318b(C10178ad.class);
            } else {
                biVar2 = null;
            }
            this.f24723c = biVar2;
        }
        C9676bi biVar3 = this.f24723c;
        if (biVar3 != null) {
            user = biVar3.f23550e;
        }
        this.f24722b = user;
        DataChannel dataChannel5 = this.f27010p;
        if (dataChannel5 != null) {
            dataChannel5.mo28309a((AbstractC1204m) this, C3018a.class, (AbstractC89172b) new C10212c(this));
        }
    }

    /* renamed from: com.bytedance.android.livesdk.qa.as$e */
    static final class View$OnClickListenerC10214e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C10208as f24738a;

        static {
            Covode.recordClassIndex(11780);
        }

        View$OnClickListenerC10214e(C10208as asVar) {
            this.f24738a = asVar;
        }

        public final void onClick(View view) {
            C9676bi biVar;
            C10208as asVar = this.f24738a;
            C6501b.C6502a.m13948a("livesdk_anchor_qa_more_click_module").mo12651a("action_type", "report_question").mo12655b();
            String a = C6544e.m13987a();
            String d = C6544e.m13990d();
            Room room = asVar.f24724d;
            if (!(room == null || (biVar = asVar.f24723c) == null)) {
                long id = room.getId();
                long ownerUserId = room.getOwnerUserId();
                User user = biVar.f23550e;
                C89219l.m154716b(user, "");
                long id2 = user.getId();
                User user2 = biVar.f23550e;
                C89219l.m154716b(user2, "");
                C11838d dVar = new C11838d(id, ownerUserId, id2, user2.getSecUid(), asVar.f24725e, biVar.f23546a, biVar.f23547b, room.getRequestId(), a, d, "report_question", "3");
                dVar.f28220s = ((AbstractC6103e) C6193a.m13435a(AbstractC6103e.class)).getReportScene();
                if (C89219l.m154714a((Object) dVar.f28209h, (Object) "qa_board")) {
                    double b = (double) C3966y.m9662b();
                    Double.isNaN(b);
                    dVar.f28206e = (int) C3966y.m9668e((int) (b * 0.73d));
                }
                ((AbstractC6103e) C6193a.m13435a(AbstractC6103e.class)).report(asVar.getContext(), dVar);
            }
            this.f24738a.mo17030b(false);
            this.f24738a.dismiss();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.qa.as$b */
    static final class C10210b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ User f24729a;

        /* renamed from: b */
        final /* synthetic */ long f24730b;

        /* renamed from: c */
        final /* synthetic */ C10208as f24731c;

        /* renamed from: d */
        final /* synthetic */ boolean f24732d;

        static {
            Covode.recordClassIndex(11776);
        }

        C10210b(User user, long j, C10208as asVar, boolean z) {
            this.f24729a = user;
            this.f24730b = j;
            this.f24731c = asVar;
            this.f24732d = z;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Long l;
            Long l2;
            final String str;
            Long l3;
            Long l4;
            String str2;
            final C3265j jVar = (C3265j) obj;
            AbstractC6872f b = C11115u.m19743a().mo17915b();
            String str3 = null;
            if (b != null) {
                l = Long.valueOf(b.mo13161c());
            } else {
                l = null;
            }
            Room room = this.f24731c.f24724d;
            if (room != null) {
                l2 = Long.valueOf(room.getOwnerUserId());
            } else {
                l2 = null;
            }
            if (C89219l.m154714a(l, l2)) {
                str = "anchor";
            } else {
                str = "admin";
            }
            if (C89219l.m154714a((Object) this.f24731c.f24725e, (Object) "qa_board")) {
                C6501b a = C6501b.C6502a.m13948a("livesdk_mute_click").mo12643a(this.f24731c.f27010p).mo12646a("default_mute_set", jVar.f9352a);
                User user = this.f24731c.f24722b;
                if (user != null) {
                    l3 = Long.valueOf(user.getId());
                } else {
                    l3 = null;
                }
                C6501b a2 = a.mo12651a("to_user_id", String.valueOf(l3)).mo12651a("entry_point", "QnA");
                Room room2 = this.f24731c.f24724d;
                if (room2 != null) {
                    l4 = Long.valueOf(room2.getOwnerUserId());
                } else {
                    l4 = null;
                }
                C6501b a3 = a2.mo12650a("anchor_id", (Number) l4);
                Room room3 = this.f24731c.f24724d;
                if (room3 != null) {
                    str3 = String.valueOf(room3.getId());
                }
                C6501b a4 = a3.mo12651a("room_id", str3).mo12651a("admin_type", str);
                if (this.f24732d) {
                    str2 = "set";
                } else {
                    str2 = "cancel";
                }
                a4.mo12651a("action_type", str2).mo12655b();
            }
            if (!this.f24732d) {
                ((AbstractC6103e) C6193a.m13435a(AbstractC6103e.class)).unmuteUser(this.f24729a, this.f24730b, this.f24731c);
            } else if (C89219l.m154714a((Object) this.f24731c.f24725e, (Object) "qa_board")) {
                DialogInterface$OnCancelListenerC0944d muteConfirmDialog = ((AbstractC2915b) C6193a.m13435a(AbstractC2915b.class)).getMuteConfirmDialog(new AbstractC89172b<C3265j, C89391z>(this) {
                    /* class com.bytedance.android.livesdk.p604qa.C10208as.C10210b.C102111 */

                    /* renamed from: a */
                    final /* synthetic */ C10210b f24733a;

                    static {
                        Covode.recordClassIndex(11777);
                    }

                    {
                        this.f24733a = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // p4600h.p4611f.p4612a.AbstractC89172b
                    public final /* synthetic */ C89391z invoke(C3265j jVar) {
                        Long l;
                        C3265j jVar2 = jVar;
                        C89219l.m154721d(jVar2, "");
                        ((AbstractC6103e) C6193a.m13435a(AbstractC6103e.class)).muteUser(this.f24733a.f24729a, this.f24733a.f24730b, jVar2, this.f24733a.f24731c);
                        this.f24733a.f24731c.mo17030b(true);
                        C6501b a = C6501b.C6502a.m13948a("livesdk_mute_set").mo12643a(this.f24733a.f24731c.f27010p).mo12651a("admin_type", str).mo12646a("default_mute_set", jVar.f9352a).mo12646a("mute_duration", jVar2.f9352a).mo12651a("to_user_id", String.valueOf(this.f24733a.f24729a.getId())).mo12651a("entry_point", "QnA");
                        Room room = this.f24733a.f24731c.f24724d;
                        String str = null;
                        if (room != null) {
                            l = Long.valueOf(room.getOwnerUserId());
                        } else {
                            l = null;
                        }
                        C6501b a2 = a.mo12650a("anchor_id", (Number) l);
                        Room room2 = this.f24733a.f24731c.f24724d;
                        if (room2 != null) {
                            str = String.valueOf(room2.getId());
                        }
                        a2.mo12651a("room_id", str).mo12655b();
                        return C89391z.f203057a;
                    }
                });
                if (muteConfirmDialog != null) {
                    muteConfirmDialog.show(this.f24731c.getFragmentManager(), "ReportQuestionAnchorDialog");
                }
            } else {
                User user2 = this.f24729a;
                long j = this.f24730b;
                C89219l.m154716b(jVar, "");
                ((AbstractC6103e) C6193a.m13435a(AbstractC6103e.class)).muteUser(user2, j, jVar, this.f24731c);
                this.f24731c.mo17030b(true);
            }
        }
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        User user;
        Boolean bool;
        Boolean bool2;
        Long l;
        C9542az userAttr;
        C9542az userAttr2;
        String a;
        C9542az userAttr3;
        Boolean bool3;
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        DataChannel dataChannel = this.f27010p;
        if (dataChannel == null || (bool3 = (Boolean) dataChannel.mo28318b(C10204ao.class)) == null) {
            z = false;
        } else {
            z = bool3.booleanValue();
        }
        if (z) {
            ((LiveTextView) mo8166a_(R.id.dhq)).setOnClickListener(new View$OnClickListenerC10213d(this));
        } else {
            LiveTextView liveTextView = (LiveTextView) mo8166a_(R.id.dhq);
            C89219l.m154716b(liveTextView, "");
            liveTextView.setVisibility(8);
        }
        String a2 = C6581g.m14075a(this.f24722b);
        LiveTextView liveTextView2 = (LiveTextView) mo8166a_(R.id.cp0);
        if (liveTextView2 != null) {
            User user2 = this.f24722b;
            if (user2 == null || (userAttr3 = user2.getUserAttr()) == null || !userAttr3.f23191a) {
                a = C3966y.m9660a((int) R.string.e_f, a2);
            } else {
                a = C3966y.m9660a((int) R.string.e_r, a2);
            }
            liveTextView2.setText(a);
        }
        LiveTextView liveTextView3 = (LiveTextView) mo8166a_(R.id.t4);
        if (liveTextView3 != null) {
            liveTextView3.setText(C3966y.m9660a((int) R.string.e__, a2));
        }
        DataChannel dataChannel2 = this.f27010p;
        Long l2 = null;
        if (dataChannel2 != null) {
            user = (User) dataChannel2.mo28318b(C9101dm.class);
            if (!(user == null || (userAttr2 = user.getUserAttr()) == null)) {
                bool = Boolean.valueOf(userAttr2.f23192b);
            }
            bool = null;
        } else {
            user = null;
            bool = null;
        }
        if (C11279p.m20012a(bool)) {
            User user3 = this.f24722b;
            if (user3 == null || (userAttr = user3.getUserAttr()) == null) {
                bool2 = null;
            } else {
                bool2 = Boolean.valueOf(userAttr.f23192b);
            }
            if (C11279p.m20012a(bool2)) {
                C11279p.m20006a(mo8166a_(R.id.cp0));
                C11279p.m20006a(mo8166a_(R.id.t4));
                User user4 = this.f24722b;
                if (user4 != null) {
                    l = Long.valueOf(user4.getId());
                } else {
                    l = null;
                }
                if (user != null) {
                    l2 = Long.valueOf(user.getId());
                }
                if (!C89219l.m154714a(l, l2)) {
                    C11279p.m20006a(mo8166a_(R.id.dhq));
                }
            }
        }
        ((LiveTextView) mo8166a_(R.id.dix)).setOnClickListener(new View$OnClickListenerC10214e(this));
        ((LiveTextView) mo8166a_(R.id.cp0)).setOnClickListener(new View$OnClickListenerC10215f(this));
        ((LiveTextView) mo8166a_(R.id.t4)).setOnClickListener(new View$OnClickListenerC10216g(this));
        ((LiveTextView) mo8166a_(R.id.a0w)).setOnClickListener(new View$OnClickListenerC10217h(this));
    }
}
