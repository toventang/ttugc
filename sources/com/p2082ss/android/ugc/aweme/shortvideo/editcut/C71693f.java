package com.p2082ss.android.ugc.aweme.shortvideo.editcut;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Pair;
import android.view.KeyEvent;
import androidx.core.p036g.C0692e;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.als.AbstractC2547b;
import com.bytedance.als.AbstractC2557e;
import com.bytedance.als.AbstractC2565m;
import com.bytedance.als.dsl.C2551b;
import com.bytedance.als.dsl.C2552c;
import com.bytedance.als.dsl.C2556g;
import com.bytedance.als.dsl.OCAdapterViewModel;
import com.bytedance.android.livesdk.livesetting.feed.LiveFeedRefreshTimeSetting;
import com.bytedance.covode.number.Covode;
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
import com.bytedance.jedi.arch.C20526p;
import com.bytedance.jedi.arch.C20531t;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.AbstractC21603p;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p1559o.C21597n;
import com.bytedance.p1559o.p1561b.C21572a;
import com.bytedance.scene.group.AbstractC22186b;
import com.p2082ss.android.ugc.asve.editor.AbstractC31071f;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.edit.Cut2EditTransferModel;
import com.p2082ss.android.ugc.aweme.editSticker.text.als.AbstractC46036a;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p2722cy.p2723a.C40888d;
import com.p2082ss.android.ugc.aweme.services.video.VEVolumeChangeOp;
import com.p2082ss.android.ugc.aweme.shortvideo.C69905c;
import com.p2082ss.android.ugc.aweme.shortvideo.C70005cr;
import com.p2082ss.android.ugc.aweme.shortvideo.C71817eu;
import com.p2082ss.android.ugc.aweme.shortvideo.ImportVideoInfo;
import com.p2082ss.android.ugc.aweme.shortvideo.RetakeVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.AbstractC70076i;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.C70097r;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C70444d;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C70455f;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C70465j;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3802c.AbstractC70440f;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3802c.AbstractC70443i;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.AbstractC70527h;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.viewmodel.VEVideoCutterViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C70968bl;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C70976bp;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.audiorecord.AbstractC70892c;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.effect.AbstractC71002a;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.data.C71493a;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.data.C71494b;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.data.EditAdjustClipsState;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.p3827b.C71423a;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.p3827b.C71427b;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.p3827b.C71429d;
import com.p2082ss.android.ugc.aweme.shortvideo.editcut.AbstractC71793q;
import com.p2082ss.android.ugc.aweme.shortvideo.editcut.C71776n;
import com.p2082ss.android.ugc.aweme.shortvideo.editcut.C71780o;
import com.p2082ss.android.ugc.aweme.shortvideo.editcut.EditAdjustClipsBottomViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.editcut.p3830a.C71557a;
import com.p2082ss.android.ugc.aweme.shortvideo.editcut.p3830a.C71558b;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.C72449g;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.TimeSpeedModelExtension;
import com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a;
import com.p2082ss.android.ugc.aweme.tools.EnumC78601i;
import com.p2082ss.android.ugc.aweme.utils.C80332db;
import com.p2082ss.android.ugc.aweme.utils.C80418fa;
import com.p2082ss.android.ugc.gamora.editor.AbstractC82036ac;
import com.p2082ss.android.ugc.gamora.editor.cutmusic.AbstractC82104a;
import com.p2082ss.android.ugc.gamora.editor.filter.core.AbstractC82200a;
import com.p2082ss.android.ugc.gamora.editor.music.EditMusicViewModel;
import com.p2082ss.android.ugc.gamora.editor.p4276c.AbstractC82074b;
import com.p2082ss.android.ugc.gamora.editor.p4276c.C82080c;
import com.p2082ss.android.ugc.gamora.editor.sticker.core.AbstractC82610a;
import com.p2082ss.android.ugc.gamora.editor.toolbar.AbstractC83233s;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.tools.utils.C84896h;
import com.p2082ss.android.ugc.tools.utils.C84902i;
import com.p2082ss.android.ugc.tools.utils.C84904k;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84917a;
import com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84919c;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.android.vesdk.runtime.C85553b;
import dmt.p4542av.video.C88295s;
import dmt.p4542av.video.VEEditorAutoStartStopArbiter;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import p077b.C1731i;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.C89391z;
import p4600h.EnumC89331m;
import p4600h.p4601a.C89064i;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4612a.AbstractC89188r;
import p4600h.p4611f.p4612a.AbstractC89189s;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4611f.p4613b.C89233z;
import p4600h.p4616h.AbstractC89248d;
import p4600h.p4620k.AbstractC89286i;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.f */
public final class C71693f extends AbstractC2557e<AbstractC71692e> implements AbstractC20382b, AbstractC21566a, AbstractC71692e, AbstractC71792p {

    /* renamed from: c */
    static final /* synthetic */ AbstractC89286i[] f160673c = {new C89232y(C71693f.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0), new C89232y(C71693f.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0)};

    /* renamed from: x */
    public static final C71746p f160674x = new C71746p((byte) 0);

    /* renamed from: A */
    private final AbstractC89248d f160675A;

    /* renamed from: B */
    private final AbstractC89248d f160676B;

    /* renamed from: C */
    private final AbstractC89244h f160677C;

    /* renamed from: D */
    private final AbstractC89244h f160678D;

    /* renamed from: E */
    private final AbstractC89244h f160679E;

    /* renamed from: F */
    private final AbstractC89244h f160680F;

    /* renamed from: G */
    private final AbstractC89244h f160681G;

    /* renamed from: H */
    private final AbstractC89244h f160682H;

    /* renamed from: I */
    private final AbstractC89244h f160683I;

    /* renamed from: J */
    private final AbstractC89244h f160684J;

    /* renamed from: K */
    private final AbstractC89244h f160685K;

    /* renamed from: L */
    private final AbstractC89244h f160686L;

    /* renamed from: M */
    private final AbstractC89244h f160687M;

    /* renamed from: N */
    private final AbstractC89244h f160688N;

    /* renamed from: O */
    private final AbstractC89244h f160689O;

    /* renamed from: P */
    private final AbstractC89244h f160690P;

    /* renamed from: Q */
    private final AbstractC89244h f160691Q;

    /* renamed from: R */
    private final AbstractC89244h f160692R;

    /* renamed from: S */
    private final AbstractC89244h f160693S;

    /* renamed from: T */
    private final AbstractC89244h f160694T;

    /* renamed from: d */
    public final AbstractC71692e f160695d = this;

    /* renamed from: e */
    volatile boolean f160696e;

    /* renamed from: f */
    volatile boolean f160697f;

    /* renamed from: g */
    public volatile boolean f160698g;

    /* renamed from: h */
    public volatile boolean f160699h;

    /* renamed from: i */
    public boolean f160700i;

    /* renamed from: j */
    public AbstractC31071f f160701j;

    /* renamed from: k */
    public boolean f160702k;

    /* renamed from: l */
    public boolean f160703l;

    /* renamed from: m */
    public boolean f160704m;

    /* renamed from: n */
    public boolean f160705n;

    /* renamed from: o */
    public AbstractC70527h f160706o;

    /* renamed from: p */
    public boolean f160707p;

    /* renamed from: q */
    C89378p<Long, Long> f160708q;

    /* renamed from: r */
    public C69905c f160709r;

    /* renamed from: s */
    final AbstractC89244h f160710s;

    /* renamed from: t */
    final AbstractC89244h f160711t;

    /* renamed from: u */
    public final C71701af f160712u;

    /* renamed from: v */
    public final AbstractC22186b f160713v;

    /* renamed from: w */
    public final int f160714w = R.id.c7m;

    /* renamed from: y */
    private final AbstractC89244h f160715y = C89250i.m154773a((AbstractC89171a) new C71752u(this));

    /* renamed from: z */
    private int f160716z = -1;

    static {
        Covode.recordClassIndex(84238);
    }

    /* renamed from: C */
    private final AbstractC82104a m126609C() {
        return (AbstractC82104a) this.f160679E.getValue();
    }

    /* renamed from: D */
    private final AbstractC83233s m126610D() {
        return (AbstractC83233s) this.f160680F.getValue();
    }

    /* renamed from: E */
    private final CutVideoSpeedViewModel m126611E() {
        return (CutVideoSpeedViewModel) this.f160686L.getValue();
    }

