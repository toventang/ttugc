package com.p2082ss.android.ugc.gamora.editor.sticker.read;

import android.app.Activity;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.C0643b;
import androidx.core.p036g.AbstractC0688a;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.LiveData;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView;
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
import com.bytedance.jedi.arch.C20531t;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.bytedance.scene.AbstractC22219j;
import com.bytedance.scene.group.AbstractC22186b;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.input.TuxCheckBox;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.asve.editor.AbstractC31071f;
import com.p2082ss.android.ugc.aweme.adaptation.C33398a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.editSticker.interact.C45902g;
import com.p2082ss.android.ugc.aweme.editSticker.text.als.EditTextStickerViewModel;
import com.p2082ss.android.ugc.aweme.editSticker.text.bean.C46110t;
import com.p2082ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.p2082ss.android.ugc.aweme.editSticker.text.view.C46239q;
import com.p2082ss.android.ugc.aweme.effect.C46371s;
import com.p2082ss.android.ugc.aweme.effectplatform.AbstractC46415f;
import com.p2082ss.android.ugc.aweme.effectplatform.C46404c;
import com.p2082ss.android.ugc.aweme.infoSticker.AbstractC56659a;
import com.p2082ss.android.ugc.aweme.infoSticker.C56660b;
import com.p2082ss.android.ugc.aweme.internal.AVCommerceServiceImpl;
import com.p2082ss.android.ugc.aweme.internal.IInternalCommerceService;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.p2082ss.android.ugc.aweme.shortvideo.C70636dh;
import com.p2082ss.android.ugc.aweme.shortvideo.C71817eu;
import com.p2082ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.model.ShortVideoCommonParams;
import com.p2082ss.android.ugc.aweme.shortvideo.p3858s.C72829c;
import com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a;
import com.p2082ss.android.ugc.aweme.sticker.p3970p.C75466g;
import com.p2082ss.android.ugc.aweme.textsticker.TextStickerChallenges;
import com.p2082ss.android.ugc.aweme.themechange.base.C77795c;
import com.p2082ss.android.ugc.aweme.utils.C80418fa;
import com.p2082ss.android.ugc.aweme.view.ProgressDialogC81146b;
import com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81432d;
import com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.p2082ss.android.ugc.gamora.editor.progress.AbstractC82478a;
import com.p2082ss.android.ugc.gamora.editor.progressbar.AbstractC82503a;
import com.p2082ss.android.ugc.gamora.editor.sticker.read.ReadTextV2Api;
import com.p2082ss.android.ugc.gamora.editor.sticker.read.p4291a.AbstractC83015b;
import com.p2082ss.android.ugc.gamora.editor.sticker.read.p4291a.C83028d;
import com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84917a;
import com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84919c;
import com.p2082ss.android.ugc.trill.R;
import dmt.p4542av.video.C88296t;
import dmt.p4542av.video.C88297u;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89378p;
import p4600h.C89391z;
import p4600h.EnumC89331m;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4612a.AbstractC89188r;
import p4600h.p4611f.p4612a.AbstractC89189s;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;
import p4600h.p4620k.AbstractC89290k;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.gamora.editor.sticker.read.d */
public final class C83031d extends AbstractC22219j implements AbstractC20382b, AbstractC21566a {

    /* renamed from: D */
    public static final C83035d f185507D = new C83035d((byte) 0);

    /* renamed from: A */
    public boolean f185508A;

    /* renamed from: B */
    public ProgressDialogC81146b f185509B;

    /* renamed from: C */
    public final AbstractC83015b f185510C;

    /* renamed from: E */
    private HashMap<C83036e, C89378p<File, Integer>> f185511E = new HashMap<>(20);

    /* renamed from: F */
    private InputMethodManager f185512F;

    /* renamed from: G */
    private AbstractC84919c f185513G;

    /* renamed from: H */
    private final AbstractC89244h f185514H = C89250i.m154774a(EnumC89331m.NONE, new C83032a(this));

    /* renamed from: I */
    private final AbstractC89244h f185515I = C89250i.m154774a(EnumC89331m.NONE, new C83033b(this));

    /* renamed from: J */
    private final AbstractC89244h f185516J = C89250i.m154774a(EnumC89331m.NONE, new C83034c(this));

    /* renamed from: K */
    private final AbstractC89244h f185517K = C89250i.m154773a((AbstractC89171a) new C83053u(this));

    /* renamed from: L */
    private final AbstractC89244h f185518L = C89250i.m154773a((AbstractC89171a) new C83044l(this));

    /* renamed from: M */
    private final AbstractC89244h f185519M = C89250i.m154773a((AbstractC89171a) new C83047o(this));

    /* renamed from: N */
    private ViewGroup f185520N;

    /* renamed from: O */
    private RelativeLayout f185521O;

    /* renamed from: P */
    private LinearLayout f185522P;

    /* renamed from: Q */
    private TuxButton f185523Q;

    /* renamed from: R */
    private TuxTextView f185524R;

    /* renamed from: S */
    private final AbstractC89244h f185525S = C89250i.m154773a((AbstractC89171a) new C83045m(this));

    /* renamed from: T */
    private String f185526T = "";

    /* renamed from: U */
    private final List<String> f185527U = new ArrayList();

    /* renamed from: V */
    private TextStickerData f185528V;

    /* renamed from: W */
    private final C83046n f185529W = new C83046n(this);

    /* renamed from: X */
    private final C21582f f185530X;

    /* renamed from: a */
    public DmtStatusView f185531a;

    /* renamed from: b */
    public ArrayList<C83029b> f185532b = new ArrayList<>();

    /* renamed from: c */
    public ArrayList<C83029b> f185533c = new ArrayList<>();

    /* renamed from: d */
    public final List<C83029b> f185534d = new ArrayList();

    /* renamed from: e */
    public boolean f185535e;

    /* renamed from: f */
    public TextView f185536f;

    /* renamed from: g */
    public TuxCheckBox f185537g;

    /* renamed from: h */
    public View f185538h;

    /* renamed from: i */
    public boolean f185539i;

    /* renamed from: j */
    public SafeHandler f185540j;

    /* renamed from: k */
    public boolean f185541k;

    /* renamed from: l */
    public C46239q f185542l;

    /* renamed from: t */
    public int f185543t = -1;

    /* renamed from: u */
    public int f185544u;

    /* renamed from: v */
    public boolean f185545v;

    /* renamed from: w */
    public C83061f f185546w;

    /* renamed from: x */
    public ArrayList<C83061f> f185547x = new ArrayList<>();

    /* renamed from: y */
    public String f185548y = "";

    /* renamed from: z */
    public String f185549z = "";

    static {
        Covode.recordClassIndex(96904);
    }

    /* renamed from: F */
    private final AbstractC82478a m143352F() {
        return (AbstractC82478a) this.f185515I.getValue();
    }

    /* renamed from: G */
    private final AbstractC82503a m143353G() {
        return (AbstractC82503a) this.f185516J.getValue();
    }

    /* renamed from: H */
    private final AbstractC84398d m143354H() {
        return (AbstractC84398d) this.f185525S.getValue();
    }

    /* renamed from: C */
    public final ReadTextViewModel mo128117C() {
        return (ReadTextViewModel) this.f185519M.getValue();
    }

    /* renamed from: a */
    public final AbstractC72510a mo128120a() {
        return (AbstractC72510a) this.f185514H.getValue();
    }

