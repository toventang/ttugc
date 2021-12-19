package com.bytedance.android.live.broadcast.preview.widget;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.app.ActivityC0218d;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.base.model.C2962b;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.C3011ac;
import com.bytedance.android.live.broadcast.api.model.C3071d;
import com.bytedance.android.live.broadcast.api.p185c.C3051c;
import com.bytedance.android.live.broadcast.preview.widget.base.PreviewToolBaseWidget;
import com.bytedance.android.live.core.p218f.C3951p;
import com.bytedance.android.live.effect.C4217d;
import com.bytedance.android.live.effect.api.C4147a;
import com.bytedance.android.live.effect.api.p240a.AbstractC4152e;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p561j.C9009ac;
import com.bytedance.android.livesdk.p561j.C9107ds;
import com.bytedance.android.livesdk.performance.LivePerformanceManager;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.android.livesdkapi.depend.model.C11672a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.p685a.AbstractC11683e;
import com.bytedance.android.livesdkapi.host.AbstractC11819n;
import com.bytedance.android.livesdkapi.host.IHostApp;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Objects;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

public final class PreviewStickerWidget extends PreviewToolBaseWidget implements AbstractC33974au {

    /* renamed from: a */
    public boolean f10035a = true;

    /* renamed from: b */
    public final AbstractC89172b<Boolean, C89391z> f10036b;

    /* renamed from: c */
    public final AbstractC89171a<AbstractC11683e> f10037c;

    /* renamed from: d */
    private final int f10038d = R.string.e6q;

    /* renamed from: e */
    private final int f10039e = 2131234598;

    /* renamed from: f */
    private final C3635a f10040f = new C3635a(this);

    /* renamed from: g */
    private final FrameLayout f10041g;

