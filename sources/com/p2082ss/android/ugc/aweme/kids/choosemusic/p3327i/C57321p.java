package com.p2082ss.android.ugc.aweme.kids.choosemusic.p3327i;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.arch.widgets.C33937a;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3320b.C57192b;
import com.p2082ss.android.ugc.aweme.kids.p3302a.p3303a.AbstractC57079b;
import com.p2082ss.android.ugc.aweme.kids.p3302a.p3303a.AbstractC57080c;
import com.p2082ss.android.ugc.aweme.kids.p3302a.p3306d.C57106a;
import com.p2082ss.android.ugc.aweme.music.p3481ui.CheckableImageView;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p2082ss.android.ugc.aweme.utils.C80565ia;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.ss.android.ugc.aweme.kids.choosemusic.i.p */
public final class C57321p extends C33937a {

    /* renamed from: u */
    public static final C57328a f130626u = new C57328a((byte) 0);

    /* renamed from: b */
    public RemoteImageView f130627b;

    /* renamed from: c */
    public RemoteImageView f130628c;

    /* renamed from: d */
    public ImageView f130629d;

    /* renamed from: e */
    public FrameLayout f130630e;

    /* renamed from: f */
    public TextView f130631f;

    /* renamed from: g */
    public TextView f130632g;

    /* renamed from: h */
    public RelativeLayout f130633h;

    /* renamed from: i */
    public CheckableImageView f130634i;

    /* renamed from: j */
    public LinearLayout f130635j;

    /* renamed from: k */
    public LinearLayout f130636k;

    /* renamed from: l */
    public LinearLayout f130637l;

    /* renamed from: m */
    public LinearLayout f130638m;

    /* renamed from: n */
    public AbstractC57329b f130639n;

    /* renamed from: o */
    public AbstractC57079b f130640o;

    /* renamed from: p */
    public AbstractC57080c<C57192b> f130641p;

    /* renamed from: q */
    public List<MusicModel> f130642q;

    /* renamed from: r */
    public int f130643r;

    /* renamed from: s */
    public Context f130644s;

    /* renamed from: t */
    public boolean f130645t;

    /* renamed from: v */
    private TextView f130646v;

    /* renamed from: w */
    private ValueAnimator f130647w;

    /* renamed from: x */
    private Animation f130648x;

    /* renamed from: com.ss.android.ugc.aweme.kids.choosemusic.i.p$b */
    public interface AbstractC57329b {
        static {
            Covode.recordClassIndex(67234);
        }

        /* renamed from: a */
        void mo94545a();
    }

