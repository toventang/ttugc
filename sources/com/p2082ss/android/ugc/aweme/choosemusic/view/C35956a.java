package com.p2082ss.android.ugc.aweme.choosemusic.view;

import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.p037h.C0792v;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.choosemusic.p2461a.C35711g;
import com.p2082ss.android.ugc.aweme.discover.helper.C41991ak;
import com.p2082ss.android.ugc.aweme.discover.model.Banner;
import com.p2082ss.android.ugc.aweme.discover.widget.IndicatorView;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.C73788q;
import com.p2082ss.android.ugc.aweme.utils.C80471gb;
import com.p2082ss.android.ugc.aweme.utils.C80508gp;
import com.p2082ss.android.ugc.trill.R;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.view.a */
public final class C35956a {

    /* renamed from: a */
    public static final List<Banner> f84866a = Arrays.asList(new Banner());

    /* renamed from: b */
    ViewPager f84867b;

    /* renamed from: c */
    IndicatorView f84868c;

    /* renamed from: d */
    View f84869d;

    /* renamed from: e */
    FrameLayout f84870e;

    /* renamed from: f */
    private C35711g f84871f;

    /* renamed from: g */
    private final C41991ak f84872g;

    /* renamed from: h */
    private Context f84873h;

    /* renamed from: i */
    private int f84874i;

    /* renamed from: j */
    private int f84875j;

    static {
        Covode.recordClassIndex(43202);
    }

    /* renamed from: a */
    public final void mo63090a(List<Banner> list) {
        Context context = this.f84873h;
        if (!f84866a.equals(list)) {
            if (this.f84871f == null) {
                this.f84871f = new C35711g(context, LayoutInflater.from(context), this.f84874i, this.f84875j);
                this.f84867b.setAdapter(new C73788q(this.f84871f));
            }
            boolean a = C80471gb.m139483a(context);
            if (a) {
                Collections.reverse(list);
            }
            this.f84872g.f97928b = list.size();
            this.f84871f.mo62758a(list);
            this.f84868c.setUpViewPager(this.f84867b);
            if (a) {
                this.f84867b.setCurrentItem(list.size() - 1);
            }
            this.f84872g.mo71161a();
        }
    }

    public C35956a(View view, int i, int i2) {
        this.f84873h = view.getContext();
        this.f84867b = (ViewPager) view.findViewById(R.id.fgn);
        this.f84868c = (IndicatorView) view.findViewById(R.id.anu);
        this.f84869d = view.findViewById(R.id.e7_);
        this.f84870e = (FrameLayout) view.findViewById(R.id.ql);
        this.f84874i = i;
        this.f84875j = i2;
        Context context = this.f84873h;
        int a = (int) (((float) (C13628n.m24504a(context) - ((int) (C13628n.m24520b(context, 16.0f) * 2.0f)))) * 0.26239067f);
        ViewGroup.LayoutParams layoutParams = this.f84870e.getLayoutParams();
        layoutParams.height = a;
        this.f84870e.setLayoutParams(layoutParams);
        if (Build.VERSION.SDK_INT >= 21) {
            this.f84870e.setOutlineProvider(new C80508gp((int) C13628n.m24520b(this.f84873h, 2.0f)));
            this.f84870e.setClipToOutline(true);
        }
        this.f84872g = new C41991ak(this.f84867b, 3000);
        int i3 = Build.VERSION.SDK_INT;
        this.f84869d.getLayoutParams().height = C13628n.m24525e(view.getContext());
        C0792v.m2759b((View) this.f84868c, 0);
    }
}
