package com.bytedance.android.livesdk.p604qa;

import android.os.Bundle;
import android.view.View;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.network.C5805e;
import com.bytedance.android.live.p172a.p173a.p175b.C2912a;
import com.bytedance.android.live.p405s.AbstractC6103e;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.AbstractC11293v;
import com.bytedance.android.livesdk.model.message.C9676bi;
import com.bytedance.android.livesdk.p425aa.C6544e;
import com.bytedance.android.livesdk.p561j.C9093de;
import com.bytedance.android.livesdk.p561j.C9119ed;
import com.bytedance.android.livesdk.util.rxutils.C11191f;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.model.C11838d;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.qa.at */
public final class C10220at extends AbstractC11293v {

    /* renamed from: a */
    public C9676bi f24745a;

    /* renamed from: b */
    String f24746b = "";

    /* renamed from: c */
    private HashMap f24747c;

    static {
        Covode.recordClassIndex(11786);
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: a */
    public final void mo8165a() {
        HashMap hashMap = this.f24747c;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: a_ */
    public final View mo8166a_(int i) {
        if (this.f24747c == null) {
            this.f24747c = new HashMap();
        }
        View view = (View) this.f24747c.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f24747c.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, com.bytedance.android.livesdk.AbstractC11293v, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo8165a();
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: b */
    public final AbstractC11293v.C11295b mo8355b() {
        AbstractC11293v.C11295b bVar = new AbstractC11293v.C11295b(R.layout.b78);
        bVar.f27014a = 0;
        bVar.f27015b = R.style.a2c;
        bVar.f27020g = 80;
        bVar.f27022i = -2;
        return bVar;
    }

    /* renamed from: com.bytedance.android.livesdk.qa.at$b */
    static final class View$OnClickListenerC10222b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C10220at f24750a;

        static {
            Covode.recordClassIndex(11788);
        }

        View$OnClickListenerC10222b(C10220at atVar) {
            this.f24750a = atVar;
        }

        public final void onClick(View view) {
            this.f24750a.dismiss();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.qa.at$c */
    static final class C10223c<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C10220at f24751a;

        static {
            Covode.recordClassIndex(11789);
        }

        C10223c(C10220at atVar) {
            this.f24751a = atVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            DataChannel dataChannel;
            C9676bi biVar = this.f24751a.f24745a;
            if (biVar != null && (dataChannel = this.f24751a.f27010p) != null) {
                dataChannel.mo28315b(C10203an.class, new C10188af(biVar, 6));
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.qa.at$d */
    static final class C10224d<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C10224d f24752a = new C10224d();

        static {
            Covode.recordClassIndex(11790);
        }

        C10224d() {
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

    /* renamed from: com.bytedance.android.livesdk.qa.at$a */
    static final class View$OnClickListenerC10221a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C10220at f24748a;

        /* renamed from: b */
        final /* synthetic */ boolean f24749b;

        static {
            Covode.recordClassIndex(11787);
        }

        View$OnClickListenerC10221a(C10220at atVar, boolean z) {
            this.f24748a = atVar;
            this.f24749b = z;
        }

        public final void onClick(View view) {
            C10220at atVar;
            C9676bi biVar;
            Room room;
            C10220at atVar2 = this.f24748a;
            DataChannel dataChannel = atVar2.f27010p;
            if (!(dataChannel == null || (room = (Room) dataChannel.mo28318b(C9093de.class)) == null)) {
                String a = C6544e.m13987a();
                String d = C6544e.m13990d();
                C9676bi biVar2 = atVar2.f24745a;
                if (biVar2 != null) {
                    long id = room.getId();
                    long ownerUserId = room.getOwnerUserId();
                    User user = biVar2.f23550e;
                    C89219l.m154716b(user, "");
                    long id2 = user.getId();
                    User user2 = biVar2.f23550e;
                    C89219l.m154716b(user2, "");
                    C11838d dVar = new C11838d(id, ownerUserId, id2, user2.getSecUid(), atVar2.f24746b, biVar2.f23546a, biVar2.f23547b, room.getRequestId(), a, d, "report_question", "3");
                    dVar.f28220s = ((AbstractC6103e) C6193a.m13435a(AbstractC6103e.class)).getReportScene();
                    if (C89219l.m154714a((Object) dVar.f28209h, (Object) "qa_board")) {
                        double b = (double) C3966y.m9662b();
                        Double.isNaN(b);
                        dVar.f28206e = (int) C3966y.m9668e((int) (b * 0.73d));
                    }
                    ((AbstractC6103e) C6193a.m13435a(AbstractC6103e.class)).report(atVar2.getContext(), dVar);
                }
            }
            if (this.f24749b && (biVar = (atVar = this.f24748a).f24745a) != null) {
                ((QAApi) C5805e.m12718a().mo11572a(QAApi.class)).deleteQuestion(biVar.f23546a).mo143271a(new C11191f()).mo143254a(new C10223c(atVar), C10224d.f24752a);
            }
            this.f24748a.dismiss();
        }
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        C9676bi biVar;
        String str;
        Boolean bool;
        String str2 = "";
        C89219l.m154721d(view, str2);
        super.onViewCreated(view, bundle);
        DataChannel dataChannel = this.f27010p;
        if (dataChannel == null || (bool = (Boolean) dataChannel.mo28318b(C9119ed.class)) == null) {
            z = false;
        } else {
            z = bool.booleanValue();
        }
        DataChannel dataChannel2 = this.f27010p;
        if (!(dataChannel2 == null || (str = (String) dataChannel2.mo28318b(C10225au.class)) == null)) {
            str2 = str;
        }
        this.f24746b = str2;
        DataChannel dataChannel3 = this.f27010p;
        if (dataChannel3 != null) {
            biVar = (C9676bi) dataChannel3.mo28318b(C10178ad.class);
        } else {
            biVar = null;
        }
        this.f24745a = biVar;
        ((LiveTextView) mo8166a_(R.id.dix)).setOnClickListener(new View$OnClickListenerC10221a(this, z));
        ((LiveTextView) mo8166a_(R.id.a0w)).setOnClickListener(new View$OnClickListenerC10222b(this));
    }
}
