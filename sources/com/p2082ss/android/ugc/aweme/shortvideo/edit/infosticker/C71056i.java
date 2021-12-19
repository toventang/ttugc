package com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker;

import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.core.p036g.C0692e;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.lifecycle.C1213t;
import androidx.p025c.C0484a;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17301b;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17303d;
import com.facebook.common.p1832d.C24098m;
import com.p2082ss.android.ugc.asve.editor.AbstractC31071f;
import com.p2082ss.android.ugc.aweme.adaptation.C33398a;
import com.p2082ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.p2082ss.android.ugc.aweme.commentStickerPanel.itemview.CommentStickerView;
import com.p2082ss.android.ugc.aweme.editSticker.interact.AbstractC45897c;
import com.p2082ss.android.ugc.aweme.editSticker.interact.AbstractC45898d;
import com.p2082ss.android.ugc.aweme.editSticker.interact.AbstractC45899e;
import com.p2082ss.android.ugc.aweme.editSticker.interact.AbstractC45904h;
import com.p2082ss.android.ugc.aweme.editSticker.interact.view.AbstractC45920e;
import com.p2082ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.p2082ss.android.ugc.aweme.editSticker.p2879c.AbstractC45857b;
import com.p2082ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.p2082ss.android.ugc.aweme.editSticker.text.view.C46239q;
import com.p2082ss.android.ugc.aweme.effect.C46371s;
import com.p2082ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.p2082ss.android.ugc.aweme.p2730de.C40982q;
import com.p2082ss.android.ugc.aweme.property.C65374bn;
import com.p2082ss.android.ugc.aweme.shortvideo.C69840ar;
import com.p2082ss.android.ugc.aweme.shortvideo.C70636dh;
import com.p2082ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.p2082ss.android.ugc.aweme.shortvideo.cover.VEMultiEditVideoCoverGeneratorImpl;
import com.p2082ss.android.ugc.aweme.shortvideo.cover.VEVideoCoverGeneratorImpl;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.C70528i;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditView;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C70968bl;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.AbstractC71109e;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.p3811d.C70985a;
import com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73991bj;
import com.p2082ss.android.ugc.aweme.shortvideo.widget.C74297p;
import com.p2082ss.android.ugc.aweme.sticker.data.AbstractC75310e;
import com.p2082ss.android.ugc.aweme.themechange.base.AVDmtTextView;
import com.p2082ss.android.ugc.aweme.themechange.base.C77795c;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.C80322d;
import com.p2082ss.android.ugc.gamora.editor.corner.EditCornerViewModel;
import com.p2082ss.android.ugc.gamora.editor.progress.EditProgressViewModel;
import com.p2082ss.android.ugc.gamora.editor.progressbar.AbstractC82503a;
import com.p2082ss.android.ugc.gamora.editor.sticker.read.C83064h;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.android.vesdk.C85581w;
import dmt.p4542av.video.C88296t;
import dmt.p4542av.video.C88297u;
import java.util.ArrayList;
import java.util.FormatFlagsConversionMismatchException;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.i */
public final class C71056i implements AbstractC45898d, AbstractC71049b {

    /* renamed from: A */
    public FrameLayout f159094A;

    /* renamed from: B */
    public C1213t<Bitmap> f159095B;

    /* renamed from: C */
    public C1213t<Boolean> f159096C;

    /* renamed from: D */
    public int f159097D;

    /* renamed from: E */
    int f159098E;

    /* renamed from: F */
    public Rect f159099F;

    /* renamed from: G */
    public AbstractC45920e f159100G;

    /* renamed from: H */
    public Runnable f159101H = new Runnable() {
        /* class com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.C71056i.RunnableC710571 */

        static {
            Covode.recordClassIndex(83555);
        }

        public final void run() {
            if (C71056i.this.f159137s != null) {
                C71056i.this.f159130l.f156530b.setValue(Long.valueOf((long) C71056i.this.f159137s.mo56384r((int) ((long) C71056i.this.f159137s.mo56370k()))));
                C71056i.this.f159143y.postDelayed(C71056i.this.f159101H, 30);
            }
        }
    };

    /* renamed from: I */
    public AbstractC71063c f159102I;

    /* renamed from: J */
    public AbstractC71061a f159103J;

    /* renamed from: K */
    public AbstractC45897c f159104K;

    /* renamed from: L */
    public Map<AbstractC45904h, AbstractC75310e> f159105L = new C0484a();

    /* renamed from: M */
    boolean f159106M;

    /* renamed from: N */
    boolean f159107N;

    /* renamed from: O */
    public C70985a f159108O;

    /* renamed from: P */
    public EditCornerViewModel f159109P;

    /* renamed from: Q */
    public EditProgressViewModel f159110Q;

