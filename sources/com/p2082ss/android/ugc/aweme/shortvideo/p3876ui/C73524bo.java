package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui;

import android.content.Intent;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.draft.model.C43223c;
import com.p2082ss.android.ugc.aweme.draft.model.C43225d;
import com.p2082ss.android.ugc.aweme.draft.model.LighteningExtraInfo;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.publish.C65682o;
import com.p2082ss.android.ugc.aweme.scheduler.PublishService;
import com.p2082ss.android.ugc.aweme.services.draft.IDraftService;
import com.p2082ss.android.ugc.aweme.services.effect.IEffectService;
import com.p2082ss.android.ugc.aweme.services.publish.Publish;
import com.p2082ss.android.ugc.aweme.settings.C68747m;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.C73457aj;
import com.p2082ss.android.ugc.aweme.story.publish.StoryPublishServiceImpl;
import com.p2082ss.android.ugc.aweme.tools.draft.p4112j.C78397c;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.tools.utils.C84890b;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import java.util.concurrent.Callable;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4600h.C89391z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.bo */
public final class C73524bo implements AbstractC73761o {

    /* renamed from: a */
    public ImageView f165177a;

    /* renamed from: b */
    boolean f165178b;

    /* renamed from: c */
    C73457aj f165179c;

    /* renamed from: d */
    public final ActivityC0945e f165180d;

    /* renamed from: e */
    public final C43223c f165181e;

    /* renamed from: f */
    public final AbstractC73762p f165182f;

    /* renamed from: g */
    private ImageView f165183g;

    /* renamed from: h */
    private ImageView f165184h;

    /* renamed from: i */
    private IDraftService.DraftListener f165185i;

    /* renamed from: j */
    private TextView f165186j;

    /* renamed from: k */
    private TextView f165187k;

    /* renamed from: l */
    private View f165188l;

    /* renamed from: m */
    private TextView f165189m;

    /* renamed from: n */
    private final View f165190n;

    /* renamed from: o */
    private final boolean f165191o;

