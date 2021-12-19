package com.bytedance.android.livesdk.p604qa;

import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.DialogInterface$OnCancelListenerC0944d;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p218f.C3941k;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.network.C5805e;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.live.publicscreen.p386a.AbstractC5880e;
import com.bytedance.android.live.publicscreen.p386a.C5889g;
import com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5873h;
import com.bytedance.android.live.publicscreen.p386a.p392f.AbstractC5888b;
import com.bytedance.android.livesdk.chatroom.p499ui.NoMoreSpaceTextView;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.android.livesdk.model.C9542az;
import com.bytedance.android.livesdk.model.message.C9676bi;
import com.bytedance.android.livesdk.model.message.C9678bk;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p430ab.C6581g;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.p456as.AbstractC6872f;
import com.bytedance.android.livesdk.p561j.C9021ao;
import com.bytedance.android.livesdk.p561j.C9076co;
import com.bytedance.android.livesdk.p561j.C9093de;
import com.bytedance.android.livesdk.p561j.C9101dm;
import com.bytedance.android.livesdk.p561j.C9119ed;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdk.util.rxutils.C11191f;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.qa.am */
public final class C10195am extends AbstractC5888b<C10194al> {

    /* renamed from: a */
    boolean f24702a;

    /* renamed from: d */
    public boolean f24703d;

    /* renamed from: e */
    public boolean f24704e;

    /* renamed from: f */
    private final ActivityC0945e f24705f;

    /* renamed from: g */
    private boolean f24706g = true;

    /* renamed from: com.bytedance.android.livesdk.qa.am$a */
    static final class C10196a<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C10196a f24707a = new C10196a();

        static {
            Covode.recordClassIndex(11762);
        }

        C10196a() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: com.bytedance.android.livesdk.qa.am$b */
    static final class C10197b<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C10197b f24708a = new C10197b();

        static {
            Covode.recordClassIndex(11763);
        }

