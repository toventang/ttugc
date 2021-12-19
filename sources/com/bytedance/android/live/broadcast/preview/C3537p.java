package com.bytedance.android.live.broadcast.preview;

import android.app.Activity;
import android.content.Context;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.bytedance.android.live.broadcast.C3005a;
import com.bytedance.android.live.broadcast.C3228f;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.broadcast.model.C3267k;
import com.bytedance.android.live.broadcast.model.C3272o;
import com.bytedance.android.live.broadcast.model.EnumC3268l;
import com.bytedance.android.live.broadcast.p188b.C3081e;
import com.bytedance.android.live.broadcast.utils.C3719d;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.live.p176b.AbstractC2928f;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.browser.p462c.AbstractC6956d;
import com.bytedance.android.livesdk.browser.p462c.AbstractC6963e;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastAgeThresholdSetting;
import com.bytedance.android.livesdk.model.Hashtag;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p561j.C9023aq;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.android.livesdkapi.depend.model.p685a.AbstractC11683e;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17303d;
import com.bytedance.ies.dmt.p1194ui.widget.util.FontSpan;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.p2082ss.android.ugc.trill.R;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89217j;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.broadcast.preview.p */
public final class C3537p {

    /* renamed from: a */
    public static final C3537p f9839a = new C3537p();