    /* renamed from: b */
    public final VideoPublishEditModel mo128127b() {
        return (VideoPublishEditModel) this.f185517K.getValue();
    }

    /* renamed from: d */
    public final EditTextStickerViewModel mo128131d() {
        return (EditTextStickerViewModel) this.f185518L.getValue();
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.read.d$d */
    public static final class C83035d {
        static {
            Covode.recordClassIndex(96908);
        }

        private C83035d() {
        }

        public /* synthetic */ C83035d(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.read.d$g */
    public static final class C83038g implements ProgressDialogC81146b.AbstractC81149c {
        static {
            Covode.recordClassIndex(96911);
        }

        @Override // com.p2082ss.android.ugc.aweme.view.ProgressDialogC81146b.AbstractC81149c
        /* renamed from: a */
        public final void mo113366a() {
        }

        C83038g() {
        }
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f185530X;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.AbstractC20367ae
    public final /* bridge */ /* synthetic */ AbstractC20477i getReceiver() {
        return this;
    }

    /* renamed from: a */
    public final void mo128124a(String str) {
        TuxTextView tuxTextView = this.f185524R;
        if (tuxTextView == null) {
            C89219l.m154710a("checkboxText");
        }
        tuxTextView.setText(mo36486t().getResources().getString(R.string.h_u, str));
    }

    /* renamed from: a */
    public final void mo128126a(boolean z, boolean z2, C46239q qVar) {
        String str;
        DmtStatusView dmtStatusView;
        mo128120a().mo114805a((AbstractC72510a) (!z), false, r0);
        mo128131d().f107128a = z;
        String str2 = "";
        if (!z) {
            m143355I();
            AbstractC31071f value = mo128120a().mo114778C().getValue();
            if (value != null) {
                value.mo56311a(true);
            }
            mo128120a().mo114833v().setValue(C88296t.m153435a());
            int i = this.f185543t - 1;
            if (i < 0 || i > this.f185532b.size() - 1) {
                str = str2;
            } else {
                C83029b bVar = this.f185532b.get(i);
                C89219l.m154716b(bVar, str2);
                C83029b bVar2 = bVar;
                str2 = bVar2.f185506c.f185597c;
                str = bVar2.f185506c.f185596b;
            }
            C83066j.m143419b(new ShortVideoCommonParams(mo128127b().mShootWay, C71817eu.m126790a(mo128127b()), C71817eu.m126792c(mo128127b()), mo128127b().creationId), str2, str);
        } else if (qVar != null && qVar.getData() != null) {
            new C45902g().mo77281b(true);
            AbstractC82478a F = m143352F();
            if (F != null) {
                F.mo127562a(1001);
            }
            AbstractC82503a G = m143353G();
            if (G != null) {
                G.mo127587a(1, -1);
            }
            View view = this.f185538h;
            if (view == null) {
                C89219l.m154710a("playView");
            }
            view.setVisibility(8);
            this.f185542l = qVar;
            this.f185541k = z2;
            TextStickerData data = qVar.getData();
            if (data == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(data, str2);
            m143367b(data);
            if (this.f185545v && (dmtStatusView = this.f185531a) != null) {
                dmtStatusView.mo27379a(true);
            }
            m143358L();
            AbstractC22186b bVar3 = (AbstractC22186b) this.f52551o;
            if (bVar3 != null) {
                bVar3.mo36417e(this);
            }
        } else {
            return;
        }
        RelativeLayout relativeLayout = this.f185521O;
        if (relativeLayout == null) {
            C89219l.m154710a("contentLayout");
        }
        int b = (int) C13628n.m24520b(this.f52549m, 239.0f);
        ViewGroup viewGroup = this.f185520N;
        if (viewGroup == null) {
            C89219l.m154710a("parentLayout");
        }
        C46371s.m89467a(relativeLayout, z, b, viewGroup, new C83059z(this, z));
        if (z) {
            if (this.f185541k) {
                m143356J();
            } else {
                mo128120a().mo114803a(C88297u.C88298a.m153448a(C77795c.m135910a(true, false, false, false), ((int) C13628n.m24520b(this.f52549m, 52.0f)) + C70636dh.m124833c(this.f52549m), (int) C13628n.m24520b(this.f52549m, 239.0f), m143357K(), C33398a.f79357a.mo59453d(), false, false, 960));
            }
            AbstractC84919c cVar = this.f185513G;
            if (cVar != null) {
                cVar.mo87533b(this.f185529W);
                return;
            }
            return;
        }
        this.f185543t = -1;
        if (this.f185541k) {
            C46239q qVar2 = this.f185542l;
            if (qVar2 != null) {
                qVar2.mo78580n();
            }
        } else {
            AbstractC72510a a = mo128120a();
            RelativeLayout relativeLayout2 = this.f185521O;
            if (relativeLayout2 == null) {
                C89219l.m154710a("contentLayout");
            }
            a.mo114803a(C88297u.C88298a.m153445a(C0643b.m2378c(relativeLayout2.getContext(), R.color.a2), ((int) C13628n.m24520b(this.f52549m, 52.0f)) + C70636dh.m124833c(this.f52549m), (int) C13628n.m24520b(this.f52549m, 239.0f), m143357K(), C33398a.f79357a.mo59453d()));
        }
        AbstractC84919c cVar2 = this.f185513G;
        if (cVar2 != null) {
            cVar2.mo87535c(this.f185529W);
        }
    }

    /* renamed from: a */
    public final void mo128123a(TextStickerData textStickerData, File file, int i) {
        String speakerID = textStickerData.getSpeakerID();
        if (C89219l.m154714a((Object) textStickerData.getSpeakerID(), (Object) this.f185548y)) {
            speakerID = "";
        } else if (speakerID == null) {
            return;
        }
        this.f185511E.put(new C83036e(textStickerData.getAudioText(), speakerID), new C89378p<>(file, Integer.valueOf(i)));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r38v0, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r39v0, resolved type: com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public final void mo128125a(String str, String str2, TextStickerData textStickerData) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89233z.C89238e eVar = new C89233z.C89238e();
        eVar.element = str2;
        if (C89361p.m154870a((CharSequence) eVar.element)) {
            eVar.element = (T) C83067k.m143425c();
        }
        this.f185535e = false;
        if (!(C83065i.m143414a(str, C83065i.m143412a().f185475a))) {
            Activity activity = this.f52549m;
            if (activity != null) {
                C89219l.m154716b(activity, "");
                new C23144b(activity).mo37640e(R.string.ay1).mo37637b();
                return;
            }
            return;
        }
        this.f185508A = false;
        m143360N().show();
        mo128120a().mo114812c(true);
        AbstractC31071f value = mo128120a().mo114778C().getValue();
        if (value != null) {
            value.mo56390u();
        }
        C89233z.C89238e eVar2 = new C89233z.C89238e();
        eVar2.element = textStickerData;
        if (textStickerData == 0) {
            eVar2.element = (T) new TextStickerData(null, 0, 0, 0, null, null, 0, 0, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, false, false, 0, null, null, 0, null, null, 0, null, null, null, null, null, false, 536870911, null);
        }
        C1731i.m5640b(new CallableC83054v(str, eVar), C1731i.f5562a).mo5534a(new C83055w(this, eVar2, str, eVar, textStickerData), C1731i.f5562a, null);
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

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.read.d$a */
    public static final class C83032a extends AbstractC89220m implements AbstractC89171a<AbstractC72510a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f185550a;

        static {
            Covode.recordClassIndex(96905);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C83032a(AbstractC21566a aVar) {
            super(0);
            this.f185550a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.aweme.shortvideo.preview.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f185550a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.aweme.shortvideo.preview.a> r1 = com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a.class
                r0 = 0
                java.lang.Object r0 = r2.mo35249a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.sticker.read.C83031d.C83032a.invoke():com.bytedance.als.b");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.read.d$b */
    public static final class C83033b extends AbstractC89220m implements AbstractC89171a<AbstractC82478a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f185551a;

        static {
            Covode.recordClassIndex(96906);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C83033b(AbstractC21566a aVar) {
            super(0);
            this.f185551a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.gamora.editor.progress.a, com.bytedance.als.b] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.gamora.editor.progress.AbstractC82478a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f185551a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.gamora.editor.progress.a> r1 = com.p2082ss.android.ugc.gamora.editor.progress.AbstractC82478a.class
                r0 = 0
                java.lang.Object r0 = r2.mo35252b(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.sticker.read.C83031d.C83033b.invoke():com.bytedance.als.b");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.read.d$c */
    public static final class C83034c extends AbstractC89220m implements AbstractC89171a<AbstractC82503a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f185552a;

        static {
            Covode.recordClassIndex(96907);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C83034c(AbstractC21566a aVar) {
            super(0);
            this.f185552a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.gamora.editor.progressbar.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.gamora.editor.progressbar.AbstractC82503a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f185552a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.gamora.editor.progressbar.a> r1 = com.p2082ss.android.ugc.gamora.editor.progressbar.AbstractC82503a.class
                r0 = 0
                java.lang.Object r0 = r2.mo35252b(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.sticker.read.C83031d.C83034c.invoke():com.bytedance.als.b");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.read.d$h */
    public static final class CallableC83039h<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ String f185556a;

        /* renamed from: b */
        final /* synthetic */ String f185557b;

        static {
            Covode.recordClassIndex(96912);
        }

        CallableC83039h(String str, String str2) {
            this.f185556a = str;
            this.f185557b = str2;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            return ReadTextV2Api.C83005a.m143330a(this.f185556a, this.f185557b);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.read.d$v */
    public static final class CallableC83054v<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ String f185580a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89238e f185581b;

        static {
            Covode.recordClassIndex(96927);
        }

        CallableC83054v(String str, C89233z.C89238e eVar) {
            this.f185580a = str;
            this.f185581b = eVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            return ReadTextV2Api.C83005a.m143330a(this.f185580a, this.f185581b.element);
        }
    }

    /* renamed from: I */
    private final void m143355I() {
        int i = this.f185544u;
        if (i == Integer.MAX_VALUE) {
            this.f185544u = 0;
        } else {
            this.f185544u = i + 1;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.read.d$l */
    static final class C83044l extends AbstractC89220m implements AbstractC89171a<EditTextStickerViewModel> {

        /* renamed from: a */
        final /* synthetic */ C83031d f185570a;

        static {
            Covode.recordClassIndex(96917);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83044l(C83031d dVar) {
            super(0);
            this.f185570a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ EditTextStickerViewModel invoke() {
            Activity t = this.f185570a.mo36486t();
            Objects.requireNonNull(t, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            return C20531t.m38716a((ActivityC0945e) t).mo33800a(EditTextStickerViewModel.class);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.read.d$m */
    static final class C83045m extends AbstractC89220m implements AbstractC89171a<AbstractC46415f> {

        /* renamed from: a */
        final /* synthetic */ C83031d f185571a;

        static {
            Covode.recordClassIndex(96918);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83045m(C83031d dVar) {
            super(0);
            this.f185571a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC46415f invoke() {
            Context u = this.f185571a.mo36488u();
            C89219l.m154716b(u, "");
            return C46404c.m89554a(u, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.read.d$o */
    static final class C83047o extends AbstractC89220m implements AbstractC89171a<ReadTextViewModel> {

        /* renamed from: a */
        final /* synthetic */ C83031d f185573a;

        static {
            Covode.recordClassIndex(96920);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83047o(C83031d dVar) {
            super(0);
            this.f185573a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ReadTextViewModel invoke() {
            Activity t = this.f185573a.mo36486t();
            Objects.requireNonNull(t, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            return C20531t.m38716a((ActivityC0945e) t).mo33800a(ReadTextViewModel.class);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.read.d$u */
    static final class C83053u extends AbstractC89220m implements AbstractC89171a<VideoPublishEditModel> {

        /* renamed from: a */
        final /* synthetic */ C83031d f185579a;

        static {
            Covode.recordClassIndex(96926);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83053u(C83031d dVar) {
            super(0);
            this.f185579a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ VideoPublishEditModel invoke() {
            Object a = this.f185579a.getDiContainer().mo35249a((Type) VideoPublishEditModel.class, (String) null);
            C89219l.m154716b(a, "");
            return a;
        }
    }

    /* renamed from: J */
    private final void m143356J() {
        View currentFocus;
        InputMethodManager inputMethodManager;
        Activity activity = this.f52549m;
        if (activity != null && (currentFocus = activity.getCurrentFocus()) != null && (inputMethodManager = this.f185512F) != null) {
            C89219l.m154716b(currentFocus, "");
            inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 2);
        }
    }

    /* renamed from: K */
    private final int m143357K() {
        return ((C70636dh.m124836e(this.f52549m) - ((int) C13628n.m24520b(this.f52549m, 291.0f))) - C70636dh.m124833c(this.f52549m)) - C70636dh.m124835d(this.f52549m);
    }

    /* renamed from: L */
    private final void m143358L() {
        if (this.f185545v) {
            mo128118D();
            return;
        }
        this.f185545v = true;
        m143354H().mo78910a("speaking-voice", false, false, (IFetchEffectChannelListener) new C83043k(this));
    }

    /* renamed from: N */
    private final ProgressDialogC81146b m143360N() {
        ProgressDialogC81146b bVar = this.f185509B;
        if (bVar != null) {
            bVar.cancel();
        }
        Activity t = mo36486t();
        C89219l.m154716b(t, "");
        ProgressDialogC81146b a = ProgressDialogC81146b.C81148b.m140903a(t, ProgressDialogC81146b.EnumC81147a.GONE, new C83038g());
        this.f185509B = a;
        if (a == null) {
            C89219l.m154715b();
        }
        a.setMessage(mo36486t().getString(R.string.gbj));
        ProgressDialogC81146b bVar2 = this.f185509B;
        if (bVar2 == null) {
            C89219l.m154715b();
        }
        return bVar2;
    }

    /* renamed from: E */
    public final void mo128119E() {
        this.f185532b.add(new C83029b(new Effect(null, 1, null), new C83060e(true, "", "", "", 32)));
        this.f185533c.addAll(this.f185532b);
        mo128118D();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.read.d$j */
    public static final class RunnableC83042j implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C83031d f185565a;

        /* renamed from: b */
        final /* synthetic */ int f185566b;

        /* renamed from: c */
        final /* synthetic */ int f185567c;

        /* renamed from: d */
        final /* synthetic */ String f185568d;

        static {
            Covode.recordClassIndex(96915);
        }

        RunnableC83042j(C83031d dVar, int i, int i2, String str) {
            this.f185565a = dVar;
            this.f185566b = i;
            this.f185567c = i2;
            this.f185568d = str;
        }

        public final void run() {
            if (this.f185566b == this.f185565a.f185544u && this.f185567c < this.f185565a.f185547x.size()) {
                this.f185565a.f185547x.get(this.f185567c).mo128146a(0, false);
                if (!C72829c.m128602a(this.f185565a.mo36485s())) {
                    Activity activity = this.f185565a.f52549m;
                    if (activity != null) {
                        C89219l.m154716b(activity, "");
                        new C23144b(activity).mo37640e(R.string.axx).mo37637b();
                    }
                } else if (TextUtils.isEmpty(this.f185568d)) {
                    Activity t = this.f185565a.mo36486t();
                    C89219l.m154716b(t, "");
                    new C23144b(t).mo37640e(R.string.gbm).mo37637b();
                } else {
                    Activity t2 = this.f185565a.mo36486t();
                    C89219l.m154716b(t2, "");
                    new C23144b(t2).mo37635a(this.f185568d).mo37637b();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.read.d$x */
    public static final class RunnableC83057x implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C83031d f185590a;

        /* renamed from: b */
        final /* synthetic */ String f185591b;

        static {
            Covode.recordClassIndex(96930);
        }

        RunnableC83057x(C83031d dVar, String str) {
            this.f185590a = dVar;
            this.f185591b = str;
        }

        public final void run() {
            if (!this.f185590a.f185508A) {
                if (!C72829c.m128602a(this.f185590a.mo36485s())) {
                    Activity activity = this.f185590a.f52549m;
                    if (activity != null) {
                        C89219l.m154716b(activity, "");
                        new C23144b(activity).mo37640e(R.string.axx).mo37637b();
                    }
                } else if (TextUtils.isEmpty(this.f185591b)) {
                    Activity t = this.f185590a.mo36486t();
                    C89219l.m154716b(t, "");
                    new C23144b(t).mo37640e(R.string.gbm).mo37637b();
                } else {
                    Activity t2 = this.f185590a.mo36486t();
                    C89219l.m154716b(t2, "");
                    new C23144b(t2).mo37635a(this.f185591b).mo37637b();
                }
                this.f185590a.mo128120a().mo114812c(false);
                AbstractC31071f value = this.f185590a.mo128120a().mo114778C().getValue();
                if (value != null) {
                    value.mo56311a(true);
                }
                AbstractC31071f value2 = this.f185590a.mo128120a().mo114778C().getValue();
                if (value2 != null) {
                    value2.mo56388t();
                }
                this.f185590a.mo128131d().f107129b = false;
                ProgressDialogC81146b bVar = this.f185590a.f185509B;
                if (bVar != null) {
                    bVar.dismiss();
                }
            }
        }
    }

    /* renamed from: M */
    private final void m143359M() {
        MethodCollector.m26663i(8480);
        this.f185547x.clear();
        LinearLayout linearLayout = this.f185522P;
        if (linearLayout == null) {
            C89219l.m154710a("listViewGroup");
        }
        linearLayout.removeAllViews();
        TuxButton tuxButton = this.f185523Q;
        if (tuxButton == null) {
            C89219l.m154710a("cancelView");
        }
        tuxButton.setVisibility(8);
        TuxCheckBox tuxCheckBox = this.f185537g;
        if (tuxCheckBox == null) {
            C89219l.m154710a("checkbox");
        }
        tuxCheckBox.setVisibility(0);
        TuxTextView tuxTextView = this.f185524R;
        if (tuxTextView == null) {
            C89219l.m154710a("checkboxText");
        }
        tuxTextView.setVisibility(0);
        Activity t = mo36486t();
        C89219l.m154716b(t, "");
        C83061f fVar = new C83061f(t, (byte) 0);
        LinearLayout linearLayout2 = this.f185522P;
        if (linearLayout2 == null) {
            C89219l.m154710a("listViewGroup");
        }
        LayoutInflater from = LayoutInflater.from(mo36486t());
        C89219l.m154716b(from, "");
        fVar.mo128147a(linearLayout2, from, 0, this);
        fVar.mo128148a(null);
        this.f185547x.add(fVar);
        LinearLayout linearLayout3 = this.f185522P;
        if (linearLayout3 == null) {
            C89219l.m154710a("listViewGroup");
        }
        linearLayout3.addView(fVar, new LinearLayout.LayoutParams(-2, -2));
        int i = 0;
        for (T t2 : this.f185532b) {
            int i2 = i + 1;
            if (i < 0) {
                C89070n.m154520a();
            }
            T t3 = t2;
            Activity t4 = mo36486t();
            C89219l.m154716b(t4, "");
            C83061f fVar2 = new C83061f(t4, (byte) 0);
            LinearLayout linearLayout4 = this.f185522P;
            if (linearLayout4 == null) {
                C89219l.m154710a("listViewGroup");
            }
            LayoutInflater from2 = LayoutInflater.from(mo36486t());
            C89219l.m154716b(from2, "");
            fVar2.mo128147a(linearLayout4, from2, i2, this);
            fVar2.mo128148a(t3);
            this.f185547x.add(fVar2);
            LinearLayout linearLayout5 = this.f185522P;
            if (linearLayout5 == null) {
                C89219l.m154710a("listViewGroup");
            }
            linearLayout5.addView(fVar2, new LinearLayout.LayoutParams(-2, -2));
            i = i2;
        }
        MethodCollector.m26664o(8480);
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:47:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: D */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo128118D() {
        /*
        // Method dump skipped, instructions count: 326
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.sticker.read.C83031d.mo128118D():void");
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.read.d$k */
    public static final class C83043k implements IFetchEffectChannelListener {

        /* renamed from: a */
        final /* synthetic */ C83031d f185569a;

        static {
            Covode.recordClassIndex(96916);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C83043k(C83031d dVar) {
            this.f185569a = dVar;
        }

        @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
        public final void onFail(ExceptionResult exceptionResult) {
            DmtStatusView dmtStatusView = this.f185569a.f185531a;
            if (dmtStatusView != null) {
                dmtStatusView.mo27379a(true);
            }
            this.f185569a.mo128119E();
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.p2082ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
        public final /* synthetic */ void onSuccess(EffectChannelResponse effectChannelResponse) {
            EffectChannelResponse effectChannelResponse2 = effectChannelResponse;
            DmtStatusView dmtStatusView = this.f185569a.f185531a;
            if (dmtStatusView != null) {
                dmtStatusView.mo27379a(true);
            }
            if (effectChannelResponse2 == null) {
                this.f185569a.mo128119E();
                return;
            }
            this.f185569a.f185532b = C83030c.m143351a(effectChannelResponse2);
            if (this.f185569a.f185532b.isEmpty()) {
                this.f185569a.mo128119E();
                return;
            }
            if (this.f185569a.f185510C.mo128103a()) {
                this.f185569a.f185510C.mo128102a(this.f185569a.f185532b);
            }
            this.f185569a.f185533c.addAll(this.f185569a.f185532b);
            C83031d.m143364a(this.f185569a.f185533c);
            this.f185569a.mo128118D();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.read.d$n */
    public static final class C83046n implements AbstractC84917a {

        /* renamed from: a */
        final /* synthetic */ C83031d f185572a;

        static {
            Covode.recordClassIndex(96919);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C83046n(C83031d dVar) {
            this.f185572a = dVar;
        }

        @Override // com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84917a
        public final boolean onKeyDown(int i, KeyEvent keyEvent) {
            if (i != 4 || !this.f185572a.mo36460z()) {
                return false;
            }
            this.f185572a.mo128126a(false, false, (C46239q) null);
            return true;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.read.d$r */
    public static final class C83050r extends AbstractView$OnClickListenerC81432d {

        /* renamed from: a */
        final /* synthetic */ C83031d f185576a;

        static {
            Covode.recordClassIndex(96923);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C83050r(C83031d dVar) {
            this.f185576a = dVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81432d
        /* renamed from: a */
        public final void mo77200a(View view) {
            this.f185576a.mo128126a(false, false, (C46239q) null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.read.d$s */
    public static final class C83051s extends AbstractView$OnClickListenerC81432d {

        /* renamed from: a */
        final /* synthetic */ C83031d f185577a;

        static {
            Covode.recordClassIndex(96924);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C83051s(C83031d dVar) {
            this.f185577a = dVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81432d
        /* renamed from: a */
        public final void mo77200a(View view) {
            this.f185577a.mo128126a(false, false, (C46239q) null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.read.d$t */
    public static final class C83052t extends AbstractView$OnClickListenerC81432d {

        /* renamed from: a */
        final /* synthetic */ C83031d f185578a;

        static {
            Covode.recordClassIndex(96925);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C83052t(C83031d dVar) {
            this.f185578a = dVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81432d
        /* renamed from: a */
        public final void mo77200a(View view) {
            if (this.f185578a.f185541k) {
                this.f185578a.mo128126a(false, false, (C46239q) null);
            } else if (C83031d.m143368c(this.f185578a).getVisibility() == 8) {
                this.f185578a.mo128120a().mo114833v().setValue(C88296t.m153435a());
                this.f185578a.mo128120a().mo114833v().setValue(C88296t.m153437b());
                C83031d.m143368c(this.f185578a).setVisibility(0);
            } else {
                C83031d.m143368c(this.f185578a).setVisibility(8);
                AbstractC31071f value = this.f185578a.mo128120a().mo114778C().getValue();
                if (value != null) {
                    value.mo56311a(true);
                }
                this.f185578a.mo128120a().mo114833v().setValue(C88296t.m153435a());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.read.d$y */
    public static final class C83058y extends AbstractC89220m implements AbstractC89172b<AVChallenge, C89391z> {

        /* renamed from: a */
        public static final C83058y f185592a = new C83058y();

        static {
            Covode.recordClassIndex(96931);
        }

        C83058y() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AVChallenge aVChallenge) {
            C89219l.m154721d(aVChallenge, "");
            return C89391z.f203057a;
        }
    }

    /* renamed from: b */
    public static final /* synthetic */ TuxCheckBox m143366b(C83031d dVar) {
        TuxCheckBox tuxCheckBox = dVar.f185537g;
        if (tuxCheckBox == null) {
            C89219l.m154710a("checkbox");
        }
        return tuxCheckBox;
    }

    /* renamed from: c */
    public static final /* synthetic */ View m143368c(C83031d dVar) {
        View view = dVar.f185538h;
        if (view == null) {
            C89219l.m154710a("playView");
        }
        return view;
    }

    /* renamed from: d */
    public static final /* synthetic */ SafeHandler m143369d(C83031d dVar) {
        SafeHandler safeHandler = dVar.f185540j;
        if (safeHandler == null) {
            C89219l.m154710a("mSafeHandler");
        }
        return safeHandler;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af> S1 getState(VM1 vm1) {
        C89219l.m154721d(vm1, "");
        return (S1) AbstractC20382b.C20383a.m38582a(this, vm1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.read.d$f */
    public static final class C83037f implements AbstractC56659a {

        /* renamed from: a */
        final /* synthetic */ C83031d f185555a;

        static {
            Covode.recordClassIndex(96910);
        }

        C83037f(C83031d dVar) {
            this.f185555a = dVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.infoSticker.AbstractC56659a
        /* renamed from: a */
        public final void mo93541a(AVChallenge aVChallenge) {
            TextStickerChallenges textStickerChallenges = this.f185555a.mo128127b().getTextStickerChallenges();
            C89219l.m154716b(aVChallenge, "");
            textStickerChallenges.addReadTextChallenge(aVChallenge);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.read.d$p */
    static final class View$OnClickListenerC83048p implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C83031d f185574a;

        static {
            Covode.recordClassIndex(96921);
        }

        View$OnClickListenerC83048p(C83031d dVar) {
            this.f185574a = dVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C83031d.m143366b(this.f185574a).setChecked(!C83031d.m143366b(this.f185574a).isChecked());
        }
    }

    /* renamed from: c */
    public final void mo128130c(String str) {
        SafeHandler safeHandler = this.f185540j;
        if (safeHandler == null) {
            C89219l.m154710a("mSafeHandler");
        }
        safeHandler.post(new RunnableC83057x(this, str));
    }

    /* renamed from: a */
    private static boolean m143365a(TextStickerData textStickerData) {
        C89219l.m154721d(textStickerData, "");
        if (TextUtils.isEmpty(textStickerData.getAudioText()) || !(!C89219l.m154714a((Object) textStickerData.getAudioText(), (Object) C46110t.m88973i(textStickerData.getTextWrapList())))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    private final int m143370f(String str) {
        int i = 0;
        if (this.f185535e) {
            return 0;
        }
        for (T t : this.f185532b) {
            int i2 = i + 1;
            if (i < 0) {
                C89070n.m154520a();
            }
            if (C89219l.m154714a((Object) t.f185506c.f185597c, (Object) str)) {
                return i;
            }
            i = i2;
        }
        return -1;
    }

    /* renamed from: b */
    public final void mo128128b(List<C83029b> list) {
        C89219l.m154721d(list, "");
        this.f185545v = true;
        this.f185533c.clear();
        this.f185533c.addAll(list);
        m143364a(this.f185533c);
    }

    /* renamed from: d */
    public final void mo128133d(String str) {
        C89219l.m154721d(str, "");
        Activity t = mo36486t();
        Objects.requireNonNull(t, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        new C56660b((ActivityC0945e) t, str).mo93542a(new C83037f(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.read.d$w */
    public static final class C83055w<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ C83031d f185582a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89238e f185583b;

        /* renamed from: c */
        final /* synthetic */ String f185584c;

        /* renamed from: d */
        final /* synthetic */ C89233z.C89238e f185585d;

        /* renamed from: e */
        final /* synthetic */ TextStickerData f185586e;

        static {
            Covode.recordClassIndex(96928);
        }

        C83055w(C83031d dVar, C89233z.C89238e eVar, String str, C89233z.C89238e eVar2, TextStickerData textStickerData) {
            this.f185582a = dVar;
            this.f185583b = eVar;
            this.f185584c = str;
            this.f185585d = eVar2;
            this.f185586e = textStickerData;
        }

        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(C1731i iVar) {
            C89219l.m154721d(iVar, "");
            if (iVar.mo5544c() || iVar.mo5539b()) {
                this.f185582a.mo128130c((C83031d) "");
            } else {
                try {
                    FetchTextAudioResponse fetchTextAudioResponse = (FetchTextAudioResponse) iVar.mo5545d();
                    if (fetchTextAudioResponse == null || fetchTextAudioResponse.status_code != 0) {
                        this.f185582a.mo128130c(fetchTextAudioResponse.message);
                    } else {
                        TextAudioData data = fetchTextAudioResponse.getData();
                        if (data == null) {
                            C89219l.m154715b();
                        }
                        String audio = data.getAudio();
                        if (audio == null) {
                            C89219l.m154715b();
                        }
                        final File b = C83065i.m143415b(audio);
                        if (b == null || !b.exists()) {
                            this.f185582a.mo128130c((C83031d) "");
                        } else {
                            final int a = C80418fa.m139406a(b.getAbsolutePath());
                            C83031d.m143369d(this.f185582a).post(new Runnable(this) {
                                /* class com.p2082ss.android.ugc.gamora.editor.sticker.read.C83031d.C83055w.RunnableC830561 */

                                /* renamed from: a */
                                final /* synthetic */ C83055w f185587a;

                                static {
                                    Covode.recordClassIndex(96929);
                                }

                                {
                                    this.f185587a = r1;
                                }

                                public final void run() {
                                    T t;
                                    T t2;
                                    String q;
                                    if (!this.f185587a.f185582a.f185508A && (t = this.f185587a.f185583b.element) != null) {
                                        this.f185587a.f185582a.mo128131d().f107129b = false;
                                        t.setAudioTrackDuration(a);
                                        t.setAudioTrackFilePath(b.getAbsolutePath());
                                        List<String> audioPathList = t.getAudioPathList();
                                        String absolutePath = b.getAbsolutePath();
                                        C89219l.m154716b(absolutePath, "");
                                        audioPathList.add(absolutePath);
                                        t.setAudioText(this.f185587a.f185584c);
                                        String speakerID = t.getSpeakerID();
                                        boolean z = true;
                                        if (speakerID != null) {
                                            if (!C89219l.m154714a((Object) speakerID, (Object) this.f185587a.f185585d.element)) {
                                                this.f185587a.f185582a.mo128134e(speakerID);
                                            } else {
                                                z = false;
                                            }
                                        }
                                        t.setSpeakerID(this.f185587a.f185585d.element);
                                        C83067k.m143426c(this.f185587a.f185585d.element);
                                        this.f185587a.f185582a.mo128123a(t, b, a);
                                        this.f185587a.f185582a.mo128117C().mo128085a(new C20391d<>(t));
                                        if (this.f185587a.f185586e == null) {
                                            this.f185587a.f185582a.mo128131d().f107130c = t;
                                        }
                                        this.f185587a.f185582a.mo128131d().mo33689c(new EditTextStickerViewModel.C46016g());
                                        this.f185587a.f185582a.mo128120a().mo114812c(false);
                                        if (z) {
                                            Iterator<T> it = this.f185587a.f185582a.f185532b.iterator();
                                            while (true) {
                                                if (!it.hasNext()) {
                                                    t2 = null;
                                                    break;
                                                }
                                                t2 = it.next();
                                                if (C89219l.m154714a((Object) t2.f185506c.f185597c, (Object) this.f185587a.f185585d.element)) {
                                                    break;
                                                }
                                            }
                                            T t3 = t2;
                                            if (!(t3 == null || (q = C75466g.m132365q(t3.f106810b)) == null)) {
                                                this.f185587a.f185582a.mo128133d(q);
                                            }
                                        }
                                        ProgressDialogC81146b bVar = this.f185587a.f185582a.f185509B;
                                        if (bVar != null) {
                                            bVar.dismiss();
                                        }
                                    }
                                }
                            });
                        }
                    }
                } catch (Exception unused) {
                    this.f185582a.mo128130c((C83031d) "");
                }
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.read.d$z */
    public static final class C83059z<T> implements AbstractC0688a {

        /* renamed from: a */
        final /* synthetic */ C83031d f185593a;

        /* renamed from: b */
        final /* synthetic */ boolean f185594b;

        static {
            Covode.recordClassIndex(96932);
        }

        C83059z(C83031d dVar, boolean z) {
            this.f185593a = dVar;
            this.f185594b = z;
        }

        @Override // androidx.core.p036g.AbstractC0688a
        /* renamed from: a */
        public final /* synthetic */ void mo2720a(Object obj) {
            if (this.f185594b) {
                TextView textView = this.f185593a.f185536f;
                if (textView == null) {
                    C89219l.m154710a("textDone");
                }
                textView.setVisibility(0);
                AbstractC31071f value = this.f185593a.mo128120a().mo114778C().getValue();
                if (value != null) {
                    value.mo56311a(true);
                }
                this.f185593a.mo128120a().mo114833v().setValue(C88296t.m153435a());
                return;
            }
            AbstractC22186b bVar = (AbstractC22186b) this.f185593a.f52551o;
            if (bVar != null) {
                bVar.mo36413d(this.f185593a);
            }
        }
    }

    /* renamed from: b */
    public final boolean mo128129b(String str) {
        boolean z;
        C89219l.m154721d(str, "");
        if (this.f185542l == null) {
            return false;
        }
        if (C89219l.m154714a((Object) str, (Object) this.f185548y)) {
            str = "";
        }
        if (C89219l.m154714a((Object) str, (Object) "")) {
            HashMap<C83036e, C89378p<File, Integer>> hashMap = this.f185511E;
            C46239q qVar = this.f185542l;
            if (qVar == null) {
                C89219l.m154715b();
            }
            z = hashMap.containsKey(new C83036e(qVar.getText(), this.f185548y));
        } else {
            z = false;
        }
        HashMap<C83036e, C89378p<File, Integer>> hashMap2 = this.f185511E;
        C46239q qVar2 = this.f185542l;
        if (qVar2 == null) {
            C89219l.m154715b();
        }
        if (hashMap2.containsKey(new C83036e(qVar2.getText(), str)) || z) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final void mo128134e(String str) {
        T t;
        String q;
        C89219l.m154721d(str, "");
        Iterator<T> it = this.f185532b.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (C89219l.m154714a((Object) t.f185506c.f185597c, (Object) str)) {
                break;
            }
        }
        T t2 = t;
        if (t2 != null && (q = C75466g.m132365q(t2.f106810b)) != null && !C89361p.m154870a((CharSequence) q)) {
            mo128127b().getTextStickerChallenges().removeReadTextChallenge(q, C83058y.f185592a);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.read.d$i */
    public static final class C83040i<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ C83031d f185558a;

        /* renamed from: b */
        final /* synthetic */ int f185559b;

        /* renamed from: c */
        final /* synthetic */ int f185560c;

        /* renamed from: d */
        final /* synthetic */ String f185561d;

        static {
            Covode.recordClassIndex(96913);
        }

        C83040i(C83031d dVar, int i, int i2, String str) {
            this.f185558a = dVar;
            this.f185559b = i;
            this.f185560c = i2;
            this.f185561d = str;
        }

        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(C1731i iVar) {
            C89219l.m154721d(iVar, "");
            if (iVar.mo5544c() || iVar.mo5539b()) {
                this.f185558a.mo128121a(this.f185559b, this.f185560c, "");
            } else {
                try {
                    FetchTextAudioResponse fetchTextAudioResponse = (FetchTextAudioResponse) iVar.mo5545d();
                    if (fetchTextAudioResponse == null || fetchTextAudioResponse.status_code != 0) {
                        this.f185558a.mo128121a(this.f185559b, this.f185560c, fetchTextAudioResponse.message);
                    } else {
                        TextAudioData data = fetchTextAudioResponse.getData();
                        if (data == null) {
                            C89219l.m154715b();
                        }
                        String audio = data.getAudio();
                        if (audio == null) {
                            C89219l.m154715b();
                        }
                        final File b = C83065i.m143415b(audio);
                        if (b == null || !b.exists()) {
                            this.f185558a.mo128121a(this.f185559b, this.f185560c, "");
                        } else {
                            final int a = C80418fa.m139406a(b.getAbsolutePath());
                            if (this.f185560c == this.f185558a.f185544u) {
                                C83031d.m143369d(this.f185558a).post(new Runnable(this) {
                                    /* class com.p2082ss.android.ugc.gamora.editor.sticker.read.C83031d.C83040i.RunnableC830411 */

                                    /* renamed from: a */
                                    final /* synthetic */ C83040i f185562a;

                                    static {
                                        Covode.recordClassIndex(96914);
                                    }

                                    {
                                        this.f185562a = r1;
                                    }

                                    /* JADX WARNING: Removed duplicated region for block: B:15:0x0079  */
                                    /* JADX WARNING: Removed duplicated region for block: B:19:0x0089  */
                                    /* Code decompiled incorrectly, please refer to instructions dump. */
                                    public final void run() {
                                        /*
                                        // Method dump skipped, instructions count: 261
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.sticker.read.C83031d.C83040i.RunnableC830411.run():void");
                                    }
                                });
                            }
                        }
                    }
                } catch (Exception unused) {
                    this.f185558a.mo128121a(this.f185559b, this.f185560c, "");
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: b */
    private final void m143367b(TextStickerData textStickerData) {
        LiveData<AbstractC31071f> liveData;
        this.f185528V = textStickerData;
        m143355I();
        String str = "";
        this.f185526T = str;
        if (!textStickerData.getHasReadTextAudio()) {
            str = C83067k.m143429e();
        } else if (m143365a(textStickerData) || TextUtils.isEmpty(textStickerData.getAudioTrackFilePath()) || !new File(textStickerData.getAudioTrackFilePath()).exists() || textStickerData.getAudioTrackDuration() == 0) {
            AbstractC72510a a = mo128120a();
            if (a != null) {
                liveData = a.mo114778C();
            } else {
                liveData = null;
            }
            AbstractC31071f value = liveData.getValue();
            if (value != null) {
                value.mo56351e(textStickerData.getAudioTrackIndex());
            }
            textStickerData.setHasReadTextAudio(false);
            textStickerData.setAudioTrackIndex(-1);
            textStickerData.setAudioTrackFilePath(null);
            String speakerID = textStickerData.getSpeakerID();
            if (speakerID != null) {
                str = speakerID;
            }
            this.f185526T = str;
            return;
        } else {
            mo128123a(textStickerData, new File(textStickerData.getAudioTrackFilePath()), textStickerData.getAudioTrackDuration());
            String speakerID2 = textStickerData.getSpeakerID();
            if (speakerID2 != null) {
                str = speakerID2;
            }
        }
        this.f185526T = str;
    }

    /* renamed from: a */
    public static void m143364a(List<C83029b> list) {
        C89219l.m154721d(list, "");
        List<String> d = C83067k.m143428d(C63244g.m114602a().mo73255A().mo93904c());
        ArrayList arrayList = new ArrayList();
        for (String str : d) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (C89219l.m154714a((Object) ((C83029b) next).f185506c.f185597c, (Object) str)) {
                    if (next != null) {
                        arrayList.add(next);
                    }
                }
            }
        }
        IInternalCommerceService h = AVCommerceServiceImpl.m102988h();
        C89219l.m154716b(h, "");
        boolean b = h.mo93965b();
        Iterator<C83029b> it2 = list.iterator();
        while (it2.hasNext()) {
            C83029b next2 = it2.next();
            if (next2.f185506c.f185599e == 1) {
                it2.remove();
            } else if (b && next2.mo128114c()) {
                it2.remove();
            }
        }
        if (C83028d.m143349a()) {
            list.addAll(0, arrayList);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0160, code lost:
        if (r0 != null) goto L_0x012c;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo128132d(int r15) {
        /*
        // Method dump skipped, instructions count: 379
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.sticker.read.C83031d.mo128132d(int):void");
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final void mo22704a(Bundle bundle) {
        Object obj;
        super.mo22704a(bundle);
        View c = mo36475c(R.id.ade);
        C89219l.m154716b(c, "");
        this.f185521O = (RelativeLayout) c;
        View c2 = mo36475c(R.id.eg5);
        C89219l.m154716b(c2, "");
        this.f185536f = (TextView) c2;
        View c3 = mo36475c(R.id.a0z);
        C89219l.m154716b(c3, "");
        this.f185523Q = (TuxButton) c3;
        View c4 = mo36475c(R.id.at2);
        C89219l.m154716b(c4, "");
        this.f185522P = (LinearLayout) c4;
        View c5 = mo36475c(R.id.a4l);
        C89219l.m154716b(c5, "");
        this.f185537g = (TuxCheckBox) c5;
        View c6 = mo36475c(R.id.a4o);
        C89219l.m154716b(c6, "");
        this.f185524R = (TuxTextView) c6;
        View c7 = mo36475c(R.id.d35);
        C89219l.m154716b(c7, "");
        this.f185538h = c7;
        if (c7 == null) {
            C89219l.m154710a("playView");
        }
        c7.setVisibility(8);
        TuxCheckBox tuxCheckBox = this.f185537g;
        if (tuxCheckBox == null) {
            C89219l.m154710a("checkbox");
        }
        tuxCheckBox.setVisibility(8);
        TuxTextView tuxTextView = this.f185524R;
        if (tuxTextView == null) {
            C89219l.m154710a("checkboxText");
        }
        tuxTextView.setVisibility(8);
        if (C83067k.m143424b()) {
            this.f185539i = true;
        }
        TuxTextView tuxTextView2 = this.f185524R;
        if (tuxTextView2 == null) {
            C89219l.m154710a("checkboxText");
        }
        tuxTextView2.setOnClickListener(new View$OnClickListenerC83048p(this));
        TuxCheckBox tuxCheckBox2 = this.f185537g;
        if (tuxCheckBox2 == null) {
            C89219l.m154710a("checkbox");
        }
        tuxCheckBox2.setOnCheckedChangeListener(new C83049q(this));
        TuxButton tuxButton = this.f185523Q;
        if (tuxButton == null) {
            C89219l.m154710a("cancelView");
        }
        tuxButton.setOnClickListener(new C83050r(this));
        TuxButton tuxButton2 = this.f185523Q;
        if (tuxButton2 == null) {
            C89219l.m154710a("cancelView");
        }
        tuxButton2.setBackgroundColor(Color.parseColor("#10FFFFFF"));
        TextView textView = this.f185536f;
        if (textView == null) {
            C89219l.m154710a("textDone");
        }
        textView.setOnClickListener(new C83051s(this));
        View view = this.f185538h;
        if (view == null) {
            C89219l.m154710a("playView");
        }
        Activity activity = this.f52549m;
        if (activity == null) {
            C89219l.m154715b();
        }
        view.setTranslationY(-C13628n.m24520b(activity, 69.5f));
        ViewGroup viewGroup = this.f185520N;
        if (viewGroup == null) {
            C89219l.m154710a("parentLayout");
        }
        viewGroup.setOnClickListener(new C83052t(this));
        Activity t = mo36486t();
        Objects.requireNonNull(t, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        this.f185540j = new SafeHandler((ActivityC0945e) t);
        DmtStatusView dmtStatusView = (DmtStatusView) mo36475c(R.id.cfy);
        this.f185531a = dmtStatusView;
        if (dmtStatusView != null) {
            DmtStatusView.C17269a a = DmtStatusView.C17269a.m31905a(this.f52549m);
            a.f41304g = 1;
            dmtStatusView.setBuilder(a);
        }
        DmtStatusView dmtStatusView2 = this.f185531a;
        if (dmtStatusView2 != null) {
            dmtStatusView2.mo27384f();
        }
        if (this.f52549m instanceof AbstractC84919c) {
            Activity activity2 = this.f52549m;
            Objects.requireNonNull(activity2, "null cannot be cast to non-null type com.ss.android.ugc.tools.view.activity.AVListenableActivityRegistry");
            this.f185513G = (AbstractC84919c) activity2;
        }
        Activity activity3 = this.f52549m;
        if (activity3 != null) {
            obj = m143361a(activity3, "input_method");
        } else {
            obj = null;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        this.f185512F = (InputMethodManager) obj;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.read.d$e */
    public static final class C83036e {

        /* renamed from: a */
        public final String f185553a;

        /* renamed from: b */
        public final String f185554b;

        static {
            Covode.recordClassIndex(96909);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C83036e)) {
                return false;
            }
            C83036e eVar = (C83036e) obj;
            return C89219l.m154714a(this.f185553a, eVar.f185553a) && C89219l.m154714a(this.f185554b, eVar.f185554b);
        }

        public final int hashCode() {
            String str = this.f185553a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f185554b;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode + i;
        }

        public final String toString() {
            return "TextSpeakerModel(text=" + this.f185553a + ", speaker=" + this.f185554b + ")";
        }

        public C83036e(String str, String str2) {
            this.f185553a = str;
            this.f185554b = str2;
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af, R> R withState(VM1 vm1, AbstractC89172b<? super S1, ? extends R> bVar) {
        C89219l.m154721d(vm1, "");
        C89219l.m154721d(bVar, "");
        return (R) AbstractC20382b.C20383a.m38593a(this, vm1, bVar);
    }

    /* renamed from: a */
    private static Object m143361a(Activity activity, String str) {
        Object obj;
        MethodCollector.m26663i(8457);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!C58027i.f132247b && "connectivity".equals(str)) {
                try {
                    new C21708b().mo35361a();
                    C58027i.f132247b = true;
                    obj = activity.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = activity.getSystemService(str);
        } else if (C58027i.f132246a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = activity.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new C58027i.HandlerC58028a((Handler) declaredField.get(obj)));
                        } catch (Exception e) {
                            C13849d.m25015a(e, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    C58027i.f132246a = false;
                } finally {
                    MethodCollector.m26664o(8457);
                }
            }
        } else {
            obj = activity.getSystemService(str);
        }
        return obj;
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.read.d$q */
    static final class C83049q implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ C83031d f185575a;

        static {
            Covode.recordClassIndex(96922);
        }

        C83049q(C83031d dVar) {
            this.f185575a = dVar;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            String str;
            C83067k.m143421a(z);
            if (!z) {
                if (this.f185575a.f185546w != null) {
                    C83061f fVar = this.f185575a.f185546w;
                    if (fVar == null) {
                        C89219l.m154715b();
                    }
                    if (fVar.getModel() != null) {
                        C83061f fVar2 = this.f185575a.f185546w;
                        if (fVar2 == null) {
                            C89219l.m154715b();
                        }
                        C83029b model = fVar2.getModel();
                        if (model == null) {
                            C89219l.m154715b();
                        }
                        C83067k.m143423b(model.f185506c.f185596b);
                        C83061f fVar3 = this.f185575a.f185546w;
                        if (fVar3 == null) {
                            C89219l.m154715b();
                        }
                        C83029b model2 = fVar3.getModel();
                        if (model2 == null) {
                            C89219l.m154715b();
                        }
                        C83067k.m143420a(model2.f185506c.f185597c);
                        C83031d dVar = this.f185575a;
                        C83061f fVar4 = dVar.f185546w;
                        if (fVar4 == null) {
                            C89219l.m154715b();
                        }
                        C83029b model3 = fVar4.getModel();
                        if (model3 == null) {
                            C89219l.m154715b();
                        }
                        dVar.mo128124a(model3.f185506c.f185596b);
                    }
                }
                C83067k.m143423b(this.f185575a.f185549z);
                C83067k.m143420a(this.f185575a.f185548y);
                C83031d dVar2 = this.f185575a;
                dVar2.mo128124a(dVar2.f185549z);
            }
            if (!this.f185575a.f185539i) {
                ShortVideoCommonParams shortVideoCommonParams = new ShortVideoCommonParams(this.f185575a.mo128127b().mShootWay, C71817eu.m126790a(this.f185575a.mo128127b()), C71817eu.m126792c(this.f185575a.mo128127b()), this.f185575a.mo128127b().creationId);
                C89219l.m154721d(shortVideoCommonParams, "");
                C84425b a = new C84425b().mo129406a("shoot_way", shortVideoCommonParams.shootWay).mo129406a("content_source", shortVideoCommonParams.contentSource).mo129406a("content_type", shortVideoCommonParams.contentType).mo129406a("creation_id", shortVideoCommonParams.creationId);
                if (C83067k.m143424b()) {
                    str = "on";
                } else {
                    str = "off";
                }
                C39162r.m79460a("click_apply_tone", a.mo129406a("to_status", str).f188764a);
            }
            this.f185575a.f185539i = false;
        }
    }

    public C83031d(C21582f fVar, AbstractC83015b bVar) {
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(bVar, "");
        this.f185530X = fVar;
        this.f185510C = bVar;
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final View mo22702a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C89219l.m154721d(layoutInflater, "");
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(layoutInflater, R.layout.asd, viewGroup, false);
        Objects.requireNonNull(a, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup2 = (ViewGroup) a;
        this.f185520N = viewGroup2;
        if (viewGroup2 == null) {
            C89219l.m154710a("parentLayout");
        }
        return viewGroup2;
    }

    /* renamed from: a */
    public final void mo128122a(int i, boolean z) {
        TuxCheckBox tuxCheckBox = this.f185537g;
        if (tuxCheckBox == null) {
            C89219l.m154710a("checkbox");
        }
        if (!tuxCheckBox.isChecked()) {
            int i2 = i - 1;
            if (i2 >= 0 && i2 < this.f185532b.size()) {
                C83067k.m143423b(this.f185532b.get(i2).f185506c.f185596b);
                C83067k.m143420a(this.f185532b.get(i2).f185506c.f185597c);
                mo128124a(this.f185532b.get(i2).f185506c.f185596b);
            } else {
                return;
            }
        }
        if (i < this.f185547x.size()) {
            this.f185546w = this.f185547x.get(i);
            this.f185547x.get(i).mo128146a(1, z);
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af> AbstractC88412b subscribe(JediViewModel<S> jediViewModel, C20370ah<S> ahVar, AbstractC89183m<? super AbstractC20477i, ? super S, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        return AbstractC20382b.C20383a.m38583a(this, jediViewModel, ahVar, mVar);
    }

    /* renamed from: a */
    public final void mo128121a(int i, int i2, String str) {
        SafeHandler safeHandler = this.f185540j;
        if (safeHandler == null) {
            C89219l.m154710a("mSafeHandler");
        }
        safeHandler.post(new RunnableC83042j(this, i2, i, str));
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

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m143363a(java.io.File r7, int r8, java.lang.String r9, int r10) {
        /*
        // Method dump skipped, instructions count: 171
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.sticker.read.C83031d.m143363a(java.io.File, int, java.lang.String, int):void");
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
