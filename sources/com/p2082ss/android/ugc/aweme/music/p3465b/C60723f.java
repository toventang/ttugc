package com.p2082ss.android.ugc.aweme.music.p3465b;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.p2082ss.android.ugc.aweme.AccountService;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.common.C39161q;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.MobClick;
import com.p2082ss.android.ugc.aweme.experiment.C47039q;
import com.p2082ss.android.ugc.aweme.login.C58957c;
import com.p2082ss.android.ugc.aweme.music.p3465b.C60717d;
import com.p2082ss.android.ugc.aweme.music.p3471f.C60793b;
import com.p2082ss.android.ugc.aweme.music.p3471f.C60795d;
import com.p2082ss.android.ugc.aweme.music.p3476k.C60826d;
import com.p2082ss.android.ugc.aweme.music.p3481ui.CheckableImageView;
import com.p2082ss.android.ugc.aweme.p2479ck.C36125t;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.C80471gb;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import java.util.Locale;

/* renamed from: com.ss.android.ugc.aweme.music.b.f */
public final class C60723f extends RecyclerView.ViewHolder {

    /* renamed from: s */
    private static int f137977s;

    /* renamed from: a */
    TextView f137978a;

    /* renamed from: b */
    TextView f137979b;

    /* renamed from: c */
    TextView f137980c;

    /* renamed from: d */
    RemoteImageView f137981d;

    /* renamed from: e */
    LinearLayout f137982e;

    /* renamed from: f */
    RelativeLayout f137983f;

    /* renamed from: g */
    ImageView f137984g;

    /* renamed from: h */
    LinearLayout f137985h;

    /* renamed from: i */
    ProgressBar f137986i;

    /* renamed from: j */
    LinearLayout f137987j;

    /* renamed from: k */
    LinearLayout f137988k;

    /* renamed from: l */
    ImageView f137989l;

    /* renamed from: m */
    View f137990m;

    /* renamed from: n */
    LinearLayout f137991n;

    /* renamed from: o */
    public MusicModel f137992o;

    /* renamed from: p */
    CheckableImageView f137993p;

    /* renamed from: q */
    ImageView f137994q;

    /* renamed from: r */
    boolean f137995r;

    /* renamed from: t */
    private Context f137996t;

    /* renamed from: u */
    private AbstractC60712b f137997u;

    /* renamed from: v */
    private Context f137998v;

    /* renamed from: w */
    private int f137999w;

    /* renamed from: x */
    private String f138000x;

    /* renamed from: y */
    private AbstractC60731k<C60795d> f138001y;

    /* renamed from: z */
    private int f138002z;

    static {
        Covode.recordClassIndex(71279);
    }

    /* renamed from: a */
    private static String m110248a(int i) {
        return i == 0 ? "popular_song" : i == 3 ? "song_category" : i == 2 ? "search_result" : "";
    }

    /* renamed from: b */
    private static String m110250b(int i) {
        if (i == 0) {
            return "music_library_hot";
        }
        if (i == 1) {
            return "music_library_mine";
        }
        if (i == 2) {
            return "music_library_search";
        }
        if (i == 3) {
            return "music_library_list";
        }
        return null;
    }

    /* renamed from: a */
    public final void mo98147a() {
        int i;
        CheckableImageView checkableImageView = this.f137993p;
        if (this.f137995r) {
            i = 2131232176;
        } else {
            i = 2131232177;
        }
        checkableImageView.setImageResource(i);
    }

