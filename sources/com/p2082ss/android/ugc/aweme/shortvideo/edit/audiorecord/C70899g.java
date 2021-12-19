package com.p2082ss.android.ugc.aweme.shortvideo.edit.audiorecord;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.core.content.C0643b;
import androidx.core.p036g.AbstractC0688a;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1171ab;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1213t;
import com.C1764a;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.bpea.basics.C13349j;
import com.bytedance.bpea.basics.C13350k;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.store.p878a.C13401b;
import com.bytedance.common.utility.C13628n;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.dmt.p1194ui.dialog.C17197a;
import com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17301b;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17303d;
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
import com.bytedance.provider.p1587vm.ScopeViewModel;
import com.bytedance.scene.AbstractC22219j;
import com.bytedance.scene.group.AbstractC22186b;
import com.p2082ss.android.ugc.asve.editor.AbstractC31071f;
import com.p2082ss.android.ugc.aweme.adaptation.C33398a;
import com.p2082ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.p2082ss.android.ugc.aweme.audiorecord.Point;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.editSticker.text.als.AbstractC46036a;
import com.p2082ss.android.ugc.aweme.effect.C46371s;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.services.video.VEVolumeChangeOp;
import com.p2082ss.android.ugc.aweme.shortvideo.C70636dh;
import com.p2082ss.android.ugc.aweme.shortvideo.C70638dj;
import com.p2082ss.android.ugc.aweme.shortvideo.cover.VEVideoCoverGeneratorImpl;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C70968bl;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C70976bp;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.audiorecord.AudioRecordStartButton;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.audiorecord.C70889b;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.p3810c.C70982a;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.p3841a.AbstractC72001h;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.p3841a.C71991a;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.p3841a.C71993c;
import com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a;
import com.p2082ss.android.ugc.aweme.shortvideo.subtitle.C73211f;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73991bj;
import com.p2082ss.android.ugc.aweme.shortvideo.widget.C74297p;
import com.p2082ss.android.ugc.aweme.shortvideo.widget.ChooseVideoCoverView;
import com.p2082ss.android.ugc.aweme.themechange.base.AVDmtTextView;
import com.p2082ss.android.ugc.aweme.themechange.base.C77795c;
import com.p2082ss.android.ugc.aweme.tools.C78099c;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.C80368e;
import com.p2082ss.android.ugc.aweme.video.C80720e;
import com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81432d;
import com.p2082ss.android.ugc.aweme.widgetcompat.WrapLinearLayoutManager;
import com.p2082ss.android.ugc.gamora.editor.p4279f.C82185a;
import com.p2082ss.android.ugc.gamora.editor.subtitle.AbstractC83094e;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.tools.view.C84916a;
import com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84917a;
import com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84919c;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.android.vesdk.VEAudioEncodeSettings;
import dmt.p4542av.video.C88296t;
import dmt.p4542av.video.C88297u;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import p077b.C1731i;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.EnumC89331m;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4612a.AbstractC89188r;
import p4600h.p4611f.p4612a.AbstractC89189s;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4615g.C89241a;
import p4600h.p4616h.AbstractC89248d;
import p4600h.p4620k.AbstractC89277c;
import p4600h.p4620k.AbstractC89286i;
import p4600h.p4620k.AbstractC89290k;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.g */
public final class C70899g extends AbstractC22219j implements WeakHandler.IHandler, AbstractC20382b, AbstractC21566a {

