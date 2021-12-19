package com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.uploadpicsticker.p4003c;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.facebook.drawee.p1855f.C24246a;
import com.facebook.drawee.p1855f.C24247b;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p2082ss.android.ugc.aweme.feed.model.Video;
import com.p2082ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.p2082ss.android.ugc.aweme.p2730de.C40980o;
import com.p2082ss.android.ugc.aweme.p2730de.C40981p;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63253l;
import com.p2082ss.android.ugc.aweme.views.C81467t;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.playerkit.model.C84208l;
import com.p2082ss.android.ugc.playerkit.model.C84216o;
import com.p2082ss.android.ugc.playerkit.videoview.AbstractC84295k;
import com.p2082ss.android.ugc.playerkit.videoview.C84294j;
import com.p2082ss.android.ugc.playerkit.videoview.KeepSurfaceTextureView;
import com.p2082ss.android.ugc.playerkit.videoview.VideoViewComponent;
import com.p2082ss.android.ugc.tools.p4340c.C84402a;
import com.p2082ss.android.ugc.tools.view.C84916a;
import com.p2082ss.android.ugc.tools.view.widget.AVLoadingLayout;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.c.b */
public final class DialogC76004b extends Dialog {

    /* renamed from: c */
    public static final C76005a f170771c = new C76005a((byte) 0);

    /* renamed from: a */
    public SimpleDraweeView f170772a;

    /* renamed from: b */
    public Handler f170773b;

    /* renamed from: d */
    private AVLoadingLayout f170774d;

    /* renamed from: e */
    private KeepSurfaceTextureView f170775e;

    /* renamed from: f */
    private VideoViewComponent f170776f;

    /* renamed from: g */
    private TextView f170777g;

    /* renamed from: h */
    private Video f170778h;

    /* renamed from: i */
    private C76010c f170779i;

    /* renamed from: j */
    private final Effect f170780j;

    /* renamed from: k */
    private final C76003a f170781k;