        C10197b() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(11761);
    }

    /* renamed from: com.bytedance.android.livesdk.qa.am$c */
    static final class View$OnClickListenerC10198c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C10195am f24709a;

        /* renamed from: b */
        final /* synthetic */ User f24710b;

        static {
            Covode.recordClassIndex(11764);
        }

        View$OnClickListenerC10198c(C10195am amVar, User user) {
            this.f24709a = amVar;
            this.f24710b = user;
        }

        public final void onClick(View view) {
            C10195am.m18687a(this.f24710b, "head");
        }
    }

    /* renamed from: com.bytedance.android.livesdk.qa.am$d */
    static final class View$OnClickListenerC10199d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C10195am f24711a;

        /* renamed from: b */
        final /* synthetic */ C9676bi f24712b;

        /* renamed from: c */
        final /* synthetic */ DataChannel f24713c;

        static {
            Covode.recordClassIndex(11765);
        }

        View$OnClickListenerC10199d(C10195am amVar, C9676bi biVar, DataChannel dataChannel) {
            this.f24711a = amVar;
            this.f24712b = biVar;
            this.f24713c = dataChannel;
        }

        public final void onClick(View view) {
            C10175aa.m18671a(this.f24713c, UGCMonitor.EVENT_COMMENT);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.qa.am$g */
    static final class View$OnClickListenerC10202g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C10195am f24719a;

        /* renamed from: b */
        final /* synthetic */ User f24720b;

        static {
            Covode.recordClassIndex(11768);
        }

        View$OnClickListenerC10202g(C10195am amVar, User user) {
            this.f24719a = amVar;
            this.f24720b = user;
        }

        public final void onClick(View view) {
            C10195am.m18687a(this.f24720b, StringSet.name);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10195am(View view) {
        super(view);
        C89219l.m154721d(view, "");
        this.f24705f = C11279p.m20001a(view.getContext());
    }

    /* renamed from: com.bytedance.android.livesdk.qa.am$e */
    static final class View$OnLongClickListenerC10200e implements View.OnLongClickListener {

        /* renamed from: a */
        final /* synthetic */ C10195am f24714a;

        /* renamed from: b */
        final /* synthetic */ C9676bi f24715b;

        /* renamed from: c */
        final /* synthetic */ DataChannel f24716c;

        static {
            Covode.recordClassIndex(11766);
        }

        View$OnLongClickListenerC10200e(C10195am amVar, C9676bi biVar, DataChannel dataChannel) {
            this.f24714a = amVar;
            this.f24715b = biVar;
            this.f24716c = dataChannel;
        }

        public final boolean onLongClick(View view) {
            DataChannel dataChannel;
            AbstractC0952i iVar;
            DialogInterface$OnCancelListenerC0944d dVar;
            User user = this.f24715b.f23550e;
            C89219l.m154716b(user, "");
            long id = user.getId();
            AbstractC6872f b = C11115u.m19743a().mo17915b();
            C89219l.m154716b(b, "");
            if (!(id == b.mo13161c() || (dataChannel = this.f24716c) == null || (iVar = (AbstractC0952i) dataChannel.mo28318b(C9021ao.class)) == null || this.f24716c.mo28318b(C9093de.class) == null)) {
                this.f24716c.mo28311a(C10178ad.class, this.f24715b);
                this.f24716c.mo28311a(C10225au.class, "qa_comment");
                if (this.f24714a.f24703d || this.f24714a.f24704e) {
                    this.f24716c.mo28311a(C10204ao.class, (Object) false);
                    dVar = new C10208as();
                } else {
                    dVar = new C10220at();
                }
                dVar.show(iVar, "qa_comment");
            }
            return true;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.qa.am$f */
    static final class View$OnClickListenerC10201f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C10195am f24717a;

        /* renamed from: b */
        final /* synthetic */ C9676bi f24718b;

        static {
            Covode.recordClassIndex(11767);
        }

        View$OnClickListenerC10201f(C10195am amVar, C9676bi biVar) {
            this.f24717a = amVar;
            this.f24718b = biVar;
        }

        public final void onClick(View view) {
            String str;
            int i;
            C10195am amVar = this.f24717a;
            C9676bi biVar = this.f24718b;
            amVar.f24702a = !amVar.f24702a;
            if (amVar.f24702a) {
                str = "livesdk_qa_question_like";
            } else {
                str = "livesdk_qa_question_cancel_like";
            }
            C6501b a = C6501b.C6502a.m13948a(str).mo12639a().mo12651a("question_content", biVar.f23547b);
            User user = biVar.f23550e;
            C89219l.m154716b(user, "");
            a.mo12646a("question_user_id", user.getId()).mo12651a("like_enter_from", UGCMonitor.EVENT_COMMENT).mo12655b();
            View view2 = amVar.itemView;
            C89219l.m154716b(view2, "");
            ImageView imageView = (ImageView) view2.findViewById(R.id.c8l);
            if (amVar.f24702a) {
                i = 2131234707;
            } else {
                i = 2131234706;
            }
            imageView.setBackgroundResource(i);
            ((QAApi) C5805e.m12718a().mo11572a(QAApi.class)).likeQuestion(biVar.f23546a, amVar.f24702a ? 1 : 0, 0).mo143271a(new C11191f()).mo143254a(C10196a.f24707a, C10197b.f24708a);
        }
    }

    /* renamed from: a */
    public static void m18687a(User user, String str) {
        C6779a a = C6779a.m14563a();
        UserProfileEvent userProfileEvent = new UserProfileEvent(user);
        userProfileEvent.setClickModule(str);
        userProfileEvent.setClickUserPosition("qa_comment");
        a.mo13053a(userProfileEvent);
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.p392f.AbstractC5887a
    /* renamed from: a */
    public final /* synthetic */ void mo10370a(C5889g gVar, AbstractC5873h hVar) {
        User b;
        boolean z;
        boolean z2;
        boolean z3;
        int i;
        List<String> urls;
        User user;
        C9542az userAttr;
        Boolean bool;
        Boolean bool2;
        C10194al alVar = (C10194al) hVar;
        C89219l.m154721d(gVar, "");
        C89219l.m154721d(alVar, "");
        C9676bi biVar = ((C9678bk) alVar.f14737d).f23554a;
        if (biVar != null && (b = alVar.mo10375b()) != null) {
            DataChannel dataChannel = gVar.f14755l;
            if (dataChannel == null || (bool2 = (Boolean) dataChannel.mo28318b(C9119ed.class)) == null) {
                z = false;
            } else {
                z = bool2.booleanValue();
            }
            this.f24703d = z;
            DataChannel dataChannel2 = gVar.f14755l;
            if (dataChannel2 == null || (bool = (Boolean) dataChannel2.mo28318b(C9076co.class)) == null) {
                z2 = true;
            } else {
                z2 = bool.booleanValue();
            }
            this.f24706g = z2;
            DataChannel dataChannel3 = gVar.f14755l;
            if (dataChannel3 == null || (user = (User) dataChannel3.mo28318b(C9101dm.class)) == null || (userAttr = user.getUserAttr()) == null) {
                z3 = false;
            } else {
                z3 = userAttr.f23192b;
            }
            this.f24704e = z3;
            View view = this.itemView;
            C89219l.m154716b(view, "");
            LiveTextView liveTextView = (LiveTextView) view.findViewById(R.id.cpj);
            C5889g gVar2 = this.f14742b;
            if (gVar2 != null) {
                C89219l.m154716b(liveTextView, "");
                gVar2.mo11741a(liveTextView);
            }
            if (((AbstractC5880e) C6193a.m13435a(AbstractC5880e.class)).getTextMessageConfig() != null) {
                i = R.color.a1l;
            } else {
                i = 0;
            }
            SpannableString spannableString = new SpannableString(C3966y.m9660a((int) R.string.dxy, C6581g.m14075a(b)));
            spannableString.setSpan(new ForegroundColorSpan(C3966y.m9663b(i)), 0, spannableString.length(), 18);
            liveTextView.setText(spannableString);
            liveTextView.setOnClickListener(new View$OnClickListenerC10202g(this, b));
            liveTextView.setHighlightColor(0);
            DataChannel dataChannel4 = gVar.f14755l;
            View view2 = this.itemView;
            C89219l.m154716b(view2, "");
            NoMoreSpaceTextView noMoreSpaceTextView = (NoMoreSpaceTextView) view2.findViewById(R.id.acq);
            C5889g gVar3 = this.f14742b;
            if (gVar3 != null) {
                C89219l.m154716b(noMoreSpaceTextView, "");
                gVar3.mo11741a(noMoreSpaceTextView);
            }
            noMoreSpaceTextView.setText(biVar.f23547b);
            noMoreSpaceTextView.setOnClickListener(new View$OnClickListenerC10199d(this, biVar, dataChannel4));
            noMoreSpaceTextView.setOnLongClickListener(new View$OnLongClickListenerC10200e(this, biVar, dataChannel4));
            if (!this.f24703d) {
                View view3 = this.itemView;
                C89219l.m154716b(view3, "");
                ImageView imageView = (ImageView) view3.findViewById(R.id.c8l);
                imageView.setVisibility(0);
                imageView.setOnClickListener(new View$OnClickListenerC10201f(this, biVar));
            }
            ImageModel avatarThumb = b.getAvatarThumb();
            if (avatarThumb == null || (urls = avatarThumb.getUrls()) == null || urls.isEmpty()) {
                View view4 = this.itemView;
                C89219l.m154716b(view4, "");
                ((HSImageView) view4.findViewById(R.id.dcw)).setImageResource(alVar.mo10712h_());
            } else {
                View view5 = this.itemView;
                C89219l.m154716b(view5, "");
                C3941k.m9601a((HSImageView) view5.findViewById(R.id.dcw), b.getAvatarThumb());
            }
            View view6 = this.itemView;
            C89219l.m154716b(view6, "");
            ((HSImageView) view6.findViewById(R.id.dcw)).setOnClickListener(new View$OnClickListenerC10198c(this, b));
            long id = b.getId();
            AbstractC6872f b2 = C11115u.m19743a().mo17915b();
            C89219l.m154716b(b2, "");
            if (id == b2.mo13161c()) {
                C6501b.C6502a.m13948a("livesdk_audience_qa_message").mo12639a().mo12655b();
            }
        }
    }
}
