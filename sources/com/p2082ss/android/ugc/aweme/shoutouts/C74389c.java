package com.p2082ss.android.ugc.aweme.shoutouts;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.graphics.drawable.AbstractC0706b;
import androidx.core.graphics.drawable.C0708d;
import androidx.fragment.app.ActivityC0945e;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.dialog.C17197a;
import com.bytedance.scene.ktx.C22228c;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.p1721g.C23144b;
import com.bytedance.tux.sheet.p1724a.C23208a;
import com.facebook.drawee.view.SimpleDraweeView;
import com.google.gson.C27910f;
import com.p2082ss.android.ugc.aweme.bullet.api.IBulletService;
import com.p2082ss.android.ugc.aweme.bullet.impl.BulletService;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.editSticker.model.EffectTextModel;
import com.p2082ss.android.ugc.aweme.effect.EffectPointModel;
import com.p2082ss.android.ugc.aweme.internal.IShoutOutApiService;
import com.p2082ss.android.ugc.aweme.internal.ShoutOutServiceImpl;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.services.effect.IEffectService;
import com.p2082ss.android.ugc.aweme.services.shoutout.IShoutOutsService;
import com.p2082ss.android.ugc.aweme.services.video.VideoRecordEntranceServiceImpl;
import com.p2082ss.android.ugc.aweme.shortvideo.C71817eu;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.data.C71493a;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.p3827b.C71429d;
import com.p2082ss.android.ugc.aweme.shortvideo.p3875u.C73298a;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.VEVideoPublishPreviewActivityShoutOut;
import com.p2082ss.android.ugc.aweme.shortvideo.view.MentionEditText;
import com.p2082ss.android.ugc.aweme.shoutouts.network.C74448a;
import com.p2082ss.android.ugc.aweme.shoutouts.network.C74450b;
import com.p2082ss.android.ugc.aweme.shoutouts.network.CheckWalletApi;
import com.p2082ss.android.ugc.aweme.shoutouts.network.EditProductApi;
import com.p2082ss.android.ugc.aweme.shoutouts.network.RealShoutoutOutApi;
import com.p2082ss.android.ugc.aweme.shoutouts.network.ShoutoutOrderListApi;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp;
import com.p2082ss.android.ugc.aweme.video.C80720e;
import com.p2082ss.android.ugc.aweme.view.ProgressDialogC81146b;
import com.p2082ss.android.ugc.gamora.p4273b.AbstractC82005a;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import com.p2082ss.android.ugc.tools.p4340c.C84402a;
import com.p2082ss.android.ugc.tools.p4341d.p4342a.C84412c;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.android.vesdk.AbstractC85304ab;
import com.p2082ss.android.vesdk.VERecordData;
import com.p2082ss.android.vesdk.VEUtils;
import java.io.File;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Stack;
import java.util.UUID;
import java.util.concurrent.Callable;
import org.json.JSONObject;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shoutouts.c */
public final class C74389c extends AbstractC82005a {

    /* renamed from: A */
    String f167292A = "";

    /* renamed from: B */
    public final Stack<String> f167293B = new Stack<>();

    /* renamed from: C */
    public final VideoPublishEditModel f167294C;

    /* renamed from: D */
    public final C74418d f167295D;

    /* renamed from: f */
    public View f167296f;

    /* renamed from: g */
    public View f167297g;

    /* renamed from: h */
    public View f167298h;

    /* renamed from: i */
    public TuxButton f167299i;

    /* renamed from: j */
    public TextView f167300j;

    /* renamed from: k */
    public SimpleDraweeView f167301k;

    /* renamed from: l */
    public View f167302l;

    /* renamed from: t */
    public TuxButton f167303t;

    /* renamed from: u */
    public TextView f167304u;

    /* renamed from: v */
    public View f167305v;

    /* renamed from: w */
    public C74418d f167306w;

    /* renamed from: x */
    public MentionEditText f167307x;

    /* renamed from: y */
    public ProgressDialogC81146b f167308y;

    /* renamed from: z */
    boolean f167309z;

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.c$v */
    static final class DialogInterface$OnClickListenerC74414v implements DialogInterface.OnClickListener {

        /* renamed from: a */
        public static final DialogInterface$OnClickListenerC74414v f167341a = new DialogInterface$OnClickListenerC74414v();

        static {
            Covode.recordClassIndex(87192);
        }

        DialogInterface$OnClickListenerC74414v() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.c$x */
    static final class DialogInterface$OnClickListenerC74416x implements DialogInterface.OnClickListener {

        /* renamed from: a */
        public static final DialogInterface$OnClickListenerC74416x f167343a = new DialogInterface$OnClickListenerC74416x();

        static {
            Covode.recordClassIndex(87194);
        }