    /* renamed from: a */
    public final void mo98148a(View view) {
        String str;
        String str2;
        int id = view.getId();
        if (id == R.id.a7q) {
            if (!AccountService.m65215a().mo57069e().isLogin()) {
                C58957c.m108318a(C17873f.m33102j(), m110248a(this.f137999w), "click_favorite_music");
                return;
            }
            MusicModel musicModel = this.f137992o;
            if (musicModel != null && C60826d.m110428a(musicModel, this.f137998v, true)) {
                AbstractC60731k<C60795d> kVar = this.f138001y;
                if (kVar != null) {
                    MusicModel musicModel2 = this.f137992o;
                    if (this.f137995r) {
                        str2 = "unfollow_type";
                    } else {
                        str2 = "follow_type";
                    }
                    kVar.mo62879a(new C60795d(musicModel2, str2));
                }
                this.f137995r = !this.f137995r;
                MobClick obtain = MobClick.obtain();
                if (this.f137995r) {
                    str = "collection_music";
                } else {
                    str = "collection_music_cancel";
                }
                MobClick extValueLong = obtain.setEventName(str).setLabelName(m110250b(this.f137999w)).setValue(String.valueOf(this.f137992o.getMusicId())).setExtValueLong(0);
                if (!TextUtils.isEmpty(this.f138000x)) {
                    extValueLong.setJsonObject(new C33743c().mo59976a("search_keyword", this.f138000x).mo59977a());
                }
                C39162r.onEvent(extValueLong);
                this.f137993p.mo98607b();
            }
        } else if (id == R.id.cnp) {
            MusicModel musicModel3 = this.f137992o;
            if (musicModel3 == null || musicModel3.getMusicStatus() != 0 || this.f137992o.getMusic() == null) {
                MusicModel musicModel4 = this.f137992o;
                if (musicModel4 != null) {
                    if (C60826d.m110428a(musicModel4, this.itemView.getContext(), true)) {
                        C36125t.m73598a(C36125t.m73591a(), "aweme://music/detail/" + this.f137992o.getMusicId());
                        MobClick value = MobClick.obtain().setEventName("music_detail").setLabelName(m110250b(this.f137999w)).setValue(this.f137992o.getMusicId());
                        if (!TextUtils.isEmpty(this.f138000x)) {
                            value.setJsonObject(new C33743c().mo59976a("search_keyword", this.f138000x).mo59977a());
                        }
                        C39162r.onEvent(value);
                    } else {
                        return;
                    }
                }
            } else {
                String offlineDesc = this.f137992o.getMusic().getOfflineDesc();
                if (TextUtils.isEmpty(offlineDesc)) {
                    offlineDesc = this.f137998v.getString(R.string.dau);
                }
                new C79459a(view.getContext()).mo123052a(offlineDesc).mo123053a();
                return;
            }
        }
        AbstractC60712b bVar = this.f137997u;
        if (bVar != null) {
            bVar.mo63222a(view);
        }
    }