    private C3537p() {
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.p$b */
    public static final class C3539b implements IBroadcastService.AbstractC3017a {

        /* renamed from: a */
        final /* synthetic */ DataChannel f9841a;

        /* renamed from: b */
        final /* synthetic */ Activity f9842b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89171a f9843c;

        /* renamed from: com.bytedance.android.live.broadcast.preview.p$b$b */
        static final class C3541b<T> implements AbstractC88433f {

            /* renamed from: a */
            public static final C3541b f9845a = new C3541b();

            static {
                Covode.recordClassIndex(4025);
            }

            C3541b() {
            }

            @Override // p4560f.p4561a.p4567d.AbstractC88433f
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        }

        static {
            Covode.recordClassIndex(4023);
        }

        @Override // com.bytedance.android.live.broadcast.api.IBroadcastService.AbstractC3017a
        /* renamed from: a */
        public final /* synthetic */ C89391z mo8220a() {
            AbstractC11683e eVar = (AbstractC11683e) this.f9843c.invoke();
            if (eVar != null) {
                eVar.mo8847a();
            }
            return C89391z.f203057a;
        }

        /* renamed from: com.bytedance.android.live.broadcast.preview.p$b$a */
        static final class C3540a<T> implements AbstractC88433f {

            /* renamed from: a */
            final /* synthetic */ C3539b f9844a;

            static {
                Covode.recordClassIndex(4024);
            }

            C3540a(C3539b bVar) {
                this.f9844a = bVar;
            }

            @Override // p4560f.p4561a.p4567d.AbstractC88433f
            public final /* synthetic */ void accept(Object obj) {
                if (((C3272o) ((C5832d) obj).data).f9384s == 3) {
                    C3538a.m8943a(this.f9844a.f9842b, this.f9844a.f9841a);
                }
            }
        }

        @Override // com.bytedance.android.live.broadcast.api.IBroadcastService.AbstractC3017a
        /* renamed from: a */
        public final /* synthetic */ C89391z mo8221a(String str) {
            C89219l.m154721d(str, "");
            if (str.length() > 0) {
                C11279p.m20010a(str);
            }
            return C89391z.f203057a;
        }

        @Override // com.bytedance.android.live.broadcast.api.IBroadcastService.AbstractC3017a
        /* renamed from: a */
        public final /* synthetic */ C89391z mo8222a(String str, String str2) {
            long j;
            Long l;
            C11226ao.m19882a(C3966y.m9669e(), (int) R.string.du2);
            Hashtag hashtag = (Hashtag) this.f9841a.mo28318b(C9023aq.class);
            if (hashtag == null || (l = hashtag.f23083id) == null) {
                j = 0;
            } else {
                j = l.longValue();
            }
            C3719d.C3720a.m9229a().mo9038a().getPreviewRoomCreateInfo(j).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C3540a(this), C3541b.f9845a);
            return C89391z.f203057a;
        }

        C3539b(DataChannel dataChannel, Activity activity, AbstractC89171a aVar) {
            this.f9841a = dataChannel;
            this.f9842b = activity;
            this.f9843c = aVar;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.broadcast.preview.p$e */
    public static final /* synthetic */ class C3544e extends C89217j implements AbstractC89171a<C89391z> {
        static {
            Covode.recordClassIndex(4028);
        }

        C3544e(IBroadcastService.AbstractC3017a aVar) {
            super(0, aVar, IBroadcastService.AbstractC3017a.class, "onDialogCanceled", "onDialogCanceled()Lkotlin/Unit;", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            return ((IBroadcastService.AbstractC3017a) this.receiver).mo8220a();
        }
    }

    static {
        Covode.recordClassIndex(4021);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.broadcast.preview.p$d */
    public static final /* synthetic */ class C3543d extends C89217j implements AbstractC89172b<String, C89391z> {
        static {
            Covode.recordClassIndex(4027);
        }

        C3543d(IBroadcastService.AbstractC3017a aVar) {
            super(1, aVar, IBroadcastService.AbstractC3017a.class, "onFailed", "onFailed(Ljava/lang/String;)Lkotlin/Unit;", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(String str) {
            return ((IBroadcastService.AbstractC3017a) this.receiver).mo8221a(str);
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.p$f */
    public static final class C3545f extends ClickableSpan {

        /* renamed from: a */
        final /* synthetic */ DataChannel f9846a;

        /* renamed from: b */
        final /* synthetic */ Context f9847b;

        /* renamed from: c */
        final /* synthetic */ String f9848c;

        static {
            Covode.recordClassIndex(4029);
        }

        public final void updateDrawState(TextPaint textPaint) {
            C89219l.m154721d(textPaint, "");
        }

        public final void onClick(View view) {
            C89219l.m154721d(view, "");
            C6501b.C6502a.m13948a("livesdk_appeal_click").mo12643a(this.f9846a).mo12651a("appeal_type", "age").mo12655b();
            AbstractC6956d webViewManager = ((AbstractC2928f) C6193a.m13435a(AbstractC2928f.class)).webViewManager();
            Context context = this.f9847b;
            AbstractC6956d.C6957a b = AbstractC6963e.m14872b("https://webcast.tiktokv.com/falcon/webcast_mt/page/appeal_v3/index.html?enter_from=live_takepage");
            b.f17379c = true;
            b.f17378b = C3966y.m9657a((int) R.string.dtq);
            webViewManager.mo13248a(context, b);
        }

        C3545f(DataChannel dataChannel, Context context, String str) {
            this.f9846a = dataChannel;
            this.f9847b = context;
            this.f9848c = str;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.p$a */
    static final class C3538a extends AbstractC89220m implements AbstractC89183m<Activity, DataChannel, C89391z> {

        /* renamed from: a */
        public static final C3538a f9840a = new C3538a();

        static {
            Covode.recordClassIndex(4022);
        }

        C3538a() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(Activity activity, DataChannel dataChannel) {
            m8943a(activity, dataChannel);
            return C89391z.f203057a;
        }

        /* renamed from: a */
        public static void m8943a(Activity activity, DataChannel dataChannel) {
            C89219l.m154721d(activity, "");
            C89219l.m154721d(dataChannel, "");
            dataChannel.mo28319c(C3005a.class);
            C3537p.m8942a(activity, dataChannel);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.broadcast.preview.p$c */
    public static final /* synthetic */ class C3542c extends C89217j implements AbstractC89183m<String, String, C89391z> {
        static {
            Covode.recordClassIndex(4026);
        }

        C3542c(IBroadcastService.AbstractC3017a aVar) {
            super(2, aVar, IBroadcastService.AbstractC3017a.class, "onSuccess", "onSuccess(Ljava/lang/String;Ljava/lang/String;)Lkotlin/Unit;", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(String str, String str2) {
            return ((IBroadcastService.AbstractC3017a) this.receiver).mo8222a(str, str2);
        }
    }

    /* renamed from: a */
    public static void m8942a(Context context, DataChannel dataChannel) {
        String str = C3966y.m9657a((int) R.string.dtq) + " >";
        SpannableString spannableString = new SpannableString(C3966y.m9660a((int) R.string.du6, Integer.valueOf(LiveBroadcastAgeThresholdSetting.INSTANCE.getValue())) + '\n' + str);
        spannableString.setSpan(new C3545f(dataChannel, context, str), spannableString.length() - str.length(), spannableString.length(), 17);
        spannableString.setSpan(new FontSpan(C17303d.f41573g), spannableString.length() - str.length(), spannableString.length(), 17);
        dataChannel.mo28320c(C3228f.class, new C3267k(0, EnumC3268l.AGE_GATE_BLOCK, spannableString));
        C6501b.C6502a.m13948a("livesdk_live_banned_toast_show").mo12643a(dataChannel).mo12656c("show").mo12651a("show_scene", "age_appeal").mo12655b();
    }

    /* renamed from: a */
    public static void m8940a(Activity activity, int i, DataChannel dataChannel, AbstractC89171a<? extends AbstractC11683e> aVar) {
        C89219l.m154721d(activity, "");
        C89219l.m154721d(dataChannel, "");
        C89219l.m154721d(aVar, "");
        if (i == 1) {
            m8941a(activity, "live_host", "live_takepage", new C3539b(dataChannel, activity, aVar));
        } else if (i == 3) {
            C3538a.m8943a(activity, dataChannel);
        }
    }

    /* renamed from: a */
    public static void m8941a(Activity activity, String str, String str2, IBroadcastService.AbstractC3017a aVar) {
        C89219l.m154721d(activity, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(aVar, "");
        if (C3081e.m8418a(activity, str, str2, new C3542c(aVar), new C3543d(aVar), new C3544e(aVar))) {
            C6501b.C6502a.m13948a("livesdk_add_birth_popup_window_show").mo12639a().mo12651a("request_page", str2).mo12655b();
        }
    }
}