    static {
        Covode.recordClassIndex(86261);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.bo$c */
    public static final class C73527c implements IEffectService.OnVideoCoverCallback {

        /* renamed from: a */
        final /* synthetic */ C73524bo f165194a;

        static {
            Covode.recordClassIndex(86264);
        }

        @Override // com.p2082ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback
        public final void onGetVideoCoverFailed(int i) {
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.bo$c$a */
        static final class CallableC73528a<V> implements Callable {

            /* renamed from: a */
            final /* synthetic */ C73527c f165195a;

            /* renamed from: b */
            final /* synthetic */ Bitmap f165196b;

            static {
                Covode.recordClassIndex(86265);
            }

            CallableC73528a(C73527c cVar, Bitmap bitmap) {
                this.f165195a = cVar;
                this.f165196b = bitmap;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                MethodCollector.m26663i(9869);
                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(this.f165196b, (int) C13628n.m24520b(this.f165195a.f165194a.f165180d, 48.0f), (int) C13628n.m24520b(this.f165195a.f165194a.f165180d, 62.0f), true);
                Bitmap a = C84890b.m145841a(createScaledBitmap, C13628n.m24520b(this.f165195a.f165194a.f165180d, 2.0f));
                this.f165196b.recycle();
                createScaledBitmap.recycle();
                MethodCollector.m26664o(9869);
                return a;
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C73527c(C73524bo boVar) {
            this.f165194a = boVar;
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.bo$c$b */
        static final class C73529b<TTaskResult, TContinuationResult> implements AbstractC1729g {

            /* renamed from: a */
            final /* synthetic */ ImageView f165197a;

            static {
                Covode.recordClassIndex(86266);
            }

            C73529b(ImageView imageView) {
                this.f165197a = imageView;
            }

            @Override // p077b.AbstractC1729g
            public final /* synthetic */ Object then(C1731i iVar) {
                ImageView imageView = this.f165197a;
                C89219l.m154716b(iVar, "");
                imageView.setImageBitmap((Bitmap) iVar.mo5545d());
                return C89391z.f203057a;
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback
        public final void onGetVideoCoverSuccess(Bitmap bitmap) {
            C89219l.m154721d(bitmap, "");
            ImageView imageView = this.f165194a.f165177a;
            if (imageView != null) {
                C1731i.m5640b(new CallableC73528a(this, bitmap), C1731i.f5562a).mo5534a(new C73529b(imageView), C1731i.f5564c, null);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.AbstractC73761o
    /* renamed from: a */
    public final void mo116110a() {
        this.f165178b = false;
        C43225d.m86328a(this.f165181e, new C73527c(this));
        ImageView imageView = this.f165184h;
        if (imageView == null) {
            C89219l.m154715b();
        }
        imageView.setOnClickListener(new View$OnClickListenerC73530d(this));
        this.f165185i = new C73525a(this);
        IDraftService a = C78397c.m136927a();
        IDraftService.DraftListener draftListener = this.f165185i;
        if (draftListener == null) {
            C89219l.m154715b();
        }
        a.registerDraftListener(draftListener);
        C39162r.m79460a("publish_retry_show", new C84425b().mo129406a("creation_id", this.f165181e.mo73676f()).f188764a);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.AbstractC73761o
    /* renamed from: b */
    public final void mo116112b() {
        if (this.f165182f.isShowing()) {
            if (!C68747m.m121180a()) {
                C63244g.m114602a().mo73287o().mo104793m().mo104825a(null);
            } else if (this.f165191o) {
                C63244g.m114602a().mo73287o().mo104793m().mo104828c(this.f165181e.mo73726r());
            } else {
                C63244g.m114602a().mo73287o().mo104793m().mo104826b();
            }
            PublishService.C67284a.m119208a();
            C84911q.m145928d("Publish | remove recover path by dismiss panel");
        }
        if (this.f165185i != null) {
            IDraftService a = C78397c.m136927a();
            IDraftService.DraftListener draftListener = this.f165185i;
            if (draftListener == null) {
                C89219l.m154715b();
            }
            a.unregisterDraftListener(draftListener);
            this.f165185i = null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.bo$a */
    public static final class C73525a implements IDraftService.DraftListener {

        /* renamed from: a */
        final /* synthetic */ C73524bo f165192a;

        static {
            Covode.recordClassIndex(86262);
        }

        @Override // com.p2082ss.android.ugc.aweme.services.draft.IDraftService.DraftListener
        public final void onDraftCheckedChanged(C43223c cVar, boolean z) {
            C89219l.m154721d(cVar, "");
        }

        @Override // com.p2082ss.android.ugc.aweme.services.draft.IDraftService.DraftListener
        public final void onDraftClean() {
        }

        @Override // com.p2082ss.android.ugc.aweme.services.draft.IDraftService.DraftListener
        public final void onDraftUpdate(C43223c cVar) {
            C89219l.m154721d(cVar, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C73525a(C73524bo boVar) {
            this.f165192a = boVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.services.draft.IDraftService.DraftListener
        public final void onDraftDelete(C43223c cVar) {
            if (cVar != null && TextUtils.equals(cVar.mo73726r(), this.f165192a.f165181e.mo73726r())) {
                this.f165192a.f165182f.dismiss();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.AbstractC73761o
    /* renamed from: a */
    public final void mo116111a(String str) {
        C89219l.m154721d(str, "");
        TextView textView = this.f165187k;
        if (textView != null) {
            textView.setText(str);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.bo$b */
    static final class View$OnClickListenerC73526b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C73524bo f165193a;

        static {
            Covode.recordClassIndex(86263);
        }

        View$OnClickListenerC73526b(C73524bo boVar) {
            this.f165193a = boVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C39162r.m79460a("publish_retry", new C84425b().mo129406a("action_type", "cancel").mo129406a("creation_id", this.f165193a.f165181e.mo73676f()).f188764a);
            this.f165193a.f165182f.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.bo$d */
    static final class View$OnClickListenerC73530d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C73524bo f165198a;

        static {
            Covode.recordClassIndex(86267);
        }

        View$OnClickListenerC73530d(C73524bo boVar) {
            this.f165198a = boVar;
        }

        public final void onClick(View view) {
            String scheduleId;
            ClickAgent.onClick(view);
            C73524bo boVar = this.f165198a;
            boVar.f165182f.dismiss();
            C84425b a = new C84425b().mo129406a("action_type", "publish").mo129406a("creation_id", boVar.f165181e.mo73676f());
            if (boVar.f165178b) {
                a.mo129406a("enter_from", "");
                a.mo129406a("enter_method", "click_retry");
            }
            C39162r.m79460a("publish_retry", a.f188764a);
            if (boVar.f165181e.mo73734t()) {
                LighteningExtraInfo lighteningExtraInfo = boVar.f165181e.f100900W.f100843bp;
                if (lighteningExtraInfo != null && (scheduleId = lighteningExtraInfo.getScheduleId()) != null && scheduleId.length() > 0) {
                    StoryPublishServiceImpl.m135314a().retryPublish(scheduleId);
                    ActivityC0945e eVar = boVar.f165180d;
                    Intent intent = new Intent();
                    intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_LIGHTENING_PUBLISH", true);
                    intent.putExtra("multi_publish_id", scheduleId);
                    Publish.isNeedProcessPublish = true;
                    C65682o.m117577a(eVar, intent);
                    return;
                }
                return;
            }
            C63244g.m114602a().mo73287o().mo104793m().mo104824a(boVar.f165180d, boVar.f165181e);
            C73457aj ajVar = boVar.f165179c;
            if (ajVar != null) {
                ajVar.f165009b.execute(new C73457aj.RunnableC73459b(ajVar));
            }
        }
    }

    public C73524bo(ActivityC0945e eVar, C43223c cVar, AbstractC73762p pVar, View view, boolean z) {
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(cVar, "");
        C89219l.m154721d(pVar, "");
        C89219l.m154721d(view, "");
        this.f165180d = eVar;
        this.f165181e = cVar;
        this.f165182f = pVar;
        this.f165190n = view;
        this.f165191o = z;
        View findViewById = view.findViewById(R.id.buj);
        Objects.requireNonNull(findViewById, "null cannot be cast to non-null type android.widget.ImageView");
        this.f165177a = (ImageView) findViewById;
        View findViewById2 = view.findViewById(R.id.bu5);
        Objects.requireNonNull(findViewById2, "null cannot be cast to non-null type android.widget.ImageView");
        this.f165183g = (ImageView) findViewById2;
        View findViewById3 = view.findViewById(R.id.f62);
        Objects.requireNonNull(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        this.f165187k = (TextView) findViewById3;
        this.f165188l = view.findViewById(R.id.eik);
        ImageView imageView = this.f165183g;
        if (imageView == null) {
            C89219l.m154715b();
        }
        imageView.setOnClickListener(new View$OnClickListenerC73526b(this));
        View findViewById4 = view.findViewById(R.id.byx);
        Objects.requireNonNull(findViewById4, "null cannot be cast to non-null type android.widget.ImageView");
        this.f165184h = (ImageView) findViewById4;
        View findViewById5 = view.findViewById(R.id.f1p);
        Objects.requireNonNull(findViewById5, "null cannot be cast to non-null type android.widget.TextView");
        this.f165186j = (TextView) findViewById5;
        View findViewById6 = view.findViewById(R.id.bi2);
        C89219l.m154716b(findViewById6, "");
        findViewById6.setVisibility(8);
        TextView textView = this.f165186j;
        if (textView == null) {
            C89219l.m154715b();
        }
        textView.setVisibility(8);
        ImageView imageView2 = this.f165184h;
        if (imageView2 == null) {
            C89219l.m154715b();
        }
        imageView2.setVisibility(0);
        View findViewById7 = view.findViewById(R.id.f6y);
        C89219l.m154716b(findViewById7, "");
        this.f165189m = (TextView) findViewById7;
        if (C68747m.m121180a() && !z) {
            String r = cVar.mo73726r();
            C89219l.m154716b(r, "");
            C73457aj ajVar = new C73457aj(eVar, r);
            this.f165179c = ajVar;
            ajVar.f165008a = ajVar.f165009b.submit(C73457aj.CallableC73458a.f165012a);
        }
    }
}
