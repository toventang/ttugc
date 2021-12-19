package com.bytedance.android.live.broadcast.preview.widget;

import android.view.View;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.design.view.C4081a;
import com.bytedance.android.live.design.view.C4097j;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.p248g.AbstractC4323a;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.model.GameTag;
import com.bytedance.android.livesdk.p452ao.AbstractC6804a;
import com.bytedance.android.livesdk.p452ao.C6805b;
import com.bytedance.android.livesdk.p561j.C9079cr;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.trill.R;
import java.util.Map;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

public final class PreviewSelectGameCategoryWidget extends LiveWidget implements AbstractC33974au {

    /* renamed from: a */
    public long f9980a;

    /* renamed from: b */
    private LiveTextView f9981b;

    static {
        Covode.recordClassIndex(4113);
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.bck;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.android.widget.Widget
    public final void hide() {
        super.hide();
        C4097j.m9928a(this.f9980a);
    }

    @Override // com.bytedance.android.widget.Widget
    public final void show() {
        super.show();
        View view = getView();
        if (view != null) {
            view.post(new RunnableC3611c(this));
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.widget.PreviewSelectGameCategoryWidget$c */
    static final class RunnableC3611c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ PreviewSelectGameCategoryWidget f9984a;

        static {
            Covode.recordClassIndex(4116);
        }

        RunnableC3611c(PreviewSelectGameCategoryWidget previewSelectGameCategoryWidget) {
            this.f9984a = previewSelectGameCategoryWidget;
        }

        public final void run() {
            C6805b<Map<String, String>> bVar = AbstractC6804a.f17017cM;
            C89219l.m154716b(bVar, "");
            Map<String, String> a = bVar.mo13066a();
            if (a == null || a.isEmpty()) {
                C4097j.m9928a(this.f9984a.f9980a);
                C4081a.C4082a aVar = new C4081a.C4082a(this.f9984a.getView());
                aVar.f11288a = C3966y.m9657a((int) R.string.e9x);
                C4081a a2 = ((C4081a.C4082a) aVar.mo9559d().mo9554a(-1)).mo9530b();
                this.f9984a.f9980a = C4097j.m9924a(a2);
            }
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        super.onCreate();
        View findViewById = findViewById(R.id.ewj);
        String str = "";
        C89219l.m154716b(findViewById, str);
        this.f9981b = (LiveTextView) findViewById;
        View view = getView();
        if (view != null) {
            view.setOnClickListener(new View$OnClickListenerC3609a(this));
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.mo28313b((AbstractC1204m) this, C9079cr.class, (AbstractC89172b) new C3610b(this));
        }
        C6805b<Map<String, String>> bVar = AbstractC6804a.f17017cM;
        C89219l.m154716b(bVar, str);
        GameTag a = GameTag.C9511a.m17802a(bVar.mo13066a());
        if (a != null) {
            String str2 = a.showName;
            if (str2 != null) {
                str = str2;
            }
            mo8899a(str);
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.widget.PreviewSelectGameCategoryWidget$a */
    static final class View$OnClickListenerC3609a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PreviewSelectGameCategoryWidget f9982a;

        static {
            Covode.recordClassIndex(4114);
        }

        View$OnClickListenerC3609a(PreviewSelectGameCategoryWidget previewSelectGameCategoryWidget) {
            this.f9982a = previewSelectGameCategoryWidget;
        }

        public final void onClick(View view) {
            AbstractC0952i iVar;
            AbstractC4323a aVar = (AbstractC4323a) C6193a.m13435a(AbstractC4323a.class);
            ActivityC0945e a = C11279p.m20001a(this.f9982a.getContext());
            if (a != null) {
                iVar = a.getSupportFragmentManager();
            } else {
                iVar = null;
            }
            aVar.showGameCategoryListDialog(iVar);
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.widget.PreviewSelectGameCategoryWidget$b */
    static final class C3610b extends AbstractC89220m implements AbstractC89172b<GameTag, C89391z> {

        /* renamed from: a */
        final /* synthetic */ PreviewSelectGameCategoryWidget f9983a;

        static {
            Covode.recordClassIndex(4115);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3610b(PreviewSelectGameCategoryWidget previewSelectGameCategoryWidget) {
            super(1);
            this.f9983a = previewSelectGameCategoryWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(GameTag gameTag) {
            GameTag gameTag2 = gameTag;
            String str = "";
            C89219l.m154721d(gameTag2, str);
            PreviewSelectGameCategoryWidget previewSelectGameCategoryWidget = this.f9983a;
            String str2 = gameTag2.showName;
            if (str2 != null) {
                str = str2;
            }
            previewSelectGameCategoryWidget.mo8899a(str);
            C4097j.m9928a(this.f9983a.f9980a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final void mo8899a(String str) {
        if (str.length() > 0) {
            LiveTextView liveTextView = this.f9981b;
            if (liveTextView == null) {
                C89219l.m154710a("tvGameName");
            }
            liveTextView.setText(str);
        }
    }
}
