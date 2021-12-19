package com.p2082ss.android.ugc.aweme.choosemusic.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.icon.TuxIconView;
import com.p2082ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p2082ss.android.ugc.aweme.choosemusic.MusicSearchStateViewModel;
import com.p2082ss.android.ugc.aweme.choosemusic.p2463c.AbstractView$OnClickListenerC35761a;
import com.p2082ss.android.ugc.aweme.choosemusic.p2468h.p2472d.C35857c;
import com.p2082ss.android.ugc.aweme.commercialize.media.impl.service.CommerceMediaServiceImpl;
import com.p2082ss.android.ugc.aweme.discover.helper.AbstractC42021i;
import com.p2082ss.android.ugc.aweme.discover.p2773h.AbstractC41955b;
import com.p2082ss.android.ugc.aweme.music.p3476k.C60822a;
import com.p2082ss.android.ugc.aweme.search.C67446h;
import com.p2082ss.android.ugc.aweme.search.SearchServiceImpl;
import com.p2082ss.android.ugc.aweme.search.p3691g.AbstractC67440e;
import com.p2082ss.android.ugc.aweme.search.p3691g.C67437b;
import com.p2082ss.android.ugc.aweme.setting.C68027bm;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.view.c */
public abstract class AbstractC35966c {

    /* renamed from: A */
    private int f84905A;

    /* renamed from: B */
    private TextWatcher f84906B;

    /* renamed from: a */
    public AbstractView$OnClickListenerC35761a f84907a;

    /* renamed from: b */
    public AbstractC41955b f84908b;

    /* renamed from: c */
    ViewStub f84909c;

    /* renamed from: d */
    public LinearLayout f84910d;

    /* renamed from: e */
    public TextView f84911e;

    /* renamed from: f */
    ImageView f84912f;

    /* renamed from: g */
    public ViewGroup f84913g;

    /* renamed from: h */
    public TextView f84914h;

    /* renamed from: i */
    public LinearLayout f84915i;

    /* renamed from: j */
    public EditText f84916j;

    /* renamed from: k */
    public SearchResultView f84917k;

    /* renamed from: l */
    TuxIconView f84918l;

    /* renamed from: m */
    public FrameLayout f84919m;

    /* renamed from: n */
    public LinearLayout f84920n;

    /* renamed from: o */
    StarTcmItem f84921o;

    /* renamed from: p */
    CommerceTipsItem f84922p;

    /* renamed from: q */
    public FrameLayout f84923q;

    /* renamed from: r */
    public View f84924r;

    /* renamed from: s */
    public View f84925s;

    /* renamed from: t */
    MusicSearchStateViewModel f84926t;

    /* renamed from: u */
    public ValueAnimator f84927u;

    /* renamed from: v */
    public ValueAnimator f84928v;

    /* renamed from: w */
    int f84929w;

    /* renamed from: x */
    public Fragment f84930x;

    /* renamed from: y */
    public C67437b f84931y;

    /* renamed from: z */
    public boolean f84932z;

