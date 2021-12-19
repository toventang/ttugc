package com.p2082ss.android.ugc.aweme.kids.choosemusic.p3327i;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.arch.widgets.C33937a;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.C57171a;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3320b.C57192b;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3326h.AbstractC57287k;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3326h.C57288l;
import com.p2082ss.android.ugc.aweme.kids.p3302a.p3303a.AbstractC57080c;
import com.p2082ss.android.ugc.aweme.kids.p3302a.p3307e.C57110d;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p2082ss.android.ugc.trill.R;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.kids.choosemusic.i.i */
public final class C57310i extends C33937a {

    /* renamed from: b */
    TextView f130578b;

    /* renamed from: c */
    TextView f130579c;

    /* renamed from: d */
    public ViewPager f130580d;

    /* renamed from: e */
    View f130581e;

    /* renamed from: f */
    public AbstractC57287k f130582f;

    /* renamed from: g */
    AbstractC57080c<C57192b> f130583g;

    /* renamed from: h */
    public int f130584h = -1;

    /* renamed from: i */
    public int f130585i;

    /* renamed from: j */
    public C57171a f130586j;

    /* renamed from: k */
    C57311a f130587k;

    /* renamed from: l */
    public int f130588l;

    /* renamed from: m */
    public int f130589m;

    /* renamed from: n */
    public boolean f130590n;

    /* renamed from: o */
    private ViewPager.AbstractC1579e f130591o;

    static {
        Covode.recordClassIndex(67215);
    }

    /* renamed from: a */
    public final void mo94521a() {
        this.f130581e.setVisibility(0);
    }

    /* renamed from: b */
    public final void mo94526b() {
        this.f130581e.setVisibility(4);
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.choosemusic.i.i$a */
    class C57311a extends PagerAdapter {

        /* renamed from: a */
        public List<MusicModel> f130592a = null;

        /* renamed from: b */
        LinkedList<C57288l> f130593b = new LinkedList<>();

        static {
            Covode.recordClassIndex(67216);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final int getItemPosition(Object obj) {
            return -2;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final int getCount() {
            List<MusicModel> list = this.f130592a;
            int i = 0;
            if (list == null) {
                return 0;
            }
            int size = list.size() / 3;
            if (this.f130592a.size() % 3 != 0) {
                i = 1;
            }
            return size + i;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C57311a() {
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final Object instantiateItem(ViewGroup viewGroup, int i) {
            boolean z;
            MethodCollector.m26663i(6732);
            C57288l poll = this.f130593b.poll();
            if (poll == null) {
                poll = new C57288l(viewGroup.getContext(), C57310i.this.f130589m);
            }
            AbstractC57287k kVar = C57310i.this.f130582f;
            AbstractC57080c<C57192b> cVar = C57310i.this.f130583g;
            poll.f130511b = kVar;
            poll.f130512c = cVar;
            if (!poll.f130510a.isEmpty()) {
                int i2 = 0;
                do {
                    poll.f130510a.get(i2).mo94501a(poll.f130511b, poll.f130512c);
                    i2++;
                } while (i2 < 3);
            }
            List<MusicModel> list = this.f130592a;
            int i3 = i * 3;
            int i4 = C57310i.this.f130584h;
            int i5 = C57310i.this.f130585i;
            C57171a aVar = C57310i.this.f130586j;
            boolean z2 = C57310i.this.f130590n;
            if (list != null) {
                int min = Math.min(i3 + 3, list.size());
                int i6 = i3;
                while (i6 < min) {
                    MusicModel musicModel = list.get(i6);
                    C57320o oVar = poll.getMusicItemViews().get(i6 - i3);
                    oVar.itemView.setVisibility(0);
                    if (i4 == i6) {
                        z = true;
                    } else {
                        z = false;
                    }
                    oVar.mo94502a(musicModel, z2, z, i5, i6, aVar);
                    i6++;
                    z2 = z2;
                }
                for (int i7 = min - i3; i7 < 3; i7++) {
                    poll.getMusicItemViews().get(i7).itemView.setVisibility(8);
                }
            }
            viewGroup.addView(poll);
            MethodCollector.m26664o(6732);
            return poll;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            MethodCollector.m26663i(6747);
            viewGroup.removeView((View) obj);
            this.f130593b.offer(obj);
            MethodCollector.m26664o(6747);
        }
    }

    /* renamed from: a */
    public final void mo94523a(ViewPager.AbstractC1579e eVar) {
        ViewPager viewPager;
        if (!(this.f130583g == null || (viewPager = this.f130580d) == null)) {
            viewPager.removeOnPageChangeListener(this.f130591o);
        }
        this.f130591o = eVar;
    }

    /* renamed from: a */
    public final void mo94525a(AbstractC57287k kVar, AbstractC57080c<C57192b> cVar) {
        this.f130582f = kVar;
        this.f130583g = cVar;
    }

    public C57310i(View view, int i) {
        super(view);
        this.f130578b = (TextView) view.findViewById(R.id.f67);
        this.f130579c = (TextView) view.findViewById(R.id.f65);
        this.f130580d = (ViewPager) view.findViewById(R.id.fh5);
        this.f130581e = view.findViewById(R.id.amb);
        this.f130588l = (int) C13628n.m24520b(C17867d.m33078a(), 84.0f);
        C57311a aVar = new C57311a();
        this.f130587k = aVar;
        this.f130580d.setAdapter(aVar);
        this.f130589m = i;
        this.f130578b.setOnClickListener(new View$OnClickListenerC57312j(this));
        TextView textView = this.f130578b;
        if (textView instanceof TuxTextView) {
            ((TuxTextView) textView).setTuxFont(62);
        }
    }

    /* renamed from: a */
    public final void mo94522a(int i, int i2, boolean[] zArr, boolean[] zArr2) {
        for (int i3 = 0; i3 < zArr2.length; i3++) {
            if (this.f130580d.getTop() + (this.f130588l * i3) > i2 || this.f130580d.getTop() + ((i3 + 1) * this.f130588l) < i) {
                zArr[i3] = false;
                zArr2[i3] = false;
            } else if (!zArr[i3]) {
                zArr[i3] = true;
                zArr2[i3] = true;
            }
        }
    }

    /* renamed from: a */
    public final void mo94524a(C57110d dVar, List<MusicModel> list, int i, int i2, int i3, C57171a aVar, boolean z) {
        this.f130579c.setText(dVar.f130025b);
        if (list != null) {
            this.f130580d.getLayoutParams().height = this.f130588l * Math.min(3, list.size());
        }
        this.f130590n = z;
        this.f130585i = i3;
        this.f130584h = i2;
        this.f130587k.f130592a = list;
        this.f130587k.notifyDataSetChanged();
        this.f130580d.setCurrentItem(i);
        this.f130580d.addOnPageChangeListener(this.f130591o);
        this.f130586j = aVar;
    }
}
