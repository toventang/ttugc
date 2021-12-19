package com.bytedance.android.livesdk.hashtag;

import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.AbstractC0952i;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.broadcast.model.C3272o;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.design.view.C4081a;
import com.bytedance.android.live.design.view.C4097j;
import com.bytedance.android.livesdk.hashtag.C8937f;
import com.bytedance.android.livesdk.model.C9518ae;
import com.bytedance.android.livesdk.model.GameTag;
import com.bytedance.android.livesdk.model.Hashtag;
import com.bytedance.android.livesdk.p450an.C6800c;
import com.bytedance.android.livesdk.p452ao.AbstractC6804a;
import com.bytedance.android.livesdk.p452ao.C6805b;
import com.bytedance.android.livesdk.p452ao.C6806c;
import com.bytedance.android.livesdk.p561j.C9021ao;
import com.bytedance.android.livesdk.p561j.C9023aq;
import com.bytedance.android.livesdk.p561j.C9079cr;
import com.bytedance.android.livesdk.p561j.C9094df;
import com.bytedance.android.livesdk.p620s.C10610a;
import com.bytedance.android.livesdkapi.depend.model.live.EnumC11728i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.trill.R;
import java.util.Map;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

public final class PreviewHashtagWidget extends LiveWidget implements AbstractC33974au {

    /* renamed from: c */
    public static final C8925a f21998c = new C8925a((byte) 0);

    /* renamed from: a */
    public TextView f21999a;

    /* renamed from: b */
    public EnumC11728i f22000b;

