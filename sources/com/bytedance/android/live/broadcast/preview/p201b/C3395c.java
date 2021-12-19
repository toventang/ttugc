package com.bytedance.android.live.broadcast.preview.p201b;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.DialogInterface$OnCancelListenerC0944d;
import com.C1764a;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.base.AbstractC2953a;
import com.bytedance.android.live.base.model.user.AbstractC2994b;
import com.bytedance.android.live.broadcast.C3013ae;
import com.bytedance.android.live.broadcast.C3184c;
import com.bytedance.android.live.broadcast.C3226e;
import com.bytedance.android.live.broadcast.C3242h;
import com.bytedance.android.live.broadcast.C3250l;
import com.bytedance.android.live.broadcast.C3802x;
import com.bytedance.android.live.broadcast.api.blockword.BlockWordView;
import com.bytedance.android.live.broadcast.model.C3260f;
import com.bytedance.android.live.broadcast.model.C3265j;
import com.bytedance.android.live.broadcast.p182a.AbstractC3007b;
import com.bytedance.android.live.broadcast.preview.C3377aj;
import com.bytedance.android.live.core.widget.C4031a;
import com.bytedance.android.live.design.widget.LiveSwitch;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.p405s.AbstractC6103e;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.livesetting.broadcast.BroadcastLiveAnchorIntroSetting;
import com.bytedance.android.livesdk.livesetting.gift.TTliveStartGiftConfigSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveSdkAppealWebviewSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LowAgeAnchorLimitSetting;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p450an.C6800c;
import com.bytedance.android.livesdk.p452ao.AbstractC6804a;
import com.bytedance.android.livesdk.p452ao.C6805b;
import com.bytedance.android.livesdk.p452ao.C6806c;
import com.bytedance.android.livesdk.p456as.AbstractC6872f;
import com.bytedance.android.livesdk.p561j.C9070ci;
import com.bytedance.android.livesdk.p561j.C9136r;
import com.bytedance.android.livesdk.p561j.C9137s;
import com.bytedance.android.livesdk.p561j.EnumC9135q;
import com.bytedance.android.livesdk.p562k.DialogC9148b;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.android.livesdkapi.depend.model.live.C11729j;
import com.bytedance.android.livesdkapi.depend.model.live.EnumC11728i;
import com.bytedance.android.livesdkapi.host.IHostApp;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.C17846f;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.p2082ss.android.ugc.trill.R;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.C89391z;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.broadcast.preview.b.c */
public final class C3395c extends AbstractC3007b {

    /* renamed from: a */
    public int f9623a;

    /* renamed from: b */
    int f9624b;

    /* renamed from: c */
    boolean f9625c;

    /* renamed from: d */
    public boolean f9626d;

    /* renamed from: e */
    private HashMap f9627e;

    static {
        Covode.recordClassIndex(3879);
    }

