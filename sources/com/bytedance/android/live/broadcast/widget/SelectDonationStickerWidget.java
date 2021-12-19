package com.bytedance.android.live.broadcast.widget;

import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.broadcast.model.C3272o;
import com.bytedance.android.live.core.widget.C4031a;
import com.bytedance.android.livesdk.chatroom.p488c.C7377aj;
import com.bytedance.android.livesdk.chatroom.p499ui.View$OnClickListenerC7876cy;
import com.bytedance.android.livesdk.model.C9537au;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.p561j.C9094df;
import com.bytedance.android.livesdk.p561j.C9102dn;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.trill.R;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

public final class SelectDonationStickerWidget extends LiveWidget implements AbstractC33974au {

    /* renamed from: a */
    TextView f10409a;

    /* renamed from: b */
    boolean f10410b;

    /* renamed from: c */
    boolean f10411c;

    /* renamed from: d */
    private final C88411a f10412d = new C88411a();

    /* renamed from: e */
    private C9537au f10413e;

    static {
        Covode.recordClassIndex(4285);
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.bfu;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.android.widget.Widget
    public final void hide() {
        super.hide();
        this.f10411c = true;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        super.onDestroy();
        this.f10412d.mo142944a();
    }

    @Override // com.bytedance.android.widget.Widget
    public final void show() {
        if (this.f10410b) {
            super.show();
        }
        this.f10411c = false;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        TextView textView;
        super.onCreate();
        View view = getView();
        if (view != null) {
            textView = (TextView) view.findViewById(R.id.ani);
        } else {
            textView = null;
        }
        this.f10409a = textView;
        View view2 = getView();
        if (view2 != null) {
            view2.setVisibility(8);
        }
        this.f10412d.mo142945a(C6779a.m14563a().mo13052a(C7377aj.class).mo143289d(new C3763a(this)));
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.mo28313b((AbstractC1204m) this, C9094df.class, (AbstractC89172b) new C3764b(this));
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.widget.SelectDonationStickerWidget$a */
    static final class C3763a<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ SelectDonationStickerWidget f10414a;

        static {
            Covode.recordClassIndex(4286);
        }

        C3763a(SelectDonationStickerWidget selectDonationStickerWidget) {
            this.f10414a = selectDonationStickerWidget;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C7377aj ajVar = (C7377aj) obj;
            if (ajVar instanceof C7377aj) {
                this.f10414a.onEvent(ajVar);
            }
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.widget.SelectDonationStickerWidget$c */
    static final class View$OnClickListenerC3765c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SelectDonationStickerWidget f10416a;

        static {
            Covode.recordClassIndex(4288);
        }

        View$OnClickListenerC3765c(SelectDonationStickerWidget selectDonationStickerWidget) {
            this.f10416a = selectDonationStickerWidget;
        }

        public final void onClick(View view) {
            C4031a.m9839a(C11279p.m20001a(this.f10416a.getContext()), new View$OnClickListenerC7876cy());
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.widget.SelectDonationStickerWidget$b */
    static final class C3764b extends AbstractC89220m implements AbstractC89172b<C3272o, C89391z> {

        /* renamed from: a */
        final /* synthetic */ SelectDonationStickerWidget f10415a;

        static {
            Covode.recordClassIndex(4287);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3764b(SelectDonationStickerWidget selectDonationStickerWidget) {
            super(1);
            this.f10415a = selectDonationStickerWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C3272o oVar) {
            int i;
            C3272o oVar2 = oVar;
            C89219l.m154721d(oVar2, "");
            SelectDonationStickerWidget selectDonationStickerWidget = this.f10415a;
            View view = selectDonationStickerWidget.getView();
            if (view != null) {
                if (!oVar2.mo8625a() || selectDonationStickerWidget.f10411c) {
                    i = 8;
                } else {
                    i = 0;
                }
                view.setVisibility(i);
            }
            if (oVar2.mo8625a()) {
                selectDonationStickerWidget.f10410b = true;
                TextView textView = selectDonationStickerWidget.f10409a;
                if (textView != null) {
                    textView.setOnClickListener(new View$OnClickListenerC3765c(selectDonationStickerWidget));
                }
            }
            return C89391z.f203057a;
        }
    }

    public final void onEvent(C7377aj ajVar) {
        if (ajVar.f18289a != null && ajVar.f18290b != null) {
            this.f10413e = ajVar.f18289a;
            TextView textView = this.f10409a;
            if (textView != null) {
                textView.setText(ajVar.f18290b.f23145a);
            }
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel != null) {
                C9537au auVar = this.f10413e;
                if (auVar == null) {
                    C89219l.m154715b();
                }
                dataChannel.mo28315b(C9102dn.class, auVar);
            }
        }
    }
}
