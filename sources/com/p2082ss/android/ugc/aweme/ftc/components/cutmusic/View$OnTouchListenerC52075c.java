package com.p2082ss.android.ugc.aweme.ftc.components.cutmusic;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.lifecycle.AbstractC1204m;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.jedi.arch.AbstractC20362a;
import com.bytedance.jedi.arch.AbstractC20367ae;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.AbstractC20382b;
import com.bytedance.jedi.arch.AbstractC20477i;
import com.bytedance.jedi.arch.AbstractC20534v;
import com.bytedance.jedi.arch.C20365ac;
import com.bytedance.jedi.arch.C20370ah;
import com.bytedance.jedi.arch.C20373ak;
import com.bytedance.jedi.arch.C20374al;
import com.bytedance.jedi.arch.C20375am;
import com.bytedance.jedi.arch.C20376an;
import com.bytedance.jedi.arch.C20391d;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.bytedance.scene.AbstractC22219j;
import com.p2082ss.android.ugc.asve.editor.AbstractC31071f;
import com.p2082ss.android.ugc.aweme.p2730de.C40983r;
import com.p2082ss.android.ugc.aweme.shortvideo.C69905c;
import com.p2082ss.android.ugc.aweme.shortvideo.C70005cr;
import com.p2082ss.android.ugc.aweme.shortvideo.C70625d;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.KTVView;
import com.p2082ss.android.ugc.aweme.shortvideo.cutmusic.C70592b;
import com.p2082ss.android.ugc.aweme.shortvideo.cutmusic.C70598f;
import com.p2082ss.android.ugc.aweme.shortvideo.cutmusic.C70612k;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C70976bp;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73991bj;
import com.p2082ss.android.ugc.aweme.utils.C80322d;
import com.p2082ss.android.ugc.gamora.editor.AbstractC82563s;
import com.p2082ss.android.ugc.gamora.editor.sticker.core.EditStickerViewModel;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84917a;
import com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84919c;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.android.vesdk.C85581w;
import com.p2082ss.android.vesdk.VEListener;
import dmt.p4542av.video.C88295s;
import java.util.Objects;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89386u;
import p4600h.C89391z;
import p4600h.EnumC89331m;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4612a.AbstractC89188r;
import p4600h.p4611f.p4612a.AbstractC89189s;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.aweme.ftc.components.cutmusic.c */
public final class View$OnTouchListenerC52075c extends AbstractC22219j implements View.OnTouchListener, AbstractC20382b, AbstractC21566a {

    /* renamed from: D */
    public static final C52077b f119962D = new C52077b((byte) 0);

    /* renamed from: A */
    public final VEListener.AbstractC85250s f119963A = new C52091o(this);

    /* renamed from: B */
    final C52088l f119964B = new C52088l(this);

    /* renamed from: C */
    public boolean f119965C;

    /* renamed from: E */
    private TextView f119966E;

    /* renamed from: F */
    private ImageView f119967F;

    /* renamed from: G */
    private FrameLayout f119968G;

    /* renamed from: H */
    private View f119969H;

    /* renamed from: I */
    private float f119970I;

    /* renamed from: J */
    private float f119971J;

    /* renamed from: K */
    private AbstractC52078c f119972K;

    /* renamed from: L */
    private FTCEditMusicCutViewModel f119973L;

    /* renamed from: M */
    private final AbstractC89244h f119974M = C89250i.m154774a(EnumC89331m.NONE, new C52076a(this));

    /* renamed from: N */
    private final RunnableC52089m f119975N = new RunnableC52089m(this);

    /* renamed from: O */
    private final C21582f f119976O;

    /* renamed from: a */
    public ImageView f119977a;

    /* renamed from: b */
    public KTVView f119978b;

    /* renamed from: c */
    TextView f119979c;

    /* renamed from: d */
    TextView f119980d;

    /* renamed from: e */
    public C70592b f119981e;

    /* renamed from: f */
    public RelativeLayout f119982f;

    /* renamed from: g */
    public AbstractC82563s f119983g;

    /* renamed from: h */
    public VideoPublishEditModel f119984h;

    /* renamed from: i */
    int f119985i;

    /* renamed from: j */
    public int f119986j;

    /* renamed from: k */
    public int f119987k;

    /* renamed from: l */
    public boolean f119988l;

    /* renamed from: t */
    public boolean f119989t;

    /* renamed from: u */
    public int f119990u;

    /* renamed from: v */
    public int f119991v;

    /* renamed from: w */
    public final Handler f119992w = new Handler(Looper.getMainLooper());

    /* renamed from: x */
    AbstractC84919c f119993x;

    /* renamed from: y */
    public AbstractC52079d f119994y;

    /* renamed from: z */
    public EditStickerViewModel f119995z;

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.cutmusic.c$c */
    public interface AbstractC52078c {
        static {
            Covode.recordClassIndex(61457);
        }

        /* renamed from: a */
        void mo87814a();
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.cutmusic.c$d */
    public interface AbstractC52079d {
        static {
            Covode.recordClassIndex(61458);
        }

        /* renamed from: a */
        void mo87815a();
    }

    static {
        Covode.recordClassIndex(61454);
    }