        DialogInterface$OnClickListenerC74416x() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    static {
        Covode.recordClassIndex(87167);
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: w */
    public final void mo36490w() {
        super.mo36490w();
        m130856b(false);
    }

    /* renamed from: E */
    public final SimpleDraweeView mo62771E() {
        SimpleDraweeView simpleDraweeView = this.f167301k;
        if (simpleDraweeView == null) {
            C89219l.m154710a("coverView");
        }
        return simpleDraweeView;
    }

    /* renamed from: F */
    public final TuxButton mo117004F() {
        TuxButton tuxButton = this.f167303t;
        if (tuxButton == null) {
            C89219l.m154710a("postView");
        }
        return tuxButton;
    }

    /* renamed from: G */
    public final C74418d mo117005G() {
        C74418d dVar = this.f167306w;
        if (dVar == null) {
            C89219l.m154710a("shoutOutsData");
        }
        return dVar;
    }

    /* renamed from: I */
    public final void mo117007I() {
        ProgressDialogC81146b bVar;
        Activity t = mo36486t();
        C89219l.m154716b(t, "");
        if (!t.isFinishing() && (bVar = this.f167308y) != null) {
            bVar.dismiss();
        }
    }

    /* renamed from: J */
    public final void mo117008J() {
        mo117006H();
        C1731i.m5640b(new CallableC74408q(this), C1731i.f5562a).mo5534a(new C74409r(this), C1731i.f5564c, null);
    }

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.c$a */
    static final class CallableC74390a<V> implements Callable {

        /* renamed from: a */
        public static final CallableC74390a f167310a = new CallableC74390a();

        static {
            Covode.recordClassIndex(87168);
        }

        CallableC74390a() {
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            T t = ((CheckWalletApi.Api) C63244g.m114602a().mo73257C().createRetrofit(C63244g.m114602a().mo73257C().getApiHost(), true, CheckWalletApi.Api.class)).get().execute().f52262b;
            C89219l.m154716b(t, "");
            return t;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public final void mo117009K() {
        C74418d dVar = this.f167306w;
        if (dVar == null) {
            C89219l.m154710a("shoutOutsData");
        }
        C74426g price = dVar.getPrice();
        if (price != null) {
            int coin = price.getCoin();
            TextView textView = this.f167304u;
            if (textView == null) {
                C89219l.m154710a("coinsText");
            }
            textView.setText(String.valueOf(coin));
            View view = this.f167305v;
            if (view == null) {
                C89219l.m154710a("coinsIcon");
            }
            view.setVisibility(0);
        }
    }

    /* renamed from: M */
    public final void mo117011M() {
        if (this.f167307x != null) {
            C74418d dVar = this.f167306w;
            if (dVar == null) {
                C89219l.m154710a("shoutOutsData");
            }
            MentionEditText mentionEditText = this.f167307x;
            if (mentionEditText == null) {
                C89219l.m154715b();
            }
            dVar.setDesc(String.valueOf(mentionEditText.getText()));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.c$c */
    static final class CallableC74393c<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ C74389c f167313a;

        /* renamed from: b */
        final /* synthetic */ JSONObject f167314b;

        static {
            Covode.recordClassIndex(87171);
        }

        CallableC74393c(C74389c cVar, JSONObject jSONObject) {
            this.f167313a = cVar;
            this.f167314b = jSONObject;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            String productId = this.f167313a.mo117005G().getProductId();
            if (productId == null) {
                C89219l.m154715b();
            }
            String jSONObject = this.f167314b.toString();
            C89219l.m154716b(jSONObject, "");
            C89219l.m154721d(productId, "");
            C89219l.m154721d(jSONObject, "");
            T t = ((EditProductApi.Api) C63244g.m114602a().mo73257C().createRetrofit(C63244g.m114602a().mo73257C().getApiHost(), true, EditProductApi.Api.class)).get(productId, jSONObject).execute().f52262b;
            C89219l.m154716b(t, "");
            return t;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.c$e */
    static final class CallableC74395e<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ C74389c f167316a;

        static {
            Covode.recordClassIndex(87173);
        }

        CallableC74395e(C74389c cVar) {
            this.f167316a = cVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            C74418d G = this.f167316a.mo117005G();
            if (G == null) {
                C89219l.m154715b();
            }
            String productId = G.getProductId();
            if (productId == null) {
                C89219l.m154715b();
            }
            C89219l.m154721d(productId, "");
            T t = ((ShoutoutOrderListApi.Api) C63244g.m114602a().mo73257C().createRetrofit(C63244g.m114602a().mo73257C().getApiHost(), true, ShoutoutOrderListApi.Api.class)).get(6, productId, 1).execute().f52262b;
            C89219l.m154716b(t, "");
            return t;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shoutouts.c$q */
    public static final class CallableC74408q<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ C74389c f167331a;

        static {
            Covode.recordClassIndex(87186);
        }

        CallableC74408q(C74389c cVar) {
            this.f167331a = cVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            C74418d G = this.f167331a.mo117005G();
            if (G == null) {
                C89219l.m154715b();
            }
            String productId = G.getProductId();
            if (productId == null) {
                C89219l.m154715b();
            }
            C89219l.m154721d(productId, "");
            T t = ((RealShoutoutOutApi.Api) C63244g.m114602a().mo73257C().createRetrofit(C63244g.m114602a().mo73257C().getApiHost(), true, RealShoutoutOutApi.Api.class)).get().execute().f52262b;
            C89219l.m154716b(t, "");
            return t;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.c$s */
    static final class RunnableC74410s implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C74389c f167333a;

        /* renamed from: b */
        final /* synthetic */ VideoPublishEditModel f167334b;

        /* renamed from: c */
        final /* synthetic */ Pair f167335c;

        /* renamed from: d */
        final /* synthetic */ VERecordData f167336d;

        static {
            Covode.recordClassIndex(87188);
        }

        RunnableC74410s(C74389c cVar, VideoPublishEditModel videoPublishEditModel, Pair pair, VERecordData vERecordData) {
            this.f167333a = cVar;
            this.f167334b = videoPublishEditModel;
            this.f167335c = pair;
            this.f167336d = vERecordData;
        }

        public final void run() {
            int i = (int) (this.f167334b.mVideoCoverStartTm * 1000.0f);
            if (this.f167334b.isUseTimeReverseEffect()) {
                int intValue = ((Number) this.f167335c.second).intValue();
                Object obj = this.f167335c.first;
                C89219l.m154716b(obj, "");
                i = (intValue - ((Number) obj).intValue()) - i;
            }
            int width = this.f167333a.mo62771E().getWidth();
            VEUtils.getVideoThumb(this.f167336d, i, width, (int) (((float) width) / ((((float) this.f167334b.videoWidth()) * 1.0f) / ((float) this.f167334b.videoHeight()))), false, new AbstractC85304ab(this) {
                /* class com.p2082ss.android.ugc.aweme.shoutouts.C74389c.RunnableC74410s.C744111 */

                /* renamed from: a */
                final /* synthetic */ RunnableC74410s f167337a;

                static {
                    Covode.recordClassIndex(87189);
                }

                {
                    this.f167337a = r1;
                }

                @Override // com.p2082ss.android.vesdk.AbstractC85304ab
                public final boolean processFrame(ByteBuffer byteBuffer, int i, int i2, int i3) {
                    MethodCollector.m26663i(7877);
                    C89219l.m154721d(byteBuffer, "");
                    Activity activity = this.f167337a.f167333a.f52549m;
                    if (activity == null) {
                        MethodCollector.m26664o(7877);
                        return false;
                    }
                    C89219l.m154716b(activity, "");
                    Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                    createBitmap.copyPixelsFromBuffer(byteBuffer.position(0));
                    EffectTextModel effectTextModel = this.f167337a.f167334b.getCoverPublishModel().getEffectTextModel();
                    C89219l.m154716b(createBitmap, "");
                    Bitmap mergeCoverText = effectTextModel.mergeCoverText(createBitmap);
                    AbstractC0706b a = C0708d.m2514a(activity.getResources(), mergeCoverText);
                    C89219l.m154716b(a, "");
                    this.f167337a.f167333a.mo62771E().setImageDrawable(a);
                    if (TextUtils.isEmpty(this.f167337a.f167334b.multiEditVideoRecordData.coverImagePath)) {
                        this.f167337a.f167334b.multiEditVideoRecordData.coverImagePath = C71429d.m126154a();
                    }
                    String str = this.f167337a.f167334b.multiEditVideoRecordData.coverImagePath;
                    C89219l.m154716b(str, "");
                    C71429d.m126155a(mergeCoverText, str);
                    MethodCollector.m26664o(7877);
                    return false;
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public final void mo117006H() {
        Activity t = mo36486t();
        C89219l.m154716b(t, "");
        if (!t.isFinishing()) {
            ProgressDialogC81146b bVar = this.f167308y;
            if (bVar != null) {
                bVar.cancel();
            }
            Activity t2 = mo36486t();
            C89219l.m154716b(t2, "");
            ProgressDialogC81146b a = ProgressDialogC81146b.C81148b.m140903a(t2, ProgressDialogC81146b.EnumC81147a.GONE, null);
            this.f167308y = a;
            if (a == null) {
                C89219l.m154715b();
            }
            a.setMessage(mo36486t().getString(R.string.g1j));
            ProgressDialogC81146b bVar2 = this.f167308y;
            if (bVar2 == null) {
                C89219l.m154715b();
            }
            bVar2.show();
        }
    }

    /* renamed from: L */
    public final void mo117010L() {
        VideoPublishEditModel videoPublishEditModel;
        if (this.f167307x != null && (videoPublishEditModel = this.f167294C) != null) {
            C74418d dVar = videoPublishEditModel.mShoutOutsData;
            MentionEditText mentionEditText = this.f167307x;
            if (mentionEditText == null) {
                C89219l.m154715b();
            }
            dVar.setDesc(String.valueOf(mentionEditText.getText()));
            C74418d dVar2 = this.f167294C.mShoutOutsData;
            C74418d dVar3 = this.f167306w;
            if (dVar3 == null) {
                C89219l.m154710a("shoutOutsData");
            }
            dVar2.setPrice(dVar3.getPrice());
            C74418d dVar4 = this.f167294C.mShoutOutsData;
            C74418d dVar5 = this.f167306w;
            if (dVar5 == null) {
                C89219l.m154710a("shoutOutsData");
            }
            dVar4.setBuyerMoneyDes(dVar5.getBuyerMoneyDes());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.c$g */
    public static final class C74397g implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ C74389c f167318a;

        static {
            Covode.recordClassIndex(87175);
        }

        public final void afterTextChanged(Editable editable) {
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C74397g(C74389c cVar) {
            this.f167318a = cVar;
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            this.f167318a.mo117004F().setEnabled(true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.c$h */
    public static final class C74398h extends AbstractView$OnClickListenerC80259bp {

        /* renamed from: a */
        final /* synthetic */ C74389c f167319a;

        static {
            Covode.recordClassIndex(87176);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C74398h(C74389c cVar) {
            this.f167319a = cVar;
        }

        /* renamed from: com.ss.android.ugc.aweme.shoutouts.c$h$a */
        static final class C74399a extends AbstractC89220m implements AbstractC89172b<View, C89391z> {

            /* renamed from: a */
            final /* synthetic */ C74398h f167320a;

            static {
                Covode.recordClassIndex(87177);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C74399a(C74398h hVar) {
                super(1);
                this.f167320a = hVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(View view) {
                C89219l.m154721d(view, "");
                C74389c cVar = this.f167320a.f167319a;
                cVar.mo117006H();
                C1731i.m5640b(new CallableC74395e(cVar), C1731i.f5562a).mo5534a(new C74396f(cVar), C1731i.f5564c, null);
                return C89391z.f203057a;
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.bytedance.tux.sheet.a.a$e[] */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp
        /* renamed from: a */
        public final void mo60873a(View view) {
            C23208a b = new C23208a.C23211b().mo37797a(new C23208a.C23214e().mo37785a(R.string.dlb).mo37789b(1).mo37787a(new C74399a(this))).mo37800b();
            Activity t = this.f167319a.mo36486t();
            Objects.requireNonNull(t, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            b.show(((ActivityC0945e) t).getSupportFragmentManager(), "shoutout");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.c$i */
    public static final class C74400i extends AbstractView$OnClickListenerC80259bp {

        /* renamed from: a */
        final /* synthetic */ C74389c f167321a;

        static {
            Covode.recordClassIndex(87178);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C74400i(C74389c cVar) {
            this.f167321a = cVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp
        /* renamed from: a */
        public final void mo60873a(View view) {
            C74389c cVar = this.f167321a;
            cVar.mo117006H();
            JSONObject jSONObject = new JSONObject();
            C27910f fVar = new C27910f();
            C74418d dVar = cVar.f167306w;
            if (dVar == null) {
                C89219l.m154710a("shoutOutsData");
            }
            jSONObject.put("price", new JSONObject(fVar.mo46674b(dVar.getPrice())));
            MentionEditText mentionEditText = cVar.f167307x;
            if (mentionEditText == null) {
                C89219l.m154715b();
            }
            jSONObject.put("desc", String.valueOf(mentionEditText.getText()));
            C1731i.m5640b(new CallableC74393c(cVar, jSONObject), C1731i.f5562a).mo5534a(new C74394d(cVar), C1731i.f5564c, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.c$j */
    public static final class C74401j extends AbstractView$OnClickListenerC80259bp {

        /* renamed from: a */
        final /* synthetic */ C74389c f167322a;

        static {
            Covode.recordClassIndex(87179);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C74401j(C74389c cVar) {
            this.f167322a = cVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp
        /* renamed from: a */
        public final void mo60873a(View view) {
            Float f;
            this.f167322a.mo117011M();
            this.f167322a.f167293B.push("shoutouts_detail_page");
            IShoutOutApiService b = ShoutOutServiceImpl.m103042b();
            Activity activity = this.f167322a.f52549m;
            if (activity == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(activity, "");
            String desc = this.f167322a.mo117005G().getDesc();
            if (desc == null) {
                desc = "";
            }
            C74426g price = this.f167322a.mo117005G().getPrice();
            if (price == null) {
                C89219l.m154715b();
            }
            Integer valueOf = Integer.valueOf(price.getCoin());
            C74381a buyerMoneyDes = this.f167322a.mo117005G().getBuyerMoneyDes();
            String str = null;
            if (buyerMoneyDes != null) {
                f = Float.valueOf((float) buyerMoneyDes.getMoney());
            } else {
                f = null;
            }
            C74381a buyerMoneyDes2 = this.f167322a.mo117005G().getBuyerMoneyDes();
            if (buyerMoneyDes2 != null) {
                str = buyerMoneyDes2.getCurrencyCharacter();
            }
            b.mo93980a(activity, desc, valueOf, f, str);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.c$k */
    public static final class C74402k extends AbstractView$OnClickListenerC80259bp {

        /* renamed from: a */
        final /* synthetic */ C74389c f167323a;

        static {
            Covode.recordClassIndex(87180);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C74402k(C74389c cVar) {
            this.f167323a = cVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp
        /* renamed from: a */
        public final void mo60873a(View view) {
            Activity activity = this.f167323a.f52549m;
            if (activity != null) {
                activity.finish();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.c$l */
    public static final class C74403l extends AbstractView$OnClickListenerC80259bp {

        /* renamed from: a */
        final /* synthetic */ C74389c f167324a;

        static {
            Covode.recordClassIndex(87181);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C74403l(C74389c cVar) {
            this.f167324a = cVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp
        /* renamed from: a */
        public final void mo60873a(View view) {
            this.f167324a.mo117011M();
            Intent intent = new Intent();
            intent.putExtra("shoot_way", C74418d.shootWay);
            intent.putExtra("enter_from", "shoutouts_detail_page");
            intent.putExtra("creation_id", UUID.randomUUID().toString());
            intent.putExtra("shoutouts_mode", "3");
            intent.putExtra("translation_type", 3);
            intent.putExtra("shout_out_data", this.f167324a.mo117005G());
            VideoRecordEntranceServiceImpl.Companion.getINSTANCE().startToolPermissionActivity(this.f167324a.mo36486t(), intent);
            Activity t = this.f167324a.mo36486t();
            Objects.requireNonNull(t, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shoutouts.ShoutOutsPublishActivity");
            ((ShoutOutsPublishActivity) t).mo116987g();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.c$m */
    public static final class C74404m extends AbstractView$OnClickListenerC80259bp {

        /* renamed from: a */
        final /* synthetic */ C74389c f167325a;

        static {
            Covode.recordClassIndex(87182);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C74404m(C74389c cVar) {
            this.f167325a = cVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp
        /* renamed from: a */
        public final void mo60873a(View view) {
            C74389c cVar = this.f167325a;
            cVar.mo117006H();
            C1731i.m5640b(CallableC74390a.f167310a, C1731i.f5562a).mo5534a(new C74391b(cVar), C1731i.f5564c, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.c$n */
    public static final class C74405n extends AbstractView$OnClickListenerC80259bp {

        /* renamed from: a */
        final /* synthetic */ C74389c f167326a;

        static {
            Covode.recordClassIndex(87183);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C74405n(C74389c cVar) {
            this.f167326a = cVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp
        /* renamed from: a */
        public final void mo60873a(View view) {
            Activity t = this.f167326a.mo36486t();
            Objects.requireNonNull(t, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shoutouts.ShoutOutsPublishActivity");
            ShoutOutsPublishActivity shoutOutsPublishActivity = (ShoutOutsPublishActivity) t;
            shoutOutsPublishActivity.mo116988h();
            shoutOutsPublishActivity.finish();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.c$t */
    public static final class C74412t implements IEffectService.OnVideoCoverCallback {

        /* renamed from: a */
        final /* synthetic */ C74389c f167338a;

        /* renamed from: b */
        final /* synthetic */ VideoPublishEditModel f167339b;

        static {
            Covode.recordClassIndex(87190);
        }

        @Override // com.p2082ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback
        public final void onGetVideoCoverFailed(int i) {
            new C23144b(this.f167338a.mo62771E()).mo37640e(R.string.f205096dmt).mo37637b();
        }

        @Override // com.p2082ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback
        public final void onGetVideoCoverSuccess(Bitmap bitmap) {
            C89219l.m154721d(bitmap, "");
            if (this.f167338a.mo62771E() != null && this.f167338a.mo36486t() != null) {
                Bitmap mergeCoverText = this.f167339b.getCoverPublishModel().getEffectTextModel().mergeCoverText(bitmap);
                AbstractC0706b a = C0708d.m2514a(this.f167338a.mo36486t().getResources(), mergeCoverText);
                C89219l.m154716b(a, "");
                this.f167338a.mo62771E().setImageDrawable(a);
                C73298a.m129355a(mergeCoverText, this.f167339b.getVideoCoverPath());
            }
        }

        C74412t(C74389c cVar, VideoPublishEditModel videoPublishEditModel) {
            this.f167338a = cVar;
            this.f167339b = videoPublishEditModel;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.c$p */
    public static final class C74407p extends AbstractView$OnClickListenerC80259bp {

        /* renamed from: a */
        final /* synthetic */ C74389c f167329a;

        /* renamed from: b */
        final /* synthetic */ VideoPublishEditModel f167330b;

        static {
            Covode.recordClassIndex(87185);
        }

        @Override // com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp
        /* renamed from: a */
        public final void mo60873a(View view) {
            this.f167329a.mo117011M();
            this.f167330b.mShoutOutsData = this.f167329a.mo117005G();
            this.f167329a.f167293B.push("shoutouts_detail_page");
            Activity t = this.f167329a.mo36486t();
            C89219l.m154716b(t, "");
            VideoPublishEditModel videoPublishEditModel = this.f167330b;
            C89219l.m154721d(t, "");
            C89219l.m154721d(videoPublishEditModel, "");
            Intent intent = new Intent(t, VEVideoPublishPreviewActivityShoutOut.class);
            intent.putExtra("args", (Serializable) videoPublishEditModel);
            C84412c.m145201a(t, intent);
        }

        C74407p(C74389c cVar, VideoPublishEditModel videoPublishEditModel) {
            this.f167329a = cVar;
            this.f167330b = videoPublishEditModel;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shoutouts.c$r */
    public static final class C74409r<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ C74389c f167332a;

        static {
            Covode.recordClassIndex(87187);
        }

        C74409r(C74389c cVar) {
            this.f167332a = cVar;
        }

        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(C1731i iVar) {
            C89219l.m154721d(iVar, "");
            if (iVar.mo5544c() || iVar.mo5539b()) {
                new C79459a(this.f167332a.mo36486t()).mo123050a(R.string.fz3).mo123053a();
                this.f167332a.mo117007I();
                return C89391z.f203057a;
            }
            this.f167332a.mo117007I();
            ShoutOutServiceImpl.m103042b().mo93979a();
            Activity activity = this.f167332a.f52549m;
            if (activity == null) {
                return null;
            }
            activity.finish();
            return C89391z.f203057a;
        }
    }

    /* renamed from: b */
    private final void m130856b(boolean z) {
        String str;
        Integer num;
        if (z || !this.f167293B.isEmpty()) {
            C84425b bVar = new C84425b();
            if (!this.f167293B.isEmpty()) {
                String pop = this.f167293B.pop();
                C89219l.m154716b(pop, "");
                str = pop;
            } else {
                str = "video_edit_page";
            }
            bVar.mo129406a("enter_from", str);
            bVar.mo129406a("shoot_entrance", C74418d.shootWay);
            bVar.mo129406a("shoot_way", C74418d.shootWay);
            C74418d dVar = this.f167306w;
            if (dVar == null) {
                C89219l.m154710a("shoutOutsData");
            }
            bVar.mo129403a("reviewed", dVar.getReviewed());
            C74418d dVar2 = this.f167306w;
            if (dVar2 == null) {
                C89219l.m154710a("shoutOutsData");
            }
            if (dVar2.getPrice() != null) {
                C74418d dVar3 = this.f167306w;
                if (dVar3 == null) {
                    C89219l.m154710a("shoutOutsData");
                }
                C74426g price = dVar3.getPrice();
                if (price != null) {
                    num = Integer.valueOf(price.getCoin());
                } else {
                    num = null;
                }
                bVar.mo129405a("setting_price", num);
            }
            C39162r.m79460a("enter_shoutouts_post_page", bVar.f188764a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.c$d */
    static final class C74394d<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ C74389c f167315a;

        static {
            Covode.recordClassIndex(87172);
        }

        C74394d(C74389c cVar) {
            this.f167315a = cVar;
        }

        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(C1731i iVar) {
            C89219l.m154721d(iVar, "");
            if (iVar.mo5544c() || iVar.mo5539b()) {
                new C79459a(this.f167315a.mo36486t()).mo123050a(R.string.fz3).mo123053a();
                this.f167315a.mo117007I();
            } else {
                this.f167315a.mo117007I();
                if (this.f167315a.f52549m != null) {
                    Activity activity = this.f167315a.f52549m;
                    if (activity == null) {
                        C89219l.m154715b();
                    }
                    C89219l.m154716b(activity, "");
                    if (!activity.isFinishing()) {
                        C74389c cVar = this.f167315a;
                        if (cVar.f52549m != null) {
                            Activity activity2 = cVar.f52549m;
                            if (activity2 == null) {
                                C89219l.m154715b();
                            }
                            C89219l.m154716b(activity2, "");
                            if (!activity2.isFinishing()) {
                                Intent intent = new Intent(cVar.mo36486t(), ShoutOutsEditSuccessActivity.class);
                                MentionEditText mentionEditText = cVar.f167307x;
                                if (mentionEditText == null) {
                                    C89219l.m154715b();
                                }
                                if (!TextUtils.isEmpty(String.valueOf(mentionEditText.getText())) || !TextUtils.isEmpty(cVar.f167292A)) {
                                    MentionEditText mentionEditText2 = cVar.f167307x;
                                    if (mentionEditText2 == null) {
                                        C89219l.m154715b();
                                    }
                                    if (C89219l.m154714a((Object) String.valueOf(mentionEditText2.getText()), (Object) cVar.f167292A)) {
                                        intent.putExtra("shoutout_edit_price", true);
                                    }
                                } else {
                                    C89219l.m154716b(intent.putExtra("shoutout_edit_price", true), "");
                                }
                                C74418d dVar = cVar.f167306w;
                                if (dVar == null) {
                                    C89219l.m154710a("shoutOutsData");
                                }
                                if (TextUtils.isEmpty(dVar.getCoverUrl())) {
                                    intent.putExtra("shoutout_hide_button", true);
                                }
                                Activity t = cVar.mo36486t();
                                C84349a.m145093a(intent, t);
                                t.startActivity(intent);
                                cVar.mo36486t().finish();
                            }
                        }
                    }
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.c$f */
    static final class C74396f<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ C74389c f167317a;

        static {
            Covode.recordClassIndex(87174);
        }

        C74396f(C74389c cVar) {
            this.f167317a = cVar;
        }

        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(C1731i iVar) {
            C89219l.m154721d(iVar, "");
            if (iVar.mo5544c() || iVar.mo5539b()) {
                new C79459a(this.f167317a.mo36486t()).mo123050a(R.string.fz3).mo123053a();
                this.f167317a.mo117007I();
            } else {
                this.f167317a.mo117007I();
                if (((C74450b) iVar.mo5545d()).f167429a > 0) {
                    C74389c cVar = this.f167317a;
                    if (cVar.f52549m != null) {
                        Activity activity = cVar.f52549m;
                        if (activity == null) {
                            C89219l.m154715b();
                        }
                        C89219l.m154716b(activity, "");
                        if (!activity.isFinishing()) {
                            C17197a.C17200a aVar = new C17197a.C17200a(cVar.f52549m);
                            C17197a.C17200a b = aVar.mo27189a(R.string.dla).mo27194b(R.string.dl9).mo27195b(R.string.a8y, (DialogInterface.OnClickListener) DialogInterface$OnClickListenerC74416x.f167343a, false);
                            b.f41060F = true;
                            b.mo27190a(R.string.dl7, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC74417y(cVar), false);
                            aVar.mo27193a().mo27185c();
                        }
                    }
                }
                if (((C74450b) iVar.mo5545d()).f167429a == 0) {
                    C74389c cVar2 = this.f167317a;
                    if (cVar2.f52549m != null) {
                        Activity activity2 = cVar2.f52549m;
                        if (activity2 == null) {
                            C89219l.m154715b();
                        }
                        C89219l.m154716b(activity2, "");
                        if (!activity2.isFinishing()) {
                            C17197a.C17200a aVar2 = new C17197a.C17200a(cVar2.f52549m);
                            C17197a.C17200a b2 = aVar2.mo27189a(R.string.dl_).mo27194b(R.string.dl8).mo27195b(R.string.a8y, (DialogInterface.OnClickListener) DialogInterface$OnClickListenerC74414v.f167341a, false);
                            b2.f41060F = true;
                            b2.mo27190a(R.string.dl7, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC74415w(cVar2), false);
                            aVar2.mo27193a().mo27185c();
                        }
                    }
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.c$o */
    public static final class C74406o extends AbstractView$OnClickListenerC80259bp {

        /* renamed from: a */
        final /* synthetic */ C74389c f167327a;

        /* renamed from: b */
        final /* synthetic */ VideoPublishEditModel f167328b;

        static {
            Covode.recordClassIndex(87184);
        }

        @Override // com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp
        /* renamed from: a */
        public final void mo60873a(View view) {
            if (C89219l.m154714a((Object) C74418d.MODE_EDIT, (Object) this.f167327a.mo117005G().getShoutOutsMode())) {
                C74389c cVar = this.f167327a;
                if (cVar.f52549m != null) {
                    Activity activity = cVar.f52549m;
                    if (activity == null) {
                        C89219l.m154715b();
                    }
                    C89219l.m154716b(activity, "");
                    if (!activity.isFinishing()) {
                        C17197a.C17200a aVar = new C17197a.C17200a(cVar.f52549m);
                        C17197a.C17200a a = aVar.mo27189a(R.string.cn9);
                        String c_ = cVar.mo36476c_(R.string.cn8);
                        C89219l.m154716b(c_, "");
                        String a2 = C1764a.m5928a(c_, Arrays.copyOf(new Object[]{AVExternalServiceImpl.m113114a().shoutOutsService().getShoutOutSettingsModel().mo117056a()}, 1));
                        C89219l.m154716b(a2, "");
                        a.f41071b = a2;
                        a.mo27190a(R.string.bx, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC74413u(cVar), false);
                        aVar.mo27193a().mo27185c();
                        C84425b bVar = new C84425b();
                        bVar.mo129406a("enter_from", "shoutouts_post_page");
                        C74418d dVar = cVar.f167306w;
                        if (dVar == null) {
                            C89219l.m154710a("shoutOutsData");
                        }
                        bVar.mo129403a("reviewed", dVar.getReviewed());
                        C39162r.m79460a("show_review_intro_pop_up", bVar.f188764a);
                        return;
                    }
                    return;
                }
                return;
            }
            C74418d dVar2 = this.f167328b.mShoutOutsData;
            MentionEditText mentionEditText = this.f167327a.f167307x;
            if (mentionEditText == null) {
                C89219l.m154715b();
            }
            dVar2.setDesc(String.valueOf(mentionEditText.getText()));
            this.f167328b.mShoutOutsData = this.f167327a.mo117005G();
            IShoutOutsService shoutOutsService = AVExternalServiceImpl.m113114a().shoutOutsService();
            Activity t = this.f167327a.mo36486t();
            Objects.requireNonNull(t, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            shoutOutsService.publishShoutOuts((ActivityC0945e) t, this.f167328b);
        }

        C74406o(C74389c cVar, VideoPublishEditModel videoPublishEditModel) {
            this.f167327a = cVar;
            this.f167328b = videoPublishEditModel;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.c$b */
    static final class C74391b<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ C74389c f167311a;

        static {
            Covode.recordClassIndex(87169);
        }

        C74391b(C74389c cVar) {
            this.f167311a = cVar;
        }

        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(C1731i iVar) {
            String str;
            String str2;
            C89219l.m154721d(iVar, "");
            if (iVar.mo5544c() || iVar.mo5539b()) {
                new C79459a(this.f167311a.mo36486t()).mo123050a(R.string.fz3).mo123053a();
                this.f167311a.mo117007I();
            } else {
                this.f167311a.mo117007I();
                C74448a.C74449a aVar = ((C74448a) iVar.mo5545d()).f167427a;
                if (aVar == null || aVar.f167428a == null) {
                    new C79459a(this.f167311a.mo36486t()).mo123050a(R.string.fz3).mo123053a();
                }
                C74448a.C74449a aVar2 = ((C74448a) iVar.mo5545d()).f167427a;
                if (aVar2 == null) {
                    C89219l.m154715b();
                }
                Boolean bool = aVar2.f167428a;
                if (bool == null) {
                    C89219l.m154715b();
                }
                if (bool.booleanValue()) {
                    StringBuilder sb = new StringBuilder();
                    C74428i a = C74427h.m130883a();
                    if (!TextUtils.isEmpty(a.f167377c)) {
                        str2 = a.f167377c;
                        if (str2 == null) {
                            C89219l.m154715b();
                        }
                    } else {
                        str2 = "https://www.tiktok.com/web-inapp/income-wallet/tax-flow?business_type=shoutouts&__status_bar=true&hide_nav_bar=1&should_full_screen=1";
                    }
                    Uri build = Uri.parse("aweme://webview").buildUpon().appendQueryParameter("url", sb.append(str2).append("&reviewed=").append(String.valueOf(this.f167311a.mo117005G().getReviewed())).toString()).build();
                    IBulletService f = BulletService.m71938f();
                    Activity t = this.f167311a.mo36486t();
                    C89219l.m154716b(t, "");
                    String uri = build.toString();
                    C89219l.m154716b(uri, "");
                    f.mo61852a(t, uri);
                    this.f167311a.f167293B.push("setting_currency_page");
                } else {
                    C74428i a2 = C74427h.m130883a();
                    if (!TextUtils.isEmpty(a2.f167376b)) {
                        str = a2.f167376b;
                        if (str == null) {
                            C89219l.m154715b();
                        }
                    } else {
                        str = "https://www.tiktok.com/web-inapp/shoutouts/creator/set-price?__status_bar=true&hide_nav_bar=1&should_full_screen=1";
                    }
                    if (this.f167311a.mo117005G().getPrice() != null) {
                        StringBuilder append = new StringBuilder().append(str).append("&coin=");
                        C74426g price = this.f167311a.mo117005G().getPrice();
                        if (price == null) {
                            C89219l.m154715b();
                        }
                        str = append.append(String.valueOf(price.getCoin())).append("&reviewed=").append(String.valueOf(this.f167311a.mo117005G().getReviewed())).toString();
                    }
                    Uri build2 = Uri.parse("aweme://webview").buildUpon().appendQueryParameter("url", str).build();
                    IBulletService f2 = BulletService.m71938f();
                    Activity t2 = this.f167311a.mo36486t();
                    C89219l.m154716b(t2, "");
                    String uri2 = build2.toString();
                    C89219l.m154716b(uri2, "");
                    f2.mo61852a(t2, uri2);
                    this.f167311a.f167293B.push("setting_price_page");
                }
                C22228c.m41831a(this.f167311a, new Runnable(this) {
                    /* class com.p2082ss.android.ugc.aweme.shoutouts.C74389c.C74391b.RunnableC743921 */

                    /* renamed from: a */
                    final /* synthetic */ C74391b f167312a;

                    static {
                        Covode.recordClassIndex(87170);
                    }

                    {
                        this.f167312a = r1;
                    }

                    public final void run() {
                        if (this.f167312a.f167311a.f167294C == null && this.f167312a.f167311a.mo117005G().getPrice() != null) {
                            this.f167312a.f167311a.mo117004F().setEnabled(true);
                        }
                    }
                }, 100);
                this.f167311a.mo117007I();
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j, com.bytedance.scene.group.AbstractC22213f
    /* renamed from: a */
    public final void mo22704a(Bundle bundle) {
        boolean z;
        MentionEditText mentionEditText;
        super.mo22704a(bundle);
        View c = mo36475c(R.id.afx);
        C89219l.m154716b(c, "");
        this.f167301k = (SimpleDraweeView) c;
        View c2 = mo36475c(R.id.pf);
        C89219l.m154716b(c2, "");
        this.f167296f = c2;
        View c3 = mo36475c(R.id.cld);
        C89219l.m154716b(c3, "");
        this.f167298h = c3;
        View c4 = mo36475c(R.id.title);
        C89219l.m154716b(c4, "");
        this.f167300j = (TextView) c4;
        View c5 = mo36475c(R.id.f1d);
        C89219l.m154716b(c5, "");
        this.f167303t = (TuxButton) c5;
        this.f167307x = (MentionEditText) mo36475c(R.id.aqy);
        View c6 = mo36475c(R.id.a7g);
        C89219l.m154716b(c6, "");
        this.f167304u = (TextView) c6;
        View c7 = mo36475c(R.id.dah);
        C89219l.m154716b(c7, "");
        TuxButton tuxButton = (TuxButton) c7;
        this.f167299i = tuxButton;
        if (tuxButton == null) {
            C89219l.m154710a("reEditView");
        }
        tuxButton.setButtonVariant(1);
        SimpleDraweeView simpleDraweeView = this.f167301k;
        if (simpleDraweeView == null) {
            C89219l.m154710a("coverView");
        }
        simpleDraweeView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        View c8 = mo36475c(R.id.a7h);
        C89219l.m154716b(c8, "");
        this.f167297g = c8;
        View c9 = mo36475c(R.id.d63);
        C89219l.m154716b(c9, "");
        this.f167302l = c9;
        View c10 = mo36475c(R.id.d6f);
        C89219l.m154716b(c10, "");
        this.f167305v = c10;
        MentionEditText mentionEditText2 = this.f167307x;
        if (mentionEditText2 != null) {
            mentionEditText2.setFilters(new C74429j[]{new C74429j(this.f167307x)});
        }
        VideoPublishEditModel videoPublishEditModel = this.f167294C;
        if (videoPublishEditModel == null) {
            C74418d dVar = this.f167295D;
            if (dVar == null) {
                C89219l.m154715b();
            }
            this.f167306w = dVar;
            if (dVar == null) {
                C89219l.m154710a("shoutOutsData");
            }
            this.f167292A = dVar.getDesc();
            TuxButton tuxButton2 = this.f167303t;
            if (tuxButton2 == null) {
                C89219l.m154710a("postView");
            }
            tuxButton2.setEnabled(false);
            MentionEditText mentionEditText3 = this.f167307x;
            if (mentionEditText3 == null) {
                C89219l.m154715b();
            }
            C74418d dVar2 = this.f167306w;
            if (dVar2 == null) {
                C89219l.m154710a("shoutOutsData");
            }
            mentionEditText3.setText(dVar2.getDesc());
            MentionEditText mentionEditText4 = this.f167307x;
            if (mentionEditText4 == null) {
                C89219l.m154715b();
            }
            mentionEditText4.addTextChangedListener(new C74397g(this));
            C74418d dVar3 = this.f167306w;
            if (dVar3 == null) {
                C89219l.m154710a("shoutOutsData");
            }
            if (!TextUtils.isEmpty(dVar3.getCoverUrl())) {
                SimpleDraweeView simpleDraweeView2 = this.f167301k;
                if (simpleDraweeView2 == null) {
                    C89219l.m154710a("coverView");
                }
                C74418d dVar4 = this.f167306w;
                if (dVar4 == null) {
                    C89219l.m154710a("shoutOutsData");
                }
                C84402a.m145174a(simpleDraweeView2, dVar4.getCoverUrl(), -1, -1);
            } else {
                View view = this.f167302l;
                if (view == null) {
                    C89219l.m154710a("previewLayout");
                }
                view.setVisibility(8);
                this.f167309z = true;
            }
            TuxButton tuxButton3 = this.f167303t;
            if (tuxButton3 == null) {
                C89219l.m154710a("postView");
            }
            tuxButton3.setText(R.string.dhr);
            View view2 = this.f167298h;
            if (view2 == null) {
                C89219l.m154710a("moreView");
            }
            view2.setOnClickListener(new C74398h(this));
            TuxButton tuxButton4 = this.f167303t;
            if (tuxButton4 == null) {
                C89219l.m154710a("postView");
            }
            tuxButton4.setOnClickListener(new C74400i(this));
            View view3 = this.f167302l;
            if (view3 == null) {
                C89219l.m154710a("previewLayout");
            }
            view3.setOnClickListener(new C74401j(this));
            View view4 = this.f167296f;
            if (view4 == null) {
                C89219l.m154710a("backView");
            }
            view4.setOnClickListener(new C74402k(this));
            TuxButton tuxButton5 = this.f167299i;
            if (tuxButton5 == null) {
                C89219l.m154710a("reEditView");
            }
            tuxButton5.setOnClickListener(new C74403l(this));
        } else {
            C74418d dVar5 = videoPublishEditModel.mShoutOutsData;
            C89219l.m154716b(dVar5, "");
            this.f167306w = dVar5;
            VideoPublishEditModel videoPublishEditModel2 = this.f167294C;
            if (videoPublishEditModel2.isMvThemeVideoType()) {
                String str = videoPublishEditModel2.mvCreateVideoData.videoCoverImgPath;
                if (C80720e.m139927b(str)) {
                    SimpleDraweeView simpleDraweeView3 = this.f167301k;
                    if (simpleDraweeView3 == null) {
                        C89219l.m154710a("coverView");
                    }
                    C84402a.m145174a(simpleDraweeView3, Uri.fromFile(new File(str)).toString(), -1, -1);
                }
            } else if (videoPublishEditModel2.isMultiVideoEdit()) {
                MultiEditVideoRecordData curMultiEditVideoRecordData = videoPublishEditModel2.getCurMultiEditVideoRecordData();
                C89219l.m154716b(curMultiEditVideoRecordData, "");
                VERecordData a = C71493a.m126273a(curMultiEditVideoRecordData);
                MultiEditVideoRecordData curMultiEditVideoRecordData2 = videoPublishEditModel2.getCurMultiEditVideoRecordData();
                C89219l.m154716b(curMultiEditVideoRecordData2, "");
                Pair<Integer, Integer> playInOutTime = curMultiEditVideoRecordData2.getPlayInOutTime();
                a.mo130356a(((Number) playInOutTime.first).longValue() * 1000, ((Number) playInOutTime.second).longValue() * 1000);
                SimpleDraweeView simpleDraweeView4 = this.f167301k;
                if (simpleDraweeView4 == null) {
                    C89219l.m154710a("coverView");
                }
                simpleDraweeView4.post(new RunnableC74410s(this, videoPublishEditModel2, playInOutTime, a));
            } else {
                ArrayList arrayList = new ArrayList();
                if (videoPublishEditModel2.mEffectList != null) {
                    arrayList.addAll(videoPublishEditModel2.mEffectList);
                }
                if (videoPublishEditModel2.mTimeEffect != null) {
                    arrayList.add(videoPublishEditModel2.mTimeEffect);
                    EffectPointModel effectPointModel = videoPublishEditModel2.mTimeEffect;
                    C89219l.m154716b(effectPointModel, "");
                    if (C89219l.m154714a((Object) effectPointModel.getKey(), (Object) "1")) {
                        z = true;
                        C73298a.m129357a(arrayList, C71817eu.m126789a(videoPublishEditModel2, C63238c.f143565C.mo73290r().mo86006d()).getFilterFolder(), videoPublishEditModel2.mSelectedFilterIntensity, (int) (videoPublishEditModel2.mVideoCoverStartTm * 1000.0f), z, videoPublishEditModel2.getPreviewInfo(), videoPublishEditModel2.getVideoCoverPath(), new C74412t(this, videoPublishEditModel2));
                    }
                }
                z = false;
                C73298a.m129357a(arrayList, C71817eu.m126789a(videoPublishEditModel2, C63238c.f143565C.mo73290r().mo86006d()).getFilterFolder(), videoPublishEditModel2.mSelectedFilterIntensity, (int) (videoPublishEditModel2.mVideoCoverStartTm * 1000.0f), z, videoPublishEditModel2.getPreviewInfo(), videoPublishEditModel2.getVideoCoverPath(), new C74412t(this, videoPublishEditModel2));
            }
            C74418d dVar6 = this.f167306w;
            if (dVar6 == null) {
                C89219l.m154710a("shoutOutsData");
            }
            if (dVar6.getPrice() == null) {
                TuxButton tuxButton6 = this.f167303t;
                if (tuxButton6 == null) {
                    C89219l.m154710a("postView");
                }
                tuxButton6.setEnabled(false);
            }
            C74418d dVar7 = this.f167306w;
            if (dVar7 == null) {
                C89219l.m154710a("shoutOutsData");
            }
            if (dVar7.getPrice() == null) {
                View view5 = this.f167302l;
                if (view5 == null) {
                    C89219l.m154710a("previewLayout");
                }
                view5.setVisibility(8);
            }
            View view6 = this.f167298h;
            if (view6 == null) {
                C89219l.m154710a("moreView");
            }
            view6.setVisibility(8);
            TuxButton tuxButton7 = this.f167299i;
            if (tuxButton7 == null) {
                C89219l.m154710a("reEditView");
            }
            tuxButton7.setVisibility(8);
            if (!TextUtils.isEmpty(videoPublishEditModel2.mShoutOutsData.getDesc()) && (mentionEditText = this.f167307x) != null) {
                mentionEditText.setText(videoPublishEditModel2.mShoutOutsData.getDesc());
            }
            View view7 = this.f167296f;
            if (view7 == null) {
                C89219l.m154710a("backView");
            }
            view7.setOnClickListener(new C74405n(this));
            TuxButton tuxButton8 = this.f167303t;
            if (tuxButton8 == null) {
                C89219l.m154710a("postView");
            }
            tuxButton8.setOnClickListener(new C74406o(this, videoPublishEditModel2));
            View view8 = this.f167302l;
            if (view8 == null) {
                C89219l.m154710a("previewLayout");
            }
            view8.setOnClickListener(new C74407p(this, videoPublishEditModel2));
        }
        View view9 = this.f167297g;
        if (view9 == null) {
            C89219l.m154710a("coinsLayout");
        }
        view9.setOnClickListener(new C74404m(this));
        C74418d dVar8 = this.f167306w;
        if (dVar8 == null) {
            C89219l.m154710a("shoutOutsData");
        }
        dVar8.getPrice();
        mo117009K();
        m130856b(true);
    }

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.c$w */
    static final class DialogInterface$OnClickListenerC74415w implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C74389c f167342a;

        static {
            Covode.recordClassIndex(87193);
        }

        DialogInterface$OnClickListenerC74415w(C74389c cVar) {
            this.f167342a = cVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f167342a.mo117008J();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.c$y */
    static final class DialogInterface$OnClickListenerC74417y implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C74389c f167344a;

        static {
            Covode.recordClassIndex(87195);
        }

        DialogInterface$OnClickListenerC74417y(C74389c cVar) {
            this.f167344a = cVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f167344a.mo117008J();
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j, com.bytedance.scene.group.AbstractC22186b
    /* renamed from: a */
    public final /* synthetic */ View mo22702a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return mo22702a(layoutInflater, viewGroup);
    }

    public C74389c(VideoPublishEditModel videoPublishEditModel, C74418d dVar) {
        this.f167294C = videoPublishEditModel;
        this.f167295D = dVar;
    }

    @Override // com.bytedance.scene.group.AbstractC22186b
    /* renamed from: b */
    public final ViewGroup mo36393b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C89219l.m154721d(layoutInflater, "");
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(layoutInflater, R.layout.ah3, viewGroup, false);
        Objects.requireNonNull(a, "null cannot be cast to non-null type android.view.ViewGroup");
        return (ViewGroup) a;
    }

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.c$u */
    static final class DialogInterface$OnClickListenerC74413u implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C74389c f167340a;

        static {
            Covode.recordClassIndex(87191);
        }

        DialogInterface$OnClickListenerC74413u(C74389c cVar) {
            this.f167340a = cVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            VideoPublishEditModel videoPublishEditModel = this.f167340a.f167294C;
            if (videoPublishEditModel == null) {
                C89219l.m154715b();
            }
            C74418d dVar = videoPublishEditModel.mShoutOutsData;
            MentionEditText mentionEditText = this.f167340a.f167307x;
            if (mentionEditText == null) {
                C89219l.m154715b();
            }
            dVar.setDesc(String.valueOf(mentionEditText.getText()));
            IShoutOutsService shoutOutsService = AVExternalServiceImpl.m113114a().shoutOutsService();
            Activity t = this.f167340a.mo36486t();
            Objects.requireNonNull(t, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            ActivityC0945e eVar = (ActivityC0945e) t;
            VideoPublishEditModel videoPublishEditModel2 = this.f167340a.f167294C;
            if (videoPublishEditModel2 == null) {
                C89219l.m154715b();
            }
            shoutOutsService.publishShoutOuts(eVar, videoPublishEditModel2);
        }
    }
}
