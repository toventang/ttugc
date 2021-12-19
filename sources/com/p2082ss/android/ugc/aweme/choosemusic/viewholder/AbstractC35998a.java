package com.p2082ss.android.ugc.aweme.choosemusic.viewholder;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.C0643b;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p2082ss.android.ugc.aweme.choosemusic.C35754b;
import com.p2082ss.android.ugc.aweme.choosemusic.p2462b.C35757c;
import com.p2082ss.android.ugc.aweme.choosemusic.view.AbstractC35989s;
import com.p2082ss.android.ugc.aweme.discover.helper.AbstractC42024k;
import com.p2082ss.android.ugc.aweme.music.p3465b.AbstractC60731k;
import com.p2082ss.android.ugc.aweme.music.p3471f.C60793b;
import com.p2082ss.android.ugc.aweme.music.p3476k.C60826d;
import com.p2082ss.android.ugc.aweme.music.p3481ui.CheckableImageView;
import com.p2082ss.android.ugc.aweme.music.p3481ui.p3483b.C61137d;
import com.p2082ss.android.ugc.aweme.search.C67446h;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p2082ss.android.ugc.aweme.utils.C80471gb;
import com.p2082ss.android.ugc.aweme.utils.C80565ia;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.viewholder.a */
public abstract class AbstractC35998a extends RecyclerView.ViewHolder {

    /* renamed from: z */
    private static int f84996z;

    /* renamed from: A */
    private int f84997A;

    /* renamed from: B */
    private int f84998B;

    /* renamed from: C */
    private boolean f84999C;

    /* renamed from: D */
    private boolean f85000D;

    /* renamed from: E */
    private AbstractC35989s f85001E;

    /* renamed from: F */
    private AbstractC42024k f85002F;

    /* renamed from: G */
    private AbstractC60731k<C35757c> f85003G;

    /* renamed from: H */
    private int f85004H;

    /* renamed from: a */
    SmartImageView f85005a;

    /* renamed from: b */
    ImageView f85006b;

    /* renamed from: c */
    ImageView f85007c;

    /* renamed from: d */
    ImageView f85008d;

    /* renamed from: e */
    TextView f85009e;

    /* renamed from: f */
    TextView f85010f;

    /* renamed from: g */
    CheckableImageView f85011g;

    /* renamed from: h */
    ImageView f85012h;

    /* renamed from: i */
    ViewGroup f85013i;

    /* renamed from: j */
    ImageView f85014j;

    /* renamed from: k */
    TextView f85015k;

    /* renamed from: l */
    ViewGroup f85016l;

    /* renamed from: m */
    TextView f85017m;

    /* renamed from: n */
    ViewGroup f85018n;

    /* renamed from: o */
    public ViewGroup f85019o;

    /* renamed from: p */
    ViewGroup f85020p;

    /* renamed from: q */
    ViewGroup f85021q;

    /* renamed from: r */
    View f85022r;

    /* renamed from: s */
    TextView f85023s;

    /* renamed from: t */
    RecyclerView f85024t;

    /* renamed from: u */
    public boolean f85025u;

    /* renamed from: v */
    protected Context f85026v;

    /* renamed from: w */
    public MusicModel f85027w;

    /* renamed from: x */
    public int f85028x;

    /* renamed from: y */
    protected C35754b f85029y;