    static {
        Covode.recordClassIndex(9816);
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.bcm;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.bytedance.android.livesdk.hashtag.PreviewHashtagWidget$a */
    public static final class C8925a {
        static {
            Covode.recordClassIndex(9817);
        }

        private C8925a() {
        }

        public /* synthetic */ C8925a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        super.onCreate();
        C6805b<Boolean> bVar = AbstractC6804a.f17047cu;
        C89219l.m154716b(bVar, "");
        Boolean a = bVar.mo13066a();
        C89219l.m154716b(a, "");
        if (a.booleanValue()) {
            C4097j.m9924a(((C4081a.C4082a) new C4081a.C4082a(getView()).mo9527a(R.string.eaa).mo9557b(C3966y.m9653a(266.0f)).mo9558c()).mo9530b());
            C6805b<Boolean> bVar2 = AbstractC6804a.f17047cu;
            C89219l.m154716b(bVar2, "");
            C6806c.m14603a((C6800c) bVar2, (Object) false);
        }
        View findViewById = findViewById(R.id.eet);
        C89219l.m154716b(findViewById, "");
        TextView textView = (TextView) findViewById;
        this.f21999a = textView;
        if (textView == null) {
            C89219l.m154710a("tagName");
        }
        textView.setText(C3966y.m9657a((int) R.string.e5m));
        this.dataChannel.mo28309a((AbstractC1204m) this, C9094df.class, (AbstractC89172b) new C8927c(this)).mo28313b((AbstractC1204m) this, C9023aq.class, (AbstractC89172b) new C8928d(this));
        View view = getView();
        if (view != null) {
            view.setOnClickListener(new View$OnClickListenerC8929e(this));
        }
    }

    public PreviewHashtagWidget(EnumC11728i iVar) {
        this.f22000b = iVar;
    }

    /* renamed from: a */
    public static final /* synthetic */ TextView m17275a(PreviewHashtagWidget previewHashtagWidget) {
        TextView textView = previewHashtagWidget.f21999a;
        if (textView == null) {
            C89219l.m154710a("tagName");
        }
        return textView;
    }

    /* renamed from: com.bytedance.android.livesdk.hashtag.PreviewHashtagWidget$e */
    static final class View$OnClickListenerC8929e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PreviewHashtagWidget f22004a;

        static {
            Covode.recordClassIndex(9821);
        }

        View$OnClickListenerC8929e(PreviewHashtagWidget previewHashtagWidget) {
            this.f22004a = previewHashtagWidget;
        }

        public final void onClick(View view) {
            AbstractC0952i iVar = (AbstractC0952i) this.f22004a.dataChannel.mo28318b(C9021ao.class);
            if (iVar != null) {
                C8937f.C8938a.m17286a(iVar, "Preview", this.f22004a.f22000b);
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.hashtag.PreviewHashtagWidget$c */
    static final class C8927c extends AbstractC89220m implements AbstractC89172b<C3272o, C89391z> {

        /* renamed from: a */
        final /* synthetic */ PreviewHashtagWidget f22002a;

        static {
            Covode.recordClassIndex(9819);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8927c(PreviewHashtagWidget previewHashtagWidget) {
            super(1);
            this.f22002a = previewHashtagWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C3272o oVar) {
            C3272o oVar2 = oVar;
            C89219l.m154721d(oVar2, "");
            Long l = oVar2.f9378m;
            if (l != null && l.longValue() == 4) {
                this.f22002a.hide();
            }
            if (C10610a.m19180a(this.f22002a.dataChannel)) {
                PreviewHashtagWidget previewHashtagWidget = this.f22002a;
                previewHashtagWidget.dataChannel.mo28313b((AbstractC1204m) previewHashtagWidget, C9079cr.class, (AbstractC89172b) new C8926b(previewHashtagWidget));
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.hashtag.PreviewHashtagWidget$d */
    static final class C8928d extends AbstractC89220m implements AbstractC89172b<Hashtag, C89391z> {

        /* renamed from: a */
        final /* synthetic */ PreviewHashtagWidget f22003a;

        static {
            Covode.recordClassIndex(9820);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8928d(PreviewHashtagWidget previewHashtagWidget) {
            super(1);
            this.f22003a = previewHashtagWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Hashtag hashtag) {
            Hashtag hashtag2 = hashtag;
            C89219l.m154721d(hashtag2, "");
            if (C9518ae.m17826a(hashtag2)) {
                PreviewHashtagWidget.m17275a(this.f22003a).setText(hashtag2.title);
            } else {
                PreviewHashtagWidget.m17275a(this.f22003a).setText(C3966y.m9657a((int) R.string.e5m));
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.hashtag.PreviewHashtagWidget$b */
    static final class C8926b extends AbstractC89220m implements AbstractC89172b<GameTag, C89391z> {

        /* renamed from: a */
        final /* synthetic */ PreviewHashtagWidget f22001a;

        static {
            Covode.recordClassIndex(9818);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8926b(PreviewHashtagWidget previewHashtagWidget) {
            super(1);
            this.f22001a = previewHashtagWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(GameTag gameTag) {
            Hashtag hashtag;
            long j;
            GameTag gameTag2 = gameTag;
            String str = "";
            C89219l.m154721d(gameTag2, str);
            C6805b<Map<String, String>> bVar = AbstractC6804a.f17018cN;
            C89219l.m154716b(bVar, str);
            Map<String, String> a = bVar.mo13066a();
            if (a == null) {
                hashtag = null;
            } else {
                hashtag = new Hashtag(null, null, null, 7, null);
                String str2 = a.get("key_id");
                if (str2 != null) {
                    j = Long.parseLong(str2);
                } else {
                    j = 0;
                }
                hashtag.f23083id = Long.valueOf(j);
                String str3 = a.get("key_title");
                if (str3 != null) {
                    str = str3;
                }
                hashtag.title = str;
            }
            C3854a.m9453a(4, "PreviewHashtagWidget", "observe last selected game item. gameTag=" + gameTag2 + ", gameHashtag=" + hashtag);
            if (!gameTag2.isNonGameItem() && hashtag != null) {
                this.f22001a.dataChannel.mo28315b(C9023aq.class, hashtag);
            }
            return C89391z.f203057a;
        }
    }
}