    static {
        Covode.recordClassIndex(43212);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo63107c();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract void mo63108d();

    /* renamed from: i */
    public final void mo63113i() {
        EditText editText = this.f84916j;
        if (editText != null) {
            editText.clearFocus();
        }
    }

    /* renamed from: b */
    public final void mo63106b() {
        this.f84931y = null;
        this.f84908b.mo71114a("music", this.f84930x);
    }

    /* renamed from: h */
    public final String mo63112h() {
        return this.f84916j.getText().toString();
    }

    /* renamed from: k */
    public final String mo63115k() {
        EditText editText = this.f84916j;
        if (editText == null) {
            return "";
        }
        return editText.getText().toString();
    }

    /* renamed from: f */
    public final void mo63110f() {
        this.f84919m.getMeasuredWidth();
        ViewGroup.LayoutParams layoutParams = this.f84915i.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = -1;
            this.f84915i.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: g */
    public final void mo63111g() {
        if (this.f84907a.getActivity() != null) {
            this.f84916j.post(new RunnableC35973e(this));
        }
    }

    /* renamed from: j */
    public final void mo63114j() {
        EditText editText = this.f84916j;
        if (editText != null) {
            editText.setText("");
        }
        FrameLayout frameLayout = this.f84923q;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
        SearchResultView searchResultView = this.f84917k;
        if (searchResultView != null) {
            searchResultView.setVisibility(8);
        }
        KeyboardUtils.m70897c(this.f84916j);
    }

    /* renamed from: m */
    private Map<String, String> m73356m() {
        HashMap hashMap = new HashMap();
        hashMap.put("search_keyword", mo63115k());
        hashMap.put("search_id", this.f84907a.mo62814g());
        hashMap.put("search_type", "music_create");
        hashMap.put("enter_from", "search_music");
        return hashMap;
    }

    /* renamed from: e */
    public final void mo63109e() {
        this.f84911e.setVisibility(8);
        this.f84914h.setVisibility(8);
        this.f84913g.setVisibility(0);
        mo63110f();
        View view = this.f84924r;
        if (view != null) {
            view.setVisibility(8);
        }
        View view2 = this.f84925s;
        if (view2 != null) {
            view2.setVisibility(0);
        }
    }

    /* renamed from: n */
    private void m73357n() {
        this.f84916j.setOnEditorActionListener(this.f84907a);
        this.f84916j.addTextChangedListener(this.f84906B);
        this.f84916j.setOnTouchListener(new View$OnTouchListenerC35977i(this));
        mo63108d();
        this.f84915i.setOnClickListener(this.f84907a);
        this.f84911e.setOnClickListener(this.f84907a);
        this.f84914h.setOnClickListener(this.f84907a);
        this.f84918l.setOnClickListener(new View$OnClickListenerC35978j(this));
        this.f84916j.addTextChangedListener(new TextWatcher() {
            /* class com.p2082ss.android.ugc.aweme.choosemusic.view.AbstractC35966c.C359671 */

            static {
                Covode.recordClassIndex(43213);
            }

            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void afterTextChanged(Editable editable) {
                if (TextUtils.isEmpty(editable.toString())) {
                    AbstractC35966c.this.f84918l.setVisibility(8);
                    C35857c.C35858a.m73253a("");
                    return;
                }
                AbstractC35966c.this.f84918l.setVisibility(0);
            }
        });
        this.f84917k.setOnDispatchTouchEventListener(new C35979k(this));
        if (this.f84908b.mo71121c()) {
            this.f84913g.setOnClickListener(new View.OnClickListener() {
                /* class com.p2082ss.android.ugc.aweme.choosemusic.view.AbstractC35966c.View$OnClickListenerC359682 */

                static {
                    Covode.recordClassIndex(43214);
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    if (AbstractC35966c.this.f84930x == null) {
                        AbstractC35966c cVar = AbstractC35966c.this;
                        cVar.f84930x = cVar.f84908b.mo71106a("music", AbstractC35966c.this.f84932z, new AbstractC67440e() {
                            /* class com.p2082ss.android.ugc.aweme.choosemusic.view.AbstractC35966c.View$OnClickListenerC359682.C359691 */

                            static {
                                Covode.recordClassIndex(43215);
                            }

                            @Override // com.p2082ss.android.ugc.aweme.search.p3691g.AbstractC67440e
                            /* renamed from: a */
                            public final void mo63121a(C67437b bVar) {
                                AbstractC35966c.this.f84931y = bVar;
                            }
                        });
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put("search_keyword", AbstractC35966c.this.mo63115k());
                    hashMap.put("search_id", AbstractC35966c.this.f84907a.mo62814g());
                    hashMap.put("search_type", "music_create");
                    hashMap.put("enter_from", "search_music");
                    AbstractC35966c.this.f84908b.mo71110a((ActivityC0945e) view.getContext(), AbstractC35966c.this.f84930x, new View.OnClickListener() {
                        /* class com.p2082ss.android.ugc.aweme.choosemusic.view.AbstractC35966c.View$OnClickListenerC359682.View$OnClickListenerC359702 */

                        static {
                            Covode.recordClassIndex(43216);
                        }

                        public final void onClick(View view) {
                            ClickAgent.onClick(view);
                            if (AbstractC35966c.this.f84931y != null) {
                                AbstractC35966c.this.f84907a.mo62807a(AbstractC35966c.this.f84931y);
                                AbstractC35966c.this.mo63105a(true, AbstractC35966c.this.f84931y.isDefaultOption());
                            }
                            AbstractC35966c.this.f84908b.mo71113a(AbstractC35966c.this.f84931y, AbstractC35966c.this.f84930x);
                            if (AbstractC35966c.this.f84907a.mo62815h() != null) {
                                AbstractC35966c.this.f84907a.mo62815h().f84278n = false;
                            }
                        }
                    }, new View.OnClickListener() {
                        /* class com.p2082ss.android.ugc.aweme.choosemusic.view.AbstractC35966c.View$OnClickListenerC359682.View$OnClickListenerC359713 */

                        static {
                            Covode.recordClassIndex(43217);
                        }

                        public final void onClick(View view) {
                            ClickAgent.onClick(view);
                            if (AbstractC35966c.this.f84907a.mo62815h() != null) {
                                AbstractC35966c.this.f84907a.mo62815h().f84278n = false;
                            }
                        }
                    }, hashMap);
                    if (AbstractC35966c.this.f84907a.mo62815h() != null) {
                        AbstractC35966c.this.f84907a.mo62815h().f84278n = true;
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo63103a() {
        this.f84920n.setOnClickListener(this.f84907a);
        if ((CommerceMediaServiceImpl.m77578f().mo66513b() || CommerceMediaServiceImpl.m77578f().mo66517e()) && C60822a.C60823a.m110420a("show_commerce_tips", (Boolean) true, "music_sp")) {
            this.f84922p.setVisibility(0);
        } else {
            this.f84922p.setVisibility(8);
        }
        this.f84922p.setUnderView(this.f84923q);
        mo63107c();
        this.f84921o.setUnderView(this.f84923q);
    }

    /* renamed from: l */
    public final void mo63116l() {
        if (this.f84909c.getParent() != null) {
            View inflate = this.f84909c.inflate();
            this.f84910d = (LinearLayout) inflate.findViewById(R.id.cec);
            this.f84915i = (LinearLayout) inflate.findViewById(R.id.dm0);
            this.f84916j = (EditText) inflate.findViewById(R.id.f33);
            this.f84918l = (TuxIconView) inflate.findViewById(R.id.bu4);
            this.f84919m = (FrameLayout) inflate.findViewById(R.id.avo);
            this.f84911e = (TextView) inflate.findViewById(R.id.f34);
            this.f84914h = (TextView) inflate.findViewById(R.id.f35);
            this.f84917k = (SearchResultView) inflate.findViewById(R.id.adf);
            this.f84912f = (ImageView) inflate.findViewById(R.id.bzh);
            this.f84913g = (ViewGroup) inflate.findViewById(R.id.drn);
            m73357n();
        }
    }

    /* renamed from: a */
    private void m73355a(boolean z) {
        boolean z2;
        Context context = this.f84923q.getContext();
        Fragment fragment = this.f84930x;
        if ((context instanceof ActivityC0945e) && fragment != null) {
            AbstractC41955b f = C67446h.f151111a.mo106217f();
            ActivityC0945e eVar = (ActivityC0945e) context;
            Map<String, String> m = m73356m();
            if (this.f84932z == z) {
                z2 = true;
            } else {
                z2 = false;
            }
            f.mo71112a(new AbstractC42021i.C42022a(eVar, fragment, "music", m, z, z2));
        }
    }

    /* renamed from: a */
    public final void mo63104a(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            this.f84916j.setText(charSequence);
            if (!TextUtils.isEmpty(this.f84916j.getText())) {
                this.f84916j.setSelection(charSequence.length());
            }
        }
    }

    /* renamed from: a */
    public final void mo63105a(boolean z, boolean z2) {
        m73355a(z);
        this.f84932z = z;
        if (z) {
            this.f84913g.setClickable(true);
            if (!z2) {
                this.f84912f.setImageResource(2131233604);
            } else {
                this.f84912f.setImageResource(2131233603);
            }
        } else if (C67446h.f151111a.mo106217f().mo71117a("music")) {
            this.f84913g.setClickable(true);
            this.f84912f.setImageResource(2131233603);
        } else {
            this.f84913g.setClickable(false);
            this.f84912f.setImageResource(2131233602);
        }
    }

    public AbstractC35966c(View view, AbstractView$OnClickListenerC35761a aVar, int i, TextWatcher textWatcher) {
        View decorView;
        this.f84907a = aVar;
        this.f84905A = i;
        this.f84906B = textWatcher;
        if (!(aVar == null || aVar.getActivity() == null)) {
            MusicSearchStateViewModel musicSearchStateViewModel = (MusicSearchStateViewModel) C1181ae.m3881a(this.f84907a.getActivity(), (C1175ad.AbstractC1177b) null).mo3983a(MusicSearchStateViewModel.class);
            this.f84926t = musicSearchStateViewModel;
            musicSearchStateViewModel.mo62738d().observe(this.f84907a, new C35972d(this));
            Window window = this.f84907a.getActivity().getWindow();
            if (!(window == null || (decorView = window.getDecorView()) == null)) {
                this.f84924r = decorView.findViewById(R.id.pi);
                View findViewById = decorView.findViewById(R.id.dr_);
                this.f84925s = findViewById;
                if (findViewById != null) {
                    findViewById.setOnClickListener(this.f84907a);
                }
            }
        }
        this.f84909c = (ViewStub) view.findViewById(R.id.fg6);
        this.f84920n = (LinearLayout) view.findViewById(R.id.dly);
        this.f84921o = (StarTcmItem) view.findViewById(R.id.bro);
        this.f84922p = (CommerceTipsItem) view.findViewById(R.id.bqq);
        this.f84923q = (FrameLayout) view.findViewById(R.id.adg);
        this.f84929w = C13628n.m24504a(view.getContext());
        this.f84908b = SearchServiceImpl.m119336t().mo106217f();
        if (!C68027bm.m120329a()) {
            mo63116l();
        }
    }
}
