package com.p2082ss.android.ugc.aweme.kids.choosemusic.p3327i;

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
import com.p2082ss.android.ugc.aweme.kids.choosemusic.C57171a;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3320b.C57192b;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3326h.AbstractC57287k;
import com.p2082ss.android.ugc.aweme.kids.p3302a.p3303a.AbstractC57080c;
import com.p2082ss.android.ugc.aweme.kids.p3302a.p3306d.C57106a;
import com.p2082ss.android.ugc.aweme.kids.p3302a.p3310h.p3311a.C57133c;
import com.p2082ss.android.ugc.aweme.kids.p3302a.p3312i.C57147c;
import com.p2082ss.android.ugc.aweme.music.p3481ui.CheckableImageView;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p2082ss.android.ugc.aweme.utils.C80471gb;
import com.p2082ss.android.ugc.aweme.utils.C80565ia;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.kids.choosemusic.i.a */
public abstract class AbstractC57298a extends RecyclerView.ViewHolder {

    /* renamed from: x */
    private static int f130530x;

    /* renamed from: A */
    private boolean f130531A;

    /* renamed from: B */
    private AbstractC57287k f130532B;

    /* renamed from: C */
    private AbstractC57080c<C57192b> f130533C;

    /* renamed from: D */
    private int f130534D;

    /* renamed from: a */
    SmartImageView f130535a;

    /* renamed from: b */
    ImageView f130536b;

    /* renamed from: c */
    ImageView f130537c;

    /* renamed from: d */
    ImageView f130538d;

    /* renamed from: e */
    TextView f130539e;

    /* renamed from: f */
    TextView f130540f;

    /* renamed from: g */
    CheckableImageView f130541g;

    /* renamed from: h */
    ImageView f130542h;

    /* renamed from: i */
    ViewGroup f130543i;

    /* renamed from: j */
    ImageView f130544j;

    /* renamed from: k */
    TextView f130545k;

    /* renamed from: l */
    ViewGroup f130546l;

    /* renamed from: m */
    public ViewGroup f130547m;

    /* renamed from: n */
    ViewGroup f130548n;

    /* renamed from: o */
    ViewGroup f130549o;

    /* renamed from: p */
    View f130550p;

    /* renamed from: q */
    TextView f130551q;

    /* renamed from: r */
    RecyclerView f130552r;

    /* renamed from: s */
    public boolean f130553s;

    /* renamed from: t */
    protected Context f130554t;

    /* renamed from: u */
    public MusicModel f130555u;

    /* renamed from: v */
    public int f130556v;

    /* renamed from: w */
    protected C57171a f130557w;

    /* renamed from: y */
    private int f130558y;

    /* renamed from: z */
    private int f130559z;

