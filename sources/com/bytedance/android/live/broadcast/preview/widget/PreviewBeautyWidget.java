package com.bytedance.android.live.broadcast.preview.widget;

import android.content.DialogInterface;
import android.view.View;
import androidx.fragment.app.AbstractC0952i;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.broadcast.api.p185c.C3051c;
import com.bytedance.android.live.broadcast.preview.widget.base.PreviewToolBaseWidget;
import com.bytedance.android.live.effect.C4217d;
import com.bytedance.android.live.effect.api.AbstractC4170f;
import com.bytedance.android.live.effect.api.p240a.AbstractC4154g;
import com.bytedance.android.live.effect.model.C4312b;
import com.bytedance.android.live.effect.model.FilterModel;
import com.bytedance.android.livesdk.AbstractC11293v;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBeautyParamSetting;
import com.bytedance.android.livesdk.livesetting.effect.LiveNewEffectPanelSetting;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p456as.AbstractC6872f;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdkapi.depend.model.p685a.AbstractC11683e;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

public final class PreviewBeautyWidget extends PreviewToolBaseWidget implements AbstractC33974au {

    /* renamed from: e */
    public static final C3581a f9910e = new C3581a((byte) 0);

    /* renamed from: a */
    final AbstractC4170f f9911a = C4217d.m10317a();

    /* renamed from: b */
    public final C3582b f9912b = new C3582b(this);

    /* renamed from: c */
    public final AbstractC89172b<Boolean, C89391z> f9913c;

    /* renamed from: d */
    public final AbstractC89171a<AbstractC11683e> f9914d;

    /* renamed from: f */
    private final int f9915f = R.string.e9m;

    /* renamed from: g */
    private final int f9916g = 2131234584;

    /* renamed from: h */
    private final C3583c f9917h = new C3583c(this);

    /* renamed from: i */
    private final AbstractC0952i f9918i;

