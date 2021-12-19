package com.bytedance.android.live.liveinteract.cohost.p279ui.p281b;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.widget.LiveButton;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.liveinteract.api.EnumC4442m;
import com.bytedance.android.live.liveinteract.api.p260a.C4384b;
import com.bytedance.android.live.liveinteract.cohost.p263a.p265b.C4490a;
import com.bytedance.android.live.liveinteract.cohost.p263a.p265b.C4498i;
import com.bytedance.android.live.liveinteract.cohost.p263a.p265b.C4500k;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5713h;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5737w;
import com.bytedance.android.live.liveinteract.platform.common.view.WaveEffectView;
import com.bytedance.android.livesdk.AbstractC11293v;
import com.bytedance.android.livesdk.chatroom.p492g.C7577g;
import com.bytedance.android.livesdk.utils.C11266h;
import com.bytedance.android.livesdk.widget.VHeadView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.b.a */
public final class C4634a extends AbstractC11293v {

    /* renamed from: a */
    public static final C4635a f12288a = new C4635a((byte) 0);

    /* renamed from: b */
    private WaveEffectView f12289b;

    /* renamed from: c */
    private HashMap f12290c;

    static {
        Covode.recordClassIndex(5211);
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: a */
    public final void mo8165a() {
        HashMap hashMap = this.f12290c;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: a_ */
    public final View mo8166a_(int i) {
        if (this.f12290c == null) {
            this.f12290c = new HashMap();
        }
        View view = (View) this.f12290c.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f12290c.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, com.bytedance.android.livesdk.AbstractC11293v, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo8165a();
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.b.a$a */
    public static final class C4635a {
        static {
            Covode.recordClassIndex(5212);
        }

        private C4635a() {
        }

        public /* synthetic */ C4635a(byte b) {
            this();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        WaveEffectView waveEffectView = this.f12289b;
        if (waveEffectView != null) {
            waveEffectView.mo11491b();
        }
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: b */
    public final AbstractC11293v.C11295b mo8355b() {
        AbstractC11293v.C11295b bVar = new AbstractC11293v.C11295b(R.layout.b5a);
        bVar.f27015b = R.style.a28;
        bVar.f27020g = 80;
        bVar.f27022i = -2;
        return bVar;
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.b.a$b */
    static final class C4636b extends AbstractC89220m implements AbstractC89172b<C89391z, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C4634a f12291a;

        static {
            Covode.recordClassIndex(5213);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4636b(C4634a aVar) {
            super(1);
            this.f12291a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C89391z zVar) {
            C89219l.m154721d(zVar, "");
            this.f12291a.dismiss();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.b.a$d */
    static final class View$OnClickListenerC4638d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C4634a f12293a;

        static {
            Covode.recordClassIndex(5215);
        }

        View$OnClickListenerC4638d(C4634a aVar) {
            this.f12293a = aVar;
        }

        public final void onClick(View view) {
            DataChannel dataChannel = this.f12293a.f27010p;
            if (dataChannel != null) {
                dataChannel.mo28319c(C4490a.class);
            }
            C5713h.m12509a(C4384b.C4385a.m10496a().f11968p, "popup", "withdraw");
            this.f12293a.dismiss();
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.b.a$e */
    static final class View$OnClickListenerC4639e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C4634a f12294a;

        static {
            Covode.recordClassIndex(5216);
        }

        View$OnClickListenerC4639e(C4634a aVar) {
            this.f12294a = aVar;
        }

        public final void onClick(View view) {
            this.f12294a.dismiss();
            C5713h.m12509a(C4384b.C4385a.m10496a().f11968p, "popup", "keep_waiting");
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.b.a$c */
    static final class C4637c extends AbstractC89220m implements AbstractC89172b<Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C4634a f12292a;

        static {
            Covode.recordClassIndex(5214);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4637c(C4634a aVar) {
            super(1);
            this.f12292a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Integer num) {
            int intValue = num.intValue();
            if (intValue <= 0) {
                this.f12292a.dismiss();
            } else if (this.f12292a.mo8166a_(R.id.ev7) != null) {
                LiveTextView liveTextView = (LiveTextView) this.f12292a.mo8166a_(R.id.ev7);
                C89219l.m154716b(liveTextView, "");
                liveTextView.setText(C11266h.m19968a(this.f12292a.getString(R.string.dwt), String.valueOf(intValue)));
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        ImageModel imageModel;
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        DataChannel dataChannel = this.f27010p;
        if (dataChannel != null) {
            dataChannel.mo28310a(C4498i.class, (AbstractC89172b) new C4636b(this)).mo28310a(C4500k.class, (AbstractC89172b) new C4637c(this));
        }
        WaveEffectView waveEffectView = (WaveEffectView) view.findViewById(R.id.eou);
        this.f12289b = waveEffectView;
        if (waveEffectView != null) {
            waveEffectView.mo11490a();
        }
        LiveTextView liveTextView = (LiveTextView) mo8166a_(R.id.f02);
        C89219l.m154716b(liveTextView, "");
        User user = C4384b.C4385a.m10496a().f11930T;
        if (user == null || (str = user.displayId) == null) {
            str = "";
        }
        liveTextView.setText(str);
        ImageView imageView = (ImageView) mo8166a_(R.id.eot);
        User user2 = C4384b.C4385a.m10496a().f11930T;
        if (user2 != null) {
            imageModel = user2.getAvatarThumb();
        } else {
            imageModel = null;
        }
        VHeadView vHeadView = (VHeadView) mo8166a_(R.id.eot);
        C89219l.m154716b(vHeadView, "");
        int width = vHeadView.getWidth();
        VHeadView vHeadView2 = (VHeadView) mo8166a_(R.id.eot);
        C89219l.m154716b(vHeadView2, "");
        C7577g.m15571a(imageView, imageModel, width, vHeadView2.getHeight(), 2131234441);
        ((LiveButton) mo8166a_(R.id.et7)).setOnClickListener(new View$OnClickListenerC4638d(this));
        ((LiveButton) mo8166a_(R.id.evc)).setOnClickListener(new View$OnClickListenerC4639e(this));
        EnumC4442m mVar = C4384b.C4385a.m10496a().f11968p;
        HashMap hashMap = new HashMap();
        hashMap.put("invitee_list", C5737w.m12598a(mVar));
        C5713h.m12517a("cancel_connection_popup_show", hashMap);
    }
}
