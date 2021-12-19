package com.bytedance.android.live.broadcast.preview.widget;

import android.view.View;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.AbstractC2994b;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.C3011ac;
import com.bytedance.android.live.broadcast.C3237g;
import com.bytedance.android.live.broadcast.C3738v;
import com.bytedance.android.live.broadcast.C3802x;
import com.bytedance.android.live.broadcast.model.C3272o;
import com.bytedance.android.live.broadcast.widget.RunnableC3786g;
import com.bytedance.android.live.broadcast.widget.RunnableC3787h;
import com.bytedance.android.live.broadcast.widget.View$OnClickListenerC3783e;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.p408u.C6203g;
import com.bytedance.android.livesdk.event.C8459l;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.p561j.C9094df;
import com.bytedance.android.livesdk.p643ui.C10935a;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdkapi.depend.model.live.C11729j;
import com.bytedance.android.livesdkapi.depend.model.live.EnumC11728i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

public final class PreviewCoverWidget extends LiveWidget implements AbstractC33974au {

    /* renamed from: a */
    public View$OnClickListenerC3783e f9930a;

    /* renamed from: b */
    final C10935a f9931b;

    static {
        Covode.recordClassIndex(4082);
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.bgh;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        super.onCreate();
        C6203g.f15476a.post(new RunnableC3591c(this), this);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        super.onDestroy();
        View$OnClickListenerC3783e eVar = this.f9930a;
        if (eVar != null) {
            if (eVar.f10491d != null) {
                eVar.f10491d.mo11515b();
                eVar.f10491d = null;
            }
            eVar.f10492e = null;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.widget.PreviewCoverWidget$c */
    static final class RunnableC3591c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ PreviewCoverWidget f9935a;

        static {
            Covode.recordClassIndex(4085);
        }

        RunnableC3591c(PreviewCoverWidget previewCoverWidget) {
            this.f9935a = previewCoverWidget;
        }

        public final void run() {
            HSImageView hSImageView;
            PreviewCoverWidget previewCoverWidget = this.f9935a;
            View$OnClickListenerC3783e eVar = new View$OnClickListenerC3783e(previewCoverWidget.getView(), previewCoverWidget.f9931b, previewCoverWidget.dataChannel);
            View view = previewCoverWidget.getView();
            if (!(view == null || (hSImageView = (HSImageView) view.findViewById(R.id.ca_)) == null)) {
                hSImageView.setImageResource(R.drawable.bus);
                hSImageView.setOnClickListener(new View$OnClickListenerC3589a(eVar, previewCoverWidget));
            }
            DataChannel dataChannel = previewCoverWidget.dataChannel;
            if (dataChannel != null) {
                dataChannel.mo28315b(C3738v.class, eVar);
            }
            DataChannel dataChannel2 = previewCoverWidget.dataChannel;
            if (dataChannel2 != null) {
                dataChannel2.mo28313b((AbstractC1204m) previewCoverWidget, C9094df.class, (AbstractC89172b) new C3590b(eVar));
            }
            previewCoverWidget.f9930a = eVar;
        }
    }

    public PreviewCoverWidget(C10935a aVar) {
        C89219l.m154721d(aVar, "");
        this.f9931b = aVar;
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.widget.PreviewCoverWidget$a */
    static final class View$OnClickListenerC3589a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC3783e f9932a;

        /* renamed from: b */
        final /* synthetic */ PreviewCoverWidget f9933b;

        static {
            Covode.recordClassIndex(4083);
        }

        View$OnClickListenerC3589a(View$OnClickListenerC3783e eVar, PreviewCoverWidget previewCoverWidget) {
            this.f9932a = eVar;
            this.f9933b = previewCoverWidget;
        }

        public final void onClick(View view) {
            String str;
            EnumC11728i iVar;
            DataChannel dataChannel = this.f9933b.dataChannel;
            if (dataChannel != null) {
                dataChannel.mo28319c(C3011ac.class);
            }
            this.f9932a.mo9121b();
            DataChannel dataChannel2 = this.f9933b.dataChannel;
            C6501b c = C6501b.C6502a.m13948a("livesdk_cover_modify_click").mo12656c("click");
            if (dataChannel2 == null || (iVar = (EnumC11728i) dataChannel2.mo28318b(C3802x.class)) == null) {
                str = null;
            } else {
                str = C11729j.m20684a(iVar);
            }
            c.mo12651a("live_type", str).mo12655b();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.widget.PreviewCoverWidget$b */
    static final class C3590b extends AbstractC89220m implements AbstractC89172b<C3272o, C89391z> {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC3783e f9934a;

        static {
            Covode.recordClassIndex(4084);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3590b(View$OnClickListenerC3783e eVar) {
            super(1);
            this.f9934a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C3272o oVar) {
            C3272o oVar2 = oVar;
            C89219l.m154721d(oVar2, "");
            View$OnClickListenerC3783e eVar = this.f9934a;
            int i = (int) oVar2.f9367b;
            ImageModel imageModel = oVar2.f9366a;
            boolean z = oVar2.f9377l;
            if (imageModel != null) {
                eVar.f10496i = View$OnClickListenerC3783e.m9353a(imageModel);
            }
            boolean z2 = true;
            if (i == 0 || i == 1) {
                eVar.f10489b.setAlpha(1.0f);
                C6203g.m13462a(new RunnableC3786g(eVar, imageModel));
                if (z) {
                    eVar.f10494g.mo28311a(C3237g.class, "head");
                } else {
                    eVar.f10494g.mo28311a(C3237g.class, "last_cover");
                }
                eVar.f10495h = z;
            } else {
                AbstractC2994b a = C11115u.m19743a().mo17915b().mo13147a();
                if (a instanceof User) {
                    C6203g.m13462a(new RunnableC3787h(eVar, a));
                    eVar.f10489b.setAlpha(1.0f);
                    eVar.f10496i = View$OnClickListenerC3783e.m9353a(a.getAvatarThumb());
                    eVar.f10494g.mo28311a(C3237g.class, "head");
                    eVar.f10495h = true;
                }
                z2 = false;
            }
            C8459l lVar = new C8459l();
            lVar.f20911a = 2;
            lVar.f20912b = z2;
            C6779a.m14563a().mo13053a(lVar);
            return C89391z.f203057a;
        }
    }
}
