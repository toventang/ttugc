package com.bytedance.android.livesdk.function;

import android.content.DialogInterface;
import android.view.View;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.base.AbstractC2953a;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.liveinteract.api.C4390ad;
import com.bytedance.android.live.liveinteract.api.C4441l;
import com.bytedance.android.live.p250i.p251a.AbstractC4357d;
import com.bytedance.android.live.p379n.AbstractC5777j;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.chatroom.p488c.C7399p;
import com.bytedance.android.livesdk.p561j.C9109du;
import com.bytedance.android.livesdk.p562k.DialogC9148b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.trill.R;
import org.json.JSONObject;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

public final class StreamInfoWidget extends LiveRecyclableWidget implements AbstractC33974au {

    /* renamed from: a */
    LiveTextView f21597a;

    /* renamed from: b */
    Object f21598b;

    static {
        Covode.recordClassIndex(9625);
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.bdc;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.AbstractC1202k, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onUnload() {
        hide();
        LiveTextView liveTextView = this.f21597a;
        if (liveTextView == null) {
            C89219l.m154710a("streamInfoTv");
        }
        liveTextView.setText("");
        this.f21598b = null;
    }

    /* renamed from: com.bytedance.android.livesdk.function.StreamInfoWidget$a */
    static final class C8750a extends AbstractC89220m implements AbstractC89172b<String, C89391z> {

        /* renamed from: a */
        final /* synthetic */ StreamInfoWidget f21599a;

        static {
            Covode.recordClassIndex(9626);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8750a(StreamInfoWidget streamInfoWidget) {
            super(1);
            this.f21599a = streamInfoWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(String str) {
            String str2 = str;
            C89219l.m154721d(str2, "");
            StreamInfoWidget streamInfoWidget = this.f21599a;
            streamInfoWidget.show();
            LiveTextView liveTextView = streamInfoWidget.f21597a;
            if (liveTextView == null) {
                C89219l.m154710a("streamInfoTv");
            }
            liveTextView.setText(str2);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.function.StreamInfoWidget$b */
    static final class C8751b extends AbstractC89220m implements AbstractC89172b<C7399p, C89391z> {

        /* renamed from: a */
        final /* synthetic */ StreamInfoWidget f21600a;

        static {
            Covode.recordClassIndex(9627);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8751b(StreamInfoWidget streamInfoWidget) {
            super(1);
            this.f21600a = streamInfoWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C7399p pVar) {
            C7399p pVar2 = pVar;
            C89219l.m154721d(pVar2, "");
            if (pVar2.f18332a == 8) {
                this.f21600a.hide();
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onInit(Object[] objArr) {
        View findViewById = findViewById(R.id.e_g);
        C89219l.m154716b(findViewById, "");
        this.f21597a = (LiveTextView) findViewById;
    }

    /* renamed from: com.bytedance.android.livesdk.function.StreamInfoWidget$d */
    static final class View$OnClickListenerC8753d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ StreamInfoWidget f21602a;

        static {
            Covode.recordClassIndex(9629);
        }

        View$OnClickListenerC8753d(StreamInfoWidget streamInfoWidget) {
            this.f21602a = streamInfoWidget;
        }

        public final void onClick(View view) {
            JSONObject jSONObject;
            StreamInfoWidget streamInfoWidget = this.f21602a;
            AbstractC2953a a = C6193a.m13435a(AbstractC4357d.class);
            C89219l.m154716b(a, "");
            AbstractC5777j a2 = ((AbstractC4357d) a).getLivePlayControllerManager().mo11548a();
            StringBuilder sb = new StringBuilder();
            StringBuilder append = sb.append("duration: \n").append(String.valueOf(streamInfoWidget.f21598b)).append("\nstream info:\n");
            if (a2 != null) {
                jSONObject = a2.mo11543e();
            } else {
                jSONObject = null;
            }
            append.append(String.valueOf(jSONObject));
            DialogC9148b.C9149a aVar = new DialogC9148b.C9149a(streamInfoWidget.context);
            aVar.f22244a = "Stream Info";
            aVar.f22245b = sb.toString();
            aVar.f22258o = true;
            aVar.mo15250b((CharSequence) "Confirm", (DialogInterface.OnClickListener) DialogInterface$OnClickListenerC8754e.f21603a, false).mo15245a((CharSequence) "Cancel", (DialogInterface.OnClickListener) DialogInterface$OnClickListenerC8755f.f21604a, false).mo15247a().show();
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onLoad(Object[] objArr) {
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.mo28309a((AbstractC1204m) this, C4390ad.class, (AbstractC89172b) new C8750a(this));
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            dataChannel2.mo28309a((AbstractC1204m) this, C4441l.class, (AbstractC89172b) new C8751b(this)).mo28309a((AbstractC1204m) this, C9109du.class, (AbstractC89172b) new C8752c(this));
        }
        View view = getView();
        if (view != null) {
            view.setBackgroundDrawable(C3966y.m9665c(R.color.a6));
        }
        LiveTextView liveTextView = this.f21597a;
        if (liveTextView == null) {
            C89219l.m154710a("streamInfoTv");
        }
        liveTextView.setOnClickListener(new View$OnClickListenerC8753d(this));
    }

    /* renamed from: com.bytedance.android.livesdk.function.StreamInfoWidget$c */
    static final class C8752c extends AbstractC89220m implements AbstractC89172b<Object, C89391z> {

        /* renamed from: a */
        final /* synthetic */ StreamInfoWidget f21601a;

        static {
            Covode.recordClassIndex(9628);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8752c(StreamInfoWidget streamInfoWidget) {
            super(1);
            this.f21601a = streamInfoWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Object obj) {
            JSONObject jSONObject;
            JSONObject e;
            C89219l.m154721d(obj, "");
            StreamInfoWidget streamInfoWidget = this.f21601a;
            streamInfoWidget.show();
            streamInfoWidget.f21598b = obj;
            String valueOf = String.valueOf(obj);
            AbstractC2953a a = C6193a.m13435a(AbstractC4357d.class);
            C89219l.m154716b(a, "");
            AbstractC5777j a2 = ((AbstractC4357d) a).getLivePlayControllerManager().mo11548a();
            if (a2 != null) {
                jSONObject = a2.mo11543e();
            } else {
                jSONObject = null;
            }
            C3854a.m9453a(4, "RoomPlayerTag", String.valueOf(jSONObject));
            if (!(a2 == null || (e = a2.mo11543e()) == null)) {
                String str = valueOf + "\nCodec_Type:" + e.optString("Codec_Type:") + "\nCodec_Name:" + e.optString("Codec_Name:") + "\nfirst_frame_time:" + e.optInt("first_frame_time:") + "\ndns_ip:" + e.optString("dns_ip:") + "\nresolution:" + e.optString("resolution:") + " \nurl:" + e.optString("url:") + "\n            ";
                LiveTextView liveTextView = streamInfoWidget.f21597a;
                if (liveTextView == null) {
                    C89219l.m154710a("streamInfoTv");
                }
                liveTextView.setText(str);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.function.StreamInfoWidget$e */
    static final class DialogInterface$OnClickListenerC8754e implements DialogInterface.OnClickListener {

        /* renamed from: a */
        public static final DialogInterface$OnClickListenerC8754e f21603a = new DialogInterface$OnClickListenerC8754e();

        static {
            Covode.recordClassIndex(9630);
        }

        DialogInterface$OnClickListenerC8754e() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C89219l.m154721d(dialogInterface, "");
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.function.StreamInfoWidget$f */
    static final class DialogInterface$OnClickListenerC8755f implements DialogInterface.OnClickListener {

        /* renamed from: a */
        public static final DialogInterface$OnClickListenerC8755f f21604a = new DialogInterface$OnClickListenerC8755f();

        static {
            Covode.recordClassIndex(9631);
        }

        DialogInterface$OnClickListenerC8755f() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C89219l.m154721d(dialogInterface, "");
            dialogInterface.dismiss();
        }
    }
}
