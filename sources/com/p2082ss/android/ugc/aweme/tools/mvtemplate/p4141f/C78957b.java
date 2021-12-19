package com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4141f;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.C1764a;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.DmtLoadingLayout;
import com.bytedance.p1559o.C21582f;
import com.p2082ss.android.ugc.aweme.feed.model.Video;
import com.p2082ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.MvThemeData;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4137c.AbstractC78928a;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4137c.p4138a.AbstractC78931c;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4137c.p4138a.AbstractC78933e;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.view.MvRatioFrameLayout;
import com.p2082ss.android.ugc.aweme.views.C81467t;
import com.p2082ss.android.ugc.tools.p4340c.C84402a;
import com.p2082ss.android.ugc.tools.view.widget.AnimatedImageView;
import com.p2082ss.android.ugc.tools.view.widget.CircularProgressView;
import com.p2082ss.android.ugc.trill.R;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.f.b */
public final class C78957b extends Fragment implements AbstractC78931c {

    /* renamed from: a */
    public CircularProgressView f177452a;

    /* renamed from: b */
    public TextView f177453b;

    /* renamed from: c */
    View f177454c;

    /* renamed from: d */
    public MvThemeData f177455d;

    /* renamed from: e */
    public AbstractC78933e f177456e;

    /* renamed from: f */
    boolean f177457f;

    /* renamed from: g */
    public C21582f f177458g;

    /* renamed from: h */
    private AnimatedImageView f177459h;

    /* renamed from: i */
    private DmtLoadingLayout f177460i;

    /* renamed from: j */
    private View f177461j;

    /* renamed from: k */
    private Video f177462k;

    /* renamed from: l */
    private int f177463l;

