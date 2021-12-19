package com.p2082ss.android.ugc.aweme.kids.choosemusic.p3321c;

import android.os.Bundle;
import android.os.Message;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.AbstractC0976n;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3325g.C57268c;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3326h.C57284i;
import com.p2082ss.android.ugc.aweme.music.model.Music;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.kids.choosemusic.c.a */
public abstract class AbstractView$OnClickListenerC57193a extends AbstractC34586a implements View.OnClickListener, TextView.OnEditorActionListener, AbstractC0952i.AbstractC0955c, WeakHandler.IHandler {

    /* renamed from: a */
    public C57226t f130240a;

    /* renamed from: b */
    public boolean f130241b;

    /* renamed from: c */
    C57284i f130242c;

    /* renamed from: d */
    public View f130243d;

    /* renamed from: e */
    TextView f130244e;

    /* renamed from: j */
    View f130245j;

    /* renamed from: k */
    boolean f130246k;

    /* renamed from: l */
    public boolean f130247l;

    /* renamed from: m */
    protected WeakHandler f130248m = new WeakHandler(this);

    /* renamed from: n */
    TextWatcher f130249n = new TextWatcher() {
        /* class com.p2082ss.android.ugc.aweme.kids.choosemusic.p3321c.AbstractView$OnClickListenerC57193a.C571962 */

        static {
            Covode.recordClassIndex(67101);
        }

        public final void afterTextChanged(Editable editable) {
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    };

    /* renamed from: o */
    private int f130250o;

    /* renamed from: p */
    private String f130251p;

    /* renamed from: q */
    private Music f130252q;

    /* renamed from: r */
    private String f130253r;

    /* renamed from: s */
    private String f130254s;

    /* renamed from: t */
    private boolean f130255t;

    /* renamed from: u */
    private MusicModel f130256u;

    /* renamed from: v */
    private String f130257v;

    /* renamed from: w */
    private String f130258w;

    static {
        Covode.recordClassIndex(67098);
    }

    @Override // androidx.fragment.app.AbstractC0952i.AbstractC0955c
    /* renamed from: a */
    public final void mo3582a() {
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
    }

    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        return false;
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f130248m.removeCallbacksAndMessages(null);
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onDestroyView() {
        getChildFragmentManager().mo3559b(this);
        super.onDestroyView();
    }

    public void onClick(View view) {
        ActivityC0945e activity;
        ClickAgent.onClick(view);
        if (view.getId() == R.id.f35) {
            this.f130241b = false;
            this.f130242c.f130475b.setVisibility(0);
        } else if (view.getId() != R.id.dm0 && view.getId() == R.id.pi && (activity = getActivity()) != null) {
            activity.onBackPressed();
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.f130250o = getArguments().getInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", 1);
            this.f130251p = getArguments().getString("challenge");
            this.f130257v = getArguments().getString("creation_id");
            this.f130258w = getArguments().getString("shoot_way");
            this.f130252q = (Music) getArguments().getSerializable("sticker_music");
            this.f130253r = getArguments().getString("first_sticker_music_ids", null);
            this.f130255t = getArguments().getBoolean("is_busi_sticker", false);
            this.f130254s = getArguments().getString("first_sticker_id", null);
            this.f130256u = (MusicModel) getArguments().getSerializable("music_model");
            this.f130246k = getArguments().getBoolean("music_allow_clear", false);
            this.f130247l = getArguments().getBoolean("music_is_photomv", false);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        AbstractC0952i childFragmentManager = getChildFragmentManager();
        Fragment a = childFragmentManager.mo3549a(R.id.adg);
        if (a != null) {
            this.f130240a = (C57226t) a;
        } else {
            int i = this.f130250o;
            String str = this.f130251p;
            Music music = this.f130252q;
            String str2 = this.f130253r;
            String str3 = this.f130254s;
            boolean z = this.f130255t;
            String str4 = this.f130258w;
            Bundle bundle2 = new Bundle();
            bundle2.putInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", i);
            if (!TextUtils.isEmpty(str)) {
                bundle2.putString("challenge", str);
            }
            if (music != null) {
                bundle2.putSerializable("sticker_music", music);
            }
            if (str2 != null) {
                bundle2.putString("first_sticker_music_ids", str2);
            }
            if (str3 != null) {
                bundle2.putString("first_sticker_id", str3);
            }
            bundle2.putBoolean("is_busi_sticker", z);
            C57226t tVar = new C57226t();
            if (!TextUtils.isEmpty(str4)) {
                bundle2.putString("shoot_way", str4);
            }
            tVar.setArguments(bundle2);
            this.f130240a = tVar;
            tVar.f130303n = 0;
            MusicModel musicModel = this.f130256u;
            if (musicModel != null && musicModel.isMvThemeMusic()) {
                this.f130240a.f130309t = true;
            }
            this.f130240a.f130310u = this.f130247l;
            AbstractC0976n a2 = childFragmentManager.mo3552a();
            a2.mo3453a(R.id.adg, this.f130240a);
            a2.mo3473c();
        }
        if (this.f130246k) {
            this.f130243d = view.findViewById(R.id.a11);
            this.f130244e = (TextView) view.findViewById(R.id.agn);
            this.f130245j = view.findViewById(R.id.a12);
        }
        getChildFragmentManager().mo3556a((AbstractC0952i.AbstractC0955c) this);
        C57284i iVar = this.f130242c;
        iVar.f130476c.setOnClickListener(iVar.f130474a);
        iVar.f130474a.f130240a.f130295a = new AbstractC57220o() {
            /* class com.p2082ss.android.ugc.aweme.kids.choosemusic.p3326h.AbstractC57275c.C572761 */

            static {
                Covode.recordClassIndex(67181);
            }
        };
        iVar.f130474a.f130240a.f130295a = new AbstractC57220o() {
            /* class com.p2082ss.android.ugc.aweme.kids.choosemusic.p3326h.AbstractC57275c.C572772 */

            static {
                Covode.recordClassIndex(67182);
            }
        };
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View a = C1764a.m5927a(layoutInflater, R.layout.adc, viewGroup, false);
        C57268c.f130445d = this.f130258w;
        C57268c.f130444c = this.f130257v;
        this.f130242c = new C57284i(a, this, this.f130250o, this.f130249n);
        return a;
    }
}
