package com.p2082ss.android.ugc.gamora.editor.cutmusic;

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
import com.bytedance.p1559o.p1561b.C21572a;
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
import com.p2082ss.android.ugc.gamora.editor.music.AbstractC82427a;
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
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4616h.AbstractC89248d;
import p4600h.p4620k.AbstractC89286i;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.gamora.editor.cutmusic.c */
public final class View$OnTouchListenerC82108c extends AbstractC22219j implements View.OnTouchListener, AbstractC20382b, AbstractC21566a {

    /* renamed from: D */
    public static final C82111c f183705D = new C82111c((byte) 0);

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f183706a = {new C89232y(View$OnTouchListenerC82108c.class, "mModel", "getMModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0), new C89232y(View$OnTouchListenerC82108c.class, "editMusicApi", "getEditMusicApi()Lcom/ss/android/ugc/gamora/editor/music/EditMusicApi;", 0)};

    /* renamed from: A */
    public final VEListener.AbstractC85250s f183707A = new C82125p(this);

    /* renamed from: B */
    final C82121l f183708B = new C82121l(this);

    /* renamed from: C */
    public boolean f183709C;

    /* renamed from: E */
    private TextView f183710E;

    /* renamed from: F */
    private ImageView f183711F;

    /* renamed from: G */
    private FrameLayout f183712G;

    /* renamed from: H */
    private View f183713H;

    /* renamed from: I */
    private float f183714I;

    /* renamed from: J */
    private float f183715J;

    /* renamed from: K */
    private AbstractC82112d f183716K;

    /* renamed from: L */
    private final AbstractC89248d f183717L = C21572a.m40504a(getDiContainer(), VideoPublishEditModel.class);

    /* renamed from: M */
    private EditMusicCutViewModel f183718M;

    /* renamed from: N */
    private final AbstractC89244h f183719N = C89250i.m154774a(EnumC89331m.NONE, new C82109a(this));

    /* renamed from: O */
    private final AbstractC89248d f183720O = new C82110b(this, this);

    /* renamed from: P */
    private final RunnableC82122m f183721P = new RunnableC82122m(this);

    /* renamed from: Q */
    private final C21582f f183722Q;

    /* renamed from: b */
    public ImageView f183723b;

    /* renamed from: c */
    public KTVView f183724c;

    /* renamed from: d */
    TextView f183725d;

    /* renamed from: e */
    TextView f183726e;

    /* renamed from: f */
    public C70592b f183727f;

    /* renamed from: g */
    public RelativeLayout f183728g;

    /* renamed from: h */
    public AbstractC82563s f183729h;

    /* renamed from: i */
    int f183730i;

    /* renamed from: j */
    public int f183731j;

    /* renamed from: k */
    public int f183732k;

    /* renamed from: l */
    public boolean f183733l;

    /* renamed from: t */
    public boolean f183734t;

    /* renamed from: u */
    public int f183735u;

    /* renamed from: v */
    public int f183736v;

    /* renamed from: w */
    public final Handler f183737w = new Handler(Looper.getMainLooper());

    /* renamed from: x */
    AbstractC84919c f183738x;

    /* renamed from: y */
    public AbstractC82113e f183739y;

    /* renamed from: z */
    public EditStickerViewModel f183740z;

    /* renamed from: com.ss.android.ugc.gamora.editor.cutmusic.c$d */
    public interface AbstractC82112d {
        static {
            Covode.recordClassIndex(95940);
        }

        /* renamed from: a */
        void mo127342a();
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.cutmusic.c$e */
    public interface AbstractC82113e {
        static {
            Covode.recordClassIndex(95941);
        }

        /* renamed from: a */
        void mo127343a();
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.cutmusic.c$o */
    static final class View$OnClickListenerC82124o implements View.OnClickListener {

        /* renamed from: a */
        public static final View$OnClickListenerC82124o f183754a = new View$OnClickListenerC82124o();

        static {
            Covode.recordClassIndex(95952);
        }

        View$OnClickListenerC82124o() {
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
        }
    }

    static {
        Covode.recordClassIndex(95936);
    }

    /* renamed from: a */
    public final VideoPublishEditModel mo127336a() {
        return (VideoPublishEditModel) this.f183717L.mo23374a(this, f183706a[0]);
    }

    /* renamed from: b */
    public final AbstractC72510a mo127339b() {
        return (AbstractC72510a) this.f183719N.getValue();
    }

    /* renamed from: d */
    public final AbstractC82427a mo127340d() {
        return (AbstractC82427a) this.f183720O.mo23374a(this, f183706a[1]);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.cutmusic.c$c */
    public static final class C82111c {
        static {
            Covode.recordClassIndex(95939);
        }

        private C82111c() {
        }

        public /* synthetic */ C82111c(byte b) {
            this();
        }
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f183722Q;
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

    /* renamed from: com.ss.android.ugc.gamora.editor.cutmusic.c$a */
    public static final class C82109a extends AbstractC89220m implements AbstractC89171a<AbstractC72510a> {

        /* renamed from: a */
        final /* synthetic */ View$OnTouchListenerC82108c f183741a;

        static {
            Covode.recordClassIndex(95937);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C82109a(View$OnTouchListenerC82108c cVar) {
            super(0);
            this.f183741a = cVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.aweme.shortvideo.preview.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a invoke() {
            /*
                r2 = this;
                com.ss.android.ugc.gamora.editor.cutmusic.c r0 = r2.f183741a
                androidx.fragment.app.e r0 = com.bytedance.scene.ktx.C22228c.m41832b(r0)
                com.bytedance.als.ApiCenter r1 = com.bytedance.als.ApiCenter.C2545a.m7450a(r0)
                java.lang.Class<com.ss.android.ugc.aweme.shortvideo.preview.a> r0 = com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a.class
                com.bytedance.als.b r0 = r1.mo7013a(r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.cutmusic.View$OnTouchListenerC82108c.C82109a.invoke():com.bytedance.als.b");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.cutmusic.c$p */
    static final class C82125p implements VEListener.AbstractC85250s {

        /* renamed from: a */
        final /* synthetic */ View$OnTouchListenerC82108c f183755a;

        static {
            Covode.recordClassIndex(95953);
        }

        C82125p(View$OnTouchListenerC82108c cVar) {
            this.f183755a = cVar;
        }

        @Override // com.p2082ss.android.vesdk.VEListener.AbstractC85250s
        /* renamed from: a */
        public final void mo87822a() {
            AbstractC31071f value = this.f183755a.mo127339b().mo114778C().getValue();
            if (value != null) {
                value.mo56388t();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public final int mo127333C() {
        AbstractC31071f value = mo127339b().mo114778C().getValue();
        if (value == null) {
            C89219l.m154715b();
        }
        return value.mo56368j();
    }

    /* renamed from: E */
    public final void mo127335E() {
        AbstractC82112d dVar = this.f183716K;
        if (dVar != null) {
            dVar.mo127342a();
        }
        AbstractC84919c cVar = this.f183738x;
        if (cVar != null) {
            cVar.mo87535c(this.f183708B);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.cutmusic.c$f */
    static final class RunnableC82114f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ View$OnTouchListenerC82108c f183744a;

        static {
            Covode.recordClassIndex(95942);
        }

        RunnableC82114f(View$OnTouchListenerC82108c cVar) {
            this.f183744a = cVar;
        }

        public final void run() {
            MethodCollector.m26663i(9715);
            RelativeLayout relativeLayout = this.f183744a.f183728g;
            if (relativeLayout == null) {
                C89219l.m154710a("slideContainer");
            }
            relativeLayout.addView(View$OnTouchListenerC82108c.m142129a(this.f183744a));
            View$OnTouchListenerC82108c.m142129a(this.f183744a).post(new Runnable(this) {
                /* class com.p2082ss.android.ugc.gamora.editor.cutmusic.View$OnTouchListenerC82108c.RunnableC82114f.RunnableC821151 */

                /* renamed from: a */
                final /* synthetic */ RunnableC82114f f183745a;

                static {
                    Covode.recordClassIndex(95943);
                }

                {
                    this.f183745a = r1;
                }

                public final void run() {
                    if (this.f183745a.f183744a.f183731j == 0) {
                        View$OnTouchListenerC82108c.m142129a(this.f183745a.f183744a).setX(View$OnTouchListenerC82108c.m142130b(this.f183745a.f183744a).getX() - ((float) (View$OnTouchListenerC82108c.m142129a(this.f183745a.f183744a).getWidth() / 2)));
                    } else {
                        double d = (double) this.f183745a.f183744a.f183731j;
                        Double.isNaN(d);
                        double width = (double) View$OnTouchListenerC82108c.m142130b(this.f183745a.f183744a).getWidth();
                        Double.isNaN(width);
                        double d2 = d * 1.0d * width;
                        double d3 = (double) this.f183745a.f183744a.f183735u;
                        Double.isNaN(d3);
                        View$OnTouchListenerC82108c.m142129a(this.f183745a.f183744a).setX((View$OnTouchListenerC82108c.m142130b(this.f183745a.f183744a).getX() + ((float) ((int) (d2 / d3)))) - ((float) (View$OnTouchListenerC82108c.m142129a(this.f183745a.f183744a).getWidth() / 2)));
                    }
                    View$OnTouchListenerC82108c.m142130b(this.f183745a.f183744a).setLength(this.f183745a.f183744a.mo127334D());
                    View$OnTouchListenerC82108c.m142129a(this.f183745a.f183744a).setOnTouchListener(this.f183745a.f183744a);
                }
            });
            MethodCollector.m26664o(9715);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.cutmusic.c$m */
    public static final class RunnableC82122m implements Runnable {

        /* renamed from: a */
        final /* synthetic */ View$OnTouchListenerC82108c f183752a;

        static {
            Covode.recordClassIndex(95950);
        }

        public final void run() {
            AbstractC31071f value = this.f183752a.mo127339b().mo114778C().getValue();
            if (value != null) {
                int k = value.mo56370k();
                int i = this.f183752a.f183736v;
                if (k < i) {
                    View$OnTouchListenerC82108c.m142132c(this.f183752a).mo111355b((((float) k) * 1.0f) / ((float) i));
                }
                this.f183752a.f183737w.post(this);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        RunnableC82122m(View$OnTouchListenerC82108c cVar) {
            this.f183752a = cVar;
        }
    }

    /* renamed from: D */
    public final int mo127334D() {
        if (this.f183730i >= this.f183735u) {
            KTVView kTVView = this.f183724c;
            if (kTVView == null) {
                C89219l.m154710a("mKTVView");
            }
            return kTVView.getWidth();
        }
        KTVView kTVView2 = this.f183724c;
        if (kTVView2 == null) {
            C89219l.m154710a("mKTVView");
        }
        double width = (double) kTVView2.getWidth();
        Double.isNaN(width);
        double d = 1.0d * width;
        double d2 = (double) this.f183730i;
        Double.isNaN(d2);
        double d3 = d * d2;
        double d4 = (double) this.f183735u;
        Double.isNaN(d4);
        return (int) (d3 / d4);
    }

    /* renamed from: F */
    private final int m142128F() {
        if (this.f183730i >= this.f183735u) {
            KTVView kTVView = this.f183724c;
            if (kTVView == null) {
                C89219l.m154710a("mKTVView");
            }
            return (int) (((1.0f * ((float) kTVView.getWidth())) * 15000.0f) / ((float) this.f183735u));
        }
        KTVView kTVView2 = this.f183724c;
        if (kTVView2 == null) {
            C89219l.m154710a("mKTVView");
        }
        double width = (double) kTVView2.getWidth();
        Double.isNaN(width);
        double d = 1.0d * width;
        double d2 = (double) this.f183730i;
        Double.isNaN(d2);
        double d3 = d * d2;
        double d4 = (double) this.f183735u;
        Double.isNaN(d4);
        return (int) (d3 / d4);
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.cutmusic.c$j */
    public static final class C82119j implements AbstractC82113e {

        /* renamed from: a */
        final /* synthetic */ View$OnTouchListenerC82108c f183749a;

        static {
            Covode.recordClassIndex(95947);
        }

        @Override // com.p2082ss.android.ugc.gamora.editor.cutmusic.View$OnTouchListenerC82108c.AbstractC82113e
        /* renamed from: a */
        public final void mo127343a() {
            int min;
            C69905c cVar = C70005cr.m123611a().f156482a;
            AbstractC31071f value = this.f183749a.mo127339b().mo114778C().getValue();
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
                AbstractC72510a b = this.f183749a.mo127339b();
                int i = this.f183749a.f183731j;
                View$OnTouchListenerC82108c.m142132c(this.f183749a);
                C88295s a = C88295s.m153434a(i, min2, false);
                C89219l.m154716b(a, "");
                b.mo114802a(a);
                int a2 = value.mo56266a(0, C85581w.EnumC85607f.EDITOR_SEEK_FLAG_LastSeek, this.f183749a.f183707A);
                if (a2 != 0) {
                    C73991bj.m130131b("onPlayMusic seek error: ".concat(String.valueOf(a2)));
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C82119j(View$OnTouchListenerC82108c cVar) {
            this.f183749a = cVar;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.cutmusic.c$q */
    static final class RunnableC82126q implements Runnable {

        /* renamed from: a */
        final /* synthetic */ View$OnTouchListenerC82108c f183756a;

        static {
            Covode.recordClassIndex(95954);
        }

        RunnableC82126q(View$OnTouchListenerC82108c cVar) {
            this.f183756a = cVar;
        }

        public final void run() {
            View$OnTouchListenerC82108c cVar = this.f183756a;
            double d = (double) cVar.f183731j;
            Double.isNaN(d);
            double d2 = d * 1.0d;
            KTVView kTVView = cVar.f183724c;
            if (kTVView == null) {
                C89219l.m154710a("mKTVView");
            }
            double width = (double) kTVView.getWidth();
            Double.isNaN(width);
            double d3 = d2 * width;
            double d4 = (double) cVar.f183735u;
            Double.isNaN(d4);
            int i = (int) (d3 / d4);
            ImageView imageView = cVar.f183723b;
            if (imageView == null) {
                C89219l.m154710a("mSlide");
            }
            KTVView kTVView2 = cVar.f183724c;
            if (kTVView2 == null) {
                C89219l.m154710a("mKTVView");
            }
            float x = kTVView2.getX() + ((float) i);
            ImageView imageView2 = cVar.f183723b;
            if (imageView2 == null) {
                C89219l.m154710a("mSlide");
            }
            imageView.setX(x - ((float) (imageView2.getWidth() / 2)));
            KTVView kTVView3 = cVar.f183724c;
            if (kTVView3 == null) {
                C89219l.m154710a("mKTVView");
            }
            kTVView3.setStart(i);
            KTVView kTVView4 = cVar.f183724c;
            if (kTVView4 == null) {
                C89219l.m154710a("mKTVView");
            }
            kTVView4.setLength(cVar.mo127334D());
            TextView textView = cVar.f183725d;
            if (textView == null) {
                C89219l.m154710a("mTextViewTimeStart");
            }
            textView.setText(C40983r.m82524a(cVar.f183731j));
            C70592b bVar = cVar.f183727f;
            if (bVar == null) {
                C89219l.m154710a("cutMusicLayout");
            }
            bVar.setSoundLoopSelected(cVar.f183733l);
            if (C70976bp.m125307c(cVar.mo127336a())) {
                C70592b bVar2 = cVar.f183727f;
                if (bVar2 == null) {
                    C89219l.m154710a("cutMusicLayout");
                }
                bVar2.setSoundLoopClickable(false);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.cutmusic.c$i */
    public static final class C82118i implements AbstractC82112d {

        /* renamed from: a */
        final /* synthetic */ View$OnTouchListenerC82108c f183748a;

        static {
            Covode.recordClassIndex(95946);
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x0084  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x00ac  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x00c2  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x00cd  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x0120  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x0146  */
        /* JADX WARNING: Removed duplicated region for block: B:48:0x01ab  */
        @Override // com.p2082ss.android.ugc.gamora.editor.cutmusic.View$OnTouchListenerC82108c.AbstractC82112d
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo127342a() {
            /*
            // Method dump skipped, instructions count: 471
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.cutmusic.View$OnTouchListenerC82108c.C82118i.mo127342a():void");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C82118i(View$OnTouchListenerC82108c cVar) {
            this.f183748a = cVar;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.cutmusic.c$g */
    public static final class C82116g implements C70598f.AbstractC70599a {

        /* renamed from: a */
        final /* synthetic */ View$OnTouchListenerC82108c f183746a;

        static {
            Covode.recordClassIndex(95944);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C82116g(View$OnTouchListenerC82108c cVar) {
            this.f183746a = cVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.cutmusic.C70598f.AbstractC70599a
        /* renamed from: a */
        public final void mo87818a(float f) {
            View$OnTouchListenerC82108c cVar = this.f183746a;
            cVar.f183731j = (int) (f * ((float) cVar.f183735u));
            AbstractC82113e eVar = this.f183746a.f183739y;
            if (eVar != null) {
                eVar.mo127343a();
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.cutmusic.C70598f.AbstractC70599a
        /* renamed from: b */
        public final void mo87819b(float f) {
            View$OnTouchListenerC82108c.m142132c(this.f183746a).setTimeBubble((int) (f * ((float) this.f183746a.f183735u)));
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.cutmusic.c$h */
    public static final class C82117h implements C70592b.AbstractC70593a {

        /* renamed from: a */
        final /* synthetic */ View$OnTouchListenerC82108c f183747a;

        static {
            Covode.recordClassIndex(95945);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C82117h(View$OnTouchListenerC82108c cVar) {
            this.f183747a = cVar;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.cutmusic.c$l */
    public static final class C82121l implements AbstractC84917a {

        /* renamed from: a */
        final /* synthetic */ View$OnTouchListenerC82108c f183751a;

        static {
            Covode.recordClassIndex(95949);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C82121l(View$OnTouchListenerC82108c cVar) {
            this.f183751a = cVar;
        }

        @Override // com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84917a
        public final boolean onKeyDown(int i, KeyEvent keyEvent) {
            if (i != 4) {
                return false;
            }
            View$OnTouchListenerC82108c cVar = this.f183751a;
            cVar.f183731j = cVar.f183732k;
            C70592b bVar = cVar.f183727f;
            if (bVar == null) {
                C89219l.m154710a("cutMusicLayout");
            }
            bVar.mo111354a((((float) cVar.f183731j) * 1.0f) / ((float) cVar.f183735u));
            C70592b bVar2 = cVar.f183727f;
            if (bVar2 == null) {
                C89219l.m154710a("cutMusicLayout");
            }
            bVar2.setTimeBubble(cVar.f183731j);
            cVar.f183733l = cVar.f183734t;
            cVar.mo127335E();
            return true;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.cutmusic.c$k */
    static final class View$OnClickListenerC82120k implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ View$OnTouchListenerC82108c f183750a;

        static {
            Covode.recordClassIndex(95948);
        }

        View$OnClickListenerC82120k(View$OnTouchListenerC82108c cVar) {
            this.f183750a = cVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f183750a.mo127335E();
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ ImageView m142129a(View$OnTouchListenerC82108c cVar) {
        ImageView imageView = cVar.f183723b;
        if (imageView == null) {
            C89219l.m154710a("mSlide");
        }
        return imageView;
    }

    /* renamed from: b */
    public static final /* synthetic */ KTVView m142130b(View$OnTouchListenerC82108c cVar) {
        KTVView kTVView = cVar.f183724c;
        if (kTVView == null) {
            C89219l.m154710a("mKTVView");
        }
        return kTVView;
    }

    /* renamed from: c */
    public static final /* synthetic */ C70592b m142132c(View$OnTouchListenerC82108c cVar) {
        C70592b bVar = cVar.f183727f;
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

    /* renamed from: com.ss.android.ugc.gamora.editor.cutmusic.c$r */
    public static final class C82127r implements C70612k.AbstractC70613a {

        /* renamed from: a */
        final /* synthetic */ View$OnTouchListenerC82108c f183757a;

        /* renamed from: b */
        final /* synthetic */ boolean f183758b = true;

        /* renamed from: c */
        final /* synthetic */ C69905c f183759c;

        static {
            Covode.recordClassIndex(95955);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.cutmusic.C70612k.AbstractC70613a
        /* renamed from: a */
        public final void mo87581a(C70625d dVar) {
            this.f183757a.f183709C = false;
            if (this.f183758b) {
                this.f183757a.mo127338a(true);
            }
            this.f183757a.mo127337a(dVar, this.f183759c.getDuration(), this.f183757a.mo127336a().mMusicStart);
        }

        C82127r(View$OnTouchListenerC82108c cVar, C69905c cVar2) {
            this.f183757a = cVar;
            this.f183759c = cVar2;
        }
    }

    public View$OnTouchListenerC82108c(C21582f fVar) {
        C89219l.m154721d(fVar, "");
        this.f183722Q = fVar;
    }

    /* renamed from: b */
    private final void m142131b(boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        KTVView kTVView = this.f183724c;
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
        TextView textView = this.f183725d;
        if (textView == null) {
            C89219l.m154710a("mTextViewTimeStart");
        }
        if (z) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        textView.setVisibility(i2);
        TextView textView2 = this.f183726e;
        if (textView2 == null) {
            C89219l.m154710a("mTextViewTotalTime");
        }
        if (z) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        textView2.setVisibility(i3);
        C70592b bVar = this.f183727f;
        if (bVar == null) {
            C89219l.m154710a("cutMusicLayout");
        }
        if (z) {
            i4 = 8;
        } else {
            i4 = 0;
        }
        bVar.setVisibility(i4);
        ImageView imageView = this.f183723b;
        if (imageView == null) {
            C89219l.m154710a("mSlide");
        }
        if (!z) {
            i6 = 8;
        }
        imageView.setVisibility(i6);
        if (this.f183727f == null) {
            C89219l.m154710a("cutMusicLayout");
        }
        mo127333C();
        mo127336a();
        TextView textView3 = this.f183710E;
        if (textView3 == null) {
            C89219l.m154710a("mCutMusicTips");
        }
        if (mo127333C() > mo127336a().mCurMusicLength + 1000) {
            i5 = R.string.a9g;
        } else {
            i5 = R.string.bcx;
        }
        textView3.setText(mo36476c_(i5));
        C80322d.m139251a("tool_performance_show_music_wave", new C84425b().mo129406a("scene", "EditMusicCutScene").mo129403a("status", !z ? 1 : 0).f188764a);
    }

    /* renamed from: a */
    public final void mo127338a(boolean z) {
        if (z) {
            View view = this.f183713H;
            if (view == null) {
                C89219l.m154710a("mDragLayout");
            }
            if (view.getVisibility() != 0) {
                View view2 = this.f183713H;
                if (view2 == null) {
                    C89219l.m154710a("mDragLayout");
                }
                view2.setVisibility(0);
                FrameLayout frameLayout = this.f183712G;
                if (frameLayout == null) {
                    C89219l.m154710a("mParentLayout");
                }
                frameLayout.setVisibility(0);
                View view3 = this.f183713H;
                if (view3 == null) {
                    C89219l.m154710a("mDragLayout");
                }
                view3.setAlpha(0.0f);
                View view4 = this.f183713H;
                if (view4 == null) {
                    C89219l.m154710a("mDragLayout");
                }
                view4.animate().alpha(1.0f).setDuration(200).start();
                this.f183737w.post(this.f183721P);
                return;
            }
            return;
        }
        View view5 = this.f183713H;
        if (view5 == null) {
            C89219l.m154710a("mDragLayout");
        }
        if (view5.getVisibility() != 4) {
            FrameLayout frameLayout2 = this.f183712G;
            if (frameLayout2 == null) {
                C89219l.m154710a("mParentLayout");
            }
            frameLayout2.setVisibility(4);
            View view6 = this.f183713H;
            if (view6 == null) {
                C89219l.m154710a("mDragLayout");
            }
            view6.setVisibility(4);
            this.f183737w.removeCallbacksAndMessages(null);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0294, code lost:
        if (r1 == null) goto L_0x0296;
     */
    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo22704a(android.os.Bundle r9) {
        /*
        // Method dump skipped, instructions count: 707
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.cutmusic.View$OnTouchListenerC82108c.mo22704a(android.os.Bundle):void");
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.cutmusic.c$b */
    public static final class C82110b implements AbstractC89248d<Object, AbstractC82427a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f183742a;

        /* renamed from: b */
        final /* synthetic */ View$OnTouchListenerC82108c f183743b;

        static {
            Covode.recordClassIndex(95938);
        }

        public C82110b(AbstractC21566a aVar, View$OnTouchListenerC82108c cVar) {
            this.f183742a = aVar;
            this.f183743b = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4616h.AbstractC89248d
        /* renamed from: a */
        public final /* synthetic */ AbstractC82427a mo23374a(Object obj, AbstractC89286i iVar) {
            C89219l.m154721d(obj, "");
            C89219l.m154721d(iVar, "");
            Object b = this.f183742a.getDiContainer().mo35252b(AbstractC82427a.class, null);
            if (C70976bp.m125316l(this.f183743b.mo127336a())) {
                return b;
            }
            return null;
        }
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
        View a = C1764a.m5927a(layoutInflater, R.layout.as9, viewGroup, false);
        Objects.requireNonNull(a, "null cannot be cast to non-null type android.widget.FrameLayout");
        FrameLayout frameLayout = (FrameLayout) a;
        this.f183712G = frameLayout;
        if (frameLayout == null) {
            C89219l.m154710a("mParentLayout");
        }
        frameLayout.setOnClickListener(View$OnClickListenerC82124o.f183754a);
        FrameLayout frameLayout2 = this.f183712G;
        if (frameLayout2 == null) {
            C89219l.m154710a("mParentLayout");
        }
        return frameLayout2;
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final void mo36473a(View view, Bundle bundle) {
        MethodCollector.m26663i(11833);
        C89219l.m154721d(view, "");
        super.mo36473a(view, bundle);
        LayoutInflater from = LayoutInflater.from(this.f52549m);
        FrameLayout frameLayout = this.f183712G;
        if (frameLayout == null) {
            C89219l.m154710a("mParentLayout");
        }
        View a = C1764a.m5927a(from, R.layout.aee, frameLayout, false);
        C89219l.m154716b(a, "");
        this.f183713H = a;
        FrameLayout frameLayout2 = this.f183712G;
        if (frameLayout2 == null) {
            C89219l.m154710a("mParentLayout");
        }
        View view2 = this.f183713H;
        if (view2 == null) {
            C89219l.m154710a("mDragLayout");
        }
        frameLayout2.addView(view2);
        MethodCollector.m26664o(11833);
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C89219l.m154721d(view, "");
        C89219l.m154721d(motionEvent, "");
        int action = motionEvent.getAction();
        if (action != 0) {
            int i = 0;
            if (action == 1) {
                ImageView imageView = this.f183723b;
                if (imageView == null) {
                    C89219l.m154710a("mSlide");
                }
                float x = imageView.getX();
                KTVView kTVView = this.f183724c;
                if (kTVView == null) {
                    C89219l.m154710a("mKTVView");
                }
                float x2 = x - kTVView.getX();
                ImageView imageView2 = this.f183723b;
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
                KTVView kTVView2 = this.f183724c;
                if (kTVView2 == null) {
                    C89219l.m154710a("mKTVView");
                }
                double width2 = (double) kTVView2.getWidth();
                Double.isNaN(width2);
                double d3 = d2 / width2;
                double d4 = (double) this.f183735u;
                Double.isNaN(d4);
                this.f183731j = (int) (d3 * d4);
                AbstractC82113e eVar = this.f183739y;
                if (eVar != null) {
                    eVar.mo127343a();
                }
            } else if (action == 2) {
                float rawX = this.f183715J + (motionEvent.getRawX() - this.f183714I);
                KTVView kTVView3 = this.f183724c;
                if (kTVView3 == null) {
                    C89219l.m154710a("mKTVView");
                }
                float x3 = kTVView3.getX();
                ImageView imageView3 = this.f183723b;
                if (imageView3 == null) {
                    C89219l.m154710a("mSlide");
                }
                if (rawX < x3 - ((float) (imageView3.getWidth() / 2))) {
                    KTVView kTVView4 = this.f183724c;
                    if (kTVView4 == null) {
                        C89219l.m154710a("mKTVView");
                    }
                    float x4 = kTVView4.getX();
                    ImageView imageView4 = this.f183723b;
                    if (imageView4 == null) {
                        C89219l.m154710a("mSlide");
                    }
                    rawX = x4 - ((float) (imageView4.getWidth() / 2));
                }
                KTVView kTVView5 = this.f183724c;
                if (kTVView5 == null) {
                    C89219l.m154710a("mKTVView");
                }
                float x5 = rawX - kTVView5.getX();
                ImageView imageView5 = this.f183723b;
                if (imageView5 == null) {
                    C89219l.m154710a("mSlide");
                }
                float width3 = x5 + ((float) (imageView5.getWidth() / 2));
                KTVView kTVView6 = this.f183724c;
                if (kTVView6 == null) {
                    C89219l.m154710a("mKTVView");
                }
                if (width3 >= ((float) (kTVView6.getWidth() - m142128F()))) {
                    KTVView kTVView7 = this.f183724c;
                    if (kTVView7 == null) {
                        C89219l.m154710a("mKTVView");
                    }
                    float x6 = kTVView7.getX();
                    ImageView imageView6 = this.f183723b;
                    if (imageView6 == null) {
                        C89219l.m154710a("mSlide");
                    }
                    float width4 = x6 - ((float) (imageView6.getWidth() / 2));
                    KTVView kTVView8 = this.f183724c;
                    if (kTVView8 == null) {
                        C89219l.m154710a("mKTVView");
                    }
                    rawX = (width4 + ((float) kTVView8.getWidth())) - ((float) m142128F());
                }
                if (rawX < 0.0f) {
                    rawX = 0.0f;
                }
                ImageView imageView7 = this.f183723b;
                if (imageView7 == null) {
                    C89219l.m154710a("mSlide");
                }
                imageView7.animate().x(rawX).setDuration(0).start();
                ImageView imageView8 = this.f183723b;
                if (imageView8 == null) {
                    C89219l.m154710a("mSlide");
                }
                float x7 = imageView8.getX();
                ImageView imageView9 = this.f183723b;
                if (imageView9 == null) {
                    C89219l.m154710a("mSlide");
                }
                float width5 = x7 + ((float) (imageView9.getWidth() / 2));
                KTVView kTVView9 = this.f183724c;
                if (kTVView9 == null) {
                    C89219l.m154710a("mKTVView");
                }
                int x8 = (int) (width5 - kTVView9.getX());
                KTVView kTVView10 = this.f183724c;
                if (kTVView10 == null) {
                    C89219l.m154710a("mKTVView");
                }
                kTVView10.setStart(x8);
                KTVView kTVView11 = this.f183724c;
                if (kTVView11 == null) {
                    C89219l.m154710a("mKTVView");
                }
                kTVView11.setLength(mo127334D());
                TextView textView = this.f183725d;
                if (textView == null) {
                    C89219l.m154710a("mTextViewTimeStart");
                }
                ImageView imageView10 = this.f183723b;
                if (imageView10 == null) {
                    C89219l.m154710a("mSlide");
                }
                double x9 = (double) imageView10.getX();
                Double.isNaN(x9);
                double d5 = 1.0d * x9;
                KTVView kTVView12 = this.f183724c;
                if (kTVView12 == null) {
                    C89219l.m154710a("mKTVView");
                }
                double x10 = (double) kTVView12.getX();
                Double.isNaN(x10);
                double d6 = d5 - x10;
                ImageView imageView11 = this.f183723b;
                if (imageView11 == null) {
                    C89219l.m154710a("mSlide");
                }
                double width6 = (double) (imageView11.getWidth() / 2);
                Double.isNaN(width6);
                double d7 = d6 + width6;
                KTVView kTVView13 = this.f183724c;
                if (kTVView13 == null) {
                    C89219l.m154710a("mKTVView");
                }
                double width7 = (double) kTVView13.getWidth();
                Double.isNaN(width7);
                double d8 = d7 / width7;
                int i2 = this.f183735u;
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
            this.f183714I = motionEvent.getRawX();
            ImageView imageView12 = this.f183723b;
            if (imageView12 == null) {
                C89219l.m154710a("mSlide");
            }
            this.f183715J = imageView12.getX();
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

    /* renamed from: com.ss.android.ugc.gamora.editor.cutmusic.c$n */
    static final class C82123n extends AbstractC89220m implements AbstractC89187q<AbstractC20477i, Integer, C20391d<? extends C89386u<? extends C70625d, ? extends Integer, ? extends Integer>>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ View$OnTouchListenerC82108c f183753a;

        static {
            Covode.recordClassIndex(95951);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82123n(View$OnTouchListenerC82108c cVar) {
            super(3);
            this.f183753a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89187q
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Integer num, C20391d<? extends C89386u<? extends C70625d, ? extends Integer, ? extends Integer>> dVar) {
            C89386u uVar;
            Integer num2 = num;
            C20391d<? extends C89386u<? extends C70625d, ? extends Integer, ? extends Integer>> dVar2 = dVar;
            C89219l.m154721d(iVar, "");
            if (num2 != null) {
                int intValue = num2.intValue();
                View$OnTouchListenerC82108c cVar = this.f183753a;
                cVar.f183730i = intValue;
                C70612k.f158036f.f158043e = cVar.f183730i;
            }
            if (!(dVar2 == null || (uVar = (C89386u) dVar2.mo33723a()) == null)) {
                this.f183753a.mo127337a((C70625d) uVar.getFirst(), ((Number) uVar.getSecond()).intValue(), ((Number) uVar.getThird()).intValue());
                this.f183753a.f183731j = ((Number) uVar.getThird()).intValue();
                View$OnTouchListenerC82108c cVar2 = this.f183753a;
                cVar2.f183732k = cVar2.f183731j;
                this.f183753a.mo127336a().mMusicStart = this.f183753a.f183731j;
                this.f183753a.f183733l = false;
                View$OnTouchListenerC82108c cVar3 = this.f183753a;
                cVar3.f183734t = cVar3.f183733l;
                this.f183753a.mo127336a().isSoundLoop = Boolean.valueOf(this.f183753a.f183733l);
                AbstractC82113e eVar = this.f183753a.f183739y;
                if (eVar != null) {
                    eVar.mo127343a();
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final void mo127337a(C70625d dVar, int i, int i2) {
        C73991bj.m130128a("SoundLoop, EditMusicCutScene.updateMusicWaveData musicLength = " + i + " videoLength = " + this.f183730i);
        this.f183736v = i;
        m142131b(true);
        if (dVar == null || !C70612k.C70614b.m124761a(dVar.getMusicWavePointArray())) {
            m142131b(true);
            return;
        }
        C70612k.m124749b(dVar);
        C70612k.f158036f.mo111418a(dVar, (long) this.f183730i, (long) i);
        m142131b(false);
        if (i2 == 0) {
            C70592b bVar = this.f183727f;
            if (bVar == null) {
                C89219l.m154710a("cutMusicLayout");
            }
            bVar.mo111353a();
        } else {
            C70592b bVar2 = this.f183727f;
            if (bVar2 == null) {
                C89219l.m154710a("cutMusicLayout");
            }
            bVar2.mo111354a((((float) i2) * 1.0f) / ((float) i));
            C70592b bVar3 = this.f183727f;
            if (bVar3 == null) {
                C89219l.m154710a("cutMusicLayout");
            }
            bVar3.setTimeBubble(i2);
        }
        C70592b bVar4 = this.f183727f;
        if (bVar4 == null) {
            C89219l.m154710a("cutMusicLayout");
        }
        bVar4.setOnScreenMaxWavePointCount(C70612k.f158036f.mo111416a((long) this.f183730i));
        C70592b bVar5 = this.f183727f;
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