    /* renamed from: a */
    public final void mo98149a(MusicModel musicModel, String str, boolean z, int i) {
        boolean z2;
        String singer;
        String str2;
        int indexOf;
        if (musicModel != null) {
            this.f137992o = musicModel;
            this.f137999w = i;
            this.f138000x = str;
            if (musicModel.getCollectionType() != null) {
                this.f137995r = MusicModel.CollectionType.COLLECTED.equals(musicModel.getCollectionType());
            }
            mo98147a();
            boolean z3 = true;
            if (TextUtils.isEmpty(this.f137992o.getName()) || TextUtils.isEmpty(str) || (indexOf = this.f137992o.getName().indexOf(str)) <= 0) {
                z2 = false;
            } else {
                SpannableString spannableString = new SpannableString(this.f137992o.getName());
                spannableString.setSpan(new ForegroundColorSpan(this.itemView.getResources().getColor(R.color.a)), indexOf, str.length() + indexOf, 17);
                this.f137978a.setText(spannableString);
                z2 = true;
            }
            String str3 = "";
            if (!z2) {
                this.f137978a.setTextColor(this.itemView.getResources().getColor(R.color.bx));
                TextView textView = this.f137978a;
                if (!TextUtils.isEmpty(this.f137992o.getName())) {
                    str2 = this.f137992o.getName();
                } else {
                    str2 = str3;
                }
                textView.setText(str2);
            }
            int i2 = 8;
            if (this.f137992o.getMusicType() == MusicModel.MusicType.LOCAL) {
                TextView textView2 = this.f137980c;
                long localMusicDuration = this.f137992o.getLocalMusicDuration();
                if (localMusicDuration > 0) {
                    long j = localMusicDuration / 1000;
                    long j2 = j % 60;
                    long j3 = j / 60;
                    long j4 = j3 / 60;
                    long j5 = j3 % 60;
                    if (0 == j4) {
                        str3 = C1764a.m5929a(Locale.getDefault(), "%02d:%02d", new Object[]{Long.valueOf(j5), Long.valueOf(j2)});
                    } else {
                        str3 = C1764a.m5929a(Locale.getDefault(), "%02d:%02d:%02d", new Object[]{Long.valueOf(j4), Long.valueOf(j5), Long.valueOf(j2)});
                    }
                }
                textView2.setText(str3);
            } else {
                this.f137980c.setText(C60826d.m110423a(this.f137992o.getPresenterDuration()));
                if (this.f137992o.getDuration() > 0) {
                    this.f137980c.setVisibility(0);
                } else {
                    this.f137980c.setVisibility(8);
                }
            }
            TextView textView3 = this.f137979b;
            if (TextUtils.isEmpty(this.f137992o.getSinger())) {
                singer = this.itemView.getResources().getString(R.string.h1c);
            } else {
                singer = this.f137992o.getSinger();
            }
            textView3.setText(singer);
            if (!TextUtils.isEmpty(this.f137992o.getPicPremium())) {
                C34577e.m70608b(this.f137981d, this.f137992o.getPicPremium(), -1, -1);
            } else if (!TextUtils.isEmpty(this.f137992o.getPicBig())) {
                C34577e.m70608b(this.f137981d, this.f137992o.getPicBig(), -1, -1);
            } else {
                C34577e.m70591a(this.f137981d, 2131232244);
            }
            if (this.f137992o.isOriginal()) {
                this.f137994q.setVisibility(8);
                Drawable drawable = this.itemView.getContext().getResources().getDrawable(2131232352);
                drawable.setBounds(0, 0, (int) C13628n.m24520b(this.itemView.getContext(), 16.0f), (int) C13628n.m24520b(this.itemView.getContext(), 16.0f));
                this.f137978a.setCompoundDrawables(drawable, null, null, null);
                this.f137978a.setCompoundDrawablePadding((int) C13628n.m24520b(this.itemView.getContext(), 2.0f));
            } else {
                this.f137978a.setCompoundDrawables(null, null, null, null);
                this.f137994q.setVisibility(8);
            }
            if (z) {
                this.f137988k.setClickable(false);
                int i3 = -f137977s;
                int b = (int) C13628n.m24520b(this.f137996t, 30.0f);
                this.f137982e.setVisibility(0);
                if (C80471gb.m139483a(C17867d.m33078a())) {
                    ((ViewGroup.MarginLayoutParams) this.f137991n.getLayoutParams()).leftMargin = -f137977s;
                } else {
                    ((ViewGroup.MarginLayoutParams) this.f137991n.getLayoutParams()).rightMargin = -f137977s;
                }
                m110249a(100, 0, 1, i3, 0, b, 0, false);
                if (this.f137992o.getMusicType() == MusicModel.MusicType.LOCAL) {
                    this.f137984g.setImageResource(2131232363);
                    this.f137986i.setVisibility(8);
                } else if (this.f137992o.getMusicType() == MusicModel.MusicType.ONLINE) {
                    this.f137984g.setVisibility(0);
                    this.f137984g.setImageResource(2131232363);
                    this.f137986i.setVisibility(8);
                } else {
                    this.f137984g.setVisibility(0);
                    this.f137984g.setImageResource(2131232363);
                    this.f137986i.setVisibility(8);
                }
            } else {
                if (this.f137982e.getVisibility() == 0) {
                    this.f137988k.setClickable(false);
                    m110249a(0, 1, 0, 0, -f137977s, 0, (int) C13628n.m24520b(this.f137996t, 30.0f), true);
                }
                this.f137986i.setVisibility(8);
                this.f137984g.setVisibility(0);
                this.f137984g.setImageResource(2131232344);
            }
            if (musicModel.isChallengeMusic()) {
                this.f137987j.setVisibility(8);
            }
            if (musicModel.getMusicType() == MusicModel.MusicType.LOCAL) {
                this.f137993p.setVisibility(8);
            } else {
                this.f137993p.setVisibility(0);
            }
            LinearLayout linearLayout = this.f137987j;
            if (this.f138002z == 1) {
                i2 = 0;
            }
            linearLayout.setVisibility(i2);
            LinearLayout linearLayout2 = this.f137987j;
            if (this.f138002z != 1) {
                z3 = false;
            }
            linearLayout2.setEnabled(z3);
            this.f137993p.setOnStateChangeListener(new CheckableImageView.AbstractC61078a() {
                /* class com.p2082ss.android.ugc.aweme.music.p3465b.C60723f.C607241 */

                static {
                    Covode.recordClassIndex(71280);
                }

                @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.CheckableImageView.AbstractC61078a
                public final void bX_() {
                    C60723f fVar = C60723f.this;
                    boolean z = fVar.f137995r;
                    AbstractC81915c.m141874a(new C60793b(z ? 1 : 0, fVar.f137992o));
                }

                @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.CheckableImageView.AbstractC61078a
                /* renamed from: a */
                public final void mo62594a(int i) {
                    if (i == 1) {
                        C60723f.this.mo98147a();
                    }
                }
            });
            String a = m110248a(i);
            this.f137985h.getContext();
            C39162r.m79455a("show_music", a, musicModel.getMusicId(), 0);
            if (!C47039q.m90298a()) {
                C39161q.m79451a("client_show", new C33744d().mo59983a("enter_from", "popular_song").mo59983a("music_id", "123321").mo59983a("content", "music").f79943a);
            }
        }
    }