    static {
        Covode.recordClassIndex(92106);
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4137c.p4138a.AbstractC78931c
    /* renamed from: a */
    public final void mo122739a() {
        mo122749a(false);
        AnimatedImageView animatedImageView = this.f177459h;
        if (animatedImageView != null) {
            animatedImageView.setVisibility(0);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4137c.p4138a.AbstractC78931c
    /* renamed from: b */
    public final void mo122740b() {
        AnimatedImageView animatedImageView = this.f177459h;
        if (animatedImageView != null) {
            animatedImageView.setVisibility(8);
        }
    }

    /* renamed from: d */
    public final int mo122751d() {
        View view = this.f177454c;
        if (view != null) {
            return view.getMeasuredWidth();
        }
        return 0;
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4137c.p4138a.AbstractC78931c
    /* renamed from: c */
    public final void mo122741c() {
        this.f177457f = true;
        mo122749a(false);
        AnimatedImageView animatedImageView = this.f177459h;
        if (animatedImageView != null) {
            animatedImageView.setVisibility(8);
        }
    }

    /* renamed from: f */
    public final void mo122753f() {
        Video video;
        AbstractC78933e eVar = this.f177456e;
        if (eVar != null && !eVar.isPlaying() && (video = this.f177462k) != null) {
            this.f177456e.tryResume(video);
        }
    }

    /* renamed from: g */
    public final void mo122754g() {
        AbstractC78933e eVar = this.f177456e;
        if (eVar != null) {
            eVar.stop();
            this.f177457f = false;
            AnimatedImageView animatedImageView = this.f177459h;
            if (animatedImageView != null) {
                animatedImageView.setVisibility(0);
            }
        }
    }

    /* renamed from: e */
    public final void mo122752e() {
        if (this.f177456e == null || !m137772a(this.f177455d)) {
            DmtLoadingLayout dmtLoadingLayout = this.f177460i;
            if (dmtLoadingLayout != null) {
                dmtLoadingLayout.setVisibility(8);
                return;
            }
            return;
        }
        if (this.f177462k == null) {
            this.f177462k = new Video();
            VideoUrlModel videoUrlModel = new VideoUrlModel();
            videoUrlModel.setBytevc1(false);
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.f177455d.mo122671e());
            videoUrlModel.setUrlList(arrayList);
            videoUrlModel.setUrlKey(this.f177455d.f177188e);
            videoUrlModel.setUri(this.f177455d.f177188e);
            this.f177462k.setPlayAddr(videoUrlModel);
            this.f177462k.setSourceId(this.f177455d.mo122675i());
        }
        this.f177456e.tryResume(this.f177462k);
        View view = this.f177454c;
        if (view != null) {
            view.postDelayed(new RunnableC78959d(this), 300);
        }
    }

    /* renamed from: a */
    private static boolean m137772a(MvThemeData mvThemeData) {
        if (mvThemeData == null || mvThemeData.f177184a == null || TextUtils.isEmpty(mvThemeData.mo122671e()) || TextUtils.isEmpty(mvThemeData.f177188e) || TextUtils.isEmpty(mvThemeData.mo122675i())) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final void mo122750b(boolean z) {
        int i;
        int i2;
        View view = this.f177461j;
        int i3 = 0;
        if (view != null) {
            if (z) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            view.setVisibility(i2);
        }
        CircularProgressView circularProgressView = this.f177452a;
        if (circularProgressView != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            circularProgressView.setVisibility(i);
        }
        TextView textView = this.f177453b;
        if (textView != null) {
            if (!z) {
                i3 = 8;
            }
            textView.setVisibility(i3);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C78956a aVar = new C78956a(this.f177458g);
        this.f177456e = aVar;
        aVar.addPlayerListener(this);
        if (getArguments() != null) {
            this.f177463l = getArguments().getInt("position");
        }
    }

    /* renamed from: a */
    public final void mo122749a(boolean z) {
        int i;
        DmtLoadingLayout dmtLoadingLayout = this.f177460i;
        if (dmtLoadingLayout != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            dmtLoadingLayout.setVisibility(i);
        }
    }

    /* renamed from: a */
    public static C78957b m137771a(MvThemeData mvThemeData, int i, C21582f fVar) {
        C78957b bVar = new C78957b();
        bVar.f177455d = mvThemeData;
        bVar.f177458g = fVar;
        Bundle bundle = new Bundle();
        bundle.putInt("position", i);
        bVar.setArguments(bundle);
        return bVar;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (this.f177454c == null) {
            this.f177454c = C1764a.m5927a(layoutInflater, R.layout.aa_, viewGroup, false);
        }
        this.f177459h = (AnimatedImageView) this.f177454c.findViewById(R.id.bwq);
        this.f177460i = (DmtLoadingLayout) this.f177454c.findViewById(R.id.cg3);
        this.f177452a = (CircularProgressView) this.f177454c.findViewById(R.id.bxi);
        this.f177461j = this.f177454c.findViewById(R.id.cfp);
        this.f177453b = (TextView) this.f177454c.findViewById(R.id.d_3);
        this.f177452a.setVisibility(4);
        this.f177453b.setVisibility(4);
        this.f177452a.setColor(-1);
        this.f177452a.setThickness((int) C13628n.m24520b(this.f177454c.getContext(), 2.0f));
        if (Build.VERSION.SDK_INT >= 21) {
            this.f177454c.setOutlineProvider(new C81467t((int) C13628n.m24520b(this.f177459h.getContext(), 8.0f)));
            this.f177454c.setClipToOutline(true);
        }
        MvRatioFrameLayout mvRatioFrameLayout = (MvRatioFrameLayout) this.f177454c.findViewById(R.id.dnh);
        C21582f fVar = this.f177458g;
        if (fVar != null) {
            TextureView create = ((AbstractC78928a) fVar.mo35249a((Type) AbstractC78928a.class, (String) null)).getKeepSurfaceTextureViewFactory().create(requireActivity());
            create.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            mvRatioFrameLayout.addView(create, 0);
            this.f177456e.wrap(create);
        }
        this.f177454c.setTag(Integer.valueOf(this.f177463l));
        this.f177454c.post(new RunnableC78958c(this, viewGroup));
        MvThemeData mvThemeData = this.f177455d;
        if (mvThemeData != null && !TextUtils.isEmpty(mvThemeData.mo122673g())) {
            C84402a.m145174a(this.f177459h, this.f177455d.mo122673g(), 1, 1);
        }
        if (this.f177463l == 0 && !this.f177456e.isPlaying()) {
            mo122752e();
        }
        return this.f177454c;
    }
}