    static {
        Covode.recordClassIndex(43244);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo63151a();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo63157c();

    /* renamed from: d */
    public final void mo63158d() {
        if (this.f85027w.getCollectionType() != null) {
            this.f85025u = MusicModel.CollectionType.COLLECTED.equals(this.f85027w.getCollectionType());
        }
        mo63160f();
    }

    /* renamed from: f */
    public final void mo63160f() {
        int i;
        CheckableImageView checkableImageView = this.f85011g;
        if (this.f85025u) {
            i = 2131232176;
        } else {
            i = 2131232177;
        }
        checkableImageView.setImageResource(i);
    }

    /* renamed from: b */
    public final void mo63156b() {
        this.itemView.setPadding(0, 0, 0, 0);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f85020p.getLayoutParams();
        marginLayoutParams.bottomMargin = (int) C13628n.m24520b(this.f85026v, 2.0f);
        marginLayoutParams.topMargin = (int) C13628n.m24520b(this.f85026v, 2.0f);
        this.f85020p.requestLayout();
        this.f85022r.setVisibility(8);
        this.f85013i.requestLayout();
    }

    /* renamed from: e */
    public final void mo63159e() {
        String str;
        MusicModel musicModel = this.f85027w;
        if (musicModel != null) {
            if (this.f85025u || C60826d.m110428a(musicModel, this.f85026v, true)) {
                AbstractC60731k<C35757c> kVar = this.f85003G;
                if (kVar != null) {
                    MusicModel musicModel2 = this.f85027w;
                    if (this.f85025u) {
                        str = "unfollow_type";
                    } else {
                        str = "follow_type";
                    }
                    kVar.mo62879a(new C35757c(musicModel2, str, this.f84998B, this.f85028x));
                }
                this.f85025u = !this.f85025u;
                this.f85011g.mo98607b();
            }
        }
    }

    /* renamed from: d */
    private void m73424d(boolean z) {
        if (!z) {
            m73422b(true);
        } else {
            m73423c(true);
        }
    }

    /* renamed from: a */
    public final void mo63152a(View view) {
        AbstractC35989s sVar = this.f85001E;
        if (sVar != null && (this instanceof C36050s)) {
            sVar.mo62753a((C36050s) this, view, this.f85027w, this.f84997A);
        }
    }

    /* renamed from: a */
    private void m73421a(boolean z) {
        this.f85008d.clearAnimation();
        if (z) {
            MusicModel musicModel = this.f85027w;
            if (musicModel == null) {
                return;
            }
            if (musicModel.getMusicType() == MusicModel.MusicType.LOCAL) {
                this.f85008d.setImageResource(2131232363);
            } else if (this.f85027w.getMusicType() == MusicModel.MusicType.ONLINE) {
                this.f85008d.setVisibility(0);
                this.f85008d.setImageResource(2131232363);
            }
        } else {
            this.f85008d.setVisibility(0);
            this.f85008d.setImageResource(2131232344);
        }
    }

    /* renamed from: b */
    private void m73422b(boolean z) {
        if (this.f85000D) {
            this.f85016l.setVisibility(8);
        } else if (this.f85013i.getVisibility() != 8) {
            if (z) {
                this.f85019o.setClickable(false);
                int i = -f84996z;
                int b = (int) C13628n.m24520b(this.f85026v, 30.0f);
                if (C80471gb.m139483a(this.f85026v)) {
                    b = -b;
                }
                m73420a(0, 1, 0, 0, i, 0, b, true);
                return;
            }
            this.f85013i.setVisibility(8);
        }
    }

    /* renamed from: c */
    private void m73423c(boolean z) {
        if (this.f85000D) {
            this.f85016l.setVisibility(0);
        } else if (this.f85013i.getVisibility() != 0) {
            if (z) {
                this.f85019o.setClickable(false);
                int i = -f84996z;
                int b = (int) C13628n.m24520b(this.f85026v, 30.0f);
                if (C80471gb.m139483a(this.f85026v)) {
                    b = -b;
                }
                this.f85013i.setVisibility(0);
                if (C80471gb.m139483a(this.f85026v)) {
                    ((ViewGroup.MarginLayoutParams) this.f85018n.getLayoutParams()).leftMargin = -f84996z;
                } else {
                    ((ViewGroup.MarginLayoutParams) this.f85018n.getLayoutParams()).rightMargin = -f84996z;
                }
                m73420a(100, 0, 1, i, 0, b, 0, false);
                return;
            }
            this.f85013i.setVisibility(0);
        }
    }

    /* renamed from: a */
    public final void mo63153a(AbstractC35989s sVar, AbstractC60731k<C35757c> kVar) {
        this.f85001E = sVar;
        this.f85003G = kVar;
    }

    /* renamed from: a */
    public final void mo63155a(boolean z, boolean z2) {
        if (z) {
            Animation loadAnimation = AnimationUtils.loadAnimation(this.itemView.getContext(), R.anim.da);
            loadAnimation.setInterpolator(new LinearInterpolator());
            this.f85008d.setImageResource(2131232640);
            this.f85008d.startAnimation(loadAnimation);
            return;
        }
        this.f85008d.clearAnimation();
        m73421a(z2);
        m73424d(z2);
    }

    public AbstractC35998a(View view, int i) {
        super(view);
        this.f85026v = view.getContext();
        this.f85004H = i;
        this.f85005a = (SmartImageView) view.findViewById(R.id.buj);
        this.f85006b = (ImageView) view.findViewById(R.id.by7);
        this.f85007c = (ImageView) view.findViewById(R.id.bxr);
        this.f85008d = (ImageView) view.findViewById(R.id.bzx);
        this.f85009e = (TextView) view.findViewById(R.id.ezz);
        this.f85010f = (TextView) view.findViewById(R.id.f3z);
        this.f85011g = (CheckableImageView) view.findViewById(R.id.bxo);
        this.f85012h = (ImageView) view.findViewById(R.id.bxq);
        this.f85013i = (ViewGroup) view.findViewById(R.id.cey);
        this.f85014j = (ImageView) view.findViewById(R.id.c13);
        this.f85015k = (TextView) view.findViewById(R.id.f6p);
        this.f85016l = (ViewGroup) view.findViewById(R.id.dma);
        this.f85017m = (TextView) view.findViewById(R.id.f6q);
        this.f85018n = (ViewGroup) view.findViewById(R.id.dm_);
        this.f85019o = (ViewGroup) view.findViewById(R.id.cds);
        this.f85020p = (ViewGroup) view.findViewById(R.id.dl9);
        this.f85021q = (ViewGroup) view.findViewById(R.id.ces);
        this.f85022r = view.findViewById(R.id.fhx);
        this.f85023s = (TextView) view.findViewById(R.id.ezr);
        this.f85024t = (RecyclerView) view.findViewById(R.id.coi);
        View findViewById = view.findViewById(R.id.bxq);
        if (findViewById != null) {
            findViewById.setOnClickListener(new View$OnClickListenerC36004b(this));
        }
        View findViewById2 = view.findViewById(R.id.bxo);
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(new View$OnClickListenerC36005c(this));
        }
        View findViewById3 = view.findViewById(R.id.cey);
        if (findViewById3 != null) {
            findViewById3.setOnClickListener(new View$OnClickListenerC36006d(this));
        }
        View findViewById4 = view.findViewById(R.id.cds);
        if (findViewById4 != null) {
            findViewById4.setOnClickListener(new View$OnClickListenerC36007e(this));
        }
        View findViewById5 = view.findViewById(R.id.dma);
        if (findViewById5 != null) {
            findViewById5.setOnClickListener(new View$OnClickListenerC36008f(this));
        }
        mo63151a();
        if (f84996z <= 0) {
            this.f85013i.measure(View.MeasureSpec.makeMeasureSpec(536870911, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(536870911, Integer.MIN_VALUE));
            f84996z = (int) (((float) this.f85013i.getMeasuredWidth()) + C13628n.m24520b(this.f85026v, 8.0f));
        }
        this.f85011g.setOnStateChangeListener(new CheckableImageView.AbstractC61078a() {
            /* class com.p2082ss.android.ugc.aweme.choosemusic.viewholder.AbstractC35998a.C359991 */

            static {
                Covode.recordClassIndex(43245);
            }

            @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.CheckableImageView.AbstractC61078a
            public final void bX_() {
                AbstractC35998a aVar = AbstractC35998a.this;
                boolean z = aVar.f85025u;
                AbstractC81915c.m141874a(new C60793b(z ? 1 : 0, aVar.f85027w));
            }

            @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.CheckableImageView.AbstractC61078a
            /* renamed from: a */
            public final void mo62594a(int i) {
                if (i == 1) {
                    AbstractC35998a.this.mo63160f();
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo63154a(MusicModel musicModel, boolean z, boolean z2, boolean z3, int i, int i2, C35754b bVar) {
        String str;
        String singer;
        int i3;
        if (musicModel != null) {
            this.f84999C = z;
            this.f85000D = z2;
            this.f85028x = i2;
            this.f84998B = i;
            this.f85029y = bVar;
            this.f85027w = musicModel;
            this.f84997A = 0;
            mo63158d();
            if (!TextUtils.isEmpty(this.f85027w.getName())) {
                this.f85009e.setText(this.f85027w.getName());
            } else {
                this.f85009e.setTextColor(C0643b.m2378c(this.f85026v, R.color.bx));
                TextView textView = this.f85009e;
                if (!TextUtils.isEmpty(this.f85027w.getName())) {
                    str = this.f85027w.getName();
                } else {
                    str = "";
                }
                textView.setText(str);
            }
            if (TextUtils.isEmpty(this.f85027w.getName()) || (!this.f85027w.isOriginal() && !this.f85027w.isArtist())) {
                this.f85006b.setVisibility(8);
            } else {
                this.f85006b.setVisibility(0);
            }
            C61137d.m110755a(this.f85009e, this.f85027w.getMusic());
            if (this.f85027w.getMatchedPGCSoundInfo() != null && !TextUtils.isEmpty(this.f85027w.getMatchedPGCSoundInfo().getMixedAuthor())) {
                this.f85010f.setText(this.f85027w.getMatchedPGCSoundInfo().getMixedAuthor());
            } else if (this.f85027w.isPgc() || this.f85027w.getMatchedSongInfo() == null || TextUtils.isEmpty(this.f85027w.getMatchedSongInfo().getTitle())) {
                TextView textView2 = this.f85010f;
                if (TextUtils.isEmpty(this.f85027w.getSinger())) {
                    singer = this.f85026v.getString(R.string.h1c);
                } else {
                    singer = this.f85027w.getSinger();
                }
                textView2.setText(singer);
            } else {
                try {
                    this.f85010f.setText(this.itemView.getContext().getString(R.string.n, "\"" + this.f85027w.getMatchedSongInfo().getTitle() + "\""));
                } catch (Exception e) {
                    e.printStackTrace();
                    this.f85010f.setVisibility(8);
                }
            }
            SmartImageView smartImageView = this.f85005a;
            smartImageView.post(new RunnableC36010h(this.f85027w, smartImageView));
            this.f85023s.setText(C80565ia.m139648a(this.f85027w.getPresenterDuration()));
            m73421a(z3);
            if (z3) {
                m73423c(false);
            } else {
                m73422b(false);
            }
            if (musicModel.getMusicType() == MusicModel.MusicType.LOCAL) {
                this.f85011g.setVisibility(8);
                this.f85012h.setVisibility(8);
            } else {
                this.f85011g.setVisibility(0);
                this.f85012h.setVisibility(8);
            }
            if (this.f84999C && this.f85028x < 12) {
                this.f85007c.setVisibility(0);
                switch (this.f85028x) {
                    case 0:
                        i3 = 2131232928;
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f85007c.getLayoutParams();
                        marginLayoutParams.topMargin = (int) C13628n.m24520b(this.f85007c.getContext(), 0.0f);
                        marginLayoutParams.leftMargin = marginLayoutParams.topMargin;
                        this.f85007c.setImageResource(i3);
                        break;
                    case 1:
                        i3 = 2131232932;
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f85007c.getLayoutParams();
                        marginLayoutParams2.topMargin = (int) C13628n.m24520b(this.f85007c.getContext(), 0.0f);
                        marginLayoutParams2.leftMargin = marginLayoutParams2.topMargin;
                        this.f85007c.setImageResource(i3);
                        break;
                    case 2:
                        i3 = 2131232933;
                        ViewGroup.MarginLayoutParams marginLayoutParams22 = (ViewGroup.MarginLayoutParams) this.f85007c.getLayoutParams();
                        marginLayoutParams22.topMargin = (int) C13628n.m24520b(this.f85007c.getContext(), 0.0f);
                        marginLayoutParams22.leftMargin = marginLayoutParams22.topMargin;
                        this.f85007c.setImageResource(i3);
                        break;
                    case 3:
                        i3 = 2131232934;
                        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) this.f85007c.getLayoutParams();
                        marginLayoutParams3.topMargin = (int) C13628n.m24520b(this.f85007c.getContext(), 2.0f);
                        marginLayoutParams3.leftMargin = marginLayoutParams3.topMargin;
                        this.f85007c.setImageResource(i3);
                        break;
                    case 4:
                        i3 = 2131232935;
                        ViewGroup.MarginLayoutParams marginLayoutParams32 = (ViewGroup.MarginLayoutParams) this.f85007c.getLayoutParams();
                        marginLayoutParams32.topMargin = (int) C13628n.m24520b(this.f85007c.getContext(), 2.0f);
                        marginLayoutParams32.leftMargin = marginLayoutParams32.topMargin;
                        this.f85007c.setImageResource(i3);
                        break;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY:
                        i3 = 2131232936;
                        ViewGroup.MarginLayoutParams marginLayoutParams322 = (ViewGroup.MarginLayoutParams) this.f85007c.getLayoutParams();
                        marginLayoutParams322.topMargin = (int) C13628n.m24520b(this.f85007c.getContext(), 2.0f);
                        marginLayoutParams322.leftMargin = marginLayoutParams322.topMargin;
                        this.f85007c.setImageResource(i3);
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                        i3 = 2131232937;
                        ViewGroup.MarginLayoutParams marginLayoutParams3222 = (ViewGroup.MarginLayoutParams) this.f85007c.getLayoutParams();
                        marginLayoutParams3222.topMargin = (int) C13628n.m24520b(this.f85007c.getContext(), 2.0f);
                        marginLayoutParams3222.leftMargin = marginLayoutParams3222.topMargin;
                        this.f85007c.setImageResource(i3);
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                        i3 = 2131232938;
                        ViewGroup.MarginLayoutParams marginLayoutParams32222 = (ViewGroup.MarginLayoutParams) this.f85007c.getLayoutParams();
                        marginLayoutParams32222.topMargin = (int) C13628n.m24520b(this.f85007c.getContext(), 2.0f);
                        marginLayoutParams32222.leftMargin = marginLayoutParams32222.topMargin;
                        this.f85007c.setImageResource(i3);
                        break;
                    case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                        i3 = 2131232939;
                        ViewGroup.MarginLayoutParams marginLayoutParams322222 = (ViewGroup.MarginLayoutParams) this.f85007c.getLayoutParams();
                        marginLayoutParams322222.topMargin = (int) C13628n.m24520b(this.f85007c.getContext(), 2.0f);
                        marginLayoutParams322222.leftMargin = marginLayoutParams322222.topMargin;
                        this.f85007c.setImageResource(i3);
                        break;
                    case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                        i3 = 2131232929;
                        ViewGroup.MarginLayoutParams marginLayoutParams3222222 = (ViewGroup.MarginLayoutParams) this.f85007c.getLayoutParams();
                        marginLayoutParams3222222.topMargin = (int) C13628n.m24520b(this.f85007c.getContext(), 2.0f);
                        marginLayoutParams3222222.leftMargin = marginLayoutParams3222222.topMargin;
                        this.f85007c.setImageResource(i3);
                        break;
                    case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                        i3 = 2131232930;
                        ViewGroup.MarginLayoutParams marginLayoutParams32222222 = (ViewGroup.MarginLayoutParams) this.f85007c.getLayoutParams();
                        marginLayoutParams32222222.topMargin = (int) C13628n.m24520b(this.f85007c.getContext(), 2.0f);
                        marginLayoutParams32222222.leftMargin = marginLayoutParams32222222.topMargin;
                        this.f85007c.setImageResource(i3);
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                        i3 = 2131232931;
                        ViewGroup.MarginLayoutParams marginLayoutParams322222222 = (ViewGroup.MarginLayoutParams) this.f85007c.getLayoutParams();
                        marginLayoutParams322222222.topMargin = (int) C13628n.m24520b(this.f85007c.getContext(), 2.0f);
                        marginLayoutParams322222222.leftMargin = marginLayoutParams322222222.topMargin;
                        this.f85007c.setImageResource(i3);
                        break;
                }
            } else {
                this.f85007c.setVisibility(8);
            }
            mo63157c();
            if (musicModel.getSoundsListType() == 2) {
                if (this.f85002F == null) {
                    this.f85002F = C67446h.f151111a.mo106217f().mo71109a(new AbstractC42024k.C42026b(this.f85020p, new C36009g(this)));
                }
                AbstractC42024k.C42025a aVar = new AbstractC42024k.C42025a();
                aVar.f97979a = ((Integer) musicModel.getExtraParamFromPretreatment().get("rank", (Object) -1)).intValue();
                this.f85002F.mo71152a(aVar);
                return;
            }
            AbstractC42024k kVar = this.f85002F;
            if (kVar != null) {
                kVar.mo71152a(new AbstractC42024k.C42025a());
            }
        }
    }

    /* renamed from: a */
    private void m73420a(long j, int i, int i2, int i3, int i4, int i5, int i6, final boolean z) {
        ValueAnimator duration = ValueAnimator.ofInt(i3, i4).setDuration(200L);
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.p2082ss.android.ugc.aweme.choosemusic.viewholder.AbstractC35998a.C360002 */

            static {
                Covode.recordClassIndex(43246);
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                if (C80471gb.m139483a(AbstractC35998a.this.f85026v)) {
                    ((ViewGroup.MarginLayoutParams) AbstractC35998a.this.f85018n.getLayoutParams()).leftMargin = intValue;
                } else {
                    ((ViewGroup.MarginLayoutParams) AbstractC35998a.this.f85018n.getLayoutParams()).rightMargin = intValue;
                }
                AbstractC35998a.this.f85018n.requestLayout();
            }
        });
        duration.addListener(new AnimatorListenerAdapter() {
            /* class com.p2082ss.android.ugc.aweme.choosemusic.viewholder.AbstractC35998a.C360013 */

            static {
                Covode.recordClassIndex(43247);
            }

            public final void onAnimationEnd(Animator animator) {
                AbstractC35998a.this.f85019o.setClickable(true);
                if (z) {
                    AbstractC35998a.this.f85013i.setVisibility(8);
                    AbstractC35998a.this.f85013i.clearAnimation();
                    if (C80471gb.m139483a(AbstractC35998a.this.f85026v)) {
                        ((ViewGroup.MarginLayoutParams) AbstractC35998a.this.f85018n.getLayoutParams()).leftMargin = 0;
                    } else {
                        ((ViewGroup.MarginLayoutParams) AbstractC35998a.this.f85018n.getLayoutParams()).rightMargin = 0;
                    }
                }
            }
        });
        AlphaAnimation alphaAnimation = new AlphaAnimation((float) i, (float) i2);
        TranslateAnimation translateAnimation = new TranslateAnimation((float) i5, (float) i6, 0.0f, 0.0f);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(alphaAnimation);
        animationSet.addAnimation(translateAnimation);
        animationSet.setFillAfter(true);
        animationSet.setDuration(100);
        animationSet.setStartOffset(j);
        this.f85013i.startAnimation(animationSet);
        duration.start();
    }
}