    /* renamed from: b */
    public final AbstractC72510a mo87811b() {
        return (AbstractC72510a) this.f119974M.getValue();
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.cutmusic.c$b */
    public static final class C52077b {
        static {
            Covode.recordClassIndex(61456);
        }

        private C52077b() {
        }

        public /* synthetic */ C52077b(byte b) {
            this();
        }
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f119976O;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.AbstractC20367ae
    public final /* bridge */ /* synthetic */ AbstractC20477i getReceiver() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20534v
    public final AbstractC1204m getLifecycleOwner() {
        return AbstractC20382b.C20383a.m38581a(this);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final AbstractC20534v getLifecycleOwnerHolder() {
        return AbstractC20382b.C20383a.m38601b(this);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final AbstractC20367ae<AbstractC20477i> getReceiverHolder() {
        return AbstractC20382b.C20383a.m38604c(this);
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.cutmusic.c$a */
    public static final class C52076a extends AbstractC89220m implements AbstractC89171a<AbstractC72510a> {

        /* renamed from: a */
        final /* synthetic */ View$OnTouchListenerC52075c f119996a;

        static {
            Covode.recordClassIndex(61455);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C52076a(View$OnTouchListenerC52075c cVar) {
            super(0);
            this.f119996a = cVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.aweme.shortvideo.preview.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a invoke() {
            /*
                r2 = this;
                com.ss.android.ugc.aweme.ftc.components.cutmusic.c r0 = r2.f119996a
                androidx.fragment.app.e r0 = com.bytedance.scene.ktx.C22228c.m41832b(r0)
                com.bytedance.als.ApiCenter r1 = com.bytedance.als.ApiCenter.C2545a.m7450a(r0)
                java.lang.Class<com.ss.android.ugc.aweme.shortvideo.preview.a> r0 = com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a.class
                com.bytedance.als.b r0 = r1.mo7013a(r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ftc.components.cutmusic.View$OnTouchListenerC52075c.C52076a.invoke():com.bytedance.als.b");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.cutmusic.c$o */
    static final class C52091o implements VEListener.AbstractC85250s {

        /* renamed from: a */
        final /* synthetic */ View$OnTouchListenerC52075c f120009a;

        static {
            Covode.recordClassIndex(61470);
        }

        C52091o(View$OnTouchListenerC52075c cVar) {
            this.f120009a = cVar;
        }

        @Override // com.p2082ss.android.vesdk.VEListener.AbstractC85250s
        /* renamed from: a */
        public final void mo87822a() {
            AbstractC31071f value = this.f120009a.mo87811b().mo114778C().getValue();
            if (value != null) {
                value.mo56388t();
            }
        }
    }

    /* renamed from: D */
    public final void mo87807D() {
        AbstractC52078c cVar = this.f119972K;
        if (cVar != null) {
            cVar.mo87814a();
        }
        AbstractC84919c cVar2 = this.f119993x;
        if (cVar2 != null) {
            cVar2.mo87535c(this.f119964B);
        }
    }

    /* renamed from: a */
    public final VideoPublishEditModel mo87808a() {
        VideoPublishEditModel videoPublishEditModel = this.f119984h;
        if (videoPublishEditModel == null) {
            C89219l.m154710a("mModel");
        }
        return videoPublishEditModel;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final int mo87812d() {
        AbstractC31071f value = mo87811b().mo114778C().getValue();
        if (value == null) {
            C89219l.m154715b();
        }
        return value.mo56368j();
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.cutmusic.c$e */
    static final class RunnableC52080e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ View$OnTouchListenerC52075c f119997a;

        static {
            Covode.recordClassIndex(61459);
        }

        RunnableC52080e(View$OnTouchListenerC52075c cVar) {
            this.f119997a = cVar;
        }

        public final void run() {
            MethodCollector.m26663i(12170);
            RelativeLayout relativeLayout = this.f119997a.f119982f;
            if (relativeLayout == null) {
                C89219l.m154710a("slideContainer");
            }
            relativeLayout.addView(View$OnTouchListenerC52075c.m96828a(this.f119997a));
            View$OnTouchListenerC52075c.m96828a(this.f119997a).post(new Runnable(this) {
                /* class com.p2082ss.android.ugc.aweme.ftc.components.cutmusic.View$OnTouchListenerC52075c.RunnableC52080e.RunnableC520811 */

                /* renamed from: a */
                final /* synthetic */ RunnableC52080e f119998a;

                static {
                    Covode.recordClassIndex(61460);
                }

                {
                    this.f119998a = r1;
                }

                public final void run() {
                    if (this.f119998a.f119997a.f119986j == 0) {
                        View$OnTouchListenerC52075c.m96828a(this.f119998a.f119997a).setX(View$OnTouchListenerC52075c.m96829b(this.f119998a.f119997a).getX() - ((float) (View$OnTouchListenerC52075c.m96828a(this.f119998a.f119997a).getWidth() / 2)));
                    } else {
                        double d = (double) this.f119998a.f119997a.f119986j;
                        Double.isNaN(d);
                        double width = (double) View$OnTouchListenerC52075c.m96829b(this.f119998a.f119997a).getWidth();
                        Double.isNaN(width);
                        double d2 = d * 1.0d * width;
                        double d3 = (double) this.f119998a.f119997a.f119990u;
                        Double.isNaN(d3);
                        View$OnTouchListenerC52075c.m96828a(this.f119998a.f119997a).setX((View$OnTouchListenerC52075c.m96829b(this.f119998a.f119997a).getX() + ((float) ((int) (d2 / d3)))) - ((float) (View$OnTouchListenerC52075c.m96828a(this.f119998a.f119997a).getWidth() / 2)));
                    }
                    View$OnTouchListenerC52075c.m96829b(this.f119998a.f119997a).setLength(this.f119998a.f119997a.mo87806C());
                    View$OnTouchListenerC52075c.m96828a(this.f119998a.f119997a).setOnTouchListener(this.f119998a.f119997a);
                }
            });
            MethodCollector.m26664o(12170);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.cutmusic.c$m */
    public static final class RunnableC52089m implements Runnable {

        /* renamed from: a */
        final /* synthetic */ View$OnTouchListenerC52075c f120007a;

        static {
            Covode.recordClassIndex(61468);
        }

        public final void run() {
            AbstractC31071f value = this.f120007a.mo87811b().mo114778C().getValue();
            if (value != null) {
                int k = value.mo56370k();
                int i = this.f120007a.f119991v;
                if (k < i) {
                    View$OnTouchListenerC52075c.m96831c(this.f120007a).mo111355b((((float) k) * 1.0f) / ((float) i));
                }
                this.f120007a.f119992w.post(this);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        RunnableC52089m(View$OnTouchListenerC52075c cVar) {
            this.f120007a = cVar;
        }
    }

    /* renamed from: C */
    public final int mo87806C() {
        if (this.f119985i >= this.f119990u) {
            KTVView kTVView = this.f119978b;
            if (kTVView == null) {
                C89219l.m154710a("mKTVView");
            }
            return kTVView.getWidth();
        }
        KTVView kTVView2 = this.f119978b;
        if (kTVView2 == null) {
            C89219l.m154710a("mKTVView");
        }
        double width = (double) kTVView2.getWidth();
        Double.isNaN(width);
        double d = 1.0d * width;
        double d2 = (double) this.f119985i;
        Double.isNaN(d2);
        double d3 = d * d2;
        double d4 = (double) this.f119990u;
        Double.isNaN(d4);
        return (int) (d3 / d4);
    }

    /* renamed from: E */
    private final int m96827E() {
        if (this.f119985i >= this.f119990u) {
            KTVView kTVView = this.f119978b;
            if (kTVView == null) {
                C89219l.m154710a("mKTVView");
            }
            return (int) (((1.0f * ((float) kTVView.getWidth())) * 15000.0f) / ((float) this.f119990u));
        }
        KTVView kTVView2 = this.f119978b;
        if (kTVView2 == null) {
            C89219l.m154710a("mKTVView");
        }
        double width = (double) kTVView2.getWidth();
        Double.isNaN(width);
        double d = 1.0d * width;
        double d2 = (double) this.f119985i;
        Double.isNaN(d2);
        double d3 = d * d2;
        double d4 = (double) this.f119990u;
        Double.isNaN(d4);
        return (int) (d3 / d4);
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.cutmusic.c$i */
    public static final class C52085i implements AbstractC52079d {

        /* renamed from: a */
        final /* synthetic */ View$OnTouchListenerC52075c f120002a;

        static {
            Covode.recordClassIndex(61464);
        }

        @Override // com.p2082ss.android.ugc.aweme.ftc.components.cutmusic.View$OnTouchListenerC52075c.AbstractC52079d
        /* renamed from: a */
        public final void mo87815a() {
            int min;
            C69905c cVar = C70005cr.m123611a().f156482a;
            AbstractC31071f value = this.f120002a.mo87811b().mo114778C().getValue();
            if (value != null) {
                C89219l.m154716b(value, "");
                if (cVar == null || cVar.getShootDuration() <= 0) {
                    min = Math.min(15000, value.mo56368j());
                } else if (Math.abs(value.mo56368j() - cVar.getShootDuration()) >= 1000) {
                    min = cVar.getShootDuration();
                } else {
                    min = value.mo56368j();
                }
                int min2 = Math.min(min, value.mo56368j());
                AbstractC72510a b = this.f120002a.mo87811b();
                int i = this.f120002a.f119986j;
                View$OnTouchListenerC52075c.m96831c(this.f120002a);
                C88295s a = C88295s.m153434a(i, min2, false);
                C89219l.m154716b(a, "");
                b.mo114802a(a);
                int a2 = value.mo56266a(0, C85581w.EnumC85607f.EDITOR_SEEK_FLAG_LastSeek, this.f120002a.f119963A);
                if (a2 != 0) {
                    C73991bj.m130131b("onPlayMusic seek error: ".concat(String.valueOf(a2)));
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C52085i(View$OnTouchListenerC52075c cVar) {
            this.f120002a = cVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.cutmusic.c$p */
    static final class RunnableC52092p implements Runnable {

        /* renamed from: a */
        final /* synthetic */ View$OnTouchListenerC52075c f120010a;

        static {
            Covode.recordClassIndex(61471);
        }

        RunnableC52092p(View$OnTouchListenerC52075c cVar) {
            this.f120010a = cVar;
        }

        public final void run() {
            View$OnTouchListenerC52075c cVar = this.f120010a;
            double d = (double) cVar.f119986j;
            Double.isNaN(d);
            double d2 = d * 1.0d;
            KTVView kTVView = cVar.f119978b;
            if (kTVView == null) {
                C89219l.m154710a("mKTVView");
            }
            double width = (double) kTVView.getWidth();
            Double.isNaN(width);
            double d3 = d2 * width;
            double d4 = (double) cVar.f119990u;
            Double.isNaN(d4);
            int i = (int) (d3 / d4);
            ImageView imageView = cVar.f119977a;
            if (imageView == null) {
                C89219l.m154710a("mSlide");
            }
            KTVView kTVView2 = cVar.f119978b;
            if (kTVView2 == null) {
                C89219l.m154710a("mKTVView");
            }
            float x = kTVView2.getX() + ((float) i);
            ImageView imageView2 = cVar.f119977a;
            if (imageView2 == null) {
                C89219l.m154710a("mSlide");
            }
            imageView.setX(x - ((float) (imageView2.getWidth() / 2)));
            KTVView kTVView3 = cVar.f119978b;
            if (kTVView3 == null) {
                C89219l.m154710a("mKTVView");
            }
            kTVView3.setStart(i);
            KTVView kTVView4 = cVar.f119978b;
            if (kTVView4 == null) {
                C89219l.m154710a("mKTVView");
            }
            kTVView4.setLength(cVar.mo87806C());
            TextView textView = cVar.f119979c;
            if (textView == null) {
                C89219l.m154710a("mTextViewTimeStart");
            }
            textView.setText(C40983r.m82524a(cVar.f119986j));
            C70592b bVar = cVar.f119981e;
            if (bVar == null) {
                C89219l.m154710a("cutMusicLayout");
            }
            bVar.setSoundLoopSelected(cVar.f119988l);
            VideoPublishEditModel videoPublishEditModel = cVar.f119984h;
            if (videoPublishEditModel == null) {
                C89219l.m154710a("mModel");
            }
            if (C70976bp.m125307c(videoPublishEditModel)) {
                C70592b bVar2 = cVar.f119981e;
                if (bVar2 == null) {
                    C89219l.m154710a("cutMusicLayout");
                }
                bVar2.setSoundLoopClickable(false);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.cutmusic.c$h */
    public static final class C52084h implements AbstractC52078c {

        /* renamed from: a */
        final /* synthetic */ View$OnTouchListenerC52075c f120001a;

        static {
            Covode.recordClassIndex(61463);
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x0072  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x008e  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x00a4  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x00dc  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x00f8  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x0101  */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x0139  */
        @Override // com.p2082ss.android.ugc.aweme.ftc.components.cutmusic.View$OnTouchListenerC52075c.AbstractC52078c
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo87814a() {
            /*
            // Method dump skipped, instructions count: 357
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ftc.components.cutmusic.View$OnTouchListenerC52075c.C52084h.mo87814a():void");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C52084h(View$OnTouchListenerC52075c cVar) {
            this.f120001a = cVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.cutmusic.c$f */
    public static final class C52082f implements C70598f.AbstractC70599a {

        /* renamed from: a */
        final /* synthetic */ View$OnTouchListenerC52075c f119999a;

        static {
            Covode.recordClassIndex(61461);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C52082f(View$OnTouchListenerC52075c cVar) {
            this.f119999a = cVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.cutmusic.C70598f.AbstractC70599a
        /* renamed from: a */
        public final void mo87818a(float f) {
            View$OnTouchListenerC52075c cVar = this.f119999a;
            cVar.f119986j = (int) (f * ((float) cVar.f119990u));
            AbstractC52079d dVar = this.f119999a.f119994y;
            if (dVar != null) {
                dVar.mo87815a();
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.cutmusic.C70598f.AbstractC70599a
        /* renamed from: b */
        public final void mo87819b(float f) {
            View$OnTouchListenerC52075c.m96831c(this.f119999a).setTimeBubble((int) (f * ((float) this.f119999a.f119990u)));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.cutmusic.c$g */
    public static final class C52083g implements C70592b.AbstractC70593a {

        /* renamed from: a */
        final /* synthetic */ View$OnTouchListenerC52075c f120000a;

        static {
            Covode.recordClassIndex(61462);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C52083g(View$OnTouchListenerC52075c cVar) {
            this.f120000a = cVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.cutmusic.c$l */
    public static final class C52088l implements AbstractC84917a {

        /* renamed from: a */
        final /* synthetic */ View$OnTouchListenerC52075c f120006a;

        static {
            Covode.recordClassIndex(61467);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C52088l(View$OnTouchListenerC52075c cVar) {
            this.f120006a = cVar;
        }

        @Override // com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84917a
        public final boolean onKeyDown(int i, KeyEvent keyEvent) {
            if (i != 4) {
                return false;
            }
            View$OnTouchListenerC52075c cVar = this.f120006a;
            cVar.f119986j = cVar.f119987k;
            C70592b bVar = cVar.f119981e;
            if (bVar == null) {
                C89219l.m154710a("cutMusicLayout");
            }
            bVar.mo111354a((((float) cVar.f119986j) * 1.0f) / ((float) cVar.f119990u));
            C70592b bVar2 = cVar.f119981e;
            if (bVar2 == null) {
                C89219l.m154710a("cutMusicLayout");
            }
            bVar2.setTimeBubble(cVar.f119986j);
            cVar.f119988l = cVar.f119989t;
            cVar.mo87807D();
            return true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.cutmusic.c$k */
    static final class View$OnClickListenerC52087k implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ View$OnTouchListenerC52075c f120005a;

        static {
            Covode.recordClassIndex(61466);
        }

        View$OnClickListenerC52087k(View$OnTouchListenerC52075c cVar) {
            this.f120005a = cVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f120005a.mo87807D();
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ ImageView m96828a(View$OnTouchListenerC52075c cVar) {
        ImageView imageView = cVar.f119977a;
        if (imageView == null) {
            C89219l.m154710a("mSlide");
        }
        return imageView;
    }

    /* renamed from: b */
    public static final /* synthetic */ KTVView m96829b(View$OnTouchListenerC52075c cVar) {
        KTVView kTVView = cVar.f119978b;
        if (kTVView == null) {
            C89219l.m154710a("mKTVView");
        }
        return kTVView;
    }

    /* renamed from: c */
    public static final /* synthetic */ C70592b m96831c(View$OnTouchListenerC52075c cVar) {
        C70592b bVar = cVar.f119981e;
        if (bVar == null) {
            C89219l.m154710a("cutMusicLayout");
        }
        return bVar;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af> S1 getState(VM1 vm1) {
        C89219l.m154721d(vm1, "");
        return (S1) AbstractC20382b.C20383a.m38582a(this, vm1);
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.cutmusic.c$j */
    public static final class C52086j implements C70612k.AbstractC70613a {

        /* renamed from: a */
        final /* synthetic */ View$OnTouchListenerC52075c f120003a;

        /* renamed from: b */
        final /* synthetic */ C69905c f120004b;

        static {
            Covode.recordClassIndex(61465);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.cutmusic.C70612k.AbstractC70613a
        /* renamed from: a */
        public final void mo87581a(C70625d dVar) {
            this.f120003a.f119965C = false;
            this.f120003a.mo87810a(true);
            this.f120003a.mo87809a(dVar, this.f120004b.getDuration(), this.f120003a.mo87808a().mMusicStart);
        }

        C52086j(View$OnTouchListenerC52075c cVar, C69905c cVar2) {
            this.f120003a = cVar;
            this.f120004b = cVar2;
        }
    }

    public View$OnTouchListenerC52075c(C21582f fVar) {
        C89219l.m154721d(fVar, "");
        this.f119976O = fVar;
    }

    /* renamed from: b */
    private final void m96830b(boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        KTVView kTVView = this.f119978b;
        if (kTVView == null) {
            C89219l.m154710a("mKTVView");
        }
        int i6 = 0;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        kTVView.setVisibility(i);
        TextView textView = this.f119979c;
        if (textView == null) {
            C89219l.m154710a("mTextViewTimeStart");
        }
        if (z) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        textView.setVisibility(i2);
        TextView textView2 = this.f119980d;
        if (textView2 == null) {
            C89219l.m154710a("mTextViewTotalTime");
        }
        if (z) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        textView2.setVisibility(i3);
        C70592b bVar = this.f119981e;
        if (bVar == null) {
            C89219l.m154710a("cutMusicLayout");
        }
        if (z) {
            i4 = 8;
        } else {
            i4 = 0;
        }
        bVar.setVisibility(i4);
        ImageView imageView = this.f119977a;
        if (imageView == null) {
            C89219l.m154710a("mSlide");
        }
        if (!z) {
            i6 = 8;
        }
        imageView.setVisibility(i6);
        if (this.f119981e == null) {
            C89219l.m154710a("cutMusicLayout");
        }
        mo87812d();
        if (this.f119984h == null) {
            C89219l.m154710a("mModel");
        }
        TextView textView3 = this.f119966E;
        if (textView3 == null) {
            C89219l.m154710a("mCutMusicTips");
        }
        int d = mo87812d();
        VideoPublishEditModel videoPublishEditModel = this.f119984h;
        if (videoPublishEditModel == null) {
            C89219l.m154710a("mModel");
        }
        if (d > videoPublishEditModel.mCurMusicLength + 1000) {
            i5 = R.string.a9g;
        } else {
            i5 = R.string.bcx;
        }
        textView3.setText(mo36476c_(i5));
        C80322d.m139251a("tool_performance_show_music_wave", new C84425b().mo129406a("scene", "EditMusicCutScene").mo129403a("status", !z ? 1 : 0).f188764a);
    }

    /* renamed from: a */
    public final void mo87810a(boolean z) {
        if (z) {
            View view = this.f119969H;
            if (view == null) {
                C89219l.m154710a("mDragLayout");
            }
            if (view.getVisibility() != 0) {
                View view2 = this.f119969H;
                if (view2 == null) {
                    C89219l.m154710a("mDragLayout");
                }
                view2.setVisibility(0);
                View view3 = this.f119969H;
                if (view3 == null) {
                    C89219l.m154710a("mDragLayout");
                }
                view3.setAlpha(0.0f);
                View view4 = this.f119969H;
                if (view4 == null) {
                    C89219l.m154710a("mDragLayout");
                }
                view4.animate().alpha(1.0f).setDuration(200).start();
                this.f119992w.post(this.f119975N);
                return;
            }
            return;
        }
        View view5 = this.f119969H;
        if (view5 == null) {
            C89219l.m154710a("mDragLayout");
        }
        if (view5.getVisibility() != 4) {
            View view6 = this.f119969H;
            if (view6 == null) {
                C89219l.m154710a("mDragLayout");
            }
            view6.setVisibility(4);
            this.f119992w.removeCallbacksAndMessages(null);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0299, code lost:
        if (r1 == null) goto L_0x029b;
     */
    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo22704a(android.os.Bundle r9) {
        /*
        // Method dump skipped, instructions count: 718
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ftc.components.cutmusic.View$OnTouchListenerC52075c.mo22704a(android.os.Bundle):void");
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af, R> R withState(VM1 vm1, AbstractC89172b<? super S1, ? extends R> bVar) {
        C89219l.m154721d(vm1, "");
        C89219l.m154721d(bVar, "");
        return (R) AbstractC20382b.C20383a.m38593a(this, vm1, bVar);
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final View mo22702a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C89219l.m154721d(layoutInflater, "");
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(layoutInflater, R.layout.asw, viewGroup, false);
        Objects.requireNonNull(a, "null cannot be cast to non-null type android.widget.FrameLayout");
        FrameLayout frameLayout = (FrameLayout) a;
        this.f119968G = frameLayout;
        if (frameLayout == null) {
            C89219l.m154710a("mParentLayout");
        }
        return frameLayout;
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final void mo36473a(View view, Bundle bundle) {
        MethodCollector.m26663i(11396);
        C89219l.m154721d(view, "");
        super.mo36473a(view, bundle);
        LayoutInflater from = LayoutInflater.from(this.f52549m);
        FrameLayout frameLayout = this.f119968G;
        if (frameLayout == null) {
            C89219l.m154710a("mParentLayout");
        }
        View a = C1764a.m5927a(from, R.layout.aee, frameLayout, false);
        C89219l.m154716b(a, "");
        this.f119969H = a;
        FrameLayout frameLayout2 = this.f119968G;
        if (frameLayout2 == null) {
            C89219l.m154710a("mParentLayout");
        }
        View view2 = this.f119969H;
        if (view2 == null) {
            C89219l.m154710a("mDragLayout");
        }
        frameLayout2.addView(view2);
        MethodCollector.m26664o(11396);
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C89219l.m154721d(view, "");
        C89219l.m154721d(motionEvent, "");
        int action = motionEvent.getAction();
        if (action != 0) {
            int i = 0;
            if (action == 1) {
                ImageView imageView = this.f119977a;
                if (imageView == null) {
                    C89219l.m154710a("mSlide");
                }
                float x = imageView.getX();
                KTVView kTVView = this.f119978b;
                if (kTVView == null) {
                    C89219l.m154710a("mKTVView");
                }
                float x2 = x - kTVView.getX();
                ImageView imageView2 = this.f119977a;
                if (imageView2 == null) {
                    C89219l.m154710a("mSlide");
                }
                int width = (int) (x2 + ((float) (imageView2.getWidth() / 2)));
                if (width >= 0) {
                    i = width;
                }
                double d = (double) i;
                Double.isNaN(d);
                double d2 = d * 1.0d;
                KTVView kTVView2 = this.f119978b;
                if (kTVView2 == null) {
                    C89219l.m154710a("mKTVView");
                }
                double width2 = (double) kTVView2.getWidth();
                Double.isNaN(width2);
                double d3 = d2 / width2;
                double d4 = (double) this.f119990u;
                Double.isNaN(d4);
                this.f119986j = (int) (d3 * d4);
                AbstractC52079d dVar = this.f119994y;
                if (dVar != null) {
                    dVar.mo87815a();
                }
            } else if (action == 2) {
                float rawX = this.f119971J + (motionEvent.getRawX() - this.f119970I);
                KTVView kTVView3 = this.f119978b;
                if (kTVView3 == null) {
                    C89219l.m154710a("mKTVView");
                }
                float x3 = kTVView3.getX();
                ImageView imageView3 = this.f119977a;
                if (imageView3 == null) {
                    C89219l.m154710a("mSlide");
                }
                if (rawX < x3 - ((float) (imageView3.getWidth() / 2))) {
                    KTVView kTVView4 = this.f119978b;
                    if (kTVView4 == null) {
                        C89219l.m154710a("mKTVView");
                    }
                    float x4 = kTVView4.getX();
                    ImageView imageView4 = this.f119977a;
                    if (imageView4 == null) {
                        C89219l.m154710a("mSlide");
                    }
                    rawX = x4 - ((float) (imageView4.getWidth() / 2));
                }
                KTVView kTVView5 = this.f119978b;
                if (kTVView5 == null) {
                    C89219l.m154710a("mKTVView");
                }
                float x5 = rawX - kTVView5.getX();
                ImageView imageView5 = this.f119977a;
                if (imageView5 == null) {
                    C89219l.m154710a("mSlide");
                }
                float width3 = x5 + ((float) (imageView5.getWidth() / 2));
                KTVView kTVView6 = this.f119978b;
                if (kTVView6 == null) {
                    C89219l.m154710a("mKTVView");
                }
                if (width3 >= ((float) (kTVView6.getWidth() - m96827E()))) {
                    KTVView kTVView7 = this.f119978b;
                    if (kTVView7 == null) {
                        C89219l.m154710a("mKTVView");
                    }
                    float x6 = kTVView7.getX();
                    ImageView imageView6 = this.f119977a;
                    if (imageView6 == null) {
                        C89219l.m154710a("mSlide");
                    }
                    float width4 = x6 - ((float) (imageView6.getWidth() / 2));
                    KTVView kTVView8 = this.f119978b;
                    if (kTVView8 == null) {
                        C89219l.m154710a("mKTVView");
                    }
                    rawX = (width4 + ((float) kTVView8.getWidth())) - ((float) m96827E());
                }
                if (rawX < 0.0f) {
                    rawX = 0.0f;
                }
                ImageView imageView7 = this.f119977a;
                if (imageView7 == null) {
                    C89219l.m154710a("mSlide");
                }
                imageView7.animate().x(rawX).setDuration(0).start();
                ImageView imageView8 = this.f119977a;
                if (imageView8 == null) {
                    C89219l.m154710a("mSlide");
                }
                float x7 = imageView8.getX();
                ImageView imageView9 = this.f119977a;
                if (imageView9 == null) {
                    C89219l.m154710a("mSlide");
                }
                float width5 = x7 + ((float) (imageView9.getWidth() / 2));
                KTVView kTVView9 = this.f119978b;
                if (kTVView9 == null) {
                    C89219l.m154710a("mKTVView");
                }
                int x8 = (int) (width5 - kTVView9.getX());
                KTVView kTVView10 = this.f119978b;
                if (kTVView10 == null) {
                    C89219l.m154710a("mKTVView");
                }
                kTVView10.setStart(x8);
                KTVView kTVView11 = this.f119978b;
                if (kTVView11 == null) {
                    C89219l.m154710a("mKTVView");
                }
                kTVView11.setLength(mo87806C());
                TextView textView = this.f119979c;
                if (textView == null) {
                    C89219l.m154710a("mTextViewTimeStart");
                }
                ImageView imageView10 = this.f119977a;
                if (imageView10 == null) {
                    C89219l.m154710a("mSlide");
                }
                double x9 = (double) imageView10.getX();
                Double.isNaN(x9);
                double d5 = 1.0d * x9;
                KTVView kTVView12 = this.f119978b;
                if (kTVView12 == null) {
                    C89219l.m154710a("mKTVView");
                }
                double x10 = (double) kTVView12.getX();
                Double.isNaN(x10);
                double d6 = d5 - x10;
                ImageView imageView11 = this.f119977a;
                if (imageView11 == null) {
                    C89219l.m154710a("mSlide");
                }
                double width6 = (double) (imageView11.getWidth() / 2);
                Double.isNaN(width6);
                double d7 = d6 + width6;
                KTVView kTVView13 = this.f119978b;
                if (kTVView13 == null) {
                    C89219l.m154710a("mKTVView");
                }
                double width7 = (double) kTVView13.getWidth();
                Double.isNaN(width7);
                double d8 = d7 / width7;
                int i2 = this.f119990u;
                double d9 = (double) i2;
                Double.isNaN(d9);
                int i3 = (int) (d8 * d9);
                if (i3 < 0) {
                    i3 = 0;
                }
                if (i3 <= i2) {
                    i = i3;
                }
                textView.setText(C40983r.m82524a(i));
            }
        } else {
            this.f119970I = motionEvent.getRawX();
            ImageView imageView12 = this.f119977a;
            if (imageView12 == null) {
                C89219l.m154710a("mSlide");
            }
            this.f119971J = imageView12.getX();
        }
        return true;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af> AbstractC88412b subscribe(JediViewModel<S> jediViewModel, C20370ah<S> ahVar, AbstractC89183m<? super AbstractC20477i, ? super S, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        return AbstractC20382b.C20383a.m38583a(this, jediViewModel, ahVar, mVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.cutmusic.c$n */
    static final class C52090n extends AbstractC89220m implements AbstractC89187q<AbstractC20477i, Integer, C89386u<? extends C70625d, ? extends Integer, ? extends Integer>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ View$OnTouchListenerC52075c f120008a;

        static {
            Covode.recordClassIndex(61469);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52090n(View$OnTouchListenerC52075c cVar) {
            super(3);
            this.f120008a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89187q
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Integer num, C89386u<? extends C70625d, ? extends Integer, ? extends Integer> uVar) {
            Integer num2 = num;
            C89386u<? extends C70625d, ? extends Integer, ? extends Integer> uVar2 = uVar;
            C89219l.m154721d(iVar, "");
            if (num2 != null) {
                int intValue = num2.intValue();
                View$OnTouchListenerC52075c cVar = this.f120008a;
                cVar.f119985i = intValue;
                C70612k.f158036f.f158043e = cVar.f119985i;
            }
            if (uVar2 != null) {
                this.f120008a.mo87809a((C70625d) uVar2.getFirst(), ((Number) uVar2.getSecond()).intValue(), ((Number) uVar2.getThird()).intValue());
                this.f120008a.f119986j = ((Number) uVar2.getThird()).intValue();
                View$OnTouchListenerC52075c cVar2 = this.f120008a;
                cVar2.f119987k = cVar2.f119986j;
                this.f120008a.mo87808a().mMusicStart = this.f120008a.f119986j;
                this.f120008a.f119988l = false;
                View$OnTouchListenerC52075c cVar3 = this.f120008a;
                cVar3.f119989t = cVar3.f119988l;
                this.f120008a.mo87808a().isSoundLoop = Boolean.valueOf(this.f120008a.f119988l);
                AbstractC52079d dVar = this.f120008a.f119994y;
                if (dVar != null) {
                    dVar.mo87815a();
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final void mo87809a(C70625d dVar, int i, int i2) {
        C73991bj.m130128a("SoundLoop, EditMusicCutScene.updateMusicWaveData musicLength = " + i + " videoLength = " + this.f119985i);
        this.f119991v = i;
        m96830b(true);
        if (dVar == null || !C70612k.C70614b.m124761a(dVar.getMusicWavePointArray())) {
            m96830b(true);
            return;
        }
        C70612k.m124749b(dVar);
        C70612k.f158036f.mo111418a(dVar, (long) this.f119985i, (long) i);
        m96830b(false);
        if (i2 == 0) {
            C70592b bVar = this.f119981e;
            if (bVar == null) {
                C89219l.m154710a("cutMusicLayout");
            }
            bVar.mo111353a();
        } else {
            C70592b bVar2 = this.f119981e;
            if (bVar2 == null) {
                C89219l.m154710a("cutMusicLayout");
            }
            bVar2.mo111354a((((float) i2) * 1.0f) / ((float) i));
            C70592b bVar3 = this.f119981e;
            if (bVar3 == null) {
                C89219l.m154710a("cutMusicLayout");
            }
            bVar3.setTimeBubble(i2);
        }
        C70592b bVar4 = this.f119981e;
        if (bVar4 == null) {
            C89219l.m154710a("cutMusicLayout");
        }
        bVar4.setOnScreenMaxWavePointCount(C70612k.f158036f.mo111416a((long) this.f119985i));
        C70592b bVar5 = this.f119981e;
        if (bVar5 == null) {
            C89219l.m154710a("cutMusicLayout");
        }
        bVar5.setAudioWaveViewData(dVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public final <S extends AbstractC20368af, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, C20370ah<C20373ak<A>> ahVar, AbstractC89183m<? super AbstractC20382b, ? super A, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        AbstractC20382b.C20383a.m38599a(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, C20370ah<C20373ak<A>> ahVar, AbstractC89183m<? super AbstractC20477i, ? super A, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        return AbstractC20382b.C20383a.m38606d(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public final <S extends AbstractC20368af, A> void subscribeEvent(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends C20391d<? extends A>> kVar, C20370ah<C20373ak<C20391d<A>>> ahVar, AbstractC89183m<? super AbstractC20382b, ? super A, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        AbstractC20382b.C20383a.m38602b(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public final <S extends AbstractC20368af, A> void subscribeMultiEvent(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends C20365ac<? extends A>> kVar, C20370ah<C20373ak<C20365ac<A>>> ahVar, AbstractC89183m<? super AbstractC20382b, ? super A, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        AbstractC20382b.C20383a.m38605c(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A, B> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, C20370ah<C20374al<A, B>> ahVar, AbstractC89187q<? super AbstractC20477i, ? super A, ? super B, C89391z> qVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(qVar, "");
        return AbstractC20382b.C20383a.m38585a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, T> AbstractC88412b asyncSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends AbstractC20362a<? extends T>> kVar, C20370ah<C20373ak<AbstractC20362a<T>>> ahVar, AbstractC89183m<? super AbstractC20477i, ? super Throwable, C89391z> mVar, AbstractC89172b<? super AbstractC20477i, C89391z> bVar, AbstractC89183m<? super AbstractC20477i, ? super T, C89391z> mVar2) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        return AbstractC20382b.C20383a.m38584a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A, B, C> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, AbstractC89290k<S, ? extends C> kVar3, C20370ah<C20375am<A, B, C>> ahVar, AbstractC89188r<? super AbstractC20477i, ? super A, ? super B, ? super C, C89391z> rVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(kVar3, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(rVar, "");
        return AbstractC20382b.C20383a.m38586a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A, B, C, D> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, AbstractC89290k<S, ? extends C> kVar3, AbstractC89290k<S, ? extends D> kVar4, C20370ah<C20376an<A, B, C, D>> ahVar, AbstractC89189s<? super AbstractC20477i, ? super A, ? super B, ? super C, ? super D, C89391z> sVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(kVar3, "");
        C89219l.m154721d(kVar4, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(sVar, "");
        return AbstractC20382b.C20383a.m38587a(this, jediViewModel, kVar, kVar2, kVar3, kVar4, ahVar, sVar);
    }
}