    /* renamed from: F */
    private final C70444d m126612F() {
        return (C70444d) this.f160692R.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.editcut.AbstractC71775m, com.p2082ss.android.ugc.aweme.shortvideo.editcut.AbstractC71792p
    /* renamed from: b */
    public final List<VideoSegment> mo113381b() {
        return (List) this.f160715y.getValue();
    }

    /* renamed from: d */
    public final VideoPublishEditModel mo113388d() {
        return (VideoPublishEditModel) this.f160675A.mo23374a(this, f160673c[0]);
    }

    /* renamed from: e */
    public final AbstractC72510a mo113390e() {
        return (AbstractC72510a) this.f160676B.mo23374a(this, f160673c[1]);
    }

    /* renamed from: f */
    public final AbstractC71002a mo113391f() {
        return (AbstractC71002a) this.f160677C.getValue();
    }

    /* renamed from: g */
    public final AbstractC82610a mo113392g() {
        return (AbstractC82610a) this.f160678D.getValue();
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    /* renamed from: h */
    public final C71557a mo113393h() {
        return (C71557a) this.f160682H.getValue();
    }

    /* renamed from: i */
    public final CutMultiVideoViewModel mo113394i() {
        return (CutMultiVideoViewModel) this.f160683I.getValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final VideoEditViewModel mo113395j() {
        return (VideoEditViewModel) this.f160684J.getValue();
    }

    /* renamed from: k */
    public final EditAdjustClipsBottomViewModel mo113396k() {
        return (EditAdjustClipsBottomViewModel) this.f160685K.getValue();
    }

    /* renamed from: l */
    public final AbstractC82036ac mo113397l() {
        return (AbstractC82036ac) this.f160687M.getValue();
    }

    /* renamed from: m */
    public final C71780o mo113398m() {
        return (C71780o) this.f160688N.getValue();
    }

    /* renamed from: n */
    public final AbstractC71793q mo113399n() {
        return (AbstractC71793q) this.f160689O.getValue();
    }

    /* renamed from: o */
    public final C80332db mo113400o() {
        return (C80332db) this.f160690P.getValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final EditMusicViewModel mo113401p() {
        return (EditMusicViewModel) this.f160691Q.getValue();
    }

    /* renamed from: q */
    public final C71776n mo113402q() {
        return (C71776n) this.f160693S.getValue();
    }

    /* renamed from: r */
    public final C71762j mo113403r() {
        return (C71762j) this.f160694T.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.f$p */
    public static final class C71746p {
        static {
            Covode.recordClassIndex(84291);
        }

        private C71746p() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.f$p$a */
        public static final class CallableC71747a<V> implements Callable {

            /* renamed from: a */
            final /* synthetic */ VideoPublishEditModel f160774a;

            /* renamed from: b */
            final /* synthetic */ AbstractC89172b f160775b;

            /* renamed from: c */
            final /* synthetic */ String f160776c;

            static {
                Covode.recordClassIndex(84292);
            }

            CallableC71747a(VideoPublishEditModel videoPublishEditModel, AbstractC89172b bVar, String str) {
                this.f160774a = videoPublishEditModel;
                this.f160775b = bVar;
                this.f160776c = str;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                C84425b a = new C84425b().mo129406a("creation_id", this.f160774a.creationId).mo129406a("shoot_way", this.f160774a.mShootWay).mo129406a("enter_from", "video_edit_page").mo129406a("content_source", C71817eu.m126790a(this.f160774a)).mo129406a("content_type", C71817eu.m126792c(this.f160774a));
                AbstractC89172b bVar = this.f160775b;
                if (bVar != null) {
                    C89219l.m154716b(a, "");
                    bVar.invoke(a);
                }
                C39162r.m79460a(this.f160776c, a.f188764a);
                return C89391z.f203057a;
            }
        }

        public /* synthetic */ C71746p(byte b) {
            this();
        }

        /* renamed from: a */
        public static void m126658a(String str, VideoPublishEditModel videoPublishEditModel, AbstractC89172b<? super C84425b, C89391z> bVar) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(videoPublishEditModel, "");
            C1731i.m5640b(new CallableC71747a(videoPublishEditModel, bVar, str), C40780g.m82241a());
        }
    }

    @Override // com.bytedance.als.AbstractC2562j
    public final /* bridge */ /* synthetic */ AbstractC2547b getApiComponent() {
        return this.f160695d;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.AbstractC20367ae
    public final /* bridge */ /* synthetic */ AbstractC20477i getReceiver() {
        return this;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.editcut.AbstractC71775m
    /* renamed from: a */
    public final void mo113380a(boolean z, boolean z2) {
        ArrayList<TimeSpeedModelExtension> arrayList;
        C89378p<Integer, Integer> pVar;
        Integer first;
        int intValue;
        if (z && !z2) {
            int currentEditOriginIndex = mo113396k().mo113264a().getCurrentEditOriginIndex();
            VideoSegment videoSegment = mo113381b().get(currentEditOriginIndex);
            EditAdjustClipsBottomViewModel k = mo113396k();
            C89219l.m154721d(videoSegment, "");
            k.mo33690d(new EditAdjustClipsBottomViewModel.C71540g(currentEditOriginIndex, videoSegment));
        }
        C89378p<Long, Long> c = mo113385c();
        EditAdjustClipsBottomViewModel k2 = mo113396k();
        AbstractC70527h hVar = this.f160706o;
        k2.mo113265a(hVar != null ? hVar.getSelectedTime() : 0.0f);
        C71776n q = mo113402q();
        C89219l.m154721d(c, "");
        if (q.f160832b) {
            q.f160832b = false;
            if (!z && !z2) {
                q.mo113425a(true, false);
                q.mo113434i().mo113267a((C71796s) null);
                AbstractC71793q.C71794a.m126761a(q.mo113435j(), -1, null, false, 6);
            }
        }
        if (z2 && (arrayList = q.f160845o) != null && (pVar = q.f160838h) != null && (first = pVar.getFirst()) != null && (intValue = first.intValue()) >= 0 && intValue < arrayList.size()) {
            arrayList.remove(intValue);
        }
        AbstractC70076i iVar = q.f160837g;
        if (iVar != null) {
            iVar.mo110542a(z, z2, q.mo113428c());
        }
        if (q.f160835e) {
            q.mo113433h().mo114724a(q.mo113428c());
            C71780o g = q.mo113432g();
            g.mo113444c().mo111031a(z, z2, q.mo113430e().mMusicStart, new C71780o.C71791i(g));
        } else {
            AbstractC70076i iVar2 = q.f160837g;
            if (iVar2 != null) {
                iVar2.mo110547c((int) c.getFirst().longValue(), (int) c.getSecond().longValue());
            }
            AbstractC71793q.C71794a.m126761a(q.mo113435j(), c.getFirst().longValue(), null, false, 6);
        }
        C89378p<Integer, Integer> pVar2 = q.f160838h;
        if (pVar2 != null) {
            int intValue2 = pVar2.getSecond().intValue();
            if (!z) {
                q.mo113419a(intValue2, q.f160847q);
            }
        }
        q.f160838h = null;
        m126614a(false, -1);
        if (z || z2) {
            C71776n.m126699a(mo113402q(), 0, 3);
            if (z2) {
                mo113394i().mo110472a();
                return;
            }
            return;
        }
        mo113402q().mo113427b(c);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.f$as */
    static final class C71724as extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89171a f160750a;

        static {
            Covode.recordClassIndex(84269);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C71724as(AbstractC89171a aVar) {
            super(0);
            this.f160750a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* bridge */ /* synthetic */ C89391z invoke() {
            this.f160750a.invoke();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.f$ax */
    static final class C71731ax extends AbstractC89220m implements AbstractC89171a<C80332db> {

        /* renamed from: a */
        public static final C71731ax f160759a = new C71731ax();

        static {
            Covode.recordClassIndex(84276);
        }

        C71731ax() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C80332db invoke() {
            return new C80332db(10);
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

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.editcut.AbstractC71792p
    /* renamed from: w */
    public final void mo113408w() {
        m126612F().mo111003a();
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.f$a */
    public static final class C71694a extends AbstractC89220m implements AbstractC89171a<AbstractC71002a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f160717a;

        static {
            Covode.recordClassIndex(84239);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C71694a(AbstractC21566a aVar) {
            super(0);
            this.f160717a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.aweme.shortvideo.edit.effect.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.shortvideo.edit.effect.AbstractC71002a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f160717a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.aweme.shortvideo.edit.effect.a> r1 = com.p2082ss.android.ugc.aweme.shortvideo.edit.effect.AbstractC71002a.class
                r0 = 0
                java.lang.Object r0 = r2.mo35249a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.editcut.C71693f.C71694a.invoke():com.bytedance.als.b");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.f$aq */
    public static final class C71712aq extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89172b f160738a;

        /* renamed from: b */
        final /* synthetic */ boolean f160739b = true;

        static {
            Covode.recordClassIndex(84257);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C71712aq(AbstractC89172b bVar) {
            super(0);
            this.f160738a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f160738a.invoke(Boolean.valueOf(this.f160739b));
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.f$au */
    static final class C71726au extends AbstractC89220m implements AbstractC89171a<C71762j> {

        /* renamed from: a */
        final /* synthetic */ C71693f f160753a;

        static {
            Covode.recordClassIndex(84271);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C71726au(C71693f fVar) {
            super(0);
            this.f160753a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C71762j invoke() {
            return new C71762j(this.f160753a.getDiContainer());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.f$b */
    public static final class C71732b extends AbstractC89220m implements AbstractC89171a<AbstractC82610a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f160760a;

        static {
            Covode.recordClassIndex(84277);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C71732b(AbstractC21566a aVar) {
            super(0);
            this.f160760a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.gamora.editor.sticker.core.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.gamora.editor.sticker.core.AbstractC82610a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f160760a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.gamora.editor.sticker.core.a> r1 = com.p2082ss.android.ugc.gamora.editor.sticker.core.AbstractC82610a.class
                r0 = 0
                java.lang.Object r0 = r2.mo35249a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.editcut.C71693f.C71732b.invoke():com.bytedance.als.b");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.f$c */
    public static final class C71733c extends AbstractC89220m implements AbstractC89171a<AbstractC82104a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f160761a;

        static {
            Covode.recordClassIndex(84278);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C71733c(AbstractC21566a aVar) {
            super(0);
            this.f160761a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.gamora.editor.cutmusic.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.gamora.editor.cutmusic.AbstractC82104a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f160761a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.gamora.editor.cutmusic.a> r1 = com.p2082ss.android.ugc.gamora.editor.cutmusic.AbstractC82104a.class
                r0 = 0
                java.lang.Object r0 = r2.mo35249a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.editcut.C71693f.C71733c.invoke():com.bytedance.als.b");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.f$d */
    public static final class C71734d extends AbstractC89220m implements AbstractC89171a<AbstractC82200a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f160762a;

        static {
            Covode.recordClassIndex(84279);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C71734d(AbstractC21566a aVar) {
            super(0);
            this.f160762a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.gamora.editor.filter.core.a, com.bytedance.als.b] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.gamora.editor.filter.core.AbstractC82200a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f160762a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.gamora.editor.filter.core.a> r1 = com.p2082ss.android.ugc.gamora.editor.filter.core.AbstractC82200a.class
                r0 = 0
                java.lang.Object r0 = r2.mo35249a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.editcut.C71693f.C71734d.invoke():com.bytedance.als.b");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.f$f */
    public static final class C71736f extends AbstractC89220m implements AbstractC89171a<C71557a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f160764a;

        static {
            Covode.recordClassIndex(84281);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C71736f(AbstractC21566a aVar) {
            super(0);
            this.f160764a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, com.ss.android.ugc.aweme.shortvideo.editcut.a.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.shortvideo.editcut.p3830a.C71557a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f160764a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.aweme.shortvideo.editcut.a.a> r1 = com.p2082ss.android.ugc.aweme.shortvideo.editcut.p3830a.C71557a.class
                r0 = 0
                java.lang.Object r0 = r2.mo35249a(r1, r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.editcut.C71693f.C71736f.invoke():java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.f$g */
    public static final class C71737g extends AbstractC89220m implements AbstractC89171a<CutMultiVideoViewModel> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f160765a;

        static {
            Covode.recordClassIndex(84282);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C71737g(AbstractC21566a aVar) {
            super(0);
            this.f160765a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel, java.lang.Object] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f160765a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel> r1 = com.p2082ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel.class
                r0 = 0
                java.lang.Object r0 = r2.mo35249a(r1, r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.editcut.C71693f.C71737g.invoke():java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.f$h */
    public static final class C71738h extends AbstractC89220m implements AbstractC89171a<VideoEditViewModel> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f160766a;

        static {
            Covode.recordClassIndex(84283);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C71738h(AbstractC21566a aVar) {
            super(0);
            this.f160766a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f160766a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel> r1 = com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel.class
                r0 = 0
                java.lang.Object r0 = r2.mo35249a(r1, r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.editcut.C71693f.C71738h.invoke():java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.f$i */
    public static final class C71739i extends AbstractC89220m implements AbstractC89171a<EditAdjustClipsBottomViewModel> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f160767a;

        static {
            Covode.recordClassIndex(84284);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C71739i(AbstractC21566a aVar) {
            super(0);
            this.f160767a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.ss.android.ugc.aweme.shortvideo.editcut.EditAdjustClipsBottomViewModel, java.lang.Object] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.shortvideo.editcut.EditAdjustClipsBottomViewModel invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f160767a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.aweme.shortvideo.editcut.EditAdjustClipsBottomViewModel> r1 = com.p2082ss.android.ugc.aweme.shortvideo.editcut.EditAdjustClipsBottomViewModel.class
                r0 = 0
                java.lang.Object r0 = r2.mo35249a(r1, r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.editcut.C71693f.C71739i.invoke():java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.f$j */
    public static final class C71740j extends AbstractC89220m implements AbstractC89171a<CutVideoSpeedViewModel> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f160768a;

        static {
            Covode.recordClassIndex(84285);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C71740j(AbstractC21566a aVar) {
            super(0);
            this.f160768a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel, java.lang.Object] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f160768a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel> r1 = com.p2082ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel.class
                r0 = 0
                java.lang.Object r0 = r2.mo35249a(r1, r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.editcut.C71693f.C71740j.invoke():java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.f$k */
    public static final class C71741k extends AbstractC89220m implements AbstractC89171a<AbstractC82036ac> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f160769a;

        static {
            Covode.recordClassIndex(84286);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C71741k(AbstractC21566a aVar) {
            super(0);
            this.f160769a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.ss.android.ugc.gamora.editor.ac, java.lang.Object] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.gamora.editor.AbstractC82036ac invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f160769a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.gamora.editor.ac> r1 = com.p2082ss.android.ugc.gamora.editor.AbstractC82036ac.class
                r0 = 0
                java.lang.Object r0 = r2.mo35249a(r1, r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.editcut.C71693f.C71741k.invoke():java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.f$l */
    public static final class C71742l extends AbstractC89220m implements AbstractC89171a<C71780o> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f160770a;

        static {
            Covode.recordClassIndex(84287);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C71742l(AbstractC21566a aVar) {
            super(0);
            this.f160770a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.ss.android.ugc.aweme.shortvideo.editcut.o, java.lang.Object] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.shortvideo.editcut.C71780o invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f160770a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.aweme.shortvideo.editcut.o> r1 = com.p2082ss.android.ugc.aweme.shortvideo.editcut.C71780o.class
                r0 = 0
                java.lang.Object r0 = r2.mo35249a(r1, r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.editcut.C71693f.C71742l.invoke():java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.f$m */
    public static final class C71743m extends AbstractC89220m implements AbstractC89171a<AbstractC71793q> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f160771a;

        static {
            Covode.recordClassIndex(84288);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C71743m(AbstractC21566a aVar) {
            super(0);
            this.f160771a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, com.ss.android.ugc.aweme.shortvideo.editcut.q] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.shortvideo.editcut.AbstractC71793q invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f160771a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.aweme.shortvideo.editcut.q> r1 = com.p2082ss.android.ugc.aweme.shortvideo.editcut.AbstractC71793q.class
                r0 = 0
                java.lang.Object r0 = r2.mo35249a(r1, r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.editcut.C71693f.C71743m.invoke():java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.f$n */
    public static final class C71744n extends AbstractC89220m implements AbstractC89171a<AbstractC70892c> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f160772a;

        static {
            Covode.recordClassIndex(84289);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C71744n(AbstractC21566a aVar) {
            super(0);
            this.f160772a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.c] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.shortvideo.edit.audiorecord.AbstractC70892c invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f160772a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.c> r1 = com.p2082ss.android.ugc.aweme.shortvideo.edit.audiorecord.AbstractC70892c.class
                r0 = 0
                java.lang.Object r0 = r2.mo35252b(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.editcut.C71693f.C71744n.invoke():com.bytedance.als.b");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.f$o */
    public static final class C71745o extends AbstractC89220m implements AbstractC89171a<AbstractC83233s> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f160773a;

        static {
            Covode.recordClassIndex(84290);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C71745o(AbstractC21566a aVar) {
            super(0);
            this.f160773a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.gamora.editor.toolbar.s] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.gamora.editor.toolbar.AbstractC83233s invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f160773a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.gamora.editor.toolbar.s> r1 = com.p2082ss.android.ugc.gamora.editor.toolbar.AbstractC83233s.class
                r0 = 0
                java.lang.Object r0 = r2.mo35252b(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.editcut.C71693f.C71745o.invoke():com.bytedance.als.b");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.f$s */
    static final class C71750s extends AbstractC89220m implements AbstractC89171a<C70444d> {

        /* renamed from: a */
        final /* synthetic */ C71693f f160783a;

        static {
            Covode.recordClassIndex(84295);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C71750s(C71693f fVar) {
            super(0);
            this.f160783a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C70444d invoke() {
            C70444d dVar = new C70444d();
            dVar.mo111004a(C2556g.m7473b(this.f160783a));
            return dVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.f$t */
    static final class C71751t extends AbstractC89220m implements AbstractC89171a<C71776n> {

        /* renamed from: a */
        final /* synthetic */ C71693f f160784a;

        static {
            Covode.recordClassIndex(84296);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C71751t(C71693f fVar) {
            super(0);
            this.f160784a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C71776n invoke() {
            return new C71776n(this.f160784a.getDiContainer());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.f$u */
    static final class C71752u extends AbstractC89220m implements AbstractC89171a<List<? extends VideoSegment>> {

        /* renamed from: a */
        final /* synthetic */ C71693f f160785a;

        static {
            Covode.recordClassIndex(84297);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C71752u(C71693f fVar) {
            super(0);
            this.f160785a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ List<? extends VideoSegment> invoke() {
            return this.f160785a.mo113402q().mo113428c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.f$v */
    public static final class C71753v implements AbstractC70443i {

        /* renamed from: a */
        final /* synthetic */ C71693f f160786a;

        static {
            Covode.recordClassIndex(84298);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3802c.AbstractC70443i
        /* renamed from: a */
        public final void mo110996a() {
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3802c.AbstractC70443i
        /* renamed from: b */
        public final void mo111000b() {
            this.f160786a.mo113396k().mo113266a(-1);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3802c.AbstractC70443i
        /* renamed from: c */
        public final void mo111002c() {
            this.f160786a.mo113396k().mo113266a(-1);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C71753v(C71693f fVar) {
            this.f160786a = fVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3802c.AbstractC70443i
        /* renamed from: a */
        public final void mo110998a(Exception exc) {
            this.f160786a.mo113396k().mo113266a(-1);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3802c.AbstractC70443i
        /* renamed from: b */
        public final void mo111001b(Exception exc) {
            this.f160786a.mo113396k().mo113266a(-1);
        }

        /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3802c.AbstractC70443i
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo110999a(java.util.List<? extends com.p2082ss.android.ugc.aweme.shortvideo.C69905c> r4) {
            /*
                r3 = this;
                java.lang.String r0 = "request music list success when force apply music sync"
                com.p2082ss.android.ugc.tools.utils.C84911q.m145921a(r0)
                r2 = 0
                if (r4 == 0) goto L_0x000e
                boolean r0 = r4.isEmpty()
                if (r0 == 0) goto L_0x000f
            L_0x000e:
                return
            L_0x000f:
                com.ss.android.ugc.aweme.shortvideo.editcut.f r0 = r3.f160786a
                com.ss.android.ugc.aweme.shortvideo.editcut.a.a r0 = r0.mo113393h()
                com.ss.android.ugc.aweme.edit.Cut2EditTransferModel r0 = r0.f160358e
                if (r0 == 0) goto L_0x0029
                java.util.List r1 = r0.getMusicList()
                if (r1 == 0) goto L_0x0029
                r1.clear()
                java.lang.Object r0 = r4.get(r2)
                r1.add(r0)
            L_0x0029:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.editcut.C71693f.C71753v.mo110999a(java.util.List):void");
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3802c.AbstractC70443i
        /* renamed from: a */
        public final void mo110997a(C69905c cVar) {
            String c;
            C84911q.m145921a("request music model success when force apply music sync");
            if (cVar == null) {
                this.f160786a.mo113396k().mo113266a(-1);
                return;
            }
            this.f160786a.mo113396k().mo113266a(1);
            if (this.f160786a.mo113396k().mo113264a().getCurrentTabIndex() == 0 && (c = C70455f.m124271c(cVar)) != null) {
                this.f160786a.mo113378a(c, cVar);
                C71780o.m126724a(this.f160786a.mo113398m(), cVar, 0, false, 6);
            }
        }
    }

    /* renamed from: B */
    public final void mo113373B() {
        if (this.f160705n) {
            mo113402q().mo113436k();
            this.f160705n = false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.f$ah */
    static final class C71703ah extends AbstractC89220m implements AbstractC89171a<EditMusicViewModel> {

        /* renamed from: a */
        final /* synthetic */ C71693f f160729a;

        static {
            Covode.recordClassIndex(84248);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C71703ah(C71693f fVar) {
            super(0);
            this.f160729a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ EditMusicViewModel invoke() {
            Activity b = C2556g.m7473b(this.f160729a);
            Objects.requireNonNull(b, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            JediViewModel a = C20531t.m38716a((ActivityC0945e) b).mo33800a(EditMusicViewModel.class);
            C89219l.m154716b(a, "");
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.f$e */
    public static final class C71735e extends AbstractC89220m implements AbstractC89171a<AbstractC46036a> {

        /* renamed from: a */
        final /* synthetic */ C71693f f160763a;

        static {
            Covode.recordClassIndex(84280);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C71735e(C71693f fVar) {
            super(0);
            this.f160763a = fVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.aweme.editSticker.text.als.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.editSticker.text.als.AbstractC46036a invoke() {
            /*
                r2 = this;
                com.ss.android.ugc.aweme.shortvideo.editcut.f r0 = r2.f160763a
                android.app.Activity r1 = com.bytedance.als.dsl.C2556g.m7473b(r0)
                java.lang.String r0 = "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity"
                java.util.Objects.requireNonNull(r1, r0)
                androidx.fragment.app.e r1 = (androidx.fragment.app.ActivityC0945e) r1
                com.bytedance.als.ApiCenter r1 = com.bytedance.als.ApiCenter.C2545a.m7450a(r1)
                java.lang.Class<com.ss.android.ugc.aweme.editSticker.text.als.a> r0 = com.p2082ss.android.ugc.aweme.editSticker.text.als.AbstractC46036a.class
                com.bytedance.als.b r0 = r1.mo7013a(r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.editcut.C71693f.C71735e.invoke():com.bytedance.als.b");
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.editcut.AbstractC71692e
    /* renamed from: a */
    public final void mo113369a() {
        mo113396k().mo33689c(EditAdjustClipsBottomViewModel.C71543j.f160333a);
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        C89219l.m154721d(this, "");
        C21582f fVar = C2552c.m7461a(this).f7697e;
        if (fVar == null) {
            C89219l.m154715b();
        }
        return fVar;
    }

    @Override // com.bytedance.als.AbstractC2562j, com.bytedance.als.AbstractC2557e
    public final void onDestroy() {
        super.onDestroy();
        C80332db o = mo113400o();
        o.f179860a.evictAll();
        o.f179861b.clear();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.editcut.AbstractC71775m
    /* renamed from: u */
    public final void mo113406u() {
        C71780o m = mo113398m();
        m.mo113445d().mo111012a(m.mo113446e());
        C71746p.m126658a("apply_smart_sync", mo113388d(), C71748q.f160777a);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.editcut.AbstractC71775m
    /* renamed from: v */
    public final void mo113407v() {
        if (!C71558b.m126458a(mo113393h())) {
            mo113390e().mo114791P();
        } else {
            C2556g.m7473b(this).finish();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.f$ae */
    static final class C71700ae extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C71693f f160723a;

        /* renamed from: b */
        final /* synthetic */ MultiEditVideoStatusRecordData f160724b;

        static {
            Covode.recordClassIndex(84245);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C71700ae(C71693f fVar, MultiEditVideoStatusRecordData multiEditVideoStatusRecordData) {
            super(0);
            this.f160723a = fVar;
            this.f160724b = multiEditVideoStatusRecordData;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            if (this.f160723a.f160700i) {
                this.f160723a.f160700i = false;
                this.f160723a.mo113394i().mo110473a(this.f160724b.currentEditIndex, this.f160724b.currentEditIndex);
                this.f160723a.mo113402q().f160832b = true;
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: c */
    public final C89378p<Long, Long> mo113385c() {
        C0692e<Long, Long> playBoundary;
        AbstractC70527h hVar = this.f160706o;
        long j = 0L;
        if (hVar == null || (playBoundary = hVar.getPlayBoundary()) == null) {
            return C89387v.m154943a(0L, Long.valueOf(mo113402q().mo113418a()));
        }
        F f = playBoundary.f2750a;
        if (f != null) {
            j = f;
        }
        Object obj = playBoundary.f2751b;
        if (obj == null) {
            obj = Long.valueOf(mo113402q().mo113418a());
        }
        return C89387v.m154943a(j, obj);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.editcut.AbstractC71775m
    /* renamed from: s */
    public final void mo113404s() {
        EditAdjustClipsBottomViewState a = mo113396k().mo113264a();
        C71725at atVar = new C71725at(this, a);
        if (C70976bp.m125321q(mo113388d()) || mo113392g().mo127683f()) {
            C71423a.m126140b(C2556g.m7473b(this), new C71724as(atVar));
        } else {
            atVar.invoke();
        }
        C71427b.m126142a(a.getCurrentEditIndex());
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.editcut.AbstractC71775m
    /* renamed from: t */
    public final void mo113405t() {
        int currentEditOriginIndex = mo113396k().mo113264a().getCurrentEditOriginIndex();
        VideoSegment videoSegment = mo113395j().mo111232k().get(currentEditOriginIndex);
        mo113394i().mo110475a(videoSegment);
        EditAdjustClipsBottomViewModel k = mo113396k();
        C89219l.m154716b(videoSegment, "");
        C89219l.m154721d(videoSegment, "");
        k.mo33690d(new EditAdjustClipsBottomViewModel.C71536c(currentEditOriginIndex, videoSegment));
    }

    /* renamed from: y */
    public final void mo113410y() {
        int i;
        String str;
        mo113388d().copyMultiEditMusicInfo();
        MultiEditVideoRecordData multiEditVideoRecordData = mo113388d().multiEditVideoRecordData.curMultiEditVideoRecordData;
        if (this.f160698g && multiEditVideoRecordData.musicPath == null) {
            C69905c cVar = mo113398m().f160879b;
            if (cVar != null) {
                str = cVar.path;
            } else {
                str = null;
            }
            multiEditVideoRecordData.musicPath = str;
        }
        if (this.f160698g) {
            i = this.f160716z;
        } else {
            i = mo113390e().mo114813d().f200148i;
        }
        multiEditVideoRecordData.musicIndex = i;
        multiEditVideoRecordData.musicDuration = C80418fa.m139406a(multiEditVideoRecordData.musicPath);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public final void mo113411z() {
        mo113402q().mo113424a(true, (C89378p<Long, Long>) null);
        float f = 0.0f;
        if (!this.f160698g) {
            this.f160698g = true;
            mo113388d().editMusicSyncMode = true;
            mo113396k().mo113268a(true);
            mo113388d().voiceVolume = 0.0f;
            mo113401p().mo127543c(false);
        }
        mo113396k().mo113269b();
        EditAdjustClipsBottomViewModel k = mo113396k();
        AbstractC70527h hVar = this.f160706o;
        if (hVar != null) {
            f = hVar.getSelectedTime();
        }
        k.mo113265a(f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.f$av */
    public static final class C71727av extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C71693f f160754a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89171a f160755b;

        static {
            Covode.recordClassIndex(84272);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C71727av(C71693f fVar, AbstractC89171a aVar) {
            super(0);
            this.f160754a = fVar;
            this.f160755b = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            C85553b a;
            String[] strArr;
            boolean z;
            this.f160754a.mo113390e().mo114805a((AbstractC72510a) false, false, false);
            AbstractC31071f fVar = this.f160754a.f160701j;
            if (fVar != null) {
                fVar.mo56357f(false);
            }
            C71693f fVar2 = this.f160754a;
            AbstractC31071f fVar3 = fVar2.f160701j;
            if (!(fVar3 == null || (a = fVar3.mo56300a()) == null || (strArr = a.f191684e) == null)) {
                String str = (String) C89064i.m154503d(strArr);
                if (str == null || !C84902i.m145892a(str) || TextUtils.isEmpty(str) || C84896h.m145876i(str) <= 0) {
                    z = false;
                } else {
                    z = true;
                }
                C84911q.m145921a("resetResIfNeeded:".concat(String.valueOf(z)));
                if (z) {
                    AbstractC70076i iVar = fVar2.mo113402q().f160837g;
                    if (!(iVar instanceof C71688d)) {
                        iVar = null;
                    }
                    C71688d dVar = (C71688d) iVar;
                    if (dVar != null) {
                        AbstractC70076i.C70077a.m123718a(dVar, true, null, 2);
                    }
                }
            }
            this.f160754a.mo113392g().mo127677a(false);
            if (!this.f160754a.f160713v.mo36421f(this.f160754a.mo113403r())) {
                this.f160754a.f160713v.mo36387a(this.f160754a.f160714w, this.f160754a.mo113403r(), "EditAdjustClipsRootScene");
            }
            this.f160754a.mo113403r().mo113416a(true, (AbstractC89171a<C89391z>) new AbstractC89171a<C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.shortvideo.editcut.C71693f.C71727av.C717281 */

                /* renamed from: a */
                final /* synthetic */ C71727av f160756a;

                static {
                    Covode.recordClassIndex(84273);
                }

                {
                    this.f160756a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // p4600h.p4611f.p4612a.AbstractC89171a
                public final /* synthetic */ C89391z invoke() {
                    float f;
                    this.f160756a.f160754a.f160699h = true;
                    C71693f fVar = this.f160756a.f160754a;
                    if (!fVar.f160696e) {
                        fVar.f160696e = true;
                        if (!fVar.f160700i) {
                            fVar.mo113395j().mo111208a(fVar.mo113393h().f160355b ? 1 : 0);
                        }
                        fVar.mo113395j().f157689n.observe(fVar.mo113403r(), new C71705aj(fVar));
                        fVar.mo113395j().f157677b.observe(fVar.mo113403r(), new C71706ak(fVar));
                        fVar.mo113395j().f157685j.observe(fVar, new C71707al(fVar));
                        fVar.mo113395j().f157683h.observe(fVar, new C71708am(fVar));
                        fVar.mo113395j().f157686k.observe(fVar, new C71709an(fVar));
                        fVar.mo113395j().f157688m.observe(fVar, new C71710ao(fVar));
                        AbstractC88412b unused = fVar.mo113396k().mo33677a(fVar, C71761i.f160796a, new C20370ah(), new C71711ap(fVar));
                    }
                    this.f160756a.f160754a.mo113410y();
                    this.f160756a.f160754a.mo113402q().mo113437l();
                    this.f160756a.f160754a.f160705n = true;
                    this.f160756a.f160754a.mo113397l().mo127279b(false);
                    this.f160756a.f160754a.f160707p = this.f160756a.f160754a.f160698g;
                    VEEditorAutoStartStopArbiter value = this.f160756a.f160754a.mo113390e().mo114779D().getValue();
                    if (value != null) {
                        value.f200066a = false;
                    }
                    this.f160756a.f160754a.mo113402q().mo113423a(true, (AbstractC89171a<C89378p<Long, Long>>) new AbstractC89171a<C89378p<? extends Long, ? extends Long>>(this) {
                        /* class com.p2082ss.android.ugc.aweme.shortvideo.editcut.C71693f.C71727av.C717281.C717291 */

                        /* renamed from: a */
                        final /* synthetic */ C717281 f160757a;

                        static {
                            Covode.recordClassIndex(84274);
                        }

                        {
                            this.f160757a = r2;
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        @Override // p4600h.p4611f.p4612a.AbstractC89171a
                        public final /* synthetic */ C89378p<? extends Long, ? extends Long> invoke() {
                            return this.f160757a.f160756a.f160754a.mo113385c();
                        }
                    });
                    EditAdjustClipsBottomViewModel k = this.f160756a.f160754a.mo113396k();
                    AbstractC70527h hVar = this.f160756a.f160754a.f160706o;
                    if (hVar != null) {
                        f = hVar.getSelectedTime();
                    } else {
                        f = 0.0f;
                    }
                    k.mo113265a(f);
                    AbstractC89171a aVar = this.f160756a.f160755b;
                    if (aVar != null) {
                        aVar.invoke();
                    }
                    Activity b = C2556g.m7473b(this.f160756a.f160754a);
                    if (!(b instanceof AbstractC84919c)) {
                        b = null;
                    }
                    AbstractC84919c cVar = (AbstractC84919c) b;
                    if (cVar != null) {
                        cVar.mo87533b(this.f160756a.f160754a.f160712u);
                    }
                    return C89391z.f203057a;
                }
            });
            return C89391z.f203057a;
        }
    }

    /* renamed from: A */
    public final void mo113372A() {
        long j;
        int i;
        C71776n q = mo113402q();
        C89378p<Long, Long> c = mo113385c();
        AbstractC70527h hVar = this.f160706o;
        long j2 = 0;
        if (hVar != null) {
            j = hVar.getLeftSeekingValue();
        } else {
            j = 0;
        }
        Long valueOf = Long.valueOf(j);
        AbstractC70527h hVar2 = this.f160706o;
        if (hVar2 != null) {
            j2 = hVar2.getRightSeekingValue();
        }
        q.mo113422a(c, C89387v.m154943a(valueOf, Long.valueOf(j2)));
        mo113373B();
        C71776n q2 = mo113402q();
        AbstractC31071f fVar = this.f160701j;
        if (fVar != null) {
            i = fVar.mo56368j();
        } else {
            i = -1;
        }
        C71776n.m126699a(q2, i, 1);
        AbstractC31071f fVar2 = this.f160701j;
        if (fVar2 != null) {
            int j3 = fVar2.mo56368j();
            mo113388d().setVideoLength(j3);
            m126609C().mo127331a(j3);
            mo113391f().mo112155a(j3);
            mo113391f().mo112157b(j3);
            mo113392g().mo127675a(C89387v.m154943a(Integer.valueOf(fVar2.mo56246G()), Integer.valueOf(j3)));
            mo113392g().mo127672a(j3);
        }
        AbstractC83233s D = m126610D();
        if (D != null) {
            D.mo128236a();
        }
        mo113391f().mo112159e();
        mo113392g().mo127687j();
        AbstractC71793q.C71794a.m126761a(mo113399n(), -1, null, false, 6);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.editcut.AbstractC71775m
    /* renamed from: x */
    public final void mo113409x() {
        Cut2EditTransferModel cut2EditTransferModel;
        List<C69905c> musicList;
        if (mo113396k().mo113264a().getStickPointStatus() != 0) {
            int i = 0;
            mo113396k().mo113266a(0);
            C69905c cVar = C70005cr.m123611a().f156482a;
            if (cVar == null && ((cut2EditTransferModel = mo113393h().f160358e) == null || (musicList = cut2EditTransferModel.getMusicList()) == null || (cVar = (C69905c) C89070n.m154561b((List) musicList, 0)) == null)) {
                mo113396k().mo113266a(0);
                int size = mo113402q().mo113428c().size();
                StringBuilder sb = new StringBuilder();
                for (T t : mo113402q().mo113428c()) {
                    int i2 = i + 1;
                    if (i < 0) {
                        C89070n.m154520a();
                    }
                    sb.append(t.f156710b);
                    if (i < size - 1) {
                        sb.append(",");
                    }
                    i = i2;
                }
                C70465j.m124298a().mo110977a(m126613a(C2556g.m7473b(this)), size, sb.toString(), new C71753v(this));
                return;
            }
            C84911q.m145921a("force apply music sync with valid music");
            mo113396k().mo113266a(1);
            C71780o.m126724a(mo113398m(), cVar, mo113388d().mMusicStart, false, 4);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.f$at */
    static final class C71725at extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C71693f f160751a;

        /* renamed from: b */
        final /* synthetic */ EditAdjustClipsBottomViewState f160752b;

        static {
            Covode.recordClassIndex(84270);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C71725at(C71693f fVar, EditAdjustClipsBottomViewState editAdjustClipsBottomViewState) {
            super(0);
            this.f160751a = fVar;
            this.f160752b = editAdjustClipsBottomViewState;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            VEVideoPublishEditActivity vEVideoPublishEditActivity;
            Intent a;
            C71776n q = this.f160751a.mo113402q();
            int currentEditIndex = this.f160752b.getCurrentEditIndex();
            RetakeVideoContext retakeVideoContext = new RetakeVideoContext();
            retakeVideoContext.f155734d = C71493a.m126273a(q.mo113429d());
            retakeVideoContext.f155733c = currentEditIndex;
            long j = 0;
            for (int i = 0; i < currentEditIndex; i++) {
                if (q.mo113429d().segmentDataList.get(i).enable) {
                    j += q.mo113429d().segmentDataList.get(i).videoLength;
                }
            }
            retakeVideoContext.f155732b = j / 1000;
            List<MultiEditVideoSegmentRecordData> list = q.mo113429d().segmentDataList;
            C89219l.m154716b(list, "");
            ArrayList arrayList = new ArrayList();
            for (T t : list) {
                if (t.enable) {
                    arrayList.add(t);
                }
            }
            ArrayList arrayList2 = arrayList;
            if (currentEditIndex < arrayList2.size()) {
                retakeVideoContext.f155731a = ((MultiEditVideoSegmentRecordData) arrayList2.get(currentEditIndex)).videoLength / 1000;
                retakeVideoContext.mo109993a(q.mo113429d().curRecordingDir + File.separator + "new");
                MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = new MultiEditVideoStatusRecordData();
                q.mo113429d().hasRetake = true;
                multiEditVideoStatusRecordData.currentEditIndex = currentEditIndex;
                multiEditVideoStatusRecordData.originalSegments = q.mo113431f().f160357d.originalSegments;
                multiEditVideoStatusRecordData.restoreSegments = q.f160843m;
                multiEditVideoStatusRecordData.editSegments = q.f160845o;
                multiEditVideoStatusRecordData.singleRestoreSegments = q.f160844n;
                multiEditVideoStatusRecordData.curMultiEditVideoRecordData = q.mo113429d();
                MultiEditVideoRecordData multiEditVideoRecordData = q.f160840j;
                if (multiEditVideoRecordData == null) {
                    C89219l.m154710a("originRecordData");
                }
                multiEditVideoStatusRecordData.originMultiEditRecordData = multiEditVideoRecordData;
                MultiEditVideoRecordData multiEditVideoRecordData2 = q.f160839i;
                if (multiEditVideoRecordData2 == null) {
                    C89219l.m154710a("restoreRecordData");
                }
                multiEditVideoStatusRecordData.restoreMultiEditVideoRecordData = multiEditVideoRecordData2;
                multiEditVideoStatusRecordData.singleRestoreMultiEditRecordData = C71429d.m126153a(q.mo113429d(), (MultiEditVideoRecordData) null);
                multiEditVideoStatusRecordData.recordMusic = q.mo113431f().f160357d.recordMusic;
                multiEditVideoStatusRecordData.originalMusicStart = q.mo113431f().f160357d.originalMusicStart;
                retakeVideoContext.f155735e = multiEditVideoStatusRecordData;
                Activity b = C2556g.m7473b(this.f160751a);
                if (!this.f160751a.mo113388d().mIsFromDraft) {
                    C82080c.m142102a(new AbstractC82074b.C82078d(C2556g.m7473b(this.f160751a), retakeVideoContext));
                } else if ((b instanceof VEVideoPublishEditActivity) && (a = (vEVideoPublishEditActivity = (VEVideoPublishEditActivity) b).mo111757a(this.f160751a.mo113388d())) != null) {
                    a.putExtra("retake_video", retakeVideoContext);
                    a.putExtra("retake_shoot_mode", 1);
                    vEVideoPublishEditActivity.mo111758a(a, this.f160751a.mo113388d());
                }
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.als.AbstractC2562j
    public final void onCreate() {
        C89378p<Long, Long> pVar;
        EditAdjustClipsState editAdjustClipsState;
        EditAdjustClipsState editAdjustClipsState2;
        super.onCreate();
        C71713ar arVar = new C71713ar(this);
        C89219l.m154721d(this, "");
        C89219l.m154721d(arVar, "");
        OCAdapterViewModel a = C2556g.m7469a((AbstractC2557e<?>) this);
        C21597n nVar = a.f7716a;
        C89378p<Long, Long> pVar2 = null;
        C89219l.m154709a((Object) nVar.mo35261a(AbstractC2557e.class, (String) null, this), "");
        arVar.invoke(nVar);
        a.mo7022a();
        a.mo7023b();
        new C2551b(C2552c.m7461a(this)).mo7031a();
        mo113390e().mo114778C().observe(this, new C71756x(this));
        mo113390e().mo114817f().observe(this, new C71757y(this));
        mo113390e().mo114786K().observe(this, new C71758z(this));
        AbstractC88412b unused = mo113396k().mo33677a(this, C71759g.f160794a, new C20370ah(), new C71695aa(this));
        if (C71558b.m126459b(mo113393h())) {
            selectNonNullSubscribe(mo113396k(), C71760h.f160795a, new C20370ah(), new C71696ab(this));
            mo113390e().mo114836y().observe(this, new C71697ac(this));
            mo113397l().mo127280g().mo7038b(this, new C71698ad(this));
        }
        C71776n q = mo113402q();
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = q.mo113430e().multiEditVideoRecordData;
        if (multiEditVideoStatusRecordData != null && multiEditVideoStatusRecordData.curMultiEditVideoRecordData != null && !C84904k.m145909a(multiEditVideoStatusRecordData.curMultiEditVideoRecordData.segmentDataList)) {
            q.f160850t = multiEditVideoStatusRecordData.isMultiEditRetake;
            ArrayList<TimeSpeedModelExtension> arrayList = multiEditVideoStatusRecordData.originalSegments;
            if (arrayList != null) {
                q.f160842l = arrayList;
                ArrayList<TimeSpeedModelExtension> arrayList2 = multiEditVideoStatusRecordData.editSegments;
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<>(arrayList);
                }
                q.f160845o = arrayList2;
                ArrayList<TimeSpeedModelExtension> arrayList3 = multiEditVideoStatusRecordData.restoreSegments;
                if (arrayList3 == null) {
                    arrayList3 = new ArrayList<>(q.f160845o);
                }
                q.f160843m = arrayList3;
                ArrayList<TimeSpeedModelExtension> arrayList4 = multiEditVideoStatusRecordData.singleRestoreSegments;
                if (arrayList4 == null) {
                    ArrayList<TimeSpeedModelExtension> arrayList5 = q.f160843m;
                    if (arrayList5 == null) {
                        C89219l.m154715b();
                    }
                    arrayList4 = new ArrayList<>(arrayList5);
                }
                q.f160844n = arrayList4;
                if (multiEditVideoStatusRecordData.segmentSizeChange) {
                    q.f160844n = q.f160845o;
                }
            }
            if (multiEditVideoStatusRecordData.restoreMultiEditVideoRecordData == null) {
                q.f160839i = C71429d.m126153a(multiEditVideoStatusRecordData.curMultiEditVideoRecordData, (MultiEditVideoRecordData) null);
            } else {
                MultiEditVideoRecordData multiEditVideoRecordData = multiEditVideoStatusRecordData.restoreMultiEditVideoRecordData;
                C89219l.m154716b(multiEditVideoRecordData, "");
                q.f160839i = multiEditVideoRecordData;
            }
            if (multiEditVideoStatusRecordData.singleRestoreMultiEditRecordData == null) {
                q.f160841k = C71429d.m126153a(multiEditVideoStatusRecordData.curMultiEditVideoRecordData, (MultiEditVideoRecordData) null);
            } else {
                q.f160841k = multiEditVideoStatusRecordData.singleRestoreMultiEditRecordData;
            }
            q.f160840j = C71429d.m126153a(q.mo113429d(), (MultiEditVideoRecordData) null);
            if (q.mo113430e().mIsFromDraft) {
                MultiEditVideoStatusRecordData multiEditVideoStatusRecordData2 = q.mo113430e().multiEditVideoRecordData;
                if (multiEditVideoStatusRecordData2 == null || (editAdjustClipsState2 = multiEditVideoStatusRecordData2.adjustClipsState) == null) {
                    pVar = null;
                } else {
                    pVar = editAdjustClipsState2.getLastEditBoundary();
                }
                q.f160848r = pVar;
                MultiEditVideoStatusRecordData multiEditVideoStatusRecordData3 = q.mo113430e().multiEditVideoRecordData;
                if (!(multiEditVideoStatusRecordData3 == null || (editAdjustClipsState = multiEditVideoStatusRecordData3.adjustClipsState) == null)) {
                    pVar2 = editAdjustClipsState.getViewBoundary();
                }
                q.f160849s = pVar2;
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.editcut.AbstractC71792p
    /* renamed from: a */
    public final void mo113374a(int i) {
        this.f160716z = i;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.f$ar */
    static final class C71713ar extends AbstractC89220m implements AbstractC89172b<C21597n, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C71693f f160740a;

        static {
            Covode.recordClassIndex(84258);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C71713ar(C71693f fVar) {
            super(1);
            this.f160740a = fVar;
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.f$ar$a */
        public static final class C71714a extends AbstractC21603p<C71557a> {

            /* renamed from: a */
            final /* synthetic */ C71713ar f160741a;

            static {
                Covode.recordClassIndex(84259);
            }

            public C71714a(C71713ar arVar) {
                this.f160741a = arVar;
            }

            @Override // com.bytedance.p1559o.AbstractC21603p
            public final C71557a get(C21582f fVar) {
                boolean z;
                MultiEditVideoRecordData multiEditVideoRecordData;
                List<MultiEditVideoSegmentRecordData> list;
                C89219l.m154721d(fVar, "");
                MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = this.f160741a.f160740a.mo113388d().multiEditVideoRecordData;
                if (multiEditVideoStatusRecordData == null || !multiEditVideoStatusRecordData.isMultiEditRetake) {
                    MultiEditVideoStatusRecordData multiEditVideoStatusRecordData2 = this.f160741a.f160740a.mo113388d().multiEditVideoRecordData;
                    if (!(multiEditVideoStatusRecordData2 == null || (multiEditVideoRecordData = multiEditVideoStatusRecordData2.curMultiEditVideoRecordData) == null)) {
                        list = multiEditVideoRecordData.segmentDataList;
                    }
                    z = false;
                    int original = this.f160741a.f160740a.mo113388d().getOriginal();
                    VideoPublishEditModel d = this.f160741a.f160740a.mo113388d();
                    MultiEditVideoStatusRecordData multiEditVideoStatusRecordData3 = this.f160741a.f160740a.mo113388d().multiEditVideoRecordData;
                    C89219l.m154716b(multiEditVideoStatusRecordData3, "");
                    return new C71557a(original, z, d, multiEditVideoStatusRecordData3, this.f160741a.f160740a.mo113388d().cut2EditTransferModel);
                }
                MultiEditVideoRecordData multiEditVideoRecordData2 = this.f160741a.f160740a.mo113388d().multiEditVideoRecordData.restoreMultiEditVideoRecordData;
                if (multiEditVideoRecordData2 != null) {
                    list = multiEditVideoRecordData2.segmentDataList;
                }
                z = false;
                int original2 = this.f160741a.f160740a.mo113388d().getOriginal();
                VideoPublishEditModel d2 = this.f160741a.f160740a.mo113388d();
                MultiEditVideoStatusRecordData multiEditVideoStatusRecordData32 = this.f160741a.f160740a.mo113388d().multiEditVideoRecordData;
                C89219l.m154716b(multiEditVideoStatusRecordData32, "");
                return new C71557a(original2, z, d2, multiEditVideoStatusRecordData32, this.f160741a.f160740a.mo113388d().cut2EditTransferModel);
                if (list != null && list.size() > 1) {
                    z = true;
                    int original22 = this.f160741a.f160740a.mo113388d().getOriginal();
                    VideoPublishEditModel d22 = this.f160741a.f160740a.mo113388d();
                    MultiEditVideoStatusRecordData multiEditVideoStatusRecordData322 = this.f160741a.f160740a.mo113388d().multiEditVideoRecordData;
                    C89219l.m154716b(multiEditVideoStatusRecordData322, "");
                    return new C71557a(original22, z, d22, multiEditVideoStatusRecordData322, this.f160741a.f160740a.mo113388d().cut2EditTransferModel);
                }
                z = false;
                int original222 = this.f160741a.f160740a.mo113388d().getOriginal();
                VideoPublishEditModel d222 = this.f160741a.f160740a.mo113388d();
                MultiEditVideoStatusRecordData multiEditVideoStatusRecordData3222 = this.f160741a.f160740a.mo113388d().multiEditVideoRecordData;
                C89219l.m154716b(multiEditVideoStatusRecordData3222, "");
                return new C71557a(original222, z, d222, multiEditVideoStatusRecordData3222, this.f160741a.f160740a.mo113388d().cut2EditTransferModel);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.f$ar$b */
        public static final class C71715b extends AbstractC21603p<CutVideoSpeedViewModel> {

            /* renamed from: a */
            final /* synthetic */ C71713ar f160742a;

            static {
                Covode.recordClassIndex(84260);
            }

            public C71715b(C71713ar arVar) {
                this.f160742a = arVar;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel, com.bytedance.jedi.arch.JediViewModel] */
            /* JADX WARNING: Unknown variable types count: 1 */
            @Override // com.bytedance.p1559o.AbstractC21603p
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final com.p2082ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel get(com.bytedance.p1559o.C21582f r3) {
                /*
                    r2 = this;
                    java.lang.String r0 = ""
                    p4600h.p4611f.p4613b.C89219l.m154721d(r3, r0)
                    com.ss.android.ugc.aweme.shortvideo.editcut.f$ar r0 = r2.f160742a
                    com.ss.android.ugc.aweme.shortvideo.editcut.f r0 = r0.f160740a
                    android.app.Activity r1 = com.bytedance.als.dsl.C2556g.m7473b(r0)
                    java.lang.String r0 = "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity"
                    java.util.Objects.requireNonNull(r1, r0)
                    androidx.fragment.app.e r1 = (androidx.fragment.app.ActivityC0945e) r1
                    com.bytedance.jedi.arch.s r1 = com.bytedance.jedi.arch.C20531t.m38716a(r1)
                    java.lang.Class<com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel> r0 = com.p2082ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel.class
                    com.bytedance.jedi.arch.JediViewModel r0 = r1.mo33800a(r0)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.editcut.C71693f.C71713ar.C71715b.get(com.bytedance.o.f):java.lang.Object");
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.f$ar$c */
        public static final class C71716c extends AbstractC21603p<C71780o> {

            /* renamed from: a */
            final /* synthetic */ C71713ar f160743a;

            static {
                Covode.recordClassIndex(84261);
            }

            public C71716c(C71713ar arVar) {
                this.f160743a = arVar;
            }

            @Override // com.bytedance.p1559o.AbstractC21603p
            public final C71780o get(C21582f fVar) {
                C89219l.m154721d(fVar, "");
                Activity b = C2556g.m7473b(this.f160743a.f160740a);
                Objects.requireNonNull(b, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                return new C71780o((ActivityC0945e) b, this.f160743a.f160740a);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.f$ar$e */
        public static final class C71718e extends AbstractC21603p<C80332db> {

            /* renamed from: a */
            final /* synthetic */ C71713ar f160744a;

            static {
                Covode.recordClassIndex(84263);
            }

            public C71718e(C71713ar arVar) {
                this.f160744a = arVar;
            }

            @Override // com.bytedance.p1559o.AbstractC21603p
            public final C80332db get(C21582f fVar) {
                C89219l.m154721d(fVar, "");
                return this.f160744a.f160740a.mo113400o();
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.f$ar$f */
        public static final class C71719f extends AbstractC21603p<CutMultiVideoViewModel> {

            /* renamed from: a */
            final /* synthetic */ C71713ar f160745a;

            static {
                Covode.recordClassIndex(84264);
            }

            public C71719f(C71713ar arVar) {
                this.f160745a = arVar;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [androidx.lifecycle.ac, com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel] */
            /* JADX WARN: Type inference failed for: r0v8, types: [androidx.lifecycle.ac, com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel] */
            /* JADX WARNING: Unknown variable types count: 2 */
            @Override // com.bytedance.p1559o.AbstractC21603p
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final com.p2082ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel get(com.bytedance.p1559o.C21582f r5) {
                /*
                    r4 = this;
                    java.lang.String r0 = ""
                    p4600h.p4611f.p4613b.C89219l.m154721d(r5, r0)
                    com.ss.android.ugc.aweme.shortvideo.editcut.f$ar r0 = r4.f160745a
                    com.ss.android.ugc.aweme.shortvideo.editcut.f r0 = r0.f160740a
                    android.app.Activity r1 = com.bytedance.als.dsl.C2556g.m7473b(r0)
                    java.lang.String r0 = "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity"
                    java.util.Objects.requireNonNull(r1, r0)
                    androidx.fragment.app.e r1 = (androidx.fragment.app.ActivityC0945e) r1
                    r0 = 0
                    androidx.lifecycle.ad r3 = androidx.lifecycle.C1181ae.m3881a(r1, r0)
                    java.lang.String r2 = "key_multi_video_edit_model"
                    java.lang.Class<com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel> r1 = com.p2082ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel.class
                    java.lang.Class<com.bytedance.provider.vm.ScopeViewModel> r0 = com.bytedance.provider.p1587vm.ScopeViewModel.class
                    boolean r0 = r1.equals(r0)
                    if (r0 == 0) goto L_0x002a
                    androidx.lifecycle.ac r0 = r3.mo3984a(r2, r1)
                L_0x0029:
                    return r0
                L_0x002a:
                    androidx.lifecycle.ac r0 = r3.mo3984a(r2, r1)
                    androidx.lifecycle.C1171ab.m3870a(r0, r3)
                    goto L_0x0029
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.editcut.C71693f.C71713ar.C71719f.get(com.bytedance.o.f):java.lang.Object");
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.f$ar$g */
        public static final class C71720g extends AbstractC21603p<C71559b> {

            /* renamed from: a */
            final /* synthetic */ C71713ar f160746a;

            static {
                Covode.recordClassIndex(84265);
            }

            public C71720g(C71713ar arVar) {
                this.f160746a = arVar;
            }

            @Override // com.bytedance.p1559o.AbstractC21603p
            public final C71559b get(C21582f fVar) {
                C89219l.m154721d(fVar, "");
                return new C71559b(this.f160746a.f160740a, fVar);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.f$ar$h */
        public static final class C71721h extends AbstractC21603p<VideoEditViewModel> {

            /* renamed from: a */
            final /* synthetic */ C71713ar f160747a;

            static {
                Covode.recordClassIndex(84266);
            }

            public C71721h(C71713ar arVar) {
                this.f160747a = arVar;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [androidx.lifecycle.ac, com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel] */
            /* JADX WARN: Type inference failed for: r0v8, types: [androidx.lifecycle.ac, com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel] */
            /* JADX WARNING: Unknown variable types count: 2 */
            @Override // com.bytedance.p1559o.AbstractC21603p
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel get(com.bytedance.p1559o.C21582f r5) {
                /*
                    r4 = this;
                    java.lang.String r0 = ""
                    p4600h.p4611f.p4613b.C89219l.m154721d(r5, r0)
                    com.ss.android.ugc.aweme.shortvideo.editcut.f$ar r0 = r4.f160747a
                    com.ss.android.ugc.aweme.shortvideo.editcut.f r0 = r0.f160740a
                    android.app.Activity r1 = com.bytedance.als.dsl.C2556g.m7473b(r0)
                    java.lang.String r0 = "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity"
                    java.util.Objects.requireNonNull(r1, r0)
                    androidx.fragment.app.e r1 = (androidx.fragment.app.ActivityC0945e) r1
                    r0 = 0
                    androidx.lifecycle.ad r3 = androidx.lifecycle.C1181ae.m3881a(r1, r0)
                    java.lang.String r2 = "key_video_edit_view_model"
                    java.lang.Class<com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel> r1 = com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel.class
                    java.lang.Class<com.bytedance.provider.vm.ScopeViewModel> r0 = com.bytedance.provider.p1587vm.ScopeViewModel.class
                    boolean r0 = r1.equals(r0)
                    if (r0 == 0) goto L_0x002a
                    androidx.lifecycle.ac r0 = r3.mo3984a(r2, r1)
                L_0x0029:
                    return r0
                L_0x002a:
                    androidx.lifecycle.ac r0 = r3.mo3984a(r2, r1)
                    androidx.lifecycle.C1171ab.m3870a(r0, r3)
                    goto L_0x0029
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.editcut.C71693f.C71713ar.C71721h.get(com.bytedance.o.f):java.lang.Object");
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.f$ar$i */
        public static final class C71722i extends AbstractC21603p<VEVideoCutterViewModel> {

            /* renamed from: a */
            final /* synthetic */ C71713ar f160748a;

            static {
                Covode.recordClassIndex(84267);
            }

            public C71722i(C71713ar arVar) {
                this.f160748a = arVar;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [androidx.lifecycle.ac, com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.VEVideoCutterViewModel] */
            /* JADX WARN: Type inference failed for: r0v8, types: [androidx.lifecycle.ac, com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.VEVideoCutterViewModel] */
            /* JADX WARNING: Unknown variable types count: 2 */
            @Override // com.bytedance.p1559o.AbstractC21603p
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final com.p2082ss.android.ugc.aweme.shortvideo.cut.viewmodel.VEVideoCutterViewModel get(com.bytedance.p1559o.C21582f r5) {
                /*
                    r4 = this;
                    java.lang.String r0 = ""
                    p4600h.p4611f.p4613b.C89219l.m154721d(r5, r0)
                    com.ss.android.ugc.aweme.shortvideo.editcut.f$ar r0 = r4.f160748a
                    com.ss.android.ugc.aweme.shortvideo.editcut.f r0 = r0.f160740a
                    android.app.Activity r1 = com.bytedance.als.dsl.C2556g.m7473b(r0)
                    java.lang.String r0 = "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity"
                    java.util.Objects.requireNonNull(r1, r0)
                    androidx.fragment.app.e r1 = (androidx.fragment.app.ActivityC0945e) r1
                    r0 = 0
                    androidx.lifecycle.ad r3 = androidx.lifecycle.C1181ae.m3881a(r1, r0)
                    java.lang.String r2 = "key_cutter_view_model"
                    java.lang.Class<com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.VEVideoCutterViewModel> r1 = com.p2082ss.android.ugc.aweme.shortvideo.cut.viewmodel.VEVideoCutterViewModel.class
                    java.lang.Class<com.bytedance.provider.vm.ScopeViewModel> r0 = com.bytedance.provider.p1587vm.ScopeViewModel.class
                    boolean r0 = r1.equals(r0)
                    if (r0 == 0) goto L_0x002a
                    androidx.lifecycle.ac r0 = r3.mo3984a(r2, r1)
                L_0x0029:
                    return r0
                L_0x002a:
                    androidx.lifecycle.ac r0 = r3.mo3984a(r2, r1)
                    androidx.lifecycle.C1171ab.m3870a(r0, r3)
                    goto L_0x0029
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.editcut.C71693f.C71713ar.C71722i.get(com.bytedance.o.f):java.lang.Object");
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.f$ar$j */
        public static final class C71723j extends AbstractC21603p<EditAdjustClipsBottomViewModel> {

            /* renamed from: a */
            final /* synthetic */ C71713ar f160749a;

            static {
                Covode.recordClassIndex(84268);
            }

            public C71723j(C71713ar arVar) {
                this.f160749a = arVar;
            }

            @Override // com.bytedance.p1559o.AbstractC21603p
            public final EditAdjustClipsBottomViewModel get(C21582f fVar) {
                C89219l.m154721d(fVar, "");
                Activity b = C2556g.m7473b(this.f160749a.f160740a);
                Objects.requireNonNull(b, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                EditAdjustClipsBottomViewModel editAdjustClipsBottomViewModel = (EditAdjustClipsBottomViewModel) C20531t.m38716a((ActivityC0945e) b).mo33800a(EditAdjustClipsBottomViewModel.class);
                AbstractC1196i lifecycle = this.f160749a.f160740a.getLifecycle();
                C89219l.m154721d(lifecycle, "");
                editAdjustClipsBottomViewModel.f160321a = new EditAdjustClipsBottomViewModel.C71534a(lifecycle);
                return editAdjustClipsBottomViewModel;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.f$ar$d */
        public static final class C71717d extends AbstractC21603p<C72449g> {
            static {
                Covode.recordClassIndex(84262);
            }

            @Override // com.bytedance.p1559o.AbstractC21603p
            public final C72449g get(C21582f fVar) {
                C89219l.m154721d(fVar, "");
                return new C72449g();
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C21597n nVar) {
            C21597n nVar2 = nVar;
            C89219l.m154721d(nVar2, "");
            C89219l.m154716b(nVar2.mo35260a(C71557a.class, (String) null, (AbstractC21603p) new C71714a(this)), "");
            C89219l.m154716b(nVar2.mo35260a(C71780o.class, (String) null, (AbstractC21603p) new C71716c(this)), "");
            C89219l.m154716b(nVar2.mo35260a(C72449g.class, (String) null, (AbstractC21603p) new C71717d()), "");
            C89219l.m154716b(nVar2.mo35260a(C80332db.class, (String) null, (AbstractC21603p) new C71718e(this)), "");
            C89219l.m154716b(nVar2.mo35260a(CutMultiVideoViewModel.class, (String) null, (AbstractC21603p) new C71719f(this)), "");
            C21597n.C21600a a = nVar2.mo35260a(C71559b.class, (String) null, (AbstractC21603p) new C71720g(this));
            C89219l.m154716b(a, "");
            a.mo35263a(AbstractC71793q.class);
            C89219l.m154716b(nVar2.mo35260a(VideoEditViewModel.class, (String) null, (AbstractC21603p) new C71721h(this)), "");
            C89219l.m154716b(nVar2.mo35260a(VEVideoCutterViewModel.class, (String) null, (AbstractC21603p) new C71722i(this)), "");
            C89219l.m154716b(nVar2.mo35260a(EditAdjustClipsBottomViewModel.class, (String) null, (AbstractC21603p) new C71723j(this)), "");
            C89219l.m154716b(nVar2.mo35260a(CutVideoSpeedViewModel.class, (String) null, (AbstractC21603p) new C71715b(this)), "");
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.f$af */
    public static final class C71701af implements AbstractC84917a {

        /* renamed from: a */
        final /* synthetic */ C71693f f160725a;

        static {
            Covode.recordClassIndex(84246);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C71701af(C71693f fVar) {
            this.f160725a = fVar;
        }

        @Override // com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84917a
        public final boolean onKeyDown(int i, KeyEvent keyEvent) {
            if (i != 4) {
                return false;
            }
            Integer editState = this.f160725a.mo113396k().mo113264a().getEditState();
            if (editState != null && editState.intValue() == 2) {
                this.f160725a.mo113394i().mo110479c();
                return true;
            }
            this.f160725a.mo113371a(false);
            return true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.f$al */
    static final class C71707al<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C71693f f160733a;

        static {
            Covode.recordClassIndex(84252);
        }

        C71707al(C71693f fVar) {
            this.f160733a = fVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
            this.f160733a.f160704m = true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.f$am */
    static final class C71708am<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C71693f f160734a;

        static {
            Covode.recordClassIndex(84253);
        }

        C71708am(C71693f fVar) {
            this.f160734a = fVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
            this.f160734a.f160704m = true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.f$an */
    static final class C71709an<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C71693f f160735a;

        static {
            Covode.recordClassIndex(84254);
        }

        C71709an(C71693f fVar) {
            this.f160735a = fVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
            this.f160735a.f160704m = true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.f$ao */
    static final class C71710ao<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C71693f f160736a;

        static {
            Covode.recordClassIndex(84255);
        }

        C71710ao(C71693f fVar) {
            this.f160736a = fVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
            this.f160736a.f160704m = true;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.editcut.AbstractC71775m
    /* renamed from: a */
    public final void mo113376a(AbstractC70527h hVar) {
        C89219l.m154721d(hVar, "");
        this.f160706o = hVar;
    }

    /* renamed from: a */
    private static Context m126613a(Activity activity) {
        Context applicationContext = activity.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            return C58003a.f132199a;
        }
        return applicationContext;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af> S1 getState(VM1 vm1) {
        C89219l.m154721d(vm1, "");
        return (S1) AbstractC20382b.C20383a.m38582a(this, vm1);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.f$aa */
    static final class C71695aa extends AbstractC89220m implements AbstractC89172b<Float, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C71693f f160718a;

        static {
            Covode.recordClassIndex(84240);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C71695aa(C71693f fVar) {
            super(1);
            this.f160718a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Float f) {
            this.f160718a.mo113402q().f160833c = f.floatValue();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.f$ai */
    static final class C71704ai extends AbstractC89220m implements AbstractC89172b<C84425b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C71693f f160730a;

        static {
            Covode.recordClassIndex(84249);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C71704ai(C71693f fVar) {
            super(1);
            this.f160730a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C84425b bVar) {
            C84425b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            bVar2.mo129404a("content_duration_ms", this.f160730a.mo113402q().mo113426b());
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.f$ak */
    static final class C71706ak<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C71693f f160732a;

        static {
            Covode.recordClassIndex(84251);
        }

        C71706ak(C71693f fVar) {
            this.f160732a = fVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            EditAdjustClipsBottomViewModel k = this.f160732a.mo113396k();
            C89219l.m154716b(num, "");
            k.mo33689c(new EditAdjustClipsBottomViewModel.C71547n(num.intValue()));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.f$ap */
    static final class C71711ap extends AbstractC89220m implements AbstractC89172b<C20526p, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C71693f f160737a;

        static {
            Covode.recordClassIndex(84256);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C71711ap(C71693f fVar) {
            super(1);
            this.f160737a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C20526p pVar) {
            C89219l.m154721d(pVar, "");
            this.f160737a.mo113402q().mo113427b(this.f160737a.mo113385c());
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.f$aw */
    public static final class C71730aw extends AbstractC89220m implements AbstractC89172b<C84425b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ boolean f160758a;

        static {
            Covode.recordClassIndex(84275);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C71730aw(boolean z) {
            super(1);
            this.f160758a = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C84425b bVar) {
            String str;
            C84425b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            if (this.f160758a) {
                str = "sync_on";
            } else {
                str = "sync_off";
            }
            bVar2.mo129406a("to_status", str);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.f$q */
    static final class C71748q extends AbstractC89220m implements AbstractC89172b<C84425b, C89391z> {

        /* renamed from: a */
        public static final C71748q f160777a = new C71748q();

        static {
            Covode.recordClassIndex(84293);
        }

        C71748q() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C84425b bVar) {
            C84425b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            bVar2.mo129406a("to_status", "on");
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.f$w */
    public static final class C71754w extends AbstractC89220m implements AbstractC89172b<Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C71693f f160787a;

        /* renamed from: b */
        final /* synthetic */ boolean f160788b;

        static {
            Covode.recordClassIndex(84299);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C71754w(C71693f fVar, boolean z) {
            super(1);
            this.f160787a = fVar;
            this.f160788b = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Boolean bool) {
            final boolean booleanValue = bool.booleanValue();
            this.f160787a.mo113403r().mo113416a(false, (AbstractC89171a<C89391z>) new AbstractC89171a<C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.shortvideo.editcut.C71693f.C71754w.C717551 */

                /* renamed from: a */
                final /* synthetic */ C71754w f160789a;

                static {
                    Covode.recordClassIndex(84300);
                }

                {
                    this.f160789a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // p4600h.p4611f.p4612a.AbstractC89171a
                public final /* synthetic */ C89391z invoke() {
                    long a;
                    String str;
                    Activity b = C2556g.m7473b(this.f160789a.f160787a);
                    if (!(b instanceof AbstractC84919c)) {
                        b = null;
                    }
                    AbstractC84919c cVar = (AbstractC84919c) b;
                    if (cVar != null) {
                        cVar.mo87535c(this.f160789a.f160787a.f160712u);
                    }
                    this.f160789a.f160787a.f160699h = false;
                    this.f160789a.f160787a.f160709r = null;
                    this.f160789a.f160787a.mo113397l().mo127279b(true);
                    this.f160789a.f160787a.mo113402q().mo113423a(false, (AbstractC89171a<C89378p<Long, Long>>) null);
                    AbstractC31071f fVar = this.f160789a.f160787a.f160701j;
                    if (fVar != null) {
                        fVar.mo56357f(true);
                    }
                    this.f160789a.f160787a.mo113392g().mo127677a(true);
                    ((AbstractC82200a) this.f160789a.f160787a.f160710s.getValue()).mo127390f();
                    int i = -1;
                    if (!booleanValue) {
                        this.f160789a.f160787a.mo113402q().mo113421a(null);
                        this.f160789a.f160787a.mo113373B();
                        C71776n q = this.f160789a.f160787a.mo113402q();
                        AbstractC31071f fVar2 = this.f160789a.f160787a.f160701j;
                        if (fVar2 != null) {
                            i = fVar2.mo56368j();
                        }
                        C71776n.m126699a(q, i, 1);
                        AbstractC71793q.C71794a.m126761a(this.f160789a.f160787a.mo113399n(), -1, null, false, 6);
                    } else if (this.f160789a.f160788b) {
                        this.f160789a.f160787a.mo113372A();
                    } else {
                        C71693f fVar3 = this.f160789a.f160787a;
                        fVar3.mo113402q().mo113425a(false, true);
                        if (fVar3.f160698g != fVar3.f160707p) {
                            fVar3.mo113387c(fVar3.f160707p);
                        } else if (fVar3.f160698g) {
                            fVar3.mo113398m().mo113444c().mo111028a((AbstractC70440f) null, false);
                        }
                        fVar3.mo113373B();
                        C71776n q2 = fVar3.mo113402q();
                        AbstractC31071f fVar4 = fVar3.f160701j;
                        if (fVar4 != null) {
                            i = fVar4.mo56368j();
                        }
                        C71776n.m126699a(q2, i, 1);
                        AbstractC71793q.C71794a.m126761a(fVar3.mo113399n(), -1, null, false, 6);
                    }
                    C71693f fVar5 = this.f160789a.f160787a;
                    boolean z = this.f160789a.f160788b;
                    boolean z2 = booleanValue;
                    AbstractC31071f fVar6 = this.f160789a.f160787a.f160701j;
                    if (fVar6 != null) {
                        a = (long) fVar6.mo56368j();
                    } else {
                        a = this.f160789a.f160787a.mo113402q().mo113418a();
                    }
                    if (z) {
                        str = "click_trim_complete";
                    } else {
                        str = "click_trim_cancel";
                    }
                    C71746p.m126658a(str, fVar5.mo113388d(), new C71702ag(fVar5, z2, a));
                    return C89391z.f203057a;
                }
            });
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.editcut.AbstractC71792p
    /* renamed from: c */
    public final void mo113386c(List<? extends VideoSegment> list) {
        C89219l.m154721d(list, "");
        mo113411z();
        mo113410y();
        if (!this.f160699h) {
            mo113372A();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.editcut.AbstractC71792p
    /* renamed from: d */
    public final void mo113389d(boolean z) {
        m126612F().mo111005b();
        AbstractC71793q.C71794a.m126761a(mo113399n(), -1, null, false, 6);
        if (!z) {
            mo113396k().mo113266a(-1);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.f$ac */
    static final class C71697ac<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C71693f f160720a;

        static {
            Covode.recordClassIndex(84242);
        }

        C71697ac(C71693f fVar) {
            this.f160720a = fVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            C88295s value;
            Boolean bool = (Boolean) obj;
            if (this.f160720a.f160698g) {
                C89219l.m154716b(bool, "");
                if (bool.booleanValue() && (value = this.f160720a.mo113390e().mo114835x().getValue()) != null) {
                    this.f160720a.mo113410y();
                    this.f160720a.mo113398m().mo113440a(value.f200362a, value.f200362a + value.f200363b);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.f$y */
    static final class C71757y<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C71693f f160792a;

        static {
            Covode.recordClassIndex(84302);
        }

        C71757y(C71693f fVar) {
            this.f160792a = fVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            boolean z;
            C71693f fVar = this.f160792a;
            if (fVar.mo113388d().isMultiVideoEdit() && fVar.mo113388d().isRetakeVideo() && fVar.mo113388d().multiEditVideoRecordData != null) {
                MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = fVar.mo113388d().multiEditVideoRecordData;
                if (multiEditVideoStatusRecordData.segmentSizeChange || multiEditVideoStatusRecordData.currentEditIndex < 0) {
                    z = false;
                } else {
                    z = true;
                }
                fVar.f160700i = z;
                fVar.mo113370a(new C71700ae(fVar, multiEditVideoStatusRecordData));
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.editcut.AbstractC71775m
    /* renamed from: b */
    public final void mo113384b(boolean z) {
        float f;
        if (z) {
            CutVideoSpeedViewModel E = m126611E();
            AbstractC70527h hVar = this.f160706o;
            if (hVar != null) {
                f = hVar.getCurrentSpeed();
            } else {
                f = 1.0f;
            }
            EnumC78601i fromValue = EnumC78601i.fromValue(f);
            C89219l.m154716b(fromValue, "");
            E.mo110750a(fromValue);
        }
        m126611E().mo110754b(z);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.editcut.AbstractC71792p
    /* renamed from: a */
    public final void mo113379a(List<? extends VideoSegment> list) {
        C89219l.m154721d(list, "");
        C71746p.m126658a("smart_sync_cancel", mo113388d(), new C71704ai(this));
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.editcut.AbstractC71775m
    /* renamed from: c */
    public final void mo113387c(boolean z) {
        String c;
        Cut2EditTransferModel cut2EditTransferModel;
        List<C69905c> musicList;
        if (this.f160698g != z) {
            if (z) {
                this.f160708q = mo113385c();
                if (C70005cr.m123611a().f156482a == null) {
                    C69905c cVar = this.f160709r;
                    if ((cVar == null && ((cut2EditTransferModel = mo113393h().f160358e) == null || (musicList = cut2EditTransferModel.getMusicList()) == null || (cVar = (C69905c) C89070n.m154561b((List) musicList, 0)) == null)) || (c = C70455f.m124271c(cVar)) == null) {
                        mo113409x();
                    } else {
                        mo113378a(c, cVar);
                        C71780o.m126724a(mo113398m(), cVar, 0, false, 6);
                    }
                } else {
                    C71780o.m126724a(mo113398m(), C70005cr.m123611a().f156482a, mo113388d().mMusicStart, false, 4);
                }
            } else {
                this.f160709r = C70005cr.m123611a().f156482a;
                mo113378a((String) null, (C69905c) null);
            }
            C71746p.m126658a("change_sync_mode", mo113388d(), new C71730aw(z));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.f$ad */
    static final class C71698ad<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C71693f f160721a;

        static {
            Covode.recordClassIndex(84243);
        }

        C71698ad(C71693f fVar) {
            this.f160721a = fVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            final T t;
            float f;
            C20391d dVar = (C20391d) obj;
            if (dVar != null) {
                t = dVar.f48283b;
            } else {
                t = null;
            }
            if (t == null) {
                if (this.f160721a.f160698g) {
                    C71780o.m126724a(this.f160721a.mo113398m(), null, 0, false, 6);
                    C71693f fVar = this.f160721a;
                    fVar.mo113402q().mo113424a(false, fVar.f160708q);
                    if (fVar.f160698g) {
                        fVar.f160698g = false;
                        fVar.mo113388d().editMusicSyncMode = false;
                        fVar.mo113396k().mo113268a(false);
                        fVar.mo113388d().voiceVolume = 1.0f;
                        fVar.mo113401p().mo127543c(true);
                    }
                    fVar.mo113396k().mo113269b();
                    EditAdjustClipsBottomViewModel k = fVar.mo113396k();
                    AbstractC70527h hVar = fVar.f160706o;
                    if (hVar != null) {
                        f = hVar.getSelectedTime();
                    } else {
                        f = 0.0f;
                    }
                    k.mo113265a(f);
                    if (!this.f160721a.f160699h) {
                        this.f160721a.mo113372A();
                    }
                    this.f160721a.mo113410y();
                }
            } else if (this.f160721a.f160698g) {
                if (!this.f160721a.f160699h) {
                    this.f160721a.mo113402q().mo113437l();
                    this.f160721a.f160705n = true;
                }
                this.f160721a.mo113410y();
                this.f160721a.mo113398m().mo113443a(t, this.f160721a.mo113388d().mMusicStart, false);
            } else {
                C1731i.m5640b(new Callable() {
                    /* class com.p2082ss.android.ugc.aweme.shortvideo.editcut.C71693f.C71698ad.CallableC716991 */

                    static {
                        Covode.recordClassIndex(84244);
                    }

                    @Override // java.util.concurrent.Callable
                    public final /* synthetic */ Object call() {
                        C70455f.m124268a(t);
                        return C89391z.f203057a;
                    }
                }, C40780g.m82241a());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.f$ag */
    static final class C71702ag extends AbstractC89220m implements AbstractC89172b<C84425b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C71693f f160726a;

        /* renamed from: b */
        final /* synthetic */ boolean f160727b;

        /* renamed from: c */
        final /* synthetic */ long f160728c;

        static {
            Covode.recordClassIndex(84247);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C71702ag(C71693f fVar, boolean z, long j) {
            super(1);
            this.f160726a = fVar;
            this.f160727b = z;
            this.f160728c = j;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C84425b bVar) {
            String str;
            String str2;
            C84425b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            bVar2.mo129403a("is_edit", this.f160727b ? 1 : 0);
            bVar2.mo129403a("is_multi_content", C70968bl.m125279k(this.f160726a.mo113388d()));
            bVar2.mo129403a("video_cnt", this.f160726a.mo113388d().videoCount);
            bVar2.mo129403a("pic_cnt", this.f160726a.mo113388d().photoCount);
            bVar2.mo129404a("edit_duration", this.f160728c);
            bVar2.mo129406a("mix_type", C70968bl.m125266c(this.f160726a.mo113388d()));
            bVar2.mo129404a("content_duration_ms", this.f160726a.mo113402q().mo113426b());
            bVar2.mo129406a("music_id", this.f160726a.mo113388d().musicId);
            if (this.f160726a.mo113388d().editMusicSyncMode) {
                str = "sync_on";
            } else {
                str = "sync_off";
            }
            bVar2.mo129406a("sync_mode", str);
            if (!C71817eu.m126800k(this.f160726a.mo113388d()) || !this.f160726a.mo113398m().f160878a) {
                str2 = "off";
            } else {
                str2 = "on";
            }
            bVar2.mo129406a("smart_sync", str2);
            bVar2.mo129406a("music_selected_from", this.f160726a.mo113388d().getMusicOrigin());
            bVar2.mo129403a("is_rotated", this.f160726a.f160702k ? 1 : 0);
            bVar2.mo129403a("is_edit_speed", this.f160726a.f160703l ? 1 : 0);
            bVar2.mo129403a("is_adjusted", this.f160726a.f160704m ? 1 : 0);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.f$aj */
    static final class C71705aj<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C71693f f160731a;

        static {
            Covode.recordClassIndex(84250);
        }

        C71705aj(C71693f fVar) {
            this.f160731a = fVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            long j;
            float f;
            Float f2 = (Float) obj;
            AbstractC70527h hVar = this.f160731a.f160706o;
            if (hVar != null) {
                Integer editState = this.f160731a.mo113396k().mo113264a().getEditState();
                if (editState != null && editState.intValue() == 1) {
                    j = hVar.getMultiSeekTime();
                } else {
                    j = hVar.getSingleSeekTime();
                }
            } else {
                j = 0;
            }
            C71776n q = this.f160731a.mo113402q();
            int currentEditOriginIndex = this.f160731a.mo113396k().mo113264a().getCurrentEditOriginIndex();
            C89219l.m154716b(f2, "");
            float floatValue = f2.floatValue();
            C89378p<Long, Long> c = this.f160731a.mo113385c();
            C89219l.m154721d(c, "");
            AbstractC70076i iVar = q.f160837g;
            if (iVar != null) {
                iVar.mo110545b(currentEditOriginIndex, floatValue);
            }
            AbstractC70076i iVar2 = q.f160837g;
            if (iVar2 != null) {
                iVar2.mo110547c((int) c.getFirst().longValue(), (int) c.getSecond().longValue());
            }
            AbstractC71793q.C71794a.m126761a(q.mo113435j(), j, null, false, 6);
            this.f160731a.mo113396k().mo113271g();
            EditAdjustClipsBottomViewModel k = this.f160731a.mo113396k();
            AbstractC70527h hVar2 = this.f160731a.f160706o;
            if (hVar2 != null) {
                f = hVar2.getSelectedTime();
            } else {
                f = 0.0f;
            }
            k.mo113265a(f);
            this.f160731a.f160703l = true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.f$x */
    static final class C71756x<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C71693f f160791a;

        static {
            Covode.recordClassIndex(84301);
        }

        C71756x(C71693f fVar) {
            this.f160791a = fVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            C69905c cVar;
            List<C69905c> musicList;
            int j;
            Pair<Integer, Integer> playInOutTime;
            this.f160791a.f160701j = (AbstractC31071f) obj;
            C71776n q = this.f160791a.mo113402q();
            AbstractC31071f fVar = this.f160791a.f160701j;
            q.f160836f = fVar;
            int i = 0;
            if (fVar != null) {
                q.f160837g = new C71688d(fVar, q.mo113431f(), (byte) 0);
            }
            q.mo113433h().f162427a = fVar;
            C71693f fVar2 = this.f160791a;
            AbstractC31071f fVar3 = fVar2.f160701j;
            if (!fVar2.f160697f && C71558b.m126459b(fVar2.mo113393h())) {
                fVar2.f160697f = true;
                boolean k = C71817eu.m126800k(fVar2.mo113388d());
                C71780o m = fVar2.mo113398m();
                m.f160880c = k;
                m.mo113444c().f157448a = fVar3;
                m.mo113444c().mo111029a(m);
                m.mo113445d().mo111010a(m.f160882e);
                m.mo113445d().mo111011a(new C71780o.C71785d(m));
                m.mo113445d().f157399a = fVar3;
                m.mo113445d();
                m.mo113446e();
                if (!k) {
                    fVar2.mo113396k().mo113268a(false);
                    return;
                }
                String str = null;
                if (fVar2.mo113388d().mIsFromDraft) {
                    C69905c cVar2 = C70005cr.m123611a().f156482a;
                    if (cVar2 != null) {
                        fVar2.mo113398m().mo113444c().f157449b = 0;
                        fVar2.mo113398m().mo113441a(cVar2);
                        C70455f.m124268a(cVar2);
                        MultiEditVideoRecordData curMultiEditVideoRecordData = fVar2.mo113388d().getCurMultiEditVideoRecordData();
                        if (curMultiEditVideoRecordData == null || (playInOutTime = curMultiEditVideoRecordData.getPlayInOutTime()) == null) {
                            if (fVar3 != null) {
                                j = fVar3.mo56368j();
                            }
                            fVar2.mo113398m().mo113440a(fVar2.mo113388d().mMusicStart, Math.min(cVar2.duration, fVar2.mo113388d().mMusicStart + i));
                            fVar2.mo113411z();
                            return;
                        }
                        int intValue = ((Number) playInOutTime.second).intValue();
                        Object obj2 = playInOutTime.first;
                        C89219l.m154716b(obj2, "");
                        j = intValue - ((Number) obj2).intValue();
                        Integer valueOf = Integer.valueOf(j);
                        if (valueOf != null) {
                            i = valueOf.intValue();
                        }
                        fVar2.mo113398m().mo113440a(fVar2.mo113388d().mMusicStart, Math.min(cVar2.duration, fVar2.mo113388d().mMusicStart + i));
                        fVar2.mo113411z();
                        return;
                    }
                    return;
                }
                Cut2EditTransferModel cut2EditTransferModel = fVar2.mo113393h().f160358e;
                if (cut2EditTransferModel == null || (musicList = cut2EditTransferModel.getMusicList()) == null) {
                    cVar = null;
                } else {
                    cVar = (C69905c) C89070n.m154561b((List) musicList, 0);
                    if (cVar != null) {
                        str = C70455f.m124271c(cVar);
                    }
                }
                fVar2.mo113378a(str, cVar);
                C71780o.m126724a(fVar2.mo113398m(), cVar, fVar2.mo113388d().mMusicStart, false, 4);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.f$z */
    static final class C71758z<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C71693f f160793a;

        static {
            Covode.recordClassIndex(84303);
        }

        C71758z(C71693f fVar) {
            this.f160793a = fVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            boolean z;
            T t;
            if (this.f160793a.mo113388d().isUploadVideo()) {
                C71693f fVar = this.f160793a;
                List<VideoSegment> c = fVar.mo113402q().mo113428c();
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = c.iterator();
                while (true) {
                    z = true;
                    if (!it.hasNext()) {
                        break;
                    }
                    T next = it.next();
                    if (true ^ next.f156717i) {
                        arrayList.add(next);
                    }
                }
                ArrayList arrayList2 = arrayList;
                C70097r.m123782a(fVar.mo113390e().mo114778C().getValue(), arrayList2);
                ArrayList arrayList3 = new ArrayList();
                Iterable iterable = fVar.mo113388d().importInfoList;
                if (iterable == null) {
                    iterable = C89086z.INSTANCE;
                }
                for (T t2 : arrayList2) {
                    Iterator<T> it2 = iterable.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            t = null;
                            break;
                        }
                        t = it2.next();
                        if (TextUtils.equals(t.getRealImportPath(), t2.mo110571a(false))) {
                            break;
                        }
                    }
                    T t3 = t;
                    if (t3 != null) {
                        arrayList3.add(new ImportVideoInfo(t2.f156714f, t2.f156715g, t3.getBitRate(), t3.getEncodeId(), t2.mo110571a(z).toString(), t2.f156710b, t2.mo110580e() - t2.mo110578d(), t2.f156730v, t2.f156731w, t3.getOriginFps(), t2.mo110582f(), t2.mo110571a(false).toString()));
                    } else {
                        arrayList3.add(new ImportVideoInfo(t2.f156714f, t2.f156715g, t2.mo110577c(), t2.mo110575b(), t2.mo110571a(true).toString(), t2.f156710b, t2.mo110580e() - t2.mo110578d(), t2.f156730v, t2.f156731w, t2.mo110570a(), t2.mo110582f(), t2.mo110571a(false).toString()));
                    }
                    z = true;
                }
                if (fVar.mo113388d().importInfoList == null) {
                    fVar.mo113388d().importInfoList = new ArrayList<>();
                } else {
                    fVar.mo113388d().importInfoList.clear();
                }
                if (!arrayList3.isEmpty()) {
                    fVar.mo113388d().importInfoList.addAll(arrayList3);
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.editcut.AbstractC71775m
    /* renamed from: b */
    public final void mo113383b(List<? extends VideoSegment> list) {
        C89219l.m154721d(list, "");
        int size = mo113393h().f160357d.curMultiEditVideoRecordData.segmentDataList.size();
        int i = 0;
        for (T t : list) {
            int i2 = i + 1;
            if (i < 0) {
                C89070n.m154520a();
            }
            t.f156709a = i + size;
            i = i2;
        }
        C71776n q = mo113402q();
        C89219l.m154721d(list, "");
        AbstractC70076i iVar = q.f160837g;
        if (iVar != null) {
            iVar.mo110538a(list);
        }
        if (q.f160835e) {
            C71780o g = q.mo113432g();
            g.mo113444c().mo111030a(list, q.mo113429d().segmentDataList.size(), new C71780o.C71781a(g));
        } else {
            AbstractC70076i iVar2 = q.f160837g;
            if (iVar2 != null) {
                iVar2.mo110539a(list, q.mo113429d().segmentDataList.size(), 0, -1);
            }
        }
        EditAdjustClipsBottomViewModel k = mo113396k();
        C89219l.m154721d(list, "");
        k.mo33690d(new EditAdjustClipsBottomViewModel.C71535b(list));
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0072  */
    @Override // com.p2082ss.android.ugc.aweme.shortvideo.editcut.AbstractC71692e
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo113370a(p4600h.p4611f.p4612a.AbstractC89171a<p4600h.C89391z> r19) {
        /*
        // Method dump skipped, instructions count: 213
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.editcut.C71693f.mo113370a(h.f.a.a):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0038, code lost:
        if ((!p4600h.p4611f.p4613b.C89219l.m154714a(r4.f160848r, r3)) == false) goto L_0x003b;
     */
    @Override // com.p2082ss.android.ugc.aweme.shortvideo.editcut.AbstractC71692e
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo113371a(boolean r9) {
        /*
            r8 = this;
            com.ss.android.ugc.aweme.shortvideo.editcut.f$w r5 = new com.ss.android.ugc.aweme.shortvideo.editcut.f$w
            r5.<init>(r8, r9)
            boolean r1 = r8.f160698g
            boolean r0 = r8.f160707p
            r7 = 0
            r6 = 1
            if (r1 != r0) goto L_0x003a
            com.ss.android.ugc.aweme.shortvideo.editcut.n r4 = r8.mo113402q()
            h.p r3 = r8.mo113385c()
            java.lang.String r0 = ""
            p4600h.p4611f.p4613b.C89219l.m154721d(r3, r0)
            com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData r2 = r4.mo113429d()
            com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData r1 = r4.f160839i
            if (r1 != 0) goto L_0x0027
            java.lang.String r0 = "restoreRecordData"
            p4600h.p4611f.p4613b.C89219l.m154710a(r0)
        L_0x0027:
            boolean r0 = r2.isEqualWithDeleteStatus(r1)
            if (r0 == 0) goto L_0x003a
            h.p<java.lang.Long, java.lang.Long> r0 = r4.f160848r
            if (r0 == 0) goto L_0x003b
            h.p<java.lang.Long, java.lang.Long> r0 = r4.f160848r
            boolean r0 = p4600h.p4611f.p4613b.C89219l.m154714a(r0, r3)
            r0 = r0 ^ r6
            if (r0 == 0) goto L_0x003b
        L_0x003a:
            r7 = 1
        L_0x003b:
            if (r9 != 0) goto L_0x004c
            if (r7 == 0) goto L_0x004c
            android.app.Activity r1 = com.bytedance.als.dsl.C2556g.m7473b(r8)
            com.ss.android.ugc.aweme.shortvideo.editcut.f$aq r0 = new com.ss.android.ugc.aweme.shortvideo.editcut.f$aq
            r0.<init>(r5)
            com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.p3827b.C71423a.m126140b(r1, r0)
            return
        L_0x004c:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
            r5.invoke(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.editcut.C71693f.mo113371a(boolean):void");
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af, R> R withState(VM1 vm1, AbstractC89172b<? super S1, ? extends R> bVar) {
        C89219l.m154721d(vm1, "");
        C89219l.m154721d(bVar, "");
        return (R) AbstractC20382b.C20383a.m38593a(this, vm1, bVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.f$ab */
    static final class C71696ab extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, C20526p, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C71693f f160719a;

        static {
            Covode.recordClassIndex(84241);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C71696ab(C71693f fVar) {
            super(2);
            this.f160719a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, C20526p pVar) {
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(pVar, "");
            if (this.f160719a.f160698g && C70005cr.m123611a().f156482a != null) {
                C71780o.m126724a(this.f160719a.mo113398m(), C70005cr.m123611a().f156482a, this.f160719a.mo113388d().mMusicStart, false, 4);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final void mo113378a(String str, C69905c cVar) {
        C40888d dVar;
        C70005cr.m123611a().mo70083a(cVar);
        if (C70976bp.m125316l(mo113388d())) {
            mo113397l().mo127276a(str, cVar, true);
            return;
        }
        if (str == null || str.length() == 0) {
            dVar = C40888d.C40889a.m82358a(true, null, null, null);
        } else {
            dVar = C40888d.C40889a.m82358a(false, "edit_page_list", cVar, str);
        }
        mo113397l().mo127275a(dVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.f$r */
    public static final class DialogInterface$OnClickListenerC71749r implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C71693f f160778a;

        /* renamed from: b */
        final /* synthetic */ boolean f160779b;

        /* renamed from: c */
        final /* synthetic */ boolean f160780c;

        /* renamed from: d */
        final /* synthetic */ boolean f160781d;

        /* renamed from: e */
        final /* synthetic */ AbstractC89171a f160782e;

        static {
            Covode.recordClassIndex(84294);
        }

        DialogInterface$OnClickListenerC71749r(C71693f fVar, boolean z, boolean z2, boolean z3, AbstractC89171a aVar) {
            this.f160778a = fVar;
            this.f160779b = z;
            this.f160780c = z2;
            this.f160781d = z3;
            this.f160782e = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            AbstractC70892c cVar;
            if (this.f160779b) {
                this.f160778a.mo113391f().mo112158c();
                this.f160778a.mo113388d().mTimeEffect = null;
            }
            if (this.f160780c) {
                this.f160778a.mo113392g().mo127688k();
            }
            if (this.f160778a.mo113388d().isDisableOriginalSound()) {
                this.f160778a.mo113388d().resetVolume();
            }
            if (this.f160781d && (cVar = (AbstractC70892c) this.f160778a.f160711t.getValue()) != null) {
                cVar.mo112054c();
            }
            this.f160782e.invoke();
        }
    }

    /* renamed from: a */
    private final void m126614a(boolean z, int i) {
        float f;
        if (C71558b.m126458a(mo113393h())) {
            if (!this.f160698g) {
                AbstractC72510a e = mo113390e();
                if (z) {
                    f = 0.0f;
                } else {
                    f = mo113388d().musicVolume;
                }
                VEVolumeChangeOp ofMusic = VEVolumeChangeOp.ofMusic(f);
                C89219l.m154716b(ofMusic, "");
                e.mo114800a(ofMusic);
            }
        } else if (z) {
            long j = 0;
            int i2 = 0;
            for (T t : mo113381b()) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    C89070n.m154520a();
                }
                T t2 = t;
                if (!t2.f156717i && i2 < i) {
                    j += t2.mo110580e() - t2.mo110578d();
                }
                i2 = i3;
            }
            VideoSegment videoSegment = mo113381b().get(i);
            mo113402q().mo113420a((int) j, 0, (int) (videoSegment.mo110580e() - videoSegment.mo110578d()));
        } else {
            C71776n.m126699a(mo113402q(), 0, 3);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.editcut.AbstractC71775m
    /* renamed from: b */
    public final void mo113382b(int i, int i2) {
        float f;
        float f2;
        float f3;
        CutVideoSpeedViewModel E = m126611E();
        EnumC78601i fromValue = EnumC78601i.fromValue(mo113381b().get(i2).mo110582f());
        C89219l.m154716b(fromValue, "");
        E.mo110750a(fromValue);
        mo113396k().mo33690d(new EditAdjustClipsBottomViewModel.C71544k(i, i2));
        EditAdjustClipsBottomViewModel k = mo113396k();
        AbstractC70527h hVar = this.f160706o;
        if (hVar != null) {
            f = hVar.getSelectedTime();
        } else {
            f = 0.0f;
        }
        k.mo113265a(f);
        C71776n q = mo113402q();
        List<MultiEditVideoSegmentRecordData> list = q.mo113429d().segmentDataList;
        C89219l.m154716b(list, "");
        MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData = (MultiEditVideoSegmentRecordData) C89070n.m154561b((List) list, i2);
        if (multiEditVideoSegmentRecordData != null) {
            f2 = multiEditVideoSegmentRecordData.scale;
        } else {
            f2 = 0.0f;
        }
        q.f160847q = f2;
        q.f160838h = C89387v.m154943a(Integer.valueOf(i), Integer.valueOf(i2));
        VideoSegment videoSegment = q.mo113428c().get(i2);
        AbstractC70076i iVar = q.f160837g;
        if (iVar != null) {
            iVar.mo110536a(i2, videoSegment);
        }
        if (q.f160835e) {
            q.mo113433h().mo114723a(videoSegment);
            C71780o g = q.mo113432g();
            C89219l.m154721d(videoSegment, "");
            g.mo113444c().f157452e = i2;
            g.mo113444c().mo111038d();
        }
        if (videoSegment.mo110582f() == 0.0f) {
            f3 = 1.0f;
        } else {
            f3 = videoSegment.mo110582f();
        }
        AbstractC71793q.C71794a.m126761a(q.mo113435j(), (long) (((float) videoSegment.mo110578d()) / f3), null, false, 6);
        m126614a(true, i2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C71693f(C21582f fVar, AbstractC22186b bVar) {
        super(fVar);
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(bVar, "");
        this.f160713v = bVar;
        this.f160675A = C21572a.m40504a(fVar, VideoPublishEditModel.class);
        this.f160676B = C21572a.m40504a(fVar, AbstractC72510a.class);
        this.f160677C = C89250i.m154774a(EnumC89331m.NONE, new C71694a(this));
        this.f160678D = C89250i.m154774a(EnumC89331m.NONE, new C71732b(this));
        this.f160679E = C89250i.m154774a(EnumC89331m.NONE, new C71733c(this));
        this.f160710s = C89250i.m154774a(EnumC89331m.NONE, new C71734d(this));
        this.f160711t = C89250i.m154774a(EnumC89331m.NONE, new C71744n(this));
        this.f160680F = C89250i.m154774a(EnumC89331m.NONE, new C71745o(this));
        this.f160681G = C89250i.m154774a(EnumC89331m.NONE, new C71735e(this));
        this.f160682H = C89250i.m154774a(EnumC89331m.NONE, new C71736f(this));
        this.f160683I = C89250i.m154774a(EnumC89331m.NONE, new C71737g(this));
        this.f160684J = C89250i.m154774a(EnumC89331m.NONE, new C71738h(this));
        this.f160685K = C89250i.m154774a(EnumC89331m.NONE, new C71739i(this));
        this.f160686L = C89250i.m154774a(EnumC89331m.NONE, new C71740j(this));
        this.f160687M = C89250i.m154774a(EnumC89331m.NONE, new C71741k(this));
        this.f160688N = C89250i.m154774a(EnumC89331m.NONE, new C71742l(this));
        this.f160689O = C89250i.m154774a(EnumC89331m.NONE, new C71743m(this));
        this.f160690P = C89250i.m154773a((AbstractC89171a) C71731ax.f160759a);
        this.f160691Q = C89250i.m154773a((AbstractC89171a) new C71703ah(this));
        this.f160692R = C89250i.m154773a((AbstractC89171a) new C71750s(this));
        this.f160693S = C89250i.m154773a((AbstractC89171a) new C71751t(this));
        this.f160694T = C89250i.m154773a((AbstractC89171a) new C71726au(this));
        this.f160712u = new C71701af(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.editcut.AbstractC71775m
    /* renamed from: a */
    public final void mo113375a(int i, int i2) {
        float f;
        float f2;
        int i3;
        this.f160702k = true;
        C71776n q = mo113402q();
        C89378p<Long, Long> c = mo113385c();
        C89219l.m154721d(c, "");
        VideoSegment videoSegment = q.mo113428c().get(i);
        List<MultiEditVideoSegmentRecordData> list = q.mo113429d().segmentDataList;
        C89219l.m154716b(list, "");
        MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData = (MultiEditVideoSegmentRecordData) C89070n.m154561b((List) list, i);
        if (multiEditVideoSegmentRecordData != null) {
            if (multiEditVideoSegmentRecordData.scale == 0.0f) {
                multiEditVideoSegmentRecordData.scale = q.f160833c;
            }
            f = multiEditVideoSegmentRecordData.scale;
        } else {
            f = q.f160833c;
        }
        int i4 = videoSegment.f156714f;
        int i5 = videoSegment.f156715g;
        C89233z.C89235b bVar = new C89233z.C89235b();
        bVar.element = f;
        if (i2 % LiveFeedRefreshTimeSetting.DEFAULT == 0) {
            f2 = (bVar.element * ((float) i4)) / ((float) i5);
        } else {
            bVar.element = (((float) i4) * f) / ((float) i5);
            f2 = f;
        }
        q.f160834d = f2;
        float f3 = f2 - bVar.element;
        AbstractC31071f fVar = q.f160836f;
        if (fVar != null) {
            i3 = ((fVar.mo56330b().height / 2) - (C71494b.f160202d / 2)) - C71494b.f160200b;
        } else {
            i3 = 0;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(300L);
        ofFloat.addUpdateListener(new C71776n.C71778b(q, bVar, f3, i3, i, f, i2, c));
        ofFloat.addListener(new C71776n.C71779c(q, bVar, f3, i3, i, f, i2, c));
        ofFloat.start();
        C71746p.m126658a("spin_canvas", mo113388d(), null);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.editcut.AbstractC71775m
    /* renamed from: a */
    public final void mo113377a(C89378p<Integer, Integer> pVar, C89378p<Integer, Integer> pVar2) {
        C89219l.m154721d(pVar, "");
        C89219l.m154721d(pVar2, "");
        C71776n q = mo113402q();
        C89378p<Long, Long> c = mo113385c();
        C89219l.m154721d(pVar, "");
        C89219l.m154721d(pVar2, "");
        C89219l.m154721d(c, "");
        int intValue = pVar.component1().intValue();
        int intValue2 = pVar.component2().intValue();
        int intValue3 = pVar2.component1().intValue();
        int intValue4 = pVar2.component2().intValue();
        ArrayList<TimeSpeedModelExtension> arrayList = q.f160845o;
        if (arrayList != null) {
            C71772l.m126683a(arrayList, intValue3, intValue4);
        }
        List<MultiEditVideoSegmentRecordData> list = q.mo113429d().segmentDataList;
        if (list != null) {
            C71772l.m126683a(list, intValue, intValue2);
            int i = 0;
            for (T t : list) {
                int i2 = i + 1;
                if (i < 0) {
                    C89070n.m154520a();
                }
                t.videoKey = i;
                i = i2;
            }
        }
        if (q.f160835e) {
            q.mo113432g().mo113444c().mo111025a(intValue, intValue2, (AbstractC70440f) null);
        } else {
            AbstractC70076i iVar = q.f160837g;
            if (iVar != null) {
                iVar.mo110535a(intValue, intValue2, q.mo113428c());
            }
            AbstractC70076i iVar2 = q.f160837g;
            if (iVar2 != null) {
                iVar2.mo110547c((int) c.getFirst().longValue(), (int) c.getSecond().longValue());
            }
        }
        AbstractC71793q.C71794a.m126761a(q.mo113435j(), 0, null, false, 6);
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
