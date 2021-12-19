package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui;

import android.graphics.Bitmap;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.draft.model.C43223c;
import com.p2082ss.android.ugc.aweme.draft.model.C43225d;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.scheduler.PublishService;
import com.p2082ss.android.ugc.aweme.services.effect.IEffectService;
import com.p2082ss.android.ugc.aweme.settings.C68747m;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.tools.utils.C84890b;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import java.util.concurrent.Callable;
import p077b.C1731i;
import p4600h.C89391z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.bn */
public final class C73518bn implements AbstractC73761o {

    /* renamed from: a */
    public ImageView f165163a;

    /* renamed from: b */
    public final ActivityC0945e f165164b;

    /* renamed from: c */
    public final AbstractC73762p f165165c;

    /* renamed from: d */
    private ImageView f165166d;

    /* renamed from: e */
    private TextView f165167e;

    /* renamed from: f */
    private final C43223c f165168f;

    /* renamed from: g */
    private final View f165169g;

    static {
        Covode.recordClassIndex(86255);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.AbstractC73761o
    /* renamed from: a */
    public final void mo116111a(String str) {
        C89219l.m154721d(str, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.AbstractC73761o
    /* renamed from: a */
    public final void mo116110a() {
        C43225d.m86328a(this.f165168f, new C73521c(this));
        C39162r.m79460a("tns_ags_float_post_ban", new C84425b().f188764a);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.AbstractC73761o
    /* renamed from: b */
    public final void mo116112b() {
        if (this.f165165c.isShowing()) {
            if (C68747m.m121180a()) {
                C63244g.m114602a().mo73287o().mo104793m().mo104828c(this.f165168f.mo73726r());
            } else {
                C63244g.m114602a().mo73287o().mo104793m().mo104825a(null);
            }
            PublishService.C67284a.m119208a();
            C84911q.m145928d("Publish | remove recover path by dismiss panel");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.bn$c */
    public static final class C73521c implements IEffectService.OnVideoCoverCallback {

        /* renamed from: a */
        final /* synthetic */ C73518bn f165172a;

        static {
            Covode.recordClassIndex(86258);
        }

        @Override // com.p2082ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback
        public final void onGetVideoCoverFailed(int i) {
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.bn$c$a */
        static final class CallableC73522a<V> implements Callable {

            /* renamed from: a */
            final /* synthetic */ C73521c f165173a;

            /* renamed from: b */
            final /* synthetic */ Bitmap f165174b;

            static {
                Covode.recordClassIndex(86259);
            }

            CallableC73522a(C73521c cVar, Bitmap bitmap) {
                this.f165173a = cVar;
                this.f165174b = bitmap;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                MethodCollector.m26663i(10979);
                if (this.f165173a.f165172a.f165163a != null) {
                    Bitmap createScaledBitmap = Bitmap.createScaledBitmap(this.f165174b, (int) C13628n.m24520b(this.f165173a.f165172a.f165164b, 48.0f), (int) C13628n.m24520b(this.f165173a.f165172a.f165164b, 62.0f), true);
                    final Bitmap a = C84890b.m145841a(createScaledBitmap, C13628n.m24520b(this.f165173a.f165172a.f165164b, 2.0f));
                    ImageView imageView = this.f165173a.f165172a.f165163a;
                    if (imageView == null) {
                        C89219l.m154715b();
                    }
                    imageView.post(new Runnable(this) {
                        /* class com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.C73518bn.C73521c.CallableC73522a.RunnableC735231 */

                        /* renamed from: a */
                        final /* synthetic */ CallableC73522a f165175a;

                        static {
                            Covode.recordClassIndex(86260);
                        }

                        {
                            this.f165175a = r1;
                        }

                        public final void run() {
                            ImageView imageView = this.f165175a.f165173a.f165172a.f165163a;
                            if (imageView == null) {
                                C89219l.m154715b();
                            }
                            imageView.setImageBitmap(a);
                        }
                    });
                    this.f165174b.recycle();
                    createScaledBitmap.recycle();
                }
                C89391z zVar = C89391z.f203057a;
                MethodCollector.m26664o(10979);
                return zVar;
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C73521c(C73518bn bnVar) {
            this.f165172a = bnVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback
        public final void onGetVideoCoverSuccess(Bitmap bitmap) {
            C89219l.m154721d(bitmap, "");
            C1731i.m5640b(new CallableC73522a(this, bitmap), C1731i.f5562a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.bn$a */
    public static final class C73519a extends ClickableSpan {

        /* renamed from: a */
        final /* synthetic */ C73518bn f165170a;

        static {
            Covode.recordClassIndex(86256);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C73519a(C73518bn bnVar) {
            this.f165170a = bnVar;
        }

        public final void updateDrawState(TextPaint textPaint) {
            C89219l.m154721d(textPaint, "");
            textPaint.setUnderlineText(false);
        }

        public final void onClick(View view) {
            C89219l.m154721d(view, "");
            C39223a.m79589c().mo68602a(this.f165170a.f165164b, "float_post");
            this.f165170a.f165165c.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.bn$b */
    static final class View$OnClickListenerC73520b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C73518bn f165171a;

        static {
            Covode.recordClassIndex(86257);
        }

        View$OnClickListenerC73520b(C73518bn bnVar) {
            this.f165171a = bnVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f165171a.f165165c.dismiss();
        }
    }

    public C73518bn(ActivityC0945e eVar, C43223c cVar, AbstractC73762p pVar, View view) {
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(cVar, "");
        C89219l.m154721d(pVar, "");
        C89219l.m154721d(view, "");
        this.f165164b = eVar;
        this.f165168f = cVar;
        this.f165165c = pVar;
        this.f165169g = view;
        View findViewById = view.findViewById(R.id.buj);
        Objects.requireNonNull(findViewById, "null cannot be cast to non-null type android.widget.ImageView");
        this.f165163a = (ImageView) findViewById;
        View findViewById2 = view.findViewById(R.id.bu5);
        Objects.requireNonNull(findViewById2, "null cannot be cast to non-null type android.widget.ImageView");
        this.f165166d = (ImageView) findViewById2;
        View findViewById3 = view.findViewById(R.id.f62);
        Objects.requireNonNull(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById3;
        this.f165167e = textView;
        if (textView != null) {
            String str = eVar.getString(R.string.epy) + " ";
            String string = eVar.getString(R.string.h_a);
            C89219l.m154716b(string, "");
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str + string);
            spannableStringBuilder.setSpan(new C73519a(this), str.length(), spannableStringBuilder.length(), 18);
            spannableStringBuilder.setSpan(new ForegroundColorSpan(eVar.getResources().getColor(R.color.bh)), str.length(), spannableStringBuilder.length(), 18);
            textView.setText(spannableStringBuilder);
            textView.setMovementMethod(new LinkMovementMethod());
        }
        ImageView imageView = this.f165166d;
        if (imageView == null) {
            C89219l.m154715b();
        }
        imageView.setOnClickListener(new View$OnClickListenerC73520b(this));
    }
}
