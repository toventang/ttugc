package com.p2082ss.android.ugc.aweme.choosemusic.viewholder;

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
import com.p2082ss.android.ugc.aweme.choosemusic.C35754b;
import com.p2082ss.android.ugc.aweme.choosemusic.p2462b.C35757c;
import com.p2082ss.android.ugc.aweme.choosemusic.view.AbstractC35989s;
import com.p2082ss.android.ugc.aweme.choosemusic.view.C35990t;
import com.p2082ss.android.ugc.aweme.music.model.MusicCollectionItem;
import com.p2082ss.android.ugc.aweme.music.p3465b.AbstractC60731k;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p2082ss.android.ugc.trill.R;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.viewholder.m */
public final class C36017m extends C33937a {

    /* renamed from: b */
    TuxTextView f85053b;

    /* renamed from: c */
    TextView f85054c;

    /* renamed from: d */
    public ViewPager f85055d;

    /* renamed from: e */
    View f85056e;

    /* renamed from: f */
    public AbstractC35989s f85057f;

    /* renamed from: g */
    AbstractC60731k<C35757c> f85058g;

    /* renamed from: h */
    public int f85059h = -1;

    /* renamed from: i */
    public int f85060i;

    /* renamed from: j */
    public C35754b f85061j;

    /* renamed from: k */
    C36018a f85062k;

    /* renamed from: l */
    public int f85063l;

    /* renamed from: m */
    public int f85064m;

    /* renamed from: n */
    public boolean f85065n;

    /* renamed from: o */
    private ViewPager.AbstractC1579e f85066o;

    static {
        Covode.recordClassIndex(43263);
    }

    /* renamed from: a */
    public final void mo63179a() {
        this.f85056e.setVisibility(0);
    }

    /* renamed from: b */
    public final void mo63184b() {
        this.f85056e.setVisibility(4);
    }

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.viewholder.m$a */
    class C36018a extends PagerAdapter {

        /* renamed from: a */
        public List<MusicModel> f85067a = null;

        /* renamed from: b */
        LinkedList<C35990t> f85068b = new LinkedList<>();

        static {
            Covode.recordClassIndex(43264);
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
            List<MusicModel> list = this.f85067a;
            int i = 0;
            if (list == null) {
                return 0;
            }
            int size = list.size() / 3;
            if (this.f85067a.size() % 3 != 0) {
                i = 1;
            }
            return size + i;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C36018a() {
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final Object instantiateItem(ViewGroup viewGroup, int i) {
            boolean z;
            MethodCollector.m26663i(2193);
            C35990t poll = this.f85068b.poll();
            if (poll == null) {
                poll = new C35990t(viewGroup.getContext(), C36017m.this.f85064m);
            }
            AbstractC35989s sVar = C36017m.this.f85057f;
            AbstractC60731k<C35757c> kVar = C36017m.this.f85058g;
            poll.f84979b = sVar;
            poll.f84980c = kVar;
            if (!poll.f84978a.isEmpty()) {
                int i2 = 0;
                do {
                    poll.f84978a.get(i2).mo63153a(poll.f84979b, poll.f84980c);
                    i2++;
                } while (i2 < 3);
            }
            List<MusicModel> list = this.f85067a;
            int i3 = i * 3;
            int i4 = C36017m.this.f85059h;
            int i5 = C36017m.this.f85060i;
            C35754b bVar = C36017m.this.f85061j;
            boolean z2 = C36017m.this.f85065n;
            if (list != null) {
                int min = Math.min(i3 + 3, list.size());
                int i6 = i3;
                while (i6 < min) {
                    MusicModel musicModel = list.get(i6);
                    C36050s sVar2 = poll.getMusicItemViews().get(i6 - i3);
                    sVar2.itemView.setVisibility(0);
                    if (i4 == i6) {
                        z = true;
                    } else {
                        z = false;
                    }
                    sVar2.mo63154a(musicModel, z2, false, z, i5, i6, bVar);
                    i6++;
                    z2 = z2;
                }
                for (int i7 = min - i3; i7 < 3; i7++) {
                    poll.getMusicItemViews().get(i7).itemView.setVisibility(8);
                }
            }
            viewGroup.addView(poll);
            MethodCollector.m26664o(2193);
            return poll;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            MethodCollector.m26663i(2197);
            viewGroup.removeView((View) obj);
            this.f85068b.offer(obj);
            MethodCollector.m26664o(2197);
        }
    }

    /* renamed from: a */
    public final void mo63181a(ViewPager.AbstractC1579e eVar) {
        ViewPager viewPager;
        if (!(this.f85058g == null || (viewPager = this.f85055d) == null)) {
            viewPager.removeOnPageChangeListener(this.f85066o);
        }
        this.f85066o = eVar;
    }

    /* renamed from: a */
    public final void mo63182a(AbstractC35989s sVar, AbstractC60731k<C35757c> kVar) {
        this.f85057f = sVar;
        this.f85058g = kVar;
    }

    public C36017m(View view, int i) {
        super(view);
        this.f85053b = (TuxTextView) view.findViewById(R.id.f67);
        this.f85054c = (TextView) view.findViewById(R.id.f65);
        this.f85055d = (ViewPager) view.findViewById(R.id.fh5);
        this.f85056e = view.findViewById(R.id.amb);
        this.f85063l = (int) C13628n.m24520b(C17867d.m33078a(), 84.0f);
        C36018a aVar = new C36018a();
        this.f85062k = aVar;
        this.f85055d.setAdapter(aVar);
        this.f85064m = i;
        this.f85053b.setOnClickListener(new View$OnClickListenerC36019n(this));
        this.f85053b.setTuxFont(62);
    }

    /* renamed from: a */
    public final void mo63180a(int i, int i2, boolean[] zArr, boolean[] zArr2) {
        for (int i3 = 0; i3 < zArr2.length; i3++) {
            if (this.f85055d.getTop() + (this.f85063l * i3) > i2 || this.f85055d.getTop() + ((i3 + 1) * this.f85063l) < i) {
                zArr[i3] = false;
                zArr2[i3] = false;
            } else if (!zArr[i3]) {
                zArr[i3] = true;
                zArr2[i3] = true;
            }
        }
    }

    /* renamed from: a */
    public final void mo63183a(MusicCollectionItem musicCollectionItem, List<MusicModel> list, int i, int i2, int i3, C35754b bVar, boolean z) {
        this.f85054c.setText(musicCollectionItem.mcName);
        if (list != null) {
            this.f85055d.getLayoutParams().height = this.f85063l * Math.min(3, list.size());
        }
        this.f85065n = z;
        this.f85060i = i3;
        this.f85059h = i2;
        this.f85062k.f85067a = list;
        this.f85062k.notifyDataSetChanged();
        this.f85055d.setCurrentItem(i);
        this.f85055d.addOnPageChangeListener(this.f85066o);
        this.f85061j = bVar;
    }
}
