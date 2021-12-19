package com.bytedance.android.live.liveinteract.multilive.anchor.p356ui.dialog;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.AbstractC0952i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.liveinteract.api.p262c.AbstractC4430d;
import com.bytedance.android.live.liveinteract.api.p262c.C4431e;
import com.bytedance.android.live.liveinteract.cohost.p263a.p264a.C4469d;
import com.bytedance.android.live.liveinteract.multiguest.opt.p337a.C5271a;
import com.bytedance.android.live.liveinteract.multiguest.opt.p337a.p338a.C5277b;
import com.bytedance.android.live.liveinteract.multiguest.opt.p339b.p340a.DialogC5344a;
import com.bytedance.android.live.liveinteract.multilive.p359b.C5586a;
import com.bytedance.android.live.liveinteract.platform.common.p377h.C5742a;
import com.bytedance.android.livesdk.chatroom.model.p495b.C7666e;
import com.bytedance.android.livesdk.p450an.C6800c;
import com.bytedance.android.livesdk.p452ao.AbstractC6804a;
import com.bytedance.android.livesdk.p452ao.C6805b;
import com.bytedance.android.livesdk.p452ao.C6806c;
import com.bytedance.android.livesdk.p561j.C9021ao;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.liveinteract.multilive.anchor.ui.dialog.c */
public final class DialogC5581c extends DialogC5344a {
    @AbstractC4430d(mo10204a = "MULTI_GUEST_DATA_HOLDER")

    /* renamed from: c */
    public C5271a f14216c;

    /* renamed from: d */
    private View f14217d;

    /* renamed from: e */
    private View f14218e;

    /* renamed from: f */
    private View f14219f;

    /* renamed from: g */
    private final AbstractC1204m f14220g;

    static {
        Covode.recordClassIndex(6177);
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.opt.p339b.p340a.DialogC5344a, com.bytedance.android.livesdk.widget.AbstractDialogC11425g
    /* renamed from: b */
    public final int mo8350b() {
        return R.layout.b6p;
    }

    /* renamed from: f */
    public final void mo11360f() {
        View view = this.f14218e;
        if (view == null) {
            C89219l.m154710a("mPromptView");
        }
        view.setVisibility(8);
        View view2 = this.f14219f;
        if (view2 == null) {
            C89219l.m154710a("mShadowLineView");
        }
        view2.setVisibility(8);
    }

    /* renamed from: g */
    public final void mo11361g() {
        AbstractC0952i iVar;
        DataChannel dataChannel = this.f13815b.f13674o;
        C4469d.AbstractC4473d a = C5742a.m12611a(this.f14220g);
        if (dataChannel != null && (iVar = (AbstractC0952i) dataChannel.mo28318b(C9021ao.class)) != null) {
            a.show(iVar, "LinkDialog");
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multilive.anchor.ui.dialog.c$a */
    static final class View$OnClickListenerC5582a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DialogC5581c f14221a;

        static {
            Covode.recordClassIndex(6178);
        }

        View$OnClickListenerC5582a(DialogC5581c cVar) {
            this.f14221a = cVar;
        }

        public final void onClick(View view) {
            this.f14221a.mo11360f();
            this.f14221a.dismiss();
            this.f14221a.mo11361g();
            C5586a.m12130a("icon");
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multilive.anchor.ui.dialog.c$b */
    static final class View$OnClickListenerC5583b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DialogC5581c f14222a;

        static {
            Covode.recordClassIndex(6179);
        }

        View$OnClickListenerC5583b(DialogC5581c cVar) {
            this.f14222a = cVar;
        }

        public final void onClick(View view) {
            this.f14222a.mo11360f();
            this.f14222a.dismiss();
            this.f14222a.mo11361g();
            C6805b<Boolean> bVar = AbstractC6804a.f17025cU;
            C89219l.m154716b(bVar, "");
            C6806c.m14603a((C6800c) bVar, (Object) true);
            C5586a.m12130a("notification");
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.opt.p339b.p340a.DialogC5344a, com.bytedance.android.livesdk.widget.AbstractDialogC11425g
    public final void onCreate(Bundle bundle) {
        C5271a aVar = this.f14216c;
        if (aVar == null) {
            C89219l.m154710a("mMultiGuestDataHolder");
        }
        super.mo11171a(bundle, aVar.f13646q);
        View findViewById = findViewById(R.id.y4);
        C89219l.m154716b(findViewById, "");
        this.f14217d = findViewById;
        View findViewById2 = findViewById(R.id.c6d);
        C89219l.m154716b(findViewById2, "");
        this.f14218e = findViewById2;
        View findViewById3 = findViewById(R.id.fg0);
        C89219l.m154716b(findViewById3, "");
        this.f14219f = findViewById3;
        View view = this.f14217d;
        if (view == null) {
            C89219l.m154710a("mSettingsView");
        } else {
            view.setOnClickListener(new View$OnClickListenerC5582a(this));
        }
        C6805b<Boolean> bVar = AbstractC6804a.f17025cU;
        C89219l.m154716b(bVar, "");
        Boolean a = bVar.mo13066a();
        C89219l.m154716b(a, "");
        if (!a.booleanValue()) {
            View view2 = this.f14218e;
            if (view2 == null) {
                C89219l.m154710a("mPromptView");
            }
            view2.setVisibility(0);
            View view3 = this.f14219f;
            if (view3 == null) {
                C89219l.m154710a("mShadowLineView");
            }
            view3.setVisibility(0);
            View view4 = this.f14218e;
            if (view4 == null) {
                C89219l.m154710a("mPromptView");
            } else {
                view4.setOnClickListener(new View$OnClickListenerC5583b(this));
            }
        } else {
            mo11360f();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DialogC5581c(AbstractC1204m mVar, Context context, C5277b bVar, List<C7666e> list) {
        super(context, bVar, list);
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(context, "");
        C89219l.m154721d(bVar, "");
        this.f14220g = mVar;
        C4431e.f12034a.mo10201a(this);
    }
}
