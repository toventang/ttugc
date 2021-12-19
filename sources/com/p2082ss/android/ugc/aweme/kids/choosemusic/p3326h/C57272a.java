package com.p2082ss.android.ugc.aweme.kids.choosemusic.p3326h;

import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.core.p037h.C0792v;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.discover.helper.C41991ak;
import com.p2082ss.android.ugc.aweme.discover.model.Banner;
import com.p2082ss.android.ugc.aweme.discover.widget.IndicatorView;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3319a.C57182g;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.C73788q;
import com.p2082ss.android.ugc.aweme.utils.C80471gb;
import com.p2082ss.android.ugc.aweme.utils.C80508gp;
import com.p2082ss.android.ugc.trill.R;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.kids.choosemusic.h.a */
public final class C57272a {

    /* renamed from: a */
    public static final List<Banner> f130454a = Arrays.asList(new Banner());

    /* renamed from: b */
    ViewPager f130455b;

    /* renamed from: c */
    IndicatorView f130456c;

    /* renamed from: d */
    View f130457d;

    /* renamed from: e */
    RelativeLayout f130458e;

    /* renamed from: f */
    ViewGroup f130459f;

    /* renamed from: g */
    private C57182g f130460g;

    /* renamed from: h */
    private final C41991ak f130461h;

    /* renamed from: i */
    private Context f130462i;

    /* renamed from: j */
    private int f130463j;

    static {
        Covode.recordClassIndex(67177);
    }

    /* renamed from: a */
    public final void mo94472a(List<Banner> list) {
        Context context = this.f130462i;
        if (!f130454a.equals(list)) {
            if (this.f130460g == null) {
                this.f130460g = new C57182g(context, LayoutInflater.from(context), this.f130463j);
                this.f130455b.setAdapter(new C73788q(this.f130460g));
            }
            boolean a = C80471gb.m139483a(context);
            if (a) {
                Collections.reverse(list);
            }
            this.f130461h.f97928b = list.size();
            this.f130460g.mo94383a(list);
            this.f130456c.setUpViewPager(this.f130455b);
            if (a) {
                this.f130455b.setCurrentItem(list.size() - 1);
            }
            this.f130461h.mo71161a();
        }
    }

    public C57272a(View view, int i) {
        this.f130462i = view.getContext();
        this.f130455b = (ViewPager) view.findViewById(R.id.fgn);
        this.f130456c = (IndicatorView) view.findViewById(R.id.anu);
        this.f130457d = view.findViewById(R.id.e7_);
        this.f130458e = (RelativeLayout) view.findViewById(R.id.ql);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.ccz);
        this.f130459f = viewGroup;
        this.f130463j = i;
        Context context = this.f130462i;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams();
        marginLayoutParams.leftMargin = (int) C13628n.m24520b(this.f130459f.getContext(), 16.0f);
        marginLayoutParams.rightMargin = marginLayoutParams.leftMargin;
        int a = (int) (((float) (C13628n.m24504a(context) - ((int) (C13628n.m24520b(context, 16.0f) * 2.0f)))) * 0.26239067f);
        ViewGroup.LayoutParams layoutParams = this.f130458e.getLayoutParams();
        layoutParams.height = a;
        this.f130458e.setLayoutParams(layoutParams);
        if (Build.VERSION.SDK_INT >= 21) {
            this.f130458e.setOutlineProvider(new C80508gp((int) C13628n.m24520b(this.f130462i, 2.0f)));
            this.f130458e.setClipToOutline(true);
        }
        this.f130461h = new C41991ak(this.f130455b, 3000);
        int i2 = Build.VERSION.SDK_INT;
        this.f130457d.getLayoutParams().height = C13628n.m24525e(view.getContext());
        C0792v.m2759b((View) this.f130456c, 0);
    }
}