    @Override // com.bytedance.android.live.broadcast.p182a.AbstractC3007b
    /* renamed from: a */
    public final View mo8167a(int i) {
        if (this.f9627e == null) {
            this.f9627e = new HashMap();
        }
        View view = (View) this.f9627e.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f9627e.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.bytedance.android.live.broadcast.p182a.AbstractC3007b
    /* renamed from: a */
    public final void mo8168a() {
        HashMap hashMap = this.f9627e;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.android.live.broadcast.p182a.AbstractC3007b, com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo8168a();
    }

    /* renamed from: a */
    private final void m8827a(C3260f fVar) {
        if (TTliveStartGiftConfigSetting.INSTANCE.getValue() && fVar != null) {
            this.f9623a = fVar.f9326a;
            this.f9626d = fVar.mo8600a();
            this.f9625c = fVar.mo8601b();
            this.f9624b = fVar.f9331f;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.b.c$d */
    static final class View$OnClickListenerC3399d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C3395c f9631a;

        static {
            Covode.recordClassIndex(3883);
        }

        View$OnClickListenerC3399d(C3395c cVar) {
            this.f9631a = cVar;
        }

        public final void onClick(View view) {
            C6805b<Boolean> bVar = AbstractC6804a.f17003bz;
            C89219l.m154716b(bVar, "");
            C6806c.m14603a((C6800c) bVar, (Object) false);
            DataChannel a = C17846f.m33055a(this.f9631a);
            if (a != null) {
                a.mo28315b(C9136r.class, C9137s.m17357b(EnumC9135q.MODERATOR_LIST));
            }
            C11279p.m20006a(this.f9631a.mo8167a(R.id.cl6));
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.b.c$f */
    static final class C3403f<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C3395c f9635a;

        static {
            Covode.recordClassIndex(3887);
        }

        C3403f(C3395c cVar) {
            this.f9635a = cVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            LiveTextView liveTextView;
            C3265j jVar = (C3265j) obj;
            Context context = this.f9635a.getContext();
            if (context != null && (liveTextView = (LiveTextView) this.f9635a.mo8167a(R.id.ai7)) != null) {
                C89219l.m154716b(jVar, "");
                C89219l.m154716b(context, "");
                liveTextView.setText(C3395c.m8826a(jVar, context));
            }
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.b.c$g */
    static final class C3404g extends AbstractC89220m implements AbstractC89172b<C3265j, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C3395c f9636a;

        static {
            Covode.recordClassIndex(3888);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3404g(C3395c cVar) {
            super(1);
            this.f9636a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C3265j jVar) {
            LiveTextView liveTextView;
            C3265j jVar2 = jVar;
            C89219l.m154721d(jVar2, "");
            Context context = this.f9636a.getContext();
            if (!(context == null || (liveTextView = (LiveTextView) this.f9636a.mo8167a(R.id.ai7)) == null)) {
                C89219l.m154716b(context, "");
                liveTextView.setText(C3395c.m8826a(jVar2, context));
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.b.c$h */
    static final class View$OnClickListenerC3405h implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C3395c f9637a;

        static {
            Covode.recordClassIndex(3889);
        }

        View$OnClickListenerC3405h(C3395c cVar) {
            this.f9637a = cVar;
        }

        public final void onClick(View view) {
            C6805b<Boolean> bVar = AbstractC6804a.f16961bJ;
            C89219l.m154716b(bVar, "");
            C6806c.m14603a((C6800c) bVar, (Object) false);
            DataChannel a = C17846f.m33055a(this.f9637a);
            if (a != null) {
                a.mo28315b(C9136r.class, C9137s.m17357b(EnumC9135q.TEMPORARY_MUTE));
            }
            C11279p.m20006a(this.f9637a.mo8167a(R.id.efk));
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.b.c$c */
    static final class View$OnClickListenerC3398c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C3395c f9630a;

        static {
            Covode.recordClassIndex(3882);
        }

        View$OnClickListenerC3398c(C3395c cVar) {
            this.f9630a = cVar;
        }

        public final void onClick(View view) {
            DataChannel a = C17846f.m33055a(this.f9630a);
            if (a != null) {
                a.mo28319c(C3242h.class);
            }
            DialogInterface$OnCancelListenerC0944d a2 = C3377aj.m8813a(true);
            if (a2 != null) {
                C4031a.m9839a(C11279p.m20001a(this.f9630a.getContext()), a2);
            }
            C6805b<Boolean> bVar = AbstractC6804a.f17015cK;
            C89219l.m154716b(bVar, "");
            C6806c.m14603a((C6800c) bVar, (Object) false);
            C11279p.m20006a(this.f9630a.mo8167a(R.id.bpo));
            C6501b.C6502a.m13948a("livesdk_room_detail_setting").mo12639a().mo12661f("click").mo12655b();
        }
    }

    /* renamed from: b */
    public final void mo8710b(boolean z) {
        String str;
        EnumC11728i iVar;
        C89378p[] pVarArr = new C89378p[3];
        if (z) {
            str = "open";
        } else {
            str = "close";
        }
        pVarArr[0] = C89387v.m154943a("send_gift_type", str);
        DataChannel a = C17846f.m33055a(this);
        if (a == null || (iVar = (EnumC11728i) a.mo28318b(C3802x.class)) == null) {
            iVar = EnumC11728i.VIDEO;
        }
        pVarArr[1] = C89387v.m154943a("live_type", C11729j.m20684a(iVar));
        AbstractC6872f b = C11115u.m19743a().mo17915b();
        C89219l.m154716b(b, "");
        pVarArr[2] = C89387v.m154943a("anchor_id", String.valueOf(b.mo13161c()));
        C6501b.C6502a.m13948a("anchor_click_gift_icon").mo12639a().mo12658d("start_broadcast").mo12660e("start_broadcast").mo12654b("live").mo12656c("click").mo12652a((Map<String, String>) C89041ag.m154428c(pVarArr)).mo12655b();
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.b.c$e */
    static final class View$OnClickListenerC3400e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C3395c f9632a;

        static {
            Covode.recordClassIndex(3884);
        }

        View$OnClickListenerC3400e(C3395c cVar) {
            this.f9632a = cVar;
        }

        public final void onClick(View view) {
            AbstractC6872f b = C11115u.m19743a().mo17915b();
            C89219l.m154716b(b, "");
            AbstractC2994b a = b.mo13147a();
            C89219l.m154716b(a, "");
            if (a.getSecret() == 1) {
                LiveSwitch liveSwitch = (LiveSwitch) this.f9632a.mo8167a(R.id.deb);
                C89219l.m154716b(liveSwitch, "");
                if (!liveSwitch.isChecked()) {
                    DialogC9148b.C9149a b2 = new DialogC9148b.C9149a(this.f9632a.getContext()).mo15243a(R.string.e5e).mo15248b(R.string.e5h).mo15244a(R.string.eaf, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener(this) {
                        /* class com.bytedance.android.live.broadcast.preview.p201b.C3395c.View$OnClickListenerC3400e.DialogInterface$OnClickListenerC34011 */

                        /* renamed from: a */
                        final /* synthetic */ View$OnClickListenerC3400e f9633a;

                        static {
                            Covode.recordClassIndex(3885);
                        }

                        {
                            this.f9633a = r1;
                        }

                        public final void onClick(DialogInterface dialogInterface, int i) {
                            dialogInterface.dismiss();
                            this.f9633a.f9632a.mo8709a(true);
                            this.f9633a.f9632a.mo8708a("livesdk_turn_on_ranking_popup_click").mo12651a("button_click_type", "turn_on").mo12655b();
                        }
                    }, false).mo15249b(R.string.e5g, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener(this) {
                        /* class com.bytedance.android.live.broadcast.preview.p201b.C3395c.View$OnClickListenerC3400e.DialogInterface$OnClickListenerC34022 */

                        /* renamed from: a */
                        final /* synthetic */ View$OnClickListenerC3400e f9634a;

                        static {
                            Covode.recordClassIndex(3886);
                        }

                        {
                            this.f9634a = r1;
                        }

                        public final void onClick(DialogInterface dialogInterface, int i) {
                            dialogInterface.dismiss();
                            this.f9634a.f9632a.mo8708a("livesdk_turn_on_ranking_popup_click").mo12651a("button_click_type", "cancel").mo12655b();
                        }
                    }, false);
                    b2.f22256m = false;
                    b2.mo15247a().show();
                    this.f9632a.mo8708a("livesdk_turn_on_ranking_popup_show").mo12655b();
                    return;
                }
            }
            C3395c cVar = this.f9632a;
            LiveSwitch liveSwitch2 = (LiveSwitch) cVar.mo8167a(R.id.deb);
            C89219l.m154716b(liveSwitch2, "");
            cVar.mo8709a(!liveSwitch2.isChecked());
        }
    }

    /* renamed from: a */
    public final C6501b mo8708a(String str) {
        return C6501b.C6502a.m13948a(str).mo12643a(C17846f.m33055a(this)).mo12651a("enter_from", "live_take_page").mo12651a("user_type", "anchor");
    }

    /* renamed from: a */
    public final void mo8709a(boolean z) {
        int i;
        String str;
        ((LiveSwitch) mo8167a(R.id.deb)).toggle();
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        this.f9624b = i;
        DataChannel a = C17846f.m33055a(this);
        if (a != null) {
            a.mo28315b(C3013ae.class, Integer.valueOf(this.f9624b));
        }
        C6501b a2 = mo8708a("livesdk_live_rankings_setting_click");
        if (z) {
            str = "open";
        } else {
            str = "close";
        }
        a2.mo12651a("ranking_status", str).mo12655b();
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.b.c$j */
    static final class DialogInterface$OnClickListenerC3407j implements DialogInterface.OnClickListener {

        /* renamed from: a */
        public static final DialogInterface$OnClickListenerC3407j f9639a = new DialogInterface$OnClickListenerC3407j();

        static {
            Covode.recordClassIndex(3891);
        }

        DialogInterface$OnClickListenerC3407j() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C89219l.m154721d(dialogInterface, "");
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.b.c$a */
    static final class C3396a implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ C3395c f9628a;

        static {
            Covode.recordClassIndex(3880);
        }

        C3396a(C3395c cVar) {
            this.f9628a = cVar;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            int i;
            String str;
            C3395c cVar = this.f9628a;
            DataChannel a = C17846f.m33055a(cVar);
            if (a != null) {
                a.mo28315b(C3226e.class, Boolean.valueOf(z));
            }
            BlockWordView blockWordView = (BlockWordView) cVar.mo8167a(R.id.tb);
            C89219l.m154716b(blockWordView, "");
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            blockWordView.setVisibility(i);
            if (!z) {
                ((BlockWordView) cVar.mo8167a(R.id.tb)).mo8250a();
            }
            C89378p[] pVarArr = new C89378p[2];
            if (z) {
                str = "open";
            } else {
                str = "close";
            }
            pVarArr[0] = C89387v.m154943a("status", str);
            pVarArr[1] = C89387v.m154943a("situation", "comment_setting");
            C6501b.C6502a.m13948a("livesdk_set_comment_status").mo12639a().mo12658d("live_take_page").mo12652a((Map<String, String>) C89041ag.m154428c(pVarArr)).mo12655b();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.b.c$i */
    static final class DialogInterface$OnClickListenerC3406i implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C3395c f9638a;

        static {
            Covode.recordClassIndex(3890);
        }

        DialogInterface$OnClickListenerC3406i(C3395c cVar) {
            this.f9638a = cVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C89219l.m154721d(dialogInterface, "");
            dialogInterface.dismiss();
            String value = LiveSdkAppealWebviewSetting.INSTANCE.getValue();
            if (value == null || value.length() <= 0) {
                AbstractC2953a a = C6193a.m13435a(IHostApp.class);
                C89219l.m154716b(a, "");
                if (((IHostApp) a).isInMusicallyRegion()) {
                    value = "sslocal://webcast_webview?url=https%3A%2F%2Fwebcast-va.tiktokv.com%2Ffalcon%2Fwebcast_mt%2Fpage%2Fappeal%2Findex.html&type=fullscreen&title=&hide_more=0&hide_nav_bar=1&hide_status_bar=0";
                } else {
                    value = "sslocal://webcast_webview?url=https%3A%2F%2Fwebcast.tiktokv.com%2Ffalcon%2Fwebcast_mt%2Fpage%2Fappeal%2Findex.html&type=fullscreen&title=&hide_more=0&hide_nav_bar=1&hide_status_bar=0";
                }
            }
            ((IActionHandlerService) C6193a.m13435a(IActionHandlerService.class)).handle(this.f9638a.getContext(), value);
            C6501b a2 = C6501b.C6502a.m13948a("livesdk_anchor_click_contact_us").mo12639a();
            AbstractC6872f b = C11115u.m19743a().mo17915b();
            C89219l.m154716b(b, "");
            a2.mo12646a("user_id", b.mo13161c()).mo12655b();
        }
    }

    /* renamed from: a */
    public static String m8826a(C3265j jVar, Context context) {
        if (jVar.f9352a == -1) {
            String string = context.getString(R.string.ee1);
            C89219l.m154716b(string, "");
            return string;
        } else if (jVar.f9352a < 60) {
            String quantityString = context.getResources().getQuantityString(R.plurals.gd, (int) jVar.f9352a, Integer.valueOf((int) jVar.f9352a));
            C89219l.m154716b(quantityString, "");
            return quantityString;
        } else {
            Resources resources = context.getResources();
            int i = (int) (jVar.f9352a / 60);
            String quantityString2 = resources.getQuantityString(R.plurals.gc, i, Integer.valueOf(i));
            C89219l.m154716b(quantityString2, "");
            return quantityString2;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.b.c$b */
    static final class C3397b implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ C3395c f9629a;

        static {
            Covode.recordClassIndex(3881);
        }

        C3397b(C3395c cVar) {
            this.f9629a = cVar;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (!z) {
                this.f9629a.f9626d = false;
                this.f9629a.mo8710b(false);
            } else if (this.f9629a.f9623a == 5) {
                LiveSwitch liveSwitch = (LiveSwitch) this.f9629a.mo8167a(R.id.b_z);
                C89219l.m154716b(liveSwitch, "");
                liveSwitch.setChecked(false);
                C3395c cVar = this.f9629a;
                String string = cVar.getString(R.string.gin);
                C89219l.m154716b(string, "");
                String a = C1764a.m5928a(string, Arrays.copyOf(new Object[]{LowAgeAnchorLimitSetting.INSTANCE.getValue()}, 1));
                C89219l.m154716b(a, "");
                DialogC9148b.C9149a aVar = new DialogC9148b.C9149a(cVar.getContext());
                aVar.f22256m = true;
                aVar.f22245b = a;
                aVar.mo15244a(R.string.gjt, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC3406i(cVar), false).mo15249b(R.string.gju, (DialogInterface.OnClickListener) DialogInterface$OnClickListenerC3407j.f9639a, false).mo15247a().show();
            } else {
                this.f9629a.f9626d = true;
                this.f9629a.mo8710b(true);
            }
            if (this.f9629a.f9623a != 1) {
                DataChannel a2 = C17846f.m33055a(this.f9629a);
                if (a2 != null) {
                    a2.mo28315b(C3250l.class, Integer.valueOf(this.f9629a.f9623a));
                }
            } else if (this.f9629a.f9626d) {
                DataChannel a3 = C17846f.m33055a(this.f9629a);
                if (a3 != null) {
                    a3.mo28315b(C3250l.class, (Object) 1);
                }
            } else {
                DataChannel a4 = C17846f.m33055a(this.f9629a);
                if (a4 != null) {
                    a4.mo28315b(C3250l.class, (Object) 2);
                }
            }
        }
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C3260f fVar;
        String str;
        AbstractC2994b a;
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        DataChannel a2 = C17846f.m33055a(this);
        C3260f fVar2 = null;
        if (a2 != null) {
            fVar = (C3260f) a2.mo28318b(C3184c.class);
        } else {
            fVar = null;
        }
        m8827a(fVar);
        BlockWordView blockWordView = (BlockWordView) mo8167a(R.id.tb);
        AbstractC6872f b = C11115u.m19743a().mo17915b();
        if (b == null || (a = b.mo13147a()) == null || (str = a.getSecUid()) == null) {
            str = "";
        }
        blockWordView.mo8256a(true, str, 0L, "live_take_page");
        LinearLayout linearLayout = (LinearLayout) mo8167a(R.id.a9g);
        C89219l.m154716b(linearLayout, "");
        linearLayout.setVisibility(0);
        ((LiveSwitch) mo8167a(R.id.a9h)).setOnCheckedChangeListener(new C3396a(this));
        DataChannel a3 = C17846f.m33055a(this);
        if (a3 != null) {
            fVar2 = (C3260f) a3.mo28318b(C3184c.class);
        }
        m8827a(fVar2);
        if (this.f9625c) {
            LinearLayout linearLayout2 = (LinearLayout) mo8167a(R.id.b_y);
            C89219l.m154716b(linearLayout2, "");
            linearLayout2.setVisibility(0);
            LiveSwitch liveSwitch = (LiveSwitch) mo8167a(R.id.b_z);
            C89219l.m154716b(liveSwitch, "");
            liveSwitch.setChecked(this.f9626d);
            ((LiveSwitch) mo8167a(R.id.b_z)).setOnCheckedChangeListener(new C3397b(this));
        }
        C6805b<Boolean> bVar = AbstractC6804a.f17003bz;
        C89219l.m154716b(bVar, "");
        Boolean a4 = bVar.mo13066a();
        C89219l.m154716b(a4, "");
        if (a4.booleanValue()) {
            C11279p.m20017b(mo8167a(R.id.cl6));
        }
        ((LinearLayout) mo8167a(R.id.cl5)).setOnClickListener(new View$OnClickListenerC3399d(this));
        if (this.f9624b == 0) {
            ConstraintLayout constraintLayout = (ConstraintLayout) mo8167a(R.id.ded);
            C89219l.m154716b(constraintLayout, "");
            constraintLayout.setVisibility(8);
        } else {
            ConstraintLayout constraintLayout2 = (ConstraintLayout) mo8167a(R.id.ded);
            C89219l.m154716b(constraintLayout2, "");
            constraintLayout2.setVisibility(0);
            LiveSwitch liveSwitch2 = (LiveSwitch) mo8167a(R.id.deb);
            C89219l.m154716b(liveSwitch2, "");
            boolean z = true;
            if (this.f9624b != 1) {
                z = false;
            }
            liveSwitch2.setChecked(z);
            ((FrameLayout) mo8167a(R.id.dee)).setOnClickListener(new View$OnClickListenerC3400e(this));
        }
        DataChannel a5 = C17846f.m33055a(this);
        if (a5 != null) {
            a5.mo28315b(C3013ae.class, Integer.valueOf(this.f9624b));
        }
        C6805b<Boolean> bVar2 = AbstractC6804a.f16961bJ;
        C89219l.m154716b(bVar2, "");
        Boolean a6 = bVar2.mo13066a();
        C89219l.m154716b(a6, "");
        if (a6.booleanValue()) {
            C11279p.m20017b(mo8167a(R.id.efk));
        }
        register(((AbstractC6103e) C6193a.m13435a(AbstractC6103e.class)).getMuteDuration().mo142929d(new C3403f(this)));
        DataChannelGlobal.f42558d.mo28322a(this, this, C9070ci.class, new C3404g(this));
        ((LinearLayout) mo8167a(R.id.efj)).setOnClickListener(new View$OnClickListenerC3405h(this));
        if (BroadcastLiveAnchorIntroSetting.INSTANCE.enable()) {
            LinearLayout linearLayout3 = (LinearLayout) mo8167a(R.id.bpl);
            C89219l.m154716b(linearLayout3, "");
            linearLayout3.setVisibility(0);
            C6805b<Boolean> bVar3 = AbstractC6804a.f17015cK;
            C89219l.m154716b(bVar3, "");
            Boolean a7 = bVar3.mo13066a();
            C89219l.m154716b(a7, "");
            if (a7.booleanValue()) {
                C11279p.m20017b(mo8167a(R.id.bpo));
            }
            C6501b.C6502a.m13948a("livesdk_room_detail_setting").mo12639a().mo12661f("show").mo12655b();
            ((LinearLayout) mo8167a(R.id.bpl)).setOnClickListener(new View$OnClickListenerC3398c(this));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.b90, viewGroup, false);
    }
}