    /* renamed from: R */
    public AbstractC72510a f159111R;

    /* renamed from: S */
    public boolean f159112S;

    /* renamed from: T */
    public AbstractC82503a f159113T;

    /* renamed from: U */
    private boolean f159114U;

    /* renamed from: V */
    private boolean f159115V;

    /* renamed from: W */
    private boolean f159116W;

    /* renamed from: X */
    private int f159117X;

    /* renamed from: Y */
    private C74297p f159118Y;

    /* renamed from: a */
    public boolean f159119a;

    /* renamed from: b */
    public boolean f159120b;

    /* renamed from: c */
    public ActivityC0945e f159121c;

    /* renamed from: d */
    public InfoStickerEditView f159122d;

    /* renamed from: e */
    public View f159123e;

    /* renamed from: f */
    public View f159124f;

    /* renamed from: g */
    public AVDmtTextView f159125g;

    /* renamed from: h */
    public VideoEditView f159126h;

    /* renamed from: i */
    public ImageView f159127i;

    /* renamed from: j */
    public ImageView f159128j;

    /* renamed from: k */
    public ImageView f159129k;

    /* renamed from: l */
    public CutMultiVideoViewModel f159130l;

    /* renamed from: m */
    public View f159131m;

    /* renamed from: n */
    public TextView f159132n;

    /* renamed from: o */
    public TextView f159133o;

    /* renamed from: p */
    public SeekBar f159134p;

    /* renamed from: q */
    public ViewGroup f159135q;

    /* renamed from: r */
    public int f159136r = 30;

    /* renamed from: s */
    public AbstractC31071f f159137s;

    /* renamed from: t */
    public InfoStickerViewModel f159138t;

    /* renamed from: u */
    public VideoPublishEditModel f159139u;

    /* renamed from: v */
    public View f159140v;

    /* renamed from: w */
    public boolean f159141w;

    /* renamed from: x */
    public List<MediaModel> f159142x;

    /* renamed from: y */
    public SafeHandler f159143y;

    /* renamed from: z */
    public AbstractC45899e f159144z;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.i$a */
    public interface AbstractC71061a {
        static {
            Covode.recordClassIndex(83559);
        }

        /* renamed from: a */
        void mo112269a(boolean z);