    static {
        Covode.recordClassIndex(88948);
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.c.b$a */
    public static final class C76005a {
        static {
            Covode.recordClassIndex(88949);
        }

        private C76005a() {
        }

        public /* synthetic */ C76005a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.c.b$e */
    static final class RunnableC76009e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ DialogC76004b f170785a;

        static {
            Covode.recordClassIndex(88953);
        }

        RunnableC76009e(DialogC76004b bVar) {
            this.f170785a = bVar;
        }

        public final void run() {
            this.f170785a.mo119706a(false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.c.b$b */
    public static final class C76006b implements AbstractC84295k {

        /* renamed from: a */
        final /* synthetic */ DialogC76004b f170782a;

        static {
            Covode.recordClassIndex(88950);
        }

        @Override // com.p2082ss.android.ugc.playerkit.videoview.AbstractC84295k
        /* renamed from: a */
        public final void mo60625a(int i, int i2) {
        }

        @Override // com.p2082ss.android.ugc.playerkit.videoview.AbstractC84295k
        /* renamed from: b */
        public final void mo60627b(int i, int i2) {
        }

        @Override // com.p2082ss.android.ugc.playerkit.videoview.AbstractC84295k
        public final void aJ_() {
            if (this.f170782a.f170772a != null) {
                SimpleDraweeView simpleDraweeView = this.f170782a.f170772a;
                if (simpleDraweeView == null) {
                    C89219l.m154715b();
                }
                simpleDraweeView.setVisibility(0);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C76006b(DialogC76004b bVar) {
            this.f170782a = bVar;
        }
    }

    public final void dismiss() {
        VideoViewComponent videoViewComponent = this.f170776f;
        if (videoViewComponent != null) {
            if (this.f170779i != null) {
                videoViewComponent.mo80280a(this.f170779i);
            }
            VideoViewComponent videoViewComponent2 = this.f170776f;
            if (videoViewComponent2 == null) {
                C89219l.m154715b();
            }
            videoViewComponent2.mo129270d();
        }
        super.dismiss();
    }

    public final void show() {
        if (this.f170780j != null) {
            C40981p a = C40980o.m82513a(C63247i.f143610a, C63253l.f143623a.mo73323s().mo93851a());
            a.mo70160a().putString("upload_pic_sticker_show", a.mo70161a("upload_pic_sticker_show", "") + this.f170780j.getEffectId() + ",").apply();
        }
        super.show();
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.c.b$c */
    public static final class C76007c extends C76010c {

        /* renamed from: a */
        final /* synthetic */ DialogC76004b f170783a;

        static {
            Covode.recordClassIndex(88951);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C76007c(DialogC76004b bVar) {
            this.f170783a = bVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.uploadpicsticker.p4003c.C76010c, com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final void onPlayFailed(C84208l lVar) {
            C89219l.m154721d(lVar, "");
            this.f170783a.mo119706a(false);
            if (this.f170783a.f170772a != null) {
                SimpleDraweeView simpleDraweeView = this.f170783a.f170772a;
                if (simpleDraweeView == null) {
                    C89219l.m154715b();
                }
                simpleDraweeView.setVisibility(0);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.uploadpicsticker.p4003c.C76010c, com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final void onRenderFirstFrame(C84216o oVar) {
            C89219l.m154721d(oVar, "");
            this.f170783a.mo119706a(false);
            if (this.f170783a.f170772a != null) {
                SimpleDraweeView simpleDraweeView = this.f170783a.f170772a;
                if (simpleDraweeView == null) {
                    C89219l.m154715b();
                }
                simpleDraweeView.setVisibility(8);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.c.b$d */
    static final class View$OnClickListenerC76008d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DialogC76004b f170784a;

        static {
            Covode.recordClassIndex(88952);
        }

        View$OnClickListenerC76008d(DialogC76004b bVar) {
            this.f170784a = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f170784a.dismiss();
        }
    }

    /* renamed from: a */
    public final void mo119706a(boolean z) {
        int i;
        AVLoadingLayout aVLoadingLayout = this.f170774d;
        if (aVLoadingLayout != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            aVLoadingLayout.setVisibility(i);
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        C76003a aVar;
        super.onCreate(bundle);
        setContentView(R.layout.ahv);
        Window window = getWindow();
        if (window == null) {
            C89219l.m154715b();
        }
        C89219l.m154716b(window, "");
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        Window window2 = getWindow();
        if (window2 == null) {
            C89219l.m154715b();
        }
        C89219l.m154716b(window2, "");
        window2.setAttributes(attributes);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(null, null, null));
        Paint paint = shapeDrawable.getPaint();
        C89219l.m154716b(paint, "");
        paint.setColor(0);
        Window window3 = getWindow();
        if (window3 == null) {
            C89219l.m154715b();
        }
        window3.setBackgroundDrawable(shapeDrawable);
        setCanceledOnTouchOutside(true);
        findViewById(R.id.dnk).setOnClickListener(new View$OnClickListenerC76008d(this));
        C76003a aVar2 = this.f170781k;
        if (aVar2 != null && !TextUtils.isEmpty(aVar2.mo119705b()) && !TextUtils.isEmpty(aVar2.mo119704a())) {
            this.f170775e = (KeepSurfaceTextureView) findViewById(R.id.fe8);
            this.f170772a = (SimpleDraweeView) findViewById(R.id.bwq);
            this.f170774d = (AVLoadingLayout) findViewById(R.id.cg3);
            this.f170777g = (TextView) findViewById(R.id.ads);
            View findViewById = findViewById(R.id.fcz);
            if (Build.VERSION.SDK_INT >= 21) {
                C89219l.m154716b(findViewById, "");
                SimpleDraweeView simpleDraweeView = this.f170772a;
                if (simpleDraweeView == null) {
                    C89219l.m154715b();
                }
                findViewById.setOutlineProvider(new C81467t((int) C13628n.m24520b(simpleDraweeView.getContext(), 4.0f)));
                findViewById.setClipToOutline(true);
            }
            View findViewById2 = findViewById(R.id.ci3);
            Drawable a = C84916a.m145947a(-1, -1, 0, (int) C13628n.m24520b(getContext(), 4.0f));
            C89219l.m154716b(findViewById2, "");
            findViewById2.setBackground(a);
            Drawable a2 = C84916a.m145947a(303437859, 303437859, 0, 0);
            Context context = getContext();
            C89219l.m154716b(context, "");
            C24246a a3 = new C24247b(context.getResources()).mo39973a();
            a3.mo39953a(1, a2);
            a3.mo39953a(5, a2);
            SimpleDraweeView simpleDraweeView2 = this.f170772a;
            if (simpleDraweeView2 == null) {
                C89219l.m154715b();
            }
            simpleDraweeView2.setHierarchy(a3);
            C76003a aVar3 = this.f170781k;
            if (aVar3 != null) {
                if (!TextUtils.isEmpty(aVar3.mo119705b())) {
                    C84402a.m145174a(this.f170772a, this.f170781k.mo119705b(), -1, -1);
                }
                if (TextUtils.isEmpty(this.f170781k.f170769c)) {
                    TextView textView = this.f170777g;
                    if (textView == null) {
                        C89219l.m154715b();
                    }
                    textView.setVisibility(8);
                } else {
                    TextView textView2 = this.f170777g;
                    if (textView2 == null) {
                        C89219l.m154715b();
                    }
                    textView2.setVisibility(0);
                    TextView textView3 = this.f170777g;
                    if (textView3 == null) {
                        C89219l.m154715b();
                    }
                    textView3.setText(this.f170781k.f170769c);
                }
            }
            this.f170779i = new C76007c(this);
            KeepSurfaceTextureView keepSurfaceTextureView = this.f170775e;
            if (keepSurfaceTextureView == null) {
                C89219l.m154715b();
            }
            C84294j a4 = C84294j.m144981a(keepSurfaceTextureView);
            VideoViewComponent videoViewComponent = new VideoViewComponent();
            this.f170776f = videoViewComponent;
            KeepSurfaceTextureView keepSurfaceTextureView2 = this.f170775e;
            if (keepSurfaceTextureView2 == null) {
                C89219l.m154715b();
            }
            videoViewComponent.mo129265a(keepSurfaceTextureView2);
            VideoViewComponent videoViewComponent2 = this.f170776f;
            if (videoViewComponent2 == null) {
                C89219l.m154715b();
            }
            videoViewComponent2.mo129268b(this.f170779i);
            a4.mo129312a(new C76006b(this));
            if (this.f170776f != null && (aVar = this.f170781k) != null && !TextUtils.isEmpty(aVar.mo119704a())) {
                if (this.f170778h == null) {
                    this.f170778h = new Video();
                    VideoUrlModel videoUrlModel = new VideoUrlModel();
                    videoUrlModel.setBytevc1(false);
                    ArrayList arrayList = new ArrayList();
                    C76003a aVar4 = this.f170781k;
                    if (aVar4 == null) {
                        C89219l.m154715b();
                    }
                    String a5 = aVar4.mo119704a();
                    if (a5 == null) {
                        C89219l.m154715b();
                    }
                    arrayList.add(a5);
                    videoUrlModel.setUrlList(arrayList);
                    videoUrlModel.setUrlKey(this.f170781k.f170768b);
                    videoUrlModel.setUri(this.f170781k.f170768b);
                    Video video = this.f170778h;
                    if (video == null) {
                        C89219l.m154715b();
                    }
                    video.setPlayAddr(videoUrlModel);
                    Video video2 = this.f170778h;
                    if (video2 == null) {
                        C89219l.m154715b();
                    }
                    video2.setSourceId(this.f170781k.f170768b);
                }
                mo119706a(true);
                VideoViewComponent videoViewComponent3 = this.f170776f;
                if (videoViewComponent3 == null) {
                    C89219l.m154715b();
                }
                Video video3 = this.f170778h;
                if (video3 == null) {
                    C89219l.m154715b();
                }
                videoViewComponent3.mo129262a(video3);
                Handler handler = this.f170773b;
                if (handler != null) {
                    handler.postDelayed(new RunnableC76009e(this), 5000);
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DialogC76004b(Context context, Effect effect, C76003a aVar) {
        super(context, R.style.gd);
        C89219l.m154721d(context, "");
        this.f170780j = effect;
        this.f170781k = aVar;
    }
}