    public C60723f(View view, AbstractC60712b bVar, int i, C60717d.EnumC60718a aVar, AbstractC60731k<C60795d> kVar) {
        super(view);
        this.f137996t = view.getContext();
        this.f137997u = bVar;
        this.f138001y = kVar;
        this.f137978a = (TextView) view.findViewById(R.id.ezz);
        this.f137979b = (TextView) view.findViewById(R.id.f3z);
        this.f137980c = (TextView) view.findViewById(R.id.evh);
        this.f137981d = (RemoteImageView) view.findViewById(R.id.dqg);
        this.f137982e = (LinearLayout) view.findViewById(R.id.dlk);
        this.f137983f = (RelativeLayout) view.findViewById(R.id.dlv);
        this.f137984g = (ImageView) view.findViewById(R.id.bzx);
        this.f137985h = (LinearLayout) view.findViewById(R.id.ceu);
        this.f137986i = (ProgressBar) view.findViewById(R.id.d01);
        this.f137987j = (LinearLayout) view.findViewById(R.id.cnp);
        this.f137988k = (LinearLayout) view.findViewById(R.id.cns);
        this.f137989l = (ImageView) view.findViewById(R.id.cno);
        this.f137990m = view.findViewById(R.id.cop);
        this.f137991n = (LinearLayout) view.findViewById(R.id.a7q);
        this.f137993p = (CheckableImageView) view.findViewById(R.id.cnj);
        this.f137994q = (ImageView) view.findViewById(R.id.cxn);
        View findViewById = view.findViewById(R.id.dlk);
        if (findViewById != null) {
            findViewById.setOnClickListener(new View$OnClickListenerC60727g(this));
        }
        View findViewById2 = view.findViewById(R.id.ceu);
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(new View$OnClickListenerC60728h(this));
        }
        View findViewById3 = view.findViewById(R.id.a7q);
        if (findViewById3 != null) {
            findViewById3.setOnClickListener(new View$OnClickListenerC60729i(this));
        }
        View findViewById4 = view.findViewById(R.id.cnp);
        if (findViewById4 != null) {
            findViewById4.setOnClickListener(new View$OnClickListenerC60730j(this));
        }
        this.f137998v = view.getContext();
        this.f138002z = i;
        aVar.ordinal();
        if (f137977s <= 0) {
            this.f137982e.measure(View.MeasureSpec.makeMeasureSpec(536870911, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(536870911, Integer.MIN_VALUE));
            f137977s = (int) (((float) this.f137982e.getMeasuredWidth()) + C13628n.m24520b(this.f137996t, 8.0f));
        }
    }

    /* renamed from: a */
    private void m110249a(long j, int i, int i2, int i3, int i4, int i5, int i6, final boolean z) {
        ValueAnimator duration = ValueAnimator.ofInt(i3, i4).setDuration(200L);
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.p2082ss.android.ugc.aweme.music.p3465b.C60723f.C607252 */

            static {
                Covode.recordClassIndex(71281);
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                if (C80471gb.m139483a(C17867d.m33078a())) {
                    ((ViewGroup.MarginLayoutParams) C60723f.this.f137991n.getLayoutParams()).leftMargin = intValue;
                } else {
                    ((ViewGroup.MarginLayoutParams) C60723f.this.f137991n.getLayoutParams()).rightMargin = intValue;
                }
                C60723f.this.f137991n.requestLayout();
            }
        });
        duration.addListener(new AnimatorListenerAdapter() {
            /* class com.p2082ss.android.ugc.aweme.music.p3465b.C60723f.C607263 */

            static {
                Covode.recordClassIndex(71282);
            }

            public final void onAnimationEnd(Animator animator) {
                C60723f.this.f137988k.setClickable(true);
                if (z) {
                    C60723f.this.f137982e.setVisibility(8);
                    if (C80471gb.m139483a(C17867d.m33078a())) {
                        ((ViewGroup.MarginLayoutParams) C60723f.this.f137991n.getLayoutParams()).leftMargin = 0;
                    } else {
                        ((ViewGroup.MarginLayoutParams) C60723f.this.f137991n.getLayoutParams()).rightMargin = 0;
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
        this.f137982e.startAnimation(animationSet);
        duration.start();
    }
}
