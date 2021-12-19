package com.bytedance.android.livesdk.chatroom.interaction;

import android.view.View;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.p379n.C5766ab;
import com.bytedance.android.livesdk.chatroom.p488c.C7380am;
import com.bytedance.android.livesdk.chatroom.p488c.C7401r;
import com.bytedance.android.livesdk.chatroom.p499ui.AbstractC7765aq;
import com.bytedance.android.livesdk.p425aa.C6555i;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.p561j.C9008ab;
import com.bytedance.android.livesdk.p561j.C9013ag;
import com.bytedance.android.livesdk.p561j.C9034ba;
import com.bytedance.android.livesdk.p561j.C9036bc;
import com.bytedance.android.livesdk.p561j.C9112dx;
import com.bytedance.android.livesdk.p561j.C9138t;
import com.bytedance.android.livesdk.p561j.C9143y;
import com.bytedance.android.livesdk.p643ui.C10935a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.HashMap;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.chatroom.interaction.b */
public final class C7629b {

    /* renamed from: b */
    public static final C7631a f18917b = new C7631a((byte) 0);

    /* renamed from: a */
    public final DataChannel f18918a;

    /* renamed from: c */
    private final C10935a f18919c;

    /* renamed from: d */
    private final View f18920d;

    /* renamed from: e */
    private final AbstractC7765aq f18921e;

    /* renamed from: f */
    private final AbstractC89172b<Float, C89391z> f18922f;

    /* renamed from: com.bytedance.android.livesdk.chatroom.interaction.b$c */
    final /* synthetic */ class C7633c implements AbstractC88433f {

        /* renamed from: a */
        private final /* synthetic */ AbstractC89172b f18924a;

        static {
            Covode.recordClassIndex(8410);
        }

        C7633c(AbstractC89172b bVar) {
            this.f18924a = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C89219l.m154716b(this.f18924a.invoke(obj), "");
        }
    }

    static {
        Covode.recordClassIndex(8406);
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.interaction.b$a */
    public static final class C7631a {
        static {
            Covode.recordClassIndex(8408);
        }

        private C7631a() {
        }

        public /* synthetic */ C7631a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    private final int m15643a() {
        C7380am amVar = (C7380am) this.f18918a.mo28318b(C5766ab.class);
        if (amVar != null) {
            return amVar.f18292a;
        }
        return 0;
    }

    /* renamed from: b */
    private final boolean m15644b() {
        C7380am amVar = (C7380am) this.f18918a.mo28318b(C5766ab.class);
        if (amVar != null) {
            return amVar.mo13610a();
        }
        return false;
    }

    /* renamed from: c */
    private final int m15645c() {
        Integer num = (Integer) this.f18918a.mo28318b(C9138t.class);
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.chatroom.interaction.b$b */
    public static final class View$OnClickListenerC7632b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C7629b f18923a;

        static {
            Covode.recordClassIndex(8409);
        }

        View$OnClickListenerC7632b(C7629b bVar) {
            this.f18923a = bVar;
        }

        public final void onClick(View view) {
            this.f18923a.f18918a.mo28319c(C9013ag.class);
            C89219l.m154716b(view, "");
            view.setVisibility(8);
        }
    }

    public final void onEvent(C7401r rVar) {
        int i;
        AbstractC7765aq aqVar;
        View a;
        String str;
        AbstractC7765aq aqVar2;
        View a2;
        if (this.f18919c.isViewValid()) {
            Object b = this.f18918a.mo28318b(C9036bc.class);
            if (b == null) {
                C89219l.m154715b();
            }
            boolean booleanValue = ((Boolean) b).booleanValue();
            if (rVar.f18339b) {
                View$OnClickListenerC7632b bVar = new View$OnClickListenerC7632b(this);
                View view = this.f18920d;
                view.setVisibility(0);
                view.setOnClickListener(bVar);
                if (!(!booleanValue || (aqVar2 = this.f18921e) == null || (a2 = aqVar2.mo13546a()) == null)) {
                    a2.setVisibility(0);
                    a2.setOnClickListener(bVar);
                }
                if (!booleanValue) {
                    if ((m15644b() && m15643a() > 0) || m15645c() != 0) {
                        this.f18918a.mo28320c(C9112dx.class, Integer.valueOf(C3966y.m9653a(200.0f)));
                        this.f18918a.mo28315b(C9008ab.class, (Object) true);
                    }
                    this.f18922f.invoke(Float.valueOf(-((float) rVar.f18338a)));
                }
                this.f18918a.mo28315b(C9034ba.class, (Object) true);
                this.f18918a.mo28320c(C9143y.class, 8);
            } else {
                this.f18920d.setVisibility(8);
                if (!(!booleanValue || (aqVar = this.f18921e) == null || (a = aqVar.mo13546a()) == null)) {
                    a.setVisibility(8);
                }
                this.f18922f.invoke(Float.valueOf(0.0f));
                this.f18918a.mo28315b(C9034ba.class, (Object) false);
                this.f18918a.mo28320c(C9143y.class, 0);
                if ((m15644b() && m15643a() > 0 && this.f18919c.isViewValid() && (!booleanValue || this.f18921e == null)) || m15645c() != 0) {
                    DataChannel dataChannel = this.f18918a;
                    if (m15645c() != 0) {
                        i = m15645c();
                    } else {
                        i = -1;
                    }
                    dataChannel.mo28320c(C9112dx.class, Integer.valueOf(i));
                }
            }
            if (rVar.f18339b) {
                str = "input_event";
            } else {
                str = "input_close";
            }
            String str2 = "translateY:" + rVar.f18338a;
            HashMap hashMap = new HashMap();
            hashMap.put("event_name", "on_adjust_text_message_widget");
            hashMap.put("adjust_reason", str);
            if (str2 != null) {
                hashMap.put("adjust_param", str2);
            }
            C6555i.m14021b().mo9215a("ttlive_room", hashMap);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: h.f.a.b<? super java.lang.Float, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public C7629b(C10935a aVar, DataChannel dataChannel, View view, AbstractC7765aq aqVar, AbstractC89172b<? super Float, C89391z> bVar) {
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(dataChannel, "");
        C89219l.m154721d(view, "");
        C89219l.m154721d(bVar, "");
        this.f18919c = aVar;
        this.f18918a = dataChannel;
        this.f18920d = view;
        this.f18921e = aqVar;
        this.f18922f = bVar;
        C6779a.m14563a().mo13050a(aVar, C7401r.class, dataChannel).mo17949a(new C7633c(new AbstractC89172b<C7401r, C89391z>(this) {
            /* class com.bytedance.android.livesdk.chatroom.interaction.C7629b.C76301 */

            static {
                Covode.recordClassIndex(8407);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(C7401r rVar) {
                C7401r rVar2 = rVar;
                C89219l.m154721d(rVar2, "");
                ((C7629b) this.receiver).onEvent(rVar2);
                return C89391z.f203057a;
            }
        }));
    }
}