        /* renamed from: b */
        void mo112270b(boolean z);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.i$b */
    public interface AbstractC71062b {
        static {
            Covode.recordClassIndex(83560);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.i$c */
    public interface AbstractC71063c {
        static {
            Covode.recordClassIndex(83561);
        }

        /* renamed from: a */
        int mo112262a(C71044aj ajVar, boolean z, boolean z2);

        /* renamed from: a */
        PointF mo112263a(C71044aj ajVar, float f, float f2);

        /* renamed from: a */
        Float mo112264a(float f);

        /* renamed from: a */
        void mo112265a(C71044aj ajVar, int i, int i2, boolean z, boolean z2);
    }

    static {
        Covode.recordClassIndex(83554);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.AbstractC71049b
    /* renamed from: a */
    public final boolean mo88019a() {
        C1213t<Boolean> tVar = this.f159138t.f159029c;
        if (tVar == null || tVar.getValue() == null) {
            return false;
        }
        return tVar.getValue().booleanValue();
    }

    /* renamed from: a */
    public final boolean mo112251a(int i) {
        if (this.f159122d.getStickNumber() + i < this.f159136r) {
            return false;
        }
        new C79459a(this.f159122d.getContext()).mo123050a(R.string.cm9).mo123053a();
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo112250a(boolean z, AbstractC45904h hVar, boolean z2) {
        this.f159107N = z;
        m125484b(!z);
        if (!this.f159114U) {
            this.f159114U = true;
            this.f159133o.setTypeface(C17301b.m32033a().mo27611a(C17303d.f41573g));
            this.f159132n.setTypeface(C17301b.m32033a().mo27611a(C17303d.f41573g));
            this.f159132n.setOnClickListener(new View$OnClickListenerC71039ae(this));
            this.f159133o.setOnClickListener(new View$OnClickListenerC71040af(this));
            m125487k();
            this.f159134p.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
                /* class com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.C71056i.C710593 */

                static {
                    Covode.recordClassIndex(83557);
                }

                public final void onStartTrackingTouch(SeekBar seekBar) {
                }

                public final void onStopTrackingTouch(SeekBar seekBar) {
                }

                public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
                    long d;
                    if (z) {
                        C71056i iVar = C71056i.this;
                        if (iVar.f159107N && iVar.f159104K != null && (iVar.f159104K instanceof AbstractC45904h)) {
                            int i2 = 0;
                            float a = ((float) ((AbstractC45904h) iVar.f159104K).mo65014a(0)) + (((float) ((((AbstractC45904h) iVar.f159104K).mo65018b(iVar.f159137s.mo56368j()) - ((AbstractC45904h) iVar.f159104K).mo65014a(0)) * i)) / 100.0f);
                            C1213t<C88296t> a2 = iVar.f159138t.mo112195a();
                            List<VideoSegment> k = iVar.f159126h.getVideoEditViewModel().mo111232k();
                            float l = iVar.f159126h.getVideoEditViewModel().mo111233l();
                            ArrayList arrayList = new ArrayList();
                            for (int i3 = 0; i3 < k.size(); i3++) {
                                if (!k.get(i3).f156717i) {
                                    arrayList.add(k.get(i3));
                                }
                            }
                            long j = 0;
                            int i4 = 0;
                            while (true) {
                                if (i4 >= arrayList.size()) {
                                    break;
                                }
                                VideoSegment videoSegment = (VideoSegment) arrayList.get(i4);
                                j += videoSegment.f156710b;
                                if (a <= ((float) (videoSegment.mo110580e() - videoSegment.mo110578d())) / (videoSegment.mo110582f() * l)) {
                                    i2 = i4;
                                    break;
                                } else {
                                    a -= ((float) (videoSegment.mo110580e() - videoSegment.mo110578d())) / (videoSegment.mo110582f() * l);
                                    i4++;
                                }
                            }
                            if (i4 == arrayList.size()) {
                                d = (j - ((VideoSegment) arrayList.get(i2)).f156710b) + ((VideoSegment) arrayList.get(i2)).mo110580e();
                            } else {
                                d = (long) (((float) ((j - ((VideoSegment) arrayList.get(i2)).f156710b) + ((VideoSegment) arrayList.get(i2)).mo110578d())) + (a * ((VideoSegment) arrayList.get(i2)).mo110582f() * l));
                            }
                            a2.setValue(C88296t.m153436a(d));
                        }
                    }
                }
            });
        }
        mo112248a(!z);
        if (z) {
            EditProgressViewModel editProgressViewModel = this.f159110Q;
            if (editProgressViewModel != null) {
                editProgressViewModel.mo127562a(1003);
            }
        } else {
            AbstractC82503a aVar = this.f159113T;
            if (aVar != null) {
                aVar.mo127587a(1, -1);
            }
        }
        mo112246a(hVar, 1);
        int height = this.f159131m.getHeight();
        this.f159117X = height;
        if (height == 0) {
            this.f159117X = (int) C13628n.m24520b(this.f159121c, 120.0f);
        }
        this.f159134p.setProgress((int) ((((float) this.f159137s.mo56370k()) * 100.0f) / ((float) this.f159137s.mo56368j())));
        View view = this.f159131m;
        C46371s.m89467a(view, z, this.f159117X, view, new C71388w(this, z, z2));
        AbstractC71061a aVar2 = this.f159103J;
        if (aVar2 != null) {
            aVar2.mo112269a(z);
        }
        if (z) {
            this.f159138t.mo112196b().setValue(C88297u.m153442a(C77795c.m135910a(true, false, false, false), this.f159117X, m125490n(), C33398a.f79357a.mo59453d(), z2));
            ImageView imageView = this.f159129k;
            imageView.setImageDrawable(imageView.getContext().getResources().getDrawable(2131231564));
            this.f159129k.setEnabled(true);
            return;
        }
        this.f159129k.setEnabled(false);
        this.f159143y.removeCallbacks(this.f159101H);
        this.f159138t.mo112195a().setValue(C88296t.m153437b());
        this.f159138t.mo112196b().setValue(C88297u.m153441a(this.f159122d.getResources().getColor(R.color.a2), C70636dh.m124833c(this.f159121c), this.f159117X, m125490n(), C33398a.f79357a.mo59453d(), z2));
        this.f159116W = false;
    }