    static {
        Covode.recordClassIndex(67226);
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.choosemusic.i.p$a */
    public static final class C57328a {
        static {
            Covode.recordClassIndex(67233);
        }

        private C57328a() {
        }

        public /* synthetic */ C57328a(byte b) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo94539d() {
        AbstractC57329b bVar = this.f130639n;
        if (bVar != null) {
            bVar.mo94545a();
        }
    }

    /* renamed from: c */
    public final MusicModel mo94538c() {
        MusicModel musicModel;
        List<MusicModel> list = this.f130642q;
        if (list == null || (musicModel = (MusicModel) C89070n.m154561b((List) list, this.f130643r)) == null) {
            return null;
        }
        return musicModel;
    }

    /* renamed from: a */
    public final void mo94532a() {
        int i;
        CheckableImageView checkableImageView = this.f130634i;
        if (checkableImageView != null) {
            if (this.f130645t) {
                i = 2131232176;
            } else {
                i = 2131233057;
            }
            checkableImageView.setImageResource(i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo94537b() {
        LinearLayout linearLayout = this.f130636k;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        LinearLayout linearLayout2 = this.f130637l;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(0);
        }
        LinearLayout linearLayout3 = this.f130638m;
        if (linearLayout3 != null) {
            linearLayout3.setVisibility(0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.choosemusic.i.p$d */
    public static final class C57331d extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C57321p f130658a;

        static {
            Covode.recordClassIndex(67236);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C57331d(C57321p pVar) {
            this.f130658a = pVar;
        }

        public final void onAnimationEnd(Animator animator) {
            C89219l.m154721d(animator, "");
            RemoteImageView remoteImageView = this.f130658a.f130628c;
            C57321p pVar = this.f130658a;
            pVar.f130628c = pVar.f130627b;
            this.f130658a.f130627b = remoteImageView;
            C57321p pVar2 = this.f130658a;
            pVar2.mo94534a(pVar2.f130628c, this.f130658a.f130643r + 1);
        }
    }

    /* renamed from: a */
    private static String m103911a(MusicModel musicModel) {
        String picBig;
        if (musicModel != null) {
            String picPremium = musicModel.getPicPremium();
            if (picPremium == null || picPremium.length() == 0) {
                if (!(musicModel == null || (picBig = musicModel.getPicBig()) == null || picBig.length() == 0 || musicModel == null)) {
                    return musicModel.getPicBig();
                }
            } else if (musicModel != null) {
                return musicModel.getPicPremium();
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.kids.choosemusic.i.p$c */
    public static final class C57330c implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C57321p f130655a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89235b f130656b;

        /* renamed from: c */
        final /* synthetic */ C89233z.C89235b f130657c;

        static {
            Covode.recordClassIndex(67235);
        }

        C57330c(C57321p pVar, C89233z.C89235b bVar, C89233z.C89235b bVar2) {
            this.f130655a = pVar;
            this.f130656b = bVar;
            this.f130657c = bVar2;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C89219l.m154716b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            RemoteImageView remoteImageView = this.f130655a.f130627b;
            if (remoteImageView != null) {
                remoteImageView.setScaleX(floatValue);
            }
            RemoteImageView remoteImageView2 = this.f130655a.f130627b;
            if (remoteImageView2 != null) {
                remoteImageView2.setScaleY(floatValue);
            }
            RemoteImageView remoteImageView3 = this.f130655a.f130627b;
            if (remoteImageView3 != null) {
                remoteImageView3.setAlpha((floatValue - this.f130656b.element) / this.f130657c.element);
            }
            RemoteImageView remoteImageView4 = this.f130655a.f130628c;
            if (remoteImageView4 != null) {
                remoteImageView4.setScaleX((this.f130656b.element + 1.0f) - floatValue);
            }
            RemoteImageView remoteImageView5 = this.f130655a.f130628c;
            if (remoteImageView5 != null) {
                remoteImageView5.setScaleY((this.f130656b.element + 1.0f) - floatValue);
            }
            RemoteImageView remoteImageView6 = this.f130655a.f130628c;
            if (remoteImageView6 != null) {
                remoteImageView6.setAlpha((1.0f - floatValue) / this.f130657c.element);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C57321p(View view) {
        super(view);
        C89219l.m154721d(view, "");
        MethodCollector.m26663i(7445);
        this.f130644s = view.getContext();
        this.f130627b = (RemoteImageView) view.findViewById(R.id.buo);
        this.f130628c = (RemoteImageView) view.findViewById(R.id.bup);
        this.f130629d = (ImageView) view.findViewById(R.id.bzx);
        this.f130630e = (FrameLayout) view.findViewById(R.id.dl9);
        this.f130632g = (TextView) view.findViewById(R.id.f3z);
        this.f130631f = (TextView) view.findViewById(R.id.ezz);
        this.f130633h = (RelativeLayout) view.findViewById(R.id.dlv);
        this.f130646v = (TextView) view.findViewById(R.id.ezr);
        this.f130634i = (CheckableImageView) view.findViewById(R.id.bxo);
        this.f130635j = (LinearLayout) view.findViewById(R.id.cds);
        this.f130636k = (LinearLayout) view.findViewById(R.id.ccy);
        this.f130637l = (LinearLayout) view.findViewById(R.id.cey);
        this.f130638m = (LinearLayout) view.findViewById(R.id.cex);
        View view2 = this.itemView;
        C89219l.m154716b(view2, "");
        Animation loadAnimation = AnimationUtils.loadAnimation(view2.getContext(), R.anim.da);
        this.f130648x = loadAnimation;
        if (loadAnimation != null) {
            loadAnimation.setInterpolator(new LinearInterpolator());
        }
        LinearLayout linearLayout = this.f130636k;
        if (linearLayout != null) {
            linearLayout.setOnClickListener(new View.OnClickListener(this) {
                /* class com.p2082ss.android.ugc.aweme.kids.choosemusic.p3327i.C57321p.View$OnClickListenerC573221 */

                /* renamed from: a */
                final /* synthetic */ C57321p f130649a;

                static {
                    Covode.recordClassIndex(67227);
                }

                {
                    this.f130649a = r1;
                }

                public final void onClick(View view) {
                    MusicModel musicModel;
                    ClickAgent.onClick(view);
                    C57321p pVar = this.f130649a;
                    pVar.mo94537b();
                    AbstractC57079b bVar = pVar.f130640o;
                    if (bVar != null) {
                        LinearLayout linearLayout = pVar.f130636k;
                        List<MusicModel> list = pVar.f130642q;
                        if (list != null) {
                            musicModel = (MusicModel) C89070n.m154561b((List) list, pVar.f130643r);
                        } else {
                            musicModel = null;
                        }
                        bVar.mo94239a(pVar, linearLayout, musicModel);
                    }
                }
            });
        }
        LinearLayout linearLayout2 = this.f130638m;
        if (linearLayout2 != null) {
            linearLayout2.setOnClickListener(new View.OnClickListener(this) {
                /* class com.p2082ss.android.ugc.aweme.kids.choosemusic.p3327i.C57321p.View$OnClickListenerC573232 */

                /* renamed from: a */
                final /* synthetic */ C57321p f130650a;

                static {
                    Covode.recordClassIndex(67228);
                }

                {
                    this.f130650a = r1;
                }

                public final void onClick(View view) {
                    int i;
                    MusicModel musicModel;
                    ClickAgent.onClick(view);
                    C57321p pVar = this.f130650a;
                    int i2 = pVar.f130643r + 1;
                    List<MusicModel> list = pVar.f130642q;
                    int i3 = 0;
                    if (list != null) {
                        i = list.size();
                    } else {
                        i = 0;
                    }
                    if (i2 >= i) {
                        pVar.mo94539d();
                        return;
                    }
                    List<MusicModel> list2 = pVar.f130642q;
                    if (list2 != null) {
                        i3 = list2.size();
                    }
                    if (i3 - pVar.f130643r <= 3) {
                        pVar.mo94539d();
                    }
                    pVar.f130643r++;
                    pVar.mo94533a(pVar.f130643r, true);
                    AbstractC57079b bVar = pVar.f130640o;
                    if (bVar != null) {
                        LinearLayout linearLayout = pVar.f130638m;
                        List<MusicModel> list3 = pVar.f130642q;
                        if (list3 != null) {
                            musicModel = (MusicModel) C89070n.m154561b((List) list3, pVar.f130643r);
                        } else {
                            musicModel = null;
                        }
                        bVar.mo94239a(pVar, linearLayout, musicModel);
                    }
                }
            });
        }
        LinearLayout linearLayout3 = this.f130635j;
        if (linearLayout3 != null) {
            linearLayout3.setOnClickListener(new View.OnClickListener(this) {
                /* class com.p2082ss.android.ugc.aweme.kids.choosemusic.p3327i.C57321p.View$OnClickListenerC573243 */

                /* renamed from: a */
                final /* synthetic */ C57321p f130651a;

                static {
                    Covode.recordClassIndex(67229);
                }

                {
                    this.f130651a = r1;
                }

                public final void onClick(View view) {
                    MusicModel musicModel;
                    ClickAgent.onClick(view);
                    C57321p pVar = this.f130651a;
                    LinearLayout linearLayout = pVar.f130636k;
                    if (linearLayout != null && linearLayout.getVisibility() == 0) {
                        pVar.mo94537b();
                    }
                    AbstractC57079b bVar = pVar.f130640o;
                    if (bVar != null) {
                        LinearLayout linearLayout2 = pVar.f130635j;
                        List<MusicModel> list = pVar.f130642q;
                        if (list != null) {
                            musicModel = (MusicModel) C89070n.m154561b((List) list, pVar.f130643r);
                        } else {
                            musicModel = null;
                        }
                        bVar.mo94239a(pVar, linearLayout2, musicModel);
                    }
                }
            });
        }
        LinearLayout linearLayout4 = this.f130637l;
        if (linearLayout4 != null) {
            linearLayout4.setOnClickListener(new View.OnClickListener(this) {
                /* class com.p2082ss.android.ugc.aweme.kids.choosemusic.p3327i.C57321p.View$OnClickListenerC573254 */

                /* renamed from: a */
                final /* synthetic */ C57321p f130652a;

                static {
                    Covode.recordClassIndex(67230);
                }

                {
                    this.f130652a = r1;
                }

                public final void onClick(View view) {
                    MusicModel musicModel;
                    ClickAgent.onClick(view);
                    C57321p pVar = this.f130652a;
                    AbstractC57079b bVar = pVar.f130640o;
                    if (bVar != null) {
                        LinearLayout linearLayout = pVar.f130637l;
                        List<MusicModel> list = pVar.f130642q;
                        if (list != null) {
                            musicModel = (MusicModel) C89070n.m154561b((List) list, pVar.f130643r);
                        } else {
                            musicModel = null;
                        }
                        bVar.mo94239a(pVar, linearLayout, musicModel);
                    }
                }
            });
        }
        CheckableImageView checkableImageView = this.f130634i;
        if (checkableImageView != null) {
            checkableImageView.setOnClickListener(new View.OnClickListener(this) {
                /* class com.p2082ss.android.ugc.aweme.kids.choosemusic.p3327i.C57321p.View$OnClickListenerC573265 */

                /* renamed from: a */
                final /* synthetic */ C57321p f130653a;

                static {
                    Covode.recordClassIndex(67231);
                }

                {
                    this.f130653a = r1;
                }

                public final void onClick(View view) {
                    MusicModel musicModel;
                    ClickAgent.onClick(view);
                    C57321p pVar = this.f130653a;
                    AbstractC57079b bVar = pVar.f130640o;
                    if (bVar != null) {
                        CheckableImageView checkableImageView = pVar.f130634i;
                        List<MusicModel> list = pVar.f130642q;
                        if (list != null) {
                            musicModel = (MusicModel) C89070n.m154561b((List) list, pVar.f130643r);
                        } else {
                            musicModel = null;
                        }
                        bVar.mo94239a(pVar, checkableImageView, musicModel);
                    }
                }
            });
        }
        CheckableImageView checkableImageView2 = this.f130634i;
        if (checkableImageView2 != null) {
            checkableImageView2.setOnStateChangeListener(new CheckableImageView.AbstractC61078a(this) {
                /* class com.p2082ss.android.ugc.aweme.kids.choosemusic.p3327i.C57321p.C573276 */

                /* renamed from: a */
                final /* synthetic */ C57321p f130654a;

                static {
                    Covode.recordClassIndex(67232);
                }

                @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.CheckableImageView.AbstractC61078a
                public final void bX_() {
                    MusicModel musicModel;
                    C57321p pVar = this.f130654a;
                    boolean z = pVar.f130645t;
                    List<MusicModel> list = pVar.f130642q;
                    if (list != null) {
                        musicModel = (MusicModel) C89070n.m154561b((List) list, pVar.f130643r);
                    } else {
                        musicModel = null;
                    }
                    AbstractC81915c.m141874a(new C57106a(z ? 1 : 0, musicModel));
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f130654a = r1;
                }

                @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.CheckableImageView.AbstractC61078a
                /* renamed from: a */
                public final void mo62594a(int i) {
                    if (i == 1) {
                        this.f130654a.mo94532a();
                    }
                }
            });
            MethodCollector.m26664o(7445);
            return;
        }
        MethodCollector.m26664o(7445);
    }

    /* renamed from: a */
    public final void mo94535a(List<? extends MusicModel> list) {
        List<MusicModel> list2;
        List<MusicModel> list3 = this.f130642q;
        boolean z = true;
        if ((list3 != null && !list3.isEmpty()) || list == null || list.isEmpty()) {
            z = false;
        }
        if (this.f130642q == null) {
            this.f130642q = new ArrayList();
        }
        if (!(list == null || (list2 = this.f130642q) == null)) {
            list2.addAll(list);
        }
        if (z) {
            mo94533a(this.f130643r, false);
        }
    }

    /* renamed from: a */
    public final void mo94534a(RemoteImageView remoteImageView, int i) {
        int i2;
        MusicModel musicModel;
        List<MusicModel> list = this.f130642q;
        if (list != null) {
            i2 = list.size();
        } else {
            i2 = 0;
        }
        if (i < i2) {
            List<MusicModel> list2 = this.f130642q;
            if (list2 != null) {
                musicModel = list2.get(i);
            } else {
                musicModel = null;
            }
            String a = m103911a(musicModel);
            if (a == null || a.length() == 0) {
                C34577e.m70591a(remoteImageView, (int) R.color.f);
            } else {
                C34577e.m70608b(remoteImageView, a, -1, -1);
            }
        }
    }

    /* renamed from: a */
    public final void mo94533a(int i, boolean z) {
        int i2;
        MusicModel musicModel;
        boolean z2;
        int i3;
        String str;
        Context context;
        String singer;
        String str2;
        List<MusicModel> list = this.f130642q;
        if (list != null) {
            i2 = list.size();
        } else {
            i2 = 0;
        }
        if (i < i2) {
            List<MusicModel> list2 = this.f130642q;
            MusicModel.CollectionType collectionType = null;
            if (list2 != null) {
                musicModel = list2.get(i);
            } else {
                musicModel = null;
            }
            TextView textView = this.f130631f;
            if (textView != null) {
                if (musicModel != null) {
                    str2 = musicModel.getName();
                } else {
                    str2 = null;
                }
                textView.setText(str2);
            }
            TextView textView2 = this.f130632g;
            if (textView2 != null) {
                if (musicModel == null || (singer = musicModel.getSinger()) == null || singer.length() == 0) {
                    TextView textView3 = this.f130632g;
                    if (!(textView3 == null || (context = textView3.getContext()) == null)) {
                        str = context.getString(R.string.h1c);
                    }
                    str = null;
                } else {
                    if (musicModel != null) {
                        str = musicModel.getSinger();
                    }
                    str = null;
                }
                textView2.setText(str);
            }
            TextView textView4 = this.f130646v;
            if (textView4 != null) {
                if (musicModel != null) {
                    i3 = musicModel.getPresenterDuration();
                } else {
                    i3 = 0;
                }
                textView4.setText(C80565ia.m139648a(i3));
            }
            MusicModel.CollectionType collectionType2 = MusicModel.CollectionType.COLLECTED;
            if (musicModel != null) {
                collectionType = musicModel.getCollectionType();
            }
            if (collectionType2 == collectionType) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.f130645t = z2;
            mo94532a();
            if (!z) {
                mo94534a(this.f130627b, i);
                mo94534a(this.f130628c, i + 1);
                return;
            }
            C89233z.C89235b bVar = new C89233z.C89235b();
            bVar.element = 0.2f;
            C89233z.C89235b bVar2 = new C89233z.C89235b();
            bVar2.element = 1.0f - bVar.element;
            this.f130647w = ValueAnimator.ofFloat(1.0f, bVar.element).setDuration(150L);
            RemoteImageView remoteImageView = this.f130628c;
            if (remoteImageView != null) {
                remoteImageView.setAlpha(0.0f);
            }
            RemoteImageView remoteImageView2 = this.f130628c;
            if (remoteImageView2 != null) {
                remoteImageView2.setVisibility(0);
            }
            ValueAnimator valueAnimator = this.f130647w;
            if (valueAnimator != null) {
                valueAnimator.addUpdateListener(new C57330c(this, bVar, bVar2));
            }
            ValueAnimator valueAnimator2 = this.f130647w;
            if (valueAnimator2 != null) {
                valueAnimator2.addListener(new C57331d(this));
            }
            ValueAnimator valueAnimator3 = this.f130647w;
            if (valueAnimator3 != null) {
                valueAnimator3.start();
            }
        }
    }

    /* renamed from: a */
    public final void mo94536a(boolean z, boolean z2) {
        ImageView imageView = this.f130629d;
        if (imageView != null) {
            imageView.clearAnimation();
        }
        if (!z) {
            ImageView imageView2 = this.f130629d;
            if (imageView2 != null) {
                imageView2.setImageResource(2131233062);
            }
        } else if (z2) {
            ImageView imageView3 = this.f130629d;
            if (imageView3 != null) {
                imageView3.setImageResource(2131232639);
            }
            ImageView imageView4 = this.f130629d;
            if (imageView4 != null) {
                imageView4.startAnimation(this.f130648x);
            }
        } else {
            ImageView imageView5 = this.f130629d;
            if (imageView5 != null) {
                imageView5.setImageResource(2131233061);
            }
        }
    }
}