    /* renamed from: J */
    public static final C70903d f158736J = new C70903d((byte) 0);

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f158737a = {new C89232y(C70899g.class, "mVideoPublishEditModel", "getMVideoPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0), new C89232y(C70899g.class, "editSubtitleApi", "getEditSubtitleApi()Lcom/ss/android/ugc/gamora/editor/subtitle/EditSubtitleApi;", 0)};

    /* renamed from: A */
    public AVDmtTextView f158738A;

    /* renamed from: B */
    public C70928j f158739B;

    /* renamed from: C */
    public AudioRecorderParam f158740C;

    /* renamed from: D */
    public volatile boolean f158741D;

    /* renamed from: E */
    public final WeakHandler f158742E;

    /* renamed from: F */
    public final int f158743F;

    /* renamed from: G */
    public final int f158744G;

    /* renamed from: H */
    public final int f158745H;

    /* renamed from: I */
    public final C70919t f158746I;

    /* renamed from: K */
    private final AbstractC89244h f158747K;

    /* renamed from: L */
    private final AbstractC89244h f158748L = C89250i.m154773a((AbstractC89171a) C70920u.f158811a);

    /* renamed from: M */
    private final AbstractC89244h f158749M = C89250i.m154773a((AbstractC89171a) C70916q.f158807a);

    /* renamed from: N */
    private int f158750N = -1;

    /* renamed from: O */
    private AbstractC84919c f158751O;

    /* renamed from: P */
    private final AbstractC89248d f158752P;

    /* renamed from: Q */
    private final AbstractC89244h f158753Q;

    /* renamed from: R */
    private final AbstractC89244h f158754R;

    /* renamed from: S */
    private View f158755S;

    /* renamed from: T */
    private DmtStatusView f158756T;

    /* renamed from: U */
    private View f158757U;

    /* renamed from: V */
    private FrameLayout f158758V;

    /* renamed from: W */
    private ChooseVideoCoverView f158759W;

    /* renamed from: X */
    private View f158760X;

    /* renamed from: Y */
    private ViewGroup f158761Y;

    /* renamed from: Z */
    private LottieAnimationView f158762Z;

    /* renamed from: aa */
    private CheckBox f158763aa;

    /* renamed from: ab */
    private VEVideoCoverGeneratorImpl f158764ab;

    /* renamed from: ac */
    private C74297p f158765ac;

    /* renamed from: ad */
    private C1213t<Bitmap> f158766ad;

    /* renamed from: ae */
    private C1213t<Boolean> f158767ae;

    /* renamed from: af */
    private final C70915p f158768af;

    /* renamed from: ag */
    private final C70906g f158769ag;

    /* renamed from: ah */
    private final C21582f f158770ah;

    /* renamed from: b */
    public AbstractC31071f f158771b;

    /* renamed from: c */
    public int f158772c = 1;

    /* renamed from: d */
    public float f158773d;

    /* renamed from: e */
    public final ValueAnimator f158774e;

    /* renamed from: f */
    public boolean f158775f;

    /* renamed from: g */
    public boolean f158776g;

    /* renamed from: h */
    public boolean f158777h;

    /* renamed from: i */
    public Point f158778i;

    /* renamed from: j */
    final AbstractC89248d f158779j;

    /* renamed from: k */
    public C1213t<C88296t> f158780k;

    /* renamed from: l */
    public View f158781l;

    /* renamed from: t */
    public View f158782t;

    /* renamed from: u */
    public View f158783u;

    /* renamed from: v */
    public C70889b f158784v;

    /* renamed from: w */
    public AudioRecordStartButton f158785w;

    /* renamed from: x */
    public boolean f158786x;

    /* renamed from: y */
    public boolean f158787y;

    /* renamed from: z */
    public View f158788z;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.g$r */
    static final class View$OnClickListenerC70917r implements View.OnClickListener {

        /* renamed from: a */
        public static final View$OnClickListenerC70917r f158808a = new View$OnClickListenerC70917r();

        static {
            Covode.recordClassIndex(83411);
        }

        View$OnClickListenerC70917r() {
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
        }
    }

    static {
        Covode.recordClassIndex(83393);
    }

    /* renamed from: F */
    private final AbstractC46036a m125189F() {
        return (AbstractC46036a) this.f158754R.getValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public final AbstractC72510a mo112073C() {
        return (AbstractC72510a) this.f158753Q.getValue();
    }

    /* renamed from: a */
    public final C1213t<Long> mo112076a() {
        return (C1213t) this.f158748L.getValue();
    }

    /* renamed from: b */
    public final C1213t<Boolean> mo112082b() {
        return (C1213t) this.f158749M.getValue();
    }

    /* renamed from: d */
    public final VideoPublishEditModel mo112087d() {
        return (VideoPublishEditModel) this.f158752P.mo23374a(this, f158737a[0]);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.g$d */
    public static final class C70903d {
        static {
            Covode.recordClassIndex(83397);
        }

        private C70903d() {
        }

        public /* synthetic */ C70903d(byte b) {
            this();
        }
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f158770ah;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.AbstractC20367ae
    public final /* bridge */ /* synthetic */ AbstractC20477i getReceiver() {
        return this;
    }

    /* renamed from: a */
    public final void mo112079a(boolean z) {
        this.f158786x = z;
        m125189F().mo77627d(z);
    }

    /* renamed from: a */
    public final void mo112081a(boolean z, PrivacyCert privacyCert) {
        float f;
        Integer num;
        AbstractC31071f fVar = this.f158771b;
        if (fVar != null) {
            View view = this.f158783u;
            if (view == null) {
                C89219l.m154710a("mPlayView");
            }
            view.setVisibility(4);
            int i = 0;
            float f2 = 0.0f;
            if (z) {
                this.f158740C.setNeedDel(true);
                C70926h.m125230a(mo112073C(), this.f158740C);
                AVDmtTextView aVDmtTextView = this.f158738A;
                if (aVDmtTextView == null) {
                    C89219l.m154710a("tvMsg");
                }
                aVDmtTextView.setVisibility(4);
                View view2 = this.f158788z;
                if (view2 == null) {
                    C89219l.m154710a("backView");
                }
                view2.setVisibility(4);
                LottieAnimationView lottieAnimationView = this.f158762Z;
                if (lottieAnimationView == null) {
                    C89219l.m154710a("lottieAnimationView");
                }
                lottieAnimationView.mo5826a();
                LottieAnimationView lottieAnimationView2 = this.f158762Z;
                if (lottieAnimationView2 == null) {
                    C89219l.m154710a("lottieAnimationView");
                }
                lottieAnimationView2.setVisibility(0);
                f = 0.0f;
            } else {
                this.f158776g = true;
                AudioRecorderParam audioRecorderParam = this.f158740C;
                C70889b bVar = this.f158784v;
                if (bVar == null) {
                    C89219l.m154710a("audioRecordSeekBar");
                }
                audioRecorderParam.setMStack(bVar.getStack());
                if ((!this.f158740C.getMStack().isEmpty()) && this.f158739B != null && this.f158740C.getAudioRecordIndex() < 0) {
                    C70926h.m125230a(mo112073C(), this.f158740C);
                }
                f = mo112087d().voiceVolume;
                f2 = mo112087d().musicVolume;
            }
            mo112077a(f2, f);
            C73991bj.m130133d("EditAudioRecordScene startRecording isRecording " + this.f158775f + " isRecord " + z);
            if (z) {
                if (this.f158778i != null) {
                    C1213t<C88296t> tVar = this.f158780k;
                    if (tVar == null) {
                        C89219l.m154710a("mPreviewControlOpLiveData");
                    }
                    Point point = this.f158778i;
                    if (point == null) {
                        C89219l.m154715b();
                    }
                    tVar.setValue(C88296t.m153438b((long) point.getY()));
                    C70889b bVar2 = this.f158784v;
                    if (bVar2 == null) {
                        C89219l.m154710a("audioRecordSeekBar");
                    }
                    Point point2 = this.f158778i;
                    if (point2 == null) {
                        C89219l.m154715b();
                    }
                    this.f158778i = bVar2.mo112066b(point2.getY());
                } else {
                    int k = fVar.mo56370k();
                    if (k >= 50) {
                        i = k;
                    }
                    C70889b bVar3 = this.f158784v;
                    if (bVar3 == null) {
                        C89219l.m154710a("audioRecordSeekBar");
                    }
                    this.f158778i = bVar3.mo112066b(i);
                }
                this.f158775f = true;
                C70928j jVar = this.f158739B;
                if (jVar != null) {
                    num = Integer.valueOf(jVar.f158818a.mo130149a(fVar.mo56370k() + 50, this.f158772c, privacyCert));
                } else {
                    num = null;
                }
                String str = mo112087d().creationId;
                C89219l.m154716b(str, "");
                C80368e.m139341a(str);
                if (num != null && num.intValue() == 0) {
                    String str2 = mo112087d().creationId;
                    C89219l.m154716b(str2, "");
                    C80368e.m139343b(str2);
                } else {
                    String str3 = mo112087d().creationId;
                    C89219l.m154716b(str3, "");
                    C80368e.m139342a(str3, num != null ? num.intValue() : Integer.MAX_VALUE, "");
                }
            }
            C1213t<C88296t> tVar2 = this.f158780k;
            if (tVar2 == null) {
                C89219l.m154710a("mPreviewControlOpLiveData");
            }
            tVar2.setValue(C88296t.m153435a());
            this.f158774e.start();
        }
    }

    /* renamed from: a */
    public final void mo112080a(boolean z, int i, PrivacyCert privacyCert) {
        if (!z) {
            C1213t<C88296t> tVar = this.f158780k;
            if (tVar == null) {
                C89219l.m154710a("mPreviewControlOpLiveData");
            }
            tVar.setValue(C88296t.m153437b());
        }
        AbstractC31071f fVar = this.f158771b;
        if (fVar != null) {
            fVar.mo56392w();
            mo112076a().setValue(Long.valueOf((long) fVar.mo56370k()));
        }
        this.f158774e.cancel();
        View view = this.f158783u;
        if (view == null) {
            C89219l.m154710a("mPlayView");
        }
        view.setVisibility(0);
        if (this.f158786x) {
            mo112079a(false);
            AudioRecordStartButton audioRecordStartButton = this.f158785w;
            if (audioRecordStartButton == null) {
                C89219l.m154710a("audioRecordStartButton");
            }
            audioRecordStartButton.mo112036a();
        }
        if (this.f158787y) {
            mo112084b(false);
            AudioRecordStartButton audioRecordStartButton2 = this.f158785w;
            if (audioRecordStartButton2 == null) {
                C89219l.m154710a("audioRecordStartButton");
            }
            audioRecordStartButton2.mo112037b();
        }
        if (this.f158775f) {
            C70928j jVar = this.f158739B;
            if (jVar != null) {
                if (z) {
                    Point point = this.f158778i;
                    if (point != null) {
                        point.setY(this.f158772c);
                    }
                    jVar.mo112100a(privacyCert);
                } else {
                    int a = (int) jVar.mo112100a(privacyCert);
                    if (i == -1) {
                        i = a;
                    }
                    Point point2 = this.f158778i;
                    if (point2 != null) {
                        point2.setY(i);
                    }
                    C1213t<C88296t> tVar2 = this.f158780k;
                    if (tVar2 == null) {
                        C89219l.m154710a("mPreviewControlOpLiveData");
                    }
                    tVar2.setValue(C88296t.m153438b((long) i));
                    C70889b bVar = this.f158784v;
                    if (bVar == null) {
                        C89219l.m154710a("audioRecordSeekBar");
                    }
                    bVar.mo112063a(((float) i) / ((float) this.f158772c));
                }
                String str = mo112087d().creationId;
                C89219l.m154716b(str, "");
                C80368e.m139344c(str);
                C70889b bVar2 = this.f158784v;
                if (bVar2 == null) {
                    C89219l.m154710a("audioRecordSeekBar");
                }
                bVar2.f158709b.invalidate();
            }
            this.f158775f = false;
            Point point3 = this.f158778i;
            if (point3 != null) {
                mo112076a().setValue(Long.valueOf((long) point3.getY()));
            }
        }
        this.f158776g = false;
        AudioRecorderParam audioRecorderParam = this.f158740C;
        C70889b bVar3 = this.f158784v;
        if (bVar3 == null) {
            C89219l.m154710a("audioRecordSeekBar");
        }
        audioRecorderParam.setMStack(bVar3.getStack());
        if (this.f158740C.getMStack().isEmpty()) {
            View view2 = this.f158788z;
            if (view2 == null) {
                C89219l.m154710a("backView");
            }
            view2.setVisibility(8);
        } else {
            View view3 = this.f158788z;
            if (view3 == null) {
                C89219l.m154710a("backView");
            }
            view3.setVisibility(0);
        }
        AVDmtTextView aVDmtTextView = this.f158738A;
        if (aVDmtTextView == null) {
            C89219l.m154710a("tvMsg");
        }
        aVDmtTextView.setVisibility(0);
        LottieAnimationView lottieAnimationView = this.f158762Z;
        if (lottieAnimationView == null) {
            C89219l.m154710a("lottieAnimationView");
        }
        lottieAnimationView.setVisibility(4);
        LottieAnimationView lottieAnimationView2 = this.f158762Z;
        if (lottieAnimationView2 == null) {
            C89219l.m154710a("lottieAnimationView");
        }
        lottieAnimationView2.mo5836d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.g$e */
    public static final class CallableC70904e<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ Runnable f158794a;

        static {
            Covode.recordClassIndex(83398);
        }

        CallableC70904e(Runnable runnable) {
            this.f158794a = runnable;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            this.f158794a.run();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.g$q */
    static final class C70916q extends AbstractC89220m implements AbstractC89171a<C1213t<Boolean>> {

        /* renamed from: a */
        public static final C70916q f158807a = new C70916q();

        static {
            Covode.recordClassIndex(83410);
        }

        C70916q() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1213t<Boolean> invoke() {
            return new C1213t();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.g$u */
    static final class C70920u extends AbstractC89220m implements AbstractC89171a<C1213t<Long>> {

        /* renamed from: a */
        public static final C70920u f158811a = new C70920u();

        static {
            Covode.recordClassIndex(83414);
        }

        C70920u() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1213t<Long> invoke() {
            return new C1213t();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.g$v */
    public static final class CallableC70921v<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ Runnable f158812a;

        static {
            Covode.recordClassIndex(83415);
        }

        CallableC70921v(Runnable runnable) {
            this.f158812a = runnable;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            this.f158812a.run();
            return C89391z.f203057a;
        }
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

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: w */
    public final void mo36490w() {
        this.f158777h = false;
        super.mo36490w();
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.g$a */
    public static final class C70900a extends AbstractC89220m implements AbstractC89171a<AbstractC72510a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f158789a;

        static {
            Covode.recordClassIndex(83394);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C70900a(AbstractC21566a aVar) {
            super(0);
            this.f158789a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.aweme.shortvideo.preview.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f158789a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.aweme.shortvideo.preview.a> r1 = com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a.class
                r0 = 0
                java.lang.Object r0 = r2.mo35249a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.edit.audiorecord.C70899g.C70900a.invoke():com.bytedance.als.b");
        }
    }

    /* renamed from: I */
    private final void m125192I() {
        C39162r.m79460a("click_dub", mo112075E().f188764a);
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: n_ */
    public final void mo22713n_() {
        super.mo22713n_();
        this.f158774e.cancel();
        this.f158742E.removeCallbacksAndMessages(null);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.g$b */
    public static final class C70901b extends AbstractC89220m implements AbstractC89171a<AbstractC46036a> {

        /* renamed from: a */
        final /* synthetic */ C70899g f158790a;

        static {
            Covode.recordClassIndex(83395);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C70901b(C70899g gVar) {
            super(0);
            this.f158790a = gVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.aweme.editSticker.text.als.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.editSticker.text.als.AbstractC46036a invoke() {
            /*
                r2 = this;
                com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.g r0 = r2.f158790a
                androidx.fragment.app.e r0 = com.bytedance.scene.ktx.C22228c.m41832b(r0)
                com.bytedance.als.ApiCenter r1 = com.bytedance.als.ApiCenter.C2545a.m7450a(r0)
                java.lang.Class<com.ss.android.ugc.aweme.editSticker.text.als.a> r0 = com.p2082ss.android.ugc.aweme.editSticker.text.als.AbstractC46036a.class
                com.bytedance.als.b r0 = r1.mo7013a(r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.edit.audiorecord.C70899g.C70901b.invoke():com.bytedance.als.b");
        }
    }

    /* renamed from: G */
    private final void m125190G() {
        RunnableC70922w wVar = new RunnableC70922w(this);
        this.f158739B = new C70928j();
        C1731i.m5640b(new CallableC70921v(wVar), C40780g.m82241a());
    }

    /* renamed from: H */
    private final int m125191H() {
        return ((C70636dh.m124836e(this.f52549m) - ((int) C13628n.m24520b(this.f52549m, 334.0f))) - C70636dh.m124833c(this.f52549m)) - C70636dh.m124835d(this.f52549m);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.g$f */
    public static final class RunnableC70905f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C70899g f158795a;

        /* renamed from: b */
        final /* synthetic */ String f158796b;

        static {
            Covode.recordClassIndex(83399);
        }

        RunnableC70905f(C70899g gVar, String str) {
            this.f158795a = gVar;
            this.f158796b = str;
        }

        public final void run() {
            this.f158795a.f158741D = false;
            this.f158795a.f158742E.sendEmptyMessage(this.f158795a.f158743F);
            if (!C89361p.m154876c(this.f158796b, "df", false)) {
                C80720e.m139931c(this.f158796b);
            }
            this.f158795a.f158742E.sendEmptyMessage(this.f158795a.f158745H);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public final void mo112074D() {
        AudioRecorderParam audioRecorderParam = this.f158740C;
        C70889b bVar = this.f158784v;
        if (bVar == null) {
            C89219l.m154710a("audioRecordSeekBar");
        }
        audioRecorderParam.setMStack(bVar.getStack());
        if (mo112082b().getValue() != null) {
            AudioRecorderParam audioRecorderParam2 = this.f158740C;
            Boolean value = mo112082b().getValue();
            if (value == null) {
                C89219l.m154715b();
            }
            audioRecorderParam2.setNeedOriginalSound(value.booleanValue());
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: x */
    public final void mo36491x() {
        super.mo36491x();
        C73991bj.m130133d("EditAudioRecordScene pauseRecord isRecording " + this.f158775f);
        if (this.f158775f) {
            m125194a(this, false, 0, new PrivacyCert(new C13349j("1074"), "Dubbing when editing a video.", new C13350k[]{C13401b.m24108b()}), 3);
        }
        this.f158777h = true;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.g$c */
    public static final class C70902c extends AbstractC89220m implements AbstractC89171a<EditAudioRecordViewModel> {

        /* renamed from: a */
        final /* synthetic */ AbstractC22219j f158791a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89277c f158792b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89277c f158793c;

        static {
            Covode.recordClassIndex(83396);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C70902c(AbstractC22219j jVar, AbstractC89277c cVar, AbstractC89277c cVar2) {
            super(0);
            this.f158791a = jVar;
            this.f158792b = cVar;
            this.f158793c = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v8, types: [com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.EditAudioRecordViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v15, types: [com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.EditAudioRecordViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 2 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.shortvideo.edit.audiorecord.EditAudioRecordViewModel invoke() {
            /*
                r6 = this;
                com.bytedance.scene.j r0 = r6.f158791a
                com.bytedance.scene.j r5 = r0.f52551o
                h.k.c r0 = r6.f158793c
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                java.lang.String r3 = r0.getCanonicalName()
                java.lang.String r4 = ""
                p4600h.p4611f.p4613b.C89219l.m154716b(r3, r4)
            L_0x0013:
                if (r5 == 0) goto L_0x003a
                androidx.lifecycle.ad$b r0 = com.bytedance.jedi.arch.C20392e.f48284a     // Catch:{ as -> 0x0035 }
                androidx.lifecycle.ad r2 = com.bytedance.scene.C22267s.m41934a(r5, r0)     // Catch:{ as -> 0x0035 }
                h.k.c r0 = r6.f158793c     // Catch:{ as -> 0x0035 }
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)     // Catch:{ as -> 0x0035 }
                java.lang.String r1 = r0.getCanonicalName()     // Catch:{ as -> 0x0035 }
                p4600h.p4611f.p4613b.C89219l.m154716b(r1, r4)     // Catch:{ as -> 0x0035 }
                h.k.c r0 = r6.f158792b     // Catch:{ as -> 0x0035 }
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)     // Catch:{ as -> 0x0035 }
                androidx.lifecycle.ac r0 = m125223x9c1d1024(r2, r1, r0)     // Catch:{ as -> 0x0035 }
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0     // Catch:{ as -> 0x0035 }
                goto L_0x0038
            L_0x0035:
                com.bytedance.scene.j r5 = r5.f52551o
                goto L_0x0013
            L_0x0038:
                if (r0 != 0) goto L_0x0052
            L_0x003a:
                com.bytedance.scene.j r0 = r6.f158791a
                androidx.fragment.app.e r1 = com.bytedance.scene.ktx.C22228c.m41832b(r0)
                androidx.lifecycle.ad$b r0 = com.bytedance.jedi.arch.C20392e.f48284a
                androidx.lifecycle.ad r1 = androidx.lifecycle.C1181ae.m3881a(r1, r0)
                h.k.c r0 = r6.f158792b
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                androidx.lifecycle.ac r0 = m125223x9c1d1024(r1, r3, r0)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
            L_0x0052:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.edit.audiorecord.C70899g.C70902c.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        /* renamed from: com_ss_android_ugc_aweme_shortvideo_edit_audiorecord_EditAudioRecordScene$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get */
        public static AbstractC1174ac m125223x9c1d1024(C1175ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.mo3984a(str, cls);
            }
            AbstractC1174ac a = adVar.mo3984a(str, cls);
            C1171ab.m3870a(a, adVar);
            return a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public final C84425b mo112075E() {
        C84425b a = new C84425b().mo129406a("content_source", C70968bl.m125262b(mo112087d())).mo129406a("enter_from", "video_edit_page").mo129406a("shoot_way", mo112087d().mShootWay).mo129406a("creation_id", mo112087d().creationId).mo129406a("content_type", "video");
        C89219l.m154716b(a, "");
        return a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.g$w */
    public static final class RunnableC70922w implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C70899g f158813a;

        static {
            Covode.recordClassIndex(83416);
        }

        RunnableC70922w(C70899g gVar) {
            this.f158813a = gVar;
        }

        public final void run() {
            this.f158813a.f158742E.sendEmptyMessage(this.f158813a.f158743F);
            new File(C70638dj.f158111n).mkdirs();
            String str = C70638dj.f158111n + System.currentTimeMillis() + ".wav";
            if (!C63244g.m114602a().mo73287o().mo104784d()) {
                String str2 = C70638dj.f158111n;
                C89219l.m154716b(str2, "");
                C70899g.m125195a(str2, this.f158813a.f158740C.getAudioUrl());
            }
            if (this.f158813a.f158740C.hasRecord()) {
                C80720e.m139932c(this.f158813a.f158740C.getAudioUrl(), str);
                C70928j jVar = this.f158813a.f158739B;
                if (jVar != null) {
                    VEAudioEncodeSettings a = new VEAudioEncodeSettings.C85194a().mo130147a();
                    C89219l.m154716b(a, "");
                    C89219l.m154721d(str, "");
                    C89219l.m154721d(a, "");
                    jVar.f158818a.mo130150a(str, a);
                }
                AudioRecorderParam audioRecorderParam = this.f158813a.f158740C;
                C70928j jVar2 = this.f158813a.f158739B;
                if (jVar2 == null) {
                    C89219l.m154715b();
                }
                audioRecorderParam.setAudioUrl(jVar2.mo112101a());
            } else {
                AbstractC31071f fVar = this.f158813a.f158771b;
                if (fVar != null) {
                    new File(C70638dj.f158111n).mkdirs();
                    String str3 = C70638dj.f158111n + System.currentTimeMillis() + ".wav";
                    C70928j jVar3 = this.f158813a.f158739B;
                    if (jVar3 != null) {
                        int j = fVar.mo56368j();
                        VEAudioEncodeSettings a2 = new VEAudioEncodeSettings.C85194a().mo130147a();
                        C89219l.m154716b(a2, "");
                        C89219l.m154721d(str3, "");
                        C89219l.m154721d(a2, "");
                        jVar3.f158818a.mo130151a(str3, a2, j);
                    }
                    AudioRecorderParam audioRecorderParam2 = this.f158813a.f158740C;
                    C70928j jVar4 = this.f158813a.f158739B;
                    if (jVar4 == null) {
                        C89219l.m154715b();
                    }
                    audioRecorderParam2.setAudioUrl(jVar4.mo112101a());
                }
            }
            this.f158813a.f158742E.sendEmptyMessage(this.f158813a.f158744G);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.g$g */
    public static final class C70906g extends AbstractView$OnClickListenerC81432d {

        /* renamed from: a */
        final /* synthetic */ C70899g f158797a;

        static {
            Covode.recordClassIndex(83400);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C70906g(C70899g gVar) {
            this.f158797a = gVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81432d
        /* renamed from: a */
        public final void mo77200a(View view) {
            String audioUrl;
            String str = "";
            C89219l.m154721d(view, str);
            if (this.f158797a.f158741D) {
                int id = view.getId();
                if (id == R.id.et8) {
                    C70899g gVar = this.f158797a;
                    if (gVar.f158775f || gVar.f158776g) {
                        C70899g.m125194a(gVar, false, 0, new PrivacyCert(new C13349j("1068"), "Dubbing when editing a video.", new C13350k[]{C13401b.m24108b()}), 3);
                    }
                    C39162r.m79460a("cancel_dub", gVar.mo112075E().f188764a);
                    gVar.mo112074D();
                    if (gVar.f158740C.hasChange(gVar.mo112087d().veAudioRecorderParam)) {
                        C17197a.C17200a aVar = new C17197a.C17200a(gVar.f52549m);
                        aVar.mo27189a(R.string.awy).mo27195b(R.string.ax3, (DialogInterface.OnClickListener) DialogInterface$OnClickListenerC70923x.f158814a, false).mo27190a(R.string.ax2, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC70924y(gVar), false);
                        aVar.mo27193a().mo27184b();
                        return;
                    }
                    gVar.mo112077a(gVar.mo112087d().musicVolume, gVar.mo112087d().voiceVolume);
                    gVar.mo112078a(gVar.f158740C.getAudioUrl());
                    if (gVar.mo112087d().veAudioRecorderParam != null && gVar.mo112087d().veAudioRecorderParam.hasRecord() && gVar.mo112087d().veAudioRecorderParam.getAudioRecordIndex() == -2) {
                        AbstractC72510a C = gVar.mo112073C();
                        AudioRecorderParam audioRecorderParam = gVar.mo112087d().veAudioRecorderParam;
                        C89219l.m154716b(audioRecorderParam, str);
                        C70926h.m125230a(C, audioRecorderParam);
                    }
                } else if (id == R.id.f2x) {
                    C70899g gVar2 = this.f158797a;
                    if (gVar2.f158775f || gVar2.f158776g) {
                        C70899g.m125194a(gVar2, false, 0, new PrivacyCert(new C13349j("1069"), "Dubbing when editing a video.", new C13350k[]{C13401b.m24108b()}), 3);
                    }
                    gVar2.mo112074D();
                    if (gVar2.f158739B != null) {
                        gVar2.mo112077a(gVar2.mo112087d().musicVolume, gVar2.mo112087d().voiceVolume);
                        if (gVar2.f158740C.getAudioRecordIndex() < 0 && gVar2.f158740C.hasRecord()) {
                            C70926h.m125230a(gVar2.mo112073C(), gVar2.f158740C);
                        }
                    }
                    if (gVar2.mo112087d().veAudioRecorderParam == null) {
                        gVar2.mo112087d().veAudioRecorderParam = new AudioRecorderParam();
                        audioUrl = str;
                    } else {
                        audioUrl = gVar2.mo112087d().veAudioRecorderParam.getAudioUrl();
                    }
                    gVar2.mo112087d().veAudioRecorderParam.copyFrom(gVar2.f158740C);
                    if (C89361p.m154876c(audioUrl, "df", false)) {
                        gVar2.mo112087d().veAudioRecorderParam.setExtraUrl(audioUrl);
                    } else {
                        str = audioUrl;
                    }
                    C39162r.m79460a("save_dub", gVar2.mo112075E().mo129403a("original_sound", gVar2.f158740C.getNeedOriginalSound() ? 1 : 0).f188764a);
                    gVar2.mo112078a(str);
                    AbstractC83094e eVar = (AbstractC83094e) gVar2.f158779j.mo23374a(gVar2, C70899g.f158737a[1]);
                    if (eVar != null && C73211f.m129264a(gVar2.mo112087d()) && eVar.mo128171h()) {
                        eVar.mo128170g();
                        eVar.mo128169f();
                    }
                } else if (id == R.id.fea) {
                    C70899g.m125194a(this.f158797a, false, 0, new PrivacyCert(new C13349j("1072"), "Dubbing when editing a video.", new C13350k[]{C13401b.m24108b()}), 3);
                } else if (id == R.id.pv) {
                    C70899g gVar3 = this.f158797a;
                    if (gVar3.f158775f || gVar3.f158776g) {
                        C70899g.m125194a(gVar3, false, 0, new PrivacyCert(new C13349j("1073"), "Dubbing when editing a video.", new C13350k[]{C13401b.m24108b()}), 3);
                    }
                    C39162r.m79460a("delete_dub", gVar3.mo112075E().f188764a);
                    gVar3.f158740C.setNeedDel(true);
                    C70926h.m125230a(gVar3.mo112073C(), gVar3.f158740C);
                    C70889b bVar = gVar3.f158784v;
                    if (bVar == null) {
                        C89219l.m154710a("audioRecordSeekBar");
                    }
                    if (!bVar.f158709b.getMStack().empty()) {
                        Point pop = bVar.f158709b.getMStack().pop();
                        bVar.f158709b.invalidate();
                        if (pop != null) {
                            float x = ((float) pop.getX()) / ((float) gVar3.f158772c);
                            pop.setY(pop.getY() + 100);
                            if (pop.getY() > gVar3.f158772c) {
                                pop.setY(gVar3.f158772c);
                            }
                            C70928j jVar = gVar3.f158739B;
                            if (jVar != null) {
                                jVar.f158818a.mo130148a(pop.getX(), pop.getY());
                            }
                            gVar3.f158746I.mo112095a(x, true);
                            C70889b bVar2 = gVar3.f158784v;
                            if (bVar2 == null) {
                                C89219l.m154710a("audioRecordSeekBar");
                            }
                            bVar2.mo112063a(x);
                            AudioRecorderParam audioRecorderParam2 = gVar3.f158740C;
                            C70889b bVar3 = gVar3.f158784v;
                            if (bVar3 == null) {
                                C89219l.m154710a("audioRecordSeekBar");
                            }
                            audioRecorderParam2.setMStack(bVar3.getStack());
                            if (gVar3.f158740C.getMStack().isEmpty()) {
                                View view2 = gVar3.f158788z;
                                if (view2 == null) {
                                    C89219l.m154710a("backView");
                                }
                                view2.setVisibility(8);
                            }
                        }
                    }
                } else if (id == R.id.byg && !this.f158797a.f158777h) {
                    this.f158797a.mo112081a(false, (PrivacyCert) null);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.g$h */
    public static final class C70907h extends AbstractView$OnClickListenerC81432d {

        /* renamed from: a */
        final /* synthetic */ C70899g f158798a;

        static {
            Covode.recordClassIndex(83401);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C70907h(C70899g gVar) {
            this.f158798a = gVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81432d
        /* renamed from: a */
        public final void mo77200a(View view) {
            C89219l.m154721d(view, "");
            if (this.f158798a.f158787y) {
                this.f158798a.mo112084b(false);
                C70899g.m125197b(this.f158798a).mo112037b();
                C70899g.m125194a(this.f158798a, false, 0, new PrivacyCert(new C13349j("1070"), "Dubbing when editing a video.", new C13350k[]{C13401b.m24108b()}), 3);
                this.f158798a.mo112085c("click");
            } else if (!this.f158798a.f158777h) {
                this.f158798a.mo112084b(true);
                AudioRecordStartButton.C70879a aVar = C70899g.m125197b(this.f158798a).f158683b;
                if (aVar == null) {
                    C89219l.m154710a("centerView");
                }
                aVar.f158687b.end();
                aVar.f158688c.start();
                this.f158798a.mo112081a(true, new PrivacyCert(new C13349j("1064"), "Dubbing when editing a video.", new C13350k[]{C13401b.m24108b()}));
                this.f158798a.mo112083b("click");
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.g$i */
    public static final class View$OnLongClickListenerC70908i implements View.OnLongClickListener {

        /* renamed from: a */
        final /* synthetic */ C70899g f158799a;

        static {
            Covode.recordClassIndex(83402);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        View$OnLongClickListenerC70908i(C70899g gVar) {
            this.f158799a = gVar;
        }

        public final boolean onLongClick(View view) {
            if (this.f158799a.f158777h) {
                return true;
            }
            this.f158799a.mo112079a(true);
            AudioRecordStartButton b = C70899g.m125197b(this.f158799a);
            b.f158685d.end();
            b.f158684c.start();
            this.f158799a.mo112081a(true, new PrivacyCert(new C13349j("1065"), "Dubbing when editing a video.", new C13350k[]{C13401b.m24108b()}));
            this.f158799a.mo112083b("long_press");
            return true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.g$j */
    public static final class View$OnTouchListenerC70909j implements View.OnTouchListener {

        /* renamed from: a */
        final /* synthetic */ C70899g f158800a;

        static {
            Covode.recordClassIndex(83403);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        View$OnTouchListenerC70909j(C70899g gVar) {
            this.f158800a = gVar;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent != null && ((motionEvent.getAction() == 3 || motionEvent.getAction() == 1) && this.f158800a.f158786x)) {
                this.f158800a.mo112079a(false);
                C70899g.m125197b(this.f158800a).mo112036a();
                C70899g.m125194a(this.f158800a, false, 0, new PrivacyCert(new C13349j("1071"), "Dubbing when editing a video.", new C13350k[]{C13401b.m24108b()}), 3);
                this.f158800a.mo112085c("long_press");
            }
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.g$l */
    static final class C70911l implements AbstractC72001h {

        /* renamed from: a */
        final /* synthetic */ C71991a f158802a;

        static {
            Covode.recordClassIndex(83405);
        }

        C70911l(C71991a aVar) {
            this.f158802a = aVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.p3841a.AbstractC72001h
        /* renamed from: a */
        public final void mo78808a(List<Bitmap> list) {
            this.f158802a.mo114165a(list);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.g$p */
    public static final class C70915p implements AbstractC84917a {

        /* renamed from: a */
        final /* synthetic */ C70899g f158806a;

        static {
            Covode.recordClassIndex(83409);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C70915p(C70899g gVar) {
            this.f158806a = gVar;
        }

        @Override // com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84917a
        public final boolean onKeyDown(int i, KeyEvent keyEvent) {
            if (i != 4 || !this.f158806a.mo36460z()) {
                return false;
            }
            C70899g.m125200e(this.f158806a).performClick();
            return true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.g$t */
    public static final class C70919t implements AbstractC70927i {

        /* renamed from: a */
        final /* synthetic */ C70899g f158810a;

        static {
            Covode.recordClassIndex(83413);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C70919t(C70899g gVar) {
            this.f158810a = gVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.audiorecord.AbstractC70927i
        /* renamed from: a */
        public final void mo112095a(float f, boolean z) {
            int i;
            long j;
            long j2 = (long) (((float) this.f158810a.f158772c) * f);
            AbstractC31071f fVar = this.f158810a.f158771b;
            if (fVar != null) {
                i = fVar.mo56246G();
            } else {
                i = 0;
            }
            int i2 = (int) (((float) i) * f);
            AbstractC31071f fVar2 = this.f158810a.f158771b;
            if (fVar2 != null) {
                j = (long) fVar2.mo56386s(i2);
            } else {
                j = 0;
            }
            this.f158810a.f158773d = f;
            if (z) {
                this.f158810a.f158778i = null;
                C70899g.m125201f(this.f158810a).setValue(C88296t.m153438b(j));
                C70899g.m125201f(this.f158810a).setValue(C88296t.m153437b());
                C70899g.m125202g(this.f158810a).setVisibility(0);
            } else {
                C70899g.m125201f(this.f158810a).setValue(C88296t.m153436a(j));
                C70899g.m125201f(this.f158810a).setValue(C88296t.m153437b());
                C70899g.m125202g(this.f158810a).setVisibility(4);
            }
            this.f158810a.mo112076a().setValue(Long.valueOf(j2));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.g$k */
    static final class C70910k implements C71993c.AbstractC71996b {

        /* renamed from: a */
        public static final C70910k f158801a = new C70910k();

        static {
            Covode.recordClassIndex(83404);
        }

        C70910k() {
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.p3841a.C71993c.AbstractC71996b
        /* renamed from: a */
        public final void mo78807a(String str) {
            C63244g.m114602a().mo73263I().mo101628a(str);
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ C70889b m125193a(C70899g gVar) {
        C70889b bVar = gVar.f158784v;
        if (bVar == null) {
            C89219l.m154710a("audioRecordSeekBar");
        }
        return bVar;
    }

    /* renamed from: b */
    public static final /* synthetic */ AudioRecordStartButton m125197b(C70899g gVar) {
        AudioRecordStartButton audioRecordStartButton = gVar.f158785w;
        if (audioRecordStartButton == null) {
            C89219l.m154710a("audioRecordStartButton");
        }
        return audioRecordStartButton;
    }

    /* renamed from: c */
    public static final /* synthetic */ AVDmtTextView m125198c(C70899g gVar) {
        AVDmtTextView aVDmtTextView = gVar.f158738A;
        if (aVDmtTextView == null) {
            C89219l.m154710a("tvMsg");
        }
        return aVDmtTextView;
    }

    /* renamed from: d */
    public static final /* synthetic */ View m125199d(C70899g gVar) {
        View view = gVar.f158788z;
        if (view == null) {
            C89219l.m154710a("backView");
        }
        return view;
    }

    /* renamed from: e */
    public static final /* synthetic */ View m125200e(C70899g gVar) {
        View view = gVar.f158782t;
        if (view == null) {
            C89219l.m154710a("mCancelView");
        }
        return view;
    }

    /* renamed from: f */
    public static final /* synthetic */ C1213t m125201f(C70899g gVar) {
        C1213t<C88296t> tVar = gVar.f158780k;
        if (tVar == null) {
            C89219l.m154710a("mPreviewControlOpLiveData");
        }
        return tVar;
    }

    /* renamed from: g */
    public static final /* synthetic */ View m125202g(C70899g gVar) {
        View view = gVar.f158783u;
        if (view == null) {
            C89219l.m154710a("mPlayView");
        }
        return view;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af> S1 getState(VM1 vm1) {
        C89219l.m154721d(vm1, "");
        return (S1) AbstractC20382b.C20383a.m38582a(this, vm1);
    }

    /* renamed from: c */
    public final void mo112085c(String str) {
        C39162r.m79460a("record_dub_end", mo112075E().mo129406a("enter_method", str).f188764a);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.g$z */
    static final class C70925z<T> implements AbstractC0688a {

        /* renamed from: a */
        final /* synthetic */ C70899g f158816a;

        /* renamed from: b */
        final /* synthetic */ boolean f158817b;

        static {
            Covode.recordClassIndex(83419);
        }

        C70925z(C70899g gVar, boolean z) {
            this.f158816a = gVar;
            this.f158817b = z;
        }

        @Override // androidx.core.p036g.AbstractC0688a
        /* renamed from: a */
        public final /* synthetic */ void mo2720a(Object obj) {
            if (this.f158817b) {
                View view = this.f158816a.f158781l;
                if (view == null) {
                    C89219l.m154710a("mSaveView");
                }
                view.setVisibility(0);
                C70899g.m125200e(this.f158816a).setVisibility(0);
                return;
            }
            AbstractC22186b bVar = (AbstractC22186b) this.f158816a.f52551o;
            if (bVar != null) {
                bVar.mo36413d(this.f158816a);
            }
        }
    }

    /* renamed from: b */
    public final void mo112083b(String str) {
        C39162r.m79460a("record_dub_start", mo112075E().mo129406a("enter_method", str).f188764a);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.g$m */
    static final class C70912m<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C70899g f158803a;

        static {
            Covode.recordClassIndex(83406);
        }

        C70912m(C70899g gVar) {
            this.f158803a = gVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            Long l = (Long) obj;
            if (l != null) {
                l.longValue();
                C70889b a = C70899g.m125193a(this.f158803a);
                int longValue = (int) l.longValue();
                if (longValue < a.f158715h - 1) {
                    Iterator<T> it = a.f158709b.getMStack().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        T next = it.next();
                        if (longValue >= next.getX() && longValue < next.getY()) {
                            longValue = next.getX();
                            break;
                        }
                    }
                }
                if (-1 != longValue) {
                    if (!this.f158803a.f158775f) {
                        AudioRecordStartButton b = C70899g.m125197b(this.f158803a);
                        b.setAlpha(0.5f);
                        b.setEnabled(false);
                        C70899g.m125198c(this.f158803a).setText(R.string.awx);
                        return;
                    }
                    return;
                }
                AudioRecordStartButton b2 = C70899g.m125197b(this.f158803a);
                b2.setAlpha(1.0f);
                b2.setEnabled(true);
                C70899g.m125198c(this.f158803a).setText(R.string.axt);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.g$n */
    static final class C70913n<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C70899g f158804a;

        static {
            Covode.recordClassIndex(83407);
        }

        C70913n(C70899g gVar) {
            this.f158804a = gVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                bool.booleanValue();
                if (bool.booleanValue()) {
                    this.f158804a.mo112087d().voiceVolume = this.f158804a.f158740C.getVoiceVolume();
                } else {
                    this.f158804a.mo112087d().voiceVolume = 0.0f;
                }
                this.f158804a.f158740C.setNeedOriginalSound(bool.booleanValue());
                if (this.f158804a.f158776g && !this.f158804a.f158775f) {
                    C70899g gVar = this.f158804a;
                    gVar.mo112077a(-1.0f, gVar.mo112087d().voiceVolume);
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo112084b(boolean z) {
        this.f158787y = z;
        m125189F().mo77627d(z);
    }

    public C70899g(C21582f fVar) {
        C89219l.m154721d(fVar, "");
        this.f158770ah = fVar;
        AbstractC89277c a = C89204ab.m154669a(EditAudioRecordViewModel.class);
        this.f158747K = C89250i.m154773a((AbstractC89171a) new C70902c(this, a, a));
        ValueAnimator ofInt = ValueAnimator.ofInt(1, 10);
        C89219l.m154716b(ofInt, "");
        this.f158774e = ofInt;
        this.f158777h = true;
        this.f158752P = C21572a.m40504a(getDiContainer(), VideoPublishEditModel.class);
        this.f158753Q = C89250i.m154774a(EnumC89331m.NONE, new C70900a(this));
        this.f158779j = C21572a.m40505b(getDiContainer(), AbstractC83094e.class);
        this.f158754R = C89250i.m154774a(EnumC89331m.NONE, new C70901b(this));
        this.f158740C = new AudioRecorderParam();
        this.f158741D = true;
        this.f158742E = new WeakHandler(this);
        this.f158743F = 1;
        this.f158744G = 2;
        this.f158745H = 4;
        this.f158746I = new C70919t(this);
        this.f158768af = new C70915p(this);
        this.f158769ag = new C70906g(this);
    }

    /* renamed from: a */
    private static boolean m125196a(File file) {
        MethodCollector.m26663i(11772);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(11772);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(11772);
        return delete;
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        C89219l.m154721d(message, "");
        int i = message.what;
        if (i == this.f158743F) {
            this.f158741D = false;
            View view = this.f158757U;
            if (view == null) {
                C89219l.m154710a("mLoadingStatusViewLayout");
            }
            view.setVisibility(0);
            DmtStatusView dmtStatusView = this.f158756T;
            if (dmtStatusView == null) {
                C89219l.m154710a("mLoadingStatusView");
            }
            DmtStatusView.C17269a a = DmtStatusView.C17269a.m31905a(this.f52549m);
            a.f41304g = 1;
            dmtStatusView.setBuilder(a);
            DmtStatusView dmtStatusView2 = this.f158756T;
            if (dmtStatusView2 == null) {
                C89219l.m154710a("mLoadingStatusView");
            }
            dmtStatusView2.mo27384f();
        } else if (i == this.f158744G) {
            this.f158741D = true;
            DmtStatusView dmtStatusView3 = this.f158756T;
            if (dmtStatusView3 == null) {
                C89219l.m154710a("mLoadingStatusView");
            }
            dmtStatusView3.mo27379a(true);
            View view2 = this.f158757U;
            if (view2 == null) {
                C89219l.m154710a("mLoadingStatusViewLayout");
            }
            view2.setVisibility(8);
        } else if (i == this.f158745H) {
            this.f158741D = true;
            DmtStatusView dmtStatusView4 = this.f158756T;
            if (dmtStatusView4 == null) {
                C89219l.m154710a("mLoadingStatusView");
            }
            dmtStatusView4.mo27379a(true);
            View view3 = this.f158757U;
            if (view3 == null) {
                C89219l.m154710a("mLoadingStatusViewLayout");
            }
            view3.setVisibility(8);
            ((EditAudioRecordViewModel) this.f158747K.getValue()).f158698b.setValue(false);
            AbstractC31071f fVar = this.f158771b;
            if (fVar != null) {
                fVar.mo56311a(true);
            }
            C1213t<C88296t> tVar = this.f158780k;
            if (tVar == null) {
                C89219l.m154710a("mPreviewControlOpLiveData");
            }
            tVar.setValue(C88296t.m153435a());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.g$o */
    static final class C70914o implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C70899g f158805a;

        static {
            Covode.recordClassIndex(83408);
        }

        C70914o(C70899g gVar) {
            this.f158805a = gVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            int i;
            int i2;
            AbstractC31071f fVar = this.f158805a.f158771b;
            if (fVar != null) {
                this.f158805a.mo112076a().setValue(Long.valueOf((long) fVar.mo56370k()));
                C70899g.m125193a(this.f158805a).mo112063a(((float) fVar.mo56370k()) / ((float) fVar.mo56368j()));
                if (this.f158805a.f158775f) {
                    C70889b a = C70899g.m125193a(this.f158805a);
                    int k = fVar.mo56370k();
                    Point point = this.f158805a.f158778i;
                    if (point != null) {
                        i = point.getX();
                    } else {
                        i = k;
                    }
                    Iterator<T> it = a.f158709b.getMStack().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            i2 = -1;
                            break;
                        }
                        T next = it.next();
                        if (next.getX() >= i && k >= next.getX() && k <= next.getY() && (!C89219l.m154714a((Object) next, (Object) point))) {
                            i2 = next.getX();
                            break;
                        }
                    }
                    C70899g.m125193a(this.f158805a).f158709b.invalidate();
                    if (i2 == -1) {
                        Point point2 = this.f158805a.f158778i;
                        if (point2 != null) {
                            point2.setY(fVar.mo56370k());
                        }
                        C70899g.m125193a(this.f158805a).f158709b.invalidate();
                    } else {
                        Point point3 = this.f158805a.f158778i;
                        if (point3 != null) {
                            point3.setY(i2);
                        }
                        C70899g.m125193a(this.f158805a).f158709b.invalidate();
                        this.f158805a.mo112080a(false, i2, new PrivacyCert(new C13349j("1066"), "Dubbing when editing a video.", new C13350k[]{C13401b.m24108b()}));
                    }
                } else {
                    this.f158805a.f158778i = null;
                }
                if (fVar.mo56370k() < this.f158805a.f158772c) {
                    return;
                }
                if (this.f158805a.f158775f) {
                    C70899g.m125194a(this.f158805a, true, 0, new PrivacyCert(new C13349j("1067"), "Dubbing when editing a video.", new C13350k[]{C13401b.m24108b()}), 2);
                    return;
                }
                this.f158805a.f158774e.cancel();
                this.f158805a.f158746I.mo112095a(0.0f, true);
                C70899g.m125193a(this.f158805a).mo112063a(0.0f);
                this.f158805a.f158740C.setMStack(C70899g.m125193a(this.f158805a).getStack());
                if (this.f158805a.f158740C.getMStack().isEmpty()) {
                    C70899g.m125199d(this.f158805a).setVisibility(8);
                } else {
                    C70899g.m125199d(this.f158805a).setVisibility(0);
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo112086c(boolean z) {
        AbstractC22186b bVar;
        if (z && (bVar = (AbstractC22186b) this.f52551o) != null) {
            bVar.mo36417e(this);
        }
        ViewGroup viewGroup = this.f158761Y;
        if (viewGroup == null) {
            C89219l.m154710a("contentLayout");
        }
        C46371s.m89467a(viewGroup, z, (int) C13628n.m24520b(this.f52549m, 282.0f), mo36474b(R.id.b9f), new C70925z(this, z));
        if (z) {
            m125192I();
            if (mo112087d().veAudioRecorderParam != null) {
                mo112087d().veAudioRecorderParam.setNeedDel(true);
                AbstractC72510a C = mo112073C();
                AudioRecorderParam audioRecorderParam = mo112087d().veAudioRecorderParam;
                C89219l.m154716b(audioRecorderParam, "");
                C70926h.m125230a(C, audioRecorderParam);
            } else {
                this.f158740C = new AudioRecorderParam();
            }
            this.f158740C.copyFrom(mo112087d().veAudioRecorderParam);
            if (this.f158740C.getNeedOriginalSound()) {
                this.f158740C.setVoiceVolume(mo112087d().voiceVolume);
            }
            this.f158778i = null;
            CheckBox checkBox = this.f158763aa;
            if (checkBox == null) {
                C89219l.m154710a("checkBox");
            }
            checkBox.setChecked(this.f158740C.getNeedOriginalSound());
            mo112082b().setValue(Boolean.valueOf(this.f158740C.getNeedOriginalSound()));
            View view = this.f158783u;
            if (view == null) {
                C89219l.m154710a("mPlayView");
            }
            view.setVisibility(0);
            this.f158746I.mo112095a(0.0f, true);
            C70889b bVar2 = this.f158784v;
            if (bVar2 == null) {
                C89219l.m154710a("audioRecordSeekBar");
            }
            bVar2.setStack(this.f158740C.getMStack());
            C70889b bVar3 = this.f158784v;
            if (bVar3 == null) {
                C89219l.m154710a("audioRecordSeekBar");
            }
            bVar3.mo112063a(0.0f);
            mo112076a().setValue(0L);
            if (this.f158740C.getMStack().isEmpty()) {
                View view2 = this.f158788z;
                if (view2 == null) {
                    C89219l.m154710a("backView");
                }
                view2.setVisibility(8);
            } else {
                View view3 = this.f158788z;
                if (view3 == null) {
                    C89219l.m154710a("backView");
                }
                view3.setVisibility(0);
            }
            AbstractC84919c cVar = this.f158751O;
            if (cVar != null) {
                cVar.mo87533b(this.f158768af);
            }
            m125190G();
            if (mo112087d().veAudioEffectParam != null) {
                new C79459a(this.f52549m).mo123050a(R.string.ay6).mo123053a();
            }
            mo112073C().mo114803a(C88297u.C88298a.m153448a(C77795c.m135910a(true, false, false, false), ((int) C13628n.m24520b(this.f52549m, 52.0f)) + C70636dh.m124833c(this.f52549m), (int) C13628n.m24520b(this.f52549m, 282.0f), m125191H(), C33398a.f79357a.mo59453d(), false, false, 960));
            return;
        }
        View view4 = this.f158781l;
        if (view4 == null) {
            C89219l.m154710a("mSaveView");
        }
        view4.setVisibility(8);
        View view5 = this.f158782t;
        if (view5 == null) {
            C89219l.m154710a("mCancelView");
        }
        view5.setVisibility(8);
        AbstractC84919c cVar2 = this.f158751O;
        if (cVar2 != null) {
            cVar2.mo87535c(this.f158768af);
        }
        this.f158774e.cancel();
        AbstractC72510a C2 = mo112073C();
        View view6 = this.f158781l;
        if (view6 == null) {
            C89219l.m154710a("mSaveView");
        }
        C2.mo114803a(C88297u.C88298a.m153445a(C0643b.m2378c(view6.getContext(), R.color.a2), ((int) C13628n.m24520b(this.f52549m, 52.0f)) + C70636dh.m124833c(this.f52549m), (int) C13628n.m24520b(this.f52549m, 282.0f), m125191H(), C33398a.f79357a.mo59453d()));
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final void mo22704a(Bundle bundle) {
        MethodCollector.m26663i(11625);
        super.mo22704a(bundle);
        this.f158780k = mo112073C().mo114833v();
        AbstractC31071f value = mo112073C().mo114778C().getValue();
        this.f158771b = value;
        if (value != null) {
            this.f158772c = value.mo56368j();
        }
        View b = mo36474b(R.id.f2x);
        if (b == null) {
            C89219l.m154715b();
        }
        this.f158781l = b;
        View b2 = mo36474b(R.id.et8);
        if (b2 == null) {
            C89219l.m154715b();
        }
        this.f158782t = b2;
        View b3 = mo36474b(R.id.byg);
        if (b3 == null) {
            C89219l.m154715b();
        }
        this.f158783u = b3;
        View b4 = mo36474b(R.id.dtv);
        if (b4 == null) {
            C89219l.m154715b();
        }
        this.f158758V = (FrameLayout) b4;
        View b5 = mo36474b(R.id.fea);
        if (b5 == null) {
            C89219l.m154715b();
        }
        this.f158760X = b5;
        View b6 = mo36474b(R.id.ade);
        if (b6 == null) {
            C89219l.m154715b();
        }
        this.f158761Y = (ViewGroup) b6;
        View b7 = mo36474b(R.id.e6m);
        if (b7 == null) {
            C89219l.m154715b();
        }
        this.f158785w = (AudioRecordStartButton) b7;
        View b8 = mo36474b(R.id.pv);
        if (b8 == null) {
            C89219l.m154715b();
        }
        this.f158788z = b8;
        View b9 = mo36474b(R.id.ezl);
        if (b9 == null) {
            C89219l.m154715b();
        }
        AVDmtTextView aVDmtTextView = (AVDmtTextView) b9;
        this.f158738A = aVDmtTextView;
        if (aVDmtTextView == null) {
            C89219l.m154710a("tvMsg");
        }
        aVDmtTextView.mo121359b();
        View b10 = mo36474b(R.id.a26);
        if (b10 == null) {
            C89219l.m154715b();
        }
        CheckBox checkBox = (CheckBox) b10;
        this.f158763aa = checkBox;
        if (checkBox == null) {
            C89219l.m154710a("checkBox");
        }
        checkBox.setText("  " + mo36476c_(R.string.awz));
        Typeface a = C17301b.m32033a().mo27611a(C17303d.f41567a);
        if (a != null) {
            CheckBox checkBox2 = this.f158763aa;
            if (checkBox2 == null) {
                C89219l.m154710a("checkBox");
            }
            checkBox2.setTypeface(a);
        }
        View b11 = mo36474b(R.id.cfy);
        if (b11 == null) {
            C89219l.m154715b();
        }
        this.f158756T = (DmtStatusView) b11;
        View b12 = mo36474b(R.id.cg0);
        if (b12 == null) {
            C89219l.m154715b();
        }
        this.f158757U = b12;
        if (b12 == null) {
            C89219l.m154710a("mLoadingStatusViewLayout");
        }
        b12.setOnClickListener(View$OnClickListenerC70917r.f158808a);
        View b13 = mo36474b(R.id.che);
        if (b13 == null) {
            C89219l.m154715b();
        }
        LottieAnimationView lottieAnimationView = (LottieAnimationView) b13;
        this.f158762Z = lottieAnimationView;
        if (lottieAnimationView == null) {
            C89219l.m154710a("lottieAnimationView");
        }
        lottieAnimationView.setAnimation("tool_recording_dark_lottie.json");
        LottieAnimationView lottieAnimationView2 = this.f158762Z;
        if (lottieAnimationView2 == null) {
            C89219l.m154710a("lottieAnimationView");
        }
        lottieAnimationView2.setRepeatCount(-1);
        C70982a.m125336a(this);
        View view = this.f158788z;
        if (view == null) {
            C89219l.m154710a("backView");
        }
        view.setBackgroundResource(R.drawable.d0);
        Activity activity = this.f52549m;
        if (activity != null) {
            C70889b bVar = new C70889b((ActivityC0945e) activity, this);
            this.f158784v = bVar;
            int b14 = (int) C13628n.m24520b(this.f52549m, 16.0f);
            int b15 = (int) C13628n.m24520b(this.f52549m, 6.0f);
            int i = this.f158772c;
            C70919t tVar = this.f158746I;
            bVar.f158710c = b14;
            bVar.f158711d = b15;
            bVar.f158712e = ((int) C13628n.m24520b(this.f52549m, 4.0f)) * 5;
            bVar.f158715h = i;
            bVar.f158716i = tVar;
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.bottomMargin = b15;
            layoutParams.topMargin = b15;
            layoutParams.rightMargin = b14;
            layoutParams.leftMargin = b14;
            C70887a aVar = bVar.f158709b;
            aVar.f158703a = Color.parseColor("#ccfe2c55");
            aVar.f158704b.setColor(aVar.f158703a);
            aVar.f158704b.setStyle(Paint.Style.FILL);
            aVar.f158705c = i;
            aVar.f158706d = C13628n.m24520b(aVar.getContext(), 0.0f);
            bVar.addView(bVar.f158709b, layoutParams);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(bVar.f158712e, -1);
            if (C78099c.m136517a(bVar.getContext())) {
                layoutParams2.addRule(21);
                layoutParams2.setMarginEnd(b14 - (bVar.f158712e / 2));
            } else {
                layoutParams2.leftMargin = b14 - (bVar.f158712e / 2);
            }
            bVar.f158708a.setImageDrawable(C84916a.m145947a(0, -1, 1, (int) C13628n.m24520b(bVar.getContext(), 2.0f)));
            bVar.f158708a.setPadding((int) (((float) bVar.f158712e) * 0.4f), 0, (int) (((float) bVar.f158712e) * 0.4f), 0);
            bVar.addView(bVar.f158708a, layoutParams2);
            bVar.f158708a.setOnTouchListener(new C70889b.View$OnTouchListenerC70890a(bVar));
            FrameLayout frameLayout = this.f158758V;
            if (frameLayout == null) {
                C89219l.m154710a("seekLayout");
            }
            C70889b bVar2 = this.f158784v;
            if (bVar2 == null) {
                C89219l.m154710a("audioRecordSeekBar");
            }
            frameLayout.addView(bVar2, new FrameLayout.LayoutParams(-1, -1));
            View b16 = mo36474b(R.id.a5c);
            if (b16 == null) {
                C89219l.m154715b();
            }
            this.f158759W = (ChooseVideoCoverView) b16;
            if (this.f52549m instanceof AbstractC84919c) {
                Activity activity2 = this.f52549m;
                if (activity2 != null) {
                    this.f158751O = (AbstractC84919c) activity2;
                } else {
                    NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.tools.view.activity.AVListenableActivityRegistry");
                    MethodCollector.m26664o(11625);
                    throw nullPointerException;
                }
            }
            this.f158767ae = mo112073C().mo114819h();
            this.f158766ad = mo112073C().mo114820i();
            this.f158774e.setDuration(1000L);
            this.f158774e.setRepeatCount(-1);
            this.f158774e.addUpdateListener(new C70914o(this));
            View view2 = this.f158781l;
            if (view2 == null) {
                C89219l.m154710a("mSaveView");
            }
            view2.setOnClickListener(this.f158769ag);
            View view3 = this.f158782t;
            if (view3 == null) {
                C89219l.m154710a("mCancelView");
            }
            view3.setOnClickListener(this.f158769ag);
            View view4 = this.f158783u;
            if (view4 == null) {
                C89219l.m154710a("mPlayView");
            }
            view4.setOnClickListener(this.f158769ag);
            View view5 = this.f158760X;
            if (view5 == null) {
                C89219l.m154710a("videoLayout");
            }
            view5.setOnClickListener(this.f158769ag);
            View view6 = this.f158788z;
            if (view6 == null) {
                C89219l.m154710a("backView");
            }
            view6.setOnClickListener(this.f158769ag);
            AudioRecordStartButton audioRecordStartButton = this.f158785w;
            if (audioRecordStartButton == null) {
                C89219l.m154710a("audioRecordStartButton");
            }
            audioRecordStartButton.setOnClickListener(new C70907h(this));
            AudioRecordStartButton audioRecordStartButton2 = this.f158785w;
            if (audioRecordStartButton2 == null) {
                C89219l.m154710a("audioRecordStartButton");
            }
            audioRecordStartButton2.setOnLongClickListener(new View$OnLongClickListenerC70908i(this));
            AudioRecordStartButton audioRecordStartButton3 = this.f158785w;
            if (audioRecordStartButton3 == null) {
                C89219l.m154710a("audioRecordStartButton");
            }
            audioRecordStartButton3.setOnTouchListener(new View$OnTouchListenerC70909j(this));
            mo112076a().observe(this, new C70912m(this));
            mo112082b().observe(this, new C70913n(this));
            CheckBox checkBox3 = this.f158763aa;
            if (checkBox3 == null) {
                C89219l.m154710a("checkBox");
            }
            checkBox3.setOnCheckedChangeListener(new C70918s(this));
            CheckBox checkBox4 = this.f158763aa;
            if (checkBox4 == null) {
                C89219l.m154710a("checkBox");
            }
            checkBox4.setVisibility(8);
            VideoPublishEditModel d = mo112087d();
            if (d.realHasOriginalSound() || d.isFastImport) {
                CheckBox checkBox5 = this.f158763aa;
                if (checkBox5 == null) {
                    C89219l.m154710a("checkBox");
                }
                checkBox5.setVisibility(0);
            }
            if (d.editMusicSyncMode || d.isDuet() || C70976bp.m125305b(d) || d.isStickPointMode) {
                CheckBox checkBox6 = this.f158763aa;
                if (checkBox6 == null) {
                    C89219l.m154710a("checkBox");
                }
                checkBox6.setVisibility(8);
            }
            AbstractC31071f fVar = this.f158771b;
            if (fVar == null) {
                MethodCollector.m26664o(11625);
                return;
            }
            ChooseVideoCoverView chooseVideoCoverView = this.f158759W;
            if (chooseVideoCoverView == null) {
                C89219l.m154710a("mChooseVideoCoverView");
            }
            chooseVideoCoverView.mo116701a();
            ChooseVideoCoverView chooseVideoCoverView2 = this.f158759W;
            if (chooseVideoCoverView2 == null) {
                C89219l.m154710a("mChooseVideoCoverView");
            }
            chooseVideoCoverView2.setLayoutManager(new WrapLinearLayoutManager((byte) 0));
            ChooseVideoCoverView chooseVideoCoverView3 = this.f158759W;
            if (chooseVideoCoverView3 == null) {
                C89219l.m154710a("mChooseVideoCoverView");
            }
            int frameHeight = chooseVideoCoverView3.getFrameHeight();
            ChooseVideoCoverView chooseVideoCoverView4 = this.f158759W;
            if (chooseVideoCoverView4 == null) {
                C89219l.m154710a("mChooseVideoCoverView");
            }
            int frameWidth = chooseVideoCoverView4.getFrameWidth();
            int ceil = (int) Math.ceil((double) (((float) (C13628n.m24504a(this.f52549m) - (C89241a.m154730a(C13628n.m24520b(this.f52549m, 16.0f)) * 2))) / (((float) frameWidth) * 1.0f)));
            ChooseVideoCoverView chooseVideoCoverView5 = this.f158759W;
            if (chooseVideoCoverView5 == null) {
                C89219l.m154710a("mChooseVideoCoverView");
            }
            chooseVideoCoverView5.setCoverSize(ceil);
            Activity activity3 = this.f52549m;
            if (activity3 != null) {
                ActivityC0945e eVar = (ActivityC0945e) activity3;
                ChooseVideoCoverView chooseVideoCoverView6 = this.f158759W;
                if (chooseVideoCoverView6 == null) {
                    C89219l.m154710a("mChooseVideoCoverView");
                }
                this.f158764ab = new VEVideoCoverGeneratorImpl(fVar, eVar, chooseVideoCoverView6.getCoverSize(), null, "ai_music");
                VEVideoCoverGeneratorImpl vEVideoCoverGeneratorImpl = this.f158764ab;
                if (vEVideoCoverGeneratorImpl == null) {
                    C89219l.m154710a("mEffectVideoCoverGenerator");
                }
                this.f158765ac = new C74297p(vEVideoCoverGeneratorImpl, frameWidth, frameHeight, ceil);
                if (mo112087d().isMvThemeVideoType()) {
                    C71991a aVar2 = new C71991a(frameWidth, frameHeight);
                    ChooseVideoCoverView chooseVideoCoverView7 = this.f158759W;
                    if (chooseVideoCoverView7 == null) {
                        C89219l.m154710a("mChooseVideoCoverView");
                    }
                    chooseVideoCoverView7.setAdapter(aVar2);
                    C71993c cVar = new C71993c();
                    cVar.f161328b = C70910k.f158801a;
                    C1213t<Boolean> tVar2 = this.f158767ae;
                    if (tVar2 == null) {
                        C89219l.m154710a("firstFrameVisible");
                    }
                    cVar.f161339m = tVar2;
                    C1213t<Bitmap> tVar3 = this.f158766ad;
                    if (tVar3 == null) {
                        C89219l.m154710a("firstFrameBitmap");
                    }
                    cVar.f161338l = tVar3;
                    cVar.mo114167a(frameWidth, frameHeight).mo114168a(this.f52549m, this.f158771b, ceil, new C70911l(aVar2));
                    ChooseVideoCoverView chooseVideoCoverView8 = this.f158759W;
                    if (chooseVideoCoverView8 == null) {
                        C89219l.m154710a("mChooseVideoCoverView");
                    }
                    chooseVideoCoverView8.setAdapter(aVar2);
                    MethodCollector.m26664o(11625);
                    return;
                }
                C74297p pVar = this.f158765ac;
                if (pVar == null) {
                    C89219l.m154710a("mSharedVideoCoverDataSource");
                }
                ChooseVideoCoverView.C74231a aVar3 = new ChooseVideoCoverView.C74231a(pVar, frameWidth, frameHeight);
                ChooseVideoCoverView chooseVideoCoverView9 = this.f158759W;
                if (chooseVideoCoverView9 == null) {
                    C89219l.m154710a("mChooseVideoCoverView");
                }
                chooseVideoCoverView9.setAdapter(aVar3);
                MethodCollector.m26664o(11625);
                return;
            }
            NullPointerException nullPointerException2 = new NullPointerException("null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            MethodCollector.m26664o(11625);
            throw nullPointerException2;
        }
        NullPointerException nullPointerException3 = new NullPointerException("null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        MethodCollector.m26664o(11625);
        throw nullPointerException3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo112078a(String str) {
        C70928j jVar = this.f158739B;
        if (jVar != null) {
            jVar.f158818a.destory();
        }
        C1731i.m5640b(new CallableC70904e(new RunnableC70905f(this, str)), C40780g.m82241a());
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.g$x */
    static final class DialogInterface$OnClickListenerC70923x implements DialogInterface.OnClickListener {

        /* renamed from: a */
        public static final DialogInterface$OnClickListenerC70923x f158814a = new DialogInterface$OnClickListenerC70923x();

        static {
            Covode.recordClassIndex(83417);
        }

        DialogInterface$OnClickListenerC70923x() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.g$s */
    static final class C70918s implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ C70899g f158809a;

        static {
            Covode.recordClassIndex(83412);
        }

        C70918s(C70899g gVar) {
            this.f158809a = gVar;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            this.f158809a.mo112082b().setValue(Boolean.valueOf(z));
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
        View a = C1764a.m5927a(layoutInflater, R.layout.ary, viewGroup, false);
        C89219l.m154716b(a, "");
        this.f158755S = a;
        if (a == null) {
            C89219l.m154710a("parentLayout");
        }
        return a;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.g$y */
    static final class DialogInterface$OnClickListenerC70924y implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C70899g f158815a;

        static {
            Covode.recordClassIndex(83418);
        }

        DialogInterface$OnClickListenerC70924y(C70899g gVar) {
            this.f158815a = gVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            C70899g gVar = this.f158815a;
            AudioRecorderParam audioRecorderParam = gVar.mo112087d().veAudioRecorderParam;
            if (gVar.f158740C.getAudioRecordIndex() >= 0 && gVar.f158740C.hasRecord()) {
                gVar.f158740C.setNeedDel(true);
                C70926h.m125230a(gVar.mo112073C(), gVar.f158740C);
            }
            if (audioRecorderParam != null) {
                if (audioRecorderParam.getAudioRecordIndex() < 0 && audioRecorderParam.hasRecord()) {
                    C70926h.m125230a(gVar.mo112073C(), audioRecorderParam);
                }
                if (audioRecorderParam.getNeedOriginalSound()) {
                    gVar.mo112087d().voiceVolume = audioRecorderParam.getVoiceVolume();
                } else {
                    gVar.mo112087d().voiceVolume = 0.0f;
                }
            } else {
                gVar.mo112087d().voiceVolume = gVar.f158740C.getVoiceVolume();
            }
            gVar.mo112077a(gVar.mo112087d().musicVolume, gVar.mo112087d().voiceVolume);
            gVar.mo112078a(gVar.f158740C.getAudioUrl());
        }
    }

    /* renamed from: a */
    public static void m125195a(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            File file = new File(str);
            if (file.exists() && file.isDirectory()) {
                File[] listFiles = file.listFiles();
                for (File file2 : listFiles) {
                    C89219l.m154716b(file2, "");
                    String path = file2.getPath();
                    C89219l.m154716b(path, "");
                    if (!C89361p.m154876c(path, "df", false) && !path.equals(str2)) {
                        m125196a(file2);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo112077a(float f, float f2) {
        if (mo112087d().isStitchMode()) {
            if (mo112087d().isMuted) {
                C82185a.m142209a(0.0f, f, mo112087d(), mo112073C());
            } else {
                C82185a.m142209a(f2, f, mo112087d(), mo112073C());
            }
        } else if ((mo112087d().isFastImport || mo112087d().hasOriginalSound()) && !mo112087d().isMuted) {
            if (f2 != -1.0f) {
                AbstractC72510a C = mo112073C();
                VEVolumeChangeOp ofVoice = VEVolumeChangeOp.ofVoice(f2);
                C89219l.m154716b(ofVoice, "");
                C.mo114800a(ofVoice);
            }
            if (mo112087d().mMusicPath != null && f != -1.0f) {
                AbstractC72510a C2 = mo112073C();
                VEVolumeChangeOp ofMusic = VEVolumeChangeOp.ofMusic(f);
                C89219l.m154716b(ofMusic, "");
                C2.mo114800a(ofMusic);
            }
        } else if (f != -1.0f) {
            AbstractC72510a C3 = mo112073C();
            VEVolumeChangeOp ofMusic2 = VEVolumeChangeOp.ofMusic(f);
            C89219l.m154716b(ofMusic2, "");
            C3.mo114800a(ofMusic2);
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af> AbstractC88412b subscribe(JediViewModel<S> jediViewModel, C20370ah<S> ahVar, AbstractC89183m<? super AbstractC20477i, ? super S, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        return AbstractC20382b.C20383a.m38583a(this, jediViewModel, ahVar, mVar);
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

    /* renamed from: a */
    static /* synthetic */ void m125194a(C70899g gVar, boolean z, int i, PrivacyCert privacyCert, int i2) {
        if ((i2 & 1) != 0) {
            z = false;
        }
        if ((i2 & 2) != 0) {
            i = -1;
        }
        if ((i2 & 4) != 0) {
            privacyCert = null;
        }
        gVar.mo112080a(z, i, privacyCert);
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