    /* renamed from: a */
    public final void mo112249a(boolean z, AbstractC45904h hVar) {
        EditProgressViewModel editProgressViewModel;
        this.f159106M = z;
        if (z && (editProgressViewModel = this.f159110Q) != null) {
            editProgressViewModel.mo127562a(1003);
        }
        AbstractC82503a aVar = this.f159113T;
        if (aVar != null) {
            aVar.mo127587a(1, -1);
        }
        if (z && this.f159112S && this.f159115V) {
            this.f159112S = false;
            this.f159142x = this.f159139u.getMediaModelList();
            C74297p pVar = this.f159118Y;
            if (pVar != null) {
                pVar.mo116906b();
            }
            this.f159126h.mo111132a((C0692e<Float, Float>) null, C70528i.m124563a(this.f159142x, true, null, 4));
        }
        m125484b(!z);
        if (!this.f159141w) {
            this.f159141w = true;
            this.f159127i.setOnClickListener(new View$OnClickListenerC71041ag(this));
            this.f159128j.setOnClickListener(new View$OnClickListenerC71370l(this));
            this.f159129k.setOnClickListener(new View$OnClickListenerC71378m(this));
            m125487k();
            VideoEditViewModel videoEditViewModel = this.f159126h.getVideoEditViewModel();
            videoEditViewModel.f157678c.observe(this.f159121c, new C71379n(this));
            videoEditViewModel.f157681f.observe(this.f159121c, new C71380o(this));
            videoEditViewModel.f157686k.observe(this.f159121c, new C71381p(this));
            videoEditViewModel.f157684i.observe(this.f159121c, new C71382q(this));
            videoEditViewModel.f157685j.observe(this.f159121c, new C71383r(this));
            videoEditViewModel.f157682g.observe(this.f159121c, new C71384s(this));
            videoEditViewModel.f157683h.observe(this.f159121c, new C71385t(this));
            videoEditViewModel.f157680e.observe(this.f159121c, new C71386u(this));
        }
        mo112248a(!z);
        mo112245a(hVar);
        int height = this.f159124f.getHeight();
        this.f159117X = height;
        if (height == 0) {
            this.f159117X = (int) C13628n.m24520b(this.f159121c, 208.0f);
        }
        int b = this.f159117X + ((int) C13628n.m24520b(this.f159121c, 16.0f));
        this.f159117X = b;
        View view = this.f159124f;
        C46371s.m89467a(view, z, b, view, new C71389x(this, z));
        AbstractC71061a aVar2 = this.f159103J;
        if (aVar2 != null) {
            aVar2.mo112269a(z);
        }
        if (z) {
            this.f159138t.mo112196b().setValue(C88297u.m153440a(C77795c.m135910a(true, false, false, false), C70636dh.m124833c(this.f159121c), this.f159117X, m125489m(), C33398a.f79357a.mo59453d()));
            ImageView imageView = this.f159129k;
            imageView.setImageDrawable(imageView.getContext().getResources().getDrawable(2131231564));
            this.f159129k.setEnabled(true);
            this.f159126h.setEnabled(true);
            this.f159126h.mo111146c(true);
            this.f159138t.mo112195a().setValue(C88296t.m153438b(0));
            return;
        }
        this.f159129k.setEnabled(false);
        this.f159126h.setEnabled(false);
        this.f159143y.removeCallbacks(this.f159101H);
        this.f159138t.mo112195a().setValue(C88296t.m153437b());
        this.f159138t.mo112196b().setValue(C88297u.m153443b(this.f159122d.getResources().getColor(R.color.a2), C70636dh.m124833c(this.f159121c), this.f159117X, m125489m(), C33398a.f79357a.mo59453d()));
        this.f159116W = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo112252a(int i, int i2, AbstractC45904h hVar) {
        boolean a = this.f159126h.mo111136a(i, i2);
        m125488l();
        if (a && hVar != null) {
            this.f159130l.f156530b.setValue(Long.valueOf((long) hVar.mo65014a(0)));
            this.f159138t.mo112195a().setValue(C88296t.m153438b((long) hVar.mo65014a(0)));
        }
        return a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    @Override // com.p2082ss.android.ugc.aweme.editSticker.interact.AbstractC45898d
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo77274a(android.graphics.RectF r11) {
        /*
        // Method dump skipped, instructions count: 153
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.C71056i.mo77274a(android.graphics.RectF):boolean");
    }

    /* renamed from: g */
    public final void mo112257g() {
        if (this.f159116W) {
            mo112256f();
        }
    }

    /* renamed from: m */
    private int m125489m() {
        return ((C70636dh.m124836e(this.f159121c) - this.f159117X) - C70636dh.m124833c(this.f159121c)) - C70636dh.m124835d(this.f159121c);
    }

    /* renamed from: n */
    private int m125490n() {
        return (C70636dh.m124836e(this.f159121c) - this.f159117X) - C70636dh.m124835d(this.f159121c);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.AbstractC71049b
    /* renamed from: b */
    public final boolean mo88021b() {
        C1213t<Boolean> tVar = this.f159138t.f159030d;
        if (tVar == null || tVar.getValue() == null) {
            return false;
        }
        return tVar.getValue().booleanValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final boolean mo112258h() {
        AbstractC45897c cVar = this.f159104K;
        if (cVar instanceof C71044aj) {
            return true;
        }
        if ((cVar instanceof C46239q) || (cVar instanceof CommentStickerView)) {
            return false;
        }
        boolean z = cVar instanceof AbstractC71109e;
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo112255e() {
        if (mo112258h()) {
            boolean z = false;
            AbstractC45897c cVar = this.f159104K;
            if (cVar instanceof C71044aj) {
                z = ((C71044aj) cVar).f159064m;
            }
            C70968bl.m125265b(this.f159139u, z);
        } else if (this.f159104K instanceof C46239q) {
            C70968bl.m125278j(this.f159139u);
        }
    }

    /* renamed from: l */
    private void m125488l() {
        this.f159126h.setHitTest(Boolean.valueOf(C83064h.m143408a()));
        AbstractC45897c cVar = this.f159104K;
        if (cVar instanceof C46239q) {
            TextStickerData data = ((C46239q) cVar).getData();
            if (this.f159126h == null) {
                return;
            }
            if (data == null || !data.getHasReadTextAudio()) {
                this.f159126h.mo111178q();
            } else {
                this.f159126h.mo111143b(data.getAudioTrackDuration(), this.f159137s.mo56246G());
            }
        } else {
            this.f159126h.mo111178q();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo112253c() {
        int i;
        if (this.f159106M) {
            C0692e<Long, Long> playBoundary = this.f159126h.getPlayBoundary();
            this.f159138t.mo112195a().setValue(C88296t.m153436a((long) this.f159137s.mo56386s(playBoundary.f2750a.intValue())));
            if ((this.f159137s.mo56368j() - playBoundary.f2751b.intValue()) - 30 < 150) {
                i = 120;
            } else {
                i = 0;
            }
            m125480a(Math.max(playBoundary.f2750a.intValue() - 30, 0), Math.min(playBoundary.f2751b.intValue() + 30 + i, this.f159137s.mo56368j()), false, true);
            mo112255e();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo112254d() {
        if (this.f159106M) {
            mo112257g();
            C0692e<Long, Long> playBoundary = this.f159126h.getPlayBoundary();
            long s = (long) this.f159137s.mo56386s(this.f159126h.getPlayBoundary().f2750a.intValue());
            m125480a(Math.max(playBoundary.f2750a.intValue() - 30, 0), Math.min(playBoundary.f2751b.intValue() + 30, this.f159137s.mo56368j()), true, false);
            this.f159138t.mo112195a().setValue(C88296t.m153436a(s));
        }
    }

    /* renamed from: j */
    public final boolean mo112260j() {
        this.f159122d.f158978E.mo77176b();
        InfoStickerEditView infoStickerEditView = this.f159122d;
        if (infoStickerEditView == null || infoStickerEditView.f158998g == null || this.f159122d.f158998g.f159073a == null || this.f159122d.f158998g.f159073a.size() <= 0) {
            return false;
        }
        boolean z = false;
        for (C71044aj ajVar : this.f159122d.f158998g.f159073a) {
            if (ajVar.f159055d) {
                ajVar.f159055d = false;
                z = true;
            }
        }
        if (z) {
            this.f159122d.f158975B = false;
            this.f159122d.invalidate();
        }
        return z;
    }

    /* renamed from: k */
    private void m125487k() {
        C85581w.EnumC85602a aVar;
        C74297p pVar;
        if (!this.f159115V) {
            this.f159115V = true;
            int j = this.f159137s.mo56368j();
            this.f159130l = (CutMultiVideoViewModel) C1181ae.m3881a(this.f159121c, (C1175ad.AbstractC1177b) null).mo3983a(CutMultiVideoViewModel.class);
            this.f159126h.setCanEdit(false);
            this.f159126h.setMinVideoLength(1000);
            this.f159126h.setMaxVideoLength((long) j);
            this.f159130l.f156539k = this.f159139u.isMvThemeVideoType();
            this.f159130l.f156540l = j;
            this.f159126h.setFirstFrameVisibleLiveData(this.f159096C);
            this.f159126h.setFirstFrameBitmapLiveData(this.f159095B);
            this.f159126h.setVeEditor(this.f159137s);
            int frameWidth = this.f159126h.getFrameWidth();
            int frameHeight = this.f159126h.getFrameHeight();
            int ceil = (int) Math.ceil((double) (((float) (C13628n.m24504a(this.f159121c) - (this.f159126h.getLeftRightMargin() * 2))) / (((float) frameWidth) * 1.0f)));
            if (C65374bn.m117070a()) {
                aVar = C85581w.EnumC85602a.GET_FRAMES_MODE_NORMAL;
            } else {
                aVar = C85581w.EnumC85602a.GET_FRAMES_MODE_NOEFFECT;
            }
            if (this.f159139u.isMultiVideoEdit()) {
                pVar = new C74297p(new VEMultiEditVideoCoverGeneratorImpl(this.f159137s, this.f159121c, ceil, this.f159137s.mo56368j(), (int) this.f159139u.getMultiEditVideoStartTime(), aVar), frameWidth, frameHeight, ceil);
            } else {
                pVar = new C74297p(new VEVideoCoverGeneratorImpl(this.f159137s, this.f159121c, ceil, aVar, "sticker_select_time"), frameWidth, frameHeight, ceil);
            }
            this.f159118Y = pVar;
            this.f159126h.mo111139a(this.f159121c, this.f159130l, pVar, this.f159142x);
            this.f159126h.setEnableBoundaryText(true);
            this.f159126h.setPointerType(2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo112256f() {
        boolean z = !this.f159116W;
        this.f159116W = z;
        mo112248a(z);
        mo112259i();
        AbstractC71061a aVar = this.f159103J;
        if (aVar != null) {
            aVar.mo112270b(this.f159116W);
        }
        if (!this.f159116W) {
            this.f159129k.setImageDrawable(this.f159121c.getResources().getDrawable(2131231564));
            this.f159138t.mo112195a().setValue(C88296t.m153436a((long) this.f159137s.mo56370k()));
            this.f159138t.mo112195a().setValue(C88296t.m153437b());
            this.f159143y.removeCallbacks(this.f159101H);
            AbstractC45897c cVar = this.f159104K;
            if (cVar != null) {
                cVar.setAlpha(true);
                AbstractC45897c cVar2 = this.f159104K;
                if (cVar2 instanceof C46239q) {
                    TextStickerData data = ((C46239q) cVar2).getData();
                    if (!(this.f159126h == null || data == null || !data.getHasReadTextAudio())) {
                        VideoEditView videoEditView = this.f159126h;
                        videoEditView.f157585A.getViewTreeObserver().addOnGlobalLayoutListener(
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0089: INVOKE  
                              (wrap: android.view.ViewTreeObserver : 0x0080: INVOKE  (r1v11 android.view.ViewTreeObserver) = 
                              (wrap: com.ss.android.ugc.aweme.shortvideo.cut.videoedit.AudioTrackView : 0x007e: IGET  (r0v27 com.ss.android.ugc.aweme.shortvideo.cut.videoedit.AudioTrackView) = (r5v0 'videoEditView' com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditView) com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditView.A com.ss.android.ugc.aweme.shortvideo.cut.videoedit.AudioTrackView)
                             type: VIRTUAL call: com.ss.android.ugc.aweme.shortvideo.cut.videoedit.AudioTrackView.getViewTreeObserver():android.view.ViewTreeObserver)
                              (wrap: com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditView$3 : 0x0086: CONSTRUCTOR  (r0v28 com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditView$3) = 
                              (r5v0 'videoEditView' com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditView)
                              (wrap: int : 0x0074: INVOKE  (r4v0 int) = (r1v10 'data' com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData) type: VIRTUAL call: com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData.getAudioTrackDuration():int)
                              (wrap: int : 0x007a: INVOKE  (r2v3 int) = 
                              (wrap: com.ss.android.ugc.asve.editor.f : 0x0078: IGET  (r0v26 com.ss.android.ugc.asve.editor.f) = (r6v0 'this' com.ss.android.ugc.aweme.shortvideo.edit.infosticker.i A[IMMUTABLE_TYPE, THIS]) com.ss.android.ugc.aweme.shortvideo.edit.infosticker.i.s com.ss.android.ugc.asve.editor.f)
                             type: INTERFACE call: com.ss.android.ugc.asve.editor.f.G():int)
                             call: com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditView.3.<init>(com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditView, int, int):void type: CONSTRUCTOR)
                             type: VIRTUAL call: android.view.ViewTreeObserver.addOnGlobalLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener):void in method: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.i.f():void, file: classes8.dex
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                            Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0086: CONSTRUCTOR  (r0v28 com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditView$3) = 
                              (r5v0 'videoEditView' com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditView)
                              (wrap: int : 0x0074: INVOKE  (r4v0 int) = (r1v10 'data' com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData) type: VIRTUAL call: com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData.getAudioTrackDuration():int)
                              (wrap: int : 0x007a: INVOKE  (r2v3 int) = 
                              (wrap: com.ss.android.ugc.asve.editor.f : 0x0078: IGET  (r0v26 com.ss.android.ugc.asve.editor.f) = (r6v0 'this' com.ss.android.ugc.aweme.shortvideo.edit.infosticker.i A[IMMUTABLE_TYPE, THIS]) com.ss.android.ugc.aweme.shortvideo.edit.infosticker.i.s com.ss.android.ugc.asve.editor.f)
                             type: INTERFACE call: com.ss.android.ugc.asve.editor.f.G():int)
                             call: com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditView.3.<init>(com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditView, int, int):void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.i.f():void, file: classes8.dex
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                            	... 34 more
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditView, state: GENERATED_AND_UNLOADED
                            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                            	... 40 more
                            */
                        /*
                        // Method dump skipped, instructions count: 193
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.C71056i.mo112256f():void");
                    }

                    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:14:0x007a */
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.CharSequence, java.lang.String] */
                    /* JADX WARN: Type inference failed for: r0v13, types: [android.text.SpannableString] */
                    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.CharSequence] */
                    /* JADX WARN: Type inference failed for: r1v5, types: [com.ss.android.ugc.aweme.themechange.base.AVDmtTextView] */
                    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.String] */
                    /* JADX WARN: Type inference failed for: r0v27 */
                    /* JADX WARN: Type inference failed for: r0v28 */
                    /* access modifiers changed from: package-private */
                    /* JADX WARNING: Unknown variable types count: 2 */
                    /* renamed from: i */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final void mo112259i() {
                        /*
                        // Method dump skipped, instructions count: 161
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.C71056i.mo112259i():void");
                    }

                    /* renamed from: b */
                    private void m125484b(boolean z) {
                        EditCornerViewModel editCornerViewModel = this.f159109P;
                        if (editCornerViewModel != null) {
                            editCornerViewModel.mo127319a(z);
                        }
                    }

                    /* renamed from: a */
                    public final void mo112244a(AbstractC45857b bVar) {
                        InfoStickerEditView infoStickerEditView = this.f159122d;
                        if (infoStickerEditView != null) {
                            infoStickerEditView.setMotionInterceptor(bVar);
                        }
                    }

                    /* renamed from: a */
                    static String m125479a(AbstractC45897c cVar) {
                        if (cVar instanceof C71044aj) {
                            return ((C71044aj) cVar).f159054c.stickerId;
                        }
                        if (cVar instanceof C46239q) {
                            return "text_sticker";
                        }
                        return "";
                    }

                    /* renamed from: a */
                    private void m125481a(AbstractC75310e eVar) {
                        if (eVar instanceof TextStickerData) {
                            TextStickerData textStickerData = (TextStickerData) eVar;
                            if (textStickerData.getHasReadTextAudio() && textStickerData.getAudioTrackIndex() >= 0) {
                                this.f159137s.mo56256a(textStickerData.getAudioTrackIndex(), 0, textStickerData.getAudioTrackDuration(), textStickerData.getStartTime(), textStickerData.getStartTime() + textStickerData.getAudioTrackDuration(), false);
                            }
                        }
                    }

                    /* renamed from: b */
                    private void m125483b(AbstractC45904h hVar) {
                        this.f159134p.setProgress((int) ((((float) (this.f159137s.mo56370k() - hVar.mo65014a(0))) / ((float) (hVar.mo65018b(this.f159137s.mo56368j()) - hVar.mo65014a(0)))) * 100.0f));
                    }

                    /* renamed from: d */
                    private void m125486d(AbstractC45904h hVar) {
                        int d = hVar.mo65022d();
                        int c = hVar.mo65020c(this.f159137s.mo56246G());
                        if (d >= 0 && c >= 0 && !mo112252a(d, c, hVar)) {
                            this.f159143y.postDelayed(new RunnableC71390y(this, d, c, hVar), 300);
                        }
                        mo112259i();
                    }

                    /* renamed from: c */
                    private void m125485c(AbstractC45904h hVar) {
                        String str;
                        String str2;
                        if (hVar != null && (hVar instanceof C71044aj)) {
                            boolean z = ((C71044aj) hVar).f159064m;
                            C84425b a = new C84425b().mo129406a("prop_id", m125479a((AbstractC45897c) hVar)).mo129406a("creation_id", this.f159139u.creationId);
                            if (this.f159104K == null) {
                                str = "click";
                            } else {
                                str = "change";
                            }
                            C84425b a2 = a.mo129406a("method", str).mo129406a("content_type", this.f159139u.getAvetParameter().getContentType()).mo129406a("content_source", this.f159139u.getAvetParameter().getContentSource()).mo129406a("shoot_entrance", this.f159139u.mShootWay);
                            if (this.f159119a) {
                                str2 = "edit_post_page";
                            } else {
                                str2 = "video_edit_page";
                            }
                            C84425b a3 = a2.mo129406a("enter_from", str2).mo129403a("is_diy_prop", z ? 1 : 0);
                            if (this.f159139u.draftId != 0) {
                                a3.mo129403a("draft_id", this.f159139u.draftId);
                            }
                            if (!TextUtils.isEmpty(this.f159139u.newDraftId)) {
                                a3.mo129406a("new_draft_id", this.f159139u.newDraftId);
                            }
                            C80322d.m139251a("prop_time_set", a3.f188764a);
                        }
                    }

                    /* renamed from: a */
                    public final void mo112245a(AbstractC45904h hVar) {
                        mo112246a(hVar, 0);
                        m125488l();
                    }

                    /* renamed from: a */
                    public final void mo112247a(InfoStickerModel infoStickerModel) {
                        this.f159122d.mo112165a(infoStickerModel, true);
                    }

                    /* renamed from: a */
                    public final void mo112248a(boolean z) {
                        this.f159122d.mo112168a(z);
                        if (this.f159104K != null && mo112258h()) {
                            this.f159104K.setAlpha(true);
                        }
                    }

                    /* access modifiers changed from: package-private */
                    /* renamed from: a */
                    public final void mo112243a(int i, int i2) {
                        m125480a(i, i2, false, false);
                    }

                    public C71056i(AbstractC72510a aVar, AbstractC82503a aVar2) {
                        this.f159111R = aVar;
                        this.f159113T = aVar2;
                    }

                    /* renamed from: a */
                    private void m125482a(FormatFlagsConversionMismatchException formatFlagsConversionMismatchException, String str) {
                        try {
                            C40982q.m82522a("info_sticker_string_format_event", new C69840ar().mo110189a("exception", C24098m.m45633c(formatFlagsConversionMismatchException)).mo110189a("event", "normal_str=" + str + ", error_str=" + this.f159125g.getContext().getResources().getString(R.string.cmb)).mo110191a());
                        } catch (Exception e) {
                            C73991bj.m130131b(e.getLocalizedMessage());
                        }
                    }

                    /* renamed from: a */
                    public final void mo112246a(AbstractC45904h hVar, int i) {
                        if (hVar != this.f159104K) {
                            if (hVar != null) {
                                if (!this.f159105L.containsKey(hVar)) {
                                    this.f159105L.put(hVar, hVar.mo65021c());
                                }
                                hVar.setAlpha(true);
                                if (hVar instanceof C71044aj) {
                                    this.f159143y.post(new RunnableC71037ac(this));
                                }
                                if (this.f159141w && i == 0) {
                                    m125486d(hVar);
                                }
                                AbstractC45897c cVar = this.f159104K;
                                if (cVar != null) {
                                    if (i != 0) {
                                        if (i == 1 && this.f159114U) {
                                            cVar.setAlpha(false);
                                        }
                                    } else if (this.f159141w) {
                                        cVar.setAlpha(false);
                                    }
                                    if (this.f159104K instanceof C71044aj) {
                                        this.f159137s.mo56392w();
                                    }
                                }
                                if (i == 0) {
                                    m125485c(hVar);
                                } else if (i == 1) {
                                    m125483b(hVar);
                                }
                            } else {
                                for (Map.Entry<AbstractC45904h, AbstractC75310e> entry : this.f159105L.entrySet()) {
                                    AbstractC45904h key = entry.getKey();
                                    AbstractC75310e value = entry.getValue();
                                    if (!(key == null || value == null)) {
                                        key.mo65017a(value, this.f159122d.f158994c, this.f159122d.f158995d);
                                        m125481a(value);
                                    }
                                }
                                this.f159105L.clear();
                            }
                            this.f159104K = hVar;
                            m125488l();
                        }
                    }

                    /* renamed from: a */
                    private void m125480a(int i, int i2, boolean z, boolean z2) {
                        mo112259i();
                        if (this.f159104K != null) {
                            int s = this.f159137s.mo56386s(i);
                            int s2 = this.f159137s.mo56386s(i2);
                            if (mo112258h()) {
                                this.f159122d.mo112167a((C71044aj) this.f159104K, s, s2);
                                return;
                            }
                            AbstractC45897c cVar = this.f159104K;
                            if (cVar instanceof C46239q) {
                                TextStickerData data = ((C46239q) cVar).getData();
                                if (data != null) {
                                    data.setStartTime(s);
                                    data.setEndTime(s2);
                                    data.setUiStartTime(i);
                                    data.setUiEndTime(i2);
                                    if (z) {
                                        m125488l();
                                    }
                                    if (z2 && data.getHasReadTextAudio() && data.getAudioTrackIndex() >= 0) {
                                        this.f159137s.mo56256a(data.getAudioTrackIndex(), 0, data.getAudioTrackDuration(), s, s + data.getAudioTrackDuration(), false);
                                    }
                                }
                            } else if (cVar instanceof CommentStickerView) {
                                CommentVideoModel data2 = ((CommentStickerView) cVar).getData();
                                if (data2 != null) {
                                    data2.setStartTime(s);
                                    data2.setEndTime(s2);
                                }
                            } else if (cVar instanceof AbstractC71109e) {
                                ((AbstractC71109e) cVar).setStartTime(s);
                                ((AbstractC71109e) this.f159104K).setEndTime(s2);
                            }
                        }
                    }
                }
