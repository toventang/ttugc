package com.bytedance.android.live.liveinteract.cohost.p279ui.p280a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.p218f.C3951p;
import com.bytedance.android.live.core.widget.animationInterpolatorC4046c;
import com.bytedance.android.live.liveinteract.cohost.p279ui.view.C4803a;
import com.bytedance.android.live.uikit.p412d.AbstractC6230a;
import com.bytedance.android.livesdk.chatroom.p492g.C7577g;
import com.bytedance.android.livesdk.util.rxutils.C11191f;
import com.bytedance.android.livesdk.utils.p654b.C11231b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.a.a */
public final class C4632a extends AbstractC6230a {

    /* renamed from: a */
    public final ArrayList<ImageModel> f12284a = new ArrayList<>();

    /* renamed from: e */
    private final List<Integer> f12285e;

    static {
        Covode.recordClassIndex(5209);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return Integer.MAX_VALUE;
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.a.a$a */
    public static final class C4633a implements ViewPager.AbstractC1580f {

        /* renamed from: a */
        public ViewPager f12286a;

        /* renamed from: b */
        public final boolean f12287b;

        static {
            Covode.recordClassIndex(5210);
        }

        public C4633a(ViewPager viewPager, boolean z) {
            C89219l.m154721d(viewPager, "");
            this.f12286a = viewPager;
            this.f12287b = z;
        }

        @Override // androidx.viewpager.widget.ViewPager.AbstractC1580f
        /* renamed from: a */
        public final void mo5330a(View view, float f) {
            C89219l.m154721d(view, "");
            animationInterpolatorC4046c cVar = new animationInterpolatorC4046c((byte) 0);
            View findViewById = view.findViewById(R.id.bys);
            if (findViewById != null) {
                Object tag = view.getTag();
                if (!(tag instanceof Integer)) {
                    tag = null;
                }
                Integer num = (Integer) tag;
                if (num != null) {
                    int intValue = num.intValue();
                    if (intValue - this.f12286a.getCurrentItem() == 2) {
                        findViewById.setPivotX(0.0f);
                    } else if (this.f12286a.getCurrentItem() - intValue == 2) {
                        findViewById.setPivotX((float) findViewById.getWidth());
                    } else {
                        findViewById.setPivotX(((float) findViewById.getWidth()) / 2.0f);
                    }
                }
                findViewById.setPivotY(((float) findViewById.getHeight()) / 2.0f);
                float f2 = 0.7f * f;
                findViewById.setScaleX(1.0f - cVar.getInterpolation(Math.abs(f2)));
                findViewById.setScaleY(1.0f - cVar.getInterpolation(Math.abs(f2)));
                findViewById.setAlpha(1.0f - Math.abs(f));
            }
            if (f == 0.0f) {
                if (!(view instanceof C4803a)) {
                    view = null;
                }
                C4803a aVar = (C4803a) view;
                if (this.f12287b) {
                    if (aVar != null) {
                        aVar.mo10533a();
                    }
                } else if (aVar != null) {
                    aVar.f12619a = C11231b.m19896a(2300, TimeUnit.MILLISECONDS).mo143271a(new C11191f()).mo143289d(new C4803a.C4811f(aVar));
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4632a(Context context, LayoutInflater layoutInflater) {
        super(context, layoutInflater);
        C89219l.m154721d(context, "");
        C89219l.m154721d(layoutInflater, "");
        ArrayList arrayList = new ArrayList();
        arrayList.add(2131234852);
        arrayList.add(2131234850);
        arrayList.add(2131234849);
        arrayList.add(2131234851);
        arrayList.add(2131234852);
        this.f12285e = arrayList;
    }

    @Override // com.bytedance.android.live.uikit.p412d.AbstractC6230a
    /* renamed from: a */
    public final View mo10387a(int i, View view, ViewGroup viewGroup) {
        if (!(view instanceof C4803a)) {
            view = null;
        }
        C4803a aVar = (C4803a) view;
        if (aVar == null) {
            Context context = this.f15587d;
            C89219l.m154716b(context, "");
            aVar = new C4803a(context, (byte) 0);
        }
        aVar.setTag(Integer.valueOf(i));
        if (this.f12284a.size() >= 10) {
            ImageModel imageModel = this.f12284a.get(Math.abs(i) % this.f12284a.size());
            C89219l.m154716b(imageModel, "");
            ImageModel imageModel2 = imageModel;
            C89219l.m154721d(imageModel2, "");
            C7577g.m15571a(aVar.getMUserAvatar(), imageModel2, aVar.getMUserAvatar().getWidth(), aVar.getMUserAvatar().getHeight(), 2131234441);
        } else {
            C3951p.m9620a(aVar.getMUserAvatar(), this.f12285e.get(Math.abs(i) % this.f12285e.size()).intValue(), aVar.getMUserAvatar().getWidth(), aVar.getMUserAvatar().getHeight());
        }
        return aVar;
    }
}