    static {
        Covode.recordClassIndex(67203);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo94499a();

    /* renamed from: c */
    public final void mo94505c() {
        if (this.f130555u.getCollectionType() != null) {
            this.f130553s = MusicModel.CollectionType.COLLECTED.equals(this.f130555u.getCollectionType());
        }
        mo94507e();
    }

    /* renamed from: e */
    public final void mo94507e() {
        int i;
        CheckableImageView checkableImageView = this.f130541g;
        if (this.f130553s) {
            i = 2131232176;
        } else {
            i = 2131233057;
        }
        checkableImageView.setImageResource(i);
    }

    /* renamed from: d */
    public final void mo94506d() {
        String str;
        MusicModel musicModel = this.f130555u;
        if (musicModel != null) {
            if (this.f130553s || C57147c.m103544a(musicModel, this.f130554t, true)) {
                AbstractC57080c<C57192b> cVar = this.f130533C;
                if (cVar != null) {
                    MusicModel musicModel2 = this.f130555u;
                    if (this.f130553s) {
                        str = "unfollow_type";
                    } else {
                        str = "follow_type";
                    }
                    cVar.mo94240a(new C57192b(musicModel2, str, this.f130559z, this.f130556v));
                }
                this.f130553s = !this.f130553s;
                this.f130541g.mo98607b();
            }
        }
    }

    /* renamed from: b */
    public final void mo94504b() {
        this.itemView.setPadding(0, 0, 0, 0);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f130548n.getLayoutParams();
        marginLayoutParams.bottomMargin = (int) C13628n.m24520b(this.f130554t, 2.0f);
        marginLayoutParams.topMargin = (int) C13628n.m24520b(this.f130554t, 2.0f);
        this.f130548n.requestLayout();
        this.f130550p.setVisibility(8);
        ((ViewGroup.MarginLayoutParams) this.f130543i.getLayoutParams()).rightMargin = (int) C13628n.m24520b(this.f130554t, 8.0f);
        this.f130543i.requestLayout();
    }

    /* renamed from: d */
    private void m103887d(boolean z) {
        if (!z) {
            m103885b(true);
        } else {
            m103886c(true);
        }
    }

    /* renamed from: a */
    public final void mo94500a(View view) {
        AbstractC57287k kVar = this.f130532B;
        if (kVar != null && (this instanceof C57320o)) {
            kVar.mo94379a((C57320o) this, view, this.f130555u);
        }
    }

    /* renamed from: a */
    private void m103884a(boolean z) {
        this.f130538d.clearAnimation();
        if (z) {
            MusicModel musicModel = this.f130555u;
            if (musicModel == null) {
                return;
            }
            if (musicModel.getMusicType() == MusicModel.MusicType.LOCAL) {
                this.f130538d.setImageResource(2131233061);
            } else if (this.f130555u.getMusicType() == MusicModel.MusicType.ONLINE) {
                this.f130538d.setVisibility(0);
                this.f130538d.setImageResource(2131233061);
            }
        } else {
            this.f130538d.setVisibility(0);
            this.f130538d.setImageResource(2131233062);
        }
    }

    /* renamed from: b */
    private void m103885b(boolean z) {
        if (this.f130543i.getVisibility() != 8) {
            if (z) {
                this.f130547m.setClickable(false);
                int i = -f130530x;
                int b = (int) C13628n.m24520b(this.f130554t, 30.0f);
                if (C80471gb.m139483a(this.f130554t)) {
                    b = -b;
                }
                m103883a(0, 1, 0, 0, i, 0, b, true);
                return;
            }
            this.f130543i.setVisibility(8);
        }
    }

    /* renamed from: c */
    private void m103886c(boolean z) {
        if (this.f130543i.getVisibility() != 0) {
            if (z) {
                this.f130547m.setClickable(false);
                int i = -f130530x;
                int b = (int) C13628n.m24520b(this.f130554t, 30.0f);
                if (C80471gb.m139483a(this.f130554t)) {
                    b = -b;
                }
                this.f130543i.setVisibility(0);
                if (C80471gb.m139483a(this.f130554t)) {
                    ((ViewGroup.MarginLayoutParams) this.f130546l.getLayoutParams()).leftMargin = -f130530x;
                } else {
                    ((ViewGroup.MarginLayoutParams) this.f130546l.getLayoutParams()).rightMargin = -f130530x;
                }
                m103883a(100, 0, 1, i, 0, b, 0, false);
                return;
            }
            this.f130543i.setVisibility(0);
        }
    }

    /* renamed from: a */
    public final void mo94501a(AbstractC57287k kVar, AbstractC57080c<C57192b> cVar) {
        this.f130532B = kVar;
        this.f130533C = cVar;
    }

    /* renamed from: a */
    public final void mo94503a(boolean z, boolean z2) {
        if (z) {
            Animation loadAnimation = AnimationUtils.loadAnimation(this.itemView.getContext(), R.anim.da);
            loadAnimation.setInterpolator(new LinearInterpolator());
            this.f130538d.setImageResource(2131232639);
            this.f130538d.startAnimation(loadAnimation);
            return;
        }
        this.f130538d.clearAnimation();
        m103884a(z2);
        m103887d(z2);
    }

    public AbstractC57298a(View view, int i) {
        super(view);
        this.f130554t = view.getContext();
        this.f130534D = i;
        this.f130535a = (SmartImageView) view.findViewById(R.id.buj);
        this.f130536b = (ImageView) view.findViewById(R.id.by7);
        this.f130537c = (ImageView) view.findViewById(R.id.bxr);
        this.f130538d = (ImageView) view.findViewById(R.id.bzx);
        this.f130539e = (TextView) view.findViewById(R.id.ezz);
        this.f130540f = (TextView) view.findViewById(R.id.f3z);
        this.f130541g = (CheckableImageView) view.findViewById(R.id.bxo);
        this.f130542h = (ImageView) view.findViewById(R.id.bxq);
        this.f130543i = (ViewGroup) view.findViewById(R.id.cey);
        this.f130544j = (ImageView) view.findViewById(R.id.c13);
        this.f130545k = (TextView) view.findViewById(R.id.f6p);
        this.f130546l = (ViewGroup) view.findViewById(R.id.dm_);
        this.f130547m = (ViewGroup) view.findViewById(R.id.cds);
        this.f130548n = (ViewGroup) view.findViewById(R.id.dl9);
        this.f130549o = (ViewGroup) view.findViewById(R.id.ces);
        this.f130550p = view.findViewById(R.id.fhx);
        this.f130551q = (TextView) view.findViewById(R.id.ezr);
        this.f130552r = (RecyclerView) view.findViewById(R.id.coi);
        View findViewById = view.findViewById(R.id.bxq);
        if (findViewById != null) {
            findViewById.setOnClickListener(new View$OnClickListenerC57302b(this));
        }
        View findViewById2 = view.findViewById(R.id.bxo);
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(new View$OnClickListenerC57303c(this));
        }
        View findViewById3 = view.findViewById(R.id.cey);
        if (findViewById3 != null) {
            findViewById3.setOnClickListener(new View$OnClickListenerC57304d(this));
        }
        View findViewById4 = view.findViewById(R.id.cds);
        if (findViewById4 != null) {
            findViewById4.setOnClickListener(new View$OnClickListenerC57305e(this));
        }
        mo94499a();
        if (f130530x <= 0) {
            this.f130543i.measure(View.MeasureSpec.makeMeasureSpec(536870911, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(536870911, Integer.MIN_VALUE));
            f130530x = (int) (((float) this.f130543i.getMeasuredWidth()) + C13628n.m24520b(this.f130554t, 8.0f));
        }
        this.f130541g.setOnStateChangeListener(new CheckableImageView.AbstractC61078a() {
            /* class com.p2082ss.android.ugc.aweme.kids.choosemusic.p3327i.AbstractC57298a.C572991 */

            static {
                Covode.recordClassIndex(67204);
            }

            @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.CheckableImageView.AbstractC61078a
            public final void bX_() {
                AbstractC57298a aVar = AbstractC57298a.this;
                boolean z = aVar.f130553s;
                AbstractC81915c.m141874a(new C57106a(z ? 1 : 0, aVar.f130555u));
            }

            @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.CheckableImageView.AbstractC61078a
            /* renamed from: a */
            public final void mo62594a(int i) {
                if (i == 1) {
                    AbstractC57298a.this.mo94507e();
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo94502a(MusicModel musicModel, boolean z, boolean z2, int i, int i2, C57171a aVar) {
        String str;
        TextView textView;
        String singer;
        int i3;
        if (musicModel != null) {
            this.f130531A = z;
            this.f130556v = i2;
            this.f130559z = i;
            this.f130557w = aVar;
            this.f130555u = musicModel;
            this.f130558y = 0;
            mo94505c();
            if (!TextUtils.isEmpty(this.f130555u.getName())) {
                this.f130539e.setText(this.f130555u.getName());
            } else {
                this.f130539e.setTextColor(C0643b.m2378c(this.f130554t, R.color.bx));
                TextView textView2 = this.f130539e;
                if (!TextUtils.isEmpty(this.f130555u.getName())) {
                    str = this.f130555u.getName();
                } else {
                    str = "";
                }
                textView2.setText(str);
            }
            if (TextUtils.isEmpty(this.f130555u.getName()) || (!this.f130555u.isOriginal() && !this.f130555u.isArtist())) {
                this.f130536b.setVisibility(8);
            } else {
                this.f130536b.setVisibility(0);
            }
            C57133c.m103508a(this.f130539e, this.f130555u.getMusic());
            if (this.f130555u.getMatchedPGCSoundInfo() == null || TextUtils.isEmpty(this.f130555u.getMatchedPGCSoundInfo().getMixedAuthor())) {
                textView = this.f130540f;
                if (TextUtils.isEmpty(this.f130555u.getSinger())) {
                    singer = this.f130554t.getString(R.string.h1c);
                } else {
                    singer = this.f130555u.getSinger();
                }
            } else {
                textView = this.f130540f;
                singer = this.f130555u.getMatchedPGCSoundInfo().getMixedAuthor();
            }
            textView.setText(singer);
            SmartImageView smartImageView = this.f130535a;
            smartImageView.post(new RunnableC57306f(this.f130555u, smartImageView));
            this.f130551q.setText(C80565ia.m139648a(this.f130555u.getPresenterDuration()));
            m103884a(z2);
            if (z2) {
                m103886c(false);
            } else {
                m103885b(false);
            }
            if (musicModel.getMusicType() == MusicModel.MusicType.LOCAL) {
                this.f130541g.setVisibility(8);
                this.f130542h.setVisibility(8);
            } else {
                this.f130541g.setVisibility(0);
                this.f130542h.setVisibility(8);
            }
            if (!this.f130531A || this.f130556v >= 12) {
                this.f130537c.setVisibility(8);
                return;
            }
            this.f130537c.setVisibility(0);
            switch (this.f130556v) {
                case 0:
                    i3 = 2131232928;
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f130537c.getLayoutParams();
                    marginLayoutParams.topMargin = (int) C13628n.m24520b(this.f130537c.getContext(), 0.0f);
                    marginLayoutParams.leftMargin = marginLayoutParams.topMargin;
                    this.f130537c.setImageResource(i3);
                    return;
                case 1:
                    i3 = 2131232932;
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f130537c.getLayoutParams();
                    marginLayoutParams2.topMargin = (int) C13628n.m24520b(this.f130537c.getContext(), 0.0f);
                    marginLayoutParams2.leftMargin = marginLayoutParams2.topMargin;
                    this.f130537c.setImageResource(i3);
                    return;
                case 2:
                    i3 = 2131232933;
                    ViewGroup.MarginLayoutParams marginLayoutParams22 = (ViewGroup.MarginLayoutParams) this.f130537c.getLayoutParams();
                    marginLayoutParams22.topMargin = (int) C13628n.m24520b(this.f130537c.getContext(), 0.0f);
                    marginLayoutParams22.leftMargin = marginLayoutParams22.topMargin;
                    this.f130537c.setImageResource(i3);
                    return;
                case 3:
                    i3 = 2131232934;
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) this.f130537c.getLayoutParams();
                    marginLayoutParams3.topMargin = (int) C13628n.m24520b(this.f130537c.getContext(), 2.0f);
                    marginLayoutParams3.leftMargin = marginLayoutParams3.topMargin;
                    this.f130537c.setImageResource(i3);
                    return;
                case 4:
                    i3 = 2131232935;
                    ViewGroup.MarginLayoutParams marginLayoutParams32 = (ViewGroup.MarginLayoutParams) this.f130537c.getLayoutParams();
                    marginLayoutParams32.topMargin = (int) C13628n.m24520b(this.f130537c.getContext(), 2.0f);
                    marginLayoutParams32.leftMargin = marginLayoutParams32.topMargin;
                    this.f130537c.setImageResource(i3);
                    return;
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    i3 = 2131232936;
                    ViewGroup.MarginLayoutParams marginLayoutParams322 = (ViewGroup.MarginLayoutParams) this.f130537c.getLayoutParams();
                    marginLayoutParams322.topMargin = (int) C13628n.m24520b(this.f130537c.getContext(), 2.0f);
                    marginLayoutParams322.leftMargin = marginLayoutParams322.topMargin;
                    this.f130537c.setImageResource(i3);
                    return;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    i3 = 2131232937;
                    ViewGroup.MarginLayoutParams marginLayoutParams3222 = (ViewGroup.MarginLayoutParams) this.f130537c.getLayoutParams();
                    marginLayoutParams3222.topMargin = (int) C13628n.m24520b(this.f130537c.getContext(), 2.0f);
                    marginLayoutParams3222.leftMargin = marginLayoutParams3222.topMargin;
                    this.f130537c.setImageResource(i3);
                    return;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                    i3 = 2131233069;
                    ViewGroup.MarginLayoutParams marginLayoutParams32222 = (ViewGroup.MarginLayoutParams) this.f130537c.getLayoutParams();
                    marginLayoutParams32222.topMargin = (int) C13628n.m24520b(this.f130537c.getContext(), 2.0f);
                    marginLayoutParams32222.leftMargin = marginLayoutParams32222.topMargin;
                    this.f130537c.setImageResource(i3);
                    return;
                case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                    i3 = 2131232939;
                    ViewGroup.MarginLayoutParams marginLayoutParams322222 = (ViewGroup.MarginLayoutParams) this.f130537c.getLayoutParams();
                    marginLayoutParams322222.topMargin = (int) C13628n.m24520b(this.f130537c.getContext(), 2.0f);
                    marginLayoutParams322222.leftMargin = marginLayoutParams322222.topMargin;
                    this.f130537c.setImageResource(i3);
                    return;
                case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                    i3 = 2131232929;
                    ViewGroup.MarginLayoutParams marginLayoutParams3222222 = (ViewGroup.MarginLayoutParams) this.f130537c.getLayoutParams();
                    marginLayoutParams3222222.topMargin = (int) C13628n.m24520b(this.f130537c.getContext(), 2.0f);
                    marginLayoutParams3222222.leftMargin = marginLayoutParams3222222.topMargin;
                    this.f130537c.setImageResource(i3);
                    return;
                case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                    i3 = 2131232930;
                    ViewGroup.MarginLayoutParams marginLayoutParams32222222 = (ViewGroup.MarginLayoutParams) this.f130537c.getLayoutParams();
                    marginLayoutParams32222222.topMargin = (int) C13628n.m24520b(this.f130537c.getContext(), 2.0f);
                    marginLayoutParams32222222.leftMargin = marginLayoutParams32222222.topMargin;
                    this.f130537c.setImageResource(i3);
                    return;
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                    i3 = 2131232931;
                    ViewGroup.MarginLayoutParams marginLayoutParams322222222 = (ViewGroup.MarginLayoutParams) this.f130537c.getLayoutParams();
                    marginLayoutParams322222222.topMargin = (int) C13628n.m24520b(this.f130537c.getContext(), 2.0f);
                    marginLayoutParams322222222.leftMargin = marginLayoutParams322222222.topMargin;
                    this.f130537c.setImageResource(i3);
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: a */
    private void m103883a(long j, int i, int i2, int i3, int i4, int i5, int i6, final boolean z) {
        ValueAnimator duration = ValueAnimator.ofInt(i3, i4).setDuration(200L);
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.p2082ss.android.ugc.aweme.kids.choosemusic.p3327i.AbstractC57298a.C573002 */

            static {
                Covode.recordClassIndex(67205);
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                if (C80471gb.m139483a(AbstractC57298a.this.f130554t)) {
                    ((ViewGroup.MarginLayoutParams) AbstractC57298a.this.f130546l.getLayoutParams()).leftMargin = intValue;
                } else {
                    ((ViewGroup.MarginLayoutParams) AbstractC57298a.this.f130546l.getLayoutParams()).rightMargin = intValue;
                }
                AbstractC57298a.this.f130546l.requestLayout();
            }
        });
        duration.addListener(new AnimatorListenerAdapter() {
            /* class com.p2082ss.android.ugc.aweme.kids.choosemusic.p3327i.AbstractC57298a.C573013 */

            static {
                Covode.recordClassIndex(67206);
            }

            public final void onAnimationEnd(Animator animator) {
                AbstractC57298a.this.f130547m.setClickable(true);
                if (z) {
                    AbstractC57298a.this.f130543i.setVisibility(8);
                    AbstractC57298a.this.f130543i.clearAnimation();
                    if (C80471gb.m139483a(AbstractC57298a.this.f130554t)) {
                        ((ViewGroup.MarginLayoutParams) AbstractC57298a.this.f130546l.getLayoutParams()).leftMargin = 0;
                    } else {
                        ((ViewGroup.MarginLayoutParams) AbstractC57298a.this.f130546l.getLayoutParams()).rightMargin = 0;
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
        this.f130543i.startAnimation(animationSet);
        duration.start();
    }
}