    static {
        Covode.recordClassIndex(4143);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.live.broadcast.preview.widget.base.PreviewToolBaseWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.android.live.broadcast.preview.widget.base.PreviewToolBaseWidget
    /* renamed from: a */
    public final int mo8870a() {
        return this.f10038d;
    }

    @Override // com.bytedance.android.live.broadcast.preview.widget.base.PreviewToolBaseWidget
    /* renamed from: b */
    public final int mo8872b() {
        return this.f10039e;
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.widget.PreviewStickerWidget$a */
    public static final class C3635a implements AbstractC11819n {

        /* renamed from: a */
        final /* synthetic */ PreviewStickerWidget f10042a;

        /* renamed from: b */
        private String f10043b;

        static {
            Covode.recordClassIndex(4144);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C3635a(PreviewStickerWidget previewStickerWidget) {
            this.f10042a = previewStickerWidget;
        }

        @Override // com.bytedance.android.livesdkapi.host.AbstractC11819n
        /* renamed from: b */
        public final void mo8924b(String str) {
            C89219l.m154721d(str, "");
            AbstractC11683e invoke = this.f10042a.f10037c.invoke();
            if (invoke != null) {
                invoke.mo8854a(str);
                this.f10042a.f10036b.invoke(true);
            }
        }

        @Override // com.bytedance.android.livesdkapi.host.AbstractC11819n
        /* renamed from: c */
        public final void mo8925c(String str) {
            if (this.f10042a.f10035a) {
                this.f10042a.f10035a = false;
                return;
            }
            this.f10043b = str;
            C6501b.C6502a.m13948a("livesdk_pm_live_sticker_tab_change").mo12643a(this.f10042a.dataChannel).mo12651a("tab", str).mo12655b();
        }

        @Override // com.bytedance.android.livesdkapi.host.AbstractC11819n
        /* renamed from: a */
        public final void mo8922a(String str) {
            C89219l.m154721d(str, "");
            AbstractC11683e invoke = this.f10042a.f10037c.invoke();
            if (invoke != null) {
                invoke.mo8861b(str);
                this.f10042a.f10036b.invoke(false);
            }
        }

        @Override // com.bytedance.android.livesdkapi.host.AbstractC11819n
        /* renamed from: b */
        public final void mo8923b(C11672a aVar) {
            ImageView imageView;
            ImageView imageView2;
            C89219l.m154721d(aVar, "");
            AbstractC11683e invoke = this.f10042a.f10037c.invoke();
            if (invoke != null) {
                invoke.mo8852a(aVar, C4147a.f11584b);
                C4217d.m10322e().mo9845a(C4147a.f11584b);
                View view = this.f10042a.getView();
                if (!(view == null || (imageView = (ImageView) view.findViewById(R.id.fis)) == null || (imageView2 = (ImageView) imageView.findViewById(R.id.fis)) == null)) {
                    imageView2.setImageResource(2131234598);
                }
                LivePerformanceManager.getInstance().onModuleStop("sticker");
            }
        }

        @Override // com.bytedance.android.livesdkapi.host.AbstractC11819n
        /* renamed from: a */
        public final void mo8921a(C11672a aVar) {
            String str;
            String str2;
            ImageView imageView;
            User owner;
            String str3 = "";
            C89219l.m154721d(aVar, str3);
            AbstractC11683e invoke = this.f10042a.f10037c.invoke();
            if (invoke != null) {
                invoke.mo8859b(aVar, C4147a.f11584b);
                AbstractC4152e e = C4217d.m10322e();
                ImageModel imageModel = null;
                e.mo9852c(null);
                e.mo9854d(null);
                e.mo9845a(C4147a.f11584b);
                e.mo9846a(C4147a.f11584b, aVar);
                PreviewStickerWidget previewStickerWidget = this.f10042a;
                String str4 = this.f10043b;
                Room room = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
                C6501b c = C6501b.C6502a.m13948a("live_take_sticker_select").mo12643a(previewStickerWidget.dataChannel).mo12654b("live_take").mo12656c("click");
                if (room == null || (owner = room.getOwner()) == null) {
                    str = null;
                } else {
                    str = owner.getIdStr();
                }
                C6501b a = c.mo12662g(str).mo12646a("sticker_id", aVar.f27893a);
                if (aVar.f27915w) {
                    str2 = "1";
                } else {
                    str2 = "0";
                }
                a.mo12651a("is_video_sticker", str2).mo12651a("tab", str4).mo12645a("is_live_take_default", 1).mo12655b();
                C3051c.C3052a.m8359a("ttlive_change_sticker").mo12633b("preview").mo12628a("select_sticker_id", Long.valueOf(aVar.f27893a)).mo12629a("select_sticker_name", aVar.f27897e).mo12632a();
                DataChannelGlobal.f42558d.mo28321a(C9107ds.class, new C3071d(C4147a.f11584b, aVar, this.f10043b));
                View view = this.f10042a.getView();
                if (view != null) {
                    imageView = (ImageView) view.findViewById(R.id.fis);
                } else {
                    imageView = null;
                }
                C2962b bVar = aVar.f27896d;
                if (bVar != null) {
                    imageModel = bVar.mo7782a();
                }
                C3951p.m9622a(imageView, imageModel, 2131234598);
                HashMap hashMap = new HashMap();
                hashMap.put("id", String.valueOf(aVar.f27893a));
                String str5 = aVar.f27897e;
                if (str5 != null) {
                    str3 = str5;
                }
                hashMap.put(StringSet.name, str3);
                LivePerformanceManager.getInstance().onModuleStart("sticker", hashMap);
            }
        }

        @Override // com.bytedance.android.livesdkapi.host.AbstractC11819n
        /* renamed from: a */
        public final int mo8920a(String str, String str2) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            AbstractC11683e invoke = this.f10042a.f10037c.invoke();
            if (invoke == null) {
                return -1;
            }
            int a = invoke.mo8842a(str, str2);
            AbstractC4152e e = C4217d.m10322e();
            e.mo9852c(str);
            e.mo9854d(str2);
            return a;
        }
    }

    @Override // com.bytedance.android.live.broadcast.preview.widget.base.PreviewToolBaseWidget
    /* renamed from: a */
    public final void mo8871a(View view) {
        C89219l.m154721d(view, "");
        IHostApp iHostApp = (IHostApp) C6193a.m13435a(IHostApp.class);
        if (iHostApp != null && !iHostApp.isShowStickerView()) {
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel != null) {
                dataChannel.mo28319c(C3011ac.class);
            }
            ActivityC0945e a = C11279p.m20001a(this.context);
            Objects.requireNonNull(a, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            ActivityC0945e a2 = C11279p.m20001a(this.context);
            Objects.requireNonNull(a2, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            iHostApp.showStickerView((ActivityC0218d) a, a2.getSupportFragmentManager(), C4147a.f11584b, this.f10041g, this.f10040f);
            C6501b.C6502a.m13948a("pm_live_sticker_click").mo12643a(this.dataChannel).mo12654b("live_take").mo12656c("click").mo12655b();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: h.f.a.b<? super java.lang.Boolean, h.z> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: h.f.a.a<? extends com.bytedance.android.livesdkapi.depend.model.a.e> */
    /* JADX WARN: Multi-variable type inference failed */
    public PreviewStickerWidget(FrameLayout frameLayout, AbstractC89172b<? super Boolean, C89391z> bVar, AbstractC89171a<? extends AbstractC11683e> aVar) {
        C89219l.m154721d(frameLayout, "");
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(aVar, "");
        this.f10041g = frameLayout;
        this.f10036b = bVar;
        this.f10037c = aVar;
    }
}