    static {
        Covode.recordClassIndex(4070);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.live.broadcast.preview.widget.base.PreviewToolBaseWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.widget.PreviewBeautyWidget$a */
    public static final class C3581a {
        static {
            Covode.recordClassIndex(4071);
        }

        private C3581a() {
        }

        public /* synthetic */ C3581a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.android.live.broadcast.preview.widget.base.PreviewToolBaseWidget
    /* renamed from: a */
    public final int mo8870a() {
        return this.f9915f;
    }

    @Override // com.bytedance.android.live.broadcast.preview.widget.base.PreviewToolBaseWidget
    /* renamed from: b */
    public final int mo8872b() {
        return this.f9916g;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.live.broadcast.preview.widget.base.PreviewToolBaseWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        super.onCreate();
        this.f9911a.mo9891a(this.f9912b);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        super.onDestroy();
        this.f9911a.mo9896b(this.f9912b);
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.widget.PreviewBeautyWidget$b */
    public static final class C3582b implements AbstractC4170f.AbstractC4171a {

        /* renamed from: a */
        final /* synthetic */ PreviewBeautyWidget f9919a;

        static {
            Covode.recordClassIndex(4072);
        }

        @Override // com.bytedance.android.live.effect.api.AbstractC4170f.AbstractC4171a
        /* renamed from: a */
        public final void mo8671a(FilterModel filterModel, float f) {
            C89219l.m154721d(filterModel, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C3582b(PreviewBeautyWidget previewBeautyWidget) {
            this.f9919a = previewBeautyWidget;
        }

        @Override // com.bytedance.android.live.effect.api.AbstractC4170f.AbstractC4171a
        /* renamed from: a */
        public final void mo8670a(int i, boolean z, boolean z2) {
            String str;
            List<FilterModel> a = this.f9919a.f9911a.mo9890a();
            if (i < a.size()) {
                str = a.get(i).getFilterId();
            } else {
                str = "";
            }
            if (!C13627m.m24498a(str) && (!C89219l.m154714a((Object) str, (Object) "0"))) {
                C3051c.C3052a.m8360b("ttlive_click_change_filter").mo12633b("preview").mo12629a("select_filter_id", str).mo12627a("select_filter_position", Integer.valueOf(i)).mo12632a();
            }
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.widget.PreviewBeautyWidget$c */
    public static final class C3583c implements AbstractC4154g {

        /* renamed from: a */
        final /* synthetic */ PreviewBeautyWidget f9920a;

        static {
            Covode.recordClassIndex(4073);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C3583c(PreviewBeautyWidget previewBeautyWidget) {
            this.f9920a = previewBeautyWidget;
        }

        @Override // com.bytedance.android.live.effect.api.p240a.AbstractC4154g
        /* renamed from: a */
        public final void mo8874a(float f) {
            AbstractC11683e invoke = this.f9920a.f9914d.invoke();
            if (invoke != null) {
                invoke.mo8848a(LiveBeautyParamSetting.INSTANCE.getValue().f23102b.f23106a * f);
            }
        }

        @Override // com.bytedance.android.live.effect.api.p240a.AbstractC4154g
        /* renamed from: b */
        public final void mo8875b(float f) {
            AbstractC11683e invoke = this.f9920a.f9914d.invoke();
            if (invoke != null) {
                invoke.mo8858b(LiveBeautyParamSetting.INSTANCE.getValue().f23103c.f23106a * f);
            }
        }

        @Override // com.bytedance.android.live.effect.api.p240a.AbstractC4154g
        /* renamed from: c */
        public final void mo8876c(float f) {
            AbstractC11683e invoke = this.f9920a.f9914d.invoke();
            if (invoke != null) {
                invoke.mo8863c(LiveBeautyParamSetting.INSTANCE.getValue().f23104d.f23106a * f);
            }
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.widget.PreviewBeautyWidget$d */
    static final class DialogInterface$OnDismissListenerC3584d implements DialogInterface.OnDismissListener {

        /* renamed from: a */
        final /* synthetic */ PreviewBeautyWidget f9921a;

        static {
            Covode.recordClassIndex(4074);
        }

        DialogInterface$OnDismissListenerC3584d(PreviewBeautyWidget previewBeautyWidget) {
            this.f9921a = previewBeautyWidget;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            this.f9921a.f9913c.invoke(true);
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.widget.PreviewBeautyWidget$e */
    static final class DialogInterface$OnDismissListenerC3585e implements DialogInterface.OnDismissListener {

        /* renamed from: a */
        final /* synthetic */ PreviewBeautyWidget f9922a;

        static {
            Covode.recordClassIndex(4075);
        }

        DialogInterface$OnDismissListenerC3585e(PreviewBeautyWidget previewBeautyWidget) {
            this.f9922a = previewBeautyWidget;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            this.f9922a.f9913c.invoke(true);
        }
    }

    @Override // com.bytedance.android.live.broadcast.preview.widget.base.PreviewToolBaseWidget
    /* renamed from: a */
    public final void mo8871a(View view) {
        C89219l.m154721d(view, "");
        if (LiveNewEffectPanelSetting.INSTANCE.useNewPanel()) {
            AbstractC11293v b = C4217d.m10319b();
            b.f27012r = new DialogInterface$OnDismissListenerC3584d(this);
            if (!b.isAdded() && !b.mo18054n()) {
                b.show(this.f9918i, "LiveBeautyFilterDialogFragment");
                this.f9913c.invoke(false);
            }
        } else {
            C3583c cVar = this.f9917h;
            AbstractC6872f b2 = C11115u.m19743a().mo17915b();
            C89219l.m154716b(b2, "");
            AbstractC11293v a = C4217d.m10318a(cVar, new C4312b("", String.valueOf(b2.mo13161c()), "live_take_page"));
            a.f27012r = new DialogInterface$OnDismissListenerC3585e(this);
            if (!a.isAdded() && !a.mo18054n()) {
                a.show(this.f9918i, "beautyDialogTag");
                this.f9913c.invoke(false);
            }
        }
        C6501b.C6502a.m13948a("live_take_beauty_click").mo12643a(this.dataChannel).mo12654b("live_take").mo12656c("click").mo12655b();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.f.a.b<? super java.lang.Boolean, h.z> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: h.f.a.a<? extends com.bytedance.android.livesdkapi.depend.model.a.e> */
    /* JADX WARN: Multi-variable type inference failed */
    public PreviewBeautyWidget(AbstractC89172b<? super Boolean, C89391z> bVar, AbstractC0952i iVar, AbstractC89171a<? extends AbstractC11683e> aVar) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(iVar, "");
        C89219l.m154721d(aVar, "");
        this.f9913c = bVar;
        this.f9918i = iVar;
        this.f9914d = aVar;
    }
}
